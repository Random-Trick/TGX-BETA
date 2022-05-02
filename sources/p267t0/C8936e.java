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
    public static Class<?> f28802b = null;
    public static Constructor<?> f28803c = null;
    public static Method f28804d = null;
    public static Method f28805e = null;
    public static boolean f28806f = false;

    public static boolean m10903k(Object obj, String str, int i, boolean z) {
        m10900n();
        try {
            return ((Boolean) f28804d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static Typeface m10902l(Object obj) {
        m10900n();
        try {
            Object newInstance = Array.newInstance(f28802b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f28805e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void m10900n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f28806f) {
            f28806f = true;
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
            f28803c = constructor;
            f28802b = cls;
            f28804d = method;
            f28805e = method2;
        }
    }

    public static Object m10899o() {
        m10900n();
        try {
            return f28803c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Typeface mo10879b(Context context, C8606e.C8608b bVar, Resources resources, int i) {
        C8606e.C8609c[] a;
        Object o = m10899o();
        for (C8606e.C8609c cVar : bVar.m11939a()) {
            File e = C8945k.m10860e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C8945k.m10862c(e, resources, cVar.m11937b())) {
                    return null;
                }
                if (!m10903k(o, e.getPath(), cVar.m11934e(), cVar.m11933f())) {
                    return null;
                }
                e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return m10902l(o);
    }

    @Override
    public Typeface mo10878c(Context context, CancellationSignal cancellationSignal, C11216f.C11218b[] bVarArr, int i) {
        if (bVarArr.length < 1) {
            return null;
        }
        C11216f.C11218b h = mo10873h(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.m1198d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m = m10901m(openFileDescriptor);
            if (m != null && m.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface d = super.mo10877d(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return d;
        } catch (IOException unused) {
            return null;
        }
    }

    public final File m10901m(ParcelFileDescriptor parcelFileDescriptor) {
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
