package p019b4;

import com.google.android.exoplayer2.extractor.C3473h;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p019b4.AbstractC1180i;
import p020b5.C1186a;
import p020b5.C1189b0;
import p174m3.C6556a2;
import p174m3.C6600g1;

public final class C1184j extends AbstractC1180i {
    public C1185a f4459n;
    public int f4460o;
    public boolean f4461p;
    public C3473h.C3477d f4462q;
    public C3473h.C3475b f4463r;

    public static final class C1185a {
        public final C3473h.C3477d f4464a;
        public final C3473h.C3475b f4465b;
        public final byte[] f4466c;
        public final C3473h.C3476c[] f4467d;
        public final int f4468e;

        public C1185a(C3473h.C3477d dVar, C3473h.C3475b bVar, byte[] bArr, C3473h.C3476c[] cVarArr, int i) {
            this.f4464a = dVar;
            this.f4465b = bVar;
            this.f4466c = bArr;
            this.f4467d = cVarArr;
            this.f4468e = i;
        }
    }

    public static void m38197n(C1189b0 b0Var, long j) {
        if (b0Var.m38144b() < b0Var.m38140f() + 4) {
            b0Var.m38150M(Arrays.copyOf(b0Var.m38142d(), b0Var.m38140f() + 4));
        } else {
            b0Var.m38148O(b0Var.m38140f() + 4);
        }
        byte[] d = b0Var.m38142d();
        d[b0Var.m38140f() - 4] = (byte) (j & 255);
        d[b0Var.m38140f() - 3] = (byte) ((j >>> 8) & 255);
        d[b0Var.m38140f() - 2] = (byte) ((j >>> 16) & 255);
        d[b0Var.m38140f() - 1] = (byte) ((j >>> 24) & 255);
    }

    public static int m38196o(byte b, C1185a aVar) {
        if (!aVar.f4467d[m38195p(b, aVar.f4468e, 1)].f11481a) {
            return aVar.f4464a.f11491g;
        }
        return aVar.f4464a.f11492h;
    }

    public static int m38195p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static boolean m38193r(C1189b0 b0Var) {
        try {
            return C3473h.m30440l(1, b0Var, true);
        } catch (C6556a2 unused) {
            return false;
        }
    }

    @Override
    public void mo38201e(long j) {
        super.mo38201e(j);
        int i = 0;
        this.f4461p = j != 0;
        C3473h.C3477d dVar = this.f4462q;
        if (dVar != null) {
            i = dVar.f11491g;
        }
        this.f4460o = i;
    }

    @Override
    public long mo38200f(C1189b0 b0Var) {
        int i = 0;
        if ((b0Var.m38142d()[0] & 1) == 1) {
            return -1L;
        }
        int o = m38196o(b0Var.m38142d()[0], (C1185a) C1186a.m38185h(this.f4459n));
        if (this.f4461p) {
            i = (this.f4460o + o) / 4;
        }
        long j = i;
        m38197n(b0Var, j);
        this.f4461p = true;
        this.f4460o = o;
        return j;
    }

    @Override
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean mo38199h(C1189b0 b0Var, long j, AbstractC1180i.C1182b bVar) {
        if (this.f4459n != null) {
            C1186a.m38188e(bVar.f4457a);
            return false;
        }
        C1185a q = m38194q(b0Var);
        this.f4459n = q;
        if (q == null) {
            return true;
        }
        C3473h.C3477d dVar = q.f4464a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f11494j);
        arrayList.add(q.f4466c);
        bVar.f4457a = new C6600g1.C6602b().m19859e0("audio/vorbis").m19888G(dVar.f11489e).m19869Z(dVar.f11488d).m19887H(dVar.f11486b).m19857f0(dVar.f11487c).m19875T(arrayList).m19890E();
        return true;
    }

    @Override
    public void mo38198l(boolean z) {
        super.mo38198l(z);
        if (z) {
            this.f4459n = null;
            this.f4462q = null;
            this.f4463r = null;
        }
        this.f4460o = 0;
        this.f4461p = false;
    }

    public C1185a m38194q(C1189b0 b0Var) {
        C3473h.C3477d dVar = this.f4462q;
        if (dVar == null) {
            this.f4462q = C3473h.m30442j(b0Var);
            return null;
        }
        C3473h.C3475b bVar = this.f4463r;
        if (bVar == null) {
            this.f4463r = C3473h.m30444h(b0Var);
            return null;
        }
        byte[] bArr = new byte[b0Var.m38140f()];
        System.arraycopy(b0Var.m38142d(), 0, bArr, 0, b0Var.m38140f());
        C3473h.C3476c[] k = C3473h.m30441k(b0Var, dVar.f11486b);
        return new C1185a(dVar, bVar, bArr, k, C3473h.m30451a(k.length - 1));
    }
}
