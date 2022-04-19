import java.util.Scanner;
public class metodos {
    public static void pedir(int num[]){
        Scanner sc = new Scanner(System.in);
        for(int cont=0;cont<10;cont++){
            System.out.println("Número:");
            num[cont]=Integer.parseInt(sc.nextLine());

        }
    }
    public static void comparar(int num[],int num2[]){
        int cont=0;
        for(int cont2=0;cont2<10;cont2++){
            cont=1;
            for(int cont3=0;cont3<10;cont3++){
                if(num[cont2] == num[cont3])
                    num2[cont2]=cont++;
            }
        }
    }
    public static void imprimir(int num[],int num2[]){

    }
}
