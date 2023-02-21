import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNextNumber(){
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(5);

        radio.nextNumberRadio();
        int expected = 6;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testPrevNumber(){
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(8);

        radio.prevNumberRadio();
        int expected = 7;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testPrevNumberOnBound(){
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(0);

        radio.prevNumberRadio();
        int expected = 9;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testNextNumberOnBound(){
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(9);

        radio.nextNumberRadio();
        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testCurrentNumberOutOfBound(){
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testCurrentNumberOutOfBound2(){
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(14);

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testIncreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testDecreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testIncreaseVolumeOnBound(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testDecreaseVolumeOnBound(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testVolumeOutOfBound(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testVolumeOutOfBound2(){
        Radio radio = new Radio();
        radio.setCurrentVolume(30);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }
}
