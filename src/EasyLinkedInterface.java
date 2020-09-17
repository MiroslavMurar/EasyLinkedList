public interface EasyLinkedInterface<T> {

    EasyNode<T> getRoot();
    boolean addEasyNode(EasyNode<T> easyNode);
    boolean removeEasyNode(EasyNode<T> easyNode);
    void printEasyLinkedList();
}
