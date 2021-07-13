import javax.print.attribute.IntegerSyntax;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MaximizingXor {

    public static int maximizingXor(int l, int r) {
            if(l == r)
                return 0;

            int max = 0;

            if(l < r) {
                for(int i = l; i <= r; i++) {
                    for(int j = i; j <= r; j++) {
                        int tmp = i^j;
                        if(tmp > max)
                            max = tmp;
                    }
                }
            }
            return max;
        }

    public static void main(String[] args) {
        int l = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        int result = maximizingXor(l, r);
        System.out.println(result);
    }
}
