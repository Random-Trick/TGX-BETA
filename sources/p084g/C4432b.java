package p084g;

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
import p280u0.C9411a;

public class C4432b extends Drawable implements Drawable.Callback {
    public Drawable f14642M;
    public boolean f14644O;
    public boolean f14647R;
    public Runnable f14648S;
    public long f14649T;
    public long f14650U;
    public C4434b f14651V;
    public AbstractC4435c f14652a;
    public Rect f14653b;
    public Drawable f14654c;
    public int f14643N = 255;
    public int f14645P = -1;
    public int f14646Q = -1;

    public class RunnableC4433a implements Runnable {
        public RunnableC4433a() {
        }

        @Override
        public void run() {
            C4432b.this.m27713a(true);
            C4432b.this.invalidateSelf();
        }
    }

    public static class C4434b implements Drawable.Callback {
        public Drawable.Callback f14656a;

        public Drawable.Callback m27706a() {
            Drawable.Callback callback = this.f14656a;
            this.f14656a = null;
            return callback;
        }

        public C4434b m27705b(Drawable.Callback callback) {
            this.f14656a = callback;
            return this;
        }

        @Override
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f14656a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f14656a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class AbstractC4435c extends Drawable.ConstantState {
        public int f14657A;
        public int f14658B;
        public boolean f14659C;
        public ColorFilter f14660D;
        public boolean f14661E;
        public ColorStateList f14662F;
        public PorterDuff.Mode f14663G;
        public boolean f14664H;
        public boolean f14665I;
        public final C4432b f14666a;
        public Resources f14667b;
        public int f14668c;
        public int f14669d;
        public int f14670e;
        public SparseArray<Drawable.ConstantState> f14671f;
        public Drawable[] f14672g;
        public int f14673h;
        public boolean f14674i;
        public boolean f14675j;
        public Rect f14676k;
        public boolean f14677l;
        public boolean f14678m;
        public int f14679n;
        public int f14680o;
        public int f14681p;
        public int f14682q;
        public boolean f14683r;
        public int f14684s;
        public boolean f14685t;
        public boolean f14686u;
        public boolean f14687v;
        public boolean f14688w;
        public boolean f14689x;
        public boolean f14690y;
        public int f14691z;

        public AbstractC4435c(AbstractC4435c cVar, C4432b bVar, Resources resources) {
            Resources resources2;
            this.f14668c = 160;
            this.f14674i = false;
            this.f14677l = false;
            this.f14689x = true;
            this.f14657A = 0;
            this.f14658B = 0;
            this.f14666a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = cVar != null ? cVar.f14667b : null;
            }
            this.f14667b = resources2;
            int f = C4432b.m27709f(resources, cVar != null ? cVar.f14668c : 0);
            this.f14668c = f;
            if (cVar != null) {
                this.f14669d = cVar.f14669d;
                this.f14670e = cVar.f14670e;
                this.f14687v = true;
                this.f14688w = true;
                this.f14674i = cVar.f14674i;
                this.f14677l = cVar.f14677l;
                this.f14689x = cVar.f14689x;
                this.f14690y = cVar.f14690y;
                this.f14691z = cVar.f14691z;
                this.f14657A = cVar.f14657A;
                this.f14658B = cVar.f14658B;
                this.f14659C = cVar.f14659C;
                this.f14660D = cVar.f14660D;
                this.f14661E = cVar.f14661E;
                this.f14662F = cVar.f14662F;
                this.f14663G = cVar.f14663G;
                this.f14664H = cVar.f14664H;
                this.f14665I = cVar.f14665I;
                if (cVar.f14668c == f) {
                    if (cVar.f14675j) {
                        this.f14676k = new Rect(cVar.f14676k);
                        this.f14675j = true;
                    }
                    if (cVar.f14678m) {
                        this.f14679n = cVar.f14679n;
                        this.f14680o = cVar.f14680o;
                        this.f14681p = cVar.f14681p;
                        this.f14682q = cVar.f14682q;
                        this.f14678m = true;
                    }
                }
                if (cVar.f14683r) {
                    this.f14684s = cVar.f14684s;
                    this.f14683r = true;
                }
                if (cVar.f14685t) {
                    this.f14686u = cVar.f14686u;
                    this.f14685t = true;
                }
                Drawable[] drawableArr = cVar.f14672g;
                this.f14672g = new Drawable[drawableArr.length];
                this.f14673h = cVar.f14673h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f14671f;
                if (sparseArray != null) {
                    this.f14671f = sparseArray.clone();
                } else {
                    this.f14671f = new SparseArray<>(this.f14673h);
                }
                int i = this.f14673h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f14671f.put(i2, constantState);
                        } else {
                            this.f14672g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f14672g = new Drawable[10];
            this.f14673h = 0;
        }

        public final int m27704a(Drawable drawable) {
            int i = this.f14673h;
            if (i >= this.f14672g.length) {
                mo27674o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f14666a);
            this.f14672g[i] = drawable;
            this.f14673h++;
            this.f14670e = drawable.getChangingConfigurations() | this.f14670e;
            m27690p();
            this.f14676k = null;
            this.f14675j = false;
            this.f14678m = false;
            this.f14687v = false;
            return i;
        }

        public final void m27703b(Resources.Theme theme) {
            if (theme != null) {
                m27700e();
                int i = this.f14673h;
                Drawable[] drawableArr = this.f14672g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f14670e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m27682y(theme.getResources());
            }
        }

        public synchronized boolean m27702c() {
            if (this.f14687v) {
                return this.f14688w;
            }
            m27700e();
            this.f14687v = true;
            int i = this.f14673h;
            Drawable[] drawableArr = this.f14672g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f14688w = false;
                    return false;
                }
            }
            this.f14688w = true;
            return true;
        }

