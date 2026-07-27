//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание N 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if ( clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println("Задание N 2");
        int clientDeviceYear = 2016;
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear <= 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear > 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear <= 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("Задание N 3");
        int year = 2004;
        if (year < 1583) {
            System.out.println("Год не является високостным");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Год является високостным");
        } else {
            System.out.println("Год не является високостным");
        }
        System.out.println("Задание N 4");
        int deliveryDistance = 21;
        int deliveryDays = 1;
        if (deliveryDistance <= 20){
            System.out.println("Доставка занимает " + deliveryDays + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            deliveryDays++;
            System.out.println("Доставка занимает " + deliveryDays + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays += 2;
            System.out.println("Доставка занимает " + deliveryDays + " дня");
        }else if (deliveryDistance > 100){
            System.out.println("Доставки нет");
        } // как правильно работает инкрементация? мы этого еще не проходили. Как сделать без нее не знаю. Может подскажите где почитать про эту тему?
        System.out.println("Задание N 5");
        int monthNumber = 7;
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
            case 10:
            case 11:
                System.out.println("Сейчас осень");
             break;
            default:
                System.out.println("Этот месяц еще не придумали");
                // switch использован для всех условий определения сезона else не использовал.
        }
    }
}