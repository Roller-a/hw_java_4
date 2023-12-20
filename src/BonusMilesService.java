public class BonusMilesService {
    public int calculate(int TicketPrice) {
        int FreeMilesForFlights;
        FreeMilesForFlights = TicketPrice / 20;
        return FreeMilesForFlights;
    }
}
