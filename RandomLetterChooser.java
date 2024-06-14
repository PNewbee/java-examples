
/**
 * RandomLetterChooser is designed as a sub-class of RandomStringChooser. Its sole purpose seems to
 * be to call the method RandomLetterChooser in its parent class.
 * 
 * @author (Stoll) 
 * @version (2/2017)
 */
public class RandomLetterChooser extends RandomStringChooser  {

    //Constructor
    public RandomLetterChooser(String str) {
        //A call to "super" must always be the first item in the constructor.
        super(getStringLetters(str));
    }

    /**
     * The getStringLetters() method gets a random character a string passed into it. 
     * <p>
     * <p>
     * @param Takes a string as an input
     * @returns Random character from the string that was passed into the method.
     */
    //IMPORTANT NOTE: The "static" keyword is essential so we can call this method before this 
    //  object is instantiated.
    public static String[] getStringLetters(String str)
    {
        String[] answer = new String[str.length()];
        for (int i=0; i<str.length(); i++) {
            answer[i] = str.substring(i, i+ 1);
        }    

        return answer;
    }
}
