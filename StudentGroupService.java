import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    StudentGroup studentGroup;
    public StudentGroupService(StudentGroup studentGroup){
        this.studentGroup = studentGroup;
    }

    public void removeSrudentByFIO(String firstName, String secondName, String lastName){
        StudentGroupIterator iteranor = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (studentItem.firstName.equals(firstName) &&
                studentItem.secondName.equals(secondName) &&
                studentItem.lastName.equals(lastName))
            iterator.remove();
        }
        // for (Student studentItem : studentGroup)
        //     if (studentItem.firstName.equals(firstName)) &&
        //         (studentItem.secondName.equals(secondName)) &&
        //         (studentItem.lastName.equals(lastName)){}
    }
}
public void StudentGroup(){
    for(Student student : studentGroup){
        System.out.println(student);
    }

public List<Student> getSortedStudentGroupBuId(){
    List<Student> studenList = new ArrayList<>(studentGroup.studentList);
    Collections.sort(studentList);
    return studentList;

    }
    public List<Student> getSortedStudentGroupBuFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
        studentList.sort(new StudentComparator());
        return studentList;
    }
}