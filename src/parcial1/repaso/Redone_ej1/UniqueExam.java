package parcial1.repaso.Redone_ej1;

public class UniqueExam extends Exam{

    public UniqueExam(String name){
        super(name);
    }

    @Override
    public void enroll(String student) {
        if(!isEnrolled(student))
            super.enroll(student);
    }
}
