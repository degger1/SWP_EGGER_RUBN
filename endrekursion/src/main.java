public class main {

    public static int prod(int n){
        return mult_prod(1, n);
    }
    public static int mult_prod ( int m, int n){
        if (n == 0) {
            return m;
        } else {
            System.out.println("N: "+ n);
            System.out.println("M: "+ m);
            return mult_prod(m * n, n-1);
        }
    }
    public static void main(String[] args) {

        prod(3);

    }

}
