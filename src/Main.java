import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание N 1");
        char clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание N 2");
        char clientDeviceYear = 2011;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientOS == 0 && clientDeviceYear < 2015);
            System.out.println("Если год выпуска вашего устройство ранее 2015 г. установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientOS == 1 && clientDeviceYear < 2015);
            System.out.println("Если год выпуска вашего устройстава ранее 2015 г. установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("Задание N 3");
        int year = 1936;
        if (year % 4 == 0 && year > 1583) {
            System.out.println("Год является високостным");
        } else if (year % 4 != 0) {
            System.out.println("Год не является високостным");
        } else if (year < 1584) {
            System.out.println("Високостный год был введен с 1584 г. ");
        }
        System.out.println("Задание N 4");
        int deliveryDistance = 95;
        int deliveryDays = 0;
        if (deliveryDistance <= 20){
            int i = deliveryDays ++;
            System.out.println("Доставка занимает " + deliveryDays + " день");
        } if (deliveryDistance > 20 && deliveryDistance <= 60){
            int i = deliveryDays++;
            deliveryDays++;
            System.out.println("Доставка занимает " + deliveryDays + " дня");
        } if (deliveryDistance > 60 && deliveryDistance <= 100) {
            int i = deliveryDays ++;
            deliveryDays++;
            deliveryDays++;
            System.out.println("Доставка занимает " + deliveryDays + " дня");
        }else if (deliveryDistance > 100){
            System.out.println("Доставки нет");
        }
        System.out.println("Задание N 5");
        int monthNumber = 8;
        switch (monthNumber){
            case 12,1,2:
                System.out.println("Сейчас зима");
                break;
            case 3,4,5:
                System.out.println("Сейчас весна");
                break;
            case 6,7,8:
                System.out.println("Сейчас лето");
                break;
            case 9,10,11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Не коректный номер месяца");
        }
    }
}