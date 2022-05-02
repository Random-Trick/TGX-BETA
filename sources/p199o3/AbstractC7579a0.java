package p199o3;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer;
import org.thunderdog.challegram.Log;
import p020b5.AbstractC1232u;
import p020b5.C1186a;
import p020b5.C1210j0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1234w;
import p174m3.AbstractC6593f;
import p174m3.C6600g1;
import p174m3.C6612h1;
import p174m3.C6613h2;
import p174m3.C6701t2;
import p199o3.AbstractC7634s;
import p199o3.AbstractC7636t;
import p216p3.AbstractC8023d;
import p216p3.C8024e;
import p216p3.C8025f;
import p216p3.C8026g;
import p216p3.C8028h;
import p230q3.AbstractC8208o;
import p230q3.C8206n;

public abstract class AbstractC7579a0<T extends AbstractC8023d<C8026g, ? extends SimpleDecoderOutputBuffer, ? extends C8025f>> extends AbstractC6593f implements AbstractC1232u {
    public final AbstractC7634s.C7635a f24204V;
    public final AbstractC7636t f24205W;
    public final C8026g f24206X;
    public C8024e f24207Y;
    public C6600g1 f24208Z;
    public int f24209a0;
    public int f24210b0;
    public boolean f24211c0;
    public T f24212d0;
    public C8026g f24213e0;
    public SimpleDecoderOutputBuffer f24214f0;
    public AbstractC8208o f24215g0;
    public AbstractC8208o f24216h0;
    public int f24217i0;
    public boolean f24218j0;
    public boolean f24219k0;
    public long f24220l0;
    public boolean f24221m0;
    public boolean f24222n0;
    public boolean f24223o0;
    public boolean f24224p0;

    public final class C7581b implements AbstractC7636t.AbstractC7639c {
        public C7581b() {
        }

        @Override
        public void mo15361a(boolean z) {
            AbstractC7579a0.this.f24204V.m15412C(z);
        }

        @Override
        public void mo15360b(long j) {
            AbstractC7579a0.this.f24204V.m15413B(j);
        }

        @Override
        public void mo15359c(int i, long j, long j2) {
            AbstractC7579a0.this.f24204V.m15411D(i, j, j2);
        }

        @Override
        public void mo15358d(long j) {
            C7642u.m15353b(this, j);
        }

        @Override
        public void mo15357e() {
            AbstractC7579a0.this.m15639b0();
        }

        @Override
        public void mo15356f(Exception exc) {
            C1230s.m37889d("DecoderAudioRenderer", "Audio sink error", exc);
            AbstractC7579a0.this.f24204V.m15399l(exc);
        }

        @Override
        public void mo15355g() {
            C7642u.m15354a(this);
        }
    }

    public AbstractC7579a0() {
        this((Handler) null, (AbstractC7634s) null, new AbstractC7611g[0]);
    }

    @Override
    public AbstractC1232u mo15519A() {
        return this;
    }

    @Override
    public void mo13718I() {
        this.f24208Z = null;
        this.f24219k0 = true;
        try {
            m15634g0(null);
            m15636e0();
            this.f24205W.mo15382c();
        } finally {
            this.f24204V.m15396o(this.f24207Y);
        }
    }

    @Override
    public void mo15518J(boolean z, boolean z2) {
        C8024e eVar = new C8024e();
        this.f24207Y = eVar;
        this.f24204V.m15395p(eVar);
        if (m19923D().f21050a) {
            this.f24205W.mo15366s();
        } else {
            this.f24205W.mo15370o();
        }
    }

    @Override
    public void mo13717K(long j, boolean z) {
        if (this.f24211c0) {
            this.f24205W.mo15363v();
        } else {
            this.f24205W.flush();
        }
        this.f24220l0 = j;
        this.f24221m0 = true;
        this.f24222n0 = true;
        this.f24223o0 = false;
        this.f24224p0 = false;
        if (this.f24212d0 != null) {
            m15643W();
        }
    }

