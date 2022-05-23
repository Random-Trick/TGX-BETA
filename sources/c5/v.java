package c5;

import android.media.MediaFormat;
import d5.c;
import java.nio.ByteBuffer;
import java.util.List;

public final class v {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, c cVar) {
        if (cVar != null) {
            d(mediaFormat, "color-transfer", cVar.f6212c);
            d(mediaFormat, "color-standard", cVar.f6210a);
            d(mediaFormat, "color-range", cVar.f6211b);
            a(mediaFormat, "hdr-static-info", cVar.M);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i10);
            mediaFormat.setByteBuffer(sb2.toString(), ByteBuffer.wrap(list.get(i10)));
        }
    }
}
