public class subject {
    private String subjectname;
    private String professorName;
    private int degree;
    private grade grade;

    public subject(String subjectname, String professorName, int degree, grade grade) {
        this.subjectname = subjectname;
        this.professorName = professorName;
        this.degree = degree;
        this.grade = grade;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public grade getGrade() {
        return grade;
    }

    public void setGrade(grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return subjectname + "-" + professorName + " : " + grade + "(" +degree + ")";
    }
}
