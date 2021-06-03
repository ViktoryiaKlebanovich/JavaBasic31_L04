package by.epam.unit04.main;
import java.util.Random;

public class Task02 {
  public static void main(String[] args) {
    int n = 10;
    int[] mas = new int[n];
    int min;
    int max;
    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      mas[i] = rand.nextInt(10);
    }
    min = mas[0];
    for (int i = 1; i < mas.length; i++) {
      if (mas[i] < min) {
        min = mas[i];
      }
    }
    max=mas[0];
    for (int i = 1; i < mas.length; i++) {
      if (mas[i] > max) {
        max = mas[i];
      }
    }
    for (int i = 0; i < mas.length; i++) {
      System.out.printf("[" + mas[i] + "]");
    }
    System.out.println();
    System.out.println("min = "+ min);
    System.out.println("max = "+ max);
    System.out.println("Distance between max and min = " +(max-min));
  }
}
