package c4;

import c4.i0;
import c5.b0;
import c5.c0;
import c5.e;
import c5.l0;
import c5.s;
import c5.x;
import java.util.Collections;
import m3.q1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import t3.h;
import t3.t;

public final class q implements m {
    public final d0 f4695a;
    public String f4696b;
    public t f4697c;
    public a f4698d;
    public boolean f4699e;
    public long f4706l;
    public final boolean[] f4700f = new boolean[3];
    public final u f4701g = new u(32, Log.TAG_YOUTUBE);
    public final u f4702h = new u(33, Log.TAG_YOUTUBE);
    public final u f4703i = new u(34, Log.TAG_YOUTUBE);
    public final u f4704j = new u(39, Log.TAG_YOUTUBE);
    public final u f4705k = new u(40, Log.TAG_YOUTUBE);
    public long f4707m = -9223372036854775807L;
    public final b0 f4708n = new b0();

    public static final class a {
        public final t f4709a;
        public long f4710b;
        public boolean f4711c;
        public int f4712d;
        public long f4713e;
        public boolean f4714f;
        public boolean f4715g;
        public boolean f4716h;
        public boolean f4717i;
        public boolean f4718j;
        public long f4719k;
        public long f4720l;
        public boolean f4721m;

        public a(t tVar) {
            this.f4709a = tVar;
        }

