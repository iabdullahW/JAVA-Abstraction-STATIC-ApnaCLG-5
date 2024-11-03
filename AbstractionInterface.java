//interfaces are ike classes but there are fix properties and methods
//no non abstract function and its implementation 
//interfaces:  by default they are public,static,final and abstract


interface Animal {

    void walk(); //public by default

    //num of eyes defined fixed and  this property is fixed and same,final,fixed for all Animals 
    int eye = 2;

    //cant create a constructor
    // Animal(){
    // }
    // cant create a method
    // void sleep(){
    // }
}

//making tis interface for Multiple inheritance
interface Herbivore {

}

//use "implements" keyword -- no use of "extends"
class Horse implements Animal, Herbivore {

    public void walk() {
        System.out.println(" walks on 4 legs");
    }
}

public class AbstractionInterface {

    public static void main(String[] args) {
        Horse horse = new Horse(); // Creating instance of Horse
        horse.walk();              // Calling walk method
    }
}
