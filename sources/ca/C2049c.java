package ca;

import android.media.MediaFormat;
import android.os.Build;
import java.util.List;
import p192n9.C7309a;
import p192n9.C7310b;
import p192n9.EnumC7311c;
import p316w9.C10001c;
import p316w9.C10007i;
import p361z9.AbstractC11433d;
import p361z9.C11430a;
import p361z9.C11431b;
import p361z9.C11432c;

public class C2049c implements AbstractC2055f {
    public static final C10007i f7266b = new C10007i("DefaultVideoStrategy");
    public final C2052c f7267a;

    public static class C2051b {
        public C11432c f7268a;
        public int f7269b = 30;
        public long f7270c = Long.MIN_VALUE;
        public float f7271d = 3.0f;
        public String f7272e = "video/avc";

        public C2051b(AbstractC11433d dVar) {
            C11432c cVar = new C11432c();
            this.f7268a = cVar;
            cVar.m663b(dVar);
        }

        public C2051b m35751a(long j) {
            this.f7270c = j;
            return this;
        }

        public C2049c m35750b() {
            return new C2049c(m35747e());
        }

        public C2051b m35749c(int i) {
            this.f7269b = i;
            return this;
        }

        public C2051b m35748d(float f) {
            this.f7271d = f;
            return this;
        }

        public C2052c m35747e() {
            C2052c cVar = new C2052c();
            cVar.f7273a = this.f7268a;
            cVar.f7275c = this.f7269b;
            cVar.f7274b = this.f7270c;
            cVar.f7276d = this.f7271d;
            cVar.f7277e = this.f7272e;
            return cVar;
        }
    }

    public static class C2052c {
        public AbstractC11433d f7273a;
        public long f7274b;
        public int f7275c;
        public float f7276d;
        public String f7277e;

        public C2052c() {
        }
    }

    public C2049c(C2052c cVar) {
        this.f7267a = cVar;
    }

    public static C2051b m35757b(int i, int i2) {
        return new C2051b(new C11430a(i, i2));
    }

    public static C2051b m35755d(int i, int i2) {
        return new C2051b(new C11431b(i, i2));
    }

    @Override
    public EnumC7311c mo35736a(List<MediaFormat> list, MediaFormat mediaFormat) {
        int i;
        int i2;
        long j;
        boolean c = m35756c(list);
        C7309a f = m35753f(list);
        int d = f.m17067d();
        int c2 = f.m17068c();
        C10007i iVar = f7266b;
        iVar.m6267c("Input width&height: " + d + "x" + c2);
        try {
            C7310b a = this.f7267a.f7273a.mo662a(f);
            if (a instanceof C7309a) {
                C7309a aVar = (C7309a) a;
                i = aVar.m17067d();
                i2 = aVar.m17068c();
            } else if (d >= c2) {
                i = a.m17066a();
                i2 = a.m17065b();
            } else {
                i = a.m17065b();
                i2 = a.m17066a();
            }
            iVar.m6267c("Output width&height: " + i + "x" + i2);
            boolean z = true;
            boolean z2 = f.m17065b() <= a.m17065b();
            int g = m35752g(list);
            int min = g > 0 ? Math.min(g, this.f7267a.f7275c) : this.f7267a.f7275c;
            boolean z3 = g <= min;
            int e = m35754e(list);
            boolean z4 = ((float) e) >= this.f7267a.f7276d;
            if (list.size() != 1) {
                z = false;
            }
            if (!z || !c || !z2 || !z3 || !z4) {
                mediaFormat.setString("mime", this.f7267a.f7277e);
                mediaFormat.setInteger("width", i);
                mediaFormat.setInteger("height", i2);
                mediaFormat.setInteger("rotation-degrees", 0);
                mediaFormat.setInteger("frame-rate", min);
                if (Build.VERSION.SDK_INT >= 25) {
                    mediaFormat.setFloat("i-frame-interval", this.f7267a.f7276d);
                } else {
                    mediaFormat.setInteger("i-frame-interval", (int) Math.ceil(this.f7267a.f7276d));
                }
                mediaFormat.setInteger("color-format", 2130708361);
                if (this.f7267a.f7274b == Long.MIN_VALUE) {
                    j = C10001c.m6293b(i, i2, min);
                } else {
                    j = this.f7267a.f7274b;
                }
                mediaFormat.setInteger("bitrate", (int) j);
                return EnumC7311c.COMPRESSING;
            }
            iVar.m6267c("Input minSize: " + f.m17065b() + ", desired minSize: " + a.m17065b() + "\nInput frameRate: " + g + ", desired frameRate: " + min + "\nInput iFrameInterval: " + e + ", desired iFrameInterval: " + this.f7267a.f7276d);
            return EnumC7311c.PASS_THROUGH;
        } catch (Exception e2) {
            throw new RuntimeException("Resizer error:", e2);
        }
    }

    public final boolean m35756c(List<MediaFormat> list) {
        for (MediaFormat mediaFormat : list) {
            if (!mediaFormat.getString("mime").equalsIgnoreCase(this.f7267a.f7277e)) {
                return false;
            }
        }
        return true;
    }

    public final int m35754e(List<MediaFormat> list) {
        int i = 0;
        int i2 = 0;
        for (MediaFormat mediaFormat : list) {
            if (mediaFormat.containsKey("i-frame-interval")) {
                i++;
                i2 += mediaFormat.getInteger("i-frame-interval");
            }
        }
        if (i > 0) {
            return Math.round(i2 / i);
        }
        return -1;
    }

    public final C7309a m35753f(List<MediaFormat> list) {
        int size = list.size();
        float[] fArr = new float[size];
        boolean[] zArr = new boolean[size];
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            MediaFormat mediaFormat = list.get(i);
            float integer = mediaFormat.getInteger("width");
            float integer2 = mediaFormat.getInteger("height");
            boolean z = (mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0) % 180 != 0;
            zArr[i] = z;
            fArr[i] = z ? integer2 / integer : integer / integer2;
            f += fArr[i];
        }
        float f2 = f / size;
        int i2 = 0;
        float f3 = Float.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            float abs = Math.abs(fArr[i3] - f2);
            if (abs < f3) {
                i2 = i3;
                f3 = abs;
            }
        }
        MediaFormat mediaFormat2 = list.get(i2);
        int integer3 = mediaFormat2.getInteger("width");
        int integer4 = mediaFormat2.getInteger("height");
        int i4 = zArr[i2] ? integer4 : integer3;
        if (!zArr[i2]) {
            integer3 = integer4;
        }
        return new C7309a(i4, integer3);
    }

    public final int m35752g(List<MediaFormat> list) {
        int i = Integer.MAX_VALUE;
        for (MediaFormat mediaFormat : list) {
            if (mediaFormat.containsKey("frame-rate")) {
                i = Math.min(i, mediaFormat.getInteger("frame-rate"));
            }
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }
}
