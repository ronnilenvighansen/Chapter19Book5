public class MyLinkedList<T>
{
    private ListNode front;

    public MyLinkedList()
    {
        front = null;
    }

    public <T> void add(T value)
    {
        if (front == null)
        {
            front = new ListNode(value);
        }
        else
        {
            ListNode current = front;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public <T> void add(int index, T value)
    {
        if (index == 0)
        {
            front = new ListNode(value, front);
        }
        else
        {
            ListNode current = goTo(index - 1);
            ListNode newNode = new ListNode(value, current.next);
            current.next = newNode;
        }
    }

    public T get(int index)
    {
        ListNode<T> current = goTo(index);
        return current.data;
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public void remove(int index)
    {
        if (index == 0)
        {
            front = front.next;
        }
        else
        {
            ListNode current = goTo(index - 1);
            current.next = current.next.next;
        }
    }

    public int size()
    {
        int count = 0;
        ListNode current = front;
        while (current != null)
        {
            current = current.next;
            count++;
        }
        return count;
    }

    public String toString()
    {
        if (front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    private ListNode goTo(int index)
    {
        ListNode current = front;
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return current;
    }
}