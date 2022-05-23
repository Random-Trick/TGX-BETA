package q3;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import b5.b0;
import c5.h;
import c5.i;
import c5.l0;
import c5.s;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import n3.p1;
import o4.k;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import q3.g0;
import q3.m;
import q3.o;
import q3.w;

public class g implements o {
    public final List<m.b> f21240a;
    public final g0 f21241b;
    public final a f21242c;
    public final b f21243d;
    public final int f21244e;
    public final boolean f21245f;
    public final boolean f21246g;
    public final HashMap<String, String> f21247h;
    public final i<w.a> f21248i;
    public final b0 f21249j;
    public final p1 f21250k;
    public final n0 f21251l;
    public final UUID f21252m;
    public final e f21253n;
    public int f21254o;
    public int f21255p;
    public HandlerThread f21256q;
    public c f21257r;
    public CryptoConfig f21258s;
    public o.a f21259t;
    public byte[] f21260u;
    public byte[] f21261v;
    public g0.a f21262w;
    public g0.d f21263x;

    public interface a {
        void a(g gVar);

        void b(Exception exc, boolean z10);

        void c();
    }

    public interface b {
        void a(g gVar, int i10);

        void b(g gVar, int i10);
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {
        public boolean f21264a;

        public c(Looper looper) {
            super(looper);
        }

        public final boolean a(Message message, o0 o0Var) {
            IOException iOException;
            d dVar = (d) message.obj;
            if (!dVar.f21267b) {
                return false;
            }
            int i10 = dVar.f21270e + 1;
            dVar.f21270e = i10;
            if (i10 > g.this.f21249j.c(3)) {
                return false;
            }
            k kVar = new k(dVar.f21266a, o0Var.f21349a, o0Var.f21350b, o0Var.f21351c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f21268c, o0Var.M);
            o4.o oVar = new o4.o(3);
            if (o0Var.getCause() instanceof IOException) {
                iOException = (IOException) o0Var.getCause();
            } else {
                iOException = new f(o0Var.getCause());
            }
            long a10 = g.this.f21249j.a(new b0.a(kVar, oVar, iOException, dVar.f21270e));
            if (a10 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f21264a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), a10);
                return true;
            }
        }

        public void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(k.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f21264a = true;
        }

