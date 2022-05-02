package ba;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import ba.AbstractC1296b;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import p192n9.C7314e;
import p192n9.EnumC7313d;
import p316w9.AbstractC10008j;
import p316w9.C10006h;
import p316w9.C10007i;
import p316w9.C10014m;

public abstract class AbstractC1299d implements AbstractC1296b {
    public static final AtomicInteger f4680l = new AtomicInteger(0);
    public final C10007i f4681a = new C10007i("DefaultDataSource(" + f4680l.getAndIncrement() + ")");
    public final AbstractC10008j<MediaFormat> f4682b = C10014m.m6223a(null);
    public final AbstractC10008j<Integer> f4683c = C10014m.m6223a(null);
    public final HashSet<EnumC7313d> f4684d = new HashSet<>();
    public final AbstractC10008j<Long> f4685e = C10014m.m6222b(0L, 0L);
    public MediaMetadataRetriever f4686f = null;
    public MediaExtractor f4687g = null;
    public long f4688h = Long.MIN_VALUE;
    public boolean f4689i = false;
    public long f4690j = -1;
    public long f4691k = -1;

    public abstract void mo37789a(MediaExtractor mediaExtractor);

    public abstract void mo37788b(MediaMetadataRetriever mediaMetadataRetriever);

    @Override
    public long mo6292c(long j) {
        boolean contains = this.f4684d.contains(EnumC7313d.VIDEO);
        boolean contains2 = this.f4684d.contains(EnumC7313d.AUDIO);
        C10007i iVar = this.f4681a;
        iVar.m6267c("seekTo(): seeking to " + (this.f4688h + j) + " originUs=" + this.f4688h + " extractorUs=" + this.f4687g.getSampleTime() + " externalUs=" + j + " hasVideo=" + contains + " hasAudio=" + contains2);
        if (!contains || !contains2) {
            this.f4687g.seekTo(this.f4688h + j, 0);
        } else {
            this.f4687g.unselectTrack(this.f4683c.mo6241a().intValue());
            C10007i iVar2 = this.f4681a;
            iVar2.m6262h("seekTo(): unselected AUDIO, seeking to " + (this.f4688h + j) + " (extractorUs=" + this.f4687g.getSampleTime() + ")");
            this.f4687g.seekTo(this.f4688h + j, 0);
            C10007i iVar3 = this.f4681a;
            iVar3.m6262h("seekTo(): unselected AUDIO and sought (extractorUs=" + this.f4687g.getSampleTime() + ")");
            this.f4687g.selectTrack(this.f4683c.mo6241a().intValue());
            C10007i iVar4 = this.f4681a;
            iVar4.m6262h("seekTo(): reselected AUDIO, seeking to extractorUs (extractorUs=" + this.f4687g.getSampleTime() + ")");
            MediaExtractor mediaExtractor = this.f4687g;
            mediaExtractor.seekTo(mediaExtractor.getSampleTime(), 2);
            C10007i iVar5 = this.f4681a;
            iVar5.m6262h("seekTo(): seek workaround completed. (extractorUs=" + this.f4687g.getSampleTime() + ")");
        }
        long sampleTime = this.f4687g.getSampleTime();
        this.f4690j = sampleTime;
        long j2 = this.f4688h + j;
        this.f4691k = j2;
        if (sampleTime > j2) {
            this.f4690j = j2;
        }
        C10007i iVar6 = this.f4681a;
        iVar6.m6267c("seekTo(): dontRenderRange=" + this.f4690j + ".." + this.f4691k + " (" + (this.f4691k - this.f4690j) + "us)");
        return this.f4687g.getSampleTime() - this.f4688h;
    }

