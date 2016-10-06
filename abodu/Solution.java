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
private class Person {
  int age;

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

void Day4_ClassVsInstance(Scanner scan) {
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

void Day9_Recursion(Scanner scan) {
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
void all_scan_entrance() {
//  Day0_HelloWorld();
  //scanner
  Scanner scan = new Scanner(System.in);
//  Day1_DataTypes(scan);
//  Day2_Operator(scan);
//  Day3_IntroToConditionalStatements(scan);
//  Day4_ClassVsInstance(scan);
//  Day5_Loops(scan);
//  Day6_Review_SpiltStrings(scan);
//  Day7_Arrays_ReverseSequence(scan);
//  Day8_Maps_FindPhoneByName(scan);
//  Day9_Recursion(scan);
  Day10_BinaryNumbers(scan);
  scan.close();
}

public static void main(String[] args) {
  new Solution().all_scan_entrance();
}
}
