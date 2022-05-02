package p199o3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p020b5.AbstractC1232u;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1233v;
import p020b5.C1234w;
import p059e4.AbstractC4134l;
import p059e4.AbstractC4140o;
import p059e4.AbstractC4143q;
import p059e4.C4139n;
import p059e4.C4148v;
import p174m3.AbstractC6696s2;
import p174m3.C6600g1;
import p174m3.C6612h1;
import p174m3.C6613h2;
import p174m3.C6701t2;
import p199o3.AbstractC7634s;
import p199o3.AbstractC7636t;
import p216p3.C8026g;
import p216p3.C8028h;

public class C7608f0 extends AbstractC4140o implements AbstractC1232u {
    public final Context f24346o1;
    public final AbstractC7634s.C7635a f24347p1;
    public final AbstractC7636t f24348q1;
    public int f24349r1;
    public boolean f24350s1;
    public C6600g1 f24351t1;
    public long f24352u1;
    public boolean f24353v1;
    public boolean f24354w1;
    public boolean f24355x1;
    public boolean f24356y1;
    public AbstractC6696s2.AbstractC6697a f24357z1;

    public final class C7610b implements AbstractC7636t.AbstractC7639c {
        public C7610b() {
        }

        @Override
        public void mo15361a(boolean z) {
            C7608f0.this.f24347p1.m15412C(z);
        }

        @Override
        public void mo15360b(long j) {
            C7608f0.this.f24347p1.m15413B(j);
        }

        @Override
        public void mo15359c(int i, long j, long j2) {
            C7608f0.this.f24347p1.m15411D(i, j, j2);
        }

        @Override
        public void mo15358d(long j) {
            if (C7608f0.this.f24357z1 != null) {
                C7608f0.this.f24357z1.mo19466b(j);
            }
        }

        @Override
        public void mo15357e() {
            C7608f0.this.m15489v1();
        }

        @Override
        public void mo15356f(Exception exc) {
            C1230s.m37889d("MediaCodecAudioRenderer", "Audio sink error", exc);
            C7608f0.this.f24347p1.m15399l(exc);
        }

        @Override
        public void mo15355g() {
            if (C7608f0.this.f24357z1 != null) {
                C7608f0.this.f24357z1.mo19467a();
            }
        }
    }

    public C7608f0(Context context, AbstractC4134l.AbstractC4136b bVar, AbstractC4143q qVar, boolean z, Handler handler, AbstractC7634s sVar, AbstractC7636t tVar) {
        super(1, bVar, qVar, z, 44100.0f);
        this.f24346o1 = context.getApplicationContext();
        this.f24348q1 = tVar;
        this.f24347p1 = new AbstractC7634s.C7635a(handler, sVar);
        tVar.mo15373l(new C7610b());
    }

