package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClassNoteBook {

    private Map<Student, List<Integer>> notebook = new TreeMap<>();

    public Map<Student, List<Integer>> getNotebook() {
        return notebook;
    }

    public void addStudent (Student student) {
        notebook.put(student,new ArrayList<>());
    }

    public void addMark(String id, int mark) {
        for (Map.Entry<Student, List<Integer>> actual : notebook.entrySet()) {
            if (actual.getKey().getId().equals(id)) {
                actual.getValue().add(mark);
            }
        }
    }


}
