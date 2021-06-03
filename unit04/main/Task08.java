package by.epam.unit04.main;

import java.util.Random;

public class Task08 {
  public static void main(String[] args) {
    int[][] mas = new int[5][6];
    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        mas[i][j] = rand.nextInt(100);
      }
    }
    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        System.out.printf("[%4d]", mas[i][j]);
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");
    System.out.println("3-ая строка матрицы:");
    for(int element : mas[2]) {
      System.out.printf("[%4d]", element);
    }
    System.out.println();
    System.out.println("-----------------------------------");
    System.out.println("3-ий столбец матрицы:");
    for(int i = 0; i < mas.length; i++) {
      System.out.printf("[%4d]\n", mas[i][2]);
    }
  }
}
