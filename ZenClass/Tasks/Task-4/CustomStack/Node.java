package CustomStack;

class Node {
    private Integer data;
    private Node belowNode = null;

    public Node(Integer data) {
        this.data = data;
    }

    // Getters & Setters
    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getBelowNode() {
        return belowNode;
    }

    public void setBelowNode(Node belowNode) {
        this.belowNode = belowNode;
    }
}