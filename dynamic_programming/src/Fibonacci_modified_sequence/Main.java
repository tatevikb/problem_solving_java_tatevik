package Fibonacci_modified_sequence;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) throws IOException {
      //  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      //  String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        //int t1 = Integer.parseInt(firstMultipleInput[0]);

       // int t2 = Integer.parseInt(firstMultipleInput[1]);

       // int n = Integer.parseInt(firstMultipleInput[2]);

        BigInteger result = FibonacciModified.fibonacciModified(0, 1, 10);
        System.out.println(result);

      //  bufferedWriter.write(String.valueOf(result));
      // bufferedWriter.newLine();

      //  bufferedReader.close();
      //  bufferedWriter.close();
    }
}
