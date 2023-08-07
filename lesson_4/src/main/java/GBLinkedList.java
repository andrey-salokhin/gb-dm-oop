import java.util.Iterator;

public class GBLinkedList<T> implements GBList<T> {

    private GBNode<T>[] values;

    GBLinkedList() {
        this.values  = new GBNode[0];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public boolean add(T elem) {
        try {
            GBNode[] tempArray = values;
            GBNode nodedElem = new GBNode<T>(elem, null);
                if(tempArray.length > 0) {
                    tempArray[tempArray.length - 1].next = nodedElem;
                }
            values = new GBNode[tempArray.length + 1];
            System.arraycopy(tempArray, 0, values, 0, tempArray.length);
            values[values.length - 1] = nodedElem;
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public boolean addFirst(T elem) {
        try {
            GBNode[] tempArray = values;
            GBNode nodedElem = new GBNode<T>(elem, tempArray[0]);
            values = new GBNode[tempArray.length + 1];
            values[0] = nodedElem;
            System.arraycopy(tempArray, 0, values, 1, tempArray.length);
            return true;
        } catch (ClassCastException e) {
            return false;
        }

    }

    @Override
    public void remove(int index) {
        try {
            GBNode[] tempArray = values;
            if(index != tempArray.length-1){
                values[index-1].next = values[index+1];
            }
            values = new GBNode[tempArray.length - 1];
            System.arraycopy(tempArray, 0, values, 0, index);
            int amountElementsAfterIndex = tempArray.length - index - 1;
            System.arraycopy(tempArray, index+1, values, index, amountElementsAfterIndex);
        } catch (ClassCastException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public T get(int index) {
        return (T) values[index].getItem();
    }

    public String getFullElement(int index) {
        return values[index].getFullName();
    }

    public String getFullElementTest(int index) {
        return values[index].getFullName();
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T e) {
        GBNode node = null;
        if(index != values.length-1) {
            node = values[index + 1];
        }
        values[index] = new GBNode<T>(e, node);
    }
    
}
