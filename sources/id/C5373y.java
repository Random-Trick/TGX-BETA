package id;

import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.loader.C7907b;
import p108hb.C5063c;
import p108hb.C5069h;
import p108hb.C5070i;
import p139jb.AbstractC5920l;
import p191n8.AbstractC7307g;
import p191n8.C7304d;
import p204o8.C7793a;
import p235q8.C8277a;
import p235q8.C8280d;
import p345y8.C10453g;

public class C5373y {
    public final String f17657a;
    public MediaExtractor f17658b;
    public C7304d f17659c;
    public List<AbstractC7307g> f17660d;
    public double[] f17661e;
    public double f17662f;
    public double f17663g;
    public double f17664h;
    public int f17665i;
    public long f17666j;
    public boolean f17667k;
    public int f17668l;
    public int f17669m;
    public MediaMetadataRetriever f17670n;

    public C5373y(String str) {
        MediaExtractor mediaExtractor;
        boolean z;
        int i = -1;
        this.f17668l = -1;
        this.f17669m = -1;
        this.f17657a = str;
        try {
            mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(str);
            int i2 = 0;
            z = false;
            while (i2 < mediaExtractor.getTrackCount()) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString("mime");
                if (!C5070i.m24061i(string) && string.startsWith("video/")) {
                    long j = trackFormat.getLong("durationUs");
                    this.f17662f = j / 1000000.0d;
                    if (trackFormat.containsKey("frame-rate")) {
                        this.f17665i = trackFormat.getInteger("frame-rate");
                    }
                    if (trackFormat.containsKey("bitrate")) {
                        this.f17666j = trackFormat.getLong("bitrate");
                    }
                    if (trackFormat.containsKey("width")) {
                        this.f17663g = trackFormat.getInteger("width");
                    }
                    if (trackFormat.containsKey("height")) {
                        this.f17664h = trackFormat.getInteger("height");
                    }
                    int i3 = this.f17669m;
                    if (i3 != i) {
                        mediaExtractor.unselectTrack(i3);
                        this.f17669m = i;
                    }
                    this.f17669m = i2;
                    this.f17668l = i2;
                    mediaExtractor.selectTrack(i2);
                    mediaExtractor.seekTo(0L, 2);
                    long sampleTime = mediaExtractor.getSampleTime();
                    if (mediaExtractor.advance()) {
                        long sampleTime2 = mediaExtractor.getSampleTime();
                        if (!C5063c.m24144b(mediaExtractor.getSampleFlags(), 1)) {
                            mediaExtractor.seekTo(sampleTime2, 1);
                            sampleTime2 = mediaExtractor.getSampleTime();
                        }
                        this.f17667k = sampleTime2 > sampleTime && j - sampleTime2 >= 1000;
                    }
                    z = true;
                }
                i2++;
                i = -1;
            }
        } catch (Throwable th) {
            Log.m14722i(Log.TAG_VIDEO, "Unable to create MediaExtractor", th, new Object[0]);
        }
        if (z) {
            this.f17658b = mediaExtractor;
            return;
        }
        mediaExtractor.release();
        m23044s();
        if (this.f17659c == null) {
            throw new IllegalArgumentException("Unsupported video format");
        }
    }

    public static int m23050m(C10453g gVar) {
        if (gVar == null || gVar.equals(C10453g.f33523j)) {
            return 0;
        }
        if (gVar.equals(C10453g.f33524k)) {
            return 90;
        }
        if (gVar.equals(C10453g.f33525l)) {
            return 180;
        }
        if (gVar.equals(C10453g.f33526m)) {
            return 270;
        }
        throw new IllegalArgumentException();
    }

    public static C10453g m23047p(int i) {
        int l = C5069h.m24081l(i, 360);
        if (l == 0) {
            return C10453g.f33523j;
        }
        if (l == 90) {
            return C10453g.f33524k;
        }
        if (l == 180) {
            return C10453g.f33525l;
        }
        if (l == 270) {
            return C10453g.f33526m;
        }
        throw new IllegalArgumentException();
    }

    public boolean m23062a() {
        return this.f17662f > 0.0d && this.f17667k;
    }

    public double m23061b(double d, double d2, boolean z) {
        if (m23046q(z)) {
            d2 = Math.max(d, m23059d(d2, 3));
            while (true) {
                if (d != d2 && d2 - d >= 0.5d) {
                    break;
                }
                double d3 = m23059d(d2, 1);
                if (d2 == d3) {
                    break;
                }
                d2 = d3;
            }
        }
        return d2;
    }

    public double m23060c(double d, double d2, boolean z) {
        if (m23046q(z)) {
            d = Math.min(d2, m23059d(d, 3));
            while (d != 0.0d && (d == d2 || d2 - d < 0.5d)) {
                double d3 = m23059d(d, 2);
                if (d3 == d) {
                    break;
                }
                d = d3;
            }
        }
        return d;
    }

    public final double m23059d(double d, int i) {
        MediaExtractor mediaExtractor = this.f17658b;
        int i2 = 0;
        if (mediaExtractor != null) {
            try {
                mediaExtractor.seekTo((long) (d * 1000000.0d), i == 2 ? 0 : i == 1 ? 1 : 2);
                long sampleTime = this.f17658b.getSampleTime();
                if (sampleTime == -1) {
                    return this.f17662f;
                }
                double d2 = sampleTime / 1000000.0d;
                if (i != 1) {
                    if (i != 2) {
                        return (i == 3 && Math.abs(this.f17662f - d) < Math.abs(d2 - d)) ? this.f17662f : d2;
                    }
                    if (d2 < d) {
                        return d2;
                    }
                    this.f17658b.seekTo(sampleTime - 1, 0);
                    long sampleTime2 = this.f17658b.getSampleTime();
                    if (sampleTime2 == -1) {
                        return 0.0d;
                    }
                    return sampleTime2 / 1000000.0d;
                } else if (d2 > d) {
                    return d2;
                } else {
                    if (!this.f17658b.advance()) {
                        return this.f17662f;
                    }
                    long sampleTime3 = this.f17658b.getSampleTime();
                    if (sampleTime3 == -1) {
                        return this.f17662f;
                    }
                    if (!C5063c.m24144b(this.f17658b.getSampleFlags(), 1)) {
                        this.f17658b.seekTo(sampleTime3, 1);
                        sampleTime3 = this.f17658b.getSampleTime();
                        if (sampleTime3 == -1) {
                            return this.f17662f;
                        }
                    }
                    double d3 = sampleTime3 / 1000000.0d;
                    return d3 <= d2 ? this.f17662f : d3;
                }
            } catch (Throwable th) {
                Log.m14712w(Log.TAG_VIDEO, "Unable to seek", th, new Object[0]);
                return d;
            }
        } else {
            double d4 = 0.0d;
            double[] dArr = this.f17661e;
            if (dArr == null) {
                return d;
            }
            int length = dArr.length;
            double d5 = 0.0d;
            int i3 = 0;
            while (i2 < length) {
                double d6 = dArr[i2];
                if (d6 <= d) {
                    i3++;
                    i2++;
                    d5 = d4;
                    d4 = d6;
                } else if (i == 3) {
                    return Math.abs(d4 - d) < Math.abs(d6 - d) ? d4 : d6;
                } else if (i == 2) {
                    return d == d6 ? d4 : d5;
                } else {
                    if (i != 1) {
                        throw new IllegalArgumentException();
                    } else if (d != d6) {
                        return d6;
                    } else {
                        int i4 = i3 + 1;
                        double[] dArr2 = this.f17661e;
                        return i4 < dArr2.length ? dArr2[i4] : d6;
                    }
                }
            }
            double d7 = this.f17662f;
            if (d7 != d4) {
                if (i == 1) {
                    return d7;
                }
                if (i == 3) {
                    return Math.abs(d7 - d) < Math.abs(d4 - d) ? this.f17662f : d4;
                }
            }
            return (d4 == d && i == 2) ? d5 : d4;
        }
    }

    public boolean m23058e(java.lang.String r32, boolean r33, int r34, double r35, double r37, p139jb.AbstractC5920l r39, java.util.concurrent.atomic.AtomicBoolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: id.C5373y.m23058e(java.lang.String, boolean, int, double, double, jb.l, java.util.concurrent.atomic.AtomicBoolean):boolean");
    }

    public boolean m23057f(String str, boolean z, int i, AbstractC5920l lVar, AtomicBoolean atomicBoolean) {
        return m23058e(str, z, i, -1.0d, -1.0d, lVar, atomicBoolean);
    }

    public double m23056g(double d) {
        return m23059d(d, 3);
    }

    public long m23055h() {
        return this.f17666j;
    }

    public Bitmap m23054i(double d, int i) {
        MediaMetadataRetriever l = m23051l();
        if (l == null) {
            return null;
        }
        Bitmap frameAtTime = l.getFrameAtTime((long) (d * 1000000.0d), 3);
        if (!C7389v0.m16756A1(frameAtTime)) {
            return null;
        }
        float f = i;
        float max = Math.max(f / frameAtTime.getWidth(), f / frameAtTime.getHeight());
        return max < 1.0f ? C7907b.m14351v(frameAtTime, (int) (frameAtTime.getWidth() * max), (int) (frameAtTime.getHeight() * max), false) : frameAtTime;
    }

    public int m23053j() {
        return this.f17665i;
    }

    public double m23052k() {
        return this.f17664h;
    }

    public final MediaMetadataRetriever m23051l() {
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = this.f17670n;
        if (mediaMetadataRetriever2 == null) {
            mediaMetadataRetriever2 = null;
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(this.f17657a);
                    this.f17670n = mediaMetadataRetriever;
                    return mediaMetadataRetriever;
                } catch (Throwable th2) {
                    th = th2;
                    Log.m14722i(Log.TAG_VIDEO, "Unable to open retriever", th, new Object[0]);
                    if (mediaMetadataRetriever != null) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused) {
                        }
                    }
                    return mediaMetadataRetriever2;
                }
            } catch (Throwable th3) {
                th = th3;
                mediaMetadataRetriever = null;
            }
        }
        return mediaMetadataRetriever2;
    }

    public double m23049n() {
        return this.f17662f;
    }

    public double m23048o() {
        return this.f17663g;
    }

    public boolean m23046q(boolean z) {
        return true;
    }

    public final C7304d m23045r(boolean z, int i, double d, double d2) {
        C8277a aVar;
        m23044s();
        C7304d dVar = this.f17659c;
        if (dVar != null) {
            double d3 = -1.0d;
            if (!z && i == 0 && d == -1.0d && d2 == -1.0d) {
                return null;
            }
            dVar.m17093i(new LinkedList());
            for (AbstractC7307g gVar : this.f17660d) {
                if (!z || !"soun".equals(gVar.getHandler())) {
                    if (d == d3 || d2 == d3) {
                        aVar = new C8277a(gVar);
                    } else {
                        long j = 0;
                        double d4 = 0.0d;
                        long g = gVar.mo12961D().m17081g();
                        long[] R = gVar.mo12958R();
                        int length = R.length;
                        double d5 = d3;
                        long j2 = -1;
                        int i2 = 0;
                        long j3 = -1;
                        while (i2 < length) {
                            long j4 = R[i2];
                            int i3 = (d4 > d5 ? 1 : (d4 == d5 ? 0 : -1));
                            if (i3 > 0 && d4 <= d) {
                                j3 = j;
                            }
                            if (i3 > 0 && d4 <= d2) {
                                j2 = j;
                            }
                            j3 = j3;
                            d4 += j4 / g;
                            j++;
                            i2++;
                            d5 = d4;
                        }
                        int i4 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                        long j5 = (i4 == 0 || j2 != -1) ? j2 : j3 + 1;
                        if (i4 == 0 || j5 == -1) {
                            throw new IllegalArgumentException();
                        }
                        aVar = new C8277a(new C8280d(gVar, j3, j5));
                    }
                    if (i != 0) {
                        aVar.mo12961D().m17073p(m23047p(m23050m(aVar.mo12961D().m17082f()) + i));
                    }
                    this.f17659c.m17101a(aVar);
                    d3 = -1.0d;
                }
            }
            return this.f17659c;
        }
        throw new IllegalStateException();
    }

    public final void m23044s() {
        C7304d dVar;
        boolean z;
        try {
            dVar = C7793a.m15077b(this.f17657a);
        } catch (Throwable th) {
            Log.m14722i(Log.TAG_VIDEO, "Unable to create mp4 movie", th, new Object[0]);
            dVar = null;
        }
        if (dVar != null) {
            this.f17659c = dVar;
            List<AbstractC7307g> g = dVar.m17095g();
            this.f17660d = g;
            Iterator<AbstractC7307g> it = g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC7307g next = it.next();
                long[] G = next.mo12960G();
                if (!(G == null || G.length == 0)) {
                    double[] dArr = new double[G.length];
                    long g2 = next.mo12961D().m17081g();
                    this.f17663g = next.mo12961D().m17078j();
                    this.f17664h = next.mo12961D().m17085c();
                    long j = 0;
                    long[] R = next.mo12958R();
                    int length = R.length;
                    double d = 0.0d;
                    for (int i = 0; i < length; i++) {
                        long j2 = R[i];
                        j++;
                        int binarySearch = Arrays.binarySearch(G, j);
                        if (binarySearch >= 0) {
                            dArr[binarySearch] = d;
                        }
                        R = R;
                        G = G;
                        d += j2 / g2;
                    }
                    double[] dArr2 = this.f17661e;
                    if (!(dArr2 == null || Arrays.equals(dArr2, dArr))) {
                        this.f17661e = null;
                        this.f17662f = 0.0d;
                        break;
                    }
                    this.f17661e = dArr;
                    this.f17662f = d;
                }
            }
            double[] dArr3 = this.f17661e;
            if (dArr3 != null) {
                if (dArr3.length + ((dArr3.length <= 0 || this.f17662f <= dArr3[dArr3.length - 1]) ? 0 : 1) > 2) {
                    z = true;
                    this.f17667k = z;
                }
            }
            z = false;
            this.f17667k = z;
        }
    }

    public void m23043t() {
        MediaExtractor mediaExtractor = this.f17658b;
        if (mediaExtractor != null) {
            try {
                mediaExtractor.release();
            } catch (Throwable unused) {
            }
            this.f17658b = null;
        }
        MediaMetadataRetriever mediaMetadataRetriever = this.f17670n;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
            this.f17670n = null;
        }
    }

    public final void m23042u(int i) {
        MediaExtractor mediaExtractor;
        int i2 = this.f17669m;
        if (i2 != i && (mediaExtractor = this.f17658b) != null) {
            if (i2 != -1) {
                mediaExtractor.unselectTrack(i2);
            }
            this.f17669m = i;
            if (i != -1) {
                this.f17658b.selectTrack(i);
            }
        }
    }
}
