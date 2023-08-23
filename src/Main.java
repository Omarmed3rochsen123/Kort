import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner emil = new Scanner(System.in);
        int goaganeonemoretime;

        int[] Kort = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        System.out.println("11 är knäckt, 12 dam, 13 kung, 14 ess");
        System.out.print("Dra kort genom att skriva 1: ");
        goaganeonemoretime = emil.nextInt();

        while (goaganeonemoretime == 1) {

            double index = Math.random() * Kort.length;
            int first = Kort[(int) index];
            System.out.println("Ditt kort är :" + first);

            index = Math.random() * Kort.length;
            int second = Kort[(int) index];
            System.out.println("Din motståndares kort är :" + second);

            if (first > second) {
                System.out.println("Du vann!");
            } else if (second > first) {
                System.out.println("Du torskade lol");
            } else {
                System.out.println("Det blev lika, kör igen");
            }

            System.out.println("Skriv 1 för att go agane, något annat för att avsluta eller bara krascha programmet");
            System.out.print(": ");
            goaganeonemoretime = emil.nextInt();

        }
    }
}