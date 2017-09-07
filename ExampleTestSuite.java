package Tests;

import ExamplePackage.ExampleClass;

import static org.junit.Assert.*;

import org.junit.*;


public class ExampleTestSuite {

    @BeforeClass
    public static void beforeClass() {
    }

    @Before
    public void beforeTest() {

    }

    @Test
    public void createBook(){
        ExampleClass book = new ExampleClass();
        Assert.assertEquals(book.create(), "create");
    }
    
    @Test
    public void removeBook(){
        ExampleClass book = new ExampleClass();
        assertEquals("Before the remove", 3, book.getNumberOfBooks());
        book.remove();
        assertEquals("Remove the comment", 2, book.getNumberOfBooks());
    }
    
    @Test
    public void getBook(){
    	ExampleClass book = new ExampleClass();
    	assertEquals("test", book.getMethodName());
    }
    
    @Test
    public void searchByGenre(){
    	ExampleClass book = new ExampleClass();
    	assertEquals("test", book.getGenreTitle());
    }

    @After
    public void afterTest() {
    }

    @AfterClass
    public static void afterClass() {

    }

}

