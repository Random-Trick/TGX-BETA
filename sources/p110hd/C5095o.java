package p110hd;

import p181mb.AbstractC6811b;
import p181mb.C6810a;

public class C5095o implements AbstractC6811b {
    public int f17131a;
    public int f17132b;

    public C5095o() {
    }

    @Override
    public void mo18913a(C6810a aVar) {
        this.f17131a = aVar.m18921s();
        this.f17132b = aVar.m18921s();
    }

    @Override
    public int mo18912b() {
        return C6810a.m18917w(this.f17131a) + C6810a.m18917w(this.f17132b);
    }

    @Override
    public void mo18911c(C6810a aVar) {
        aVar.m18941M(this.f17131a);
        aVar.m18941M(this.f17132b);
    }

    public C5095o(int i, int i2) {
        this.f17131a = i;
        this.f17132b = i2;
    }
}
