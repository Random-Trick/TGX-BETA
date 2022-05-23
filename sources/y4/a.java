package y4;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c5.b0;
import c5.l0;
import c5.s;
import java.util.List;
import q4.b;
import q4.e;
import q4.f;
import q4.h;
import z6.d;

public final class a extends e {
    public final b0 f26570o = new b0();
    public final boolean f26571p;
    public final int f26572q;
    public final int f26573r;
    public final String f26574s;
    public final float f26575t;
    public final int f26576u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z10 = true;
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f26572q = bArr[24];
            this.f26573r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f26574s = "Serif".equals(l0.B(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i10 = bArr[25] * 20;
            this.f26576u = i10;
            z10 = (bArr[0] & 32) == 0 ? false : z10;
            this.f26571p = z10;
            if (z10) {
                this.f26575t = l0.o(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
            } else {
                this.f26575t = 0.85f;
            }
        } else {
            this.f26572q = 0;
            this.f26573r = -1;
            this.f26574s = str;
            this.f26571p = false;
            this.f26575t = 0.85f;
            this.f26576u = -1;
        }
    }

    public static void E(boolean z10) {
        if (!z10) {
            throw new h("Unexpected subtitle format.");
        }
    }

    public static void F(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void G(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = true;
            boolean z11 = (i10 & 1) != 0;
            boolean z12 = (i10 & 2) != 0;
            if (z11) {
                if (z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z12) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z10 = false;
            }
            if (z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z10 && !z11 && !z12) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    public static void H(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    public static String I(b0 b0Var) {
        char g10;
        E(b0Var.a() >= 2);
        int J = b0Var.J();
        if (J == 0) {
            return "";
        }
        if (b0Var.a() < 2 || ((g10 = b0Var.g()) != 65279 && g10 != 65534)) {
            return b0Var.B(J, d.f27014c);
        }
        return b0Var.B(J, d.f27017f);
    }

    @Override
    public f B(byte[] bArr, int i10, boolean z10) {
        this.f26570o.N(bArr, i10);
        String I = I(this.f26570o);
        if (I.isEmpty()) {
            return b.f26577b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(I);
        G(spannableStringBuilder, this.f26572q, 0, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.f26573r, -1, 0, spannableStringBuilder.length(), 16711680);
        H(spannableStringBuilder, this.f26574s, 0, spannableStringBuilder.length());
        float f10 = this.f26575t;
        while (this.f26570o.a() >= 8) {
            int e10 = this.f26570o.e();
            int n10 = this.f26570o.n();
            int n11 = this.f26570o.n();
            boolean z11 = true;
            if (n11 == 1937013100) {
                if (this.f26570o.a() < 2) {
                    z11 = false;
                }
                E(z11);
                int J = this.f26570o.J();
                for (int i11 = 0; i11 < J; i11++) {
                    D(this.f26570o, spannableStringBuilder);
                }
            } else if (n11 == 1952608120 && this.f26571p) {
                if (this.f26570o.a() < 2) {
                    z11 = false;
                }
                E(z11);
                f10 = l0.o(this.f26570o.J() / this.f26576u, 0.0f, 0.95f);
            }
            this.f26570o.P(e10 + n10);
        }
        return new b(new b.C0195b().o(spannableStringBuilder).h(f10, 0).i(0).a());
    }

    public final void D(b0 b0Var, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        E(b0Var.a() >= 12);
        int J = b0Var.J();
        int J2 = b0Var.J();
        b0Var.Q(2);
        int D = b0Var.D();
        b0Var.Q(1);
        int n10 = b0Var.n();
        if (J2 > spannableStringBuilder.length()) {
            int length = spannableStringBuilder.length();
            StringBuilder sb2 = new StringBuilder(68);
            sb2.append("Truncating styl end (");
            sb2.append(J2);
            sb2.append(") to cueText.length() (");
            sb2.append(length);
            sb2.append(").");
            s.i("Tx3gDecoder", sb2.toString());
            i10 = spannableStringBuilder.length();
        } else {
            i10 = J2;
        }
        if (J >= i10) {
            StringBuilder sb3 = new StringBuilder(60);
            sb3.append("Ignoring styl with start (");
            sb3.append(J);
            sb3.append(") >= end (");
            sb3.append(i10);
            sb3.append(").");
            s.i("Tx3gDecoder", sb3.toString());
            return;
        }
        int i11 = i10;
        G(spannableStringBuilder, D, this.f26572q, J, i11, 0);
        F(spannableStringBuilder, n10, this.f26573r, J, i11, 0);
    }
}
