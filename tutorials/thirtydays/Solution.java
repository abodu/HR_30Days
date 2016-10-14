package hackerrank.tutorials.thirtydays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by dgliu on 16-9-26.
 */
public class Solution {
//    //////////////////////////////////////////////////
//    void Day0_HelloWorld() {
//        System.out.printf("Hello World!");
//    }
//
//    ////////////////////////////////////////////////////
//    void Day1_DataTypes() {
//        int i = 4;
//        double d = 4.0;
//        String s = "HackerRank ";
//        int si = sc.nextInt();
//        double sd = sc.nextDouble();
//        sc.nextLine();
//        String ss = sc.nextLine();
//        System.out.println(i + si);
//        System.out.println(d + sd);
//        System.out.println(s + ss);
//    }
//
//    ////////////////////////////////////////////////////
//    void Day2_Operator() {
//        double mealCost = sc.nextDouble();
//        int tipPercent = sc.nextInt();
//        int taxPercent = sc.nextInt();
//        double realCost = mealCost * (100 + tipPercent + taxPercent) / 100;
//        int totalCost = (int) Math.round(realCost);
//        System.out.println("The total meal cost is " + totalCost + " dollars.");
//        sc.close();
//    }
//
//    ////////////////////////////////////////////////////
//    void Day3_IntroToConditionalStatements() {
//        int n = sc.nextInt();
//        String s = "Not Weird";
//        if (n % 2 == 1) {
//            s = "Weird";
//        } else {
//            if (5 < n && n < 21) {
//                s = "Weird";
//            }
//        }
//        System.out.println(s);
//    }
//
//    ////////////////////////////////////////////////////
//    private class Day4_Person {
//        int age;
//
//        public Day4_Person(int age) {
//            this.age = age;
//            if (this.age < 0) {
//                this.age = 0;
//                System.out.println("Age is not valid, setting age to 0.");
//            }
//        }
//
//        public void amIOld() {
//            String s = "old";
//            if (this.age < 13) {
//                s = "young";
//            } else if (13 <= this.age && this.age < 18) {
//                s = "a teenager";
//            }
//            System.out.printf("You are %s.\n", s);
//        }
//
//        public void yearPasses() {
//            this.age++;
//        }
//    }
//
//    void Day4_ClassVsInstance() {
//        int T = sc.nextInt();
//        for (int i = 0; i < T; i++) {
//            int age = sc.nextInt();
//            Day4_Person p = new Day4_Person(age);
//            p.amIOld();
//            for (int j = 0; j < 3; j++) {
//                p.yearPasses();
//            }
//            p.amIOld();
//            System.out.println();
//        }
//    }
//
//    ////////////////////////////////////////////////////
//    void Day5_Loops() {
//        int T = sc.nextInt();
//        for (int i = 1; i < 11; i++) {
//            System.out.printf("%d x %d = %d\n", T, i, T * i);
//        }
//    }
//
//    ////////////////////////////////////////////////////
//    void Day6_Review_SpiltStrings() {
//        int n = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < n; i++) {
//            String inStr = sc.next();
//            String even = "", odd = "";
//            for (int j = 0; j < inStr.length(); ) {
//                if (j % 2 == 0) {
//                    even += inStr.charAt(j++);
//                } else {
//                    odd += inStr.charAt(j++);
//                }
//            }
//            System.out.println(even + " " + odd);
//        }
//    }
//
//    ////////////////////////////////////////////////////
//    void Day7_Arrays_ReverseSequence() {
//        int n = sc.nextInt();
//        String s = "";
//        for (int i = 0; i < n; i++) {
//            s = sc.nextInt() + " " + s;
//        }
//        System.out.println(s);
//    }
//
//    ////////////////////////////////////////////////////
//    void Day8_Maps_FindPhoneByName() {
//        int n = sc.nextInt();
//        HashMap<String, String> hm = new HashMap<>(n);
//        sc.nextLine();
//        for (int i = 0; i < n; i++) {
//            String key = sc.next();
//            String val = sc.next();
//            hm.put(key, val);
//        }
//        while (sc.hasNext() && n > 0) {
//            String qs = sc.next();
//            if ("".equals(hm.get(qs)) || null == hm.get(qs)) {
//                System.out.println("Not found");
//            } else {
//                System.out.println(qs + "=" + hm.get(qs));
//            }
//            n--;
//        }
//    }
//
//    ////////////////////////////////////////////////////
//    private int factorial(int n, int sum) { //tail-recursion
//        if (n <= 1) {
//            return sum;
//        } else {
//            return factorial(n - 1, sum * n);
//        }
//    }
//
//    void Day9_Recursion_Factorial() {
//        int sum = 1;
//        int n = sc.nextInt();
//        System.out.println(factorial(n, sum));
//    }
//
//    ////////////////////////////////////////////////////
//    void Day10_BinaryNumbers() {
//        String s = Integer.toBinaryString(sc.nextInt());
//        int max = -1, sum = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '0') {
//                if (max < sum) {
//                    max = sum;
//                }
//                sum = 0;
//            } else {
//                sum++;
//            }
//        }
////  System.out.println(s);
//        System.out.println(max > sum ? max : sum);
//    }
//
//////////////////////////////////////////////////////
//
//    void Day11_2D_Arrays_GetMaxSumOfHourGlass() {
//        int[][] array = new int[6][6];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = sc.nextInt();
//            }
//        }
//        int max = -11111;
//        for (int i = 1; i < array.length - 1; i++) {
//            for (int j = 1; j < array[i].length - 1; j++) {
//                int sum = array[i][j]; //本行中的唯一一个数
//                sum += array[i - 1][j - 1] + array[i - 1][j] + array[i - 1][j + 1]; //上一行的三个数
//                sum += array[i + 1][j - 1] + array[i + 1][j] + array[i + 1][j + 1]; //下一行的三个数
//                if (max < sum) {
//                    max = sum;
////        System.out.println("(" + i + "," + j + ")");
//                }
//            }
//        }
//        System.out.println(max);
//    }
//
//    ////////////////////////////////////////////////////
//    class Person {
//        protected String firstName;
//        protected String lastName;
//        protected int idNumber;
//
//        Person(String firstName, String lastName, int idNumber) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.idNumber = idNumber;
//        }
//
//        public void printPerson() {
//            System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
//        }
//    }
//
//    class Student extends Person {
//        private int[] scores;
//
//        Student(String fn, String ln, int id, int[] scores) {
//            super(fn, ln, id);
//            this.scores = scores;
//        }
//
//        public char calculate() {
//            int sum = 0;
//            for (int i = 0; i < scores.length; i++) {
//                sum += scores[i];
//            }
//            int ave = sum / scores.length;
//            if (90 <= ave && ave <= 100) {
//                return 'O';
//            } else if (80 <= ave && ave < 90) {
//                return 'E';
//            } else if (70 <= ave && ave < 80) {
//                return 'A';
//            } else if (55 <= ave && ave < 70) {
//                return 'P';
//            } else if (40 <= ave && ave < 55) {
//                return 'D';
//            } else {
//                return 'T';
//            }
//        }
//    }
//
//    void Day12_Inheritance_CalculateScores() {
//        String firstName = sc.next();
//        String lastName = sc.next();
//        int id = sc.nextInt();
//        int[] testScores = new int[sc.nextInt()];
//        for (int i = 0; i < testScores.length; i++) {
//            testScores[i] = sc.nextInt();
//        }
//        Student s = new Student(firstName, lastName, id, testScores);
//        s.printPerson();
//        System.out.println("Grade: " + s.calculate());
//    }
//
//    ////////////////////////////////////////////////////
//    abstract class Book {
//        String title;
//        String author;
//
//        Book(String t, String a) {
//            this.title = t;
//            this.author = a;
//        }
//
//        abstract void display();
//    }
//
//    class MyBook extends Book {
//        int price;
//
//        MyBook(String title, String author, int price) {
//            super(title, author);
//            this.price = price;
//        }
//
//        void display() {
//            System.out.println("Title: " + title);
//            System.out.println("Author: " + author);
//            System.out.println("Price: " + price);
//        }
//    }
//
//    void Day13_AbstractClass_ShowBookInfo() {
//        String title = sc.nextLine();
//        String author = sc.nextLine();
//        int price = sc.nextInt();
//        Book new_novel = new MyBook(title, author, price);
//        new_novel.display();
//    }
//
//    ////////////////////////////////////////////////////
//    class Difference {
//        private int[] elements;
//        public int maximumDifference;
//
//        Difference(int[] a) {
//            elements = a;
//            Arrays.sort(elements);
//        }
//
//        public void computeDifference() {
//            maximumDifference = elements[elements.length - 1] - elements[0];
//            if (maximumDifference < 0) {
//                maximumDifference *= -1;
//            }
//        }
//    }
//
//    void Day14_Scope_Difference() {
//        int[] a = new int[sc.nextInt()];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//        Difference difference = new Difference(a);
//        difference.computeDifference();
//        System.out.println(difference.maximumDifference);
//    }
//
//    ////////////////////////////////////////////////////
//    private class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//
//    private void display(Node head) {
//        Node start = head;
//        while (start != null) {
//            System.out.println(start.data + " ");
//            start = start.next;
//        }
//    }
//
//    private Node insert(Node listHead, int ele) {
//        if (null == listHead) {
//            listHead = new Node(ele);
//        } else {
//            Node p = listHead;
//            while (p.next != null) {
//                p = p.next;
//            }
//            p.next = new Node(ele);
//        }
//        return listHead;
//    }
//
//    void Day15_LinkedList() {
//        Node head = null;
//        int N = sc.nextInt();
//        while (N-- > 0) {
//            int ele = sc.nextInt();
//            head = insert(head, ele);
//        }
//        display(head);
//    }
//
//    ////////////////////////////////////////////////////
//    void Day16_Exceptions() {
//        String s = sc.next();
//        try {
//            System.out.println(Integer.parseInt(s));
//        } catch (Exception e) {
//            System.out.println("Bad String");
//        }
//    }
//
//    ////////////////////////////////////////////////////
//    private class Calculator {
//        int power(int n, int p) throws Exception {
//            if (n < 0 || p < 0) {
////      System.out.println("n and p should be non-negative");
//                throw new Exception("n and p should be non-negative");
//            }
//            int ret = 1;
//            while (p-- > 0) {
//                ret *= n;
//            }
//            return ret;
//        }
//    }
//
//    void Day17_MoreExceptions() {
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            int n = sc.nextInt();
//            int p = sc.nextInt();
//            Calculator mc = new Calculator();
//            try {
//                System.out.println(mc.power(n, p));
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//
//    ////////////////////////////////////////////////////
//    class InnerSolution {
//        private Stack<Character> s = new Stack<>();
//        private Queue<Character> q = new ArrayDeque<>();
//
//        public void pushCharacter(char c) {
//            s.push(c);
//        }
//
//        public void enqueueCharacter(char c) {
//            q.add(c);
//        }
//
//        public char popCharacter() {
//            return s.pop();
//        }
//
//        public char dequeueCharacter() {
//            return q.remove();
//        }
//    }
//
//    //private void pushChar
//    void Day18_StacksAndQueues_checkPalindrome() {
//        String input = sc.nextLine();
//        char[] s = input.toCharArray();
//        InnerSolution p = new InnerSolution();
//        for (char c : s) {
//            p.pushCharacter(c);
//            p.enqueueCharacter(c);
//        }
//        boolean isP = true;
//        for (int i = 0; i < s.length / 2; i++) {
//            if (p.popCharacter() != p.dequeueCharacter()) {
//                isP = false;
//                break;
//            }
//        }
//        System.out.println("The word, " + input + ", is" + ((!isP) ? " not" : "") + " a palindrome.");
//    }
//
//    ////////////////////////////////////////////////////
//    interface AdvancedArithmetic {
//        int divisorSum(int n);
//    }
//
//    class Calculator implements AdvancedArithmetic {
//        @Override
//        public int divisorSum(int n) {
//            if (n <= 1) {
//                return n;
//            }
//            int sum = 1 + n;
//            for (int i = 2; i <= n / 2; i++) {
//                if (n % i == 0) {
//                    sum += i;
//                }
//            }
//            return sum;
//        }
//    }
//
//    void Day19_Interfaces_DivisorSum() {
//        int n = sc.nextInt();
//        AdvancedArithmetic mc = new Calculator();
//        int sum = mc.divisorSum(n);
//        System.out.println("I implementd: " + mc.getClass().getInterfaces()[0].getName());
//        System.out.println(sum);
//    }
//
//    ////////////////////////////////////////////////////
//    int doBubbleSort(int[] a) {
//        int totalSwap = 0;
//        for (int i = 0; i < a.length; i++) {
//            int curSwap = 0;
//            for (int j = 0; j < a.length - 1 - i; j++) {
//                if (a[j] > a[j + 1]) {
//                    int tmp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = tmp;
//                    curSwap++;
//                }
//            }
//            if (curSwap > 0) {
//                totalSwap += curSwap;
//            } else {
//                break;
//            }
//        }
//        return totalSwap;
//    }
//
//    void Day20_Sorting_BubbleSort() {
////  int n=sc.nextInt();
//        int[] a = new int[sc.nextInt()];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("Array is sorted in " + doBubbleSort(a) + " swaps.");
//        System.out.println("First Element: " + a[0]);
//        System.out.println("Last Element: " + a[a.length - 1]);
//    }
//
//    ////////////////////////////////////////////////////
//    private <T> void printArray(T[] arr) {
//        for (T t : arr) {
//            System.out.println(t + "");
//        }
//    }
//
//    void Day21_Generics_printArray() {
//        Integer[] intArray = {1, 2, 3};
//        String[] stringArray = {"Hello", "World"};
//        printArray(intArray);
//        printArray(stringArray);
//    }
//
//    ////////////////////////////////////////////////////
//    class Node {
//        Node left, right;
//        int data;
//
//        Node(int data) {
//            this.data = data;
//            left = right = null;
//        }
//    }
//
//    int getHeight(Node root) {
//        if (root == null) {
//            return -1;
//        }
//        int hL = getHeight(root.left);
//        int hR = getHeight(root.right);
//        return (hL > hR ? hL : hR) + 1;
//    }
//
//    void levelOrder(Node root) {
//        if (root == null) {
//            return;
//        }
//        Queue<Node> queue = new ArrayDeque<>();
//        queue.offer(root);  //or  add
//        while (!queue.isEmpty()) {
//            Node cur = queue.poll();  //or remove
//            System.out.print(cur.data + " ");
//            if (cur.left != null) {
//                queue.offer(cur.left);
//            }
//            if (cur.right != null) {
//                queue.offer(cur.right);
//            }
//        }
//    }
//
//    Node insert(Node root, int data) {
//        if (root == null) {
//            return new Node(data);
//        }
//        Node cur;
//        if (data <= root.data) {
//            cur = insert(root.left, data);
//            root.left = cur;
//        } else {
//            cur = insert(root.right, data);
//            root.right = cur;
//        }
//        return root;
//    }
//
//    void Day22_BinarySearchTree_getHeight() {
//        int T = sc.nextInt();
//        Node root = null;
//        while (T-- > 0) {
//            root = insert(root, sc.nextInt());
//        }
//        System.out.println(getHeight(root));
//    }
//
//    void Day23_BinarySearchTree_levelOrder() {
//        int T = sc.nextInt();
//        Node root = null;
//        while (T-- > 0) {
//            root = insert(root, sc.nextInt());
//        }
//        levelOrder(root);
//    }
//
//    ////////////////////////////////////////////////////
//    class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//
//    Node removeDuplicates(Node head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        Node nc = head;
//        Node nn = head.next;
//        while (nn != null) {
//            if (nc.data == nn.data) {
//                // need to remove nc from list
//                nc.next = nn.next;
//            } else {
//                nc = nn;
//            }
//
//            nn = nn.next;
//        }
//        return head;
//    }
//
//    Node insert(Node head, int data) {
//        if (head == null) {
//            return new Node(data);
//        }
//        Node cur = head;
//        while (cur.next != null) {
//            cur = cur.next;
//        }
//        cur.next = new Node(data);
//        return head;
//    }
//
//    void display(Node head) {
//        Node cur = head;
//        while (cur != null) {
//            System.out.println(cur.data + " ");
//            cur = cur.next;
//        }
//    }
//
//    void Day24_MoreLinkedList_removeDuplicates() {
//        Node head = null;
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            head = insert(head, sc.nextInt());
//        }
//        head = removeDuplicates(head);
//        display(head);
//    }
//
//    ////////////////////////////////////////////////////
//    void Day25_RunningTimeAndComplexity_IsPrime() {
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            isPrime(sc.nextInt());
//        }
//    }
//
//    private void isPrime(int n) {
//        if (n <= 1) {
//            System.out.println("Not prime");
//            return;
//        }
//        for (int i = 2; i * i < n; i++) {
//            if (n % i == 0) {
//                System.out.println("Not prime");
//                return;
//            }
//        }
//        System.out.println("Prime");
//    }
//
//    ////////////////////////////////////////////////////
//    void Day26_NestedLogic_CalculateFine() {
//        int aD = sc.nextInt();
//        int aM = sc.nextInt();
//        int aY = sc.nextInt();
//        int eD = sc.nextInt();
//        int eM = sc.nextInt();
//        int eY = sc.nextInt();
//        if (eY < aY) {
//            System.out.println(10000);
//            return;
//        }
//        if (eY == aY && eM < aM) {
//            System.out.println(500 * (aM - eM));
//            return;
//        }
//        if (eY == aY && eM == aM && eD < aD) {
//            System.out.println(15 * (aD - eD));
//            return;
//        }
//        System.out.println(0);
//    }
//
//////////////////////////////////////////////////////
//void Day27_Testing() {
//  int T = sc.nextInt();
//  for (int i = 0; i < T; i++) {
//    int N = sc.nextInt();
//    int K = sc.nextInt();
//    int sum = 0;
//    for (int j = 0; j < N; j++) {
//      if (sc.nextInt() < 0) {
//        sum++;
//      }
//    }
//    if (sum >= K) {
//      System.out.println("NO");
//    } else {
//      System.out.println("YES");
//    }
//  }
//}
//
//////////////////////////////////////////////////////
//void Day28_RegExSample() {
//  int T = sc.nextInt();
//  ArrayList<String> a = new ArrayList<>();
//  for (int i = 0; i < T; i++) {
//    String curName = sc.next();
//    String curMail = sc.next();
//    if (curMail.endsWith("@gmail.com")) {
//      a.add(curName);
//    }
//  }
//  Collections.sort(a);
//  for (String s : a) {
//    System.out.println(s);
//  }
//}
//
//////////////////////////////////////////////////////
//void Day29_BitAnd() {
//  int T = sc.nextInt();
//  for (int i = 0; i < T; i++) {
//    int N = sc.nextInt();
//    int K = sc.nextInt();
//    int curMax = -1;
//    for (int j = 0; j < N; j++) {
//      for (int s = j + 1; s <= N; s++) {
//        int ar = j & s;
//        if (ar < K && ar > curMax) {
//          curMax = ar;
//        }
//      }
//    }
//    System.out.println(curMax);
//  }
//}

////////////////////////////////////////////////////
void Entrance() {
  sc = new Scanner(System.in);
//        Day0_HelloWorld();
//        Day1_DataTypes();
//        Day2_Operator();
//        Day3_IntroToConditionalStatements();
//        Day4_ClassVsInstance();
//        Day5_Loops();
//        Day6_Review_SpiltStrings();
//        Day7_Arrays_ReverseSequence();
//        Day8_Maps_FindPhoneByName();
//        Day9_Recursion_Factorial();
//        Day10_BinaryNumbers();
//        Day11_2D_Arrays_GetMaxSumOfHourGlass();
//        Day12_Inheritance_CalculateScores();
//        Day13_AbstractClass_ShowBookInfo();
//        Day14_Scope_Difference();
//        Day15_LinkedList();
//        Day16_Exceptions();
//        Day17_MoreExceptions();
//        Day18_StacksAndQueues_checkPalindrome();
//        Day19_Interfaces_DivisorSum();
//        Day20_Sorting_BubbleSort();
//        Day21_Generics_printArray();
//        Day22_BinarySearchTree_getHeight();
//        Day23_BinarySearchTree_levelOrder();
//        Day24_MoreLinkedList_removeDuplicates();
//        Day25_RunningTimeAndComplexity_IsPrime();
//        Day26_NestedLogic_CalculateFine();
//  Day27_Testing();
//  Day28_RegExSample();
//  Day29_BitAnd();
  sc.close();
}

private Scanner sc = null;

public static void main(String[] args) {
  new Solution().Entrance();
}
}
