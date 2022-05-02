package p174m3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p006a5.AbstractC0134e;
import p006a5.C0156l;
import p020b5.AbstractC1192d;
import p020b5.AbstractC1221n;
import p020b5.C1186a;
import p020b5.C1210j0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p039d.C3563j;
import p073f4.C4260a;
import p174m3.AbstractC6604g3;
import p174m3.AbstractC6696s2;
import p174m3.C6639l;
import p174m3.C6654n2;
import p174m3.C6660o1;
import p174m3.C6728z1;
import p186n3.C7122h1;
import p187n4.AbstractC7206l0;
import p187n4.AbstractC7214n0;
import p187n4.AbstractC7223q;
import p187n4.AbstractC7230t;
import p187n4.C7165b;
import p187n4.C7233t0;
import p217p4.C8049m;
import p230q3.AbstractC8208o;
import p343y6.AbstractC10444n;
import p356z4.AbstractC11265j;
import p356z4.AbstractC11280t;
import p356z4.C11282u;
import p358z6.AbstractC11396q;
import p358z6.C11387o0;

public final class C6570c1 implements Handler.Callback, AbstractC7223q.AbstractC7224a, AbstractC11280t.AbstractC11281a, C6728z1.AbstractC6732d, C6639l.AbstractC6640a, C6654n2.AbstractC6655a {
    public final AbstractC11280t f20429M;
    public final C11282u f20430N;
    public final AbstractC6648m1 f20431O;
    public final AbstractC0134e f20432P;
    public final AbstractC1221n f20433Q;
    public final HandlerThread f20434R;
    public final Looper f20435S;
    public final AbstractC6604g3.C6608d f20436T;
    public final AbstractC6604g3.C6606b f20437U;
    public final long f20438V;
    public final boolean f20439W;
    public final C6639l f20440X;
    public final ArrayList<C6574d> f20441Y;
    public final AbstractC1192d f20442Z;
    public final AbstractC6696s2[] f20443a;
    public final AbstractC6576f f20444a0;
    public final Set<AbstractC6696s2> f20445b;
    public final C6712w1 f20446b0;
    public final AbstractC6705u2[] f20447c;
    public final C6728z1 f20448c0;
    public final AbstractC6642l1 f20449d0;
    public final long f20450e0;
    public C6717x2 f20451f0;
    public C6596f2 f20452g0;
    public C6575e f20453h0;
    public boolean f20454i0;
    public boolean f20455j0;
    public boolean f20456k0;
    public boolean f20457l0;
    public boolean f20458m0;
    public int f20459n0;
    public boolean f20460o0;
    public boolean f20461p0;
    public boolean f20462q0;
    public boolean f20463r0;
    public int f20464s0;
    public C6578h f20465t0;
    public long f20466u0;
    public int f20467v0;
    public boolean f20468w0;
    public C6681q f20469x0;
    public long f20470y0;

    public class C6571a implements AbstractC6696s2.AbstractC6697a {
        public C6571a() {
        }

        @Override
        public void mo19466a() {
            C6570c1.this.f20433Q.mo37912f(2);
        }

        @Override
        public void mo19465b(long j) {
            if (j >= 2000) {
                C6570c1.this.f20462q0 = true;
            }
        }
    }

    public static final class C6572b {
        public final List<C6728z1.C6731c> f20472a;
        public final AbstractC7214n0 f20473b;
        public final int f20474c;
        public final long f20475d;

        public C6572b(List list, AbstractC7214n0 n0Var, int i, long j, C6571a aVar) {
            this(list, n0Var, i, j);
        }

        public C6572b(List<C6728z1.C6731c> list, AbstractC7214n0 n0Var, int i, long j) {
            this.f20472a = list;
            this.f20473b = n0Var;
            this.f20474c = i;
            this.f20475d = j;
        }
    }

    public static class C6573c {
        public final int f20476a;
        public final int f20477b;
        public final int f20478c;
        public final AbstractC7214n0 f20479d;

        public C6573c(int i, int i2, int i3, AbstractC7214n0 n0Var) {
            this.f20476a = i;
            this.f20477b = i2;
            this.f20478c = i3;
            this.f20479d = n0Var;
        }
    }

    public static final class C6574d implements Comparable<C6574d> {
        public Object f20480M;
        public final C6654n2 f20481a;
        public int f20482b;
        public long f20483c;

        public C6574d(C6654n2 n2Var) {
            this.f20481a = n2Var;
        }

