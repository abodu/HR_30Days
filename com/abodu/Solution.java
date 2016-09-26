package com.abodu;

import java.util.Scanner;

/**
 * Created by dgliu on 16-9-26.
 */
public class Solution {
    ////////////////////////////////////////////////////
    private void helloWorld() {
        System.out.printf("Hello World!");
    }

    ////////////////////////////////////////////////////
    private void displayDataTypes(Scanner scan) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        int si = scan.nextInt();
        double sd = scan.nextDouble();
        scan.nextLine();
        String ss = scan.nextLine();
        System.out.println(i + si);
        System.out.println(d + sd);
        System.out.println(s + ss);
    }

    ////////////////////////////////////////////////////
    private void displayOperator(Scanner scan) {
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        double realCost = mealCost * (100 + tipPercent + taxPercent) / 100;
        int totalCost = (int) Math.round(realCost);
        System.out.println("The total meal cost is " + totalCost + " dollars.");
        scan.close();
    }

    ////////////////////////////////////////////////////
    private void chkNumberWeird(Scanner scan) {
        int n = scan.nextInt();
        String s = "Not Weird";
        if (n % 2 == 1) {
            s = "Weird";
        } else {
            if (5 < n && n < 21) {
                s = "Weird";
            }
        }
        System.out.println(s);
    }

    ////////////////////////////////////////////////////
    private class Person {
        private int age;

        public Person(int age) {
            this.age = age;
            if (this.age < 0) {
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            }
        }

        public void amIOld() {
            String s = "old";
            if (this.age < 13) {
                s = "young";
            } else if (13 <= this.age && this.age < 18) {
                s = "a teenager";
            }
            System.out.printf("You are %s.\n", s);
        }

        public void yearPasses() {
            this.age++;
        }
    }

    private void chkPersonAge(Scanner scan) {
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int age = scan.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
    }

    ////////////////////////////////////////////////////
    private void displayLoop(Scanner scan) {
        int T = scan.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d\n", T, i, T * i);
        }
    }

    ////////////////////////////////////////////////////
    private void splitStrings(Scanner scan) {
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String inStr = scan.next();
            String even = "", odd = "";
            for (int j = 0; j < inStr.length(); ) {
                if (j % 2 == 0) {
                    even += inStr.charAt(j++);
                } else {
                    odd += inStr.charAt(j++);
                }
            }
            System.out.println(even + " " + odd);
        }
    }

    ////////////////////////////////////////////////////
    private void all_scan_entrance() {
        Scanner scan = new Scanner(System.in);

//        helloWorld();
//        displayDataTypes(scan);
//        displayOperator(scan);
//        chkNumberWeird(scan);
//        chkPersonAge(scan);
//        displayLoop(scan);
        splitStrings(scan);
        scan.close();
    }

    public static void main(String[] args) {
        new Solution().all_scan_entrance();
    }
}
