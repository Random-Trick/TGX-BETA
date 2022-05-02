package p249r8;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p258s2.C8632e;
import p258s2.C8634g;

@AbstractC8385g(tags = {3})
public class C8386h extends AbstractC8380b {
    public static Logger f27234q = Logger.getLogger(C8386h.class.getName());
    public int f27235d;
    public int f27236e;
    public int f27237f;
    public int f27238g;
    public int f27239h;
    public String f27241j;
    public int f27242k;
    public int f27243l;
    public int f27244m;
    public C8383e f27245n;
    public C8392n f27246o;
    public int f27240i = 0;
    public List<AbstractC8380b> f27247p = new ArrayList();

    @Override
    public void mo12590e(ByteBuffer byteBuffer) {
        this.f27235d = C8632e.m11867i(byteBuffer);
        int n = C8632e.m11862n(byteBuffer);
        int i = n >>> 7;
        this.f27236e = i;
        this.f27237f = (n >>> 6) & 1;
        this.f27238g = (n >>> 5) & 1;
        this.f27239h = n & 31;
        if (i == 1) {
            this.f27243l = C8632e.m11867i(byteBuffer);
        }
        if (this.f27237f == 1) {
            int n2 = C8632e.m11862n(byteBuffer);
            this.f27240i = n2;
            this.f27241j = C8632e.m11868h(byteBuffer, n2);
        }
        if (this.f27238g == 1) {
            this.f27244m = C8632e.m11867i(byteBuffer);
        }
        int i2 = 0;
        int b = m12636b() + 1 + 2 + 1 + (this.f27236e == 1 ? 2 : 0) + (this.f27237f == 1 ? this.f27240i + 1 : 0);
        if (this.f27238g == 1) {
            i2 = 2;
        }
        int i3 = b + i2;
        int position = byteBuffer.position();
        if (m12637a() > i3 + 2) {
            AbstractC8380b a = C8390l.m12594a(-1, byteBuffer);
            long position2 = byteBuffer.position() - position;
            Logger logger = f27234q;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a);
            sb2.append(" - ESDescriptor1 read: ");
            sb2.append(position2);
            sb2.append(", size: ");
            sb2.append(a != null ? Integer.valueOf(a.m12637a()) : null);
            logger.finer(sb2.toString());
            if (a != null) {
                int a2 = a.m12637a();
                byteBuffer.position(position + a2);
                i3 += a2;
            } else {
                i3 = (int) (i3 + position2);
            }
            if (a instanceof C8383e) {
                this.f27245n = (C8383e) a;
            }
        }
        int position3 = byteBuffer.position();
        if (m12637a() > i3 + 2) {
            AbstractC8380b a3 = C8390l.m12594a(-1, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = f27234q;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a3);
            sb3.append(" - ESDescriptor2 read: ");
            sb3.append(position4);
            sb3.append(", size: ");
            sb3.append(a3 != null ? Integer.valueOf(a3.m12637a()) : null);
            logger2.finer(sb3.toString());
            if (a3 != null) {
                int a4 = a3.m12637a();
                byteBuffer.position(position3 + a4);
                i3 += a4;
            } else {
                i3 = (int) (i3 + position4);
            }
            if (a3 instanceof C8392n) {
                this.f27246o = (C8392n) a3;
            }
        } else {
            f27234q.warning("SLConfigDescriptor is missing!");
        }
        while (m12637a() - i3 > 2) {
            int position5 = byteBuffer.position();
            AbstractC8380b a5 = C8390l.m12594a(-1, byteBuffer);
            long position6 = byteBuffer.position() - position5;
            Logger logger3 = f27234q;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a5);
            sb4.append(" - ESDescriptor3 read: ");
            sb4.append(position6);
            sb4.append(", size: ");
            sb4.append(a5 != null ? Integer.valueOf(a5.m12637a()) : null);
            logger3.finer(sb4.toString());
            if (a5 != null) {
                int a6 = a5.m12637a();
                byteBuffer.position(position5 + a6);
                i3 += a6;
            } else {
                i3 = (int) (i3 + position6);
            }
            this.f27247p.add(a5);
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
        if (this.f27237f != hVar.f27237f || this.f27240i != hVar.f27240i || this.f27243l != hVar.f27243l || this.f27235d != hVar.f27235d || this.f27244m != hVar.f27244m || this.f27238g != hVar.f27238g || this.f27242k != hVar.f27242k || this.f27236e != hVar.f27236e || this.f27239h != hVar.f27239h) {
            return false;
        }
        String str = this.f27241j;
        if (str == null ? hVar.f27241j != null : !str.equals(hVar.f27241j)) {
            return false;
        }
        C8383e eVar = this.f27245n;
        if (eVar == null ? hVar.f27245n != null : !eVar.equals(hVar.f27245n)) {
            return false;
        }
        List<AbstractC8380b> list = this.f27247p;
        if (list == null ? hVar.f27247p != null : !list.equals(hVar.f27247p)) {
            return false;
        }
        C8392n nVar = this.f27246o;
        C8392n nVar2 = hVar.f27246o;
        return nVar == null ? nVar2 == null : nVar.equals(nVar2);
    }

    public C8383e m12612f() {
        return this.f27245n;
    }

    public int m12611g() {
        return this.f27243l;
    }

    public int m12610h() {
        return this.f27235d;
    }

    public int hashCode() {
        int i = ((((((((((this.f27235d * 31) + this.f27236e) * 31) + this.f27237f) * 31) + this.f27238g) * 31) + this.f27239h) * 31) + this.f27240i) * 31;
        String str = this.f27241j;
        int i2 = 0;
        int hashCode = (((((((i + (str != null ? str.hashCode() : 0)) * 31) + this.f27242k) * 31) + this.f27243l) * 31) + this.f27244m) * 31;
        C8383e eVar = this.f27245n;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C8392n nVar = this.f27246o;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        List<AbstractC8380b> list = this.f27247p;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public List<AbstractC8380b> m12609i() {
        return this.f27247p;
    }

    public int m12608j() {
        return this.f27242k;
    }

    public C8392n m12607k() {
        return this.f27246o;
    }

    public int m12606l() {
        return this.f27236e;
    }

    public int m12605m() {
        return this.f27239h;
    }

    public int m12604n() {
        return this.f27237f;
    }

    public int m12603o() {
        return this.f27240i;
    }

    public String m12602p() {
        return this.f27241j;
    }

    public int m12601q() {
        return this.f27244m;
    }

    public int m12600r() {
        return this.f27238g;
    }

    public ByteBuffer m12599s() {
        ByteBuffer allocate = ByteBuffer.allocate(m12598t());
        C8634g.m11851j(allocate, 3);
        C8634g.m11851j(allocate, m12598t() - 2);
        C8634g.m11856e(allocate, this.f27235d);
        C8634g.m11851j(allocate, (this.f27236e << 7) | (this.f27237f << 6) | (this.f27238g << 5) | (this.f27239h & 31));
        if (this.f27236e > 0) {
            C8634g.m11856e(allocate, this.f27243l);
        }
        if (this.f27237f > 0) {
            C8634g.m11851j(allocate, this.f27240i);
            C8634g.m11850k(allocate, this.f27241j);
        }
        if (this.f27238g > 0) {
            C8634g.m11856e(allocate, this.f27244m);
        }
        ByteBuffer o = this.f27245n.m12620o();
        ByteBuffer f = this.f27246o.m12593f();
        allocate.put(o.array());
        allocate.put(f.array());
        return allocate;
    }

    public int m12598t() {
        int i = this.f27236e > 0 ? 7 : 5;
        if (this.f27237f > 0) {
            i += this.f27240i + 1;
        }
        if (this.f27238g > 0) {
            i += 2;
        }
        return i + this.f27245n.m12619p() + this.f27246o.m12592g();
    }

    @Override
    public String toString() {
        return "ESDescriptor{esId=" + this.f27235d + ", streamDependenceFlag=" + this.f27236e + ", URLFlag=" + this.f27237f + ", oCRstreamFlag=" + this.f27238g + ", streamPriority=" + this.f27239h + ", URLLength=" + this.f27240i + ", URLString='" + this.f27241j + "', remoteODFlag=" + this.f27242k + ", dependsOnEsId=" + this.f27243l + ", oCREsId=" + this.f27244m + ", decoderConfigDescriptor=" + this.f27245n + ", slConfigDescriptor=" + this.f27246o + '}';
    }

    public void m12597u(C8383e eVar) {
        this.f27245n = eVar;
    }

    public void m12596v(int i) {
        this.f27235d = i;
    }

    public void m12595w(C8392n nVar) {
        this.f27246o = nVar;
    }
}
