package p221p8;

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
import p191n8.AbstractC7306f;
import p269t2.AbstractC8951b;
import p345y8.C10447b;

public class C8063a extends AbstractList<AbstractC7306f> {
    public int[] f26255M;
    public long[] f26256N;
    public long[] f26257O;
    public long[][] f26258P;
    public SampleSizeBox f26259Q;
    public int f26260R = 0;
    public AbstractC8951b f26261a;
    public TrackBox f26262b;
    public ByteBuffer[][] f26263c;

    public class C8064a implements AbstractC7306f {
        public final long f26265b;
        public final ByteBuffer f26266c;
        public final long f26267d;

        public C8064a(long j, ByteBuffer byteBuffer, long j2) {
            this.f26265b = j;
            this.f26266c = byteBuffer;
            this.f26267d = j2;
        }

        @Override
        public void mo13642a(WritableByteChannel writableByteChannel) {
            writableByteChannel.write(m13646b());
        }

        public ByteBuffer m13646b() {
            return (ByteBuffer) ((ByteBuffer) this.f26266c.position(C10447b.m5103a(this.f26267d))).slice().limit(C10447b.m5103a(this.f26265b));
        }

        @Override
        public long getSize() {
            return this.f26265b;
        }

        public String toString() {
            return "DefaultMp4Sample(size:" + this.f26265b + ")";
        }
    }

