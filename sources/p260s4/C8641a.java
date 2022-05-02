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
    public final C1189b0 f27961o = new C1189b0();
    public final C1189b0 f27962p = new C1189b0();
    public final C8642a f27963q = new C8642a();
    public Inflater f27964r;

    public static final class C8642a {
        public final C1189b0 f27965a = new C1189b0();
        public final int[] f27966b = new int[Log.TAG_CRASH];
        public boolean f27967c;
        public int f27968d;
        public int f27969e;
        public int f27970f;
        public int f27971g;
        public int f27972h;
        public int f27973i;

        public C8032b m11828d() {
            int i;
            if (this.f27968d == 0 || this.f27969e == 0 || this.f27972h == 0 || this.f27973i == 0 || this.f27965a.m38140f() == 0 || this.f27965a.m38141e() != this.f27965a.m38140f() || !this.f27967c) {
                return null;
            }
            this.f27965a.m38147P(0);
            int i2 = this.f27972h * this.f27973i;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int D = this.f27965a.m38159D();
                if (D != 0) {
                    i = i3 + 1;
                    iArr[i3] = this.f27966b[D];
                } else {
                    int D2 = this.f27965a.m38159D();
                    if (D2 != 0) {
                        i = ((D2 & 64) == 0 ? D2 & 63 : ((D2 & 63) << 8) | this.f27965a.m38159D()) + i3;
                        Arrays.fill(iArr, i3, i, (D2 & Log.TAG_YOUTUBE) == 0 ? 0 : this.f27966b[this.f27965a.m38159D()]);
                    }
                }
                i3 = i;
            }
            return new C8032b.C8034b().m13751f(Bitmap.createBitmap(iArr, this.f27972h, this.f27973i, Bitmap.Config.ARGB_8888)).m13746k(this.f27970f / this.f27968d).m13745l(0).m13749h(this.f27971g / this.f27969e, 0).m13748i(0).m13743n(this.f27972h / this.f27968d).m13750g(this.f27973i / this.f27969e).m13756a();
        }

        public final void m11827e(C1189b0 b0Var, int i) {
            int G;
            if (i >= 4) {
                b0Var.m38146Q(3);
                int i2 = i - 4;
                if ((b0Var.m38159D() & Log.TAG_YOUTUBE) != 0) {
                    if (i2 >= 7 && (G = b0Var.m38156G()) >= 4) {
                        this.f27972h = b0Var.m38153J();
                        this.f27973i = b0Var.m38153J();
                        this.f27965a.m38151L(G - 4);
                        i2 -= 7;
                    } else {
                        return;
                    }
                }
                int e = this.f27965a.m38141e();
                int f = this.f27965a.m38140f();
                if (e < f && i2 > 0) {
                    int min = Math.min(i2, f - e);
                    b0Var.m38136j(this.f27965a.m38142d(), e, min);
                    this.f27965a.m38147P(e + min);
                }
            }
        }

        public final void m11826f(C1189b0 b0Var, int i) {
            if (i >= 19) {
                this.f27968d = b0Var.m38153J();
                this.f27969e = b0Var.m38153J();
                b0Var.m38146Q(11);
                this.f27970f = b0Var.m38153J();
                this.f27971g = b0Var.m38153J();
            }
        }

        public final void m11825g(C1189b0 b0Var, int i) {
            if (i % 5 == 2) {
                b0Var.m38146Q(2);
                Arrays.fill(this.f27966b, 0);
                int i2 = i / 5;
                int i3 = 0;
                while (i3 < i2) {
                    int D = b0Var.m38159D();
                    int D2 = b0Var.m38159D();
                    int D3 = b0Var.m38159D();
                    int D4 = b0Var.m38159D();
                    int D5 = b0Var.m38159D();
                    double d = D2;
                    double d2 = D3 - 128;
                    int i4 = i3;
                    double d3 = D4 - 128;
                    this.f27966b[D] = C1216l0.m37959p((int) (d + (d3 * 1.772d)), 0, 255) | (C1216l0.m37959p((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (D5 << 24) | (C1216l0.m37959p((int) ((1.402d * d2) + d), 0, 255) << 16);
                    i3 = i4 + 1;
                }
                this.f27967c = true;
            }
        }

        public void m11824h() {
            this.f27968d = 0;
            this.f27969e = 0;
            this.f27970f = 0;
            this.f27971g = 0;
            this.f27972h = 0;
            this.f27973i = 0;
            this.f27965a.m38151L(0);
            this.f27967c = false;
        }
    }

    public C8641a() {
        super("PgsDecoder");
    }

    public static C8032b m11832E(C1189b0 b0Var, C8642a aVar) {
        int f = b0Var.m38140f();
        int D = b0Var.m38159D();
        int J = b0Var.m38153J();
        int e = b0Var.m38141e() + J;
        C8032b bVar = null;
        if (e > f) {
            b0Var.m38147P(f);
            return null;
        }
        if (D != 128) {
            switch (D) {
                case 20:
                    aVar.m11825g(b0Var, J);
                    break;
                case 21:
                    aVar.m11827e(b0Var, J);
                    break;
                case 22:
                    aVar.m11826f(b0Var, J);
                    break;
            }
        } else {
            bVar = aVar.m11828d();
            aVar.m11824h();
        }
        b0Var.m38147P(e);
        return bVar;
    }

    @Override
    public AbstractC8041f mo5207B(byte[] bArr, int i, boolean z) {
        this.f27961o.m38149N(bArr, i);
        m11833D(this.f27961o);
        this.f27963q.m11824h();
        ArrayList arrayList = new ArrayList();
        while (this.f27961o.m38145a() >= 3) {
            C8032b E = m11832E(this.f27961o, this.f27963q);
            if (E != null) {
                arrayList.add(E);
            }
        }
        return new C8643b(Collections.unmodifiableList(arrayList));
    }

    public final void m11833D(C1189b0 b0Var) {
        if (b0Var.m38145a() > 0 && b0Var.m38138h() == 120) {
            if (this.f27964r == null) {
                this.f27964r = new Inflater();
            }
            if (C1216l0.m37978f0(b0Var, this.f27962p, this.f27964r)) {
                b0Var.m38149N(this.f27962p.m38142d(), this.f27962p.m38140f());
            }
        }
    }
}
