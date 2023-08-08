// Before Applying Open-Closed Principle(Open for extension and closed for modification)
// Firstly We will See A code where we are managing the info of the peoples of a school
// So We Declared an abstract class person, where we are confined in only two type of people(student and teacher only) 
//If we want to add any other people's info ,for example , Stuff, then we'll need to break the Person class,which is not a good practice anyway


public abstract class Person {
    private String name;
    private int age;

    public void displayInformation(String type) {
        if (type.equals("student")) {
            displayStudentInformation();
        } else if (type.equals("teacher")) {
            displayTeacherInformation();
        }
    }

    private void displayStudentInformation() {
        // Code to display student information
    }

    private void displayTeacherInformation() {
        // Code to display teacher information
    }
}

public class Student extends Person {
    private String rollNumber;

   
    private void displayStudentInformation() {
        System.out.println("Student: " + getName() + ", Age: " + getAge() + ", Roll Number: " + rollNumber);
    }
}

public class Teacher extends Person {
    private String employeeId;

    
    private void displayTeacherInformation() {
        System.out.println("Teacher: " + getName() + ", Age: " + getAge() + ", Employee ID: " + employeeId);
    }
}

public class School {
    private List<Person> people;

    public School(List<Person> people) {
        this.people = people;
    }

    public void displayInformation() {
        for (Person person : people) {
            person.displayInformation("student"); // Not scalable for new types
        }
    }
}




// After applying OCP principle

// Solution to this kind of situation



// To get rid of breaking the code,we use Open Close principle(Open for extension ,closed for modification) of SOLID principle
// instead of declaring all the things in the abstract class, we extended new claass whenever we needed
// the class persion is open for extension
// and closed for modification
// Whenever we need any new subclass,just extend the perso class,without modifying it




public abstract class Person {
    private String name;
    private int age;

    
    public abstract void displayInformation();// this method was made abstract
}




public class Student extends Person {
    private String rollNumber;

    
    @Override
    public void displayInformation() {
        System.out.println("Student: " + getName() + ", Age: " + getAge() + ", Roll Number: " + rollNumber);
    }
}



public class Teacher extends Person {
    private String employeeId;

    @Override
    public void displayInformation() {
        System.out.println("Teacher: " + getName() + ", Age: " + getAge() + ", Employee ID: " + employeeId);
    }
}

public class School {
    private List<Person> people;

    public School(List<Person> people) {
        this.people = people;
    }

    public void displayInformation() {
        for (Person person : people) {
            person.displayInformation();
        }
    }
}
