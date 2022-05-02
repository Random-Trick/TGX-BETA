package p328x6;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import p328x6.AbstractC10111f;

public final class C10145t {

    public static final class C10146a extends Exception {
        public C10146a(String str) {
            super(str);
        }

        public C10146a(String str, Throwable th) {
            super(str, th);
        }
    }

    public static IBinder m5903a(Class<?> cls, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        try {
            return (IBinder) cls.getConstructor(IBinder.class, IBinder.class, IBinder.class, Boolean.TYPE).newInstance(iBinder, iBinder2, iBinder3, Boolean.valueOf(z));
        } catch (IllegalAccessException e) {
            String name = cls.getName();
            throw new C10146a(name.length() != 0 ? "Unable to call the default constructor of ".concat(name) : new String("Unable to call the default constructor of "), e);
        } catch (InstantiationException e2) {
            String name2 = cls.getName();
            throw new C10146a(name2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name2) : new String("Unable to instantiate the dynamic class "), e2);
        } catch (NoSuchMethodException e3) {
            String name3 = cls.getName();
            throw new C10146a(name3.length() != 0 ? "Could not find the right constructor for ".concat(name3) : new String("Could not find the right constructor for "), e3);
        } catch (InvocationTargetException e4) {
            String name4 = cls.getName();
            throw new C10146a(name4.length() != 0 ? "Exception thrown by invoked constructor in ".concat(name4) : new String("Exception thrown by invoked constructor in "), e4);
        }
    }

    public static IBinder m5902b(ClassLoader classLoader, String str, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        try {
            return m5903a(classLoader.loadClass(str), iBinder, iBinder2, iBinder3, z);
        } catch (ClassNotFoundException e) {
            String valueOf = String.valueOf(str);
            throw new C10146a(valueOf.length() != 0 ? "Unable to find dynamic class ".concat(valueOf) : new String("Unable to find dynamic class "), e);
        }
    }

    public static AbstractC10111f m5901c(Activity activity, IBinder iBinder, boolean z) {
        C10106b.m6017a(activity);
        C10106b.m6017a(iBinder);
        Context c = C10149w.m5894c(activity);
        if (c != null) {
            return AbstractC10111f.AbstractBinderC10112a.m6011q(m5902b(c.getClassLoader(), "com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer", BinderC10144s.m5904t(c).asBinder(), BinderC10144s.m5904t(activity).asBinder(), iBinder, z));
        }
        throw new C10146a("Could not create remote context");
    }
}
