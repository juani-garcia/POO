package parcial1.repaso.Redone_ej1;

import java.util.Arrays;

public class LimitedExam extends UniqueExam{
    private int limit, dim;
    private final static int BLOCK = 5;
    private String[] pending;

    public LimitedExam(String name, int limit){
        super(name);
        this.limit = limit;
        this.pending = new String[BLOCK];
    }

    private void resize(){ pending = Arrays.copyOf(pending, dim + BLOCK); }

    @Override
    public void enroll(String student) {
        if(getEnrolledCount() == limit)
            addToPending(student);
        else
            super.enroll(student);
    }

    private void addToPending(String name){
        if(dim == pending.length)
            resize();
        pending[dim++] = name;
    }

    @Override
    public void unenroll(String student) {
        if(removeFromPending(student));
        else{
            super.unenroll(student);
            if(dim > 0){
                super.enroll(pending[0]);
                removeFromPending(pending[0]);
            }
        }
    }

    private boolean removeFromPending(String name){
        for(int i = 0; i < dim; i++)
            if(name.compareTo(pending[i]) == 0){
                System.arraycopy(pending, 1, pending, 0, --dim);
                return true;
            }
        return false;
    }

    public String[] getPendingStudents(){
        return Arrays.copyOf(pending, dim);
    }
}
