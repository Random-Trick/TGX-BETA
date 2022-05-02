package p282u2;

import java.nio.ByteBuffer;
import p258s2.C8632e;
import p258s2.C8634g;

public class C9436a {
    public byte f30560a;
    public byte f30561b;
    public byte f30562c;
    public byte f30563d;
    public byte f30564e;
    public byte f30565f;
    public boolean f30566g;
    public int f30567h;

    public C9436a() {
    }

    public void m8670a(ByteBuffer byteBuffer) {
        C8634g.m11854g(byteBuffer, (this.f30560a << 28) | 0 | (this.f30561b << 26) | (this.f30562c << 24) | (this.f30563d << 22) | (this.f30564e << 20) | (this.f30565f << 17) | ((this.f30566g ? 1 : 0) << 16) | this.f30567h);
    }

    public boolean m8669b() {
        return this.f30566g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9436a aVar = (C9436a) obj;
        return this.f30561b == aVar.f30561b && this.f30560a == aVar.f30560a && this.f30567h == aVar.f30567h && this.f30562c == aVar.f30562c && this.f30564e == aVar.f30564e && this.f30563d == aVar.f30563d && this.f30566g == aVar.f30566g && this.f30565f == aVar.f30565f;
    }

    public int hashCode() {
        return (((((((((((((this.f30560a * 31) + this.f30561b) * 31) + this.f30562c) * 31) + this.f30563d) * 31) + this.f30564e) * 31) + this.f30565f) * 31) + (this.f30566g ? 1 : 0)) * 31) + this.f30567h;
    }

    public String toString() {
        return "SampleFlags{reserved=" + ((int) this.f30560a) + ", isLeading=" + ((int) this.f30561b) + ", depOn=" + ((int) this.f30562c) + ", isDepOn=" + ((int) this.f30563d) + ", hasRedundancy=" + ((int) this.f30564e) + ", padValue=" + ((int) this.f30565f) + ", isDiffSample=" + this.f30566g + ", degradPrio=" + this.f30567h + '}';
    }

    public C9436a(ByteBuffer byteBuffer) {
        long k = C8632e.m11865k(byteBuffer);
        this.f30560a = (byte) (((-268435456) & k) >> 28);
        this.f30561b = (byte) ((201326592 & k) >> 26);
        this.f30562c = (byte) ((50331648 & k) >> 24);
        this.f30563d = (byte) ((12582912 & k) >> 22);
        this.f30564e = (byte) ((3145728 & k) >> 20);
        this.f30565f = (byte) ((917504 & k) >> 17);
        this.f30566g = ((65536 & k) >> 16) > 0;
        this.f30567h = (int) (k & 65535);
    }
}
