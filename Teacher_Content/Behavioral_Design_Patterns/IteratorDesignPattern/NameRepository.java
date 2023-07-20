package Design_Pattern.Behavioural_Design_Pattern.Iterator_Design_Pattern;

public class NameRepository implements Container
{
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new nameIterator();
    }

    private class nameIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if(index<names.length)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.hasNext())
            {
                return names[index++];
            }
            else
            {
                return null;
            }
        }
    }
}
