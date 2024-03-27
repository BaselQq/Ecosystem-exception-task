import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void findStudentById_shouldReturnStudent_whenStudentIdFounded() {
        StudentService studentService = new StudentService();
        Student caro = studentService.addNewStudent(Student.builder().name("Caro").subject("Mathe").build());
        Student anna = studentService.addNewStudent(Student.builder().name("Anna").subject("Deutsch").build());
        Student pixel = studentService.addNewStudent(Student.builder().name("Pixel").subject("Programming").build());

        try {
            Student actual = studentService.getStudentById(caro.id());
            Assertions.assertEquals(caro, actual);
        } catch (StudentException e) {
            fail();
        }
    }

    @Test
    void findStudentById_shouldThrowException_whenIdIsNotFound() {
        StudentService studentService = new StudentService();

        Assertions.assertThrows(StudentException.class, () -> studentService.getStudentById("bla"));
    }
}