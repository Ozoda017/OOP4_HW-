package less4.Controller;

import java.util.List;

import less4.Model.Teacher;
import less4.Service.TeacherService;
import less4.View.TeacherView;
 
public class TeacherController implements UserController<Teacher>{

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String name, String lastname) {
        teacherService.create(name,lastname);
    }
    public void edit(Integer teacherId, String name,String lastname){
        teacherService.edit(teacherId,name,lastname);
    }
    public void initTeacherList(List<Teacher> list){
        teacherService.initData(list);
    }
    public void printTeachers(){
        teacherView.sendOnConsole(teacherService.getAll());
    }
    public void sendOnConsole(List<Teacher> of) {
        teacherView.sendOnConsole(of);
    }
    
}