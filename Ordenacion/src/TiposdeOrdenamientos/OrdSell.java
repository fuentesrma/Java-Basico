package TiposdeOrdenamientos;

public class OrdSell {
	
    public static int[] shellSort(int[] matrix) { 
    	
        for ( int increment = matrix.length / 2;increment > 0;increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {  
            for (int i = increment; i < matrix.length; i++) {  
                for (int j = i; j >= increment && matrix[j - increment] > matrix[j]; j -= increment) {  
                    int temp = matrix[j];  
                    matrix[j] = matrix[j - increment];  
                    matrix[j - increment] = temp; 
                    System.out.println("Sell: "+temp);
                }  
            } 
            
        }  
        return matrix;
    }  
    
	}
