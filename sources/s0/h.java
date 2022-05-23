package s0;

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

public final class h {
    public static final ThreadLocal<TypedValue> f22418a = new ThreadLocal<>();
    public static final WeakHashMap<c, SparseArray<b>> f22419b = new WeakHashMap<>(0);
    public static final Object f22420c = new Object();

    public static class a {
        public static ColorStateList a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    public static class b {
        public final ColorStateList f22421a;
        public final Configuration f22422b;

        public b(ColorStateList colorStateList, Configuration configuration) {
            this.f22421a = colorStateList;
            this.f22422b = configuration;
        }
    }

    public static final class c {
        public final Resources f22423a;
        public final Resources.Theme f22424b;

        public c(Resources resources, Resources.Theme theme) {
            this.f22423a = resources;
            this.f22424b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f22423a.equals(cVar.f22423a) && b1.d.a(this.f22424b, cVar.f22424b);
        }

        public int hashCode() {
            return b1.d.b(this.f22423a, this.f22424b);
        }
    }

    public static abstract class d {

        public class a implements Runnable {
            public final Typeface f22425a;

            public a(Typeface typeface) {
                this.f22425a = typeface;
            }

            @Override
            public void run() {
                d.this.e(this.f22425a);
            }
        }

        public class b implements Runnable {
            public final int f22427a;

            public b(int i10) {
                this.f22427a = i10;
            }

            @Override
            public void run() {
                d.this.d(this.f22427a);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i10, Handler handler) {
            c(handler).post(new b(i10));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i10);

        public abstract void e(Typeface typeface);
    }

    public static void a(c cVar, int i10, ColorStateList colorStateList) {
        synchronized (f22420c) {
            WeakHashMap<c, SparseArray<b>> weakHashMap = f22419b;
            SparseArray<b> sparseArray = weakHashMap.get(cVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(cVar, sparseArray);
            }
            sparseArray.append(i10, new b(colorStateList, cVar.f22423a.getConfiguration()));
        }
    }

    public static ColorStateList b(c cVar, int i10) {
        b bVar;
        synchronized (f22420c) {
            SparseArray<b> sparseArray = f22419b.get(cVar);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (bVar = sparseArray.get(i10)) == null)) {
                if (bVar.f22422b.equals(cVar.f22423a.getConfiguration())) {
                    return bVar.f22421a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    public static ColorStateList c(Resources resources, int i10, Resources.Theme theme) {
        c cVar = new c(resources, theme);
        ColorStateList b10 = b(cVar, i10);
        if (b10 != null) {
            return b10;
        }
        ColorStateList g10 = g(resources, i10, theme);
        if (g10 != null) {
            a(cVar, i10, g10);
            return g10;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return a.a(resources, i10, theme);
        } else {
            return resources.getColorStateList(i10);
        }
    }

    public static Drawable d(Resources resources, int i10, Resources.Theme theme) {
        return resources.getDrawable(i10, theme);
    }

    public static Typeface e(Context context, int i10, TypedValue typedValue, int i11, d dVar) {
        if (context.isRestricted()) {
            return null;
        }
        return i(context, i10, typedValue, i11, dVar, null, true, false);
    }

    public static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f22418a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList g(Resources resources, int i10, Resources.Theme theme) {
        if (h(resources, i10)) {
            return null;
        }
        try {
            return s0.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    public static boolean h(Resources resources, int i10) {
        TypedValue f10 = f();
        resources.getValue(i10, f10, true);
        int i11 = f10.type;
        return i11 >= 28 && i11 <= 31;
    }

    public static Typeface i(Context context, int i10, TypedValue typedValue, int i11, d dVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface j10 = j(context, resources, typedValue, i10, i11, dVar, handler, z10, z11);
        if (j10 != null || dVar != null || z11) {
            return j10;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    public static android.graphics.Typeface j(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, s0.h.d r20, android.os.Handler r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: s0.h.j(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, s0.h$d, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
