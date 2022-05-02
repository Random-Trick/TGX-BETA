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
    public InterleaveChunkMdat f25767a = null;
    public C7928a f25768b = null;
    public FileOutputStream f25769c = null;
    public FileChannel f25770d = null;
    public long f25771e = 0;
    public long f25772f = 0;
    public boolean f25773g = true;
    public HashMap<C7932e, long[]> f25774h = new HashMap<>();
    public ByteBuffer f25775i = null;

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
                C8634g.m11854g(allocate, size);
            } else {
                C8634g.m11854g(allocate, 1L);
            }
            allocate.put(C8631d.m11877t(MediaDataBox.TYPE));
            if (isSmallBox(size)) {
                allocate.put(new byte[8]);
            } else {
                C8634g.m11852i(allocate, size);
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

    public static long m14106q(long j, long j2) {
        return j2 == 0 ? j : m14106q(j2, j % j2);
    }

    @Override
    public int mo14122a(MediaFormat mediaFormat, boolean z) {
        return this.f25768b.m14103b(mediaFormat, z);
    }

    @Override
    public void mo14121b() {
        if (this.f25767a.getContentSize() != 0) {
            m14107p();
        }
        Iterator<C7932e> it = this.f25768b.m14100e().iterator();
        while (it.hasNext()) {
            C7932e next = it.next();
            ArrayList<C7930c> k = next.m14084k();
            int size = k.size();
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                jArr[i] = k.get(i).m14095b();
            }
            this.f25774h.put(next, jArr);
        }
        m14116g(this.f25768b).getBox(this.f25770d);
        this.f25769c.flush();
        this.f25770d.close();
        this.f25769c.close();
    }

    @Override
    public boolean mo14120c(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z) {
        if (this.f25773g) {
            this.f25767a.setContentSize(0L);
            this.f25767a.getBox(this.f25770d);
            this.f25767a.setDataOffset(this.f25771e);
            this.f25771e += 16;
            this.f25772f += 16;
            this.f25773g = false;
        }
        InterleaveChunkMdat interleaveChunkMdat = this.f25767a;
        interleaveChunkMdat.setContentSize(interleaveChunkMdat.getContentSize() + bufferInfo.size);
        long j = this.f25772f + bufferInfo.size;
        this.f25772f = j;
        boolean z2 = true;
        if (j >= 32768) {
            m14107p();
            this.f25773g = true;
            this.f25772f -= 32768;
        } else {
            z2 = false;
        }
        this.f25768b.m14104a(i, this.f25771e, bufferInfo);
        byteBuffer.position(bufferInfo.offset + (!z ? 0 : 4));
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        if (z) {
            this.f25775i.position(0);
            this.f25775i.putInt(bufferInfo.size - 4);
            this.f25775i.position(0);
            this.f25770d.write(this.f25775i);
        }
        this.f25770d.write(byteBuffer);
        this.f25771e += bufferInfo.size;
        if (z2) {
            this.f25769c.flush();
        }
        return z2;
    }

    public void m14119d(C7932e eVar, SampleTableBox sampleTableBox) {
        int[] h = eVar.m14087h();
        if (h != null) {
            CompositionTimeToSample.C3420a aVar = null;
            ArrayList arrayList = new ArrayList();
            for (int i : h) {
                if (aVar == null || aVar.m30630b() != i) {
                    aVar = new CompositionTimeToSample.C3420a(1, i);
                    arrayList.add(aVar);
                } else {
                    aVar.m30629c(aVar.m30631a() + 1);
                }
            }
            CompositionTimeToSample compositionTimeToSample = new CompositionTimeToSample();
            compositionTimeToSample.setEntries(arrayList);
            sampleTableBox.addBox(compositionTimeToSample);
        }
    }

    public FileTypeBox m14118e() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(VisualSampleEntry.TYPE3);
        linkedList.add("mp41");
        return new FileTypeBox("isom", 512L, linkedList);
    }

    public Mp4OutputImpl m14117f(C7928a aVar) {
        this.f25768b = aVar;
        FileOutputStream fileOutputStream = new FileOutputStream(aVar.m14102c());
        this.f25769c = fileOutputStream;
        this.f25770d = fileOutputStream.getChannel();
        FileTypeBox e = m14118e();
        e.getBox(this.f25770d);
        long size = this.f25771e + e.getSize();
        this.f25771e = size;
        this.f25772f += size;
        this.f25767a = new InterleaveChunkMdat();
        this.f25775i = ByteBuffer.allocateDirect(4);
        return this;
    }

    public MovieBox m14116g(C7928a aVar) {
        MovieBox movieBox = new MovieBox();
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setCreationTime(new Date());
        movieHeaderBox.setModificationTime(new Date());
        movieHeaderBox.setMatrix(C10453g.f33523j);
        long r = m14105r(aVar);
        Iterator<C7932e> it = aVar.m14100e().iterator();
        long j = 0;
        while (it.hasNext()) {
            C7932e next = it.next();
            next.m14076s();
            long d = (next.m14091d() * r) / next.m14082m();
            if (d > j) {
                j = d;
            }
        }
        movieHeaderBox.setDuration(j);
        movieHeaderBox.setTimescale(r);
        movieHeaderBox.setNextTrackId(aVar.m14100e().size() + 1);
        movieBox.addBox(movieHeaderBox);
        Iterator<C7932e> it2 = aVar.m14100e().iterator();
        while (it2.hasNext()) {
            movieBox.addBox(m14108o(it2.next(), aVar));
        }
        return movieBox;
    }

    public AbstractC8950a m14115h(C7932e eVar) {
        SampleTableBox sampleTableBox = new SampleTableBox();
        m14112k(eVar, sampleTableBox);
        m14109n(eVar, sampleTableBox);
        m14119d(eVar, sampleTableBox);
        m14111l(eVar, sampleTableBox);
        m14113j(eVar, sampleTableBox);
        m14110m(eVar, sampleTableBox);
        m14114i(eVar, sampleTableBox);
        return sampleTableBox;
    }

    public void m14114i(C7932e eVar, SampleTableBox sampleTableBox) {
        ArrayList arrayList = new ArrayList();
        Iterator<C7930c> it = eVar.m14084k().iterator();
        long j = -1;
        while (it.hasNext()) {
            C7930c next = it.next();
            long a = next.m14096a();
            if (!(j == -1 || j == a)) {
                j = -1;
            }
            if (j == -1) {
                arrayList.add(Long.valueOf(a));
            }
            j = next.m14095b() + a;
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        StaticChunkOffsetBox staticChunkOffsetBox = new StaticChunkOffsetBox();
        staticChunkOffsetBox.setChunkOffsets(jArr);
        sampleTableBox.addBox(staticChunkOffsetBox);
    }

    public void m14113j(C7932e eVar, SampleTableBox sampleTableBox) {
        SampleToChunkBox sampleToChunkBox = new SampleToChunkBox();
        sampleToChunkBox.setEntries(new LinkedList());
        int size = eVar.m14084k().size();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < size) {
            C7930c cVar = eVar.m14084k().get(i2);
            i3++;
            if (i2 == size + (-1) || cVar.m14096a() + cVar.m14095b() != eVar.m14084k().get(i2 + 1).m14096a()) {
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

    public void m14112k(C7932e eVar, SampleTableBox sampleTableBox) {
        sampleTableBox.addBox(eVar.m14086i());
    }

    public void m14111l(C7932e eVar, SampleTableBox sampleTableBox) {
        long[] l = eVar.m14083l();
        if (l != null && l.length > 0) {
            SyncSampleBox syncSampleBox = new SyncSampleBox();
            syncSampleBox.setSampleNumber(l);
            sampleTableBox.addBox(syncSampleBox);
        }
    }

    public void m14110m(C7932e eVar, SampleTableBox sampleTableBox) {
        SampleSizeBox sampleSizeBox = new SampleSizeBox();
        sampleSizeBox.setSampleSizes(this.f25774h.get(eVar));
        sampleTableBox.addBox(sampleSizeBox);
    }

    public void m14109n(C7932e eVar, SampleTableBox sampleTableBox) {
        long[] j;
        ArrayList arrayList = new ArrayList();
        TimeToSampleBox.C3429a aVar = null;
        for (long j2 : eVar.m14085j()) {
            if (aVar == null || aVar.m30597b() != j2) {
                aVar = new TimeToSampleBox.C3429a(1L, j2);
                arrayList.add(aVar);
            } else {
                aVar.m30596c(aVar.m30598a() + 1);
            }
        }
        TimeToSampleBox timeToSampleBox = new TimeToSampleBox();
        timeToSampleBox.setEntries(arrayList);
        sampleTableBox.addBox(timeToSampleBox);
    }

    public TrackBox m14108o(C7932e eVar, C7928a aVar) {
        TrackBox trackBox = new TrackBox();
        TrackHeaderBox trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setEnabled(true);
        trackHeaderBox.setInMovie(true);
        trackHeaderBox.setInPreview(true);
        if (eVar.m14078q()) {
            trackHeaderBox.setMatrix(C10453g.f33523j);
        } else {
            trackHeaderBox.setMatrix(aVar.m14101d());
        }
        trackHeaderBox.setAlternateGroup(0);
        trackHeaderBox.setCreationTime(eVar.m14092c());
        trackHeaderBox.setDuration((eVar.m14091d() * m14105r(aVar)) / eVar.m14082m());
        trackHeaderBox.setHeight(eVar.m14089f());
        trackHeaderBox.setWidth(eVar.m14079p());
        trackHeaderBox.setLayer(0);
        trackHeaderBox.setModificationTime(new Date());
        trackHeaderBox.setTrackId(eVar.m14081n() + 1);
        trackHeaderBox.setVolume(eVar.m14080o());
        trackBox.addBox(trackHeaderBox);
        MediaBox mediaBox = new MediaBox();
        trackBox.addBox(mediaBox);
        MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(eVar.m14092c());
        mediaHeaderBox.setDuration(eVar.m14091d());
        mediaHeaderBox.setTimescale(eVar.m14082m());
        mediaHeaderBox.setLanguage("eng");
        mediaBox.addBox(mediaHeaderBox);
        HandlerBox handlerBox = new HandlerBox();
        handlerBox.setName(eVar.m14078q() ? "SoundHandle" : "VideoHandle");
        handlerBox.setHandlerType(eVar.m14090e());
        mediaBox.addBox(handlerBox);
        MediaInformationBox mediaInformationBox = new MediaInformationBox();
        mediaInformationBox.addBox(eVar.m14088g());
        DataInformationBox dataInformationBox = new DataInformationBox();
        DataReferenceBox dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        mediaInformationBox.addBox(dataInformationBox);
        mediaInformationBox.addBox(m14115h(eVar));
        mediaBox.addBox(mediaInformationBox);
        return trackBox;
    }

    public final void m14107p() {
        long position = this.f25770d.position();
        this.f25770d.position(this.f25767a.getOffset());
        this.f25767a.getBox(this.f25770d);
        this.f25770d.position(position);
        this.f25767a.setDataOffset(0L);
        this.f25767a.setContentSize(0L);
        this.f25769c.flush();
    }

    public long m14105r(C7928a aVar) {
        long m = !aVar.m14100e().isEmpty() ? aVar.m14100e().iterator().next().m14082m() : 0L;
        Iterator<C7932e> it = aVar.m14100e().iterator();
        while (it.hasNext()) {
            m = m14106q(it.next().m14082m(), m);
        }
        return m;
    }
}
