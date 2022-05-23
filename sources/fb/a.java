package fb;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

public abstract class a implements InputFilter {
    public AbstractC0104a f11876a;

    public interface AbstractC0104a {
        void a(a aVar, CharSequence charSequence, int i10, int i11, int i12, char c10);
    }

    public abstract boolean a(char c10);

    public a b(AbstractC0104a aVar) {
        this.f11876a = aVar;
        return this;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        int i14;
        SpannableStringBuilder spannableStringBuilder;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        boolean z10 = charSequence instanceof Spanned;
        int i15 = i10;
        SpannableStringBuilder spannableStringBuilder2 = null;
        StringBuilder sb5 = null;
        boolean z11 = true;
        int i16 = -1;
        while (i15 < i11) {
            char charAt = charSequence.charAt(i15);
            if (!a(charAt)) {
                AbstractC0104a aVar = this.f11876a;
                if (aVar != null) {
                    spannableStringBuilder = spannableStringBuilder2;
                    sb3 = sb5;
                    i14 = i15;
                    aVar.a(this, charSequence, i10, i11, i15, charAt);
                } else {
                    spannableStringBuilder = spannableStringBuilder2;
                    sb3 = sb5;
                    i14 = i15;
                }
                if (z11) {
                    if (z10) {
                        spannableStringBuilder2 = new SpannableStringBuilder(charSequence, i10, i14);
                        c.a((Spanned) charSequence, i10, i14, null, spannableStringBuilder2, 0);
                        sb5 = sb3;
                    } else {
                        sb5 = new StringBuilder(i11 - i14);
                        sb5.append(charSequence, i10, i14);
                        spannableStringBuilder2 = spannableStringBuilder;
                    }
                    z11 = false;
                } else if (i16 != -1) {
                    if (z10) {
                        spannableStringBuilder.append(charSequence, i16, i14);
                        c.a((Spanned) charSequence, i16, i14, null, spannableStringBuilder, 0);
                        sb4 = sb3;
                    } else {
                        sb4 = sb3;
                        sb4.append(charSequence, i16, i14);
                    }
                    sb5 = sb4;
                    spannableStringBuilder2 = spannableStringBuilder;
                } else {
                    sb2 = sb3;
                    sb5 = sb2;
                    spannableStringBuilder2 = spannableStringBuilder;
                    i15 = i14 + 1;
                }
                i16 = -1;
                i15 = i14 + 1;
            } else {
                spannableStringBuilder = spannableStringBuilder2;
                i14 = i15;
                sb2 = sb5;
                if (i16 == -1) {
                    sb5 = sb2;
                    spannableStringBuilder2 = spannableStringBuilder;
                    i16 = i14;
                    i15 = i14 + 1;
                }
                sb5 = sb2;
                spannableStringBuilder2 = spannableStringBuilder;
                i15 = i14 + 1;
            }
        }
        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
        StringBuilder sb6 = sb5;
        if (z11) {
            return null;
        }
        if (i16 != -1) {
            if (z10) {
                spannableStringBuilder3.append(charSequence, i16, i11);
                c.a((Spanned) charSequence, i16, i11, null, spannableStringBuilder3, 0);
            } else {
                sb6.append(charSequence, i16, i11);
            }
        }
        return z10 ? spannableStringBuilder3 : sb6;
    }
}
