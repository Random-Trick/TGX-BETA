package p276t9;

import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;

public class C9057a {
    public final MediaCodec f29034a;
    public final ByteBuffer[] f29035b;
    public ByteBuffer[] f29036c;

    public C9057a(MediaCodec mediaCodec) {
        this.f29034a = mediaCodec;
        if (Build.VERSION.SDK_INT < 21) {
            this.f29035b = mediaCodec.getInputBuffers();
            this.f29036c = mediaCodec.getOutputBuffers();
            return;
        }
        this.f29036c = null;
        this.f29035b = null;
    }

    public ByteBuffer m10596a(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f29034a.getInputBuffer(i);
        }
        ByteBuffer byteBuffer = this.f29035b[i];
        byteBuffer.clear();
        return byteBuffer;
    }

    public ByteBuffer m10595b(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f29034a.getOutputBuffer(i);
        }
        return this.f29036c[i];
    }

    public void m10594c() {
        if (Build.VERSION.SDK_INT < 21) {
            this.f29036c = this.f29034a.getOutputBuffers();
        }
    }
}
