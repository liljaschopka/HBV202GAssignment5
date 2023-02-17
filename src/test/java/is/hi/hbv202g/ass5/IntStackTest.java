package is.hi.hbv202g.ass5;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntStackTest {
    private IntStack stack = new IntStack();

    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }

    @Test
    public void testFullStackIsFull() {
        int cap = stack.getCapacity();
        for (int i = 0; i < cap; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }

    @Test
    public void testAlmostFullStackIsNotFull() {
        int cap = stack.getCapacity();
        for (int i = 0; i < cap - 1; i++) {
            stack.push(i);
        }
        assertFalse(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue() {
        stack.push(5);
        int pushed = stack.pop();
        assertEquals(5, pushed);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopOnAnEmptyStack() {
        stack.pop();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushOnAFullStack() {
        int cap = stack.getCapacity();
        for (int i = 0; i < cap; i++) {
            stack.push(i);
        }
        stack.push(5);
    }

    @Test
    public void testEmptyStackisEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testNotEmptyStackisNotEmpty() {
        stack.push(5);
        assertFalse(stack.isEmpty());
    }


}
