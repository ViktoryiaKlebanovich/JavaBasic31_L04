package by.epam.unit04.main;

import java.util.Scanner;

public class Task03 {
  public static void main(String[] args) {
    int[] mas;
    int n;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value for n > ");
    n = sc.nextInt();
    mas = new int[n];

    int countZero = 0;
    int countNegative = 0;
    int countPositive = 0;

    Scanner sc1 = new Scanner(System.in);
    for (int i = 0; i < mas.length; i++) {
      System.out.print("mas[" + i + "]=>");
      mas[i] = sc1.nextInt();
    }
    System.out.println();
    for (int i = 0; i < mas.length; i++) {
      if (mas[i] == 0) {
        countZero++;
      }
    }
    for (int i = 0; i < mas.length; i++) {
      if (mas[i] < 0) {
        countNegative++;
      }
    }
    for (int i = 0; i < mas.length; i++) {
      if (mas[i] > 0) {
        countPositive++;
      }
    }
    for (int i = 0; i < mas.length; i++) {
      System.out.print("[" + mas[i] + "]");
    }
    System.out.println();
    System.out.println("Number of Positive elements: " + countPositive);
    System.out.println("Number of Negative elements: " + countNegative);
    System.out.println("Number of Zero elements: " + countZero);
  }
}
