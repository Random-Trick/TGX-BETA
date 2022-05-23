package p3;

import java.nio.ByteBuffer;
import m3.n1;
import m3.q1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.thunderdog.challegram.Log;

public class g extends p3.a {
    public boolean M;
    public long N;
    public ByteBuffer O;
    public final int P;
    public final int Q;
    public q1 f20486a;
    public final c f20487b;
    public ByteBuffer f20488c;

    public static final class a extends IllegalStateException {
        public final int f20489a;
        public final int f20490b;

        public a(int r3, int r4) {
            throw new UnsupportedOperationException("Method not decompiled: p3.g.a.<init>(int, int):void");
        }
    }

    static {
        n1.a("goog.exo.decoder");
    }

    public g(int i10) {
        this(i10, 0);
    }

    public static g i() {
        return new g(0);
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f20488c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.O;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.M = false;
    }

    public final ByteBuffer e(int i10) {
        int i11 = this.P;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f20488c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @EnsuresNonNull({"data"})
    public void f(int i10) {
        int i11 = i10 + this.Q;
        ByteBuffer byteBuffer = this.f20488c;
        if (byteBuffer == null) {
            this.f20488c = e(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f20488c = byteBuffer;
            return;
        }
        ByteBuffer e10 = e(i12);
        e10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            e10.put(byteBuffer);
        }
        this.f20488c = e10;
    }

    public final void g() {
        ByteBuffer byteBuffer = this.f20488c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.O;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean h() {
        return getFlag(Log.TAG_TDLIB_OPTIONS);
    }

    @EnsuresNonNull({"supplementalData"})
    public void j(int i10) {
        ByteBuffer byteBuffer = this.O;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.O = ByteBuffer.allocate(i10);
        } else {
            this.O.clear();
        }
    }

    public g(int i10, int i11) {
        this.f20487b = new c();
        this.P = i10;
        this.Q = i11;
    }
}
