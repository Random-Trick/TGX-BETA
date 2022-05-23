package y6;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import y6.f;

public final class t {

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    public static IBinder a(Class<?> cls, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z10) {
        try {
            return (IBinder) cls.getConstructor(IBinder.class, IBinder.class, IBinder.class, Boolean.TYPE).newInstance(iBinder, iBinder2, iBinder3, Boolean.valueOf(z10));
        } catch (IllegalAccessException e10) {
            String name = cls.getName();
            throw new a(name.length() != 0 ? "Unable to call the default constructor of ".concat(name) : new String("Unable to call the default constructor of "), e10);
        } catch (InstantiationException e11) {
            String name2 = cls.getName();
            throw new a(name2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name2) : new String("Unable to instantiate the dynamic class "), e11);
        } catch (NoSuchMethodException e12) {
            String name3 = cls.getName();
            throw new a(name3.length() != 0 ? "Could not find the right constructor for ".concat(name3) : new String("Could not find the right constructor for "), e12);
        } catch (InvocationTargetException e13) {
            String name4 = cls.getName();
            throw new a(name4.length() != 0 ? "Exception thrown by invoked constructor in ".concat(name4) : new String("Exception thrown by invoked constructor in "), e13);
        }
    }

    public static IBinder b(ClassLoader classLoader, String str, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z10) {
        try {
            return a(classLoader.loadClass(str), iBinder, iBinder2, iBinder3, z10);
        } catch (ClassNotFoundException e10) {
            String valueOf = String.valueOf(str);
            throw new a(valueOf.length() != 0 ? "Unable to find dynamic class ".concat(valueOf) : new String("Unable to find dynamic class "), e10);
        }
    }

    public static f c(Activity activity, IBinder iBinder, boolean z10) {
        b.a(activity);
        b.a(iBinder);
        Context c10 = w.c(activity);
        if (c10 != null) {
            return f.a.q(b(c10.getClassLoader(), "com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer", s.t(c10).asBinder(), s.t(activity).asBinder(), iBinder, z10));
        }
        throw new a("Could not create remote context");
    }
}
