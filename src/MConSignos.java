import java.util.Scanner;
public class MConSignos {
    public static void LaM(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el tamaño de la letra M que desea imprimir: ");
            int tam = sc.nextInt();
                for (int i = 0; i < tam; i++) {
                    System.out.print("* ");
                        for (int j = 0; j < tam; j++) {
                            if (i <= ((tam-1)/2)) {
                                if (i == j || i + j == tam - 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }else {
                                System.out.print("  ");
                            }
                        }

                    System.out.println("* ");
                }
            sc.close();
        }
    }
}
