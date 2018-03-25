package at.refugeescode.piratesofthecodebean1thecursedcoin.thecursedcoin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class JackSparrowTest {

    @Autowired
    private JackSparrow jackSparrow;

    @Test
    void findCoursedCoin() {
        String message = jackSparrow.findCoursedCoin();
        assertEquals("I got it!", message);
    }

}
