package p265s9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import p011aa.AbstractC0237a;
import p107ha.C5060q;
import p192n9.EnumC7313d;
import p289u9.AbstractC9461b;
import p289u9.AbstractC9475i;
import p289u9.AbstractC9480j;
import p316w9.C10007i;
import qa.C8298k;

public final class C8706f implements AbstractC9480j<C8708h, AbstractC8707g, C5060q, AbstractC9461b>, AbstractC8707g {
    public final C8706f f28050b = this;
    public final C10007i f28051c = new C10007i("Writer");
    public final MediaCodec.BufferInfo f28052d = new MediaCodec.BufferInfo();
    public final AbstractC0237a f28053e;
    public final EnumC7313d f28054f;

    public C8706f(AbstractC0237a aVar, EnumC7313d dVar) {
        C8298k.m12934e(aVar, "sink");
        C8298k.m12934e(dVar, "track");
        this.f28053e = aVar;
        this.f28054f = dVar;
    }

    @Override
    public void mo5861a() {
        AbstractC9480j.C9481a.m8556b(this);
    }

    @Override
    public void mo11708d(MediaFormat mediaFormat) {
        C8298k.m12934e(mediaFormat, "format");
        C10007i iVar = this.f28051c;
        iVar.m6267c("handleFormat(" + mediaFormat + ')');
        this.f28053e.mo6277b(this.f28054f, mediaFormat);
    }

    @Override
    public AbstractC9475i<C5060q> mo5858g(AbstractC9475i.C9477b<C8708h> bVar, boolean z) {
        C8298k.m12934e(bVar, "state");
        C8708h a = bVar.m8558a();
        ByteBuffer a2 = a.m11707a();
        long b = a.m11706b();
        int c = a.m11705c();
        boolean z2 = bVar instanceof AbstractC9475i.C9476a;
        MediaCodec.BufferInfo bufferInfo = this.f28052d;
        int position = a2.position();
        int remaining = a2.remaining();
        if (z2) {
            c &= 4;
        }
        bufferInfo.set(position, remaining, b, c);
        this.f28053e.mo6274e(this.f28054f, a2, this.f28052d);
        bVar.m8558a().m11704d().mo4925b();
        return z2 ? new AbstractC9475i.C9476a(C5060q.f17066a) : new AbstractC9475i.C9477b(C5060q.f17066a);
    }

    @Override
    public void mo5856i(AbstractC9461b bVar) {
        C8298k.m12934e(bVar, "next");
        AbstractC9480j.C9481a.m8557a(this, bVar);
    }

    public C8706f mo5860e() {
        return this.f28050b;
    }
}
