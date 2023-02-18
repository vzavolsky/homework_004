import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task_01();
        task_02();
        task_03();
        task_04();
        task_05();
        task_06();
        task_07();

    }
    public static void task_01() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько вам лет?");
        int age = in.nextInt();
        if (age >= 18) {
            System.out.println("Вы совершеннолетний.");
        } else {
            System.out.println("Вы не достигли возраста 18 лет. Вам нужно подождать ещё.");
        }
    }
    public static void task_02() {
        Scanner inputTemp = new Scanner(System.in);
        System.out.println("Какая температура сегодня?");
        int temp = inputTemp.nextInt();
        if (temp < 5) {
            System.out.printf("На улице температура %d°C, нужно надеть шапку.", temp);
        } else {
            System.out.printf("На улице температура %d°C, можно идти без шапки.", temp);
        }
    }
    public static void task_03() {
        Scanner inputSpeed = new Scanner(System.in);
        System.out.print("Введите скорость водителя: ");
        int speed = inputSpeed.nextInt();
        if (speed < 60) {
            System.out.printf("Если скорость %d км/ч, можно ездить спокойно.", speed);
        } else {
            System.out.printf("Если скорость %d км/ч, придётся заплатить штраф.", speed);
        }
    }
    public static void task_04() {
        String res = "";
        Scanner ageInput = new Scanner(System.in);
        System.out.print("Ведите возраст человека: ");
        int age = ageInput.nextInt();
        if (age >= 2 && age <= 6) {res = "ему нужно ходить в детский сад";}
        else if (age >= 7 && age <= 18) {res = "ему нужно ходить в школу";}
        else if  (age > 18 && age <= 24) {res = "его место в университете";}
        else {res = "ему пора ходить на работу";};
        System.out.printf("Если возраст человека равен %d, то " + res + ".", age);
    }
    public static void task_05() {
        String res = "";
        Scanner ageInput = new Scanner(System.in);
        System.out.print("Ведите возраст ребёнка: ");
        int age = ageInput.nextInt();
        if (age < 5) {res = "нельзя кататья на атракционе";}
        else if (age >= 5 && age <= 14) {res = "можно кататься в сопровождении взрослого";}
        else {res = "можно кататься без сопровождения взрослого";}
        System.out.printf("Если возраст ребенка равен %d, то ему " + res + ".", age);
    }
    public static void task_06() {
        String res = "";
        Scanner amountOfPassenagersInput = new Scanner(System.in);
        System.out.print("Количество пассажиров перед вами: ");
        int amountofPassangeers = amountOfPassenagersInput.nextInt();
        if (amountofPassangeers <= 60) {res = "У вас есть возможность занять сидячее место.";}
        if (amountofPassangeers > 60 && amountofPassangeers < 102) {res = "Вам вероятно останется стоячее место.";}
        if (amountofPassangeers >= 102) {res = "Вагон полностью занят. Вам вообще не достанется мест.";}
        System.out.print(res);
    }
    public static void task_07() {
        int one = 344;
        int two = 3333;
        int three = 55;
        int max;
        if (one > two && one > three) max = one;
        else if (two > one && two > three) max = two;
        else max = three;
        System.out.print("Максимальное число: " + max);
    }
}