package p059e4;

import android.media.MediaCodec;
import p216p3.C8025f;

public class C4138m extends C8025f {
    public final C4139n f13950a;
    public final String f13951b;

    public C4138m(java.lang.Throwable r5, p059e4.C4139n r6) {
        throw new UnsupportedOperationException("Method not decompiled: p059e4.C4138m.<init>(java.lang.Throwable, e4.n):void");
    }

    public static String m28811a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
