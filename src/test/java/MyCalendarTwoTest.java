import org.junit.Assert;
import org.junit.Test;

public class MyCalendarTwoTest {
    @Test
    public void test1() {
        MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
        Assert.assertTrue(myCalendarTwo.book(10,20));
        Assert.assertTrue(myCalendarTwo.book(50,60));
        Assert.assertTrue(myCalendarTwo.book(10,40));
        Assert.assertFalse(myCalendarTwo.book(5,15));
        Assert.assertTrue(myCalendarTwo.book(5,10));
        Assert.assertTrue(myCalendarTwo.book(25,55));
    }

}