    @Override
    public void mo15513M() {
        this.f24205W.mo15378g();
    }

    @Override
    public void mo15511N() {
        m15632j0();
        this.f24205W.mo15383b();
    }

    public C8028h m15646S(String str, C6600g1 g1Var, C6600g1 g1Var2) {
        return new C8028h(str, g1Var, g1Var2, 0, 1);
    }

    public abstract T mo12678T(C6600g1 g1Var, CryptoConfig cryptoConfig);

    public final boolean m15645U() {
        if (this.f24214f0 == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.f24212d0.mo13072d();
            this.f24214f0 = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i = simpleDecoderOutputBuffer.skippedOutputBufferCount;
            if (i > 0) {
                this.f24207Y.f26122f += i;
                this.f24205W.mo15369p();
            }
        }
        if (this.f24214f0.isEndOfStream()) {
            if (this.f24217i0 == 2) {
                m15636e0();
                m15641Z();
                this.f24219k0 = true;
            } else {
                this.f24214f0.release();
                this.f24214f0 = null;
                try {
                    m15637d0();
                } catch (AbstractC7636t.C7641e e) {
                    throw m19924C(e, e.f24470c, e.f24469b, 5002);
                }
            }
            return false;
        }
        if (this.f24219k0) {
            this.f24205W.mo15364u(mo12677X(this.f24212d0).m19902b().m19881N(this.f24209a0).m19880O(this.f24210b0).m19890E(), 0, null);
            this.f24219k0 = false;
        }
        AbstractC7636t tVar = this.f24205W;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.f24214f0;
        if (!tVar.mo15365t(simpleDecoderOutputBuffer2.data, simpleDecoderOutputBuffer2.timeUs, 1)) {
            return false;
        }
        this.f24207Y.f26121e++;
        this.f24214f0.release();
        this.f24214f0 = null;
        return true;
    }

    public final boolean m15644V() {
        T t = this.f24212d0;
        if (t == null || this.f24217i0 == 2 || this.f24223o0) {
            return false;
        }
        if (this.f24213e0 == null) {
            C8026g gVar = (C8026g) t.mo13071e();
            this.f24213e0 = gVar;
            if (gVar == null) {
                return false;
            }
        }
        if (this.f24217i0 == 1) {
            this.f24213e0.setFlags(4);
            this.f24212d0.mo13070f(this.f24213e0);
            this.f24213e0 = null;
            this.f24217i0 = 2;
            return false;
        }
        C6612h1 E = m19922E();
        int P = m19918P(E, this.f24213e0, 0);
        if (P == -5) {
            m15640a0(E);
            return true;
        } else if (P != -4) {
            if (P == -3) {
                return false;
            }
            throw new IllegalStateException();
        } else if (this.f24213e0.isEndOfStream()) {
            this.f24223o0 = true;
            this.f24212d0.mo13070f(this.f24213e0);
            this.f24213e0 = null;
            return false;
        } else {
            this.f24213e0.m13777g();
            C8026g gVar2 = this.f24213e0;
            gVar2.f26133a = this.f24208Z;
            m15638c0(gVar2);
            this.f24212d0.mo13070f(this.f24213e0);
            this.f24218j0 = true;
            this.f24207Y.f26119c++;
            this.f24213e0 = null;
            return true;
        }
    }

    public final void m15643W() {
        if (this.f24217i0 != 0) {
            m15636e0();
            m15641Z();
            return;
        }
        this.f24213e0 = null;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f24214f0;
        if (simpleDecoderOutputBuffer != null) {
            simpleDecoderOutputBuffer.release();
            this.f24214f0 = null;
        }
        this.f24212d0.flush();
        this.f24218j0 = false;
    }

    public abstract C6600g1 mo12677X(T t);

    public final int m15642Y(C6600g1 g1Var) {
        return this.f24205W.mo15374k(g1Var);
    }

