package ca;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import ca.b;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import o9.e;
import x9.h;
import x9.i;
import x9.j;
import x9.m;

public abstract class d implements b {
    public static final AtomicInteger f5003l = new AtomicInteger(0);
    public final i f5004a = new i("DefaultDataSource(" + f5003l.getAndIncrement() + ")");
    public final j<MediaFormat> f5005b = m.a(null);
    public final j<Integer> f5006c = m.a(null);
    public final HashSet<o9.d> f5007d = new HashSet<>();
    public final j<Long> f5008e = m.b(0L, 0L);
    public MediaMetadataRetriever f5009f = null;
    public MediaExtractor f5010g = null;
    public long f5011h = Long.MIN_VALUE;
    public boolean f5012i = false;
    public long f5013j = -1;
    public long f5014k = -1;

    public abstract void a(MediaExtractor mediaExtractor);

    public abstract void b(MediaMetadataRetriever mediaMetadataRetriever);

    @Override
    public long c(long j10) {
        boolean contains = this.f5007d.contains(o9.d.VIDEO);
        boolean contains2 = this.f5007d.contains(o9.d.AUDIO);
        i iVar = this.f5004a;
        iVar.c("seekTo(): seeking to " + (this.f5011h + j10) + " originUs=" + this.f5011h + " extractorUs=" + this.f5010g.getSampleTime() + " externalUs=" + j10 + " hasVideo=" + contains + " hasAudio=" + contains2);
        if (!contains || !contains2) {
            this.f5010g.seekTo(this.f5011h + j10, 0);
        } else {
            this.f5010g.unselectTrack(this.f5006c.a().intValue());
            i iVar2 = this.f5004a;
            iVar2.h("seekTo(): unselected AUDIO, seeking to " + (this.f5011h + j10) + " (extractorUs=" + this.f5010g.getSampleTime() + ")");
            this.f5010g.seekTo(this.f5011h + j10, 0);
            i iVar3 = this.f5004a;
            iVar3.h("seekTo(): unselected AUDIO and sought (extractorUs=" + this.f5010g.getSampleTime() + ")");
            this.f5010g.selectTrack(this.f5006c.a().intValue());
            i iVar4 = this.f5004a;
            iVar4.h("seekTo(): reselected AUDIO, seeking to extractorUs (extractorUs=" + this.f5010g.getSampleTime() + ")");
            MediaExtractor mediaExtractor = this.f5010g;
            mediaExtractor.seekTo(mediaExtractor.getSampleTime(), 2);
            i iVar5 = this.f5004a;
            iVar5.h("seekTo(): seek workaround completed. (extractorUs=" + this.f5010g.getSampleTime() + ")");
        }
        long sampleTime = this.f5010g.getSampleTime();
        this.f5013j = sampleTime;
        long j11 = this.f5011h + j10;
        this.f5014k = j11;
        if (sampleTime > j11) {
            this.f5013j = j11;
        }
        i iVar6 = this.f5004a;
        iVar6.c("seekTo(): dontRenderRange=" + this.f5013j + ".." + this.f5014k + " (" + (this.f5014k - this.f5013j) + "us)");
        return this.f5010g.getSampleTime() - this.f5011h;
    }

