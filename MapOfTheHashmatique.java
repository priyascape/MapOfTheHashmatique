import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique{
    public void retrieveTrackList(){

    HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Sweet", "My mum says that I look like a nervous wreck");
        trackList.put("Give/Take", "One, two, three, four, Don't you know what I've been waiting for?");
        trackList.put("Don't Ask me Twice", "I woke up, Dog was gone I walked around I felt alone");
        trackList.put("7 Seconds", "I've been waiting such a long time for you");
    
        String track = trackList.get("Don't Ask me Twice");
        System.out.println(track);

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}

