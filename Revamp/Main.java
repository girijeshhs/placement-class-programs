package Revamp;
import java.util.Scanner;

class Person {
    String name;
}

class Member extends Person {
    String id;
    String department;
}

class Student extends Member {
    String regNo;
    String course;
}

class Staff extends Member {
    String staffId;
    double salary;
}

class Teacher extends Staff {
    String subject;
}

class Admin extends Staff {
    String responsibility;
}

class Account {
    String username;
    String password;
    Person owner;
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student st = new Student();
        st.name = "Arun";
        st.id = "M001";
        st.department = "CS";
        st.regNo = "CS23A45";
        st.course = "B.Tech";

        Teacher t = new Teacher();
        t.name = "Meena";
        t.id = "S100";
        t.department = "CS";
        t.staffId = "T001";
        t.salary = 45000;
        t.subject = "Math";

        Admin ad = new Admin();
        ad.name = "Ravi";
        ad.id = "A099";
        ad.department = "Admin";
        ad.staffId = "ADM01";
        ad.salary = 60000;
        ad.responsibility = "Manages teachers and students";

        Account studentAcc = new Account();
        studentAcc.username = "arun";
        studentAcc.password = "a123";
        studentAcc.owner = st;

        Account teacherAcc = new Account();
        teacherAcc.username = "meena";
        teacherAcc.password = "m123";
        teacherAcc.owner = t;

        Account adminAcc = new Account();
        adminAcc.username = "ravi";
        adminAcc.password = "r123";
        adminAcc.owner = ad;

        System.out.println("1. Login as Student\n2. Login as Teacher\n3. Login as Admin");
        int ch = sc.nextInt();
        sc.nextLine();

        Account acc = null;
        if (ch == 1) acc = studentAcc;
        else if (ch == 2) acc = teacherAcc;
        else if (ch == 3) acc = adminAcc;

        System.out.print("Enter Username: ");
        String u = sc.nextLine();

        System.out.print("Enter Password: ");
        String p = sc.nextLine();

        if (u.equals(acc.username) && p.equals(acc.password)) {
            System.out.println("\nLOGIN SUCCESS");

            if (acc.owner instanceof Student) {
                Student s = (Student) acc.owner;
                System.out.println("Student: " + s.name);
                System.out.println("Reg No: " + s.regNo);
                System.out.println("Course: " + s.course);
            }

            if (acc.owner instanceof Teacher) {
                Teacher te = (Teacher) acc.owner;
                System.out.println("Teacher: " + te.name);
                System.out.println("Subject: " + te.subject);
                System.out.println("Salary: " + te.salary);
            }

            if (acc.owner instanceof Admin) {
                Admin a = (Admin) acc.owner;
                System.out.println("Admin: " + a.name);
                System.out.println("Responsibility: " + a.responsibility);
                System.out.println("Salary: " + a.salary);
            }

        } else {
            System.out.println("LOGIN FAILED");
        }

        sc.close();
    }
}
