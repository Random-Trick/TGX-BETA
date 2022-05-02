package p187n4;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p006a5.AbstractC0150i0;
import p006a5.AbstractC0154k;
import p006a5.C0159o;
import p020b5.C1186a;
import p020b5.C1189b0;

public final class C7198k implements AbstractC0154k {
    public final AbstractC0154k f22908a;
    public final int f22909b;
    public final AbstractC7199a f22910c;
    public final byte[] f22911d;
    public int f22912e;

    public interface AbstractC7199a {
        void mo17396a(C1189b0 b0Var);
    }

    public C7198k(AbstractC0154k kVar, int i, AbstractC7199a aVar) {
        C1186a.m38192a(i > 0);
        this.f22908a = kVar;
        this.f22909b = i;
        this.f22910c = aVar;
        this.f22911d = new byte[1];
        this.f22912e = i;
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        if (this.f22912e == 0) {
            if (!m17397s()) {
                return -1;
            }
            this.f22912e = this.f22909b;
        }
        int b = this.f22908a.mo4414b(bArr, i, Math.min(this.f22912e, i2));
        if (b != -1) {
            this.f22912e -= b;
        }
        return b;
    }

    @Override
    public long mo4413c(C0159o oVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void mo17399g(AbstractC0150i0 i0Var) {
        C1186a.m38188e(i0Var);
        this.f22908a.mo17399g(i0Var);
    }

    @Override
    public Map<String, List<String>> mo17398l() {
        return this.f22908a.mo17398l();
    }

    @Override
    public Uri mo4412p() {
        return this.f22908a.mo4412p();
    }

    public final boolean m17397s() {
        if (this.f22908a.mo4414b(this.f22911d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f22911d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int b = this.f22908a.mo4414b(bArr, i3, i2);
            if (b == -1) {
                return false;
            }
            i3 += b;
            i2 -= b;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f22910c.mo17396a(new C1189b0(bArr, i));
        }
        return true;
    }
}
