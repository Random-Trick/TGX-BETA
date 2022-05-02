package p341y4;

import java.util.regex.Pattern;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p174m3.C6556a2;

public final class C10384i {
    public static final Pattern f33418a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean m5204a(C1189b0 b0Var) {
        String p = b0Var.m38130p();
        return p != null && p.startsWith("WEBVTT");
    }

    public static float m5203b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long m5202c(String str) {
        String[] B0 = C1216l0.m38021B0(str, "\\.");
        long j = 0;
        for (String str2 : C1216l0.m38023A0(B0[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (B0.length == 2) {
            j2 += Long.parseLong(B0[1]);
        }
        return j2 * 1000;
    }

    public static void m5201d(C1189b0 b0Var) {
        int e = b0Var.m38141e();
        if (!m5204a(b0Var)) {
            b0Var.m38147P(e);
            String valueOf = String.valueOf(b0Var.m38130p());
            throw C6556a2.m20113a(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "), null);
        }
    }
}
