package jd;

import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import ib.c;
import ib.h;
import ib.i;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kb.l;
import o8.d;
import o8.g;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.loader.b;
import r8.a;

public class y {
    public final String f15324a;
    public MediaExtractor f15325b;
    public d f15326c;
    public List<g> f15327d;
    public double[] f15328e;
    public double f15329f;
    public double f15330g;
    public double f15331h;
    public int f15332i;
    public long f15333j;
    public boolean f15334k;
    public int f15335l;
    public int f15336m;
    public MediaMetadataRetriever f15337n;

    public y(String str) {
        MediaExtractor mediaExtractor;
        boolean z10;
        int i10 = -1;
        this.f15335l = -1;
        this.f15336m = -1;
        this.f15324a = str;
        try {
            mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(str);
            int i11 = 0;
            z10 = false;
            while (i11 < mediaExtractor.getTrackCount()) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i11);
                String string = trackFormat.getString("mime");
                if (!i.i(string) && string.startsWith("video/")) {
                    long j10 = trackFormat.getLong("durationUs");
                    this.f15329f = j10 / 1000000.0d;
                    if (trackFormat.containsKey("frame-rate")) {
                        this.f15332i = trackFormat.getInteger("frame-rate");
                    }
                    if (trackFormat.containsKey("bitrate")) {
                        this.f15333j = trackFormat.getLong("bitrate");
                    }
                    if (trackFormat.containsKey("width")) {
                        this.f15330g = trackFormat.getInteger("width");
                    }
                    if (trackFormat.containsKey("height")) {
                        this.f15331h = trackFormat.getInteger("height");
                    }
                    int i12 = this.f15336m;
                    if (i12 != i10) {
                        mediaExtractor.unselectTrack(i12);
                        this.f15336m = i10;
                    }
                    this.f15336m = i11;
                    this.f15335l = i11;
                    mediaExtractor.selectTrack(i11);
                    mediaExtractor.seekTo(0L, 2);
                    long sampleTime = mediaExtractor.getSampleTime();
                    if (mediaExtractor.advance()) {
                        long sampleTime2 = mediaExtractor.getSampleTime();
                        if (!c.b(mediaExtractor.getSampleFlags(), 1)) {
                            mediaExtractor.seekTo(sampleTime2, 1);
                            sampleTime2 = mediaExtractor.getSampleTime();
                        }
                        this.f15334k = sampleTime2 > sampleTime && j10 - sampleTime2 >= 1000;
                    }
                    z10 = true;
                }
                i11++;
                i10 = -1;
            }
        } catch (Throwable th) {
            Log.i(Log.TAG_VIDEO, "Unable to create MediaExtractor", th, new Object[0]);
        }
        if (z10) {
            this.f15325b = mediaExtractor;
            return;
        }
        mediaExtractor.release();
        s();
        if (this.f15326c == null) {
            throw new IllegalArgumentException("Unsupported video format");
        }
    }

    public static int m(z8.g gVar) {
        if (gVar == null || gVar.equals(z8.g.f27034j)) {
            return 0;
        }
        if (gVar.equals(z8.g.f27035k)) {
            return 90;
        }
        if (gVar.equals(z8.g.f27036l)) {
            return 180;
        }
        if (gVar.equals(z8.g.f27037m)) {
            return 270;
        }
        throw new IllegalArgumentException();
    }

    public static z8.g p(int i10) {
        int l10 = h.l(i10, 360);
        if (l10 == 0) {
            return z8.g.f27034j;
        }
        if (l10 == 90) {
            return z8.g.f27035k;
        }
        if (l10 == 180) {
            return z8.g.f27036l;
        }
        if (l10 == 270) {
            return z8.g.f27037m;
        }
        throw new IllegalArgumentException();
    }

    public boolean a() {
        return this.f15329f > 0.0d && this.f15334k;
    }

    public double b(double d10, double d11, boolean z10) {
        if (q(z10)) {
            d11 = Math.max(d10, d(d11, 3));
            while (true) {
                if (d10 != d11 && d11 - d10 >= 0.5d) {
                    break;
                }
                double d12 = d(d11, 1);
                if (d11 == d12) {
                    break;
                }
                d11 = d12;
            }
        }
        return d11;
    }

    public double c(double d10, double d11, boolean z10) {
        if (q(z10)) {
            d10 = Math.min(d11, d(d10, 3));
            while (d10 != 0.0d && (d10 == d11 || d11 - d10 < 0.5d)) {
                double d12 = d(d10, 2);
                if (d12 == d10) {
                    break;
                }
                d10 = d12;
            }
        }
        return d10;
    }

    public final double d(double d10, int i10) {
        MediaExtractor mediaExtractor = this.f15325b;
        int i11 = 0;
        if (mediaExtractor != null) {
            try {
                mediaExtractor.seekTo((long) (d10 * 1000000.0d), i10 == 2 ? 0 : i10 == 1 ? 1 : 2);
                long sampleTime = this.f15325b.getSampleTime();
                if (sampleTime == -1) {
                    return this.f15329f;
                }
                double d11 = sampleTime / 1000000.0d;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return (i10 == 3 && Math.abs(this.f15329f - d10) < Math.abs(d11 - d10)) ? this.f15329f : d11;
                    }
                    if (d11 < d10) {
                        return d11;
                    }
                    this.f15325b.seekTo(sampleTime - 1, 0);
                    long sampleTime2 = this.f15325b.getSampleTime();
                    if (sampleTime2 == -1) {
                        return 0.0d;
                    }
                    return sampleTime2 / 1000000.0d;
                } else if (d11 > d10) {
                    return d11;
                } else {
                    if (!this.f15325b.advance()) {
                        return this.f15329f;
                    }
                    long sampleTime3 = this.f15325b.getSampleTime();
                    if (sampleTime3 == -1) {
                        return this.f15329f;
                    }
                    if (!c.b(this.f15325b.getSampleFlags(), 1)) {
                        this.f15325b.seekTo(sampleTime3, 1);
                        sampleTime3 = this.f15325b.getSampleTime();
                        if (sampleTime3 == -1) {
                            return this.f15329f;
                        }
                    }
                    double d12 = sampleTime3 / 1000000.0d;
                    return d12 <= d11 ? this.f15329f : d12;
                }
            } catch (Throwable th) {
                Log.w(Log.TAG_VIDEO, "Unable to seek", th, new Object[0]);
                return d10;
            }
        } else {
            double d13 = 0.0d;
            double[] dArr = this.f15328e;
            if (dArr == null) {
                return d10;
            }
            int length = dArr.length;
            double d14 = 0.0d;
            int i12 = 0;
            while (i11 < length) {
                double d15 = dArr[i11];
                if (d15 <= d10) {
                    i12++;
                    i11++;
                    d14 = d13;
                    d13 = d15;
                } else if (i10 == 3) {
                    return Math.abs(d13 - d10) < Math.abs(d15 - d10) ? d13 : d15;
                } else if (i10 == 2) {
                    return d10 == d15 ? d13 : d14;
                } else {
                    if (i10 != 1) {
                        throw new IllegalArgumentException();
                    } else if (d10 != d15) {
                        return d15;
                    } else {
                        int i13 = i12 + 1;
                        double[] dArr2 = this.f15328e;
                        return i13 < dArr2.length ? dArr2[i13] : d15;
                    }
                }
            }
            double d16 = this.f15329f;
            if (d16 != d13) {
                if (i10 == 1) {
                    return d16;
                }
                if (i10 == 3) {
                    return Math.abs(d16 - d10) < Math.abs(d13 - d10) ? this.f15329f : d13;
                }
            }
            return (d13 == d10 && i10 == 2) ? d14 : d13;
        }
    }

    public boolean e(java.lang.String r32, boolean r33, int r34, double r35, double r37, kb.l r39, java.util.concurrent.atomic.AtomicBoolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: jd.y.e(java.lang.String, boolean, int, double, double, kb.l, java.util.concurrent.atomic.AtomicBoolean):boolean");
    }

    public boolean f(String str, boolean z10, int i10, l lVar, AtomicBoolean atomicBoolean) {
        return e(str, z10, i10, -1.0d, -1.0d, lVar, atomicBoolean);
    }

    public double g(double d10) {
        return d(d10, 3);
    }

    public long h() {
        return this.f15333j;
    }

    public Bitmap i(double d10, int i10) {
        MediaMetadataRetriever l10 = l();
        if (l10 == null) {
            return null;
        }
        Bitmap frameAtTime = l10.getFrameAtTime((long) (d10 * 1000000.0d), 3);
        if (!v0.A1(frameAtTime)) {
            return null;
        }
        float f10 = i10;
        float max = Math.max(f10 / frameAtTime.getWidth(), f10 / frameAtTime.getHeight());
        return max < 1.0f ? b.v(frameAtTime, (int) (frameAtTime.getWidth() * max), (int) (frameAtTime.getHeight() * max), false) : frameAtTime;
    }

    public int j() {
        return this.f15332i;
    }

    public double k() {
        return this.f15331h;
    }

    public final MediaMetadataRetriever l() {
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = this.f15337n;
        if (mediaMetadataRetriever2 == null) {
            mediaMetadataRetriever2 = null;
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(this.f15324a);
                    this.f15337n = mediaMetadataRetriever;
                    return mediaMetadataRetriever;
                } catch (Throwable th2) {
                    th = th2;
                    Log.i(Log.TAG_VIDEO, "Unable to open retriever", th, new Object[0]);
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

    public double n() {
        return this.f15329f;
    }

    public double o() {
        return this.f15330g;
    }

    public boolean q(boolean z10) {
        return true;
    }

    public final d r(boolean z10, int i10, double d10, double d11) {
        a aVar;
        s();
        d dVar = this.f15326c;
        if (dVar != null) {
            double d12 = -1.0d;
            if (!z10 && i10 == 0 && d10 == -1.0d && d11 == -1.0d) {
                return null;
            }
            dVar.i(new LinkedList());
            for (g gVar : this.f15327d) {
                if (!z10 || !"soun".equals(gVar.getHandler())) {
                    if (d10 == d12 || d11 == d12) {
                        aVar = new a(gVar);
                    } else {
                        long j10 = 0;
                        double d13 = 0.0d;
                        long g10 = gVar.E().g();
                        long[] S = gVar.S();
                        int length = S.length;
                        double d14 = d12;
                        long j11 = -1;
                        int i11 = 0;
                        long j12 = -1;
                        while (i11 < length) {
                            long j13 = S[i11];
                            int i12 = (d13 > d14 ? 1 : (d13 == d14 ? 0 : -1));
                            if (i12 > 0 && d13 <= d10) {
                                j12 = j10;
                            }
                            if (i12 > 0 && d13 <= d11) {
                                j11 = j10;
                            }
                            j12 = j12;
                            d13 += j13 / g10;
                            j10++;
                            i11++;
                            d14 = d13;
                        }
                        int i13 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
                        long j14 = (i13 == 0 || j11 != -1) ? j11 : j12 + 1;
                        if (i13 == 0 || j14 == -1) {
                            throw new IllegalArgumentException();
                        }
                        aVar = new a(new r8.d(gVar, j12, j14));
                    }
                    if (i10 != 0) {
                        aVar.E().p(p(m(aVar.E().f()) + i10));
                    }
                    this.f15326c.a(aVar);
                    d12 = -1.0d;
                }
            }
            return this.f15326c;
        }
        throw new IllegalStateException();
    }

    public final void s() {
        d dVar;
        boolean z10;
        try {
            dVar = p8.a.b(this.f15324a);
        } catch (Throwable th) {
            Log.i(Log.TAG_VIDEO, "Unable to create mp4 movie", th, new Object[0]);
            dVar = null;
        }
        if (dVar != null) {
            this.f15326c = dVar;
            List<g> g10 = dVar.g();
            this.f15327d = g10;
            Iterator<g> it = g10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g next = it.next();
                long[] H = next.H();
                if (!(H == null || H.length == 0)) {
                    double[] dArr = new double[H.length];
                    long g11 = next.E().g();
                    this.f15330g = next.E().j();
                    this.f15331h = next.E().c();
                    long j10 = 0;
                    long[] S = next.S();
                    int length = S.length;
                    double d10 = 0.0d;
                    for (int i10 = 0; i10 < length; i10++) {
                        long j11 = S[i10];
                        j10++;
                        int binarySearch = Arrays.binarySearch(H, j10);
                        if (binarySearch >= 0) {
                            dArr[binarySearch] = d10;
                        }
                        S = S;
                        H = H;
                        d10 += j11 / g11;
                    }
                    double[] dArr2 = this.f15328e;
                    if (!(dArr2 == null || Arrays.equals(dArr2, dArr))) {
                        this.f15328e = null;
                        this.f15329f = 0.0d;
                        break;
                    }
                    this.f15328e = dArr;
                    this.f15329f = d10;
                }
            }
            double[] dArr3 = this.f15328e;
            if (dArr3 != null) {
                if (dArr3.length + ((dArr3.length <= 0 || this.f15329f <= dArr3[dArr3.length - 1]) ? 0 : 1) > 2) {
                    z10 = true;
                    this.f15334k = z10;
                }
            }
            z10 = false;
            this.f15334k = z10;
        }
    }

    public void t() {
        MediaExtractor mediaExtractor = this.f15325b;
        if (mediaExtractor != null) {
            try {
                mediaExtractor.release();
            } catch (Throwable unused) {
            }
            this.f15325b = null;
        }
        MediaMetadataRetriever mediaMetadataRetriever = this.f15337n;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
            this.f15337n = null;
        }
    }

    public final void u(int i10) {
        MediaExtractor mediaExtractor;
        int i11 = this.f15336m;
        if (i11 != i10 && (mediaExtractor = this.f15325b) != null) {
            if (i11 != -1) {
                mediaExtractor.unselectTrack(i11);
            }
            this.f15336m = i10;
            if (i10 != -1) {
                this.f15325b.selectTrack(i10);
            }
        }
    }
}
