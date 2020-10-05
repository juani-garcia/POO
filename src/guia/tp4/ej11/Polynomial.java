package guia.tp4.ej11;

public class Polynomial {
   private int grade;
   private double[] coefficients;

   public Polynomial(int grade) throws InvalidGradeException{
       if(grade <= 0)
           throw new InvalidGradeException();
       this.grade = grade;
       coefficients = new double[grade + 1];
   }

   public void set(int grade, double coefficent) throws InvalidIndexException{
       if(this.grade < grade || grade < 0)
           throw new InvalidIndexException();
       coefficients[grade] = coefficent;
   }

   public double eval(double x){
       double ans = 0, potX = 1;
       for(double coef : coefficients){
            ans += coef * potX;
            potX *= x;
       }
       return ans;
   }
}
