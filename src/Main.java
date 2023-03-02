public class Main {
    public static void main(String[] args) {
        task1();
        /*task2();
        task3();
        task4();*/
    }
    public static int years(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
            return year;
            }
    public static int task1 () {
        System.out.println("Задача 1");
        return years(1995);
        }
    }

