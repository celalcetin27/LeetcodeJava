public class Main {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {

            if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0) {
                count++;
                i++;
            }
            else if (flowerbed[i] == 0 && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) && (i == 0 || flowerbed[i - 1] == 0)) {
                count++;
                i++;
            }

            else if (i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                count++;
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        boolean result = new Main().canPlaceFlowers(new int[]{1,0,0,0,1}, 1);
        System.out.println(result);
    }
}
