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
        name = "jevgenij";
        surname = "Diomin";
        System.out.println("Aš esu " + name + " " + surname + " Man yra " + (thisYear - year) + " metai(ų)");
        System.out.println("--------------------------------------------------------");
        int one = (int) Math.round(Math.random() * 4);
        System.out.println(one);
        int two = (int) Math.round(Math.random() * 4);
        System.out.println(two);
        if (one == 0 || two == 0){
            System.out.println("sugenerotas skaicius 0");
        }

       else

        if (one < two) {
            System.out.println(two / one);
        } else if (one > two) {
            System.out.println(one / two);
        }
        else {System.out.println("Skaicia Lygus ");}
        System.out.println("--------------------------------------------------------");

    }
}


