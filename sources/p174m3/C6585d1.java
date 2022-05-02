package p174m3;

import java.util.HashSet;

public final class C6585d1 {
    public static final HashSet<String> f20515a = new HashSet<>();
    public static String f20516b = "goog.exo.core";

    public static synchronized void m19946a(String str) {
        synchronized (C6585d1.class) {
            if (f20515a.add(str)) {
                String str2 = f20516b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(str);
                f20516b = sb2.toString();
            }
        }
    }

    public static synchronized String m19945b() {
        String str;
        synchronized (C6585d1.class) {
            str = f20516b;
        }
        return str;
    }
}
