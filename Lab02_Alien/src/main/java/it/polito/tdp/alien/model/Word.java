package it.polito.tdp.alien.model;

import java.util.LinkedList;

public class Word {
	
	private String alienWord;
	private LinkedList<String> translation;
	
	
	public Word(String alienWord, LinkedList<String> translation) {
		this.alienWord = alienWord;
		this.translation = translation;
	}

	@Override
	public boolean equals(Object obj) {
		Word in = (Word) obj;
		if (this.alienWord.equals(in.getAlienWord()))
			return true;
		return false;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public LinkedList<String> getTranslation() {
		return translation;
	}

	public void setTranslation(LinkedList<String> translation) {
		this.translation = translation;
	}
	
}
