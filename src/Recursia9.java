public class Recursia9 {
    public static int rec(int a, int b) {
        if (a > b + 1)
            return 0;
        if (a == 0 || b == 0)
            return 1;
        return rec(a, b - 1) + rec(a - 1, b - 1);
    }
    public static void main(String[] args) {
        System.out.println(rec(11, 15));
    }
}