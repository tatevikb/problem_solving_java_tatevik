public class FlippingBits {


    public static long flippingBits(long n) {
        n = ~n;
        n = n & 0xFFFFFFFFL;
        return n;
    }

    public static void main(String[] args) {
        long[] numbers = { 0, 802743475, 35601423};
        for(var e : numbers)
            System.out.println(flippingBits(e));
    }
}
