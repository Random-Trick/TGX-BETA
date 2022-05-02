package p031c4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.extractor.AbstractC3470g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p020b5.C1205i0;
import p020b5.C1216l0;
import p031c4.AbstractC1571i0;
import p174m3.C6556a2;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.C8971q;

public final class C1567h0 implements AbstractC8958f {
    public static final AbstractC8965l f5599t = C1565g0.f5585b;
    public final int f5600a;
    public final int f5601b;
    public final List<C1205i0> f5602c;
    public final C1189b0 f5603d;
    public final SparseIntArray f5604e;
    public final AbstractC1571i0.AbstractC1574c f5605f;
    public final SparseArray<AbstractC1571i0> f5606g;
    public final SparseBooleanArray f5607h;
    public final SparseBooleanArray f5608i;
    public final C1563f0 f5609j;
    public C1560e0 f5610k;
    public AbstractC8960h f5611l;
    public int f5612m;
    public boolean f5613n;
    public boolean f5614o;
    public boolean f5615p;
    public AbstractC1571i0 f5616q;
    public int f5617r;
    public int f5618s;

    public class C1568a implements AbstractC1554b0 {
        public final C1187a0 f5619a = new C1187a0(new byte[4]);

        public C1568a() {
        }

        @Override
        public void mo36324a(C1205i0 i0Var, AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        }

        @Override
        public void mo36323b(C1189b0 b0Var) {
            if (b0Var.m38159D() == 0 && (b0Var.m38159D() & Log.TAG_YOUTUBE) != 0) {
                b0Var.m38146Q(6);
                int a = b0Var.m38145a() / 4;
                for (int i = 0; i < a; i++) {
                    b0Var.m38137i(this.f5619a, 4);
                    int h = this.f5619a.m38176h(16);
                    this.f5619a.m38166r(3);
                    if (h == 0) {
                        this.f5619a.m38166r(13);
                    } else {
                        int h2 = this.f5619a.m38176h(13);
                        if (C1567h0.this.f5606g.get(h2) == null) {
                            C1567h0.this.f5606g.put(h2, new C1556c0(new C1569b(h2)));
                            C1567h0.m36443l(C1567h0.this);
                        }
                    }
                }
                if (C1567h0.this.f5600a != 2) {
                    C1567h0.this.f5606g.remove(0);
                }
            }
        }
    }

    public class C1569b implements AbstractC1554b0 {
        public final C1187a0 f5621a = new C1187a0(new byte[5]);
        public final SparseArray<AbstractC1571i0> f5622b = new SparseArray<>();
        public final SparseIntArray f5623c = new SparseIntArray();
        public final int f5624d;

        public C1569b(int i) {
            this.f5624d = i;
        }

        @Override
        public void mo36324a(C1205i0 i0Var, AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        }

