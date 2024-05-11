package Mygo.models;

public class Student {
    private String studentName;
    private String studentNumber;
    private String studentClass;
    public Student(String studentName, String studentNumber, String studentClass) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentClass = studentClass;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studentNumber=" + studentNumber+ ", studentClass=" + studentClass + "]";
    }
}
