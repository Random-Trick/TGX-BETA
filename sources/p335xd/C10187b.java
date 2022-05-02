package p335xd;

import android.media.MediaMetadataRetriever;
import nc.C7389v0;
import org.thunderdog.challegram.Log;

public class C10187b {
    public static byte[] m5804a(String str) {
        MediaMetadataRetriever mediaMetadataRetriever;
        Throwable th;
        byte[] bArr = null;
        try {
            mediaMetadataRetriever = C7389v0.m16595p2(str);
            try {
                bArr = mediaMetadataRetriever.getEmbeddedPicture();
            } catch (Throwable th2) {
                th = th2;
                Log.m14710w("Couldn't get the album cover", th, new Object[0]);
                C7389v0.m16730H(mediaMetadataRetriever);
                return bArr;
            }
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever = null;
        }
        C7389v0.m16730H(mediaMetadataRetriever);
        return bArr;
    }
}
