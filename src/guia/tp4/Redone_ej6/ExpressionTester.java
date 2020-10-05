package guia.tp4.Redone_ej6;

import guia.tp4.ej6.Expression;
import guia.tp4.ej6.SimpleExpression;

public class ExpressionTester {
    public static void main ( String [] args ) {
        guia.tp4.ej6.SimpleExpression exp1 = new guia.tp4.ej6.SimpleExpression( true );
        guia.tp4.ej6.SimpleExpression exp2 = new SimpleExpression( false );
        guia.tp4.ej6.Expression exp3 = exp1 . not ();
        guia.tp4.ej6.Expression exp4 = exp1 . or ( exp2 );
        Expression exp5 = exp3 . and ( exp4 );
        System . out . println ( exp1 . evaluate ()); // true
        System . out . println ( exp3 . evaluate ()); // false
        System . out . println ( exp4 . evaluate ()); // true
        System . out . println ( exp5 . evaluate ()); // false
        exp1 . setValue ( false );
        System . out . println ( exp3 . evaluate ()); // true
        System . out . println ( exp4 . evaluate ()); // false
        System . out . println ( exp5 . evaluate ()); // false
        exp2 . setValue ( true );
        System . out . println ( exp5 . evaluate ()); // true
    }
}