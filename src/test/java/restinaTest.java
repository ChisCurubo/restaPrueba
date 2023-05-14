import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class restinaTest {
    restina resta;
     @BeforeEach
        void setUp(){
            resta = new restina();
        }
     @Test
    void restaTest(){
         Assertions.assertEquals(2,restina.resta(4,2));
     }
     @Test
    void verFalTest(){
         Assertions.assertEquals(true, restina.verFal(2));
     }
}