        @Override
        public void mo36323b(C1189b0 b0Var) {
            C1205i0 i0Var;
            if (b0Var.m38159D() == 2) {
                if (C1567h0.this.f5600a == 1 || C1567h0.this.f5600a == 2 || C1567h0.this.f5612m == 1) {
                    i0Var = (C1205i0) C1567h0.this.f5602c.get(0);
                } else {
                    i0Var = new C1205i0(((C1205i0) C1567h0.this.f5602c.get(0)).m38054c());
                    C1567h0.this.f5602c.add(i0Var);
                }
                if ((b0Var.m38159D() & Log.TAG_YOUTUBE) != 0) {
                    b0Var.m38146Q(1);
                    int J = b0Var.m38153J();
                    int i = 3;
                    b0Var.m38146Q(3);
                    b0Var.m38137i(this.f5621a, 2);
                    this.f5621a.m38166r(3);
                    int i2 = 13;
                    C1567h0.this.f5618s = this.f5621a.m38176h(13);
                    b0Var.m38137i(this.f5621a, 2);
                    int i3 = 4;
                    this.f5621a.m38166r(4);
                    b0Var.m38146Q(this.f5621a.m38176h(12));
                    if (C1567h0.this.f5600a == 2 && C1567h0.this.f5616q == null) {
                        AbstractC1571i0.C1573b bVar = new AbstractC1571i0.C1573b(21, null, null, C1216l0.f4531f);
                        C1567h0 h0Var = C1567h0.this;
                        h0Var.f5616q = h0Var.f5605f.mo36404b(21, bVar);
                        if (C1567h0.this.f5616q != null) {
                            C1567h0.this.f5616q.mo36321a(i0Var, C1567h0.this.f5611l, new AbstractC1571i0.C1575d(J, 21, Log.TAG_LUX));
                        }
                    }
                    this.f5622b.clear();
                    this.f5623c.clear();
                    int a = b0Var.m38145a();
                    while (a > 0) {
                        b0Var.m38137i(this.f5621a, 5);
                        int h = this.f5621a.m38176h(8);
                        this.f5621a.m38166r(i);
                        int h2 = this.f5621a.m38176h(i2);
                        this.f5621a.m38166r(i3);
                        int h3 = this.f5621a.m38176h(12);
                        AbstractC1571i0.C1573b c = m36428c(b0Var, h3);
                        if (h == 6 || h == 5) {
                            h = c.f5651a;
                        }
                        a -= h3 + 5;
                        int i4 = C1567h0.this.f5600a == 2 ? h : h2;
                        if (!C1567h0.this.f5607h.get(i4)) {
                            AbstractC1571i0 b = (C1567h0.this.f5600a == 2 && h == 21) ? C1567h0.this.f5616q : C1567h0.this.f5605f.mo36404b(h, c);
                            if (C1567h0.this.f5600a != 2 || h2 < this.f5623c.get(i4, Log.TAG_LUX)) {
                                this.f5623c.put(i4, h2);
                                this.f5622b.put(i4, b);
                            }
                        }
                        i = 3;
                        i3 = 4;
                        i2 = 13;
                    }
                    int size = this.f5623c.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        int keyAt = this.f5623c.keyAt(i5);
                        int valueAt = this.f5623c.valueAt(i5);
                        C1567h0.this.f5607h.put(keyAt, true);
                        C1567h0.this.f5608i.put(valueAt, true);
                        AbstractC1571i0 valueAt2 = this.f5622b.valueAt(i5);
                        if (valueAt2 != null) {
                            if (valueAt2 != C1567h0.this.f5616q) {
                                valueAt2.mo36321a(i0Var, C1567h0.this.f5611l, new AbstractC1571i0.C1575d(J, keyAt, Log.TAG_LUX));
                            }
                            C1567h0.this.f5606g.put(valueAt, valueAt2);
                        }
                    }
                    if (C1567h0.this.f5600a != 2) {
                        C1567h0.this.f5606g.remove(this.f5624d);
                        C1567h0 h0Var2 = C1567h0.this;
                        h0Var2.f5612m = h0Var2.f5600a == 1 ? 0 : C1567h0.this.f5612m - 1;
                        if (C1567h0.this.f5612m == 0) {
                            C1567h0.this.f5611l.mo6040m();
                            C1567h0.this.f5613n = true;
                        }
                    } else if (!C1567h0.this.f5613n) {
                        C1567h0.this.f5611l.mo6040m();
                        C1567h0.this.f5612m = 0;
                        C1567h0.this.f5613n = true;
                    }
                }
            }
        }

