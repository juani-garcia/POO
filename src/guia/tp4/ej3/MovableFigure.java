package guia.tp4.ej3;

interface MovableFigure extends Movable {
    public MovablePoint[] getPoints();

    default void moveNorth(double delta){
        for(MovablePoint point : getPoints()){
            point.moveNorth(delta);
        }
    }

    default void moveSouth(double delta){
        for(MovablePoint point : getPoints()){
            point.moveSouth(delta);
        }
    }

    default void moveWest(double delta){
        for(MovablePoint point : getPoints()){
            point.moveWest(delta);
        }
    }

    default void moveEast(double delta){
        for(MovablePoint point : getPoints()){
            point.moveEast(delta);
        }
    }

}
