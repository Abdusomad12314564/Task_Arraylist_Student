import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Abdusomad", (byte) 31, "Java"),
                new Student("Akyl", (byte) 30, "JS"),
                new Student("Uson", (byte) 19, "Java"),
                new Student("Fatima", (byte) 20, "JS"),
                new Student("Bermet", (byte) 23, "Java"),
                new Student("Emil", (byte) 22, "JS"),
                new Student("Ilim", (byte) 24, "Java"),
                new Student("Akkaiyn", (byte) 24, "Java"),
                new Student("Bilim", (byte) 26, "JS"),
                new Student("Asyl", (byte) 29, "JS")));
        while (true) {
            System.out.print("""
                    \n1-Баардык студенттердин тизмеси.
                    2-Java группасы.
                    3-JS группасы.
                    4-19дан 23 жашка чейинки студенттер.
                    5-Аттары "А" тамгасынан башталган студенттер.
                    0-Программадан чыгуу.
                    № :""");
            byte num = new Scanner(System.in).nextByte();
            if (num == 0) {
                System.err.println("БҮТТҮ!");
                break;
            }
            switch (num) {
                case 1 -> {
                    System.out.println("-----------Баардык студенттер-----------");
                    for (Student arr : students) {
                        System.out.println(arr);
                    }
                }
                case 2 -> {
                    System.out.println("-----------Java - группасындагы студенттер-----------");
                    for (Student arr : students) {
                        arr.java();
                    }
                }
                case 3 -> {
                    System.out.println("-----------JS - группасындагы студенттер-----------");
                    for (Student arr : students) {
                        arr.js();
                    }
                }
                case 4 -> {
                    System.out.println("-----------Жаштары 19-23кө чейинки студенттер-----------");
                    for (Student arr : students) {
                        arr.age();
                    }
                }
                case 5 -> {
                    System.out.println("-----------Аттары A - тамгасынан башталган студенттер-----------");
                    for (Student arr : students) {
                        arr.aName();
                    }
                }
            }
        }
    }
}
