package p335xd;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import be.C1399s0;
import java.util.Iterator;
import p037cb.C2065g;
import p111he.AbstractC5128m;
import p111he.C5130n;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C10189d {
    public static void m5803a(View view, int i, int i2, float f) {
        if (view != null) {
            Drawable background = view.getBackground();
            int i3 = 0;
            if (background instanceof AbstractC5128m) {
                ((AbstractC5128m) background).mo5792a(i, i2, f);
                i3 = 1;
            } else if (background instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                int i4 = 0;
                while (i3 < layerDrawable.getNumberOfLayers()) {
                    Drawable drawable = layerDrawable.getDrawable(i3);
                    if (drawable instanceof AbstractC5128m) {
                        ((AbstractC5128m) drawable).mo5792a(i, i2, f);
                        i4 = 1;
                    }
                    i3++;
                }
                i3 = i4;
            } else if (background instanceof C5130n) {
                Iterator<Drawable> it = ((C5130n) background).m23862a().iterator();
                while (it.hasNext()) {
                    Drawable next = it.next();
                    if (next instanceof AbstractC5128m) {
                        ((AbstractC5128m) next).mo5792a(i, i2, f);
                        i3 = 1;
                    }
                }
            }
            if (i3 != 0) {
                view.invalidate();
            }
        }
    }

    public static int m5802b(View view) {
        if (view != null) {
            Drawable background = view.getBackground();
            if (background instanceof AbstractC5128m) {
                return ((AbstractC5128m) background).mo5791b();
            }
            if (background instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
                    Drawable drawable = layerDrawable.getDrawable(i);
                    if (drawable instanceof AbstractC5128m) {
                        return ((AbstractC5128m) drawable).mo5791b();
                    }
                }
            } else if (background instanceof C5130n) {
                Iterator<Drawable> it = ((C5130n) background).m23862a().iterator();
                while (it.hasNext()) {
                    Drawable next = it.next();
                    if (next instanceof AbstractC5128m) {
                        return ((AbstractC5128m) next).mo5791b();
                    }
                }
            }
        }
        return 0;
    }

    public static void m5801c(View view, float f, float f2, int i) {
        m5800d(view, f, f2, i, null);
    }

    public static void m5800d(View view, float f, float f2, int i, AbstractC9323v4<?> v4Var) {
        C2065g.m35718d(view, C11524j.m164o(f, i));
        if (AbstractC10190e.f32932O) {
            view.setLayerType(1, C1399s0.m37156t());
        }
        C1399s0.m37144z(view, f, f2);
        if (v4Var != null) {
            v4Var.m9163t8(view);
        }
    }

    public static void m5799e(View view, float f, float f2, int i) {
        m5798f(view, f, f2, i, null);
    }

    public static void m5798f(View view, float f, float f2, int i, AbstractC9323v4<?> v4Var) {
        C2065g.m35718d(view, C11524j.m229M0(f, f2, i));
        if (AbstractC10190e.f32932O) {
            view.setLayerType(1, C1399s0.m37156t());
        }
        C1399s0.m37220A(view, f, f2);
        if (v4Var != null) {
            v4Var.m9163t8(view);
        }
    }

    public static void m5797g(View view) {
        m5796h(view, null);
    }

    public static void m5796h(View view, AbstractC9323v4<?> v4Var) {
        C2065g.m35718d(view, C11524j.m144y());
        if (v4Var != null) {
            v4Var.m9163t8(view);
        }
    }

    public static void m5795i(View view) {
        C2065g.m35718d(view, C11524j.m188e1());
    }

    public static void m5794j(View view) {
        C2065g.m35718d(view, C11524j.m182g1());
    }

    public static void m5793k(View view) {
        C2065g.m35718d(view, C11524j.m173j1());
    }
}
