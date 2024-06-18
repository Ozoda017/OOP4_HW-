package less4;

import java.util.List;

public class TeacherView {
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}