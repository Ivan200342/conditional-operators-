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
        int deliveryDistance = 21;
        if (deliveryDistance <= 20){
            System.out.println("На доставку потребуется один день");
        }else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("На доставку потребуется два дня");
        }else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("На доставку потребуется три дня");
        }else if (deliveryDistance > 100){
            System.out.println("Доставки нет");
        }
        System.out.println("Задание N 5");
        int monthNumber = 8;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 11:
            case 10:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Такова месяца нет");
        }
    }
}