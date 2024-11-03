//Abstraction : a thought process a blueprint of an object we dont have to make it real/show it, Its just exist, we can think of it as a sketch,we can create it but we cant use it
//Showing important stuff to user and hiding non important stuff
//ways to use :  
//1. Make and use Abstract keyword/class/functions/use properties
//2. Use inheritance

// ^^^^^^^^^^^^^^^^ //
//this is an irrelevant  class -- we dont need to show this to user nor do we will make an object so we wi make tis clas abstract
// class Animal {
//     public void walk() {   //this is an irrelevant function--we can make this function as abstract
//     }
// }
// ^^^^^^^^^^^^^^^^ //
//making Animal class abstract 
abstract class Animal {

    abstract void walk(); //we made this function abstract so need for its body "{}"

    //creating a constructor, when program starts it will create an object of this class and this constructor will be called first because its a Parent class
//   Animal(){
//     System.out.println("Your are creating a new animal");
//   }
    public void eat() {
        System.out.println("Animals eat ");
    }
}

class Horse extends Animal {

    public void walk() {
        System.out.println(" walks on 4 legs");
    }
    //   ** Constructor chaining -- we can chain constructors while working with inheritance ** /
    //creating a constructor, when program starts it will create an object of this class and this constructor will be called second because its a Sub class
    // Horse(){
    //     System.out.println("Your are creating a new horse");
    // }
}

class Chicken extends Animal {

    public void walk() {
        System.out.println(" walks on 2 legs");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
// Animal animal = new Animal();
// animal.walk();  // we cant use it because its abstract
        horse.eat();
    }
}
