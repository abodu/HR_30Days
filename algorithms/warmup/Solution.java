package hackerrank.algorithms.warmup;

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

//    ////////////////////////////////////////////////////
//    void FactorialSum() {
//        double x = sc.nextDouble();
//        int n = sc.nextInt();
//        double lr = 0.0;
//        int flag = 1;
//        for (int i = 1; i <= n; i++) {
//            lr += flag * myPow(x, i) / myFactorial(i, 1.0);
//            flag *= -1;
//        }
//        System.out.printf("%.4f", lr);
//    }
//
//    double myPow(double x, int n) {
//        double s = 1.0;
//        while (n-- > 0) {
//            s *= x;
//        }
//        return s;
//    }
//
//    double myFactorial(int n, double sum) {
//        if (n <= 1) {
//            return sum;
//        }
//        return myFactorial(n - 1, sum * n);
//    }

    ////////////////////////////////////////////////////
    void sherlockAndTheBeast() {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n <= 2 || n == 4 || n == 7) {
                System.out.println(-1);
                continue;
            }
            int j = 0;
            for (; j <= n / 5; j++) {
                if ((n - 5 * j) % 3 == 0) {
                    break;
                }
            }
            StringBuilder s = new StringBuilder();
            for (int k = 0; k < n - 5 * j; k++) {
                s.append("5");
            }
            for (int k = 0; k < 5 * j; k++) {
                s.append("3");
            }
            System.out.println(s.toString());
        }
    }

    ////////////////////////////////////////////////////
    void Entrance() {
        sc = new Scanner(System.in);
//        SwapMinimalWithLastOne();
//        FactorialSum();
        sherlockAndTheBeast();
        sc.close();
    }

    public static void main(String[] args) {
        new Solution().Entrance();
    }

    Scanner sc = null;
}
