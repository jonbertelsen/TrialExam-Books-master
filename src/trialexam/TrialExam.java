package trialexam;

import java.util.ArrayList;
import java.util.Collections;

public class TrialExam {

    /**
     * 6%
     * Returnér længden på den længste streng, eller længden hvis de er lige lange.
     */
    public int getLengthOfLongest(String str1, String str2){
        throw new UnsupportedOperationException("Not implemented yet!");
    }
    
    /**
     * 6%
     * Returnér det tal der står i input-teksten, eller -1 hvis der ikke står et tal.
     * Indledende og efterfølgende whitespace (mellemrum) fjernes.
     */
    public int convertToInt(String str){
        throw new UnsupportedOperationException("Not implemented yet!");
    }
    
    /**
     * 12%
     * Returnér true hvis det angivne tidspunkt når ugens deadline - Fredag kl. 20:30. 
     * Fredag kl. 20:30 er rettidigt, men Fredag kl. 20:31 er for sent (false)
     * Hvis input ikke er inden for de givne intervaller kastes en IllegalArgumentException.
     * 
     * @param day: mandag = 1, tirsdag = 2 ...
     * @param hour: [00-23]
     * @param min [0-59]
     */
    public boolean onTime(int day, int hour, int min){
        throw new UnsupportedOperationException("Not implemented yet!");
    }
    
    /**
     * 10%
     * Opret en bog, med de angivne parametre. Der kastes IllegalArgumentException hvis der ikke angives
     * title og forfatter, eller hvis ISBN ikke er større end 0.
     */
    public Book makeBook(String title, String author, long isbn){
        throw new UnsupportedOperationException("Not implemented yet!");
    }
    
    /**
     * 6%
     * Sammenlign en bog med en anden. Metoden returnere et negativt tal hvis den første bogs isbn er mindre 
     * end den anden bogs isbn. Et positivt tal hvis det er større og 0 hvis de to isbn 
     * værdier er ens.
     * Hvis en af de to bøger er null, kastes en IllegalArgumentException
     */
    public long compare(Book book1, Book book2){
        throw new UnsupportedOperationException("Not implemented yet!");
    }
    
    /**
     * 10%
     * Hent den delmængde af listen, hvor bøgerne er skrevet af den angivne forfatter.
     */
    public ArrayList<Book> getBooksByAuthor(ArrayList<Book> allBooks, String author){
        throw new UnsupportedOperationException("Not implemented yet!");
    }
    
    /**
     * 10%
     * Returnér navnet på den forfatter som har flest bøger på listen.
     * (Bonus point gives, hvis dette gøres med et enkelt loop)
     */
    public String findAuthorWithMostBooks(ArrayList<Book> books){
        throw new UnsupportedOperationException("Not implemented yet!");
    }
    
    /**
     * 10%
     * Skub alle bogstaver i titlen et antal skridt længere frem i alfabetet.
     * Således bliver pushTitle("Abe", 2) til "Cdg" 
     * (A->C, b->d, e->g)
     * Kun bogstaver mellem a og z (både store og små) skal skubbes.
     * Alle andre tegn forbliver som de er. (Du kan nøjes med at gøre en 
     * untagelse for mellemrum.
     */
    public String pushTitle(String title, int push){
        throw new UnsupportedOperationException("Not implemented yet!");
    }
    
    
    
    /* Følgende er data til testbrug og kan ignoreres eller bruges efter ønske. */
    public static void main(String[] args) {
        TrialExam t = new TrialExam();
        ArrayList<Book> list = t.makeBookList();
        //TODO
        System.out.println(misery);
    }
    private static Book misery, angelsDemons, twentyThousandLeagues, jurrasicPark, 
            mysteriousIsland, centerOfTheEarth, deadZone, shining, airframe, 
            daVinci, it, sphere, eightyDays, lostWorld, risingSun, inferno;
    private ArrayList<Book> makeBookList() {
        ArrayList<Book> list = new ArrayList<>();
        int i = 0;
        misery = new Book("Misery", "Stephen King", ++i);
        angelsDemons = new Book("Angles And Demons", "Dan Brown", ++i);
        twentyThousandLeagues = new Book("Twenty Thousand Leagues Under the Sea", "Jules Verne", ++i);
        jurrasicPark = new Book("Jurrasic Park", "Michael Crichton", ++i);
        mysteriousIsland = new Book("The Mysterious Island", "Jules Verne", ++i);
        centerOfTheEarth = new Book("Journey to the Center of the Earth", "Jules Verne", ++i);
        deadZone = new Book("The Dead Zone", "Stephen King", ++i);
        shining = new Book("The Shining", "Stephen King", ++i);
        daVinci = new Book("The Da Vinci Code", "Dan Brown", ++i);
        it = new Book("It", "Stephen King", ++i);
        sphere = new Book("Sphere", "Michael Crichton", ++i);
        eightyDays = new Book("Around The World In Eighty Days", "Jules Verne", ++i);
        lostWorld = new Book("The Lost World", "Michael Crichton", ++i);
        inferno = new Book("Inferno", "Dan Brown", ++i);
        //Add to list
        Collections.addAll(list, misery, angelsDemons, twentyThousandLeagues, jurrasicPark,
            mysteriousIsland, centerOfTheEarth, deadZone, shining, airframe,
            daVinci, it, sphere, eightyDays, lostWorld, risingSun, inferno);
        return list;
    }
}
