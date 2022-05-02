package p267t0;

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
import p143k0.C6037g;
import p256s0.C8606e;
import p352z0.C11216f;

public class C8937f extends C8941j {
    public static final Class<?> f28807b;
    public static final Constructor<?> f28808c;
    public static final Method f28809d;
    public static final Method f28810e;

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
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f28808c = constructor;
        f28807b = cls;
        f28809d = method;
        f28810e = method2;
    }

    public static boolean m10898k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f28809d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface m10897l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f28807b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f28810e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m10896m() {
        Method method = f28809d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    public static Object m10895n() {
        try {
            return f28808c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override
    public Typeface mo10879b(Context context, C8606e.C8608b bVar, Resources resources, int i) {
        C8606e.C8609c[] a;
        Object n = m10895n();
        if (n == null) {
            return null;
        }
        for (C8606e.C8609c cVar : bVar.m11939a()) {
            ByteBuffer b = C8945k.m10863b(context, resources, cVar.m11937b());
            if (b == null || !m10898k(n, b, cVar.m11936c(), cVar.m11934e(), cVar.m11933f())) {
                return null;
            }
        }
        return m10897l(n);
    }

    @Override
    public Typeface mo10878c(Context context, CancellationSignal cancellationSignal, C11216f.C11218b[] bVarArr, int i) {
        Object n = m10895n();
        if (n == null) {
            return null;
        }
        C6037g gVar = new C6037g();
        for (C11216f.C11218b bVar : bVarArr) {
            Uri d = bVar.m1198d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d);
            if (byteBuffer == null) {
                byteBuffer = C8945k.m10859f(context, cancellationSignal, d);
                gVar.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m10898k(n, byteBuffer, bVar.m1199c(), bVar.m1197e(), bVar.m1196f())) {
                return null;
            }
        }
        Typeface l = m10897l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i);
    }
}
