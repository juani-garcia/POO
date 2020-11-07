package parcial2.repaso.ej4;

import java.util.Comparator;

public class RowBoardingFlight extends BoardingFlight{

    public RowBoardingFlight(){
        super(Comparator.comparingInt(Passenger::getRow).thenComparing(Passenger::getName));
    }
}
