public class EasyNode<T extends Object> extends EasyLinkedNode<T> {

    public EasyNode(T value) {
        super(value);
    }

    @Override
    EasyNode<T> next() {
        return this.nextNode;
    }

    @Override
    EasyNode<T> setNext(EasyNode<T> easyNode) {
        this.nextNode = easyNode;
        return this.nextNode;
    }

    @Override
    EasyNode<T> previous() {
        return this.previousNode;
    }

    @Override
    EasyNode<T> setPrevious(EasyNode<T> easyNode) {
        this.previousNode = easyNode;
        return this.previousNode;
    }

    @Override
    int compareTo(EasyNode<T> easyNode) {
        if (easyNode != null) {
            return ("" + this.getValue()).compareTo("" + easyNode.getValue());
        }
        return -1;
    }
}
