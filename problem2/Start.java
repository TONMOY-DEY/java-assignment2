package problem2;

public class Start {
    public static void main(String[] args) {
        Student s1 = new Student("Tonmoy", 20, "Male", "STU101", 12, 3);

        Classroom c1 = new Classroom("Math", "Mr. Karim");
        Classroom c2 = new Classroom("Physics", "Dr. Amina");
        Classroom c3 = new Classroom("Biology", "Ms. Liza");

        s1.addclassroom(c1);
        s1.addclassroom(c2);
        s1.addclassroom(c3);

        System.out.println("Student Info ");
        System.out.println("....................");
        s1.display();

        System.out.println("All Classrooms ");
        System.out.println(".......................");
        s1.allClaassroom();

        System.out.println("Removing a classroom");
        System.out.println(".........................");
        s1.removeclassroom(c2);

        System.out.println("After Removing ");
        System.out.println("............................");
        s1.allClaassroom();
    }
}
