package guia.tp2.ej5;

import java.util.Objects;

public class Palindromo {
    StringBuilder word;

    Palindromo(StringBuilder s){
        this.word = s;
    }

    public boolean esPalindromo() {
        return word.equals(word.reverse());
    }
}
