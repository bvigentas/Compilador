package br.furb.semantico;

import br.furb.common.Constants;
import br.furb.common.Token;

public class Semantico implements Constants
{
    public void executeAction(int action, Token token)	throws SemanticError
    {
        System.out.println("A��o #"+action+", Token: "+token);
    }	
}
