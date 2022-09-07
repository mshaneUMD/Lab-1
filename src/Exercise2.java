public class Exercise2 {
    public static void main(String[] args) throws Exception {
        // Initialize the input Strings.
        String inString0="Let's ask that dude Fred.";
        String inString1="Who said it is my turn to look for one?";
        String inString2="Take the computer from Janet!";

        // Construct the phrase "Janet said Fred is one kool dude!"
        String phrase = constructFirstWord(inString2) + constructSecondWord(inString1) + constructThirdWord(inString0) +
                        constructFourthWord(inString1) + constructFifthWord(inString1) + constructSixthWord(inString1) + constructSeventhWord(inString0);

        // Print the phrase.
        System.out.println(phrase);
    }

    /**
     * Constructs the first word of the phrase.
     * @param input inString2 = "Take the computer from Janet!"
     * @return The first word of the phrase = "Janet"
     */
    private static String constructFirstWord(String input) {
        // Loop 4 times.
        for(int i = 0; i < 4; i++) {
            // Get the last words of the phrase, stripping down one word from the start each time.
            input = SentenceTransformer.lastWords(input);
        }

        // input = "Janet!"
        // Depunctuate the word.
        input = SentenceTransformer.depunctuate(input);

        // input = "Janet"
        // Return the word "Janet".
        return input;
    }

    /**
     * Constructs the second word of the phrase.
     * @param input inString1 = "Who said it is my turn to look for one?"
     * @return The second word of the phrase = " said"
     */
    private static String constructSecondWord(String input) {
        // Get the last words from the phrase, stripping away the first word.
        input = SentenceTransformer.lastWords(input);

        // input = "said it is my turn to look for one?"
        // Get the first word from the phrase.
        input = SentenceTransformer.firstWord(input);

        // input = "said"
        // Left-pad the word with a space.
        input = WordTransformer.leftPadder(input);

        // Return the word " said".
        return input;
    }

    /**
     * Constructs the third word of the phrase.
     * @param input inString0 = "Let's ask that dude Fred."
     * @return The third word of the phrase = " Fred"
     */
    private static String constructThirdWord(String input) {
        // Loop 4 times.
        for(int i = 0; i < 4; i++) {
            // Get the last words of the phrase, stripping down one word from the start each time.
            input = SentenceTransformer.lastWords(input);
        }

        // input = "Fred."
        // Depunctuate the word.
        input = SentenceTransformer.depunctuate(input);

        // input = "Fred"
        // Left-pad the word with a space.
        input = WordTransformer.leftPadder(input);

        // Return the word " Fred".
        return input;
    }

    /**
     * Constructs the fourth word of the phrase.
     * @param input inString1 = "Who said it is my turn to look for one?"
     * @return The fourth word of the phrase = " is"
     */
    private static String constructFourthWord(String input) {
        // Loop 3 times.
        for(int i = 0; i < 3; i++) {
            // Get the last words of the phrase, stripping down one word from the start each time.
            input = SentenceTransformer.lastWords(input);
        }

        // input = "is my turn to look for one?"
        // Get the first word from the phrase.
        input = SentenceTransformer.firstWord(input);

        // input = "is"
        // Left-pad the word with a space.
        input = WordTransformer.leftPadder(input);

        // Return the word " is".
        return input;
    }

    /**
     * Constructs the fifth word of the phrase.
     * @param input inString1 = "Who said it is my turn to look for one?"
     * @return The fifth word of the phrase = " one"
     */
    private static String constructFifthWord(String input) {
        // Loop 9 times.
        for(int i = 0; i < 9; i++) {
            // Get the last words of the phrase, stripping down one word from the start each time.
            input = SentenceTransformer.lastWords(input);
        }

        // input = "one?"
        // Depunctuate the word.
        input = SentenceTransformer.depunctuate(input);

        // input = "one"
        // Left-pad the word with a space.
        input = WordTransformer.leftPadder(input);

        // Return the word " one".
        return input;
    }

    /**
     * Constructs the sixth word of the phrase.
     * @param input inString1 = "Who said it is my turn to look for one?"
     * @return The sixth word of the phrase = " kool"
     */
    private static String constructSixthWord(String input) {
        // Loop 7 times.
        for(int i = 0; i < 7; i++) {
            // Get the last words of the phrase, stripping down one word from the start each time.
            input = SentenceTransformer.lastWords(input);
        }

        // input = "look for one?"
        // Get the first word of the phrase.
        input = SentenceTransformer.firstWord(input);

        // input = "look"
        // Reverse the word.
        input = WordTransformer.reverseWord(input);

        // input = "kool"
        // Left-pad the word with a space.
        input = WordTransformer.leftPadder(input);

        // Return the word " kool".
        return input;
    }

    /**
     * Constructs the seventh word of the phrase.
     * @param input inString0 = "Let's ask that dude Fred."
     * @return The seventh word of the phrase = " dude!"
     */
    private static String constructSeventhWord(String input) {
        // Loop 3 times.
        for(int i = 0; i < 3; i++) {
            // Get the last words of the phrase, stripping down one word from the start each time.
            input = SentenceTransformer.lastWords(input);
        }

        // input = "dude Fred."
        // Get the first word of the phrase.
        input = SentenceTransformer.firstWord(input);

        // input = "dude"
        // Left-pad the word with a space.
        input = WordTransformer.leftPadder(input);

        // input = " dude"
        // Right-pad the word with an exclamation mark (!).
        input = WordTransformer.rightPadder(input, "!");

        // Return the word " dude!".
        return input;
    }
}
