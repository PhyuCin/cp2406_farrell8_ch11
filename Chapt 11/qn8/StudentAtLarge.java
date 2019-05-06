public class StudentAtLarge extends Student {

    public StudentAtLarge(int studentId, String studentName){
        super(studentId, studentName);
        setAnnualTuition();
    }

    public void setAnnualTuition()
    {
        super.annualTuition = 2000;
    }
}
