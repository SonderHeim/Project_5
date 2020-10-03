public class Recursia11 {
    public static int rec(int n) {
        if (n == 1) {
            int m = n;
            if (m == 1) {
                return rec( + n + m);
            } else {
                int k = n;
                if (k == 1) {
                    return rec( n + m + k);
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = n;
            if (m == 1) {
                return rec( n + m);
            } else {
                return n + m;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(rec(15));
    }
}