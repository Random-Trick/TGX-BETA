package p262s6;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class C8646a {
    public final String f27978a;

    public C8646a(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("UID: [");
        sb2.append(myUid);
        sb2.append("]  PID: [");
        sb2.append(myPid);
        sb2.append("] ");
        String sb3 = sb2.toString();
        String valueOf = String.valueOf(str);
        this.f27978a = valueOf.length() != 0 ? sb3.concat(valueOf) : new String(sb3);
    }

    public static String m11812f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb2.append(str2);
                sb2.append(" [");
                sb2.append(join);
                sb2.append("]");
                str2 = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb3.append(str);
        sb3.append(" : ");
        sb3.append(str2);
        return sb3.toString();
    }

    public final int m11817a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m11812f(this.f27978a, str, objArr));
        }
        return 0;
    }

    public final int m11816b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m11812f(this.f27978a, str, objArr));
        }
        return 0;
    }

    public final int m11815c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m11812f(this.f27978a, str, objArr), th);
        }
        return 0;
    }

    public final int m11814d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m11812f(this.f27978a, str, objArr));
        }
        return 0;
    }

    public final int m11813e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m11812f(this.f27978a, str, objArr));
        }
        return 0;
    }
}
