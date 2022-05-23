package c4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c4.i0;
import c5.a0;
import c5.b0;
import c5.i0;
import c5.l0;
import com.google.android.exoplayer2.extractor.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m3.k2;
import org.thunderdog.challegram.Log;
import t3.f;
import t3.g;
import t3.h;
import t3.l;
import t3.q;

public final class h0 implements f {
    public static final l f4516t = g0.f4502b;
    public final int f4517a;
    public final int f4518b;
    public final List<i0> f4519c;
    public final b0 f4520d;
    public final SparseIntArray f4521e;
    public final i0.c f4522f;
    public final SparseArray<i0> f4523g;
    public final SparseBooleanArray f4524h;
    public final SparseBooleanArray f4525i;
    public final f0 f4526j;
    public e0 f4527k;
    public h f4528l;
    public int f4529m;
    public boolean f4530n;
    public boolean f4531o;
    public boolean f4532p;
    public i0 f4533q;
    public int f4534r;
    public int f4535s;

    public class a implements b0 {
        public final a0 f4536a = new a0(new byte[4]);

        public a() {
        }

        @Override
        public void a(b0 b0Var) {
            if (b0Var.D() == 0 && (b0Var.D() & Log.TAG_YOUTUBE) != 0) {
                b0Var.Q(6);
                int a10 = b0Var.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    b0Var.i(this.f4536a, 4);
                    int h10 = this.f4536a.h(16);
                    this.f4536a.r(3);
                    if (h10 == 0) {
                        this.f4536a.r(13);
                    } else {
                        int h11 = this.f4536a.h(13);
                        if (h0.this.f4523g.get(h11) == null) {
                            h0.this.f4523g.put(h11, new c0(new b(h11)));
                            h0.l(h0.this);
                        }
                    }
                }
                if (h0.this.f4517a != 2) {
                    h0.this.f4523g.remove(0);
                }
            }
        }

