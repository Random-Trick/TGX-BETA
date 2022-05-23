package da;

import android.media.MediaFormat;
import java.util.List;

public class a implements f {
    public c f7264a;

    public static class b {
        public int f7265a = -1;
        public int f7266b = -1;
        public long f7267c = Long.MIN_VALUE;
        public String f7268d = "audio/mp4a-latm";

        public b a(long j10) {
            this.f7267c = j10;
            return this;
        }

        public a b() {
            return new a(d());
        }

        public b c(int i10) {
            this.f7265a = i10;
            return this;
        }

        public c d() {
            c cVar = new c();
            cVar.f7269a = this.f7265a;
            cVar.f7270b = this.f7266b;
            cVar.f7272d = this.f7268d;
            cVar.f7271c = this.f7267c;
            return cVar;
        }

        public b e(int i10) {
            this.f7266b = i10;
            return this;
        }
    }

    public static class c {
        public int f7269a;
        public int f7270b;
        public long f7271c;
        public String f7272d;

        public c() {
        }
    }

    public a(c cVar) {
        this.f7264a = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override
    public o9.c a(List<MediaFormat> list, MediaFormat mediaFormat) {
        int i10;
        int i11;
        long j10;
        if (this.f7264a.f7269a == -1) {
            i10 = c(list);
        } else {
            i10 = this.f7264a.f7269a;
        }
        if (this.f7264a.f7270b == -1) {
            i11 = d(list);
        } else {
            i11 = this.f7264a.f7270b;
        }
        if (list.size() == 1 && this.f7264a.f7269a == -1 && this.f7264a.f7270b == -1 && this.f7264a.f7271c == Long.MIN_VALUE && list.get(0).containsKey("bitrate")) {
            j10 = list.get(0).getInteger("bitrate");
        } else if (this.f7264a.f7271c == Long.MIN_VALUE) {
            j10 = x9.c.a(i10, i11);
        } else {
            j10 = this.f7264a.f7271c;
        }
        mediaFormat.setString("mime", this.f7264a.f7272d);
        mediaFormat.setInteger("sample-rate", i11);
        mediaFormat.setInteger("channel-count", i10);
        mediaFormat.setInteger("bitrate", (int) j10);
        if ("audio/mp4a-latm".equalsIgnoreCase(this.f7264a.f7272d)) {
            mediaFormat.setInteger("aac-profile", 2);
        }
        return o9.c.COMPRESSING;
    }

    public final int c(List<MediaFormat> list) {
        int i10 = 0;
        for (MediaFormat mediaFormat : list) {
            i10 = Math.max(i10, mediaFormat.getInteger("channel-count"));
        }
        return i10;
    }

    public final int d(List<MediaFormat> list) {
        int i10 = Integer.MAX_VALUE;
        for (MediaFormat mediaFormat : list) {
            i10 = Math.min(i10, mediaFormat.getInteger("sample-rate"));
        }
        return i10;
    }
}
