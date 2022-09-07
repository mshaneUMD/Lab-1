public class WordTransformer {
	
	/**
	 * Trims a String of its leading and trailing whitespace to make a word.
	 * <p>
	 * (Eg.) " Word  " => "Word"
	 * @param theWord the word to be trimmed.
	 * @return the trimmed word, without any leading or trailing whitespace.
	 */
	static String makeWord (String theWord){
		return theWord.trim();
	}

	/**
	 * Ensures that the first character is a capital.
	 * <p>
	 * (Eg.) "word" => "Word"
	 * @param theWord the word to be made capital.
	 * @return the word with the first character as a capital.
	 */
	static String makeCapital (String theWord){
		return theWord.substring(0,1).toUpperCase()+theWord.substring(1);
	}

	/**
	 * Ensures that the first character is a lowercase.
	 * <p>
	 * (Eg.) "Word" => "word"
	 * @param theWord the word to be made lowercase.
	 * @return the word with the first character as a lowercase.
	 */
	static String lowerCase (String theWord){
		return theWord.substring(0,1).toLowerCase()+theWord.substring(1);
	}

	/**
	 * Converts a phrase to be completely upper case.
	 * <p>
	 * (Eg.) "This is a phrase." => "THIS IS A PHRASE."
	 * @param thePhrase a String of words, or phrase, to be made upper case.
	 * @return the phrase made completely upper case.
	 */
	static String upperCaser (String thePhrase) {
		return thePhrase.toUpperCase();
	}

	/**
	 * Converts a phrase to be completely lower case.
	 * <p>
	 * (Eg.) "THIS IS A PHRASE." => "this is a phrase."
	 * @param thePhrase a String of words, or phrase, to be made lower case.
	 * @return the phrase made completely lower case.
	 */
	static String lowerCaser (String thePhrase) {
		return thePhrase.toLowerCase();
	}
	
	/**
	 * Left-pads a word with one space.
	 * <p>
	 * (Eg.) "Word" => " Word"
	 * @param theWord the word to be left-padded.
	 * @return the resulting String with a space to the left of the word.
	 */
	static String leftPadder(String theWord){
		return " "+theWord;
	}
	
	/**
	 * Right-pads a word with a specified String.
	 * <p>
	 * (Eg.) "Word", "?" => "Word?"
	 * @param theWord the word to be right-padded.
	 * @param padding the String to right-pad the word with.
	 * @return the resulting String with a specified String padded to the right of the word.
	 */
	static String rightPadder(String theWord, String padding){
		return theWord+padding;
	}

	/**
	 * Reverses a word.
	 * <p>
	 * (Eg.) "Word" => "droW"
	 * @param theWord the word to be reversed.
	 * @return the reversed word.
	 */
	static String reverseWord (String theWord) {
		String newString="";
		theWord=theWord.trim();
		int i=theWord.length();
		while (i>0) {
			newString=newString+theWord.substring(i-1);
			theWord=theWord.substring(0,i-1);
			i=theWord.length();
		}
		return newString;
	}
}
