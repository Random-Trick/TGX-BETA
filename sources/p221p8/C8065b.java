package p221p8;

import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p191n8.AbstractC7306f;
import p258s2.C8631d;
import p269t2.AbstractC8950a;
import p269t2.AbstractC8951b;
import p345y8.C10447b;
import p345y8.C10454h;

public class C8065b extends AbstractList<AbstractC7306f> {
    public TrackExtendsBox f26268M;
    public SoftReference<AbstractC7306f>[] f26269N;
    public List<TrackFragmentBox> f26270O;
    public int[] f26272Q;
    public AbstractC8951b f26274a;
    public C8631d[] f26275b;
    public TrackBox f26276c;
    public Map<TrackRunBox, SoftReference<ByteBuffer>> f26271P = new HashMap();
    public int f26273R = -1;

    public class C8066a implements AbstractC7306f {
        public final long f26278b;
        public final ByteBuffer f26279c;
        public final int f26280d;

        public C8066a(long j, ByteBuffer byteBuffer, int i) {
            this.f26278b = j;
            this.f26279c = byteBuffer;
            this.f26280d = i;
        }

        @Override
        public void mo13642a(WritableByteChannel writableByteChannel) {
            writableByteChannel.write(m13641b());
        }

        public ByteBuffer m13641b() {
            return (ByteBuffer) ((ByteBuffer) this.f26279c.position(this.f26280d)).slice().limit(C10447b.m5103a(this.f26278b));
        }

        @Override
        public long getSize() {
            return this.f26278b;
        }
    }

