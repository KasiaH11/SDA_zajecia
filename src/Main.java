
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String name=scanner.nextLine();
        System.out.println("Podaj swój wiek");
        int age= scanner.nextInt();
        System.out.println("Czesc mam na imie "+name+" mam " +age+" lat");
    }
}
