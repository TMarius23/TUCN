import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DogTest {

    ///Stergem junit test, si dupa apasam pe becul ala rosu
    @Test
    public void testName(){
        Dog rex = new Dog("Rex");
        assertEquals(rex.getName(), "Rex");
    }
    @Test
    public void testName1(){
        Dog rex1 = new Dog("Rex1");
        assertEquals(rex1.getName(), "Rex1");
    }

    @Test
    public void testSetName(){
        Dog rex = new Dog("Rex");
        assertEquals(rex.getName(), "Rex");
    }
}
