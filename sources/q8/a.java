package q8;

import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.TrackBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import o8.f;
import t2.b;

public class a extends AbstractList<f> {
    public int[] M;
    public long[] N;
    public long[] O;
    public long[][] P;
    public SampleSizeBox Q;
    public int R = 0;
    public b f21452a;
    public TrackBox f21453b;
    public ByteBuffer[][] f21454c;

    public class C0197a implements f {
        public final long f21456b;
        public final ByteBuffer f21457c;
        public final long f21458d;

        public C0197a(long j10, ByteBuffer byteBuffer, long j11) {
            this.f21456b = j10;
            this.f21457c = byteBuffer;
            this.f21458d = j11;
        }

        @Override
        public void a(WritableByteChannel writableByteChannel) {
            writableByteChannel.write(b());
        }

        public ByteBuffer b() {
            return (ByteBuffer) ((ByteBuffer) this.f21457c.position(z8.b.a(this.f21458d))).slice().limit(z8.b.a(this.f21456b));
        }

        @Override
        public long getSize() {
            return this.f21456b;
        }

        public String toString() {
            return "DefaultMp4Sample(size:" + this.f21456b + ")";
        }
    }

    public a(long j10, b bVar) {
        int i10;
        this.f21453b = null;
        this.f21454c = null;
        int i11 = 0;
        this.f21452a = bVar;
        for (TrackBox trackBox : ((MovieBox) bVar.getBoxes(MovieBox.class).get(0)).getBoxes(TrackBox.class)) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j10) {
                this.f21453b = trackBox;
            }
        }
        TrackBox trackBox2 = this.f21453b;
        if (trackBox2 != null) {
            long[] chunkOffsets = trackBox2.getSampleTableBox().getChunkOffsetBox().getChunkOffsets();
            this.N = chunkOffsets;
            this.O = new long[chunkOffsets.length];
            this.f21454c = new ByteBuffer[chunkOffsets.length];
            this.P = new long[chunkOffsets.length];
            this.Q = this.f21453b.getSampleTableBox().getSampleSizeBox();
            List<SampleToChunkBox.a> entries = this.f21453b.getSampleTableBox().getSampleToChunkBox().getEntries();
            SampleToChunkBox.a[] aVarArr = (SampleToChunkBox.a[]) entries.toArray(new SampleToChunkBox.a[entries.size()]);
            SampleToChunkBox.a aVar = aVarArr[0];
            long a10 = aVar.a();
            int a11 = z8.b.a(aVar.c());
            int size = size();
            int i12 = 0;
            int i13 = 1;
            int i14 = 0;
            int i15 = 1;
            do {
                i12++;
                if (i12 == a10) {
                    if (aVarArr.length > i13) {
                        i13++;
                        SampleToChunkBox.a aVar2 = aVarArr[i13];
                        a11 = z8.b.a(aVar2.c());
                        i14 = a11;
                        a10 = aVar2.a();
                    } else {
                        i14 = a11;
                        a11 = -1;
                        a10 = Long.MAX_VALUE;
                    }
                }
                this.P[i12 - 1] = new long[i14];
                i15 += i14;
            } while (i15 <= size);
            this.M = new int[i12 + 1];
            SampleToChunkBox.a aVar3 = aVarArr[0];
            long a12 = aVar3.a();
            int a13 = z8.b.a(aVar3.c());
            int i16 = 0;
            int i17 = 1;
            int i18 = 1;
            int i19 = 0;
            while (true) {
                i10 = i16 + 1;
                this.M[i16] = i17;
                if (i10 == a12) {
                    if (aVarArr.length > i18) {
                        i18++;
                        SampleToChunkBox.a aVar4 = aVarArr[i18];
                        a13 = z8.b.a(aVar4.c());
                        i19 = a13;
                        a12 = aVar4.a();
                    } else {
                        i19 = a13;
                        a13 = -1;
                        a12 = Long.MAX_VALUE;
                    }
                }
                i17 += i19;
                if (i17 > size) {
                    break;
                }
                i16 = i10;
            }
            this.M[i10] = Integer.MAX_VALUE;
            long j11 = 0;
            for (int i20 = 1; i20 <= this.Q.getSampleCount(); i20++) {
                while (i20 == this.M[i11]) {
                    i11++;
                    j11 = 0;
                }
                long[] jArr = this.O;
                int i21 = i11 - 1;
                int i22 = i20 - 1;
                jArr[i21] = jArr[i21] + this.Q.getSampleSizeAtIndex(i22);
                this.P[i21][i20 - this.M[i21]] = j11;
                j11 += this.Q.getSampleSizeAtIndex(i22);
            }
            return;
        }
        throw new RuntimeException("This MP4 does not contain track " + j10);
    }

    public f get(int i10) {
        long j10;
        if (i10 < this.Q.getSampleCount()) {
            int g10 = g(i10);
            int i11 = this.M[g10] - 1;
            long j11 = g10;
            long j12 = this.N[z8.b.a(j11)];
            long[] jArr = this.P[z8.b.a(j11)];
            long j13 = jArr[i10 - i11];
            ByteBuffer[] byteBufferArr = this.f21454c[z8.b.a(j11)];
            if (byteBufferArr == null) {
                ArrayList arrayList = new ArrayList();
                long j14 = 0;
                int i12 = 0;
                while (i12 < jArr.length) {
                    try {
                        j11 = j11;
                        if ((jArr[i12] + this.Q.getSampleSizeAtIndex(i12 + i11)) - j14 > 268435456) {
                            j10 = j13;
                            arrayList.add(this.f21452a.getByteBuffer(j12 + j14, jArr[i12] - j14));
                            j14 = jArr[i12];
                        } else {
                            j10 = j13;
                        }
                        i12++;
                        j13 = j10;
                    } catch (IOException e10) {
                        throw new IndexOutOfBoundsException(e10.getMessage());
                    }
                }
                arrayList.add(this.f21452a.getByteBuffer(j12 + j14, (-j14) + jArr[jArr.length - 1] + this.Q.getSampleSizeAtIndex((i11 + jArr.length) - 1)));
                byteBufferArr = (ByteBuffer[]) arrayList.toArray(new ByteBuffer[arrayList.size()]);
                this.f21454c[z8.b.a(j11)] = byteBufferArr;
            }
            long j15 = j13;
            ByteBuffer byteBuffer = null;
            int length = byteBufferArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                ByteBuffer byteBuffer2 = byteBufferArr[i13];
                if (j15 < byteBuffer2.limit()) {
                    byteBuffer = byteBuffer2;
                    break;
                }
                j15 -= byteBuffer2.limit();
                i13++;
            }
            return new C0197a(this.Q.getSampleSizeAtIndex(i10), byteBuffer, j15);
        }
        throw new IndexOutOfBoundsException();
    }

    public synchronized int g(int i10) {
        int i11 = i10 + 1;
        int[] iArr = this.M;
        int i12 = this.R;
        if (i11 >= iArr[i12] && i11 < iArr[i12 + 1]) {
            return i12;
        }
        if (i11 < iArr[i12]) {
            this.R = 0;
            while (true) {
                int[] iArr2 = this.M;
                int i13 = this.R;
                if (iArr2[i13 + 1] > i11) {
                    return i13;
                }
                this.R = i13 + 1;
            }
        } else {
            this.R = i12 + 1;
            while (true) {
                int[] iArr3 = this.M;
                int i14 = this.R;
                if (iArr3[i14 + 1] > i11) {
                    return i14;
                }
                this.R = i14 + 1;
            }
        }
    }

    @Override
    public int size() {
        return z8.b.a(this.f21453b.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }
}
