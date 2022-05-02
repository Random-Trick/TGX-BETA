package p191n8;

import java.util.Date;
import p345y8.C10453g;

public class C7308h implements Cloneable {
    public double f23205O;
    public double f23206P;
    public float f23207Q;
    public int f23210T;
    public long f23212b;
    public String f23211a = "eng";
    public Date f23213c = new Date();
    public Date f23203M = new Date();
    public C10453g f23204N = C10453g.f33526j;
    public long f23208R = 1;
    public int f23209S = 0;

    public Date m17087a() {
        return this.f23203M;
    }

    public int m17086b() {
        return this.f23209S;
    }

    public double m17085c() {
        return this.f23206P;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String m17084d() {
        return this.f23211a;
    }

    public int m17083e() {
        return this.f23210T;
    }

    public C10453g m17082f() {
        return this.f23204N;
    }

    public long m17081g() {
        return this.f23212b;
    }

    public long m17080h() {
        return this.f23208R;
    }

    public float m17079i() {
        return this.f23207Q;
    }

    public double m17078j() {
        return this.f23205O;
    }

    public void m17077k(Date date) {
        this.f23203M = date;
    }

    public void m17076l(double d) {
        this.f23206P = d;
    }

    public void m17075n(String str) {
        this.f23211a = str;
    }

    public void m17074o(int i) {
        this.f23210T = i;
    }

    public void m17073p(C10453g gVar) {
        this.f23204N = gVar;
    }

    public void m17072q(Date date) {
        this.f23213c = date;
    }

    public void m17071r(long j) {
        this.f23212b = j;
    }

    public void m17070s(long j) {
        this.f23208R = j;
    }

    public void m17069u(double d) {
        this.f23205O = d;
    }
}
