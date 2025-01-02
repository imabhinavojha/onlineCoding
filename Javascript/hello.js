// JavaScript class with different methods and comparisons
class Person {
    // Constructor to initialize the name and age properties
    constructor(name, age) {
      this.name = name;  // Property 'name' (String)
      this.age = age;    // Property 'age' (Number)
    }
  
    // Method to return a greeting
    greet() {
      return `Hello, my name is ${this.name}.`;
    }
  
    // Method to check if two persons are of the same age
    isSameAge(otherPerson) {
      if (this.age === otherPerson.age) {
        return true;
      }
      return false;
    }
  
    // Method to check if two persons have the same name (Using == and ===)
    isSameName(otherPerson) {
      if (this.name == otherPerson.name) {
        console.log("Names are equal using == (loose equality)");
      }
      if (this.name === otherPerson.name) {
        console.log("Names are equal using === (strict equality)");
      }
    }
  
    // Method to introduce the person
    introduce() {
      return `I am ${this.name}, and I am ${this.age} years old.`;
    }
  
    // Static method to create a default person
    static createDefaultPerson() {
      return new Person("John Doe", 30);
    }
  }
  
  // Creating an instance of the Person class
  const person1 = new Person("Alice", 25);
  const person2 = new Person("Bob", 25);
  const person3 = new Person("Alice", 30);
  
  // Testing methods
  console.log(person1.greet());            // Output: Hello, my name is Alice.
  console.log(person1.isSameAge(person2)); // Output: true
  person1.isSameName(person3);            // Output: Names are equal using == (loose equality)
                                          //         Names are equal using === (strict equality)
  
  console.log(person1.introduce());        // Output: I am Alice, and I am 25 years old.
  
  // Using static method
  const defaultPerson = Person.createDefaultPerson();
  console.log(defaultPerson.introduce());  // Output: I am John Doe, and I am 30 years old.
  