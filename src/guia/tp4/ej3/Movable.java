package guia.tp4.ej3;

interface Movable {
    void moveNorth ( double delta );

    void moveSouth ( double delta );

    void moveWest ( double delta );

    void moveEast ( double delta );

    default void moveNorthEast(double deltaX, double deltaY){
        moveNorth(deltaY);
        moveEast(deltaX);
    }

    default void moveNorthWest(double deltaX, double deltaY){
        moveNorth(deltaY);
        moveWest(deltaX);
    }

    default void moveSouthWest(double deltaX, double deltaY){
        moveSouth(deltaY);
        moveWest(deltaX);
    }

    default void moveSouthEast(double deltaX, double deltaY){
        moveSouth(deltaY);
        moveEast(deltaX);
    }
}