import org.junit.Test;

import static org.junit.Assert.*;

public class TestAnBisect {

    @Test
    public void test1AnBisect(){
        AnBisect a1 = new AnBisect(203);
        assertTrue(!a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void test2AnBisect(){
        AnBisect a1 = new AnBisect(4);
        assertTrue(a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void test3AnBisect(){
        AnBisect a1 = new AnBisect(99);
        assertTrue(!a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void test4AnBisect(){
        AnBisect a1 = new AnBisect(100);
        assertTrue(!a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void test5AnBisect(){
        AnBisect a1 = new AnBisect(200);
        assertTrue(!a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void test6AnBisect(){
        AnBisect a1 = new AnBisect(400);
        assertTrue(a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void test7AnBisect(){
        AnBisect a1 = new AnBisect(500);
        assertTrue(!a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void test8AnBisect(){
        AnBisect a1 = new AnBisect(1000);
        assertTrue(!a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void test9AnBisect(){
        AnBisect a1 = new AnBisect(1600);
        assertTrue(a1.esteAnBisect(a1.getAn()));
    }

    @Test
    public void test10AnBisect(){
        AnBisect a1 = new AnBisect(2018);
        assertTrue(!a1.esteAnBisect(a1.getAn()));
    }


}
