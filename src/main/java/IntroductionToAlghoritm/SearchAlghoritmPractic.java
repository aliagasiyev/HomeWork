package IntroductionToAlghoritm;

public class SearchAlghoritmPractic {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 16, 19, 25, 55,99};
        // System.out.println(linearSearch(array, 55));
        System.out.println(binarySearch(array, 1));
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int x = 0;
        int y = array.length - 1;
        while (x <= y) {
            int z = (x + y) / 2;
            System.out.println("Hello");
            if (array[z]==target){
                return z;
            }
            else if (array[z]<target) {
                x=z+1;
            }
            else {
                y=z-1;
            }
        }
        return -1;
    }


}
