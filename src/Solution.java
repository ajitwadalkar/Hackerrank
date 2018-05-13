import java.util.*;


public class Solution {

    public static void main(String[] args) {
        String[] inputString = {"896bb1","1a919","00002"};
        for(String s: inputString)
        {
            int res = getMin(s);
            System.out.println("For String: "+s+" minimum splits are "+res);
        }

        }

        static int getMin(String inputString)
        {
            int minSplitVal=0;
            boolean broken=false;
            long intVal = Long.parseLong(inputString.trim(), 16 );
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            boolean ips = isPerfectSquare(intVal);
            int count=0;
            if (ips) {
                count=1;
                return 1;
                /*System.out.println("1");
                System.exit(0);*/
            }else
            {
                List<List<String>> res = substrings(inputString);
                for (List<String> Ls:res) {
                    count=0;
                    for (String s:Ls) {
                        minSplitVal = Ls.size();
                        intVal = Integer.parseInt(s, 16 );
                        ips = isPerfectSquare(intVal);
                        if(ips){
                            count=count+1;
                        }
                    }
                    hm.put(minSplitVal,(minSplitVal-count));
                    if(count == minSplitVal){
                        break;
                    }
                }
            }
            boolean noSqCount=true;
            Map.Entry<Integer, Integer> min = null;
            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {

                if(!entry.getKey().equals(entry.getValue())) noSqCount=false;

                if (min == null || min.getValue() > entry.getValue()) {
                    min = entry;
                }
            }
            if(noSqCount)
            {
                return -1;
                //System.out.println("-1");
            }
            else
            {
            return min.getKey();
            //System.out.println(min.getKey());
            }

        }


    static boolean isPerfectSquare(long n)
    {
        if(n==0) return false;
        int h = (int) (n & 0xF);
        if (h > 9)
            return false;
        if ( h != 2 && h != 3 && h != 5 && h != 6 && h != 7 && h != 8 )
        {
            int t = (int) Math.floor( Math.sqrt((double) n) + 0.5 );
            return t*t == n;
        }
        return false;
    }

    static List<List<String>> substrings(String input) {
        if (input.length() == 1)
            return Collections.singletonList(Collections.singletonList(input));
        List<List<String>> result = new ArrayList<>();

        for (List<String> subresult : substrings(input.substring(1))) {
            List<String> l2 = new ArrayList<>(subresult);
            l2.set(0, input.charAt(0) + l2.get(0));
            result.add(l2);
            List<String> l = new ArrayList<>(subresult);
            l.add(0, input.substring(0, 1));
            result.add(l);
        }

        return result;
    }

}
