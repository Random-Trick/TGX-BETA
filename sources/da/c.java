package da;

import aa.d;
import android.media.MediaFormat;
import android.os.Build;
import java.util.List;
import x9.i;

public class c implements f {
    public static final i f7273b = new i("DefaultVideoStrategy");
    public final C0083c f7274a;

    public static class b {
        public aa.c f7275a;
        public int f7276b = 30;
        public long f7277c = Long.MIN_VALUE;
        public float f7278d = 3.0f;
        public String f7279e = "video/avc";

        public b(d dVar) {
            aa.c cVar = new aa.c();
            this.f7275a = cVar;
            cVar.b(dVar);
        }

        public b a(long j10) {
            this.f7277c = j10;
            return this;
        }

        public c b() {
            return new c(e());
        }

        public b c(int i10) {
            this.f7276b = i10;
            return this;
        }

        public b d(float f10) {
            this.f7278d = f10;
            return this;
        }

        public C0083c e() {
            C0083c cVar = new C0083c();
            cVar.f7280a = this.f7275a;
            cVar.f7282c = this.f7276b;
            cVar.f7281b = this.f7277c;
            cVar.f7283d = this.f7278d;
            cVar.f7284e = this.f7279e;
            return cVar;
        }
    }

    public static class C0083c {
        public d f7280a;
        public long f7281b;
        public int f7282c;
        public float f7283d;
        public String f7284e;

        public C0083c() {
        }
    }

    public c(C0083c cVar) {
        this.f7274a = cVar;
    }

    public static b b(int i10, int i11) {
        return new b(new aa.a(i10, i11));
    }

    public static b d(int i10, int i11) {
        return new b(new aa.b(i10, i11));
    }

    @Override
    public o9.c a(List<MediaFormat> list, MediaFormat mediaFormat) {
        int i10;
        int i11;
        int i12;
        long j10;
        boolean c10 = c(list);
        o9.a f10 = f(list);
        int d10 = f10.d();
        int c11 = f10.c();
        i iVar = f7273b;
        iVar.c("Input width&height: " + d10 + "x" + c11);
        try {
            o9.b a10 = this.f7274a.f7280a.a(f10);
            if (a10 instanceof o9.a) {
                o9.a aVar = (o9.a) a10;
                i10 = aVar.d();
                i11 = aVar.c();
            } else if (d10 >= c11) {
                i10 = a10.a();
                i11 = a10.b();
            } else {
                i10 = a10.b();
                i11 = a10.a();
            }
            iVar.c("Output width&height: " + i10 + "x" + i11);
            boolean z10 = true;
            boolean z11 = f10.b() <= a10.b();
            int g10 = g(list);
            if (g10 > 0) {
                i12 = Math.min(g10, this.f7274a.f7282c);
            } else {
                i12 = this.f7274a.f7282c;
            }
            boolean z12 = g10 <= i12;
            int e10 = e(list);
            boolean z13 = ((float) e10) >= this.f7274a.f7283d;
            if (list.size() != 1) {
                z10 = false;
            }
            if (!z10 || !c10 || !z11 || !z12 || !z13) {
                mediaFormat.setString("mime", this.f7274a.f7284e);
                mediaFormat.setInteger("width", i10);
                mediaFormat.setInteger("height", i11);
                mediaFormat.setInteger("rotation-degrees", 0);
                mediaFormat.setInteger("frame-rate", i12);
                if (Build.VERSION.SDK_INT >= 25) {
                    mediaFormat.setFloat("i-frame-interval", this.f7274a.f7283d);
                } else {
                    mediaFormat.setInteger("i-frame-interval", (int) Math.ceil(this.f7274a.f7283d));
                }
                mediaFormat.setInteger("color-format", 2130708361);
                if (this.f7274a.f7281b == Long.MIN_VALUE) {
                    j10 = x9.c.b(i10, i11, i12);
                } else {
                    j10 = this.f7274a.f7281b;
                }
                mediaFormat.setInteger("bitrate", (int) j10);
                return o9.c.COMPRESSING;
            }
            iVar.c("Input minSize: " + f10.b() + ", desired minSize: " + a10.b() + "\nInput frameRate: " + g10 + ", desired frameRate: " + i12 + "\nInput iFrameInterval: " + e10 + ", desired iFrameInterval: " + this.f7274a.f7283d);
            return o9.c.PASS_THROUGH;
        } catch (Exception e11) {
            throw new RuntimeException("Resizer error:", e11);
        }
    }

    public final boolean c(List<MediaFormat> list) {
        for (MediaFormat mediaFormat : list) {
            if (!mediaFormat.getString("mime").equalsIgnoreCase(this.f7274a.f7284e)) {
                return false;
            }
        }
        return true;
    }

    public final int e(List<MediaFormat> list) {
        int i10 = 0;
        int i11 = 0;
        for (MediaFormat mediaFormat : list) {
            if (mediaFormat.containsKey("i-frame-interval")) {
                i10++;
                i11 += mediaFormat.getInteger("i-frame-interval");
            }
        }
        if (i10 > 0) {
            return Math.round(i11 / i10);
        }
        return -1;
    }

    public final o9.a f(List<MediaFormat> list) {
        int size = list.size();
        float[] fArr = new float[size];
        boolean[] zArr = new boolean[size];
        float f10 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            MediaFormat mediaFormat = list.get(i10);
            float integer = mediaFormat.getInteger("width");
            float integer2 = mediaFormat.getInteger("height");
            boolean z10 = (mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0) % 180 != 0;
            zArr[i10] = z10;
            fArr[i10] = z10 ? integer2 / integer : integer / integer2;
            f10 += fArr[i10];
        }
        float f11 = f10 / size;
        int i11 = 0;
        float f12 = Float.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            float abs = Math.abs(fArr[i12] - f11);
            if (abs < f12) {
                i11 = i12;
                f12 = abs;
            }
        }
        MediaFormat mediaFormat2 = list.get(i11);
        int integer3 = mediaFormat2.getInteger("width");
        int integer4 = mediaFormat2.getInteger("height");
        int i13 = zArr[i11] ? integer4 : integer3;
        if (!zArr[i11]) {
            integer3 = integer4;
        }
        return new o9.a(i13, integer3);
    }

    public final int g(List<MediaFormat> list) {
        int i10 = Integer.MAX_VALUE;
        for (MediaFormat mediaFormat : list) {
            if (mediaFormat.containsKey("frame-rate")) {
                i10 = Math.min(i10, mediaFormat.getInteger("frame-rate"));
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10;
    }
}
