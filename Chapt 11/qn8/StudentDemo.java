public class StudentDemo {

    public static void main(String[] arg){
        UndergraduateStudent suzy = new UndergraduateStudent(23, "Suzy");
        UndergraduateStudent jay = new UndergraduateStudent(8, "Jay");
        GraduateStudent amber = new GraduateStudent(96, "Amber");
        GraduateStudent kevin = new GraduateStudent(34, "Kevin");
        StudentAtLarge eli = new StudentAtLarge(67, "Eli");
        StudentAtLarge luna = new StudentAtLarge(32, "Luna");

        Student[] students = new Student[]{suzy, jay, amber, kevin, eli, luna};

        for(int i = 0; i < students.length; ++i){
            System.out.println(students[i].toString());
            }
        }

}
