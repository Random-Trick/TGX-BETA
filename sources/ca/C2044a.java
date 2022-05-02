package ca;

import android.media.MediaFormat;
import java.util.List;
import p192n9.EnumC7311c;
import p316w9.C10001c;

public class C2044a implements AbstractC2055f {
    public C2047c f7257a;

    public static class C2046b {
        public int f7258a = -1;
        public int f7259b = -1;
        public long f7260c = Long.MIN_VALUE;
        public String f7261d = "audio/mp4a-latm";

        public C2046b m35771a(long j) {
            this.f7260c = j;
            return this;
        }

        public C2044a m35770b() {
            return new C2044a(m35768d());
        }

        public C2046b m35769c(int i) {
            this.f7258a = i;
            return this;
        }

        public C2047c m35768d() {
            C2047c cVar = new C2047c();
            cVar.f7262a = this.f7258a;
            cVar.f7263b = this.f7259b;
            cVar.f7265d = this.f7261d;
            cVar.f7264c = this.f7260c;
            return cVar;
        }

        public C2046b m35767e(int i) {
            this.f7259b = i;
            return this;
        }
    }

    public static class C2047c {
        public int f7262a;
        public int f7263b;
        public long f7264c;
        public String f7265d;

        public C2047c() {
        }
    }

    public C2044a(C2047c cVar) {
        this.f7257a = cVar;
    }

    public static C2046b m35774b() {
        return new C2046b();
    }

    @Override
    public EnumC7311c mo35736a(List<MediaFormat> list, MediaFormat mediaFormat) {
        int i;
        int i2;
        long j;
        if (this.f7257a.f7262a == -1) {
            i = m35773c(list);
        } else {
            i = this.f7257a.f7262a;
        }
        if (this.f7257a.f7263b == -1) {
            i2 = m35772d(list);
        } else {
            i2 = this.f7257a.f7263b;
        }
        if (list.size() == 1 && this.f7257a.f7262a == -1 && this.f7257a.f7263b == -1 && this.f7257a.f7264c == Long.MIN_VALUE && list.get(0).containsKey("bitrate")) {
            j = list.get(0).getInteger("bitrate");
        } else if (this.f7257a.f7264c == Long.MIN_VALUE) {
            j = C10001c.m6294a(i, i2);
        } else {
            j = this.f7257a.f7264c;
        }
        mediaFormat.setString("mime", this.f7257a.f7265d);
        mediaFormat.setInteger("sample-rate", i2);
        mediaFormat.setInteger("channel-count", i);
        mediaFormat.setInteger("bitrate", (int) j);
        if ("audio/mp4a-latm".equalsIgnoreCase(this.f7257a.f7265d)) {
            mediaFormat.setInteger("aac-profile", 2);
        }
        return EnumC7311c.COMPRESSING;
    }

    public final int m35773c(List<MediaFormat> list) {
        int i = 0;
        for (MediaFormat mediaFormat : list) {
            i = Math.max(i, mediaFormat.getInteger("channel-count"));
        }
        return i;
    }

    public final int m35772d(List<MediaFormat> list) {
        int i = Integer.MAX_VALUE;
        for (MediaFormat mediaFormat : list) {
            i = Math.min(i, mediaFormat.getInteger("sample-rate"));
        }
        return i;
    }
}
