public class ReverseString {
    public static void main(String[] args) {
        String inputString = "Random Input String";
        System.out.println("Original String: "+inputString);
        System.out.println("Reversed String by StringBuilder Reverse Function: "+bufferReverse(inputString));
        System.out.println("Reversed String by iterative Method: "+iterativeReverse(inputString));
        System.out.println("Reversed String by recursive method: "+recursiveReverse(inputString));
    }

    private static String recursiveReverse(String inputString) {
        if (inputString.length() < 2) {
            return inputString;
        }

        return recursiveReverse(inputString.substring(1)) + inputString.charAt(0);
    }

    private static String bufferReverse(String inputString) {
        StringBuilder returnString = new StringBuilder(inputString);
        return returnString.reverse().toString();
    }

    private static String iterativeReverse(String inputString) {
        StringBuilder returnString = new StringBuilder();
        char[] inputStrArray = inputString.toCharArray();
        for (int i = 0; i < inputStrArray.length ; i++) {
            returnString.append(inputStrArray[i]);
        }
        return returnString.reverse().toString();

    }
}
