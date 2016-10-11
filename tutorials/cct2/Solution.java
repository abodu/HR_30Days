package hrcode.tutorials.cct2;

import java.util.Scanner;

/**
 * Created by thinkit on 2016/10/9.
 */
public class Solution {

//    ////////////////////////////////////////////////////
//    void SwapMinimalWithLastOne() {
//
//        int[] a = new int[10];
//        int m = 1111111111, idx = 0;
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//            int t = (a[i] < 0) ? -a[i] : a[i];
//            if (m > t) {
//                m = t;
//                idx = i;
//            }
//        }
//        //swap
//        int t = a[idx];
//        a[idx] = a[a.length - 1];
//        a[a.length - 1] = t;
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }

    ////////////////////////////////////////////////////
    void Entrance() {
        sc = new Scanner(System.in);
//        SwapMinimalWithLastOne();
        sc.close();
    }

    public static void main(String[] args) {
        new Solution().Entrance();
    }

    Scanner sc = null;
}
