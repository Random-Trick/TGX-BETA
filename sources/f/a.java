package f;

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
import androidx.appcompat.widget.w;
import java.util.WeakHashMap;
import s0.c;

@SuppressLint({"RestrictedAPI"})
public final class a {
    public static final ThreadLocal<TypedValue> f11751a = new ThreadLocal<>();
    public static final WeakHashMap<Context, SparseArray<C0099a>> f11752b = new WeakHashMap<>(0);
    public static final Object f11753c = new Object();

    public static class C0099a {
        public final ColorStateList f11754a;
        public final Configuration f11755b;

        public C0099a(ColorStateList colorStateList, Configuration configuration) {
            this.f11754a = colorStateList;
            this.f11755b = configuration;
        }
    }

    public static void a(Context context, int i10, ColorStateList colorStateList) {
        synchronized (f11753c) {
            WeakHashMap<Context, SparseArray<C0099a>> weakHashMap = f11752b;
            SparseArray<C0099a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i10, new C0099a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    public static ColorStateList b(Context context, int i10) {
        C0099a aVar;
        synchronized (f11753c) {
            SparseArray<C0099a> sparseArray = f11752b.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i10)) == null)) {
                if (aVar.f11755b.equals(context.getResources().getConfiguration())) {
                    return aVar.f11754a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    public static ColorStateList c(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i10);
        }
        ColorStateList b10 = b(context, i10);
        if (b10 != null) {
            return b10;
        }
        ColorStateList f10 = f(context, i10);
        if (f10 == null) {
            return q0.a.c(context, i10);
        }
        a(context, i10, f10);
        return f10;
    }

    public static Drawable d(Context context, int i10) {
        return w.h().j(context, i10);
    }

    public static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f11751a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList f(Context context, int i10) {
        if (g(context, i10)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return c.a(resources, resources.getXml(i10), context.getTheme());
        } catch (Exception e10) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    public static boolean g(Context context, int i10) {
        Resources resources = context.getResources();
        TypedValue e10 = e();
        resources.getValue(i10, e10, true);
        int i11 = e10.type;
        return i11 >= 28 && i11 <= 31;
    }
}
