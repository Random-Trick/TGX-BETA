package org.thunderdog.challegram.video.old;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import le.a;
import s2.d;
import s2.g;
import t2.b;

@TargetApi(16)
public class Mp4OutputImpl extends a {
    public InterleaveChunkMdat f20176a = null;
    public a f20177b = null;
    public FileOutputStream f20178c = null;
    public FileChannel f20179d = null;
    public long f20180e = 0;
    public long f20181f = 0;
    public boolean f20182g = true;
    public HashMap<e, long[]> f20183h = new HashMap<>();
    public ByteBuffer f20184i = null;

    public class InterleaveChunkMdat implements t2.a {
        private long contentSize;
        private long dataOffset;
        private b parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j10) {
            return j10 + 8 < 4294967296L;
        }

        @Override
        public void getBox(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                g.g(allocate, size);
            } else {
                g.g(allocate, 1L);
            }
            allocate.put(d.s(MediaDataBox.TYPE));
            if (isSmallBox(size)) {
                allocate.put(new byte[8]);
            } else {
                g.i(allocate, size);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
        }

        public long getContentSize() {
            return this.contentSize;
        }

        public long getOffset() {
            return this.dataOffset;
        }

        @Override
        public b getParent() {
            return this.parent;
        }

        @Override
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override
        public String getType() {
            return MediaDataBox.TYPE;
        }

