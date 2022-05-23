package s8;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import s2.e;
import s2.g;

@g(tags = {3})
public class h extends b {
    public static Logger f22604q = Logger.getLogger(h.class.getName());
    public int f22605d;
    public int f22606e;
    public int f22607f;
    public int f22608g;
    public int f22609h;
    public String f22611j;
    public int f22612k;
    public int f22613l;
    public int f22614m;
    public e f22615n;
    public n f22616o;
    public int f22610i = 0;
    public List<b> f22617p = new ArrayList();

    @Override
    public void e(ByteBuffer byteBuffer) {
        this.f22605d = e.i(byteBuffer);
        int n10 = e.n(byteBuffer);
        int i10 = n10 >>> 7;
        this.f22606e = i10;
        this.f22607f = (n10 >>> 6) & 1;
        this.f22608g = (n10 >>> 5) & 1;
        this.f22609h = n10 & 31;
        if (i10 == 1) {
            this.f22613l = e.i(byteBuffer);
        }
        if (this.f22607f == 1) {
            int n11 = e.n(byteBuffer);
            this.f22610i = n11;
            this.f22611j = e.h(byteBuffer, n11);
        }
        if (this.f22608g == 1) {
            this.f22614m = e.i(byteBuffer);
        }
        int i11 = 0;
        int b10 = b() + 1 + 2 + 1 + (this.f22606e == 1 ? 2 : 0) + (this.f22607f == 1 ? this.f22610i + 1 : 0);
        if (this.f22608g == 1) {
            i11 = 2;
        }
        int i12 = b10 + i11;
        int position = byteBuffer.position();
        if (a() > i12 + 2) {
            b a10 = l.a(-1, byteBuffer);
            long position2 = byteBuffer.position() - position;
            Logger logger = f22604q;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a10);
            sb2.append(" - ESDescriptor1 read: ");
            sb2.append(position2);
            sb2.append(", size: ");
            sb2.append(a10 != null ? Integer.valueOf(a10.a()) : null);
            logger.finer(sb2.toString());
            if (a10 != null) {
                int a11 = a10.a();
                byteBuffer.position(position + a11);
                i12 += a11;
            } else {
                i12 = (int) (i12 + position2);
            }
            if (a10 instanceof e) {
                this.f22615n = (e) a10;
            }
        }
        int position3 = byteBuffer.position();
        if (a() > i12 + 2) {
            b a12 = l.a(-1, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = f22604q;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a12);
            sb3.append(" - ESDescriptor2 read: ");
            sb3.append(position4);
            sb3.append(", size: ");
            sb3.append(a12 != null ? Integer.valueOf(a12.a()) : null);
            logger2.finer(sb3.toString());
            if (a12 != null) {
                int a13 = a12.a();
                byteBuffer.position(position3 + a13);
                i12 += a13;
            } else {
                i12 = (int) (i12 + position4);
            }
            if (a12 instanceof n) {
                this.f22616o = (n) a12;
            }
        } else {
            f22604q.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i12 > 2) {
            int position5 = byteBuffer.position();
            b a14 = l.a(-1, byteBuffer);
            long position6 = byteBuffer.position() - position5;
            Logger logger3 = f22604q;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a14);
            sb4.append(" - ESDescriptor3 read: ");
            sb4.append(position6);
            sb4.append(", size: ");
            sb4.append(a14 != null ? Integer.valueOf(a14.a()) : null);
            logger3.finer(sb4.toString());
            if (a14 != null) {
                int a15 = a14.a();
                byteBuffer.position(position5 + a15);
                i12 += a15;
            } else {
                i12 = (int) (i12 + position6);
            }
            this.f22617p.add(a14);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f22607f != hVar.f22607f || this.f22610i != hVar.f22610i || this.f22613l != hVar.f22613l || this.f22605d != hVar.f22605d || this.f22614m != hVar.f22614m || this.f22608g != hVar.f22608g || this.f22612k != hVar.f22612k || this.f22606e != hVar.f22606e || this.f22609h != hVar.f22609h) {
            return false;
        }
        String str = this.f22611j;
        if (str == null ? hVar.f22611j != null : !str.equals(hVar.f22611j)) {
            return false;
        }
        e eVar = this.f22615n;
        if (eVar == null ? hVar.f22615n != null : !eVar.equals(hVar.f22615n)) {
            return false;
        }
        List<b> list = this.f22617p;
        if (list == null ? hVar.f22617p != null : !list.equals(hVar.f22617p)) {
            return false;
        }
        n nVar = this.f22616o;
        n nVar2 = hVar.f22616o;
        return nVar == null ? nVar2 == null : nVar.equals(nVar2);
    }

    public e f() {
        return this.f22615n;
    }

    public int g() {
        return this.f22613l;
    }

    public int h() {
        return this.f22605d;
    }

    public int hashCode() {
        int i10 = ((((((((((this.f22605d * 31) + this.f22606e) * 31) + this.f22607f) * 31) + this.f22608g) * 31) + this.f22609h) * 31) + this.f22610i) * 31;
        String str = this.f22611j;
        int i11 = 0;
        int hashCode = (((((((i10 + (str != null ? str.hashCode() : 0)) * 31) + this.f22612k) * 31) + this.f22613l) * 31) + this.f22614m) * 31;
        e eVar = this.f22615n;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        n nVar = this.f22616o;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        List<b> list = this.f22617p;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode3 + i11;
    }

    public List<b> i() {
        return this.f22617p;
    }

    public int j() {
        return this.f22612k;
    }

    public n k() {
        return this.f22616o;
    }

    public int l() {
        return this.f22606e;
    }

    public int m() {
        return this.f22609h;
    }

    public int n() {
        return this.f22607f;
    }

    public int o() {
        return this.f22610i;
    }

    public String p() {
        return this.f22611j;
    }

    public int q() {
        return this.f22614m;
    }

    public int r() {
        return this.f22608g;
    }

    public ByteBuffer s() {
        ByteBuffer allocate = ByteBuffer.allocate(t());
        g.j(allocate, 3);
        g.j(allocate, t() - 2);
        g.e(allocate, this.f22605d);
        g.j(allocate, (this.f22606e << 7) | (this.f22607f << 6) | (this.f22608g << 5) | (this.f22609h & 31));
        if (this.f22606e > 0) {
            g.e(allocate, this.f22613l);
        }
        if (this.f22607f > 0) {
            g.j(allocate, this.f22610i);
            g.k(allocate, this.f22611j);
        }
        if (this.f22608g > 0) {
            g.e(allocate, this.f22614m);
        }
        ByteBuffer o10 = this.f22615n.o();
        ByteBuffer f10 = this.f22616o.f();
        allocate.put(o10.array());
        allocate.put(f10.array());
        return allocate;
    }

    public int t() {
        int i10 = this.f22606e > 0 ? 7 : 5;
        if (this.f22607f > 0) {
            i10 += this.f22610i + 1;
        }
        if (this.f22608g > 0) {
            i10 += 2;
        }
        return i10 + this.f22615n.p() + this.f22616o.g();
    }

    @Override
    public String toString() {
        return "ESDescriptor{esId=" + this.f22605d + ", streamDependenceFlag=" + this.f22606e + ", URLFlag=" + this.f22607f + ", oCRstreamFlag=" + this.f22608g + ", streamPriority=" + this.f22609h + ", URLLength=" + this.f22610i + ", URLString='" + this.f22611j + "', remoteODFlag=" + this.f22612k + ", dependsOnEsId=" + this.f22613l + ", oCREsId=" + this.f22614m + ", decoderConfigDescriptor=" + this.f22615n + ", slConfigDescriptor=" + this.f22616o + '}';
    }

    public void u(e eVar) {
        this.f22615n = eVar;
    }

    public void v(int i10) {
        this.f22605d = i10;
    }

    public void w(n nVar) {
        this.f22616o = nVar;
    }
}
