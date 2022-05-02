package p230q3;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p006a5.AbstractC0118b0;
import p006a5.C0175w;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1234w;
import p174m3.C6600g1;
import p174m3.C6615i;
import p230q3.AbstractC8169f0;
import p230q3.AbstractC8208o;
import p230q3.AbstractC8219w;
import p230q3.AbstractC8223y;
import p230q3.C8174g;
import p230q3.C8182h;
import p230q3.C8201m;
import p358z6.AbstractC11396q;
import p358z6.AbstractC11403r0;
import p358z6.AbstractC11404s;
import p358z6.C11387o0;

public class C8182h implements AbstractC8223y {
    public final UUID f26497c;
    public final AbstractC8169f0.AbstractC8172c f26498d;
    public final AbstractC8205m0 f26499e;
    public final HashMap<String, String> f26500f;
    public final boolean f26501g;
    public final int[] f26502h;
    public final boolean f26503i;
    public final C8189g f26504j;
    public final AbstractC0118b0 f26505k;
    public final C8190h f26506l;
    public final long f26507m;
    public final List<C8174g> f26508n;
    public final Set<C8188f> f26509o;
    public final Set<C8174g> f26510p;
    public int f26511q;
    public AbstractC8169f0 f26512r;
    public C8174g f26513s;
    public C8174g f26514t;
    public Looper f26515u;
    public Handler f26516v;
    public int f26517w;
    public byte[] f26518x;
    public volatile HandlerC8186d f26519y;

    public static final class C8184b {
        public boolean f26523d;
        public boolean f26525f;
        public final HashMap<String, String> f26520a = new HashMap<>();
        public UUID f26521b = C6615i.f20678d;
        public AbstractC8169f0.AbstractC8172c f26522c = C8195j0.f26543d;
        public AbstractC0118b0 f26526g = new C0175w();
        public int[] f26524e = new int[0];
        public long f26527h = 300000;

        public C8182h m13273a(AbstractC8205m0 m0Var) {
            return new C8182h(this.f26521b, this.f26522c, m0Var, this.f26520a, this.f26523d, this.f26524e, this.f26525f, this.f26526g, this.f26527h);
        }

        public C8184b m13272b(boolean z) {
            this.f26523d = z;
            return this;
        }

        public C8184b m13271c(boolean z) {
            this.f26525f = z;
            return this;
        }

        public C8184b m13270d(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (!(i == 2 || i == 1)) {
                    z = false;
                }
                C1186a.m38189a(z);
            }
            this.f26524e = (int[]) iArr.clone();
            return this;
        }

