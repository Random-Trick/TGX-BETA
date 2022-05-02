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
    public final int f28036c;
    public final ByteBuffer f28037d;
    public final MediaFormat f28039f;
    public final C10007i f28035b = new C10007i("Bridge");
    public final C8700a f28038e = this;

    public static final class C8701a extends AbstractC8299l implements AbstractC8077a<C5060q> {
        public static final C8701a f28040b = new C8701a();

        public C8701a() {
            super(0);
        }

        @Override
        public C5060q mo4925b() {
            m11718f();
            return C5060q.f17066a;
        }

        public final void m11718f() {
        }
    }

    public C8700a(MediaFormat mediaFormat) {
        C8298k.m12934e(mediaFormat, "format");
        this.f28039f = mediaFormat;
        int integer = mediaFormat.getInteger("max-input-size");
        this.f28036c = integer;
        this.f28037d = ByteBuffer.allocateDirect(integer).order(ByteOrder.nativeOrder());
    }

    @Override
    public void mo5861a() {
        AbstractC9480j.C9481a.m8556b(this);
    }

    @Override
    public C5048h<ByteBuffer, Integer> mo11714c() {
        this.f28037d.clear();
        return C5054l.m24188a(this.f28037d, 0);
    }

    @Override
    public AbstractC9475i<C8708h> mo5858g(AbstractC9475i.C9477b<C8704d> bVar, boolean z) {
        C8298k.m12934e(bVar, "state");
        AbstractC1296b.C1297a a = bVar.m8558a().m11713a();
        boolean z2 = a.f4676b;
        ByteBuffer byteBuffer = a.f4675a;
        C8298k.m12935d(byteBuffer, "chunk.buffer");
        C8708h hVar = new C8708h(byteBuffer, a.f4677c, z2 ? 1 : 0, C8701a.f28040b);
        return bVar instanceof AbstractC9475i.C9476a ? new AbstractC9475i.C9476a(hVar) : new AbstractC9475i.C9477b(hVar);
    }

    public C8700a mo5860e() {
        return this.f28038e;
    }

    public void mo5856i(AbstractC8707g gVar) {
        C8298k.m12934e(gVar, "next");
        C10007i iVar = this.f28035b;
        iVar.m6267c("initialize(): format=" + this.f28039f);
        gVar.mo11708d(this.f28039f);
    }
}
