public class UndergraduateStudent extends Student {

    public UndergraduateStudent(int studentId, String studentName){
        super(studentId, studentName);
        setAnnualTuition();
    }

    public void setAnnualTuition()
    {
        super.annualTuition = 4000;
    }
}
