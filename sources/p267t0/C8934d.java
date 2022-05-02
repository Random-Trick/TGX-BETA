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
    public static final C8941j f28799a;
    public static final C6036f<String, Typeface> f28800b;

    public static class C8935a extends C11216f.C11219c {
        public C8614h.AbstractC8618d f28801a;

        public C8935a(C8614h.AbstractC8618d dVar) {
            this.f28801a = dVar;
        }

        @Override
        public void mo1195a(int i) {
            C8614h.AbstractC8618d dVar = this.f28801a;
            if (dVar != null) {
                dVar.mo11907d(i);
            }
        }

        @Override
        public void mo1194b(Typeface typeface) {
            C8614h.AbstractC8618d dVar = this.f28801a;
            if (dVar != null) {
                dVar.mo11906e(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f28799a = new C8940i();
        } else if (i >= 28) {
            f28799a = new C8939h();
        } else if (i >= 26) {
            f28799a = new C8938g();
        } else if (i >= 24 && C8937f.m10896m()) {
            f28799a = new C8937f();
        } else if (i >= 21) {
            f28799a = new C8936e();
        } else {
            f28799a = new C8941j();
        }
        f28800b = new C6036f<>(16);
    }

    public static Typeface m10911a(Context context, Typeface typeface, int i) {
        Typeface g;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (g = m10905g(context, typeface, i)) == null) ? Typeface.create(typeface, i) : g;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface m10910b(Context context, CancellationSignal cancellationSignal, C11216f.C11218b[] bVarArr, int i) {
        return f28799a.mo10878c(context, cancellationSignal, bVarArr, i);
    }

    public static Typeface m10909c(Context context, C8606e.AbstractC8607a aVar, Resources resources, int i, int i2, C8614h.AbstractC8618d dVar, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C8606e.C8610d) {
            C8606e.C8610d dVar2 = (C8606e.C8610d) aVar;
            Typeface h = m10904h(dVar2.m11930c());
            if (h != null) {
                if (dVar != null) {
                    dVar.m11909b(h, handler);
                }
                return h;
            }
            typeface = C11216f.m1205a(context, dVar2.m11931b(), i2, !z ? dVar == null : dVar2.m11932a() == 0, z ? dVar2.m11929d() : -1, C8614h.AbstractC8618d.m11908c(handler), new C8935a(dVar));
        } else {
            typeface = f28799a.mo10879b(context, (C8606e.C8608b) aVar, resources, i2);
            if (dVar != null) {
                if (typeface != null) {
                    dVar.m11909b(typeface, handler);
                } else {
                    dVar.m11910a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f28800b.m21492d(m10907e(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface m10908d(Context context, Resources resources, int i, String str, int i2) {
        Typeface e = f28799a.mo10876e(context, resources, i, str, i2);
        if (e != null) {
            f28800b.m21492d(m10907e(resources, i, i2), e);
        }
        return e;
    }

    public static String m10907e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface m10906f(Resources resources, int i, int i2) {
        return f28800b.m21493c(m10907e(resources, i, i2));
    }

    public static Typeface m10905g(Context context, Typeface typeface, int i) {
        C8941j jVar = f28799a;
        C8606e.C8608b i2 = jVar.m10872i(typeface);
        if (i2 == null) {
            return null;
        }
        return jVar.mo10879b(context, i2, context.getResources(), i);
    }

    public static Typeface m10904h(String str) {
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