        public static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        public static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f4718j && this.f4715g) {
                this.f4721m = this.f4711c;
                this.f4718j = false;
            } else if (this.f4716h || this.f4715g) {
                if (z10 && this.f4717i) {
                    d(i10 + ((int) (j10 - this.f4710b)));
                }
                this.f4719k = this.f4710b;
                this.f4720l = this.f4713e;
                this.f4721m = this.f4711c;
                this.f4717i = true;
            }
        }

        public final void d(int i10) {
            long j10 = this.f4720l;
            if (j10 != -9223372036854775807L) {
                boolean z10 = this.f4721m;
                this.f4709a.f(j10, z10 ? 1 : 0, (int) (this.f4710b - this.f4719k), i10, null);
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f4714f) {
                int i12 = this.f4712d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    this.f4715g = (bArr[i13] & 128) != 0;
                    this.f4714f = false;
                    return;
                }
                this.f4712d = i12 + (i11 - i10);
            }
        }

        public void f() {
            this.f4714f = false;
            this.f4715g = false;
            this.f4716h = false;
            this.f4717i = false;
            this.f4718j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            boolean z11 = false;
            this.f4715g = false;
            this.f4716h = false;
            this.f4713e = j11;
            this.f4712d = 0;
            this.f4710b = j10;
            if (!c(i11)) {
                if (this.f4717i && !this.f4718j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f4717i = false;
                }
                if (b(i11)) {
                    this.f4716h = !this.f4718j;
                    this.f4718j = true;
                }
            }
            boolean z12 = i11 >= 16 && i11 <= 21;
            this.f4711c = z12;
            if (z12 || i11 <= 9) {
                z11 = true;
            }
            this.f4714f = z11;
        }
    }

    public q(d0 d0Var) {
        this.f4695a = d0Var;
    }

    public static q1 i(String str, u uVar, u uVar2, u uVar3) {
        int i10 = uVar.f4765e;
        byte[] bArr = new byte[uVar2.f4765e + i10 + uVar3.f4765e];
        System.arraycopy(uVar.f4764d, 0, bArr, 0, i10);
        System.arraycopy(uVar2.f4764d, 0, bArr, uVar.f4765e, uVar2.f4765e);
        System.arraycopy(uVar3.f4764d, 0, bArr, uVar.f4765e + uVar2.f4765e, uVar3.f4765e);
        c0 c0Var = new c0(uVar2.f4764d, 0, uVar2.f4765e);
        c0Var.l(44);
        int e10 = c0Var.e(3);
        c0Var.k();
        int e11 = c0Var.e(2);
        boolean d10 = c0Var.d();
        int e12 = c0Var.e(5);
        int i11 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            if (c0Var.d()) {
                i11 |= 1 << i12;
            }
        }
        int[] iArr = new int[6];
        for (int i13 = 0; i13 < 6; i13++) {
            iArr[i13] = c0Var.e(8);
        }
        int e13 = c0Var.e(8);
        int i14 = 0;
        for (int i15 = 0; i15 < e10; i15++) {
            if (c0Var.d()) {
                i14 += 89;
            }
            if (c0Var.d()) {
                i14 += 8;
            }
        }
        c0Var.l(i14);
        if (e10 > 0) {
            c0Var.l((8 - e10) * 2);
        }
        c0Var.h();
        int h10 = c0Var.h();
        if (h10 == 3) {
            c0Var.k();
        }
        int h11 = c0Var.h();
        int h12 = c0Var.h();
        if (c0Var.d()) {
            int h13 = c0Var.h();
            int h14 = c0Var.h();
            int h15 = c0Var.h();
            int h16 = c0Var.h();
            h11 -= ((h10 == 1 || h10 == 2) ? 2 : 1) * (h13 + h14);
            h12 -= (h10 == 1 ? 2 : 1) * (h15 + h16);
        }
        c0Var.h();
        c0Var.h();
        int h17 = c0Var.h();
        for (int i16 = c0Var.d() ? 0 : e10; i16 <= e10; i16++) {
            c0Var.h();
            c0Var.h();
            c0Var.h();
        }
        c0Var.h();
        c0Var.h();
        c0Var.h();
        c0Var.h();
        c0Var.h();
        c0Var.h();
        if (c0Var.d() && c0Var.d()) {
            j(c0Var);
        }
        c0Var.l(2);
        if (c0Var.d()) {
            c0Var.l(8);
            c0Var.h();
            c0Var.h();
            c0Var.k();
        }
        k(c0Var);
        if (c0Var.d()) {
            for (int i17 = 0; i17 < c0Var.h(); i17++) {
                c0Var.l(h17 + 4 + 1);
            }
        }
        c0Var.l(2);
        float f10 = 1.0f;
        if (c0Var.d()) {
            if (c0Var.d()) {
                int e14 = c0Var.e(8);
                if (e14 == 255) {
                    int e15 = c0Var.e(16);
                    int e16 = c0Var.e(16);
                    if (!(e15 == 0 || e16 == 0)) {
                        f10 = e15 / e16;
                    }
                } else {
                    float[] fArr = x.f4902b;
                    if (e14 < fArr.length) {
                        f10 = fArr[e14];
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Unexpected aspect_ratio_idc value: ");
                        sb2.append(e14);
                        s.i("H265Reader", sb2.toString());
                    }
                }
            }
            if (c0Var.d()) {
                c0Var.k();
            }
            if (c0Var.d()) {
                c0Var.l(4);
                if (c0Var.d()) {
                    c0Var.l(24);
                }
            }
            if (c0Var.d()) {
                c0Var.h();
                c0Var.h();
            }
            c0Var.k();
            if (c0Var.d()) {
                h12 *= 2;
            }
        }
        return new q1.b().S(str).e0("video/hevc").I(e.c(e11, d10, e12, i11, iArr, e13)).j0(h11).Q(h12).a0(f10).T(Collections.singletonList(bArr)).E();
    }

    public static void j(c0 c0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!c0Var.d()) {
                    c0Var.h();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        c0Var.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        c0Var.g();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    public static void k(c0 c0Var) {
        int h10 = c0Var.h();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < h10; i11++) {
            if (i11 != 0) {
                z10 = c0Var.d();
            }
            if (z10) {
                c0Var.k();
                c0Var.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (c0Var.d()) {
                        c0Var.k();
                    }
                }
            } else {
                int h11 = c0Var.h();
                int h12 = c0Var.h();
                i10 = h11 + h12;
                for (int i13 = 0; i13 < h11; i13++) {
                    c0Var.h();
                    c0Var.k();
                }
                for (int i14 = 0; i14 < h12; i14++) {
                    c0Var.h();
                    c0Var.k();
                }
            }
        }
    }

    @Override
    public void a(b0 b0Var) {
        b();
        while (b0Var.a() > 0) {
            int e10 = b0Var.e();
            int f10 = b0Var.f();
            byte[] d10 = b0Var.d();
            this.f4706l += b0Var.a();
            this.f4697c.d(b0Var, b0Var.a());
            while (e10 < f10) {
                int c10 = x.c(d10, e10, f10, this.f4700f);
                if (c10 == f10) {
                    h(d10, e10, f10);
                    return;
                }
                int e11 = x.e(d10, c10);
                int i10 = c10 - e10;
                if (i10 > 0) {
                    h(d10, e10, c10);
                }
                int i11 = f10 - c10;
                long j10 = this.f4706l - i11;
                g(j10, i11, i10 < 0 ? -i10 : 0, this.f4707m);
                l(j10, i11, e11, this.f4707m);
                e10 = c10 + 3;
            }
        }
    }

    @EnsuresNonNull({"output", "sampleReader"})
    public final void b() {
        c5.a.h(this.f4697c);
        l0.j(this.f4698d);
    }

    @Override
    public void c() {
        this.f4706l = 0L;
        this.f4707m = -9223372036854775807L;
        x.a(this.f4700f);
        this.f4701g.d();
        this.f4702h.d();
        this.f4703i.d();
        this.f4704j.d();
        this.f4705k.d();
        a aVar = this.f4698d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override
    public void d() {
    }

    @Override
    public void e(h hVar, i0.d dVar) {
        dVar.a();
        this.f4696b = dVar.b();
        t q10 = hVar.q(dVar.c(), 2);
        this.f4697c = q10;
        this.f4698d = new a(q10);
        this.f4695a.b(hVar, dVar);
    }

    @Override
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f4707m = j10;
        }
    }

    @RequiresNonNull({"output", "sampleReader"})
    public final void g(long j10, int i10, int i11, long j11) {
        this.f4698d.a(j10, i10, this.f4699e);
        if (!this.f4699e) {
            this.f4701g.b(i11);
            this.f4702h.b(i11);
            this.f4703i.b(i11);
            if (this.f4701g.c() && this.f4702h.c() && this.f4703i.c()) {
                this.f4697c.a(i(this.f4696b, this.f4701g, this.f4702h, this.f4703i));
                this.f4699e = true;
            }
        }
        if (this.f4704j.b(i11)) {
            u uVar = this.f4704j;
            this.f4708n.N(this.f4704j.f4764d, x.q(uVar.f4764d, uVar.f4765e));
            this.f4708n.Q(5);
            this.f4695a.a(j11, this.f4708n);
        }
        if (this.f4705k.b(i11)) {
            u uVar2 = this.f4705k;
            this.f4708n.N(this.f4705k.f4764d, x.q(uVar2.f4764d, uVar2.f4765e));
            this.f4708n.Q(5);
            this.f4695a.a(j11, this.f4708n);
        }
    }

    @RequiresNonNull({"sampleReader"})
    public final void h(byte[] bArr, int i10, int i11) {
        this.f4698d.e(bArr, i10, i11);
        if (!this.f4699e) {
            this.f4701g.a(bArr, i10, i11);
            this.f4702h.a(bArr, i10, i11);
            this.f4703i.a(bArr, i10, i11);
        }
        this.f4704j.a(bArr, i10, i11);
        this.f4705k.a(bArr, i10, i11);
    }

    @RequiresNonNull({"sampleReader"})
    public final void l(long j10, int i10, int i11, long j11) {
        this.f4698d.g(j10, i10, i11, j11, this.f4699e);
        if (!this.f4699e) {
            this.f4701g.e(i11);
            this.f4702h.e(i11);
            this.f4703i.e(i11);
        }
        this.f4704j.e(i11);
        this.f4705k.e(i11);
    }
}