    public C8063a(long j, AbstractC8951b bVar) {
        int i;
        this.f26262b = null;
        this.f26263c = null;
        int i2 = 0;
        this.f26261a = bVar;
        for (TrackBox trackBox : ((MovieBox) bVar.getBoxes(MovieBox.class).get(0)).getBoxes(TrackBox.class)) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j) {
                this.f26262b = trackBox;
            }
        }
        TrackBox trackBox2 = this.f26262b;
        if (trackBox2 != null) {
            long[] chunkOffsets = trackBox2.getSampleTableBox().getChunkOffsetBox().getChunkOffsets();
            this.f26256N = chunkOffsets;
            this.f26257O = new long[chunkOffsets.length];
            this.f26263c = new ByteBuffer[chunkOffsets.length];
            this.f26258P = new long[chunkOffsets.length];
            this.f26259Q = this.f26262b.getSampleTableBox().getSampleSizeBox();
            List<SampleToChunkBox.C3426a> entries = this.f26262b.getSampleTableBox().getSampleToChunkBox().getEntries();
            SampleToChunkBox.C3426a[] aVarArr = (SampleToChunkBox.C3426a[]) entries.toArray(new SampleToChunkBox.C3426a[entries.size()]);
            SampleToChunkBox.C3426a aVar = aVarArr[0];
            long a = aVar.m30615a();
            int a2 = C10447b.m5103a(aVar.m30613c());
            int size = size();
            int i3 = 0;
            int i4 = 1;
            int i5 = 0;
            int i6 = 1;
            do {
                i3++;
                if (i3 == a) {
                    if (aVarArr.length > i4) {
                        i4++;
                        SampleToChunkBox.C3426a aVar2 = aVarArr[i4];
                        a2 = C10447b.m5103a(aVar2.m30613c());
                        i5 = a2;
                        a = aVar2.m30615a();
                    } else {
                        i5 = a2;
                        a2 = -1;
                        a = Long.MAX_VALUE;
                    }
                }
                this.f26258P[i3 - 1] = new long[i5];
                i6 += i5;
            } while (i6 <= size);
            this.f26255M = new int[i3 + 1];
            SampleToChunkBox.C3426a aVar3 = aVarArr[0];
            long a3 = aVar3.m30615a();
            int a4 = C10447b.m5103a(aVar3.m30613c());
            int i7 = 0;
            int i8 = 1;
            int i9 = 1;
            int i10 = 0;
            while (true) {
                i = i7 + 1;
                this.f26255M[i7] = i8;
                if (i == a3) {
                    if (aVarArr.length > i9) {
                        i9++;
                        SampleToChunkBox.C3426a aVar4 = aVarArr[i9];
                        a4 = C10447b.m5103a(aVar4.m30613c());
                        i10 = a4;
                        a3 = aVar4.m30615a();
                    } else {
                        i10 = a4;
                        a4 = -1;
                        a3 = Long.MAX_VALUE;
                    }
                }
                i8 += i10;
                if (i8 > size) {
                    break;
                }
                i7 = i;
            }
            this.f26255M[i] = Integer.MAX_VALUE;
            long j2 = 0;
            for (int i11 = 1; i11 <= this.f26259Q.getSampleCount(); i11++) {
                while (i11 == this.f26255M[i2]) {
                    i2++;
                    j2 = 0;
                }
                long[] jArr = this.f26257O;
                int i12 = i2 - 1;
                int i13 = i11 - 1;
                jArr[i12] = jArr[i12] + this.f26259Q.getSampleSizeAtIndex(i13);
                this.f26258P[i12][i11 - this.f26255M[i12]] = j2;
                j2 += this.f26259Q.getSampleSizeAtIndex(i13);
            }
            return;
        }
        throw new RuntimeException("This MP4 does not contain track " + j);
    }

    public AbstractC7306f get(int i) {
        long j;
        if (i < this.f26259Q.getSampleCount()) {
            int i2 = m13647i(i);
            int i3 = this.f26255M[i2] - 1;
            long j2 = i2;
            long j3 = this.f26256N[C10447b.m5103a(j2)];
            long[] jArr = this.f26258P[C10447b.m5103a(j2)];
            long j4 = jArr[i - i3];
            ByteBuffer[] byteBufferArr = this.f26263c[C10447b.m5103a(j2)];
            if (byteBufferArr == null) {
                ArrayList arrayList = new ArrayList();
                long j5 = 0;
                int i4 = 0;
                while (i4 < jArr.length) {
                    try {
                        j2 = j2;
                        if ((jArr[i4] + this.f26259Q.getSampleSizeAtIndex(i4 + i3)) - j5 > 268435456) {
                            j = j4;
                            arrayList.add(this.f26261a.getByteBuffer(j3 + j5, jArr[i4] - j5));
                            j5 = jArr[i4];
                        } else {
                            j = j4;
                        }
                        i4++;
                        j4 = j;
                    } catch (IOException e) {
                        throw new IndexOutOfBoundsException(e.getMessage());
                    }
                }
                arrayList.add(this.f26261a.getByteBuffer(j3 + j5, (-j5) + jArr[jArr.length - 1] + this.f26259Q.getSampleSizeAtIndex((i3 + jArr.length) - 1)));
                byteBufferArr = (ByteBuffer[]) arrayList.toArray(new ByteBuffer[arrayList.size()]);
                this.f26263c[C10447b.m5103a(j2)] = byteBufferArr;
            }
            long j6 = j4;
            ByteBuffer byteBuffer = null;
            int length = byteBufferArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                ByteBuffer byteBuffer2 = byteBufferArr[i5];
                if (j6 < byteBuffer2.limit()) {
                    byteBuffer = byteBuffer2;
                    break;
                }
                j6 -= byteBuffer2.limit();
                i5++;
            }
            return new C8064a(this.f26259Q.getSampleSizeAtIndex(i), byteBuffer, j6);
        }
        throw new IndexOutOfBoundsException();
    }

    public synchronized int m13647i(int i) {
        int i2 = i + 1;
        int[] iArr = this.f26255M;
        int i3 = this.f26260R;
        if (i2 >= iArr[i3] && i2 < iArr[i3 + 1]) {
            return i3;
        }
        if (i2 < iArr[i3]) {
            this.f26260R = 0;
            while (true) {
                int[] iArr2 = this.f26255M;
                int i4 = this.f26260R;
                if (iArr2[i4 + 1] > i2) {
                    return i4;
                }
                this.f26260R = i4 + 1;
            }
        } else {
            this.f26260R = i3 + 1;
            while (true) {
                int[] iArr3 = this.f26255M;
                int i5 = this.f26260R;
                if (iArr3[i5 + 1] > i2) {
                    return i5;
                }
                this.f26260R = i5 + 1;
            }
        }
    }

    @Override
    public int size() {
        return C10447b.m5103a(this.f26262b.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }
}
