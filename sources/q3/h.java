package q3;

import a7.p0;
import a7.q;
import a7.s;
import a7.s0;
import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import b5.b0;
import b5.w;
import c5.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m3.i;
import m3.q1;
import n3.p1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import q3.g;
import q3.g0;
import q3.h;
import q3.m;
import q3.o;
import q3.w;
import q3.y;

public class h implements y {
    public final UUID f21277c;
    public final g0.c f21278d;
    public final n0 f21279e;
    public final HashMap<String, String> f21280f;
    public final boolean f21281g;
    public final int[] f21282h;
    public final boolean f21283i;
    public final g f21284j;
    public final b0 f21285k;
    public final C0193h f21286l;
    public final long f21287m;
    public final List<q3.g> f21288n;
    public final Set<f> f21289o;
    public final Set<q3.g> f21290p;
    public int f21291q;
    public g0 f21292r;
    public q3.g f21293s;
    public q3.g f21294t;
    public Looper f21295u;
    public Handler f21296v;
    public int f21297w;
    public byte[] f21298x;
    public p1 f21299y;
    public volatile d f21300z;

    public static final class b {
        public boolean f21304d;
        public boolean f21306f;
        public final HashMap<String, String> f21301a = new HashMap<>();
        public UUID f21302b = i.f16679d;
        public g0.c f21303c = k0.f21329d;
        public b0 f21307g = new w();
        public int[] f21305e = new int[0];
        public long f21308h = 300000;

        public h a(n0 n0Var) {
            return new h(this.f21302b, this.f21303c, n0Var, this.f21301a, this.f21304d, this.f21305e, this.f21306f, this.f21307g, this.f21308h);
        }

        public b b(boolean z10) {
            this.f21304d = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f21306f = z10;
            return this;
        }

