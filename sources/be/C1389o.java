package be;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import ge.C4868i;
import org.thunderdog.challegram.Log;
import p067ed.C4184b;
import p139jb.AbstractC5913e;

public class C1389o {
    public static boolean f5031a = false;
    public static boolean f5032b = true;
    public static boolean f5033c = true;
    public static boolean f5034d = true;
    public static Boolean f5035e;
    public static Typeface f5036f;
    public static Typeface f5037g;
    public static Typeface f5038h;
    public static Typeface f5039i;
    public static Typeface f5040j;
    public static final boolean f5041k;
    public static final boolean f5042l;
    public static final boolean f5043m;

    public static class C1390a {
        public TextPaint f5044a;
        public TextPaint f5045b;
        public TextPaint f5046c;
        public TextPaint f5047d;
        public TextPaint f5048e;
        public final Typeface f5049f;
        public final Typeface f5050g;
        public final Typeface f5051h;
        public final Typeface f5052i;
        public final Typeface f5053j;
        public C1390a f5054k;
        public C1390a f5055l;
        public C1390a f5056m;
        public final int f5057n;

        public C1390a(Typeface typeface, int i) {
            this(typeface, null, null, null, null, i);
        }

        public TextPaint m37244a() {
            if (this.f5048e == null) {
                if (this.f5052i != null) {
                    TextPaint textPaint = new TextPaint(this.f5057n | 5);
                    this.f5048e = textPaint;
                    textPaint.setTypeface(this.f5052i);
                } else if (this.f5051h != null) {
                    TextPaint textPaint2 = new TextPaint(this.f5057n | 37);
                    this.f5048e = textPaint2;
                    textPaint2.setTypeface(this.f5051h);
                    this.f5048e.setFakeBoldText(true);
                } else if (this.f5050g != null) {
                    TextPaint textPaint3 = new TextPaint(this.f5057n | 5);
                    this.f5048e = textPaint3;
                    textPaint3.setTypeface(this.f5050g);
                    this.f5048e.setTextSkewX(-0.2f);
                } else {
                    TextPaint textPaint4 = new TextPaint(this.f5057n | 37);
                    this.f5048e = textPaint4;
                    textPaint4.setTypeface(this.f5049f);
                    this.f5048e.setTextSkewX(-0.2f);
                    this.f5048e.setFakeBoldText(true);
                }
            }
            return this.f5048e;
        }

        public TextPaint m37243b() {
            if (this.f5045b == null) {
                if (this.f5050g != null) {
                    TextPaint textPaint = new TextPaint(this.f5057n | 5);
                    this.f5045b = textPaint;
                    textPaint.setTypeface(this.f5050g);
                } else {
                    TextPaint textPaint2 = new TextPaint(this.f5057n | 37);
                    this.f5045b = textPaint2;
                    textPaint2.setFakeBoldText(true);
                    this.f5045b.setTypeface(this.f5049f);
                }
            }
            return this.f5045b;
        }

        public TextPaint m37242c() {
            if (this.f5050g == null) {
                return m37243b();
            }
            if (this.f5046c == null) {
                TextPaint textPaint = new TextPaint(this.f5057n | 37);
                this.f5046c = textPaint;
                textPaint.setFakeBoldText(true);
                this.f5046c.setTypeface(this.f5049f);
            }
            return this.f5046c;
        }

        public TextPaint m37241d() {
            if (this.f5047d == null) {
                TextPaint textPaint = new TextPaint(this.f5057n | 5);
                this.f5047d = textPaint;
                Typeface typeface = this.f5051h;
                if (typeface != null) {
                    textPaint.setTypeface(typeface);
                } else {
                    textPaint.setTypeface(this.f5049f);
                    this.f5047d.setTextSkewX(-0.2f);
                }
            }
            return this.f5047d;
        }

        public C1390a m37240e() {
            Typeface typeface = this.f5053j;
            if (typeface == null) {
                return this;
            }
            if (this.f5054k == null) {
                this.f5054k = new C1390a(typeface, this.f5057n);
            }
            return this.f5054k;
        }

        public TextPaint m37239f() {
            if (this.f5044a == null) {
                TextPaint textPaint = new TextPaint(this.f5057n | 5);
                this.f5044a = textPaint;
                textPaint.setTypeface(this.f5049f);
            }
            return this.f5044a;
        }

        public C1390a m37238g() {
            C1390a aVar = this.f5056m;
            if (aVar != null) {
                return aVar;
            }
            C1390a i = m37236i(16);
            this.f5056m = i;
            return i;
        }

        public C1390a m37237h() {
            C1390a aVar = this.f5055l;
            if (aVar != null) {
                return aVar;
            }
            C1390a i = m37236i(8);
            this.f5055l = i;
            return i;
        }

        public final C1390a m37236i(int i) {
            return new C1390a(this.f5049f, this.f5050g, this.f5051h, this.f5052i, this.f5053j, this.f5057n | i);
        }

