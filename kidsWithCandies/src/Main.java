import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Boolean> kidsWithCandies(int[] candies , int extraCandies){
        int maxElement = candies[0];
        List<Boolean> result = new ArrayList<>();
        for(int i =1 ; i<candies.length;i++){
            if (candies[i]>maxElement){
                maxElement = candies[i];
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= maxElement){
                result.add(Boolean.TRUE);
            }
            else {
                result.add(Boolean.FALSE);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}