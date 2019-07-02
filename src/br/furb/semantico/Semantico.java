package br.furb.semantico;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.furb.common.Constants;
import br.furb.common.Token;
import br.furb.utils.Messages;
import br.furb.utils.StringManipulationUtil;
import br.furb.utils.Types64;

public class Semantico implements Constants {
	
	private String tipo = "";
	private String operadorRelacional = "";
	private List<String> codigo = new ArrayList<String>();
	private Map<String, String> ts = new HashMap<String, String>();
	
	public List<String> getCodigo() {
		return codigo;
	}

	public void setOperadorRelacional(String value) {
		this.operadorRelacional = value;
	}
	
	private List<String> listaID = new ArrayList<String>();
	private Deque<String> pilhaDeTipos = new ArrayDeque<String>();
	private Deque<String> pilhaDeRotulos = new ArrayDeque<String>();
	private int ctLabel = 0;
	
	public void executeAction(int action, Token token, String input) throws SemanticError {
		System.out.println("Ação #" + action + ", Token: " + token);
		

		String tipo1 = "";
		String tipo2 = "";

		switch (action) {
			case 1:
				tipo1 = pilhaDeTipos.pop();
				tipo2 = pilhaDeTipos.pop();
				throwSemanticException(tipo1, tipo2,Messages.ENCONPATIBLE_TYPES_ARITHMETIC_EXPRESSION, token, input);
				if (Types64.FLOAT.equalsIgnoreCase(tipo1) || Types64.FLOAT.equalsIgnoreCase(tipo2)) {
					pilhaDeTipos.push(Types64.FLOAT);
				} else {
					pilhaDeTipos.push(Types64.INT);
				}
				codigo.add("add");
				break;
			case 2:
				tipo1 = pilhaDeTipos.pop();
				tipo2 = pilhaDeTipos.pop();
	
				throwSemanticException(tipo1, tipo2,Messages.ENCONPATIBLE_TYPES_ARITHMETIC_EXPRESSION, token, input);
	
				if (Types64.FLOAT.equalsIgnoreCase(tipo1) || Types64.FLOAT.equalsIgnoreCase(tipo2)) {
					pilhaDeTipos.push(Types64.FLOAT);
				} else {
					pilhaDeTipos.push(Types64.INT);
				}
				codigo.add("sub");
	
				break;
			case 3:
				tipo1 = pilhaDeTipos.pop();
				tipo2 = pilhaDeTipos.pop();
	
				throwSemanticException(tipo1, tipo2, Messages.ENCONPATIBLE_TYPES_ARITHMETIC_EXPRESSION, token, input);
	
				if (Types64.FLOAT.equalsIgnoreCase(tipo1) || Types64.FLOAT.equalsIgnoreCase(tipo2)) {
					pilhaDeTipos.push(Types64.FLOAT);
				} else {
					pilhaDeTipos.push(Types64.INT);
				}
				codigo.add("mul");
	
				break;
			case 4:
				tipo1 = pilhaDeTipos.pop();
				tipo2 = pilhaDeTipos.pop();
	
				throwSemanticException(tipo1, tipo2, Messages.ENCONPATIBLE_TYPES_ARITHMETIC_EXPRESSION, token, input);
	
				pilhaDeTipos.push(Types64.FLOAT);
				codigo.add("div");
	
				break;
			case 5:
				pilhaDeTipos.push(Types64.INT);
				codigo.add("ldc.i8 " + token.getLexeme());
				codigo.add("conv.r8");
				break;
			case 6:
				pilhaDeTipos.push(Types64.FLOAT);
				codigo.add("ldc.r8 " + token.getLexeme());
				break;
			case 7:
				tipo1 = pilhaDeTipos.pop();
	
				if (Types64.FLOAT.equalsIgnoreCase(tipo1) || Types64.INT.equalsIgnoreCase(tipo1)) {
					pilhaDeTipos.push(tipo1);
				} else {
					throw new SemanticError(Messages.ENCONPATIBLE_TYPES_ARITHMETIC_EXPRESSION);
				}
	
				break;
			case 8:
				tipo1 = pilhaDeTipos.pop();
	
				if (Types64.FLOAT.equalsIgnoreCase(tipo1) || Types64.INT.equalsIgnoreCase(tipo1)) {
					pilhaDeTipos.push(tipo1);
				} else {
					throw new SemanticError(Messages.ENCONPATIBLE_TYPES_ARITHMETIC_EXPRESSION);
				}
				codigo.add("ldc.i8 -1");
				codigo.add("mul");
				break;
			case 9:
				setOperadorRelacional(token.getLexeme());
				break;
			case 10:
				tipo1 = pilhaDeTipos.pop();
				tipo2 = pilhaDeTipos.pop();
	
				if(tipo1.equals("string") || tipo2.equals("string")) {
					if (tipo1.equalsIgnoreCase(tipo2)) {
						pilhaDeTipos.pop();
					} else {
						throw new SemanticError(Messages.ENCONPATIBLE_TYPES_RELATIONAL_EXPRESSION);
					}
				}
				switch (operadorRelacional) {
					case ">":
						codigo.add("cgt");
						break;
					case "<":
						codigo.add("clt");
						break;
					case "==":
						codigo.add("ceq");
						break;
					case "!=":
						codigo.add("ceq");
						codigo.add("ldc.i4 0");
						codigo.add("ceq");
						break;
					case "<=":
						codigo.add("cgt");
						codigo.add("ldc.i4 0");
						codigo.add("ceq");
						break;
					case ">=":
						codigo.add("clt");
						codigo.add("ldc.i4 0");
						codigo.add("ceq");
						break;
				}
				
				break;
			case 11:
				pilhaDeTipos.push("bool");
				codigo.add("ldc.i4.1");
				break;
			case 12:
				pilhaDeTipos.push("bool");
				codigo.add("ldc.i4.0");
				break;
			case 13:
				tipo1 = pilhaDeTipos.pop();
				if (tipo1.equalsIgnoreCase("bool")) {
					pilhaDeTipos.push("bool");
				} else {
					throw new SemanticError("Tipo(s) incompatível(is) em expressão lógica.");
				}
				codigo.add("ldc.i4.1");
				codigo.add("xor");
				break;
			case 14:
				tipo = pilhaDeTipos.pop();
				if (Types64.INT.equalsIgnoreCase(tipo)) {
					codigo.add("conv.i8");
				}
				codigo.add("call void [mscorlib]System.Console::Write(" + tipo + ")");
				break;
			case 15:
				codigo.add(".assembly extern mscorlib{}"//
						+ "\n.assembly _codigo_object{}"//
						+ "\n.module _codigo_object.exe"//
						+ "\n.class public _UNICA{"//
				);
				break;
			case 16:
				codigo.add(".method static public void _principal() {"//
						+ "\n.entrypoint"//
				);
				break;
			case 17:
				codigo.add("ret" + "\n}" + "\n}");
				break;
			case 18:

				
				tipo1 = pilhaDeTipos.pop();
				if (tipo1.equalsIgnoreCase("bool")) {
					pilhaDeTipos.push("bool");
				} else {
					throw new SemanticError(Messages.ENCONPATIBLE_TYPES_LOGIC_EXPRESSION);
				}
				codigo.add("ldc.i4.1");
				codigo.add("and");
				
				break;
			case 19:
				
				tipo1 = pilhaDeTipos.pop();
				if (tipo1.equalsIgnoreCase("bool")) {
					pilhaDeTipos.push("bool");
				} else {
					throw new SemanticError(Messages.ENCONPATIBLE_TYPES_LOGIC_EXPRESSION);
				}
				codigo.add("ldc.i4.1");
				codigo.add("or");
				
				break;
			case 20:
				
				String token20 = token.getLexeme();
				
				pilhaDeTipos.push("string");
				
				switch (token20) {
				case "\\s":
					codigo.add("ldstr " + "\" \"");
					break;
				case "\\n":
					codigo.add("ldstr " + "\"\\n\"");
					break;
				case "\\t":
					codigo.add("ldstr " + "\"\\t\"");
					break;
				default:
					break;
				}
				
				break;
			case 21:
				
				pilhaDeTipos.push("string");
				codigo.add("ldstr " + token.getLexeme());
				
				break;
			case 30:
				if (token.getLexeme().equals("int")) {
					tipo = Types64.INT;
				}
				else if(token.getLexeme().equals("float")) {
					tipo = Types64.FLOAT;
				}
				break;
			case 31:
				
				for (String id : listaID) {
					if (ts.containsKey(id)) {
						throw new SemanticError(id + Messages.ALREADY_DECLARED);
					}
					
					ts.put(id, tipo);
					codigo.add(".locals("+ tipo + " " + id + ")");					
				}
				
				listaID = new ArrayList<String>();
				
				break;
			case 32:
				
				listaID.add(token.getLexeme());
				
				break;
			case 33:
				
				String id = token.getLexeme();
				
				if (!ts.containsKey(id)) {
					throw new SemanticError(id + Messages.NOT_DECLARED, StringManipulationUtil.getRowError(token.getPosition(), input));
				}
				
				String tipoID = ts.get(id);
				pilhaDeTipos.push(tipoID);
				codigo.add("ldloc " + id);
				
				if (tipoID.equals(Types64.INT)) {
					codigo.add("conv.r8");
				}
				
				break;
			case 34:
				
				String idCase34 = listaID.get(0);
				listaID.remove(0);
				
				if (!ts.containsKey(idCase34)) {
					throw new SemanticError(idCase34 + Messages.NOT_DECLARED, StringManipulationUtil.getRowError(token.getPosition(), input));
				}
				
				String tipoIDCase34 = ts.get(idCase34);
				
				if (operadorRelacional.equalsIgnoreCase("+=")) {
					codigo.add("add");
				}else if(operadorRelacional.equalsIgnoreCase("-=")) {
					codigo.add("sub");
				}
				
				if (tipoIDCase34.equals(Types64.INT)) {
					codigo.add("conv.i8");
				}
				
				codigo.add("stloc " + idCase34);
				
				break;
			case 35:
				
				for(String idCase35 : listaID) {
					if (!ts.containsKey(idCase35)) {
						throw new SemanticError(idCase35 + Messages.NOT_DECLARED, StringManipulationUtil.getRowError(token.getPosition(), input));
					}
					
					String tipoIDCase35 = ts.get(idCase35);
					String classe = "";
					
					if (tipoIDCase35.equals(Types64.INT)) {
						classe = Types64.INT;
					}else if (tipoIDCase35.equals(Types64.FLOAT)) {
						classe = "Double";
					}
					
					codigo.add("call string [mscorlib]System.Console::ReadLine()");
					codigo.add("call " + tipoIDCase35 + " [mscorlib]System." + classe + "::Parse(string)");
					codigo.add("stloc " + idCase35);
					
				}
				
				listaID = new ArrayList<String>();
				
				break;
			case 36:
				
				String idCase36 = listaID.get(0);
				
				if (!ts.containsKey(idCase36)) {
					throw new SemanticError(idCase36 + Messages.NOT_DECLARED, StringManipulationUtil.getRowError(token.getPosition(), input));
				}
				
				setOperadorRelacional(token.getLexeme());
				
				if (operadorRelacional.equalsIgnoreCase("+=") || operadorRelacional.equalsIgnoreCase("-=")) {
					codigo.add("ldloc " + idCase36);
					codigo.add("conv.r8");
				}
				
				break;
			case 37:
				String labelCase37 = createLabel() ;
				codigo.add(labelCase37 + ":");
				pilhaDeRotulos.push(labelCase37);
				break;
			case 38:
				String labelCase38 = createLabel();
				//String tokenLexeme = token.getLexeme();
				
				//if (tokenLexeme.equals("ifFalseDo")) {
					codigo.add("brfalse " + labelCase38);
					pilhaDeRotulos.push(labelCase38);
				//}
				
				break;
			case 39:
				//String tokenLexeme39 = token.getLexeme();
				
				//if (tokenLexeme39.equals("ifFalseDo")) {
					codigo.add(pilhaDeRotulos.pop() + ":");
				//}
				break;
			case 40:
				String labelCase40 = createLabel();
				codigo.add("br " + labelCase40);
				codigo.add(pilhaDeRotulos.pop() + ":");
				pilhaDeRotulos.push(labelCase40);
				
				break;
			case 41:
				String labelCase41 = createLabel();
				String tokenLexeme41 = token.getLexeme();
				
				if (tokenLexeme41.equals("whileTrueDo")) {
					codigo.add("brfalse " + labelCase41);
				}else if(tokenLexeme41.equals("whileFalseDo")) {
					codigo.add("brtrue " + labelCase41);
				}
				
				//codigo.add(pilhaDeRotulos.poll() + ":");
				pilhaDeRotulos.push(labelCase41);
				break;
			case 42:
				String rotulo1 = pilhaDeRotulos.pop();
				String rotulo2 = pilhaDeRotulos.pop();
				codigo.add("br " + rotulo2);
				codigo.add(rotulo1 + ":");
				break;
			default:
				break;
		}
	}
	
	private String createLabel() {
		ctLabel++;
		return "label" + ctLabel;
	}

	private void throwSemanticException(String tipo1, String tipo2, String mensagemErro, Token token, String input) throws SemanticError {
		if (verificarTipoInvalido(tipo1, tipo2)) {
			throw new SemanticError(mensagemErro, StringManipulationUtil.getRowError(token.getPosition(), input));
		}
	}

	private boolean verificarTipoInvalido(String tipo1, String tipo2) {
		return "bool".equalsIgnoreCase(tipo1) || "bool".equalsIgnoreCase(tipo2) || "string".equalsIgnoreCase(tipo1)
				|| "string".equalsIgnoreCase(tipo2);
	}
	
	public String retornaCodigoFormado() {
		StringBuilder sb = new StringBuilder();
		for (String linha : codigo) {
			sb.append(linha);
			sb.append("\n");
		}
		return sb.toString();
	}
}
