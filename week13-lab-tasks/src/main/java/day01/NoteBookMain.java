package day01;

import java.util.Arrays;
import java.util.Collections;

public class NoteBookMain {

    public static void main(String[] args) {
        Integer[] marks = {3,5,4,1,2};

        Collections.sort(Arrays.asList(marks));

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
