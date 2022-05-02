package p199o3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p020b5.C1186a;
import p020b5.C1216l0;
import p199o3.AbstractC7611g;

public final class C7625l0 implements AbstractC7611g {
    public AbstractC7611g.C7612a f24426e;
    public AbstractC7611g.C7612a f24427f;
    public AbstractC7611g.C7612a f24428g;
    public AbstractC7611g.C7612a f24429h;
    public boolean f24430i;
    public C7623k0 f24431j;
    public ByteBuffer f24432k;
    public ShortBuffer f24433l;
    public ByteBuffer f24434m;
    public long f24435n;
    public long f24436o;
    public boolean f24437p;
    public float f24424c = 1.0f;
    public float f24425d = 1.0f;
    public int f24423b = -1;

    public C7625l0() {
        AbstractC7611g.C7612a aVar = AbstractC7611g.C7612a.f24360e;
        this.f24426e = aVar;
        this.f24427f = aVar;
        this.f24428g = aVar;
        this.f24429h = aVar;
        ByteBuffer byteBuffer = AbstractC7611g.f24359a;
        this.f24432k = byteBuffer;
        this.f24433l = byteBuffer.asShortBuffer();
        this.f24434m = byteBuffer;
    }

    @Override
    public ByteBuffer mo15314a() {
        int k;
        C7623k0 k0Var = this.f24431j;
        if (k0Var != null && (k = k0Var.m15445k()) > 0) {
            if (this.f24432k.capacity() < k) {
                ByteBuffer order = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
                this.f24432k = order;
                this.f24433l = order.asShortBuffer();
            } else {
                this.f24432k.clear();
                this.f24433l.clear();
            }
            k0Var.m15446j(this.f24433l);
            this.f24436o += k;
            this.f24432k.limit(k);
            this.f24434m = this.f24432k;
        }
        ByteBuffer byteBuffer = this.f24434m;
        this.f24434m = AbstractC7611g.f24359a;
        return byteBuffer;
    }

    @Override
    public void mo15305b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f24435n += remaining;
            ((C7623k0) C1186a.m38188e(this.f24431j)).m15436t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override
    public void mo15313c() {
        this.f24424c = 1.0f;
        this.f24425d = 1.0f;
        AbstractC7611g.C7612a aVar = AbstractC7611g.C7612a.f24360e;
        this.f24426e = aVar;
        this.f24427f = aVar;
        this.f24428g = aVar;
        this.f24429h = aVar;
        ByteBuffer byteBuffer = AbstractC7611g.f24359a;
        this.f24432k = byteBuffer;
        this.f24433l = byteBuffer.asShortBuffer();
        this.f24434m = byteBuffer;
        this.f24423b = -1;
        this.f24430i = false;
        this.f24431j = null;
        this.f24435n = 0L;
        this.f24436o = 0L;
        this.f24437p = false;
    }

    @Override
    public void mo15312d() {
        C7623k0 k0Var = this.f24431j;
        if (k0Var != null) {
            k0Var.m15437s();
        }
        this.f24437p = true;
    }

    @Override
    public boolean mo15311e() {
        C7623k0 k0Var;
        return this.f24437p && ((k0Var = this.f24431j) == null || k0Var.m15445k() == 0);
    }

    @Override
    public boolean mo15310f() {
        return this.f24427f.f24361a != -1 && (Math.abs(this.f24424c - 1.0f) >= 1.0E-4f || Math.abs(this.f24425d - 1.0f) >= 1.0E-4f || this.f24427f.f24361a != this.f24426e.f24361a);
    }

    @Override
    public void flush() {
        if (mo15310f()) {
            AbstractC7611g.C7612a aVar = this.f24426e;
            this.f24428g = aVar;
            AbstractC7611g.C7612a aVar2 = this.f24427f;
            this.f24429h = aVar2;
            if (this.f24430i) {
                this.f24431j = new C7623k0(aVar.f24361a, aVar.f24362b, this.f24424c, this.f24425d, aVar2.f24361a);
            } else {
                C7623k0 k0Var = this.f24431j;
                if (k0Var != null) {
                    k0Var.m15447i();
                }
            }
        }
        this.f24434m = AbstractC7611g.f24359a;
        this.f24435n = 0L;
        this.f24436o = 0L;
        this.f24437p = false;
    }

    @Override
    public AbstractC7611g.C7612a mo15309g(AbstractC7611g.C7612a aVar) {
        if (aVar.f24363c == 2) {
            int i = this.f24423b;
            if (i == -1) {
                i = aVar.f24361a;
            }
            this.f24426e = aVar;
            AbstractC7611g.C7612a aVar2 = new AbstractC7611g.C7612a(i, aVar.f24362b, 2);
            this.f24427f = aVar2;
            this.f24430i = true;
            return aVar2;
        }
        throw new AbstractC7611g.C7613b(aVar);
    }

    public long m15432h(long j) {
        if (this.f24436o < 1024) {
            return (long) (this.f24424c * j);
        }
        long l = this.f24435n - ((C7623k0) C1186a.m38188e(this.f24431j)).m15444l();
        int i = this.f24429h.f24361a;
        int i2 = this.f24428g.f24361a;
        if (i == i2) {
            return C1216l0.m37940y0(j, l, this.f24436o);
        }
        return C1216l0.m37940y0(j, l * i, this.f24436o * i2);
    }

    public void m15431i(float f) {
        if (this.f24425d != f) {
            this.f24425d = f;
            this.f24430i = true;
        }
    }

    public void m15430j(float f) {
        if (this.f24424c != f) {
            this.f24424c = f;
            this.f24430i = true;
        }
    }
}