        @Override
        public boolean canApplyTheme() {
            int i = this.f14673h;
            Drawable[] drawableArr = this.f14672g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f14671f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public void m27701d() {
            this.f14678m = true;
            m27700e();
            int i = this.f14673h;
            Drawable[] drawableArr = this.f14672g;
            this.f14680o = -1;
            this.f14679n = -1;
            this.f14682q = 0;
            this.f14681p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f14679n) {
                    this.f14679n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f14680o) {
                    this.f14680o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f14681p) {
                    this.f14681p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f14682q) {
                    this.f14682q = minimumHeight;
                }
            }
        }

        public final void m27700e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f14671f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f14672g[this.f14671f.keyAt(i)] = m27688s(this.f14671f.valueAt(i).newDrawable(this.f14667b));
                }
                this.f14671f = null;
            }
        }

        public final int m27699f() {
            return this.f14672g.length;
        }

        public final Drawable m27698g(int i) {
            int indexOfKey;
            Drawable drawable = this.f14672g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f14671f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = m27688s(this.f14671f.valueAt(indexOfKey).newDrawable(this.f14667b));
            this.f14672g[i] = s;
            this.f14671f.removeAt(indexOfKey);
            if (this.f14671f.size() == 0) {
                this.f14671f = null;
            }
            return s;
        }

        @Override
        public int getChangingConfigurations() {
            return this.f14669d | this.f14670e;
        }

        public final int m27697h() {
            return this.f14673h;
        }

        public final int m27696i() {
            if (!this.f14678m) {
                m27701d();
            }
            return this.f14680o;
        }

        public final int m27695j() {
            if (!this.f14678m) {
                m27701d();
            }
            return this.f14682q;
        }

        public final int m27694k() {
            if (!this.f14678m) {
                m27701d();
            }
            return this.f14681p;
        }

        public final Rect m27693l() {
            Rect rect = null;
            if (this.f14674i) {
                return null;
            }
            Rect rect2 = this.f14676k;
            if (rect2 != null || this.f14675j) {
                return rect2;
            }
            m27700e();
            Rect rect3 = new Rect();
            int i = this.f14673h;
            Drawable[] drawableArr = this.f14672g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f14675j = true;
            this.f14676k = rect;
            return rect;
        }

        public final int m27692m() {
            if (!this.f14678m) {
                m27701d();
            }
            return this.f14679n;
        }

        public final int m27691n() {
            if (this.f14683r) {
                return this.f14684s;
            }
            m27700e();
            int i = this.f14673h;
            Drawable[] drawableArr = this.f14672g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f14684s = opacity;
            this.f14683r = true;
            return opacity;
        }

        public void mo27674o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f14672g, 0, drawableArr, 0, i);
            this.f14672g = drawableArr;
        }

        public void m27690p() {
            this.f14683r = false;
            this.f14685t = false;
        }

        public final boolean m27689q() {
            return this.f14677l;
        }

        public abstract void mo27673r();

        public final Drawable m27688s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f14691z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f14666a);
            return mutate;
        }

        public final void m27687t(boolean z) {
            this.f14677l = z;
        }

        public final void m27686u(int i) {
            this.f14657A = i;
        }

        public final void m27685v(int i) {
            this.f14658B = i;
        }

        public final boolean m27684w(int i, int i2) {
            int i3 = this.f14673h;
            Drawable[] drawableArr = this.f14672g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f14691z = i;
            return z;
        }

        public final void m27683x(boolean z) {
            this.f14674i = z;
        }

        public final void m27682y(Resources resources) {
            if (resources != null) {
                this.f14667b = resources;
                int f = C4432b.m27709f(resources, this.f14668c);
                int i = this.f14668c;
                this.f14668c = f;
                if (i != f) {
                    this.f14678m = false;
                    this.f14675j = false;
                }
            }
        }
    }

    public static int m27709f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    public void m27713a(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: p084g.C4432b.m27713a(boolean):void");
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        this.f14652a.m27703b(theme);
    }

    public AbstractC4435c mo27679b() {
        throw null;
    }

    public int m27712c() {
        return this.f14645P;
    }

    @Override
    public boolean canApplyTheme() {
        return this.f14652a.canApplyTheme();
    }

    public final void m27711d(Drawable drawable) {
        if (this.f14651V == null) {
            this.f14651V = new C4434b();
        }
        drawable.setCallback(this.f14651V.m27705b(drawable.getCallback()));
        try {
            if (this.f14652a.f14657A <= 0 && this.f14644O) {
                drawable.setAlpha(this.f14643N);
            }
            AbstractC4435c cVar = this.f14652a;
            if (cVar.f14661E) {
                drawable.setColorFilter(cVar.f14660D);
            } else {
                if (cVar.f14664H) {
                    C9411a.m8754n(drawable, cVar.f14662F);
                }
                AbstractC4435c cVar2 = this.f14652a;
                if (cVar2.f14665I) {
                    C9411a.m8753o(drawable, cVar2.f14663G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f14652a.f14689x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i >= 19) {
                drawable.setAutoMirrored(this.f14652a.f14659C);
            }
            Rect rect = this.f14653b;
            if (i >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f14651V.m27706a());
        }
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f14654c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f14642M;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final boolean m27710e() {
        return isAutoMirrored() && C9411a.m8763e(this) == 1;
    }

    public boolean m27708g(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: p084g.C4432b.m27708g(int):boolean");
    }

    @Override
    public int getAlpha() {
        return this.f14643N;
    }

    @Override
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f14652a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (!this.f14652a.m27702c()) {
            return null;
        }
        this.f14652a.f14669d = getChangingConfigurations();
        return this.f14652a;
    }

    @Override
    public Drawable getCurrent() {
        return this.f14654c;
    }

    @Override
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f14653b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public int getIntrinsicHeight() {
        if (this.f14652a.m27689q()) {
            return this.f14652a.m27696i();
        }
        Drawable drawable = this.f14654c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public int getIntrinsicWidth() {
        if (this.f14652a.m27689q()) {
            return this.f14652a.m27692m();
        }
        Drawable drawable = this.f14654c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public int getMinimumHeight() {
        if (this.f14652a.m27689q()) {
            return this.f14652a.m27695j();
        }
        Drawable drawable = this.f14654c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public int getMinimumWidth() {
        if (this.f14652a.m27689q()) {
            return this.f14652a.m27694k();
        }
        Drawable drawable = this.f14654c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public int getOpacity() {
        Drawable drawable = this.f14654c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f14652a.m27691n();
    }

    @Override
    public void getOutline(Outline outline) {
        Drawable drawable = this.f14654c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f14652a.m27693l();
        if (l != null) {
            rect.set(l);
            z = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.f14654c;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (m27710e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void mo27678h(AbstractC4435c cVar) {
        this.f14652a = cVar;
        int i = this.f14645P;
        if (i >= 0) {
            Drawable g = cVar.m27698g(i);
            this.f14654c = g;
            if (g != null) {
                m27711d(g);
            }
        }
        this.f14646Q = -1;
        this.f14642M = null;
    }

    public final void m27707i(Resources resources) {
        this.f14652a.m27682y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        AbstractC4435c cVar = this.f14652a;
        if (cVar != null) {
            cVar.m27690p();
        }
        if (drawable == this.f14654c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public boolean isAutoMirrored() {
        return this.f14652a.f14659C;
    }

    @Override
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f14642M;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f14642M = null;
            this.f14646Q = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f14654c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f14644O) {
                this.f14654c.setAlpha(this.f14643N);
            }
        }
        if (this.f14650U != 0) {
            this.f14650U = 0L;
            z = true;
        }
        if (this.f14649T != 0) {
            this.f14649T = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override
    public Drawable mutate() {
        if (!this.f14647R && super.mutate() == this) {
            AbstractC4435c b = mo27679b();
            b.mo27673r();
            mo27678h(b);
            this.f14647R = true;
        }
        return this;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14642M;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f14654c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public boolean onLayoutDirectionChanged(int i) {
        return this.f14652a.m27684w(i, m27712c());
    }

    @Override
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f14642M;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f14654c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f14642M;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f14654c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f14654c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override
    public void setAlpha(int i) {
        if (!this.f14644O || this.f14643N != i) {
            this.f14644O = true;
            this.f14643N = i;
            Drawable drawable = this.f14654c;
            if (drawable == null) {
                return;
            }
            if (this.f14649T == 0) {
                drawable.setAlpha(i);
            } else {
                m27713a(false);
            }
        }
    }

    @Override
    public void setAutoMirrored(boolean z) {
        AbstractC4435c cVar = this.f14652a;
        if (cVar.f14659C != z) {
            cVar.f14659C = z;
            Drawable drawable = this.f14654c;
            if (drawable != null) {
                C9411a.m8759i(drawable, z);
            }
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC4435c cVar = this.f14652a;
        cVar.f14661E = true;
        if (cVar.f14660D != colorFilter) {
            cVar.f14660D = colorFilter;
            Drawable drawable = this.f14654c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public void setDither(boolean z) {
        AbstractC4435c cVar = this.f14652a;
        if (cVar.f14689x != z) {
            cVar.f14689x = z;
            Drawable drawable = this.f14654c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f14654c;
        if (drawable != null) {
            C9411a.m8758j(drawable, f, f2);
        }
    }

    @Override
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f14653b;
        if (rect == null) {
            this.f14653b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f14654c;
        if (drawable != null) {
            C9411a.m8757k(drawable, i, i2, i3, i4);
        }
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        AbstractC4435c cVar = this.f14652a;
        cVar.f14664H = true;
        if (cVar.f14662F != colorStateList) {
            cVar.f14662F = colorStateList;
            C9411a.m8754n(this.f14654c, colorStateList);
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC4435c cVar = this.f14652a;
        cVar.f14665I = true;
        if (cVar.f14663G != mode) {
            cVar.f14663G = mode;
            C9411a.m8753o(this.f14654c, mode);
        }
    }

    @Override
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f14642M;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f14654c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f14654c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
