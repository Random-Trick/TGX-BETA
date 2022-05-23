package z;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import org.thunderdog.challegram.Log;
import z.g;

public final class h extends FilterOutputStream {
    public static final byte[] P = "Exif\u0000\u0000".getBytes(f.f26721e);
    public int N;
    public int O;
    public final g f26755a;
    public final byte[] f26756b = new byte[1];
    public final ByteBuffer f26757c = ByteBuffer.allocate(4);
    public int M = 0;

    public static final class a {
        public static boolean a(short s10) {
            return (s10 < -64 || s10 > -49 || s10 == -60 || s10 == -56 || s10 == -52) ? false : true;
        }
    }

    public h(OutputStream outputStream, g gVar) {
        super(new BufferedOutputStream(outputStream, Log.TAG_COMPRESS));
        this.f26755a = gVar;
    }

    public final int m(int i10, byte[] bArr, int i11, int i12) {
        int min = Math.min(i12, i10 - this.f26757c.position());
        this.f26757c.put(bArr, i11, min);
        return min;
    }

    public final void s(z.a aVar) {
        i[] iVarArr;
        i[][] iVarArr2 = g.f26735i;
        int[] iArr = new int[iVarArr2.length];
        int[] iArr2 = new int[iVarArr2.length];
        for (i iVar : g.f26733g) {
            for (int i10 = 0; i10 < g.f26735i.length; i10++) {
                this.f26755a.b(i10).remove(iVar.f26759b);
            }
        }
        if (!this.f26755a.b(1).isEmpty()) {
            this.f26755a.b(0).put(g.f26733g[1].f26759b, f.f(0L, this.f26755a.c()));
        }
        if (!this.f26755a.b(2).isEmpty()) {
            this.f26755a.b(0).put(g.f26733g[2].f26759b, f.f(0L, this.f26755a.c()));
        }
        if (!this.f26755a.b(3).isEmpty()) {
            this.f26755a.b(1).put(g.f26733g[3].f26759b, f.f(0L, this.f26755a.c()));
        }
        for (int i11 = 0; i11 < g.f26735i.length; i11++) {
            int i12 = 0;
            for (Map.Entry<String, f> entry : this.f26755a.b(i11).entrySet()) {
                int j10 = entry.getValue().j();
                if (j10 > 4) {
                    i12 += j10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < g.f26735i.length; i14++) {
            if (!this.f26755a.b(i14).isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f26755a.b(i14).size() * 12) + 2 + 4 + iArr2[i14];
            }
        }
        int i15 = i13 + 8;
        if (!this.f26755a.b(1).isEmpty()) {
            this.f26755a.b(0).put(g.f26733g[1].f26759b, f.f(iArr[1], this.f26755a.c()));
        }
        if (!this.f26755a.b(2).isEmpty()) {
            this.f26755a.b(0).put(g.f26733g[2].f26759b, f.f(iArr[2], this.f26755a.c()));
        }
        if (!this.f26755a.b(3).isEmpty()) {
            this.f26755a.b(1).put(g.f26733g[3].f26759b, f.f(iArr[3], this.f26755a.c()));
        }
        aVar.B0(i15);
        aVar.write(P);
        aVar.z0(this.f26755a.c() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        aVar.m(this.f26755a.c());
        aVar.B0(42);
        aVar.A0(8L);
        for (int i16 = 0; i16 < g.f26735i.length; i16++) {
            if (!this.f26755a.b(i16).isEmpty()) {
                aVar.B0(this.f26755a.b(i16).size());
                int size = iArr[i16] + 2 + (this.f26755a.b(i16).size() * 12) + 4;
                for (Map.Entry<String, f> entry2 : this.f26755a.b(i16).entrySet()) {
                    int i17 = ((i) b1.h.f(g.b.f26744f.get(i16).get(entry2.getKey()), "Tag not supported: " + entry2.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f26758a;
                    f value = entry2.getValue();
                    int j11 = value.j();
                    aVar.B0(i17);
                    aVar.B0(value.f26725a);
                    aVar.y0(value.f26726b);
                    if (j11 > 4) {
                        aVar.A0(size);
                        size += j11;
                    } else {
                        aVar.write(value.f26728d);
                        if (j11 < 4) {
                            while (j11 < 4) {
                                aVar.s(0);
                                j11++;
                            }
                        }
                    }
                }
                aVar.A0(0L);
                for (Map.Entry<String, f> entry3 : this.f26755a.b(i16).entrySet()) {
                    byte[] bArr = entry3.getValue().f26728d;
                    if (bArr.length > 4) {
                        aVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        aVar.m(ByteOrder.BIG_ENDIAN);
    }

    @Override
    public void write(byte[] r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: z.h.write(byte[], int, int):void");
    }

    @Override
    public void write(int i10) {
        byte[] bArr = this.f26756b;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
