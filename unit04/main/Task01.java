package by.epam.unit04.main;

import java.util.Random;

public class Task01 {
  public static void main(String[] args) {

    int countEven = 0;
    int[] mas1 = new int[10];
    int[] mas2;
    Random rand = new Random();

    for (int i = 0; i < mas1.length; i++) {
      mas1[i] = rand.nextInt(100);
    }
    for (int i = 0; i < mas1.length; i++) {
      System.out.printf(" " + mas1[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < mas1.length; i++) {
      if (mas1[i] % 2 == 0) {
        countEven++;
      }
    }
    mas2 = new int[countEven];

    if (countEven == 0) {
      System.out.println("There are even numbers");
    } else {
      for (int i = 0, y = 0; i < mas1.length; i++) {
        if (mas1[i] % 2 == 0) {
          mas2[y] = mas1[i];
          y++;
        }
      }
      for (int i = 0; i < mas2.length; i++) {
        System.out.printf(" " + mas2[i] + " ");
      }
    }
    System.out.println();
    System.out.println("Number of even numbers: " + countEven);

  }
}
