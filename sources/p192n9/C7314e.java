package p192n9;

import android.media.MediaFormat;
import qa.C8298k;
import za.C11451n;

public final class C7314e {
    public static final EnumC7313d m17063a(MediaFormat mediaFormat) {
        C8298k.m12934e(mediaFormat, "$this$trackType");
        EnumC7313d b = m17062b(mediaFormat);
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException(("Unexpected mime type: " + mediaFormat.getString("mime")).toString());
    }

    public static final EnumC7313d m17062b(MediaFormat mediaFormat) {
        C8298k.m12934e(mediaFormat, "$this$trackTypeOrNull");
        String string = mediaFormat.getString("mime");
        C8298k.m12936c(string);
        C8298k.m12935d(string, "getString(MediaFormat.KEY_MIME)!!");
        if (C11451n.m621x(string, "audio/", false, 2, null)) {
            return EnumC7313d.AUDIO;
        }
        String string2 = mediaFormat.getString("mime");
        C8298k.m12936c(string2);
        C8298k.m12935d(string2, "getString(MediaFormat.KEY_MIME)!!");
        if (C11451n.m621x(string2, "video/", false, 2, null)) {
            return EnumC7313d.VIDEO;
        }
        return null;
    }
}
