

public class Main {
    public static void main(String[] args) {


        int[] Kort = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

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

    }
}