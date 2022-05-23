package yd;

import android.media.MediaMetadataRetriever;
import oc.v0;
import org.thunderdog.challegram.Log;

public class b {
    public static byte[] a(String str) {
        MediaMetadataRetriever mediaMetadataRetriever;
        Throwable th;
        byte[] bArr = null;
        try {
            mediaMetadataRetriever = v0.p2(str);
            try {
                bArr = mediaMetadataRetriever.getEmbeddedPicture();
            } catch (Throwable th2) {
                th = th2;
                Log.w("Couldn't get the album cover", th, new Object[0]);
                v0.H(mediaMetadataRetriever);
                return bArr;
            }
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever = null;
        }
        v0.H(mediaMetadataRetriever);
        return bArr;
    }
}
