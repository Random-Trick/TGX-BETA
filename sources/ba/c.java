package ba;

import android.media.MediaFormat;
import o9.d;
import x9.a;
import x9.b;
import x9.i;

public class c {
    public static final i f4083a = new i("DefaultDataSinkChecks");

    public final void a(MediaFormat mediaFormat) {
        String string = mediaFormat.getString("mime");
        if (!"audio/mp4a-latm".equals(string)) {
            throw new d("Audio codecs other than AAC is not supported, actual mime type: " + string);
        }
    }

    public void b(d dVar, MediaFormat mediaFormat) {
        if (dVar == d.VIDEO) {
            c(mediaFormat);
        } else if (dVar == d.AUDIO) {
            a(mediaFormat);
        }
    }

    public final void c(MediaFormat mediaFormat) {
        String string = mediaFormat.getString("mime");
        if ("video/avc".equals(string)) {
            byte a10 = b.a(a.a(mediaFormat));
            String b10 = b.b(a10);
            if (a10 == 66) {
                i iVar = f4083a;
                iVar.c("Output H.264 profile: " + b10);
                return;
            }
            i iVar2 = f4083a;
            iVar2.j("Output H.264 profile: " + b10 + ". This might not be supported.");
            return;
        }
        throw new d("Video codecs other than AVC is not supported, actual mime type: " + string);
    }
}
