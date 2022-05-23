package u2;

import java.nio.ByteBuffer;
import s2.e;
import s2.g;

public class a {
    public byte f23537a;
    public byte f23538b;
    public byte f23539c;
    public byte f23540d;
    public byte f23541e;
    public byte f23542f;
    public boolean f23543g;
    public int f23544h;

    public a() {
    }

    public void a(ByteBuffer byteBuffer) {
        g.g(byteBuffer, (this.f23537a << 28) | 0 | (this.f23538b << 26) | (this.f23539c << 24) | (this.f23540d << 22) | (this.f23541e << 20) | (this.f23542f << 17) | ((this.f23543g ? 1 : 0) << 16) | this.f23544h);
    }

    public boolean b() {
        return this.f23543g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23538b == aVar.f23538b && this.f23537a == aVar.f23537a && this.f23544h == aVar.f23544h && this.f23539c == aVar.f23539c && this.f23541e == aVar.f23541e && this.f23540d == aVar.f23540d && this.f23543g == aVar.f23543g && this.f23542f == aVar.f23542f;
    }

    public int hashCode() {
        return (((((((((((((this.f23537a * 31) + this.f23538b) * 31) + this.f23539c) * 31) + this.f23540d) * 31) + this.f23541e) * 31) + this.f23542f) * 31) + (this.f23543g ? 1 : 0)) * 31) + this.f23544h;
    }

    public String toString() {
        return "SampleFlags{reserved=" + ((int) this.f23537a) + ", isLeading=" + ((int) this.f23538b) + ", depOn=" + ((int) this.f23539c) + ", isDepOn=" + ((int) this.f23540d) + ", hasRedundancy=" + ((int) this.f23541e) + ", padValue=" + ((int) this.f23542f) + ", isDiffSample=" + this.f23543g + ", degradPrio=" + this.f23544h + '}';
    }

    public a(ByteBuffer byteBuffer) {
        long k10 = e.k(byteBuffer);
        this.f23537a = (byte) (((-268435456) & k10) >> 28);
        this.f23538b = (byte) ((201326592 & k10) >> 26);
        this.f23539c = (byte) ((50331648 & k10) >> 24);
        this.f23540d = (byte) ((12582912 & k10) >> 22);
        this.f23541e = (byte) ((3145728 & k10) >> 20);
        this.f23542f = (byte) ((917504 & k10) >> 17);
        this.f23543g = ((65536 & k10) >> 16) > 0;
        this.f23544h = (int) (k10 & 65535);
    }
}
