//**Q1.Write a simple Banking System program by using OOPs concept where you can get account Holder name balance etc?**

Ans. // Define a class for bank account
public class BankAccount {
    // Declare the attributes of the account
    private String name; // account holder name
    private double balance; // account balance

    // Define a constructor for the account
    public BankAccount(String name, double balance) {
        this.name = name; // initialize the name
        this.balance = balance; // initialize the balance
    }

    // Define a method for depositing money
    public void deposit(double amount) {
        this.balance += amount; // increase the balance by the amount
        System.out.println(amount + " has been deposited to " + this.name + "'s account. The new balance is " + this.balance + ".");
    }

    // Define a method for withdrawing money
    public void withdraw(double amount) {
        if (amount <= this.balance) { // check if the amount is less than or equal to the balance
            this.balance -= amount; // decrease the balance by the amount
            System.out.println(amount + " has been withdrawn from " + this.name + "'s account. The remaining balance is " + this.balance + ".");
        } else { // if the amount is greater than the balance, print an error message
            System.out.println("Insufficient funds. " + this.name + "'s account has only " + this.balance + ".");
        }
    }

    // Define a method for getting the account holder name
    public String getName() {
        return this.name; // return the name
    }

    // Define a method for getting the account balance
    public double getBalance() {
        return this.balance; // return the balance
    }
}

// Create some instances of bank accounts
BankAccount account1 = new BankAccount("Alice", 1000); // create an account for Alice with 1000 initial balance
BankAccount account2 = new BankAccount("Bob", 500); // create an account for Bob with 500 initial balance

// Test the methods of the bank accounts
account1.deposit(200); // deposit 200 to Alice's account
account2.withdraw(300); // withdraw 300 from Bob's account
account1.withdraw(1500); // try to withdraw 1500 from Alice's account

// Print the account holder names and balances
System.out.println("The name of account1 is " + account1.getName() + " and the balance is " + account1.getBalance() + ".");
System.out.println("The name of account2 is " + account2.getName() + " and the balance is " + account2.getBalance() + ".");



// **Q2. Write a Program where you inherit method from parent class and show method Overridden Concept?**

Ans. // Define a parent class for animal
public class Animal {
    // Declare the attributes of the animal
    private String name; // animal name
    private String sound; // animal sound

    // Define a constructor for the animal
    public Animal(String name, String sound) {
        this.name = name; // initialize the name
        this.sound = sound; // initialize the sound
    }

    // Define a method for making sound
    public void makeSound() {
        System.out.println(this.name + " makes " + this.sound + ".");
    }
}

// Define a child class for dog that inherits from animal
public class Dog extends Animal {
    // Declare the attribute of the dog
    private String breed; // dog breed

    // Define a constructor for the dog
    public Dog(String name, String sound, String breed) {
        super(name, sound); // call the parent constructor
        this.breed = breed; // initialize the breed
    }

    // Override the method for making sound
    @Override
    public void makeSound() {
        System.out.println(this.name + " is a " + this.breed + " and makes " + this.sound + ".");
    }
}

// Create some instances of animals and dogs
Animal animal1 = new Animal("Cat", "meow"); // create an animal for cat
Animal animal2 = new Animal("Cow", "moo"); // create an animal for cow
Dog dog1 = new Dog("Rex", "woof", "German Shepherd"); // create a dog for Rex
Dog dog2 = new Dog("Luna", "bark", "Golden Retriever"); // create a dog for Luna

// Test the methods of the animals and dogs
animal1.makeSound(); // cat makes meow
animal2.makeSound(); // cow makes moo
dog1.makeSound(); // Rex is a German Shepherd and makes woof
dog2.makeSound(); // Luna is a Golden Retriever and makes bark



💡 **Q3.Write a program to show run time polymorphism in java?**

</aside>

<aside>
💡 **Q4.Write a program to show Compile time polymorphism in java?**

</aside>

<aside>
💡 **Q5. Achieve loose coupling in java by using OOPs  concept?**

</aside>

<aside>
💡 **Q6. What is the benefit of encapsulation in java?**

</aside>

<aside>
💡 **Q7.Is java a t 100% Object oriented Programming language? If no why ?**

</aside>

<aside>
💡 **Q8.What are the advantages of abstraction in java?**

</aside>

<aside>
💡 **Q9.What is an abstraction explained with an Example?**

</aside>

<aside>
💡 **Q10.What is the final class in Java?**

</aside>
