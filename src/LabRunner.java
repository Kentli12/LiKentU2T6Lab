public class LabRunner {
    public static void main (String[] args) {
//        System.out.println("Nice to see you!");
//        System.out.println("Goodbye!");
//        System.out.print("Nice to see you!\n");
//        System.out.println("Goodbye!");
        Student student = new Student("Abby", "Smith", 2023);
        student.addTestScore(95);
        student.addTestScore(98);
        System.out.println(student.getStudentInfo());


    }
}
