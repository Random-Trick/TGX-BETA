package ld;

import hd.t2;
import qd.a;

public class k extends h {
    public h f16370a0;
    public long f16371b0;
    public boolean f16372c0;

    public k(h hVar, boolean z10, long j10) {
        super(hVar.R, hVar.f16361a);
        l0();
        this.f16370a0 = hVar;
        this.f16371b0 = j10;
        this.f16372c0 = z10;
    }

    public static String D0(a aVar) {
        return E0(aVar.l(), aVar.i());
    }

    public static String E0(boolean z10, long j10) {
        return t2.J0(!z10).getPath() + "/temp_" + j10 + ".jpg";
    }

    @Override
    public int D() {
        return this.f16370a0.D();
    }

    public h F0() {
        return this.f16370a0;
    }

    @Override
    public boolean J() {
        return this.f16370a0.J();
    }

    @Override
    public String d() {
        return "filtered_" + this.f16371b0;
    }

    @Override
    public String q() {
        return E0(this.f16372c0, this.f16371b0);
    }

    @Override
    public void q0(int i10) {
        this.f16370a0.q0(i10);
    }

    @Override
    public int x() {
        return this.f16370a0.x();
    }
}
