package parcial1.repaso.Redone_ej1;

import java.util.Arrays;

public class ExamTester {
    public static void main(String[] args) {
        Exam exam = new Exam("Primer Parcial PI");
        exam.enroll("Matias");
        exam.enroll("Matias");
        exam.enroll("Natalia");
        System.out.println("Enrolled Students: " + Arrays.toString(exam.getEnrolledStudents()));
        exam.unenroll("Matias");
        System.out.println("Enrolled Students: " + Arrays.toString(exam.getEnrolledStudents()));
        System.out.println("##########");
        UniqueExam uniqueExam = new UniqueExam("Primer Parcial POO");
        uniqueExam.enroll("Matias");
        uniqueExam.enroll("Matias");
        uniqueExam.enroll("Natalia");
        System.out.println("Enrolled Students: " + Arrays.toString(uniqueExam.getEnrolledStudents()));
        uniqueExam.unenroll("Matias");
        System.out.println("Enrolled Students: " + Arrays.toString(uniqueExam.getEnrolledStudents()));
        System.out.println("##########");
        LimitedExam limitedExam = new LimitedExam("TPE POD", 2);
        limitedExam.enroll("Matias");
        limitedExam.enroll("Matias");
        limitedExam.enroll("Natalia");
        limitedExam.enroll("Solange");
        limitedExam.enroll("Jose");
        limitedExam.enroll("Micaela");
        System.out.println("Enrolled Students: " + Arrays.toString(limitedExam.getEnrolledStudents()));
        System.out.println("Pending Students: " + Arrays.toString(limitedExam.getPendingStudents()));
        limitedExam.unenroll("Matias");
        System.out.println("Enrolled Students: " + Arrays.toString(limitedExam.getEnrolledStudents()));
        System.out.println("Pending Students: " + Arrays.toString(limitedExam.getPendingStudents()));
        limitedExam.unenroll("Jose");
        limitedExam.unenroll("Natalia");
        System.out.println("Enrolled Students: " + Arrays.toString(limitedExam.getEnrolledStudents()));
        System.out.println("Pending Students: " + Arrays.toString(limitedExam.getPendingStudents()));
    }
}
