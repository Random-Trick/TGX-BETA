package p020b5;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p032c5.C1608c;

public final class C1233v {
    public static void m37875a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void m37874b(MediaFormat mediaFormat, C1608c cVar) {
        if (cVar != null) {
            m37872d(mediaFormat, "color-transfer", cVar.f5894c);
            m37872d(mediaFormat, "color-standard", cVar.f5892a);
            m37872d(mediaFormat, "color-range", cVar.f5893b);
            m37875a(mediaFormat, "hdr-static-info", cVar.f5890M);
        }
    }

    public static void m37873c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void m37872d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void m37871e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i);
            mediaFormat.setByteBuffer(sb2.toString(), ByteBuffer.wrap(list.get(i)));
        }
    }
}
