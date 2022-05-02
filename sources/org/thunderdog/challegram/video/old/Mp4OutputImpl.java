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
import com.googlecode.mp4parser.AbstractC3539a;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import ke.AbstractC6268a;
import p258s2.AbstractC8629b;
import p258s2.C8631d;
import p258s2.C8634g;
import p269t2.AbstractC8950a;
import p269t2.AbstractC8951b;
import p345y8.C10453g;

@TargetApi(16)
public class Mp4OutputImpl extends AbstractC6268a {
    public InterleaveChunkMdat f25770a = null;
    public C7928a f25771b = null;
    public FileOutputStream f25772c = null;
    public FileChannel f25773d = null;
    public long f25774e = 0;
    public long f25775f = 0;
    public boolean f25776g = true;
    public HashMap<C7932e, long[]> f25777h = new HashMap<>();
    public ByteBuffer f25778i = null;

    public class InterleaveChunkMdat implements AbstractC8950a {
        private long contentSize;
        private long dataOffset;
        private AbstractC8951b parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j) {
            return j + 8 < 4294967296L;
        }

        @Override
        public void getBox(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                C8634g.m11853g(allocate, size);
            } else {
                C8634g.m11853g(allocate, 1L);
            }
            allocate.put(C8631d.m11876t(MediaDataBox.TYPE));
            if (isSmallBox(size)) {
                allocate.put(new byte[8]);
            } else {
                C8634g.m11851i(allocate, size);
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
        public AbstractC8951b getParent() {
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
        public void parse(AbstractC3539a aVar, ByteBuffer byteBuffer, long j, AbstractC8629b bVar) {
        }

        public void setContentSize(long j) {
            this.contentSize = j;
        }

        public void setDataOffset(long j) {
            this.dataOffset = j;
        }

        @Override
        public void setParent(AbstractC8951b bVar) {
            this.parent = bVar;
        }
    }

    public static long m14105q(long j, long j2) {
        return j2 == 0 ? j : m14105q(j2, j % j2);
    }

    @Override
    public int mo14121a(MediaFormat mediaFormat, boolean z) {
        return this.f25771b.m14102b(mediaFormat, z);
    }

    @Override
    public void mo14120b() {
        if (this.f25770a.getContentSize() != 0) {
            m14106p();
        }
        Iterator<C7932e> it = this.f25771b.m14099e().iterator();
        while (it.hasNext()) {
            C7932e next = it.next();
            ArrayList<C7930c> k = next.m14083k();
            int size = k.size();
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                jArr[i] = k.get(i).m14094b();
            }
            this.f25777h.put(next, jArr);
        }
        m14115g(this.f25771b).getBox(this.f25773d);
        this.f25772c.flush();
        this.f25773d.close();
        this.f25772c.close();
    }

    @Override
    public boolean mo14119c(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z) {
        if (this.f25776g) {
            this.f25770a.setContentSize(0L);
            this.f25770a.getBox(this.f25773d);
            this.f25770a.setDataOffset(this.f25774e);
            this.f25774e += 16;
            this.f25775f += 16;
            this.f25776g = false;
        }
        InterleaveChunkMdat interleaveChunkMdat = this.f25770a;
        interleaveChunkMdat.setContentSize(interleaveChunkMdat.getContentSize() + bufferInfo.size);
        long j = this.f25775f + bufferInfo.size;
        this.f25775f = j;
        boolean z2 = true;
        if (j >= 32768) {
            m14106p();
            this.f25776g = true;
            this.f25775f -= 32768;
        } else {
            z2 = false;
        }
        this.f25771b.m14103a(i, this.f25774e, bufferInfo);
        byteBuffer.position(bufferInfo.offset + (!z ? 0 : 4));
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        if (z) {
            this.f25778i.position(0);
            this.f25778i.putInt(bufferInfo.size - 4);
            this.f25778i.position(0);
            this.f25773d.write(this.f25778i);
        }
        this.f25773d.write(byteBuffer);
        this.f25774e += bufferInfo.size;
        if (z2) {
            this.f25772c.flush();
        }
        return z2;
    }

