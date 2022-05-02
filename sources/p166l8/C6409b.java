package p166l8;

import p166l8.C6426j;

public final class C6409b {
    public final int f20070a;
    public final byte[] f20071b;

    public C6409b(int i, byte[] bArr) {
        this.f20070a = i;
        this.f20071b = bArr;
    }

    public static C6409b[] m20449b(byte[] bArr, C6426j jVar, EnumC6422f fVar) {
        if (bArr.length == jVar.m20418h()) {
            C6426j.C6428b f = jVar.m20420f(fVar);
            C6426j.C6427a[] a = f.m20413a();
            int i = 0;
            for (C6426j.C6427a aVar : a) {
                i += aVar.m20415a();
            }
            C6409b[] bVarArr = new C6409b[i];
            int i2 = 0;
            for (C6426j.C6427a aVar2 : a) {
                for (int i3 = 0; i3 < aVar2.m20415a(); i3++) {
                    int b = aVar2.m20414b();
                    i2++;
                    bVarArr[i2] = new C6409b(b, new byte[f.m20412b() + b]);
                }
            }
            int length = bVarArr[0].f20071b.length;
            int i4 = i - 1;
            while (i4 >= 0 && bVarArr[i4].f20071b.length != length) {
                i4--;
            }
            int i5 = i4 + 1;
            int b2 = length - f.m20412b();
            int i6 = 0;
            for (int i7 = 0; i7 < b2; i7++) {
                for (int i8 = 0; i8 < i2; i8++) {
                    i6++;
                    bVarArr[i8].f20071b[i7] = bArr[i6];
                }
            }
            for (int i9 = i5; i9 < i2; i9++) {
                i6++;
                bVarArr[i9].f20071b[b2] = bArr[i6];
            }
            int length2 = bVarArr[0].f20071b.length;
            while (b2 < length2) {
                int i10 = 0;
                while (i10 < i2) {
                    i6++;
                    bVarArr[i10].f20071b[i10 < i5 ? b2 : b2 + 1] = bArr[i6];
                    i10++;
                }
                b2++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    public byte[] m20450a() {
        return this.f20071b;
    }

    public int m20448c() {
        return this.f20070a;
    }
}
