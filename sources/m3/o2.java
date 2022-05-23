package m3;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import m3.h;

public class o2 extends Exception implements h {
    public static final h.a<o2> f16855c = n2.f16848a;
    public final int f16856a;
    public final long f16857b;

    public o2(Bundle bundle) {
        this(bundle.getString(d(2)), c(bundle), bundle.getInt(d(0), 1000), bundle.getLong(d(1), SystemClock.elapsedRealtime()));
    }

    public static RemoteException a(String str) {
        return new RemoteException(str);
    }

    public static Throwable b(Class<?> cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    public static Throwable c(Bundle bundle) {
        String string = bundle.getString(d(3));
        String string2 = bundle.getString(d(4));
        Throwable th = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, o2.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                th = b(cls, string2);
            }
            if (th != null) {
                return th;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public o2(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f16856a = i10;
        this.f16857b = j10;
    }
}
