//**Q1. What are the Conditional Operators in Java?**

Ans. In Java, the conditional operator is a ternary operator that is used to make decisions based on a condition. 
It is represented by the symbol ? and :. 
The syntax of the conditional operator is as follows:
condition ? value1 : value2 

for example:
int age = 25;
String message = (age >= 18) ? "Adult" : "Minor";
System.out.println(message);



//**Q2. What are the types of operators based on the number of operands?**

Ans. Operators are classified based on the number of operands they take. The following are the types of operators based on the number of operands:

1. **Unary operator**: An operator that takes one operand.
2. **Binary operator**: An operator that takes two operands.
3. **Ternary operator**: An operator that takes three operands.
4. **Nullary operator**: An operator that takes no operands.


//**Q3.What is the use of Switch case in Java programming?**

Ans. The switch statement in Java is a control flow statement that allows you to execute different blocks of code based on the value of an expression.
The switch statement is a multi-way branch statement that provides an alternative to a series of if-else statements.
The syntax of the switch statement is as follows:

switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    ...
    default:
        // code block
}


//**Q4.What are the conditional Statements and use of conditional statements in Java?**

Ans. Conditional statements are used in Java to control the flow of execution based on certain conditions.
They allow you to make decisions in your code and execute different blocks of code based on the result of a condition. 
The most commonly used conditional statements in Java are if, if-else, and switch.

The if statement is used to execute a block of code if a specified condition is true. The syntax of the if statement is as follows:

if (condition) {
    // code block
}

The if-else statement is an extension of the if statement that allows you to specify a block of code to be executed if the condition is false. 
The syntax of the if-else statement is as follows:

if (condition) {
    // code block
} else {
    // code block
}

//**Q5.What is the syntax of if else statement?**

Ans. The syntax of the if-else statement in Java is as follows:

if (condition) {
    // code block to be executed if the condition is true
} else {
    // code block to be executed if the condition is false
}

In the above syntax, condition is a boolean expression that is evaluated. 
If the condition is true, the code block following the if keyword is executed. 
If the condition is false, the code block following the else keyword is executed.

Here’s an example that demonstrates the use of the if-else statement:

int age = 16;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
} else {
    System.out.println("You are not eligible to vote.");
}

In this example, the condition age >= 18 is evaluated. Since age is 16, which is less than 18, the condition is false.
Therefore, the code block following the else keyword is executed and the output is “You are not eligible to vote.”


//**Q6.How do you compare two strings in Java?**

Ans. In Java, you can compare two strings using the equals() method or the compareTo() method. 
The equals() method compares two strings for equality, while the compareTo() method compares two strings lexicographically.

Here’s an example that demonstrates how to use the equals() method to compare two strings:

String str1 = "hello";
String str2 = "world";
String str3 = "hello";

System.out.println(str1.equals(str2)); // false
System.out.println(str1.equals(str3)); // true

Here’s an example that demonstrates how to use the compareTo() method to compare two strings:

String str1 = "apple";
String str2 = "banana";
String str3 = "cherry";

System.out.println(str1.compareTo(str2)); // -1
System.out.println(str2.compareTo(str3)); // -1
System.out.println(str3.compareTo(str1)); // 2



//**Q7.What is Mutable String in Java Explain with an example**

Ans. In Java, strings are immutable, which means that once a string object is created, its contents cannot be changed.
However, you can create a mutable string using the `StringBuilder` or `StringBuffer` classes.
These classes provide methods for modifying the contents of a string, such as appending, inserting, and deleting characters.

Here's an example that demonstrates how to use the `StringBuilder` class to create a mutable string:


StringBuilder sb = new StringBuilder("hello");
sb.append(" world"); // append " world" to the string
System.out.println(sb.toString()); // "hello world"

sb.insert(5, ","); // insert "," at index 5
System.out.println(sb.toString()); // "hello, world"

sb.delete(5, 6); // delete the character at index 5
System.out.println(sb.toString()); // "hello world"


In this example, a `StringBuilder` object is created with the initial value "hello". 
The `append()` method is used to append " world" to the string. The `insert()` method is used to insert "," at index 5. 
The `delete()` method is used to delete the character at index 5. The `toString()` method is used to convert the `StringBuilder` object to a string.




//**Q8.Write a program to sort a String Alphabetically**

Ans. import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "programming";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        System.out.println(sortedStr);
    }
}



//**Q9.Write a program to check if the letter 'e' is present in the word 'Umbrella'.**

Ans. public class CheckLetter {
    public static void main(String[] args) {
        String word = "Umbrella";
        char letter = 'e';
        boolean contains = word.indexOf(letter) != -1;
        if (contains) {
            System.out.println("The word '" + word + "' contains the letter '" + letter + "'.");
        } else {
            System.out.println("The word '" + word + "' does not contain the letter '" + letter + "'.");
        }
    }
}



//**Q10.Where exactly is the string constant pool located in the memory?**

Ans. The string constant pool is a special memory area in the heap where the JVM stores string literals.
When a string literal is created, the JVM checks if an identical string already exists in the pool. 
If it does, the JVM returns a reference to the existing string. If not, the JVM creates a new string object in the pool and returns a reference to it.

The string constant pool is part of the heap memory, which is used for dynamic memory allocation and stores objects at runtime1. 
The heap allows global access to data, meaning that data stored in the heap is available to all threads during the lifetime of the application.
