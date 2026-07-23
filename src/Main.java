import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание N 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возрост человека  " + age + ", то он совершенно летний");
        } else {
            System.out.println("Если возраст человека " + age + ", он не достиг совершеннолетия, нужно немного пострадать");
        }
        System.out.println("Задание N 2");
        int airTemperature = 6;
        if (airTemperature < 5) {
            System.out.println("Если на улице " + airTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("Если на улице " + airTemperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задание N 3");
        int speed = 62;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        System.out.println("Задаине N 4");
        int personsAge = 23;
        if (personsAge >= 2 && personsAge <= 6){
            System.out.println("Если возраст человека равен " + personsAge + " ему нужно ходить в детский сад." );
        } else if (personsAge >= 7 && personsAge <= 17){
            System.out.println("Если возрост человека равен " + personsAge + " ему нужно ходить в школу");
        } else if (personsAge >= 18 && personsAge <= 24){
            System.out.println("Если возрост человека равен " + personsAge + " его место в университете");
        } else if (personsAge > 24){
            System.out.println("Если возраст человека равен или больше " + personsAge + " ему пора ходить на работу");
        }
        System.out.println("Задание N 5");
        int childsAge = 10;
        int adult = 1;
        if (childsAge <= 5){
            System.out.println("Если возраст ребенка " + childsAge + " лет, ему нельзя кататься на аттракционах");
        } else if (childsAge > 5 && childsAge <= 14 && adult >= 1){
            System.out.println("Если возрост ребенка " + childsAge + " лет, он может котаться только в сопровождении взрослого");
        } else if (childsAge > 14){
            System.out.println("Если возраст ребенка " + childsAge + " лет, он может кататься самостоятельно, без сопровождения");
        }else if (childsAge > 5 && childsAge <= 14 && adult < 1){
            System.out.println("Если возраст ребенка " + childsAge + " лет, он не может кататься без сопровождения взрослого");
        }
        System.out.println("Задание N 6");
        int numberOfPeople = 50;
        int seatsInTheCarriage = 102;
        int seatingPosition = 60;
        int  standingRoom = seatsInTheCarriage - seatingPosition;
        if (seatingPosition > numberOfPeople && numberOfPeople < seatsInTheCarriage){
            System.out.println("В вагоне есть свободные сидячии и стоячии места");
        } else if (seatingPosition == numberOfPeople){
            System.out.println("В вагоне возможно остались сидячии места и много стоячих мест");
        } else if (numberOfPeople > seatingPosition && numberOfPeople < seatsInTheCarriage){
            System.out.println("В вагоне навряд ли есть сидячии места но стоячии точно остались");
        } else if (seatsInTheCarriage <= numberOfPeople){
            System.out.println("В вагоне не остальсь сидячих и стоячих мест");
        }
        System.out.println("Задание N 7");
        int one = 4;
        int two = 2;
        int three = 9;
        if (one > two && one >three){
            System.out.println("Самое большое число у первой переменной");
        } else if (two > one && two > three){
            System.out.println("Самое большое число у второй переменной");
        }else if (three > one && three > two){
            System.out.println("Самое большое число у третьей переменной");
        }





    }
}