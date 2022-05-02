package p156kd;

import android.os.Build;
import gd.C4779t2;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p108hb.C5063c;
import p154kb.C6227d;
import p154kb.C6235i;
import p193nb.C7321e;
import p209od.C7856c;
import p225pd.C8111a;
import p242r1.C8348b;
import p254rd.C8431f;
import p350yd.AbstractC11073vb;
import p350yd.C10930q6;

public class C6246h {
    public int f19690M;
    public int f19691N;
    public String f19692O;
    public final byte[] f19693P;
    public int f19694Q;
    public final AbstractC11073vb f19695R;
    public C8348b.C8352d f19696S;
    public AbstractC6249c f19697T;
    public C8111a f19698U;
    public C7856c f19699V;
    public List<Reference<AbstractC6248b>> f19700W;
    public C6227d<AbstractC6247a> f19701X;
    public C8431f f19702Y;
    public int f19703Z;
    public TdApi.File f19704a;
    public int f19705b;
    public int f19706c;

    public interface AbstractC6247a {
        void mo11482a(C6246h hVar);
    }

    public interface AbstractC6248b {
        void mo20813a(C6246h hVar, C7856c cVar);
    }

    public interface AbstractC6249c {
        void mo15931a(C6246h hVar, int i, boolean z);
    }

    public C6246h(AbstractC11073vb vbVar, TdApi.File file, byte[] bArr) {
        this.f19695R = vbVar;
        this.f19704a = file;
        this.f19693P = (bArr == null || bArr.length <= 0) ? null : bArr;
    }

    public static C6246h m20921f(C6246h hVar) {
        if (hVar instanceof C6250i) {
            return new C6250i((C6250i) hVar);
        }
        if (hVar instanceof C6251j) {
            return new C6251j(hVar.f19695R, hVar.m20892w(), ((C6251j) hVar).m20883E0());
        }
        return new C6246h(hVar.f19695R, hVar.m20911k());
    }

    public static String m20908m(int i, int i2) {
        return i + "_" + i2;
    }

    public static String m20906n(int i, String str) {
        return i + "_" + str;
    }

    public static String m20904o(C10930q6 q6Var, int i) {
        return m20908m(q6Var != null ? q6Var.m2188w6() : -1, i);
    }

    public static String m20902p(C10930q6 q6Var, String str) {
        return m20906n(q6Var != null ? q6Var.m2188w6() : -1, str);
    }

    public int m20956A() {
        return this.f19703Z;
    }

    public boolean m20955A0() {
        int i = this.f19691N;
        boolean z = (i & Log.TAG_VIDEO) != 0;
        if (z) {
            this.f19691N = i & (-16385);
        }
        return z;
    }

    public String m20954B() {
        C8111a aVar = this.f19698U;
        return (aVar == null || aVar.m13574k()) ? this.f19704a.local.path : C6252k.m20879D0(this.f19698U);
    }

    public C10930q6 m20953B0() {
        AbstractC11073vb vbVar = this.f19695R;
        if (vbVar != null) {
            return vbVar.mo1480c();
        }
        return null;
    }

    public byte mo20778C() {
        return (byte) 1;
    }

    public void m20952C0(TdApi.File file) {
        C7321e.m16907u(file, this.f19704a);
        this.f19704a = file;
    }

    public int mo20873D() {
        return this.f19694Q;
    }

    public boolean m20951E() {
        C8111a aVar = this.f19698U;
        return (aVar != null && !aVar.m13574k()) || m20897t() != null;
    }

    public boolean m20950F() {
        return (this.f19691N & Log.TAG_VOICE) != 0;
    }

    public boolean m20949G() {
        return (this.f19691N & Log.TAG_LUX) != 0;
    }

    public boolean m20948H() {
        return (this.f19691N & Log.TAG_PLAYER) != 0;
    }

    public boolean m20947I() {
        return (this.f19691N & 64) != 0;
    }

    public boolean mo20866J() {
        return (this.f19691N & 32) != 0;
    }

    public boolean m20946K() {
        return (this.f19691N & Log.TAG_COMPRESS) != 0;
    }

    public boolean m20945L() {
        return (this.f19691N & Log.TAG_PAINT) != 0;
    }

    public boolean m20944M() {
        return (this.f19691N & 1) != 0;
    }

