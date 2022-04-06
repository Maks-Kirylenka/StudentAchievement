package academic.perfomance.entity;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private int course;
    private String group;

    public Student(int id, String lastName, String firstName, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.course = course;
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
