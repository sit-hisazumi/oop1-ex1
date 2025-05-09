import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Ex1Test {
    @Test
    public void testAdd() {
        assertEquals("less than 10", Ex1.compareTo10(9));
        assertEquals("10 or more", Ex1.compareTo10(10));
        assertEquals("10 or more", Ex1.compareTo10(11));
    }

    @Test
    public void testAssign1toN() {
        assertThat(Ex1.assign1toN(0)).containsExactly();
        assertThat(Ex1.assign1toN(1)).containsExactly(1);
        assertThat(Ex1.assign1toN(10)).containsExactly(1,2,3,4,5,6,7,8,9,10);
    }

    @Test
    public void testAssign1toNofEven() {
        assertThat(Ex1.assign1toNofEven(0)).containsExactly();
        assertThat(Ex1.assign1toNofEven(2)).containsExactly(2);
        assertThat(Ex1.assign1toNofEven(4)).containsExactly(2, 4);
        assertThat(Ex1.assign1toNofEven(10)).containsExactly(2, 4, 6, 8, 10);
    }

    @Test
    public void testNum2str() {
        assertEquals("zero", Ex1.num2str(0));
        assertEquals("one", Ex1.num2str(1));
        assertEquals("two", Ex1.num2str(2));
        assertEquals("three", Ex1.num2str(3));
        assertEquals("four", Ex1.num2str(4));
        assertEquals("five", Ex1.num2str(5));
        assertEquals("six", Ex1.num2str(6));
        assertEquals("seven", Ex1.num2str(7));
        assertEquals("eight", Ex1.num2str(8));
        assertEquals("nine", Ex1.num2str(9));
        assertEquals("ten", Ex1.num2str(10));
    }

    @Test
    public void testStr2num() {
        assertEquals(0, Ex1.str2num("zero"));
        assertEquals(1, Ex1.str2num("one"));
        assertEquals(2, Ex1.str2num("two"));
        assertEquals(3, Ex1.str2num("three"));
        assertEquals(4, Ex1.str2num("four"));
        assertEquals(5, Ex1.str2num("five"));
        assertEquals(6, Ex1.str2num("six"));
        assertEquals(7, Ex1.str2num("seven"));
        assertEquals(8, Ex1.str2num("eight"));
        assertEquals(9, Ex1.str2num("nine"));
        assertEquals(10, Ex1.str2num("ten"));
    }

    @Test
    public void testTotal() {
        assertEquals(0, Ex1.total(List.of()));
        assertEquals(3, Ex1.total(List.of(1, 2)));
        assertEquals(55, Ex1.total(List.of(1,2,3,4,5,6,7,8,9,10)));
    }

    @Test
    public void testAverage() {
        assertEquals(1.5, Ex1.average(List.of(1,2)), 0.0001);
        assertEquals(5.5, Ex1.average(List.of(1,2,3,4,5,6,7,8,9,10)), 0.0001);
    }

    @Test
    public void testTable9x9() {
        assertThat(Ex1.table9x9())
            .containsExactly(1,2,3,4,5,6,7,8,9,
                            2,4,6,8,10,12,14,16,18,
                            3,6,9,12,15,18,21,24,27,
                            4,8,12,16,20,24,28,32,36,
                            5,10,15,20,25,30,35,40,45,
                            6,12,18,24,30,36,42,48,54,
                            7,14,21,28,35,42,49,56,63,
                            8,16,24,32,40,48,56,64,72,
                            9,18,27,36,45,54,63,72,81);
    }

    @Test
    public void testDayOfWeek() {
        assertEquals(0, Ex1.dayOfWeek(2021, 4, 25));
        assertEquals(5, Ex1.dayOfWeek(2021, 1, 1));
        assertEquals(6, Ex1.dayOfWeek(2021, 1, 2));
        assertEquals(0, Ex1.dayOfWeek(2021, 1, 3));
        assertEquals(0, Ex1.dayOfWeek(2020, 3, 1));
        assertEquals(6, Ex1.dayOfWeek(2020, 2, 29));
    }

    @Test
    public void testIsLeapYear(){
        assertEquals(false, Ex1.isLeapYear(2021));
        assertEquals(true, Ex1.isLeapYear(2000));
        assertEquals(true, Ex1.isLeapYear(2004));
        assertEquals(false, Ex1.isLeapYear(1900));
    }

    @Test
    public void testDaysOfMonth() {
        assertEquals(30, Ex1.daysOfMonth(2021, 4));
        assertEquals(31, Ex1.daysOfMonth(2021, 5));
        assertEquals(28, Ex1.daysOfMonth(2021, 2));
        assertEquals(29, Ex1.daysOfMonth(2020, 2));
    }

    @Test
    public void testPerpetualCalendar() {
        assertThat(Ex1.perpetualCalendar(2020, 8))
            .containsExactly(0, 0, 0, 0, 0, 0, 1, 
                            2, 3, 4, 5, 6, 7, 8, 
                            9, 10, 11, 12, 13, 14, 15, 
                            16, 17, 18, 19, 20, 21, 22, 
                            23, 24, 25, 26, 27, 28, 29, 
                            30, 31);

        assertThat(Ex1.perpetualCalendar(2020, 2))
            .containsExactly(0, 0, 0, 0, 0, 0, 1, 
                            2, 3, 4, 5, 6, 7, 8, 
                            9, 10, 11, 12, 13, 14, 15, 
                            16, 17, 18, 19, 20, 21, 22, 
                            23, 24, 25, 26, 27, 28, 29);
    }
}
