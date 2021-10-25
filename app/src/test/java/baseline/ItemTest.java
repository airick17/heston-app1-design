package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    //checks isComplete function for boolean class variable
    void checkCompleteTest(){
        Item item = new Item();
        item.setComplete(false);
        assertEquals(item.checkComplete(), item.isComplete());
    }

}