        @Override
        public void handleMessage(Message message) {
            byte[] bArr;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    g gVar = g.this;
                    bArr = gVar.f21251l.b(gVar.f21252m, (g0.d) dVar.f21269d);
                } else if (i10 == 1) {
                    g gVar2 = g.this;
                    bArr = gVar2.f21251l.a(gVar2.f21252m, (g0.a) dVar.f21269d);
                } else {
                    throw new RuntimeException();
                }
            } catch (o0 e10) {
                boolean a10 = a(message, e10);
                bArr = e10;
                if (a10) {
                    return;
                }
            } catch (Exception e11) {
                s.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                bArr = e11;
            }
            g.this.f21249j.b(dVar.f21266a);
            synchronized (this) {
                if (!this.f21264a) {
                    g.this.f21253n.obtainMessage(message.what, Pair.create(dVar.f21269d, bArr)).sendToTarget();
                }
            }
        }
    }

    public static final class d {
        public final long f21266a;
        public final boolean f21267b;
        public final long f21268c;
        public final Object f21269d;
        public int f21270e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f21266a = j10;
            this.f21267b = z10;
            this.f21268c = j11;
            this.f21269d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                g.this.C(obj, obj2);
            } else if (i10 == 1) {
                g.this.w(obj, obj2);
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public g(UUID uuid, g0 g0Var, a aVar, b bVar, List<m.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, n0 n0Var, Looper looper, b0 b0Var, p1 p1Var) {
        if (i10 == 1 || i10 == 3) {
            c5.a.e(bArr);
        }
        this.f21252m = uuid;
        this.f21242c = aVar;
        this.f21243d = bVar;
        this.f21241b = g0Var;
        this.f21244e = i10;
        this.f21245f = z10;
        this.f21246g = z11;
        if (bArr != null) {
            this.f21261v = bArr;
            this.f21240a = null;
        } else {
            this.f21240a = Collections.unmodifiableList((List) c5.a.e(list));
        }
        this.f21247h = hashMap;
        this.f21251l = n0Var;
        this.f21248i = new i<>();
        this.f21249j = b0Var;
        this.f21250k = p1Var;
        this.f21254o = 2;
        this.f21253n = new e(looper);
    }

    public void A() {
        if (D()) {
            p(true);
        }
    }

    public void B(Exception exc, boolean z10) {
        v(exc, z10 ? 1 : 3);
    }

    public final void C(Object obj, Object obj2) {
        if (obj != this.f21263x) {
            return;
        }
        if (this.f21254o == 2 || s()) {
            this.f21263x = null;
            if (obj2 instanceof Exception) {
                this.f21242c.b((Exception) obj2, false);
                return;
            }
            try {
                this.f21241b.l((byte[]) obj2);
                this.f21242c.c();
            } catch (Exception e10) {
                this.f21242c.b(e10, true);
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean D() {
        if (s()) {
            return true;
        }
        try {
            byte[] g10 = this.f21241b.g();
            this.f21260u = g10;
            this.f21241b.d(g10, this.f21250k);
            this.f21258s = this.f21241b.f(this.f21260u);
            this.f21254o = 3;
            o(new h() {
                @Override
                public final void a(Object obj) {
                    ((w.a) obj).k(r1);
                }
            });
            c5.a.e(this.f21260u);
            return true;
        } catch (NotProvisionedException unused) {
            this.f21242c.a(this);
            return false;
        } catch (Exception e10) {
            v(e10, 1);
            return false;
        }
    }

    public final void E(byte[] bArr, int i10, boolean z10) {
        try {
            this.f21262w = this.f21241b.m(bArr, this.f21240a, i10, this.f21247h);
            ((c) l0.j(this.f21257r)).b(1, c5.a.e(this.f21262w), z10);
        } catch (Exception e10) {
            x(e10, true);
        }
    }

    public void F() {
        this.f21263x = this.f21241b.e();
        ((c) l0.j(this.f21257r)).b(0, c5.a.e(this.f21263x), true);
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    public final boolean G() {
        try {
            this.f21241b.i(this.f21260u, this.f21261v);
            return true;
        } catch (Exception e10) {
            v(e10, 1);
            return false;
        }
    }

    @Override
    public void a(w.a aVar) {
        int i10 = this.f21255p;
        if (i10 <= 0) {
            s.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f21255p = i11;
        if (i11 == 0) {
            this.f21254o = 0;
            ((e) l0.j(this.f21253n)).removeCallbacksAndMessages(null);
            ((c) l0.j(this.f21257r)).c();
            this.f21257r = null;
            ((HandlerThread) l0.j(this.f21256q)).quit();
            this.f21256q = null;
            this.f21258s = null;
            this.f21259t = null;
            this.f21262w = null;
            this.f21263x = null;
            byte[] bArr = this.f21260u;
            if (bArr != null) {
                this.f21241b.j(bArr);
                this.f21260u = null;
            }
        }
        if (aVar != null) {
            this.f21248i.m(aVar);
            if (this.f21248i.g(aVar) == 0) {
                aVar.m();
            }
        }
        this.f21243d.a(this, this.f21255p);
    }

    @Override
    public final UUID b() {
        return this.f21252m;
    }

    @Override
    public boolean c() {
        return this.f21245f;
    }

    @Override
    public Map<String, String> d() {
        byte[] bArr = this.f21260u;
        if (bArr == null) {
            return null;
        }
        return this.f21241b.c(bArr);
    }

    @Override
    public void e(w.a aVar) {
        int i10 = this.f21255p;
        boolean z10 = false;
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Session reference count less than zero: ");
            sb2.append(i10);
            s.c("DefaultDrmSession", sb2.toString());
            this.f21255p = 0;
        }
        if (aVar != null) {
            this.f21248i.f(aVar);
        }
        int i11 = this.f21255p + 1;
        this.f21255p = i11;
        if (i11 == 1) {
            if (this.f21254o == 2) {
                z10 = true;
            }
            c5.a.f(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f21256q = handlerThread;
            handlerThread.start();
            this.f21257r = new c(this.f21256q.getLooper());
            if (D()) {
                p(true);
            }
        } else if (aVar != null && s() && this.f21248i.g(aVar) == 1) {
            aVar.k(this.f21254o);
        }
        this.f21243d.b(this, this.f21255p);
    }

    @Override
    public boolean f(String str) {
        return this.f21241b.h((byte[]) c5.a.h(this.f21260u), str);
    }

    @Override
    public final o.a g() {
        if (this.f21254o == 1) {
            return this.f21259t;
        }
        return null;
    }

    @Override
    public final CryptoConfig h() {
        return this.f21258s;
    }

    @Override
    public final int i() {
        return this.f21254o;
    }

    public final void o(h<w.a> hVar) {
        for (w.a aVar : this.f21248i.d()) {
            hVar.a(aVar);
        }
    }

    @RequiresNonNull({"sessionId"})
    public final void p(boolean z10) {
        if (!this.f21246g) {
            byte[] bArr = (byte[]) l0.j(this.f21260u);
            int i10 = this.f21244e;
            if (i10 == 0 || i10 == 1) {
                if (this.f21261v == null) {
                    E(bArr, 1, z10);
                } else if (this.f21254o == 4 || G()) {
                    long q10 = q();
                    if (this.f21244e == 0 && q10 <= 60) {
                        StringBuilder sb2 = new StringBuilder(88);
                        sb2.append("Offline license has expired or will expire soon. Remaining seconds: ");
                        sb2.append(q10);
                        s.b("DefaultDrmSession", sb2.toString());
                        E(bArr, 2, z10);
                    } else if (q10 <= 0) {
                        v(new m0(), 2);
                    } else {
                        this.f21254o = 4;
                        o(q3.f.f21239a);
                    }
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    c5.a.e(this.f21261v);
                    c5.a.e(this.f21260u);
                    E(this.f21261v, 3, z10);
                }
            } else if (this.f21261v == null || G()) {
                E(bArr, 2, z10);
            }
        }
    }

    public final long q() {
        if (!m3.i.f16679d.equals(this.f21252m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) c5.a.e(q0.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean r(byte[] bArr) {
        return Arrays.equals(this.f21260u, bArr);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean s() {
        int i10 = this.f21254o;
        return i10 == 3 || i10 == 4;
    }

    public final void v(final Exception exc, int i10) {
        this.f21259t = new o.a(exc, c0.a(exc, i10));
        s.d("DefaultDrmSession", "DRM session error", exc);
        o(new h() {
            @Override
            public final void a(Object obj) {
                ((w.a) obj).l(exc);
            }
        });
        if (this.f21254o != 4) {
            this.f21254o = 1;
        }
    }

    public final void w(Object obj, Object obj2) {
        if (obj == this.f21262w && s()) {
            this.f21262w = null;
            if (obj2 instanceof Exception) {
                x((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f21244e == 3) {
                    this.f21241b.k((byte[]) l0.j(this.f21261v), bArr);
                    o(q3.e.f21237a);
                    return;
                }
                byte[] k10 = this.f21241b.k(this.f21260u, bArr);
                int i10 = this.f21244e;
                if (!((i10 != 2 && (i10 != 0 || this.f21261v == null)) || k10 == null || k10.length == 0)) {
                    this.f21261v = k10;
                }
                this.f21254o = 4;
                o(q3.d.f21236a);
            } catch (Exception e10) {
                x(e10, true);
            }
        }
    }

    public final void x(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f21242c.a(this);
        } else {
            v(exc, z10 ? 1 : 2);
        }
    }

    public final void y() {
        if (this.f21244e == 0 && this.f21254o == 4) {
            l0.j(this.f21260u);
            p(false);
        }
    }

    public void z(int i10) {
        if (i10 == 2) {
            y();
        }
    }
}
