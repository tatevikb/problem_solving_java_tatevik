import java.io.BufferedReader;
import java.io.FileReader;

public class RecursiveDigitSum {

    public static int superDigit(String n, int k) {
        long sum = 0;
        for(char c : n.toCharArray())
            sum += Character.getNumericValue(c);
        sum *= k;

        if(sum < 10)
            return (int)sum;

        return superDigit(String.valueOf(sum), 1);
    }

    private static String createRandomBigNumber(int n)
    {
        final String digits = "0123456789";

        StringBuilder sb = new StringBuilder(n);
        for(int i = 0; i < n; ++i)
            sb.append(digits.charAt((int)(Math.random() * 10)));
        return sb.toString();
    }

    private static String readLongNumber()
    {
        try {
            BufferedReader rd = new BufferedReader(new FileReader("C:\\Users\\Tatevik\\Desktop\\input08.txt"));
            return rd.readLine();
        }
        catch(Exception e) {

        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);

        int k = 3;
        //String n = createRandomBigNumber(100000);
        String n = readLongNumber();
        System.out.println(superDigit(n, 100000));
    }
}
