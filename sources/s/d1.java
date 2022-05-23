package s;

import android.content.Context;
import w.j;
import y.b2;
import y.e1;
import y.j0;
import y.n0;
import y.n2;
import y.o2;
import y.p1;
import y.t1;

public final class d1 implements o2 {
    public final v1 f21989b;

    public static class a {
        public static final int[] f21990a;

        static {
            int[] iArr = new int[o2.b.values().length];
            f21990a = iArr;
            try {
                iArr[o2.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21990a[o2.b.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21990a[o2.b.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21990a[o2.b.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public d1(Context context) {
        this.f21989b = v1.b(context);
    }

    @Override
    public n0 a(o2.b bVar) {
        p1 J = p1.J();
        b2.b bVar2 = new b2.b();
        int[] iArr = a.f21990a;
        int i10 = iArr[bVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            bVar2.r(1);
        } else if (i10 == 4) {
            bVar2.r(3);
        }
        o2.b bVar3 = o2.b.PREVIEW;
        if (bVar == bVar3) {
            j.a(bVar2);
        }
        J.n(n2.f26373q, bVar2.m());
        J.n(n2.f26375s, c1.f21968a);
        j0.a aVar = new j0.a();
        int i11 = iArr[bVar.ordinal()];
        if (i11 == 1) {
            aVar.o(2);
        } else if (i11 == 2 || i11 == 3) {
            aVar.o(1);
        } else if (i11 == 4) {
            aVar.o(3);
        }
        J.n(n2.f26374r, aVar.h());
        J.n(n2.f26376t, bVar == o2.b.IMAGE_CAPTURE ? a2.f21949c : l0.f22139a);
        if (bVar == bVar3) {
            J.n(e1.f26291o, this.f21989b.d());
        }
        J.n(e1.f26288l, Integer.valueOf(this.f21989b.c().getRotation()));
        return t1.H(J);
    }
}
