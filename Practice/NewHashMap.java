import java.util.HashMap;
public class NewHashMap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> userMap= new HashMap<String, String>();
        // put in key-value pairs.  Key and Value are whatever you put in the string!!
        userMap.put("nninja@dojo.com", "Nancy Ninja");
        userMap.put("ssamurai@dojo.com", "Sam Samurai");
        // get key-value pairs out
        String name = userMap.get("nninja@dojo.com");
        System.out.println(name);
        HashMap<String, String> mailMap = new HashMap<String, String>();
        mailMap.put("Nancy Ninja", "nninja@dojo.com");
        String email = mailMap.get("Nancy Ninja");
        System.out.println(email);
    }
}
