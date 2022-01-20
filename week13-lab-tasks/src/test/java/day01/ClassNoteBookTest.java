package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ClassNoteBookTest {

    ClassNoteBook notebook = new ClassNoteBook();

    Student studentOne = new Student("01", "Ferenc");
    Student studentTwo = new Student("02", "Márk");
    Student studentThree = new Student("03", "Bence");

    @BeforeEach
    void init() {
        notebook.addStudent(studentThree);
        notebook.addStudent(studentOne);
        notebook.addStudent(studentTwo);


    }

    @Test
    void addStudentTest() {

        assertEquals(3,notebook.getNotebook().size());

    }

    @Test
    void addMarkTest() {
        Map<Student, List<Integer>> marks = notebook.getNotebook();

        notebook.addMark("03",3);
        notebook.addMark("03",2);
        notebook.addMark("03",1);

        notebook.addMark("02",2);
        notebook.addMark("02",5);
        notebook.addMark("02",3);

        notebook.addMark("01",5);
        notebook.addMark("01",4);
        notebook.addMark("01",5);

        assertEquals(4,marks.get(studentOne).get(1));
        assertEquals(1,marks.get(studentThree).get(2));
        System.out.println(notebook.getNotebook().get(studentThree).get(0));
    }

}