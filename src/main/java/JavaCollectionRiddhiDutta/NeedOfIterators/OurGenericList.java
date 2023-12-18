package JavaCollectionRiddhiDutta.NeedOfIterators;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T>{

    private T[] items;
    private int size;


    public OurGenericList() {
        size=0;
        items=(T[]) new Object[100];

    }

    public void add(T item){
        items[size++] =item;
    }

    public T getItemAtIndex(int index){
        return items[index];
    }


    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);


    }

    //we created this belowe class ebacuse i dont want implementation classes to kno whow im usign iterator
    private class OurGenericListIterator implements Iterator<T>{

        private OurGenericList<T> list;
        private int index=0;

        public OurGenericListIterator(OurGenericList<T> list){
            this.list=list;
        }


        @Override
        public boolean hasNext() {
            System.out.println("hasNext() Called");
           return index< list.size;
        }

        @Override
        public T next() {
            System.out.println("next() Called");
           /* int item=list.items[index];
            index++;
            return item;*/
            //3 lines in below one line
            return list.items[index++];
        }
    }
}
