package le;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

public abstract class a {
    public abstract int a(MediaFormat mediaFormat, boolean z10);

    public abstract void b();

    public abstract boolean c(int i10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10);
}
