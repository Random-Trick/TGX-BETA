package p095gc;

import java.security.MessageDigest;
import p109hc.C5074c;
import p123ia.C5294h;
import qa.C8298k;

public final class C4571x extends C4552h {
    public final transient byte[][] f15016O;
    public final transient int[] f15017P;

    public C4571x(byte[][] bArr, int[] iArr) {
        super(C4552h.f14972M.m27413e());
        C8298k.m12933e(bArr, "segments");
        C8298k.m12933e(iArr, "directory");
        this.f15016O = bArr;
        this.f15017P = iArr;
    }

    @Override
    public String mo27317a() {
        return m27304z().mo27317a();
    }

    @Override
    public C4552h mo27316c(String str) {
        C8298k.m12933e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = m27306x().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = m27307w()[length + i];
            int i4 = m27307w()[i];
            messageDigest.update(m27306x()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        C8298k.m12934d(digest, "digest.digest()");
        return new C4552h(digest);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4552h) {
            C4552h hVar = (C4552h) obj;
            if (hVar.m27406r() == m27406r() && mo27311l(0, hVar, 0, m27406r())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int mo27315g() {
        return m27307w()[m27306x().length - 1];
    }

    @Override
    public int hashCode() {
        int f = m27412f();
        if (f != 0) {
            return f;
        }
        int length = m27306x().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = m27307w()[length + i];
            int i5 = m27307w()[i];
            byte[] bArr = m27306x()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        m27410n(i2);
        return i2;
    }

    @Override
    public String mo27314i() {
        return m27304z().mo27314i();
    }

    @Override
    public byte[] mo27313j() {
        return m27305y();
    }

    @Override
    public byte mo27312k(int i) {
        C4542c.m27477b(m27307w()[m27306x().length - 1], i, 1L);
        int b = C5074c.m24034b(this, i);
        return m27306x()[b][(i - (b == 0 ? 0 : m27307w()[b - 1])) + m27307w()[m27306x().length + b]];
    }

    @Override
    public boolean mo27311l(int i, C4552h hVar, int i2, int i3) {
        C8298k.m12933e(hVar, "other");
        if (i < 0 || i > m27406r() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int b = C5074c.m24034b(this, i);
        while (i < i4) {
            int i5 = b == 0 ? 0 : m27307w()[b - 1];
            int i6 = m27307w()[m27306x().length + b];
            int min = Math.min(i4, (m27307w()[b] - i5) + i5) - i;
            if (!hVar.mo27310m(i2, m27306x()[b], i6 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    @Override
    public boolean mo27310m(int i, byte[] bArr, int i2, int i3) {
        C8298k.m12933e(bArr, "other");
        if (i < 0 || i > m27406r() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int b = C5074c.m24034b(this, i);
        while (i < i4) {
            int i5 = b == 0 ? 0 : m27307w()[b - 1];
            int i6 = m27307w()[m27306x().length + b];
            int min = Math.min(i4, (m27307w()[b] - i5) + i5) - i;
            if (!C4542c.m27478a(m27306x()[b], i6 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    @Override
    public C4552h mo27309t() {
        return m27304z().mo27309t();
    }

    @Override
    public String toString() {
        return m27304z().toString();
    }

    @Override
    public void mo27308v(C4549e eVar, int i, int i2) {
        C8298k.m12933e(eVar, "buffer");
        int i3 = i2 + i;
        int b = C5074c.m24034b(this, i);
        while (i < i3) {
            int i4 = b == 0 ? 0 : m27307w()[b - 1];
            int i5 = m27307w()[m27306x().length + b];
            int min = Math.min(i3, (m27307w()[b] - i4) + i4) - i;
            int i6 = i5 + (i - i4);
            C4568v vVar = new C4568v(m27306x()[b], i6, i6 + min, true, false);
            C4568v vVar2 = eVar.f14970a;
            if (vVar2 == null) {
                vVar.f15010g = vVar;
                vVar.f15009f = vVar;
                eVar.f14970a = vVar;
            } else {
                C8298k.m12935c(vVar2);
                C4568v vVar3 = vVar2.f15010g;
                C8298k.m12935c(vVar3);
                vVar3.m27324c(vVar);
            }
            i += min;
            b++;
        }
        eVar.m27433Q0(eVar.size() + m27406r());
    }

    public final int[] m27307w() {
        return this.f15017P;
    }

    public final byte[][] m27306x() {
        return this.f15016O;
    }

    public byte[] m27305y() {
        byte[] bArr = new byte[m27406r()];
        int length = m27306x().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = m27307w()[length + i];
            int i5 = m27307w()[i];
            int i6 = i5 - i2;
            C5294h.m23433d(m27306x()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final C4552h m27304z() {
        return new C4552h(m27305y());
    }
}