        public int compareTo(C6574d dVar) {
            Object obj = this.f20480M;
            if ((obj == null) != (dVar.f20480M == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f20482b - dVar.f20482b;
            return i != 0 ? i : C1216l0.m37960n(this.f20483c, dVar.f20483c);
        }

        public void m19973b(int i, long j, Object obj) {
            this.f20482b = i;
            this.f20483c = j;
            this.f20480M = obj;
        }
    }

    public static final class C6575e {
        public boolean f20484a;
        public C6596f2 f20485b;
        public int f20486c;
        public boolean f20487d;
        public int f20488e;
        public boolean f20489f;
        public int f20490g;

        public C6575e(C6596f2 f2Var) {
            this.f20485b = f2Var;
        }

        public void m19971b(int i) {
            this.f20484a |= i > 0;
            this.f20486c += i;
        }

        public void m19970c(int i) {
            this.f20484a = true;
            this.f20489f = true;
            this.f20490g = i;
        }

        public void m19969d(C6596f2 f2Var) {
            this.f20484a |= this.f20485b != f2Var;
            this.f20485b = f2Var;
        }

        public void m19968e(int i) {
            boolean z = true;
            if (!this.f20487d || this.f20488e == 5) {
                this.f20484a = true;
                this.f20487d = true;
                this.f20488e = i;
                return;
            }
            if (i != 5) {
                z = false;
            }
            C1186a.m38189a(z);
        }
    }

    public interface AbstractC6576f {
        void mo19577a(C6575e eVar);
    }

    public static final class C6577g {
        public final AbstractC7230t.C7231a f20491a;
        public final long f20492b;
        public final long f20493c;
        public final boolean f20494d;
        public final boolean f20495e;
        public final boolean f20496f;

        public C6577g(AbstractC7230t.C7231a aVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f20491a = aVar;
            this.f20492b = j;
            this.f20493c = j2;
            this.f20494d = z;
            this.f20495e = z2;
            this.f20496f = z3;
        }
    }

    public static final class C6578h {
        public final AbstractC6604g3 f20497a;
        public final int f20498b;
        public final long f20499c;

        public C6578h(AbstractC6604g3 g3Var, int i, long j) {
            this.f20497a = g3Var;
            this.f20498b = i;
            this.f20499c = j;
        }
    }

    public C6570c1(AbstractC6696s2[] s2VarArr, AbstractC11280t tVar, C11282u uVar, AbstractC6648m1 m1Var, AbstractC0134e eVar, int i, boolean z, C7122h1 h1Var, C6717x2 x2Var, AbstractC6642l1 l1Var, long j, boolean z2, Looper looper, AbstractC1192d dVar, AbstractC6576f fVar) {
        this.f20444a0 = fVar;
        this.f20443a = s2VarArr;
        this.f20429M = tVar;
        this.f20430N = uVar;
        this.f20431O = m1Var;
        this.f20432P = eVar;
        this.f20459n0 = i;
        this.f20460o0 = z;
        this.f20451f0 = x2Var;
        this.f20449d0 = l1Var;
        this.f20450e0 = j;
        this.f20470y0 = j;
        this.f20455j0 = z2;
        this.f20442Z = dVar;
        this.f20438V = m1Var.mo19672c();
        this.f20439W = m1Var.mo19673b();
        C6596f2 k = C6596f2.m19905k(uVar);
        this.f20452g0 = k;
        this.f20453h0 = new C6575e(k);
        this.f20447c = new AbstractC6705u2[s2VarArr.length];
        for (int i2 = 0; i2 < s2VarArr.length; i2++) {
            s2VarArr[i2].mo19472r(i2);
            this.f20447c[i2] = s2VarArr[i2].mo19474p();
        }
        this.f20440X = new C6639l(this, dVar);
        this.f20441Y = new ArrayList<>();
        this.f20445b = C11387o0.m775h();
        this.f20436T = new AbstractC6604g3.C6608d();
        this.f20437U = new AbstractC6604g3.C6606b();
        tVar.m962b(this, eVar);
        this.f20468w0 = true;
        Handler handler = new Handler(looper);
        this.f20446b0 = new C6712w1(h1Var, handler);
        this.f20448c0 = new C6728z1(this, h1Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f20434R = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f20435S = looper2;
        this.f20433Q = dVar.mo38083b(looper2, this);
    }

    public static boolean m20065O(AbstractC6696s2 s2Var) {
        return s2Var.mo19479i() != 0;
    }

    public static boolean m20061Q(C6596f2 f2Var, AbstractC6604g3.C6606b bVar) {
        AbstractC7230t.C7231a aVar = f2Var.f20544b;
        AbstractC6604g3 g3Var = f2Var.f20543a;
        return g3Var.m19819w() || g3Var.mo19825l(aVar.f23017a, bVar).f20635O;
    }

    public Boolean m20059R() {
        return Boolean.valueOf(this.f20454i0);
    }

    public void m20057S(C6654n2 n2Var) {
        try {
            m20010m(n2Var);
        } catch (C6681q e) {
            C1230s.m37886d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    public static void m19991t0(AbstractC6604g3 g3Var, C6574d dVar, AbstractC6604g3.C6608d dVar2, AbstractC6604g3.C6606b bVar) {
        int i = g3Var.m19820t(g3Var.mo19825l(dVar.f20480M, bVar).f20639c, dVar2).f20660Y;
        Object obj = g3Var.mo17301k(i, bVar, true).f20638b;
        long j = bVar.f20633M;
        dVar.m19973b(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    public static boolean m19989u0(C6574d dVar, AbstractC6604g3 g3Var, AbstractC6604g3 g3Var2, int i, boolean z, AbstractC6604g3.C6608d dVar2, AbstractC6604g3.C6606b bVar) {
        Object obj = dVar.f20480M;
        if (obj == null) {
            Pair<Object, Long> x0 = m19983x0(g3Var, new C6578h(dVar.f20481a.m19655h(), dVar.f20481a.m19659d(), dVar.f20481a.m19657f() == Long.MIN_VALUE ? -9223372036854775807L : C1216l0.m37953q0(dVar.f20481a.m19657f())), false, i, z, dVar2, bVar);
            if (x0 == null) {
                return false;
            }
            dVar.m19973b(g3Var.mo17302f(x0.first), ((Long) x0.second).longValue(), x0.first);
            if (dVar.f20481a.m19657f() == Long.MIN_VALUE) {
                m19991t0(g3Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int f = g3Var.mo17302f(obj);
        if (f == -1) {
            return false;
        }
        if (dVar.f20481a.m19657f() == Long.MIN_VALUE) {
            m19991t0(g3Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f20482b = f;
        g3Var2.mo19825l(dVar.f20480M, bVar);
        if (bVar.f20635O && g3Var2.m19820t(bVar.f20639c, dVar2).f20659X == g3Var2.mo17302f(dVar.f20480M)) {
            Pair<Object, Long> n = g3Var.m19824n(dVar2, bVar, g3Var.mo19825l(dVar.f20480M, bVar).f20639c, dVar.f20483c + bVar.m19802o());
            dVar.m19973b(g3Var.mo17302f(n.first), ((Long) n.second).longValue(), n.first);
        }
        return true;
    }

    public static C6600g1[] m19986w(AbstractC11265j jVar) {
        int length = jVar != null ? jVar.length() : 0;
        C6600g1[] g1VarArr = new C6600g1[length];
        for (int i = 0; i < length; i++) {
            g1VarArr[i] = jVar.mo1009d(i);
        }
        return g1VarArr;
    }

    public static C6577g m19985w0(AbstractC6604g3 g3Var, C6596f2 f2Var, C6578h hVar, C6712w1 w1Var, int i, boolean z, AbstractC6604g3.C6608d dVar, AbstractC6604g3.C6606b bVar) {
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        AbstractC7230t.C7231a aVar;
        int i3;
        long j2;
        long j3;
        C6712w1 w1Var2;
        int i4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        boolean z6;
        boolean z7;
        boolean z8;
        if (g3Var.m19819w()) {
            return new C6577g(C6596f2.m19904l(), 0L, -9223372036854775807L, false, true, false);
        }
        AbstractC7230t.C7231a aVar2 = f2Var.f20544b;
        Object obj = aVar2.f23017a;
        boolean Q = m20061Q(f2Var, bVar);
        if (f2Var.f20544b.m17274b() || Q) {
            j = f2Var.f20545c;
        } else {
            j = f2Var.f20561s;
        }
        long j4 = j;
        boolean z9 = false;
        if (hVar != null) {
            i2 = -1;
            Pair<Object, Long> x0 = m19983x0(g3Var, hVar, true, i, z, dVar, bVar);
            if (x0 == null) {
                i7 = g3Var.mo17401e(z);
                j2 = j4;
                z8 = false;
                z7 = false;
                z6 = true;
            } else {
                if (hVar.f20499c == -9223372036854775807L) {
                    i7 = g3Var.mo19825l(x0.first, bVar).f20639c;
                    j2 = j4;
                    z8 = false;
                } else {
                    obj = x0.first;
                    j2 = ((Long) x0.second).longValue();
                    z8 = true;
                    i7 = -1;
                }
                z7 = f2Var.f20547e == 4;
                z6 = false;
            }
            z2 = z8;
            z4 = z7;
            z3 = z6;
            i3 = i7;
            aVar = aVar2;
        } else {
            i2 = -1;
            if (f2Var.f20543a.m19819w()) {
                i5 = g3Var.mo17401e(z);
            } else if (g3Var.mo17302f(obj) == -1) {
                Object y0 = m19981y0(dVar, bVar, i, z, obj, f2Var.f20543a, g3Var);
                if (y0 == null) {
                    i6 = g3Var.mo17401e(z);
                    z5 = true;
                } else {
                    i6 = g3Var.mo19825l(y0, bVar).f20639c;
                    z5 = false;
                }
                i3 = i6;
                z3 = z5;
                j2 = j4;
                aVar = aVar2;
                z4 = false;
                z2 = false;
            } else if (j4 == -9223372036854775807L) {
                i5 = g3Var.mo19825l(obj, bVar).f20639c;
            } else if (Q) {
                aVar = aVar2;
                f2Var.f20543a.mo19825l(aVar.f23017a, bVar);
                if (f2Var.f20543a.m19820t(bVar.f20639c, dVar).f20659X == f2Var.f20543a.mo17302f(aVar.f23017a)) {
                    Pair<Object, Long> n = g3Var.m19824n(dVar, bVar, g3Var.mo19825l(obj, bVar).f20639c, j4 + bVar.m19802o());
                    Object obj2 = n.first;
                    j2 = ((Long) n.second).longValue();
                    obj = obj2;
                } else {
                    j2 = j4;
                }
                i3 = -1;
                z4 = false;
                z3 = false;
                z2 = true;
            } else {
                aVar = aVar2;
                j2 = j4;
                i3 = -1;
                z4 = false;
                z3 = false;
                z2 = false;
            }
            i3 = i5;
            j2 = j4;
            aVar = aVar2;
            z4 = false;
            z3 = false;
            z2 = false;
        }
        if (i3 != i2) {
            Pair<Object, Long> n2 = g3Var.m19824n(dVar, bVar, i3, -9223372036854775807L);
            obj = n2.first;
            j2 = ((Long) n2.second).longValue();
            w1Var2 = w1Var;
            j3 = -9223372036854775807L;
        } else {
            w1Var2 = w1Var;
            j3 = j2;
        }
        AbstractC7230t.C7231a A = w1Var2.m19429A(g3Var, obj, j2);
        boolean z10 = A.f23021e == i2 || ((i4 = aVar.f23021e) != i2 && A.f23018b >= i4);
        boolean equals = aVar.f23017a.equals(obj);
        boolean z11 = equals && !aVar.m17274b() && !A.m17274b() && z10;
        g3Var.mo19825l(obj, bVar);
        if (equals && !Q && j4 == j3 && ((A.m17274b() && bVar.m19801p(A.f23018b)) || (aVar.m17274b() && bVar.m19801p(aVar.f23018b)))) {
            z9 = true;
        }
        if (z11 || z9) {
            A = aVar;
        }
        if (A.m17274b()) {
            if (A.equals(aVar)) {
                j2 = f2Var.f20561s;
            } else {
                g3Var.mo19825l(A.f23017a, bVar);
                j2 = A.f23019c == bVar.m19805l(A.f23018b) ? bVar.m19808i() : 0L;
            }
        }
        return new C6577g(A, j2, j3, z4, z3, z2);
    }

    public static Pair<Object, Long> m19983x0(AbstractC6604g3 g3Var, C6578h hVar, boolean z, int i, boolean z2, AbstractC6604g3.C6608d dVar, AbstractC6604g3.C6606b bVar) {
        Pair<Object, Long> n;
        Object y0;
        AbstractC6604g3 g3Var2 = hVar.f20497a;
        if (g3Var.m19819w()) {
            return null;
        }
        AbstractC6604g3 g3Var3 = g3Var2.m19819w() ? g3Var : g3Var2;
        try {
            n = g3Var3.m19824n(dVar, bVar, hVar.f20498b, hVar.f20499c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (g3Var.equals(g3Var3)) {
            return n;
        }
        if (g3Var.mo17302f(n.first) != -1) {
            return (!g3Var3.mo19825l(n.first, bVar).f20635O || g3Var3.m19820t(bVar.f20639c, dVar).f20659X != g3Var3.mo17302f(n.first)) ? n : g3Var.m19824n(dVar, bVar, g3Var.mo19825l(n.first, bVar).f20639c, hVar.f20499c);
        }
        if (z && (y0 = m19981y0(dVar, bVar, i, z2, n.first, g3Var3, g3Var)) != null) {
            return g3Var.m19824n(dVar, bVar, g3Var.mo19825l(y0, bVar).f20639c, -9223372036854775807L);
        }
        return null;
    }

    public static Object m19981y0(AbstractC6604g3.C6608d dVar, AbstractC6604g3.C6606b bVar, int i, boolean z, Object obj, AbstractC6604g3 g3Var, AbstractC6604g3 g3Var2) {
        int f = g3Var.mo17302f(obj);
        int m = g3Var.mo17300m();
        int i2 = f;
        int i3 = -1;
        for (int i4 = 0; i4 < m && i3 == -1; i4++) {
            i2 = g3Var.m19827h(i2, bVar, dVar, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = g3Var2.mo17302f(g3Var.mo17299s(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return g3Var2.mo17299s(i3);
    }

    public Looper m20093A() {
        return this.f20435S;
    }

    public void m20092A0(AbstractC6604g3 g3Var, int i, long j) {
        this.f20433Q.mo37908j(3, new C6578h(g3Var, i, j)).mo37906a();
    }

    public final long m20091B() {
        return m20089C(this.f20452g0.f20559q);
    }

    public final void m20090B0(boolean z) {
        AbstractC7230t.C7231a aVar = this.f20446b0.m19406p().f21023f.f21035a;
        long E0 = m20084E0(aVar, this.f20452g0.f20561s, true, false);
        if (E0 != this.f20452g0.f20561s) {
            C6596f2 f2Var = this.f20452g0;
            this.f20452g0 = m20073K(aVar, E0, f2Var.f20545c, f2Var.f20546d, z, 5);
        }
    }

    public final long m20089C(long j) {
        C6700t1 j2 = this.f20446b0.m19412j();
        if (j2 == null) {
            return 0L;
        }
        return Math.max(0L, j - j2.m19439y(this.f20466u0));
    }

    public final void m20088C0(p174m3.C6570c1.C6578h r20) {
        throw new UnsupportedOperationException("Method not decompiled: p174m3.C6570c1.m20088C0(m3.c1$h):void");
    }

    public final void m20087D(AbstractC7223q qVar) {
        if (this.f20446b0.m19400v(qVar)) {
            this.f20446b0.m19397y(this.f20466u0);
            m20055T();
        }
    }

    public final long m20086D0(AbstractC7230t.C7231a aVar, long j, boolean z) {
        return m20084E0(aVar, j, this.f20446b0.m19406p() != this.f20446b0.m19405q(), z);
    }

    public final void m20085E(IOException iOException, int i) {
        C6681q h = C6681q.m19581h(iOException, i);
        C6700t1 p = this.f20446b0.m19406p();
        if (p != null) {
            h = h.m19583f(p.f21023f.f21035a);
        }
        C1230s.m37886d("ExoPlayerImplInternal", "Playback error", h);
        m20022h1(false, false);
        this.f20452g0 = this.f20452g0.m19910f(h);
    }

    public final long m20084E0(AbstractC7230t.C7231a aVar, long j, boolean z, boolean z2) {
        m20020i1();
        this.f20457l0 = false;
        if (z2 || this.f20452g0.f20547e == 3) {
            m20042Z0(2);
        }
        C6700t1 p = this.f20446b0.m19406p();
        C6700t1 t1Var = p;
        while (t1Var != null && !aVar.equals(t1Var.f21023f.f21035a)) {
            t1Var = t1Var.m19454j();
        }
        if (z || p != t1Var || (t1Var != null && t1Var.m19438z(j) < 0)) {
            for (AbstractC6696s2 s2Var : this.f20443a) {
                m20007n(s2Var);
            }
            if (t1Var != null) {
                while (this.f20446b0.m19406p() != t1Var) {
                    this.f20446b0.m19420b();
                }
                this.f20446b0.m19396z(t1Var);
                t1Var.m19440x(1000000000000L);
                m19998q();
            }
        }
        if (t1Var != null) {
            this.f20446b0.m19396z(t1Var);
            if (!t1Var.f21021d) {
                t1Var.f21023f = t1Var.f21023f.m19432b(j);
            } else if (t1Var.f21022e) {
                long g = t1Var.f21018a.mo17285g(j);
                t1Var.f21018a.mo17278t(g - this.f20438V, this.f20439W);
                j = g;
            }
            m19993s0(j);
            m20055T();
        } else {
            this.f20446b0.m19416f();
            m19993s0(j);
        }
        m20083F(false);
        this.f20433Q.mo37912f(2);
        return j;
    }

    public final void m20083F(boolean z) {
        long j;
        C6700t1 j2 = this.f20446b0.m19412j();
        AbstractC7230t.C7231a aVar = j2 == null ? this.f20452g0.f20544b : j2.f21023f.f21035a;
        boolean z2 = !this.f20452g0.f20553k.equals(aVar);
        if (z2) {
            this.f20452g0 = this.f20452g0.m19914b(aVar);
        }
        C6596f2 f2Var = this.f20452g0;
        if (j2 == null) {
            j = f2Var.f20561s;
        } else {
            j = j2.m19455i();
        }
        f2Var.f20559q = j;
        this.f20452g0.f20560r = m20091B();
        if ((z2 || z) && j2 != null && j2.f21021d) {
            m20011l1(j2.m19450n(), j2.m19449o());
        }
    }

    public final void m20082F0(C6654n2 n2Var) {
        if (n2Var.m19657f() == -9223372036854775807L) {
            m20080G0(n2Var);
        } else if (this.f20452g0.f20543a.m19819w()) {
            this.f20441Y.add(new C6574d(n2Var));
        } else {
            C6574d dVar = new C6574d(n2Var);
            AbstractC6604g3 g3Var = this.f20452g0.f20543a;
            if (m19989u0(dVar, g3Var, g3Var, this.f20459n0, this.f20460o0, this.f20436T, this.f20437U)) {
                this.f20441Y.add(dVar);
                Collections.sort(this.f20441Y);
                return;
            }
            n2Var.m19652k(false);
        }
    }

    public final void m20081G(AbstractC6604g3 g3Var, boolean z) {
        Throwable th;
        boolean z2;
        C6577g w0 = m19985w0(g3Var, this.f20452g0, this.f20465t0, this.f20446b0, this.f20459n0, this.f20460o0, this.f20436T, this.f20437U);
        AbstractC7230t.C7231a aVar = w0.f20491a;
        long j = w0.f20493c;
        boolean z3 = w0.f20494d;
        long j2 = w0.f20492b;
        boolean z4 = !this.f20452g0.f20544b.equals(aVar) || j2 != this.f20452g0.f20561s;
        int i = 3;
        C6578h hVar = null;
        long j3 = -9223372036854775807L;
        try {
            if (w0.f20495e) {
                if (this.f20452g0.f20547e != 1) {
                    m20042Z0(4);
                }
                m19997q0(false, false, false, true);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (!z4) {
                z2 = false;
                if (!this.f20446b0.m19424F(g3Var, this.f20466u0, m19982y())) {
                    m20090B0(false);
                }
            } else {
                z2 = false;
                if (!g3Var.m19819w()) {
                    for (C6700t1 p = this.f20446b0.m19406p(); p != null; p = p.m19454j()) {
                        if (p.f21023f.f21035a.equals(aVar)) {
                            p.f21023f = this.f20446b0.m19404r(g3Var, p.f21023f);
                            p.m19464A();
                        }
                    }
                    j2 = m20086D0(aVar, j2, z3);
                }
            }
            C6596f2 f2Var = this.f20452g0;
            m20014k1(g3Var, aVar, f2Var.f20543a, f2Var.f20544b, w0.f20496f ? j2 : -9223372036854775807L);
            if (z4 || j != this.f20452g0.f20545c) {
                C6596f2 f2Var2 = this.f20452g0;
                Object obj = f2Var2.f20544b.f23017a;
                AbstractC6604g3 g3Var2 = f2Var2.f20543a;
                boolean z5 = z4 && z && !g3Var2.m19819w() && !g3Var2.mo19825l(obj, this.f20437U).f20635O;
                long j4 = this.f20452g0.f20546d;
                if (g3Var.mo17302f(obj) == -1) {
                    i = 4;
                }
                this.f20452g0 = m20073K(aVar, j2, j, j4, z5, i);
            }
            m19995r0();
            m19987v0(g3Var, this.f20452g0.f20543a);
            this.f20452g0 = this.f20452g0.m19906j(g3Var);
            if (!g3Var.m19819w()) {
                this.f20465t0 = null;
            }
            m20083F(z2);
        } catch (Throwable th3) {
            th = th3;
            hVar = null;
            C6596f2 f2Var3 = this.f20452g0;
            AbstractC6604g3 g3Var3 = f2Var3.f20543a;
            AbstractC7230t.C7231a aVar2 = f2Var3.f20544b;
            if (w0.f20496f) {
                j3 = j2;
            }
            C6578h hVar2 = hVar;
            m20014k1(g3Var, aVar, g3Var3, aVar2, j3);
            if (z4 || j != this.f20452g0.f20545c) {
                C6596f2 f2Var4 = this.f20452g0;
                Object obj2 = f2Var4.f20544b.f23017a;
                AbstractC6604g3 g3Var4 = f2Var4.f20543a;
                boolean z6 = z4 && z && !g3Var4.m19819w() && !g3Var4.mo19825l(obj2, this.f20437U).f20635O;
                long j5 = this.f20452g0.f20546d;
                if (g3Var.mo17302f(obj2) == -1) {
                    i = 4;
                }
                this.f20452g0 = m20073K(aVar, j2, j, j5, z6, i);
            }
            m19995r0();
            m19987v0(g3Var, this.f20452g0.f20543a);
            this.f20452g0 = this.f20452g0.m19906j(g3Var);
            if (!g3Var.m19819w()) {
                this.f20465t0 = hVar2;
            }
            m20083F(false);
            throw th;
        }
    }

    public final void m20080G0(C6654n2 n2Var) {
        if (n2Var.m19660c() == this.f20435S) {
            m20010m(n2Var);
            int i = this.f20452g0.f20547e;
            if (i == 3 || i == 2) {
                this.f20433Q.mo37912f(2);
                return;
            }
            return;
        }
        this.f20433Q.mo37908j(15, n2Var).mo37906a();
    }

    public final void m20079H(AbstractC7223q qVar) {
        if (this.f20446b0.m19400v(qVar)) {
            C6700t1 j = this.f20446b0.m19412j();
            j.m19448p(this.f20440X.mo15501j().f20671a, this.f20452g0.f20543a);
            m20011l1(j.m19450n(), j.m19449o());
            if (j == this.f20446b0.m19406p()) {
                m19993s0(j.f21023f.f21036b);
                m19998q();
                C6596f2 f2Var = this.f20452g0;
                AbstractC7230t.C7231a aVar = f2Var.f20544b;
                long j2 = j.f21023f.f21036b;
                this.f20452g0 = m20073K(aVar, j2, f2Var.f20545c, j2, false, 5);
            }
            m20055T();
        }
    }

    public final void m20078H0(final C6654n2 n2Var) {
        Looper c = n2Var.m19660c();
        if (!c.getThread().isAlive()) {
            C1230s.m37881i("TAG", "Trying to send message on a dead thread.");
            n2Var.m19652k(false);
            return;
        }
        this.f20442Z.mo38083b(c, null).mo37915c(new Runnable() {
            @Override
            public final void run() {
                C6570c1.this.m20057S(n2Var);
            }
        });
    }

    public final void m20077I(C6613h2 h2Var, float f, boolean z, boolean z2) {
        AbstractC6696s2[] s2VarArr;
        if (z) {
            if (z2) {
                this.f20453h0.m19971b(1);
            }
            this.f20452g0 = this.f20452g0.m19909g(h2Var);
        }
        m20002o1(h2Var.f20671a);
        for (AbstractC6696s2 s2Var : this.f20443a) {
            if (s2Var != null) {
                s2Var.mo19473q(f, h2Var.f20671a);
            }
        }
    }

    public final void m20076I0(long j) {
        AbstractC6696s2[] s2VarArr;
        for (AbstractC6696s2 s2Var : this.f20443a) {
            if (s2Var.mo19471v() != null) {
                m20074J0(s2Var, j);
            }
        }
    }

    public final void m20075J(C6613h2 h2Var, boolean z) {
        m20077I(h2Var, h2Var.f20671a, true, z);
    }

    public final void m20074J0(AbstractC6696s2 s2Var, long j) {
        s2Var.mo19475o();
        if (s2Var instanceof C8049m) {
            ((C8049m) s2Var).m13708Z(j);
        }
    }

    public final C6596f2 m20073K(AbstractC7230t.C7231a aVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        C11282u uVar;
        C7233t0 t0Var;
        C11282u uVar2;
        this.f20468w0 = this.f20468w0 || j != this.f20452g0.f20561s || !aVar.equals(this.f20452g0.f20544b);
        m19995r0();
        C6596f2 f2Var = this.f20452g0;
        C7233t0 t0Var2 = f2Var.f20550h;
        C11282u uVar3 = f2Var.f20551i;
        List list2 = f2Var.f20552j;
        if (this.f20448c0.m19191s()) {
            C6700t1 p = this.f20446b0.m19406p();
            if (p == null) {
                t0Var = C7233t0.f23027M;
            } else {
                t0Var = p.m19450n();
            }
            if (p == null) {
                uVar2 = this.f20430N;
            } else {
                uVar2 = p.m19449o();
            }
            list = m19990u(uVar2.f36194c);
            if (p != null) {
                C6704u1 u1Var = p.f21023f;
                if (u1Var.f21037c != j2) {
                    p.f21023f = u1Var.m19433a(j2);
                }
            }
            t0Var2 = t0Var;
            uVar = uVar2;
        } else if (!aVar.equals(this.f20452g0.f20544b)) {
            t0Var2 = C7233t0.f23027M;
            uVar = this.f20430N;
            list = AbstractC11396q.m768D();
        } else {
            list = list2;
            uVar = uVar3;
        }
        if (z) {
            this.f20453h0.m19968e(i);
        }
        return this.f20452g0.m19913c(aVar, j, j2, j3, m20091B(), t0Var2, uVar, list);
    }

    public final void m20072K0(boolean z, AtomicBoolean atomicBoolean) {
        AbstractC6696s2[] s2VarArr;
        if (this.f20461p0 != z) {
            this.f20461p0 = z;
            if (!z) {
                for (AbstractC6696s2 s2Var : this.f20443a) {
                    if (!m20065O(s2Var) && this.f20445b.remove(s2Var)) {
                        s2Var.mo19481c();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final boolean m20071L(AbstractC6696s2 s2Var, C6700t1 t1Var) {
        C6700t1 j = t1Var.m19454j();
        return t1Var.f21023f.f21040f && j.f21021d && ((s2Var instanceof C8049m) || s2Var.mo19469x() >= j.m19451m());
    }

    public final void m20070L0(C6572b bVar) {
        this.f20453h0.m19971b(1);
        if (bVar.f20474c != -1) {
            this.f20465t0 = new C6578h(new C6676o2(bVar.f20472a, bVar.f20473b), bVar.f20474c, bVar.f20475d);
        }
        m20081G(this.f20448c0.m19211C(bVar.f20472a, bVar.f20473b), false);
    }

    public final boolean m20069M() {
        C6700t1 q = this.f20446b0.m19405q();
        if (!q.f21021d) {
            return false;
        }
        int i = 0;
        while (true) {
            AbstractC6696s2[] s2VarArr = this.f20443a;
            if (i >= s2VarArr.length) {
                return true;
            }
            AbstractC6696s2 s2Var = s2VarArr[i];
            AbstractC7206l0 l0Var = q.f21020c[i];
            if (s2Var.mo19471v() != l0Var || (l0Var != null && !s2Var.mo19477m() && !m20071L(s2Var, q))) {
                break;
            }
            i++;
        }
        return false;
    }

    public void m20068M0(List<C6728z1.C6731c> list, int i, long j, AbstractC7214n0 n0Var) {
        this.f20433Q.mo37908j(17, new C6572b(list, n0Var, i, j, null)).mo37906a();
    }

    public final boolean m20067N() {
        C6700t1 j = this.f20446b0.m19412j();
        return (j == null || j.m19453k() == Long.MIN_VALUE) ? false : true;
    }

    public final void m20066N0(boolean z) {
        if (z != this.f20463r0) {
            this.f20463r0 = z;
            C6596f2 f2Var = this.f20452g0;
            int i = f2Var.f20547e;
            if (z || i == 4 || i == 1) {
                this.f20452g0 = f2Var.m19912d(z);
            } else {
                this.f20433Q.mo37912f(2);
            }
        }
    }

    public final void m20064O0(boolean z) {
        this.f20455j0 = z;
        m19995r0();
        if (this.f20456k0 && this.f20446b0.m19405q() != this.f20446b0.m19406p()) {
            m20090B0(true);
            m20083F(false);
        }
    }

    public final boolean m20063P() {
        C6700t1 p = this.f20446b0.m19406p();
        long j = p.f21023f.f21039e;
        return p.f21021d && (j == -9223372036854775807L || this.f20452g0.f20561s < j || !m20036c1());
    }

    public void m20062P0(boolean z, int i) {
        this.f20433Q.mo37917a(1, z ? 1 : 0, i).mo37906a();
    }

    public final void m20060Q0(boolean z, int i, boolean z2, int i2) {
        this.f20453h0.m19971b(z2 ? 1 : 0);
        this.f20453h0.m19970c(i2);
        this.f20452g0 = this.f20452g0.m19911e(z, i);
        this.f20457l0 = false;
        m20029f0(z);
        if (!m20036c1()) {
            m20020i1();
            m20005n1();
            return;
        }
        int i3 = this.f20452g0.f20547e;
        if (i3 == 3) {
            m20028f1();
            this.f20433Q.mo37912f(2);
        } else if (i3 == 2) {
            this.f20433Q.mo37912f(2);
        }
    }

    public void m20058R0(C6613h2 h2Var) {
        this.f20433Q.mo37908j(4, h2Var).mo37906a();
    }

    public final void m20056S0(C6613h2 h2Var) {
        this.f20440X.mo15504d(h2Var);
        m20075J(this.f20440X.mo15501j(), true);
    }

    public final void m20055T() {
        boolean b1 = m20038b1();
        this.f20458m0 = b1;
        if (b1) {
            this.f20446b0.m19412j().m19460d(this.f20466u0);
        }
        m20017j1();
    }

    public void m20054T0(int i) {
        this.f20433Q.mo37917a(11, i, 0).mo37906a();
    }

    public final void m20053U() {
        this.f20453h0.m19969d(this.f20452g0);
        if (this.f20453h0.f20484a) {
            this.f20444a0.mo19577a(this.f20453h0);
            this.f20453h0 = new C6575e(this.f20452g0);
        }
    }

    public final void m20052U0(int i) {
        this.f20459n0 = i;
        if (!this.f20446b0.m19423G(this.f20452g0.f20543a, i)) {
            m20090B0(true);
        }
        m20083F(false);
    }

    public final boolean m20051V(long j, long j2) {
        if (this.f20463r0 && this.f20462q0) {
            return false;
        }
        m19979z0(j, j2);
        return true;
    }

    public final void m20050V0(C6717x2 x2Var) {
        this.f20451f0 = x2Var;
    }

    public final void m20049W(long r8, long r10) {
        throw new UnsupportedOperationException("Method not decompiled: p174m3.C6570c1.m20049W(long, long):void");
    }

    public void m20048W0(boolean z) {
        this.f20433Q.mo37917a(12, z ? 1 : 0, 0).mo37906a();
    }

    public final void m20047X() {
        C6704u1 o;
        this.f20446b0.m19397y(this.f20466u0);
        if (this.f20446b0.m19426D() && (o = this.f20446b0.m19407o(this.f20466u0, this.f20452g0)) != null) {
            C6700t1 g = this.f20446b0.m19415g(this.f20447c, this.f20429M, this.f20431O.mo19666i(), this.f20448c0, o, this.f20430N);
            g.f21018a.mo17287e(this, o.f21036b);
            if (this.f20446b0.m19406p() == g) {
                m19993s0(o.f21036b);
            }
            m20083F(false);
        }
        if (this.f20458m0) {
            this.f20458m0 = m20067N();
            m20017j1();
            return;
        }
        m20055T();
    }

    public final void m20046X0(boolean z) {
        this.f20460o0 = z;
        if (!this.f20446b0.m19422H(this.f20452g0.f20543a, z)) {
            m20090B0(true);
        }
        m20083F(false);
    }

    public final void m20045Y() {
        boolean z = false;
        while (m20040a1()) {
            if (z) {
                m20053U();
            }
            C6700t1 p = this.f20446b0.m19406p();
            C6700t1 b = this.f20446b0.m19420b();
            C6704u1 u1Var = b.f21023f;
            AbstractC7230t.C7231a aVar = u1Var.f21035a;
            long j = u1Var.f21036b;
            C6596f2 K = m20073K(aVar, j, u1Var.f21037c, j, true, 0);
            this.f20452g0 = K;
            AbstractC6604g3 g3Var = K.f20543a;
            m20014k1(g3Var, b.f21023f.f21035a, g3Var, p.f21023f.f21035a, -9223372036854775807L);
            m19995r0();
            m20005n1();
            z = true;
        }
    }

    public final void m20044Y0(AbstractC7214n0 n0Var) {
        this.f20453h0.m19971b(1);
        m20081G(this.f20448c0.m19210D(n0Var), false);
    }

    public final void m20043Z() {
        C6700t1 q = this.f20446b0.m19405q();
        if (q != null) {
            int i = 0;
            if (q.m19454j() == null || this.f20456k0) {
                if (q.f21023f.f21043i || this.f20456k0) {
                    while (true) {
                        AbstractC6696s2[] s2VarArr = this.f20443a;
                        if (i < s2VarArr.length) {
                            AbstractC6696s2 s2Var = s2VarArr[i];
                            AbstractC7206l0 l0Var = q.f21020c[i];
                            if (l0Var != null && s2Var.mo19471v() == l0Var && s2Var.mo19477m()) {
                                long j = q.f21023f.f21039e;
                                m20074J0(s2Var, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : q.m19452l() + q.f21023f.f21039e);
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (m20069M()) {
                if (q.m19454j().f21021d || this.f20466u0 >= q.m19454j().m19451m()) {
                    C11282u o = q.m19449o();
                    C6700t1 c = this.f20446b0.m19419c();
                    C11282u o2 = c.m19449o();
                    if (!c.f21021d || c.f21018a.mo17281p() == -9223372036854775807L) {
                        for (int i2 = 0; i2 < this.f20443a.length; i2++) {
                            boolean c2 = o.m956c(i2);
                            boolean c3 = o2.m956c(i2);
                            if (c2 && !this.f20443a[i2].mo19467z()) {
                                boolean z = this.f20447c[i2].mo19431k() == -2;
                                C6709v2 v2Var = o.f36193b[i2];
                                C6709v2 v2Var2 = o2.f36193b[i2];
                                if (!c3 || !v2Var2.equals(v2Var) || z) {
                                    m20074J0(this.f20443a[i2], c.m19451m());
                                }
                            }
                        }
                        return;
                    }
                    m20076I0(c.m19451m());
                }
            }
        }
    }

    public final void m20042Z0(int i) {
        C6596f2 f2Var = this.f20452g0;
        if (f2Var.f20547e != i) {
            this.f20452g0 = f2Var.m19908h(i);
        }
    }

    @Override
    public void mo17276a(AbstractC7223q qVar) {
        this.f20433Q.mo37908j(8, qVar).mo37906a();
    }

    public final void m20041a0() {
        C6700t1 q = this.f20446b0.m19405q();
        if (q != null && this.f20446b0.m19406p() != q && !q.f21024g && m20003o0()) {
            m19998q();
        }
    }

    public final boolean m20040a1() {
        C6700t1 p;
        C6700t1 j;
        return m20036c1() && !this.f20456k0 && (p = this.f20446b0.m19406p()) != null && (j = p.m19454j()) != null && this.f20466u0 >= j.m19451m() && j.f21024g;
    }

    @Override
    public void mo19179b() {
        this.f20433Q.mo37912f(22);
    }

    public final void m20039b0() {
        m20081G(this.f20448c0.m19201i(), true);
    }

    public final boolean m20038b1() {
        long j;
        if (!m20067N()) {
            return false;
        }
        C6700t1 j2 = this.f20446b0.m19412j();
        long C = m20089C(j2.m19453k());
        if (j2 == this.f20446b0.m19406p()) {
            j = j2.m19439y(this.f20466u0);
        } else {
            j = j2.m19439y(this.f20466u0) - j2.f21023f.f21036b;
        }
        return this.f20431O.mo19667h(j, C, this.f20440X.mo15501j().f20671a);
    }

    @Override
    public void mo19722c(C6613h2 h2Var) {
        this.f20433Q.mo37908j(16, h2Var).mo37906a();
    }

    public final void m20037c0(C6573c cVar) {
        this.f20453h0.m19971b(1);
        m20081G(this.f20448c0.m19188v(cVar.f20476a, cVar.f20477b, cVar.f20478c, cVar.f20479d), false);
    }

    public final boolean m20036c1() {
        C6596f2 f2Var = this.f20452g0;
        return f2Var.f20554l && f2Var.f20555m == 0;
    }

    @Override
    public synchronized void mo19648d(C6654n2 n2Var) {
        if (!this.f20454i0 && this.f20434R.isAlive()) {
            this.f20433Q.mo37908j(14, n2Var).mo37906a();
            return;
        }
        C1230s.m37881i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        n2Var.m19652k(false);
    }

    public void m20035d0(int i, int i2, int i3, AbstractC7214n0 n0Var) {
        this.f20433Q.mo37908j(19, new C6573c(i, i2, i3, n0Var)).mo37906a();
    }

    public final boolean m20034d1(boolean z) {
        if (this.f20464s0 == 0) {
            return m20063P();
        }
        if (!z) {
            return false;
        }
        C6596f2 f2Var = this.f20452g0;
        if (!f2Var.f20549g) {
            return true;
        }
        long c = m20031e1(f2Var.f20543a, this.f20446b0.m19406p().f21023f.f21035a) ? this.f20449d0.mo19719c() : -9223372036854775807L;
        C6700t1 j = this.f20446b0.m19412j();
        return (j.m19447q() && j.f21023f.f21043i) || (j.f21023f.f21035a.m17274b() && !j.f21021d) || this.f20431O.mo19668g(m20091B(), this.f20440X.mo15501j().f20671a, this.f20457l0, c);
    }

    public final void m20032e0() {
        AbstractC11265j[] jVarArr;
        for (C6700t1 p = this.f20446b0.m19406p(); p != null; p = p.m19454j()) {
            for (AbstractC11265j jVar : p.m19449o().f36194c) {
                if (jVar != null) {
                    jVar.mo1024j();
                }
            }
        }
    }

    public final boolean m20031e1(AbstractC6604g3 g3Var, AbstractC7230t.C7231a aVar) {
        if (aVar.m17274b() || g3Var.m19819w()) {
            return false;
        }
        g3Var.m19820t(g3Var.mo19825l(aVar.f23017a, this.f20437U).f20639c, this.f20436T);
        if (!this.f20436T.m19790h()) {
            return false;
        }
        AbstractC6604g3.C6608d dVar = this.f20436T;
        return dVar.f20653R && dVar.f20650O != -9223372036854775807L;
    }

    public final void m20029f0(boolean z) {
        AbstractC11265j[] jVarArr;
        for (C6700t1 p = this.f20446b0.m19406p(); p != null; p = p.m19454j()) {
            for (AbstractC11265j jVar : p.m19449o().f36194c) {
                if (jVar != null) {
                    jVar.mo1029c(z);
                }
            }
        }
    }

    public final void m20028f1() {
        AbstractC6696s2[] s2VarArr;
        this.f20457l0 = false;
        this.f20440X.m19726f();
        for (AbstractC6696s2 s2Var : this.f20443a) {
            if (m20065O(s2Var)) {
                s2Var.start();
            }
        }
    }

    public final void m20026g0() {
        AbstractC11265j[] jVarArr;
        for (C6700t1 p = this.f20446b0.m19406p(); p != null; p = p.m19454j()) {
            for (AbstractC11265j jVar : p.m19449o().f36194c) {
                if (jVar != null) {
                    jVar.mo1023k();
                }
            }
        }
    }

    public void m20025g1() {
        this.f20433Q.mo37914d(6).mo37906a();
    }

    public void mo17336i(AbstractC7223q qVar) {
        this.f20433Q.mo37908j(9, qVar).mo37906a();
    }

    public final void m20022h1(boolean z, boolean z2) {
        m19997q0(z || !this.f20461p0, false, true, false);
        this.f20453h0.m19971b(z2 ? 1 : 0);
        this.f20431O.mo19674a();
        m20042Z0(1);
    }

    @Override
    public boolean handleMessage(Message message) {
        C6700t1 q;
        int i = 1000;
        try {
            switch (message.what) {
                case 0:
                    m20018j0();
                    break;
                case 1:
                    m20060Q0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m20004o();
                    break;
                case 3:
                    m20088C0((C6578h) message.obj);
                    break;
                case 4:
                    m20056S0((C6613h2) message.obj);
                    break;
                case 5:
                    m20050V0((C6717x2) message.obj);
                    break;
                case 6:
                    m20022h1(false, true);
                    break;
                case 7:
                    m20012l0();
                    return true;
                case 8:
                    m20079H((AbstractC7223q) message.obj);
                    break;
                case 9:
                    m20087D((AbstractC7223q) message.obj);
                    break;
                case 10:
                    m20000p0();
                    break;
                case 11:
                    m20052U0(message.arg1);
                    break;
                case 12:
                    m20046X0(message.arg1 != 0);
                    break;
                case 13:
                    m20072K0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m20082F0((C6654n2) message.obj);
                    break;
                case 15:
                    m20078H0((C6654n2) message.obj);
                    break;
                case 16:
                    m20075J((C6613h2) message.obj, false);
                    break;
                case 17:
                    m20070L0((C6572b) message.obj);
                    break;
                case 18:
                    m20019j((C6572b) message.obj, message.arg1);
                    break;
                case 19:
                    m20037c0((C6573c) message.obj);
                    break;
                case 20:
                    m20009m0(message.arg1, message.arg2, (AbstractC7214n0) message.obj);
                    break;
                case 21:
                    m20044Y0((AbstractC7214n0) message.obj);
                    break;
                case 22:
                    m20039b0();
                    break;
                case 23:
                    m20064O0(message.arg1 != 0);
                    break;
                case C3563j.f11955K3:
                    m20066N0(message.arg1 == 1);
                    break;
                case 25:
                    m20013l();
                    break;
                default:
                    return false;
            }
        } catch (C0156l e) {
            m20085E(e, e.f546a);
        } catch (C6556a2 e2) {
            int i2 = e2.f20404b;
            if (i2 == 1) {
                i = e2.f20403a ? 3001 : 3003;
            } else if (i2 == 4) {
                i = e2.f20403a ? 3002 : 3004;
            }
            m20085E(e2, i);
        } catch (C6681q e3) {
            e = e3;
            if (e.f20908M == 1 && (q = this.f20446b0.m19405q()) != null) {
                e = e.m19583f(q.f21023f.f21035a);
            }
            if (!e.f20914S || this.f20469x0 != null) {
                C6681q qVar = this.f20469x0;
                if (qVar != null) {
                    qVar.addSuppressed(e);
                    e = this.f20469x0;
                }
                C1230s.m37886d("ExoPlayerImplInternal", "Playback error", e);
                m20022h1(true, false);
                this.f20452g0 = this.f20452g0.m19910f(e);
            } else {
                C1230s.m37880j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f20469x0 = e;
                AbstractC1221n nVar = this.f20433Q;
                nVar.mo37916b(nVar.mo37908j(25, e));
            }
        } catch (C7165b e4) {
            m20085E(e4, 1002);
        } catch (AbstractC8208o.C8209a e5) {
            m20085E(e5, e5.f26570a);
        } catch (IOException e6) {
            m20085E(e6, 2000);
        } catch (RuntimeException e7) {
            if ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) {
                i = 1004;
            }
            C6681q j = C6681q.m19579j(e7, i);
            C1230s.m37886d("ExoPlayerImplInternal", "Playback error", j);
            m20022h1(true, false);
            this.f20452g0 = this.f20452g0.m19910f(j);
        }
        m20053U();
        return true;
    }

    public void m20021i0() {
        this.f20433Q.mo37914d(0).mo37906a();
    }

    public final void m20020i1() {
        AbstractC6696s2[] s2VarArr;
        this.f20440X.m19725h();
        for (AbstractC6696s2 s2Var : this.f20443a) {
            if (m20065O(s2Var)) {
                m19994s(s2Var);
            }
        }
    }

    public final void m20019j(C6572b bVar, int i) {
        this.f20453h0.m19971b(1);
        C6728z1 z1Var = this.f20448c0;
        if (i == -1) {
            i = z1Var.m19193q();
        }
        m20081G(z1Var.m19204f(i, bVar.f20472a, bVar.f20473b), false);
    }

    public final void m20018j0() {
        this.f20453h0.m19971b(1);
        m19997q0(false, false, false, true);
        this.f20431O.mo19671d();
        m20042Z0(this.f20452g0.f20543a.m19819w() ? 4 : 2);
        this.f20448c0.m19187w(this.f20432P.mo42179e());
        this.f20433Q.mo37912f(2);
    }

    public final void m20017j1() {
        C6700t1 j = this.f20446b0.m19412j();
        boolean z = this.f20458m0 || (j != null && j.f21018a.mo17283k());
        C6596f2 f2Var = this.f20452g0;
        if (z != f2Var.f20549g) {
            this.f20452g0 = f2Var.m19915a(z);
        }
    }

    public void m20016k(int i, List<C6728z1.C6731c> list, AbstractC7214n0 n0Var) {
        this.f20433Q.mo37911g(18, i, 0, new C6572b(list, n0Var, -1, -9223372036854775807L, null)).mo37906a();
    }

    public synchronized boolean m20015k0() {
        if (!this.f20454i0 && this.f20434R.isAlive()) {
            this.f20433Q.mo37912f(7);
            m19999p1(new AbstractC10444n() {
                @Override
                public final Object get() {
                    Boolean R;
                    R = C6570c1.this.m20059R();
                    return R;
                }
            }, this.f20450e0);
            return this.f20454i0;
        }
        return true;
    }

    public final void m20014k1(AbstractC6604g3 g3Var, AbstractC7230t.C7231a aVar, AbstractC6604g3 g3Var2, AbstractC7230t.C7231a aVar2, long j) {
        if (g3Var.m19819w() || !m20031e1(g3Var, aVar)) {
            float f = this.f20440X.mo15501j().f20671a;
            C6613h2 h2Var = this.f20452g0.f20556n;
            if (f != h2Var.f20671a) {
                this.f20440X.mo15504d(h2Var);
                return;
            }
            return;
        }
        g3Var.m19820t(g3Var.mo19825l(aVar.f23017a, this.f20437U).f20639c, this.f20436T);
        this.f20449d0.mo19721a((C6660o1.C6669g) C1216l0.m37968j(this.f20436T.f20655T));
        if (j != -9223372036854775807L) {
            this.f20449d0.mo19717e(m19984x(g3Var, aVar.f23017a, j));
            return;
        }
        Object obj = this.f20436T.f20662a;
        Object obj2 = null;
        if (!g3Var2.m19819w()) {
            obj2 = g3Var2.m19820t(g3Var2.mo19825l(aVar2.f23017a, this.f20437U).f20639c, this.f20436T).f20662a;
        }
        if (!C1216l0.m37982c(obj2, obj)) {
            this.f20449d0.mo19717e(-9223372036854775807L);
        }
    }

    public final void m20013l() {
        m20090B0(true);
    }

    public final void m20012l0() {
        m19997q0(true, false, true, false);
        this.f20431O.mo19669f();
        m20042Z0(1);
        this.f20434R.quit();
        synchronized (this) {
            this.f20454i0 = true;
            notifyAll();
        }
    }

    public final void m20011l1(C7233t0 t0Var, C11282u uVar) {
        this.f20431O.mo19670e(this.f20443a, t0Var, uVar.f36194c);
    }

    public final void m20010m(C6654n2 n2Var) {
        if (!n2Var.m19653j()) {
            try {
                n2Var.m19656g().mo15492u(n2Var.m19654i(), n2Var.m19658e());
            } finally {
                n2Var.m19652k(true);
            }
        }
    }

    public final void m20009m0(int i, int i2, AbstractC7214n0 n0Var) {
        this.f20453h0.m19971b(1);
        m20081G(this.f20448c0.m19213A(i, i2, n0Var), false);
    }

    public final void m20008m1() {
        if (!this.f20452g0.f20543a.m19819w() && this.f20448c0.m19191s()) {
            m20047X();
            m20043Z();
            m20041a0();
            m20045Y();
        }
    }

    public final void m20007n(AbstractC6696s2 s2Var) {
        if (m20065O(s2Var)) {
            this.f20440X.m19730a(s2Var);
            m19994s(s2Var);
            s2Var.mo19480h();
            this.f20464s0--;
        }
    }

    public void m20006n0(int i, int i2, AbstractC7214n0 n0Var) {
        this.f20433Q.mo37911g(20, i, i2, n0Var).mo37906a();
    }

    public final void m20005n1() {
        C6700t1 p = this.f20446b0.m19406p();
        if (p != null) {
            long p2 = p.f21021d ? p.f21018a.mo17281p() : -9223372036854775807L;
            if (p2 != -9223372036854775807L) {
                m19993s0(p2);
                if (p2 != this.f20452g0.f20561s) {
                    C6596f2 f2Var = this.f20452g0;
                    this.f20452g0 = m20073K(f2Var.f20544b, p2, f2Var.f20545c, p2, true, 5);
                }
            } else {
                long i = this.f20440X.m19724i(p != this.f20446b0.m19405q());
                this.f20466u0 = i;
                long y = p.m19439y(i);
                m20049W(this.f20452g0.f20561s, y);
                this.f20452g0.f20561s = y;
            }
            this.f20452g0.f20559q = this.f20446b0.m19412j().m19455i();
            this.f20452g0.f20560r = m20091B();
            C6596f2 f2Var2 = this.f20452g0;
            if (f2Var2.f20554l && f2Var2.f20547e == 3 && m20031e1(f2Var2.f20543a, f2Var2.f20544b) && this.f20452g0.f20556n.f20671a == 1.0f) {
                float b = this.f20449d0.mo19720b(m19988v(), m20091B());
                if (this.f20440X.mo15501j().f20671a != b) {
                    this.f20440X.mo15504d(this.f20452g0.f20556n.m19782e(b));
                    m20077I(this.f20452g0.f20556n, this.f20440X.mo15501j().f20671a, false, false);
                }
            }
        }
    }

    public final void m20004o() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        long a = this.f20442Z.mo38084a();
        m20008m1();
        int i2 = this.f20452g0.f20547e;
        if (i2 == 1 || i2 == 4) {
            this.f20433Q.mo37909i(2);
            return;
        }
        C6700t1 p = this.f20446b0.m19406p();
        if (p == null) {
            m19979z0(a, 10L);
            return;
        }
        C1210j0.m38035a("doSomeWork");
        m20005n1();
        if (p.f21021d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            p.f21018a.mo17278t(this.f20452g0.f20561s - this.f20438V, this.f20439W);
            int i3 = 0;
            z2 = true;
            z = true;
            while (true) {
                AbstractC6696s2[] s2VarArr = this.f20443a;
                if (i3 >= s2VarArr.length) {
                    break;
                }
                AbstractC6696s2 s2Var = s2VarArr[i3];
                if (m20065O(s2Var)) {
                    s2Var.mo13704t(this.f20466u0, elapsedRealtime);
                    z2 = z2 && s2Var.mo13706e();
                    boolean z4 = p.f21020c[i3] != s2Var.mo19471v();
                    boolean z5 = z4 || (!z4 && s2Var.mo19477m()) || s2Var.mo13705f() || s2Var.mo13706e();
                    z = z && z5;
                    if (!z5) {
                        s2Var.mo19470w();
                    }
                }
                i3++;
            }
        } else {
            p.f21018a.mo17286f();
            z2 = true;
            z = true;
        }
        long j = p.f21023f.f21039e;
        boolean z6 = z2 && p.f21021d && (j == -9223372036854775807L || j <= this.f20452g0.f20561s);
        if (z6 && this.f20456k0) {
            this.f20456k0 = false;
            m20060Q0(false, this.f20452g0.f20555m, false, 5);
        }
        if (z6 && p.f21023f.f21043i) {
            m20042Z0(4);
            m20020i1();
        } else if (this.f20452g0.f20547e == 2 && m20034d1(z)) {
            m20042Z0(3);
            this.f20469x0 = null;
            if (m20036c1()) {
                m20028f1();
            }
        } else if (this.f20452g0.f20547e == 3 && (this.f20464s0 != 0 ? !z : !m20063P())) {
            this.f20457l0 = m20036c1();
            m20042Z0(2);
            if (this.f20457l0) {
                m20026g0();
                this.f20449d0.mo19718d();
            }
            m20020i1();
        }
        if (this.f20452g0.f20547e == 2) {
            int i4 = 0;
            while (true) {
                AbstractC6696s2[] s2VarArr2 = this.f20443a;
                if (i4 >= s2VarArr2.length) {
                    break;
                }
                if (m20065O(s2VarArr2[i4]) && this.f20443a[i4].mo19471v() == p.f21020c[i4]) {
                    this.f20443a[i4].mo19470w();
                }
                i4++;
            }
            C6596f2 f2Var = this.f20452g0;
            if (!f2Var.f20549g && f2Var.f20560r < 500000 && m20067N()) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z7 = this.f20463r0;
        C6596f2 f2Var2 = this.f20452g0;
        if (z7 != f2Var2.f20557o) {
            this.f20452g0 = f2Var2.m19912d(z7);
        }
        if ((!m20036c1() || this.f20452g0.f20547e != 3) && (i = this.f20452g0.f20547e) != 2) {
            if (this.f20464s0 == 0 || i == 4) {
                this.f20433Q.mo37909i(2);
            } else {
                m19979z0(a, 1000L);
            }
            z3 = false;
        } else {
            z3 = !m20051V(a, 10L);
        }
        C6596f2 f2Var3 = this.f20452g0;
        if (f2Var3.f20558p != z3) {
            this.f20452g0 = f2Var3.m19907i(z3);
        }
        this.f20462q0 = false;
        C1210j0.m38033c();
    }

    public final boolean m20003o0() {
        C6700t1 q = this.f20446b0.m19405q();
        C11282u o = q.m19449o();
        int i = 0;
        boolean z = false;
        while (true) {
            AbstractC6696s2[] s2VarArr = this.f20443a;
            if (i >= s2VarArr.length) {
                return !z;
            }
            AbstractC6696s2 s2Var = s2VarArr[i];
            if (m20065O(s2Var)) {
                boolean z2 = s2Var.mo19471v() != q.f21020c[i];
                if (!o.m956c(i) || z2) {
                    if (!s2Var.mo19467z()) {
                        s2Var.mo19476n(m19986w(o.f36194c[i]), q.f21020c[i], q.m19451m(), q.m19452l());
                    } else if (s2Var.mo13706e()) {
                        m20007n(s2Var);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    public final void m20002o1(float f) {
        AbstractC11265j[] jVarArr;
        for (C6700t1 p = this.f20446b0.m19406p(); p != null; p = p.m19454j()) {
            for (AbstractC11265j jVar : p.m19449o().f36194c) {
                if (jVar != null) {
                    jVar.mo1025i(f);
                }
            }
        }
    }

    public final void m20001p(int i, boolean z) {
        AbstractC6696s2 s2Var = this.f20443a[i];
        if (!m20065O(s2Var)) {
            C6700t1 q = this.f20446b0.m19405q();
            boolean z2 = q == this.f20446b0.m19406p();
            C11282u o = q.m19449o();
            C6709v2 v2Var = o.f36193b[i];
            C6600g1[] w = m19986w(o.f36194c[i]);
            boolean z3 = m20036c1() && this.f20452g0.f20547e == 3;
            boolean z4 = !z && z3;
            this.f20464s0++;
            this.f20445b.add(s2Var);
            s2Var.mo19478l(v2Var, w, q.f21020c[i], this.f20466u0, z4, z2, q.m19451m(), q.m19452l());
            s2Var.mo15492u(11, new C6571a());
            this.f20440X.m19729b(s2Var);
            if (z3) {
                s2Var.start();
            }
        }
    }

    public final void m20000p0() {
        float f = this.f20440X.mo15501j().f20671a;
        C6700t1 q = this.f20446b0.m19405q();
        boolean z = true;
        for (C6700t1 p = this.f20446b0.m19406p(); p != null && p.f21021d; p = p.m19454j()) {
            C11282u v = p.m19442v(f, this.f20452g0.f20543a);
            if (!v.m958a(p.m19449o())) {
                if (z) {
                    C6700t1 p2 = this.f20446b0.m19406p();
                    boolean z2 = this.f20446b0.m19396z(p2);
                    boolean[] zArr = new boolean[this.f20443a.length];
                    long b = p2.m19462b(v, this.f20452g0.f20561s, z2, zArr);
                    C6596f2 f2Var = this.f20452g0;
                    boolean z3 = (f2Var.f20547e == 4 || b == f2Var.f20561s) ? false : true;
                    C6596f2 f2Var2 = this.f20452g0;
                    this.f20452g0 = m20073K(f2Var2.f20544b, b, f2Var2.f20545c, f2Var2.f20546d, z3, 5);
                    if (z3) {
                        m19993s0(b);
                    }
                    boolean[] zArr2 = new boolean[this.f20443a.length];
                    int i = 0;
                    while (true) {
                        AbstractC6696s2[] s2VarArr = this.f20443a;
                        if (i >= s2VarArr.length) {
                            break;
                        }
                        AbstractC6696s2 s2Var = s2VarArr[i];
                        zArr2[i] = m20065O(s2Var);
                        AbstractC7206l0 l0Var = p2.f21020c[i];
                        if (zArr2[i]) {
                            if (l0Var != s2Var.mo19471v()) {
                                m20007n(s2Var);
                            } else if (zArr[i]) {
                                s2Var.mo19468y(this.f20466u0);
                            }
                        }
                        i++;
                    }
                    m19996r(zArr2);
                } else {
                    this.f20446b0.m19396z(p);
                    if (p.f21021d) {
                        p.m19463a(v, Math.max(p.f21023f.f21036b, p.m19439y(this.f20466u0)), false);
                    }
                }
                m20083F(true);
                if (this.f20452g0.f20547e != 4) {
                    m20055T();
                    m20005n1();
                    this.f20433Q.mo37912f(2);
                    return;
                }
                return;
            }
            if (p == q) {
                z = false;
            }
        }
    }

    public final synchronized void m19999p1(AbstractC10444n<Boolean> nVar, long j) {
        long d = this.f20442Z.mo38081d() + j;
        boolean z = false;
        while (!nVar.get().booleanValue() && j > 0) {
            try {
                this.f20442Z.mo38082c();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = d - this.f20442Z.mo38081d();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void m19998q() {
        m19996r(new boolean[this.f20443a.length]);
    }

    public final void m19997q0(boolean r30, boolean r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: p174m3.C6570c1.m19997q0(boolean, boolean, boolean, boolean):void");
    }

    public final void m19996r(boolean[] zArr) {
        C6700t1 q = this.f20446b0.m19405q();
        C11282u o = q.m19449o();
        for (int i = 0; i < this.f20443a.length; i++) {
            if (!o.m956c(i) && this.f20445b.remove(this.f20443a[i])) {
                this.f20443a[i].mo19481c();
            }
        }
        for (int i2 = 0; i2 < this.f20443a.length; i2++) {
            if (o.m956c(i2)) {
                m20001p(i2, zArr[i2]);
            }
        }
        q.f21024g = true;
    }

    public final void m19995r0() {
        C6700t1 p = this.f20446b0.m19406p();
        this.f20456k0 = p != null && p.f21023f.f21042h && this.f20455j0;
    }

    public final void m19994s(AbstractC6696s2 s2Var) {
        if (s2Var.mo19479i() == 2) {
            s2Var.stop();
        }
    }

    public final void m19993s0(long j) {
        AbstractC6696s2[] s2VarArr;
        C6700t1 p = this.f20446b0.m19406p();
        long z = p == null ? j + 1000000000000L : p.m19438z(j);
        this.f20466u0 = z;
        this.f20440X.m19728c(z);
        for (AbstractC6696s2 s2Var : this.f20443a) {
            if (m20065O(s2Var)) {
                s2Var.mo19468y(this.f20466u0);
            }
        }
        m20032e0();
    }

    public void m19992t(long j) {
        this.f20470y0 = j;
    }

    public final AbstractC11396q<C4260a> m19990u(AbstractC11265j[] jVarArr) {
        AbstractC11396q.C11397a aVar = new AbstractC11396q.C11397a();
        boolean z = false;
        for (AbstractC11265j jVar : jVarArr) {
            if (jVar != null) {
                C4260a aVar2 = jVar.mo1009d(0).f20573S;
                if (aVar2 == null) {
                    aVar.m757d(new C4260a(new C4260a.AbstractC4262b[0]));
                } else {
                    aVar.m757d(aVar2);
                    z = true;
                }
            }
        }
        return z ? aVar.m756e() : AbstractC11396q.m768D();
    }

    public final long m19988v() {
        C6596f2 f2Var = this.f20452g0;
        return m19984x(f2Var.f20543a, f2Var.f20544b.f23017a, f2Var.f20561s);
    }

    public final void m19987v0(AbstractC6604g3 g3Var, AbstractC6604g3 g3Var2) {
        if (!g3Var.m19819w() || !g3Var2.m19819w()) {
            for (int size = this.f20441Y.size() - 1; size >= 0; size--) {
                if (!m19989u0(this.f20441Y.get(size), g3Var, g3Var2, this.f20459n0, this.f20460o0, this.f20436T, this.f20437U)) {
                    this.f20441Y.get(size).f20481a.m19652k(false);
                    this.f20441Y.remove(size);
                }
            }
            Collections.sort(this.f20441Y);
        }
    }

    public final long m19984x(AbstractC6604g3 g3Var, Object obj, long j) {
        g3Var.m19820t(g3Var.mo19825l(obj, this.f20437U).f20639c, this.f20436T);
        AbstractC6604g3.C6608d dVar = this.f20436T;
        if (dVar.f20650O != -9223372036854775807L && dVar.m19790h()) {
            AbstractC6604g3.C6608d dVar2 = this.f20436T;
            if (dVar2.f20653R) {
                return C1216l0.m37953q0(dVar2.m19795c() - this.f20436T.f20650O) - (j + this.f20437U.m19802o());
            }
        }
        return -9223372036854775807L;
    }

    public final long m19982y() {
        C6700t1 q = this.f20446b0.m19405q();
        if (q == null) {
            return 0L;
        }
        long l = q.m19452l();
        if (!q.f21021d) {
            return l;
        }
        int i = 0;
        while (true) {
            AbstractC6696s2[] s2VarArr = this.f20443a;
            if (i >= s2VarArr.length) {
                return l;
            }
            if (m20065O(s2VarArr[i]) && this.f20443a[i].mo19471v() == q.f21020c[i]) {
                long x = this.f20443a[i].mo19469x();
                if (x == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l = Math.max(x, l);
            }
            i++;
        }
    }

    public final Pair<AbstractC7230t.C7231a, Long> m19980z(AbstractC6604g3 g3Var) {
        long j = 0;
        if (g3Var.m19819w()) {
            return Pair.create(C6596f2.m19904l(), 0L);
        }
        Pair<Object, Long> n = g3Var.m19824n(this.f20436T, this.f20437U, g3Var.mo17401e(this.f20460o0), -9223372036854775807L);
        AbstractC7230t.C7231a A = this.f20446b0.m19429A(g3Var, n.first, 0L);
        long longValue = ((Long) n.second).longValue();
        if (A.m17274b()) {
            g3Var.mo19825l(A.f23017a, this.f20437U);
            if (A.f23019c == this.f20437U.m19805l(A.f23018b)) {
                j = this.f20437U.m19808i();
            }
            longValue = j;
        }
        return Pair.create(A, Long.valueOf(longValue));
    }

    public final void m19979z0(long j, long j2) {
        this.f20433Q.mo37909i(2);
        this.f20433Q.mo37910h(2, j + j2);
    }
}
