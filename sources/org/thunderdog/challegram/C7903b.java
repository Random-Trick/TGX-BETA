package org.thunderdog.challegram;

import ge.C4868i;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;

public final class C7903b {

    public static final class C7904a {
        public static void m14398a(long j, int i, String str, Object... objArr) {
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
            C7903b.m14399d("notifications", sb2.toString() + str, objArr);
        }

        public static void m14397b(String str, Object... objArr) {
            m14398a(0L, -1, str, objArr);
        }

        public static void m14396c(String str, Object... objArr) {
            C7903b.m14399d("td_init", str, objArr);
        }
    }

    public static String m14401b(String str, Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return str;
        }
        try {
            return String.format(Locale.US, str, objArr);
        } catch (IllegalFormatException unused) {
            return "Failed: String.format(\"" + str.replace("\"", "\\\"") + "\", " + Arrays.toString(objArr) + ")";
        }
    }

    public static void m14400c(int i, String str, Object... objArr) {
        Client.m14793e(new TdApi.AddLogMessage(i, m14401b(str, objArr)));
    }

    public static void m14399d(String str, String str2, Object... objArr) {
        m14400c(C4868i.m24727c2().m24842M1().m24505h(str), str2, objArr);
    }
}
