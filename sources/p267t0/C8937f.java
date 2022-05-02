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
    public static final Class<?> f28804b;
    public static final Constructor<?> f28805c;
    public static final Method f28806d;
    public static final Method f28807e;

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
        f28805c = constructor;
        f28804b = cls;
        f28806d = method;
        f28807e = method2;
    }

    public static boolean m10899k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f28806d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface m10898l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f28804b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f28807e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m10897m() {
        Method method = f28806d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    public static Object m10896n() {
        try {
            return f28805c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override
    public Typeface mo10880b(Context context, C8606e.C8608b bVar, Resources resources, int i) {
        C8606e.C8609c[] a;
        Object n = m10896n();
        if (n == null) {
            return null;
        }
        for (C8606e.C8609c cVar : bVar.m11940a()) {
            ByteBuffer b = C8945k.m10864b(context, resources, cVar.m11938b());
            if (b == null || !m10899k(n, b, cVar.m11937c(), cVar.m11935e(), cVar.m11934f())) {
                return null;
            }
        }
        return m10898l(n);
    }

    @Override
    public Typeface mo10879c(Context context, CancellationSignal cancellationSignal, C11216f.C11218b[] bVarArr, int i) {
        Object n = m10896n();
        if (n == null) {
            return null;
        }
        C6037g gVar = new C6037g();
        for (C11216f.C11218b bVar : bVarArr) {
            Uri d = bVar.m1198d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d);
            if (byteBuffer == null) {
                byteBuffer = C8945k.m10860f(context, cancellationSignal, d);
                gVar.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m10899k(n, byteBuffer, bVar.m1199c(), bVar.m1197e(), bVar.m1196f())) {
                return null;
            }
        }
        Typeface l = m10898l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i);
    }
}
