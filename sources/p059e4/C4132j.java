package p059e4;

import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1234w;
import p059e4.AbstractC4134l;
import p059e4.C4120b;
import p059e4.C4157x;

public final class C4132j implements AbstractC4134l.AbstractC4136b {
    public boolean f13936b;
    public int f13935a = 0;
    public boolean f13937c = true;

    @Override
    public AbstractC4134l mo28647a(AbstractC4134l.C4135a aVar) {
        int i = this.f13935a;
        if ((i != 1 || C1216l0.f4526a < 23) && (i != 0 || C1216l0.f4526a < 31)) {
            return new C4157x.C4160c().mo28647a(aVar);
        }
        int h = C1234w.m37863h(aVar.f13945c.f20575U);
        String valueOf = String.valueOf(C1216l0.m37979d0(h));
        C1230s.m37884f("DefaultMediaCodecAdapterFactory", valueOf.length() != 0 ? "Creating an asynchronous MediaCodec adapter for track type ".concat(valueOf) : new String("Creating an asynchronous MediaCodec adapter for track type "));
        return new C4120b.C4122b(h, this.f13936b, this.f13937c).mo28647a(aVar);
    }
}
