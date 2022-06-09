import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayTime) {
        return String.format("Well good %s, %s! It is truly lovely to see you!", dayTime, name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("The time is currently %s", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1);{
            return "What do you even need her for?";
        }
    }
}
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!