    public static boolean m15497q1(String str) {
        if (C1216l0.f4526a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C1216l0.f4528c)) {
            String str2 = C1216l0.f4527b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    public static boolean m15496r1() {
        if (C1216l0.f4526a == 23) {
            String str = C1216l0.f4529d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public AbstractC1232u mo15519A() {
        return this;
    }

    @Override
    public void mo13718I() {
        this.f24355x1 = true;
        try {
            this.f24348q1.flush();
            try {
                super.mo13718I();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo13718I();
                throw th;
            } finally {
            }
        }
    }

    @Override
    public void mo15518J(boolean z, boolean z2) {
        super.mo15518J(z, z2);
        this.f24347p1.m15395p(this.f14014j1);
        if (m19923D().f21050a) {
            this.f24348q1.mo15366s();
        } else {
            this.f24348q1.mo15370o();
        }
    }

    @Override
    public void mo15517J0(Exception exc) {
        C1230s.m37889d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f24347p1.m15400k(exc);
    }

    @Override
    public void mo13717K(long j, boolean z) {
        super.mo13717K(j, z);
        if (this.f24356y1) {
            this.f24348q1.mo15363v();
        } else {
            this.f24348q1.flush();
        }
        this.f24352u1 = j;
        this.f24353v1 = true;
        this.f24354w1 = true;
    }

    @Override
    public void mo15516K0(String str, long j, long j2) {
        this.f24347p1.m15398m(str, j, j2);
    }

    @Override
    public void mo15515L() {
        try {
            super.mo15515L();
        } finally {
            if (this.f24355x1) {
                this.f24355x1 = false;
                this.f24348q1.mo15382c();
            }
        }
    }

    @Override
    public void mo15514L0(String str) {
        this.f24347p1.m15397n(str);
    }

    @Override
    public void mo15513M() {
        super.mo15513M();
        this.f24348q1.mo15378g();
    }

    @Override
    public C8028h mo15512M0(C6612h1 h1Var) {
        C8028h M0 = super.mo15512M0(h1Var);
        this.f24347p1.m15394q(h1Var.f20668b, M0);
        return M0;
    }

    @Override
    public void mo15511N() {
        m15487w1();
        this.f24348q1.mo15383b();
        super.mo15511N();
    }

    @Override
    public void mo15510N0(C6600g1 g1Var, MediaFormat mediaFormat) {
        int i;
        int i2;
        C6600g1 g1Var2 = this.f24351t1;
        int[] iArr = null;
        if (g1Var2 != null) {
            g1Var = g1Var2;
        } else if (m28731p0() != null) {
            if ("audio/raw".equals(g1Var.f20575U)) {
                i = g1Var.f20593j0;
            } else if (C1216l0.f4526a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = C1216l0.m37995U(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i = "audio/raw".equals(g1Var.f20575U) ? g1Var.f20593j0 : 2;
            }
            C6600g1 E = new C6600g1.C6602b().m19859e0("audio/raw").m19870Y(i).m19881N(g1Var.f20594k0).m19880O(g1Var.f20595l0).m19887H(mediaFormat.getInteger("channel-count")).m19857f0(mediaFormat.getInteger("sample-rate")).m19890E();
            if (this.f24350s1 && E.f20591h0 == 6 && (i2 = g1Var.f20591h0) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < g1Var.f20591h0; i3++) {
                    iArr[i3] = i3;
                }
            }
            g1Var = E;
        }
        try {
            this.f24348q1.mo15364u(g1Var, 0, iArr);
        } catch (AbstractC7636t.C7637a e) {
            throw m19925B(e, e.f24462a, 5001);
        }
    }

    @Override
    public void mo15509P0() {
        super.mo15509P0();
        this.f24348q1.mo15369p();
    }

    @Override
    public void mo15508Q0(C8026g gVar) {
        if (this.f24353v1 && !gVar.isDecodeOnly()) {
            if (Math.abs(gVar.f26129N - this.f24352u1) > 500000) {
                this.f24352u1 = gVar.f26129N;
            }
            this.f24353v1 = false;
        }
    }

    @Override
    public boolean mo15507S0(long j, long j2, AbstractC4134l lVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6600g1 g1Var) {
        C1186a.m38188e(byteBuffer);
        if (this.f24351t1 != null && (i2 & 2) != 0) {
            ((AbstractC4134l) C1186a.m38188e(lVar)).mo28661h(i, false);
            return true;
        } else if (z) {
            if (lVar != null) {
                lVar.mo28661h(i, false);
            }
            this.f14014j1.f26122f += i3;
            this.f24348q1.mo15369p();
            return true;
        } else {
            try {
                if (!this.f24348q1.mo15365t(byteBuffer, j3, i3)) {
                    return false;
                }
                if (lVar != null) {
                    lVar.mo28661h(i, false);
                }
                this.f14014j1.f26121e += i3;
                return true;
            } catch (AbstractC7636t.C7638b e) {
                throw m19924C(e, e.f24465c, e.f24464b, 5001);
            } catch (AbstractC7636t.C7641e e2) {
                throw m19924C(e2, g1Var, e2.f24469b, 5002);
            }
        }
    }

    @Override
    public C8028h mo15506T(C4139n nVar, C6600g1 g1Var, C6600g1 g1Var2) {
        C8028h e = nVar.m28805e(g1Var, g1Var2);
        int i = e.f26142e;
        if (m15494s1(nVar, g1Var2) > this.f24349r1) {
            i |= 64;
        }
        int i2 = i;
        return new C8028h(nVar.f13952a, g1Var, g1Var2, i2 != 0 ? 0 : e.f26141d, i2);
    }

    @Override
    public void mo15505X0() {
        try {
            this.f24348q1.mo15377h();
        } catch (AbstractC7636t.C7641e e) {
            throw m19924C(e, e.f24470c, e.f24469b, 5002);
        }
    }

    @Override
    public String mo11837b() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public void mo15504d(C6613h2 h2Var) {
        this.f24348q1.mo15381d(h2Var);
    }

    @Override
    public boolean mo13705e() {
        return super.mo13705e() && this.f24348q1.mo15380e();
    }

    @Override
    public boolean mo13704f() {
        return this.f24348q1.mo15376i() || super.mo13704f();
    }

    @Override
    public long mo15503g() {
        if (mo19480i() == 2) {
            m15487w1();
        }
        return this.f24352u1;
    }

    @Override
    public boolean mo15502i1(C6600g1 g1Var) {
        return this.f24348q1.mo15384a(g1Var);
    }

    @Override
    public C6613h2 mo15501j() {
        return this.f24348q1.mo15375j();
    }

    @Override
    public int mo15500j1(AbstractC4143q qVar, C6600g1 g1Var) {
        if (!C1234w.m37864j(g1Var.f20575U)) {
            return C6701t2.m19438a(0);
        }
        int i = C1216l0.f4526a >= 21 ? 32 : 0;
        boolean z = g1Var.f20597n0 != 0;
        boolean k1 = AbstractC4140o.m28739k1(g1Var);
        int i2 = 8;
        int i3 = 4;
        if (k1 && this.f24348q1.mo15384a(g1Var) && (!z || C4148v.m28681u() != null)) {
            return C6701t2.m19437b(4, 8, i);
        }
        if ("audio/raw".equals(g1Var.f20575U) && !this.f24348q1.mo15384a(g1Var)) {
            return C6701t2.m19438a(1);
        }
        if (!this.f24348q1.mo15384a(C1216l0.m37994V(2, g1Var.f20591h0, g1Var.f20592i0))) {
            return C6701t2.m19438a(1);
        }
        List<C4139n> u0 = mo15491u0(qVar, g1Var, false);
        if (u0.isEmpty()) {
            return C6701t2.m19438a(1);
        }
        if (!k1) {
            return C6701t2.m19438a(2);
        }
        C4139n nVar = u0.get(0);
        boolean m = nVar.m28797m(g1Var);
        if (m && nVar.m28795o(g1Var)) {
            i2 = 16;
        }
        if (!m) {
            i3 = 3;
        }
        return C6701t2.m19437b(i3, i2, i);
    }

    @Override
    public float mo15495s0(float f, C6600g1 g1Var, C6600g1[] g1VarArr) {
        int i = -1;
        for (C6600g1 g1Var2 : g1VarArr) {
            int i2 = g1Var2.f20592i0;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * i;
    }

    public final int m15494s1(C4139n nVar, C6600g1 g1Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(nVar.f13952a) || (i = C1216l0.f4526a) >= 24 || (i == 23 && C1216l0.m37966l0(this.f24346o1))) {
            return g1Var.f20576V;
        }
        return -1;
    }

    public int m15493t1(C4139n nVar, C6600g1 g1Var, C6600g1[] g1VarArr) {
        int s1 = m15494s1(nVar, g1Var);
        if (g1VarArr.length == 1) {
            return s1;
        }
        for (C6600g1 g1Var2 : g1VarArr) {
            if (nVar.m28805e(g1Var, g1Var2).f26141d != 0) {
                s1 = Math.max(s1, m15494s1(nVar, g1Var2));
            }
        }
        return s1;
    }

    @Override
    public void mo15492u(int i, Object obj) {
        if (i == 2) {
            this.f24348q1.mo15379f(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f24348q1.mo15368q((C7602e) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.f24348q1.mo15362w(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f24348q1.mo15372m(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f24357z1 = (AbstractC6696s2.AbstractC6697a) obj;
                    return;
                default:
                    super.mo15492u(i, obj);
                    return;
            }
        } else {
            this.f24348q1.mo15367r((C7647x) obj);
        }
    }

    @Override
    public List<C4139n> mo15491u0(AbstractC4143q qVar, C6600g1 g1Var, boolean z) {
        C4139n u;
        String str = g1Var.f20575U;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f24348q1.mo15384a(g1Var) && (u = C4148v.m28681u()) != null) {
            return Collections.singletonList(u);
        }
        List<C4139n> t = C4148v.m28682t(qVar.mo28719a(str, z, false), g1Var);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(t);
            arrayList.addAll(qVar.mo28719a("audio/eac3", z, false));
            t = arrayList;
        }
        return Collections.unmodifiableList(t);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat m15490u1(C6600g1 g1Var, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", g1Var.f20591h0);
        mediaFormat.setInteger("sample-rate", g1Var.f20592i0);
        C1233v.m37874e(mediaFormat, g1Var.f20577W);
        C1233v.m37875d(mediaFormat, "max-input-size", i);
        int i2 = C1216l0.f4526a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !m15496r1()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && "audio/ac4".equals(g1Var.f20575U)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.f24348q1.mo15374k(C1216l0.m37994V(4, g1Var.f20591h0, g1Var.f20592i0)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    public void m15489v1() {
        this.f24354w1 = true;
    }

    @Override
    public AbstractC4134l.C4135a mo15488w0(C4139n nVar, C6600g1 g1Var, MediaCrypto mediaCrypto, float f) {
        this.f24349r1 = m15493t1(nVar, g1Var, m19920G());
        this.f24350s1 = m15497q1(nVar.f13952a);
        MediaFormat u1 = m15490u1(g1Var, nVar.f13954c, this.f24349r1, f);
        this.f24351t1 = "audio/raw".equals(nVar.f13953b) && !"audio/raw".equals(g1Var.f20575U) ? g1Var : null;
        return AbstractC4134l.C4135a.m28814a(nVar, u1, g1Var, mediaCrypto);
    }

    public final void m15487w1() {
        long n = this.f24348q1.mo15371n(mo13705e());
        if (n != Long.MIN_VALUE) {
            if (!this.f24354w1) {
                n = Math.max(this.f24352u1, n);
            }
            this.f24352u1 = n;
            this.f24354w1 = false;
        }
    }
}
