package FRQ_2016;


/**
 * Used to test the LogMessage and SystemLog classes.
 * 
 * @author (Stoll)
 * @version (2/2017)
 */
public class LogDriver
{
    LogMessage[] messageArray = new LogMessage[5];
    LogMessage myMessage = new LogMessage("CLIENT3:security alert - repeated login failures");
    messageArray[0] = myMessage;
    LogMessage myMessage = new LogMessage("Webserver:disk offline");
    messageArray[1] = myMessage;
    LogMessage myMessage = new LogMessge("SERVER1:file not found");
    messageArray[2] = myMessage;
    LogMessage myMessage = new LogMessage("SERVER2:read error in disk DSK1");
    messageArray[3] = myMessage;
    LogMessage myMessage = new LogMessage("SERVER1:write error on disk DSK2");
    messageArray[4] = myMessage;
    LogMessage myMessage = new LogMessage("Webserver:error on /dev/disk");
    messageArray[5] = myMessage;
        
    SystemLog log = new SystemLog(myMessage);
        

    
    
    
}
