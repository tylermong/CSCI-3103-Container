public class LinkedContainer
{
    public static void main(String[] args)
    {
        Box head = new Box("head", null);

        head.add("first");
        head.add("second");
        head.add("third");
        head.printAll();
        System.out.println();
        System.out.println(head.toString());
    }
}