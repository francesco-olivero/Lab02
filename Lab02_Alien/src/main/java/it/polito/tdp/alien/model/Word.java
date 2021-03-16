package it.polito.tdp.alien.model;

public class Word {
	
	private String alienWord;
	private String translation;
	
	
	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
	}

	@Override
	public boolean equals(Object obj) {
		Word in = (Word) obj;
		if (this.alienWord.equals(in.getAlienWord()) && this.translation.equals(in.getTranslation()))
			return true;
		return false;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	

}
