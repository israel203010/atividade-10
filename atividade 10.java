import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner inicio = new Scanner(System.in);
    int n, i, fat = 1;
    System.out.println("informe um numero:");
    n = inicio.nextInt();

    for (i = 1; i <= n; i++) {
      fat *= i;
    }

    System.out.println("!" + n + " = " + fat);
    inicio.close();
  }
}
