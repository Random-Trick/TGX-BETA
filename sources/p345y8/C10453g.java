package p345y8;

import java.nio.ByteBuffer;
import p258s2.C8632e;
import p258s2.C8634g;

public class C10453g {
    public static final C10453g f33523j = new C10453g(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final C10453g f33524k = new C10453g(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final C10453g f33525l = new C10453g(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final C10453g f33526m = new C10453g(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public double f33527a;
    public double f33528b;
    public double f33529c;
    public double f33530d;
    public double f33531e;
    public double f33532f;
    public double f33533g;
    public double f33534h;
    public double f33535i;

    public C10453g(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f33527a = d5;
        this.f33528b = d6;
        this.f33529c = d7;
        this.f33530d = d;
        this.f33531e = d2;
        this.f33532f = d3;
        this.f33533g = d4;
        this.f33534h = d8;
        this.f33535i = d9;
    }

    public static C10453g m5095a(ByteBuffer byteBuffer) {
        return m5094b(C8632e.m11872d(byteBuffer), C8632e.m11872d(byteBuffer), C8632e.m11873c(byteBuffer), C8632e.m11872d(byteBuffer), C8632e.m11872d(byteBuffer), C8632e.m11873c(byteBuffer), C8632e.m11872d(byteBuffer), C8632e.m11872d(byteBuffer), C8632e.m11873c(byteBuffer));
    }

    public static C10453g m5094b(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return new C10453g(d, d2, d4, d5, d3, d6, d9, d7, d8);
    }

    public void m5093c(ByteBuffer byteBuffer) {
        C8634g.m11859b(byteBuffer, this.f33530d);
        C8634g.m11859b(byteBuffer, this.f33531e);
        C8634g.m11860a(byteBuffer, this.f33527a);
        C8634g.m11859b(byteBuffer, this.f33532f);
        C8634g.m11859b(byteBuffer, this.f33533g);
        C8634g.m11860a(byteBuffer, this.f33528b);
        C8634g.m11859b(byteBuffer, this.f33534h);
        C8634g.m11859b(byteBuffer, this.f33535i);
        C8634g.m11860a(byteBuffer, this.f33529c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10453g gVar = (C10453g) obj;
        return Double.compare(gVar.f33530d, this.f33530d) == 0 && Double.compare(gVar.f33531e, this.f33531e) == 0 && Double.compare(gVar.f33532f, this.f33532f) == 0 && Double.compare(gVar.f33533g, this.f33533g) == 0 && Double.compare(gVar.f33534h, this.f33534h) == 0 && Double.compare(gVar.f33535i, this.f33535i) == 0 && Double.compare(gVar.f33527a, this.f33527a) == 0 && Double.compare(gVar.f33528b, this.f33528b) == 0 && Double.compare(gVar.f33529c, this.f33529c) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f33527a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f33528b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f33529c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f33530d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f33531e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f33532f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f33533g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f33534h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f33535i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public String toString() {
        if (equals(f33523j)) {
            return "Rotate 0°";
        }
        if (equals(f33524k)) {
            return "Rotate 90°";
        }
        if (equals(f33525l)) {
            return "Rotate 180°";
        }
        if (equals(f33526m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f33527a + ", v=" + this.f33528b + ", w=" + this.f33529c + ", a=" + this.f33530d + ", b=" + this.f33531e + ", c=" + this.f33532f + ", d=" + this.f33533g + ", tx=" + this.f33534h + ", ty=" + this.f33535i + '}';
    }
}
