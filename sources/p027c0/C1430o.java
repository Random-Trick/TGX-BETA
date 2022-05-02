package p027c0;

import android.graphics.Rect;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC0610l1;
import androidx.camera.core.C0662u1;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
import p016b1.C1132h;
import p040d0.C3564a;
import p336y.AbstractC10251k0;
import p351z.C11190g;

public class C1430o implements AbstractC10251k0 {
    public static final Rect f5247h = new Rect(0, 0, 0, 0);
    public int f5248a;
    public final int f5249b;
    public ImageWriter f5253f;
    public final Object f5250c = new Object();
    public boolean f5251d = false;
    public int f5252e = 0;
    public Rect f5254g = f5247h;

    public C1430o(int i, int i2) {
        this.f5248a = i;
        this.f5249b = i2;
    }

    public static C11190g m36948e(AbstractC0610l1 l1Var) {
        C11190g.C11192b a = C11190g.m1262a();
        l1Var.mo40736Z().mo36994b(a);
        return a.m1250j(l1Var.getWidth()).m1251i(l1Var.getHeight()).m1259a();
    }

    @Override
    public void mo5632a(Surface surface, int i) {
        C1132h.m38319h(i == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.f5250c) {
            if (this.f5251d) {
                C0662u1.m40643k("YuvToJpegProcessor", "Cannot set output surface. Processor is closed.");
            } else if (this.f5253f == null) {
                this.f5253f = C3564a.m30048d(surface, this.f5249b, i);
            } else {
                throw new IllegalStateException("Output surface already set.");
            }
        }
    }

    @Override
    public void mo5631b(p336y.AbstractC10225f1 r18) {
        throw new UnsupportedOperationException("Method not decompiled: p027c0.C1430o.mo5631b(y.f1):void");
    }

    @Override
    public void mo5630c(Size size) {
        synchronized (this.f5250c) {
            this.f5254g = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    public void m36949d() {
        synchronized (this.f5250c) {
            if (!this.f5251d) {
                this.f5251d = true;
                if (this.f5252e != 0 || this.f5253f == null) {
                    C0662u1.m40653a("YuvToJpegProcessor", "close() called while processing. Will close after completion.");
                } else {
                    C0662u1.m40653a("YuvToJpegProcessor", "No processing in progress. Closing immediately.");
                    this.f5253f.close();
                }
            }
        }
    }

    public void m36947f(int i) {
        this.f5248a = i;
    }

    public static final class C1431a extends OutputStream {
        public final ByteBuffer f5255a;

        public C1431a(ByteBuffer byteBuffer) {
            this.f5255a = byteBuffer;
        }

        @Override
        public void write(int i) {
            if (this.f5255a.hasRemaining()) {
                this.f5255a.put((byte) i);
                return;
            }
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }

        @Override
        public void write(byte[] bArr, int i, int i2) {
            int i3;
            Objects.requireNonNull(bArr);
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            } else if (i2 != 0) {
                if (this.f5255a.remaining() >= i2) {
                    this.f5255a.put(bArr, i, i2);
                    return;
                }
                throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
            }
        }
    }
}
