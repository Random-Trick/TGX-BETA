package p351z;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import org.thunderdog.challegram.Log;
import p016b1.C1132h;
import p351z.C11190g;

public final class C11197h extends FilterOutputStream {
    public static final byte[] f35877P = "Exif\u0000\u0000".getBytes(C11189f.f35843e);
    public int f35879N;
    public int f35880O;
    public final C11190g f35881a;
    public final byte[] f35882b = new byte[1];
    public final ByteBuffer f35883c = ByteBuffer.allocate(4);
    public int f35878M = 0;

    public static final class C11198a {
        public static boolean m1240a(short s) {
            return (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) ? false : true;
        }
    }

    public C11197h(OutputStream outputStream, C11190g gVar) {
        super(new BufferedOutputStream(outputStream, Log.TAG_COMPRESS));
        this.f35881a = gVar;
    }

    public final int m1242m(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, i - this.f35883c.position());
        this.f35883c.put(bArr, i2, min);
        return min;
    }

    public final void m1241t(C11178a aVar) {
        C11199i[] iVarArr;
        C11199i[][] iVarArr2 = C11190g.f35857i;
        int[] iArr = new int[iVarArr2.length];
        int[] iArr2 = new int[iVarArr2.length];
        for (C11199i iVar : C11190g.f35855g) {
            for (int i = 0; i < C11190g.f35857i.length; i++) {
                this.f35881a.m1261b(i).remove(iVar.f35885b);
            }
        }
        if (!this.f35881a.m1261b(1).isEmpty()) {
            this.f35881a.m1261b(0).put(C11190g.f35855g[1].f35885b, C11189f.m1267f(0L, this.f35881a.m1260c()));
        }
        if (!this.f35881a.m1261b(2).isEmpty()) {
            this.f35881a.m1261b(0).put(C11190g.f35855g[2].f35885b, C11189f.m1267f(0L, this.f35881a.m1260c()));
        }
        if (!this.f35881a.m1261b(3).isEmpty()) {
            this.f35881a.m1261b(1).put(C11190g.f35855g[3].f35885b, C11189f.m1267f(0L, this.f35881a.m1260c()));
        }
        for (int i2 = 0; i2 < C11190g.f35857i.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C11189f> entry : this.f35881a.m1261b(i2).entrySet()) {
                int j = entry.getValue().m1263j();
                if (j > 4) {
                    i3 += j;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < C11190g.f35857i.length; i5++) {
            if (!this.f35881a.m1261b(i5).isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f35881a.m1261b(i5).size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        int i6 = i4 + 8;
        if (!this.f35881a.m1261b(1).isEmpty()) {
            this.f35881a.m1261b(0).put(C11190g.f35855g[1].f35885b, C11189f.m1267f(iArr[1], this.f35881a.m1260c()));
        }
        if (!this.f35881a.m1261b(2).isEmpty()) {
            this.f35881a.m1261b(0).put(C11190g.f35855g[2].f35885b, C11189f.m1267f(iArr[2], this.f35881a.m1260c()));
        }
        if (!this.f35881a.m1261b(3).isEmpty()) {
            this.f35881a.m1261b(1).put(C11190g.f35855g[3].f35885b, C11189f.m1267f(iArr[3], this.f35881a.m1260c()));
        }
        aVar.m1319B0(i6);
        aVar.write(f35877P);
        aVar.m1315z0(this.f35881a.m1260c() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        aVar.m1318m(this.f35881a.m1260c());
        aVar.m1319B0(42);
        aVar.m1320A0(8L);
        for (int i7 = 0; i7 < C11190g.f35857i.length; i7++) {
            if (!this.f35881a.m1261b(i7).isEmpty()) {
                aVar.m1319B0(this.f35881a.m1261b(i7).size());
                int size = iArr[i7] + 2 + (this.f35881a.m1261b(i7).size() * 12) + 4;
                for (Map.Entry<String, C11189f> entry2 : this.f35881a.m1261b(i7).entrySet()) {
                    int i8 = ((C11199i) C1132h.m38321f(C11190g.C11192b.f35866f.get(i7).get(entry2.getKey()), "Tag not supported: " + entry2.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f35884a;
                    C11189f value = entry2.getValue();
                    int j2 = value.m1263j();
                    aVar.m1319B0(i8);
                    aVar.m1319B0(value.f35847a);
                    aVar.m1316y0(value.f35848b);
                    if (j2 > 4) {
                        aVar.m1320A0(size);
                        size += j2;
                    } else {
                        aVar.write(value.f35850d);
                        if (j2 < 4) {
                            while (j2 < 4) {
                                aVar.m1317t(0);
                                j2++;
                            }
                        }
                    }
                }
                aVar.m1320A0(0L);
                for (Map.Entry<String, C11189f> entry3 : this.f35881a.m1261b(i7).entrySet()) {
                    byte[] bArr = entry3.getValue().f35850d;
                    if (bArr.length > 4) {
                        aVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        aVar.m1318m(ByteOrder.BIG_ENDIAN);
    }

    @Override
    public void write(byte[] r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: p351z.C11197h.write(byte[], int, int):void");
    }

    @Override
    public void write(int i) {
        byte[] bArr = this.f35882b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
