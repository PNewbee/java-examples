package FRQ_2016;

import java.util.ArrayList;

/**
 * RandomStringChooser accepts an array of strings and places them in an ArrayList.
 * <p>
 * It is critical for students to import java.util.ArrayList. 
 * <p>
 * @param An array of strings is passed into the constructor upon creation instantiation. 
 * @author (http://www.skylit.com/beprepared/x2016a1.html) 
 * @version (2/2017)
 */

public class RandomStringChooser  {

    private ArrayList<String> words;

    public RandomStringChooser(String[] wordArray)
    {
        words = new ArrayList<String>();
        for (String w : wordArray)
            words.add(w);
    }

    /**
     * The getNext() method gets the next random string from the ArrayList. 
     * <p>
     * It removes the element and returns the selected string.  
     * 'NONE' is returned If there are no strings remaining in the array.
     * IMPORTANT: The remove(i) function returns the element formerly at index i.
     * <p>
     * @returns Random array element
     */
    public String getNext()
    {
        if (words.size() == 0)
            return "NONE"; 
        int i = (int)(Math.random() * words.size());
        return words.remove(i);
    }
    
} 