    @Override
    public long mo6291d() {
        try {
            return Long.parseLong(this.f4686f.extractMetadata(9)) * 1000;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override
    public void mo6290e() {
        this.f4681a.m6267c("initialize(): initializing...");
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f4687g = mediaExtractor;
        try {
            mo37789a(mediaExtractor);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            this.f4686f = mediaMetadataRetriever;
            mo37788b(mediaMetadataRetriever);
            int trackCount = this.f4687g.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = this.f4687g.getTrackFormat(i);
                EnumC7313d b = C7314e.m17062b(trackFormat);
                if (b != null && !this.f4683c.mo6237g(b)) {
                    this.f4683c.mo6256p(b, Integer.valueOf(i));
                    this.f4682b.mo6256p(b, trackFormat);
                }
            }
            for (int i2 = 0; i2 < this.f4687g.getTrackCount(); i2++) {
                this.f4687g.selectTrack(i2);
            }
            this.f4688h = this.f4687g.getSampleTime();
            C10007i iVar = this.f4681a;
            iVar.m6262h("initialize(): found origin=" + this.f4688h);
            for (int i3 = 0; i3 < this.f4687g.getTrackCount(); i3++) {
                this.f4687g.unselectTrack(i3);
            }
            this.f4689i = true;
        } catch (IOException e) {
            this.f4681a.m6268b("Got IOException while trying to open MediaExtractor.", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void mo6289f(AbstractC1296b.C1297a aVar) {
        EnumC7313d dVar;
        int sampleTrackIndex = this.f4687g.getSampleTrackIndex();
        int position = aVar.f4675a.position();
        int limit = aVar.f4675a.limit();
        int readSampleData = this.f4687g.readSampleData(aVar.f4675a, position);
        if (readSampleData >= 0) {
            int i = readSampleData + position;
            if (i <= limit) {
                aVar.f4675a.limit(i);
                aVar.f4675a.position(position);
                boolean z = false;
                aVar.f4676b = (this.f4687g.getSampleFlags() & 1) != 0;
                long sampleTime = this.f4687g.getSampleTime();
                aVar.f4677c = sampleTime;
                if (sampleTime < this.f4690j || sampleTime >= this.f4691k) {
                    z = true;
                }
                aVar.f4678d = z;
                C10007i iVar = this.f4681a;
                iVar.m6262h("readTrack(): time=" + aVar.f4677c + ", render=" + aVar.f4678d + ", end=" + this.f4691k);
                if (!this.f4683c.mo6236k() || this.f4683c.mo6241a().intValue() != sampleTrackIndex) {
                    dVar = (!this.f4683c.mo6233o() || this.f4683c.mo6240b().intValue() != sampleTrackIndex) ? null : EnumC7313d.VIDEO;
                } else {
                    dVar = EnumC7313d.AUDIO;
                }
                if (dVar != null) {
                    this.f4685e.mo6256p(dVar, Long.valueOf(aVar.f4677c));
                    this.f4687g.advance();
                    if (!aVar.f4678d && mo6285j()) {
                        C10007i iVar2 = this.f4681a;
                        iVar2.m6260j("Force rendering the last frame. timeUs=" + aVar.f4677c);
                        aVar.f4678d = true;
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
    public long mo6288g() {
        if (!mo6279p()) {
            return 0L;
        }
        return Math.max(this.f4685e.mo6241a().longValue(), this.f4685e.mo6240b().longValue()) - this.f4688h;
    }

    @Override
    public void mo6287h(EnumC7313d dVar) {
        C10007i iVar = this.f4681a;
        iVar.m6267c("selectTrack(" + dVar + ")");
        if (!this.f4684d.contains(dVar)) {
            this.f4684d.add(dVar);
            this.f4687g.selectTrack(this.f4683c.mo6239d(dVar).intValue());
        }
    }

    @Override
    public int mo6286i() {
        this.f4681a.m6267c("getOrientation()");
        try {
            return Integer.parseInt(this.f4686f.extractMetadata(24));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override
    public boolean mo6285j() {
        return this.f4687g.getSampleTrackIndex() < 0;
    }

    @Override
    public boolean mo6284k(EnumC7313d dVar) {
        return this.f4687g.getSampleTrackIndex() == this.f4683c.mo6239d(dVar).intValue();
    }

    @Override
    public void mo6283l(EnumC7313d dVar) {
        C10007i iVar = this.f4681a;
        iVar.m6267c("releaseTrack(" + dVar + ")");
        if (this.f4684d.contains(dVar)) {
            this.f4684d.remove(dVar);
            this.f4687g.unselectTrack(this.f4683c.mo6239d(dVar).intValue());
        }
    }

    @Override
    public void mo6282m() {
        this.f4681a.m6267c("deinitialize(): deinitializing...");
        try {
            this.f4687g.release();
        } catch (Exception e) {
            this.f4681a.m6259k("Could not release extractor:", e);
        }
        try {
            this.f4686f.release();
        } catch (Exception e2) {
            this.f4681a.m6259k("Could not release metadata:", e2);
        }
        this.f4684d.clear();
        this.f4688h = Long.MIN_VALUE;
        this.f4685e.mo6258c(0L, 0L);
        this.f4682b.mo6258c(null, null);
        this.f4683c.mo6258c(null, null);
        this.f4690j = -1L;
        this.f4691k = -1L;
        this.f4689i = false;
    }

    @Override
    public MediaFormat mo6281n(EnumC7313d dVar) {
        C10007i iVar = this.f4681a;
        iVar.m6267c("getTrackFormat(" + dVar + ")");
        return this.f4682b.mo6238f(dVar);
    }

    @Override
    public double[] mo6280o() {
        float[] a;
        this.f4681a.m6267c("getLocation()");
        String extractMetadata = this.f4686f.extractMetadata(23);
        if (extractMetadata == null || (a = new C10006h().m6270a(extractMetadata)) == null) {
            return null;
        }
        return new double[]{a[0], a[1]};
    }

    @Override
    public boolean mo6279p() {
        return this.f4689i;
    }
}