    @Override
    public long d() {
        try {
            return Long.parseLong(this.f5009f.extractMetadata(9)) * 1000;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override
    public void e() {
        this.f5004a.c("initialize(): initializing...");
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f5010g = mediaExtractor;
        try {
            a(mediaExtractor);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            this.f5009f = mediaMetadataRetriever;
            b(mediaMetadataRetriever);
            int trackCount = this.f5010g.getTrackCount();
            for (int i10 = 0; i10 < trackCount; i10++) {
                MediaFormat trackFormat = this.f5010g.getTrackFormat(i10);
                o9.d b10 = e.b(trackFormat);
                if (b10 != null && !this.f5006c.q(b10)) {
                    this.f5006c.e(b10, Integer.valueOf(i10));
                    this.f5005b.e(b10, trackFormat);
                }
            }
            for (int i11 = 0; i11 < this.f5010g.getTrackCount(); i11++) {
                this.f5010g.selectTrack(i11);
            }
            this.f5011h = this.f5010g.getSampleTime();
            i iVar = this.f5004a;
            iVar.h("initialize(): found origin=" + this.f5011h);
            for (int i12 = 0; i12 < this.f5010g.getTrackCount(); i12++) {
                this.f5010g.unselectTrack(i12);
            }
            this.f5012i = true;
        } catch (IOException e10) {
            this.f5004a.b("Got IOException while trying to open MediaExtractor.", e10);
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void f(o9.d dVar) {
        i iVar = this.f5004a;
        iVar.c("selectTrack(" + dVar + ")");
        if (!this.f5007d.contains(dVar)) {
            this.f5007d.add(dVar);
            this.f5010g.selectTrack(this.f5006c.n(dVar).intValue());
        }
    }

    @Override
    public long g() {
        if (!p()) {
            return 0L;
        }
        return Math.max(this.f5008e.a().longValue(), this.f5008e.b().longValue()) - this.f5011h;
    }

    @Override
    public void h(b.a aVar) {
        o9.d dVar;
        int sampleTrackIndex = this.f5010g.getSampleTrackIndex();
        int position = aVar.f4998a.position();
        int limit = aVar.f4998a.limit();
        int readSampleData = this.f5010g.readSampleData(aVar.f4998a, position);
        if (readSampleData >= 0) {
            int i10 = readSampleData + position;
            if (i10 <= limit) {
                aVar.f4998a.limit(i10);
                aVar.f4998a.position(position);
                boolean z10 = false;
                aVar.f4999b = (this.f5010g.getSampleFlags() & 1) != 0;
                long sampleTime = this.f5010g.getSampleTime();
                aVar.f5000c = sampleTime;
                if (sampleTime < this.f5013j || sampleTime >= this.f5014k) {
                    z10 = true;
                }
                aVar.f5001d = z10;
                i iVar = this.f5004a;
                iVar.h("readTrack(): time=" + aVar.f5000c + ", render=" + aVar.f5001d + ", end=" + this.f5014k);
                if (!this.f5006c.i() || this.f5006c.a().intValue() != sampleTrackIndex) {
                    dVar = (!this.f5006c.l() || this.f5006c.b().intValue() != sampleTrackIndex) ? null : o9.d.VIDEO;
                } else {
                    dVar = o9.d.AUDIO;
                }
                if (dVar != null) {
                    this.f5008e.e(dVar, Long.valueOf(aVar.f5000c));
                    this.f5010g.advance();
                    if (!aVar.f5001d && l()) {
                        i iVar2 = this.f5004a;
                        iVar2.j("Force rendering the last frame. timeUs=" + aVar.f5000c);
                        aVar.f5001d = true;
                        return;
                    }
                    return;
                }
                throw new RuntimeException("Unknown type: " + sampleTrackIndex);
            }
            throw new IllegalStateException("MediaExtractor is not respecting the buffer limit. This might cause other issues down the pipeline.");
        }
        throw new IllegalStateException("No samples available! Forgot to call canReadTrack / isDrained?");
    }

    @Override
    public boolean i(o9.d dVar) {
        return this.f5010g.getSampleTrackIndex() == this.f5006c.n(dVar).intValue();
    }

    @Override
    public int j() {
        this.f5004a.c("getOrientation()");
        try {
            return Integer.parseInt(this.f5009f.extractMetadata(24));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override
    public MediaFormat k(o9.d dVar) {
        i iVar = this.f5004a;
        iVar.c("getTrackFormat(" + dVar + ")");
        return this.f5005b.o(dVar);
    }

    @Override
    public boolean l() {
        return this.f5010g.getSampleTrackIndex() < 0;
    }

    @Override
    public void m() {
        this.f5004a.c("deinitialize(): deinitializing...");
        try {
            this.f5010g.release();
        } catch (Exception e10) {
            this.f5004a.k("Could not release extractor:", e10);
        }
        try {
            this.f5009f.release();
        } catch (Exception e11) {
            this.f5004a.k("Could not release metadata:", e11);
        }
        this.f5007d.clear();
        this.f5011h = Long.MIN_VALUE;
        this.f5008e.c(0L, 0L);
        this.f5005b.c(null, null);
        this.f5006c.c(null, null);
        this.f5013j = -1L;
        this.f5014k = -1L;
        this.f5012i = false;
    }

    @Override
    public void n(o9.d dVar) {
        i iVar = this.f5004a;
        iVar.c("releaseTrack(" + dVar + ")");
        if (this.f5007d.contains(dVar)) {
            this.f5007d.remove(dVar);
            this.f5010g.unselectTrack(this.f5006c.n(dVar).intValue());
        }
    }

    @Override
    public double[] o() {
        float[] a10;
        this.f5004a.c("getLocation()");
        String extractMetadata = this.f5009f.extractMetadata(23);
        if (extractMetadata == null || (a10 = new h().a(extractMetadata)) == null) {
            return null;
        }
        return new double[]{a10[0], a10[1]};
    }

    @Override
    public boolean p() {
        return this.f5012i;
    }
}
