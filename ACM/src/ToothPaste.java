import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jialu Hu
 * @create 2020-10-25 13:05
 */

public class ToothPaste {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> f1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> f2 = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
//        if(t<1 || t>1000000)
//            System.exit(0);

        int[] c1 = new int[t];
        int[] c2 = new int[t];
        int[] m = new int[t];

        for (int i = 0; i < t; i++) {
            m[i] = in.nextInt();
//            if(m[i]<1 || m[i]>1000000)
//                System.exit(0);
            c1[i] = in.nextInt();
//            if(c1[i]<1 || c1[i]>1000000000)
//                System.exit(0);
            c2[i] = in.nextInt();
//            if(c2[i]<1 || c2[i]>1000000000)
//                System.exit(0);

            ArrayList<Integer> temp1 = new ArrayList<>();
            ArrayList<Integer> temp2 = new ArrayList<>();

            for (int j = 0; j < m[i]; j++) {
                temp1.add(in.nextInt());
                temp2.add(in.nextInt());
            }

            f1.add(temp1);
            f2.add(temp2);
        }

        for (int i = 0; i < t; i++) {
            int temp1 = c1[i];
            int temp2 = c2[i];

            for (int j = 0; j < m[i]; j++) {
                int temp01 = (int)Math.floor(temp1*f1.get(i).get(j)/1000000000);
                int temp02 = (int)Math.floor(temp2*f2.get(i).get(j)/1000000000);
                temp1 -= Math.min(temp1,temp01);
                temp2 -= Math.min(temp2,temp02);
            }

            if((c1[i]-temp1)>(c2[i]-temp2)){
                System.out.println("Zag");
            }
            else{
                System.out.println("Coffee");
            }
        }
    }
}
