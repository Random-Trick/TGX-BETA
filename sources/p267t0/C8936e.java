package p267t0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p256s0.C8606e;
import p352z0.C11216f;

public class C8936e extends C8941j {
    public static Class<?> f28799b = null;
    public static Constructor<?> f28800c = null;
    public static Method f28801d = null;
    public static Method f28802e = null;
    public static boolean f28803f = false;

    public static boolean m10904k(Object obj, String str, int i, boolean z) {
        m10901n();
        try {
            return ((Boolean) f28801d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static Typeface m10903l(Object obj) {
        m10901n();
        try {
            Object newInstance = Array.newInstance(f28799b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f28802e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void m10901n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f28803f) {
            f28803f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f28800c = constructor;
            f28799b = cls;
            f28801d = method;
            f28802e = method2;
        }
    }

    public static Object m10900o() {
        m10901n();
        try {
            return f28800c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Typeface mo10880b(Context context, C8606e.C8608b bVar, Resources resources, int i) {
        C8606e.C8609c[] a;
        Object o = m10900o();
        for (C8606e.C8609c cVar : bVar.m11940a()) {
            File e = C8945k.m10861e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C8945k.m10863c(e, resources, cVar.m11938b())) {
                    return null;
                }
                if (!m10904k(o, e.getPath(), cVar.m11935e(), cVar.m11934f())) {
                    return null;
                }
                e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return m10903l(o);
    }

    @Override
    public Typeface mo10879c(Context context, CancellationSignal cancellationSignal, C11216f.C11218b[] bVarArr, int i) {
        if (bVarArr.length < 1) {
            return null;
        }
        C11216f.C11218b h = mo10874h(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.m1198d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m = m10902m(openFileDescriptor);
            if (m != null && m.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface d = super.mo10878d(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return d;
        } catch (IOException unused) {
            return null;
        }
    }

    public final File m10902m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
