import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ronni on 04-10-2016.
 */
public class MyLinkedListTest {
    MyLinkedList list = new MyLinkedList();

    @Before
    public void setUp() throws Exception
    {
        list.add(1);
        list.add(5);
        list.add(2, 3);
        list.remove(1);
    }

    @Test
    public void add() throws Exception
    {
        assertEquals(list.get(1), 3);
    }

    @Test
    public void add1() throws Exception
    {
        assertEquals(list.get(1), 3);
    }

    @Test
    public void isEmpty() throws Exception
    {
        assertEquals(list.isEmpty(), false);
    }

    @Test
    public void remove() throws Exception
    {
        assertEquals(list.get(1), 3);
    }

    @Test
    public void size() throws Exception
    {
        assertEquals(list.size(), 2);
    }

}