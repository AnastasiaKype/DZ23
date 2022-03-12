import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



public class MovableTest {
    @Test
    public void FastPlayerTest() {

        Movable player = new FastPlayer(10, 15);

        int speed1 = player.getSpeed(); // speed1 = 25
        int speed2 = player.getSpeed(); //  speed2 = 40


    }


}