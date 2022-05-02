package p011aa;

import android.media.MediaFormat;
import p192n9.EnumC7313d;
import p316w9.C10000b;
import p316w9.C10007i;
import p316w9.C9999a;

public class C0241c {
    public static final C10007i f745a = new C10007i("DefaultDataSinkChecks");

    public final void m42028a(MediaFormat mediaFormat) {
        String string = mediaFormat.getString("mime");
        if (!"audio/mp4a-latm".equals(string)) {
            throw new C0242d("Audio codecs other than AAC is not supported, actual mime type: " + string);
        }
    }

    public void m42027b(EnumC7313d dVar, MediaFormat mediaFormat) {
        if (dVar == EnumC7313d.VIDEO) {
            m42026c(mediaFormat);
        } else if (dVar == EnumC7313d.AUDIO) {
            m42028a(mediaFormat);
        }
    }

    public final void m42026c(MediaFormat mediaFormat) {
        String string = mediaFormat.getString("mime");
        if ("video/avc".equals(string)) {
            byte a = C10000b.m6296a(C9999a.m6298a(mediaFormat));
            String b = C10000b.m6295b(a);
            if (a == 66) {
                C10007i iVar = f745a;
                iVar.m6267c("Output H.264 profile: " + b);
                return;
            }
            C10007i iVar2 = f745a;
            iVar2.m6260j("Output H.264 profile: " + b + ". This might not be supported.");
            return;
        }
        throw new C0242d("Video codecs other than AVC is not supported, actual mime type: " + string);
    }
}
