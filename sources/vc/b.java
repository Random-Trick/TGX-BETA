package vc;

import android.media.MediaMetadataRetriever;
import java.io.File;
import oc.v0;
import org.thunderdog.challegram.Log;

public class b {
    public String f24834a;
    public String f24835b;
    public int f24836c;
    public String f24837d;
    public String f24838e;

    public b(String str) {
        this.f24834a = str;
        this.f24835b = new File(str).getName();
        e();
    }

    public int a() {
        return this.f24836c;
    }

    public String b() {
        return this.f24838e;
    }

    public String c() {
        return this.f24837d;
    }

    public void d() {
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            mediaMetadataRetriever = v0.p2(this.f24834a);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(7);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(2);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(3);
            if (extractMetadata != null) {
                try {
                    long parseLong = Long.parseLong(extractMetadata);
                    if (parseLong > 1000) {
                        this.f24836c = (int) (parseLong / 1000);
                    } else {
                        this.f24836c = (int) parseLong;
                    }
                } catch (NumberFormatException e10) {
                    Log.w("Cannot parse ID3 duration: %s", e10, extractMetadata);
                }
            }
            if (extractMetadata2 != null) {
                String trim = extractMetadata2.trim();
                if (trim.length() > 0) {
                    if (this.f24837d == null) {
                        this.f24837d = trim;
                    }
                    if (extractMetadata3 != null) {
                        String trim2 = extractMetadata3.trim();
                        if (trim2.length() > 0) {
                            this.f24837d = trim;
                            this.f24838e = trim2;
                        }
                    } else if (extractMetadata4 != null) {
                        String trim3 = extractMetadata4.trim();
                        if (trim3.length() > 0) {
                            this.f24837d = trim;
                            this.f24838e = trim3;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Log.w("cannot read id3 tags", th, new Object[0]);
        }
        v0.H(mediaMetadataRetriever);
        String str = this.f24837d;
        if (str == null) {
            this.f24837d = "";
        } else {
            this.f24837d = str.trim();
        }
        String str2 = this.f24838e;
        if (str2 == null) {
            this.f24838e = "";
        } else {
            this.f24838e = str2.trim();
        }
    }

    public final void e() {
        String str = this.f24835b;
        if (str != null && str.length() > 0) {
            int indexOf = this.f24835b.indexOf(".mp3");
            String substring = (indexOf == -1 || indexOf != this.f24835b.length() - 4 || this.f24835b.length() <= 4) ? this.f24835b : this.f24835b.substring(0, indexOf);
            int indexOf2 = substring.indexOf(8211);
            if (indexOf2 == -1 && (indexOf2 = this.f24835b.indexOf(8212)) == -1) {
                indexOf2 = this.f24835b.indexOf(45);
            }
            if (indexOf2 == -1 || indexOf2 == substring.length() - 1) {
                this.f24837d = null;
                this.f24838e = null;
                return;
            }
            this.f24838e = substring.substring(0, indexOf2).trim();
            this.f24837d = substring.substring(indexOf2 + 1);
        }
    }
}
