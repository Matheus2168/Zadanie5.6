import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe");

        int number = 0;
        boolean greaterThan100;
        boolean lesserThan200;
        boolean divisibleBy3;

        do{
            number = sc.nextInt();
            greaterThan100 = number >= 100;
            lesserThan200 = number<= 200;
            divisibleBy3 =  number%3==0;
            if (greaterThan100 == false) System.out.println("Liczba za mala");
            if (lesserThan200 == false) System.out.println("Liczba zbyt duza");
            if (divisibleBy3 == false) System.out.println("Liczba nie jest podzielna przez 3");
        }
        while (greaterThan100==false || lesserThan200 == false || divisibleBy3 == false);

        System.out.println("Twoja liczba jest okey!");
    }
}
