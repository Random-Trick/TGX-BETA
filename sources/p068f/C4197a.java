package p068f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0487w;
import java.util.WeakHashMap;
import p227q0.C8117a;
import p256s0.C8604c;

@SuppressLint({"RestrictedAPI"})
public final class C4197a {
    public static final ThreadLocal<TypedValue> f14190a = new ThreadLocal<>();
    public static final WeakHashMap<Context, SparseArray<C4198a>> f14191b = new WeakHashMap<>(0);
    public static final Object f14192c = new Object();

    public static class C4198a {
        public final ColorStateList f14193a;
        public final Configuration f14194b;

        public C4198a(ColorStateList colorStateList, Configuration configuration) {
            this.f14193a = colorStateList;
            this.f14194b = configuration;
        }
    }

    public static void m28487a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f14192c) {
            WeakHashMap<Context, SparseArray<C4198a>> weakHashMap = f14191b;
            SparseArray<C4198a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i, new C4198a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    public static ColorStateList m28486b(Context context, int i) {
        C4198a aVar;
        synchronized (f14192c) {
            SparseArray<C4198a> sparseArray = f14191b.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i)) == null)) {
                if (aVar.f14194b.equals(context.getResources().getConfiguration())) {
                    return aVar.f14193a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static ColorStateList m28485c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList b = m28486b(context, i);
        if (b != null) {
            return b;
        }
        ColorStateList f = m28482f(context, i);
        if (f == null) {
            return C8117a.m13439e(context, i);
        }
        m28487a(context, i, f);
        return f;
    }

    public static Drawable m28484d(Context context, int i) {
        return C0487w.m41062h().m41060j(context, i);
    }

    public static TypedValue m28483e() {
        ThreadLocal<TypedValue> threadLocal = f14190a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList m28482f(Context context, int i) {
        if (m28481g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C8604c.m11968a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    public static boolean m28481g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue e = m28483e();
        resources.getValue(i, e, true);
        int i2 = e.type;
        return i2 >= 28 && i2 <= 31;
    }
}
