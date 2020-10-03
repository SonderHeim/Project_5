public class Recursia10 {
    public static int rec(int n, int i)
    {
        return (n==0) ? i : rec( n/10, i*10 + n%10 );
    }
    public static void main(String[] args) {
        System.out.println(rec(54, 0));
    }
}