    public boolean m20943N() {
        return this.f19706c != 0;
    }

    public boolean m20942O() {
        return (this.f19691N & Log.TAG_EMOJI) != 0;
    }

    public boolean m20941P() {
        return (this.f19691N & Log.TAG_CAMERA) != 0;
    }

    public boolean m20940Q() {
        return (this.f19691N & Log.TAG_CRASH) != 0;
    }

    public boolean m20939R() {
        return (this.f19691N & Log.TAG_YOUTUBE) != 0;
    }

    public boolean m20938S() {
        return C5063c.m24145b(this.f19691N, Log.TAG_CONTACT);
    }

    public boolean m20937T() {
        return (this.f19691N & Log.TAG_GIF_LOADER) == 0;
    }

    public void m20936U() {
        this.f19692O = null;
        C6227d<AbstractC6247a> dVar = this.f19701X;
        if (dVar != null) {
            Iterator<AbstractC6247a> it = dVar.iterator();
            while (it.hasNext()) {
                it.next().mo11482a(this);
            }
        }
    }

    public void m20935V(AbstractC6247a aVar) {
        C6227d<AbstractC6247a> dVar = this.f19701X;
        if (dVar != null) {
            dVar.remove(aVar);
        }
    }

    public void m20934W(AbstractC6248b bVar) {
        List<Reference<AbstractC6248b>> list = this.f19700W;
        if (list != null) {
            C6235i.m21012e(list, bVar);
        }
    }

    public void m20933X(int i) {
        this.f19706c = i;
    }

