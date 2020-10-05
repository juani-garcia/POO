package guia.tp5.ej4;

public interface LinearList<E> {

   /**
    * Agrega un elemento al final de la lista.
    */
   void add(E elem);

   /**
    * Obtiene el i-ésimo elemento de la lista.
    */
   E get(int i);

   /**
    * Modifica el i-ésimo elemento de la lista colocando un nuevo valor.
    */
   void set(int i, E elem);

   /**
    * Elimina el i-ésimo elemento de la lista.
    */
   void remove(int i);

   /**
    * Busca el índice de la primer ocurrencia de un objeto en la lista.
    */
   int indexOf(E elem);

   /**
    * Retorna el tamaño de la lista.
    */
   int size();

}
