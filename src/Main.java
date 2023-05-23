public class Main {
    public static void main(String[] args) {
        boolean a = false;
        if (a) {
            System.out.println("tai tiesa");
        } else {
            System.out.println("ne tiesa");
        }


        int max = 100;
        int min = 10;


        if (min == max) {
            System.out.println("lygus");
        } else if (max < min) {
            System.out.println("max < min");
        } else {
            System.out.println("min < max");
        }
    }
}


