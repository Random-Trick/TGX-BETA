package p343y6;

public final class C10422b {
    public static boolean m5151a(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean m5150b(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static String m5149c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m5150b(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m5150b(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String m5148d(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m5151a(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m5151a(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
