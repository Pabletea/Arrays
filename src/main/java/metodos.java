import java.util.Scanner;
public class metodos {
    public static void pedir(int num[]) {
        Scanner sc = new Scanner(System.in);
        for (int cont = 0; cont < 10; cont++) {
            System.out.println("Número:");
            num[cont] = Integer.parseInt(sc.nextLine());

        }
    }

    public static void comparar(int num[], int num2[]) {
        int cont = 0;
        for (int cont2 = 0; cont2 < 10; cont2++) {
            cont = 1;
            for (int cont3 = 0; cont3 < 10; cont3++) {
                if (num[cont2] == num[cont3])
                    num2[cont2] = cont++;
            }
        }
    }

    public static void imprimir(int num[], int num2[]) {
        int var = 0;
        System.out.printf("\n[");
        for (int x = 0; x < 10; x++) {
            if (num[x] != var) {
                if (x == 9)
                    System.out.printf("%d=%d", num[x], num2[x]);
                else
                    System.out.printf("%d=%d", num2[x], num[x]);
            }
            var = num[x];
        }
        System.out.printf("]");
    }
}

