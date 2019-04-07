package br.furb.analisador_lexico;

public class LexicalError extends AnalysisError
{
	public LexicalError(String msg, int position, char character)
	{
        super(msg, position, character);
    }
	
    public LexicalError(String msg, int position)
	{
        super(msg, position);
    }

    public LexicalError(String msg)
    {
        super(msg);
    }
}
