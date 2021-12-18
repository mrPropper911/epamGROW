public enum Station
{
    MINSK ("Minsk"),
    MOSCOW ("Moscow"),
    PRAGA ("Praga"),
    VILNUS ("Vilnus"),
    BARANOVICHI ("Baranovich");

    private String title;

    Station(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
