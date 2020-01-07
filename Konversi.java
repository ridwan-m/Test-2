import java.util.Scanner;

public class Konversi {
 
 public static void main(String[] args) {
  final int KG = 1;
  
  @SuppressWarnings("resource")
  Scanner s = new Scanner(System.in);
  

  int kg = s.nextInt();
  int pon = kg * 2;
  System.out.println(kg + " Kg " + pon + " Pon");

 }
}