        public C8184b m13269e(UUID uuid, AbstractC8169f0.AbstractC8172c cVar) {
            this.f26521b = (UUID) C1186a.m38185e(uuid);
            this.f26522c = (AbstractC8169f0.AbstractC8172c) C1186a.m38185e(cVar);
            return this;
        }
    }

    public class C8185c implements AbstractC8169f0.AbstractC8171b {
        public C8185c() {
        }

        @Override
        public void mo13268a(AbstractC8169f0 f0Var, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((HandlerC8186d) C1186a.m38185e(C8182h.this.f26519y)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class HandlerC8186d extends Handler {
        public HandlerC8186d(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (C8174g gVar : C8182h.this.f26508n) {
                    if (gVar.m13313r(bArr)) {
                        gVar.m13305z(message.what);
                        return;
                    }
                }
            }
        }
    }

    public static final class C8187e extends Exception {
        public C8187e(java.util.UUID r3) {
            throw new UnsupportedOperationException("Method not decompiled: p230q3.C8182h.C8187e.<init>(java.util.UUID):void");
        }
    }

    public class C8188f implements AbstractC8223y.AbstractC8225b {
        public final AbstractC8219w.C8220a f26530b;
        public AbstractC8208o f26531c;
        public boolean f26532d;

        public C8188f(AbstractC8219w.C8220a aVar) {
            this.f26530b = aVar;
        }

        public void m13264e(C6600g1 g1Var) {
            if (C8182h.this.f26511q != 0 && !this.f26532d) {
                C8182h hVar = C8182h.this;
                this.f26531c = hVar.m13280t((Looper) C1186a.m38185e(hVar.f26515u), this.f26530b, g1Var, false);
                C8182h.this.f26509o.add(this);
            }
        }

        public void m13263f() {
            if (!this.f26532d) {
                AbstractC8208o oVar = this.f26531c;
                if (oVar != null) {
                    oVar.mo13207a(this.f26530b);
                }
                C8182h.this.f26509o.remove(this);
                this.f26532d = true;
            }
        }

        @Override
        public void mo13159a() {
            C1216l0.m37941w0((Handler) C1186a.m38185e(C8182h.this.f26516v), new Runnable() {
                @Override
                public final void run() {
                    C8182h.C8188f.this.m13263f();
                }
            });
        }

        public void m13265d(final C6600g1 g1Var) {
            ((Handler) C1186a.m38185e(C8182h.this.f26516v)).post(new Runnable() {
                @Override
                public final void run() {
                    C8182h.C8188f.this.m13264e(g1Var);
                }
            });
        }
    }

    public class C8189g implements C8174g.AbstractC8175a {
        public final Set<C8174g> f26534a = new HashSet();
        public C8174g f26535b;

        public C8189g(C8182h hVar) {
        }

        @Override
        public void mo13262a(C8174g gVar) {
            this.f26534a.add(gVar);
            if (this.f26535b == null) {
                this.f26535b = gVar;
                gVar.m13323F();
            }
        }

        @Override
        public void mo13261b(Exception exc, boolean z) {
            this.f26535b = null;
            AbstractC11396q z2 = AbstractC11396q.m758z(this.f26534a);
            this.f26534a.clear();
            AbstractC11403r0 u = z2.iterator();
            while (u.hasNext()) {
                ((C8174g) u.next()).m13327B(exc, z);
            }
        }

        @Override
        public void mo13260c() {
            this.f26535b = null;
            AbstractC11396q z = AbstractC11396q.m758z(this.f26534a);
            this.f26534a.clear();
            AbstractC11403r0 u = z.iterator();
            while (u.hasNext()) {
                ((C8174g) u.next()).m13328A();
            }
        }

        public void m13259d(C8174g gVar) {
            this.f26534a.remove(gVar);
            if (this.f26535b == gVar) {
                this.f26535b = null;
                if (!this.f26534a.isEmpty()) {
                    C8174g next = this.f26534a.iterator().next();
                    this.f26535b = next;
                    next.m13323F();
                }
            }
        }
    }

    public class C8190h implements C8174g.AbstractC8176b {
        public C8190h() {
        }

        @Override
        public void mo13258a(final C8174g gVar, int i) {
            if (i == 1 && C8182h.this.f26511q > 0 && C8182h.this.f26507m != -9223372036854775807L) {
                C8182h.this.f26510p.add(gVar);
                ((Handler) C1186a.m38185e(C8182h.this.f26516v)).postAtTime(new Runnable() {
                    @Override
                    public final void run() {
                        C8174g.this.mo13207a(null);
                    }
                }, gVar, SystemClock.uptimeMillis() + C8182h.this.f26507m);
            } else if (i == 0) {
                C8182h.this.f26508n.remove(gVar);
                if (C8182h.this.f26513s == gVar) {
                    C8182h.this.f26513s = null;
                }
                if (C8182h.this.f26514t == gVar) {
                    C8182h.this.f26514t = null;
                }
                C8182h.this.f26504j.m13259d(gVar);
                if (C8182h.this.f26507m != -9223372036854775807L) {
                    ((Handler) C1186a.m38185e(C8182h.this.f26516v)).removeCallbacksAndMessages(gVar);
                    C8182h.this.f26510p.remove(gVar);
                }
            }
            C8182h.this.m13299C();
        }

        @Override
        public void mo13257b(C8174g gVar, int i) {
            if (C8182h.this.f26507m != -9223372036854775807L) {
                C8182h.this.f26510p.remove(gVar);
                ((Handler) C1186a.m38185e(C8182h.this.f26516v)).removeCallbacksAndMessages(gVar);
            }
        }
    }

    public static boolean m13279u(AbstractC8208o oVar) {
        return oVar.mo13199i() == 1 && (C1216l0.f4526a < 19 || (((AbstractC8208o.C8209a) C1186a.m38185e(oVar.mo13201g())).getCause() instanceof ResourceBusyException));
    }

    public static List<C8201m.C8203b> m13275y(C8201m mVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(mVar.f26557M);
        for (int i = 0; i < mVar.f26557M; i++) {
            C8201m.C8203b c = mVar.m13217c(i);
            if ((c.m13213b(uuid) || (C6615i.f20677c.equals(uuid) && c.m13213b(C6615i.f20676b))) && (c.f26562N != null || z)) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    public final AbstractC8208o m13301A(int i, boolean z) {
        AbstractC8169f0 f0Var = (AbstractC8169f0) C1186a.m38185e(this.f26512r);
        if ((f0Var.mo13239m() == 2 && C8181g0.f26493d) || C1216l0.m37959n0(this.f26502h, i) == -1 || f0Var.mo13239m() == 1) {
            return null;
        }
        C8174g gVar = this.f26513s;
        if (gVar == null) {
            C8174g x = m13276x(AbstractC11396q.m768D(), true, null, z);
            this.f26508n.add(x);
            this.f26513s = x;
        } else {
            gVar.mo13203e(null);
        }
        return this.f26513s;
    }

    public final void m13300B(Looper looper) {
        if (this.f26519y == null) {
            this.f26519y = new HandlerC8186d(looper);
        }
    }

    public final void m13299C() {
        if (this.f26512r != null && this.f26511q == 0 && this.f26508n.isEmpty() && this.f26509o.isEmpty()) {
            ((AbstractC8169f0) C1186a.m38185e(this.f26512r)).mo13251a();
            this.f26512r = null;
        }
    }

    public final void m13298D() {
        AbstractC11403r0 u = AbstractC11404s.m722x(this.f26510p).iterator();
        while (u.hasNext()) {
            ((AbstractC8208o) u.next()).mo13207a(null);
        }
    }

    public final void m13297E() {
        AbstractC11403r0 u = AbstractC11404s.m722x(this.f26509o).iterator();
        while (u.hasNext()) {
            ((C8188f) u.next()).mo13159a();
        }
    }

    public void m13296F(int i, byte[] bArr) {
        C1186a.m38184f(this.f26508n.isEmpty());
        if (i == 1 || i == 3) {
            C1186a.m38185e(bArr);
        }
        this.f26517w = i;
        this.f26518x = bArr;
    }

    public final void m13295G(AbstractC8208o oVar, AbstractC8219w.C8220a aVar) {
        oVar.mo13207a(aVar);
        if (this.f26507m != -9223372036854775807L) {
            oVar.mo13207a(null);
        }
    }

    @Override
    public final void mo13164a() {
        int i = this.f26511q - 1;
        this.f26511q = i;
        if (i == 0) {
            if (this.f26507m != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f26508n);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((C8174g) arrayList.get(i2)).mo13207a(null);
                }
            }
            m13297E();
            m13299C();
        }
    }

    @Override
    public final void mo13163b() {
        int i = this.f26511q;
        this.f26511q = i + 1;
        if (i == 0) {
            if (this.f26512r == null) {
                AbstractC8169f0 a = this.f26498d.mo13254a(this.f26497c);
                this.f26512r = a;
                a.mo13250b(new C8185c());
            } else if (this.f26507m != -9223372036854775807L) {
                for (int i2 = 0; i2 < this.f26508n.size(); i2++) {
                    this.f26508n.get(i2).mo13203e(null);
                }
            }
        }
    }

    @Override
    public int mo13162c(C6600g1 g1Var) {
        int m = ((AbstractC8169f0) C1186a.m38185e(this.f26512r)).mo13239m();
        C8201m mVar = g1Var.f20578X;
        if (mVar == null) {
            if (C1216l0.m37959n0(this.f26502h, C1234w.m37863h(g1Var.f20575U)) != -1) {
                return m;
            }
            return 0;
        } else if (m13278v(mVar)) {
            return m;
        } else {
            return 1;
        }
    }

    @Override
    public AbstractC8208o mo13161d(Looper looper, AbstractC8219w.C8220a aVar, C6600g1 g1Var) {
        C1186a.m38184f(this.f26511q > 0);
        m13274z(looper);
        return m13280t(looper, aVar, g1Var, true);
    }

    @Override
    public AbstractC8223y.AbstractC8225b mo13160e(Looper looper, AbstractC8219w.C8220a aVar, C6600g1 g1Var) {
        C1186a.m38184f(this.f26511q > 0);
        m13274z(looper);
        C8188f fVar = new C8188f(aVar);
        fVar.m13265d(g1Var);
        return fVar;
    }

    public final AbstractC8208o m13280t(Looper looper, AbstractC8219w.C8220a aVar, C6600g1 g1Var, boolean z) {
        List<C8201m.C8203b> list;
        m13300B(looper);
        C8201m mVar = g1Var.f20578X;
        if (mVar == null) {
            return m13301A(C1234w.m37863h(g1Var.f20575U), z);
        }
        C8174g gVar = null;
        if (this.f26518x == null) {
            list = m13275y((C8201m) C1186a.m38185e(mVar), this.f26497c, false);
            if (list.isEmpty()) {
                C8187e eVar = new C8187e(this.f26497c);
                C1230s.m37886d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.m13177l(eVar);
                }
                return new C8167e0(new AbstractC8208o.C8209a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f26501g) {
            Iterator<C8174g> it = this.f26508n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8174g next = it.next();
                if (C1216l0.m37982c(next.f26462a, list)) {
                    gVar = next;
                    break;
                }
            }
        } else {
            gVar = this.f26514t;
        }
        if (gVar == null) {
            gVar = m13276x(list, false, aVar, z);
            if (!this.f26501g) {
                this.f26514t = gVar;
            }
            this.f26508n.add(gVar);
        } else {
            gVar.mo13203e(aVar);
        }
        return gVar;
    }

    public final boolean m13278v(C8201m mVar) {
        if (this.f26518x != null) {
            return true;
        }
        if (m13275y(mVar, this.f26497c, true).isEmpty()) {
            if (mVar.f26557M != 1 || !mVar.m13217c(0).m13213b(C6615i.f20676b)) {
                return false;
            }
            String valueOf = String.valueOf(this.f26497c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 72);
            sb2.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb2.append(valueOf);
            C1230s.m37881i("DefaultDrmSessionMgr", sb2.toString());
        }
        String str = mVar.f26560c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? C1216l0.f4526a >= 25 : !"cbc1".equals(str) && !"cens".equals(str);
    }

    public final C8174g m13277w(List<C8201m.C8203b> list, boolean z, AbstractC8219w.C8220a aVar) {
        C1186a.m38185e(this.f26512r);
        C8174g gVar = new C8174g(this.f26497c, this.f26512r, this.f26504j, this.f26506l, list, this.f26517w, this.f26503i | z, z, this.f26518x, this.f26500f, this.f26499e, (Looper) C1186a.m38185e(this.f26515u), this.f26505k);
        gVar.mo13203e(aVar);
        if (this.f26507m != -9223372036854775807L) {
            gVar.mo13203e(null);
        }
        return gVar;
    }

    public final C8174g m13276x(List<C8201m.C8203b> list, boolean z, AbstractC8219w.C8220a aVar, boolean z2) {
        C8174g w = m13277w(list, z, aVar);
        if (m13279u(w) && !this.f26510p.isEmpty()) {
            m13298D();
            m13295G(w, aVar);
            w = m13277w(list, z, aVar);
        }
        if (!m13279u(w) || !z2 || this.f26509o.isEmpty()) {
            return w;
        }
        m13297E();
        if (!this.f26510p.isEmpty()) {
            m13298D();
        }
        m13295G(w, aVar);
        return m13277w(list, z, aVar);
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    public final synchronized void m13274z(Looper looper) {
        Looper looper2 = this.f26515u;
        if (looper2 == null) {
            this.f26515u = looper;
            this.f26516v = new Handler(looper);
        } else {
            C1186a.m38184f(looper2 == looper);
            C1186a.m38185e(this.f26516v);
        }
    }

    public C8182h(UUID uuid, AbstractC8169f0.AbstractC8172c cVar, AbstractC8205m0 m0Var, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, AbstractC0118b0 b0Var, long j) {
        C1186a.m38185e(uuid);
        C1186a.m38188b(!C6615i.f20676b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f26497c = uuid;
        this.f26498d = cVar;
        this.f26499e = m0Var;
        this.f26500f = hashMap;
        this.f26501g = z;
        this.f26502h = iArr;
        this.f26503i = z2;
        this.f26505k = b0Var;
        this.f26504j = new C8189g(this);
        this.f26506l = new C8190h();
        this.f26517w = 0;
        this.f26508n = new ArrayList();
        this.f26509o = C11387o0.m775h();
        this.f26510p = C11387o0.m775h();
        this.f26507m = j;
    }
}
