import java.util.Set;
import java.util.HashMap;
public class TrackList {
    public static void main(String[] args) {
        HashMap<String, String> trackListMap = new HashMap<String, String>();
        trackListMap.put("Korn: Freak on a Leash", "Something takes a part of me Something lost and never seen Every time I start to believe Something's raped and taken from me, from me");
        trackListMap.put("Korn: Blind", "This place inside my mind A place I like to hide You don't know the chances What if I should die?");
        trackListMap.put("Korn: Fake", "I can't stand the sight of you I can't stand what you put me through Your life's a lie that you'll hide Is it that terrible being you inside?");
        trackListMap.put("Korn: Falling away from me", "Hey, I'm feeling tired My time has gone today You flirt with suicide Sometimes that's okay Do what others say I'm here standing hollow Falling away from me Falling away from me");
        //get the keys by using the keySet method
        String song = "Korn: Fake";
        String title = trackListMap.get("Korn: Fake");
        System.out.println(song);
        System.out.println(title);
        Set<String> keys = trackListMap.keySet();
        for(String key : keys) {
            // key returns keys because of keySet utility in java
            System.out.println(key);
            // .get retrives key values
            System.out.println(trackListMap.get(key));
        }
    }
}
