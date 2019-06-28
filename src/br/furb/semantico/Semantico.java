package br.furb.semantico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

import br.furb.common.Constants;
import br.furb.common.Token;

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
	private Queue<String> pilhaDeTipos = new PriorityQueue<String>();
	private Queue<String> pilhaDeRotulos = new PriorityQueue<String>();
	private int ctLabel = 0;
	
	public void executeAction(int action, Token token) throws SemanticError {
		System.out.println("Ação #" + action + ", Token: " + token);
		

		String tipo1 = "";
		String tipo2 = "";

		switch (action) {
			case 1:
				tipo1 = pilhaDeTipos.poll();
				tipo2 = pilhaDeTipos.poll();
				throwSemanticException(tipo1, tipo2,"Tipos incompatíveis em expressão aritmética.");
				if ("float64".equalsIgnoreCase(tipo1) || "float64".equalsIgnoreCase(tipo2)) {
					pilhaDeTipos.add("float64");
				} else {
					pilhaDeTipos.add("int64");
				}
				codigo.add("add");
				break;
			case 2:
				tipo1 = pilhaDeTipos.poll();
				tipo2 = pilhaDeTipos.poll();
	
				throwSemanticException(tipo1, tipo2,"Tipos incompatíveis em expressão aritmética.");
	
				if ("float64".equalsIgnoreCase(tipo1) || "float64".equalsIgnoreCase(tipo2)) {
					pilhaDeTipos.add("float64");
				} else {
					pilhaDeTipos.add("int64");
				}
				codigo.add("sub");
	
				break;
			case 3:
				tipo1 = pilhaDeTipos.poll();
				tipo2 = pilhaDeTipos.poll();
	
				throwSemanticException(tipo1, tipo2, "Tipos incompatíveis em expressão aritmética.");
	
				if ("float64".equalsIgnoreCase(tipo1) || "float64".equalsIgnoreCase(tipo2)) {
					pilhaDeTipos.add("float64");
				} else {
					pilhaDeTipos.add("int64");
				}
				codigo.add("mul");
	
				break;
			case 4:
				tipo1 = pilhaDeTipos.poll();
				tipo2 = pilhaDeTipos.poll();
	
				throwSemanticException(tipo1, tipo2, "Tipos incompatíveis em expressão aritmética.");
	
				pilhaDeTipos.add("float64");
				codigo.add("div");
	
				break;
			case 5:
				pilhaDeTipos.add("int64");
				codigo.add("ldc.i8 " + token.getLexeme());
				codigo.add("conv.r8");
				break;
			case 6:
				pilhaDeTipos.add("float64");
				codigo.add("ldc.r8 " + token.getLexeme());
				break;
			case 7:
				tipo1 = pilhaDeTipos.poll();
	
				if ("float64".equalsIgnoreCase(tipo1) || "int64".equalsIgnoreCase(tipo1)) {
					pilhaDeTipos.add(tipo1);
				} else {
					throw new SemanticError("093430u439");
				}
	
				break;
			case 8:
				tipo1 = pilhaDeTipos.poll();
	
				if ("float64".equalsIgnoreCase(tipo1) || "int64".equalsIgnoreCase(tipo1)) {
					pilhaDeTipos.add(tipo1);
				} else {
					throw new SemanticError("093430u439");
				}
				codigo.add("ldc.i8 -1");
				codigo.add("mul");
				break;
			case 9:
				setOperadorRelacional(token.getLexeme());
				break;
			case 10:
				tipo1 = pilhaDeTipos.poll();
				tipo2 = pilhaDeTipos.poll();
	
				if (tipo1.equalsIgnoreCase(tipo2)) {
					pilhaDeTipos.poll();
				} else {
					throw new SemanticError("Tipos incompatíveis em expressão lógica.");
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
				pilhaDeTipos.add("bool");
				codigo.add("ldc.i4.1");
				break;
			case 12:
				pilhaDeTipos.add("bool");
				codigo.add("ldc.i4.0");
				break;
			case 13:
				tipo1 = pilhaDeTipos.poll();
				if (tipo1.equalsIgnoreCase("bool")) {
					pilhaDeTipos.add("bool");
				} else {
					throw new SemanticError("093430u439");
				}
				codigo.add("ldc.i4.1");
				codigo.add("xor");
				break;
			case 14:
				tipo = pilhaDeTipos.poll();
				if ("int64".equalsIgnoreCase(tipo)) {
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
			case 20:
				tipo1 = pilhaDeTipos.poll();
			case 21:
				
				pilhaDeTipos.add("string");
				codigo.add("ldstr " + token.getLexeme());
				
				break;
			case 30:
				if (token.getLexeme().equals("int")) {
					tipo = "int64";
				}
				else if(token.getLexeme().equals("real")) {
					tipo = "float64";
				}
				break;
			case 31:
				
				for (String id : listaID) {
					if (ts.containsKey(id)) {
						throw new SemanticError(id + " já declarado");
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
					throw new SemanticError(id + " não declarado");
				}
				
				String tipoID = ts.get(id);
				pilhaDeTipos.add(tipoID);
				codigo.add("ldloc " + id);
				
				if (tipoID.equals("int64")) {
					codigo.add("conv.r8");
				}
				
				break;
			case 34:
				
				String idCase34 = listaID.get(0);
				listaID.remove(0);
				
				if (!ts.containsKey(idCase34)) {
					throw new SemanticError(idCase34 + " não declarado");
				}
				
				String tipoIDCase34 = ts.get(idCase34);
				String tipoExp = pilhaDeTipos.poll();
				
				if (tipoIDCase34.equals("int64")) {
					codigo.add("conv.i8");
				}
				
				if (operadorRelacional.equalsIgnoreCase("+=")) {
					codigo.add("add");
				}else if(operadorRelacional.equalsIgnoreCase("-=")) {
					codigo.add("sub");
				}
				
				codigo.add("stloc " + idCase34);
				
				break;
			case 35:
				
				for(String idCase35 : listaID) {
					if (!ts.containsKey(idCase35)) {
						throw new SemanticError(idCase35 + " não declarado");
					}
					
					String tipoIDCase35 = ts.get(idCase35);
					String classe = "";
					
					if (tipoIDCase35.equals("int64")) {
						classe = "Int64";
					}else if (tipoIDCase35.equals("float64")) {
						classe = "Double";
					}
					
					codigo.add("call string [mscorlib]System.Console::ReadLine()");
					codigo.add("call " + tipoIDCase35 + " [mscorlib]System." + classe + "::Parse(string)");
					codigo.add("stloc " + idCase35);
					
				}
				
				listaID = new ArrayList<String>();
				
				break;
			case 36:
				
				String idCase36 =listaID.get(0);
				
				if (!ts.containsKey(idCase36)) {
					throw new SemanticError(idCase36 + " não declarado");
				}
				
				setOperadorRelacional(token.getLexeme());
				
				if (operadorRelacional.equalsIgnoreCase("+=") || operadorRelacional.equalsIgnoreCase("-=")) {
					codigo.add("ldloc" + idCase36);
					codigo.add("conv.r8");
				}
				
				break;
			case 37:
				String labelCase37 = createLabel() ;
				codigo.add(labelCase37 + ":");
				pilhaDeRotulos.add(labelCase37);
				break;
			case 38:
				String labelCase38 = createLabel();
				codigo.add("br false " + labelCase38);
				pilhaDeRotulos.add(labelCase38);
				break;
			case 39:
				//TODO: Implementar acao 39
				break;
			case 40:
				String labelCase39 = createLabel();
				codigo.add("br false" + labelCase39);
				codigo.add(pilhaDeRotulos.poll() + ":");
				pilhaDeRotulos.add(labelCase39);
				
				break;
			case 41:
				//TODO: Implementar acao 41
				break;
			case 42:
				//TODO: Implementar acao 42
				break;
				
			default:
				break;
		}
	}
	
	private String createLabel() {
		ctLabel++;
		return "label" + ctLabel;
	}

	private void throwSemanticException(String tipo1, String tipo2, String mensagemErro) throws SemanticError {
		if (verificarTipoInvalido(tipo1, tipo2)) {
			throw new SemanticError(mensagemErro);
		}
	}

	private boolean verificarTipoInvalido(String tipo1, String tipo2) {
		return "bool".equalsIgnoreCase(tipo1) || "bool".equalsIgnoreCase(tipo2) || "string".equalsIgnoreCase(tipo1)
				|| "string".equalsIgnoreCase(tipo2);
	}
}
