package it.polito.tdp.alien.model;

import java.util.LinkedList;

public class AlienDictionary {
	
	LinkedList<Word> parole = new LinkedList<Word>();

	public void addWord (String alienWord, LinkedList<String> translation) {	
		Word p = wordPresente(alienWord);
		if (p!=null) {
			p.setTranslation(translation);
		}else {
			Word nw = new Word(alienWord, translation);
			parole.add(nw);
			}
		}
	
	public Word wordPresente (String alienWord) {
		for (Word w: parole) {
			if (alienWord.equals(w.getAlienWord()))
				return w;
		}
		return null;
	}
	
	public LinkedList<String> translateWord (String alienWord) {
		Word p = wordPresente(alienWord);
		if (p!=null)
			return p.getTranslation();
		return null;
	}

	public void svuota() {
		parole.removeAll(parole);
		
	}
}
