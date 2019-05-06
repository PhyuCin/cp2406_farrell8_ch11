public class GraduateStudent extends Student {

    public GraduateStudent (int studentId, String studentName){
        super(studentId, studentName);
        setAnnualTuition();
    }

    public void setAnnualTuition()
    {
        super.annualTuition = 6000;
    }
}
