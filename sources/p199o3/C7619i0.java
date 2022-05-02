package p199o3;

import p199o3.AbstractC7611g;

public final class C7619i0 extends AbstractC7648y {
    @Override
    public void mo15305b(java.nio.ByteBuffer r10) {
        throw new UnsupportedOperationException("Method not decompiled: p199o3.C7619i0.mo15305b(java.nio.ByteBuffer):void");
    }

    @Override
    public AbstractC7611g.C7612a mo15304i(AbstractC7611g.C7612a aVar) {
        int i = aVar.f24363c;
        if (i != 3 && i != 2 && i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
            throw new AbstractC7611g.C7613b(aVar);
        } else if (i != 2) {
            return new AbstractC7611g.C7612a(aVar.f24361a, aVar.f24362b, 2);
        } else {
            return AbstractC7611g.C7612a.f24360e;
        }
    }
}
