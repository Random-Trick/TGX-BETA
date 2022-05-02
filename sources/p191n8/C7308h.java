package p191n8;

import java.util.Date;
import p345y8.C10453g;

public class C7308h implements Cloneable {
    public double f23202O;
    public double f23203P;
    public float f23204Q;
    public int f23207T;
    public long f23209b;
    public String f23208a = "eng";
    public Date f23210c = new Date();
    public Date f23200M = new Date();
    public C10453g f23201N = C10453g.f33523j;
    public long f23205R = 1;
    public int f23206S = 0;

    public Date m17087a() {
        return this.f23200M;
    }

    public int m17086b() {
        return this.f23206S;
    }

    public double m17085c() {
        return this.f23203P;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String m17084d() {
        return this.f23208a;
    }

    public int m17083e() {
        return this.f23207T;
    }

    public C10453g m17082f() {
        return this.f23201N;
    }

    public long m17081g() {
        return this.f23209b;
    }

    public long m17080h() {
        return this.f23205R;
    }

    public float m17079i() {
        return this.f23204Q;
    }

    public double m17078j() {
        return this.f23202O;
    }

    public void m17077k(Date date) {
        this.f23200M = date;
    }

    public void m17076l(double d) {
        this.f23203P = d;
    }

    public void m17075n(String str) {
        this.f23208a = str;
    }

    public void m17074o(int i) {
        this.f23207T = i;
    }

    public void m17073p(C10453g gVar) {
        this.f23201N = gVar;
    }

    public void m17072q(Date date) {
        this.f23210c = date;
    }

    public void m17071r(long j) {
        this.f23209b = j;
    }

    public void m17070s(long j) {
        this.f23205R = j;
    }

    public void m17069u(double d) {
        this.f23202O = d;
    }
}
