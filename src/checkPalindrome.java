public class checkPalindrome {
    public static void main(String[] args) {
        int inputNumber = 100101;
        System.out.println("The given number is "+isPalindrome(inputNumber));
    }

    private static String isPalindrome(int inputNumber) {
       if(inputNumber == reverseIt(inputNumber)){
           return "a palindrome";
       }
       else{
           return "not a palindrome";
       }
    }

    private static int reverseIt(int inputNumber) {
        int reverse =0;
        while(inputNumber != 0){
            reverse = reverse*10 + inputNumber%10;
            inputNumber = inputNumber/10;
        }

        return reverse;
    }
}
