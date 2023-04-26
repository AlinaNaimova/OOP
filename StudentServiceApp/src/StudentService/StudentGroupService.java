package StudentService;

import StudentDomen.StudentGroup;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService implements iUserService<StudentGroup>{
    private List<StudentGroup> groups;

    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }
    public List<StudentGroup> getAll() {
        return this.groups;
    }

    @Override
    public void create(String firstName, String secondName, int age) {

    }
}
