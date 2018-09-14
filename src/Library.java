import java.sql.SQLOutput;

public class Library {
    public static void main(String[] args) {
        book ksiazka1 = new book("Przeminęło z wiatrem" , "Margaret Mitchell", 250, 2000 );

        book ksiazka2 = new book("Java head first", "Kathy Sierra, Bert Bates", 325, 2009 );

        book ksiazka3 = new book("Bajki wybrane", "Tadeusz Dywan", 25, 2016  );


        System.out.println("Pierwsza ksiażka na półce to \"" + ksiazka1.title + "\" autorstwa " + ksiazka1.author + ".");
        System.out.println( "Książka ma " + ksiazka1.pageAm + " stron i została wydana w " + ksiazka1.yearRealise + " roku.");

        System.out.println("Druga ksiażka na półce to \"" + ksiazka2.title + "\" autorstwa " + ksiazka2.author + ".");
        System.out.println( "Książka ma " + ksiazka2.pageAm + " stron i została wydana w " + ksiazka2.yearRealise + " roku.");

        System.out.println("Trzecia ksiażka na półce to \"" + ksiazka3.title + "\" autorstwa " + ksiazka3.author + ".");
        System.out.println( "Książka ma " + ksiazka3.pageAm + " stron i została wydana w " + ksiazka3.yearRealise + " roku.");

    }
}
