package p265s9;

import ba.AbstractC1296b;
import java.nio.ByteBuffer;
import p107ha.C5048h;
import p107ha.C5060q;
import p192n9.EnumC7313d;
import p289u9.AbstractC9460a;
import p289u9.AbstractC9461b;
import p289u9.AbstractC9475i;
import p316w9.C10007i;
import qa.C8298k;

public final class C8702b extends AbstractC9460a<C5060q, AbstractC9461b, C8704d, AbstractC8703c> {
    public final C10007i f28044c = new C10007i("Reader");
    public final AbstractC9461b.C9462a f28045d = AbstractC9461b.f30688a;
    public final AbstractC1296b.C1297a f28046e = new AbstractC1296b.C1297a();
    public final AbstractC1296b f28047f;
    public final EnumC7313d f28048g;

    public C8702b(AbstractC1296b bVar, EnumC7313d dVar) {
        C8298k.m12933e(bVar, "source");
        C8298k.m12933e(dVar, "track");
        this.f28047f = bVar;
        this.f28048g = dVar;
    }

    public static final AbstractC8703c m11715l(C8702b bVar) {
        return bVar.m8580j();
    }

    @Override
    public AbstractC9475i<C8704d> mo5858g(AbstractC9475i.C9477b<C5060q> bVar, boolean z) {
        AbstractC9475i<C8704d> bVar2;
        C8298k.m12933e(bVar, "state");
        if (this.f28047f.mo6285j()) {
            this.f28044c.m6267c("Source is drained! Returning Eos as soon as possible.");
            C5048h<ByteBuffer, Integer> c = m11715l(this).mo11713c();
            if (c == null) {
                this.f28044c.m6262h("Returning State.Wait because buffer is null.");
                return AbstractC9475i.C9479d.f30718a;
            }
            ByteBuffer c2 = c.m24195c();
            int intValue = c.m24194d().intValue();
            ByteBuffer byteBuffer = c2;
            byteBuffer.limit(0);
            AbstractC1296b.C1297a aVar = this.f28046e;
            aVar.f4675a = byteBuffer;
            aVar.f4676b = false;
            aVar.f4678d = true;
            bVar2 = new AbstractC9475i.C9476a<>(new C8704d(aVar, intValue));
        } else if (!this.f28047f.mo6284k(this.f28048g)) {
            C10007i iVar = this.f28044c;
            iVar.m6267c("Returning State.Wait because source can't read " + this.f28048g + " right now.");
            return AbstractC9475i.C9479d.f30718a;
        } else {
            C5048h<ByteBuffer, Integer> c3 = m11715l(this).mo11713c();
            if (c3 == null) {
                this.f28044c.m6262h("Returning State.Wait because buffer is null.");
                return AbstractC9475i.C9479d.f30718a;
            }
            ByteBuffer c4 = c3.m24195c();
            int intValue2 = c3.m24194d().intValue();
            AbstractC1296b.C1297a aVar2 = this.f28046e;
            aVar2.f4675a = c4;
            this.f28047f.mo6289f(aVar2);
            bVar2 = new AbstractC9475i.C9477b<>(new C8704d(this.f28046e, intValue2));
        }
        return bVar2;
    }

    public AbstractC9461b.C9462a mo5860e() {
        return this.f28045d;
    }
}
