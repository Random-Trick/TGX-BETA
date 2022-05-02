package p199o3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p020b5.C1186a;
import p020b5.C1216l0;
import p199o3.AbstractC7611g;

public final class C7625l0 implements AbstractC7611g {
    public AbstractC7611g.C7612a f24423e;
    public AbstractC7611g.C7612a f24424f;
    public AbstractC7611g.C7612a f24425g;
    public AbstractC7611g.C7612a f24426h;
    public boolean f24427i;
    public C7623k0 f24428j;
    public ByteBuffer f24429k;
    public ShortBuffer f24430l;
    public ByteBuffer f24431m;
    public long f24432n;
    public long f24433o;
    public boolean f24434p;
    public float f24421c = 1.0f;
    public float f24422d = 1.0f;
    public int f24420b = -1;

    public C7625l0() {
        AbstractC7611g.C7612a aVar = AbstractC7611g.C7612a.f24357e;
        this.f24423e = aVar;
        this.f24424f = aVar;
        this.f24425g = aVar;
        this.f24426h = aVar;
        ByteBuffer byteBuffer = AbstractC7611g.f24356a;
        this.f24429k = byteBuffer;
        this.f24430l = byteBuffer.asShortBuffer();
        this.f24431m = byteBuffer;
    }

    @Override
    public ByteBuffer mo15314a() {
        int k;
        C7623k0 k0Var = this.f24428j;
        if (k0Var != null && (k = k0Var.m15445k()) > 0) {
            if (this.f24429k.capacity() < k) {
                ByteBuffer order = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
                this.f24429k = order;
                this.f24430l = order.asShortBuffer();
            } else {
                this.f24429k.clear();
                this.f24430l.clear();
            }
            k0Var.m15446j(this.f24430l);
            this.f24433o += k;
            this.f24429k.limit(k);
            this.f24431m = this.f24429k;
        }
        ByteBuffer byteBuffer = this.f24431m;
        this.f24431m = AbstractC7611g.f24356a;
        return byteBuffer;
    }

    @Override
    public void mo15305b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f24432n += remaining;
            ((C7623k0) C1186a.m38185e(this.f24428j)).m15436t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override
    public void mo15313c() {
        this.f24421c = 1.0f;
        this.f24422d = 1.0f;
        AbstractC7611g.C7612a aVar = AbstractC7611g.C7612a.f24357e;
        this.f24423e = aVar;
        this.f24424f = aVar;
        this.f24425g = aVar;
        this.f24426h = aVar;
        ByteBuffer byteBuffer = AbstractC7611g.f24356a;
        this.f24429k = byteBuffer;
        this.f24430l = byteBuffer.asShortBuffer();
        this.f24431m = byteBuffer;
        this.f24420b = -1;
        this.f24427i = false;
        this.f24428j = null;
        this.f24432n = 0L;
        this.f24433o = 0L;
        this.f24434p = false;
    }

    @Override
    public void mo15312d() {
        C7623k0 k0Var = this.f24428j;
        if (k0Var != null) {
            k0Var.m15437s();
        }
        this.f24434p = true;
    }

    @Override
    public boolean mo15311e() {
        C7623k0 k0Var;
        return this.f24434p && ((k0Var = this.f24428j) == null || k0Var.m15445k() == 0);
    }

    @Override
    public boolean mo15310f() {
        return this.f24424f.f24358a != -1 && (Math.abs(this.f24421c - 1.0f) >= 1.0E-4f || Math.abs(this.f24422d - 1.0f) >= 1.0E-4f || this.f24424f.f24358a != this.f24423e.f24358a);
    }

    @Override
    public void flush() {
        if (mo15310f()) {
            AbstractC7611g.C7612a aVar = this.f24423e;
            this.f24425g = aVar;
            AbstractC7611g.C7612a aVar2 = this.f24424f;
            this.f24426h = aVar2;
            if (this.f24427i) {
                this.f24428j = new C7623k0(aVar.f24358a, aVar.f24359b, this.f24421c, this.f24422d, aVar2.f24358a);
            } else {
                C7623k0 k0Var = this.f24428j;
                if (k0Var != null) {
                    k0Var.m15447i();
                }
            }
        }
        this.f24431m = AbstractC7611g.f24356a;
        this.f24432n = 0L;
        this.f24433o = 0L;
        this.f24434p = false;
    }

    @Override
    public AbstractC7611g.C7612a mo15309g(AbstractC7611g.C7612a aVar) {
        if (aVar.f24360c == 2) {
            int i = this.f24420b;
            if (i == -1) {
                i = aVar.f24358a;
            }
            this.f24423e = aVar;
            AbstractC7611g.C7612a aVar2 = new AbstractC7611g.C7612a(i, aVar.f24359b, 2);
            this.f24424f = aVar2;
            this.f24427i = true;
            return aVar2;
        }
        throw new AbstractC7611g.C7613b(aVar);
    }

    public long m15432h(long j) {
        if (this.f24433o < 1024) {
            return (long) (this.f24421c * j);
        }
        long l = this.f24432n - ((C7623k0) C1186a.m38185e(this.f24428j)).m15444l();
        int i = this.f24426h.f24358a;
        int i2 = this.f24425g.f24358a;
        if (i == i2) {
            return C1216l0.m37937y0(j, l, this.f24433o);
        }
        return C1216l0.m37937y0(j, l * i, this.f24433o * i2);
    }

    public void m15431i(float f) {
        if (this.f24422d != f) {
            this.f24422d = f;
            this.f24427i = true;
        }
    }

    public void m15430j(float f) {
        if (this.f24421c != f) {
            this.f24421c = f;
            this.f24427i = true;
        }
    }
}
