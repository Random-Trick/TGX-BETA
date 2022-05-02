package p032c5;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1203h0;
import p020b5.C1210j0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p032c5.AbstractC1642z;
import p174m3.AbstractC6593f;
import p174m3.C6600g1;
import p174m3.C6612h1;
import p216p3.AbstractC8023d;
import p216p3.C8024e;
import p216p3.C8025f;
import p216p3.C8026g;
import p216p3.C8028h;
import p230q3.AbstractC8208o;
import p230q3.C8206n;

public abstract class AbstractC1609d extends AbstractC6593f {
    public int f5895A0;
    public long f5896B0;
    public long f5897C0;
    public C8024e f5898D0;
    public final long f5899V;
    public final int f5900W;
    public final AbstractC1642z.C1643a f5901X;
    public C6600g1 f5904a0;
    public C6600g1 f5905b0;
    public AbstractC8023d<C8026g, ? extends VideoDecoderOutputBuffer, ? extends C8025f> f5906c0;
    public C8026g f5907d0;
    public VideoDecoderOutputBuffer f5908e0;
    public Object f5910g0;
    public Surface f5911h0;
    public AbstractC1621k f5912i0;
    public AbstractC1622l f5913j0;
    public AbstractC8208o f5914k0;
    public AbstractC8208o f5915l0;
    public boolean f5917n0;
    public boolean f5918o0;
    public boolean f5919p0;
    public boolean f5920q0;
    public long f5921r0;
    public boolean f5923t0;
    public boolean f5924u0;
    public boolean f5925v0;
    public C1607b0 f5926w0;
    public long f5927x0;
    public int f5928y0;
    public int f5929z0;
    public long f5922s0 = -9223372036854775807L;
    public final C1203h0<C6600g1> f5902Y = new C1203h0<>();
    public final C8026g f5903Z = C8026g.m13775i();
    public int f5916m0 = 0;
    public int f5909f0 = -1;

    public AbstractC1609d(long j, Handler handler, AbstractC1642z zVar, int i) {
        super(2);
        this.f5899V = j;
        this.f5900W = i;
        m36283T();
        this.f5901X = new AbstractC1642z.C1643a(handler, zVar);
    }

    public static boolean m36277a0(long j) {
        return j < -30000;
    }

    public static boolean m36276b0(long j) {
        return j < -500000;
    }

    public boolean m36287A0(long j, long j2) {
        return m36277a0(j) && j2 > 100000;
    }

    public void m36286B0(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.f5898D0.f26122f++;
        videoDecoderOutputBuffer.release();
    }

    public void m36285C0(int i) {
        C8024e eVar = this.f5898D0;
        eVar.f26123g += i;
        this.f5928y0 += i;
        int i2 = this.f5929z0 + i;
        this.f5929z0 = i2;
        eVar.f26124h = Math.max(i2, eVar.f26124h);
        int i3 = this.f5900W;
        if (i3 > 0 && this.f5928y0 >= i3) {
            m36273e0();
        }
    }

    @Override
    public void mo13718I() {
        this.f5904a0 = null;
        m36283T();
        m36284S();
        try {
            m36256x0(null);
            m36261q0();
        } finally {
            this.f5901X.m36138m(this.f5898D0);
        }
    }

    @Override
    public void mo15518J(boolean z, boolean z2) {
        C8024e eVar = new C8024e();
        this.f5898D0 = eVar;
        this.f5901X.m36136o(eVar);
        this.f5919p0 = z2;
        this.f5920q0 = false;
    }

    @Override
    public void mo13717K(long j, boolean z) {
        this.f5924u0 = false;
        this.f5925v0 = false;
        m36284S();
        this.f5921r0 = -9223372036854775807L;
        this.f5929z0 = 0;
        if (this.f5906c0 != null) {
            m36279Y();
        }
        if (z) {
            m36258v0();
        } else {
            this.f5922s0 = -9223372036854775807L;
        }
        this.f5902Y.m38070c();
    }

    @Override
    public void mo15513M() {
        this.f5928y0 = 0;
        this.f5927x0 = SystemClock.elapsedRealtime();
        this.f5896B0 = SystemClock.elapsedRealtime() * 1000;
    }

    @Override
    public void mo15511N() {
        this.f5922s0 = -9223372036854775807L;
        m36273e0();
    }

    @Override
    public void mo13716O(C6600g1[] g1VarArr, long j, long j2) {
        this.f5897C0 = j2;
        super.mo13716O(g1VarArr, j, j2);
    }

    public C8028h mo11840R(String str, C6600g1 g1Var, C6600g1 g1Var2) {
        return new C8028h(str, g1Var, g1Var2, 0, 1);
    }

