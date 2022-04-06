package academic.perfomance.entity;

public class Subject {
    private int id;
    private  String subjectName;
    private int course;
    private String group;

    public Subject(int id, String subjectName, int course, String group) {
        this.id = id;
        this.subjectName = subjectName;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
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
}
