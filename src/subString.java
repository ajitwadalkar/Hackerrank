public class subString {
    public static void main(String[] args) {
        String S= "nab";
        String T = "ban";
        boolean condition = true;
        int j=0;

        for(int i =0; i<S.length();i++){
                if(S.charAt(i)==T.charAt(j)){
                    j++;
                }
        }
        if(j==T.length())
        {
            System.out.println("1");
        }
        else{
           System.out.println("0");
        }

    }
}
