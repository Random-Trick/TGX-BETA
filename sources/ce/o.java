package ce;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import fd.b;
import he.i;
import kb.e;
import org.thunderdog.challegram.Log;

public class o {
    public static boolean f5297a = false;
    public static boolean f5298b = true;
    public static boolean f5299c = true;
    public static boolean f5300d = true;
    public static Boolean f5301e;
    public static Typeface f5302f;
    public static Typeface f5303g;
    public static Typeface f5304h;
    public static Typeface f5305i;
    public static Typeface f5306j;
    public static final boolean f5307k = true;
    public static final boolean f5308l;
    public static final boolean f5309m;

    public static class a {
        public TextPaint f5310a;
        public TextPaint f5311b;
        public TextPaint f5312c;
        public TextPaint f5313d;
        public TextPaint f5314e;
        public final Typeface f5315f;
        public final Typeface f5316g;
        public final Typeface f5317h;
        public final Typeface f5318i;
        public final Typeface f5319j;
        public a f5320k;
        public a f5321l;
        public a f5322m;
        public final int f5323n;

        public a(Typeface typeface, int i10) {
            this(typeface, null, null, null, null, i10);
        }

        public TextPaint a() {
            if (this.f5314e == null) {
                if (this.f5318i != null) {
                    TextPaint textPaint = new TextPaint(this.f5323n | 5);
                    this.f5314e = textPaint;
                    textPaint.setTypeface(this.f5318i);
                } else if (this.f5317h != null) {
                    TextPaint textPaint2 = new TextPaint(this.f5323n | 37);
                    this.f5314e = textPaint2;
                    textPaint2.setTypeface(this.f5317h);
                    this.f5314e.setFakeBoldText(true);
                } else if (this.f5316g != null) {
                    TextPaint textPaint3 = new TextPaint(this.f5323n | 5);
                    this.f5314e = textPaint3;
                    textPaint3.setTypeface(this.f5316g);
                    this.f5314e.setTextSkewX(-0.2f);
                } else {
                    TextPaint textPaint4 = new TextPaint(this.f5323n | 37);
                    this.f5314e = textPaint4;
                    textPaint4.setTypeface(this.f5315f);
                    this.f5314e.setTextSkewX(-0.2f);
                    this.f5314e.setFakeBoldText(true);
                }
            }
            return this.f5314e;
        }

        public TextPaint b() {
            if (this.f5311b == null) {
                if (this.f5316g != null) {
                    TextPaint textPaint = new TextPaint(this.f5323n | 5);
                    this.f5311b = textPaint;
                    textPaint.setTypeface(this.f5316g);
                } else {
                    TextPaint textPaint2 = new TextPaint(this.f5323n | 37);
                    this.f5311b = textPaint2;
                    textPaint2.setFakeBoldText(true);
                    this.f5311b.setTypeface(this.f5315f);
                }
            }
            return this.f5311b;
        }

        public TextPaint c() {
            if (this.f5316g == null) {
                return b();
            }
            if (this.f5312c == null) {
                TextPaint textPaint = new TextPaint(this.f5323n | 37);
                this.f5312c = textPaint;
                textPaint.setFakeBoldText(true);
                this.f5312c.setTypeface(this.f5315f);
            }
            return this.f5312c;
        }

        public TextPaint d() {
            if (this.f5313d == null) {
                TextPaint textPaint = new TextPaint(this.f5323n | 5);
                this.f5313d = textPaint;
                Typeface typeface = this.f5317h;
                if (typeface != null) {
                    textPaint.setTypeface(typeface);
                } else {
                    textPaint.setTypeface(this.f5315f);
                    this.f5313d.setTextSkewX(-0.2f);
                }
            }
            return this.f5313d;
        }

        public a e() {
            Typeface typeface = this.f5319j;
            if (typeface == null) {
                return this;
            }
            if (this.f5320k == null) {
                this.f5320k = new a(typeface, this.f5323n);
            }
            return this.f5320k;
        }

        public TextPaint f() {
            if (this.f5310a == null) {
                TextPaint textPaint = new TextPaint(this.f5323n | 5);
                this.f5310a = textPaint;
                textPaint.setTypeface(this.f5315f);
            }
            return this.f5310a;
        }

        public a g() {
            a aVar = this.f5322m;
            if (aVar != null) {
                return aVar;
            }
            a i10 = i(16);
            this.f5322m = i10;
            return i10;
        }

        public a h() {
            a aVar = this.f5321l;
            if (aVar != null) {
                return aVar;
            }
            a i10 = i(8);
            this.f5321l = i10;
            return i10;
        }

        public final a i(int i10) {
            return new a(this.f5315f, this.f5316g, this.f5317h, this.f5318i, this.f5319j, this.f5323n | i10);
        }

