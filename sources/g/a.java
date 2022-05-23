package g;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.w;
import g.b;
import g.d;
import k0.h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.i;

@SuppressLint({"RestrictedAPI"})
public class a extends g.d implements u0.b {
    public static final String f11969d0 = a.class.getSimpleName();
    public c Y;
    public g Z;
    public int f11970a0;
    public int f11971b0;
    public boolean f11972c0;

    public static class b extends g {
        public final Animatable f11973a;

        public b(Animatable animatable) {
            super();
            this.f11973a = animatable;
        }

        @Override
        public void c() {
            this.f11973a.start();
        }

        @Override
        public void d() {
            this.f11973a.stop();
        }
    }

    public static class c extends d.a {
        public k0.e<Long> K;
        public h<Integer> L;

        public c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new k0.e<>();
            this.L = new h<>();
        }

        public static long D(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        public int B(int[] iArr, Drawable drawable, int i10) {
            int z10 = super.z(iArr, drawable);
            this.L.j(z10, Integer.valueOf(i10));
            return z10;
        }

        public int C(int i10, int i11, Drawable drawable, boolean z10) {
            int a10 = super.a(drawable);
            long D = D(i10, i11);
            long j10 = z10 ? 8589934592L : 0L;
            long j11 = a10;
            this.K.a(D, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.a(D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return a10;
        }

        public int E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.f(i10, 0).intValue();
        }

        public int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        public int G(int i10, int i11) {
            return (int) this.K.g(D(i10, i11), -1L).longValue();
        }

        public boolean H(int i10, int i11) {
            return (this.K.g(D(i10, i11), -1L).longValue() & 4294967296L) != 0;
        }

        public boolean I(int i10, int i11) {
            return (this.K.g(D(i10, i11), -1L).longValue() & 8589934592L) != 0;
        }

        @Override
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    public static class d extends g {
        public final c2.b f11974a;

        public d(c2.b bVar) {
            super();
            this.f11974a = bVar;
        }

        @Override
        public void c() {
            this.f11974a.start();
        }

        @Override
        public void d() {
            this.f11974a.stop();
        }
    }

    public static class e extends g {
        public final ObjectAnimator f11975a;
        public final boolean f11976b;

        public e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f11976b = z11;
            this.f11975a = ofInt;
        }

        @Override
        public boolean a() {
            return this.f11976b;
        }

        @Override
        public void b() {
            this.f11975a.reverse();
        }

        @Override
        public void c() {
            this.f11975a.start();
        }

        @Override
        public void d() {
            this.f11975a.cancel();
        }
    }

    public static class f implements TimeInterpolator {
        public int[] f11977a;
        public int f11978b;
        public int f11979c;

        public f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        public int a() {
            return this.f11979c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f11978b = numberOfFrames;
            int[] iArr = this.f11977a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f11977a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f11977a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f11979c = i10;
            return i10;
        }

        @Override
        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f11979c) + 0.5f);
            int i11 = this.f11978b;
            int[] iArr = this.f11977a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f11979c : 0.0f);
        }
    }

    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override
    public boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public int getAlpha() {
        return super.getAlpha();
    }

    @Override
    public int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override
    public Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override
    public void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override
    public int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override
    public int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override
    public int getOpacity() {
        return super.getOpacity();
    }

    @Override
    public void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override
    public boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override
    public void h(b.c cVar) {
        super.h(cVar);
        if (cVar instanceof c) {
            this.Y = (c) cVar;
        }
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override
    public boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override
    public boolean isStateful() {
        return true;
    }

    @Override
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.Z;
        if (gVar != null) {
            gVar.d();
            this.Z = null;
            g(this.f11970a0);
            this.f11970a0 = -1;
            this.f11971b0 = -1;
        }
    }

    public c j() {
        return new c(this.Y, this, null);
    }

    @Override
    public Drawable mutate() {
        if (!this.f11972c0 && super.mutate() == this) {
            this.Y.r();
            this.f11972c0 = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k10 = i.k(resources, theme, attributeSet, h.b.f12393a);
        setVisible(k10.getBoolean(h.b.f12395c, true), true);
        t(k10);
        i(resources);
        k10.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    public final void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override
    public boolean onLayoutDirectionChanged(int i10) {
        return super.onLayoutDirectionChanged(i10);
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        int F = this.Y.F(iArr);
        boolean z10 = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z10 | current.setState(iArr) : z10;
    }

    public final void p() {
        onStateChange(getState());
    }

    public final int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k10 = i.k(resources, theme, attributeSet, h.b.f12400h);
        int resourceId = k10.getResourceId(h.b.f12401i, 0);
        int resourceId2 = k10.getResourceId(h.b.f12402j, -1);
        Drawable j10 = resourceId2 > 0 ? w.h().j(context, resourceId2) : null;
        k10.recycle();
        int[] k11 = k(attributeSet);
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                j10 = c2.g.c(resources, xmlPullParser, attributeSet, theme);
            } else {
                j10 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (j10 != null) {
            return this.Y.B(k11, j10, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    public final int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k10 = i.k(resources, theme, attributeSet, h.b.f12403k);
        int resourceId = k10.getResourceId(h.b.f12406n, -1);
        int resourceId2 = k10.getResourceId(h.b.f12405m, -1);
        int resourceId3 = k10.getResourceId(h.b.f12404l, -1);
        Drawable j10 = resourceId3 > 0 ? w.h().j(context, resourceId3) : null;
        boolean z10 = k10.getBoolean(h.b.f12407o, false);
        k10.recycle();
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                j10 = c2.b.a(context, resources, xmlPullParser, attributeSet, theme);
            } else {
                j10 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (j10 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.Y.C(resourceId, resourceId2, j10, z10);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    public final boolean s(int i10) {
        int i11;
        int G;
        g gVar;
        g gVar2 = this.Z;
        if (gVar2 == null) {
            i11 = c();
        } else if (i10 == this.f11970a0) {
            return true;
        } else {
            if (i10 != this.f11971b0 || !gVar2.a()) {
                i11 = this.f11970a0;
                gVar2.d();
            } else {
                gVar2.b();
                this.f11970a0 = this.f11971b0;
                this.f11971b0 = i10;
                return true;
            }
        }
        this.Z = null;
        this.f11971b0 = -1;
        this.f11970a0 = -1;
        c cVar = this.Y;
        int E = cVar.E(i11);
        int E2 = cVar.E(i10);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof c2.b) {
            gVar = new d((c2.b) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.Z = gVar;
        this.f11971b0 = i11;
        this.f11970a0 = i10;
        return true;
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        super.scheduleDrawable(drawable, runnable, j10);
    }

    @Override
    public void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override
    public void setAutoMirrored(boolean z10) {
        super.setAutoMirrored(z10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override
    public void setDither(boolean z10) {
        super.setDither(z10);
    }

    @Override
    public void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.Z;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public final void t(TypedArray typedArray) {
        c cVar = this.Y;
        cVar.f11988d |= typedArray.getChangingConfigurations();
        cVar.x(typedArray.getBoolean(h.b.f12396d, cVar.f11993i));
        cVar.t(typedArray.getBoolean(h.b.f12397e, cVar.f11996l));
        cVar.u(typedArray.getInt(h.b.f12398f, cVar.A));
        cVar.v(typedArray.getInt(h.b.f12399g, cVar.B));
        setDither(typedArray.getBoolean(h.b.f12394b, cVar.f12008x));
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public a(c cVar, Resources resources) {
        super(null);
        this.f11970a0 = -1;
        this.f11971b0 = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
