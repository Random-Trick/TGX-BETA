package t0;

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
import s0.e;
import z0.f;

public class e extends j {
    public static Class<?> f22845b = null;
    public static Constructor<?> f22846c = null;
    public static Method f22847d = null;
    public static Method f22848e = null;
    public static boolean f22849f = false;

    public static boolean g(Object obj, String str, int i10, boolean z10) {
        j();
        try {
            return ((Boolean) f22847d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Typeface h(Object obj) {
        j();
        try {
            Object newInstance = Array.newInstance(f22845b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f22848e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void j() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f22849f) {
            f22849f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e10) {
                Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
                method2 = null;
                cls = null;
                method = null;
            }
            f22846c = constructor;
            f22845b = cls;
            f22847d = method;
            f22848e = method2;
        }
    }

    public static Object k() {
        j();
        try {
            return f22846c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public Typeface a(Context context, e.b bVar, Resources resources, int i10) {
        e.c[] a10;
        Object k10 = k();
        for (e.c cVar : bVar.a()) {
            File e10 = k.e(context);
            if (e10 == null) {
                return null;
            }
            try {
                if (!k.c(e10, resources, cVar.b())) {
                    return null;
                }
                if (!g(k10, e10.getPath(), cVar.e(), cVar.f())) {
                    return null;
                }
                e10.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e10.delete();
            }
        }
        return h(k10);
    }

    @Override
    public Typeface b(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i10) {
        if (bVarArr.length < 1) {
            return null;
        }
        f.b f10 = f(bVarArr, i10);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f10.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File i11 = i(openFileDescriptor);
            if (i11 != null && i11.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(i11);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c10 = super.c(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return c10;
        } catch (IOException unused) {
            return null;
        }
    }

    public final File i(ParcelFileDescriptor parcelFileDescriptor) {
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
