package p249r8;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p258s2.C8632e;
import p258s2.C8634g;

@AbstractC8385g(tags = {3})
public class C8386h extends AbstractC8380b {
    public static Logger f27237q = Logger.getLogger(C8386h.class.getName());
    public int f27238d;
    public int f27239e;
    public int f27240f;
    public int f27241g;
    public int f27242h;
    public String f27244j;
    public int f27245k;
    public int f27246l;
    public int f27247m;
    public C8383e f27248n;
    public C8392n f27249o;
    public int f27243i = 0;
    public List<AbstractC8380b> f27250p = new ArrayList();

    @Override
    public void mo12589e(ByteBuffer byteBuffer) {
        this.f27238d = C8632e.m11866i(byteBuffer);
        int n = C8632e.m11861n(byteBuffer);
        int i = n >>> 7;
        this.f27239e = i;
        this.f27240f = (n >>> 6) & 1;
        this.f27241g = (n >>> 5) & 1;
        this.f27242h = n & 31;
        if (i == 1) {
            this.f27246l = C8632e.m11866i(byteBuffer);
        }
        if (this.f27240f == 1) {
            int n2 = C8632e.m11861n(byteBuffer);
            this.f27243i = n2;
            this.f27244j = C8632e.m11867h(byteBuffer, n2);
        }
        if (this.f27241g == 1) {
            this.f27247m = C8632e.m11866i(byteBuffer);
        }
        int i2 = 0;
        int b = m12635b() + 1 + 2 + 1 + (this.f27239e == 1 ? 2 : 0) + (this.f27240f == 1 ? this.f27243i + 1 : 0);
        if (this.f27241g == 1) {
            i2 = 2;
        }
        int i3 = b + i2;
        int position = byteBuffer.position();
        if (m12636a() > i3 + 2) {
            AbstractC8380b a = C8390l.m12593a(-1, byteBuffer);
            long position2 = byteBuffer.position() - position;
            Logger logger = f27237q;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a);
            sb2.append(" - ESDescriptor1 read: ");
            sb2.append(position2);
            sb2.append(", size: ");
            sb2.append(a != null ? Integer.valueOf(a.m12636a()) : null);
            logger.finer(sb2.toString());
            if (a != null) {
                int a2 = a.m12636a();
                byteBuffer.position(position + a2);
                i3 += a2;
            } else {
                i3 = (int) (i3 + position2);
            }
            if (a instanceof C8383e) {
                this.f27248n = (C8383e) a;
            }
        }
        int position3 = byteBuffer.position();
        if (m12636a() > i3 + 2) {
            AbstractC8380b a3 = C8390l.m12593a(-1, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = f27237q;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a3);
            sb3.append(" - ESDescriptor2 read: ");
            sb3.append(position4);
            sb3.append(", size: ");
            sb3.append(a3 != null ? Integer.valueOf(a3.m12636a()) : null);
            logger2.finer(sb3.toString());
            if (a3 != null) {
                int a4 = a3.m12636a();
                byteBuffer.position(position3 + a4);
                i3 += a4;
            } else {
                i3 = (int) (i3 + position4);
            }
            if (a3 instanceof C8392n) {
                this.f27249o = (C8392n) a3;
            }
        } else {
            f27237q.warning("SLConfigDescriptor is missing!");
        }
        while (m12636a() - i3 > 2) {
            int position5 = byteBuffer.position();
            AbstractC8380b a5 = C8390l.m12593a(-1, byteBuffer);
            long position6 = byteBuffer.position() - position5;
            Logger logger3 = f27237q;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a5);
            sb4.append(" - ESDescriptor3 read: ");
            sb4.append(position6);
            sb4.append(", size: ");
            sb4.append(a5 != null ? Integer.valueOf(a5.m12636a()) : null);
            logger3.finer(sb4.toString());
            if (a5 != null) {
                int a6 = a5.m12636a();
                byteBuffer.position(position5 + a6);
                i3 += a6;
            } else {
                i3 = (int) (i3 + position6);
            }
            this.f27250p.add(a5);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8386h hVar = (C8386h) obj;
        if (this.f27240f != hVar.f27240f || this.f27243i != hVar.f27243i || this.f27246l != hVar.f27246l || this.f27238d != hVar.f27238d || this.f27247m != hVar.f27247m || this.f27241g != hVar.f27241g || this.f27245k != hVar.f27245k || this.f27239e != hVar.f27239e || this.f27242h != hVar.f27242h) {
            return false;
        }
        String str = this.f27244j;
        if (str == null ? hVar.f27244j != null : !str.equals(hVar.f27244j)) {
            return false;
        }
        C8383e eVar = this.f27248n;
        if (eVar == null ? hVar.f27248n != null : !eVar.equals(hVar.f27248n)) {
            return false;
        }
        List<AbstractC8380b> list = this.f27250p;
        if (list == null ? hVar.f27250p != null : !list.equals(hVar.f27250p)) {
            return false;
        }
        C8392n nVar = this.f27249o;
        C8392n nVar2 = hVar.f27249o;
        return nVar == null ? nVar2 == null : nVar.equals(nVar2);
    }

    public C8383e m12611f() {
        return this.f27248n;
    }

    public int m12610g() {
        return this.f27246l;
    }

    public int m12609h() {
        return this.f27238d;
    }

    public int hashCode() {
        int i = ((((((((((this.f27238d * 31) + this.f27239e) * 31) + this.f27240f) * 31) + this.f27241g) * 31) + this.f27242h) * 31) + this.f27243i) * 31;
        String str = this.f27244j;
        int i2 = 0;
        int hashCode = (((((((i + (str != null ? str.hashCode() : 0)) * 31) + this.f27245k) * 31) + this.f27246l) * 31) + this.f27247m) * 31;
        C8383e eVar = this.f27248n;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C8392n nVar = this.f27249o;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        List<AbstractC8380b> list = this.f27250p;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public List<AbstractC8380b> m12608i() {
        return this.f27250p;
    }

    public int m12607j() {
        return this.f27245k;
    }

    public C8392n m12606k() {
        return this.f27249o;
    }

    public int m12605l() {
        return this.f27239e;
    }

    public int m12604m() {
        return this.f27242h;
    }

    public int m12603n() {
        return this.f27240f;
    }

    public int m12602o() {
        return this.f27243i;
    }

    public String m12601p() {
        return this.f27244j;
    }

    public int m12600q() {
        return this.f27247m;
    }

    public int m12599r() {
        return this.f27241g;
    }

    public ByteBuffer m12598s() {
        ByteBuffer allocate = ByteBuffer.allocate(m12597t());
        C8634g.m11850j(allocate, 3);
        C8634g.m11850j(allocate, m12597t() - 2);
        C8634g.m11855e(allocate, this.f27238d);
        C8634g.m11850j(allocate, (this.f27239e << 7) | (this.f27240f << 6) | (this.f27241g << 5) | (this.f27242h & 31));
        if (this.f27239e > 0) {
            C8634g.m11855e(allocate, this.f27246l);
        }
        if (this.f27240f > 0) {
            C8634g.m11850j(allocate, this.f27243i);
            C8634g.m11849k(allocate, this.f27244j);
        }
        if (this.f27241g > 0) {
            C8634g.m11855e(allocate, this.f27247m);
        }
        ByteBuffer o = this.f27248n.m12619o();
        ByteBuffer f = this.f27249o.m12592f();
        allocate.put(o.array());
        allocate.put(f.array());
        return allocate;
    }

    public int m12597t() {
        int i = this.f27239e > 0 ? 7 : 5;
        if (this.f27240f > 0) {
            i += this.f27243i + 1;
        }
        if (this.f27241g > 0) {
            i += 2;
        }
        return i + this.f27248n.m12618p() + this.f27249o.m12591g();
    }

    @Override
    public String toString() {
        return "ESDescriptor{esId=" + this.f27238d + ", streamDependenceFlag=" + this.f27239e + ", URLFlag=" + this.f27240f + ", oCRstreamFlag=" + this.f27241g + ", streamPriority=" + this.f27242h + ", URLLength=" + this.f27243i + ", URLString='" + this.f27244j + "', remoteODFlag=" + this.f27245k + ", dependsOnEsId=" + this.f27246l + ", oCREsId=" + this.f27247m + ", decoderConfigDescriptor=" + this.f27248n + ", slConfigDescriptor=" + this.f27249o + '}';
    }

    public void m12596u(C8383e eVar) {
        this.f27248n = eVar;
    }

    public void m12595v(int i) {
        this.f27238d = i;
    }

    public void m12594w(C8392n nVar) {
        this.f27249o = nVar;
    }
}
