public class Main {
    public static void main(String[] args) {

        // задача 1

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // задача 2

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // задача 3

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        // задача 4

        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }

        // задача 5

        for (int y = 1904; y <= 2096; y++) {
            if (y % 4 == 0) {
                System.out.println(y + " год является високосным");
            }
        }

        // задача 6

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // задача 7

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // задача 8

        int monthlySavings = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + monthlySavings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }

        // задача 9

        int bankTotal = 0;

        for (int i = 0; i < 12; i++) {
            bankTotal = bankTotal + monthlySavings;
            bankTotal = bankTotal + bankTotal / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + bankTotal);
        }

        // задача 10

        int number = 0;
        for (int i = 1; i < 11; i++) {
            number = 2 * i;
            System.out.println("2 * " + i + " = " + number);
        }
    }
}