        @Override
        public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j10, s2.b bVar) {
        }

        public void setContentSize(long j10) {
            this.contentSize = j10;
        }

        public void setDataOffset(long j10) {
            this.dataOffset = j10;
        }

        @Override
        public void setParent(b bVar) {
            this.parent = bVar;
        }
    }

    public static long q(long j10, long j11) {
        return j11 == 0 ? j10 : q(j11, j10 % j11);
    }

    @Override
    public int a(MediaFormat mediaFormat, boolean z10) {
        return this.f20177b.b(mediaFormat, z10);
    }

    @Override
    public void b() {
        if (this.f20176a.getContentSize() != 0) {
            p();
        }
        Iterator<e> it = this.f20177b.e().iterator();
        while (it.hasNext()) {
            e next = it.next();
            ArrayList<c> k10 = next.k();
            int size = k10.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = k10.get(i10).b();
            }
            this.f20183h.put(next, jArr);
        }
        g(this.f20177b).getBox(this.f20179d);
        this.f20178c.flush();
        this.f20179d.close();
        this.f20178c.close();
    }

    @Override
    public boolean c(int i10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
        if (this.f20182g) {
            this.f20176a.setContentSize(0L);
            this.f20176a.getBox(this.f20179d);
            this.f20176a.setDataOffset(this.f20180e);
            this.f20180e += 16;
            this.f20181f += 16;
            this.f20182g = false;
        }
        InterleaveChunkMdat interleaveChunkMdat = this.f20176a;
        interleaveChunkMdat.setContentSize(interleaveChunkMdat.getContentSize() + bufferInfo.size);
        long j10 = this.f20181f + bufferInfo.size;
        this.f20181f = j10;
        boolean z11 = true;
        if (j10 >= 32768) {
            p();
            this.f20182g = true;
            this.f20181f -= 32768;
        } else {
            z11 = false;
        }
        this.f20177b.a(i10, this.f20180e, bufferInfo);
        byteBuffer.position(bufferInfo.offset + (!z10 ? 0 : 4));
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        if (z10) {
            this.f20184i.position(0);
            this.f20184i.putInt(bufferInfo.size - 4);
            this.f20184i.position(0);
            this.f20179d.write(this.f20184i);
        }
        this.f20179d.write(byteBuffer);
        this.f20180e += bufferInfo.size;
        if (z11) {
            this.f20178c.flush();
        }
        return z11;
    }

    public void d(e eVar, SampleTableBox sampleTableBox) {
        int[] h10 = eVar.h();
        if (h10 != null) {
            CompositionTimeToSample.a aVar = null;
            ArrayList arrayList = new ArrayList();
            for (int i10 : h10) {
                if (aVar == null || aVar.b() != i10) {
                    aVar = new CompositionTimeToSample.a(1, i10);
                    arrayList.add(aVar);
                } else {
                    aVar.c(aVar.a() + 1);
                }
            }
            CompositionTimeToSample compositionTimeToSample = new CompositionTimeToSample();
            compositionTimeToSample.setEntries(arrayList);
            sampleTableBox.addBox(compositionTimeToSample);
        }
    }

    public FileTypeBox e() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(VisualSampleEntry.TYPE3);
        linkedList.add("mp41");
        return new FileTypeBox("isom", 512L, linkedList);
    }

    public Mp4OutputImpl f(a aVar) {
        this.f20177b = aVar;
        FileOutputStream fileOutputStream = new FileOutputStream(aVar.c());
        this.f20178c = fileOutputStream;
        this.f20179d = fileOutputStream.getChannel();
        FileTypeBox e10 = e();
        e10.getBox(this.f20179d);
        long size = this.f20180e + e10.getSize();
        this.f20180e = size;
        this.f20181f += size;
        this.f20176a = new InterleaveChunkMdat();
        this.f20184i = ByteBuffer.allocateDirect(4);
        return this;
    }

    public MovieBox g(a aVar) {
        MovieBox movieBox = new MovieBox();
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setCreationTime(new Date());
        movieHeaderBox.setModificationTime(new Date());
        movieHeaderBox.setMatrix(z8.g.f27034j);
        long r10 = r(aVar);
        Iterator<e> it = aVar.e().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            e next = it.next();
            next.s();
            long d10 = (next.d() * r10) / next.m();
            if (d10 > j10) {
                j10 = d10;
            }
        }
        movieHeaderBox.setDuration(j10);
        movieHeaderBox.setTimescale(r10);
        movieHeaderBox.setNextTrackId(aVar.e().size() + 1);
        movieBox.addBox(movieHeaderBox);
        Iterator<e> it2 = aVar.e().iterator();
        while (it2.hasNext()) {
            movieBox.addBox(o(it2.next(), aVar));
        }
        return movieBox;
    }

    public t2.a h(e eVar) {
        SampleTableBox sampleTableBox = new SampleTableBox();
        k(eVar, sampleTableBox);
        n(eVar, sampleTableBox);
        d(eVar, sampleTableBox);
        l(eVar, sampleTableBox);
        j(eVar, sampleTableBox);
        m(eVar, sampleTableBox);
        i(eVar, sampleTableBox);
        return sampleTableBox;
    }

    public void i(e eVar, SampleTableBox sampleTableBox) {
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = eVar.k().iterator();
        long j10 = -1;
        while (it.hasNext()) {
            c next = it.next();
            long a10 = next.a();
            if (!(j10 == -1 || j10 == a10)) {
                j10 = -1;
            }
            if (j10 == -1) {
                arrayList.add(Long.valueOf(a10));
            }
            j10 = next.b() + a10;
        }
        long[] jArr = new long[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        StaticChunkOffsetBox staticChunkOffsetBox = new StaticChunkOffsetBox();
        staticChunkOffsetBox.setChunkOffsets(jArr);
        sampleTableBox.addBox(staticChunkOffsetBox);
    }

    public void j(e eVar, SampleTableBox sampleTableBox) {
        SampleToChunkBox sampleToChunkBox = new SampleToChunkBox();
        sampleToChunkBox.setEntries(new LinkedList());
        int size = eVar.k().size();
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < size) {
            c cVar = eVar.k().get(i11);
            i12++;
            if (i11 == size + (-1) || cVar.a() + cVar.b() != eVar.k().get(i11 + 1).a()) {
                if (i10 != i12) {
                    sampleToChunkBox.getEntries().add(new SampleToChunkBox.a(i13, i12, 1L));
                    i10 = i12;
                }
                i13++;
                i12 = 0;
            }
            i11++;
        }
        sampleTableBox.addBox(sampleToChunkBox);
    }

    public void k(e eVar, SampleTableBox sampleTableBox) {
        sampleTableBox.addBox(eVar.i());
    }

    public void l(e eVar, SampleTableBox sampleTableBox) {
        long[] l10 = eVar.l();
        if (l10 != null && l10.length > 0) {
            SyncSampleBox syncSampleBox = new SyncSampleBox();
            syncSampleBox.setSampleNumber(l10);
            sampleTableBox.addBox(syncSampleBox);
        }
    }

    public void m(e eVar, SampleTableBox sampleTableBox) {
        SampleSizeBox sampleSizeBox = new SampleSizeBox();
        sampleSizeBox.setSampleSizes(this.f20183h.get(eVar));
        sampleTableBox.addBox(sampleSizeBox);
    }

    public void n(e eVar, SampleTableBox sampleTableBox) {
        long[] j10;
        ArrayList arrayList = new ArrayList();
        TimeToSampleBox.a aVar = null;
        for (long j11 : eVar.j()) {
            if (aVar == null || aVar.b() != j11) {
                aVar = new TimeToSampleBox.a(1L, j11);
                arrayList.add(aVar);
            } else {
                aVar.c(aVar.a() + 1);
            }
        }
        TimeToSampleBox timeToSampleBox = new TimeToSampleBox();
        timeToSampleBox.setEntries(arrayList);
        sampleTableBox.addBox(timeToSampleBox);
    }

    public TrackBox o(e eVar, a aVar) {
        TrackBox trackBox = new TrackBox();
        TrackHeaderBox trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setEnabled(true);
        trackHeaderBox.setInMovie(true);
        trackHeaderBox.setInPreview(true);
        if (eVar.q()) {
            trackHeaderBox.setMatrix(z8.g.f27034j);
        } else {
            trackHeaderBox.setMatrix(aVar.d());
        }
        trackHeaderBox.setAlternateGroup(0);
        trackHeaderBox.setCreationTime(eVar.c());
        trackHeaderBox.setDuration((eVar.d() * r(aVar)) / eVar.m());
        trackHeaderBox.setHeight(eVar.f());
        trackHeaderBox.setWidth(eVar.p());
        trackHeaderBox.setLayer(0);
        trackHeaderBox.setModificationTime(new Date());
        trackHeaderBox.setTrackId(eVar.n() + 1);
        trackHeaderBox.setVolume(eVar.o());
        trackBox.addBox(trackHeaderBox);
        MediaBox mediaBox = new MediaBox();
        trackBox.addBox(mediaBox);
        MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(eVar.c());
        mediaHeaderBox.setDuration(eVar.d());
        mediaHeaderBox.setTimescale(eVar.m());
        mediaHeaderBox.setLanguage("eng");
        mediaBox.addBox(mediaHeaderBox);
        HandlerBox handlerBox = new HandlerBox();
        handlerBox.setName(eVar.q() ? "SoundHandle" : "VideoHandle");
        handlerBox.setHandlerType(eVar.e());
        mediaBox.addBox(handlerBox);
        MediaInformationBox mediaInformationBox = new MediaInformationBox();
        mediaInformationBox.addBox(eVar.g());
        DataInformationBox dataInformationBox = new DataInformationBox();
        DataReferenceBox dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        mediaInformationBox.addBox(dataInformationBox);
        mediaInformationBox.addBox(h(eVar));
        mediaBox.addBox(mediaInformationBox);
        return trackBox;
    }

    public final void p() {
        long position = this.f20179d.position();
        this.f20179d.position(this.f20176a.getOffset());
        this.f20176a.getBox(this.f20179d);
        this.f20179d.position(position);
        this.f20176a.setDataOffset(0L);
        this.f20176a.setContentSize(0L);
        this.f20178c.flush();
    }

    public long r(a aVar) {
        long m10 = !aVar.e().isEmpty() ? aVar.e().iterator().next().m() : 0L;
        Iterator<e> it = aVar.e().iterator();
        while (it.hasNext()) {
            m10 = q(it.next().m(), m10);
        }
        return m10;
    }
}
