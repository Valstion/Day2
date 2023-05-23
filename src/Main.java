public class Main {
    public static void main(String[] args) {
        boolean a = false;
        if (a) {
            System.out.println("tai tiesa");
        } else {
            System.out.println("ne tiesa");
        }


        int max = 100;
        int min = 100;


        if (min == max) {
            System.out.println("lygus");
        } else if (max < min) {
            System.out.println("max < min");
        } else {
            System.out.println("min < max");
        }
        boolean isRaining = true;
        boolean isSunny = true;
        boolean isWarm = true;

        if (isRaining == true) {
            System.out.println("Laukia lyja");
        } else if (isSunny == true) {
            System.out.println("sauleta");
        } else if (isWarm == true) {
            System.out.println("sauleta is silta");
        }
        if ((isSunny || isRaining) && isWarm) {
            System.out.println("isjungiam sildyma");
        }


        String name;
        String surname;
        int year = 1900;
        int thisYear = 2023;
        name = "Valstion";
        surname = "Emaxer";
        System.out.println("Aš esu " + name + " " + surname + " Man yra " + (thisYear - year) + " metai(ų)");
        System.out.println("--------------------------------------------------------");
        double one = (double) Math.round(Math.random() * 4);
        System.out.println(one);
        double two = (double) Math.round(Math.random() * 4);
        System.out.println(two);

        one = 3;
        two = 2;
        if (one == 0 || two == 0) {
            System.out.println("sugenerotas skaicius 0");
        } else if (one < two) {
            System.out.println(Math.round(two / one * 100) / 100.0);
        } else if (one > two) {
            System.out.println(Math.round(one / two * 100) / 100.0);
        } else {
            System.out.println("Skaiciai Lygus ");
        }
        System.out.println("--------------------------------------------------------");

        double radnOne = (double) Math.round(Math.random() * 25.0);
        double randTwo = (double) Math.round(Math.random() * 25.0);
        double randThree = (double) Math.round(Math.random() * 25.0);
//        radnOne = 9;
//        randTwo = 8;
//        randThree = 10;
        System.out.println(radnOne);
        System.out.println(randTwo);
        System.out.println(randThree);

        if (radnOne == randTwo || randTwo == randThree || randThree == radnOne) {
            System.out.println("skaiciai lygus kai kurie");
        } else if (radnOne < randTwo && randTwo < randThree) {
            System.out.println(randTwo + " Second digit");
        } else if (randTwo < radnOne && radnOne < randThree) {
            System.out.println(radnOne + " First Digit");
        } else {
            System.out.println( randThree  + " Third Digit");
        }


    }
}


