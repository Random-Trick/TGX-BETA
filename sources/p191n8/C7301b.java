package p191n8;

import com.coremedia.iso.boxes.ChunkOffsetBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import com.mp4parser.iso23001.part7.TrackEncryptionBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p049d9.C3915a;
import p235q8.AbstractC8278b;
import p258s2.C8631d;
import p258s2.C8632e;
import p269t2.AbstractC8950a;
import p269t2.AbstractC8951b;
import p345y8.C10454h;

public class C7301b extends C7305e implements AbstractC8278b {
    public List<C3915a> f23180X = new ArrayList();
    public UUID f23181Y;

    public class C7302a {
        public AbstractC8951b f23182a;
        public SampleAuxiliaryInformationSizesBox f23183b;
        public SampleAuxiliaryInformationOffsetsBox f23184c;

        public C7302a(AbstractC8951b bVar) {
            this.f23182a = bVar;
        }

        public SampleAuxiliaryInformationOffsetsBox m17108c() {
            return this.f23184c;
        }

        public SampleAuxiliaryInformationSizesBox m17107d() {
            return this.f23183b;
        }

        public C7302a m17106e() {
            List boxes = this.f23182a.getBoxes(SampleAuxiliaryInformationSizesBox.class);
            List boxes2 = this.f23182a.getBoxes(SampleAuxiliaryInformationOffsetsBox.class);
            this.f23183b = null;
            this.f23184c = null;
            for (int i = 0; i < boxes.size(); i++) {
                if (!(this.f23183b == null && ((SampleAuxiliaryInformationSizesBox) boxes.get(i)).getAuxInfoType() == null) && !"cenc".equals(((SampleAuxiliaryInformationSizesBox) boxes.get(i)).getAuxInfoType())) {
                    SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = this.f23183b;
                    if (sampleAuxiliaryInformationSizesBox == null || sampleAuxiliaryInformationSizesBox.getAuxInfoType() != null || !"cenc".equals(((SampleAuxiliaryInformationSizesBox) boxes.get(i)).getAuxInfoType())) {
                        throw new RuntimeException("Are there two cenc labeled saiz?");
                    }
                    this.f23183b = (SampleAuxiliaryInformationSizesBox) boxes.get(i);
                } else {
                    this.f23183b = (SampleAuxiliaryInformationSizesBox) boxes.get(i);
                }
                if (!(this.f23184c == null && ((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i)).getAuxInfoType() == null) && !"cenc".equals(((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i)).getAuxInfoType())) {
                    SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = this.f23184c;
                    if (sampleAuxiliaryInformationOffsetsBox == null || sampleAuxiliaryInformationOffsetsBox.getAuxInfoType() != null || !"cenc".equals(((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i)).getAuxInfoType())) {
                        throw new RuntimeException("Are there two cenc labeled saio?");
                    }
                    this.f23184c = (SampleAuxiliaryInformationOffsetsBox) boxes2.get(i);
                } else {
                    this.f23184c = (SampleAuxiliaryInformationOffsetsBox) boxes2.get(i);
                }
            }
            return this;
        }
    }