        public C1390a(Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4, Typeface typeface5, int i) {
            this.f5049f = typeface;
            this.f5050g = typeface2;
            this.f5051h = typeface3;
            this.f5052i = typeface4;
            this.f5053j = typeface5;
            this.f5057n = i;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f5041k = i >= 21;
        boolean z2 = i >= 31;
        f5042l = z2;
        if (!z2 || !C4184b.f14110c) {
            z = false;
        }
        f5043m = z;
    }

    public static Boolean m37263f() {
        return f5035e;
    }

    public static Typeface m37262g() {
        Typeface typeface = f5037g;
        if (typeface != null) {
            return typeface;
        }
        Typeface v = m37247v("fonts/Roboto-Bold.ttf", C1387n.f5027a);
        f5037g = v;
        return v;
    }

    public static Typeface m37261h() {
        Typeface typeface = f5039i;
        if (typeface != null) {
            return typeface;
        }
        Typeface v = m37247v("fonts/Roboto-Italic.ttf", C1383l.f5019a);
        f5039i = v;
        return v;
    }

    public static Typeface m37260i() {
        Typeface typeface = f5038h;
        if (typeface != null) {
            return typeface;
        }
        Typeface v = m37247v("fonts/Roboto-Medium.ttf", C1385m.f5023a);
        f5038h = v;
        return v;
    }

    public static Typeface m37259j() {
        Typeface typeface = f5040j;
        if (typeface != null) {
            return typeface;
        }
        Typeface v = m37247v("fonts/RobotoMono-Regular.ttf", C1378j.f5006a);
        f5040j = v;
        return v;
    }

    public static Typeface m37258k() {
        Typeface typeface = f5036f;
        if (typeface != null) {
            return typeface;
        }
        Typeface v = m37247v("fonts/Roboto-Regular.ttf", C1381k.f5018a);
        f5036f = v;
        return v;
    }

    public static void m37257l() {
        if (!f5031a) {
            synchronized (C1389o.class) {
                if (!f5031a) {
                    Rect rect = new Rect();
                    boolean z = false;
                    C1410y.m37036h0().getTextBounds("\u200e", 0, 1, rect);
                    f5032b = rect.left == 0 && rect.right == 0 && rect.top == 0 && rect.bottom == 0;
                    C1410y.m37036h0().getTextBounds("\u2069", 0, 1, rect);
                    if (rect.left == 0 && rect.right == 0 && rect.top == 0 && rect.bottom == 0) {
                        z = true;
                    }
                    f5034d = z;
                    f5031a = true;
                }
            }
        }
    }

    public static boolean m37256m() {
        if (!f5031a) {
            m37257l();
        }
        return f5032b;
    }

    public static boolean m37255n() {
        if (!f5031a) {
            m37257l();
        }
        return f5033c;
    }

    public static boolean m37254o() {
        if (!f5031a) {
            m37257l();
        }
        return f5034d;
    }

    public static Typeface m37253p() {
        if (f5041k) {
            return m37246w("sans-serif", 1, Typeface.DEFAULT_BOLD);
        }
        return Typeface.DEFAULT_BOLD;
    }

    public static Typeface m37252q() {
        return f5041k ? m37246w("sans-serif", 2, Typeface.defaultFromStyle(2)) : Typeface.defaultFromStyle(2);
    }

    public static Typeface m37251r() {
        if (!f5041k) {
            return Typeface.DEFAULT_BOLD;
        }
        Typeface w = m37246w("sans-serif-light", 1, null);
        return w != null ? w : m37246w("sans-serif-medium", 0, Typeface.DEFAULT_BOLD);
    }

    public static Typeface m37250s() {
        if (f5043m) {
            return null;
        }
        Typeface w = f5042l ? m37246w("monospace", 0, Typeface.MONOSPACE) : Typeface.MONOSPACE;
        if (w == null || !w.equals(m37258k())) {
            return w;
        }
        return null;
    }

    public static Typeface m37249t() {
        return f5041k ? m37246w("sans-serif", 0, Typeface.DEFAULT) : Typeface.DEFAULT;
    }

    public static Typeface m37248u(String str) {
        return Typeface.createFromAsset(C1379j0.m37309q().getResources().getAssets(), str);
    }

    public static synchronized Typeface m37247v(String str, AbstractC5913e<Typeface> eVar) {
        Typeface typeface;
        synchronized (C1389o.class) {
            if (f5035e == null) {
                f5035e = Boolean.valueOf(C4868i.m24726c2().m24594s6());
            }
            return (!f5035e.booleanValue() || (typeface = eVar.get()) == null) ? m37248u(str) : typeface;
        }
    }

    public static Typeface m37246w(String str, int i, Typeface typeface) {
        Typeface create;
        try {
            create = Typeface.create(str, i);
        } catch (Throwable th) {
            Log.m14720i("%s %d not found", th, str, Integer.valueOf(i));
        }
        return (create.getStyle() == i || i == 0) ? create : typeface;
    }

    public static C1390a m37245x() {
        return new C1390a(m37258k(), m37260i(), m37261h(), null, m37259j(), 0);
    }
}
