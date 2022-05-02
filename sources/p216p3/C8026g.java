package p216p3;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.thunderdog.challegram.Log;
import p174m3.C6585d1;
import p174m3.C6600g1;

public class C8026g extends AbstractC8018a {
    public boolean f26125M;
    public long f26126N;
    public ByteBuffer f26127O;
    public final int f26128P;
    public final int f26129Q;
    public C6600g1 f26130a;
    public final C8020c f26131b;
    public ByteBuffer f26132c;

    public static final class C8027a extends IllegalStateException {
        public final int f26133a;
        public final int f26134b;

        public C8027a(int r3, int r4) {
            throw new UnsupportedOperationException("Method not decompiled: p216p3.C8026g.C8027a.<init>(int, int):void");
        }
    }

    static {
        C6585d1.m19945a("goog.exo.decoder");
    }

    public C8026g(int i) {
        this(i, 0);
    }

    public static C8026g m13776i() {
        return new C8026g(0);
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f26132c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f26127O;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f26125M = false;
    }

    public final ByteBuffer m13780e(int i) {
        int i2 = this.f26128P;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f26132c;
        throw new C8027a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @EnsuresNonNull({"data"})
    public void m13779f(int i) {
        int i2 = i + this.f26129Q;
        ByteBuffer byteBuffer = this.f26132c;
        if (byteBuffer == null) {
            this.f26132c = m13780e(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f26132c = byteBuffer;
            return;
        }
        ByteBuffer e = m13780e(i3);
        e.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            e.put(byteBuffer);
        }
        this.f26132c = e;
    }

    public final void m13778g() {
        ByteBuffer byteBuffer = this.f26132c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f26127O;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean m13777h() {
        return getFlag(Log.TAG_TDLIB_OPTIONS);
    }

    @EnsuresNonNull({"supplementalData"})
    public void m13775j(int i) {
        ByteBuffer byteBuffer = this.f26127O;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f26127O = ByteBuffer.allocate(i);
        } else {
            this.f26127O.clear();
        }
    }

    public C8026g(int i, int i2) {
        this.f26131b = new C8020c();
        this.f26128P = i;
        this.f26129Q = i2;
    }
}