    public final void m15641Z() {
        if (this.f24212d0 == null) {
            m15635f0(this.f24216h0);
            CryptoConfig cryptoConfig = null;
            AbstractC8208o oVar = this.f24215g0;
            if (oVar == null || (cryptoConfig = oVar.mo13199h()) != null || this.f24215g0.mo13200g() != null) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C1210j0.m38038a("createAudioDecoder");
                    this.f24212d0 = mo12678T(this.f24208Z, cryptoConfig);
                    C1210j0.m38036c();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    this.f24204V.m15398m(this.f24212d0.mo13105b(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    this.f24207Y.f26117a++;
                } catch (OutOfMemoryError e) {
                    throw m19925B(e, this.f24208Z, 4001);
                } catch (C8025f e2) {
                    C1230s.m37889d("DecoderAudioRenderer", "Audio codec error", e2);
                    this.f24204V.m15400k(e2);
                    throw m19925B(e2, this.f24208Z, 4001);
                }
            }
        }
    }

    @Override
    public final int mo11838a(C6600g1 g1Var) {
        int i = 0;
        if (!C1234w.m37864j(g1Var.f20575U)) {
            return C6701t2.m19438a(0);
        }
        int i0 = mo12676i0(g1Var);
        if (i0 <= 2) {
            return C6701t2.m19438a(i0);
        }
        if (C1216l0.f4526a >= 21) {
            i = 32;
        }
        return C6701t2.m19437b(i0, 8, i);
    }

    public final void m15640a0(C6612h1 h1Var) {
        C8028h hVar;
        C6600g1 g1Var = (C6600g1) C1186a.m38188e(h1Var.f20668b);
        m15634g0(h1Var.f20667a);
        C6600g1 g1Var2 = this.f24208Z;
        this.f24208Z = g1Var;
        this.f24209a0 = g1Var.f20594k0;
        this.f24210b0 = g1Var.f20595l0;
        T t = this.f24212d0;
        if (t == null) {
            m15641Z();
            this.f24204V.m15394q(this.f24208Z, null);
            return;
        }
        if (this.f24216h0 != this.f24215g0) {
            hVar = new C8028h(t.mo13105b(), g1Var2, g1Var, 0, Log.TAG_YOUTUBE);
        } else {
            hVar = m15646S(t.mo13105b(), g1Var2, g1Var);
        }
        if (hVar.f26141d == 0) {
            if (this.f24218j0) {
                this.f24217i0 = 1;
            } else {
                m15636e0();
                m15641Z();
                this.f24219k0 = true;
            }
        }
        this.f24204V.m15394q(this.f24208Z, hVar);
    }

    public void m15639b0() {
        this.f24222n0 = true;
    }

    public void m15638c0(C8026g gVar) {
        if (this.f24221m0 && !gVar.isDecodeOnly()) {
            if (Math.abs(gVar.f26129N - this.f24220l0) > 500000) {
                this.f24220l0 = gVar.f26129N;
            }
            this.f24221m0 = false;
        }
    }

    @Override
    public void mo15504d(C6613h2 h2Var) {
        this.f24205W.mo15381d(h2Var);
    }

    public final void m15637d0() {
        this.f24224p0 = true;
        this.f24205W.mo15377h();
    }

    @Override
    public boolean mo13705e() {
        return this.f24224p0 && this.f24205W.mo15380e();
    }

    public final void m15636e0() {
        this.f24213e0 = null;
        this.f24214f0 = null;
        this.f24217i0 = 0;
        this.f24218j0 = false;
        T t = this.f24212d0;
        if (t != null) {
            this.f24207Y.f26118b++;
            t.mo13074a();
            this.f24204V.m15397n(this.f24212d0.mo13105b());
            this.f24212d0 = null;
        }
        m15635f0(null);
    }

    @Override
    public boolean mo13704f() {
        return this.f24205W.mo15376i() || (this.f24208Z != null && (m19919H() || this.f24214f0 != null));
    }

    public final void m15635f0(AbstractC8208o oVar) {
        C8206n.m13207a(this.f24215g0, oVar);
        this.f24215g0 = oVar;
    }

