public class Main {
    public static void main(String[] args) {
        //video lesson 1
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        //video lesson 2
        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " + capacityLeft + " кг вещей");

        var applesWeight = 2;
        var orangesWeight = 3;
        var fruitsWeight = applesWeight + orangesWeight;
        System.out.println("Общий вес фруктов " + fruitsWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumberWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitsWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar);

        //homework02 started
        //task 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4 ;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 3
        dog = dog - 4;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task 6
        var firstBoxersWeight = 78.2;
        var secondBoxersWeight = 82.7;
        var totalBoxersWeight = firstBoxersWeight + secondBoxersWeight;
        System.out.println("Общий вес двух бойцов " + totalBoxersWeight);
        var differenceBetweenBoxersWeight = secondBoxersWeight - firstBoxersWeight;
        System.out.println("Разница в весе между двумя боксерами " + differenceBetweenBoxersWeight);
        //task 7
        var differenceBetweenBoxersWeight1 = secondBoxersWeight % firstBoxersWeight;
        System.out.println("Разница в весе между бойцами " + differenceBetweenBoxersWeight1);

        //task 8
        var totalWorkHours = 640;
        var oneEmployeeWorkingHours = 8;
        var totalEmployees = totalWorkHours / oneEmployeeWorkingHours;
        System.out.println("Всего работников в компании - " + totalEmployees);
        var newTotalEmployees = totalEmployees + 94;
        var newTotalWorkHours = newTotalEmployees * oneEmployeeWorkingHours;
        System.out.println("Если в компании работает " + newTotalEmployees + " человек, то всего " +
                newTotalWorkHours + " часов работы может быть поделено между сотрудниками");
    }
}