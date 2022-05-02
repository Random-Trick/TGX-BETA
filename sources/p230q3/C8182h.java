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
    public final UUID f26500c;
    public final AbstractC8169f0.AbstractC8172c f26501d;
    public final AbstractC8205m0 f26502e;
    public final HashMap<String, String> f26503f;
    public final boolean f26504g;
    public final int[] f26505h;
    public final boolean f26506i;
    public final C8189g f26507j;
    public final AbstractC0118b0 f26508k;
    public final C8190h f26509l;
    public final long f26510m;
    public final List<C8174g> f26511n;
    public final Set<C8188f> f26512o;
    public final Set<C8174g> f26513p;
    public int f26514q;
    public AbstractC8169f0 f26515r;
    public C8174g f26516s;
    public C8174g f26517t;
    public Looper f26518u;
    public Handler f26519v;
    public int f26520w;
    public byte[] f26521x;
    public volatile HandlerC8186d f26522y;

    public static final class C8184b {
        public boolean f26526d;
        public boolean f26528f;
        public final HashMap<String, String> f26523a = new HashMap<>();
        public UUID f26524b = C6615i.f20678d;
        public AbstractC8169f0.AbstractC8172c f26525c = C8195j0.f26546d;
        public AbstractC0118b0 f26529g = new C0175w();
        public int[] f26527e = new int[0];
        public long f26530h = 300000;

        public C8182h m13272a(AbstractC8205m0 m0Var) {
            return new C8182h(this.f26524b, this.f26525c, m0Var, this.f26523a, this.f26526d, this.f26527e, this.f26528f, this.f26529g, this.f26530h);
        }

        public C8184b m13271b(boolean z) {
            this.f26526d = z;
            return this;
        }

        public C8184b m13270c(boolean z) {
            this.f26528f = z;
            return this;
        }

        public C8184b m13269d(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (!(i == 2 || i == 1)) {
                    z = false;
                }
                C1186a.m38192a(z);
            }
            this.f26527e = (int[]) iArr.clone();
            return this;
        }

        public C8184b m13268e(UUID uuid, AbstractC8169f0.AbstractC8172c cVar) {
            this.f26524b = (UUID) C1186a.m38188e(uuid);
            this.f26525c = (AbstractC8169f0.AbstractC8172c) C1186a.m38188e(cVar);
            return this;
        }
    }

    public class C8185c implements AbstractC8169f0.AbstractC8171b {
        public C8185c() {
        }

        @Override
        public void mo13267a(AbstractC8169f0 f0Var, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((HandlerC8186d) C1186a.m38188e(C8182h.this.f26522y)).obtainMessage(i, bArr).sendToTarget();
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
                for (C8174g gVar : C8182h.this.f26511n) {
                    if (gVar.m13312r(bArr)) {
                        gVar.m13304z(message.what);
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
        public final AbstractC8219w.C8220a f26533b;
        public AbstractC8208o f26534c;
        public boolean f26535d;

        public C8188f(AbstractC8219w.C8220a aVar) {
            this.f26533b = aVar;
        }

        public void m13263e(C6600g1 g1Var) {
            if (C8182h.this.f26514q != 0 && !this.f26535d) {
                C8182h hVar = C8182h.this;
                this.f26534c = hVar.m13279t((Looper) C1186a.m38188e(hVar.f26518u), this.f26533b, g1Var, false);
                C8182h.this.f26512o.add(this);
            }
        }

        public void m13262f() {
            if (!this.f26535d) {
                AbstractC8208o oVar = this.f26534c;
                if (oVar != null) {
                    oVar.mo13206a(this.f26533b);
                }
                C8182h.this.f26512o.remove(this);
                this.f26535d = true;
            }
        }

        @Override
        public void mo13158a() {
            C1216l0.m37944w0((Handler) C1186a.m38188e(C8182h.this.f26519v), new Runnable() {
                @Override
                public final void run() {
                    C8182h.C8188f.this.m13262f();
                }
            });
        }

        public void m13264d(final C6600g1 g1Var) {
            ((Handler) C1186a.m38188e(C8182h.this.f26519v)).post(new Runnable() {
                @Override
                public final void run() {
                    C8182h.C8188f.this.m13263e(g1Var);
                }
            });
        }
    }

    public class C8189g implements C8174g.AbstractC8175a {
        public final Set<C8174g> f26537a = new HashSet();
        public C8174g f26538b;

        public C8189g(C8182h hVar) {
        }

        @Override
        public void mo13261a(C8174g gVar) {
            this.f26537a.add(gVar);
            if (this.f26538b == null) {
                this.f26538b = gVar;
                gVar.m13322F();
            }
        }

        @Override
        public void mo13260b(Exception exc, boolean z) {
            this.f26538b = null;
            AbstractC11396q z2 = AbstractC11396q.m758z(this.f26537a);
            this.f26537a.clear();
            AbstractC11403r0 u = z2.iterator();
            while (u.hasNext()) {
                ((C8174g) u.next()).m13326B(exc, z);
            }
        }

        @Override
        public void mo13259c() {
            this.f26538b = null;
            AbstractC11396q z = AbstractC11396q.m758z(this.f26537a);
            this.f26537a.clear();
            AbstractC11403r0 u = z.iterator();
            while (u.hasNext()) {
                ((C8174g) u.next()).m13327A();
            }
        }

        public void m13258d(C8174g gVar) {
            this.f26537a.remove(gVar);
            if (this.f26538b == gVar) {
                this.f26538b = null;
                if (!this.f26537a.isEmpty()) {
                    C8174g next = this.f26537a.iterator().next();
                    this.f26538b = next;
                    next.m13322F();
                }
            }
        }
    }

    public class C8190h implements C8174g.AbstractC8176b {
        public C8190h() {
        }

        @Override
        public void mo13257a(final C8174g gVar, int i) {
            if (i == 1 && C8182h.this.f26514q > 0 && C8182h.this.f26510m != -9223372036854775807L) {
                C8182h.this.f26513p.add(gVar);
                ((Handler) C1186a.m38188e(C8182h.this.f26519v)).postAtTime(new Runnable() {
                    @Override
                    public final void run() {
                        C8174g.this.mo13206a(null);
                    }
                }, gVar, SystemClock.uptimeMillis() + C8182h.this.f26510m);
            } else if (i == 0) {
                C8182h.this.f26511n.remove(gVar);
                if (C8182h.this.f26516s == gVar) {
                    C8182h.this.f26516s = null;
                }
                if (C8182h.this.f26517t == gVar) {
                    C8182h.this.f26517t = null;
                }
                C8182h.this.f26507j.m13258d(gVar);
                if (C8182h.this.f26510m != -9223372036854775807L) {
                    ((Handler) C1186a.m38188e(C8182h.this.f26519v)).removeCallbacksAndMessages(gVar);
                    C8182h.this.f26513p.remove(gVar);
                }
            }
            C8182h.this.m13298C();
        }

        @Override
        public void mo13256b(C8174g gVar, int i) {
            if (C8182h.this.f26510m != -9223372036854775807L) {
                C8182h.this.f26513p.remove(gVar);
                ((Handler) C1186a.m38188e(C8182h.this.f26519v)).removeCallbacksAndMessages(gVar);
            }
        }
    }

    public static boolean m13278u(AbstractC8208o oVar) {
        return oVar.mo13198i() == 1 && (C1216l0.f4526a < 19 || (((AbstractC8208o.C8209a) C1186a.m38188e(oVar.mo13200g())).getCause() instanceof ResourceBusyException));
    }

    public static List<C8201m.C8203b> m13274y(C8201m mVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(mVar.f26560M);
        for (int i = 0; i < mVar.f26560M; i++) {
            C8201m.C8203b c = mVar.m13216c(i);
            if ((c.m13212b(uuid) || (C6615i.f20677c.equals(uuid) && c.m13212b(C6615i.f20676b))) && (c.f26565N != null || z)) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    public final AbstractC8208o m13300A(int i, boolean z) {
        AbstractC8169f0 f0Var = (AbstractC8169f0) C1186a.m38188e(this.f26515r);
        if ((f0Var.mo13238m() == 2 && C8181g0.f26496d) || C1216l0.m37962n0(this.f26505h, i) == -1 || f0Var.mo13238m() == 1) {
            return null;
        }
        C8174g gVar = this.f26516s;
        if (gVar == null) {
            C8174g x = m13275x(AbstractC11396q.m768D(), true, null, z);
            this.f26511n.add(x);
            this.f26516s = x;
        } else {
            gVar.mo13202e(null);
        }
        return this.f26516s;
    }

    public final void m13299B(Looper looper) {
        if (this.f26522y == null) {
            this.f26522y = new HandlerC8186d(looper);
        }
    }

    public final void m13298C() {
        if (this.f26515r != null && this.f26514q == 0 && this.f26511n.isEmpty() && this.f26512o.isEmpty()) {
            ((AbstractC8169f0) C1186a.m38188e(this.f26515r)).mo13250a();
            this.f26515r = null;
        }
    }

    public final void m13297D() {
        AbstractC11403r0 u = AbstractC11404s.m722x(this.f26513p).iterator();
        while (u.hasNext()) {
            ((AbstractC8208o) u.next()).mo13206a(null);
        }
    }

    public final void m13296E() {
        AbstractC11403r0 u = AbstractC11404s.m722x(this.f26512o).iterator();
        while (u.hasNext()) {
            ((C8188f) u.next()).mo13158a();
        }
    }

    public void m13295F(int i, byte[] bArr) {
        C1186a.m38187f(this.f26511n.isEmpty());
        if (i == 1 || i == 3) {
            C1186a.m38188e(bArr);
        }
        this.f26520w = i;
        this.f26521x = bArr;
    }

    public final void m13294G(AbstractC8208o oVar, AbstractC8219w.C8220a aVar) {
        oVar.mo13206a(aVar);
        if (this.f26510m != -9223372036854775807L) {
            oVar.mo13206a(null);
        }
    }

    @Override
    public final void mo13163a() {
        int i = this.f26514q - 1;
        this.f26514q = i;
        if (i == 0) {
            if (this.f26510m != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f26511n);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((C8174g) arrayList.get(i2)).mo13206a(null);
                }
            }
            m13296E();
            m13298C();
        }
    }

    @Override
    public final void mo13162b() {
        int i = this.f26514q;
        this.f26514q = i + 1;
        if (i == 0) {
            if (this.f26515r == null) {
                AbstractC8169f0 a = this.f26501d.mo13253a(this.f26500c);
                this.f26515r = a;
                a.mo13249b(new C8185c());
            } else if (this.f26510m != -9223372036854775807L) {
                for (int i2 = 0; i2 < this.f26511n.size(); i2++) {
                    this.f26511n.get(i2).mo13202e(null);
                }
            }
        }
    }

    @Override
    public int mo13161c(C6600g1 g1Var) {
        int m = ((AbstractC8169f0) C1186a.m38188e(this.f26515r)).mo13238m();
        C8201m mVar = g1Var.f20578X;
        if (mVar == null) {
            if (C1216l0.m37962n0(this.f26505h, C1234w.m37866h(g1Var.f20575U)) != -1) {
                return m;
            }
            return 0;
        } else if (m13277v(mVar)) {
            return m;
        } else {
            return 1;
        }
    }

    @Override
    public AbstractC8208o mo13160d(Looper looper, AbstractC8219w.C8220a aVar, C6600g1 g1Var) {
        C1186a.m38187f(this.f26514q > 0);
        m13273z(looper);
        return m13279t(looper, aVar, g1Var, true);
    }

    @Override
    public AbstractC8223y.AbstractC8225b mo13159e(Looper looper, AbstractC8219w.C8220a aVar, C6600g1 g1Var) {
        C1186a.m38187f(this.f26514q > 0);
        m13273z(looper);
        C8188f fVar = new C8188f(aVar);
        fVar.m13264d(g1Var);
        return fVar;
    }

    public final AbstractC8208o m13279t(Looper looper, AbstractC8219w.C8220a aVar, C6600g1 g1Var, boolean z) {
        List<C8201m.C8203b> list;
        m13299B(looper);
        C8201m mVar = g1Var.f20578X;
        if (mVar == null) {
            return m13300A(C1234w.m37866h(g1Var.f20575U), z);
        }
        C8174g gVar = null;
        if (this.f26521x == null) {
            list = m13274y((C8201m) C1186a.m38188e(mVar), this.f26500c, false);
            if (list.isEmpty()) {
                C8187e eVar = new C8187e(this.f26500c);
                C1230s.m37889d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.m13176l(eVar);
                }
                return new C8167e0(new AbstractC8208o.C8209a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f26504g) {
            Iterator<C8174g> it = this.f26511n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8174g next = it.next();
                if (C1216l0.m37985c(next.f26465a, list)) {
                    gVar = next;
                    break;
                }
            }
        } else {
            gVar = this.f26517t;
        }
        if (gVar == null) {
            gVar = m13275x(list, false, aVar, z);
            if (!this.f26504g) {
                this.f26517t = gVar;
            }
            this.f26511n.add(gVar);
        } else {
            gVar.mo13202e(aVar);
        }
        return gVar;
    }

    public final boolean m13277v(C8201m mVar) {
        if (this.f26521x != null) {
            return true;
        }
        if (m13274y(mVar, this.f26500c, true).isEmpty()) {
            if (mVar.f26560M != 1 || !mVar.m13216c(0).m13212b(C6615i.f20676b)) {
                return false;
            }
            String valueOf = String.valueOf(this.f26500c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 72);
            sb2.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb2.append(valueOf);
            C1230s.m37884i("DefaultDrmSessionMgr", sb2.toString());
        }
        String str = mVar.f26563c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? C1216l0.f4526a >= 25 : !"cbc1".equals(str) && !"cens".equals(str);
    }

    public final C8174g m13276w(List<C8201m.C8203b> list, boolean z, AbstractC8219w.C8220a aVar) {
        C1186a.m38188e(this.f26515r);
        C8174g gVar = new C8174g(this.f26500c, this.f26515r, this.f26507j, this.f26509l, list, this.f26520w, this.f26506i | z, z, this.f26521x, this.f26503f, this.f26502e, (Looper) C1186a.m38188e(this.f26518u), this.f26508k);
        gVar.mo13202e(aVar);
        if (this.f26510m != -9223372036854775807L) {
            gVar.mo13202e(null);
        }
        return gVar;
    }

    public final C8174g m13275x(List<C8201m.C8203b> list, boolean z, AbstractC8219w.C8220a aVar, boolean z2) {
        C8174g w = m13276w(list, z, aVar);
        if (m13278u(w) && !this.f26513p.isEmpty()) {
            m13297D();
            m13294G(w, aVar);
            w = m13276w(list, z, aVar);
        }
        if (!m13278u(w) || !z2 || this.f26512o.isEmpty()) {
            return w;
        }
        m13296E();
        if (!this.f26513p.isEmpty()) {
            m13297D();
        }
        m13294G(w, aVar);
        return m13276w(list, z, aVar);
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    public final synchronized void m13273z(Looper looper) {
        Looper looper2 = this.f26518u;
        if (looper2 == null) {
            this.f26518u = looper;
            this.f26519v = new Handler(looper);
        } else {
            C1186a.m38187f(looper2 == looper);
            C1186a.m38188e(this.f26519v);
        }
    }

    public C8182h(UUID uuid, AbstractC8169f0.AbstractC8172c cVar, AbstractC8205m0 m0Var, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, AbstractC0118b0 b0Var, long j) {
        C1186a.m38188e(uuid);
        C1186a.m38191b(!C6615i.f20676b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f26500c = uuid;
        this.f26501d = cVar;
        this.f26502e = m0Var;
        this.f26503f = hashMap;
        this.f26504g = z;
        this.f26505h = iArr;
        this.f26506i = z2;
        this.f26508k = b0Var;
        this.f26507j = new C8189g(this);
        this.f26509l = new C8190h();
        this.f26520w = 0;
        this.f26511n = new ArrayList();
        this.f26512o = C11387o0.m775h();
        this.f26513p = C11387o0.m775h();
        this.f26510m = j;
    }
}
