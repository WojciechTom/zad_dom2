import java.sql.SQLOutput;

public class library {
    public static void main(String[] args) {
        book ksiazka1 = new book();
        ksiazka1.title = "Przeminęło z wiatrem";
        ksiazka1.author = "Margaret Mitchell";
        ksiazka1.pageAm = 250;
        ksiazka1.yearRealise = 2000;


        book ksiazka2 = new book();
        ksiazka2.title = "Java head first";
        ksiazka2.author = "Kathy Sierra, Bert Bates";
        ksiazka2.pageAm = 325;
        ksiazka2.yearRealise = 2009;


        book ksiazka3 = new book();
        ksiazka3.title = "Bajki wybrane";
        ksiazka3.author = "Tadeusz Dywan";
        ksiazka3.pageAm = 25;
        ksiazka3.yearRealise = 2016;


        System.out.println("Pierwsza ksiażka na półce to \"" + ksiazka1.title + "\" autorstwa " + ksiazka1.author + ".");
        System.out.println( "Książka ma " + ksiazka1.pageAm + " stron i została wydana w " + ksiazka1.yearRealise + " roku.");

        System.out.println("Druga ksiażka na półce to \"" + ksiazka2.title + "\" autorstwa " + ksiazka2.author + ".");
        System.out.println( "Książka ma " + ksiazka2.pageAm + " stron i została wydana w " + ksiazka2.yearRealise + " roku.");

        System.out.println("Trzecia ksiażka na półce to \"" + ksiazka3.title + "\" autorstwa " + ksiazka3.author + ".");
        System.out.println( "Książka ma " + ksiazka3.pageAm + " stron i została wydana w " + ksiazka3.yearRealise + " roku.");

    }
}
