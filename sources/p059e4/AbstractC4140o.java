package p059e4;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p020b5.C1186a;
import p020b5.C1203h0;
import p020b5.C1210j0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1237x;
import p059e4.AbstractC4134l;
import p059e4.C4148v;
import p174m3.AbstractC6593f;
import p174m3.C6600g1;
import p174m3.C6612h1;
import p174m3.C6615i;
import p174m3.C6681q;
import p216p3.C8024e;
import p216p3.C8026g;
import p216p3.C8028h;
import p230q3.AbstractC8208o;
import p230q3.C8181g0;
import p230q3.C8206n;

public abstract class AbstractC4140o extends AbstractC6593f {
    public static final byte[] f13963n1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean f13965B0;
    public boolean f13966C0;
    public boolean f13967D0;
    public boolean f13968E0;
    public boolean f13969F0;
    public boolean f13970G0;
    public boolean f13971H0;
    public boolean f13972I0;
    public boolean f13973J0;
    public boolean f13974K0;
    public C4131i f13975L0;
    public ByteBuffer f13979P0;
    public boolean f13980Q0;
    public boolean f13981R0;
    public boolean f13982S0;
    public boolean f13983T0;
    public boolean f13984U0;
    public final AbstractC4134l.AbstractC4136b f13985V;
    public boolean f13986V0;
    public final AbstractC4143q f13987W;
    public final boolean f13989X;
    public final float f13991Y;
    public boolean f13994Z0;
    public boolean f13996a1;
    public boolean f13998b1;
    public final C4130h f13999c0;
    public boolean f14004e1;
    public boolean f14006f1;
    public boolean f14008g1;
    public boolean f14010h1;
    public C6681q f14012i1;
    public C6600g1 f14013j0;
    public C8024e f14014j1;
    public C6600g1 f14015k0;
    public AbstractC8208o f14017l0;
    public AbstractC8208o f14019m0;
    public int f14020m1;
    public MediaCrypto f14021n0;
    public boolean f14022o0;
    public AbstractC4134l f14026s0;
    public C6600g1 f14027t0;
    public MediaFormat f14028u0;
    public boolean f14029v0;
    public ArrayDeque<C4139n> f14031x0;
    public C4141a f14032y0;
    public C4139n f14033z0;
    public final C8026g f13993Z = C8026g.m13776i();
    public final C8026g f13995a0 = new C8026g(0);
    public final C8026g f13997b0 = new C8026g(2);
    public final C1203h0<C6600g1> f14001d0 = new C1203h0<>();
    public final ArrayList<Long> f14003e0 = new ArrayList<>();
    public final MediaCodec.BufferInfo f14005f0 = new MediaCodec.BufferInfo();
    public float f14024q0 = 1.0f;
    public float f14025r0 = 1.0f;
    public long f14023p0 = -9223372036854775807L;
    public final long[] f14007g0 = new long[10];
    public final long[] f14009h0 = new long[10];
    public final long[] f14011i0 = new long[10];
    public long f14016k1 = -9223372036854775807L;
    public long f14018l1 = -9223372036854775807L;
    public float f14030w0 = -1.0f;
    public int f13964A0 = 0;
    public int f13988W0 = 0;
    public int f13977N0 = -1;
    public int f13978O0 = -1;
    public long f13976M0 = -9223372036854775807L;
    public long f14000c1 = -9223372036854775807L;
    public long f14002d1 = -9223372036854775807L;
    public int f13990X0 = 0;
    public int f13992Y0 = 0;

    public AbstractC4140o(int i, AbstractC4134l.AbstractC4136b bVar, AbstractC4143q qVar, boolean z, float f) {
        super(i);
        this.f13985V = bVar;
        this.f13987W = (AbstractC4143q) C1186a.m38185e(qVar);
        this.f13989X = z;
        this.f13991Y = f;
        C4130h hVar = new C4130h();
        this.f13999c0 = hVar;
        hVar.m13779f(0);
        hVar.f26132c.order(ByteOrder.nativeOrder());
    }

