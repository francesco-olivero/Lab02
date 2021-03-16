package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String translation;
	
	@Override
	public boolean equals(Object obj) {
		Word in = (Word) obj;
		if (this.alienWord.equals(in.alienWord) && this.translation.equals(in.translation))
			return true;
		return false;
	}
	
	

}
