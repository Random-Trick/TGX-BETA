package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

public class b extends Drawable implements Drawable.Callback {
    public Drawable M;
    public boolean O;
    public boolean R;
    public Runnable S;
    public long T;
    public long U;
    public C0106b V;
    public c f11980a;
    public Rect f11981b;
    public Drawable f11982c;
    public int N = 255;
    public int P = -1;
    public int Q = -1;

    public class a implements Runnable {
        public a() {
        }

        @Override
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    public static class C0106b implements Drawable.Callback {
        public Drawable.Callback f11984a;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f11984a;
            this.f11984a = null;
            return callback;
        }

        public C0106b b(Drawable.Callback callback) {
            this.f11984a = callback;
            return this;
        }

        @Override
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f11984a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f11984a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class c extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;
        public final b f11985a;
        public Resources f11986b;
        public int f11987c;
        public int f11988d;
        public int f11989e;
        public SparseArray<Drawable.ConstantState> f11990f;
        public Drawable[] f11991g;
        public int f11992h;
        public boolean f11993i;
        public boolean f11994j;
        public Rect f11995k;
        public boolean f11996l;
        public boolean f11997m;
        public int f11998n;
        public int f11999o;
        public int f12000p;
        public int f12001q;
        public boolean f12002r;
        public int f12003s;
        public boolean f12004t;
        public boolean f12005u;
        public boolean f12006v;
        public boolean f12007w;
        public boolean f12008x;
        public boolean f12009y;
        public int f12010z;

