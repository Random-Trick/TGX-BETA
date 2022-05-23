package yd;

import ae.j;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import ce.p0;
import db.g;
import ie.m;
import ie.n;
import java.util.Iterator;
import ud.v4;

public class d {
    public static void a(View view, int i10, int i11, float f10) {
        if (view != null) {
            Drawable background = view.getBackground();
            int i12 = 0;
            if (background instanceof m) {
                ((m) background).a(i10, i11, f10);
                i12 = 1;
            } else if (background instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                int i13 = 0;
                while (i12 < layerDrawable.getNumberOfLayers()) {
                    Drawable drawable = layerDrawable.getDrawable(i12);
                    if (drawable instanceof m) {
                        ((m) drawable).a(i10, i11, f10);
                        i13 = 1;
                    }
                    i12++;
                }
                i12 = i13;
            } else if (background instanceof n) {
                Iterator<Drawable> it = ((n) background).a().iterator();
                while (it.hasNext()) {
                    Drawable next = it.next();
                    if (next instanceof m) {
                        ((m) next).a(i10, i11, f10);
                        i12 = 1;
                    }
                }
            }
            if (i12 != 0) {
                view.invalidate();
            }
        }
    }

    public static int b(View view) {
        if (view != null) {
            Drawable background = view.getBackground();
            if (background instanceof m) {
                return ((m) background).b();
            }
            if (background instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                for (int i10 = 0; i10 < layerDrawable.getNumberOfLayers(); i10++) {
                    Drawable drawable = layerDrawable.getDrawable(i10);
                    if (drawable instanceof m) {
                        return ((m) drawable).b();
                    }
                }
            } else if (background instanceof n) {
                Iterator<Drawable> it = ((n) background).a().iterator();
                while (it.hasNext()) {
                    Drawable next = it.next();
                    if (next instanceof m) {
                        return ((m) next).b();
                    }
                }
            }
        }
        return 0;
    }

    public static void c(View view, float f10, float f11, int i10) {
        d(view, f10, f11, i10, null);
    }

    public static void d(View view, float f10, float f11, int i10, v4<?> v4Var) {
        g.d(view, j.o(f10, i10));
        if (e.O) {
            view.setLayerType(1, p0.q());
        }
        p0.w(view, f10, f11);
        if (v4Var != null) {
            v4Var.t8(view);
        }
    }

    public static void e(View view, float f10, float f11, int i10) {
        f(view, f10, f11, i10, null);
    }

    public static void f(View view, float f10, float f11, int i10, v4<?> v4Var) {
        g.d(view, j.K0(f10, f11, i10));
        if (e.O) {
            view.setLayerType(1, p0.q());
        }
        p0.x(view, f10, f11);
        if (v4Var != null) {
            v4Var.t8(view);
        }
    }

    public static void g(View view) {
        h(view, null);
    }

    public static void h(View view, v4<?> v4Var) {
        g.d(view, j.w());
        if (v4Var != null) {
            v4Var.t8(view);
        }
    }

    public static void i(View view) {
        g.d(view, j.b1());
    }

    public static void j(View view) {
        g.d(view, j.d1());
    }

    public static void k(View view) {
        g.d(view, j.f1());
    }
}
