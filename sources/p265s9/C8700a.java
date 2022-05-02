package p265s9;

import android.media.MediaFormat;
import ba.AbstractC1296b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p107ha.C5048h;
import p107ha.C5054l;
import p107ha.C5060q;
import p289u9.AbstractC9475i;
import p289u9.AbstractC9480j;
import p316w9.C10007i;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8298k;

public final class C8700a implements AbstractC9480j<C8704d, AbstractC8703c, C8708h, AbstractC8707g>, AbstractC8703c {
    public final int f28039c;
    public final ByteBuffer f28040d;
    public final MediaFormat f28042f;
    public final C10007i f28038b = new C10007i("Bridge");
    public final C8700a f28041e = this;

    public static final class C8701a extends AbstractC8299l implements AbstractC8077a<C5060q> {
        public static final C8701a f28043b = new C8701a();

        public C8701a() {
            super(0);
        }

        @Override
        public C5060q mo4925b() {
            m11717f();
            return C5060q.f17066a;
        }

        public final void m11717f() {
        }
    }

    public C8700a(MediaFormat mediaFormat) {
        C8298k.m12933e(mediaFormat, "format");
        this.f28042f = mediaFormat;
        int integer = mediaFormat.getInteger("max-input-size");
        this.f28039c = integer;
        this.f28040d = ByteBuffer.allocateDirect(integer).order(ByteOrder.nativeOrder());
    }

    @Override
    public void mo5861a() {
        AbstractC9480j.C9481a.m8556b(this);
    }

    @Override
    public C5048h<ByteBuffer, Integer> mo11713c() {
        this.f28040d.clear();
        return C5054l.m24189a(this.f28040d, 0);
    }

    @Override
    public AbstractC9475i<C8708h> mo5858g(AbstractC9475i.C9477b<C8704d> bVar, boolean z) {
        C8298k.m12933e(bVar, "state");
        AbstractC1296b.C1297a a = bVar.m8558a().m11712a();
        boolean z2 = a.f4676b;
        ByteBuffer byteBuffer = a.f4675a;
        C8298k.m12934d(byteBuffer, "chunk.buffer");
        C8708h hVar = new C8708h(byteBuffer, a.f4677c, z2 ? 1 : 0, C8701a.f28043b);
        return bVar instanceof AbstractC9475i.C9476a ? new AbstractC9475i.C9476a(hVar) : new AbstractC9475i.C9477b(hVar);
    }

    public C8700a mo5860e() {
        return this.f28041e;
    }

    public void mo5856i(AbstractC8707g gVar) {
        C8298k.m12933e(gVar, "next");
        C10007i iVar = this.f28038b;
        iVar.m6267c("initialize(): format=" + this.f28042f);
        gVar.mo11707d(this.f28042f);
    }
}
