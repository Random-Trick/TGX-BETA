package o3;

import c5.a;
import c5.l0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import o3.g;

public final class m0 implements g {
    public g.a f18861e;
    public g.a f18862f;
    public g.a f18863g;
    public g.a f18864h;
    public boolean f18865i;
    public l0 f18866j;
    public ByteBuffer f18867k;
    public ShortBuffer f18868l;
    public ByteBuffer f18869m;
    public long f18870n;
    public long f18871o;
    public boolean f18872p;
    public float f18859c = 1.0f;
    public float f18860d = 1.0f;
    public int f18858b = -1;

    public m0() {
        g.a aVar = g.a.f18782e;
        this.f18861e = aVar;
        this.f18862f = aVar;
        this.f18863g = aVar;
        this.f18864h = aVar;
        ByteBuffer byteBuffer = g.f18781a;
        this.f18867k = byteBuffer;
        this.f18868l = byteBuffer.asShortBuffer();
        this.f18869m = byteBuffer;
    }

    @Override
    public ByteBuffer a() {
        int k10;
        l0 l0Var = this.f18866j;
        if (l0Var != null && (k10 = l0Var.k()) > 0) {
            if (this.f18867k.capacity() < k10) {
                ByteBuffer order = ByteBuffer.allocateDirect(k10).order(ByteOrder.nativeOrder());
                this.f18867k = order;
                this.f18868l = order.asShortBuffer();
            } else {
                this.f18867k.clear();
                this.f18868l.clear();
            }
            l0Var.j(this.f18868l);
            this.f18871o += k10;
            this.f18867k.limit(k10);
            this.f18869m = this.f18867k;
        }
        ByteBuffer byteBuffer = this.f18869m;
        this.f18869m = g.f18781a;
        return byteBuffer;
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f18870n += remaining;
            ((l0) a.e(this.f18866j)).t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override
    public void c() {
        this.f18859c = 1.0f;
        this.f18860d = 1.0f;
        g.a aVar = g.a.f18782e;
        this.f18861e = aVar;
        this.f18862f = aVar;
        this.f18863g = aVar;
        this.f18864h = aVar;
        ByteBuffer byteBuffer = g.f18781a;
        this.f18867k = byteBuffer;
        this.f18868l = byteBuffer.asShortBuffer();
        this.f18869m = byteBuffer;
        this.f18858b = -1;
        this.f18865i = false;
        this.f18866j = null;
        this.f18870n = 0L;
        this.f18871o = 0L;
        this.f18872p = false;
    }

    @Override
    public void d() {
        l0 l0Var = this.f18866j;
        if (l0Var != null) {
            l0Var.s();
        }
        this.f18872p = true;
    }

    @Override
    public boolean e() {
        l0 l0Var;
        return this.f18872p && ((l0Var = this.f18866j) == null || l0Var.k() == 0);
    }

    @Override
    public boolean f() {
        return this.f18862f.f18783a != -1 && (Math.abs(this.f18859c - 1.0f) >= 1.0E-4f || Math.abs(this.f18860d - 1.0f) >= 1.0E-4f || this.f18862f.f18783a != this.f18861e.f18783a);
    }

    @Override
    public void flush() {
        if (f()) {
            g.a aVar = this.f18861e;
            this.f18863g = aVar;
            g.a aVar2 = this.f18862f;
            this.f18864h = aVar2;
            if (this.f18865i) {
                this.f18866j = new l0(aVar.f18783a, aVar.f18784b, this.f18859c, this.f18860d, aVar2.f18783a);
            } else {
                l0 l0Var = this.f18866j;
                if (l0Var != null) {
                    l0Var.i();
                }
            }
        }
        this.f18869m = g.f18781a;
        this.f18870n = 0L;
        this.f18871o = 0L;
        this.f18872p = false;
    }

    @Override
    public g.a g(g.a aVar) {
        if (aVar.f18785c == 2) {
            int i10 = this.f18858b;
            if (i10 == -1) {
                i10 = aVar.f18783a;
            }
            this.f18861e = aVar;
            g.a aVar2 = new g.a(i10, aVar.f18784b, 2);
            this.f18862f = aVar2;
            this.f18865i = true;
            return aVar2;
        }
        throw new g.b(aVar);
    }

    public long h(long j10) {
        if (this.f18871o < 1024) {
            return (long) (this.f18859c * j10);
        }
        long l10 = this.f18870n - ((l0) a.e(this.f18866j)).l();
        int i10 = this.f18864h.f18783a;
        int i11 = this.f18863g.f18783a;
        if (i10 == i11) {
            return l0.z0(j10, l10, this.f18871o);
        }
        return l0.z0(j10, l10 * i10, this.f18871o * i11);
    }

    public void i(float f10) {
        if (this.f18860d != f10) {
            this.f18860d = f10;
            this.f18865i = true;
        }
    }

    public void j(float f10) {
        if (this.f18859c != f10) {
            this.f18859c = f10;
            this.f18865i = true;
        }
    }
}
