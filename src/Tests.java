import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Tests {

    @Test
    public void leftListIsNull(){

        List<Integer> left = null;
        List<Integer> right = new ArrayList<>();

        right.add(5);
        right.add(6);
        right.add(4);

        List<Integer> expected = null;
        List<Integer> obtained = NumberUtils.add(left, right);

        assertEquals(expected, obtained);
    }

    @Test
    public void ListsAreNull(){

        List<Integer> left = null;
        List<Integer> right = null;

        List<Integer> expected = null;
        List<Integer> obtained = NumberUtils.add(left, right);

        assertEquals(expected, obtained);
    }

    @Test
    public void leftListIsEmpty(){

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        right.add(3);
        right.add(6);
        right.add(4);

        List<Integer> expected = new ArrayList<>();

        expected.add(4);
        expected.add(6);
        expected.add(3);

        List<Integer> obtained = NumberUtils.add(left, right);

        assertEquals(expected, obtained);
    }

    @Test
    public void ListsAreEmpty(){

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        List<Integer> expected = new ArrayList<>();

        List<Integer> obtained = NumberUtils.add(left, right);

        assertEquals(expected, obtained);
    }

    @Test
    public void leftListIsZero(){

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        left.add(0);
        left.add(0);
        left.add(0);

        right.add(3);
        right.add(6);
        right.add(4);

        List<Integer> expected = new ArrayList<>();

        expected.add(4);
        expected.add(6);
        expected.add(3);

        List<Integer> obtained = NumberUtils.add(left, right);

        assertEquals(expected, obtained);
    }

    @Test
    public void listsAreZero(){

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        left.add(0);
        left.add(0);
        left.add(0);

        right.add(0);
        right.add(0);
        right.add(0);

        List<Integer> expected = new ArrayList<>();

        expected.add(0);

        List<Integer> obtained = NumberUtils.add(left, right);

        assertEquals(expected, obtained);
    }

    @Test
    public void leftIsNegative(){

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        left.add(2);
        left.add(4);
        left.add(-3);

        right.add(5);
        right.add(6);
        right.add(4);

        assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.add(left, right);
        });
    }

    @Test
    public void sumWithoutCarry(){

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        left.add(2);
        left.add(0);
        left.add(3);

        right.add(5);
        right.add(6);
        right.add(4);

        List<Integer> expected = new ArrayList<>();

        expected.add(7);
        expected.add(6);
        expected.add(7);

        List<Integer> obtained = NumberUtils.add(left, right);

        assertEquals(expected, obtained);
    }

    @Test
    public void sumWithCarry(){

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        left.add(2);
        left.add(4);
        left.add(3);

        right.add(5);
        right.add(6);
        right.add(4);

        List<Integer> expected = new ArrayList<>();

        expected.add(7);
        expected.add(0);
        expected.add(8);

        List<Integer> obtained = NumberUtils.add(left, right);

        assertEquals(expected, obtained);
    }

    @Test
    public void singleDigitNumbers() {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        left.add(7);

        right.add(5);

        List<Integer> expected = new ArrayList<>();

        expected.add(2);
        expected.add(1);

        List<Integer> result = NumberUtils.add(left, right);
        assertEquals(expected, result);
    }

}
