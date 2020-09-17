
public abstract class EasyLinkedNode<T extends Object> {

    protected EasyNode<T> nextNode;
    protected EasyNode<T> previousNode;
    protected T value;

    public EasyLinkedNode(T value) {
        this.value = value;
    }

    abstract EasyNode<T> next();
    abstract EasyNode<T> setNext(EasyNode<T> easyNode);
    abstract EasyNode<T> previous();
    abstract EasyNode<T> setPrevious(EasyNode<T> easyNode);

    abstract int compareTo(EasyNode<T> easyNode);

    public Object getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
