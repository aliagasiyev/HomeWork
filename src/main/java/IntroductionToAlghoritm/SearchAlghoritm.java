package IntroductionToAlghoritm;

public class SearchAlghoritm {
    public static void main(String[] args) {
        // Search alghoritmi verilen Arrayda lazim olan elementin indeksin gosterir
        // Qeyd:BinarySearch alghoritmi search
        int[] array = {1, 5, 8, 9, 22, 25, 65};

       // System.out.println(linearSearch(array, 22));
    }

    public static int linearSearch(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }


    public static int binarySearch(int[] array, int num) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int point = (start + end) / 2;

            if (array[point] == num) {
                return point;
            } else if (array[point] < num) {
                start = point + 1;
            } else {
                end = point - 1;
            }
        }
        return -1;
    }


}
