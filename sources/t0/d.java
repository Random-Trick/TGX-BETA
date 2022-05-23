package t0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import k0.f;
import s0.e;
import s0.h;
import z0.f;

public class d {
    public static final j f22842a;
    public static final f<String, Typeface> f22843b;

    public static class a extends f.c {
        public h.d f22844a;

        public a(h.d dVar) {
            this.f22844a = dVar;
        }

        @Override
        public void a(int i10) {
            h.d dVar = this.f22844a;
            if (dVar != null) {
                dVar.d(i10);
            }
        }

        @Override
        public void b(Typeface typeface) {
            h.d dVar = this.f22844a;
            if (dVar != null) {
                dVar.e(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f22842a = new i();
        } else if (i10 >= 28) {
            f22842a = new h();
        } else if (i10 >= 26) {
            f22842a = new g();
        } else if (i10 < 24 || !f.i()) {
            f22842a = new e();
        } else {
            f22842a = new f();
        }
        f22843b = new k0.f<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i10) {
        return f22842a.b(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, e.a aVar, Resources resources, int i10, int i11, h.d dVar, Handler handler, boolean z10) {
        Typeface typeface;
        if (aVar instanceof e.d) {
            e.d dVar2 = (e.d) aVar;
            Typeface g10 = g(dVar2.c());
            if (g10 != null) {
                if (dVar != null) {
                    dVar.b(g10, handler);
                }
                return g10;
            }
            typeface = z0.f.a(context, dVar2.b(), i11, !z10 ? dVar == null : dVar2.a() == 0, z10 ? dVar2.d() : -1, h.d.c(handler), new a(dVar));
        } else {
            typeface = f22842a.a(context, (e.b) aVar, resources, i11);
            if (dVar != null) {
                if (typeface != null) {
                    dVar.b(typeface, handler);
                } else {
                    dVar.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f22843b.d(e(resources, i10, i11), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        Typeface d10 = f22842a.d(context, resources, i10, str, i11);
        if (d10 != null) {
            f22843b.d(e(resources, i10, i11), d10);
        }
        return d10;
    }

    public static String e(Resources resources, int i10, int i11) {
        return resources.getResourcePackageName(i10) + "-" + i10 + "-" + i11;
    }

    public static Typeface f(Resources resources, int i10, int i11) {
        return f22843b.c(e(resources, i10, i11));
    }

    public static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
