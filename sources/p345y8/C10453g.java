package p345y8;

import java.nio.ByteBuffer;
import p258s2.C8632e;
import p258s2.C8634g;

public class C10453g {
    public static final C10453g f33526j = new C10453g(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final C10453g f33527k = new C10453g(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final C10453g f33528l = new C10453g(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final C10453g f33529m = new C10453g(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public double f33530a;
    public double f33531b;
    public double f33532c;
    public double f33533d;
    public double f33534e;
    public double f33535f;
    public double f33536g;
    public double f33537h;
    public double f33538i;

    public C10453g(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f33530a = d5;
        this.f33531b = d6;
        this.f33532c = d7;
        this.f33533d = d;
        this.f33534e = d2;
        this.f33535f = d3;
        this.f33536g = d4;
        this.f33537h = d8;
        this.f33538i = d9;
    }

    public static C10453g m5095a(ByteBuffer byteBuffer) {
        return m5094b(C8632e.m11871d(byteBuffer), C8632e.m11871d(byteBuffer), C8632e.m11872c(byteBuffer), C8632e.m11871d(byteBuffer), C8632e.m11871d(byteBuffer), C8632e.m11872c(byteBuffer), C8632e.m11871d(byteBuffer), C8632e.m11871d(byteBuffer), C8632e.m11872c(byteBuffer));
    }

    public static C10453g m5094b(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return new C10453g(d, d2, d4, d5, d3, d6, d9, d7, d8);
    }

    public void m5093c(ByteBuffer byteBuffer) {
        C8634g.m11858b(byteBuffer, this.f33533d);
        C8634g.m11858b(byteBuffer, this.f33534e);
        C8634g.m11859a(byteBuffer, this.f33530a);
        C8634g.m11858b(byteBuffer, this.f33535f);
        C8634g.m11858b(byteBuffer, this.f33536g);
        C8634g.m11859a(byteBuffer, this.f33531b);
        C8634g.m11858b(byteBuffer, this.f33537h);
        C8634g.m11858b(byteBuffer, this.f33538i);
        C8634g.m11859a(byteBuffer, this.f33532c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10453g gVar = (C10453g) obj;
        return Double.compare(gVar.f33533d, this.f33533d) == 0 && Double.compare(gVar.f33534e, this.f33534e) == 0 && Double.compare(gVar.f33535f, this.f33535f) == 0 && Double.compare(gVar.f33536g, this.f33536g) == 0 && Double.compare(gVar.f33537h, this.f33537h) == 0 && Double.compare(gVar.f33538i, this.f33538i) == 0 && Double.compare(gVar.f33530a, this.f33530a) == 0 && Double.compare(gVar.f33531b, this.f33531b) == 0 && Double.compare(gVar.f33532c, this.f33532c) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f33530a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f33531b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f33532c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f33533d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f33534e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f33535f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f33536g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f33537h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f33538i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public String toString() {
        if (equals(f33526j)) {
            return "Rotate 0°";
        }
        if (equals(f33527k)) {
            return "Rotate 90°";
        }
        if (equals(f33528l)) {
            return "Rotate 180°";
        }
        if (equals(f33529m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f33530a + ", v=" + this.f33531b + ", w=" + this.f33532c + ", a=" + this.f33533d + ", b=" + this.f33534e + ", c=" + this.f33535f + ", d=" + this.f33536g + ", tx=" + this.f33537h + ", ty=" + this.f33538i + '}';
    }
}
