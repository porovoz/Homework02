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
    }
}