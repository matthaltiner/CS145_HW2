import java.io.File;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.IOException;

public class MatrixReader {

    public int columnNum;
    public int value;

    public SparseMatrix read(String file){

        SparseMatrix spar = new SparseMatrix(1,2);

        File f = new File(file);

        if(f.isFile() && f.canRead()){
            System.out.println("Good");
        }

        try(Scanner input = new Scanner(f)){
            // set the total rows and columns and save them in our sparse matrix
            spar.setTotalRows((input.nextInt()));
            input.nextLine();
            spar.setTotalColumns(input.nextInt());
            input.nextLine();


            int count = 0;

            // read the matrix provided and save the contents of our sparse matrix as head nodes and value nodes
            while(input.hasNextLine()){

                // Array for items in matrix separated by " "
                String inputArray[] = input.nextLine().split(" ");

                for(int i = 0; i < inputArray.length; i++){

                    String individual[] = inputArray[i].split(",");

                    columnNum = Integer.parseInt(individual[0]);
                    value = Integer.parseInt(individual[1]);
                    // print to check -- can be commented out
                    System.out.print(columnNum + "-" + value);
                    System.out.println();
                    

                    // put the given matrix in order, of columns, then do this process of creating valueNodes and point them to each other IN ORDER
                    //if(i == 0){

                    //}

                    //if(count == 0){


                    //}
                }
                //System.out.println();


            }

        }
        catch(NoSuchElementException | IOException e){
            e.printStackTrace();
        }

        System.out.println("Total rows: " + spar.getTotalRows());
        System.out.println("Total Columns: " + spar.getTotalColumns());

        return spar;
    }
}