        public a(Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4, Typeface typeface5, int i10) {
            this.f5315f = typeface;
            this.f5316g = typeface2;
            this.f5317h = typeface3;
            this.f5318i = typeface4;
            this.f5319j = typeface5;
            this.f5323n = i10;
        }
    }

    static {
        boolean z10 = true;
        boolean z11 = Build.VERSION.SDK_INT >= 31;
        f5308l = z11;
        if (!z11 || !b.f11906c) {
            z10 = false;
        }
        f5309m = z10;
    }

    public static Boolean f() {
        return f5301e;
    }

    public static Typeface g() {
        Typeface typeface = f5303g;
        if (typeface != null) {
            return typeface;
        }
        Typeface v10 = v("fonts/Roboto-Bold.ttf", n.f5294a);
        f5303g = v10;
        return v10;
    }

    public static Typeface h() {
        Typeface typeface = f5305i;
        if (typeface != null) {
            return typeface;
        }
        Typeface v10 = v("fonts/Roboto-Italic.ttf", l.f5286a);
        f5305i = v10;
        return v10;
    }

    public static Typeface i() {
        Typeface typeface = f5304h;
        if (typeface != null) {
            return typeface;
        }
        Typeface v10 = v("fonts/Roboto-Medium.ttf", m.f5290a);
        f5304h = v10;
        return v10;
    }

    public static Typeface j() {
        Typeface typeface = f5306j;
        if (typeface != null) {
            return typeface;
        }
        Typeface v10 = v("fonts/RobotoMono-Regular.ttf", j.f5273a);
        f5306j = v10;
        return v10;
    }

    public static Typeface k() {
        Typeface typeface = f5302f;
        if (typeface != null) {
            return typeface;
        }
        Typeface v10 = v("fonts/Roboto-Regular.ttf", k.f5285a);
        f5302f = v10;
        return v10;
    }

    public static void l() {
        if (!f5297a) {
            synchronized (o.class) {
                if (!f5297a) {
                    Rect rect = new Rect();
                    boolean z10 = false;
                    y.h0().getTextBounds("\u200e", 0, 1, rect);
                    f5298b = rect.left == 0 && rect.right == 0 && rect.top == 0 && rect.bottom == 0;
                    y.h0().getTextBounds("\u2069", 0, 1, rect);
                    if (rect.left == 0 && rect.right == 0 && rect.top == 0 && rect.bottom == 0) {
                        z10 = true;
                    }
                    f5300d = z10;
                    f5297a = true;
                }
            }
        }
    }

    public static boolean m() {
        if (!f5297a) {
            l();
        }
        return f5298b;
    }

    public static boolean n() {
        if (!f5297a) {
            l();
        }
        return f5299c;
    }

    public static boolean o() {
        if (!f5297a) {
            l();
        }
        return f5300d;
    }

    public static Typeface p() {
        if (f5307k) {
            return w("sans-serif", 1, Typeface.DEFAULT_BOLD);
        }
        return Typeface.DEFAULT_BOLD;
    }

    public static Typeface q() {
        return f5307k ? w("sans-serif", 2, Typeface.defaultFromStyle(2)) : Typeface.defaultFromStyle(2);
    }

    public static Typeface r() {
        if (!f5307k) {
            return Typeface.DEFAULT_BOLD;
        }
        Typeface w10 = w("sans-serif-light", 1, null);
        return w10 != null ? w10 : w("sans-serif-medium", 0, Typeface.DEFAULT_BOLD);
    }

    public static Typeface s() {
        if (f5309m) {
            return null;
        }
        Typeface w10 = f5308l ? w("monospace", 0, Typeface.MONOSPACE) : Typeface.MONOSPACE;
        if (w10 == null || !w10.equals(k())) {
            return w10;
        }
        return null;
    }

    public static Typeface t() {
        return f5307k ? w("sans-serif", 0, Typeface.DEFAULT) : Typeface.DEFAULT;
    }

    public static Typeface u(String str) {
        return Typeface.createFromAsset(j0.q().getResources().getAssets(), str);
    }

    public static synchronized Typeface v(String str, e<Typeface> eVar) {
        Typeface typeface;
        synchronized (o.class) {
            if (f5301e == null) {
                f5301e = Boolean.valueOf(i.c2().s6());
            }
            return (!f5301e.booleanValue() || (typeface = eVar.get()) == null) ? u(str) : typeface;
        }
    }

    public static Typeface w(String str, int i10, Typeface typeface) {
        Typeface create;
        try {
            create = Typeface.create(str, i10);
        } catch (Throwable th) {
            Log.i("%s %d not found", th, str, Integer.valueOf(i10));
        }
        return (create.getStyle() == i10 || i10 == 0) ? create : typeface;
    }

    public static a x() {
        return new a(k(), i(), h(), null, j(), 0);
    }
}
