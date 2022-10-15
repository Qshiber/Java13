package org.SDA.Exceptions.Exercises.Ex1;

public class VideoGame{

    private String title;
    private GameGenres genre;
    private Integer productionYear;
    private Long unitsSoldInMilions;

    public VideoGame(String title, GameGenres genre, Integer productionYear, Long unitsSold) {
        this.title = title;
        this.genre = genre;
        this.productionYear = productionYear;
        this.unitsSoldInMilions = unitsSold;
    }

    public VideoGame() {
    }

    public String getTitle() {
        return title;
    }

    public GameGenres getGenre() {
        return genre;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public Long getUnitsSold() {
        return unitsSoldInMilions;
    }

    @Override
    public String toString(){
        return String.format("%s, %s, %d, %d\n", title,genre,productionYear, unitsSoldInMilions);
    }
}