        public final AbstractC1571i0.C1573b m36428c(C1189b0 b0Var, int i) {
            int e = b0Var.m38141e();
            int i2 = i + e;
            String str = null;
            ArrayList arrayList = null;
            int i3 = -1;
            while (b0Var.m38141e() < i2) {
                int D = b0Var.m38159D();
                int e2 = b0Var.m38141e() + b0Var.m38159D();
                if (e2 > i2) {
                    break;
                } else if (D == 5) {
                    long F = b0Var.m38157F();
                    if (F != 1094921523) {
                        if (F != 1161904947) {
                            if (F != 1094921524) {
                                if (F == 1212503619) {
                                    i3 = 36;
                                }
                                b0Var.m38146Q(e2 - b0Var.m38141e());
                            }
                            i3 = 172;
                            b0Var.m38146Q(e2 - b0Var.m38141e());
                        }
                        i3 = 135;
                        b0Var.m38146Q(e2 - b0Var.m38141e());
                    }
                    i3 = 129;
                    b0Var.m38146Q(e2 - b0Var.m38141e());
                } else {
                    if (D != 106) {
                        if (D != 122) {
                            if (D == 127) {
                                if (b0Var.m38159D() != 21) {
                                }
                                i3 = 172;
                            } else if (D == 123) {
                                i3 = 138;
                            } else if (D == 10) {
                                str = b0Var.m38162A(3).trim();
                            } else if (D == 89) {
                                arrayList = new ArrayList();
                                while (b0Var.m38141e() < e2) {
                                    String trim = b0Var.m38162A(3).trim();
                                    int D2 = b0Var.m38159D();
                                    byte[] bArr = new byte[4];
                                    b0Var.m38136j(bArr, 0, 4);
                                    arrayList.add(new AbstractC1571i0.C1572a(trim, D2, bArr));
                                }
                                i3 = 89;
                            } else if (D == 111) {
                                i3 = 257;
                            }
                            b0Var.m38146Q(e2 - b0Var.m38141e());
                        }
                        i3 = 135;
                        b0Var.m38146Q(e2 - b0Var.m38141e());
                    }
                    i3 = 129;
                    b0Var.m38146Q(e2 - b0Var.m38141e());
                }
            }
            b0Var.m38147P(i2);
            return new AbstractC1571i0.C1573b(i3, str, arrayList, Arrays.copyOfRange(b0Var.m38142d(), e, i2));
        }
    }

    public C1567h0() {
        this(0);
    }

    public static int m36443l(C1567h0 h0Var) {
        int i = h0Var.f5612m;
        h0Var.f5612m = i + 1;
        return i;
    }

    public static AbstractC8958f[] m36431x() {
        return new AbstractC8958f[]{new C1567h0()};
    }

    public final boolean m36450A(int i) {
        return this.f5600a == 2 || this.f5613n || !this.f5608i.get(i, false);
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        C1560e0 e0Var;
        C1186a.m38187f(this.f5600a != 2);
        int size = this.f5602c.size();
        for (int i = 0; i < size; i++) {
            C1205i0 i0Var = this.f5602c.get(i);
            boolean z = i0Var.m38052e() == -9223372036854775807L;
            if (!z) {
                long c = i0Var.m38054c();
                z = (c == -9223372036854775807L || c == 0 || c == j2) ? false : true;
            }
            if (z) {
                i0Var.m38050g(j2);
            }
        }
        if (!(j2 == 0 || (e0Var = this.f5610k) == null)) {
            e0Var.m30498h(j2);
        }
        this.f5603d.m38151L(0);
        this.f5604e.clear();
        for (int i2 = 0; i2 < this.f5606g.size(); i2++) {
            this.f5606g.valueAt(i2).mo36319c();
        }
        this.f5617r = 0;
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        long a = gVar.mo6046a();
        if (this.f5613n) {
            if (((a == -1 || this.f5600a == 2) ? false : true) && !this.f5609j.m36463d()) {
                return this.f5609j.m36462e(gVar, qVar, this.f5618s);
            }
            m36430y(a);
            if (this.f5615p) {
                this.f5615p = false;
                mo1152b(0L, 0L);
                if (gVar.mo6043r() != 0) {
                    qVar.f28860a = 0L;
                    return 1;
                }
            }
            C1560e0 e0Var = this.f5610k;
            if (e0Var != null && e0Var.m30502d()) {
                return this.f5610k.m30503c(gVar, qVar);
            }
        }
        if (!m36433v(gVar)) {
            return -1;
        }
        int w = m36432w();
        int f = this.f5603d.m38140f();
        if (w > f) {
            return 0;
        }
        int n = this.f5603d.m38132n();
        if ((8388608 & n) != 0) {
            this.f5603d.m38147P(w);
            return 0;
        }
        int i = ((4194304 & n) != 0 ? 1 : 0) | 0;
        int i2 = (2096896 & n) >> 8;
        boolean z = (n & 32) != 0;
        AbstractC1571i0 i0Var = (n & 16) != 0 ? this.f5606g.get(i2) : null;
        if (i0Var == null) {
            this.f5603d.m38147P(w);
            return 0;
        }
        if (this.f5600a != 2) {
            int i3 = n & 15;
            int i4 = this.f5604e.get(i2, i3 - 1);
            this.f5604e.put(i2, i3);
            if (i4 == i3) {
                this.f5603d.m38147P(w);
                return 0;
            } else if (i3 != ((i4 + 1) & 15)) {
                i0Var.mo36319c();
            }
        }
        if (z) {
            int D = this.f5603d.m38159D();
            i |= (this.f5603d.m38159D() & 64) != 0 ? 2 : 0;
            this.f5603d.m38146Q(D - 1);
        }
        boolean z2 = this.f5613n;
        if (m36450A(i2)) {
            this.f5603d.m38148O(w);
            i0Var.mo36320b(this.f5603d, i);
            this.f5603d.m38148O(f);
        }
        if (this.f5600a != 2 && !z2 && this.f5613n && a != -1) {
            this.f5615p = true;
        }
        this.f5603d.m38147P(w);
        return 0;
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f5611l = hVar;
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        boolean z;
        byte[] d = this.f5603d.m38142d();
        gVar.mo10805q(d, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                } else if (d[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                gVar.mo10807n(i);
                return true;
            }
        }
        return false;
    }

    public final boolean m36433v(AbstractC8959g gVar) {
        byte[] d = this.f5603d.m38142d();
        if (9400 - this.f5603d.m38141e() < 188) {
            int a = this.f5603d.m38145a();
            if (a > 0) {
                System.arraycopy(d, this.f5603d.m38141e(), d, 0, a);
            }
            this.f5603d.m38149N(d, a);
        }
        while (this.f5603d.m38145a() < 188) {
            int f = this.f5603d.m38140f();
            int b = gVar.mo4414b(d, f, 9400 - f);
            if (b == -1) {
                return false;
            }
            this.f5603d.m38148O(f + b);
        }
        return true;
    }

    public final int m36432w() {
        int e = this.f5603d.m38141e();
        int f = this.f5603d.m38140f();
        int a = C1577j0.m36399a(this.f5603d.m38142d(), e, f);
        this.f5603d.m38147P(a);
        int i = a + 188;
        if (i > f) {
            int i2 = this.f5617r + (a - e);
            this.f5617r = i2;
            if (this.f5600a == 2 && i2 > 376) {
                throw C6556a2.m20113a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f5617r = 0;
        }
        return i;
    }

    public final void m36430y(long j) {
        if (!this.f5614o) {
            this.f5614o = true;
            if (this.f5609j.m36465b() != -9223372036854775807L) {
                C1560e0 e0Var = new C1560e0(this.f5609j.m36464c(), this.f5609j.m36465b(), j, this.f5618s, this.f5601b);
                this.f5610k = e0Var;
                this.f5611l.mo6042a(e0Var.m30504b());
                return;
            }
            this.f5611l.mo6042a(new AbstractC3470g.C3472b(this.f5609j.m36465b()));
        }
    }

    public final void m36429z() {
        this.f5607h.clear();
        this.f5606g.clear();
        SparseArray<AbstractC1571i0> a = this.f5605f.mo36405a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f5606g.put(a.keyAt(i), a.valueAt(i));
        }
        this.f5606g.put(0, new C1556c0(new C1568a()));
        this.f5616q = null;
    }

    public C1567h0(int i) {
        this(1, i, 112800);
    }

    public C1567h0(int i, int i2, int i3) {
        this(i, new C1205i0(0L), new C1576j(i2), i3);
    }

    public C1567h0(int i, C1205i0 i0Var, AbstractC1571i0.AbstractC1574c cVar, int i2) {
        this.f5605f = (AbstractC1571i0.AbstractC1574c) C1186a.m38188e(cVar);
        this.f5601b = i2;
        this.f5600a = i;
        if (i == 1 || i == 2) {
            this.f5602c = Collections.singletonList(i0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f5602c = arrayList;
            arrayList.add(i0Var);
        }
        this.f5603d = new C1189b0(new byte[9400], 0);
        this.f5607h = new SparseBooleanArray();
        this.f5608i = new SparseBooleanArray();
        this.f5606g = new SparseArray<>();
        this.f5604e = new SparseIntArray();
        this.f5609j = new C1563f0(i2);
        this.f5611l = AbstractC8960h.f28851L;
        this.f5618s = -1;
        m36429z();
    }
}
