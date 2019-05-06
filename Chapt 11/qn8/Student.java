public abstract class Student {
    private int studentId;
    private String studentName;
    int annualTuition;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    //set
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public abstract void setAnnualTuition();


    //get
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAnnualTuition() {
        return annualTuition;
    }


    //print format
    public String toString()
    {
        return("\nID: " + this.studentId +
                "\nName: " + this.studentName +
                "\nAnnual Tuition: " + this.annualTuition);
    }
}
