package o3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import c5.l0;
import c5.u;
import c5.w;
import e4.l;
import e4.n;
import e4.o;
import e4.q;
import e4.v;
import java.nio.ByteBuffer;
import java.util.List;
import m3.b3;
import m3.c3;
import m3.q1;
import m3.r1;
import m3.r2;
import o3.s;
import o3.t;
import org.thunderdog.challegram.Log;
import p3.g;
import p3.h;

public class g0 extends o implements u {
    public b3.a A1;
    public final Context f18787p1;
    public final s.a f18788q1;
    public final t f18789r1;
    public int f18790s1;
    public boolean f18791t1;
    public q1 f18792u1;
    public long f18793v1;
    public boolean f18794w1;
    public boolean f18795x1;
    public boolean f18796y1;
    public boolean f18797z1;

    public final class b implements t.c {
        public b() {
        }

        @Override
        public void a(long j10) {
            g0.this.f18788q1.B(j10);
        }

        @Override
        public void b(boolean z10) {
            g0.this.f18788q1.C(z10);
        }

        @Override
        public void c(Exception exc) {
            c5.s.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            g0.this.f18788q1.l(exc);
        }

        @Override
        public void d(int i10, long j10, long j11) {
            g0.this.f18788q1.D(i10, j10, j11);
        }

        @Override
        public void e(long j10) {
            if (g0.this.A1 != null) {
                g0.this.A1.b(j10);
            }
        }

        @Override
        public void f() {
            g0.this.z1();
        }

        @Override
        public void g() {
            if (g0.this.A1 != null) {
                g0.this.A1.a();
            }
        }
    }

    public g0(Context context, l.b bVar, q qVar, boolean z10, Handler handler, s sVar, t tVar) {
        super(1, bVar, qVar, z10, 44100.0f);
        this.f18787p1 = context.getApplicationContext();
        this.f18789r1 = tVar;
        this.f18788q1 = new s.a(handler, sVar);
        tVar.l(new b());
    }

