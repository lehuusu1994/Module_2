package accessmodifier_staticmethod_staticproperty;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Su");
        student.setClasses("C09");
        System.out.println("Name :" + student.getName());
        System.out.println("Class :" + student.getClasses());
    }
}
