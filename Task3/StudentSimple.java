package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentSimple {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private String group;
    private int age;

    //Constructor
    public StudentSimple(final String firstName, final String lastName, final String petronymicName,  final int age,
                         final String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.age = age;
        this.group = group;
    }

    public List<StudentSimple> toStudentSimple(final List<Student> list){
        return list.stream().map(e -> new StudentSimple(e.getName(), e.getLastName(), e.getPatronymicName(),
                e.getAge(), e.getGroup())).collect(Collectors.toList());
    }

    //Setters

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymicName(final String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void setGroup(final String group) {
        this.group = group;
    }
    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }




    @Override
    public String toString() {
        return "StudentSimple{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", course=" + group +
                '}';
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final StudentSimple that = (StudentSimple) o;

        if (age != that.age) return false;
        if (group != that.group) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;

        return patronymicName != null ? patronymicName.equals(that.patronymicName) : that.patronymicName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 7 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 7 * result + (patronymicName != null ? patronymicName.hashCode() : 0);
        result = 7 * result + age;
        result = 7 * result + (group != null ? group.hashCode() : 0);
        return result;
    }
}
