public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);

        try {
            System.out.println(studentService.getStudentById(savedStudent.id()));
            System.out.println(studentService.getStudentById("123"));
        } catch(StudentException e) {
            System.out.println("Cannot find student");
        }
    }
}
