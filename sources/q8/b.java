package q8;

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
import o8.f;
import s2.d;
import z8.h;

public class b extends AbstractList<f> {
    public TrackExtendsBox M;
    public SoftReference<f>[] N;
    public List<TrackFragmentBox> O;
    public int[] Q;
    public t2.b f21459a;
    public d[] f21460b;
    public TrackBox f21461c;
    public Map<TrackRunBox, SoftReference<ByteBuffer>> P = new HashMap();
    public int R = -1;

    public class a implements f {
        public final long f21463b;
        public final ByteBuffer f21464c;
        public final int f21465d;

        public a(long j10, ByteBuffer byteBuffer, int i10) {
            this.f21463b = j10;
            this.f21464c = byteBuffer;
            this.f21465d = i10;
        }

        @Override
        public void a(WritableByteChannel writableByteChannel) {
            writableByteChannel.write(b());
        }

        public ByteBuffer b() {
            return (ByteBuffer) ((ByteBuffer) this.f21464c.position(this.f21465d)).slice().limit(z8.b.a(this.f21463b));
        }

        @Override
        public long getSize() {
            return this.f21463b;
        }
    }

    public b(long j10, t2.b bVar, d... dVarArr) {
        this.f21461c = null;
        this.M = null;
        this.f21459a = bVar;
        this.f21460b = dVarArr;
        for (TrackBox trackBox : h.h(bVar, "moov[0]/trak")) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j10) {
                this.f21461c = trackBox;
            }
        }
        if (this.f21461c != null) {
            for (TrackExtendsBox trackExtendsBox : h.h(bVar, "moov[0]/mvex[0]/trex")) {
                if (trackExtendsBox.getTrackId() == this.f21461c.getTrackHeaderBox().getTrackId()) {
                    this.M = trackExtendsBox;
                }
            }
            this.N = (SoftReference[]) Array.newInstance(SoftReference.class, size());
            m();
            return;
        }
        throw new RuntimeException("This MP4 does not contain track " + j10);
    }

    public f get(int i10) {
        long j10;
        ByteBuffer byteBuffer;
        long defaultSampleSize;
        f fVar;
        SoftReference<f>[] softReferenceArr = this.N;
        if (!(softReferenceArr[i10] == null || (fVar = softReferenceArr[i10].get()) == null)) {
            return fVar;
        }
        int i11 = i10 + 1;
        int length = this.Q.length;
        while (true) {
            length--;
            if (i11 - this.Q[length] >= 0) {
                break;
            }
        }
        TrackFragmentBox trackFragmentBox = this.O.get(length);
        int i12 = i11 - this.Q[length];
        MovieFragmentBox movieFragmentBox = (MovieFragmentBox) trackFragmentBox.getParent();
        int i13 = 0;
        for (t2.a aVar : trackFragmentBox.getBoxes()) {
            if (aVar instanceof TrackRunBox) {
                TrackRunBox trackRunBox = (TrackRunBox) aVar;
                int i14 = i12 - i13;
                if (trackRunBox.getEntries().size() < i14) {
                    i13 += trackRunBox.getEntries().size();
                } else {
                    List<TrackRunBox.a> entries = trackRunBox.getEntries();
                    TrackFragmentHeaderBox trackFragmentHeaderBox = trackFragmentBox.getTrackFragmentHeaderBox();
                    boolean isSampleSizePresent = trackRunBox.isSampleSizePresent();
                    boolean hasDefaultSampleSize = trackFragmentHeaderBox.hasDefaultSampleSize();
                    long j11 = 0;
                    if (!isSampleSizePresent) {
                        if (hasDefaultSampleSize) {
                            defaultSampleSize = trackFragmentHeaderBox.getDefaultSampleSize();
                        } else {
                            TrackExtendsBox trackExtendsBox = this.M;
                            if (trackExtendsBox != null) {
                                defaultSampleSize = trackExtendsBox.getDefaultSampleSize();
                            } else {
                                throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                            }
                        }
                        j10 = defaultSampleSize;
                    } else {
                        j10 = 0;
                    }
                    SoftReference<ByteBuffer> softReference = this.P.get(trackRunBox);
                    ByteBuffer byteBuffer2 = softReference != null ? softReference.get() : null;
                    if (byteBuffer2 == null) {
                        t2.b bVar = movieFragmentBox;
                        if (trackFragmentHeaderBox.hasBaseDataOffset()) {
                            j11 = 0 + trackFragmentHeaderBox.getBaseDataOffset();
                            bVar = movieFragmentBox.getParent();
                        }
                        if (trackRunBox.isDataOffsetPresent()) {
                            j11 += trackRunBox.getDataOffset();
                        }
                        int i15 = 0;
                        for (TrackRunBox.a aVar2 : entries) {
                            i15 = isSampleSizePresent ? (int) (i15 + aVar2.l()) : (int) (i15 + j10);
                        }
                        try {
                            ByteBuffer byteBuffer3 = bVar.getByteBuffer(j11, i15);
                            this.P.put(trackRunBox, new SoftReference<>(byteBuffer3));
                            byteBuffer = byteBuffer3;
                        } catch (IOException e10) {
                            throw new RuntimeException(e10);
                        }
                    } else {
                        byteBuffer = byteBuffer2;
                    }
                    int i16 = 0;
                    for (int i17 = 0; i17 < i14; i17++) {
                        i16 = (int) (isSampleSizePresent ? i16 + entries.get(i17).l() : i16 + j10);
                    }
                    a aVar3 = new a(isSampleSizePresent ? entries.get(i14).l() : j10, byteBuffer, i16);
                    this.N[i10] = new SoftReference<>(aVar3);
                    return aVar3;
                }
            }
        }
        throw new RuntimeException("Couldn't find sample in the traf I was looking");
    }

    public final int g(TrackFragmentBox trackFragmentBox) {
        List<t2.a> boxes = trackFragmentBox.getBoxes();
        int i10 = 0;
        for (int i11 = 0; i11 < boxes.size(); i11++) {
            t2.a aVar = boxes.get(i11);
            if (aVar instanceof TrackRunBox) {
                i10 += z8.b.a(((TrackRunBox) aVar).getSampleCount());
            }
        }
        return i10;
    }

    public final List<TrackFragmentBox> m() {
        List<TrackFragmentBox> list = this.O;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (MovieFragmentBox movieFragmentBox : this.f21459a.getBoxes(MovieFragmentBox.class)) {
            for (TrackFragmentBox trackFragmentBox : movieFragmentBox.getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.f21461c.getTrackHeaderBox().getTrackId()) {
                    arrayList.add(trackFragmentBox);
                }
            }
        }
        d[] dVarArr = this.f21460b;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                for (MovieFragmentBox movieFragmentBox2 : dVar.getBoxes(MovieFragmentBox.class)) {
                    for (TrackFragmentBox trackFragmentBox2 : movieFragmentBox2.getBoxes(TrackFragmentBox.class)) {
                        if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.f21461c.getTrackHeaderBox().getTrackId()) {
                            arrayList.add(trackFragmentBox2);
                        }
                    }
                }
            }
        }
        this.O = arrayList;
        this.Q = new int[arrayList.size()];
        int i10 = 1;
        for (int i11 = 0; i11 < this.O.size(); i11++) {
            this.Q[i11] = i10;
            i10 += g(this.O.get(i11));
        }
        return arrayList;
    }

    @Override
    public int size() {
        int i10 = this.R;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (MovieFragmentBox movieFragmentBox : this.f21459a.getBoxes(MovieFragmentBox.class)) {
            for (TrackFragmentBox trackFragmentBox : movieFragmentBox.getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.f21461c.getTrackHeaderBox().getTrackId()) {
                    i11 = (int) (i11 + ((TrackRunBox) trackFragmentBox.getBoxes(TrackRunBox.class).get(0)).getSampleCount());
                }
            }
        }
        for (d dVar : this.f21460b) {
            for (MovieFragmentBox movieFragmentBox2 : dVar.getBoxes(MovieFragmentBox.class)) {
                for (TrackFragmentBox trackFragmentBox2 : movieFragmentBox2.getBoxes(TrackFragmentBox.class)) {
                    if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.f21461c.getTrackHeaderBox().getTrackId()) {
                        i11 = (int) (i11 + ((TrackRunBox) trackFragmentBox2.getBoxes(TrackRunBox.class).get(0)).getSampleCount());
                    }
                }
            }
        }
        this.R = i11;
        return i11;
    }
}