    @Override
    public long mo15503g() {
        if (mo19480i() == 2) {
            m15632j0();
        }
        return this.f24220l0;
    }

    public final void m15634g0(AbstractC8208o oVar) {
        C8206n.m13207a(this.f24216h0, oVar);
        this.f24216h0 = oVar;
    }

    public final boolean m15633h0(C6600g1 g1Var) {
        return this.f24205W.mo15384a(g1Var);
    }

    public abstract int mo12676i0(C6600g1 g1Var);

    @Override
    public C6613h2 mo15501j() {
        return this.f24205W.mo15375j();
    }

    public final void m15632j0() {
        long n = this.f24205W.mo15371n(mo13705e());
        if (n != Long.MIN_VALUE) {
            if (!this.f24222n0) {
                n = Math.max(this.f24220l0, n);
            }
            this.f24220l0 = n;
            this.f24222n0 = false;
        }
    }

    @Override
    public void mo13703t(long j, long j2) {
        if (this.f24224p0) {
            try {
                this.f24205W.mo15377h();
            } catch (AbstractC7636t.C7641e e) {
                throw m19924C(e, e.f24470c, e.f24469b, 5002);
            }
        } else {
            if (this.f24208Z == null) {
                C6612h1 E = m19922E();
                this.f24206X.clear();
                int P = m19918P(E, this.f24206X, 2);
                if (P == -5) {
                    m15640a0(E);
                } else if (P == -4) {
                    C1186a.m38187f(this.f24206X.isEndOfStream());
                    this.f24223o0 = true;
                    try {
                        m15637d0();
                        return;
                    } catch (AbstractC7636t.C7641e e2) {
                        throw m19925B(e2, null, 5002);
                    }
                } else {
                    return;
                }
            }
            m15641Z();
            if (this.f24212d0 != null) {
                try {
                    C1210j0.m38038a("drainAndFeed");
                    while (m15645U()) {
                    }
                    while (m15644V()) {
                    }
                    C1210j0.m38036c();
                    this.f24207Y.m13780c();
                } catch (AbstractC7636t.C7637a e3) {
                    throw m19925B(e3, e3.f24462a, 5001);
                } catch (AbstractC7636t.C7638b e4) {
                    throw m19924C(e4, e4.f24465c, e4.f24464b, 5001);
                } catch (AbstractC7636t.C7641e e5) {
                    throw m19924C(e5, e5.f24470c, e5.f24469b, 5002);
                } catch (C8025f e6) {
                    C1230s.m37889d("DecoderAudioRenderer", "Audio codec error", e6);
                    this.f24204V.m15400k(e6);
                    throw m19925B(e6, this.f24208Z, 4003);
                }
            }
        }
    }

    @Override
    public void mo15492u(int i, Object obj) {
        if (i == 2) {
            this.f24205W.mo15379f(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f24205W.mo15368q((C7602e) obj);
        } else if (i == 6) {
            this.f24205W.mo15367r((C7647x) obj);
        } else if (i == 9) {
            this.f24205W.mo15362w(((Boolean) obj).booleanValue());
        } else if (i != 10) {
            super.mo15492u(i, obj);
        } else {
            this.f24205W.mo15372m(((Integer) obj).intValue());
        }
    }

    public AbstractC7579a0(Handler handler, AbstractC7634s sVar, AbstractC7611g... gVarArr) {
        this(handler, sVar, null, gVarArr);
    }

    public AbstractC7579a0(Handler handler, AbstractC7634s sVar, C7606f fVar, AbstractC7611g... gVarArr) {
        this(handler, sVar, new C7585b0(fVar, gVarArr));
    }

    public AbstractC7579a0(Handler handler, AbstractC7634s sVar, AbstractC7636t tVar) {
        super(1);
        this.f24204V = new AbstractC7634s.C7635a(handler, sVar);
        this.f24205W = tVar;
        tVar.mo15373l(new C7581b());
        this.f24206X = C8026g.m13775i();
        this.f24217i0 = 0;
        this.f24219k0 = true;
    }
}
