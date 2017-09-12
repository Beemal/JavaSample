import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by bimalparajuli on 7/3/17.
 */
public class ShortUniqueSubString {
    public static void main(String args[]){
        Character[] arr = {'x','y','z'};
        String str = "zyx";
        System.out.println(getShortestUniqueSubString(arr, str));
    }

    private static String getShortestUniqueSubString(Character[] arr, String str) {
        String S = arr.toString();
        String T = str;
        int min = S.length()+1, index1 = -1, index2 = -1;
        ArrayList<ArrayList<Integer>> index = new ArrayList<ArrayList<Integer>>();
        HashSet<Character> targetChars = new HashSet<Character>();
        for(char c : T.toCharArray()) targetChars.add(c);

        //reduce initial sequence to only target chars and keep track of index
        //Note that the resultant string does not allow the same char to be consecutive

        StringBuilder filterS = new StringBuilder();
        for(int i = 0, s = 0 ; i < S.length() ; i++) {
            char c = S.charAt(i);
            if(targetChars.contains(c)) {
                if(s > 0 && filterS.charAt(s-1) == c) {
                    index.get(s-1).add(i);
                } else {
                    filterS.append(c);
                    index.add(new ArrayList<Integer>());
                    index.get(s).add(i);
                    s++;
                }
            }
        }

        //Not necessary to use regex, loops are fine, but for readability sake
        String regex = "([abc])((?!\\1)[abc])((?!\\1)(?!\\2)[abc])";
        Matcher m = Pattern.compile(regex).matcher(filterS.toString());

        for(int i = 0, start = -1, p1, p2, tempMin, charSize = targetChars.size() ; m.find(i) ; i = start+1) {
            start = m.start();
            ArrayList<Integer> first = index.get(start);
            p1 = first.get(first.size()-1);
            p2 = index.get(start+charSize-1).get(0);
            tempMin = p2-p1;

            if(tempMin < min) {
                min = tempMin;
                index1 = p1;
                index2 = p2;
            }
        }

        return S.substring(index1, index2+1);
    }
}