    public static boolean m28777E0(IllegalStateException illegalStateException) {
        if (C1216l0.f4526a >= 21 && m28776F0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public static boolean m28776F0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean m28775G0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    @TargetApi(23)
    private void m28770R0() {
        int i = this.f13992Y0;
        if (i == 1) {
            m28736l0();
        } else if (i == 2) {
            m28736l0();
            m28733m1();
        } else if (i != 3) {
            this.f14006f1 = true;
            mo15505X0();
        } else {
            m28764V0();
        }
    }

    public static boolean m28765V(String str, C6600g1 g1Var) {
        return C1216l0.f4526a < 21 && g1Var.f20577W.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean m28763W(String str) {
        if (C1216l0.f4526a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(C1216l0.f4528c)) {
            String str2 = C1216l0.f4527b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean m28761X(String str) {
        int i = C1216l0.f4526a;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i <= 19) {
                String str2 = C1216l0.f4527b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean m28760Y(String str) {
        return C1216l0.f4526a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean m28758Z(C4139n nVar) {
        String str = nVar.f13952a;
        int i = C1216l0.f4526a;
        return (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(C1216l0.f4528c) && "AFTS".equals(C1216l0.f4529d) && nVar.f13958g));
    }

    public static boolean m28756a0(String str) {
        int i = C1216l0.f4526a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && C1216l0.f4529d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public static boolean m28754b0(String str, C6600g1 g1Var) {
        return C1216l0.f4526a <= 18 && g1Var.f20591h0 == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public static boolean m28752c0(String str) {
        return C1216l0.f4526a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void m28745f1(AbstractC8208o oVar) {
        C8206n.m13208a(this.f14019m0, oVar);
        this.f14019m0 = oVar;
    }

    private boolean m28738k0() {
        AbstractC4134l lVar = this.f14026s0;
        if (lVar == null || this.f13990X0 == 2 || this.f14004e1) {
            return false;
        }
        if (this.f13977N0 < 0) {
            int f = lVar.mo28661f();
            this.f13977N0 = f;
            if (f < 0) {
                return false;
            }
            this.f13995a0.f26132c = this.f14026s0.mo28656k(f);
            this.f13995a0.clear();
        }
        if (this.f13990X0 == 1) {
            if (!this.f13974K0) {
                this.f13996a1 = true;
                this.f14026s0.mo28654m(this.f13977N0, 0, 0, 0L, 4);
                m28755a1();
            }
            this.f13990X0 = 2;
            return false;
        } else if (this.f13972I0) {
            this.f13972I0 = false;
            ByteBuffer byteBuffer = this.f13995a0.f26132c;
            byte[] bArr = f13963n1;
            byteBuffer.put(bArr);
            this.f14026s0.mo28654m(this.f13977N0, 0, bArr.length, 0L, 0);
            m28755a1();
            this.f13994Z0 = true;
            return true;
        } else {
            if (this.f13988W0 == 1) {
                for (int i = 0; i < this.f14027t0.f20577W.size(); i++) {
                    this.f13995a0.f26132c.put(this.f14027t0.f20577W.get(i));
                }
                this.f13988W0 = 2;
            }
            int position = this.f13995a0.f26132c.position();
            C6612h1 E = m19921E();
            try {
                int P = m19917P(E, this.f13995a0, 0);
                if (mo19477m()) {
                    this.f14002d1 = this.f14000c1;
                }
                if (P == -3) {
                    return false;
                }
                if (P == -5) {
                    if (this.f13988W0 == 2) {
                        this.f13995a0.clear();
                        this.f13988W0 = 1;
                    }
                    mo15512M0(E);
                    return true;
                } else if (this.f13995a0.isEndOfStream()) {
                    if (this.f13988W0 == 2) {
                        this.f13995a0.clear();
                        this.f13988W0 = 1;
                    }
                    this.f14004e1 = true;
                    if (!this.f13994Z0) {
                        m28770R0();
                        return false;
                    }
                    try {
                        if (!this.f13974K0) {
                            this.f13996a1 = true;
                            this.f14026s0.mo28654m(this.f13977N0, 0, 0, 0L, 4);
                            m28755a1();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw m19924B(e, this.f14013j0, C1216l0.m37999N(e.getErrorCode()));
                    }
                } else if (this.f13994Z0 || this.f13995a0.isKeyFrame()) {
                    boolean h = this.f13995a0.m13777h();
                    if (h) {
                        this.f13995a0.f26131b.m13787b(position);
                    }
                    if (this.f13965B0 && !h) {
                        C1237x.m37854b(this.f13995a0.f26132c);
                        if (this.f13995a0.f26132c.position() == 0) {
                            return true;
                        }
                        this.f13965B0 = false;
                    }
                    C8026g gVar = this.f13995a0;
                    long j = gVar.f26126N;
                    C4131i iVar = this.f13975L0;
                    if (iVar != null) {
                        j = iVar.m28818d(this.f14013j0, gVar);
                        this.f14000c1 = Math.max(this.f14000c1, this.f13975L0.m28820b(this.f14013j0));
                    }
                    long j2 = j;
                    if (this.f13995a0.isDecodeOnly()) {
                        this.f14003e0.add(Long.valueOf(j2));
                    }
                    if (this.f14008g1) {
                        this.f14001d0.m38069a(j2, this.f14013j0);
                        this.f14008g1 = false;
                    }
                    this.f14000c1 = Math.max(this.f14000c1, j2);
                    this.f13995a0.m13778g();
                    if (this.f13995a0.hasSupplementalData()) {
                        mo28722z0(this.f13995a0);
                    }
                    mo15508Q0(this.f13995a0);
                    try {
                        if (h) {
                            this.f14026s0.mo28657j(this.f13977N0, 0, this.f13995a0.f26131b, j2, 0);
                        } else {
                            this.f14026s0.mo28654m(this.f13977N0, 0, this.f13995a0.f26132c.limit(), j2, 0);
                        }
                        m28755a1();
                        this.f13994Z0 = true;
                        this.f13988W0 = 0;
                        this.f14014j1.f26116c++;
                        return true;
                    } catch (MediaCodec.CryptoException e2) {
                        throw m19924B(e2, this.f14013j0, C1216l0.m37999N(e2.getErrorCode()));
                    }
                } else {
                    this.f13995a0.clear();
                    if (this.f13988W0 == 2) {
                        this.f13988W0 = 1;
                    }
                    return true;
                }
            } catch (C8026g.C8027a e3) {
                mo15517J0(e3);
                m28766U0(0);
                m28736l0();
                return true;
            }
        }
    }

    public static boolean m28737k1(C6600g1 g1Var) {
        int i = g1Var.f20597n0;
        return i == 0 || i == 2;
    }

    public final boolean m28781A0() {
        return this.f13978O0 >= 0;
    }

    public final void m28780B0(C6600g1 g1Var) {
        m28748e0();
        String str = g1Var.f20575U;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f13999c0.m28822q(32);
        } else {
            this.f13999c0.m28822q(1);
        }
        this.f13982S0 = true;
    }

    public final void m28779C0(C4139n nVar, MediaCrypto mediaCrypto) {
        String str = nVar.f13952a;
        float f = -1.0f;
        float s0 = C1216l0.f4526a < 23 ? -1.0f : mo15495s0(this.f14025r0, this.f14013j0, m19919G());
        if (s0 > this.f13991Y) {
            f = s0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String valueOf = String.valueOf(str);
        C1210j0.m38035a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
        this.f14026s0 = this.f13985V.mo28647a(mo15488w0(nVar, this.f14013j0, mediaCrypto, f));
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.f14033z0 = nVar;
        this.f14030w0 = f;
        this.f14027t0 = this.f14013j0;
        this.f13964A0 = m28767U(str);
        this.f13965B0 = m28765V(str, this.f14027t0);
        this.f13966C0 = m28756a0(str);
        this.f13967D0 = m28752c0(str);
        this.f13968E0 = m28761X(str);
        this.f13969F0 = m28760Y(str);
        this.f13970G0 = m28763W(str);
        this.f13971H0 = m28754b0(str, this.f14027t0);
        boolean z = false;
        this.f13974K0 = m28758Z(nVar) || mo28727r0();
        if (this.f14026s0.mo28665b()) {
            this.f13986V0 = true;
            this.f13988W0 = 1;
            if (this.f13964A0 != 0) {
                z = true;
            }
            this.f13972I0 = z;
        }
        if ("c2.android.mp3.decoder".equals(nVar.f13952a)) {
            this.f13975L0 = new C4131i();
        }
        if (mo19479i() == 2) {
            this.f13976M0 = SystemClock.elapsedRealtime() + 1000;
        }
        this.f14014j1.f26114a++;
        mo15516K0(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
    }

    public final boolean m28778D0(long j) {
        int size = this.f14003e0.size();
        for (int i = 0; i < size; i++) {
            if (this.f14003e0.get(i).longValue() == j) {
                this.f14003e0.remove(i);
                return true;
            }
        }
        return false;
    }

    public final void m28774H0() {
        C6600g1 g1Var;
        if (this.f14026s0 == null && !this.f13982S0 && (g1Var = this.f14013j0) != null) {
            if (this.f14019m0 != null || !mo15502i1(g1Var)) {
                m28751c1(this.f14019m0);
                String str = this.f14013j0.f20575U;
                AbstractC8208o oVar = this.f14017l0;
                if (oVar != null) {
                    if (this.f14021n0 == null) {
                        C8181g0 v0 = m28725v0(oVar);
                        if (v0 != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(v0.f26494a, v0.f26495b);
                                this.f14021n0 = mediaCrypto;
                                this.f14022o0 = !v0.f26496c && mediaCrypto.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e) {
                                throw m19924B(e, this.f14013j0, 6006);
                            }
                        } else if (this.f14017l0.mo13201g() == null) {
                            return;
                        }
                    }
                    if (C8181g0.f26493d) {
                        int i = this.f14017l0.mo13199i();
                        if (i == 1) {
                            AbstractC8208o.C8209a aVar = (AbstractC8208o.C8209a) C1186a.m38185e(this.f14017l0.mo13201g());
                            throw m19924B(aVar, this.f14013j0, aVar.f26570a);
                        } else if (i != 4) {
                            return;
                        }
                    }
                }
                try {
                    m28773I0(this.f14021n0, this.f14022o0);
                } catch (C4141a e2) {
                    throw m19924B(e2, this.f14013j0, 4001);
                }
            } else {
                m28780B0(this.f14013j0);
            }
        }
    }

    @Override
    public void mo13719I() {
        this.f14013j0 = null;
        this.f14016k1 = -9223372036854775807L;
        this.f14018l1 = -9223372036854775807L;
        this.f14020m1 = 0;
        m28732n0();
    }

    public final void m28773I0(MediaCrypto mediaCrypto, boolean z) {
        if (this.f14031x0 == null) {
            try {
                List<C4139n> o0 = m28730o0(z);
                ArrayDeque<C4139n> arrayDeque = new ArrayDeque<>();
                this.f14031x0 = arrayDeque;
                if (this.f13989X) {
                    arrayDeque.addAll(o0);
                } else if (!o0.isEmpty()) {
                    this.f14031x0.add(o0.get(0));
                }
                this.f14032y0 = null;
            } catch (C4148v.C4151c e) {
                throw new C4141a(this.f14013j0, e, z, -49998);
            }
        }
        if (!this.f14031x0.isEmpty()) {
            while (this.f14026s0 == null) {
                C4139n peekFirst = this.f14031x0.peekFirst();
                if (mo28741h1(peekFirst)) {
                    try {
                        m28779C0(peekFirst, mediaCrypto);
                    } catch (Exception e2) {
                        String valueOf = String.valueOf(peekFirst);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 30);
                        sb2.append("Failed to initialize decoder: ");
                        sb2.append(valueOf);
                        C1230s.m37880j("MediaCodecRenderer", sb2.toString(), e2);
                        this.f14031x0.removeFirst();
                        C4141a aVar = new C4141a(this.f14013j0, e2, z, peekFirst);
                        mo15517J0(aVar);
                        if (this.f14032y0 == null) {
                            this.f14032y0 = aVar;
                        } else {
                            this.f14032y0 = this.f14032y0.m28719c(aVar);
                        }
                        if (this.f14031x0.isEmpty()) {
                            throw this.f14032y0;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f14031x0 = null;
            return;
        }
        throw new C4141a(this.f14013j0, (Throwable) null, z, -49999);
    }

    @Override
    public void mo15518J(boolean z, boolean z2) {
        this.f14014j1 = new C8024e();
    }

    public abstract void mo15517J0(Exception exc);

    @Override
    public void mo13718K(long j, boolean z) {
        this.f14004e1 = false;
        this.f14006f1 = false;
        this.f14010h1 = false;
        if (this.f13982S0) {
            this.f13999c0.clear();
            this.f13997b0.clear();
            this.f13983T0 = false;
        } else {
            m28734m0();
        }
        if (this.f14001d0.m38058l() > 0) {
            this.f14008g1 = true;
        }
        this.f14001d0.m38067c();
        int i = this.f14020m1;
        if (i != 0) {
            this.f14018l1 = this.f14009h0[i - 1];
            this.f14016k1 = this.f14007g0[i - 1];
            this.f14020m1 = 0;
        }
    }

    public abstract void mo15516K0(String str, long j, long j2);

    @Override
    public void mo15515L() {
        try {
            m28748e0();
            m28762W0();
        } finally {
            m28745f1(null);
        }
    }

    public abstract void mo15514L0(String str);

    @Override
    public void mo15513M() {
    }

    public p216p3.C8028h mo15512M0(p174m3.C6612h1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: p059e4.AbstractC4140o.mo15512M0(m3.h1):p3.h");
    }

    @Override
    public void mo15511N() {
    }

    public abstract void mo15510N0(C6600g1 g1Var, MediaFormat mediaFormat);

    @Override
    public void mo13717O(C6600g1[] g1VarArr, long j, long j2) {
        boolean z = true;
        if (this.f14018l1 == -9223372036854775807L) {
            if (this.f14016k1 != -9223372036854775807L) {
                z = false;
            }
            C1186a.m38184f(z);
            this.f14016k1 = j;
            this.f14018l1 = j2;
            return;
        }
        int i = this.f14020m1;
        long[] jArr = this.f14009h0;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Too many stream changes, so dropping offset: ");
            sb2.append(j3);
            C1230s.m37881i("MediaCodecRenderer", sb2.toString());
        } else {
            this.f14020m1 = i + 1;
        }
        long[] jArr2 = this.f14007g0;
        int i2 = this.f14020m1;
        jArr2[i2 - 1] = j;
        this.f14009h0[i2 - 1] = j2;
        this.f14011i0[i2 - 1] = this.f14000c1;
    }

    public void mo28772O0(long j) {
        while (true) {
            int i = this.f14020m1;
            if (i != 0 && j >= this.f14011i0[0]) {
                long[] jArr = this.f14007g0;
                this.f14016k1 = jArr[0];
                this.f14018l1 = this.f14009h0[0];
                int i2 = i - 1;
                this.f14020m1 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f14009h0;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f14020m1);
                long[] jArr3 = this.f14011i0;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f14020m1);
                mo15509P0();
            } else {
                return;
            }
        }
    }

    public void mo15509P0() {
    }

    public abstract void mo15508Q0(C8026g gVar);

    public final void m28771R() {
        C1186a.m38184f(!this.f14004e1);
        C6612h1 E = m19921E();
        this.f13997b0.clear();
        do {
            this.f13997b0.clear();
            int P = m19917P(E, this.f13997b0, 0);
            if (P == -5) {
                mo15512M0(E);
                return;
            } else if (P != -4) {
                if (P != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f13997b0.isEndOfStream()) {
                this.f14004e1 = true;
                return;
            } else {
                if (this.f14008g1) {
                    C6600g1 g1Var = (C6600g1) C1186a.m38185e(this.f14013j0);
                    this.f14015k0 = g1Var;
                    mo15510N0(g1Var, null);
                    this.f14008g1 = false;
                }
                this.f13997b0.m13778g();
            }
        } while (this.f13999c0.m28828k(this.f13997b0));
        this.f13983T0 = true;
    }

    public final boolean m28769S(long j, long j2) {
        C1186a.m38184f(!this.f14006f1);
        if (this.f13999c0.m28823p()) {
            C4130h hVar = this.f13999c0;
            if (!mo15507S0(j, j2, null, hVar.f26132c, this.f13978O0, 0, hVar.m28824o(), this.f13999c0.m28826m(), this.f13999c0.isDecodeOnly(), this.f13999c0.isEndOfStream(), this.f14015k0)) {
                return false;
            }
            mo28772O0(this.f13999c0.m28825n());
            this.f13999c0.clear();
        }
        if (this.f14004e1) {
            this.f14006f1 = true;
            return false;
        }
        if (this.f13983T0) {
            C1186a.m38184f(this.f13999c0.m28828k(this.f13997b0));
            this.f13983T0 = false;
        }
        if (this.f13984U0) {
            if (this.f13999c0.m28823p()) {
                return true;
            }
            m28748e0();
            this.f13984U0 = false;
            m28774H0();
            if (!this.f13982S0) {
                return false;
            }
        }
        m28771R();
        if (this.f13999c0.m28823p()) {
            this.f13999c0.m13778g();
        }
        return this.f13999c0.m28823p() || this.f14004e1 || this.f13984U0;
    }

    public abstract boolean mo15507S0(long j, long j2, AbstractC4134l lVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6600g1 g1Var);

    public abstract C8028h mo15506T(C4139n nVar, C6600g1 g1Var, C6600g1 g1Var2);

    public final void m28768T0() {
        this.f13998b1 = true;
        MediaFormat c = this.f14026s0.mo28664c();
        if (this.f13964A0 != 0 && c.getInteger("width") == 32 && c.getInteger("height") == 32) {
            this.f13973J0 = true;
            return;
        }
        if (this.f13971H0) {
            c.setInteger("channel-count", 1);
        }
        this.f14028u0 = c;
        this.f14029v0 = true;
    }

    public final int m28767U(String str) {
        int i = C1216l0.f4526a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = C1216l0.f4529d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = C1216l0.f4527b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public final boolean m28766U0(int i) {
        C6612h1 E = m19921E();
        this.f13993Z.clear();
        int P = m19917P(E, this.f13993Z, i | 4);
        if (P == -5) {
            mo15512M0(E);
            return true;
        } else if (P != -4 || !this.f13993Z.isEndOfStream()) {
            return false;
        } else {
            this.f14004e1 = true;
            m28770R0();
            return false;
        }
    }

    public final void m28764V0() {
        m28762W0();
        m28774H0();
    }

    public void m28762W0() {
        try {
            AbstractC4134l lVar = this.f14026s0;
            if (lVar != null) {
                lVar.mo28666a();
                this.f14014j1.f26115b++;
                mo15514L0(this.f14033z0.f13952a);
            }
            this.f14026s0 = null;
            try {
                MediaCrypto mediaCrypto = this.f14021n0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f14026s0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f14021n0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void mo15505X0() {
    }

    public void mo28759Y0() {
        m28755a1();
        m28753b1();
        this.f13976M0 = -9223372036854775807L;
        this.f13996a1 = false;
        this.f13994Z0 = false;
        this.f13972I0 = false;
        this.f13973J0 = false;
        this.f13980Q0 = false;
        this.f13981R0 = false;
        this.f14003e0.clear();
        this.f14000c1 = -9223372036854775807L;
        this.f14002d1 = -9223372036854775807L;
        C4131i iVar = this.f13975L0;
        if (iVar != null) {
            iVar.m28819c();
        }
        this.f13990X0 = 0;
        this.f13992Y0 = 0;
        this.f13988W0 = this.f13986V0 ? 1 : 0;
    }

    public void m28757Z0() {
        mo28759Y0();
        this.f14012i1 = null;
        this.f13975L0 = null;
        this.f14031x0 = null;
        this.f14033z0 = null;
        this.f14027t0 = null;
        this.f14028u0 = null;
        this.f14029v0 = false;
        this.f13998b1 = false;
        this.f14030w0 = -1.0f;
        this.f13964A0 = 0;
        this.f13965B0 = false;
        this.f13966C0 = false;
        this.f13967D0 = false;
        this.f13968E0 = false;
        this.f13969F0 = false;
        this.f13970G0 = false;
        this.f13971H0 = false;
        this.f13974K0 = false;
        this.f13986V0 = false;
        this.f13988W0 = 0;
        this.f14022o0 = false;
    }

    @Override
    public final int mo11839a(C6600g1 g1Var) {
        try {
            return mo15500j1(this.f13987W, g1Var);
        } catch (C4148v.C4151c e) {
            throw m19924B(e, g1Var, 4002);
        }
    }

    public final void m28755a1() {
        this.f13977N0 = -1;
        this.f13995a0.f26132c = null;
    }

    public final void m28753b1() {
        this.f13978O0 = -1;
        this.f13979P0 = null;
    }

    public final void m28751c1(AbstractC8208o oVar) {
        C8206n.m13208a(this.f14017l0, oVar);
        this.f14017l0 = oVar;
    }

    public C4138m mo28750d0(Throwable th, C4139n nVar) {
        return new C4138m(th, nVar);
    }

    public final void m28749d1() {
        this.f14010h1 = true;
    }

    @Override
    public boolean mo13706e() {
        return this.f14006f1;
    }

    public final void m28748e0() {
        this.f13984U0 = false;
        this.f13999c0.clear();
        this.f13997b0.clear();
        this.f13983T0 = false;
        this.f13982S0 = false;
    }

    public final void m28747e1(C6681q qVar) {
        this.f14012i1 = qVar;
    }

    @Override
    public boolean mo13705f() {
        return this.f14013j0 != null && (m19918H() || m28781A0() || (this.f13976M0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f13976M0));
    }

    public final boolean m28746f0() {
        if (this.f13994Z0) {
            this.f13990X0 = 1;
            if (this.f13966C0 || this.f13968E0) {
                this.f13992Y0 = 3;
                return false;
            }
            this.f13992Y0 = 1;
        }
        return true;
    }

    public final void m28744g0() {
        if (this.f13994Z0) {
            this.f13990X0 = 1;
            this.f13992Y0 = 3;
            return;
        }
        m28764V0();
    }

    public final boolean m28743g1(long j) {
        return this.f14023p0 == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f14023p0;
    }

    @TargetApi(23)
    public final boolean m28742h0() {
        if (this.f13994Z0) {
            this.f13990X0 = 1;
            if (this.f13966C0 || this.f13968E0) {
                this.f13992Y0 = 3;
                return false;
            }
            this.f13992Y0 = 2;
        } else {
            m28733m1();
        }
        return true;
    }

    public boolean mo28741h1(C4139n nVar) {
        return true;
    }

    public final boolean m28740i0(long j, long j2) {
        boolean z;
        boolean z2;
        int i;
        if (!m28781A0()) {
            if (!this.f13969F0 || !this.f13996a1) {
                i = this.f14026s0.mo28660g(this.f14005f0);
            } else {
                try {
                    i = this.f14026s0.mo28660g(this.f14005f0);
                } catch (IllegalStateException unused) {
                    m28770R0();
                    if (this.f14006f1) {
                        m28762W0();
                    }
                    return false;
                }
            }
            if (i < 0) {
                if (i == -2) {
                    m28768T0();
                    return true;
                }
                if (this.f13974K0 && (this.f14004e1 || this.f13990X0 == 2)) {
                    m28770R0();
                }
                return false;
            } else if (this.f13973J0) {
                this.f13973J0 = false;
                this.f14026s0.mo28659h(i, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo = this.f14005f0;
                if (bufferInfo.size != 0 || (bufferInfo.flags & 4) == 0) {
                    this.f13978O0 = i;
                    ByteBuffer n = this.f14026s0.mo28653n(i);
                    this.f13979P0 = n;
                    if (n != null) {
                        n.position(this.f14005f0.offset);
                        ByteBuffer byteBuffer = this.f13979P0;
                        MediaCodec.BufferInfo bufferInfo2 = this.f14005f0;
                        byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                    }
                    if (this.f13970G0) {
                        MediaCodec.BufferInfo bufferInfo3 = this.f14005f0;
                        if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                            long j3 = this.f14000c1;
                            if (j3 != -9223372036854775807L) {
                                bufferInfo3.presentationTimeUs = j3;
                            }
                        }
                    }
                    this.f13980Q0 = m28778D0(this.f14005f0.presentationTimeUs);
                    long j4 = this.f14002d1;
                    long j5 = this.f14005f0.presentationTimeUs;
                    this.f13981R0 = j4 == j5;
                    m28731n1(j5);
                } else {
                    m28770R0();
                    return false;
                }
            }
        }
        if (!this.f13969F0 || !this.f13996a1) {
            z = false;
            AbstractC4134l lVar = this.f14026s0;
            ByteBuffer byteBuffer2 = this.f13979P0;
            int i2 = this.f13978O0;
            MediaCodec.BufferInfo bufferInfo4 = this.f14005f0;
            z2 = mo15507S0(j, j2, lVar, byteBuffer2, i2, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f13980Q0, this.f13981R0, this.f14015k0);
        } else {
            try {
                AbstractC4134l lVar2 = this.f14026s0;
                ByteBuffer byteBuffer3 = this.f13979P0;
                int i3 = this.f13978O0;
                MediaCodec.BufferInfo bufferInfo5 = this.f14005f0;
                z = false;
                try {
                    z2 = mo15507S0(j, j2, lVar2, byteBuffer3, i3, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f13980Q0, this.f13981R0, this.f14015k0);
                } catch (IllegalStateException unused2) {
                    m28770R0();
                    if (this.f14006f1) {
                        m28762W0();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        }
        if (z2) {
            mo28772O0(this.f14005f0.presentationTimeUs);
            boolean z3 = (this.f14005f0.flags & 4) != 0;
            m28753b1();
            if (!z3) {
                return true;
            }
            m28770R0();
        }
        return z;
    }

    public boolean mo15502i1(C6600g1 g1Var) {
        return false;
    }

    public final boolean m28739j0(C4139n nVar, C6600g1 g1Var, AbstractC8208o oVar, AbstractC8208o oVar2) {
        C8181g0 v0;
        if (oVar == oVar2) {
            return false;
        }
        if (oVar2 == null || oVar == null || C1216l0.f4526a < 23) {
            return true;
        }
        UUID uuid = C6615i.f20679e;
        if (uuid.equals(oVar.mo13206b()) || uuid.equals(oVar2.mo13206b()) || (v0 = m28725v0(oVar2)) == null) {
            return true;
        }
        return !nVar.f13958g && (v0.f26496c ? false : oVar2.mo13202f(g1Var.f20575U));
    }

    public abstract int mo15500j1(AbstractC4143q qVar, C6600g1 g1Var);

    public final void m28736l0() {
        try {
            this.f14026s0.flush();
        } finally {
            mo28759Y0();
        }
    }

    public final boolean m28735l1(C6600g1 g1Var) {
        if (!(C1216l0.f4526a < 23 || this.f14026s0 == null || this.f13992Y0 == 3 || mo19479i() == 0)) {
            float s0 = mo15495s0(this.f14025r0, g1Var, m19919G());
            float f = this.f14030w0;
            if (f == s0) {
                return true;
            }
            if (s0 == -1.0f) {
                m28744g0();
                return false;
            } else if (f == -1.0f && s0 <= this.f13991Y) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", s0);
                this.f14026s0.mo28663d(bundle);
                this.f14030w0 = s0;
            }
        }
        return true;
    }

    public final boolean m28734m0() {
        boolean n0 = m28732n0();
        if (n0) {
            m28774H0();
        }
        return n0;
    }

    public final void m28733m1() {
        try {
            this.f14021n0.setMediaDrmSession(m28725v0(this.f14019m0).f26495b);
            m28751c1(this.f14019m0);
            this.f13990X0 = 0;
            this.f13992Y0 = 0;
        } catch (MediaCryptoException e) {
            throw m19924B(e, this.f14013j0, 6006);
        }
    }

    public boolean m28732n0() {
        if (this.f14026s0 == null) {
            return false;
        }
        if (this.f13992Y0 == 3 || this.f13966C0 || ((this.f13967D0 && !this.f13998b1) || (this.f13968E0 && this.f13996a1))) {
            m28762W0();
            return true;
        }
        m28736l0();
        return false;
    }

    public final void m28731n1(long j) {
        boolean z;
        C6600g1 j2 = this.f14001d0.m38060j(j);
        if (j2 == null && this.f14029v0) {
            j2 = this.f14001d0.m38061i();
        }
        if (j2 != null) {
            this.f14015k0 = j2;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f14029v0 && this.f14015k0 != null)) {
            mo15510N0(this.f14015k0, this.f14028u0);
            this.f14029v0 = false;
        }
    }

    public final List<C4139n> m28730o0(boolean z) {
        List<C4139n> u0 = mo15491u0(this.f13987W, this.f14013j0, z);
        if (u0.isEmpty() && z) {
            u0 = mo15491u0(this.f13987W, this.f14013j0, false);
            if (!u0.isEmpty()) {
                String str = this.f14013j0.f20575U;
                String valueOf = String.valueOf(u0);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 99 + valueOf.length());
                sb2.append("Drm session requires secure decoder for ");
                sb2.append(str);
                sb2.append(", but no secure decoder available. Trying to proceed with ");
                sb2.append(valueOf);
                sb2.append(".");
                C1230s.m37881i("MediaCodecRenderer", sb2.toString());
            }
        }
        return u0;
    }

    public final AbstractC4134l m28729p0() {
        return this.f14026s0;
    }

    @Override
    public void mo19473q(float f, float f2) {
        this.f14024q0 = f;
        this.f14025r0 = f2;
        m28735l1(this.f14027t0);
    }

    public final C4139n m28728q0() {
        return this.f14033z0;
    }

    public boolean mo28727r0() {
        return false;
    }

    @Override
    public final int mo19430s() {
        return 8;
    }

    public abstract float mo15495s0(float f, C6600g1 g1Var, C6600g1[] g1VarArr);

    @Override
    public void mo13704t(long j, long j2) {
        boolean z = false;
        if (this.f14010h1) {
            this.f14010h1 = false;
            m28770R0();
        }
        C6681q qVar = this.f14012i1;
        if (qVar == null) {
            try {
                if (this.f14006f1) {
                    mo15505X0();
                } else if (this.f14013j0 != null || m28766U0(2)) {
                    m28774H0();
                    if (this.f13982S0) {
                        C1210j0.m38035a("bypassRender");
                        while (m28769S(j, j2)) {
                        }
                        C1210j0.m38033c();
                    } else if (this.f14026s0 != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        C1210j0.m38035a("drainAndFeed");
                        while (m28740i0(j, j2) && m28743g1(elapsedRealtime)) {
                        }
                        while (m28738k0() && m28743g1(elapsedRealtime)) {
                        }
                        C1210j0.m38033c();
                    } else {
                        this.f14014j1.f26117d += m19916Q(j);
                        m28766U0(1);
                    }
                    this.f14014j1.m13781c();
                }
            } catch (IllegalStateException e) {
                if (m28777E0(e)) {
                    mo15517J0(e);
                    if (C1216l0.f4526a >= 21 && m28775G0(e)) {
                        z = true;
                    }
                    if (z) {
                        m28762W0();
                    }
                    throw m19923C(mo28750d0(e, m28728q0()), this.f14013j0, z, 4003);
                }
                throw e;
            }
        } else {
            this.f14012i1 = null;
            throw qVar;
        }
    }

    public final MediaFormat m28726t0() {
        return this.f14028u0;
    }

    public abstract List<C4139n> mo15491u0(AbstractC4143q qVar, C6600g1 g1Var, boolean z);

    public final C8181g0 m28725v0(AbstractC8208o oVar) {
        CryptoConfig h = oVar.mo13200h();
        if (h == null || (h instanceof C8181g0)) {
            return (C8181g0) h;
        }
        String valueOf = String.valueOf(h);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 43);
        sb2.append("Expecting FrameworkCryptoConfig but found: ");
        sb2.append(valueOf);
        throw m19924B(new IllegalArgumentException(sb2.toString()), this.f14013j0, 6001);
    }

    public abstract AbstractC4134l.C4135a mo15488w0(C4139n nVar, C6600g1 g1Var, MediaCrypto mediaCrypto, float f);

    public final long m28724x0() {
        return this.f14018l1;
    }

    public float m28723y0() {
        return this.f14024q0;
    }

    public void mo28722z0(C8026g gVar) {
    }

    public static class C4141a extends Exception {
        public final String f14034M;
        public final C4141a f14035N;
        public final String f14036a;
        public final boolean f14037b;
        public final C4139n f14038c;

        public C4141a(p174m3.C6600g1 r12, java.lang.Throwable r13, boolean r14, int r15) {
            throw new UnsupportedOperationException("Method not decompiled: p059e4.AbstractC4140o.C4141a.<init>(m3.g1, java.lang.Throwable, boolean, int):void");
        }

        public static String m28720b(int i) {
            String str = i < 0 ? "neg_" : "";
            int abs = Math.abs(i);
            StringBuilder sb2 = new StringBuilder(str.length() + 71);
            sb2.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb2.append(str);
            sb2.append(abs);
            return sb2.toString();
        }

        public static String m28718d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public final C4141a m28719c(C4141a aVar) {
            return new C4141a(getMessage(), getCause(), this.f14036a, this.f14037b, this.f14038c, this.f14034M, aVar);
        }

        public C4141a(p174m3.C6600g1 r9, java.lang.Throwable r10, boolean r11, p059e4.C4139n r12) {
            throw new UnsupportedOperationException("Method not decompiled: p059e4.AbstractC4140o.C4141a.<init>(m3.g1, java.lang.Throwable, boolean, e4.n):void");
        }

        public C4141a(String str, Throwable th, String str2, boolean z, C4139n nVar, String str3, C4141a aVar) {
            super(str, th);
            this.f14036a = str2;
            this.f14037b = z;
            this.f14038c = nVar;
            this.f14034M = str3;
            this.f14035N = aVar;
        }
    }
}
