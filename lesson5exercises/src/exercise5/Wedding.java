package exercise5;

public class Wedding {
    private String weddingDate;
    private Couple gettingMarried;
    private String venue;

public Wedding(String weddingDate, String gettingMarried, String venue){
    this.weddingDate = weddingDate;
    this.gettingMarried = gettingMarried;
    this.venue = venue;
}

    public String getWeddingDate() {
        return weddingDate;
    }

    public Couple getGettingMarried() {
        return gettingMarried;
    }

    public String getVenue() {
        return venue;
    }

    @Override
    public String toString() {
        return "\tWedding date: " + weddingDate +
                "\n\tCouple is " + gettingMarried +
                "\n\tVenue is " + venue;
    }
}
