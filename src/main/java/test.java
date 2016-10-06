/**
 * Created by Ronni on 04-10-2016.
 */
public class test
{
    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList();
        list.isEmpty();
        list.add(1);
        list.add("oh");
        list.add(3.5);
        System.out.println(list);
        list.isEmpty();
        list.add(1, 9);
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
    }
}
