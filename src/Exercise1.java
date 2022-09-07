public class Exercise1 {
    public static void main(String[] args) throws Exception {
        // Initialize the input Strings.
        String inString0="Gilligan"; 
        String inString1="Hello everyone!"; 
        String inString2="My mother says the weather is poor there.";  

        // Construct the phrase "Poor Gilligan says hello there!"
        String phrase = constructFirstWord(inString2) + constructSecondWord(inString0) + constructThirdWord(inString2) +
                        constructFourthWord(inString1) + constructFifthWord(inString2);

        // Print the phrase.
        System.out.println(phrase);
    }

    /**
     * Constructs the first word of the phrase.
     * @param input inString2 = "My mother says the weather is poor there."
     * @return The first word of the phrase = "Poor"
     */
    private static String constructFirstWord(String input) {
        // Loop 6 times.
        for(int i = 0; i < 6; i++) {
            // Get the last words of the phrase, stripping down one word from the start each time.
            input = SentenceTransformer.lastWords(input);
        }

        // At this point, input = "poor there."
        // Get the first word of this String.
        input = SentenceTransformer.firstWord(input);

        // input = "poor"
        // Capitalize the word.
        input = WordTransformer.makeCapital(input);

        // Return the word "Poor"
        return input;
    }

    /**
     * Constructs the second word of the phrase.
     * @param input inString0 = "Gilligan"
     * @return The second word of the phrase = " Gilligan"
     */
    private static String constructSecondWord(String input) {
        // Left-pad the word with a space.
        input = WordTransformer.leftPadder(input);

        // Return the word " Gilligan".
        return input;
    }

    /**
     * Constructs the third word of the phrase.
     * @param input inString2 = "My mother says the weather is poor there."
     * @return The third word of the phrase = " says"
     */
    private static String constructThirdWord(String input) {
        // Loop 2 times.
        for(int i = 0; i < 2; i++) {
            // Get the last words of the phrase, stripping down one word from the start each time.
            input = SentenceTransformer.lastWords(input);
        }

        // At this point, input = "says the weather is poor there."
        // Get the first word of this String.
        input = SentenceTransformer.firstWord(input);

        // input = "says"
        // Left-pad the word with a space.
        input = WordTransformer.leftPadder(input);

        // Return the word " says"
        return input;
    }

    /**
     * Constructs the fourth word of the phrase.
     * @param input inString1 = "Hello everyone!"
     * @return The fourth word of the phrase = " hello"
     */
    private static String constructFourthWord(String input) {
        // Get the first word of the phrase.
        input = SentenceTransformer.firstWord(input);

        // input = "Hello"
        // Force the word to be lowercase.
        input = WordTransformer.lowerCase(input);

        // input = "hello"
        // Left-pad the word with a space.
        input = WordTransformer.leftPadder(input);

        // Return the word " hello".
        return input;
    }

    /**
     * Constructs the fifth word of the phrase.
     * @param input inString2 = "My mother says the weather is poor there."
     * @return The fifth word of the phrase = " there!"
     */
    private static String constructFifthWord(String input) {
        // Loop 7 times.
        for(int i = 0; i < 7; i++) {
            // Get the last words of the phrase, stripping down one word from the start each time.
            input = SentenceTransformer.lastWords(input);
        }

        // At this point, input = "there."
        // Depunctuate the word.
        input = SentenceTransformer.depunctuate(input);

        // input = "there"
        // Left-pad the word with a space.
        input = WordTransformer.leftPadder(input);

        // input = " there"
        // Right-pad the word with an exclamation mark (!).
        input = WordTransformer.rightPadder(input, "!");

        // Return the word " there!"
        return input;
    }
}
