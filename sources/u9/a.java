package u9;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

public class a {
    public final MediaCodec f23714a;
    public ByteBuffer[] f23716c = null;
    public final ByteBuffer[] f23715b = null;

    public a(MediaCodec mediaCodec) {
        this.f23714a = mediaCodec;
    }

    public ByteBuffer a(int i10) {
        return this.f23714a.getInputBuffer(i10);
    }

    public ByteBuffer b(int i10) {
        return this.f23714a.getOutputBuffer(i10);
    }

    public void c() {
    }
}
