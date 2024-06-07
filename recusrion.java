public class recusrion {
    public static void main(String[] args) {
        System.out.println(power(2, 8));

    }

    private static int power(int base, int exp) {
        if (exp < 1) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

}