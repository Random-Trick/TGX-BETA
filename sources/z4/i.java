package z4;

import c5.b0;
import c5.l0;
import java.util.regex.Pattern;
import m3.k2;

public final class i {
    public static final Pattern f26934a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(b0 b0Var) {
        String p10 = b0Var.p();
        return p10 != null && p10.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String[] C0 = l0.C0(str, "\\.");
        long j10 = 0;
        for (String str2 : l0.B0(C0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (C0.length == 2) {
            j11 += Long.parseLong(C0[1]);
        }
        return j11 * 1000;
    }

    public static void d(b0 b0Var) {
        int e10 = b0Var.e();
        if (!a(b0Var)) {
            b0Var.P(e10);
            String valueOf = String.valueOf(b0Var.p());
            throw k2.a(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "), null);
        }
    }
}
