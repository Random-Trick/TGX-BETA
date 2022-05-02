package p260s4;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import org.thunderdog.challegram.Log;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p217p4.AbstractC8039e;
import p217p4.AbstractC8041f;
import p217p4.C8032b;

public final class C8641a extends AbstractC8039e {
    public final C1189b0 f27958o = new C1189b0();
    public final C1189b0 f27959p = new C1189b0();
    public final C8642a f27960q = new C8642a();
    public Inflater f27961r;

    public static final class C8642a {
        public final C1189b0 f27962a = new C1189b0();
        public final int[] f27963b = new int[Log.TAG_CRASH];
        public boolean f27964c;
        public int f27965d;
        public int f27966e;
        public int f27967f;
        public int f27968g;
        public int f27969h;
        public int f27970i;

        public C8032b m11829d() {
            int i;
            if (this.f27965d == 0 || this.f27966e == 0 || this.f27969h == 0 || this.f27970i == 0 || this.f27962a.m38137f() == 0 || this.f27962a.m38138e() != this.f27962a.m38137f() || !this.f27964c) {
                return null;
            }
            this.f27962a.m38144P(0);
            int i2 = this.f27969h * this.f27970i;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int D = this.f27962a.m38156D();
                if (D != 0) {
                    i = i3 + 1;
                    iArr[i3] = this.f27963b[D];
                } else {
                    int D2 = this.f27962a.m38156D();
                    if (D2 != 0) {
                        i = ((D2 & 64) == 0 ? D2 & 63 : ((D2 & 63) << 8) | this.f27962a.m38156D()) + i3;
                        Arrays.fill(iArr, i3, i, (D2 & Log.TAG_YOUTUBE) == 0 ? 0 : this.f27963b[this.f27962a.m38156D()]);
                    }
                }
                i3 = i;
            }
            return new C8032b.C8034b().m13752f(Bitmap.createBitmap(iArr, this.f27969h, this.f27970i, Bitmap.Config.ARGB_8888)).m13747k(this.f27967f / this.f27965d).m13746l(0).m13750h(this.f27968g / this.f27966e, 0).m13749i(0).m13744n(this.f27969h / this.f27965d).m13751g(this.f27970i / this.f27966e).m13757a();
        }

        public final void m11828e(C1189b0 b0Var, int i) {
            int G;
            if (i >= 4) {
                b0Var.m38143Q(3);
                int i2 = i - 4;
                if ((b0Var.m38156D() & Log.TAG_YOUTUBE) != 0) {
                    if (i2 >= 7 && (G = b0Var.m38153G()) >= 4) {
                        this.f27969h = b0Var.m38150J();
                        this.f27970i = b0Var.m38150J();
                        this.f27962a.m38148L(G - 4);
                        i2 -= 7;
                    } else {
                        return;
                    }
                }
                int e = this.f27962a.m38138e();
                int f = this.f27962a.m38137f();
                if (e < f && i2 > 0) {
                    int min = Math.min(i2, f - e);
                    b0Var.m38133j(this.f27962a.m38139d(), e, min);
                    this.f27962a.m38144P(e + min);
                }
            }
        }

        public final void m11827f(C1189b0 b0Var, int i) {
            if (i >= 19) {
                this.f27965d = b0Var.m38150J();
                this.f27966e = b0Var.m38150J();
                b0Var.m38143Q(11);
                this.f27967f = b0Var.m38150J();
                this.f27968g = b0Var.m38150J();
            }
        }

        public final void m11826g(C1189b0 b0Var, int i) {
            if (i % 5 == 2) {
                b0Var.m38143Q(2);
                Arrays.fill(this.f27963b, 0);
                int i2 = i / 5;
                int i3 = 0;
                while (i3 < i2) {
                    int D = b0Var.m38156D();
                    int D2 = b0Var.m38156D();
                    int D3 = b0Var.m38156D();
                    int D4 = b0Var.m38156D();
                    int D5 = b0Var.m38156D();
                    double d = D2;
                    double d2 = D3 - 128;
                    int i4 = i3;
                    double d3 = D4 - 128;
                    this.f27963b[D] = C1216l0.m37956p((int) (d + (d3 * 1.772d)), 0, 255) | (C1216l0.m37956p((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (D5 << 24) | (C1216l0.m37956p((int) ((1.402d * d2) + d), 0, 255) << 16);
                    i3 = i4 + 1;
                }
                this.f27964c = true;
            }
        }

        public void m11825h() {
            this.f27965d = 0;
            this.f27966e = 0;
            this.f27967f = 0;
            this.f27968g = 0;
            this.f27969h = 0;
            this.f27970i = 0;
            this.f27962a.m38148L(0);
            this.f27964c = false;
        }
    }

    public C8641a() {
        super("PgsDecoder");
    }

    public static C8032b m11833E(C1189b0 b0Var, C8642a aVar) {
        int f = b0Var.m38137f();
        int D = b0Var.m38156D();
        int J = b0Var.m38150J();
        int e = b0Var.m38138e() + J;
        C8032b bVar = null;
        if (e > f) {
            b0Var.m38144P(f);
            return null;
        }
        if (D != 128) {
            switch (D) {
                case 20:
                    aVar.m11826g(b0Var, J);
                    break;
                case 21:
                    aVar.m11828e(b0Var, J);
                    break;
                case 22:
                    aVar.m11827f(b0Var, J);
                    break;
            }
        } else {
            bVar = aVar.m11829d();
            aVar.m11825h();
        }
        b0Var.m38144P(e);
        return bVar;
    }

    @Override
    public AbstractC8041f mo5207B(byte[] bArr, int i, boolean z) {
        this.f27958o.m38146N(bArr, i);
        m11834D(this.f27958o);
        this.f27960q.m11825h();
        ArrayList arrayList = new ArrayList();
        while (this.f27958o.m38142a() >= 3) {
            C8032b E = m11833E(this.f27958o, this.f27960q);
            if (E != null) {
                arrayList.add(E);
            }
        }
        return new C8643b(Collections.unmodifiableList(arrayList));
    }

    public final void m11834D(C1189b0 b0Var) {
        if (b0Var.m38142a() > 0 && b0Var.m38135h() == 120) {
            if (this.f27961r == null) {
                this.f27961r = new Inflater();
            }
            if (C1216l0.m37975f0(b0Var, this.f27959p, this.f27961r)) {
                b0Var.m38146N(this.f27959p.m38139d(), this.f27959p.m38137f());
            }
        }
    }
}
