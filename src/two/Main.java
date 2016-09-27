package two;

public class Main {
/**
 *  Print diamond 
 *  
 * row|
 * -----------------
 *  1 |_ _ _ _ a
 *  3 |_ _ _ a b a
 *  5 |_ _ a b c b a
 *  3 |_ _ _ a b a
 *  1 |_ _ _ _ a
 * 
 *  Total top triangle fill row section = row
 *  Total top triangle spaces is (diamond_size - 1) - (row/2)
 *  Total bottom triangle fill row section = row
 *  Total bottom triangle spaces is (diamond_size - 1) - (row/2)
 *  To alternate letter, increment if fill is less than (row/2) else decrement letter
 *    
 * @param args
 */
	public static void main(String[] args) {
		int diamond_size = 5;	
	    int letter = 97;
	    
		for(int row = 1; row < diamond_size; row += 2){
		    for(int space = 0; space < (diamond_size - 1) - (row/2); space++){
		        System.out.print("  ");
		    }
		    letter = 97;
		    for(int fill = 0; fill < row; fill++){
		    	System.out.print((char)letter + " ");
		    	letter = (fill < (row/2) ) ? (letter + 1):(letter - 1);
		    }
		    System.out.println("");
		}

		for(int row = diamond_size; row > 0; row -= 2){
		    for(int space = 0; space < (diamond_size - 1) - (row/2); space++){
		    	System.out.print("  ");
		    }
		    letter = 97;
		    for (int fill = 0; fill < row; fill++){
		    	System.out.print((char)letter + " ");
		    	letter = (fill < (row/2) ) ? (letter + 1):(letter - 1);
		    }
		    System.out.println("");
		}
	}

}
