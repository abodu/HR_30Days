package HR_30Days.abodu;

import java.util.*;

/**
 * Created by dgliu on 16-9-26.
 */
public class Solution {
////////////////////////////////////////////////////
void Day0_HelloWorld() {
  System.out.printf("Hello World!");
}

////////////////////////////////////////////////////
void Day1_DataTypes(Scanner scan) {
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
void Day2_Operator(Scanner scan) {
  double mealCost = scan.nextDouble();
  int tipPercent = scan.nextInt();
  int taxPercent = scan.nextInt();
  double realCost = mealCost * (100 + tipPercent + taxPercent) / 100;
  int totalCost = (int) Math.round(realCost);
  System.out.println("The total meal cost is " + totalCost + " dollars.");
  scan.close();
}

////////////////////////////////////////////////////
void Day3_IntroToConditionalStatements(Scanner scan) {
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
private class Day4_Person {
  int age;

  public Day4_Person(int age) {
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

void Day4_ClassVsInstance(Scanner scan) {
  int T = scan.nextInt();
  for (int i = 0; i < T; i++) {
    int age = scan.nextInt();
    Day4_Person p = new Day4_Person(age);
    p.amIOld();
    for (int j = 0; j < 3; j++) {
      p.yearPasses();
    }
    p.amIOld();
    System.out.println();
  }
}

////////////////////////////////////////////////////
void Day5_Loops(Scanner scan) {
  int T = scan.nextInt();
  for (int i = 1; i < 11; i++) {
    System.out.printf("%d x %d = %d\n", T, i, T * i);
  }
}

////////////////////////////////////////////////////
void Day6_Review_SpiltStrings(Scanner scan) {
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
void Day7_Arrays_ReverseSequence(Scanner scan) {
  int n = scan.nextInt();
  String s = "";
  for (int i = 0; i < n; i++) {
    s = scan.nextInt() + " " + s;
  }
  System.out.println(s);
}

////////////////////////////////////////////////////
void Day8_Maps_FindPhoneByName(Scanner scan) {
  int n = scan.nextInt();
  HashMap<String, String> hm = new HashMap<>(n);
  scan.nextLine();
  for (int i = 0; i < n; i++) {
    String key = scan.next();
    String val = scan.next();
    hm.put(key, val);
  }
  while (scan.hasNext() && n > 0) {
    String qs = scan.next();
    if ("".equals(hm.get(qs)) || null == hm.get(qs)) {
      System.out.println("Not found");
    } else {
      System.out.println(qs + "=" + hm.get(qs));
    }
    n--;
  }
}

////////////////////////////////////////////////////
private int factorial(int n, int sum) { //tail-recursion
  if (n <= 1) {
    return sum;
  } else {
    return factorial(n - 1, sum * n);
  }
}

void Day9_Recursion_Factorial(Scanner scan) {
  int sum = 1;
  int n = scan.nextInt();
  System.out.println(factorial(n, sum));
}

////////////////////////////////////////////////////
void Day10_BinaryNumbers(Scanner scan) {
  String s = Integer.toBinaryString(scan.nextInt());
  int max = -1, sum = 0;
  for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == '0') {
      if (max < sum) {
        max = sum;
      }
      sum = 0;
    } else {
      sum++;
    }
  }
//  System.out.println(s);
  System.out.println(max > sum ? max : sum);
}

////////////////////////////////////////////////////

void Day11_2D_Arrays_GetMaxSumOfHourGlass(Scanner scan) {
  int[][] array = new int[6][6];
  for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
      array[i][j] = scan.nextInt();
    }
  }
  int max = -11111;
  for (int i = 1; i < array.length - 1; i++) {
    for (int j = 1; j < array[i].length - 1; j++) {
      int sum = array[i][j]; //本行中的唯一一个数
      sum += array[i - 1][j - 1] + array[i - 1][j] + array[i - 1][j + 1]; //上一行的三个数
      sum += array[i + 1][j - 1] + array[i + 1][j] + array[i + 1][j + 1]; //下一行的三个数
      if (max < sum) {
        max = sum;
//        System.out.println("(" + i + "," + j + ")");
      }
    }
  }
  System.out.println(max);
}

////////////////////////////////////////////////////
class Person {
  protected String firstName;
  protected String lastName;
  protected int idNumber;

  Person(String firstName, String lastName, int idNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = idNumber;
  }

  public void printPerson() {
    System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
  }
}

class Student extends Person {
  private int[] scores;

  Student(String fn, String ln, int id, int[] scores) {
    super(fn, ln, id);
    this.scores = scores;
  }

  public char calculate() {
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int ave = sum / scores.length;
    if (90 <= ave && ave <= 100) {
      return 'O';
    } else if (80 <= ave && ave < 90) {
      return 'E';
    } else if (70 <= ave && ave < 80) {
      return 'A';
    } else if (55 <= ave && ave < 70) {
      return 'P';
    } else if (40 <= ave && ave < 55) {
      return 'D';
    } else {
      return 'T';
    }
  }
}

void Day12_Inheritance_CalculateScores(Scanner scan) {
  String firstName = scan.next();
  String lastName = scan.next();
  int id = scan.nextInt();
  int[] testScores = new int[scan.nextInt()];
  for (int i = 0; i < testScores.length; i++) {
    testScores[i] = scan.nextInt();
  }
  Student s = new Student(firstName, lastName, id, testScores);
  s.printPerson();
  System.out.println("Grade: " + s.calculate());
}

////////////////////////////////////////////////////
abstract class Book {
  String title;
  String author;

  Book(String t, String a) {
    this.title = t;
    this.author = a;
  }

  abstract void display();
}

class MyBook extends Book {
  int price;

  MyBook(String title, String author, int price) {
    super(title, author);
    this.price = price;
  }

  void display() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: " + price);
  }
}

void Day13_AbstractClass_ShowBookInfo(Scanner scan) {
  String title = scan.nextLine();
  String author = scan.nextLine();
  int price = scan.nextInt();
  Book new_novel = new MyBook(title, author, price);
  new_novel.display();
}

////////////////////////////////////////////////////
void all_scan_entrance() {
//  Day0_HelloWorld();

  Scanner scan = new Scanner(System.in);
//  Day1_DataTypes(scan);
//  Day2_Operator(scan);
//  Day3_IntroToConditionalStatements(scan);
//  Day4_ClassVsInstance(scan);
//  Day5_Loops(scan);
//  Day6_Review_SpiltStrings(scan);
//  Day7_Arrays_ReverseSequence(scan);
//  Day8_Maps_FindPhoneByName(scan);
//  Day9_Recursion_Factorial(scan);
//  Day10_BinaryNumbers(scan);
//  Day11_2D_Arrays_GetMaxSumOfHourGlass(scan);
//  Day12_Inheritance_CalculateScores(scan);
  Day13_AbstractClass_ShowBookInfo(scan);
  scan.close();
}

public static void main(String[] args) {
  new Solution().all_scan_entrance();
}
}
