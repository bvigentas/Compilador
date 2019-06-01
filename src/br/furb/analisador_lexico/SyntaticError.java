package br.furb.analisador_lexico;

public class SyntaticError extends AnalysisError {
	
	public SyntaticError(String msgEncontrado, int position, String character, String msgEsperado) {
		super(msgEncontrado + " " + character + " " + msgEsperado, position);
	}
	
	public SyntaticError(String msg, int position) {
		super(msg, position);
	}

	public SyntaticError(String msg) {
		super(msg);
	}
}
