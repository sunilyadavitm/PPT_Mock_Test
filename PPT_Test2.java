Ques1:- Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement. 

Answer:- 

import java.util.Scanner;
public class Main {
public static void main(String[] args) { 
Scanner input = new Scanner(System.in); 
System.out.print("Enter a number: "); 
double number = input.nextDouble(); 
if (number > 0.0) { 
System.out.println(number + " is a positive number."); 
} 
else if (number < 0.0) { 
System.out.println(number + " is a negative number."); 
} 
else { 
System.out.println(number + " is 0."); 
} 
input.close(); 
 } 
} 


Ques2:- Write a Java program to print the Fibonacci series up to a given number using a for loop.
 
Ans:- 

import java.util.Scanner; 
public class Main { 
public static void main(String[] args) { 
Scanner input = new Scanner(System.in); 
System.out.print("Enter the number of terms: "); 
int n = input.nextInt(); 
int t1 = 0, t2 = 1; 
System.out.print("First " + n + " terms: "); 
for (int i = 1; i <= n; ++i) { 
System.out.print(t1 + " + "); 
int sum = t1 + t2; t1 = t2; t2 = sum; 
 } 
System.out.print(""); 
 } 
} 


Ques3:- Write a Java program to calculate the average of a list of numbers using a do-while loop.

 Ans:- 

import java.util.Scanner; 
public class Main { 
public static void main(String[] args) { 
Scanner input = new Scanner(System.in); 
int count = 0; double sum = 0; do { 
System.out.print("Enter a number (or type 'exit' to stop): "); 
String line = input.nextLine(); 
if (line.equals("exit")) { 
break; 
} 
double number = Double.parseDouble(line); 
sum += number; count++; 
} 
while (true); input.close(); 
if (count == 0) 
{ 
System.out.println("No numbers entered."); 
} 
else { 
double average = sum / count; 
System.out.println("Average: " + average); 
  }
 } 
} 


Ques4:- Write a Java program to find the largest of three numbers using nested if-else statements. 

Ans:- 

import java.util.Scanner; 
public class Main { 
public static void main(String[] args) { 
Scanner input = new Scanner(System.in); 
System.out.print("Enter the first number: "); 
double num1 = input.nextDouble(); 
System.out.print("Enter the second number: "); 
double num2 = input.nextDouble(); 
System.out.print("Enter the third number: "); 
double num3 = input.nextDouble(); 
if (num1 >= num2) { 
if (num1 >= num3) { 
System.out.println(num1 + " is the largest number."); 
} 
else { 
System.out.println(num3 + " is the largest number.");
 } 
} 
else { 
if (num2 >= num3) { 
System.out.println(num2 + " is the largest number."); 
}
 else { 
System.out.println(num3 + " is the largest number.");
 } 
} 
System.out.print("");
 } 
}


Ques5:- Write a Java program to declare and initialize variables of different data types (int, double, String) with appropriate identifiers.

Ans:- 

public class Main {
  public static void main(String[] args) {
    int age = 25;
    double height = 5.8;
    String name = "John Doe";

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
  }
}
