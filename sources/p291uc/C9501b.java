package p291uc;

import android.media.MediaMetadataRetriever;
import java.io.File;
import nc.C7389v0;
import org.thunderdog.challegram.Log;

public class C9501b {
    public String f30756a;
    public String f30757b;
    public int f30758c;
    public String f30759d;
    public String f30760e;

    public C9501b(String str) {
        this.f30756a = str;
        this.f30757b = new File(str).getName();
        m8460e();
    }

    public int m8464a() {
        return this.f30758c;
    }

    public String m8463b() {
        return this.f30760e;
    }

    public String m8462c() {
        return this.f30759d;
    }

    public void m8461d() {
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            mediaMetadataRetriever = C7389v0.m16595p2(this.f30756a);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(7);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(2);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(3);
            if (extractMetadata != null) {
                try {
                    long parseLong = Long.parseLong(extractMetadata);
                    if (parseLong > 1000) {
                        this.f30758c = (int) (parseLong / 1000);
                    } else {
                        this.f30758c = (int) parseLong;
                    }
                } catch (NumberFormatException e) {
                    Log.m14710w("Cannot parse ID3 duration: %s", e, extractMetadata);
                }
            }
            if (extractMetadata2 != null) {
                String trim = extractMetadata2.trim();
                if (trim.length() > 0) {
                    if (this.f30759d == null) {
                        this.f30759d = trim;
                    }
                    if (extractMetadata3 != null) {
                        String trim2 = extractMetadata3.trim();
                        if (trim2.length() > 0) {
                            this.f30759d = trim;
                            this.f30760e = trim2;
                        }
                    } else if (extractMetadata4 != null) {
                        String trim3 = extractMetadata4.trim();
                        if (trim3.length() > 0) {
                            this.f30759d = trim;
                            this.f30760e = trim3;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Log.m14710w("cannot read id3 tags", th, new Object[0]);
        }
        C7389v0.m16730H(mediaMetadataRetriever);
        String str = this.f30759d;
        if (str == null) {
            this.f30759d = "";
        } else {
            this.f30759d = str.trim();
        }
        String str2 = this.f30760e;
        if (str2 == null) {
            this.f30760e = "";
        } else {
            this.f30760e = str2.trim();
        }
    }

    public final void m8460e() {
        String str = this.f30757b;
        if (str != null && str.length() > 0) {
            int indexOf = this.f30757b.indexOf(".mp3");
            String substring = (indexOf == -1 || indexOf != this.f30757b.length() - 4 || this.f30757b.length() <= 4) ? this.f30757b : this.f30757b.substring(0, indexOf);
            int indexOf2 = substring.indexOf(8211);
            if (indexOf2 == -1 && (indexOf2 = this.f30757b.indexOf(8212)) == -1) {
                indexOf2 = this.f30757b.indexOf(45);
            }
            if (indexOf2 == -1 || indexOf2 == substring.length() - 1) {
                this.f30759d = null;
                this.f30760e = null;
                return;
            }
            this.f30760e = substring.substring(0, indexOf2).trim();
            this.f30759d = substring.substring(indexOf2 + 1);
        }
    }
}
