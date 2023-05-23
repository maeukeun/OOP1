import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //Без параметров
    @Test
    public void testNextNumber(){
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(5);

        radio.nextNumberRadio();
        int expected = 6;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevNumber(){
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(8);

        radio.prevNumberRadio();
        int expected = 7;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevNumberOnBound(){
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(0);

        radio.prevNumberRadio();
        int expected = 9;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextNumberOnBound(){
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(9);

        radio.nextNumberRadio();
        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCurrentNumberOutOfBound(){
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCurrentNumberOutOfBound2(){
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(14);

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeOnBound(){
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeOnBound(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeOutOfBound(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testVolumeOutOfBound2(){
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //С параметрами
    @Test
    public void paramTestNextNumber(){
        Radio radio = new Radio(54);
        radio.setCurrentNumberRadio(50);

        radio.nextNumberRadio();
        int expected = 51;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void paramTestPrevNumber(){
        Radio radio = new Radio(54);
        radio.setCurrentNumberRadio(8);

        radio.prevNumberRadio();
        int expected = 7;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void paramTestPrevNumberOnBound(){
        Radio radio = new Radio(54);
        radio.setCurrentNumberRadio(0);

        radio.prevNumberRadio();
        int expected = 53;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void paramTestNextNumberOnBound(){
        Radio radio = new Radio(54);
        radio.setCurrentNumberRadio(53);

        radio.nextNumberRadio();
        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void paramTestCurrentNumberOutOfBound(){
        Radio radio = new Radio(54);
        radio.setCurrentNumberRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void paramTestCurrentNumberOutOfBound2(){
        Radio radio = new Radio(54);
        radio.setCurrentNumberRadio(54);

        int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }
}
