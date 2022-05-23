package u9;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import ca.b;
import java.io.IOException;
import o9.d;

public class b {

    public static class a {
        public static final int[] f23717a;

        static {
            int[] iArr = new int[d.values().length];
            f23717a = iArr;
            try {
                iArr[d.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23717a[d.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final MediaFormat a(ca.b bVar, d dVar, MediaFormat mediaFormat) {
        bVar.f(dVar);
        try {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            MediaFormat mediaFormat2 = null;
            createDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
            createDecoderByType.start();
            u9.a aVar = new u9.a(createDecoderByType);
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            b.a aVar2 = new b.a();
            while (mediaFormat2 == null) {
                mediaFormat2 = b(dVar, bVar, aVar2, createDecoderByType, aVar, bufferInfo);
            }
            bVar.m();
            bVar.e();
            return mediaFormat2;
        } catch (IOException e10) {
            throw new RuntimeException("Can't decode this track", e10);
        }
    }

    public final MediaFormat b(d dVar, ca.b bVar, b.a aVar, MediaCodec mediaCodec, u9.a aVar2, MediaCodec.BufferInfo bufferInfo) {
        MediaFormat c10 = c(mediaCodec, aVar2, bufferInfo);
        if (c10 != null) {
            return c10;
        }
        d(dVar, bVar, aVar, mediaCodec, aVar2);
        return null;
    }

    public final MediaFormat c(MediaCodec mediaCodec, u9.a aVar, MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        if (dequeueOutputBuffer == -3) {
            aVar.c();
            return c(mediaCodec, aVar, bufferInfo);
        } else if (dequeueOutputBuffer == -2) {
            return mediaCodec.getOutputFormat();
        } else {
            if (dequeueOutputBuffer != -1) {
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
            return null;
        }
    }

    public final void d(d dVar, ca.b bVar, b.a aVar, MediaCodec mediaCodec, u9.a aVar2) {
        if (bVar.i(dVar)) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            if (dequeueInputBuffer >= 0) {
                aVar.f4998a = aVar2.a(dequeueInputBuffer);
                bVar.h(aVar);
                mediaCodec.queueInputBuffer(dequeueInputBuffer, aVar.f4998a.position(), aVar.f4998a.remaining(), aVar.f5000c, aVar.f4999b ? 1 : 0);
                return;
            }
            return;
        }
        throw new RuntimeException("This should never happen!");
    }

    public final boolean e(d dVar, MediaFormat mediaFormat) {
        if (dVar == d.VIDEO && !mediaFormat.containsKey("frame-rate")) {
            mediaFormat.setInteger("frame-rate", 24);
        }
        int i10 = a.f23717a[dVar.ordinal()];
        if (i10 == 1) {
            return f(mediaFormat);
        }
        if (i10 == 2) {
            return g(mediaFormat);
        }
        throw new RuntimeException("Unexpected type: " + dVar);
    }

    public final boolean f(MediaFormat mediaFormat) {
        return mediaFormat.containsKey("mime") && mediaFormat.containsKey("channel-count") && mediaFormat.containsKey("sample-rate");
    }

    public final boolean g(MediaFormat mediaFormat) {
        return mediaFormat.containsKey("mime") && mediaFormat.containsKey("height") && mediaFormat.containsKey("width") && mediaFormat.containsKey("frame-rate");
    }

    public MediaFormat h(ca.b bVar, d dVar, MediaFormat mediaFormat) {
        if (e(dVar, mediaFormat)) {
            return mediaFormat;
        }
        MediaFormat a10 = a(bVar, dVar, mediaFormat);
        if (e(dVar, a10)) {
            return a10;
        }
        String str = "Could not get a complete format! hasMimeType:" + a10.containsKey("mime");
        if (dVar == d.VIDEO) {
            str = ((str + " hasWidth:" + a10.containsKey("width")) + " hasHeight:" + a10.containsKey("height")) + " hasFrameRate:" + a10.containsKey("frame-rate");
        } else if (dVar == d.AUDIO) {
            str = (str + " hasChannels:" + a10.containsKey("channel-count")) + " hasSampleRate:" + a10.containsKey("sample-rate");
        }
        throw new RuntimeException(str);
    }
}
