package pract02var4;

import java.util.Arrays;

public class Massiv {
    private int[] array;

    public Massiv(){
        int x = (int) (Math.random() * 30);
        array = new int[x];
        Math.random();
        for (int i = 0; i < x; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public void showMassiv(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void sortMassiv() {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        //Arrays.sort(array);
    }
}
