public class Main {

    public static void main(String[] args) {

        EasyNode<String> easyNode1 = new EasyNode<>("Q");
        EasyNode<String> easyNode2 = new EasyNode<>("G");
        EasyNode<String> easyNode3 = new EasyNode<>("A");
        EasyNode<String> easyNode4 = new EasyNode<>("X");
        EasyNode<String> easyNode5 = new EasyNode<>("B");
//        EasyNode<Integer> easyNodeX = new EasyNode<>(1);
//        EasyNode<String> notAdded = new EasyNode<String>("notAdded");

        MyEasyLinkedList<String> myEasyLinkedList = new MyEasyLinkedList<>(easyNode1);
        myEasyLinkedList.addEasyNode(easyNode2);
        myEasyLinkedList.addEasyNode(easyNode3);
        myEasyLinkedList.addEasyNode(easyNode4);
        myEasyLinkedList.addEasyNode(easyNode5);
//        myEasyLinkedList.addEasyNode(easyNodeX);

//        myEasyLinkedList.removeEasyNode(easyNode3);

        myEasyLinkedList.printEasyLinkedList();
    }


}
