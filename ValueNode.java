public class ValueNode implements Node {
    private int row;
    private int column;
    private int value;
    private Node nextRow;
    private Node nextColumn;


    //Node Logic
    public Node getNextRow(){
        return nextRow;

    }
    public void setNextRow(Node next) {

    }
    public Node getNextColumn() {
        return null;
    }
    public void setNextColumn(Node next) {

    }

}
