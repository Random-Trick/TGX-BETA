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

    public static void m38194n(C1189b0 b0Var, long j) {
        if (b0Var.m38141b() < b0Var.m38137f() + 4) {
            b0Var.m38147M(Arrays.copyOf(b0Var.m38139d(), b0Var.m38137f() + 4));
        } else {
            b0Var.m38145O(b0Var.m38137f() + 4);
        }
        byte[] d = b0Var.m38139d();
        d[b0Var.m38137f() - 4] = (byte) (j & 255);
        d[b0Var.m38137f() - 3] = (byte) ((j >>> 8) & 255);
        d[b0Var.m38137f() - 2] = (byte) ((j >>> 16) & 255);
        d[b0Var.m38137f() - 1] = (byte) ((j >>> 24) & 255);
    }

    public static int m38193o(byte b, C1185a aVar) {
        if (!aVar.f4467d[m38192p(b, aVar.f4468e, 1)].f11481a) {
            return aVar.f4464a.f11491g;
        }
        return aVar.f4464a.f11492h;
    }

    public static int m38192p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static boolean m38190r(C1189b0 b0Var) {
        try {
            return C3473h.m30438l(1, b0Var, true);
        } catch (C6556a2 unused) {
            return false;
        }
    }

    @Override
    public void mo38198e(long j) {
        super.mo38198e(j);
        int i = 0;
        this.f4461p = j != 0;
        C3473h.C3477d dVar = this.f4462q;
        if (dVar != null) {
            i = dVar.f11491g;
        }
        this.f4460o = i;
    }

    @Override
    public long mo38197f(C1189b0 b0Var) {
        int i = 0;
        if ((b0Var.m38139d()[0] & 1) == 1) {
            return -1L;
        }
        int o = m38193o(b0Var.m38139d()[0], (C1185a) C1186a.m38182h(this.f4459n));
        if (this.f4461p) {
            i = (this.f4460o + o) / 4;
        }
        long j = i;
        m38194n(b0Var, j);
        this.f4461p = true;
        this.f4460o = o;
        return j;
    }

    @Override
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean mo38196h(C1189b0 b0Var, long j, AbstractC1180i.C1182b bVar) {
        if (this.f4459n != null) {
            C1186a.m38185e(bVar.f4457a);
            return false;
        }
        C1185a q = m38191q(b0Var);
        this.f4459n = q;
        if (q == null) {
            return true;
        }
        C3473h.C3477d dVar = q.f4464a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f11494j);
        arrayList.add(q.f4466c);
        bVar.f4457a = new C6600g1.C6602b().m19858e0("audio/vorbis").m19887G(dVar.f11489e).m19868Z(dVar.f11488d).m19886H(dVar.f11486b).m19856f0(dVar.f11487c).m19874T(arrayList).m19889E();
        return true;
    }

    @Override
    public void mo38195l(boolean z) {
        super.mo38195l(z);
        if (z) {
            this.f4459n = null;
            this.f4462q = null;
            this.f4463r = null;
        }
        this.f4460o = 0;
        this.f4461p = false;
    }

    public C1185a m38191q(C1189b0 b0Var) {
        C3473h.C3477d dVar = this.f4462q;
        if (dVar == null) {
            this.f4462q = C3473h.m30440j(b0Var);
            return null;
        }
        C3473h.C3475b bVar = this.f4463r;
        if (bVar == null) {
            this.f4463r = C3473h.m30442h(b0Var);
            return null;
        }
        byte[] bArr = new byte[b0Var.m38137f()];
        System.arraycopy(b0Var.m38139d(), 0, bArr, 0, b0Var.m38137f());
        C3473h.C3476c[] k = C3473h.m30439k(b0Var, dVar.f11486b);
        return new C1185a(dVar, bVar, bArr, k, C3473h.m30449a(k.length - 1));
    }
}
