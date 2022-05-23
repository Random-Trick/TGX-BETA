package c0;

import android.graphics.Rect;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.k1;
import androidx.camera.core.t1;
import b1.h;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
import y.k0;
import z.g;

public class o implements k0 {
    public static final Rect f4212h = new Rect(0, 0, 0, 0);
    public int f4213a;
    public final int f4214b;
    public ImageWriter f4218f;
    public final Object f4215c = new Object();
    public boolean f4216d = false;
    public int f4217e = 0;
    public Rect f4219g = f4212h;

    public o(int i10, int i11) {
        this.f4213a = i10;
        this.f4214b = i11;
    }

    public static g e(k1 k1Var) {
        g.b a10 = g.a();
        k1Var.a0().b(a10);
        return a10.j(k1Var.getWidth()).i(k1Var.getHeight()).a();
    }

    @Override
    public void a(Surface surface, int i10) {
        h.h(i10 == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.f4215c) {
            if (this.f4216d) {
                t1.k("YuvToJpegProcessor", "Cannot set output surface. Processor is closed.");
            } else if (this.f4218f == null) {
                this.f4218f = d0.a.d(surface, this.f4214b, i10);
            } else {
                throw new IllegalStateException("Output surface already set.");
            }
        }
    }

    @Override
    public void b(y.f1 r18) {
        throw new UnsupportedOperationException("Method not decompiled: c0.o.b(y.f1):void");
    }

    @Override
    public void c(Size size) {
        synchronized (this.f4215c) {
            this.f4219g = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    public void d() {
        synchronized (this.f4215c) {
            if (!this.f4216d) {
                this.f4216d = true;
                if (this.f4217e != 0 || this.f4218f == null) {
                    t1.a("YuvToJpegProcessor", "close() called while processing. Will close after completion.");
                } else {
                    t1.a("YuvToJpegProcessor", "No processing in progress. Closing immediately.");
                    this.f4218f.close();
                }
            }
        }
    }

    public void f(int i10) {
        this.f4213a = i10;
    }

    public static final class a extends OutputStream {
        public final ByteBuffer f4220a;

        public a(ByteBuffer byteBuffer) {
            this.f4220a = byteBuffer;
        }

        @Override
        public void write(int i10) {
            if (this.f4220a.hasRemaining()) {
                this.f4220a.put((byte) i10);
                return;
            }
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }

        @Override
        public void write(byte[] bArr, int i10, int i11) {
            int i12;
            Objects.requireNonNull(bArr);
            if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
                throw new IndexOutOfBoundsException();
            } else if (i11 != 0) {
                if (this.f4220a.remaining() >= i11) {
                    this.f4220a.put(bArr, i10, i11);
                    return;
                }
                throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
            }
        }
    }
}
