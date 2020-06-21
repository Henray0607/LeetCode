public class Solution028 {
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0)
            return 0;
        int len1 = haystack.length();
        int len2 = needle.length();
        int count = 0;
        for (int i = 0; i < len1 - len2 + 1; i++) {
            for (int j = 0; j < len2; j++) {
                if (haystack.charAt(i + j) == needle.charAt(j))
                    count++;
                else {
                    count = 0;
                    break;
                }
            }
            if (count == len2)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strStr(haystack, needle));
    }
}
