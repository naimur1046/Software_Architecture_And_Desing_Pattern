// Code before Applying SRP 


//In this example , we see The Student class has responsibilities such as enrolling in a course, paying fees, viewing the transcript, and printing

//  the report card. However, this violates the Single Responsibility Principle because the Student class is responsible for 
//  both managing the student's enrollment and academic details.class student is doing so many things in a single class 
// which violets the Single responsibility principle


public class Student {
    private String name;
    private int age;
    private String address;


    public void enrollCourse(Course course) {
        // Code to enroll the student in a course
    }

    public void payFee(double amount) {
        // Code to handle fee payment
    }

    public void viewTranscript() {
        // Code to display the student's transcript
    }

    public void printReportCard() {
        // Code to generate and print the student's report card
    }
}

public class Course {
    private String name;
    private String teacher;

    
    public void addStudent(Student student) {
        // Code to add a student to the course
    }

    public void removeStudent(Student student) {
        // Code to remove a student from the course
    }

    public void calculateAverageGrade() {
        // Code to calculate the average grade of students in the course
    }
}



// Code After Applying SRP 


// So we can apply SRP in this code dividing the respnsiblity into differnet classes 

//To adhere to the Single Responsibility Principle, we can refactor the code:
 





public class Student {
    private String name;
    private int age;
    private String address;

    

    public void enrollCourse(Course course) {
        // Code to enroll the student in a course
    }

    public void payFee(double amount) {
        // Code to handle fee payment
    }
}

public class Transcript {
    private Student student;
    private List<Grade> grades;

    

    public void addGrade(Grade grade) {
        // Code to add a grade to the transcript
    }

    public void viewTranscript() {
        // Code to display the student's transcript
    }
}

public class ReportCard {
    private Student student;
    private List<Grade> grades;

    
    public void addGrade(Grade grade) {
        // Code to add a grade to the report card
    }

    public void printReportCard() {
        // Code to generate and print the student's report card
    }
}

public class Course {
    private String name;
    private String teacher;

    public void addStudent(Student student) {
        // Code to add a student to the course
    }

    public void removeStudent(Student student) {
        // Code to remove a student from the course
    }

    public void calculateAverageGrade() {
        // Code to calculate the average grade of students in the course
    }
}
