package p006a5;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p020b5.C1186a;

public final class C0187z {
    public static final Pattern f665a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    public static final Pattern f666b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String m42130a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j);
        sb2.append("-");
        if (j2 != -1) {
            sb2.append((j + j2) - 1);
        }
        return sb2.toString();
    }

    public static long m42129b(java.lang.String r9, java.lang.String r10) {
        throw new UnsupportedOperationException("Method not decompiled: p006a5.C0187z.m42129b(java.lang.String, java.lang.String):long");
    }

    public static long m42128c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f666b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) C1186a.m38185e(matcher.group(1)));
        }
        return -1L;
    }
}
