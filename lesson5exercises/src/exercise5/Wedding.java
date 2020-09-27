package exercise5;

import java.time.LocalDate;

public class Wedding {
    private LocalDate weddingDate;
    private Couple gettingMarried;
    private String venue;

public Wedding(LocalDate weddingDate, Couple gettingMarried, String venue){
    this.weddingDate = weddingDate;
    this.gettingMarried = gettingMarried;
    this.venue = venue;
}
 @Override
    public String toString() {
        return "\tWedding date: " + weddingDate +
                "\n\tCouple is " + gettingMarried +
                "\n\tVenue is " + venue;
    }
}
