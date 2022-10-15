package org.SDA.Exceptions.Exercises.Ex1;

public class main {
    /*
    Zadanie 1: Baza Danych Sklepu z Grami Komputerowymi
    Napisz program, który służy jako baza danych sklepu z grami komputerowymi.
    Każda gra komputera ma
    tytuł,
    gatunek,
    rok wydania
    ilość sprzedanych egzemplarzy (w milionach).
    Program powinien wspierać przechowywanie danych w plikach CSV lub JSON.
    Program jest zaprojektowany
    w taki sposób, że łatwo można zaimplementować nowe formy przechowywania danych - warto tutaj użyć abstrakcji.
    Ponadto program powinien wspierać tzw kwerendy, czyli zapytania do bazy danych
    (każda kwerenda ma nazwę, typ zwrotny i swoją logikę). Wszystkie kwerendy oparte są o wspólny interfejs
    i są obsługiwane przez program uniwersalnie, dzięki czemu z łatwością można implementować kolejne.
    Przykładowe kwerendy:

    Jaki jest tytuł najlepiej sprzedającej się gry?
    Ile jest gier z gatunku Platformer?
    Która gra miała najgorszą sprzedaż w roku 2010?

    W akcji ma to wyglądać tak, że wpisuję nazwę kwerendy i jej parametr, i dostaję rezultaty, np:
    worst_sales_in_year 2010
    Call of Duty Black Ops
     */



    public static void main(String[] args) {

        String myFileDirectory = "C:\\Users\\Qshiber\\Desktop\\TestGit\\Exercise1";
        String filePath = myFileDirectory + "\\videoGamesList2.json";

        VideoGame game1 = new VideoGame("Mario 1", GameGenres.FPS, 1999, 1L);
        VideoGame game2 = new VideoGame("Mario 2", GameGenres.PLATFORMER, 1929, 2L);
        VideoGame game3 = new VideoGame("Mario 3", GameGenres.FPS, 1996, 4L);
        VideoGame game4 = new VideoGame("Mario 4", GameGenres.PUZZLE, 1299, 42L);

        GamesShop gamesShop = FileManager.readFromJSON(filePath, GamesShop.class);
//        gamesShop.addGameToDatabase(game1);
//        gamesShop.addGameToDatabase(game2);
//        gamesShop.addGameToDatabase(game3);
//        gamesShop.addGameToDatabase(game4);
//
//        FileManager.writeToJson(filePath, gamesShop);
        System.out.println(gamesShop.mostUnitsSold());

    }
}
