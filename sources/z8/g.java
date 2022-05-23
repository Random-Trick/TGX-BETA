package z8;

import java.nio.ByteBuffer;
import s2.e;

public class g {
    public static final g f27034j = new g(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final g f27035k = new g(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final g f27036l = new g(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final g f27037m = new g(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public double f27038a;
    public double f27039b;
    public double f27040c;
    public double f27041d;
    public double f27042e;
    public double f27043f;
    public double f27044g;
    public double f27045h;
    public double f27046i;

    public g(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f27038a = d14;
        this.f27039b = d15;
        this.f27040c = d16;
        this.f27041d = d10;
        this.f27042e = d11;
        this.f27043f = d12;
        this.f27044g = d13;
        this.f27045h = d17;
        this.f27046i = d18;
    }

    public static g a(ByteBuffer byteBuffer) {
        return b(e.d(byteBuffer), e.d(byteBuffer), e.c(byteBuffer), e.d(byteBuffer), e.d(byteBuffer), e.c(byteBuffer), e.d(byteBuffer), e.d(byteBuffer), e.c(byteBuffer));
    }

    public static g b(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        return new g(d10, d11, d13, d14, d12, d15, d18, d16, d17);
    }

    public void c(ByteBuffer byteBuffer) {
        s2.g.b(byteBuffer, this.f27041d);
        s2.g.b(byteBuffer, this.f27042e);
        s2.g.a(byteBuffer, this.f27038a);
        s2.g.b(byteBuffer, this.f27043f);
        s2.g.b(byteBuffer, this.f27044g);
        s2.g.a(byteBuffer, this.f27039b);
        s2.g.b(byteBuffer, this.f27045h);
        s2.g.b(byteBuffer, this.f27046i);
        s2.g.a(byteBuffer, this.f27040c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return Double.compare(gVar.f27041d, this.f27041d) == 0 && Double.compare(gVar.f27042e, this.f27042e) == 0 && Double.compare(gVar.f27043f, this.f27043f) == 0 && Double.compare(gVar.f27044g, this.f27044g) == 0 && Double.compare(gVar.f27045h, this.f27045h) == 0 && Double.compare(gVar.f27046i, this.f27046i) == 0 && Double.compare(gVar.f27038a, this.f27038a) == 0 && Double.compare(gVar.f27039b, this.f27039b) == 0 && Double.compare(gVar.f27040c, this.f27040c) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f27038a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f27039b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f27040c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f27041d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f27042e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f27043f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f27044g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f27045h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f27046i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public String toString() {
        if (equals(f27034j)) {
            return "Rotate 0°";
        }
        if (equals(f27035k)) {
            return "Rotate 90°";
        }
        if (equals(f27036l)) {
            return "Rotate 180°";
        }
        if (equals(f27037m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f27038a + ", v=" + this.f27039b + ", w=" + this.f27040c + ", a=" + this.f27041d + ", b=" + this.f27042e + ", c=" + this.f27043f + ", d=" + this.f27044g + ", tx=" + this.f27045h + ", ty=" + this.f27046i + '}';
    }
}