        public b d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (!(i10 == 2 || i10 == 1)) {
                    z10 = false;
                }
                c5.a.a(z10);
            }
            this.f21305e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, g0.c cVar) {
            this.f21302b = (UUID) c5.a.e(uuid);
            this.f21303c = (g0.c) c5.a.e(cVar);
            return this;
        }
    }

    public class c implements g0.b {
        public c() {
        }

        @Override
        public void a(g0 g0Var, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) c5.a.e(h.this.f21300z)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (q3.g gVar : h.this.f21288n) {
                    if (gVar.r(bArr)) {
                        gVar.z(message.what);
                        return;
                    }
                }
            }
        }
    }

    public static final class e extends Exception {
        public e(java.util.UUID r3) {
            throw new UnsupportedOperationException("Method not decompiled: q3.h.e.<init>(java.util.UUID):void");
        }
    }

    public class f implements y.b {
        public final w.a f21311b;
        public o f21312c;
        public boolean f21313d;

        public f(w.a aVar) {
            this.f21311b = aVar;
        }

        public void e(q1 q1Var) {
            if (h.this.f21291q != 0 && !this.f21313d) {
                h hVar = h.this;
                this.f21312c = hVar.u((Looper) c5.a.e(hVar.f21295u), this.f21311b, q1Var, false);
                h.this.f21289o.add(this);
            }
        }

        public void f() {
            if (!this.f21313d) {
                o oVar = this.f21312c;
                if (oVar != null) {
                    oVar.a(this.f21311b);
                }
                h.this.f21289o.remove(this);
                this.f21313d = true;
            }
        }

        @Override
        public void a() {
            l0.x0((Handler) c5.a.e(h.this.f21296v), new Runnable() {
                @Override
                public final void run() {
                    h.f.this.f();
                }
            });
        }

        public void d(final q1 q1Var) {
            ((Handler) c5.a.e(h.this.f21296v)).post(new Runnable() {
                @Override
                public final void run() {
                    h.f.this.e(q1Var);
                }
            });
        }
    }

    public class g implements g.a {
        public final Set<q3.g> f21315a = new HashSet();
        public q3.g f21316b;

        public g(h hVar) {
        }

        @Override
        public void a(q3.g gVar) {
            this.f21315a.add(gVar);
            if (this.f21316b == null) {
                this.f21316b = gVar;
                gVar.F();
            }
        }

        @Override
        public void b(Exception exc, boolean z10) {
            this.f21316b = null;
            q z11 = q.z(this.f21315a);
            this.f21315a.clear();
            s0 u10 = z11.iterator();
            while (u10.hasNext()) {
                ((q3.g) u10.next()).B(exc, z10);
            }
        }

        @Override
        public void c() {
            this.f21316b = null;
            q z10 = q.z(this.f21315a);
            this.f21315a.clear();
            s0 u10 = z10.iterator();
            while (u10.hasNext()) {
                ((q3.g) u10.next()).A();
            }
        }

        public void d(q3.g gVar) {
            this.f21315a.remove(gVar);
            if (this.f21316b == gVar) {
                this.f21316b = null;
                if (!this.f21315a.isEmpty()) {
                    q3.g next = this.f21315a.iterator().next();
                    this.f21316b = next;
                    next.F();
                }
            }
        }
    }

    public class C0193h implements g.b {
        public C0193h() {
        }

        @Override
        public void a(final q3.g gVar, int i10) {
            if (i10 == 1 && h.this.f21291q > 0 && h.this.f21287m != -9223372036854775807L) {
                h.this.f21290p.add(gVar);
                ((Handler) c5.a.e(h.this.f21296v)).postAtTime(new Runnable() {
                    @Override
                    public final void run() {
                        g.this.a(null);
                    }
                }, gVar, SystemClock.uptimeMillis() + h.this.f21287m);
            } else if (i10 == 0) {
                h.this.f21288n.remove(gVar);
                if (h.this.f21293s == gVar) {
                    h.this.f21293s = null;
                }
                if (h.this.f21294t == gVar) {
                    h.this.f21294t = null;
                }
                h.this.f21284j.d(gVar);
                if (h.this.f21287m != -9223372036854775807L) {
                    ((Handler) c5.a.e(h.this.f21296v)).removeCallbacksAndMessages(gVar);
                    h.this.f21290p.remove(gVar);
                }
            }
            h.this.D();
        }

        @Override
        public void b(q3.g gVar, int i10) {
            if (h.this.f21287m != -9223372036854775807L) {
                h.this.f21290p.remove(gVar);
                ((Handler) c5.a.e(h.this.f21296v)).removeCallbacksAndMessages(gVar);
            }
        }
    }

    public static boolean v(o oVar) {
        return oVar.i() == 1 && (l0.f4841a < 19 || (((o.a) c5.a.e(oVar.g())).getCause() instanceof ResourceBusyException));
    }

    public static List<m.b> z(m mVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(mVar.M);
        for (int i10 = 0; i10 < mVar.M; i10++) {
            m.b c10 = mVar.c(i10);
            if ((c10.b(uuid) || (i.f16678c.equals(uuid) && c10.b(i.f16677b))) && (c10.N != null || z10)) {
                arrayList.add(c10);
            }
        }
        return arrayList;
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    public final synchronized void A(Looper looper) {
        Looper looper2 = this.f21295u;
        if (looper2 == null) {
            this.f21295u = looper;
            this.f21296v = new Handler(looper);
        } else {
            c5.a.f(looper2 == looper);
            c5.a.e(this.f21296v);
        }
    }

    public final o B(int i10, boolean z10) {
        g0 g0Var = (g0) c5.a.e(this.f21292r);
        if ((g0Var.n() == 2 && h0.f21318d) || l0.o0(this.f21282h, i10) == -1 || g0Var.n() == 1) {
            return null;
        }
        q3.g gVar = this.f21293s;
        if (gVar == null) {
            q3.g y10 = y(q.D(), true, null, z10);
            this.f21288n.add(y10);
            this.f21293s = y10;
        } else {
            gVar.e(null);
        }
        return this.f21293s;
    }

    public final void C(Looper looper) {
        if (this.f21300z == null) {
            this.f21300z = new d(looper);
        }
    }

    public final void D() {
        if (this.f21292r != null && this.f21291q == 0 && this.f21288n.isEmpty() && this.f21289o.isEmpty()) {
            ((g0) c5.a.e(this.f21292r)).a();
            this.f21292r = null;
        }
    }

    public final void E() {
        s0 u10 = s.x(this.f21290p).iterator();
        while (u10.hasNext()) {
            ((o) u10.next()).a(null);
        }
    }

    public final void F() {
        s0 u10 = s.x(this.f21289o).iterator();
        while (u10.hasNext()) {
            ((f) u10.next()).a();
        }
    }

    public void G(int i10, byte[] bArr) {
        c5.a.f(this.f21288n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            c5.a.e(bArr);
        }
        this.f21297w = i10;
        this.f21298x = bArr;
    }

    public final void H(o oVar, w.a aVar) {
        oVar.a(aVar);
        if (this.f21287m != -9223372036854775807L) {
            oVar.a(null);
        }
    }

    @Override
    public final void a() {
        int i10 = this.f21291q - 1;
        this.f21291q = i10;
        if (i10 == 0) {
            if (this.f21287m != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f21288n);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((q3.g) arrayList.get(i11)).a(null);
                }
            }
            F();
            D();
        }
    }

    @Override
    public final void b() {
        int i10 = this.f21291q;
        this.f21291q = i10 + 1;
        if (i10 == 0) {
            if (this.f21292r == null) {
                g0 a10 = this.f21278d.a(this.f21277c);
                this.f21292r = a10;
                a10.b(new c());
            } else if (this.f21287m != -9223372036854775807L) {
                for (int i11 = 0; i11 < this.f21288n.size(); i11++) {
                    this.f21288n.get(i11).e(null);
                }
            }
        }
    }

    @Override
    public void c(Looper looper, p1 p1Var) {
        A(looper);
        this.f21299y = p1Var;
    }

    @Override
    public int d(q1 q1Var) {
        int n10 = ((g0) c5.a.e(this.f21292r)).n();
        m mVar = q1Var.X;
        if (mVar == null) {
            if (l0.o0(this.f21282h, c5.w.f(q1Var.U)) != -1) {
                return n10;
            }
            return 0;
        } else if (w(mVar)) {
            return n10;
        } else {
            return 1;
        }
    }

    @Override
    public o e(w.a aVar, q1 q1Var) {
        c5.a.f(this.f21291q > 0);
        c5.a.h(this.f21295u);
        return u(this.f21295u, aVar, q1Var, true);
    }

    @Override
    public y.b f(w.a aVar, q1 q1Var) {
        c5.a.f(this.f21291q > 0);
        c5.a.h(this.f21295u);
        f fVar = new f(aVar);
        fVar.d(q1Var);
        return fVar;
    }

    public final o u(Looper looper, w.a aVar, q1 q1Var, boolean z10) {
        List<m.b> list;
        C(looper);
        m mVar = q1Var.X;
        if (mVar == null) {
            return B(c5.w.f(q1Var.U), z10);
        }
        q3.g gVar = null;
        if (this.f21298x == null) {
            list = z((m) c5.a.e(mVar), this.f21277c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f21277c);
                c5.s.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new e0(new o.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f21281g) {
            Iterator<q3.g> it = this.f21288n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                q3.g next = it.next();
                if (l0.c(next.f21240a, list)) {
                    gVar = next;
                    break;
                }
            }
        } else {
            gVar = this.f21294t;
        }
        if (gVar == null) {
            gVar = y(list, false, aVar, z10);
            if (!this.f21281g) {
                this.f21294t = gVar;
            }
            this.f21288n.add(gVar);
        } else {
            gVar.e(aVar);
        }
        return gVar;
    }

    public final boolean w(m mVar) {
        if (this.f21298x != null) {
            return true;
        }
        if (z(mVar, this.f21277c, true).isEmpty()) {
            if (mVar.M != 1 || !mVar.c(0).b(i.f16677b)) {
                return false;
            }
            String valueOf = String.valueOf(this.f21277c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 72);
            sb2.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb2.append(valueOf);
            c5.s.i("DefaultDrmSessionMgr", sb2.toString());
        }
        String str = mVar.f21344c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? l0.f4841a >= 25 : !"cbc1".equals(str) && !"cens".equals(str);
    }

    public final q3.g x(List<m.b> list, boolean z10, w.a aVar) {
        c5.a.e(this.f21292r);
        q3.g gVar = new q3.g(this.f21277c, this.f21292r, this.f21284j, this.f21286l, list, this.f21297w, this.f21283i | z10, z10, this.f21298x, this.f21280f, this.f21279e, (Looper) c5.a.e(this.f21295u), this.f21285k, (p1) c5.a.e(this.f21299y));
        gVar.e(aVar);
        if (this.f21287m != -9223372036854775807L) {
            gVar.e(null);
        }
        return gVar;
    }

    public final q3.g y(List<m.b> list, boolean z10, w.a aVar, boolean z11) {
        q3.g x10 = x(list, z10, aVar);
        if (v(x10) && !this.f21290p.isEmpty()) {
            E();
            H(x10, aVar);
            x10 = x(list, z10, aVar);
        }
        if (!v(x10) || !z11 || this.f21289o.isEmpty()) {
            return x10;
        }
        F();
        if (!this.f21290p.isEmpty()) {
            E();
        }
        H(x10, aVar);
        return x(list, z10, aVar);
    }

    public h(UUID uuid, g0.c cVar, n0 n0Var, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, b0 b0Var, long j10) {
        c5.a.e(uuid);
        c5.a.b(!i.f16677b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f21277c = uuid;
        this.f21278d = cVar;
        this.f21279e = n0Var;
        this.f21280f = hashMap;
        this.f21281g = z10;
        this.f21282h = iArr;
        this.f21283i = z11;
        this.f21285k = b0Var;
        this.f21284j = new g(this);
        this.f21286l = new C0193h();
        this.f21297w = 0;
        this.f21288n = new ArrayList();
        this.f21289o = p0.h();
        this.f21290p = p0.h();
        this.f21287m = j10;
    }
}
