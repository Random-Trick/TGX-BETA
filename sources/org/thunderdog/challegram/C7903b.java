package org.thunderdog.challegram;

import ge.C4868i;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;

public final class C7903b {

    public static final class C7904a {
        public static void m14399a(long j, int i, String str, Object... objArr) {
            StringBuilder sb2 = new StringBuilder("[fcm");
            if (j != 0) {
                sb2.append(":");
                sb2.append(j);
            }
            if (i != -1) {
                sb2.append(",account:");
                sb2.append(i);
            }
            sb2.append("]: ");
            C7903b.m14400d("notifications", sb2.toString() + str, objArr);
        }

        public static void m14398b(String str, Object... objArr) {
            m14399a(0L, -1, str, objArr);
        }

        public static void m14397c(String str, Object... objArr) {
            C7903b.m14400d("td_init", str, objArr);
        }
    }

    public static String m14402b(String str, Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return str;
        }
        try {
            return String.format(Locale.US, str, objArr);
        } catch (IllegalFormatException unused) {
            return "Failed: String.format(\"" + str.replace("\"", "\\\"") + "\", " + Arrays.toString(objArr) + ")";
        }
    }

    public static void m14401c(int i, String str, Object... objArr) {
        Client.m14793e(new TdApi.AddLogMessage(i, m14402b(str, objArr)));
    }

    public static void m14400d(String str, String str2, Object... objArr) {
        m14401c(C4868i.m24726c2().m24841M1().m24504h(str), str2, objArr);
    }
}
