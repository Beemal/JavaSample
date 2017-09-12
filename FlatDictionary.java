import java.util.HashMap;
import java.util.Map;

/**
 * Created by bimalparajuli on 6/24/17.
 */
public class FlatDictionary {
    public static HashMap<String, String> resultMap = new HashMap<>();


    public static HashMap<String, String> dictionary(HashMap<String, Object> hmap){

        return resultMap;
    }
     static HashMap<String, Object> getKeyValFromNestedMap(HashMap<String, Object> hmap){
         for (Map.Entry e: hmap.entrySet()) {
             if (!(e.getValue() instanceof HashMap))
                 resultMap.put((String) e.getKey(), (String) e.getValue());
             else {
                   getKeyValFromNestedMap(hmap);
             }
         }
        return hmap;
    }

    public static void main(String[] args){

    }
}
