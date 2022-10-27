public class Main {
   /*public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("Ты можешь водить");
        } else if (age == 17) {
            System.out.println("Ты можешь получить права");
        } else {
            System.out.println("Ты несовершеннолетний");
        }
    }*/
//Задание 1

    /* public static void main(String[] args) {
        byte a = 100;
        short b = 200;
        int c = 1000;
        long d = 20000;
        float e = 2.5F;
    }*/
//Задание 2

     /*public static void main(String[] args) {
        float weightTheFirstBoxer = 78.2f;
        float weightTheSecondBoxer = 82.7f;
        float TheMainWeight = weightTheSecondBoxer + weightTheFirstBoxer;
        System.out.println("Общий вес " + TheMainWeight + " кг");
        float TheGap = weightTheSecondBoxer - weightTheFirstBoxer;
        System.out.println("Разница весом между боксенрами " + TheGap + " кг");
    }*/
    //Задание 3
   /* public static void main(String[] args) {
        int bananas = 5;
        int oneBananasGram = 80;
        int milk = 200;
        int onePocketMilkGram = 105;
        int icecream = 2;
        int oneIcecreamGram = 100;
        int eggs = 4;
        int oneEggGram = 70;
        int weightBananas = bananas * oneBananasGram;
        System.out.println("Общий вес бананов " + weightBananas + " грамм");
        int weighMilk = milk * onePocketMilkGram / 100;
        System.out.println("Общий вес молока " + weighMilk + " грамм");
        int weightIcecream = icecream * oneIcecreamGram;
        System.out.println("Общий вес мороженного " + weightIcecream + " грамм");
        int weightEggs = eggs * oneEggGram;
        System.out.println("Общий вес яиц " + weightEggs + " грамм");
        double mainWeightProducts = (weighMilk + weightBananas + weightEggs + weightIcecream) / 1000.0;
        System.out.println("Общий вес всех продуктов " + mainWeightProducts + " кг");
    }*/
    //Задание 4
     /*public static void main(String[] args) {
        int mainLoseWeightKilogram = 7;
        int theFirstVariantGram = 250;
        int theSecondVariantGram = 500;
        double oneKilogram = 1000;
        double theFirstVariantKilogram = theFirstVariantGram / oneKilogram;
        System.out.println("Потеря веса 1 вариант " + theFirstVariantKilogram + " кг");
        double theSecondVariantKilogram = theSecondVariantGram / oneKilogram;
        System.out.println("Потеря веса при 2 варианте " + theSecondVariantKilogram + " кг");
        double loseWeightTheFirstVariant = mainLoseWeightKilogram / theFirstVariantKilogram;
        System.out.println("Количество дней похудения при 1 варианте " + loseWeightTheFirstVariant + " дней");
        double loseWeightTheSecondVariant = mainLoseWeightKilogram / theSecondVariantKilogram;
        System.out.println("Потеря веса при 2 варианте " + loseWeightTheSecondVariant + " дней");
    }*/
    //Задание 5
    /* public static void main(String[] args) {
        int MarySalary = 67760;
        int DenisSalary = 83690;
        int KristinaSalary = 76230;
        int months = 12;
        float rateRise = (float) 0.1;
        int newMarySalary = (int) ((MarySalary * rateRise) + MarySalary);
        int newDenisSalary = (int) ((DenisSalary * rateRise) + DenisSalary);
        int newKristinaSalary = (int) ((KristinaSalary * rateRise) + KristinaSalary);
        int MarySalaryWithoutRiseYear = MarySalary * months;
        int DenisSalaryWithoutRiseYear = DenisSalary * months;
        int KristinaSalaryWithoutRiseYear = KristinaSalary *months;
        int MarySalaryWithRiseYear = newMarySalary * months;
        int DenisSalaryWithRiseYear = newDenisSalary * months;
        int KristinaSalaryWithRiseYear = newKristinaSalary * months;
        int MaryRiseSalaryYear = MarySalaryWithRiseYear - MarySalaryWithoutRiseYear;
        int DenisRiseSalaryYear = DenisSalaryWithRiseYear - DenisSalaryWithoutRiseYear;
        int KristinaRiseSalaryYear = KristinaSalaryWithRiseYear - KristinaSalaryWithoutRiseYear;
        System.out.println("Маша теперь получает в месяц " + newMarySalary + " рублей. Годовой доход вырос на " + MaryRiseSalaryYear + " рублей");
        System.out.println("Денис теперь получает в месяц " + newDenisSalary + " рублей. Годовой доход вырос на " + DenisRiseSalaryYear + " рублей");
        System.out.println("Кристина теперь получает в месяц " + newKristinaSalary + " рублей. Годовой жоход вырос на " + KristinaRiseSalaryYear + " рублей");
    }*/
//Задание 6
    /* public static void main(String[] args) {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d *e));
        System.out.println("result " + result);
        int result1 = (a * (b +(c -d * e))) * -1;
        System.out.println("result " + result1);
    }*/
    //Задание 7
    /*public static void main(String[] args) {
        int a = 5;
        a =7;
        int b = 7;
        b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }*/
    //Задание 8
    public static void main(String[] args) {
        int a = 768;
        int b = 10;
        int TwoNumber = a / b;
        int theSecondNumber = TwoNumber % b;
        System.out.println("Остаток " + theSecondNumber);



    }
}
