public class ListNode <T>
{
    public T data;
    public ListNode next;

    public ListNode()
    {
        this(null, null);
    }

    public ListNode(T data)
    {
        this(data, null);
    }

    public ListNode(T data, ListNode next)
    {
        this.data = data;
        this.next = next;
    }
}