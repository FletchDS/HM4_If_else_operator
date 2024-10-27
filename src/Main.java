import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte personAge1 = 17;

        System.out.printf("Если возраст человека равен %d, то ", personAge1);

        if (personAge1 >= 18) {
            System.out.print("он совершеннолетний");
        } else {
            System.out.print("он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача 2
        byte degrees = 9;

        System.out.printf("\n\nНа улице %d градусов, ", degrees);

        if (degrees <= 5) {
            System.out.print("нужно надеть шапку");
        } else if (degrees > 5) {
            System.out.print("можно идти без шапки");
        }

        //Задача 3
        byte carSpeed = 54;

        System.out.printf("\n\nЕсли скорость %d, то ", carSpeed);

        if (carSpeed > 60) {
            System.out.print("придется заплатить штраф");
        } else {
            System.out.print("можно ездить спокойно");
        }

        //Задача 4
        byte personAge2 = 8;

        System.out.printf("\n\nЕсли возраст человека равен %d, то ему нужно ходить ", personAge2);

        if (personAge2 >= 2 && personAge2 <= 6) {
            System.out.print("в детский садик");
        } else if (personAge2 > 6 && personAge2 <= 17) {
            System.out.print("в школу");
        } else if (personAge2 > 17 && personAge2 <= 24) {
            System.out.print("в университет");
        } else {
            System.out.print("на работу");
        }

        //Задача 5
        byte personAge3 = 3;

        System.out.printf("\n\nЕсли возраст ребенка равен %d, то ему ", personAge3);

        if (personAge3 < 5) {
            System.out.print("нельзя кататься на аттракционе");
        } else if (personAge3 >= 5 && personAge3 < 14) {
            System.out.print("можно кататься в сопровождении взрослого");
        } else {
            System.out.print("без сопровождения взрослого");
        }

        //Задача 6
        byte peopleCount = 80;

        System.out.print("\n\n");

        if (peopleCount >= 102) {
            System.out.print("Свободных мест нет");
        } else if (peopleCount >= 60) {
            System.out.print("Есть стоячие места нет");
        } else
            System.out.print("Есть сидячие места");

        //Задача 7
        Random random = new Random();
        int one = random.nextInt(-100, 101);
        int two = random.nextInt(-100, 101);
        int three = random.nextInt(-100, 101);

        System.out.printf("\n\nДаны три числа: %d %d %d\n", one, two, three);

        if (one >= two && one >= three) {
            System.out.printf("%d самое большое из них", one);
        } else if (two >= one && two >= three) {
            System.out.printf("%d самое большое из них", two);
        } else {
            System.out.printf("%d самое большое из них", three);
        }
    }
}