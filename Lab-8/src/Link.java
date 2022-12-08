class Link
{
    public Object data;
    public Link next;
    public Link previous;

    public Link(Object o)
    {
        data = o;
    }

    public String toString() {
        return data.toString();
    }
}