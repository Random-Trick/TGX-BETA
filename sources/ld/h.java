package ld;

import android.os.Build;
import hd.t2;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb.d;
import lb.i;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import r1.b;
import sd.f;
import zd.o6;
import zd.tb;

public class h {
    public int M;
    public int N;
    public String O;
    public final byte[] P;
    public int Q;
    public final tb R;
    public b.d S;
    public c T;
    public qd.a U;
    public pd.c V;
    public List<Reference<b>> W;
    public d<a> X;
    public f Y;
    public int Z;
    public TdApi.File f16361a;
    public int f16362b;
    public int f16363c;

    public interface a {
        void a(h hVar);
    }

    public interface b {
        void a(h hVar, pd.c cVar);
    }

    public interface c {
        void a(h hVar, int i10, boolean z10);
    }

    public h(tb tbVar, TdApi.File file, byte[] bArr) {
        this.R = tbVar;
        this.f16361a = file;
        this.P = (bArr == null || bArr.length <= 0) ? null : bArr;
    }

    public static h f(h hVar) {
        if (hVar instanceof i) {
            return new i((i) hVar);
        }
        if (hVar instanceof j) {
            return new j(hVar.R, hVar.w(), ((j) hVar).E0());
        }
        return new h(hVar.R, hVar.k());
    }

    public static String m(int i10, int i11) {
        return i10 + "_" + i11;
    }

    public static String n(int i10, String str) {
        return i10 + "_" + str;
    }

    public static String o(o6 o6Var, int i10) {
        return m(o6Var != null ? o6Var.A6() : -1, i10);
    }

    public static String p(o6 o6Var, String str) {
        return n(o6Var != null ? o6Var.A6() : -1, str);
    }

    public int A() {
        return this.Z;
    }

    public boolean A0() {
        int i10 = this.N;
        boolean z10 = (i10 & Log.TAG_VIDEO) != 0;
        if (z10) {
            this.N = i10 & (-16385);
        }
        return z10;
    }

    public String B() {
        qd.a aVar = this.U;
        return (aVar == null || aVar.k()) ? this.f16361a.local.path : k.D0(this.U);
    }

    public o6 B0() {
        tb tbVar = this.R;
        if (tbVar != null) {
            return tbVar.c();
        }
        return null;
    }

    public byte C() {
        return (byte) 1;
    }

    public void C0(TdApi.File file) {
        e.v(file, this.f16361a);
        this.f16361a = file;
    }

    public int D() {
        return this.Q;
    }

    public boolean E() {
        qd.a aVar = this.U;
        return (aVar != null && !aVar.k()) || t() != null;
    }

    public boolean F() {
        return (this.N & Log.TAG_VOICE) != 0;
    }

    public boolean G() {
        return (this.N & Log.TAG_LUX) != 0;
    }

    public boolean H() {
        return (this.N & Log.TAG_PLAYER) != 0;
    }

    public boolean I() {
        return (this.N & 64) != 0;
    }

    public boolean J() {
        return (this.N & 32) != 0;
    }

    public boolean K() {
        return (this.N & Log.TAG_COMPRESS) != 0;
    }

    public boolean L() {
        return (this.N & Log.TAG_PAINT) != 0;
    }

    public boolean M() {
        return (this.N & 1) != 0;
    }

    public boolean N() {
        return this.f16363c != 0;
    }

    public boolean O() {
        return (this.N & Log.TAG_EMOJI) != 0;
    }

    public boolean P() {
        return (this.N & Log.TAG_CAMERA) != 0;
    }

    public boolean Q() {
        return (this.N & Log.TAG_CRASH) != 0;
    }

    public boolean R() {
        return (this.N & Log.TAG_YOUTUBE) != 0;
    }

    public boolean S() {
        return ib.c.b(this.N, Log.TAG_CONTACT);
    }

    public boolean T() {
        return (this.N & Log.TAG_GIF_LOADER) == 0;
    }

    public void U() {
        this.O = null;
        d<a> dVar = this.X;
        if (dVar != null) {
            Iterator<a> it = dVar.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    public void V(a aVar) {
        d<a> dVar = this.X;
        if (dVar != null) {
            dVar.remove(aVar);
        }
    }

    public void W(b bVar) {
        List<Reference<b>> list = this.W;
        if (list != null) {
            i.e(list, bVar);
        }
    }

    public void X(int i10) {
        this.f16363c = i10;
    }

    public void Y(pd.c cVar) {
        if (cVar == null || cVar.l()) {
            this.V = null;
        } else {
            this.V = cVar;
        }
        List<Reference<b>> list = this.W;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = this.W.get(size).get();
                if (bVar != null) {
                    bVar.a(this, cVar);
                } else {
                    this.W.remove(size);
                }
            }
        }
    }

    public void Z(boolean z10) {
        this.N = ib.c.h(this.N, Log.TAG_CAMERA, z10);
    }

    public final int a() {
        tb tbVar = this.R;
        if (tbVar != null) {
            return tbVar.a();
        }
        return -1;
    }

