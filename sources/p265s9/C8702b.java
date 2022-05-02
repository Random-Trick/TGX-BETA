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
    public final C10007i f28041c = new C10007i("Reader");
    public final AbstractC9461b.C9462a f28042d = AbstractC9461b.f30685a;
    public final AbstractC1296b.C1297a f28043e = new AbstractC1296b.C1297a();
    public final AbstractC1296b f28044f;
    public final EnumC7313d f28045g;

    public C8702b(AbstractC1296b bVar, EnumC7313d dVar) {
        C8298k.m12934e(bVar, "source");
        C8298k.m12934e(dVar, "track");
        this.f28044f = bVar;
        this.f28045g = dVar;
    }

    public static final AbstractC8703c m11716l(C8702b bVar) {
        return bVar.m8580j();
    }

    @Override
    public AbstractC9475i<C8704d> mo5858g(AbstractC9475i.C9477b<C5060q> bVar, boolean z) {
        AbstractC9475i<C8704d> bVar2;
        C8298k.m12934e(bVar, "state");
        if (this.f28044f.mo6285j()) {
            this.f28041c.m6267c("Source is drained! Returning Eos as soon as possible.");
            C5048h<ByteBuffer, Integer> c = m11716l(this).mo11714c();
            if (c == null) {
                this.f28041c.m6262h("Returning State.Wait because buffer is null.");
                return AbstractC9475i.C9479d.f30715a;
            }
            ByteBuffer c2 = c.m24194c();
            int intValue = c.m24193d().intValue();
            ByteBuffer byteBuffer = c2;
            byteBuffer.limit(0);
            AbstractC1296b.C1297a aVar = this.f28043e;
            aVar.f4675a = byteBuffer;
            aVar.f4676b = false;
            aVar.f4678d = true;
            bVar2 = new AbstractC9475i.C9476a<>(new C8704d(aVar, intValue));
        } else if (!this.f28044f.mo6284k(this.f28045g)) {
            C10007i iVar = this.f28041c;
            iVar.m6267c("Returning State.Wait because source can't read " + this.f28045g + " right now.");
            return AbstractC9475i.C9479d.f30715a;
        } else {
            C5048h<ByteBuffer, Integer> c3 = m11716l(this).mo11714c();
            if (c3 == null) {
                this.f28041c.m6262h("Returning State.Wait because buffer is null.");
                return AbstractC9475i.C9479d.f30715a;
            }
            ByteBuffer c4 = c3.m24194c();
            int intValue2 = c3.m24193d().intValue();
            AbstractC1296b.C1297a aVar2 = this.f28043e;
            aVar2.f4675a = c4;
            this.f28044f.mo6289f(aVar2);
            bVar2 = new AbstractC9475i.C9477b<>(new C8704d(this.f28043e, intValue2));
        }
        return bVar2;
    }

    public AbstractC9461b.C9462a mo5860e() {
        return this.f28042d;
    }
}
