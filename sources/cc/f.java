package cc;

import cc.h;
import ia.q;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.thunderdog.challegram.Log;
import ra.r;
import ra.s;

public final class f implements Closeable {
    public static final m f5067l0;
    public static final c f5068m0 = new c(null);
    public final String M;
    public int N;
    public int O;
    public boolean P;
    public final yb.e Q;
    public final yb.d R;
    public final yb.d S;
    public final yb.d T;
    public final cc.l U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    public final boolean f5069a;
    public long f5070a0;
    public final d f5071b;
    public final m f5072b0;
    public final Map<Integer, cc.i> f5073c = new LinkedHashMap();
    public m f5074c0;
    public long f5075d0;
    public long f5076e0;
    public long f5077f0;
    public long f5078g0;
    public final Socket f5079h0;
    public final cc.j f5080i0;
    public final e f5081j0;
    public final Set<Integer> f5082k0;

    public static final class a extends yb.a {
        public final String f5083e;
        public final f f5084f;
        public final long f5085g;

        public a(String str, String str2, f fVar, long j10) {
            super(str2, false, 2, null);
            this.f5083e = str;
            this.f5084f = fVar;
            this.f5085g = j10;
        }

        @Override
        public long f() {
            boolean z10;
            synchronized (this.f5084f) {
                if (this.f5084f.W < this.f5084f.V) {
                    z10 = true;
                } else {
                    this.f5084f.V++;
                    z10 = false;
                }
            }
            if (z10) {
                this.f5084f.P0(null);
                return -1L;
            }
            this.f5084f.t1(false, 1, 0);
            return this.f5085g;
        }
    }

    public static final class b {
        public Socket f5086a;
        public String f5087b;
        public hc.g f5088c;
        public hc.f f5089d;
        public d f5090e = d.f5095a;
        public cc.l f5091f = cc.l.f5208a;
        public int f5092g;
        public boolean f5093h;
        public final yb.e f5094i;

        public b(boolean z10, yb.e eVar) {
            ra.k.e(eVar, "taskRunner");
            this.f5093h = z10;
            this.f5094i = eVar;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f5093h;
        }

        public final String c() {
            String str = this.f5087b;
            if (str == null) {
                ra.k.n("connectionName");
            }
            return str;
        }

        public final d d() {
            return this.f5090e;
        }

        public final int e() {
            return this.f5092g;
        }

        public final cc.l f() {
            return this.f5091f;
        }

        public final hc.f g() {
            hc.f fVar = this.f5089d;
            if (fVar == null) {
                ra.k.n("sink");
            }
            return fVar;
        }

        public final Socket h() {
            Socket socket = this.f5086a;
            if (socket == null) {
                ra.k.n("socket");
            }
            return socket;
        }

        public final hc.g i() {
            hc.g gVar = this.f5088c;
            if (gVar == null) {
                ra.k.n("source");
            }
            return gVar;
        }

        public final yb.e j() {
            return this.f5094i;
        }

        public final b k(d dVar) {
            ra.k.e(dVar, "listener");
            this.f5090e = dVar;
            return this;
        }

        public final b l(int i10) {
            this.f5092g = i10;
            return this;
        }

        public final b m(Socket socket, String str, hc.g gVar, hc.f fVar) {
            String str2;
            ra.k.e(socket, "socket");
            ra.k.e(str, "peerName");
            ra.k.e(gVar, "source");
            ra.k.e(fVar, "sink");
            this.f5086a = socket;
            if (this.f5093h) {
                str2 = vb.b.f24817i + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            this.f5087b = str2;
            this.f5088c = gVar;
            this.f5089d = fVar;
            return this;
        }
    }

    public static final class c {
        public c() {
        }

        public c(ra.g gVar) {
            this();
        }

        public final m a() {
            return f.f5067l0;
        }
    }

    public static abstract class d {
        public static final b f5096b = new b(null);
        public static final d f5095a = new a();

