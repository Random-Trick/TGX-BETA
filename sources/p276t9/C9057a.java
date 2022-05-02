package p276t9;

import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;

public class C9057a {
    public final MediaCodec f29037a;
    public final ByteBuffer[] f29038b;
    public ByteBuffer[] f29039c;

    public C9057a(MediaCodec mediaCodec) {
        this.f29037a = mediaCodec;
        if (Build.VERSION.SDK_INT < 21) {
            this.f29038b = mediaCodec.getInputBuffers();
            this.f29039c = mediaCodec.getOutputBuffers();
            return;
        }
        this.f29039c = null;
        this.f29038b = null;
    }

    public ByteBuffer m10595a(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f29037a.getInputBuffer(i);
        }
        ByteBuffer byteBuffer = this.f29038b[i];
        byteBuffer.clear();
        return byteBuffer;
    }

    public ByteBuffer m10594b(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f29037a.getOutputBuffer(i);
        }
        return this.f29039c[i];
    }

    public void m10593c() {
        if (Build.VERSION.SDK_INT < 21) {
            this.f29039c = this.f29037a.getOutputBuffers();
        }
    }
}
