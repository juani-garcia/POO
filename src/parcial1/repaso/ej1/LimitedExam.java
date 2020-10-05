package parcial1.repaso.ej1;

import java.util.Arrays;

public class LimitedExam extends UniqueExam{
    private final int lim;
    private int dim;
    private String[] pending;
    private static final int INITIAL_DIM = 5;

    public LimitedExam(String name, int lim){
        super(name);
        this.lim = lim;
        this.pending = new String[INITIAL_DIM];
    }

    @Override
    public void enroll(String student) {
        if(getEnrolledCount() == lim)
            addToPending(student);
        else
            super.enroll(student);
    }

    @Override
    public void unenroll(String student) {
        if(removeFromPending(student))
            return;
        if(isEnrolled(student)) {
            super.unenroll(student);
            if (dim > 0) {
                enroll(pending[0]);
                System.arraycopy(pending, 1, pending, 0, --dim);
            }
        }
    }

    public String[] getPendingStudents(){
        return Arrays.copyOf(pending, dim);
    }

    private void addToPending(String student){
        if(dim == pending.length)
            resize();
        pending[dim++] = student;
    }

    private boolean removeFromPending(String student){
        for(int i = 0; i < dim; i++){
            if(pending[i].equals(student)){ //student estaba en lista de espera
                System.arraycopy(pending, i+1, pending, i, (--dim)-i);
                System.out.println("Removed " + student + " from pending");
                return true;
            }
        }
        return false;
    }

    private void resize(){
        pending = Arrays.copyOf(pending, pending.length + INITIAL_DIM);
    }
}
