package p156kd;

import gd.C4779t2;
import p225pd.C8111a;

public class C6252k extends C6246h {
    public C6246h f19713a0;
    public long f19714b0;
    public boolean f19715c0;

    public C6252k(C6246h hVar, boolean z, long j) {
        super(hVar.f19695R, hVar.f19704a);
        m20908l0();
        this.f19713a0 = hVar;
        this.f19714b0 = j;
        this.f19715c0 = z;
    }

    public static String m20878D0(C8111a aVar) {
        return m20877E0(aVar.m13574l(), aVar.m13577i());
    }

    public static String m20877E0(boolean z, long j) {
        return C4779t2.m25667J0(!z).getPath() + "/temp_" + j + ".jpg";
    }

    @Override
    public int mo20872D() {
        return this.f19713a0.mo20872D();
    }

    public C6246h m20876F0() {
        return this.f19713a0;
    }

    @Override
    public boolean mo20865J() {
        return this.f19713a0.mo20865J();
    }

    @Override
    public String mo20768d() {
        return "filtered_" + this.f19714b0;
    }

    @Override
    public String mo20875q() {
        return m20877E0(this.f19715c0, this.f19714b0);
    }

    @Override
    public void mo20874q0(int i) {
        this.f19713a0.mo20874q0(i);
    }

    @Override
    public int mo20873x() {
        return this.f19713a0.mo20873x();
    }
}
