package org.SDA.Exceptions.Exercises.Ex1;

import java.util.ArrayList;
import java.util.List;

public class GamesShop implements Queries {

    private String shopName;
    private List<VideoGame> videoGamesDatabase = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public List<VideoGame> getVideoGamesDatabase() {
        return videoGamesDatabase;
    }

    public GamesShop(String shopName) {
        this.shopName = shopName;
    }

    public void addGameToDatabase(VideoGame game) {
        videoGamesDatabase.add(game);
    }

    @Override
    public String toString() {
        return shopName + "\n" + getVideoGamesDatabase();
    }

    @Override
    public VideoGame mostUnitsSold() {
        VideoGame result = null;
        for (VideoGame game : videoGamesDatabase) {
            if (result == null) {
                result = game;
            } else {
                if ((game.getUnitsSold() > result.getUnitsSold())){
                    result = game;
                }
            }
        }
        return result;
    }

}
