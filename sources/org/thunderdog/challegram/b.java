package org.thunderdog.challegram;

import he.i;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;

public final class b {

    public static final class a {
        public static void a(long j10, int i10, String str, Object... objArr) {
            StringBuilder sb2 = new StringBuilder("[fcm");
            if (j10 != 0) {
                sb2.append(":");
                sb2.append(j10);
            }
            if (i10 != -1) {
                sb2.append(",account:");
                sb2.append(i10);
            }
            sb2.append("]: ");
            b.d("notifications", sb2.toString() + str, objArr);
        }

        public static void b(String str, Object... objArr) {
            a(0L, -1, str, objArr);
        }

        public static void c(String str, Object... objArr) {
            b.d("td_init", str, objArr);
        }
    }

    public static String b(String str, Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return str;
        }
        try {
            return String.format(Locale.US, str, objArr);
        } catch (IllegalFormatException unused) {
            return "Failed: String.format(\"" + str.replace("\"", "\\\"") + "\", " + Arrays.toString(objArr) + ")";
        }
    }

    public static void c(int i10, String str, Object... objArr) {
        Client.e(new TdApi.AddLogMessage(i10, b(str, objArr)));
    }

    public static void d(String str, String str2, Object... objArr) {
        c(i.c2().M1().h(str), str2, objArr);
    }
}
