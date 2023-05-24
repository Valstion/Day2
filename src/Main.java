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
        //    radnOne = 20;
        //  randTwo = 15;
        //   randThree = 2;
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
            System.out.println(randThree + " Third Digit");
        }
        System.out.println("--------------------------------------------------------");

        int d = (int) Math.round(Math.random() * 10);
        int b = (int) Math.round(Math.random() * 10);
        int c = (int) Math.round(Math.random() * 10);
        System.out.println(d);
        System.out.println(b);
        System.out.println(c);

        int e = b + c;
        int f = c + d;
        int g = d + b;

        if (d < e && b < f && c < g) {
            System.out.println("Galima");
        } else System.out.println("Negalima");
        System.out.println("--------------------------------------------------------");

        int re1 = (int) Math.round(Math.random()) + (int) Math.round(Math.random());
        int re2 = (int) Math.round(Math.random()) + (int) Math.round(Math.random());
        int re3 = (int) Math.round(Math.random()) + (int) Math.round(Math.random());
        int re4 = (int) Math.round(Math.random()) + (int) Math.round(Math.random());
        System.out.println(re1);
        System.out.println(re2);
        System.out.println(re3);
        System.out.println(re4);

        int re5 = 0;
        int re6 = 0;
        int re7 = 0;

        if (re1 == 0) {
            re5++;
        }
        if (re2 == 0) {
            re5++;
        }
        if (re3 == 0) {
            re5++;
        }
        if (re4 == 0) {
            re5++;
        }

        if (re1 == 1) {
            re6++;
        }
        if (re2 == 1) {
            re6++;
        }
        if (re3 == 1) {
            re6++;
        }
        if (re4 == 1) {
            re6++;
        }

        if (re1 == 2) {
            re7++;
        }
        if (re2 == 2) {
            re7++;
        }
        if (re3 == 2) {
            re5++;
        }
        if (re4 == 2) {
            re7++;
        }

        System.out.println("null values " + re5);
        System.out.println("one values " + re6);
        System.out.println("two values " + re7);
        System.out.println("--------------------------------------------------------");

        int gr1 = (int) Math.round(Math.random() * 20 - 10);
        int gr2 = (int) Math.round(Math.random() * 20 - 10);
        int gr3 = (int) Math.round(Math.random() * 20 - 10);


        if (gr1 < 0) {
            System.out.println("[" + gr1 + "]");
        } else if (gr1 == 0) {
            System.out.println("(" + gr1 + ")");
        } else {
            System.out.println("{" + gr1 + "}");
        }

        if (gr2 < 0) {
            System.out.println("[" + gr2 + "]");
        } else if (gr2 == 0) {
            System.out.println("(" + gr2 + ")");
        } else {
            System.out.println("{" + gr2 + "}");
        }

        if (gr3 < 0) {
            System.out.println("[" + gr3 + "]");
        } else if (gr3 == 0) {
            System.out.println("(" + gr3 + ")");
        } else {
            System.out.println("{" + gr3 + "}");
        }
        System.out.println("--------------------------------------------------------");
    }
}