    public C7301b(String str, TrackBox trackBox, C8631d... dVarArr) {
        super(str, trackBox, dVarArr);
        long j;
        int i;
        long j2;
        AbstractC8951b bVar;
        int i2;
        SchemeTypeBox schemeTypeBox = (SchemeTypeBox) C10454h.m5090c(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        if (trackBox.getParent().getBoxes(MovieExtendsBox.class).size() > 0) {
            Iterator it = ((AbstractC8950a) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class).iterator();
            while (it.hasNext()) {
                MovieFragmentBox movieFragmentBox = (MovieFragmentBox) it.next();
                Iterator it2 = movieFragmentBox.getBoxes(TrackFragmentBox.class).iterator();
                while (it2.hasNext()) {
                    TrackFragmentBox trackFragmentBox = (TrackFragmentBox) it2.next();
                    if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                        TrackEncryptionBox trackEncryptionBox = (TrackEncryptionBox) C10454h.m5090c(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
                        this.f23181Y = trackEncryptionBox.getDefault_KID();
                        if (trackFragmentBox.getTrackFragmentHeaderBox().hasBaseDataOffset()) {
                            bVar = ((AbstractC8950a) trackBox.getParent()).getParent();
                            j2 = trackFragmentBox.getTrackFragmentHeaderBox().getBaseDataOffset();
                        } else {
                            bVar = movieFragmentBox;
                            j2 = 0;
                        }
                        C7302a e = new C7302a(trackFragmentBox).m17106e();
                        SampleAuxiliaryInformationOffsetsBox c = e.m17108c();
                        SampleAuxiliaryInformationSizesBox d = e.m17107d();
                        long[] offsets = c.getOffsets();
                        List boxes = trackFragmentBox.getBoxes(TrackRunBox.class);
                        trackId = trackId;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < offsets.length) {
                            int size = ((TrackRunBox) boxes.get(i3)).getEntries().size();
                            long j3 = offsets[i3];
                            it = it;
                            offsets = offsets;
                            boxes = boxes;
                            int i5 = i4;
                            long j4 = 0;
                            while (true) {
                                i2 = i4 + size;
                                if (i5 >= i2) {
                                    break;
                                }
                                movieFragmentBox = movieFragmentBox;
                                it2 = it2;
                                j4 += d.getSize(i5);
                                i5++;
                            }
                            ByteBuffer byteBuffer = bVar.getByteBuffer(j2 + j3, j4);
                            for (int i6 = i4; i6 < i2; i6++) {
                                i2 = i2;
                                movieFragmentBox = movieFragmentBox;
                                it2 = it2;
                                this.f23180X.add(m17111t(trackEncryptionBox.getDefaultIvSize(), byteBuffer, d.getSize(i6)));
                            }
                            i3++;
                            i4 = i2;
                        }
                    }
                }
            }
            return;
        }
        TrackEncryptionBox trackEncryptionBox2 = (TrackEncryptionBox) C10454h.m5090c(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
        this.f23181Y = trackEncryptionBox2.getDefault_KID();
        ChunkOffsetBox chunkOffsetBox = (ChunkOffsetBox) C10454h.m5090c(trackBox, "mdia[0]/minf[0]/stbl[0]/stco[0]");
        long[] blowup = trackBox.getSampleTableBox().getSampleToChunkBox().blowup((chunkOffsetBox == null ? (ChunkOffsetBox) C10454h.m5090c(trackBox, "mdia[0]/minf[0]/stbl[0]/co64[0]") : chunkOffsetBox).getChunkOffsets().length);
        C7302a e2 = new C7302a((AbstractC8951b) C10454h.m5090c(trackBox, "mdia[0]/minf[0]/stbl[0]")).m17106e();
        SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = e2.f23184c;
        SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = e2.f23183b;
        AbstractC8951b parent = ((MovieBox) trackBox.getParent()).getParent();
        if (sampleAuxiliaryInformationOffsetsBox.getOffsets().length == 1) {
            long j5 = sampleAuxiliaryInformationOffsetsBox.getOffsets()[0];
            if (sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize() > 0) {
                i = (sampleAuxiliaryInformationSizesBox.getSampleCount() * sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize()) + 0;
            } else {
                i = 0;
                for (int i7 = 0; i7 < sampleAuxiliaryInformationSizesBox.getSampleCount(); i7++) {
                    i += sampleAuxiliaryInformationSizesBox.getSampleInfoSizes()[i7];
                }
            }
            ByteBuffer byteBuffer2 = parent.getByteBuffer(j5, i);
            for (int i8 = 0; i8 < sampleAuxiliaryInformationSizesBox.getSampleCount(); i8++) {
                this.f23180X.add(m17111t(trackEncryptionBox2.getDefaultIvSize(), byteBuffer2, sampleAuxiliaryInformationSizesBox.getSize(i8)));
            }
        } else if (sampleAuxiliaryInformationOffsetsBox.getOffsets().length == blowup.length) {
            int i9 = 0;
            for (int i10 = 0; i10 < blowup.length; i10++) {
                long j6 = sampleAuxiliaryInformationOffsetsBox.getOffsets()[i10];
                if (sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize() > 0) {
                    j = (sampleAuxiliaryInformationSizesBox.getSampleCount() * blowup[i10]) + 0;
                } else {
                    j = 0;
                    for (int i11 = 0; i11 < blowup[i10]; i11++) {
                        j += sampleAuxiliaryInformationSizesBox.getSize(i9 + i11);
                    }
                }
                ByteBuffer byteBuffer3 = parent.getByteBuffer(j6, j);
                for (int i12 = 0; i12 < blowup[i10]; i12++) {
                    this.f23180X.add(m17111t(trackEncryptionBox2.getDefaultIvSize(), byteBuffer3, sampleAuxiliaryInformationSizesBox.getSize(i9 + i12)));
                }
                i9 = (int) (i9 + blowup[i10]);
            }
        } else {
            throw new RuntimeException("Number of saio offsets must be either 1 or number of chunks");
        }
    }

    @Override
    public String mo17091b() {
        return "enc(" + super.mo17091b() + ")";
    }

    @Override
    public List<C3915a> mo12962c0() {
        return this.f23180X;
    }

    @Override
    public boolean mo12961q0() {
        return false;
    }

    public final C3915a m17111t(int i, ByteBuffer byteBuffer, long j) {
        C3915a aVar = new C3915a();
        if (j > 0) {
            byte[] bArr = new byte[i];
            aVar.f13219a = bArr;
            byteBuffer.get(bArr);
            if (j > i) {
                aVar.f13220b = new C3915a.AbstractC3925j[C8632e.m11866i(byteBuffer)];
                int i2 = 0;
                while (true) {
                    C3915a.AbstractC3925j[] jVarArr = aVar.f13220b;
                    if (i2 >= jVarArr.length) {
                        break;
                    }
                    jVarArr[i2] = aVar.m29601a(C8632e.m11866i(byteBuffer), C8632e.m11864k(byteBuffer));
                    i2++;
                }
            }
        }
        return aVar;
    }

    public String toString() {
        return "CencMp4TrackImpl{handler='" + getHandler() + "'}";
    }
}