    public void a0(qd.a aVar) {
        if (aVar == null || aVar.k()) {
            this.U = null;
        } else {
            this.U = aVar;
        }
    }

    public void b(a aVar) {
        if (this.X == null) {
            this.X = new d<>();
        }
        this.X.add(aVar);
    }

    public void b0() {
        this.N |= 16;
    }

    public void c(b bVar) {
        if (this.W == null) {
            this.W = new ArrayList();
        }
        i.a(this.W, bVar);
    }

    public void c0() {
        this.N |= Log.TAG_PLAYER;
    }

    public String d() {
        return e(new StringBuilder()).toString();
    }

    public void d0() {
        this.N |= 64;
    }

    public final StringBuilder e(StringBuilder sb2) {
        sb2.append("account");
        sb2.append(a());
        sb2.append('_');
        sb2.append(e.N0(this.f16361a));
        sb2.append('_');
        sb2.append(this.f16362b);
        if ((this.N & Log.TAG_CAMERA) != 0) {
            sb2.append("_square");
        }
        if (Build.VERSION.SDK_INT >= 28 && (this.N & Log.TAG_COMPRESS) != 0) {
            sb2.append("_sw");
        }
        return sb2;
    }

    public void e0() {
        this.N |= Log.TAG_PAINT;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && toString().equals(obj.toString());
    }

    public void f0() {
        this.f16363c = 3;
    }

    public boolean g() {
        return (this.N & 16) != 0;
    }

    public void g0(boolean z10) {
        int i10 = this.N | Log.TAG_EMOJI;
        this.N = i10;
        if (z10) {
            this.N = i10 | Log.TAG_LUX;
        }
    }

    public int h() {
        int i10 = this.f16363c;
        if (i10 == 0) {
            return 3;
        }
        return i10;
    }

    public void h0() {
        this.N |= Log.TAG_CRASH;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public byte[] i() {
        return this.P;
    }

    public void i0() {
        this.N |= Log.TAG_YOUTUBE;
    }

    public pd.c j() {
        pd.c cVar = this.V;
        if (cVar == null || cVar.l()) {
            return null;
        }
        return this.V;
    }

    public void j0(boolean z10) {
        this.N = ib.c.h(this.N, Log.TAG_CONTACT, z10);
        if (z10) {
            v0(true);
        }
    }

    public TdApi.File k() {
        return this.f16361a;
    }

    public void k0() {
        this.N |= 8;
    }

    public String l() {
        return m(a(), this.f16361a.f19913id);
    }

    public void l0() {
        this.N |= 2;
    }

    public void m0() {
        this.N |= Log.TAG_GIF_LOADER;
    }

    public boolean n0(f fVar) {
        if (fVar != null && !fVar.i()) {
            f fVar2 = this.Y;
            if (fVar2 == null || !fVar2.e(fVar)) {
                this.Y = fVar;
                return true;
            }
            this.Y = fVar;
            return false;
        } else if (this.Y == null) {
            return false;
        } else {
            this.Y = null;
            return true;
        }
    }

    public void o0(b.d dVar) {
        this.S = dVar;
    }

    public void p0() {
        this.N |= 32;
    }

    public String q() {
        TdApi.LocalFile localFile = this.f16361a.local;
        if (localFile != null) {
            return localFile.path;
        }
        return null;
    }

    public void q0(int i10) {
        c cVar;
        if (this.Q == i10 || (cVar = this.T) == null) {
            this.Q = i10;
            return;
        }
        this.Q = i10;
        cVar.a(this, i10, false);
    }

    public qd.a r() {
        return this.U;
    }

    public void r0(c cVar) {
        this.T = cVar;
    }

    public int s() {
        return this.f16361a.f19913id;
    }

    public void s0(int i10) {
        this.M = i10;
    }

    public f t() {
        f fVar = this.Y;
        if (fVar == null || fVar.i()) {
            return null;
        }
        return this.Y;
    }

    public void t0(int i10) {
        this.f16362b = i10;
    }

    public final String toString() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        String d10 = d();
        this.O = d10;
        return d10;
    }

    public b.d u() {
        return this.S;
    }

    public void u0(boolean z10) {
        this.N = ib.c.h(this.N, Log.TAG_VIDEO, z10);
    }

    public float v() {
        return t2.s1(this.f16361a);
    }

    public void v0(boolean z10) {
        this.N = ib.c.h(this.N, Log.TAG_COMPRESS, z10);
    }

    public String w() {
        return this.f16361a.remote.f19958id;
    }

    public void w0(int i10) {
        this.Z = i10;
    }

    public int x() {
        return this.Q;
    }

    public void x0() {
        this.N |= 1;
    }

    public int y() {
        return this.M;
    }

    public boolean y0() {
        return (this.N & 2) == 0;
    }

    public int z() {
        return this.f16362b;
    }

    public boolean z0() {
        return (this.N & 8) == 0;
    }

    public h(tb tbVar, TdApi.File file) {
        this(tbVar, file, null);
    }
}
