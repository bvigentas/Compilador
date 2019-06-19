package br.furb.semantico;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import br.furb.common.Constants;
import br.furb.common.Token;

public class Semantico implements Constants {
	public void executeAction(int action, Token token) throws SemanticError {
		System.out.println("Ação #" + action + ", Token: " + token);
		String tipo = "";
		String operadorRelacional = "";
		List<String> codigo = new ArrayList<String>();
		Queue<String> pilhaDeTipos = new PriorityQueue<String>();

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
				operadorRelacional = token.getLexeme();
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
						//TODO: Descobrir qual codigo usar no !=
						codigo.add("");
						break;
					case "<=":
						//TODO: Descobrir qual codigo usar no <=
						codigo.add("");
						break;
					case ">=":
						//TODO: Descobrir qual codigo usar no >=
						codigo.add("");
				}
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
				//TODO: Implementar acao 21
				break;
			case 30:
				//TODO: Implementar acao 30
				break;
			case 31:
				//TODO: Implementar acao 31
				break;
			case 32:
				//TODO: Implementar acao 32
				break;
			case 33:
				//TODO: Implementar acao 33
				break;
			case 34:
				//TODO: Implementar acao 34
				break;
			case 35:
				//TODO: Implementar acao 35
				break;
			case 36:
				//TODO: Implementar acao 36
				break;
			case 37:
				//TODO: Implementar acao 37
				break;
			case 38:
				//TODO: Implementar acao 38
				break;
			case 39:
				//TODO: Implementar acao 39
				break;
			case 40:
				//TODO: Implementar acao 40
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
