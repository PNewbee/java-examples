
/**
 * Write a description of class SystemLog here.
 * 
 * @author (Stoll and Internet) 
 * @version (2/2017)
 */

import java.util.*;

public class SystemLog  {
    // instance variables - replace the example below with your own
    // Create a private List of type LogMessage named messageList.  Remember LogMessage is the 
    //      class created earlier.
    private List<LogMessage> messageList;

    // constructor will return a list named <LogMessage>
    public List<LogMessage> removeMessage(String keyword) {
        List<LogMessage> answer = new ArrayList<LogMessage>();
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).containsWord(keyword)) {
                answer.add(messageList.get(i));
                messageList.remove(i);
                i--;    //Must go back one because we just removed the current array element.
            }
        }

        return answer;
    }

}

