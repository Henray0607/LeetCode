public class Solution028 {
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0)
            return 0;
        int count = 0;
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i++) == needle.charAt(j))
                    count++;
                else {
                    count = 0;
                    break;
                }
                if (count == needle.length())
                    return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strStr(haystack, needle));
    }
}
