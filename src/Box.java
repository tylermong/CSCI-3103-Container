public class Box
{
    private String data;
    private Box next;

    public Box(String data, Box next)
    {
        this.data = data;
        this.next = next;
    }

    public void add(String data)
    {
        if (this.next == null)
            this.next = new Box(data, null);
        else
            this.next.add(data);
    }

    public void printAll()
    {
        System.out.println(this.data);
        if (this.next != null)
            this.next.printAll();
    }

    public String toString()
    {
        String result = this.data + ", ";
        if (this.next != null)
            result += this.next.toString();
        return result;
    }
}