        public static final class a extends d {
            @Override
            public void b(cc.i iVar) {
                ra.k.e(iVar, "stream");
                iVar.d(cc.b.REFUSED_STREAM, null);
            }
        }

        public static final class b {
            public b() {
            }

            public b(ra.g gVar) {
                this();
            }
        }

        public void a(f fVar, m mVar) {
            ra.k.e(fVar, "connection");
            ra.k.e(mVar, "settings");
        }

        public abstract void b(cc.i iVar);
    }

    public final class e implements h.c, qa.a<q> {
        public final cc.h f5097a;
        public final f f5098b;

        public static final class a extends yb.a {
            public final String f5099e;
            public final boolean f5100f;
            public final e f5101g;
            public final s f5102h;
            public final boolean f5103i;
            public final m f5104j;
            public final r f5105k;
            public final s f5106l;

            public a(String str, boolean z10, String str2, boolean z11, e eVar, s sVar, boolean z12, m mVar, r rVar, s sVar2) {
                super(str2, z11);
                this.f5099e = str;
                this.f5100f = z10;
                this.f5101g = eVar;
                this.f5102h = sVar;
                this.f5103i = z12;
                this.f5104j = mVar;
                this.f5105k = rVar;
                this.f5106l = sVar2;
            }

            @Override
            public long f() {
                this.f5101g.f5098b.T0().a(this.f5101g.f5098b, (m) this.f5102h.f21818a);
                return -1L;
            }
        }

        public static final class b extends yb.a {
            public final String f5107e;
            public final boolean f5108f;
            public final cc.i f5109g;
            public final e f5110h;
            public final cc.i f5111i;
            public final int f5112j;
            public final List f5113k;
            public final boolean f5114l;

            public b(String str, boolean z10, String str2, boolean z11, cc.i iVar, e eVar, cc.i iVar2, int i10, List list, boolean z12) {
                super(str2, z11);
                this.f5107e = str;
                this.f5108f = z10;
                this.f5109g = iVar;
                this.f5110h = eVar;
                this.f5111i = iVar2;
                this.f5112j = i10;
                this.f5113k = list;
                this.f5114l = z12;
            }

