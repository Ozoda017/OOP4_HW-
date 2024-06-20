package less4.Model;

public class Teacher extends User{
    private Integer teacherId;

    public Teacher(Integer teacherId, String name, String lastname) {
        super(name, lastname);
        this.teacherId=teacherId;
    }
   
    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                "name='" + super.getname() + '\'' +
                ", lastname='" + super.getLastname() + '\'' +
                '}';
    }
}