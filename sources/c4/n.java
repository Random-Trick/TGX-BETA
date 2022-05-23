package c4;

import c4.i0;
import c5.b0;
import c5.x;
import java.util.Arrays;
import org.thunderdog.challegram.Log;
import t3.h;
import t3.t;

public final class n implements m {
    public static final double[] f4598q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f4599a;
    public t f4600b;
    public final k0 f4601c;
    public final b0 f4602d;
    public final u f4603e;
    public final boolean[] f4604f;
    public final a f4605g;
    public long f4606h;
    public boolean f4607i;
    public boolean f4608j;
    public long f4609k;
    public long f4610l;
    public long f4611m;
    public long f4612n;
    public boolean f4613o;
    public boolean f4614p;

    public static final class a {
        public static final byte[] f4615e = {0, 0, 1};
        public boolean f4616a;
        public int f4617b;
        public int f4618c;
        public byte[] f4619d;

        public a(int i10) {
            this.f4619d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f4616a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f4619d;
                int length = bArr2.length;
                int i13 = this.f4617b;
                if (length < i13 + i12) {
                    this.f4619d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f4619d, this.f4617b, i12);
                this.f4617b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f4616a) {
                int i12 = this.f4617b - i11;
                this.f4617b = i12;
                if (this.f4618c == 0 && i10 == 181) {
                    this.f4618c = i12;
                } else {
                    this.f4616a = false;
                    return true;
                }
            } else if (i10 == 179) {
                this.f4616a = true;
            }
            byte[] bArr = f4615e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f4616a = false;
            this.f4617b = 0;
            this.f4618c = 0;
        }
    }

    public n() {
        this(null);
    }

    public static android.util.Pair<m3.q1, java.lang.Long> b(c4.n.a r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: c4.n.b(c4.n$a, java.lang.String):android.util.Pair");
    }

    @Override
    public void a(c5.b0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: c4.n.a(c5.b0):void");
    }

    @Override
    public void c() {
        x.a(this.f4604f);
        this.f4605g.c();
        u uVar = this.f4603e;
        if (uVar != null) {
            uVar.d();
        }
        this.f4606h = 0L;
        this.f4607i = false;
        this.f4610l = -9223372036854775807L;
        this.f4612n = -9223372036854775807L;
    }

    @Override
    public void d() {
    }

    @Override
    public void e(h hVar, i0.d dVar) {
        dVar.a();
        this.f4599a = dVar.b();
        this.f4600b = hVar.q(dVar.c(), 2);
        k0 k0Var = this.f4601c;
        if (k0Var != null) {
            k0Var.b(hVar, dVar);
        }
    }

    @Override
    public void f(long j10, int i10) {
        this.f4610l = j10;
    }

    public n(k0 k0Var) {
        this.f4601c = k0Var;
        this.f4604f = new boolean[4];
        this.f4605g = new a(Log.TAG_YOUTUBE);
        if (k0Var != null) {
            this.f4603e = new u(178, Log.TAG_YOUTUBE);
            this.f4602d = new b0();
        } else {
            this.f4603e = null;
            this.f4602d = null;
        }
        this.f4610l = -9223372036854775807L;
        this.f4612n = -9223372036854775807L;
    }
}
