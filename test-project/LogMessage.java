
/**
 * Write a description of class LogMessage here.
 * 
 * @author (Stoll and Internet) 
 * @version (2/2017)
 */
public class LogMessage  {
    // instance variables - replace the example below with your own
    private String machineId;
    private String description;

    /**
     * Constructor for objects of class LogMessage
     */
    public LogMessage(String message)
    {  
        int index = message.indexOf(":");
        machineId = message.substring(0, index);
        description = message.substring(index + 1);
        System.out.println("machineId: " + machineId + " description: " + description);

        /* A really cool way to do this that would be invalid.  Notice how close this is to Python.
         * The reason this is invalid is because the split() function is not part of the Java subset.
                String[] arr = message.split(":");
                machineId = arr[0];
                description = arr[1];               */
    }
    
    public boolean containsWord(String keyword) {
        int len = keyword.length();

        while (true)  {
            int i = description.indexOf(keyword);
           if (i < 0)
                return false;
            /* 
             * VALID CONDITION:
             * If the keyword is at the beginning or end of the description AND it is not part of another word
             */
            if ((i == 0 || description.substring(i-1, i).equals(" ")) &&  // Keyword is at beginning of description and preceeds a space.
                (i == description.length() - len ||                       // Keyword is not embedded inside other words.
                description.substring(i + len, i + len + 1).equals(" "))) // There is a sp
                    return true;
                    
            description = description.substring(i + len);
        }
        
    }
    public String getMachineID() {
        return machineId;
    }
    
    public String getDescription() {
        return description;
    }
    
}