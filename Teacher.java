
package less4;

public class Teacher {

    public long teacherId;
    public String surName;
    public String firstName;
    public String patronymic;
    public String email;
    private String phone;
    private String address;

    public long getId() {
        return teacherId;
    }

    public void setId(long id) {
        this.teacherId = id;
    }

    public String getLastName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Teacher() {}

    public Teacher(String surName, String firstName, String patronymic, String email, String phone, String address) {
        this.surName = surName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
}