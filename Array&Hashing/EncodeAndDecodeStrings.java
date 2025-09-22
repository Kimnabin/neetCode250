import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    public static String encode(List<String> strs){
        StringBuilder encodeStrs = new StringBuilder();
        for (String str : strs) {
            encodeStrs.append(str.length()).append("#").append(str);
        }
        return encodeStrs.toString();
    }

    public static List<String> decode(String str){
        List<String> decodeStrs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, j));
            String substr = str.substring(j + 1, j + 1 + length);
            decodeStrs.add(substr);
            i = j + 1 + length;
        }
        return decodeStrs;
    }
}