package by.kursy.annaburdys.javatasks.Classwork.Stage26.studentcomparators;

import by.kursy.annaburdys.javatasks.Classwork.Stage26.Student;

import java.util.Comparator;

public class SortStudentByMarkAsc implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getMark() - o2.getMark();
        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
            if (result == 0) {
                result = o1.getAge() - o2.getAge();
            }
        }

        return result;
    }
}