package p326x4;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p217p4.AbstractC8039e;
import p217p4.AbstractC8041f;
import p217p4.C8032b;
import p217p4.C8043h;
import p343y6.C10428d;

public final class C10095a extends AbstractC8039e {
    public final C1189b0 f32786o = new C1189b0();
    public final boolean f32787p;
    public final int f32788q;
    public final int f32789r;
    public final String f32790s;
    public final float f32791t;
    public final int f32792u;

    public C10095a(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = true;
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f32788q = bArr[24];
            this.f32789r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f32790s = "Serif".equals(C1216l0.m38019B(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.f32792u = i;
            z = (bArr[0] & 32) == 0 ? false : z;
            this.f32787p = z;
            if (z) {
                this.f32791t = C1216l0.m37958o(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
            } else {
                this.f32791t = 0.85f;
            }
        } else {
            this.f32788q = 0;
            this.f32789r = -1;
            this.f32790s = str;
            this.f32787p = false;
            this.f32791t = 0.85f;
            this.f32792u = -1;
        }
    }

    public static void m6031E(boolean z) {
        if (!z) {
            throw new C8043h("Unexpected subtitle format.");
        }
    }

    public static void m6030F(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void m6029G(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    public static void m6028H(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    public static String m6027I(C1189b0 b0Var) {
        char g;
        m6031E(b0Var.m38142a() >= 2);
        int J = b0Var.m38150J();
        if (J == 0) {
            return "";
        }
        if (b0Var.m38142a() < 2 || ((g = b0Var.m38136g()) != 65279 && g != 65534)) {
            return b0Var.m38158B(J, C10428d.f33498c);
        }
        return b0Var.m38158B(J, C10428d.f33501f);
    }

    @Override
    public AbstractC8041f mo5207B(byte[] bArr, int i, boolean z) {
        this.f32786o.m38146N(bArr, i);
        String I = m6027I(this.f32786o);
        if (I.isEmpty()) {
            return C10096b.f32793b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(I);
        m6029G(spannableStringBuilder, this.f32788q, 0, 0, spannableStringBuilder.length(), 16711680);
        m6030F(spannableStringBuilder, this.f32789r, -1, 0, spannableStringBuilder.length(), 16711680);
        m6028H(spannableStringBuilder, this.f32790s, 0, spannableStringBuilder.length());
        float f = this.f32791t;
        while (this.f32786o.m38142a() >= 8) {
            int e = this.f32786o.m38138e();
            int n = this.f32786o.m38129n();
            int n2 = this.f32786o.m38129n();
            boolean z2 = true;
            if (n2 == 1937013100) {
                if (this.f32786o.m38142a() < 2) {
                    z2 = false;
                }
                m6031E(z2);
                int J = this.f32786o.m38150J();
                for (int i2 = 0; i2 < J; i2++) {
                    m6032D(this.f32786o, spannableStringBuilder);
                }
            } else if (n2 == 1952608120 && this.f32787p) {
                if (this.f32786o.m38142a() < 2) {
                    z2 = false;
                }
                m6031E(z2);
                f = C1216l0.m37958o(this.f32786o.m38150J() / this.f32792u, 0.0f, 0.95f);
            }
            this.f32786o.m38144P(e + n);
        }
        return new C10096b(new C8032b.C8034b().m13743o(spannableStringBuilder).m13750h(f, 0).m13749i(0).m13757a());
    }

    public final void m6032D(C1189b0 b0Var, SpannableStringBuilder spannableStringBuilder) {
        int i;
        m6031E(b0Var.m38142a() >= 12);
        int J = b0Var.m38150J();
        int J2 = b0Var.m38150J();
        b0Var.m38143Q(2);
        int D = b0Var.m38156D();
        b0Var.m38143Q(1);
        int n = b0Var.m38129n();
        if (J2 > spannableStringBuilder.length()) {
            int length = spannableStringBuilder.length();
            StringBuilder sb2 = new StringBuilder(68);
            sb2.append("Truncating styl end (");
            sb2.append(J2);
            sb2.append(") to cueText.length() (");
            sb2.append(length);
            sb2.append(").");
            C1230s.m37881i("Tx3gDecoder", sb2.toString());
            i = spannableStringBuilder.length();
        } else {
            i = J2;
        }
        if (J >= i) {
            StringBuilder sb3 = new StringBuilder(60);
            sb3.append("Ignoring styl with start (");
            sb3.append(J);
            sb3.append(") >= end (");
            sb3.append(i);
            sb3.append(").");
            C1230s.m37881i("Tx3gDecoder", sb3.toString());
            return;
        }
        int i2 = i;
        m6029G(spannableStringBuilder, D, this.f32788q, J, i2, 0);
        m6030F(spannableStringBuilder, n, this.f32789r, J, i2, 0);
    }
}
