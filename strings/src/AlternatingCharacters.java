import java.util.Scanner;

public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {
        int count = 0;
        for(int i = 1; i < s.length(); ++i) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        for(int i = 0; i < q; ++i) {
            String s = scan.nextLine();
            System.out.println(alternatingCharacters(s));
        }
    }
}
