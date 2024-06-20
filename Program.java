package less4;
import less4.Controller.TeacherController;
import less4.Model.Teacher;
import java.util.List;

public class Program {

    
    public static void main(String[] args) {

        new TeacherController()
                .sendOnConsole(List.of(new Teacher(1, "Анастасия", "Романова"),
                        new Teacher(2, "Ольга", "Петрова")));

    }
       private static List<Teacher> getTeachers() {
       Teacher s1 = new Teacher(1, "Анастасия", "Романова");
       Teacher s2 = new Teacher(2, "Ольга", "Петрова");
       return List.of(s1, s2);
   }
}