            @Override
            public long f() {
                try {
                    this.f5110h.f5098b.T0().b(this.f5109g);
                    return -1L;
                } catch (IOException e10) {
                    dc.h g10 = dc.h.f7333c.g();
                    g10.j("Http2Connection.Listener failure for " + this.f5110h.f5098b.R0(), 4, e10);
                    try {
                        this.f5109g.d(cc.b.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        public static final class c extends yb.a {
            public final String f5115e;
            public final boolean f5116f;
            public final e f5117g;
            public final int f5118h;
            public final int f5119i;

            public c(String str, boolean z10, String str2, boolean z11, e eVar, int i10, int i11) {
                super(str2, z11);
                this.f5115e = str;
                this.f5116f = z10;
                this.f5117g = eVar;
                this.f5118h = i10;
                this.f5119i = i11;
            }

            @Override
            public long f() {
                this.f5117g.f5098b.t1(true, this.f5118h, this.f5119i);
                return -1L;
            }
        }

        public static final class d extends yb.a {
            public final String f5120e;
            public final boolean f5121f;
            public final e f5122g;
            public final boolean f5123h;
            public final m f5124i;

            public d(String str, boolean z10, String str2, boolean z11, e eVar, boolean z12, m mVar) {
                super(str2, z11);
                this.f5120e = str;
                this.f5121f = z10;
                this.f5122g = eVar;
                this.f5123h = z12;
                this.f5124i = mVar;
            }

            @Override
            public long f() {
                this.f5122g.l(this.f5123h, this.f5124i);
                return -1L;
            }
        }

        public e(f fVar, cc.h hVar) {
            ra.k.e(hVar, "reader");
            this.f5098b = fVar;
            this.f5097a = hVar;
        }

        @Override
        public void a() {
        }

        @Override
        public q b() {
            m();
            return q.f14159a;
        }

        @Override
        public void c(boolean z10, int i10, int i11, List<cc.c> list) {
            ra.k.e(list, "headerBlock");
            if (this.f5098b.i1(i10)) {
                this.f5098b.f1(i10, list, z10);
                return;
            }
            synchronized (this.f5098b) {
                cc.i X0 = this.f5098b.X0(i10);
                if (X0 != null) {
                    q qVar = q.f14159a;
                    X0.x(vb.b.K(list), z10);
                } else if (!this.f5098b.P) {
                    if (i10 > this.f5098b.S0()) {
                        if (i10 % 2 != this.f5098b.U0() % 2) {
                            cc.i iVar = new cc.i(i10, this.f5098b, false, z10, vb.b.K(list));
                            this.f5098b.l1(i10);
                            this.f5098b.Y0().put(Integer.valueOf(i10), iVar);
                            String str = this.f5098b.R0() + '[' + i10 + "] onStream";
                            this.f5098b.Q.i().i(new b(str, true, str, true, iVar, this, X0, i10, list, z10), 0L);
                        }
                    }
                }
            }
        }

        @Override
        public void d(boolean z10, m mVar) {
            ra.k.e(mVar, "settings");
            String str = this.f5098b.R0() + " applyAndAckSettings";
            this.f5098b.R.i(new d(str, true, str, true, this, z10, mVar), 0L);
        }

        @Override
        public void e(int i10, long j10) {
            if (i10 == 0) {
                synchronized (this.f5098b) {
                    f fVar = this.f5098b;
                    fVar.f5078g0 = fVar.Z0() + j10;
                    f fVar2 = this.f5098b;
                    if (fVar2 != null) {
                        fVar2.notifyAll();
                        q qVar = q.f14159a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            cc.i X0 = this.f5098b.X0(i10);
            if (X0 != null) {
                synchronized (X0) {
                    X0.a(j10);
                    q qVar2 = q.f14159a;
                }
            }
        }

        @Override
        public void f(int i10, cc.b bVar) {
            ra.k.e(bVar, "errorCode");
            if (this.f5098b.i1(i10)) {
                this.f5098b.h1(i10, bVar);
                return;
            }
            cc.i j12 = this.f5098b.j1(i10);
            if (j12 != null) {
                j12.y(bVar);
            }
        }

        @Override
        public void g(int i10, cc.b bVar, hc.h hVar) {
            int i11;
            cc.i[] iVarArr;
            ra.k.e(bVar, "errorCode");
            ra.k.e(hVar, "debugData");
            hVar.r();
            synchronized (this.f5098b) {
                Object[] array = this.f5098b.Y0().values().toArray(new cc.i[0]);
                if (array != null) {
                    iVarArr = (cc.i[]) array;
                    this.f5098b.P = true;
                    q qVar = q.f14159a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (cc.i iVar : iVarArr) {
                if (iVar.j() > i10 && iVar.t()) {
                    iVar.y(cc.b.REFUSED_STREAM);
                    this.f5098b.j1(iVar.j());
                }
            }
        }

        @Override
        public void h(boolean z10, int i10, int i11) {
            if (z10) {
                synchronized (this.f5098b) {
                    if (i10 == 1) {
                        this.f5098b.W++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            this.f5098b.Z++;
                            f fVar = this.f5098b;
                            if (fVar != null) {
                                fVar.notifyAll();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                        q qVar = q.f14159a;
                    } else {
                        this.f5098b.Y++;
                    }
                }
                return;
            }
            String str = this.f5098b.R0() + " ping";
            this.f5098b.R.i(new c(str, true, str, true, this, i10, i11), 0L);
        }

        @Override
        public void i(int i10, int i11, int i12, boolean z10) {
        }

        @Override
        public void j(boolean z10, int i10, hc.g gVar, int i11) {
            ra.k.e(gVar, "source");
            if (this.f5098b.i1(i10)) {
                this.f5098b.e1(i10, gVar, i11, z10);
                return;
            }
            cc.i X0 = this.f5098b.X0(i10);
            if (X0 == null) {
                this.f5098b.v1(i10, cc.b.PROTOCOL_ERROR);
                long j10 = i11;
                this.f5098b.q1(j10);
                gVar.b0(j10);
                return;
            }
            X0.w(gVar, i11);
            if (z10) {
                X0.x(vb.b.f24810b, true);
            }
        }

        @Override
        public void k(int i10, int i11, List<cc.c> list) {
            ra.k.e(list, "requestHeaders");
            this.f5098b.g1(i11, list);
        }

        public final void l(boolean r22, cc.m r23) {
            throw new UnsupportedOperationException("Method not decompiled: cc.f.e.l(boolean, cc.m):void");
        }

        public void m() {
            Throwable th;
            cc.b bVar;
            cc.b bVar2 = cc.b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f5097a.y0(this);
                    while (this.f5097a.s(false, this)) {
                    }
                    cc.b bVar3 = cc.b.NO_ERROR;
                    try {
                        this.f5098b.O0(bVar3, cc.b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e11) {
                        e10 = e11;
                        cc.b bVar4 = cc.b.PROTOCOL_ERROR;
                        f fVar = this.f5098b;
                        fVar.O0(bVar4, bVar4, e10);
                        bVar = fVar;
                        bVar2 = this.f5097a;
                        vb.b.j(bVar2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f5098b.O0(bVar, bVar2, e10);
                    vb.b.j(this.f5097a);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                this.f5098b.O0(bVar, bVar2, e10);
                vb.b.j(this.f5097a);
                throw th;
            }
            bVar2 = this.f5097a;
            vb.b.j(bVar2);
        }
    }

    public static final class C0066f extends yb.a {
        public final String f5125e;
        public final boolean f5126f;
        public final f f5127g;
        public final int f5128h;
        public final hc.e f5129i;
        public final int f5130j;
        public final boolean f5131k;

        public C0066f(String str, boolean z10, String str2, boolean z11, f fVar, int i10, hc.e eVar, int i11, boolean z12) {
            super(str2, z11);
            this.f5125e = str;
            this.f5126f = z10;
            this.f5127g = fVar;
            this.f5128h = i10;
            this.f5129i = eVar;
            this.f5130j = i11;
            this.f5131k = z12;
        }

        @Override
        public long f() {
            try {
                boolean a10 = this.f5127g.U.a(this.f5128h, this.f5129i, this.f5130j, this.f5131k);
                if (a10) {
                    this.f5127g.a1().G0(this.f5128h, cc.b.CANCEL);
                }
                if (!a10 && !this.f5131k) {
                    return -1L;
                }
                synchronized (this.f5127g) {
                    this.f5127g.f5082k0.remove(Integer.valueOf(this.f5128h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class g extends yb.a {
        public final String f5132e;
        public final boolean f5133f;
        public final f f5134g;
        public final int f5135h;
        public final List f5136i;
        public final boolean f5137j;

        public g(String str, boolean z10, String str2, boolean z11, f fVar, int i10, List list, boolean z12) {
            super(str2, z11);
            this.f5132e = str;
            this.f5133f = z10;
            this.f5134g = fVar;
            this.f5135h = i10;
            this.f5136i = list;
            this.f5137j = z12;
        }

        @Override
        public long f() {
            boolean d10 = this.f5134g.U.d(this.f5135h, this.f5136i, this.f5137j);
            if (d10) {
                try {
                    this.f5134g.a1().G0(this.f5135h, cc.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!d10 && !this.f5137j) {
                return -1L;
            }
            synchronized (this.f5134g) {
                this.f5134g.f5082k0.remove(Integer.valueOf(this.f5135h));
            }
            return -1L;
        }
    }

    public static final class h extends yb.a {
        public final String f5138e;
        public final boolean f5139f;
        public final f f5140g;
        public final int f5141h;
        public final List f5142i;

        public h(String str, boolean z10, String str2, boolean z11, f fVar, int i10, List list) {
            super(str2, z11);
            this.f5138e = str;
            this.f5139f = z10;
            this.f5140g = fVar;
            this.f5141h = i10;
            this.f5142i = list;
        }

        @Override
        public long f() {
            if (!this.f5140g.U.c(this.f5141h, this.f5142i)) {
                return -1L;
            }
            try {
                this.f5140g.a1().G0(this.f5141h, cc.b.CANCEL);
                synchronized (this.f5140g) {
                    this.f5140g.f5082k0.remove(Integer.valueOf(this.f5141h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class i extends yb.a {
        public final String f5143e;
        public final boolean f5144f;
        public final f f5145g;
        public final int f5146h;
        public final cc.b f5147i;

        public i(String str, boolean z10, String str2, boolean z11, f fVar, int i10, cc.b bVar) {
            super(str2, z11);
            this.f5143e = str;
            this.f5144f = z10;
            this.f5145g = fVar;
            this.f5146h = i10;
            this.f5147i = bVar;
        }

        @Override
        public long f() {
            this.f5145g.U.b(this.f5146h, this.f5147i);
            synchronized (this.f5145g) {
                this.f5145g.f5082k0.remove(Integer.valueOf(this.f5146h));
                q qVar = q.f14159a;
            }
            return -1L;
        }
    }

    public static final class j extends yb.a {
        public final String f5148e;
        public final boolean f5149f;
        public final f f5150g;

        public j(String str, boolean z10, String str2, boolean z11, f fVar) {
            super(str2, z11);
            this.f5148e = str;
            this.f5149f = z10;
            this.f5150g = fVar;
        }

        @Override
        public long f() {
            this.f5150g.t1(false, 2, 0);
            return -1L;
        }
    }

    public static final class k extends yb.a {
        public final String f5151e;
        public final boolean f5152f;
        public final f f5153g;
        public final int f5154h;
        public final cc.b f5155i;

        public k(String str, boolean z10, String str2, boolean z11, f fVar, int i10, cc.b bVar) {
            super(str2, z11);
            this.f5151e = str;
            this.f5152f = z10;
            this.f5153g = fVar;
            this.f5154h = i10;
            this.f5155i = bVar;
        }

        @Override
        public long f() {
            try {
                this.f5153g.u1(this.f5154h, this.f5155i);
                return -1L;
            } catch (IOException e10) {
                this.f5153g.P0(e10);
                return -1L;
            }
        }
    }

    public static final class l extends yb.a {
        public final String f5156e;
        public final boolean f5157f;
        public final f f5158g;
        public final int f5159h;
        public final long f5160i;

        public l(String str, boolean z10, String str2, boolean z11, f fVar, int i10, long j10) {
            super(str2, z11);
            this.f5156e = str;
            this.f5157f = z10;
            this.f5158g = fVar;
            this.f5159h = i10;
            this.f5160i = j10;
        }

        @Override
        public long f() {
            try {
                this.f5158g.a1().I0(this.f5159h, this.f5160i);
                return -1L;
            } catch (IOException e10) {
                this.f5158g.P0(e10);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, Log.TAG_VIDEO);
        f5067l0 = mVar;
    }

    public f(b bVar) {
        m mVar;
        ra.k.e(bVar, "builder");
        boolean b10 = bVar.b();
        this.f5069a = b10;
        this.f5071b = bVar.d();
        String c10 = bVar.c();
        this.M = c10;
        this.O = bVar.b() ? 3 : 2;
        yb.e j10 = bVar.j();
        this.Q = j10;
        yb.d i10 = j10.i();
        this.R = i10;
        this.S = j10.i();
        this.T = j10.i();
        this.U = bVar.f();
        m mVar2 = new m();
        if (bVar.b()) {
            mVar2.h(7, 16777216);
        }
        q qVar = q.f14159a;
        this.f5072b0 = mVar2;
        this.f5074c0 = f5067l0;
        this.f5078g0 = mVar.c();
        this.f5079h0 = bVar.h();
        this.f5080i0 = new cc.j(bVar.g(), b10);
        this.f5081j0 = new e(this, new cc.h(bVar.i(), b10));
        this.f5082k0 = new LinkedHashSet();
        if (bVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.e());
            String str = c10 + " ping";
            i10.i(new a(str, str, this, nanos), nanos);
        }
    }

    public static void p1(f fVar, boolean z10, yb.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar = yb.e.f26691h;
        }
        fVar.o1(z10, eVar);
    }

    public final void O0(cc.b bVar, cc.b bVar2, IOException iOException) {
        int i10;
        ra.k.e(bVar, "connectionCode");
        ra.k.e(bVar2, "streamCode");
        if (!vb.b.f24816h || !Thread.holdsLock(this)) {
            try {
                n1(bVar);
            } catch (IOException unused) {
            }
            cc.i[] iVarArr = null;
            synchronized (this) {
                if (!this.f5073c.isEmpty()) {
                    Object[] array = this.f5073c.values().toArray(new cc.i[0]);
                    if (array != null) {
                        iVarArr = (cc.i[]) array;
                        this.f5073c.clear();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                q qVar = q.f14159a;
            }
            if (iVarArr != null) {
                for (cc.i iVar : iVarArr) {
                    try {
                        iVar.d(bVar2, iOException);
                    } catch (IOException unused2) {
                    }
                }
            }
            try {
                this.f5080i0.close();
            } catch (IOException unused3) {
            }
            try {
                this.f5079h0.close();
            } catch (IOException unused4) {
            }
            this.R.n();
            this.S.n();
            this.T.n();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        ra.k.d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final void P0(IOException iOException) {
        cc.b bVar = cc.b.PROTOCOL_ERROR;
        O0(bVar, bVar, iOException);
    }

    public final boolean Q0() {
        return this.f5069a;
    }

    public final String R0() {
        return this.M;
    }

    public final int S0() {
        return this.N;
    }

    public final d T0() {
        return this.f5071b;
    }

    public final int U0() {
        return this.O;
    }

    public final m V0() {
        return this.f5072b0;
    }

    public final m W0() {
        return this.f5074c0;
    }

    public final synchronized cc.i X0(int i10) {
        return this.f5073c.get(Integer.valueOf(i10));
    }

    public final Map<Integer, cc.i> Y0() {
        return this.f5073c;
    }

    public final long Z0() {
        return this.f5078g0;
    }

    public final cc.j a1() {
        return this.f5080i0;
    }

    public final synchronized boolean b1(long j10) {
        if (this.P) {
            return false;
        }
        if (this.Y < this.X) {
            if (j10 >= this.f5070a0) {
                return false;
            }
        }
        return true;
    }

    public final cc.i c1(int r11, java.util.List<cc.c> r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: cc.f.c1(int, java.util.List, boolean):cc.i");
    }

    @Override
    public void close() {
        O0(cc.b.NO_ERROR, cc.b.CANCEL, null);
    }

    public final cc.i d1(List<cc.c> list, boolean z10) {
        ra.k.e(list, "requestHeaders");
        return c1(0, list, z10);
    }

    public final void e1(int i10, hc.g gVar, int i11, boolean z10) {
        ra.k.e(gVar, "source");
        hc.e eVar = new hc.e();
        long j10 = i11;
        gVar.s0(j10);
        gVar.A(eVar, j10);
        String str = this.M + '[' + i10 + "] onData";
        this.S.i(new C0066f(str, true, str, true, this, i10, eVar, i11, z10), 0L);
    }

    public final void f1(int i10, List<cc.c> list, boolean z10) {
        ra.k.e(list, "requestHeaders");
        String str = this.M + '[' + i10 + "] onHeaders";
        this.S.i(new g(str, true, str, true, this, i10, list, z10), 0L);
    }

    public final void flush() {
        this.f5080i0.flush();
    }

    public final void g1(int i10, List<cc.c> list) {
        ra.k.e(list, "requestHeaders");
        synchronized (this) {
            if (this.f5082k0.contains(Integer.valueOf(i10))) {
                v1(i10, cc.b.PROTOCOL_ERROR);
                return;
            }
            this.f5082k0.add(Integer.valueOf(i10));
            String str = this.M + '[' + i10 + "] onRequest";
            this.S.i(new h(str, true, str, true, this, i10, list), 0L);
        }
    }

    public final void h1(int i10, cc.b bVar) {
        ra.k.e(bVar, "errorCode");
        String str = this.M + '[' + i10 + "] onReset";
        this.S.i(new i(str, true, str, true, this, i10, bVar), 0L);
    }

    public final boolean i1(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized cc.i j1(int i10) {
        cc.i remove;
        remove = this.f5073c.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    public final void k1() {
        synchronized (this) {
            long j10 = this.Y;
            long j11 = this.X;
            if (j10 >= j11) {
                this.X = j11 + 1;
                this.f5070a0 = System.nanoTime() + 1000000000;
                q qVar = q.f14159a;
                String str = this.M + " ping";
                this.R.i(new j(str, true, str, true, this), 0L);
            }
        }
    }

    public final void l1(int i10) {
        this.N = i10;
    }

    public final void m1(m mVar) {
        ra.k.e(mVar, "<set-?>");
        this.f5074c0 = mVar;
    }

    public final void n1(cc.b bVar) {
        ra.k.e(bVar, "statusCode");
        synchronized (this.f5080i0) {
            synchronized (this) {
                if (!this.P) {
                    this.P = true;
                    int i10 = this.N;
                    q qVar = q.f14159a;
                    this.f5080i0.B0(i10, bVar, vb.b.f24809a);
                }
            }
        }
    }

    public final void o1(boolean z10, yb.e eVar) {
        ra.k.e(eVar, "taskRunner");
        if (z10) {
            this.f5080i0.s();
            this.f5080i0.H0(this.f5072b0);
            int c10 = this.f5072b0.c();
            if (c10 != 65535) {
                this.f5080i0.I0(0, c10 - 65535);
            }
        }
        yb.d i10 = eVar.i();
        String str = this.M;
        i10.i(new yb.c(this.f5081j0, str, true, str, true), 0L);
    }

    public final synchronized void q1(long j10) {
        long j11 = this.f5075d0 + j10;
        this.f5075d0 = j11;
        long j12 = j11 - this.f5076e0;
        if (j12 >= this.f5072b0.c() / 2) {
            w1(0, j12);
            this.f5076e0 += j12;
        }
    }

    public final void r1(int r9, boolean r10, hc.e r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: cc.f.r1(int, boolean, hc.e, long):void");
    }

    public final void s1(int i10, boolean z10, List<cc.c> list) {
        ra.k.e(list, "alternating");
        this.f5080i0.C0(z10, i10, list);
    }

    public final void t1(boolean z10, int i10, int i11) {
        try {
            this.f5080i0.E0(z10, i10, i11);
        } catch (IOException e10) {
            P0(e10);
        }
    }

    public final void u1(int i10, cc.b bVar) {
        ra.k.e(bVar, "statusCode");
        this.f5080i0.G0(i10, bVar);
    }

    public final void v1(int i10, cc.b bVar) {
        ra.k.e(bVar, "errorCode");
        String str = this.M + '[' + i10 + "] writeSynReset";
        this.R.i(new k(str, true, str, true, this, i10, bVar), 0L);
    }

    public final void w1(int i10, long j10) {
        String str = this.M + '[' + i10 + "] windowUpdate";
        this.R.i(new l(str, true, str, true, this, i10, j10), 0L);
    }
}
