import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import trialexam.Book;
import trialexam.TrialExam;

/**
 * @author RODA
 */
public class TestExam {
    private TrialExam t;
    private ArrayList<Book> list;
    private Book misery, angelsDemons, twentyThousandLeagues, jurrasicPark, 
            mysteriousIsland, centerOfTheEarth, deadZone, shining, airframe, 
            daVinci, it, sphere, eightyDays, lostWorld, risingSun, inferno;
    
    public TestExam() {
        this.t = new TrialExam();
        makeBookList();
    }
    
    @Test
    public void TestGetLengthOfLongest(){
        int expected = 12;
        int actual = t.getLengthOfLongest("hat", "multiplicity");
        assertEquals(expected, actual);
        
        expected = 3;
        actual = t.getLengthOfLongest("hat", "cat");
        assertEquals(expected, actual);
    }

    @Test
    public void TestConvertInt(){
        assertTrue(t.convertToInt("7") == 7);
        assertTrue(t.convertToInt(" 7 ") == 7);
    }
    
    @Test
    public void NegativTestConvertInt(){
        assertTrue(t.convertToInt(null) == -1);
        assertTrue(t.convertToInt("") == -1);
        assertTrue(t.convertToInt("syv") == -1);
    }
    
    @Test
    public void TestOnTime(){
        assertTrue(t.onTime(1, 1, 1));
        assertFalse(t.onTime(7, 23, 59));
        assertTrue(t.onTime(5, 20, 29));
        assertFalse(t.onTime(5, 20, 31));
        assertFalse(t.onTime(5, 21, 29));
        assertTrue(t.onTime(5, 19, 31));
        assertFalse(t.onTime(6, 19, 29));
        assertTrue(t.onTime(4, 21, 31));
    }
    
    @Test
    public void NegativTestOnTime(){
        try{
            t.onTime(0, 0, 0);
            fail();
        }catch(IllegalArgumentException e){
            // Expected
        }
        
        try{
            t.onTime(8, 20, 30);
            fail();
        }catch(IllegalArgumentException e){
            // Expected
        }
        
        try{
            t.onTime(5, 25, 30);
            fail();
        }catch(IllegalArgumentException e){
            // Expected
        }
        
        try{
            t.onTime(5, 20, 65);
            fail();
        }catch(IllegalArgumentException e){
            // Expected
        }
    }

    @Test
    public void TestMakeBook(){
        Book expected = new Book("Twenty Thousand Leagues Under the Sea", "Jules Verne", 1234567890);
        Book actual = t.makeBook("Twenty Thousand Leagues Under the Sea", "Jules Verne", 1234567890);
        assertEquals(expected, actual);
    }
    
    @Test
    public void NegativTestMakeBook(){
        try{
            t.makeBook("", "Jules Verne", 1234567890);
            fail();
        } catch(IllegalArgumentException e){
            // Expected
        }
        
        try{
            t.makeBook("Twenty Thousand Leagues Under the Sea", null, 1234567890);
            fail();
        } catch(IllegalArgumentException e){
            // Expected
        }
        
        try{
            t.makeBook("Twenty Thousand Leagues Under the Sea", "Jules Verne", -1);
            fail();
        } catch(IllegalArgumentException e){
            // Expected
        }
    }
    
    @Test
    public void TestCompare(){
        assertTrue(t.compare(deadZone, deadZone) == 0);
        assertTrue(t.compare(deadZone, shining) < 0);
        assertTrue(t.compare(shining, deadZone) > 0);
    }
    
    @Test
    public void NegativTestCompare(){
        try{
            t.compare(null, null);
            fail();
        } catch(IllegalArgumentException e){
            // Expected
        }
    }
    
    @Test
    public void TestGetBooksByAuthor(){
        ArrayList<Book> books = t.getBooksByAuthor(list, "Dan "+"Brown");
        assertEquals(3, books.size());
        assertEquals(angelsDemons, books.get(0));
        assertEquals(daVinci, books.get(1));
        assertEquals(inferno, books.get(2));
        books = t.getBooksByAuthor(list, "Jules Verne");
        assertEquals(4, books.size());
        books = t.getBooksByAuthor(list, "Michael Crichton");
        assertEquals(5, books.size());
    }
    
    @Test
    public void TestFindAuthorWithMostBooks(){
        String expected = "Michael Crichton";
        String actual = t.findAuthorWithMostBooks(list);
        assertEquals(expected, actual);
    }
    
    @Test
    public void TestPushTitle(){
        String expected = "Uif Efbe Apof";
        String actual = t.pushTitle("The Dead Zone", 1);
        assertEquals(expected, actual);
    }
    
    private void makeBookList() {
        list = new ArrayList<>();
        int i = 0;        
        misery = new Book("Misery", "Stephen King", ++i);
        angelsDemons = new Book("Angles And Demons", "Dan Brown", ++i);
        twentyThousandLeagues = new Book("Twenty Thousand Leagues Under the Sea", "Jules Verne", ++i);
        jurrasicPark = new Book("Jurrasic Park", "Michael Crichton", ++i);
        mysteriousIsland = new Book("The Mysterious Island", "Jules Verne", ++i);
        centerOfTheEarth = new Book("Journey to the Center of the Earth", "Jules Verne", ++i);
        deadZone = new Book("The Dead Zone", "Stephen King", ++i);
        shining = new Book("The Shining", "Stephen King", ++i);
        airframe = new Book("AirFrame", "Michael Crichton", ++i);
        daVinci = new Book("The Da Vinci Code", "Dan Brown", ++i);
        it = new Book("It", "Stephen King", ++i);
        sphere = new Book("Sphere", "Michael Crichton", ++i);
        eightyDays = new Book("Around The World In Eighty Days", "Jules Verne", ++i);
        lostWorld = new Book("The Lost World", "Michael Crichton", ++i);
        risingSun = new Book("Rising Sun", "Michael Crichton", ++i);
        inferno = new Book("Inferno", "Dan Brown", ++i);
        //Add to list
        Book[] arr = {misery, angelsDemons, twentyThousandLeagues, jurrasicPark,
            mysteriousIsland, centerOfTheEarth, deadZone, shining, airframe,
            daVinci, it, sphere, eightyDays, lostWorld, risingSun, inferno};
        for(Book b : arr) { list.add(b); }
    }
}

