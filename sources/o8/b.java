package o8;

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
import e9.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import s2.d;
import s2.e;
import z8.h;

public class b extends e implements r8.b {
    public List<e9.a> X = new ArrayList();
    public UUID Y;

    public class a {
        public t2.b f19314a;
        public SampleAuxiliaryInformationSizesBox f19315b;
        public SampleAuxiliaryInformationOffsetsBox f19316c;

        public a(t2.b bVar) {
            this.f19314a = bVar;
        }

        public SampleAuxiliaryInformationOffsetsBox c() {
            return this.f19316c;
        }

        public SampleAuxiliaryInformationSizesBox d() {
            return this.f19315b;
        }

        public a e() {
            List boxes = this.f19314a.getBoxes(SampleAuxiliaryInformationSizesBox.class);
            List boxes2 = this.f19314a.getBoxes(SampleAuxiliaryInformationOffsetsBox.class);
            this.f19315b = null;
            this.f19316c = null;
            for (int i10 = 0; i10 < boxes.size(); i10++) {
                if (!(this.f19315b == null && ((SampleAuxiliaryInformationSizesBox) boxes.get(i10)).getAuxInfoType() == null) && !"cenc".equals(((SampleAuxiliaryInformationSizesBox) boxes.get(i10)).getAuxInfoType())) {
                    SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = this.f19315b;
                    if (sampleAuxiliaryInformationSizesBox == null || sampleAuxiliaryInformationSizesBox.getAuxInfoType() != null || !"cenc".equals(((SampleAuxiliaryInformationSizesBox) boxes.get(i10)).getAuxInfoType())) {
                        throw new RuntimeException("Are there two cenc labeled saiz?");
                    }
                    this.f19315b = (SampleAuxiliaryInformationSizesBox) boxes.get(i10);
                } else {
                    this.f19315b = (SampleAuxiliaryInformationSizesBox) boxes.get(i10);
                }
                if (!(this.f19316c == null && ((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i10)).getAuxInfoType() == null) && !"cenc".equals(((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i10)).getAuxInfoType())) {
                    SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = this.f19316c;
                    if (sampleAuxiliaryInformationOffsetsBox == null || sampleAuxiliaryInformationOffsetsBox.getAuxInfoType() != null || !"cenc".equals(((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i10)).getAuxInfoType())) {
                        throw new RuntimeException("Are there two cenc labeled saio?");
                    }
                    this.f19316c = (SampleAuxiliaryInformationOffsetsBox) boxes2.get(i10);
                } else {
                    this.f19316c = (SampleAuxiliaryInformationOffsetsBox) boxes2.get(i10);
                }
            }
            return this;
        }
    }

