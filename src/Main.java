import java.time.LocalDate;

public class Main {

        public static void years(int year) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год вискокосный");
            } else {
                System.out.println(year + " год не високосный");
            }
        }

        public static void checkOS(int version, int year) {
            int currentYear = LocalDate.now().getYear();
            if (year < currentYear) {
                switch (version) {
                    case 0:
                        System.out.println("Установите облегченную версию iOS");
                        break;
                    case 1:
                        System.out.println("Установите облегченную версию Android");
                        break;
                }
            } else
                System.out.println("Обновление не требуется");
        }

        public static String delivery(int km) {

            if (km == 20) {
                return "1 день доставки";
            } else if (km >= 20 && km <= 60) {
                return "2 дня доставки";
            } else if (km > 60 && km <= 100) {
                return "3 дня доставки ";
            }
            return "Доставки нет";
        }
        public static void main(String[] args) {
            task1();
            task2();
            task3();
        }

        public static void task1() {
            System.out.println("Задача 1");
            years(2001);
        }

        public static void task2() {
            System.out.println("Задача 2");
            checkOS(0, 2026);
        }

        public static void  task3() {
            System.out.println("Задача 3");
            System.out.println(delivery(66));
        }
    }
