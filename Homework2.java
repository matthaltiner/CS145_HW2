public class Homework2 {

    public void run(){
        MatrixReader mt = new MatrixReader();
        //create and save the sparseMatrix for MatrixA
        SparseMatrix sparseMatrixA = mt.read("MatrixA.txt");
        //sparseMatrixA.print();
        SparseMatrix tranSparA = sparseMatrixA.transpose();
        //tranSparA.print();

        //create and save the sparseMatrix for MatrixB
        SparseMatrix sparseMatrixB = mt.read("MatrixB.txt");
        //sparseMatrixB.print();
        SparseMatrix tranSparB = sparseMatrixB.transpose();
        //tranSparB.print();

        //product of both matrices
        SparseMatrix productMatrix = sparseMatrixA.product(sparseMatrixB);
        productMatrix.print();

    }
}
