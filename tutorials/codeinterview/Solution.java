package hrcode.tutorials.codeinterview;


import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.*;

/**
 * Created by thinkit on 2016/10/9.
 */
public class Solution {
    ////////////////////////////////////////////////
    void Day0_ArraysLeftRotation(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        arrayLeftRotation(a, k);
    }

    private void arrayLeftRotation(int[] ia, int k) {
        int n = ia.length;
        k %= n;
        for (int i = k; i < n; i++) {
            System.out.print(ia[i] + " ");
        }
        for (int i = 0; i < k; i++) {
            System.out.print(ia[i] + " ");
        }
        System.out.println();
    }

    ////////////////////////////////////////////////
    public void Entrance() {
        Scanner sc = new Scanner(System.in);
        Day0_ArraysLeftRotation(sc);
        sc.close();
    }

    public static void main(String[] args) {
        new Solution().Entrance();

    }
}
