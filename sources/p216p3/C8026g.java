package p216p3;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.thunderdog.challegram.Log;
import p174m3.C6585d1;
import p174m3.C6600g1;

public class C8026g extends AbstractC8018a {
    public boolean f26128M;
    public long f26129N;
    public ByteBuffer f26130O;
    public final int f26131P;
    public final int f26132Q;
    public C6600g1 f26133a;
    public final C8020c f26134b;
    public ByteBuffer f26135c;

    public static final class C8027a extends IllegalStateException {
        public final int f26136a;
        public final int f26137b;

        public C8027a(int r3, int r4) {
            throw new UnsupportedOperationException("Method not decompiled: p216p3.C8026g.C8027a.<init>(int, int):void");
        }
    }

    static {
        C6585d1.m19946a("goog.exo.decoder");
    }

    public C8026g(int i) {
        this(i, 0);
    }

    public static C8026g m13775i() {
        return new C8026g(0);
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f26135c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f26130O;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f26128M = false;
    }

    public final ByteBuffer m13779e(int i) {
        int i2 = this.f26131P;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f26135c;
        throw new C8027a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @EnsuresNonNull({"data"})
    public void m13778f(int i) {
        int i2 = i + this.f26132Q;
        ByteBuffer byteBuffer = this.f26135c;
        if (byteBuffer == null) {
            this.f26135c = m13779e(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f26135c = byteBuffer;
            return;
        }
        ByteBuffer e = m13779e(i3);
        e.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            e.put(byteBuffer);
        }
        this.f26135c = e;
    }

    public final void m13777g() {
        ByteBuffer byteBuffer = this.f26135c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f26130O;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean m13776h() {
        return getFlag(Log.TAG_TDLIB_OPTIONS);
    }

    @EnsuresNonNull({"supplementalData"})
    public void m13774j(int i) {
        ByteBuffer byteBuffer = this.f26130O;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f26130O = ByteBuffer.allocate(i);
        } else {
            this.f26130O.clear();
        }
    }

    public C8026g(int i, int i2) {
        this.f26134b = new C8020c();
        this.f26131P = i;
        this.f26132Q = i2;
    }
}
