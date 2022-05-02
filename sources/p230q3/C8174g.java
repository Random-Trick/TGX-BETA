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
    public final List<C8201m.C8203b> f26465a;
    public final AbstractC8169f0 f26466b;
    public final AbstractC8175a f26467c;
    public final AbstractC8176b f26468d;
    public final int f26469e;
    public final boolean f26470f;
    public final boolean f26471g;
    public final HashMap<String, String> f26472h;
    public final C1204i<AbstractC8219w.C8220a> f26473i;
    public final AbstractC0118b0 f26474j;
    public final AbstractC8205m0 f26475k;
    public final UUID f26476l;
    public final HandlerC8179e f26477m;
    public int f26478n;
    public int f26479o;
    public HandlerThread f26480p;
    public HandlerC8177c f26481q;
    public CryptoConfig f26482r;
    public AbstractC8208o.C8209a f26483s;
    public byte[] f26484t;
    public byte[] f26485u;
    public AbstractC8169f0.C8170a f26486v;
    public AbstractC8169f0.C8173d f26487w;

    public interface AbstractC8175a {
        void mo13261a(C8174g gVar);

        void mo13260b(Exception exc, boolean z);

        void mo13259c();
    }

    public interface AbstractC8176b {
        void mo13257a(C8174g gVar, int i);

        void mo13256b(C8174g gVar, int i);
    }

    @SuppressLint({"HandlerLeak"})
    public class HandlerC8177c extends Handler {
        public boolean f26488a;

        public HandlerC8177c(Looper looper) {
            super(looper);
        }

        public final boolean m13303a(Message message, C8207n0 n0Var) {
            IOException iOException;
            C8178d dVar = (C8178d) message.obj;
            if (!dVar.f26491b) {
                return false;
            }
            int i = dVar.f26494e + 1;
            dVar.f26494e = i;
            if (i > C8174g.this.f26474j.mo42141c(3)) {
                return false;
            }
            C7205l lVar = new C7205l(dVar.f26490a, n0Var.f26570a, n0Var.f26571b, n0Var.f26572c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f26492c, n0Var.f26569M);
            C7221p pVar = new C7221p(3);
            if (n0Var.getCause() instanceof IOException) {
                iOException = (IOException) n0Var.getCause();
            } else {
                iOException = new C8180f(n0Var.getCause());
            }
            long b = C8174g.this.f26474j.mo42142b(new AbstractC0118b0.C0119a(lVar, pVar, iOException, dVar.f26494e));
            if (b == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f26488a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), b);
                return true;
            }
        }

        public void m13302b(int i, Object obj, boolean z) {
            obtainMessage(i, new C8178d(C7205l.m17353a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void m13301c() {
            removeCallbacksAndMessages(null);
            this.f26488a = true;
        }

        @Override
        public void handleMessage(Message message) {
            byte[] bArr;
            C8178d dVar = (C8178d) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    C8174g gVar = C8174g.this;
                    bArr = gVar.f26475k.mo13208b(gVar.f26476l, (AbstractC8169f0.C8173d) dVar.f26493d);
                } else if (i == 1) {
                    C8174g gVar2 = C8174g.this;
                    bArr = gVar2.f26475k.mo13209a(gVar2.f26476l, (AbstractC8169f0.C8170a) dVar.f26493d);
                } else {
                    throw new RuntimeException();
                }
            } catch (C8207n0 e) {
                boolean a = m13303a(message, e);
                bArr = e;
                if (a) {
                    return;
                }
            } catch (Exception e2) {
                C1230s.m37883j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                bArr = e2;
            }
            C8174g.this.f26474j.mo42143a(dVar.f26490a);
            synchronized (this) {
                if (!this.f26488a) {
                    C8174g.this.f26477m.obtainMessage(message.what, Pair.create(dVar.f26493d, bArr)).sendToTarget();
                }
            }
        }
    }

    public static final class C8178d {
        public final long f26490a;
        public final boolean f26491b;
        public final long f26492c;
        public final Object f26493d;
        public int f26494e;

        public C8178d(long j, boolean z, long j2, Object obj) {
            this.f26490a = j;
            this.f26491b = z;
            this.f26492c = j2;
            this.f26493d = obj;
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
                C8174g.this.m13325C(obj, obj2);
            } else if (i == 1) {
                C8174g.this.m13307w(obj, obj2);
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
            C1186a.m38188e(bArr);
        }
        this.f26476l = uuid;
        this.f26467c = aVar;
        this.f26468d = bVar;
        this.f26466b = f0Var;
        this.f26469e = i;
        this.f26470f = z;
        this.f26471g = z2;
        if (bArr != null) {
            this.f26485u = bArr;
            this.f26465a = null;
        } else {
            this.f26465a = Collections.unmodifiableList((List) C1186a.m38188e(list));
        }
        this.f26472h = hashMap;
        this.f26475k = m0Var;
        this.f26473i = new C1204i<>();
        this.f26474j = b0Var;
        this.f26478n = 2;
        this.f26477m = new HandlerC8179e(looper);
    }

    public void m13327A() {
        if (m13324D()) {
            m13314p(true);
        }
    }

    public void m13326B(Exception exc, boolean z) {
        m13308v(exc, z ? 1 : 3);
    }

    public final void m13325C(Object obj, Object obj2) {
        if (obj != this.f26487w) {
            return;
        }
        if (this.f26478n == 2 || m13311s()) {
            this.f26487w = null;
            if (obj2 instanceof Exception) {
                this.f26467c.mo13260b((Exception) obj2, false);
                return;
            }
            try {
                this.f26466b.mo13240k((byte[]) obj2);
                this.f26467c.mo13259c();
            } catch (Exception e) {
                this.f26467c.mo13260b(e, true);
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean m13324D() {
        if (m13311s()) {
            return true;
        }
        try {
            byte[] f = this.f26466b.mo13245f();
            this.f26484t = f;
            this.f26482r = this.f26466b.mo13246e(f);
            this.f26478n = 3;
            m13315o(new AbstractC1202h() {
                @Override
                public final void mo13332a(Object obj) {
                    ((AbstractC8219w.C8220a) obj).m13177k(r1);
                }
            });
            C1186a.m38188e(this.f26484t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f26467c.mo13261a(this);
            return false;
        } catch (Exception e) {
            m13308v(e, 1);
            return false;
        }
    }

    public final void m13323E(byte[] bArr, int i, boolean z) {
        try {
            this.f26486v = this.f26466b.mo13239l(bArr, this.f26465a, i, this.f26472h);
            ((HandlerC8177c) C1216l0.m37971j(this.f26481q)).m13302b(1, C1186a.m38188e(this.f26486v), z);
        } catch (Exception e) {
            m13306x(e, true);
        }
    }

    public void m13322F() {
        this.f26487w = this.f26466b.mo13247d();
        ((HandlerC8177c) C1216l0.m37971j(this.f26481q)).m13302b(0, C1186a.m38188e(this.f26487w), true);
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    public final boolean m13321G() {
        try {
            this.f26466b.mo13243h(this.f26484t, this.f26485u);
            return true;
        } catch (Exception e) {
            m13308v(e, 1);
            return false;
        }
    }

    @Override
    public void mo13206a(AbstractC8219w.C8220a aVar) {
        int i = this.f26479o;
        if (i <= 0) {
            C1230s.m37890c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f26479o = i2;
        if (i2 == 0) {
            this.f26478n = 0;
            ((HandlerC8179e) C1216l0.m37971j(this.f26477m)).removeCallbacksAndMessages(null);
            ((HandlerC8177c) C1216l0.m37971j(this.f26481q)).m13301c();
            this.f26481q = null;
            ((HandlerThread) C1216l0.m37971j(this.f26480p)).quit();
            this.f26480p = null;
            this.f26482r = null;
            this.f26483s = null;
            this.f26486v = null;
            this.f26487w = null;
            byte[] bArr = this.f26484t;
            if (bArr != null) {
                this.f26466b.mo13242i(bArr);
                this.f26484t = null;
            }
        }
        if (aVar != null) {
            this.f26473i.m38057m(aVar);
            if (this.f26473i.m38058i(aVar) == 0) {
                aVar.m13175m();
            }
        }
        this.f26468d.mo13257a(this, this.f26479o);
    }

    @Override
    public final UUID mo13205b() {
        return this.f26476l;
    }

    @Override
    public boolean mo13204c() {
        return this.f26470f;
    }

    @Override
    public Map<String, String> mo13203d() {
        byte[] bArr = this.f26484t;
        if (bArr == null) {
            return null;
        }
        return this.f26466b.mo13248c(bArr);
    }

    @Override
    public void mo13202e(AbstractC8219w.C8220a aVar) {
        int i = this.f26479o;
        boolean z = false;
        if (i < 0) {
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Session reference count less than zero: ");
            sb2.append(i);
            C1230s.m37890c("DefaultDrmSession", sb2.toString());
            this.f26479o = 0;
        }
        if (aVar != null) {
            this.f26473i.m38059h(aVar);
        }
        int i2 = this.f26479o + 1;
        this.f26479o = i2;
        if (i2 == 1) {
            if (this.f26478n == 2) {
                z = true;
            }
            C1186a.m38187f(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f26480p = handlerThread;
            handlerThread.start();
            this.f26481q = new HandlerC8177c(this.f26480p.getLooper());
            if (m13324D()) {
                m13314p(true);
            }
        } else if (aVar != null && m13311s() && this.f26473i.m38058i(aVar) == 1) {
            aVar.m13177k(this.f26478n);
        }
        this.f26468d.mo13256b(this, this.f26479o);
    }

    @Override
    public boolean mo13201f(String str) {
        return this.f26466b.mo13244g((byte[]) C1186a.m38185h(this.f26484t), str);
    }

    @Override
    public final AbstractC8208o.C8209a mo13200g() {
        if (this.f26478n == 1) {
            return this.f26483s;
        }
        return null;
    }

    @Override
    public final CryptoConfig mo13199h() {
        return this.f26482r;
    }

    @Override
    public final int mo13198i() {
        return this.f26478n;
    }

    public final void m13315o(AbstractC1202h<AbstractC8219w.C8220a> hVar) {
        for (AbstractC8219w.C8220a aVar : this.f26473i.m38060e()) {
            hVar.mo13332a(aVar);
        }
    }

    @RequiresNonNull({"sessionId"})
    public final void m13314p(boolean z) {
        if (!this.f26471g) {
            byte[] bArr = (byte[]) C1216l0.m37971j(this.f26484t);
            int i = this.f26469e;
            if (i == 0 || i == 1) {
                if (this.f26485u == null) {
                    m13323E(bArr, 1, z);
                } else if (this.f26478n == 4 || m13321G()) {
                    long q = m13313q();
                    if (this.f26469e == 0 && q <= 60) {
                        StringBuilder sb2 = new StringBuilder(88);
                        sb2.append("Offline license has expired or will expire soon. Remaining seconds: ");
                        sb2.append(q);
                        C1230s.m37891b("DefaultDrmSession", sb2.toString());
                        m13323E(bArr, 2, z);
                    } else if (q <= 0) {
                        m13308v(new C8200l0(), 2);
                    } else {
                        this.f26478n = 4;
                        m13315o(C8168f.f26459a);
                    }
                }
            } else if (i != 2) {
                if (i == 3) {
                    C1186a.m38188e(this.f26485u);
                    C1186a.m38188e(this.f26484t);
                    m13323E(this.f26485u, 3, z);
                }
            } else if (this.f26485u == null || m13321G()) {
                m13323E(bArr, 2, z);
            }
        }
    }

    public final long m13313q() {
        if (!C6615i.f20678d.equals(this.f26476l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C1186a.m38188e(C8212p0.m13195b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean m13312r(byte[] bArr) {
        return Arrays.equals(this.f26484t, bArr);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean m13311s() {
        int i = this.f26478n;
        return i == 3 || i == 4;
    }

    public final void m13308v(final Exception exc, int i) {
        this.f26483s = new AbstractC8208o.C8209a(exc, C8160c0.m13338a(exc, i));
        C1230s.m37889d("DefaultDrmSession", "DRM session error", exc);
        m13315o(new AbstractC1202h() {
            @Override
            public final void mo13332a(Object obj) {
                ((AbstractC8219w.C8220a) obj).m13176l(exc);
            }
        });
        if (this.f26478n != 4) {
            this.f26478n = 1;
        }
    }

    public final void m13307w(Object obj, Object obj2) {
        if (obj == this.f26486v && m13311s()) {
            this.f26486v = null;
            if (obj2 instanceof Exception) {
                m13306x((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f26469e == 3) {
                    this.f26466b.mo13241j((byte[]) C1216l0.m37971j(this.f26485u), bArr);
                    m13315o(C8166e.f26457a);
                    return;
                }
                byte[] j = this.f26466b.mo13241j(this.f26484t, bArr);
                int i = this.f26469e;
                if (!((i != 2 && (i != 0 || this.f26485u == null)) || j == null || j.length == 0)) {
                    this.f26485u = j;
                }
                this.f26478n = 4;
                m13315o(C8164d.f26456a);
            } catch (Exception e) {
                m13306x(e, true);
            }
        }
    }

    public final void m13306x(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.f26467c.mo13261a(this);
        } else {
            m13308v(exc, z ? 1 : 2);
        }
    }

    public final void m13305y() {
        if (this.f26469e == 0 && this.f26478n == 4) {
            C1216l0.m37971j(this.f26484t);
            m13314p(false);
        }
    }

    public void m13304z(int i) {
        if (i == 2) {
            m13305y();
        }
    }
}
