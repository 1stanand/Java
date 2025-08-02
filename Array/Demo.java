package Array;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.name = "Anand";
        s1.marks = 88;
        s1.rollNumber = 21;

        s2.name = "Aanchal";
        s2.marks = 88;
        s2.rollNumber = 01;

        s3.name = "Prachi";
        s3.marks = 88;
        s3.rollNumber = 15;

        Student students[] = { s1, s2, s3 };
        for (Student student : students) {
            System.out.println(student.rollNumber + " : " + student.name + " : " + student.marks);
        }
    }
}
