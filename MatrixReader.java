import java.util.*;
import java.io.File;

public class MatrixReader {

    public SparseMatrix read(String file){
        File matrixA = new File("matrixA.txt");
        Scanner input = new Scanner(""+matrixA);

        int var = input.nextInt();
        // error here -- sure if file being read correctly
        read(file).setTotalRows(input.nextInt());
        input.nextLine();
        read(file).setTotalColumns(input.nextInt());
        input.nextLine();

        System.out.println(read(file).getTotalColumns());
        System.out.println(read(file).getTotalRows());

        return read(file);
    }
}
