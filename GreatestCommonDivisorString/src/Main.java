import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> findDivisors(int a) {
        List<Integer> divisors = new ArrayList<>();
        for (int i=1; i<=a ; i++) {
            if ((a % i ==0)){
                divisors.add(i);
            }
        }
        return divisors;
    }

    static  List<Integer> findCommonDivisors(String word1 , String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        List<Integer> divisors1 = findDivisors(len1);
        List<Integer> divisors2 = findDivisors(len2);

        List<Integer> commonDivisors = new ArrayList<>();

        for (int divisor1 : divisors1){
            for (int divisor2 : divisors2) {
                if (divisor1 ==divisor2) {
                    commonDivisors.add(divisor1);
                }
            }
        }
        return commonDivisors;
    }

    static String findGreatestCommonDivisorString(String word1 , String word2) {
        List<Integer> commonDivisors = findCommonDivisors(word1,word2);
        List<String> resultsList = new ArrayList<>();

        for (int divisor : commonDivisors) {
            if (word1.substring(0,divisor).equals(word2.substring(0,divisor))){
                resultsList.add(word1.substring(0,divisor));
            }
        }
        int lastIndex = resultsList.size() -1;
        return resultsList.get(lastIndex);
    }

    public static void main(String[] args) {
        String word1 = "ABCABC";
        String word2 = "ABC";
        System.out.println(findGreatestCommonDivisorString(word1,word2));
    }
}