package o3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o3.g;

public abstract class y implements g {
    public g.a f18942b;
    public g.a f18943c;
    public g.a f18944d;
    public g.a f18945e;
    public ByteBuffer f18946f;
    public ByteBuffer f18947g;
    public boolean f18948h;

    public y() {
        ByteBuffer byteBuffer = g.f18781a;
        this.f18946f = byteBuffer;
        this.f18947g = byteBuffer;
        g.a aVar = g.a.f18782e;
        this.f18944d = aVar;
        this.f18945e = aVar;
        this.f18942b = aVar;
        this.f18943c = aVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f18947g;
        this.f18947g = g.f18781a;
        return byteBuffer;
    }

    @Override
    public final void c() {
        flush();
        this.f18946f = g.f18781a;
        g.a aVar = g.a.f18782e;
        this.f18944d = aVar;
        this.f18945e = aVar;
        this.f18942b = aVar;
        this.f18943c = aVar;
        l();
    }

    @Override
    public final void d() {
        this.f18948h = true;
        k();
    }

    @Override
    public boolean e() {
        return this.f18948h && this.f18947g == g.f18781a;
    }

    @Override
    public boolean f() {
        return this.f18945e != g.a.f18782e;
    }

    @Override
    public final void flush() {
        this.f18947g = g.f18781a;
        this.f18948h = false;
        this.f18942b = this.f18944d;
        this.f18943c = this.f18945e;
        j();
    }

    @Override
    public final g.a g(g.a aVar) {
        this.f18944d = aVar;
        this.f18945e = i(aVar);
        return f() ? this.f18945e : g.a.f18782e;
    }

    public final boolean h() {
        return this.f18947g.hasRemaining();
    }

    public abstract g.a i(g.a aVar);

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }

    public final ByteBuffer m(int i10) {
        if (this.f18946f.capacity() < i10) {
            this.f18946f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f18946f.clear();
        }
        ByteBuffer byteBuffer = this.f18946f;
        this.f18947g = byteBuffer;
        return byteBuffer;
    }
}
