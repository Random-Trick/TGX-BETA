package t0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import k0.g;
import s0.e;
import z0.f;

public class f extends j {
    public static final Class<?> f22850b;
    public static final Constructor<?> f22851c;
    public static final Method f22852d;
    public static final Method f22853e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method2 = null;
            method = null;
        }
        f22851c = constructor;
        f22850b = cls;
        f22852d = method;
        f22853e = method2;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f22852d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance(f22850b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f22853e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean i() {
        Method method = f22852d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    public static Object j() {
        try {
            return f22851c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override
    public Typeface a(Context context, e.b bVar, Resources resources, int i10) {
        e.c[] a10;
        Object j10 = j();
        if (j10 == null) {
            return null;
        }
        for (e.c cVar : bVar.a()) {
            ByteBuffer b10 = k.b(context, resources, cVar.b());
            if (b10 == null || !g(j10, b10, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        return h(j10);
    }

    @Override
    public Typeface b(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i10) {
        Object j10 = j();
        if (j10 == null) {
            return null;
        }
        g gVar = new g();
        for (f.b bVar : bVarArr) {
            Uri d10 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d10);
            if (byteBuffer == null) {
                byteBuffer = k.f(context, cancellationSignal, d10);
                gVar.put(d10, byteBuffer);
            }
            if (byteBuffer == null || !g(j10, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface h10 = h(j10);
        if (h10 == null) {
            return null;
        }
        return Typeface.create(h10, i10);
    }
}
