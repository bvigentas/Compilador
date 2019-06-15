package br.furb.semantico;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import br.furb.common.Constants;
import br.furb.common.Token;

public class Semantico implements Constants
{
    public void executeAction(int action, Token token)	throws SemanticError
    {
        System.out.println("Ação #"+action+", Token: "+token);
        String tipo = "";
        String operadorRelacional = "";
        List<String> codigo = new ArrayList<String>();
        Queue<String> pilhaDeTipos= new PriorityQueue<String>();
        
        switch (action) {
		case 1:
			String tipo1 = pilhaDeTipos.poll();
			String tipo2 =  pilhaDeTipos.poll();
			if ("float64".equalsIgnoreCase(tipo1) || "float64".equalsIgnoreCase(tipo2)) {
				pilhaDeTipos.add("float64");
			} else {
				pilhaDeTipos.add("int64");
			}
			codigo.add("add");
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
			codigo.add("ret"
					+ "\n}"
					+ "\n}");
			break;
		default:
			break;
		}
    }	
}
