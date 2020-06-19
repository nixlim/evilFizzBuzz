import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberBuzzHandlerTest {

    @Test
    public void buzzHandlerReturnsBuzzWhenReceives5(){

        NumberBuzzHandler handler = new NumberBuzzHandler();

        assertEquals( "buzz", handler.divisibleByFive(5));
    }

    @Test
    public void buzzHandlerReturnsNumberAsStringWhenWhenReceives2(){

        NumberBuzzHandler handler = new NumberBuzzHandler();

        assertEquals( "2", handler.divisibleByFive(2));
    }

    @Test
    public void buzzHandlerReturnsBuzzWhenWhenReceives10(){

        NumberBuzzHandler handler = new NumberBuzzHandler();

        assertEquals( "buzz", handler.divisibleByFive(10));
    }

    @Test
    public void buzzHandlerReturns7WhenWhenReceives7(){

        NumberBuzzHandler handler = new NumberBuzzHandler();

        assertEquals( "7", handler.divisibleByFive(7));
    }

    @Test
    public void buzzHandlerReturnsBuzzWhenReceives15(){

        NumberBuzzHandler handler = new NumberBuzzHandler();

        assertEquals( "buzz", handler.divisibleByFive(15));
    }

    @Test
    public void buzzHandlerReturnsMinusOneWhenReceivesMinus1(){

        NumberBuzzHandler handler = new NumberBuzzHandler();

        assertEquals( "-1", handler.divisibleByFive(-1));
    }

    @Test
    public void buzzHandlerReturnsBuzzWhenReceivesMinus5(){

        NumberBuzzHandler handler = new NumberBuzzHandler();

        assertEquals( "buzz", handler.divisibleByFive(-5));
    }

    @Test
    public void buzzHandlerReturnsBuzzWhenReceives0(){

        NumberBuzzHandler handler = new NumberBuzzHandler();

        assertEquals( "buzz", handler.divisibleByFive(0));
    }


}
