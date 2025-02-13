public class Main {

   public static void main(String []args) {
      // DECLARE 2D Array with Type[][]
      int[][] coordinates;
      // CREATE 2D Array of a certain number
      // of ROWS and COLUMNS
      coordinates = new int[5][5];
      // Default values for int: 0
      // TOTAL NUM OF ELEMENTS = row*col = 25

      // INITIALIZE (Declare + Create)
      String[][] seatingChart = new String[3][4];
      // Default values for String: null
      // TOTAL NUM OF ELEMENTS = row*col = 12

      // SET VALUES in a 2D Array
      seatingChart[0][0] = "Jackson";
      seatingChart[1][0] = "Finny";
      seatingChart[2][0] = "Bryce";
      seatingChart[2][1] = "Natalie";
      seatingChart[2][2] = "Paige";
      seatingChart[2][3] = "Zoie";
      seatingChart[1][3] = "Alex";
      seatingChart[0][3] = "Maia";

      // INITIALIZER LIST
      // alternate way to initialize array
      // (when you know what values go where)
      // INNER curly brackets hold each row
      int[][] minefield = {{7,-20,0},{0,50,-15},{-10,12,20}};

      // ACCESS a value with the double index operator
      // array[row][col]
      System.out.println("You earned " + minefield[2][0] + " points");
      System.out.println("You earned " + minefield[1][1] + " points");
      // Can also store value in a new variable
      int worstSpot = minefield[0][1];

      // NESTED Loops are necessary to traverse 2D arrays
      // ENHANCED FOR-EACH LOOP to "visit" all items in order
      // OUTER loop iterates through each row
      // IMPORTANT: Data type of a ROW is a 1D Array
      for (String[] row : seatingChart) {
         // INNER loop iterates through column values
         // "for every string item in the row array"
         for (String col : row) {
            System.out.print(col + " ");
         }
         System.out.println(); // line break between rows
      }

      // Cannot use for-each if you want to MODIFY VALUES
      // or iterate in a different order 
      // STANDARD ("indexed") FOR LOOP 
      // array.length represents NUMBER OF ROWS in the 2D array
      for (int row=0; row < minefield.length; row++) {
         // array[0].length represents NUMBER OF COLUMNS in a row
         for (int col=0; col < minefield[0].length; col++) {
            // if spot is a "bomb" (negative num), replace it
            if (minefield[row][col] < 0) {
               minefield[row][col] = minefield[row][col] * -1;
            }
            System.out.print("[" + minefield[row][col] + "]");
         }
         System.out.println();
      }



   }
}
