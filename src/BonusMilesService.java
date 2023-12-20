public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int freeMilesForFlights;
        freeMilesForFlights = ticketPrice / 20;
        return freeMilesForFlights;
    }
}
