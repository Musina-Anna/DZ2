public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend+2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog+4;
        System.out.println(frog);

        var mass1 = 78.2;
        var mass2 = 82.7;
        var totalWeight = mass1+mass2;
        System.out.println("Общий вес бойцов " + totalWeight);

        mass1 = 78.2;
        mass2 = 82.7;
        var diff = mass2 % mass1;
        System.out.println("Разница в весе "+diff);

        var clock = 640;
        var day = 8;
        var worker = clock/day;
        System.out.println("Всего сотрудников в компании- "+worker+" человек");
        var all = worker+94;
        var time = all/day;
        System.out.println("Если в компании работает "+all+" человек ,то всего "+time+" часов работы может быть между сотрудниками");

    }
}