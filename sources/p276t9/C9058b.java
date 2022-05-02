package p276t9;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import ba.AbstractC1296b;
import java.io.IOException;
import p192n9.EnumC7313d;

public class C9058b {

    public static class C9059a {
        public static final int[] f29037a;

        static {
            int[] iArr = new int[EnumC7313d.values().length];
            f29037a = iArr;
            try {
                iArr[EnumC7313d.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29037a[EnumC7313d.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final MediaFormat m10593a(AbstractC1296b bVar, EnumC7313d dVar, MediaFormat mediaFormat) {
        bVar.mo6287h(dVar);
        try {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            MediaFormat mediaFormat2 = null;
            createDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
            createDecoderByType.start();
            C9057a aVar = new C9057a(createDecoderByType);
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            AbstractC1296b.C1297a aVar2 = new AbstractC1296b.C1297a();
            while (mediaFormat2 == null) {
                mediaFormat2 = m10592b(dVar, bVar, aVar2, createDecoderByType, aVar, bufferInfo);
            }
            bVar.mo6282m();
            bVar.mo6290e();
            return mediaFormat2;
        } catch (IOException e) {
            throw new RuntimeException("Can't decode this track", e);
        }
    }

    public final MediaFormat m10592b(EnumC7313d dVar, AbstractC1296b bVar, AbstractC1296b.C1297a aVar, MediaCodec mediaCodec, C9057a aVar2, MediaCodec.BufferInfo bufferInfo) {
        MediaFormat c = m10591c(mediaCodec, aVar2, bufferInfo);
        if (c != null) {
            return c;
        }
        m10590d(dVar, bVar, aVar, mediaCodec, aVar2);
        return null;
    }

    public final MediaFormat m10591c(MediaCodec mediaCodec, C9057a aVar, MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        if (dequeueOutputBuffer == -3) {
            aVar.m10594c();
            return m10591c(mediaCodec, aVar, bufferInfo);
        } else if (dequeueOutputBuffer == -2) {
            return mediaCodec.getOutputFormat();
        } else {
            if (dequeueOutputBuffer != -1) {
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
            return null;
        }
    }

    public final void m10590d(EnumC7313d dVar, AbstractC1296b bVar, AbstractC1296b.C1297a aVar, MediaCodec mediaCodec, C9057a aVar2) {
        if (bVar.mo6284k(dVar)) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            if (dequeueInputBuffer >= 0) {
                aVar.f4675a = aVar2.m10596a(dequeueInputBuffer);
                bVar.mo6289f(aVar);
                mediaCodec.queueInputBuffer(dequeueInputBuffer, aVar.f4675a.position(), aVar.f4675a.remaining(), aVar.f4677c, aVar.f4676b ? 1 : 0);
                return;
            }
            return;
        }
        throw new RuntimeException("This should never happen!");
    }

    public final boolean m10589e(EnumC7313d dVar, MediaFormat mediaFormat) {
        if (dVar == EnumC7313d.VIDEO && !mediaFormat.containsKey("frame-rate")) {
            mediaFormat.setInteger("frame-rate", 24);
        }
        int i = C9059a.f29037a[dVar.ordinal()];
        if (i == 1) {
            return m10588f(mediaFormat);
        }
        if (i == 2) {
            return m10587g(mediaFormat);
        }
        throw new RuntimeException("Unexpected type: " + dVar);
    }

    public final boolean m10588f(MediaFormat mediaFormat) {
        return mediaFormat.containsKey("mime") && mediaFormat.containsKey("channel-count") && mediaFormat.containsKey("sample-rate");
    }

    public final boolean m10587g(MediaFormat mediaFormat) {
        return mediaFormat.containsKey("mime") && mediaFormat.containsKey("height") && mediaFormat.containsKey("width") && mediaFormat.containsKey("frame-rate");
    }

    public MediaFormat m10586h(AbstractC1296b bVar, EnumC7313d dVar, MediaFormat mediaFormat) {
        if (m10589e(dVar, mediaFormat)) {
            return mediaFormat;
        }
        MediaFormat a = m10593a(bVar, dVar, mediaFormat);
        if (m10589e(dVar, a)) {
            return a;
        }
        String str = "Could not get a complete format! hasMimeType:" + a.containsKey("mime");
        if (dVar == EnumC7313d.VIDEO) {
            str = ((str + " hasWidth:" + a.containsKey("width")) + " hasHeight:" + a.containsKey("height")) + " hasFrameRate:" + a.containsKey("frame-rate");
        } else if (dVar == EnumC7313d.AUDIO) {
            str = (str + " hasChannels:" + a.containsKey("channel-count")) + " hasSampleRate:" + a.containsKey("sample-rate");
        }
        throw new RuntimeException(str);
    }
}
