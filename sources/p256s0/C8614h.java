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
    public static final ThreadLocal<TypedValue> f27902a = new ThreadLocal<>();
    public static final WeakHashMap<C8617c, SparseArray<C8616b>> f27903b = new WeakHashMap<>(0);
    public static final Object f27904c = new Object();

    public static class C8615a {
        public static ColorStateList m11912a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    public static class C8616b {
        public final ColorStateList f27905a;
        public final Configuration f27906b;

        public C8616b(ColorStateList colorStateList, Configuration configuration) {
            this.f27905a = colorStateList;
            this.f27906b = configuration;
        }
    }

    public static final class C8617c {
        public final Resources f27907a;
        public final Resources.Theme f27908b;

        public C8617c(Resources resources, Resources.Theme theme) {
            this.f27907a = resources;
            this.f27908b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8617c.class != obj.getClass()) {
                return false;
            }
            C8617c cVar = (C8617c) obj;
            return this.f27907a.equals(cVar.f27907a) && C1128d.m38333a(this.f27908b, cVar.f27908b);
        }

        public int hashCode() {
            return C1128d.m38332b(this.f27907a, this.f27908b);
        }
    }

    public static abstract class AbstractC8618d {

        public class RunnableC8619a implements Runnable {
            public final Typeface f27909a;

            public RunnableC8619a(Typeface typeface) {
                this.f27909a = typeface;
            }

            @Override
            public void run() {
                AbstractC8618d.this.mo11907e(this.f27909a);
            }
        }

        public class RunnableC8620b implements Runnable {
            public final int f27911a;

            public RunnableC8620b(int i) {
                this.f27911a = i;
            }

            @Override
            public void run() {
                AbstractC8618d.this.mo11908d(this.f27911a);
            }
        }

        public static Handler m11909c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void m11911a(int i, Handler handler) {
            m11909c(handler).post(new RunnableC8620b(i));
        }

        public final void m11910b(Typeface typeface, Handler handler) {
            m11909c(handler).post(new RunnableC8619a(typeface));
        }

        public abstract void mo11908d(int i);

        public abstract void mo11907e(Typeface typeface);
    }

    public static void m11922a(C8617c cVar, int i, ColorStateList colorStateList) {
        synchronized (f27904c) {
            WeakHashMap<C8617c, SparseArray<C8616b>> weakHashMap = f27903b;
            SparseArray<C8616b> sparseArray = weakHashMap.get(cVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(cVar, sparseArray);
            }
            sparseArray.append(i, new C8616b(colorStateList, cVar.f27907a.getConfiguration()));
        }
    }

    public static ColorStateList m11921b(C8617c cVar, int i) {
        C8616b bVar;
        synchronized (f27904c) {
            SparseArray<C8616b> sparseArray = f27903b.get(cVar);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (bVar = sparseArray.get(i)) == null)) {
                if (bVar.f27906b.equals(cVar.f27907a.getConfiguration())) {
                    return bVar.f27905a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static ColorStateList m11920c(Resources resources, int i, Resources.Theme theme) {
        C8617c cVar = new C8617c(resources, theme);
        ColorStateList b = m11921b(cVar, i);
        if (b != null) {
            return b;
        }
        ColorStateList g = m11916g(resources, i, theme);
        if (g != null) {
            m11922a(cVar, i, g);
            return g;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return C8615a.m11912a(resources, i, theme);
        } else {
            return resources.getColorStateList(i);
        }
    }

    public static Drawable m11919d(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static Typeface m11918e(Context context, int i, TypedValue typedValue, int i2, AbstractC8618d dVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m11914i(context, i, typedValue, i2, dVar, null, true, false);
    }

    public static TypedValue m11917f() {
        ThreadLocal<TypedValue> threadLocal = f27902a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList m11916g(Resources resources, int i, Resources.Theme theme) {
        if (m11915h(resources, i)) {
            return null;
        }
        try {
            return C8604c.m11968a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    public static boolean m11915h(Resources resources, int i) {
        TypedValue f = m11917f();
        resources.getValue(i, f, true);
        int i2 = f.type;
        return i2 >= 28 && i2 <= 31;
    }

    public static Typeface m11914i(Context context, int i, TypedValue typedValue, int i2, AbstractC8618d dVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface j = m11913j(context, resources, typedValue, i, i2, dVar, handler, z, z2);
        if (j != null || dVar != null || z2) {
            return j;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    public static android.graphics.Typeface m11913j(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, p256s0.C8614h.AbstractC8618d r20, android.os.Handler r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: p256s0.C8614h.m11913j(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, s0.h$d, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
