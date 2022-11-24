import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj pierwsza cyfre");
        Scanner scanner=new Scanner(System.in);
        int number1=scanner.nextInt();
        System.out.println("Podaj druga cyfre");
        int number2=scanner.nextInt();
        if(number1>number2&&number1<5){
            System.out.println(number1+ " jest mniejsza od 5");
        }
        else{System.out.println("Nie wiem co to jest :)");

        }
    }
}