    public final void m36284S() {
        this.f5918o0 = false;
    }

    public final void m36283T() {
        this.f5926w0 = null;
    }

    public abstract AbstractC8023d<C8026g, ? extends VideoDecoderOutputBuffer, ? extends C8025f> mo11839U(C6600g1 g1Var, CryptoConfig cryptoConfig);

    public final boolean m36282V(long j, long j2) {
        if (this.f5908e0 == null) {
            VideoDecoderOutputBuffer d = this.f5906c0.mo13072d();
            this.f5908e0 = d;
            if (d == null) {
                return false;
            }
            C8024e eVar = this.f5898D0;
            int i = eVar.f26122f;
            int i2 = d.skippedOutputBufferCount;
            eVar.f26122f = i + i2;
            this.f5895A0 -= i2;
        }
        if (this.f5908e0.isEndOfStream()) {
            if (this.f5916m0 == 2) {
                m36261q0();
                m36274d0();
            } else {
                this.f5908e0.release();
                this.f5908e0 = null;
                this.f5925v0 = true;
            }
            return false;
        }
        boolean p0 = m36262p0(j, j2);
        if (p0) {
            m36264n0(this.f5908e0.timeUs);
            this.f5908e0 = null;
        }
        return p0;
    }

    public void m36281W(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        m36285C0(1);
        videoDecoderOutputBuffer.release();
    }

    public final boolean m36280X() {
        AbstractC8023d<C8026g, ? extends VideoDecoderOutputBuffer, ? extends C8025f> dVar = this.f5906c0;
        if (dVar == null || this.f5916m0 == 2 || this.f5924u0) {
            return false;
        }
        if (this.f5907d0 == null) {
            C8026g e = dVar.mo13071e();
            this.f5907d0 = e;
            if (e == null) {
                return false;
            }
        }
        if (this.f5916m0 == 1) {
            this.f5907d0.setFlags(4);
            this.f5906c0.mo13070f(this.f5907d0);
            this.f5907d0 = null;
            this.f5916m0 = 2;
            return false;
        }
        C6612h1 E = m19922E();
        int P = m19918P(E, this.f5907d0, 0);
        if (P == -5) {
            m36268j0(E);
            return true;
        } else if (P != -4) {
            if (P == -3) {
                return false;
            }
            throw new IllegalStateException();
        } else if (this.f5907d0.isEndOfStream()) {
            this.f5924u0 = true;
            this.f5906c0.mo13070f(this.f5907d0);
            this.f5907d0 = null;
            return false;
        } else {
            if (this.f5923t0) {
                this.f5902Y.m38072a(this.f5907d0.f26129N, this.f5904a0);
                this.f5923t0 = false;
            }
            this.f5907d0.m13777g();
            C8026g gVar = this.f5907d0;
            gVar.f26133a = this.f5904a0;
            m36263o0(gVar);
            this.f5906c0.mo13070f(this.f5907d0);
            this.f5895A0++;
            this.f5917n0 = true;
            this.f5898D0.f26119c++;
            this.f5907d0 = null;
            return true;
        }
    }

