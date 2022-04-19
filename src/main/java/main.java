import java.util.Scanner;
public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        int [] num2 = new int[10];

        metodos.pedir(num);

        metodos.comparar(num,num2);

        metodos.imprimir(num,num2);

    }

}
