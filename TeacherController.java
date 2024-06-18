// Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
// — Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
// — Создать класс УчительКонтроллер и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.

package less4;

    import java.util.List;

    public class TeacherController {
    
        private final TeacherService teacherService = new TeacherService();
        private final TeacherView teacherView = new TeacherView();

        @Override
        public void create(String surname, String firstname, String patronymic) {
            teacherService.create(surname,firstname,patronymic);
        }
        public void editTeacher(Integer TeacherId, String surname,String firstname, String patronymic){
            teacherService.editTeacher(TeacherId,surname,firstname,patronymic);
        }
        public void initTeacherList(List<Teacher> list){
            teacherService.initData(list);
        }
        public void printTeachers(){
            TeacherView.sendOnConsole(teacherService.getAll());
        }
    }

