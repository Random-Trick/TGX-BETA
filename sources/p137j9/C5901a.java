package p137j9;

import p064e9.C4166a;
import p106h9.C5036d;
import p106h9.C5037e;
import qa.C8298k;

public class C5901a {
    public int f18801a = -1;
    public int f18802b = -1;
    public C4166a f18803c;
    public C5037e f18804d;

    public C5901a(C4166a aVar, C5037e eVar) {
        C8298k.m12933e(aVar, "eglCore");
        C8298k.m12933e(eVar, "eglSurface");
        this.f18803c = aVar;
        this.f18804d = eVar;
    }

    public final C4166a m21869a() {
        return this.f18803c;
    }

    public final C5037e m21868b() {
        return this.f18804d;
    }

    public final void m21867c() {
        this.f18803c.m28630b(this.f18804d);
    }

    public void mo21864d() {
        this.f18803c.m28628d(this.f18804d);
        this.f18804d = C5036d.m24233h();
        this.f18802b = -1;
        this.f18801a = -1;
    }

    public final void m21866e(long j) {
        this.f18803c.m28627e(this.f18804d, j);
    }
}
