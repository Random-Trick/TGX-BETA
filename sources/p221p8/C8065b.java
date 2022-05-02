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
    public TrackExtendsBox f26265M;
    public SoftReference<AbstractC7306f>[] f26266N;
    public List<TrackFragmentBox> f26267O;
    public int[] f26269Q;
    public AbstractC8951b f26271a;
    public C8631d[] f26272b;
    public TrackBox f26273c;
    public Map<TrackRunBox, SoftReference<ByteBuffer>> f26268P = new HashMap();
    public int f26270R = -1;

    public class C8066a implements AbstractC7306f {
        public final long f26275b;
        public final ByteBuffer f26276c;
        public final int f26277d;

        public C8066a(long j, ByteBuffer byteBuffer, int i) {
            this.f26275b = j;
            this.f26276c = byteBuffer;
            this.f26277d = i;
        }

        @Override
        public void mo13643a(WritableByteChannel writableByteChannel) {
            writableByteChannel.write(m13642b());
        }

        public ByteBuffer m13642b() {
            return (ByteBuffer) ((ByteBuffer) this.f26276c.position(this.f26277d)).slice().limit(C10447b.m5103a(this.f26275b));
        }

        @Override
        public long getSize() {
            return this.f26275b;
        }
    }

    public C8065b(long j, AbstractC8951b bVar, C8631d... dVarArr) {
        this.f26273c = null;
        this.f26265M = null;
        this.f26271a = bVar;
        this.f26272b = dVarArr;
        for (TrackBox trackBox : C10454h.m5085h(bVar, "moov[0]/trak")) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j) {
                this.f26273c = trackBox;
            }
        }
        if (this.f26273c != null) {
            for (TrackExtendsBox trackExtendsBox : C10454h.m5085h(bVar, "moov[0]/mvex[0]/trex")) {
                if (trackExtendsBox.getTrackId() == this.f26273c.getTrackHeaderBox().getTrackId()) {
                    this.f26265M = trackExtendsBox;
                }
            }
            this.f26266N = (SoftReference[]) Array.newInstance(SoftReference.class, size());
            m13644m();
            return;
        }
        throw new RuntimeException("This MP4 does not contain track " + j);
    }

    public AbstractC7306f get(int i) {
        long j;
        ByteBuffer byteBuffer;
        long defaultSampleSize;
        AbstractC7306f fVar;
        SoftReference<AbstractC7306f>[] softReferenceArr = this.f26266N;
        if (!(softReferenceArr[i] == null || (fVar = softReferenceArr[i].get()) == null)) {
            return fVar;
        }
        int i2 = i + 1;
        int length = this.f26269Q.length;
        while (true) {
            length--;
            if (i2 - this.f26269Q[length] >= 0) {
                break;
            }
        }
        TrackFragmentBox trackFragmentBox = this.f26267O.get(length);
        int i3 = i2 - this.f26269Q[length];
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
                            TrackExtendsBox trackExtendsBox = this.f26265M;
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
                    SoftReference<ByteBuffer> softReference = this.f26268P.get(trackRunBox);
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
                            i6 = isSampleSizePresent ? (int) (i6 + aVar2.m30571l()) : (int) (i6 + j);
                        }
                        try {
                            ByteBuffer byteBuffer3 = bVar.getByteBuffer(j2, i6);
                            this.f26268P.put(trackRunBox, new SoftReference<>(byteBuffer3));
                            byteBuffer = byteBuffer3;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        byteBuffer = byteBuffer2;
                    }
                    int i7 = 0;
                    for (int i8 = 0; i8 < i5; i8++) {
                        i7 = (int) (isSampleSizePresent ? i7 + entries.get(i8).m30571l() : i7 + j);
                    }
                    C8066a aVar3 = new C8066a(isSampleSizePresent ? entries.get(i5).m30571l() : j, byteBuffer, i7);
                    this.f26266N[i] = new SoftReference<>(aVar3);
                    return aVar3;
                }
            }
        }
        throw new RuntimeException("Couldn't find sample in the traf I was looking");
    }

    public final int m13645i(TrackFragmentBox trackFragmentBox) {
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

    public final List<TrackFragmentBox> m13644m() {
        List<TrackFragmentBox> list = this.f26267O;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (MovieFragmentBox movieFragmentBox : this.f26271a.getBoxes(MovieFragmentBox.class)) {
            for (TrackFragmentBox trackFragmentBox : movieFragmentBox.getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.f26273c.getTrackHeaderBox().getTrackId()) {
                    arrayList.add(trackFragmentBox);
                }
            }
        }
        C8631d[] dVarArr = this.f26272b;
        if (dVarArr != null) {
            for (C8631d dVar : dVarArr) {
                for (MovieFragmentBox movieFragmentBox2 : dVar.getBoxes(MovieFragmentBox.class)) {
                    for (TrackFragmentBox trackFragmentBox2 : movieFragmentBox2.getBoxes(TrackFragmentBox.class)) {
                        if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.f26273c.getTrackHeaderBox().getTrackId()) {
                            arrayList.add(trackFragmentBox2);
                        }
                    }
                }
            }
        }
        this.f26267O = arrayList;
        this.f26269Q = new int[arrayList.size()];
        int i = 1;
        for (int i2 = 0; i2 < this.f26267O.size(); i2++) {
            this.f26269Q[i2] = i;
            i += m13645i(this.f26267O.get(i2));
        }
        return arrayList;
    }

    @Override
    public int size() {
        int i = this.f26270R;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (MovieFragmentBox movieFragmentBox : this.f26271a.getBoxes(MovieFragmentBox.class)) {
            for (TrackFragmentBox trackFragmentBox : movieFragmentBox.getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.f26273c.getTrackHeaderBox().getTrackId()) {
                    i2 = (int) (i2 + ((TrackRunBox) trackFragmentBox.getBoxes(TrackRunBox.class).get(0)).getSampleCount());
                }
            }
        }
        for (C8631d dVar : this.f26272b) {
            for (MovieFragmentBox movieFragmentBox2 : dVar.getBoxes(MovieFragmentBox.class)) {
                for (TrackFragmentBox trackFragmentBox2 : movieFragmentBox2.getBoxes(TrackFragmentBox.class)) {
                    if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.f26273c.getTrackHeaderBox().getTrackId()) {
                        i2 = (int) (i2 + ((TrackRunBox) trackFragmentBox2.getBoxes(TrackRunBox.class).get(0)).getSampleCount());
                    }
                }
            }
        }
        this.f26270R = i2;
        return i2;
    }
}
