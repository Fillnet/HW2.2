public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 ");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задание 2 ");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задание 3 ");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задание 4 ");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задание 5 ");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задание 6 ");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println("Общий вес боксеров " + firstBoxer + secondBoxer + " кг");
        System.out.println("Разница в весе боксеров " + (secondBoxer - firstBoxer) + " кг");
        System.out.println("Задание 7 ");
        System.out.println("Разница в весе боксеров " + (secondBoxer - firstBoxer) + " кг");
        System.out.println("Разница в весе боксеров " + (secondBoxer - firstBoxer) % secondBoxer + " кг");
        System.out.println("Задание 8 ");
        var workHours = 640;
        var oneWorkersHours = 8;
        var worker = workHours / oneWorkersHours;
        System.out.println("Всего работников в компании " + worker + " человек");
        var newWorkers = worker + 94;
        var newWorkHours = newWorkers * oneWorkersHours;
        System.out.println("Если в компании работает " + newWorkers + " человек, то всего " + newWorkHours + " часов работы может быть поделено между сотрудниками");


    }
}