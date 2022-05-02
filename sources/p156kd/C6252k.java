package p156kd;

import gd.C4779t2;
import p225pd.C8111a;

public class C6252k extends C6246h {
    public C6246h f19713a0;
    public long f19714b0;
    public boolean f19715c0;

    public C6252k(C6246h hVar, boolean z, long j) {
        super(hVar.f19695R, hVar.f19704a);
        m20909l0();
        this.f19713a0 = hVar;
        this.f19714b0 = j;
        this.f19715c0 = z;
    }

    public static String m20879D0(C8111a aVar) {
        return m20878E0(aVar.m13573l(), aVar.m13576i());
    }

    public static String m20878E0(boolean z, long j) {
        return C4779t2.m25668J0(!z).getPath() + "/temp_" + j + ".jpg";
    }

    @Override
    public int mo20873D() {
        return this.f19713a0.mo20873D();
    }

    public C6246h m20877F0() {
        return this.f19713a0;
    }

    @Override
    public boolean mo20866J() {
        return this.f19713a0.mo20866J();
    }

    @Override
    public String mo20769d() {
        return "filtered_" + this.f19714b0;
    }

    @Override
    public String mo20876q() {
        return m20878E0(this.f19715c0, this.f19714b0);
    }

    @Override
    public void mo20875q0(int i) {
        this.f19713a0.mo20875q0(i);
    }

    @Override
    public int mo20874x() {
        return this.f19713a0.mo20874x();
    }
}