    public void m36279Y() {
        this.f5895A0 = 0;
        if (this.f5916m0 != 0) {
            m36261q0();
            m36274d0();
            return;
        }
        this.f5907d0 = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f5908e0;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.f5908e0 = null;
        }
        this.f5906c0.flush();
        this.f5917n0 = false;
    }

    public final boolean m36278Z() {
        return this.f5909f0 != -1;
    }

    public boolean m36275c0(long j) {
        int Q = m19917Q(j);
        if (Q == 0) {
            return false;
        }
        this.f5898D0.f26125i++;
        m36285C0(this.f5895A0 + Q);
        m36279Y();
        return true;
    }

    public final void m36274d0() {
        if (this.f5906c0 == null) {
            m36259t0(this.f5915l0);
            CryptoConfig cryptoConfig = null;
            AbstractC8208o oVar = this.f5914k0;
            if (oVar == null || (cryptoConfig = oVar.mo13199h()) != null || this.f5914k0.mo13200g() != null) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.f5906c0 = mo11839U(this.f5904a0, cryptoConfig);
                    mo11835u0(this.f5909f0);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    this.f5901X.m36140k(this.f5906c0.mo13105b(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    this.f5898D0.f26117a++;
                } catch (OutOfMemoryError e) {
                    throw m19925B(e, this.f5904a0, 4001);
                } catch (C8025f e2) {
                    C1230s.m37889d("DecoderVideoRenderer", "Video codec error", e2);
                    this.f5901X.m36152C(e2);
                    throw m19925B(e2, this.f5904a0, 4001);
                }
            }
        }
    }

    @Override
    public boolean mo13705e() {
        return this.f5925v0;
    }

    public final void m36273e0() {
        if (this.f5928y0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f5901X.m36137n(this.f5928y0, elapsedRealtime - this.f5927x0);
            this.f5928y0 = 0;
            this.f5927x0 = elapsedRealtime;
        }
    }

    @Override
    public boolean mo13704f() {
        if (this.f5904a0 != null && ((m19919H() || this.f5908e0 != null) && (this.f5918o0 || !m36278Z()))) {
            this.f5922s0 = -9223372036854775807L;
            return true;
        } else if (this.f5922s0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f5922s0) {
                return true;
            }
            this.f5922s0 = -9223372036854775807L;
            return false;
        }
    }

    public final void m36272f0() {
        this.f5920q0 = true;
        if (!this.f5918o0) {
            this.f5918o0 = true;
            this.f5901X.m36154A(this.f5910g0);
        }
    }

    public final void m36271g0(int i, int i2) {
        C1607b0 b0Var = this.f5926w0;
        if (b0Var == null || b0Var.f5886a != i || b0Var.f5887b != i2) {
            C1607b0 b0Var2 = new C1607b0(i, i2);
            this.f5926w0 = b0Var2;
            this.f5901X.m36151D(b0Var2);
        }
    }

    public final void m36270h0() {
        if (this.f5918o0) {
            this.f5901X.m36154A(this.f5910g0);
        }
    }

    public final void m36269i0() {
        C1607b0 b0Var = this.f5926w0;
        if (b0Var != null) {
            this.f5901X.m36151D(b0Var);
        }
    }

    public void m36268j0(C6612h1 h1Var) {
        C8028h hVar;
        this.f5923t0 = true;
        C6600g1 g1Var = (C6600g1) C1186a.m38188e(h1Var.f20668b);
        m36256x0(h1Var.f20667a);
        C6600g1 g1Var2 = this.f5904a0;
        this.f5904a0 = g1Var;
        AbstractC8023d<C8026g, ? extends VideoDecoderOutputBuffer, ? extends C8025f> dVar = this.f5906c0;
        if (dVar == null) {
            m36274d0();
            this.f5901X.m36135p(this.f5904a0, null);
            return;
        }
        if (this.f5915l0 != this.f5914k0) {
            hVar = new C8028h(dVar.mo13105b(), g1Var2, g1Var, 0, Log.TAG_YOUTUBE);
        } else {
            hVar = mo11840R(dVar.mo13105b(), g1Var2, g1Var);
        }
        if (hVar.f26141d == 0) {
            if (this.f5917n0) {
                this.f5916m0 = 1;
            } else {
                m36261q0();
                m36274d0();
            }
        }
        this.f5901X.m36135p(this.f5904a0, hVar);
    }

    public final void m36267k0() {
        m36269i0();
        m36284S();
        if (mo19480i() == 2) {
            m36258v0();
        }
    }

    public final void m36266l0() {
        m36283T();
        m36284S();
    }

    public final void m36265m0() {
        m36269i0();
        m36270h0();
    }

    public void m36264n0(long j) {
        this.f5895A0--;
    }

    public void m36263o0(C8026g gVar) {
    }

    public final boolean m36262p0(long j, long j2) {
        if (this.f5921r0 == -9223372036854775807L) {
            this.f5921r0 = j;
        }
        long j3 = this.f5908e0.timeUs - j;
        if (m36278Z()) {
            long j4 = this.f5908e0.timeUs - this.f5897C0;
            C6600g1 j5 = this.f5902Y.m38063j(j4);
            if (j5 != null) {
                this.f5905b0 = j5;
            }
            long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.f5896B0;
            boolean z = mo19480i() == 2;
            if ((this.f5920q0 ? !this.f5918o0 : !(!z && !this.f5919p0)) || (z && m36287A0(j3, elapsedRealtime))) {
                m36260r0(this.f5908e0, j4, this.f5905b0);
                return true;
            } else if (!z || j == this.f5921r0 || (m36255y0(j3, j2) && m36275c0(j))) {
                return false;
            } else {
                if (m36254z0(j3, j2)) {
                    m36281W(this.f5908e0);
                    return true;
                }
                if (j3 < 30000) {
                    m36260r0(this.f5908e0, j4, this.f5905b0);
                    return true;
                }
                return false;
            }
        } else if (!m36277a0(j3)) {
            return false;
        } else {
            m36286B0(this.f5908e0);
            return true;
        }
    }

    public void m36261q0() {
        this.f5907d0 = null;
        this.f5908e0 = null;
        this.f5916m0 = 0;
        this.f5917n0 = false;
        this.f5895A0 = 0;
        AbstractC8023d<C8026g, ? extends VideoDecoderOutputBuffer, ? extends C8025f> dVar = this.f5906c0;
        if (dVar != null) {
            this.f5898D0.f26118b++;
            dVar.mo13074a();
            this.f5901X.m36139l(this.f5906c0.mo13105b());
            this.f5906c0 = null;
        }
        m36259t0(null);
    }

    public void m36260r0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j, C6600g1 g1Var) {
        AbstractC1622l lVar = this.f5913j0;
        if (lVar != null) {
            lVar.mo19322g(j, System.nanoTime(), g1Var, null);
        }
        this.f5896B0 = C1216l0.m37956q0(SystemClock.elapsedRealtime() * 1000);
        int i = videoDecoderOutputBuffer.mode;
        boolean z = i == 1 && this.f5911h0 != null;
        boolean z2 = i == 0 && this.f5912i0 != null;
        if (z2 || z) {
            m36271g0(videoDecoderOutputBuffer.width, videoDecoderOutputBuffer.height);
            if (z2) {
                this.f5912i0.setOutputBuffer(videoDecoderOutputBuffer);
            } else {
                mo11836s0(videoDecoderOutputBuffer, this.f5911h0);
            }
            this.f5929z0 = 0;
            this.f5898D0.f26121e++;
            m36272f0();
            return;
        }
        m36281W(videoDecoderOutputBuffer);
    }

    public abstract void mo11836s0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    @Override
    public void mo13703t(long j, long j2) {
        if (!this.f5925v0) {
            if (this.f5904a0 == null) {
                C6612h1 E = m19922E();
                this.f5903Z.clear();
                int P = m19918P(E, this.f5903Z, 2);
                if (P == -5) {
                    m36268j0(E);
                } else if (P == -4) {
                    C1186a.m38187f(this.f5903Z.isEndOfStream());
                    this.f5924u0 = true;
                    this.f5925v0 = true;
                    return;
                } else {
                    return;
                }
            }
            m36274d0();
            if (this.f5906c0 != null) {
                try {
                    C1210j0.m38038a("drainAndFeed");
                    while (m36282V(j, j2)) {
                    }
                    while (m36280X()) {
                    }
                    C1210j0.m38036c();
                    this.f5898D0.m13780c();
                } catch (C8025f e) {
                    C1230s.m37889d("DecoderVideoRenderer", "Video codec error", e);
                    this.f5901X.m36152C(e);
                    throw m19925B(e, this.f5904a0, 4003);
                }
            }
        }
    }

    public final void m36259t0(AbstractC8208o oVar) {
        C8206n.m13207a(this.f5914k0, oVar);
        this.f5914k0 = oVar;
    }

    @Override
    public void mo15492u(int i, Object obj) {
        if (i == 1) {
            m36257w0(obj);
        } else if (i == 7) {
            this.f5913j0 = (AbstractC1622l) obj;
        } else {
            super.mo15492u(i, obj);
        }
    }

    public abstract void mo11835u0(int i);

    public final void m36258v0() {
        this.f5922s0 = this.f5899V > 0 ? SystemClock.elapsedRealtime() + this.f5899V : -9223372036854775807L;
    }

    public final void m36257w0(Object obj) {
        if (obj instanceof Surface) {
            this.f5911h0 = (Surface) obj;
            this.f5912i0 = null;
            this.f5909f0 = 1;
        } else if (obj instanceof AbstractC1621k) {
            this.f5911h0 = null;
            this.f5912i0 = (AbstractC1621k) obj;
            this.f5909f0 = 0;
        } else {
            this.f5911h0 = null;
            this.f5912i0 = null;
            this.f5909f0 = -1;
            obj = null;
        }
        if (this.f5910g0 != obj) {
            this.f5910g0 = obj;
            if (obj != null) {
                if (this.f5906c0 != null) {
                    mo11835u0(this.f5909f0);
                }
                m36267k0();
                return;
            }
            m36266l0();
        } else if (obj != null) {
            m36265m0();
        }
    }

    public final void m36256x0(AbstractC8208o oVar) {
        C8206n.m13207a(this.f5915l0, oVar);
        this.f5915l0 = oVar;
    }

    public boolean m36255y0(long j, long j2) {
        return m36276b0(j);
    }

    public boolean m36254z0(long j, long j2) {
        return m36277a0(j);
    }
}
