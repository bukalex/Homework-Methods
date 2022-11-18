import static java.lang.Math.ceil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int year = 2022;
        if (isLeap(year)) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }

        System.out.println(" ");

        System.out.println("Задание 2:");
        int OSType = 1;
        int releaseYear = 2018;
        appForDevice(OSType, releaseYear);

        System.out.println(" ");

        System.out.println("Задание 3:");
        int deliveryDistance = 95;
        int days = dayCounter(deliveryDistance);
        System.out.println("Доставка займет " + days + " сут.");
    }


    public static boolean isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void appForDevice(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }
    }


    public static int dayCounter(int distance) {
        int Days = 1;
        if (distance > 20) {
            Days += (int) ceil((distance - 20) / 40f);
        }
        return Days;
    }
}