package m3;

import java.util.HashSet;

public final class n1 {
    public static final HashSet<String> f16846a = new HashSet<>();
    public static String f16847b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (n1.class) {
            if (f16846a.add(str)) {
                String str2 = f16847b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(str);
                f16847b = sb2.toString();
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (n1.class) {
            str = f16847b;
        }
        return str;
    }
}
