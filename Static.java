//STATIC : public for everyone,that properties that are common to lass and all objects
//to save memory we make that thing static if its a commong info(schoolname)
// functions can be static also
//Static keyword can be used by 4 methods;;
//1. class name or nested class
//2. object/properties name :memory given again and again for each object
//3. static keyword
//4. function name

class Student {

    String name;
    static String schoolName;//the school name is same (stattic for all students)

    public static void changeSchoolName(String newSchoolName) {
        schoolName = newSchoolName;
    }
}

public class Static {

    public static void main(String[] args) {
        Student.schoolName = "ABC School";//the name of school is static so we can access it directly by class Name, we dont have to create an object for it
        Student student1 = new Student();
        student1.name = "John";
        System.out.println(student1.name + " " + "studies in" + " " + Student.schoolName);

    }
}
