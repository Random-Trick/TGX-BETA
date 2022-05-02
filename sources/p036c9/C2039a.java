package p036c9;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p235q8.C8279c;
import p249r8.C8381c;
import p249r8.C8382d;
import p258s2.C8630c;
import p258s2.C8632e;
import p258s2.C8634g;
import p315w8.C9992e;
import p315w8.C9996h;

public class C2039a {
    public int f7227a;
    public int f7228b;
    public int f7229c;
    public int f7230d;
    public int f7231e;
    public List<byte[]> f7232f;
    public List<byte[]> f7233g;
    public boolean f7234h;
    public int f7235i;
    public int f7236j;
    public int f7237k;
    public List<byte[]> f7238l;
    public int f7239m;
    public int f7240n;
    public int f7241o;
    public int f7242p;
    public int f7243q;

    public C2039a() {
        this.f7232f = new ArrayList();
        this.f7233g = new ArrayList();
        this.f7234h = true;
        this.f7235i = 1;
        this.f7236j = 0;
        this.f7237k = 0;
        this.f7238l = new ArrayList();
        this.f7239m = 63;
        this.f7240n = 7;
        this.f7241o = 31;
        this.f7242p = 31;
        this.f7243q = 31;
    }

    public void m35784a(ByteBuffer byteBuffer) {
        C8634g.m11850j(byteBuffer, this.f7227a);
        C8634g.m11850j(byteBuffer, this.f7228b);
        C8634g.m11850j(byteBuffer, this.f7229c);
        C8634g.m11850j(byteBuffer, this.f7230d);
        C8382d dVar = new C8382d(byteBuffer);
        dVar.m12629a(this.f7239m, 6);
        dVar.m12629a(this.f7231e, 2);
        dVar.m12629a(this.f7240n, 3);
        dVar.m12629a(this.f7233g.size(), 5);
        for (byte[] bArr : this.f7232f) {
            C8634g.m11855e(byteBuffer, bArr.length);
            byteBuffer.put(bArr);
        }
        C8634g.m11850j(byteBuffer, this.f7233g.size());
        for (byte[] bArr2 : this.f7233g) {
            C8634g.m11855e(byteBuffer, bArr2.length);
            byteBuffer.put(bArr2);
        }
        if (this.f7234h) {
            int i = this.f7228b;
            if (i == 100 || i == 110 || i == 122 || i == 144) {
                C8382d dVar2 = new C8382d(byteBuffer);
                dVar2.m12629a(this.f7241o, 6);
                dVar2.m12629a(this.f7235i, 2);
                dVar2.m12629a(this.f7242p, 5);
                dVar2.m12629a(this.f7236j, 3);
                dVar2.m12629a(this.f7243q, 5);
                dVar2.m12629a(this.f7237k, 3);
                for (byte[] bArr3 : this.f7238l) {
                    C8634g.m11855e(byteBuffer, bArr3.length);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    public long m35783b() {
        int i;
        long j = 6;
        for (byte[] bArr : this.f7232f) {
            j = j + 2 + bArr.length;
        }
        long j2 = j + 1;
        for (byte[] bArr2 : this.f7233g) {
            j2 = j2 + 2 + bArr2.length;
        }
        if (this.f7234h && ((i = this.f7228b) == 100 || i == 110 || i == 122 || i == 144)) {
            j2 += 4;
            for (byte[] bArr3 : this.f7238l) {
                j2 = j2 + 2 + bArr3.length;
            }
        }
        return j2;
    }

    public String[] m35782c() {
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f7233g) {
            try {
                arrayList.add(C9992e.m6304a(new ByteArrayInputStream(bArr, 1, bArr.length - 1)).toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public List<String> m35781d() {
        ArrayList arrayList = new ArrayList(this.f7233g.size());
        for (byte[] bArr : this.f7233g) {
            arrayList.add(C8630c.m11879b(bArr));
        }
        return arrayList;
    }

    public String[] m35780e() {
        String str;
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f7232f) {
            try {
                str = C9996h.m6301b(new C8279c(new ByteArrayInputStream(bArr, 1, bArr.length - 1))).toString();
            } catch (IOException unused) {
                str = "not parsable";
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public List<String> m35779f() {
        ArrayList arrayList = new ArrayList(this.f7238l.size());
        for (byte[] bArr : this.f7238l) {
            arrayList.add(C8630c.m11879b(bArr));
        }
        return arrayList;
    }

    public List<String> m35778g() {
        ArrayList arrayList = new ArrayList(this.f7232f.size());
        for (byte[] bArr : this.f7232f) {
            arrayList.add(C8630c.m11879b(bArr));
        }
        return arrayList;
    }

    public String toString() {
        return "AvcDecoderConfigurationRecord{configurationVersion=" + this.f7227a + ", avcProfileIndication=" + this.f7228b + ", profileCompatibility=" + this.f7229c + ", avcLevelIndication=" + this.f7230d + ", lengthSizeMinusOne=" + this.f7231e + ", hasExts=" + this.f7234h + ", chromaFormat=" + this.f7235i + ", bitDepthLumaMinus8=" + this.f7236j + ", bitDepthChromaMinus8=" + this.f7237k + ", lengthSizeMinusOnePaddingBits=" + this.f7239m + ", numberOfSequenceParameterSetsPaddingBits=" + this.f7240n + ", chromaFormatPaddingBits=" + this.f7241o + ", bitDepthLumaMinus8PaddingBits=" + this.f7242p + ", bitDepthChromaMinus8PaddingBits=" + this.f7243q + '}';
    }

    public C2039a(ByteBuffer byteBuffer) {
        int i;
        this.f7232f = new ArrayList();
        this.f7233g = new ArrayList();
        this.f7234h = true;
        this.f7235i = 1;
        this.f7236j = 0;
        this.f7237k = 0;
        this.f7238l = new ArrayList();
        this.f7239m = 63;
        this.f7240n = 7;
        this.f7241o = 31;
        this.f7242p = 31;
        this.f7243q = 31;
        this.f7227a = C8632e.m11861n(byteBuffer);
        this.f7228b = C8632e.m11861n(byteBuffer);
        this.f7229c = C8632e.m11861n(byteBuffer);
        this.f7230d = C8632e.m11861n(byteBuffer);
        C8381c cVar = new C8381c(byteBuffer);
        this.f7239m = cVar.m12632a(6);
        this.f7231e = cVar.m12632a(2);
        this.f7240n = cVar.m12632a(3);
        int a = cVar.m12632a(5);
        for (int i2 = 0; i2 < a; i2++) {
            byte[] bArr = new byte[C8632e.m11866i(byteBuffer)];
            byteBuffer.get(bArr);
            this.f7232f.add(bArr);
        }
        long n = C8632e.m11861n(byteBuffer);
        for (int i3 = 0; i3 < n; i3++) {
            byte[] bArr2 = new byte[C8632e.m11866i(byteBuffer)];
            byteBuffer.get(bArr2);
            this.f7233g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            this.f7234h = false;
        }
        if (!this.f7234h || !((i = this.f7228b) == 100 || i == 110 || i == 122 || i == 144)) {
            this.f7235i = -1;
            this.f7236j = -1;
            this.f7237k = -1;
            return;
        }
        C8381c cVar2 = new C8381c(byteBuffer);
        this.f7241o = cVar2.m12632a(6);
        this.f7235i = cVar2.m12632a(2);
        this.f7242p = cVar2.m12632a(5);
        this.f7236j = cVar2.m12632a(3);
        this.f7243q = cVar2.m12632a(5);
        this.f7237k = cVar2.m12632a(3);
        long n2 = C8632e.m11861n(byteBuffer);
        for (int i4 = 0; i4 < n2; i4++) {
            byte[] bArr3 = new byte[C8632e.m11866i(byteBuffer)];
            byteBuffer.get(bArr3);
            this.f7238l.add(bArr3);
        }
    }
}
