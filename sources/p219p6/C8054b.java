package p219p6;

public final class C8054b {
    public static String m13690a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    public static String m13689b(String str, String str2, String str3) {
        int length = String.valueOf(str2).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + length + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str3);
        return sb2.toString();
    }
}
