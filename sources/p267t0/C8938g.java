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
    public final Class<?> f28811g;
    public final Constructor<?> f28812h;
    public final Method f28813i;
    public final Method f28814j;
    public final Method f28815k;
    public final Method f28816l;
    public final Method f28817m;

    public C8938g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = m10884y();
            constructor = m10883z(y);
            method4 = m10886v(y);
            method3 = m10885w(y);
            method2 = m10894A(y);
            method = m10887u(y);
            method5 = mo10881x(y);
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
        this.f28811g = cls;
        this.f28812h = constructor;
        this.f28813i = method4;
        this.f28814j = method3;
        this.f28815k = method2;
        this.f28816l = method;
        this.f28817m = method5;
    }

    private Object m10893o() {
        try {
            return this.f28812h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method m10894A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override
    public Typeface mo10879b(Context context, C8606e.C8608b bVar, Resources resources, int i) {
        C8606e.C8609c[] a;
        if (!m10888t()) {
            return super.mo10879b(context, bVar, resources, i);
        }
        Object o = m10893o();
        if (o == null) {
            return null;
        }
        for (C8606e.C8609c cVar : bVar.m11939a()) {
            if (!m10891q(context, o, cVar.m11938a(), cVar.m11936c(), cVar.m11934e(), cVar.m11933f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.m11935d()))) {
                m10892p(o);
                return null;
            }
        }
        if (!m10889s(o)) {
            return null;
        }
        return mo10882l(o);
    }

    @Override
    public Typeface mo10878c(Context context, CancellationSignal cancellationSignal, C11216f.C11218b[] bVarArr, int i) {
        Typeface l;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m10888t()) {
            C11216f.C11218b h = mo10873h(bVarArr, i);
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
            Map<Uri, ByteBuffer> h2 = C8945k.m10857h(context, bVarArr, cancellationSignal);
            Object o = m10893o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (C11216f.C11218b bVar : bVarArr) {
                ByteBuffer byteBuffer = h2.get(bVar.m1198d());
                if (byteBuffer != null) {
                    if (!m10890r(o, byteBuffer, bVar.m1199c(), bVar.m1197e(), bVar.m1196f() ? 1 : 0)) {
                        m10892p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m10892p(o);
                return null;
            } else if (m10889s(o) && (l = mo10882l(o)) != null) {
                return Typeface.create(l, i);
            } else {
                return null;
            }
        }
    }

    @Override
    public Typeface mo10876e(Context context, Resources resources, int i, String str, int i2) {
        if (!m10888t()) {
            return super.mo10876e(context, resources, i, str, i2);
        }
        Object o = m10893o();
        if (o == null) {
            return null;
        }
        if (!m10891q(context, o, str, 0, -1, -1, null)) {
            m10892p(o);
            return null;
        } else if (!m10889s(o)) {
            return null;
        } else {
            return mo10882l(o);
        }
    }

    public Typeface mo10882l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f28811g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f28817m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void m10892p(Object obj) {
        try {
            this.f28816l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean m10891q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f28813i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m10890r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f28814j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m10889s(Object obj) {
        try {
            return ((Boolean) this.f28815k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m10888t() {
        if (this.f28813i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f28813i != null;
    }

    public Method m10887u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    public Method m10886v(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method m10885w(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method mo10881x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> m10884y() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> m10883z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}
