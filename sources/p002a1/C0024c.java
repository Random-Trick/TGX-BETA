package p002a1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p016b1.C1128d;

public class C0024c implements Spannable {
    public static final Object f55M = new Object();
    public final Spannable f56a;
    public final C0025a f57b;
    public final PrecomputedText f58c;

    public C0025a m42572a() {
        return this.f57b;
    }

    public PrecomputedText m42571b() {
        Spannable spannable = this.f56a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override
    public char charAt(int i) {
        return this.f56a.charAt(i);
    }

    @Override
    public int getSpanEnd(Object obj) {
        return this.f56a.getSpanEnd(obj);
    }

    @Override
    public int getSpanFlags(Object obj) {
        return this.f56a.getSpanFlags(obj);
    }

    @Override
    public int getSpanStart(Object obj) {
        return this.f56a.getSpanStart(obj);
    }

    @Override
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.f58c.getSpans(i, i2, cls);
        }
        return (T[]) this.f56a.getSpans(i, i2, cls);
    }

    @Override
    public int length() {
        return this.f56a.length();
    }

    @Override
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f56a.nextSpanTransition(i, i2, cls);
    }

    @Override
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f58c.removeSpan(obj);
        } else {
            this.f56a.removeSpan(obj);
        }
    }

    @Override
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f58c.setSpan(obj, i, i2, i3);
        } else {
            this.f56a.setSpan(obj, i, i2, i3);
        }
    }

    @Override
    public CharSequence subSequence(int i, int i2) {
        return this.f56a.subSequence(i, i2);
    }

    @Override
    public String toString() {
        return this.f56a.toString();
    }

    public static final class C0025a {
        public final TextPaint f59a;
        public final TextDirectionHeuristic f60b;
        public final int f61c;
        public final int f62d;
        public final PrecomputedText.Params f63e;

        public static class C0026a {
            public final TextPaint f64a;
            public TextDirectionHeuristic f65b;
            public int f66c;
            public int f67d;

            public C0026a(TextPaint textPaint) {
                this.f64a = textPaint;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.f66c = 1;
                    this.f67d = 1;
                } else {
                    this.f67d = 0;
                    this.f66c = 0;
                }
                if (i >= 18) {
                    this.f65b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f65b = null;
                }
            }

            public C0025a m42565a() {
                return new C0025a(this.f64a, this.f65b, this.f66c, this.f67d);
            }

            public C0026a m42564b(int i) {
                this.f66c = i;
                return this;
            }

            public C0026a m42563c(int i) {
                this.f67d = i;
                return this;
            }

            public C0026a m42562d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f65b = textDirectionHeuristic;
                return this;
            }
        }

        public C0025a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f63e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f63e = null;
            }
            this.f59a = textPaint;
            this.f60b = textDirectionHeuristic;
            this.f61c = i;
            this.f62d = i2;
        }

        public boolean m42570a(C0025a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f61c != aVar.m42569b() || this.f62d != aVar.m42568c())) || this.f59a.getTextSize() != aVar.m42566e().getTextSize() || this.f59a.getTextScaleX() != aVar.m42566e().getTextScaleX() || this.f59a.getTextSkewX() != aVar.m42566e().getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f59a.getLetterSpacing() != aVar.m42566e().getLetterSpacing() || !TextUtils.equals(this.f59a.getFontFeatureSettings(), aVar.m42566e().getFontFeatureSettings()))) || this.f59a.getFlags() != aVar.m42566e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f59a.getTextLocales().equals(aVar.m42566e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f59a.getTextLocale().equals(aVar.m42566e().getTextLocale())) {
                return false;
            }
            return this.f59a.getTypeface() == null ? aVar.m42566e().getTypeface() == null : this.f59a.getTypeface().equals(aVar.m42566e().getTypeface());
        }

        public int m42569b() {
            return this.f61c;
        }

        public int m42568c() {
            return this.f62d;
        }

        public TextDirectionHeuristic m42567d() {
            return this.f60b;
        }

        public TextPaint m42566e() {
            return this.f59a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0025a)) {
                return false;
            }
            C0025a aVar = (C0025a) obj;
            if (!m42570a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f60b == aVar.m42567d();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C1128d.m38332b(Float.valueOf(this.f59a.getTextSize()), Float.valueOf(this.f59a.getTextScaleX()), Float.valueOf(this.f59a.getTextSkewX()), Float.valueOf(this.f59a.getLetterSpacing()), Integer.valueOf(this.f59a.getFlags()), this.f59a.getTextLocales(), this.f59a.getTypeface(), Boolean.valueOf(this.f59a.isElegantTextHeight()), this.f60b, Integer.valueOf(this.f61c), Integer.valueOf(this.f62d));
            }
            if (i >= 21) {
                return C1128d.m38332b(Float.valueOf(this.f59a.getTextSize()), Float.valueOf(this.f59a.getTextScaleX()), Float.valueOf(this.f59a.getTextSkewX()), Float.valueOf(this.f59a.getLetterSpacing()), Integer.valueOf(this.f59a.getFlags()), this.f59a.getTextLocale(), this.f59a.getTypeface(), Boolean.valueOf(this.f59a.isElegantTextHeight()), this.f60b, Integer.valueOf(this.f61c), Integer.valueOf(this.f62d));
            }
            if (i >= 18) {
                return C1128d.m38332b(Float.valueOf(this.f59a.getTextSize()), Float.valueOf(this.f59a.getTextScaleX()), Float.valueOf(this.f59a.getTextSkewX()), Integer.valueOf(this.f59a.getFlags()), this.f59a.getTextLocale(), this.f59a.getTypeface(), this.f60b, Integer.valueOf(this.f61c), Integer.valueOf(this.f62d));
            }
            if (i >= 17) {
                return C1128d.m38332b(Float.valueOf(this.f59a.getTextSize()), Float.valueOf(this.f59a.getTextScaleX()), Float.valueOf(this.f59a.getTextSkewX()), Integer.valueOf(this.f59a.getFlags()), this.f59a.getTextLocale(), this.f59a.getTypeface(), this.f60b, Integer.valueOf(this.f61c), Integer.valueOf(this.f62d));
            }
            return C1128d.m38332b(Float.valueOf(this.f59a.getTextSize()), Float.valueOf(this.f59a.getTextScaleX()), Float.valueOf(this.f59a.getTextSkewX()), Integer.valueOf(this.f59a.getFlags()), this.f59a.getTypeface(), this.f60b, Integer.valueOf(this.f61c), Integer.valueOf(this.f62d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f59a.getTextSize());
            sb2.append(", textScaleX=" + this.f59a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f59a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                sb2.append(", letterSpacing=" + this.f59a.getLetterSpacing());
                sb2.append(", elegantTextHeight=" + this.f59a.isElegantTextHeight());
            }
            if (i >= 24) {
                sb2.append(", textLocale=" + this.f59a.getTextLocales());
            } else if (i >= 17) {
                sb2.append(", textLocale=" + this.f59a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f59a.getTypeface());
            if (i >= 26) {
                sb2.append(", variationSettings=" + this.f59a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f60b);
            sb2.append(", breakStrategy=" + this.f61c);
            sb2.append(", hyphenationFrequency=" + this.f62d);
            sb2.append("}");
            return sb2.toString();
        }

        public C0025a(PrecomputedText.Params params) {
            this.f59a = params.getTextPaint();
            this.f60b = params.getTextDirection();
            this.f61c = params.getBreakStrategy();
            this.f62d = params.getHyphenationFrequency();
            this.f63e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