    public void m14118d(C7932e eVar, SampleTableBox sampleTableBox) {
        int[] h = eVar.m14086h();
        if (h != null) {
            CompositionTimeToSample.C3420a aVar = null;
            ArrayList arrayList = new ArrayList();
            for (int i : h) {
                if (aVar == null || aVar.m30632b() != i) {
                    aVar = new CompositionTimeToSample.C3420a(1, i);
                    arrayList.add(aVar);
                } else {
                    aVar.m30631c(aVar.m30633a() + 1);
                }
            }
            CompositionTimeToSample compositionTimeToSample = new CompositionTimeToSample();
            compositionTimeToSample.setEntries(arrayList);
            sampleTableBox.addBox(compositionTimeToSample);
        }
    }

    public FileTypeBox m14117e() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(VisualSampleEntry.TYPE3);
        linkedList.add("mp41");
        return new FileTypeBox("isom", 512L, linkedList);
    }

    public Mp4OutputImpl m14116f(C7928a aVar) {
        this.f25771b = aVar;
        FileOutputStream fileOutputStream = new FileOutputStream(aVar.m14101c());
        this.f25772c = fileOutputStream;
        this.f25773d = fileOutputStream.getChannel();
        FileTypeBox e = m14117e();
        e.getBox(this.f25773d);
        long size = this.f25774e + e.getSize();
        this.f25774e = size;
        this.f25775f += size;
        this.f25770a = new InterleaveChunkMdat();
        this.f25778i = ByteBuffer.allocateDirect(4);
        return this;
    }

    public MovieBox m14115g(C7928a aVar) {
        MovieBox movieBox = new MovieBox();
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setCreationTime(new Date());
        movieHeaderBox.setModificationTime(new Date());
        movieHeaderBox.setMatrix(C10453g.f33526j);
        long r = m14104r(aVar);
        Iterator<C7932e> it = aVar.m14099e().iterator();
        long j = 0;
        while (it.hasNext()) {
            C7932e next = it.next();
            next.m14075s();
            long d = (next.m14090d() * r) / next.m14081m();
            if (d > j) {
                j = d;
            }
        }
        movieHeaderBox.setDuration(j);
        movieHeaderBox.setTimescale(r);
        movieHeaderBox.setNextTrackId(aVar.m14099e().size() + 1);
        movieBox.addBox(movieHeaderBox);
        Iterator<C7932e> it2 = aVar.m14099e().iterator();
        while (it2.hasNext()) {
            movieBox.addBox(m14107o(it2.next(), aVar));
        }
        return movieBox;
    }

    public AbstractC8950a m14114h(C7932e eVar) {
        SampleTableBox sampleTableBox = new SampleTableBox();
        m14111k(eVar, sampleTableBox);
        m14108n(eVar, sampleTableBox);
        m14118d(eVar, sampleTableBox);
        m14110l(eVar, sampleTableBox);
        m14112j(eVar, sampleTableBox);
        m14109m(eVar, sampleTableBox);
        m14113i(eVar, sampleTableBox);
        return sampleTableBox;
    }

    public void m14113i(C7932e eVar, SampleTableBox sampleTableBox) {
        ArrayList arrayList = new ArrayList();
        Iterator<C7930c> it = eVar.m14083k().iterator();
        long j = -1;
        while (it.hasNext()) {
            C7930c next = it.next();
            long a = next.m14095a();
            if (!(j == -1 || j == a)) {
                j = -1;
            }
            if (j == -1) {
                arrayList.add(Long.valueOf(a));
            }
            j = next.m14094b() + a;
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        StaticChunkOffsetBox staticChunkOffsetBox = new StaticChunkOffsetBox();
        staticChunkOffsetBox.setChunkOffsets(jArr);
        sampleTableBox.addBox(staticChunkOffsetBox);
    }

    public void m14112j(C7932e eVar, SampleTableBox sampleTableBox) {
        SampleToChunkBox sampleToChunkBox = new SampleToChunkBox();
        sampleToChunkBox.setEntries(new LinkedList());
        int size = eVar.m14083k().size();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < size) {
            C7930c cVar = eVar.m14083k().get(i2);
            i3++;
            if (i2 == size + (-1) || cVar.m14095a() + cVar.m14094b() != eVar.m14083k().get(i2 + 1).m14095a()) {
                if (i != i3) {
                    sampleToChunkBox.getEntries().add(new SampleToChunkBox.C3426a(i4, i3, 1L));
                    i = i3;
                }
                i4++;
                i3 = 0;
            }
            i2++;
        }
        sampleTableBox.addBox(sampleToChunkBox);
    }

    public void m14111k(C7932e eVar, SampleTableBox sampleTableBox) {
        sampleTableBox.addBox(eVar.m14085i());
    }

    public void m14110l(C7932e eVar, SampleTableBox sampleTableBox) {
        long[] l = eVar.m14082l();
        if (l != null && l.length > 0) {
            SyncSampleBox syncSampleBox = new SyncSampleBox();
            syncSampleBox.setSampleNumber(l);
            sampleTableBox.addBox(syncSampleBox);
        }
    }

    public void m14109m(C7932e eVar, SampleTableBox sampleTableBox) {
        SampleSizeBox sampleSizeBox = new SampleSizeBox();
        sampleSizeBox.setSampleSizes(this.f25777h.get(eVar));
        sampleTableBox.addBox(sampleSizeBox);
    }

    public void m14108n(C7932e eVar, SampleTableBox sampleTableBox) {
        long[] j;
        ArrayList arrayList = new ArrayList();
        TimeToSampleBox.C3429a aVar = null;
        for (long j2 : eVar.m14084j()) {
            if (aVar == null || aVar.m30599b() != j2) {
                aVar = new TimeToSampleBox.C3429a(1L, j2);
                arrayList.add(aVar);
            } else {
                aVar.m30598c(aVar.m30600a() + 1);
            }
        }
        TimeToSampleBox timeToSampleBox = new TimeToSampleBox();
        timeToSampleBox.setEntries(arrayList);
        sampleTableBox.addBox(timeToSampleBox);
    }

    public TrackBox m14107o(C7932e eVar, C7928a aVar) {
        TrackBox trackBox = new TrackBox();
        TrackHeaderBox trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setEnabled(true);
        trackHeaderBox.setInMovie(true);
        trackHeaderBox.setInPreview(true);
        if (eVar.m14077q()) {
            trackHeaderBox.setMatrix(C10453g.f33526j);
        } else {
            trackHeaderBox.setMatrix(aVar.m14100d());
        }
        trackHeaderBox.setAlternateGroup(0);
        trackHeaderBox.setCreationTime(eVar.m14091c());
        trackHeaderBox.setDuration((eVar.m14090d() * m14104r(aVar)) / eVar.m14081m());
        trackHeaderBox.setHeight(eVar.m14088f());
        trackHeaderBox.setWidth(eVar.m14078p());
        trackHeaderBox.setLayer(0);
        trackHeaderBox.setModificationTime(new Date());
        trackHeaderBox.setTrackId(eVar.m14080n() + 1);
        trackHeaderBox.setVolume(eVar.m14079o());
        trackBox.addBox(trackHeaderBox);
        MediaBox mediaBox = new MediaBox();
        trackBox.addBox(mediaBox);
        MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(eVar.m14091c());
        mediaHeaderBox.setDuration(eVar.m14090d());
        mediaHeaderBox.setTimescale(eVar.m14081m());
        mediaHeaderBox.setLanguage("eng");
        mediaBox.addBox(mediaHeaderBox);
        HandlerBox handlerBox = new HandlerBox();
        handlerBox.setName(eVar.m14077q() ? "SoundHandle" : "VideoHandle");
        handlerBox.setHandlerType(eVar.m14089e());
        mediaBox.addBox(handlerBox);
        MediaInformationBox mediaInformationBox = new MediaInformationBox();
        mediaInformationBox.addBox(eVar.m14087g());
        DataInformationBox dataInformationBox = new DataInformationBox();
        DataReferenceBox dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        mediaInformationBox.addBox(dataInformationBox);
        mediaInformationBox.addBox(m14114h(eVar));
        mediaBox.addBox(mediaInformationBox);
        return trackBox;
    }

    public final void m14106p() {
        long position = this.f25773d.position();
        this.f25773d.position(this.f25770a.getOffset());
        this.f25770a.getBox(this.f25773d);
        this.f25773d.position(position);
        this.f25770a.setDataOffset(0L);
        this.f25770a.setContentSize(0L);
        this.f25772c.flush();
    }

    public long m14104r(C7928a aVar) {
        long m = !aVar.m14099e().isEmpty() ? aVar.m14099e().iterator().next().m14081m() : 0L;
        Iterator<C7932e> it = aVar.m14099e().iterator();
        while (it.hasNext()) {
            m = m14105q(it.next().m14081m(), m);
        }
        return m;
    }
}
