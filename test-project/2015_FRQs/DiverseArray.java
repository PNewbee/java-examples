/**
 * DiverseArray is question #1 from the 2015 FRQ.
 *
 * @author (Stoll)
 * @version (2017-18)
 */
public class DiverseArray
{

    //Constructor for objects of class DiverseArray
    public DiverseArray()
    {
        // Empty Constructor???????
    }
    
    // The arraySum method
    public static void arraySum(int[] arrayIn) {
        int sum = 0;
        for (int i = 0; i <= arrayIn.length - 1; i++) {
            sum += arrayIn[i];
            System.out.print(arrayIn[i] + " ");
        }
        System.out.println("Sum: " + sum + "\n\n");
    }
    
    // The rowSums method
    public static void rowSums(int[][] arrayIn) {
        for (int row = 0; row <= arrayIn.length - 1; row++) {
            int sum = 0;
            for (int col = 0; col <= arrayIn[0].length - 1; col++) {
                sum += arrayIn[row][col];
                System.out.print(arrayIn[row][col] + " ");
            }
            
            System.out.println("Sum: " + sum);
        }

    }
    
    // diverseArray method
    public static boolean diverseArray(int[][] arrayIn) {
        int[] compareArray = new int[arrayIn.length];
        boolean isDiverse = true;
 
        for (int row = 0; row <= arrayIn.length - 1; row++) {
            for (int col = 0; col <= arrayIn[0].length - 1; col++) {
                compareArray[row] += arrayIn[row][col];
                //System.out.print(arrayIn[row][col] + " ");
            }
        }
        
        // Loop through compareArray to see if any values match
        for (int i = 0; i <= compareArray.length - 1; i++) {           
            for (int i2 = i + 1; i2 <= compareArray.length - 1; i2++) {
                if (compareArray[i] == compareArray[i2]) {
                    isDiverse = false;
                }
            }             
        }
        
        System.out.println("This is a diverse array: " + isDiverse);
        return isDiverse;
    }
    
    
    // main Method
    public static void main(String[] args)
    {
        // Build arr1
        int[] arr1 = {1, 9, 3, 5, 11, 8, 6, 4};
        
        // Build arr2D
        int[][] arr2D = {
                            {44, 57, 22, 11, 8, 9}, 
                            {14, 18, 92, 10, 3, 5}, 
                            {4, 1, 53, 17, 66, 88},
                            {64, 71, 153, 37, 12, 28}   //,
                            //{2, 3, 4, 5, 6, 122}
                        };
        
        arraySum(arr1);
        rowSums(arr2D);
        System.out.println("Is the 2d Array diverse: " + diverseArray(arr2D));
    }
}

/*
Output
1 9 3 5 11 8 6 4 Sum: 47


44 57 22 11 8 9 Sum: 151
14 18 92 10 3 5 Sum: 142
4 1 53 17 66 88 Sum: 229
64 71 153 37 12 28 Sum: 365
Is the 2d Array diverse: true
*/