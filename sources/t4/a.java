package t4;

import android.graphics.Bitmap;
import c5.b0;
import c5.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import org.thunderdog.challegram.Log;
import q4.b;
import q4.e;
import q4.f;

public final class a extends e {
    public final b0 f22918o = new b0();
    public final b0 f22919p = new b0();
    public final C0215a f22920q = new C0215a();
    public Inflater f22921r;

    public static final class C0215a {
        public final b0 f22922a = new b0();
        public final int[] f22923b = new int[Log.TAG_CRASH];
        public boolean f22924c;
        public int f22925d;
        public int f22926e;
        public int f22927f;
        public int f22928g;
        public int f22929h;
        public int f22930i;

        public b d() {
            int i10;
            if (this.f22925d == 0 || this.f22926e == 0 || this.f22929h == 0 || this.f22930i == 0 || this.f22922a.f() == 0 || this.f22922a.e() != this.f22922a.f() || !this.f22924c) {
                return null;
            }
            this.f22922a.P(0);
            int i11 = this.f22929h * this.f22930i;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int D = this.f22922a.D();
                if (D != 0) {
                    i10 = i12 + 1;
                    iArr[i12] = this.f22923b[D];
                } else {
                    int D2 = this.f22922a.D();
                    if (D2 != 0) {
                        i10 = ((D2 & 64) == 0 ? D2 & 63 : ((D2 & 63) << 8) | this.f22922a.D()) + i12;
                        Arrays.fill(iArr, i12, i10, (D2 & Log.TAG_YOUTUBE) == 0 ? 0 : this.f22923b[this.f22922a.D()]);
                    }
                }
                i12 = i10;
            }
            return new b.C0195b().f(Bitmap.createBitmap(iArr, this.f22929h, this.f22930i, Bitmap.Config.ARGB_8888)).k(this.f22927f / this.f22925d).l(0).h(this.f22928g / this.f22926e, 0).i(0).n(this.f22929h / this.f22925d).g(this.f22930i / this.f22926e).a();
        }

        public final void e(b0 b0Var, int i10) {
            int G;
            if (i10 >= 4) {
                b0Var.Q(3);
                int i11 = i10 - 4;
                if ((b0Var.D() & Log.TAG_YOUTUBE) != 0) {
                    if (i11 >= 7 && (G = b0Var.G()) >= 4) {
                        this.f22929h = b0Var.J();
                        this.f22930i = b0Var.J();
                        this.f22922a.L(G - 4);
                        i11 -= 7;
                    } else {
                        return;
                    }
                }
                int e10 = this.f22922a.e();
                int f10 = this.f22922a.f();
                if (e10 < f10 && i11 > 0) {
                    int min = Math.min(i11, f10 - e10);
                    b0Var.j(this.f22922a.d(), e10, min);
                    this.f22922a.P(e10 + min);
                }
            }
        }

        public final void f(b0 b0Var, int i10) {
            if (i10 >= 19) {
                this.f22925d = b0Var.J();
                this.f22926e = b0Var.J();
                b0Var.Q(11);
                this.f22927f = b0Var.J();
                this.f22928g = b0Var.J();
            }
        }

        public final void g(b0 b0Var, int i10) {
            if (i10 % 5 == 2) {
                b0Var.Q(2);
                Arrays.fill(this.f22923b, 0);
                int i11 = i10 / 5;
                int i12 = 0;
                while (i12 < i11) {
                    int D = b0Var.D();
                    int D2 = b0Var.D();
                    int D3 = b0Var.D();
                    int D4 = b0Var.D();
                    int D5 = b0Var.D();
                    double d10 = D2;
                    double d11 = D3 - 128;
                    int i13 = i12;
                    double d12 = D4 - 128;
                    this.f22923b[D] = l0.p((int) (d10 + (d12 * 1.772d)), 0, 255) | (l0.p((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (D5 << 24) | (l0.p((int) ((1.402d * d11) + d10), 0, 255) << 16);
                    i12 = i13 + 1;
                }
                this.f22924c = true;
            }
        }

        public void h() {
            this.f22925d = 0;
            this.f22926e = 0;
            this.f22927f = 0;
            this.f22928g = 0;
            this.f22929h = 0;
            this.f22930i = 0;
            this.f22922a.L(0);
            this.f22924c = false;
        }
    }

    public a() {
        super("PgsDecoder");
    }

    public static b E(b0 b0Var, C0215a aVar) {
        int f10 = b0Var.f();
        int D = b0Var.D();
        int J = b0Var.J();
        int e10 = b0Var.e() + J;
        b bVar = null;
        if (e10 > f10) {
            b0Var.P(f10);
            return null;
        }
        if (D != 128) {
            switch (D) {
                case 20:
                    aVar.g(b0Var, J);
                    break;
                case 21:
                    aVar.e(b0Var, J);
                    break;
                case 22:
                    aVar.f(b0Var, J);
                    break;
            }
        } else {
            bVar = aVar.d();
            aVar.h();
        }
        b0Var.P(e10);
        return bVar;
    }

    @Override
    public f B(byte[] bArr, int i10, boolean z10) {
        this.f22918o.N(bArr, i10);
        D(this.f22918o);
        this.f22920q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f22918o.a() >= 3) {
            b E = E(this.f22918o, this.f22920q);
            if (E != null) {
                arrayList.add(E);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }

    public final void D(b0 b0Var) {
        if (b0Var.a() > 0 && b0Var.h() == 120) {
            if (this.f22921r == null) {
                this.f22921r = new Inflater();
            }
            if (l0.g0(b0Var, this.f22919p, this.f22921r)) {
                b0Var.N(this.f22919p.d(), this.f22919p.f());
            }
        }
    }
}
