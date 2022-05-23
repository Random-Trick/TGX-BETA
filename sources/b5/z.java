package b5;

import android.text.TextUtils;
import c5.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class z {
    public static final Pattern f4010a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    public static final Pattern f4011b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j10);
        sb2.append("-");
        if (j11 != -1) {
            sb2.append((j10 + j11) - 1);
        }
        return sb2.toString();
    }

    public static long b(java.lang.String r9, java.lang.String r10) {
        throw new UnsupportedOperationException("Method not decompiled: b5.z.b(java.lang.String, java.lang.String):long");
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f4011b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) a.e(matcher.group(1)));
        }
        return -1L;
    }
}
