public class SentenceTransformer {
	
	/**
	 * Gets the first word from a phrase.
	 * <p>
	 * (Eg.) "This is a phrase." => "This"
	 * @param thePhrase a String of words separated by spaces, otherwise known as a phrase.
	 * @return the first word of the phrase, or the whole phrase if there is only one word.
	 */
	static String firstWord (String thePhrase) {
		int i=thePhrase.indexOf(" ");
		if (i>0) {return thePhrase.substring(0,i);}
		else {return thePhrase;}
	}

	/**
	 * Gets the last words from a phrase.
	 * <p>
	 * (Eg.) "This is a phrase." => "is a phrase."
	 * @param thePhrase a String of words separated by spaces, otherwise known as a phrase.
	 * @return everything but the first word of the phrase, or the whole phrase if there is only one word.
	 */
	static String lastWords (String thePhrase) {
		int i=thePhrase.indexOf(" ");
		if (i>0) {return thePhrase.substring(i+1,thePhrase.length());}
		else {return thePhrase;}
	}

	/**
	 * Returns a null value.
	 * @param thePhrase a String of words separated by spaces, otherwise known as a phrase, to be reversed.
	 * @return null
	 */
	static String reverseSentence(String thePhrase){
		return null;
	}
	
	/**
	 * Attempts to remove punctuation from a phrase.
	 * <p>
	 * Replaces periods, exclamation marks, and question marks with space characters, then removes the last character from the phrase.
	 * <p>
	 * (Eg.) "This is a phrase." => "This is a phrase"
	 * <p>
	 * (Eg.) "This is a phrase" => "This is a phras"
	 * @param thePhrase a String of words separated by spaces, otherwise known as a phrase to be depunctuated.
	 * @return the depunctuated String or phrase.
	 */
	static String depunctuate (String thePhrase){
		thePhrase=thePhrase.replace('.',' ');
		thePhrase=thePhrase.replace('!',' ');
		thePhrase=thePhrase.replace('?',' ');
		thePhrase=thePhrase.substring(0,thePhrase.length()-1);
		return thePhrase;
	}
}