    public C8065b(long j, AbstractC8951b bVar, C8631d... dVarArr) {
        this.f26276c = null;
        this.f26268M = null;
        this.f26274a = bVar;
        this.f26275b = dVarArr;
        for (TrackBox trackBox : C10454h.m5085h(bVar, "moov[0]/trak")) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j) {
                this.f26276c = trackBox;
            }
        }
        if (this.f26276c != null) {
            for (TrackExtendsBox trackExtendsBox : C10454h.m5085h(bVar, "moov[0]/mvex[0]/trex")) {
                if (trackExtendsBox.getTrackId() == this.f26276c.getTrackHeaderBox().getTrackId()) {
                    this.f26268M = trackExtendsBox;
                }
            }
            this.f26269N = (SoftReference[]) Array.newInstance(SoftReference.class, size());
            m13643m();
            return;
        }
        throw new RuntimeException("This MP4 does not contain track " + j);
    }

    public AbstractC7306f get(int i) {
        long j;
        ByteBuffer byteBuffer;
        long defaultSampleSize;
        AbstractC7306f fVar;
        SoftReference<AbstractC7306f>[] softReferenceArr = this.f26269N;
        if (!(softReferenceArr[i] == null || (fVar = softReferenceArr[i].get()) == null)) {
            return fVar;
        }
        int i2 = i + 1;
        int length = this.f26272Q.length;
        while (true) {
            length--;
            if (i2 - this.f26272Q[length] >= 0) {
                break;
            }
        }
        TrackFragmentBox trackFragmentBox = this.f26270O.get(length);
        int i3 = i2 - this.f26272Q[length];
        MovieFragmentBox movieFragmentBox = (MovieFragmentBox) trackFragmentBox.getParent();
        int i4 = 0;
        for (AbstractC8950a aVar : trackFragmentBox.getBoxes()) {
            if (aVar instanceof TrackRunBox) {
                TrackRunBox trackRunBox = (TrackRunBox) aVar;
                int i5 = i3 - i4;
                if (trackRunBox.getEntries().size() < i5) {
                    i4 += trackRunBox.getEntries().size();
                } else {
                    List<TrackRunBox.C3432a> entries = trackRunBox.getEntries();
                    TrackFragmentHeaderBox trackFragmentHeaderBox = trackFragmentBox.getTrackFragmentHeaderBox();
                    boolean isSampleSizePresent = trackRunBox.isSampleSizePresent();
                    boolean hasDefaultSampleSize = trackFragmentHeaderBox.hasDefaultSampleSize();
                    long j2 = 0;
                    if (!isSampleSizePresent) {
                        if (hasDefaultSampleSize) {
                            defaultSampleSize = trackFragmentHeaderBox.getDefaultSampleSize();
                        } else {
                            TrackExtendsBox trackExtendsBox = this.f26268M;
                            if (trackExtendsBox != null) {
                                defaultSampleSize = trackExtendsBox.getDefaultSampleSize();
                            } else {
                                throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                            }
                        }
                        j = defaultSampleSize;
                    } else {
                        j = 0;
                    }
                    SoftReference<ByteBuffer> softReference = this.f26271P.get(trackRunBox);
                    ByteBuffer byteBuffer2 = softReference != null ? softReference.get() : null;
                    if (byteBuffer2 == null) {
                        AbstractC8951b bVar = movieFragmentBox;
                        if (trackFragmentHeaderBox.hasBaseDataOffset()) {
                            j2 = 0 + trackFragmentHeaderBox.getBaseDataOffset();
                            bVar = movieFragmentBox.getParent();
                        }
                        if (trackRunBox.isDataOffsetPresent()) {
                            j2 += trackRunBox.getDataOffset();
                        }
                        int i6 = 0;
                        for (TrackRunBox.C3432a aVar2 : entries) {
                            i6 = isSampleSizePresent ? (int) (i6 + aVar2.m30573l()) : (int) (i6 + j);
                        }
                        try {
                            ByteBuffer byteBuffer3 = bVar.getByteBuffer(j2, i6);
                            this.f26271P.put(trackRunBox, new SoftReference<>(byteBuffer3));
                            byteBuffer = byteBuffer3;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        byteBuffer = byteBuffer2;
                    }
                    int i7 = 0;
                    for (int i8 = 0; i8 < i5; i8++) {
                        i7 = (int) (isSampleSizePresent ? i7 + entries.get(i8).m30573l() : i7 + j);
                    }
                    C8066a aVar3 = new C8066a(isSampleSizePresent ? entries.get(i5).m30573l() : j, byteBuffer, i7);
                    this.f26269N[i] = new SoftReference<>(aVar3);
                    return aVar3;
                }
            }
        }
        throw new RuntimeException("Couldn't find sample in the traf I was looking");
    }

    public final int m13644i(TrackFragmentBox trackFragmentBox) {
        List<AbstractC8950a> boxes = trackFragmentBox.getBoxes();
        int i = 0;
        for (int i2 = 0; i2 < boxes.size(); i2++) {
            AbstractC8950a aVar = boxes.get(i2);
            if (aVar instanceof TrackRunBox) {
                i += C10447b.m5103a(((TrackRunBox) aVar).getSampleCount());
            }
        }
        return i;
    }

    public final List<TrackFragmentBox> m13643m() {
        List<TrackFragmentBox> list = this.f26270O;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (MovieFragmentBox movieFragmentBox : this.f26274a.getBoxes(MovieFragmentBox.class)) {
            for (TrackFragmentBox trackFragmentBox : movieFragmentBox.getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.f26276c.getTrackHeaderBox().getTrackId()) {
                    arrayList.add(trackFragmentBox);
                }
            }
        }
        C8631d[] dVarArr = this.f26275b;
        if (dVarArr != null) {
            for (C8631d dVar : dVarArr) {
                for (MovieFragmentBox movieFragmentBox2 : dVar.getBoxes(MovieFragmentBox.class)) {
                    for (TrackFragmentBox trackFragmentBox2 : movieFragmentBox2.getBoxes(TrackFragmentBox.class)) {
                        if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.f26276c.getTrackHeaderBox().getTrackId()) {
                            arrayList.add(trackFragmentBox2);
                        }
                    }
                }
            }
        }
        this.f26270O = arrayList;
        this.f26272Q = new int[arrayList.size()];
        int i = 1;
        for (int i2 = 0; i2 < this.f26270O.size(); i2++) {
            this.f26272Q[i2] = i;
            i += m13644i(this.f26270O.get(i2));
        }
        return arrayList;
    }

    @Override
    public int size() {
        int i = this.f26273R;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (MovieFragmentBox movieFragmentBox : this.f26274a.getBoxes(MovieFragmentBox.class)) {
            for (TrackFragmentBox trackFragmentBox : movieFragmentBox.getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.f26276c.getTrackHeaderBox().getTrackId()) {
                    i2 = (int) (i2 + ((TrackRunBox) trackFragmentBox.getBoxes(TrackRunBox.class).get(0)).getSampleCount());
                }
            }
        }
        for (C8631d dVar : this.f26275b) {
            for (MovieFragmentBox movieFragmentBox2 : dVar.getBoxes(MovieFragmentBox.class)) {
                for (TrackFragmentBox trackFragmentBox2 : movieFragmentBox2.getBoxes(TrackFragmentBox.class)) {
                    if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.f26276c.getTrackHeaderBox().getTrackId()) {
                        i2 = (int) (i2 + ((TrackRunBox) trackFragmentBox2.getBoxes(TrackRunBox.class).get(0)).getSampleCount());
                    }
                }
            }
        }
        this.f26273R = i2;
        return i2;
    }
}
