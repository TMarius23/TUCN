import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class TestAnComun {

    @Test
    public void TestAnComun1(){
        AnBisect a1 = new AnBisect(203);
        assertFalse(a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void TestAnComun2(){
        AnBisect a1 = new AnBisect(4);
        assertFalse(!a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void TestAnComun3(){
        AnBisect a1 = new AnBisect(99);
        assertFalse(a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void TestAnComun4(){
        AnBisect a1 = new AnBisect(100);
        assertFalse(a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void TestAnComun5(){
        AnBisect a1 = new AnBisect(200);
        assertFalse(a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void TestAnComun6(){
        AnBisect a1 = new AnBisect(400);
        assertFalse(!a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void TestAnComun7(){
        AnBisect a1 = new AnBisect(500);
        assertFalse(a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void TestAnComun8(){
        AnBisect a1 = new AnBisect(1000);
        assertFalse(a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void TestAnComun9(){
        AnBisect a1 = new AnBisect(1600);
        assertFalse(!a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void TestAnComun10(){
        AnBisect a1 = new AnBisect(2015);
        assertFalse(a1.esteAnBisect(a1.getAn()));
    }

}
