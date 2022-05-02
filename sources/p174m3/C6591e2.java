package p174m3;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import p174m3.AbstractC6609h;

public class C6591e2 extends Exception implements AbstractC6609h {
    public static final AbstractC6609h.AbstractC6610a<C6591e2> f20522c = C6586d2.f20517a;
    public final int f20523a;
    public final long f20524b;

    public C6591e2(Bundle bundle) {
        this(bundle.getString(m19929d(2)), m19930c(bundle), bundle.getInt(m19929d(0), 1000), bundle.getLong(m19929d(1), SystemClock.elapsedRealtime()));
    }

    public static RemoteException m19932a(String str) {
        return new RemoteException(str);
    }

    public static Throwable m19931b(Class<?> cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    public static Throwable m19930c(Bundle bundle) {
        String string = bundle.getString(m19929d(3));
        String string2 = bundle.getString(m19929d(4));
        Throwable th = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, C6591e2.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                th = m19931b(cls, string2);
            }
            if (th != null) {
                return th;
            }
        } catch (Throwable unused) {
        }
        return m19932a(string2);
    }

    public static String m19929d(int i) {
        return Integer.toString(i, 36);
    }

    public C6591e2(String str, Throwable th, int i, long j) {
        super(str, th);
        this.f20523a = i;
        this.f20524b = j;
    }
}
