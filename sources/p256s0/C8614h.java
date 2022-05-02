package p256s0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p016b1.C1128d;

public final class C8614h {
    public static final ThreadLocal<TypedValue> f27905a = new ThreadLocal<>();
    public static final WeakHashMap<C8617c, SparseArray<C8616b>> f27906b = new WeakHashMap<>(0);
    public static final Object f27907c = new Object();

    public static class C8615a {
        public static ColorStateList m11911a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    public static class C8616b {
        public final ColorStateList f27908a;
        public final Configuration f27909b;

        public C8616b(ColorStateList colorStateList, Configuration configuration) {
            this.f27908a = colorStateList;
            this.f27909b = configuration;
        }
    }

    public static final class C8617c {
        public final Resources f27910a;
        public final Resources.Theme f27911b;

        public C8617c(Resources resources, Resources.Theme theme) {
            this.f27910a = resources;
            this.f27911b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8617c.class != obj.getClass()) {
                return false;
            }
            C8617c cVar = (C8617c) obj;
            return this.f27910a.equals(cVar.f27910a) && C1128d.m38336a(this.f27911b, cVar.f27911b);
        }

        public int hashCode() {
            return C1128d.m38335b(this.f27910a, this.f27911b);
        }
    }

    public static abstract class AbstractC8618d {

        public class RunnableC8619a implements Runnable {
            public final Typeface f27912a;

            public RunnableC8619a(Typeface typeface) {
                this.f27912a = typeface;
            }

            @Override
            public void run() {
                AbstractC8618d.this.mo11906e(this.f27912a);
            }
        }

        public class RunnableC8620b implements Runnable {
            public final int f27914a;

            public RunnableC8620b(int i) {
                this.f27914a = i;
            }

            @Override
            public void run() {
                AbstractC8618d.this.mo11907d(this.f27914a);
            }
        }

        public static Handler m11908c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void m11910a(int i, Handler handler) {
            m11908c(handler).post(new RunnableC8620b(i));
        }

        public final void m11909b(Typeface typeface, Handler handler) {
            m11908c(handler).post(new RunnableC8619a(typeface));
        }

        public abstract void mo11907d(int i);

        public abstract void mo11906e(Typeface typeface);
    }

    public static void m11921a(C8617c cVar, int i, ColorStateList colorStateList) {
        synchronized (f27907c) {
            WeakHashMap<C8617c, SparseArray<C8616b>> weakHashMap = f27906b;
            SparseArray<C8616b> sparseArray = weakHashMap.get(cVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(cVar, sparseArray);
            }
            sparseArray.append(i, new C8616b(colorStateList, cVar.f27910a.getConfiguration()));
        }
    }

    public static ColorStateList m11920b(C8617c cVar, int i) {
        C8616b bVar;
        synchronized (f27907c) {
            SparseArray<C8616b> sparseArray = f27906b.get(cVar);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (bVar = sparseArray.get(i)) == null)) {
                if (bVar.f27909b.equals(cVar.f27910a.getConfiguration())) {
                    return bVar.f27908a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static ColorStateList m11919c(Resources resources, int i, Resources.Theme theme) {
        C8617c cVar = new C8617c(resources, theme);
        ColorStateList b = m11920b(cVar, i);
        if (b != null) {
            return b;
        }
        ColorStateList g = m11915g(resources, i, theme);
        if (g != null) {
            m11921a(cVar, i, g);
            return g;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return C8615a.m11911a(resources, i, theme);
        } else {
            return resources.getColorStateList(i);
        }
    }

    public static Drawable m11918d(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static Typeface m11917e(Context context, int i, TypedValue typedValue, int i2, AbstractC8618d dVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m11913i(context, i, typedValue, i2, dVar, null, true, false);
    }

    public static TypedValue m11916f() {
        ThreadLocal<TypedValue> threadLocal = f27905a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList m11915g(Resources resources, int i, Resources.Theme theme) {
        if (m11914h(resources, i)) {
            return null;
        }
        try {
            return C8604c.m11967a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    public static boolean m11914h(Resources resources, int i) {
        TypedValue f = m11916f();
        resources.getValue(i, f, true);
        int i2 = f.type;
        return i2 >= 28 && i2 <= 31;
    }

    public static Typeface m11913i(Context context, int i, TypedValue typedValue, int i2, AbstractC8618d dVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface j = m11912j(context, resources, typedValue, i, i2, dVar, handler, z, z2);
        if (j != null || dVar != null || z2) {
            return j;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    public static android.graphics.Typeface m11912j(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, p256s0.C8614h.AbstractC8618d r20, android.os.Handler r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: p256s0.C8614h.m11912j(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, s0.h$d, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
