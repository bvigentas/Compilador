package br.furb.analisador_lexico;

public class SyntaticError extends AnalysisError {
	public SyntaticError(String msgEncontrado, int position, char character, String msgEsperado) {
		super(msgEncontrado, position, character, msgEsperado);
	}
	
	public SyntaticError(String msg, int position) {
		super(msg, position);
	}

	public SyntaticError(String msg) {
		super(msg);
	}
}