    public b(String str, TrackBox trackBox, d... dVarArr) {
        super(str, trackBox, dVarArr);
        long j10;
        int i10;
        long j11;
        t2.b bVar;
        int i11;
        SchemeTypeBox schemeTypeBox = (SchemeTypeBox) h.c(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        if (trackBox.getParent().getBoxes(MovieExtendsBox.class).size() > 0) {
            Iterator it = ((t2.a) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class).iterator();
            while (it.hasNext()) {
                MovieFragmentBox movieFragmentBox = (MovieFragmentBox) it.next();
                Iterator it2 = movieFragmentBox.getBoxes(TrackFragmentBox.class).iterator();
                while (it2.hasNext()) {
                    TrackFragmentBox trackFragmentBox = (TrackFragmentBox) it2.next();
                    if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                        TrackEncryptionBox trackEncryptionBox = (TrackEncryptionBox) h.c(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
                        this.Y = trackEncryptionBox.getDefault_KID();
                        if (trackFragmentBox.getTrackFragmentHeaderBox().hasBaseDataOffset()) {
                            bVar = ((t2.a) trackBox.getParent()).getParent();
                            j11 = trackFragmentBox.getTrackFragmentHeaderBox().getBaseDataOffset();
                        } else {
                            bVar = movieFragmentBox;
                            j11 = 0;
                        }
                        a e10 = new a(trackFragmentBox).e();
                        SampleAuxiliaryInformationOffsetsBox c10 = e10.c();
                        SampleAuxiliaryInformationSizesBox d10 = e10.d();
                        long[] offsets = c10.getOffsets();
                        List boxes = trackFragmentBox.getBoxes(TrackRunBox.class);
                        trackId = trackId;
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < offsets.length) {
                            int size = ((TrackRunBox) boxes.get(i12)).getEntries().size();
                            long j12 = offsets[i12];
                            it = it;
                            offsets = offsets;
                            boxes = boxes;
                            int i14 = i13;
                            long j13 = 0;
                            while (true) {
                                i11 = i13 + size;
                                if (i14 >= i11) {
                                    break;
                                }
                                movieFragmentBox = movieFragmentBox;
                                it2 = it2;
                                j13 += d10.getSize(i14);
                                i14++;
                            }
                            ByteBuffer byteBuffer = bVar.getByteBuffer(j11 + j12, j13);
                            for (int i15 = i13; i15 < i11; i15++) {
                                i11 = i11;
                                movieFragmentBox = movieFragmentBox;
                                it2 = it2;
                                this.X.add(s(trackEncryptionBox.getDefaultIvSize(), byteBuffer, d10.getSize(i15)));
                            }
                            i12++;
                            i13 = i11;
                        }
                    }
                }
            }
            return;
        }
        TrackEncryptionBox trackEncryptionBox2 = (TrackEncryptionBox) h.c(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
        this.Y = trackEncryptionBox2.getDefault_KID();
        ChunkOffsetBox chunkOffsetBox = (ChunkOffsetBox) h.c(trackBox, "mdia[0]/minf[0]/stbl[0]/stco[0]");
        long[] blowup = trackBox.getSampleTableBox().getSampleToChunkBox().blowup((chunkOffsetBox == null ? (ChunkOffsetBox) h.c(trackBox, "mdia[0]/minf[0]/stbl[0]/co64[0]") : chunkOffsetBox).getChunkOffsets().length);
        a e11 = new a((t2.b) h.c(trackBox, "mdia[0]/minf[0]/stbl[0]")).e();
        SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = e11.f19316c;
        SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = e11.f19315b;
        t2.b parent = ((MovieBox) trackBox.getParent()).getParent();
        if (sampleAuxiliaryInformationOffsetsBox.getOffsets().length == 1) {
            long j14 = sampleAuxiliaryInformationOffsetsBox.getOffsets()[0];
            if (sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize() > 0) {
                i10 = (sampleAuxiliaryInformationSizesBox.getSampleCount() * sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize()) + 0;
            } else {
                i10 = 0;
                for (int i16 = 0; i16 < sampleAuxiliaryInformationSizesBox.getSampleCount(); i16++) {
                    i10 += sampleAuxiliaryInformationSizesBox.getSampleInfoSizes()[i16];
                }
            }
            ByteBuffer byteBuffer2 = parent.getByteBuffer(j14, i10);
            for (int i17 = 0; i17 < sampleAuxiliaryInformationSizesBox.getSampleCount(); i17++) {
                this.X.add(s(trackEncryptionBox2.getDefaultIvSize(), byteBuffer2, sampleAuxiliaryInformationSizesBox.getSize(i17)));
            }
        } else if (sampleAuxiliaryInformationOffsetsBox.getOffsets().length == blowup.length) {
            int i18 = 0;
            for (int i19 = 0; i19 < blowup.length; i19++) {
                long j15 = sampleAuxiliaryInformationOffsetsBox.getOffsets()[i19];
                if (sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize() > 0) {
                    j10 = (sampleAuxiliaryInformationSizesBox.getSampleCount() * blowup[i19]) + 0;
                } else {
                    j10 = 0;
                    for (int i20 = 0; i20 < blowup[i19]; i20++) {
                        j10 += sampleAuxiliaryInformationSizesBox.getSize(i18 + i20);
                    }
                }
                ByteBuffer byteBuffer3 = parent.getByteBuffer(j15, j10);
                for (int i21 = 0; i21 < blowup[i19]; i21++) {
                    this.X.add(s(trackEncryptionBox2.getDefaultIvSize(), byteBuffer3, sampleAuxiliaryInformationSizesBox.getSize(i18 + i21)));
                }
                i18 = (int) (i18 + blowup[i19]);
            }
        } else {
            throw new RuntimeException("Number of saio offsets must be either 1 or number of chunks");
        }
    }

    @Override
    public String b() {
        return "enc(" + super.b() + ")";
    }

    @Override
    public List<e9.a> e0() {
        return this.X;
    }

    @Override
    public boolean q0() {
        return false;
    }

    public final e9.a s(int i10, ByteBuffer byteBuffer, long j10) {
        e9.a aVar = new e9.a();
        if (j10 > 0) {
            byte[] bArr = new byte[i10];
            aVar.f11392a = bArr;
            byteBuffer.get(bArr);
            if (j10 > i10) {
                aVar.f11393b = new a.j[e.i(byteBuffer)];
                int i11 = 0;
                while (true) {
                    a.j[] jVarArr = aVar.f11393b;
                    if (i11 >= jVarArr.length) {
                        break;
                    }
                    jVarArr[i11] = aVar.a(e.i(byteBuffer), e.k(byteBuffer));
                    i11++;
                }
            }
        }
        return aVar;
    }

    public String toString() {
        return "CencMp4TrackImpl{handler='" + getHandler() + "'}";
    }
}
