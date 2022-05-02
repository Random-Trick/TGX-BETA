package p199o3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p199o3.AbstractC7611g;

public abstract class AbstractC7648y implements AbstractC7611g {
    public AbstractC7611g.C7612a f24513b;
    public AbstractC7611g.C7612a f24514c;
    public AbstractC7611g.C7612a f24515d;
    public AbstractC7611g.C7612a f24516e;
    public ByteBuffer f24517f;
    public ByteBuffer f24518g;
    public boolean f24519h;

    public AbstractC7648y() {
        ByteBuffer byteBuffer = AbstractC7611g.f24356a;
        this.f24517f = byteBuffer;
        this.f24518g = byteBuffer;
        AbstractC7611g.C7612a aVar = AbstractC7611g.C7612a.f24357e;
        this.f24515d = aVar;
        this.f24516e = aVar;
        this.f24513b = aVar;
        this.f24514c = aVar;
    }

    @Override
    public ByteBuffer mo15314a() {
        ByteBuffer byteBuffer = this.f24518g;
        this.f24518g = AbstractC7611g.f24356a;
        return byteBuffer;
    }

    @Override
    public final void mo15313c() {
        flush();
        this.f24517f = AbstractC7611g.f24356a;
        AbstractC7611g.C7612a aVar = AbstractC7611g.C7612a.f24357e;
        this.f24515d = aVar;
        this.f24516e = aVar;
        this.f24513b = aVar;
        this.f24514c = aVar;
        mo15302l();
    }

    @Override
    public final void mo15312d() {
        this.f24519h = true;
        mo15307k();
    }

    @Override
    public boolean mo15311e() {
        return this.f24519h && this.f24518g == AbstractC7611g.f24356a;
    }

    @Override
    public boolean mo15310f() {
        return this.f24516e != AbstractC7611g.C7612a.f24357e;
    }

    @Override
    public final void flush() {
        this.f24518g = AbstractC7611g.f24356a;
        this.f24519h = false;
        this.f24513b = this.f24515d;
        this.f24514c = this.f24516e;
        mo15303j();
    }

    @Override
    public final AbstractC7611g.C7612a mo15309g(AbstractC7611g.C7612a aVar) {
        this.f24515d = aVar;
        this.f24516e = mo15304i(aVar);
        return mo15310f() ? this.f24516e : AbstractC7611g.C7612a.f24357e;
    }

    public final boolean m15308h() {
        return this.f24518g.hasRemaining();
    }

    public abstract AbstractC7611g.C7612a mo15304i(AbstractC7611g.C7612a aVar);

    public void mo15303j() {
    }

    public void mo15307k() {
    }

    public void mo15302l() {
    }

    public final ByteBuffer m15306m(int i) {
        if (this.f24517f.capacity() < i) {
            this.f24517f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f24517f.clear();
        }
        ByteBuffer byteBuffer = this.f24517f;
        this.f24518g = byteBuffer;
        return byteBuffer;
    }
}
