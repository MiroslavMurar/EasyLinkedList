public class MyEasyLinkedList<T> implements EasyLinkedInterface<T> {

    private EasyNode<T> root;

    public MyEasyLinkedList(EasyNode<T> root) {
        this.root = root;
    }

    @Override
    public EasyNode<T> getRoot() {
        return this.root;
    }

    @Override
    public boolean addEasyNode(EasyNode<T> easyNode) {
        if (this.root == null) {
            this.root = easyNode;
            return true;
        }

        EasyNode<T> actualEasyNode = this.root;
        while (true) {
            if (actualEasyNode.compareTo(easyNode) < 0) {
                if (actualEasyNode.next() != null) {
                    actualEasyNode = actualEasyNode.next();
                    continue;
                } else {
                    actualEasyNode.setNext(easyNode);
                    easyNode.setPrevious(actualEasyNode);
                    return true;
                }
            } else if (actualEasyNode.compareTo(easyNode) > 0) {
                if (actualEasyNode.previous() == null) {
                    actualEasyNode.setPrevious(easyNode);
                    easyNode.setNext(actualEasyNode);
                    this.root = easyNode;
                    return true;
                } else {
                    actualEasyNode.previous().setNext(easyNode);
                    easyNode.setPrevious(actualEasyNode.previous());
                    easyNode.setNext(actualEasyNode);
                    actualEasyNode.setPrevious(easyNode);
                    return true;
                }
            } else {
                System.out.println(actualEasyNode);
                System.out.println(easyNode);
                return false;
            }
        }
    }

    @Override
    public boolean removeEasyNode(EasyNode<T> easyNode) {
        if (easyNode == null) {
            System.out.println("Wrong input");
            return false;
        }

        if (easyNode.compareTo(this.root) == 0) {
            System.out.println("Removing root");
            if (this.root.next() != null) {
                this.root.next().setPrevious(null);
                this.root = this.root.next();
                return true;
            } else {
                this.root = null;
                return true;
            }
        }

        EasyNode<T> actualNode = this.root;
        while (true) {
            try {
                if (actualNode.compareTo(easyNode) == 0) {
                    System.out.println("Found match");
                    if (actualNode.next() != null && actualNode.previous() != null) {
                        actualNode.previous().setNext(actualNode.next());
                        actualNode.next().setPrevious(actualNode.previous());
                        return true;
                    } else if (actualNode.next() == null) {
                        actualNode.previous().setNext(null);
                        return true;
                    }
                } else if (actualNode.compareTo(easyNode) < 0) {
                    actualNode = actualNode.next();
                    System.out.println("Moving forward");
                } else {
                    System.out.println("Element not found");
                    return false;
                }

            } catch (NullPointerException e) {
                System.out.println("Invalid argument");
                return false;
            }
        }
    }

    @Override
    public void printEasyLinkedList() {
        EasyNode<T> easyNode = this.getRoot();
        while (easyNode != null) {
            System.out.println(easyNode.value);
            easyNode = easyNode.next();
        }
    }
}
