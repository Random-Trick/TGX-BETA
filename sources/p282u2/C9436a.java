package p282u2;

import java.nio.ByteBuffer;
import p258s2.C8632e;
import p258s2.C8634g;

public class C9436a {
    public byte f30563a;
    public byte f30564b;
    public byte f30565c;
    public byte f30566d;
    public byte f30567e;
    public byte f30568f;
    public boolean f30569g;
    public int f30570h;

    public C9436a() {
    }

    public void m8670a(ByteBuffer byteBuffer) {
        C8634g.m11853g(byteBuffer, (this.f30563a << 28) | 0 | (this.f30564b << 26) | (this.f30565c << 24) | (this.f30566d << 22) | (this.f30567e << 20) | (this.f30568f << 17) | ((this.f30569g ? 1 : 0) << 16) | this.f30570h);
    }

    public boolean m8669b() {
        return this.f30569g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9436a aVar = (C9436a) obj;
        return this.f30564b == aVar.f30564b && this.f30563a == aVar.f30563a && this.f30570h == aVar.f30570h && this.f30565c == aVar.f30565c && this.f30567e == aVar.f30567e && this.f30566d == aVar.f30566d && this.f30569g == aVar.f30569g && this.f30568f == aVar.f30568f;
    }

    public int hashCode() {
        return (((((((((((((this.f30563a * 31) + this.f30564b) * 31) + this.f30565c) * 31) + this.f30566d) * 31) + this.f30567e) * 31) + this.f30568f) * 31) + (this.f30569g ? 1 : 0)) * 31) + this.f30570h;
    }

    public String toString() {
        return "SampleFlags{reserved=" + ((int) this.f30563a) + ", isLeading=" + ((int) this.f30564b) + ", depOn=" + ((int) this.f30565c) + ", isDepOn=" + ((int) this.f30566d) + ", hasRedundancy=" + ((int) this.f30567e) + ", padValue=" + ((int) this.f30568f) + ", isDiffSample=" + this.f30569g + ", degradPrio=" + this.f30570h + '}';
    }

    public C9436a(ByteBuffer byteBuffer) {
        long k = C8632e.m11864k(byteBuffer);
        this.f30563a = (byte) (((-268435456) & k) >> 28);
        this.f30564b = (byte) ((201326592 & k) >> 26);
        this.f30565c = (byte) ((50331648 & k) >> 24);
        this.f30566d = (byte) ((12582912 & k) >> 22);
        this.f30567e = (byte) ((3145728 & k) >> 20);
        this.f30568f = (byte) ((917504 & k) >> 17);
        this.f30569g = ((65536 & k) >> 16) > 0;
        this.f30570h = (int) (k & 65535);
    }
}
