package br.furb.analisador_lexico;

public class Token
{
    private int id;
    private String lexeme;
    private int position;

    public String getClasse(int id) {
    	
    	if (id >= 9 || id <= 30) {
    		return "palavra reservada";
    	}
    	
    	if (id == 2) {
    		return "identificador";
    	}
    	
    	if (id == 3) {
    		return "constante inteira";
    	}
    	
    	if (id == 4) {
    		return "constante real";
    	}
    	
    	if (id == 5) {
    		return "constante string";
    	}
    	
    	if (id == 6) {
    		return "constante caracter";
    	}
    	
    	if (id >30 || id <= 50) {
    		return "s�mbolo especial";
    	}
    	
    	return "";
    }
    
    public Token(int id, String lexeme, int position)
    {
        this.id = id;
        this.lexeme = lexeme;
        this.position = position;
    }

    public final int getId()
    {
        return id;
    }

    public final String getLexeme()
    {
        return lexeme;
    }

    public final int getPosition()
    {
        return position;
    }

    public String toString()
    {
//        return id+" ( "+lexeme+" ) @ "+position;
        return "Erro na linha " + position + " - " + getClasse(id);
    };
}
