
//Before Applying Interface Segregation Principle

// Let's Consider the example of Employee in the School Management System
// If WE declare an iterface named "Employee" that evrery Employee(Including teacher,stuff,managers etc)
// then there will occur one problem that all the method declared in the interface may not be required by all the subclasses implementing it
// for example The class  'Administrator' class will not require and use the 'teach()' method but it has to implement it 
// this breaks the Interface Segregation Principle(ISP)


public interface Employee {
    void teach();
    void manage();
    void evaluateStudents();
    void maintainRecords();
}

public class Teacher implements Employee {
    @Override
    public void teach() {
        System.out.println("Teaching students");
    }

    @Override
    public void manage() {
        System.out.println("Managing classroom");
    }

    @Override
    public void evaluateStudents() {
        System.out.println("Evaluating students");
    }

    @Override
    public void maintainRecords() {
        System.out.println("Maintaining records");
    }
}

public class Administrator implements Employee {
    @Override
    public void teach() {
        // Not applicable to administrators
    }

    @Override
    public void manage() {
        System.out.println("Managing administrative tasks");
    }

    @Override
    public void evaluateStudents() {
        // Not applicable to administrators
    }

    @Override
    public void maintainRecords() {
        System.out.println("Maintaining administrative records");
    }
}


// After applying ISP 


// We can apply Interface Segregation Principle, by diving the interface Employee into two new different interface according to their type
// So the Employee is divided into "TeachingEmployee"  and "ManagingEmployee"
// then we need not to implement the claasses which are not required while implementing in the subclasses

// this makes the solution to this type of problems

public interface TeachingEmployee {
    void teach();
    void evaluateStudents();
}

public interface ManagingEmployee {
    void manage();
    void maintainRecords();
}

public class Teacher implements TeachingEmployee, ManagingEmployee {
    @Override
    public void teach() {
        System.out.println("Teaching students");
    }

    @Override
    public void evaluateStudents() {
        System.out.println("Evaluating students");
    }

    @Override
    public void manage() {
        System.out.println("Managing classroom");
    }

    @Override
    public void maintainRecords() {
        System.out.println("Maintaining records");
    }
}

public class Administrator implements ManagingEmployee {
    @Override
    public void manage() {
        System.out.println("Managing administrative tasks");
    }

    @Override
    public void maintainRecords() {
        System.out.println("Maintaining administrative records");
    }
}
