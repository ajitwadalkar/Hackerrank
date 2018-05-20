import java.util.*;

public class CardGame {
    public static void main(String[] args) {
        int[] cost = {4, 5, 1,2,4};
        int[] damages = {1, 2, 3,6,8};
        int tm = 5;
        int td = 3;
        System.out.println(solution(tm, td, cost, damages));
    }

    public static boolean solution(int tm, int td, int[] cost, int[] damages) {

        TreeMap<Double, Set<Integer>> card = new TreeMap<Double,Set<Integer>>();

        for (int i = 0; i < cost.length; i++) {
            double temp = cost[i]/damages[i];
            if(card.containsKey(temp)){
                card.get(temp).add(cost[i]);
            }else{
                Set<Integer> tempSet = new TreeSet<Integer>();
                tempSet.add(cost[i]);
                card.put(temp, tempSet);
            }
        }
        for(Map.Entry<Double,Set<Integer>> el : card.entrySet()){

            for(Integer indx : el.getValue()){
                if()
            }
        }


/*
        if (tm <= 0) {
            return false;
        } else if (td <= 0) {
            return true;
        }*/
        return true;
    }
}

