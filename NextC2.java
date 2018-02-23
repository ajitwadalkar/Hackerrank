public class NextC2 {




    public static void main(String[] args) {

        String[] passwords=  {"GoCardinals","Doge","NExTcapITalxnextcapital","ThreeSThree"};//{"4","o2d","fi4ht","ben2hen","next1door"};//
        String[] res = strengthenPasswords(passwords);
        for(String s : res)
            System.out.println(s);


    }

    static String[] strengthenPasswords(String[] passwords) {

        int count =0;
        String[] result =  new String[passwords.length];

        for(String pw : passwords)
        {
            StringBuilder enhancedPassword = new StringBuilder();
            //rule1
            for(int i=0;i<pw.length();i++)
            {
                if(pw.charAt(i)=='s' || pw.charAt(i)=='S')
                {
                 enhancedPassword = enhancedPassword.append('5');
                }
                else
                {
                    enhancedPassword = enhancedPassword.append(pw.charAt(i));
                }

            }

            //rule 2

            if(enhancedPassword.length()%2 != 0)
            {
                if(enhancedPassword.length()==1) continue;
                char midChar = enhancedPassword.charAt((enhancedPassword.length()/2));
                if(Character.isDigit(midChar))
                {
                    int midInt= Integer.parseInt(String.valueOf(midChar));
                    midInt = midInt*2;
                    midChar = (char)(midInt);
                    System.out.println(midChar);
                    String eString = enhancedPassword.toString();
                    String start = eString.substring(0, (enhancedPassword.length()/2));
                    String end = eString.substring((enhancedPassword.length()/2)+1) ;
                    eString = start+ midChar + end;
                    System.out.println(eString);


                }

            }

            //rule 3

            if(enhancedPassword.length()%2 == 0){
                char temp =  enhancedPassword.charAt(0);
                char newFirst = enhancedPassword.charAt(enhancedPassword.length()-1);
                char newLast = temp;
                if(newFirst >='a'&& newFirst <='z')
                {
                    newFirst = Character.toUpperCase(newFirst);
                }else{
                    newFirst = Character.toLowerCase(newFirst);
                }

                if(newLast>='a'&& newLast<='z')
                {
                    newLast = Character.toUpperCase(newLast);
                }else
                {
                    newLast = Character.toLowerCase(newLast);
                }


                String eString = newFirst+ enhancedPassword.substring(1, enhancedPassword.length()-1)+newLast;
                enhancedPassword = new StringBuilder(eString);
            }

            //rule 4
            String ruleFour = enhancedPassword.toString().toLowerCase();
            String temp = enhancedPassword.toString();

            String sample="nextcapital";

            if(ruleFour.contains(sample.toLowerCase())) {

                int position = ruleFour.indexOf("nextcapital");
                String tmp2 = new StringBuilder(temp.substring(position,position+4)).reverse().toString();
                temp = temp.replaceAll(temp.substring(position,position+4), tmp2);
                enhancedPassword =  new StringBuilder(temp);

            }



        result[count]=enhancedPassword.toString();
            count++;

        }

        return result;


    }



}