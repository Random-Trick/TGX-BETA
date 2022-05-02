package p066eb;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

public abstract class AbstractC4178a implements InputFilter {
    public AbstractC4179a f14080a;

    public interface AbstractC4179a {
        void mo28618a(AbstractC4178a aVar, CharSequence charSequence, int i, int i2, int i3, char c);
    }

    public abstract boolean mo25355a(char c);

    public AbstractC4178a m28619b(AbstractC4179a aVar) {
        this.f14080a = aVar;
        return this;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5;
        SpannableStringBuilder spannableStringBuilder;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        boolean z = charSequence instanceof Spanned;
        int i6 = i;
        SpannableStringBuilder spannableStringBuilder2 = null;
        StringBuilder sb5 = null;
        boolean z2 = true;
        int i7 = -1;
        while (i6 < i2) {
            char charAt = charSequence.charAt(i6);
            if (!mo25355a(charAt)) {
                AbstractC4179a aVar = this.f14080a;
                if (aVar != null) {
                    spannableStringBuilder = spannableStringBuilder2;
                    sb3 = sb5;
                    i5 = i6;
                    aVar.mo28618a(this, charSequence, i, i2, i6, charAt);
                } else {
                    spannableStringBuilder = spannableStringBuilder2;
                    sb3 = sb5;
                    i5 = i6;
                }
                if (z2) {
                    if (z) {
                        spannableStringBuilder2 = new SpannableStringBuilder(charSequence, i, i5);
                        C4181c.m28617a((Spanned) charSequence, i, i5, null, spannableStringBuilder2, 0);
                        sb5 = sb3;
                    } else {
                        sb5 = new StringBuilder(i2 - i5);
                        sb5.append(charSequence, i, i5);
                        spannableStringBuilder2 = spannableStringBuilder;
                    }
                    z2 = false;
                } else if (i7 != -1) {
                    if (z) {
                        spannableStringBuilder.append(charSequence, i7, i5);
                        C4181c.m28617a((Spanned) charSequence, i7, i5, null, spannableStringBuilder, 0);
                        sb4 = sb3;
                    } else {
                        sb4 = sb3;
                        sb4.append(charSequence, i7, i5);
                    }
                    sb5 = sb4;
                    spannableStringBuilder2 = spannableStringBuilder;
                } else {
                    sb2 = sb3;
                    sb5 = sb2;
                    spannableStringBuilder2 = spannableStringBuilder;
                    i6 = i5 + 1;
                }
                i7 = -1;
                i6 = i5 + 1;
            } else {
                spannableStringBuilder = spannableStringBuilder2;
                i5 = i6;
                sb2 = sb5;
                if (i7 == -1) {
                    sb5 = sb2;
                    spannableStringBuilder2 = spannableStringBuilder;
                    i7 = i5;
                    i6 = i5 + 1;
                }
                sb5 = sb2;
                spannableStringBuilder2 = spannableStringBuilder;
                i6 = i5 + 1;
            }
        }
        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
        StringBuilder sb6 = sb5;
        if (z2) {
            return null;
        }
        if (i7 != -1) {
            if (z) {
                spannableStringBuilder3.append(charSequence, i7, i2);
                C4181c.m28617a((Spanned) charSequence, i7, i2, null, spannableStringBuilder3, 0);
            } else {
                sb6.append(charSequence, i7, i2);
            }
        }
        return z ? spannableStringBuilder3 : sb6;
    }
}
