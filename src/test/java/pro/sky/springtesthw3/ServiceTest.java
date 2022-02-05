package pro.sky.springtesthw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    private Service out = new Service();

    @BeforeEach
    public void startNew() {
        this.out = new Service();
    }

    @Test
    public void ifNum2WillBeZeroAtSum() {
        int result = out.calculateSum(9, 0);
        assertEquals(9, result);
    }

    @Test
    public void ifNum2WillBeNegativeAtSum() {
        int result = out.calculateSum(9, -96);
        assertEquals(-87, result);
    }

    @Test
    public void ifNum2WillBeZeroAtSub() {
        int result = out.subtract(9, 0);
        assertEquals(9, result);
    }

    @Test
    public void ifNum2WillBeNegativeAtSub() {
        int result = out.subtract(9, -51);
        assertEquals(60, result);
    }

    @Test
    public void ifNum2WillBeZeroAtMulti() {
        int result = out.multiply(9, 0);
        assertEquals(0, result);
    }

    @Test
    public void ifNum2WillBeNegativeAtMulti() {
        int result = out.multiply(9, -5);
        assertEquals(-45, result);
    }

    @Test
    public void ifNum2WillBeNegativeAtDevide() {
        int result = out.devide(9, -4);
        assertEquals(1, result);
    }

    @Test
    public void ifNum1WillBeZeroAtDevide() {
        int result = out.devide(0, 5);
        assertEquals(0, result);
    }

    @Test
    public void ifNum2WillBeZeroAtDevide() {
        assertThrows(IllegalArgumentException.class,
                () -> out.devide(9,0));
    }

}
