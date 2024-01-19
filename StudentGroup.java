import java.util.List;
import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {

    List<Student> studentList;
    
    public StudentGroup(List<Student> studentList){
        this.studentList = studentList;
    }
    
    @Override
    public Iterator <Student> iterator(){
        return new StudentGroupIterator(this);
    }

}
