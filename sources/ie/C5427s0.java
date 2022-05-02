package ie;

import p156kd.C6238b;
import p156kd.C6246h;
import p168ld.C6503j;

public class C5427s0 {
    public final int f17841a;
    public final int f17842b;
    public final C6246h f17843c;
    public final C6246h f17844d;
    public final C6246h f17845e;
    public final C6503j f17846f;

    public C5427s0(int i, int i2, C6246h hVar, C6246h hVar2, C6246h hVar3) {
        this.f17841a = i;
        this.f17842b = i2;
        this.f17843c = hVar;
        this.f17844d = hVar2;
        this.f17845e = hVar3;
        this.f17846f = null;
    }

    public int m22719a() {
        return this.f17842b;
    }

    public int m22718b() {
        return this.f17841a;
    }

    public boolean m22717c() {
        return this.f17846f != null;
    }

    public boolean m22716d() {
        return this.f17845e != null;
    }

    public void m22715e(int i, C6238b bVar) {
        bVar.m20991l(i).m20977j(this.f17843c, this.f17844d);
        if (this.f17845e != null) {
            bVar.m20992k(i).m20819G(this.f17845e);
        } else if (this.f17846f != null) {
            bVar.m20993j(i).m20231r(this.f17846f);
        }
    }

    public C5427s0(int i, int i2, C6246h hVar, C6246h hVar2, C6503j jVar) {
        this.f17841a = i;
        this.f17842b = i2;
        this.f17843c = hVar;
        this.f17844d = hVar2;
        this.f17846f = jVar;
        this.f17845e = null;
    }
}
