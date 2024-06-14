 


/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver  {

    public Driver() {
        
        // Test RandomStringChooser
        String[] wordArray = {"Tonya", "Steve", "Kyle", "Ryan", "Skittles"};
        
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        System.out.println("*** Executing RandomStringChooser ***");
        //Note we add two to the number of loops to test that "NONE" is returned when the array is 
        //  empty.
        for (int i = 0; i < wordArray.length + 2; i++) {
            System.out.print(sChooser.getNext() + " ");
        }
        
        //Test RandomLetterChooser
        RandomLetterChooser lChooser = new RandomLetterChooser("Hello");

        System.out.println("\n\n*** Executing RandomletterChooser ***");
        for (int i = 0; i < wordArray.length + 2; i++) {
            System.out.print(lChooser.getNext() + " ");
        }
    }
}
