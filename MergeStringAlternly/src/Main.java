public class Main {
    static String[] mergeString(String a , String b){
        String[] aSplit = a.split("");
        String[] bSplit = b.split("");
        String[] mergeList = new String[aSplit.length + bSplit.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < aSplit.length && j < bSplit.length) {
            mergeList[k++] = aSplit[i++];
            mergeList[k++] = bSplit[j++];
        }

        while (i < aSplit.length) {
            mergeList[k++] = aSplit[i++];
        }

        while (j < bSplit.length) {
            mergeList[k++] = bSplit[j++];
        }

        return mergeList;
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "defg";
        String[] mergedArray = mergeString(a, b);

        for (String s : mergedArray) {
            System.out.print(s + " ");
        }
    }
}
