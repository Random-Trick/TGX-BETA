package l9;

import android.opengl.GLES20;
import f9.d;
import f9.e;
import i9.f;
import ia.m;
import ia.n;
import ia.q;
import ra.g;
import ra.l;

public final class a implements e {
    public final int f16313a;
    public final int f16314b;
    public final int f16315c;
    public final Integer f16316d;
    public final Integer f16317e;
    public final Integer f16318f;
    public final Integer f16319g;

    public static final class C0149a extends l implements qa.a<q> {
        public final Integer f16321c;

        public C0149a(Integer num) {
            super(0);
            this.f16321c = num;
        }

        @Override
        public q b() {
            f();
            return q.f14159a;
        }

        public final void f() {
            if (!(a.this.h() == null || a.this.d() == null || a.this.c() == null || this.f16321c == null || a.this.g() == null)) {
                GLES20.glTexImage2D(m.a(a.this.f()), 0, this.f16321c.intValue(), a.this.h().intValue(), a.this.d().intValue(), 0, m.a(a.this.c().intValue()), m.a(a.this.g().intValue()), null);
            }
            GLES20.glTexParameterf(m.a(a.this.f()), f.l(), f.g());
            GLES20.glTexParameterf(m.a(a.this.f()), f.k(), f.e());
            GLES20.glTexParameteri(m.a(a.this.f()), f.m(), f.a());
            GLES20.glTexParameteri(m.a(a.this.f()), f.n(), f.a());
            d.b("glTexParameter");
        }
    }

    public a() {
        this(0, 0, null, 7, null);
    }

    public a(int i10, int i11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        int i12;
        this.f16314b = i10;
        this.f16315c = i11;
        this.f16316d = num2;
        this.f16317e = num3;
        this.f16318f = num4;
        this.f16319g = num6;
        if (num != null) {
            i12 = num.intValue();
        } else {
            int[] f10 = n.f(1);
            int r10 = n.r(f10);
            int[] iArr = new int[r10];
            for (int i13 = 0; i13 < r10; i13++) {
                iArr[i13] = n.m(f10, i13);
            }
            GLES20.glGenTextures(1, iArr, 0);
            q qVar = q.f14159a;
            for (int i14 = 0; i14 < 1; i14++) {
                n.s(f10, i14, m.a(iArr[i14]));
            }
            d.b("glGenTextures");
            i12 = n.m(f10, 0);
        }
        this.f16313a = i12;
        if (num == null) {
            f9.f.a(this, new C0149a(num5));
        }
    }

    @Override
    public void a() {
        GLES20.glBindTexture(m.a(this.f16315c), m.a(0));
        GLES20.glActiveTexture(f.i());
        d.b("unbind");
    }

    @Override
    public void b() {
        GLES20.glActiveTexture(m.a(this.f16314b));
        GLES20.glBindTexture(m.a(this.f16315c), m.a(this.f16313a));
        d.b("bind");
    }

    public final Integer c() {
        return this.f16318f;
    }

    public final Integer d() {
        return this.f16317e;
    }

    public final int e() {
        return this.f16313a;
    }

    public final int f() {
        return this.f16315c;
    }

    public final Integer g() {
        return this.f16319g;
    }

    public final Integer h() {
        return this.f16316d;
    }

    public final void i() {
        int[] iArr = {m.a(this.f16313a)};
        int r10 = n.r(iArr);
        int[] iArr2 = new int[r10];
        for (int i10 = 0; i10 < r10; i10++) {
            iArr2[i10] = n.m(iArr, i10);
        }
        GLES20.glDeleteTextures(1, iArr2, 0);
        q qVar = q.f14159a;
        for (int i11 = 0; i11 < 1; i11++) {
            n.s(iArr, i11, m.a(iArr2[i11]));
        }
    }

    public a(int i10, int i11, Integer num, int i12, g gVar) {
        this((i12 & 1) != 0 ? f.i() : i10, (i12 & 2) != 0 ? f.j() : i11, (i12 & 4) != 0 ? null : num);
    }

    public a(int i10, int i11, Integer num) {
        this(i10, i11, num, null, null, null, null, null);
    }
}
