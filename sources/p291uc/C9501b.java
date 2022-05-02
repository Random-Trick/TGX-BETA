package p291uc;

import android.media.MediaMetadataRetriever;
import java.io.File;
import nc.C7389v0;
import org.thunderdog.challegram.Log;

public class C9501b {
    public String f30759a;
    public String f30760b;
    public int f30761c;
    public String f30762d;
    public String f30763e;

    public C9501b(String str) {
        this.f30759a = str;
        this.f30760b = new File(str).getName();
        m8460e();
    }

    public int m8464a() {
        return this.f30761c;
    }

    public String m8463b() {
        return this.f30763e;
    }

    public String m8462c() {
        return this.f30762d;
    }

    public void m8461d() {
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            mediaMetadataRetriever = C7389v0.m16595p2(this.f30759a);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(7);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(2);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(3);
            if (extractMetadata != null) {
                try {
                    long parseLong = Long.parseLong(extractMetadata);
                    if (parseLong > 1000) {
                        this.f30761c = (int) (parseLong / 1000);
                    } else {
                        this.f30761c = (int) parseLong;
                    }
                } catch (NumberFormatException e) {
                    Log.m14710w("Cannot parse ID3 duration: %s", e, extractMetadata);
                }
            }
            if (extractMetadata2 != null) {
                String trim = extractMetadata2.trim();
                if (trim.length() > 0) {
                    if (this.f30762d == null) {
                        this.f30762d = trim;
                    }
                    if (extractMetadata3 != null) {
                        String trim2 = extractMetadata3.trim();
                        if (trim2.length() > 0) {
                            this.f30762d = trim;
                            this.f30763e = trim2;
                        }
                    } else if (extractMetadata4 != null) {
                        String trim3 = extractMetadata4.trim();
                        if (trim3.length() > 0) {
                            this.f30762d = trim;
                            this.f30763e = trim3;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Log.m14710w("cannot read id3 tags", th, new Object[0]);
        }
        C7389v0.m16730H(mediaMetadataRetriever);
        String str = this.f30762d;
        if (str == null) {
            this.f30762d = "";
        } else {
            this.f30762d = str.trim();
        }
        String str2 = this.f30763e;
        if (str2 == null) {
            this.f30763e = "";
        } else {
            this.f30763e = str2.trim();
        }
    }

    public final void m8460e() {
        String str = this.f30760b;
        if (str != null && str.length() > 0) {
            int indexOf = this.f30760b.indexOf(".mp3");
            String substring = (indexOf == -1 || indexOf != this.f30760b.length() - 4 || this.f30760b.length() <= 4) ? this.f30760b : this.f30760b.substring(0, indexOf);
            int indexOf2 = substring.indexOf(8211);
            if (indexOf2 == -1 && (indexOf2 = this.f30760b.indexOf(8212)) == -1) {
                indexOf2 = this.f30760b.indexOf(45);
            }
            if (indexOf2 == -1 || indexOf2 == substring.length() - 1) {
                this.f30762d = null;
                this.f30763e = null;
                return;
            }
            this.f30763e = substring.substring(0, indexOf2).trim();
            this.f30762d = substring.substring(indexOf2 + 1);
        }
    }
}
