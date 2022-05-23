package o8;

import java.util.Date;
import z8.g;

public class h implements Cloneable {
    public double O;
    public double P;
    public float Q;
    public int T;
    public long f19325b;
    public String f19324a = "eng";
    public Date f19326c = new Date();
    public Date M = new Date();
    public g N = g.f27034j;
    public long R = 1;
    public int S = 0;

    public Date a() {
        return this.M;
    }

    public int b() {
        return this.S;
    }

    public double c() {
        return this.P;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String d() {
        return this.f19324a;
    }

    public int e() {
        return this.T;
    }

    public g f() {
        return this.N;
    }

    public long g() {
        return this.f19325b;
    }

    public long h() {
        return this.R;
    }

    public float i() {
        return this.Q;
    }

    public double j() {
        return this.O;
    }

    public void k(Date date) {
        this.M = date;
    }

    public void l(double d10) {
        this.P = d10;
    }

    public void n(String str) {
        this.f19324a = str;
    }

    public void o(int i10) {
        this.T = i10;
    }

    public void p(g gVar) {
        this.N = gVar;
    }

    public void q(Date date) {
        this.f19326c = date;
    }

    public void r(long j10) {
        this.f19325b = j10;
    }

    public void t(long j10) {
        this.R = j10;
    }

    public void u(double d10) {
        this.O = d10;
    }
}
