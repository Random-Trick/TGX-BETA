package c4;

import c4.i0;
import c5.a0;
import c5.b0;
import c5.l0;
import c5.s;
import c5.x;
import java.util.Arrays;
import java.util.Collections;
import m3.q1;
import org.thunderdog.challegram.Log;
import t3.h;
import t3.t;

public final class o implements m {
    public static final float[] f4620l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final k0 f4621a;
    public final b0 f4622b;
    public final u f4625e;
    public b f4626f;
    public long f4627g;
    public String f4628h;
    public t f4629i;
    public boolean f4630j;
    public final boolean[] f4623c = new boolean[4];
    public final a f4624d = new a(Log.TAG_YOUTUBE);
    public long f4631k = -9223372036854775807L;

    public static final class a {
        public static final byte[] f4632f = {0, 0, 1};
        public boolean f4633a;
        public int f4634b;
        public int f4635c;
        public int f4636d;
        public byte[] f4637e;

        public a(int i10) {
            this.f4637e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f4633a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f4637e;
                int length = bArr2.length;
                int i13 = this.f4635c;
                if (length < i13 + i12) {
                    this.f4637e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f4637e, this.f4635c, i12);
                this.f4635c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f4634b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            } else if (i10 == 179 || i10 == 181) {
                                this.f4635c -= i11;
                                this.f4633a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            s.i("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f4636d = this.f4635c;
                            this.f4634b = 4;
                        }
                    } else if (i10 > 31) {
                        s.i("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f4634b = 3;
                    }
                } else if (i10 != 181) {
                    s.i("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f4634b = 2;
                }
            } else if (i10 == 176) {
                this.f4634b = 1;
                this.f4633a = true;
            }
            byte[] bArr = f4632f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f4633a = false;
            this.f4635c = 0;
            this.f4634b = 0;
        }
    }

    public static final class b {
        public final t f4638a;
        public boolean f4639b;
        public boolean f4640c;
        public boolean f4641d;
        public int f4642e;
        public int f4643f;
        public long f4644g;
        public long f4645h;

        public b(t tVar) {
            this.f4638a = tVar;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f4640c) {
                int i12 = this.f4643f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.f4641d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f4640c = false;
                    return;
                }
                this.f4643f = i12 + (i11 - i10);
            }
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f4642e == 182 && z10 && this.f4639b) {
                long j11 = this.f4645h;
                if (j11 != -9223372036854775807L) {
                    this.f4638a.f(j11, this.f4641d ? 1 : 0, (int) (j10 - this.f4644g), i10, null);
                }
            }
            if (this.f4642e != 179) {
                this.f4644g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f4642e = i10;
            this.f4641d = false;
            boolean z10 = true;
            this.f4639b = i10 == 182 || i10 == 179;
            if (i10 != 182) {
                z10 = false;
            }
            this.f4640c = z10;
            this.f4643f = 0;
            this.f4645h = j10;
        }

        public void d() {
            this.f4639b = false;
            this.f4640c = false;
            this.f4641d = false;
            this.f4642e = -1;
        }
    }

    public o(k0 k0Var) {
        this.f4621a = k0Var;
        if (k0Var != null) {
            this.f4625e = new u(178, Log.TAG_YOUTUBE);
            this.f4622b = new b0();
            return;
        }
        this.f4625e = null;
        this.f4622b = null;
    }

    public static q1 b(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f4637e, aVar.f4635c);
        a0 a0Var = new a0(copyOf);
        a0Var.s(i10);
        a0Var.s(4);
        a0Var.q();
        a0Var.r(8);
        if (a0Var.g()) {
            a0Var.r(4);
            a0Var.r(3);
        }
        int h10 = a0Var.h(4);
        float f10 = 1.0f;
        if (h10 == 15) {
            int h11 = a0Var.h(8);
            int h12 = a0Var.h(8);
            if (h12 == 0) {
                s.i("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = h11 / h12;
            }
        } else {
            float[] fArr = f4620l;
            if (h10 < fArr.length) {
                f10 = fArr[h10];
            } else {
                s.i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (a0Var.g()) {
            a0Var.r(2);
            a0Var.r(1);
            if (a0Var.g()) {
                a0Var.r(15);
                a0Var.q();
                a0Var.r(15);
                a0Var.q();
                a0Var.r(15);
                a0Var.q();
                a0Var.r(3);
                a0Var.r(11);
                a0Var.q();
                a0Var.r(15);
                a0Var.q();
            }
        }
        if (a0Var.h(2) != 0) {
            s.i("H263Reader", "Unhandled video object layer shape");
        }
        a0Var.q();
        int h13 = a0Var.h(16);
        a0Var.q();
        if (a0Var.g()) {
            if (h13 == 0) {
                s.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = h13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                a0Var.r(i11);
            }
        }
        a0Var.q();
        int h14 = a0Var.h(13);
        a0Var.q();
        int h15 = a0Var.h(13);
        a0Var.q();
        a0Var.q();
        return new q1.b().S(str).e0("video/mp4v-es").j0(h14).Q(h15).a0(f10).T(Collections.singletonList(copyOf)).E();
    }

    @Override
    public void a(b0 b0Var) {
        c5.a.h(this.f4626f);
        c5.a.h(this.f4629i);
        int e10 = b0Var.e();
        int f10 = b0Var.f();
        byte[] d10 = b0Var.d();
        this.f4627g += b0Var.a();
        this.f4629i.d(b0Var, b0Var.a());
        while (true) {
            int c10 = x.c(d10, e10, f10, this.f4623c);
            if (c10 == f10) {
                break;
            }
            int i10 = c10 + 3;
            int i11 = b0Var.d()[i10] & 255;
            int i12 = c10 - e10;
            int i13 = 0;
            if (!this.f4630j) {
                if (i12 > 0) {
                    this.f4624d.a(d10, e10, c10);
                }
                if (this.f4624d.b(i11, i12 < 0 ? -i12 : 0)) {
                    t tVar = this.f4629i;
                    a aVar = this.f4624d;
                    tVar.a(b(aVar, aVar.f4636d, (String) c5.a.e(this.f4628h)));
                    this.f4630j = true;
                }
            }
            this.f4626f.a(d10, e10, c10);
            u uVar = this.f4625e;
            if (uVar != null) {
                if (i12 > 0) {
                    uVar.a(d10, e10, c10);
                } else {
                    i13 = -i12;
                }
                if (this.f4625e.b(i13)) {
                    u uVar2 = this.f4625e;
                    ((b0) l0.j(this.f4622b)).N(this.f4625e.f4764d, x.q(uVar2.f4764d, uVar2.f4765e));
                    ((k0) l0.j(this.f4621a)).a(this.f4631k, this.f4622b);
                }
                if (i11 == 178 && b0Var.d()[c10 + 2] == 1) {
                    this.f4625e.e(i11);
                }
            }
            int i14 = f10 - c10;
            this.f4626f.b(this.f4627g - i14, i14, this.f4630j);
            this.f4626f.c(i11, this.f4631k);
            e10 = i10;
        }
        if (!this.f4630j) {
            this.f4624d.a(d10, e10, f10);
        }
        this.f4626f.a(d10, e10, f10);
        u uVar3 = this.f4625e;
        if (uVar3 != null) {
            uVar3.a(d10, e10, f10);
        }
    }

    @Override
    public void c() {
        x.a(this.f4623c);
        this.f4624d.c();
        b bVar = this.f4626f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f4625e;
        if (uVar != null) {
            uVar.d();
        }
        this.f4627g = 0L;
        this.f4631k = -9223372036854775807L;
    }

    @Override
    public void d() {
    }

    @Override
    public void e(h hVar, i0.d dVar) {
        dVar.a();
        this.f4628h = dVar.b();
        t q10 = hVar.q(dVar.c(), 2);
        this.f4629i = q10;
        this.f4626f = new b(q10);
        k0 k0Var = this.f4621a;
        if (k0Var != null) {
            k0Var.b(hVar, dVar);
        }
    }

    @Override
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f4631k = j10;
        }
    }
}