    public void m20932Y(C7856c cVar) {
        if (cVar == null || cVar.m14818l()) {
            this.f19699V = null;
        } else {
            this.f19699V = cVar;
        }
        List<Reference<AbstractC6248b>> list = this.f19700W;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                AbstractC6248b bVar = this.f19700W.get(size).get();
                if (bVar != null) {
                    bVar.mo20813a(this, cVar);
                } else {
                    this.f19700W.remove(size);
                }
            }
        }
    }

    public void m20931Z(boolean z) {
        this.f19691N = C5063c.m24139h(this.f19691N, Log.TAG_CAMERA, z);
    }

    public final int m20930a() {
        AbstractC11073vb vbVar = this.f19695R;
        if (vbVar != null) {
            return vbVar.mo1484a();
        }
        return -1;
    }

    public void m20929a0(C8111a aVar) {
        if (aVar == null || aVar.m13574k()) {
            this.f19698U = null;
        } else {
            this.f19698U = aVar;
        }
    }

    public void m20928b(AbstractC6247a aVar) {
        if (this.f19701X == null) {
            this.f19701X = new C6227d<>();
        }
        this.f19701X.add(aVar);
    }

    public void m20927b0() {
        this.f19691N |= 16;
    }

    public void m20926c(AbstractC6248b bVar) {
        if (this.f19700W == null) {
            this.f19700W = new ArrayList();
        }
        C6235i.m21016a(this.f19700W, bVar);
    }

    public void m20925c0() {
        this.f19691N |= Log.TAG_PLAYER;
    }

    public String mo20769d() {
        return m20923e(new StringBuilder()).toString();
    }

    public void m20924d0() {
        this.f19691N |= 64;
    }

    public final StringBuilder m20923e(StringBuilder sb2) {
        sb2.append("account");
        sb2.append(m20930a());
        sb2.append('_');
        sb2.append(C7321e.m16996L0(this.f19704a));
        sb2.append('_');
        sb2.append(this.f19705b);
        if ((this.f19691N & Log.TAG_CAMERA) != 0) {
            sb2.append("_square");
        }
        if (Build.VERSION.SDK_INT >= 28 && (this.f19691N & Log.TAG_COMPRESS) != 0) {
            sb2.append("_sw");
        }
        return sb2;
    }

    public void m20922e0() {
        this.f19691N |= Log.TAG_PAINT;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6246h) && toString().equals(obj.toString());
    }

    public void m20920f0() {
        this.f19706c = 3;
    }

    public boolean m20919g() {
        return (this.f19691N & 16) != 0;
    }

    public void m20918g0(boolean z) {
        int i = this.f19691N | Log.TAG_EMOJI;
        this.f19691N = i;
        if (z) {
            this.f19691N = i | Log.TAG_LUX;
        }
    }

    public int m20917h() {
        int i = this.f19706c;
        if (i == 0) {
            return 3;
        }
        return i;
    }

    public void m20916h0() {
        this.f19691N |= Log.TAG_CRASH;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public byte[] m20915i() {
        return this.f19693P;
    }

    public void m20914i0() {
        this.f19691N |= Log.TAG_YOUTUBE;
    }

    public C7856c m20913j() {
        C7856c cVar = this.f19699V;
        if (cVar == null || cVar.m14818l()) {
            return null;
        }
        return this.f19699V;
    }

    public void m20912j0(boolean z) {
        this.f19691N = C5063c.m24139h(this.f19691N, Log.TAG_CONTACT, z);
        if (z) {
            m20893v0(true);
        }
    }

    public TdApi.File m20911k() {
        return this.f19704a;
    }

    public void m20910k0() {
        this.f19691N |= 8;
    }

    public String mo20880l() {
        return m20908m(m20930a(), this.f19704a.f25376id);
    }

    public void m20909l0() {
        this.f19691N |= 2;
    }

    public void m20907m0() {
        this.f19691N |= Log.TAG_GIF_LOADER;
    }

    public boolean m20905n0(C8431f fVar) {
        if (fVar != null && !fVar.m12493i()) {
            C8431f fVar2 = this.f19702Y;
            if (fVar2 == null || !fVar2.m12497e(fVar)) {
                this.f19702Y = fVar;
                return true;
            }
            this.f19702Y = fVar;
            return false;
        } else if (this.f19702Y == null) {
            return false;
        } else {
            this.f19702Y = null;
            return true;
        }
    }

    public void m20903o0(C8348b.C8352d dVar) {
        this.f19696S = dVar;
    }

    public void m20901p0() {
        this.f19691N |= 32;
    }

    public String mo20876q() {
        TdApi.LocalFile localFile = this.f19704a.local;
        if (localFile != null) {
            return localFile.path;
        }
        return null;
    }

    public void mo20875q0(int i) {
        AbstractC6249c cVar;
        if (this.f19694Q == i || (cVar = this.f19697T) == null) {
            this.f19694Q = i;
            return;
        }
        this.f19694Q = i;
        cVar.mo15931a(this, i, false);
    }

    public C8111a m20900r() {
        return this.f19698U;
    }

    public void m20899r0(AbstractC6249c cVar) {
        this.f19697T = cVar;
    }

    public int mo20826s() {
        return this.f19704a.f25376id;
    }

    public void m20898s0(int i) {
        this.f19690M = i;
    }

    public C8431f m20897t() {
        C8431f fVar = this.f19702Y;
        if (fVar == null || fVar.m12493i()) {
            return null;
        }
        return this.f19702Y;
    }

    public void mo20768t0(int i) {
        this.f19705b = i;
    }

    public final String toString() {
        String str = this.f19692O;
        if (str != null) {
            return str;
        }
        String d = mo20769d();
        this.f19692O = d;
        return d;
    }

    public C8348b.C8352d m20896u() {
        return this.f19696S;
    }

    public void m20895u0(boolean z) {
        this.f19691N = C5063c.m24139h(this.f19691N, Log.TAG_VIDEO, z);
    }

    public float m20894v() {
        return C4779t2.m25432s1(this.f19704a);
    }

    public void m20893v0(boolean z) {
        this.f19691N = C5063c.m24139h(this.f19691N, Log.TAG_COMPRESS, z);
    }

    public String m20892w() {
        return this.f19704a.remote.f25420id;
    }

    public void m20891w0(int i) {
        this.f19703Z = i;
    }

    public int mo20874x() {
        return this.f19694Q;
    }

    public void m20890x0() {
        this.f19691N |= 1;
    }

    public int m20889y() {
        return this.f19690M;
    }

    public boolean m20888y0() {
        return (this.f19691N & 2) == 0;
    }

    public int m20887z() {
        return this.f19705b;
    }

    public boolean m20886z0() {
        return (this.f19691N & 8) == 0;
    }

    public C6246h(AbstractC11073vb vbVar, TdApi.File file) {
        this(vbVar, file, null);
    }
}
