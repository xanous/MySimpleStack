package dcll.aaou;

import junit.framework.TestCase;

/**
 * Created by AAnass on 19/02/2016.
 */
public class MySimpleStackTest extends TestCase {

    public void testIsEmpty() throws Exception {
         MySimpleStack stack = new MySimpleStack(10);
         assertFalse(stack.isEmpty());
        MySimpleStack stack1 = new MySimpleStack();
        assertTrue(stack1.isEmpty());
    }

    public void testGetSize() throws Exception {
        MySimpleStack stack = new MySimpleStack(10);
        assertEquals(10,stack.getSize());
    }

    public void testPush() throws Exception {
        MySimpleStack stack = new MySimpleStack(10);
        Item item = new Item();
        Item item2 = new Item();
        stack.push(item);
        stack.push(item2);
        assertEquals(item,stack.peek());
    }

    public void testPeek() throws Exception {

    }
    //Exigence 3
    public void testPop() throws Exception {
        MySimpleStack stack = new MySimpleStack(10);
        Item item = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        stack.push(item);
        stack.push(item2);
        stack.push(item3);
        assertEquals(item,stack.pop());
        assertEquals(item2,stack.peek());

    }
}