package e4;

import android.media.MediaCodec;
import p3.f;

public class m extends f {
    public final n f10509a;
    public final String f10510b;

    public m(java.lang.Throwable r5, e4.n r6) {
        throw new UnsupportedOperationException("Method not decompiled: e4.m.<init>(java.lang.Throwable, e4.n):void");
    }

    public static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
