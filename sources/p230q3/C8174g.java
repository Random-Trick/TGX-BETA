package p230q3;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p006a5.AbstractC0118b0;
import p020b5.AbstractC1202h;
import p020b5.C1186a;
import p020b5.C1204i;
import p020b5.C1216l0;
import p020b5.C1230s;
import p174m3.C6615i;
import p187n4.C7205l;
import p187n4.C7221p;
import p230q3.AbstractC8169f0;
import p230q3.AbstractC8208o;
import p230q3.AbstractC8219w;
import p230q3.C8201m;

public class C8174g implements AbstractC8208o {
    public final List<C8201m.C8203b> f26462a;
    public final AbstractC8169f0 f26463b;
    public final AbstractC8175a f26464c;
    public final AbstractC8176b f26465d;
    public final int f26466e;
    public final boolean f26467f;
    public final boolean f26468g;
    public final HashMap<String, String> f26469h;
    public final C1204i<AbstractC8219w.C8220a> f26470i;
    public final AbstractC0118b0 f26471j;
    public final AbstractC8205m0 f26472k;
    public final UUID f26473l;
    public final HandlerC8179e f26474m;
    public int f26475n;
    public int f26476o;
    public HandlerThread f26477p;
    public HandlerC8177c f26478q;
    public CryptoConfig f26479r;
    public AbstractC8208o.C8209a f26480s;
    public byte[] f26481t;
    public byte[] f26482u;
    public AbstractC8169f0.C8170a f26483v;
    public AbstractC8169f0.C8173d f26484w;

    public interface AbstractC8175a {
        void mo13262a(C8174g gVar);

        void mo13261b(Exception exc, boolean z);

        void mo13260c();
    }

    public interface AbstractC8176b {
        void mo13258a(C8174g gVar, int i);

        void mo13257b(C8174g gVar, int i);
    }

    @SuppressLint({"HandlerLeak"})
    public class HandlerC8177c extends Handler {
        public boolean f26485a;

        public HandlerC8177c(Looper looper) {
            super(looper);
        }

