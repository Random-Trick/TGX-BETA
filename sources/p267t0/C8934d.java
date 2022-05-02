package p267t0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p143k0.C6036f;
import p256s0.C8606e;
import p256s0.C8614h;
import p352z0.C11216f;

public class C8934d {
    public static final C8941j f28796a;
    public static final C6036f<String, Typeface> f28797b;

    public static class C8935a extends C11216f.C11219c {
        public C8614h.AbstractC8618d f28798a;

        public C8935a(C8614h.AbstractC8618d dVar) {
            this.f28798a = dVar;
        }

        @Override
        public void mo1195a(int i) {
            C8614h.AbstractC8618d dVar = this.f28798a;
            if (dVar != null) {
                dVar.mo11908d(i);
            }
        }

        @Override
        public void mo1194b(Typeface typeface) {
            C8614h.AbstractC8618d dVar = this.f28798a;
            if (dVar != null) {
                dVar.mo11907e(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f28796a = new C8940i();
        } else if (i >= 28) {
            f28796a = new C8939h();
        } else if (i >= 26) {
            f28796a = new C8938g();
        } else if (i >= 24 && C8937f.m10897m()) {
            f28796a = new C8937f();
        } else if (i >= 21) {
            f28796a = new C8936e();
        } else {
            f28796a = new C8941j();
        }
        f28797b = new C6036f<>(16);
    }

    public static Typeface m10912a(Context context, Typeface typeface, int i) {
        Typeface g;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (g = m10906g(context, typeface, i)) == null) ? Typeface.create(typeface, i) : g;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface m10911b(Context context, CancellationSignal cancellationSignal, C11216f.C11218b[] bVarArr, int i) {
        return f28796a.mo10879c(context, cancellationSignal, bVarArr, i);
    }

    public static Typeface m10910c(Context context, C8606e.AbstractC8607a aVar, Resources resources, int i, int i2, C8614h.AbstractC8618d dVar, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C8606e.C8610d) {
            C8606e.C8610d dVar2 = (C8606e.C8610d) aVar;
            Typeface h = m10905h(dVar2.m11931c());
            if (h != null) {
                if (dVar != null) {
                    dVar.m11910b(h, handler);
                }
                return h;
            }
            typeface = C11216f.m1205a(context, dVar2.m11932b(), i2, !z ? dVar == null : dVar2.m11933a() == 0, z ? dVar2.m11930d() : -1, C8614h.AbstractC8618d.m11909c(handler), new C8935a(dVar));
        } else {
            typeface = f28796a.mo10880b(context, (C8606e.C8608b) aVar, resources, i2);
            if (dVar != null) {
                if (typeface != null) {
                    dVar.m11910b(typeface, handler);
                } else {
                    dVar.m11911a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f28797b.m21491d(m10908e(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface m10909d(Context context, Resources resources, int i, String str, int i2) {
        Typeface e = f28796a.mo10877e(context, resources, i, str, i2);
        if (e != null) {
            f28797b.m21491d(m10908e(resources, i, i2), e);
        }
        return e;
    }

    public static String m10908e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface m10907f(Resources resources, int i, int i2) {
        return f28797b.m21492c(m10908e(resources, i, i2));
    }

    public static Typeface m10906g(Context context, Typeface typeface, int i) {
        C8941j jVar = f28796a;
        C8606e.C8608b i2 = jVar.m10873i(typeface);
        if (i2 == null) {
            return null;
        }
        return jVar.mo10880b(context, i2, context.getResources(), i);
    }

    public static Typeface m10905h(String str) {
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
