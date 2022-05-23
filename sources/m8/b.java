package m8;

import m8.j;

public final class b {
    public final int f17305a;
    public final byte[] f17306b;

    public b(int i10, byte[] bArr) {
        this.f17305a = i10;
        this.f17306b = bArr;
    }

    public static b[] b(byte[] bArr, j jVar, f fVar) {
        if (bArr.length == jVar.h()) {
            j.b f10 = jVar.f(fVar);
            j.a[] a10 = f10.a();
            int i10 = 0;
            for (j.a aVar : a10) {
                i10 += aVar.a();
            }
            b[] bVarArr = new b[i10];
            int i11 = 0;
            for (j.a aVar2 : a10) {
                for (int i12 = 0; i12 < aVar2.a(); i12++) {
                    int b10 = aVar2.b();
                    i11++;
                    bVarArr[i11] = new b(b10, new byte[f10.b() + b10]);
                }
            }
            int length = bVarArr[0].f17306b.length;
            int i13 = i10 - 1;
            while (i13 >= 0 && bVarArr[i13].f17306b.length != length) {
                i13--;
            }
            int i14 = i13 + 1;
            int b11 = length - f10.b();
            int i15 = 0;
            for (int i16 = 0; i16 < b11; i16++) {
                for (int i17 = 0; i17 < i11; i17++) {
                    i15++;
                    bVarArr[i17].f17306b[i16] = bArr[i15];
                }
            }
            for (int i18 = i14; i18 < i11; i18++) {
                i15++;
                bVarArr[i18].f17306b[b11] = bArr[i15];
            }
            int length2 = bVarArr[0].f17306b.length;
            while (b11 < length2) {
                int i19 = 0;
                while (i19 < i11) {
                    i15++;
                    bVarArr[i19].f17306b[i19 < i14 ? b11 : b11 + 1] = bArr[i15];
                    i19++;
                }
                b11++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    public byte[] a() {
        return this.f17306b;
    }

    public int c() {
        return this.f17305a;
    }
}
