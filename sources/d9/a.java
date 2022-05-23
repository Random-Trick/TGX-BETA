package d9;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import s2.c;
import s2.g;
import s8.d;
import x8.e;
import x8.h;

public class a {
    public int f7234a;
    public int f7235b;
    public int f7236c;
    public int f7237d;
    public int f7238e;
    public List<byte[]> f7239f;
    public List<byte[]> f7240g;
    public boolean f7241h;
    public int f7242i;
    public int f7243j;
    public int f7244k;
    public List<byte[]> f7245l;
    public int f7246m;
    public int f7247n;
    public int f7248o;
    public int f7249p;
    public int f7250q;

    public a() {
        this.f7239f = new ArrayList();
        this.f7240g = new ArrayList();
        this.f7241h = true;
        this.f7242i = 1;
        this.f7243j = 0;
        this.f7244k = 0;
        this.f7245l = new ArrayList();
        this.f7246m = 63;
        this.f7247n = 7;
        this.f7248o = 31;
        this.f7249p = 31;
        this.f7250q = 31;
    }

    public void a(ByteBuffer byteBuffer) {
        g.j(byteBuffer, this.f7234a);
        g.j(byteBuffer, this.f7235b);
        g.j(byteBuffer, this.f7236c);
        g.j(byteBuffer, this.f7237d);
        d dVar = new d(byteBuffer);
        dVar.a(this.f7246m, 6);
        dVar.a(this.f7238e, 2);
        dVar.a(this.f7247n, 3);
        dVar.a(this.f7240g.size(), 5);
        for (byte[] bArr : this.f7239f) {
            g.e(byteBuffer, bArr.length);
            byteBuffer.put(bArr);
        }
        g.j(byteBuffer, this.f7240g.size());
        for (byte[] bArr2 : this.f7240g) {
            g.e(byteBuffer, bArr2.length);
            byteBuffer.put(bArr2);
        }
        if (this.f7241h) {
            int i10 = this.f7235b;
            if (i10 == 100 || i10 == 110 || i10 == 122 || i10 == 144) {
                d dVar2 = new d(byteBuffer);
                dVar2.a(this.f7248o, 6);
                dVar2.a(this.f7242i, 2);
                dVar2.a(this.f7249p, 5);
                dVar2.a(this.f7243j, 3);
                dVar2.a(this.f7250q, 5);
                dVar2.a(this.f7244k, 3);
                for (byte[] bArr3 : this.f7245l) {
                    g.e(byteBuffer, bArr3.length);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    public long b() {
        int i10;
        long j10 = 6;
        for (byte[] bArr : this.f7239f) {
            j10 = j10 + 2 + bArr.length;
        }
        long j11 = j10 + 1;
        for (byte[] bArr2 : this.f7240g) {
            j11 = j11 + 2 + bArr2.length;
        }
        if (this.f7241h && ((i10 = this.f7235b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            j11 += 4;
            for (byte[] bArr3 : this.f7245l) {
                j11 = j11 + 2 + bArr3.length;
            }
        }
        return j11;
    }

    public String[] c() {
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f7240g) {
            try {
                arrayList.add(e.a(new ByteArrayInputStream(bArr, 1, bArr.length - 1)).toString());
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public List<String> d() {
        ArrayList arrayList = new ArrayList(this.f7240g.size());
        for (byte[] bArr : this.f7240g) {
            arrayList.add(c.b(bArr));
        }
        return arrayList;
    }

    public String[] e() {
        String str;
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f7239f) {
            try {
                str = h.b(new r8.c(new ByteArrayInputStream(bArr, 1, bArr.length - 1))).toString();
            } catch (IOException unused) {
                str = "not parsable";
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public List<String> f() {
        ArrayList arrayList = new ArrayList(this.f7245l.size());
        for (byte[] bArr : this.f7245l) {
            arrayList.add(c.b(bArr));
        }
        return arrayList;
    }

    public List<String> g() {
        ArrayList arrayList = new ArrayList(this.f7239f.size());
        for (byte[] bArr : this.f7239f) {
            arrayList.add(c.b(bArr));
        }
        return arrayList;
    }

    public String toString() {
        return "AvcDecoderConfigurationRecord{configurationVersion=" + this.f7234a + ", avcProfileIndication=" + this.f7235b + ", profileCompatibility=" + this.f7236c + ", avcLevelIndication=" + this.f7237d + ", lengthSizeMinusOne=" + this.f7238e + ", hasExts=" + this.f7241h + ", chromaFormat=" + this.f7242i + ", bitDepthLumaMinus8=" + this.f7243j + ", bitDepthChromaMinus8=" + this.f7244k + ", lengthSizeMinusOnePaddingBits=" + this.f7246m + ", numberOfSequenceParameterSetsPaddingBits=" + this.f7247n + ", chromaFormatPaddingBits=" + this.f7248o + ", bitDepthLumaMinus8PaddingBits=" + this.f7249p + ", bitDepthChromaMinus8PaddingBits=" + this.f7250q + '}';
    }

    public a(ByteBuffer byteBuffer) {
        int i10;
        this.f7239f = new ArrayList();
        this.f7240g = new ArrayList();
        this.f7241h = true;
        this.f7242i = 1;
        this.f7243j = 0;
        this.f7244k = 0;
        this.f7245l = new ArrayList();
        this.f7246m = 63;
        this.f7247n = 7;
        this.f7248o = 31;
        this.f7249p = 31;
        this.f7250q = 31;
        this.f7234a = s2.e.n(byteBuffer);
        this.f7235b = s2.e.n(byteBuffer);
        this.f7236c = s2.e.n(byteBuffer);
        this.f7237d = s2.e.n(byteBuffer);
        s8.c cVar = new s8.c(byteBuffer);
        this.f7246m = cVar.a(6);
        this.f7238e = cVar.a(2);
        this.f7247n = cVar.a(3);
        int a10 = cVar.a(5);
        for (int i11 = 0; i11 < a10; i11++) {
            byte[] bArr = new byte[s2.e.i(byteBuffer)];
            byteBuffer.get(bArr);
            this.f7239f.add(bArr);
        }
        long n10 = s2.e.n(byteBuffer);
        for (int i12 = 0; i12 < n10; i12++) {
            byte[] bArr2 = new byte[s2.e.i(byteBuffer)];
            byteBuffer.get(bArr2);
            this.f7240g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            this.f7241h = false;
        }
        if (!this.f7241h || !((i10 = this.f7235b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            this.f7242i = -1;
            this.f7243j = -1;
            this.f7244k = -1;
            return;
        }
        s8.c cVar2 = new s8.c(byteBuffer);
        this.f7248o = cVar2.a(6);
        this.f7242i = cVar2.a(2);
        this.f7249p = cVar2.a(5);
        this.f7243j = cVar2.a(3);
        this.f7250q = cVar2.a(5);
        this.f7244k = cVar2.a(3);
        long n11 = s2.e.n(byteBuffer);
        for (int i13 = 0; i13 < n11; i13++) {
            byte[] bArr3 = new byte[s2.e.i(byteBuffer)];
            byteBuffer.get(bArr3);
            this.f7245l.add(bArr3);
        }
    }
}
