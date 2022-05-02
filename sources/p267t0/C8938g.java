package p267t0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p256s0.C8606e;
import p352z0.C11216f;

public class C8938g extends C8936e {
    public final Class<?> f28808g;
    public final Constructor<?> f28809h;
    public final Method f28810i;
    public final Method f28811j;
    public final Method f28812k;
    public final Method f28813l;
    public final Method f28814m;

    public C8938g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = m10885y();
            constructor = m10884z(y);
            method4 = m10887v(y);
            method3 = m10886w(y);
            method2 = m10895A(y);
            method = m10888u(y);
            method5 = mo10882x(y);
            cls = y;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f28808g = cls;
        this.f28809h = constructor;
        this.f28810i = method4;
        this.f28811j = method3;
        this.f28812k = method2;
        this.f28813l = method;
        this.f28814m = method5;
    }

    private Object m10894o() {
        try {
            return this.f28809h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method m10895A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override
    public Typeface mo10880b(Context context, C8606e.C8608b bVar, Resources resources, int i) {
        C8606e.C8609c[] a;
        if (!m10889t()) {
            return super.mo10880b(context, bVar, resources, i);
        }
        Object o = m10894o();
        if (o == null) {
            return null;
        }
        for (C8606e.C8609c cVar : bVar.m11940a()) {
            if (!m10892q(context, o, cVar.m11939a(), cVar.m11937c(), cVar.m11935e(), cVar.m11934f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.m11936d()))) {
                m10893p(o);
                return null;
            }
        }
        if (!m10890s(o)) {
            return null;
        }
        return mo10883l(o);
    }

    @Override
    public Typeface mo10879c(Context context, CancellationSignal cancellationSignal, C11216f.C11218b[] bVarArr, int i) {
        Typeface l;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m10889t()) {
            C11216f.C11218b h = mo10874h(bVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.m1198d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.m1197e()).setItalic(h.m1196f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> h2 = C8945k.m10858h(context, bVarArr, cancellationSignal);
            Object o = m10894o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (C11216f.C11218b bVar : bVarArr) {
                ByteBuffer byteBuffer = h2.get(bVar.m1198d());
                if (byteBuffer != null) {
                    if (!m10891r(o, byteBuffer, bVar.m1199c(), bVar.m1197e(), bVar.m1196f() ? 1 : 0)) {
                        m10893p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m10893p(o);
                return null;
            } else if (m10890s(o) && (l = mo10883l(o)) != null) {
                return Typeface.create(l, i);
            } else {
                return null;
            }
        }
    }

    @Override
    public Typeface mo10877e(Context context, Resources resources, int i, String str, int i2) {
        if (!m10889t()) {
            return super.mo10877e(context, resources, i, str, i2);
        }
        Object o = m10894o();
        if (o == null) {
            return null;
        }
        if (!m10892q(context, o, str, 0, -1, -1, null)) {
            m10893p(o);
            return null;
        } else if (!m10890s(o)) {
            return null;
        } else {
            return mo10883l(o);
        }
    }

    public Typeface mo10883l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f28808g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f28814m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void m10893p(Object obj) {
        try {
            this.f28813l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean m10892q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f28810i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m10891r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f28811j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m10890s(Object obj) {
        try {
            return ((Boolean) this.f28812k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m10889t() {
        if (this.f28810i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f28810i != null;
    }

    public Method m10888u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    public Method m10887v(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method m10886w(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method mo10882x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> m10885y() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> m10884z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}