    public static boolean t1(String str) {
        if (l0.f4841a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(l0.f4843c)) {
            String str2 = l0.f4842b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    public static boolean u1() {
        if (l0.f4841a == 23) {
            String str = l0.f4844d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static List<n> x1(q qVar, q1 q1Var, boolean z10, t tVar) {
        n v10;
        String str = q1Var.U;
        if (str == null) {
            return a7.q.D();
        }
        if (tVar.a(q1Var) && (v10 = v.v()) != null) {
            return a7.q.E(v10);
        }
        List<n> a10 = qVar.a(str, z10, false);
        String m10 = v.m(q1Var);
        if (m10 == null) {
            return a7.q.z(a10);
        }
        return a7.q.x().g(a10).g(qVar.a(m10, z10, false)).h();
    }

    @Override
    public u A() {
        return this;
    }

    public final void A1() {
        long n10 = this.f18789r1.n(e());
        if (n10 != Long.MIN_VALUE) {
            if (!this.f18795x1) {
                n10 = Math.max(this.f18793v1, n10);
            }
            this.f18793v1 = n10;
            this.f18795x1 = false;
        }
    }

    @Override
    public void J() {
        this.f18796y1 = true;
        try {
            this.f18789r1.flush();
            try {
                super.J();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.J();
                throw th;
            } finally {
            }
        }
    }

    @Override
    public void K(boolean z10, boolean z11) {
        super.K(z10, z11);
        this.f18788q1.p(this.f10544k1);
        if (D().f16641a) {
            this.f18789r1.s();
        } else {
            this.f18789r1.o();
        }
        this.f18789r1.t(G());
    }

    @Override
    public void L(long j10, boolean z10) {
        super.L(j10, z10);
        if (this.f18797z1) {
            this.f18789r1.w();
        } else {
            this.f18789r1.flush();
        }
        this.f18793v1 = j10;
        this.f18794w1 = true;
        this.f18795x1 = true;
    }

    @Override
    public void L0(Exception exc) {
        c5.s.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f18788q1.k(exc);
    }

    @Override
    public void M() {
        try {
            super.M();
        } finally {
            if (this.f18796y1) {
                this.f18796y1 = false;
                this.f18789r1.c();
            }
        }
    }

    @Override
    public void M0(String str, l.a aVar, long j10, long j11) {
        this.f18788q1.m(str, j10, j11);
    }

    @Override
    public void N() {
        super.N();
        this.f18789r1.g();
    }

    @Override
    public void N0(String str) {
        this.f18788q1.n(str);
    }

    @Override
    public void O() {
        A1();
        this.f18789r1.b();
        super.O();
    }

    @Override
    public h O0(r1 r1Var) {
        h O0 = super.O0(r1Var);
        this.f18788q1.q(r1Var.f16947b, O0);
        return O0;
    }

    @Override
    public void P0(q1 q1Var, MediaFormat mediaFormat) {
        int i10;
        int i11;
        q1 q1Var2 = this.f18792u1;
        int[] iArr = null;
        if (q1Var2 != null) {
            q1Var = q1Var2;
        } else if (r0() != null) {
            if ("audio/raw".equals(q1Var.U)) {
                i10 = q1Var.f16910j0;
            } else if (l0.f4841a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.containsKey("v-bits-per-sample") ? l0.V(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                i10 = mediaFormat.getInteger("pcm-encoding");
            }
            q1 E = new q1.b().e0("audio/raw").Y(i10).N(q1Var.f16911k0).O(q1Var.f16912l0).H(mediaFormat.getInteger("channel-count")).f0(mediaFormat.getInteger("sample-rate")).E();
            if (this.f18791t1 && E.f16908h0 == 6 && (i11 = q1Var.f16908h0) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < q1Var.f16908h0; i12++) {
                    iArr[i12] = i12;
                }
            }
            q1Var = E;
        }
        try {
            this.f18789r1.v(q1Var, 0, iArr);
        } catch (t.a e10) {
            throw B(e10, e10.f18894a, 5001);
        }
    }

    @Override
    public void R0() {
        super.R0();
        this.f18789r1.p();
    }

    @Override
    public void S0(g gVar) {
        if (this.f18794w1 && !gVar.isDecodeOnly()) {
            if (Math.abs(gVar.N - this.f18793v1) > 500000) {
                this.f18793v1 = gVar.N;
            }
            this.f18794w1 = false;
        }
    }

    @Override
    public boolean U0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, q1 q1Var) {
        c5.a.e(byteBuffer);
        if (this.f18792u1 != null && (i11 & 2) != 0) {
            ((l) c5.a.e(lVar)).h(i10, false);
            return true;
        } else if (z10) {
            if (lVar != null) {
                lVar.h(i10, false);
            }
            this.f10544k1.f20479f += i12;
            this.f18789r1.p();
            return true;
        } else {
            try {
                if (!this.f18789r1.u(byteBuffer, j12, i12)) {
                    return false;
                }
                if (lVar != null) {
                    lVar.h(i10, false);
                }
                this.f10544k1.f20478e += i12;
                return true;
            } catch (t.b e10) {
                throw C(e10, e10.f18897c, e10.f18896b, 5001);
            } catch (t.e e11) {
                throw C(e11, q1Var, e11.f18901b, 5002);
            }
        }
    }

    @Override
    public h V(n nVar, q1 q1Var, q1 q1Var2) {
        h e10 = nVar.e(q1Var, q1Var2);
        int i10 = e10.f20495e;
        if (v1(nVar, q1Var2) > this.f18790s1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new h(nVar.f10511a, q1Var, q1Var2, i11 != 0 ? 0 : e10.f20494d, i11);
    }

    @Override
    public void Z0() {
        try {
            this.f18789r1.h();
        } catch (t.e e10) {
            throw C(e10, e10.f18902c, e10.f18901b, 5002);
        }
    }

    @Override
    public String b() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public void d(r2 r2Var) {
        this.f18789r1.d(r2Var);
    }

    @Override
    public boolean e() {
        return super.e() && this.f18789r1.e();
    }

    @Override
    public boolean f() {
        return this.f18789r1.i() || super.f();
    }

    @Override
    public long g() {
        if (i() == 2) {
            A1();
        }
        return this.f18793v1;
    }

    @Override
    public r2 j() {
        return this.f18789r1.j();
    }

    @Override
    public boolean l1(q1 q1Var) {
        return this.f18789r1.a(q1Var);
    }

    @Override
    public int m1(q qVar, q1 q1Var) {
        boolean z10;
        int i10 = 0;
        if (!w.h(q1Var.U)) {
            return c3.a(0);
        }
        int i11 = l0.f4841a >= 21 ? 32 : 0;
        boolean z11 = true;
        boolean z12 = q1Var.f16914n0 != 0;
        boolean n12 = o.n1(q1Var);
        int i12 = 8;
        int i13 = 4;
        if (n12 && this.f18789r1.a(q1Var) && !(z12 && v.v() == null)) {
            return c3.b(4, 8, i11);
        }
        if ("audio/raw".equals(q1Var.U) && !this.f18789r1.a(q1Var)) {
            return c3.a(1);
        }
        if (!this.f18789r1.a(l0.W(2, q1Var.f16908h0, q1Var.f16909i0))) {
            return c3.a(1);
        }
        List<n> x12 = x1(qVar, q1Var, false, this.f18789r1);
        if (x12.isEmpty()) {
            return c3.a(1);
        }
        if (!n12) {
            return c3.a(2);
        }
        n nVar = x12.get(0);
        boolean m10 = nVar.m(q1Var);
        if (!m10) {
            for (int i14 = 1; i14 < x12.size(); i14++) {
                n nVar2 = x12.get(i14);
                if (nVar2.m(q1Var)) {
                    nVar = nVar2;
                    z10 = false;
                    break;
                }
            }
        }
        z11 = m10;
        z10 = true;
        if (!z11) {
            i13 = 3;
        }
        if (z11 && nVar.p(q1Var)) {
            i12 = 16;
        }
        int i15 = nVar.f10518h ? 64 : 0;
        if (z10) {
            i10 = Log.TAG_YOUTUBE;
        }
        return c3.c(i13, i12, i11, i15, i10);
    }

    @Override
    public void t(int i10, Object obj) {
        if (i10 == 2) {
            this.f18789r1.f(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.f18789r1.q((e) obj);
        } else if (i10 != 6) {
            switch (i10) {
                case 9:
                    this.f18789r1.x(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f18789r1.m(((Integer) obj).intValue());
                    return;
                case 11:
                    this.A1 = (b3.a) obj;
                    return;
                default:
                    super.t(i10, obj);
                    return;
            }
        } else {
            this.f18789r1.r((x) obj);
        }
    }

    @Override
    public float u0(float f10, q1 q1Var, q1[] q1VarArr) {
        int i10 = -1;
        for (q1 q1Var2 : q1VarArr) {
            int i11 = q1Var2.f16909i0;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * i10;
    }

    public final int v1(n nVar, q1 q1Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.f10511a) || (i10 = l0.f4841a) >= 24 || (i10 == 23 && l0.m0(this.f18787p1))) {
            return q1Var.V;
        }
        return -1;
    }

    @Override
    public List<n> w0(q qVar, q1 q1Var, boolean z10) {
        return v.u(x1(qVar, q1Var, z10, this.f18789r1), q1Var);
    }

    public int w1(n nVar, q1 q1Var, q1[] q1VarArr) {
        int v12 = v1(nVar, q1Var);
        if (q1VarArr.length == 1) {
            return v12;
        }
        for (q1 q1Var2 : q1VarArr) {
            if (nVar.e(q1Var, q1Var2).f20494d != 0) {
                v12 = Math.max(v12, v1(nVar, q1Var2));
            }
        }
        return v12;
    }

    @Override
    public l.a y0(n nVar, q1 q1Var, MediaCrypto mediaCrypto, float f10) {
        this.f18790s1 = w1(nVar, q1Var, H());
        this.f18791t1 = t1(nVar.f10511a);
        MediaFormat y12 = y1(q1Var, nVar.f10513c, this.f18790s1, f10);
        this.f18792u1 = "audio/raw".equals(nVar.f10512b) && !"audio/raw".equals(q1Var.U) ? q1Var : null;
        return l.a.a(nVar, y12, q1Var, mediaCrypto);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat y1(q1 q1Var, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", q1Var.f16908h0);
        mediaFormat.setInteger("sample-rate", q1Var.f16909i0);
        c5.v.e(mediaFormat, q1Var.W);
        c5.v.d(mediaFormat, "max-input-size", i10);
        int i11 = l0.f4841a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !u1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(q1Var.U)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.f18789r1.k(l0.W(4, q1Var.f16908h0, q1Var.f16909i0)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    public void z1() {
        this.f18795x1 = true;
    }
}
