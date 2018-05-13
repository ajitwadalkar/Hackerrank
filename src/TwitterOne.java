
import java.util.*;
import java.lang.*;
import java.io.*;
public class TwitterOne {
    public static void main(String args[] ) throws Exception {

        //Get data
        Scanner scanner = new Scanner(System.in);
        String[] StartEnd = scanner.nextLine().split(", ");
        String EndDate = "";
        scanner.nextLine();
        //initialize treemap

        TreeMap<String,Map<String,Integer>> outputTreeMap = new TreeMap<String,Map<String,Integer>>();

        while(scanner.hasNextLine()) {
            String[] lineData = scanner.nextLine().split(", ");
            String yearMonth = lineData[0].substring(0,7);
            if(yearMonth.compareTo(StartEnd[0]) < 0 || yearMonth.compareTo(StartEnd[1]) > 0) {
                continue;
            }

            String key = yearMonth;
            int i = Integer.parseInt(lineData[2]);

            if(outputTreeMap.containsKey(key))
                if(outputTreeMap.get(key).containsKey(lineData[1]))
                {
                    outputTreeMap.get(key).put(lineData[1],outputTreeMap.get(key).get(lineData[1])+i);
                }
                else
                {
                    outputTreeMap.get(key).put(lineData[1],i);
                }
            else{
                Map<String,Integer> tempMap = new TreeMap<String,Integer>();
                tempMap.put(lineData[1],i);
                outputTreeMap.put(key,tempMap);
            }
        }
        for(String s : outputTreeMap.descendingMap().keySet()) {
            String ed = s.substring(0,7);
            String sd = StartEnd[1];
            if (!ed.equals(sd))
            {
                if(!EndDate.equals(ed)) {
                    if(EndDate != "")
                        System.out.println();
                    System.out.print(s+", "+outputTreeMap.get(s).toString().replaceAll("\\{|\\}","").replaceAll("=",", "));
                    EndDate = ed;
                } else {
                    System.out.print(", " + s.substring(9) + ", " + outputTreeMap.get(s).toString().replaceAll("\\{|\\}","").replaceAll("=",", "));
                    EndDate = ed;
                }

            }
        }
    }
    }


