package sortieren;

public class SelectionSort {


    public static void druckeArray(int[] array) {
        for (int i : array) {
            System.out.printf("%3d", i);
        }
        //Zeilenumbruch nach Ausgabe:
        System.out.println();
    }

    public static void selectionSort(int[] array) {
        int minimum;
        int pointer;

        for (int i = 0; i < array.length - 1; i++) {
            minimum = array[i];
            pointer = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minimum) {
                    minimum = array[j];
                    pointer = j;
                }
                array[pointer] = array[i];
                array[i] = minimum;
            }
            druckeArray(array);
        }

    }

    public static void main(String[] args) {

        int[] array = {42, 13, 9, 27, 83, 1};

        druckeArray(array);
        selectionSort(array);


    }

}
