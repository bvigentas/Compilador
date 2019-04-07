package br.furb.analisador_lexico;

public class AnalysisError extends Exception
{
    private int position;
    private char character;

    public AnalysisError(String msg, int position)
    {
        super(msg);
        this.position = position;
    }
    
    public AnalysisError(String msg, int position, char character)
    {
        super(character + " " + msg);
        this.position = position;
        this.character = character;
    }

    public AnalysisError(String msg)
    {
        super(msg);
        this.position = -1;
    }

    public int getPosition()
    {
        return position;
    }
    
    public String getError() {
    	return null;
    }
    
    public String toString()
    {
        return super.toString() + ", @ "+position;
    }
}
