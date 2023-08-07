public class GBNode<E> {

    E item;
    GBNode<E> next;

    GBNode(E element, GBNode<E> next) {
        this.item = element;
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public String getFullName() {
        if(this.next == null) {
            return "The last element: " + (String) item;
        }
        return item + " " + next.getItem();
    }
    
}
