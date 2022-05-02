package p199o3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p199o3.AbstractC7611g;

public abstract class AbstractC7648y implements AbstractC7611g {
    public AbstractC7611g.C7612a f24516b;
    public AbstractC7611g.C7612a f24517c;
    public AbstractC7611g.C7612a f24518d;
    public AbstractC7611g.C7612a f24519e;
    public ByteBuffer f24520f;
    public ByteBuffer f24521g;
    public boolean f24522h;

    public AbstractC7648y() {
        ByteBuffer byteBuffer = AbstractC7611g.f24359a;
        this.f24520f = byteBuffer;
        this.f24521g = byteBuffer;
        AbstractC7611g.C7612a aVar = AbstractC7611g.C7612a.f24360e;
        this.f24518d = aVar;
        this.f24519e = aVar;
        this.f24516b = aVar;
        this.f24517c = aVar;
    }

    @Override
    public ByteBuffer mo15314a() {
        ByteBuffer byteBuffer = this.f24521g;
        this.f24521g = AbstractC7611g.f24359a;
        return byteBuffer;
    }

    @Override
    public final void mo15313c() {
        flush();
        this.f24520f = AbstractC7611g.f24359a;
        AbstractC7611g.C7612a aVar = AbstractC7611g.C7612a.f24360e;
        this.f24518d = aVar;
        this.f24519e = aVar;
        this.f24516b = aVar;
        this.f24517c = aVar;
        mo15302l();
    }

    @Override
    public final void mo15312d() {
        this.f24522h = true;
        mo15307k();
    }

    @Override
    public boolean mo15311e() {
        return this.f24522h && this.f24521g == AbstractC7611g.f24359a;
    }

    @Override
    public boolean mo15310f() {
        return this.f24519e != AbstractC7611g.C7612a.f24360e;
    }

    @Override
    public final void flush() {
        this.f24521g = AbstractC7611g.f24359a;
        this.f24522h = false;
        this.f24516b = this.f24518d;
        this.f24517c = this.f24519e;
        mo15303j();
    }

    @Override
    public final AbstractC7611g.C7612a mo15309g(AbstractC7611g.C7612a aVar) {
        this.f24518d = aVar;
        this.f24519e = mo15304i(aVar);
        return mo15310f() ? this.f24519e : AbstractC7611g.C7612a.f24360e;
    }

    public final boolean m15308h() {
        return this.f24521g.hasRemaining();
    }

    public abstract AbstractC7611g.C7612a mo15304i(AbstractC7611g.C7612a aVar);

    public void mo15303j() {
    }

    public void mo15307k() {
    }

    public void mo15302l() {
    }

    public final ByteBuffer m15306m(int i) {
        if (this.f24520f.capacity() < i) {
            this.f24520f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f24520f.clear();
        }
        ByteBuffer byteBuffer = this.f24520f;
        this.f24521g = byteBuffer;
        return byteBuffer;
    }
}
