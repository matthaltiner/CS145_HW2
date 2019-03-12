public class ValueNode implements Node{
    //declare
    private int row;
    private int column;
    private int value;
    private Node nextRow;
    private Node nextColumn;

    //Node Logic
    public ValueNode getNextRow(){
        //returns the next valueNode in the column, moves down rows
        return (ValueNode)nextRow;
    }

    public void setNextRow(Node next){
        this.nextRow = next;
    }

    public ValueNode getNextColumn(){
        //return the next valueNode in the row, moves right through columns
        return (ValueNode)nextColumn;
    }

    public void setNextColumn(Node next){
        this.nextColumn = next;
    }


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
