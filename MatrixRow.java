public class MatrixRow implements HeadNode {
    private Node nextRow;
    private Node nextColumn;


    //Node Logic
    public Node getNextRow(){
        return nextRow;
    }
    public void setNextRow(Node next){
        nextRow = next;
    }
    public Node getNextColumn(){
        return nextColumn;
    }
    public void setNextColumn(Node next){
        nextColumn = next;
    }

    //HeadNode Logic
    public HeadNode getNext(){
        return (HeadNode)nextRow;
    }
    public ValueNode getFirst(){
        return (ValueNode)nextColumn;
    }
    public void insert(ValueNode value){

    }
    public int get(int position){
        return 0;
    }
}
