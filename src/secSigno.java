import java.util.Scanner;

public class secSigno {
    public void signo(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese la cantidad de signos que desea imprimir: ");
            int cant = sc.nextInt();
            for (int i = 0; i < cant; i++) {
                if (i%2 == 0) {
                    System.out.print("+ ");
                } else {
                    System.out.print("- ");
                }
            }
            sc.close();
        }
    }
}