        public c(c cVar, b bVar, Resources resources) {
            Resources resources2;
            this.f11987c = 160;
            this.f11993i = false;
            this.f11996l = false;
            this.f12008x = true;
            this.A = 0;
            this.B = 0;
            this.f11985a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = cVar != null ? cVar.f11986b : null;
            }
            this.f11986b = resources2;
            int f10 = b.f(resources, cVar != null ? cVar.f11987c : 0);
            this.f11987c = f10;
            if (cVar != null) {
                this.f11988d = cVar.f11988d;
                this.f11989e = cVar.f11989e;
                this.f12006v = true;
                this.f12007w = true;
                this.f11993i = cVar.f11993i;
                this.f11996l = cVar.f11996l;
                this.f12008x = cVar.f12008x;
                this.f12009y = cVar.f12009y;
                this.f12010z = cVar.f12010z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                this.H = cVar.H;
                this.I = cVar.I;
                if (cVar.f11987c == f10) {
                    if (cVar.f11994j) {
                        this.f11995k = new Rect(cVar.f11995k);
                        this.f11994j = true;
                    }
                    if (cVar.f11997m) {
                        this.f11998n = cVar.f11998n;
                        this.f11999o = cVar.f11999o;
                        this.f12000p = cVar.f12000p;
                        this.f12001q = cVar.f12001q;
                        this.f11997m = true;
                    }
                }
                if (cVar.f12002r) {
                    this.f12003s = cVar.f12003s;
                    this.f12002r = true;
                }
                if (cVar.f12004t) {
                    this.f12005u = cVar.f12005u;
                    this.f12004t = true;
                }
                Drawable[] drawableArr = cVar.f11991g;
                this.f11991g = new Drawable[drawableArr.length];
                this.f11992h = cVar.f11992h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f11990f;
                if (sparseArray != null) {
                    this.f11990f = sparseArray.clone();
                } else {
                    this.f11990f = new SparseArray<>(this.f11992h);
                }
                int i10 = this.f11992h;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null) {
                        Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                        if (constantState != null) {
                            this.f11990f.put(i11, constantState);
                        } else {
                            this.f11991g[i11] = drawableArr[i11];
                        }
                    }
                }
                return;
            }
            this.f11991g = new Drawable[10];
            this.f11992h = 0;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f11992h;
            if (i10 >= this.f11991g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f11985a);
            this.f11991g[i10] = drawable;
            this.f11992h++;
            this.f11989e = drawable.getChangingConfigurations() | this.f11989e;
            p();
            this.f11995k = null;
            this.f11994j = false;
            this.f11997m = false;
            this.f12006v = false;
            return i10;
        }

        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f11992h;
                Drawable[] drawableArr = this.f11991g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && drawableArr[i11].canApplyTheme()) {
                        drawableArr[i11].applyTheme(theme);
                        this.f11989e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(theme.getResources());
            }
        }

        public synchronized boolean c() {
            if (this.f12006v) {
                return this.f12007w;
            }
            e();
            this.f12006v = true;
            int i10 = this.f11992h;
            Drawable[] drawableArr = this.f11991g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f12007w = false;
                    return false;
                }
            }
            this.f12007w = true;
            return true;
        }

        @Override
        public boolean canApplyTheme() {
            int i10 = this.f11992h;
            Drawable[] drawableArr = this.f11991g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f11990f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public void d() {
            this.f11997m = true;
            e();
            int i10 = this.f11992h;
            Drawable[] drawableArr = this.f11991g;
            this.f11999o = -1;
            this.f11998n = -1;
            this.f12001q = 0;
            this.f12000p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f11998n) {
                    this.f11998n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f11999o) {
                    this.f11999o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f12000p) {
                    this.f12000p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f12001q) {
                    this.f12001q = minimumHeight;
                }
            }
        }

        public final void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f11990f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f11991g[this.f11990f.keyAt(i10)] = s(this.f11990f.valueAt(i10).newDrawable(this.f11986b));
                }
                this.f11990f = null;
            }
        }

        public final int f() {
            return this.f11991g.length;
        }

        public final Drawable g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f11991g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f11990f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable s10 = s(this.f11990f.valueAt(indexOfKey).newDrawable(this.f11986b));
            this.f11991g[i10] = s10;
            this.f11990f.removeAt(indexOfKey);
            if (this.f11990f.size() == 0) {
                this.f11990f = null;
            }
            return s10;
        }

        @Override
        public int getChangingConfigurations() {
            return this.f11988d | this.f11989e;
        }

        public final int h() {
            return this.f11992h;
        }

        public final int i() {
            if (!this.f11997m) {
                d();
            }
            return this.f11999o;
        }

        public final int j() {
            if (!this.f11997m) {
                d();
            }
            return this.f12001q;
        }

        public final int k() {
            if (!this.f11997m) {
                d();
            }
            return this.f12000p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f11993i) {
                return null;
            }
            Rect rect2 = this.f11995k;
            if (rect2 != null || this.f11994j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f11992h;
            Drawable[] drawableArr = this.f11991g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f11994j = true;
            this.f11995k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f11997m) {
                d();
            }
            return this.f11998n;
        }

        public final int n() {
            if (this.f12002r) {
                return this.f12003s;
            }
            e();
            int i10 = this.f11992h;
            Drawable[] drawableArr = this.f11991g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f12003s = opacity;
            this.f12002r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            System.arraycopy(this.f11991g, 0, drawableArr, 0, i10);
            this.f11991g = drawableArr;
        }

        public void p() {
            this.f12002r = false;
            this.f12004t = false;
        }

        public final boolean q() {
            return this.f11996l;
        }

        public abstract void r();

        public final Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f12010z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f11985a);
            return mutate;
        }

        public final void t(boolean z10) {
            this.f11996l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        public final boolean w(int i10, int i11) {
            int i12 = this.f11992h;
            Drawable[] drawableArr = this.f11991g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i13].setLayoutDirection(i10) : false;
                    if (i13 == i11) {
                        z10 = layoutDirection;
                    }
                }
            }
            this.f12010z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f11993i = z10;
        }

        public final void y(Resources resources) {
            if (resources != null) {
                this.f11986b = resources;
                int f10 = b.f(resources, this.f11987c);
                int i10 = this.f11987c;
                this.f11987c = f10;
                if (i10 != f10) {
                    this.f11997m = false;
                    this.f11994j = false;
                }
            }
        }
    }

    public static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    public void a(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: g.b.a(boolean):void");
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        this.f11980a.b(theme);
    }

    public c b() {
        throw null;
    }

    public int c() {
        return this.P;
    }

    @Override
    public boolean canApplyTheme() {
        return this.f11980a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.V == null) {
            this.V = new C0106b();
        }
        drawable.setCallback(this.V.b(drawable.getCallback()));
        try {
            if (this.f11980a.A <= 0 && this.O) {
                drawable.setAlpha(this.N);
            }
            c cVar = this.f11980a;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    u0.a.n(drawable, cVar.F);
                }
                c cVar2 = this.f11980a;
                if (cVar2.I) {
                    u0.a.o(drawable, cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f11980a.f12008x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            drawable.setAutoMirrored(this.f11980a.C);
            Rect rect = this.f11981b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.V.a());
        }
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11982c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.M;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final boolean e() {
        return isAutoMirrored() && u0.a.e(this) == 1;
    }

    public boolean g(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: g.b.g(int):boolean");
    }

    @Override
    public int getAlpha() {
        return this.N;
    }

    @Override
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f11980a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (!this.f11980a.c()) {
            return null;
        }
        this.f11980a.f11988d = getChangingConfigurations();
        return this.f11980a;
    }

    @Override
    public Drawable getCurrent() {
        return this.f11982c;
    }

    @Override
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f11981b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public int getIntrinsicHeight() {
        if (this.f11980a.q()) {
            return this.f11980a.i();
        }
        Drawable drawable = this.f11982c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public int getIntrinsicWidth() {
        if (this.f11980a.q()) {
            return this.f11980a.m();
        }
        Drawable drawable = this.f11982c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public int getMinimumHeight() {
        if (this.f11980a.q()) {
            return this.f11980a.j();
        }
        Drawable drawable = this.f11982c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public int getMinimumWidth() {
        if (this.f11980a.q()) {
            return this.f11980a.k();
        }
        Drawable drawable = this.f11982c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public int getOpacity() {
        Drawable drawable = this.f11982c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f11980a.n();
    }

    @Override
    public void getOutline(Outline outline) {
        Drawable drawable = this.f11982c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public boolean getPadding(Rect rect) {
        boolean z10;
        Rect l10 = this.f11980a.l();
        if (l10 != null) {
            rect.set(l10);
            z10 = (l10.right | ((l10.left | l10.top) | l10.bottom)) != 0;
        } else {
            Drawable drawable = this.f11982c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return z10;
    }

    public void h(c cVar) {
        this.f11980a = cVar;
        int i10 = this.P;
        if (i10 >= 0) {
            Drawable g10 = cVar.g(i10);
            this.f11982c = g10;
            if (g10 != null) {
                d(g10);
            }
        }
        this.Q = -1;
        this.M = null;
    }

    public final void i(Resources resources) {
        this.f11980a.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f11980a;
        if (cVar != null) {
            cVar.p();
        }
        if (drawable == this.f11982c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public boolean isAutoMirrored() {
        return this.f11980a.C;
    }

    @Override
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.M;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.M = null;
            this.Q = -1;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f11982c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.O) {
                this.f11982c.setAlpha(this.N);
            }
        }
        if (this.U != 0) {
            this.U = 0L;
            z10 = true;
        }
        if (this.T != 0) {
            this.T = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override
    public Drawable mutate() {
        if (!this.R && super.mutate() == this) {
            c b10 = b();
            b10.r();
            h(b10);
            this.R = true;
        }
        return this;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.M;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f11982c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f11980a.w(i10, c());
    }

    @Override
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.M;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f11982c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.M;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f11982c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f11982c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    @Override
    public void setAlpha(int i10) {
        if (!this.O || this.N != i10) {
            this.O = true;
            this.N = i10;
            Drawable drawable = this.f11982c;
            if (drawable == null) {
                return;
            }
            if (this.T == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override
    public void setAutoMirrored(boolean z10) {
        c cVar = this.f11980a;
        if (cVar.C != z10) {
            cVar.C = z10;
            Drawable drawable = this.f11982c;
            if (drawable != null) {
                u0.a.i(drawable, z10);
            }
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f11980a;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f11982c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public void setDither(boolean z10) {
        c cVar = this.f11980a;
        if (cVar.f12008x != z10) {
            cVar.f12008x = z10;
            Drawable drawable = this.f11982c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f11982c;
        if (drawable != null) {
            u0.a.j(drawable, f10, f11);
        }
    }

    @Override
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f11981b;
        if (rect == null) {
            this.f11981b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f11982c;
        if (drawable != null) {
            u0.a.k(drawable, i10, i11, i12, i13);
        }
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f11980a;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            u0.a.n(this.f11982c, colorStateList);
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f11980a;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            u0.a.o(this.f11982c, mode);
        }
    }

    @Override
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.M;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f11982c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f11982c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
