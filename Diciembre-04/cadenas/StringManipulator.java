package cadenas;

public class StringManipulator {

    public String trimAndConcat(String s1, String s2) {
        String result = "";
        result = result.concat(s1.trim());
        result = result.concat(s2.trim());
        return result;
    }

    public int getIndexOrNull(String s1, char c1) {
        return s1.indexOf(c1);
    }

    public int getIndexOrNull(String s1, String s2) {
        return s1.indexOf(s2);
    }

    public String concatSubstring(String s1, int init, int end, String s2) {
        return s1.substring(init, end).concat(s2);
    }

}