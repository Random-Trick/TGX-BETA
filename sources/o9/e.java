package o9;

import ab.n;
import android.media.MediaFormat;
import ra.k;

public final class e {
    public static final d a(MediaFormat mediaFormat) {
        k.e(mediaFormat, "$this$trackType");
        d b10 = b(mediaFormat);
        if (b10 != null) {
            return b10;
        }
        throw new IllegalArgumentException(("Unexpected mime type: " + mediaFormat.getString("mime")).toString());
    }

    public static final d b(MediaFormat mediaFormat) {
        k.e(mediaFormat, "$this$trackTypeOrNull");
        String string = mediaFormat.getString("mime");
        k.c(string);
        k.d(string, "getString(MediaFormat.KEY_MIME)!!");
        if (n.x(string, "audio/", false, 2, null)) {
            return d.AUDIO;
        }
        String string2 = mediaFormat.getString("mime");
        k.c(string2);
        k.d(string2, "getString(MediaFormat.KEY_MIME)!!");
        if (n.x(string2, "video/", false, 2, null)) {
            return d.VIDEO;
        }
        return null;
    }
}