        public final boolean m13304a(Message message, C8207n0 n0Var) {
            IOException iOException;
            C8178d dVar = (C8178d) message.obj;
            if (!dVar.f26488b) {
                return false;
            }
            int i = dVar.f26491e + 1;
            dVar.f26491e = i;
            if (i > C8174g.this.f26471j.mo42138c(3)) {
                return false;
            }
            C7205l lVar = new C7205l(dVar.f26487a, n0Var.f26567a, n0Var.f26568b, n0Var.f26569c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f26489c, n0Var.f26566M);
            C7221p pVar = new C7221p(3);
            if (n0Var.getCause() instanceof IOException) {
                iOException = (IOException) n0Var.getCause();
            } else {
                iOException = new C8180f(n0Var.getCause());
            }
            long b = C8174g.this.f26471j.mo42139b(new AbstractC0118b0.C0119a(lVar, pVar, iOException, dVar.f26491e));
            if (b == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f26485a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), b);
                return true;
            }
        }

        public void m13303b(int i, Object obj, boolean z) {
            obtainMessage(i, new C8178d(C7205l.m17353a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void m13302c() {
            removeCallbacksAndMessages(null);
            this.f26485a = true;
        }

        @Override
        public void handleMessage(Message message) {
            byte[] bArr;
            C8178d dVar = (C8178d) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    C8174g gVar = C8174g.this;
                    bArr = gVar.f26472k.mo13209b(gVar.f26473l, (AbstractC8169f0.C8173d) dVar.f26490d);
                } else if (i == 1) {
                    C8174g gVar2 = C8174g.this;
                    bArr = gVar2.f26472k.mo13210a(gVar2.f26473l, (AbstractC8169f0.C8170a) dVar.f26490d);
                } else {
                    throw new RuntimeException();
                }
            } catch (C8207n0 e) {
                boolean a = m13304a(message, e);
                bArr = e;
                if (a) {
                    return;
                }
            } catch (Exception e2) {
                C1230s.m37880j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                bArr = e2;
            }
            C8174g.this.f26471j.mo42140a(dVar.f26487a);
            synchronized (this) {
                if (!this.f26485a) {
                    C8174g.this.f26474m.obtainMessage(message.what, Pair.create(dVar.f26490d, bArr)).sendToTarget();
                }
            }
        }
    }

    public static final class C8178d {
        public final long f26487a;
        public final boolean f26488b;
        public final long f26489c;
        public final Object f26490d;
        public int f26491e;

        public C8178d(long j, boolean z, long j2, Object obj) {
            this.f26487a = j;
            this.f26488b = z;
            this.f26489c = j2;
            this.f26490d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class HandlerC8179e extends Handler {
        public HandlerC8179e(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                C8174g.this.m13326C(obj, obj2);
            } else if (i == 1) {
                C8174g.this.m13308w(obj, obj2);
            }
        }
    }

    public static final class C8180f extends IOException {
        public C8180f(Throwable th) {
            super(th);
        }
    }

    public C8174g(UUID uuid, AbstractC8169f0 f0Var, AbstractC8175a aVar, AbstractC8176b bVar, List<C8201m.C8203b> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, AbstractC8205m0 m0Var, Looper looper, AbstractC0118b0 b0Var) {
        if (i == 1 || i == 3) {
            C1186a.m38185e(bArr);
        }
        this.f26473l = uuid;
        this.f26464c = aVar;
        this.f26465d = bVar;
        this.f26463b = f0Var;
        this.f26466e = i;
        this.f26467f = z;
        this.f26468g = z2;
        if (bArr != null) {
            this.f26482u = bArr;
            this.f26462a = null;
        } else {
            this.f26462a = Collections.unmodifiableList((List) C1186a.m38185e(list));
        }
        this.f26469h = hashMap;
        this.f26472k = m0Var;
        this.f26470i = new C1204i<>();
        this.f26471j = b0Var;
        this.f26475n = 2;
        this.f26474m = new HandlerC8179e(looper);
    }

    public void m13328A() {
        if (m13325D()) {
            m13315p(true);
        }
    }

    public void m13327B(Exception exc, boolean z) {
        m13309v(exc, z ? 1 : 3);
    }

    public final void m13326C(Object obj, Object obj2) {
        if (obj != this.f26484w) {
            return;
        }
        if (this.f26475n == 2 || m13312s()) {
            this.f26484w = null;
            if (obj2 instanceof Exception) {
                this.f26464c.mo13261b((Exception) obj2, false);
                return;
            }
            try {
                this.f26463b.mo13241k((byte[]) obj2);
                this.f26464c.mo13260c();
            } catch (Exception e) {
                this.f26464c.mo13261b(e, true);
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean m13325D() {
        if (m13312s()) {
            return true;
        }
        try {
            byte[] f = this.f26463b.mo13246f();
            this.f26481t = f;
            this.f26479r = this.f26463b.mo13247e(f);
            this.f26475n = 3;
            m13316o(new AbstractC1202h() {
                @Override
                public final void mo13333a(Object obj) {
                    ((AbstractC8219w.C8220a) obj).m13178k(r1);
                }
            });
            C1186a.m38185e(this.f26481t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f26464c.mo13262a(this);
            return false;
        } catch (Exception e) {
            m13309v(e, 1);
            return false;
        }
    }

    public final void m13324E(byte[] bArr, int i, boolean z) {
        try {
            this.f26483v = this.f26463b.mo13240l(bArr, this.f26462a, i, this.f26469h);
            ((HandlerC8177c) C1216l0.m37968j(this.f26478q)).m13303b(1, C1186a.m38185e(this.f26483v), z);
        } catch (Exception e) {
            m13307x(e, true);
        }
    }

    public void m13323F() {
        this.f26484w = this.f26463b.mo13248d();
        ((HandlerC8177c) C1216l0.m37968j(this.f26478q)).m13303b(0, C1186a.m38185e(this.f26484w), true);
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    public final boolean m13322G() {
        try {
            this.f26463b.mo13244h(this.f26481t, this.f26482u);
            return true;
        } catch (Exception e) {
            m13309v(e, 1);
            return false;
        }
    }

    @Override
    public void mo13207a(AbstractC8219w.C8220a aVar) {
        int i = this.f26476o;
        if (i <= 0) {
            C1230s.m37887c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f26476o = i2;
        if (i2 == 0) {
            this.f26475n = 0;
            ((HandlerC8179e) C1216l0.m37968j(this.f26474m)).removeCallbacksAndMessages(null);
            ((HandlerC8177c) C1216l0.m37968j(this.f26478q)).m13302c();
            this.f26478q = null;
            ((HandlerThread) C1216l0.m37968j(this.f26477p)).quit();
            this.f26477p = null;
            this.f26479r = null;
            this.f26480s = null;
            this.f26483v = null;
            this.f26484w = null;
            byte[] bArr = this.f26481t;
            if (bArr != null) {
                this.f26463b.mo13243i(bArr);
                this.f26481t = null;
            }
        }
        if (aVar != null) {
            this.f26470i.m38054m(aVar);
            if (this.f26470i.m38055i(aVar) == 0) {
                aVar.m13176m();
            }
        }
        this.f26465d.mo13258a(this, this.f26476o);
    }

    @Override
    public final UUID mo13206b() {
        return this.f26473l;
    }

    @Override
    public boolean mo13205c() {
        return this.f26467f;
    }

    @Override
    public Map<String, String> mo13204d() {
        byte[] bArr = this.f26481t;
        if (bArr == null) {
            return null;
        }
        return this.f26463b.mo13249c(bArr);
    }

    @Override
    public void mo13203e(AbstractC8219w.C8220a aVar) {
        int i = this.f26476o;
        boolean z = false;
        if (i < 0) {
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Session reference count less than zero: ");
            sb2.append(i);
            C1230s.m37887c("DefaultDrmSession", sb2.toString());
            this.f26476o = 0;
        }
        if (aVar != null) {
            this.f26470i.m38056h(aVar);
        }
        int i2 = this.f26476o + 1;
        this.f26476o = i2;
        if (i2 == 1) {
            if (this.f26475n == 2) {
                z = true;
            }
            C1186a.m38184f(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f26477p = handlerThread;
            handlerThread.start();
            this.f26478q = new HandlerC8177c(this.f26477p.getLooper());
            if (m13325D()) {
                m13315p(true);
            }
        } else if (aVar != null && m13312s() && this.f26470i.m38055i(aVar) == 1) {
            aVar.m13178k(this.f26475n);
        }
        this.f26465d.mo13257b(this, this.f26476o);
    }

    @Override
    public boolean mo13202f(String str) {
        return this.f26463b.mo13245g((byte[]) C1186a.m38182h(this.f26481t), str);
    }

    @Override
    public final AbstractC8208o.C8209a mo13201g() {
        if (this.f26475n == 1) {
            return this.f26480s;
        }
        return null;
    }

    @Override
    public final CryptoConfig mo13200h() {
        return this.f26479r;
    }

    @Override
    public final int mo13199i() {
        return this.f26475n;
    }

    public final void m13316o(AbstractC1202h<AbstractC8219w.C8220a> hVar) {
        for (AbstractC8219w.C8220a aVar : this.f26470i.m38057e()) {
            hVar.mo13333a(aVar);
        }
    }

    @RequiresNonNull({"sessionId"})
    public final void m13315p(boolean z) {
        if (!this.f26468g) {
            byte[] bArr = (byte[]) C1216l0.m37968j(this.f26481t);
            int i = this.f26466e;
            if (i == 0 || i == 1) {
                if (this.f26482u == null) {
                    m13324E(bArr, 1, z);
                } else if (this.f26475n == 4 || m13322G()) {
                    long q = m13314q();
                    if (this.f26466e == 0 && q <= 60) {
                        StringBuilder sb2 = new StringBuilder(88);
                        sb2.append("Offline license has expired or will expire soon. Remaining seconds: ");
                        sb2.append(q);
                        C1230s.m37888b("DefaultDrmSession", sb2.toString());
                        m13324E(bArr, 2, z);
                    } else if (q <= 0) {
                        m13309v(new C8200l0(), 2);
                    } else {
                        this.f26475n = 4;
                        m13316o(C8168f.f26456a);
                    }
                }
            } else if (i != 2) {
                if (i == 3) {
                    C1186a.m38185e(this.f26482u);
                    C1186a.m38185e(this.f26481t);
                    m13324E(this.f26482u, 3, z);
                }
            } else if (this.f26482u == null || m13322G()) {
                m13324E(bArr, 2, z);
            }
        }
    }

    public final long m13314q() {
        if (!C6615i.f20678d.equals(this.f26473l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C1186a.m38185e(C8212p0.m13196b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean m13313r(byte[] bArr) {
        return Arrays.equals(this.f26481t, bArr);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean m13312s() {
        int i = this.f26475n;
        return i == 3 || i == 4;
    }

    public final void m13309v(final Exception exc, int i) {
        this.f26480s = new AbstractC8208o.C8209a(exc, C8160c0.m13339a(exc, i));
        C1230s.m37886d("DefaultDrmSession", "DRM session error", exc);
        m13316o(new AbstractC1202h() {
            @Override
            public final void mo13333a(Object obj) {
                ((AbstractC8219w.C8220a) obj).m13177l(exc);
            }
        });
        if (this.f26475n != 4) {
            this.f26475n = 1;
        }
    }

    public final void m13308w(Object obj, Object obj2) {
        if (obj == this.f26483v && m13312s()) {
            this.f26483v = null;
            if (obj2 instanceof Exception) {
                m13307x((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f26466e == 3) {
                    this.f26463b.mo13242j((byte[]) C1216l0.m37968j(this.f26482u), bArr);
                    m13316o(C8166e.f26454a);
                    return;
                }
                byte[] j = this.f26463b.mo13242j(this.f26481t, bArr);
                int i = this.f26466e;
                if (!((i != 2 && (i != 0 || this.f26482u == null)) || j == null || j.length == 0)) {
                    this.f26482u = j;
                }
                this.f26475n = 4;
                m13316o(C8164d.f26453a);
            } catch (Exception e) {
                m13307x(e, true);
            }
        }
    }

    public final void m13307x(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.f26464c.mo13262a(this);
        } else {
            m13309v(exc, z ? 1 : 2);
        }
    }

    public final void m13306y() {
        if (this.f26466e == 0 && this.f26475n == 4) {
            C1216l0.m37968j(this.f26481t);
            m13315p(false);
        }
    }

    public void m13305z(int i) {
        if (i == 2) {
            m13306y();
        }
    }
}