        @Override
        public void b(c5.i0 i0Var, h hVar, i0.d dVar) {
        }
    }

    public class b implements b0 {
        public final a0 f4538a = new a0(new byte[5]);
        public final SparseArray<i0> f4539b = new SparseArray<>();
        public final SparseIntArray f4540c = new SparseIntArray();
        public final int f4541d;

        public b(int i10) {
            this.f4541d = i10;
        }

        @Override
        public void a(b0 b0Var) {
            c5.i0 i0Var;
            i0 i0Var2;
            if (b0Var.D() == 2) {
                if (h0.this.f4517a == 1 || h0.this.f4517a == 2 || h0.this.f4529m == 1) {
                    i0Var = (c5.i0) h0.this.f4519c.get(0);
                } else {
                    i0Var = new c5.i0(((c5.i0) h0.this.f4519c.get(0)).c());
                    h0.this.f4519c.add(i0Var);
                }
                if ((b0Var.D() & Log.TAG_YOUTUBE) != 0) {
                    b0Var.Q(1);
                    int J = b0Var.J();
                    int i10 = 3;
                    b0Var.Q(3);
                    b0Var.i(this.f4538a, 2);
                    this.f4538a.r(3);
                    int i11 = 13;
                    h0.this.f4535s = this.f4538a.h(13);
                    b0Var.i(this.f4538a, 2);
                    int i12 = 4;
                    this.f4538a.r(4);
                    b0Var.Q(this.f4538a.h(12));
                    if (h0.this.f4517a == 2 && h0.this.f4533q == null) {
                        i0.b bVar = new i0.b(21, null, null, l0.f4846f);
                        h0 h0Var = h0.this;
                        h0Var.f4533q = h0Var.f4522f.b(21, bVar);
                        if (h0.this.f4533q != null) {
                            h0.this.f4533q.b(i0Var, h0.this.f4528l, new i0.d(J, 21, Log.TAG_LUX));
                        }
                    }
                    this.f4539b.clear();
                    this.f4540c.clear();
                    int a10 = b0Var.a();
                    while (a10 > 0) {
                        b0Var.i(this.f4538a, 5);
                        int h10 = this.f4538a.h(8);
                        this.f4538a.r(i10);
                        int h11 = this.f4538a.h(i11);
                        this.f4538a.r(i12);
                        int h12 = this.f4538a.h(12);
                        i0.b c10 = c(b0Var, h12);
                        if (h10 == 6 || h10 == 5) {
                            h10 = c10.f4568a;
                        }
                        a10 -= h12 + 5;
                        int i13 = h0.this.f4517a == 2 ? h10 : h11;
                        if (!h0.this.f4524h.get(i13)) {
                            if (h0.this.f4517a == 2 && h10 == 21) {
                                i0Var2 = h0.this.f4533q;
                            } else {
                                i0Var2 = h0.this.f4522f.b(h10, c10);
                            }
                            if (h0.this.f4517a != 2 || h11 < this.f4540c.get(i13, Log.TAG_LUX)) {
                                this.f4540c.put(i13, h11);
                                this.f4539b.put(i13, i0Var2);
                            }
                        }
                        i10 = 3;
                        i12 = 4;
                        i11 = 13;
                    }
                    int size = this.f4540c.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        int keyAt = this.f4540c.keyAt(i14);
                        int valueAt = this.f4540c.valueAt(i14);
                        h0.this.f4524h.put(keyAt, true);
                        h0.this.f4525i.put(valueAt, true);
                        i0 valueAt2 = this.f4539b.valueAt(i14);
                        if (valueAt2 != null) {
                            if (valueAt2 != h0.this.f4533q) {
                                valueAt2.b(i0Var, h0.this.f4528l, new i0.d(J, keyAt, Log.TAG_LUX));
                            }
                            h0.this.f4523g.put(valueAt, valueAt2);
                        }
                    }
                    if (h0.this.f4517a != 2) {
                        h0.this.f4523g.remove(this.f4541d);
                        h0 h0Var2 = h0.this;
                        h0Var2.f4529m = h0Var2.f4517a == 1 ? 0 : h0.this.f4529m - 1;
                        if (h0.this.f4529m == 0) {
                            h0.this.f4528l.k();
                            h0.this.f4530n = true;
                        }
                    } else if (!h0.this.f4530n) {
                        h0.this.f4528l.k();
                        h0.this.f4529m = 0;
                        h0.this.f4530n = true;
                    }
                }
            }
        }

        @Override
        public void b(c5.i0 i0Var, h hVar, i0.d dVar) {
        }

        public final i0.b c(b0 b0Var, int i10) {
            int e10 = b0Var.e();
            int i11 = i10 + e10;
            String str = null;
            ArrayList arrayList = null;
            int i12 = -1;
            while (b0Var.e() < i11) {
                int D = b0Var.D();
                int e11 = b0Var.e() + b0Var.D();
                if (e11 > i11) {
                    break;
                } else if (D == 5) {
                    long F = b0Var.F();
                    if (F != 1094921523) {
                        if (F != 1161904947) {
                            if (F != 1094921524) {
                                if (F == 1212503619) {
                                    i12 = 36;
                                }
                                b0Var.Q(e11 - b0Var.e());
                            }
                            i12 = 172;
                            b0Var.Q(e11 - b0Var.e());
                        }
                        i12 = 135;
                        b0Var.Q(e11 - b0Var.e());
                    }
                    i12 = 129;
                    b0Var.Q(e11 - b0Var.e());
                } else {
                    if (D != 106) {
                        if (D != 122) {
                            if (D == 127) {
                                if (b0Var.D() != 21) {
                                }
                                i12 = 172;
                            } else if (D == 123) {
                                i12 = 138;
                            } else if (D == 10) {
                                str = b0Var.A(3).trim();
                            } else if (D == 89) {
                                arrayList = new ArrayList();
                                while (b0Var.e() < e11) {
                                    String trim = b0Var.A(3).trim();
                                    int D2 = b0Var.D();
                                    byte[] bArr = new byte[4];
                                    b0Var.j(bArr, 0, 4);
                                    arrayList.add(new i0.a(trim, D2, bArr));
                                }
                                i12 = 89;
                            } else if (D == 111) {
                                i12 = 257;
                            }
                            b0Var.Q(e11 - b0Var.e());
                        }
                        i12 = 135;
                        b0Var.Q(e11 - b0Var.e());
                    }
                    i12 = 129;
                    b0Var.Q(e11 - b0Var.e());
                }
            }
            b0Var.P(i11);
            return new i0.b(i12, str, arrayList, Arrays.copyOfRange(b0Var.d(), e10, i11));
        }
    }

    public h0() {
        this(0);
    }

    public static int l(h0 h0Var) {
        int i10 = h0Var.f4529m;
        h0Var.f4529m = i10 + 1;
        return i10;
    }

    public static f[] x() {
        return new f[]{new h0()};
    }

    public final boolean A(int i10) {
        return this.f4517a == 2 || this.f4530n || !this.f4525i.get(i10, false);
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        e0 e0Var;
        c5.a.f(this.f4517a != 2);
        int size = this.f4519c.size();
        for (int i10 = 0; i10 < size; i10++) {
            c5.i0 i0Var = this.f4519c.get(i10);
            boolean z10 = i0Var.e() == -9223372036854775807L;
            if (!z10) {
                long c10 = i0Var.c();
                z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
            }
            if (z10) {
                i0Var.g(j11);
            }
        }
        if (!(j11 == 0 || (e0Var = this.f4527k) == null)) {
            e0Var.h(j11);
        }
        this.f4520d.L(0);
        this.f4521e.clear();
        for (int i11 = 0; i11 < this.f4523g.size(); i11++) {
            this.f4523g.valueAt(i11).c();
        }
        this.f4534r = 0;
    }

    @Override
    public int e(g gVar, q qVar) {
        long a10 = gVar.a();
        if (this.f4530n) {
            if (((a10 == -1 || this.f4517a == 2) ? false : true) && !this.f4526j.d()) {
                return this.f4526j.e(gVar, qVar, this.f4535s);
            }
            y(a10);
            if (this.f4532p) {
                this.f4532p = false;
                b(0L, 0L);
                if (gVar.r() != 0) {
                    qVar.f22899a = 0L;
                    return 1;
                }
            }
            e0 e0Var = this.f4527k;
            if (e0Var != null && e0Var.d()) {
                return this.f4527k.c(gVar, qVar);
            }
        }
        if (!v(gVar)) {
            return -1;
        }
        int w10 = w();
        int f10 = this.f4520d.f();
        if (w10 > f10) {
            return 0;
        }
        int n10 = this.f4520d.n();
        if ((8388608 & n10) != 0) {
            this.f4520d.P(w10);
            return 0;
        }
        int i10 = ((4194304 & n10) != 0 ? 1 : 0) | 0;
        int i11 = (2096896 & n10) >> 8;
        boolean z10 = (n10 & 32) != 0;
        i0 i0Var = (n10 & 16) != 0 ? this.f4523g.get(i11) : null;
        if (i0Var == null) {
            this.f4520d.P(w10);
            return 0;
        }
        if (this.f4517a != 2) {
            int i12 = n10 & 15;
            int i13 = this.f4521e.get(i11, i12 - 1);
            this.f4521e.put(i11, i12);
            if (i13 == i12) {
                this.f4520d.P(w10);
                return 0;
            } else if (i12 != ((i13 + 1) & 15)) {
                i0Var.c();
            }
        }
        if (z10) {
            int D = this.f4520d.D();
            i10 |= (this.f4520d.D() & 64) != 0 ? 2 : 0;
            this.f4520d.Q(D - 1);
        }
        boolean z11 = this.f4530n;
        if (A(i11)) {
            this.f4520d.O(w10);
            i0Var.a(this.f4520d, i10);
            this.f4520d.O(f10);
        }
        if (this.f4517a != 2 && !z11 && this.f4530n && a10 != -1) {
            this.f4532p = true;
        }
        this.f4520d.P(w10);
        return 0;
    }

    @Override
    public void f(h hVar) {
        this.f4528l = hVar;
    }

    @Override
    public boolean j(g gVar) {
        boolean z10;
        byte[] d10 = this.f4520d.d();
        gVar.q(d10, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                } else if (d10[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                gVar.n(i10);
                return true;
            }
        }
        return false;
    }

    public final boolean v(g gVar) {
        byte[] d10 = this.f4520d.d();
        if (9400 - this.f4520d.e() < 188) {
            int a10 = this.f4520d.a();
            if (a10 > 0) {
                System.arraycopy(d10, this.f4520d.e(), d10, 0, a10);
            }
            this.f4520d.N(d10, a10);
        }
        while (this.f4520d.a() < 188) {
            int f10 = this.f4520d.f();
            int b10 = gVar.b(d10, f10, 9400 - f10);
            if (b10 == -1) {
                return false;
            }
            this.f4520d.O(f10 + b10);
        }
        return true;
    }

    public final int w() {
        int e10 = this.f4520d.e();
        int f10 = this.f4520d.f();
        int a10 = j0.a(this.f4520d.d(), e10, f10);
        this.f4520d.P(a10);
        int i10 = a10 + 188;
        if (i10 > f10) {
            int i11 = this.f4534r + (a10 - e10);
            this.f4534r = i11;
            if (this.f4517a == 2 && i11 > 376) {
                throw k2.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f4534r = 0;
        }
        return i10;
    }

    public final void y(long j10) {
        if (!this.f4531o) {
            this.f4531o = true;
            if (this.f4526j.b() != -9223372036854775807L) {
                e0 e0Var = new e0(this.f4526j.c(), this.f4526j.b(), j10, this.f4535s, this.f4518b);
                this.f4527k = e0Var;
                this.f4528l.a(e0Var.b());
                return;
            }
            this.f4528l.a(new g.b(this.f4526j.b()));
        }
    }

    public final void z() {
        this.f4524h.clear();
        this.f4523g.clear();
        SparseArray<i0> a10 = this.f4522f.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4523g.put(a10.keyAt(i10), a10.valueAt(i10));
        }
        this.f4523g.put(0, new c0(new a()));
        this.f4533q = null;
    }

    public h0(int i10) {
        this(1, i10, 112800);
    }

    public h0(int i10, int i11, int i12) {
        this(i10, new c5.i0(0L), new j(i11), i12);
    }

    public h0(int i10, c5.i0 i0Var, i0.c cVar, int i11) {
        this.f4522f = (i0.c) c5.a.e(cVar);
        this.f4518b = i11;
        this.f4517a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f4519c = Collections.singletonList(i0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f4519c = arrayList;
            arrayList.add(i0Var);
        }
        this.f4520d = new b0(new byte[9400], 0);
        this.f4524h = new SparseBooleanArray();
        this.f4525i = new SparseBooleanArray();
        this.f4523g = new SparseArray<>();
        this.f4521e = new SparseIntArray();
        this.f4526j = new f0(i11);
        this.f4528l = h.L;
        this.f4535s = -1;
        z();
    }
}
