public class ThePowerSum {

    public static int powerSum(int X, int N) {
        int upTo = (int) (Math.pow(X, 1.0/N)) + 1;
        int[] arr = new int[X+1];
        arr[0] = 1;
        for(int i = 1; i <= upTo; i++) {
            int pow = (int)Math.pow(i, N);
            for(int j = X; j >= pow; j--) {
                arr[j] += arr[j-pow];
            }
        }
        return arr[X];
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.println(powerSum(x, n));
    }
}
