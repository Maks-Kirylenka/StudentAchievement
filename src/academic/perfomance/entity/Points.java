package academic.perfomance.entity;

public class Points {
    private int idStudent;
    private int idSubject;
    private int point;

    public Points(int idStudent, int idSubject, int point) {
        this.idStudent = idStudent;
        this.idSubject = idSubject;
        this.point = point;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
