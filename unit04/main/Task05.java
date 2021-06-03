package by.epam.unit04.main;

import java.util.Random;

public class Task05 {

  public static void main(String[] args) {
    int[] ar = new int[10];
    Random rand = new Random();
    for (int i = 0; i < ar.length; i++) {
      ar[i] = rand.nextInt(1000);
    }
    for (int i = 0; i < ar.length; i++) {
      System.out.printf("%4d ", ar[i]);
    }
    System.out.println();
///////////////////////////////////////////////
    int max;
    for (int i = 0; i < ar.length - 1; i++) {
      max = ar[i];
      int j = i;
      while (j > 0 && ar[j-1] > max) {
        ar[j] = ar[j - 1];
        j = j - 1;
      }

      ar[j] = max;

      System.out.print("Массив после " + i + "-й итерации:\t ");
      for (int k = 0; k < ar.length; k++) {
        System.out.printf("%4d ", ar[k]);
      }
      System.out.println();
    }
///////////////////////////////////////////////
    for (int i = 0; i < ar.length; i++) {
      System.out.printf("%4d ", ar[i]);
    }
    System.out.println();
  }
}
