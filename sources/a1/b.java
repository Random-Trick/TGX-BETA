package a1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import b1.d;

public class b implements Spannable {
    public static final Object M = new Object();
    public final Spannable f48a;
    public final a f49b;
    public final PrecomputedText f50c;

    public a a() {
        return this.f49b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f48a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override
    public char charAt(int i10) {
        return this.f48a.charAt(i10);
    }

    @Override
    public int getSpanEnd(Object obj) {
        return this.f48a.getSpanEnd(obj);
    }

    @Override
    public int getSpanFlags(Object obj) {
        return this.f48a.getSpanFlags(obj);
    }

    @Override
    public int getSpanStart(Object obj) {
        return this.f48a.getSpanStart(obj);
    }

    @Override
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.f50c.getSpans(i10, i11, cls);
        }
        return (T[]) this.f48a.getSpans(i10, i11, cls);
    }

    @Override
    public int length() {
        return this.f48a.length();
    }

    @Override
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f48a.nextSpanTransition(i10, i11, cls);
    }

    @Override
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f50c.removeSpan(obj);
        } else {
            this.f48a.removeSpan(obj);
        }
    }

    @Override
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f50c.setSpan(obj, i10, i11, i12);
        } else {
            this.f48a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override
    public CharSequence subSequence(int i10, int i11) {
        return this.f48a.subSequence(i10, i11);
    }

    @Override
    public String toString() {
        return this.f48a.toString();
    }

    public static final class a {
        public final TextPaint f51a;
        public final TextDirectionHeuristic f52b;
        public final int f53c;
        public final int f54d;
        public final PrecomputedText.Params f55e;

        public static class C0005a {
            public final TextPaint f56a;
            public TextDirectionHeuristic f57b;
            public int f58c;
            public int f59d;

            public C0005a(TextPaint textPaint) {
                this.f56a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f58c = 1;
                    this.f59d = 1;
                } else {
                    this.f59d = 0;
                    this.f58c = 0;
                }
                this.f57b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public a a() {
                return new a(this.f56a, this.f57b, this.f58c, this.f59d);
            }

            public C0005a b(int i10) {
                this.f58c = i10;
                return this;
            }

            public C0005a c(int i10) {
                this.f59d = i10;
                return this;
            }

            public C0005a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f57b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f55e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f55e = null;
            }
            this.f51a = textPaint;
            this.f52b = textDirectionHeuristic;
            this.f53c = i10;
            this.f54d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 && (this.f53c != aVar.b() || this.f54d != aVar.c())) || this.f51a.getTextSize() != aVar.e().getTextSize() || this.f51a.getTextScaleX() != aVar.e().getTextScaleX() || this.f51a.getTextSkewX() != aVar.e().getTextSkewX() || this.f51a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f51a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f51a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f51a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f51a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f51a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f51a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f53c;
        }

        public int c() {
            return this.f54d;
        }

        public TextDirectionHeuristic d() {
            return this.f52b;
        }

        public TextPaint e() {
            return this.f51a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f52b == aVar.d();
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return d.b(Float.valueOf(this.f51a.getTextSize()), Float.valueOf(this.f51a.getTextScaleX()), Float.valueOf(this.f51a.getTextSkewX()), Float.valueOf(this.f51a.getLetterSpacing()), Integer.valueOf(this.f51a.getFlags()), this.f51a.getTextLocales(), this.f51a.getTypeface(), Boolean.valueOf(this.f51a.isElegantTextHeight()), this.f52b, Integer.valueOf(this.f53c), Integer.valueOf(this.f54d));
            }
            return d.b(Float.valueOf(this.f51a.getTextSize()), Float.valueOf(this.f51a.getTextScaleX()), Float.valueOf(this.f51a.getTextSkewX()), Float.valueOf(this.f51a.getLetterSpacing()), Integer.valueOf(this.f51a.getFlags()), this.f51a.getTextLocale(), this.f51a.getTypeface(), Boolean.valueOf(this.f51a.isElegantTextHeight()), this.f52b, Integer.valueOf(this.f53c), Integer.valueOf(this.f54d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f51a.getTextSize());
            sb2.append(", textScaleX=" + this.f51a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f51a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f51a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f51a.isElegantTextHeight());
            if (i10 >= 24) {
                sb2.append(", textLocale=" + this.f51a.getTextLocales());
            } else {
                sb2.append(", textLocale=" + this.f51a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f51a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f51a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f52b);
            sb2.append(", breakStrategy=" + this.f53c);
            sb2.append(", hyphenationFrequency=" + this.f54d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f51a = params.getTextPaint();
            this.f52b = params.getTextDirection();
            this.f53c = params.getBreakStrategy();
            this.f54d = params.getHyphenationFrequency();
            this.f55e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
