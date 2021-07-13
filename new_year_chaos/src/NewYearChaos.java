import java.util.List;

public class NewYearChaos {

    public static void minimumBribes(List<Integer> qq) {

        int[] q = new int[qq.size()];
        int k = 0;
        for(int e : qq)
            q[k++] = e;

        boolean sorted = true;
        for(int i = 0; i < q.length; i++) {
            if((q[i] - (i + 1)) > 2) {
                sorted = false;
                break;
            }
        }
        if(sorted) {
            int count = 0;
            sorted = false;
            for(int j = 0; j < q.length - 1; j++)
            {
                if(sorted)
                {
                    break;
                }
                sorted=true;
                for(int i = 0; i < q.length - j - 1; i++) {
                    if(q[i + 1] < q[i]) {
                        int tmp = q[i];
                        q[i] = q[i + 1];
                        q[i + 1]=tmp;
                        sorted = false;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        else {
            System.out.println("Too chaotic");
        }
    }
}
