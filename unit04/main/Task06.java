package by.epam.unit04.main;

import java.util.Random;

public class Task06 {
  public static void main(String[] args) {
    int[][] mas = new int[3][4];

    Random rand = new Random();

    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        mas[i][j] = rand.nextInt(10);
      }
    }

    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        System.out.printf("[%4d]", mas[i][j]);
      }
      System.out.println();
    }
    int count = 0;
    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        if (mas[i][j] == 7) {
          count++;
        }
      }
    }
    System.out.println("Number of 7 in array = " + count);
  }
}
