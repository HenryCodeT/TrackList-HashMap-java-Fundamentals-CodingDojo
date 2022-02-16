import java.util.HashMap;
import java.util.Set;
/**
 * TracklistHashMap
 */
public class TracklistHashMap {
    public static void main(String[] args) {
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("Say Something","Say something, I'm giving up on you");        
        trackList.put("Angels","I sit and wait Does an angel contemplate my fate");        
        trackList.put("Feel","In the cool shade of the banana tree");        
        trackList.put("Without me","Obie Trice, real name no gimmicks");    
        
        Set<String> keys = trackList.keySet();
        for (String string : keys) {
            System.out.println(string + ": "+trackList.get(string));
        }
    }
}