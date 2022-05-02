package p084g;

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
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0487w;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p029c2.C1512b;
import p029c2.C1522h;
import p084g.C4432b;
import p084g.C4437d;
import p096h.C4899b;
import p143k0.C6035e;
import p143k0.C6038h;
import p256s0.C8621i;
import p280u0.AbstractC9412b;

@SuppressLint({"RestrictedAPI"})
public class C4424a extends C4437d implements AbstractC9412b {
    public static final String f14627d0 = C4424a.class.getSimpleName();
    public C4427c f14628Y;
    public AbstractC4431g f14629Z;
    public int f14630a0;
    public int f14631b0;
    public boolean f14632c0;

    public static class C4426b extends AbstractC4431g {
        public final Animatable f14633a;

        public C4426b(Animatable animatable) {
            super();
            this.f14633a = animatable;
        }

        @Override
        public void mo27713c() {
            this.f14633a.start();
        }

        @Override
        public void mo27712d() {
            this.f14633a.stop();
        }
    }

    public static class C4427c extends C4437d.C4438a {
        public C6035e<Long> f14634K;
        public C6038h<Integer> f14635L;

        public C4427c(C4427c cVar, C4424a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f14634K = cVar.f14634K;
                this.f14635L = cVar.f14635L;
                return;
            }
            this.f14634K = new C6035e<>();
            this.f14635L = new C6038h<>();
        }

        public static long m27723D(int i, int i2) {
            return i2 | (i << 32);
        }

        public int m27725B(int[] iArr, Drawable drawable, int i) {
            int z = super.m27670z(iArr, drawable);
            this.f14635L.m21466j(z, Integer.valueOf(i));
            return z;
        }

        public int m27724C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.m27702a(drawable);
            long D = m27723D(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = a;
            this.f14634K.m21510a(D, Long.valueOf(j2 | j));
            if (z) {
                this.f14634K.m21510a(m27723D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        public int m27722E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f14635L.m21470f(i, 0).intValue();
        }

        public int m27721F(int[] iArr) {
            int A = super.m27673A(iArr);
            return A >= 0 ? A : super.m27673A(StateSet.WILD_CARD);
        }

        public int m27720G(int i, int i2) {
            return (int) this.f14634K.m21504g(m27723D(i, i2), -1L).longValue();
        }

        public boolean m27719H(int i, int i2) {
            return (this.f14634K.m21504g(m27723D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        public boolean m27718I(int i, int i2) {
            return (this.f14634K.m21504g(m27723D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override
        public Drawable newDrawable() {
            return new C4424a(this, null);
        }

        @Override
        public void mo27671r() {
            this.f14634K = this.f14634K.clone();
            this.f14635L = this.f14635L.clone();
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            return new C4424a(this, resources);
        }
    }

    public static class C4428d extends AbstractC4431g {
        public final C1512b f14636a;

        public C4428d(C1512b bVar) {
            super();
            this.f14636a = bVar;
        }

        @Override
        public void mo27713c() {
            this.f14636a.start();
        }

        @Override
        public void mo27712d() {
            this.f14636a.stop();
        }
    }

    public static class C4429e extends AbstractC4431g {
        public final ObjectAnimator f14637a;
        public final boolean f14638b;

        public C4429e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C4430f fVar = new C4430f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(fVar.m27717a());
            ofInt.setInterpolator(fVar);
            this.f14638b = z2;
            this.f14637a = ofInt;
        }

        @Override
        public boolean mo27715a() {
            return this.f14638b;
        }

        @Override
        public void mo27714b() {
            this.f14637a.reverse();
        }

        @Override
        public void mo27713c() {
            this.f14637a.start();
        }

        @Override
        public void mo27712d() {
            this.f14637a.cancel();
        }
    }

    public static class C4430f implements TimeInterpolator {
        public int[] f14639a;
        public int f14640b;
        public int f14641c;

        public C4430f(AnimationDrawable animationDrawable, boolean z) {
            m27716b(animationDrawable, z);
        }

        public int m27717a() {
            return this.f14641c;
        }

        public int m27716b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f14640b = numberOfFrames;
            int[] iArr = this.f14639a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f14639a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f14639a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f14641c = i;
            return i;
        }

        @Override
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f14641c) + 0.5f);
            int i2 = this.f14640b;
            int[] iArr = this.f14639a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f14641c : 0.0f);
        }
    }

    public static abstract class AbstractC4431g {
        public AbstractC4431g() {
        }

        public boolean mo27715a() {
            return false;
        }

        public void mo27714b() {
        }

        public abstract void mo27713c();

        public abstract void mo27712d();
    }

    public C4424a() {
        this(null, null);
    }

    public static C4424a m27733m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C4424a aVar = new C4424a();
            aVar.m27732n(context, resources, xmlPullParser, attributeSet, theme);
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
    public void mo27676h(C4432b.AbstractC4435c cVar) {
        super.mo27676h(cVar);
        if (cVar instanceof C4427c) {
            this.f14628Y = (C4427c) cVar;
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
        AbstractC4431g gVar = this.f14629Z;
        if (gVar != null) {
            gVar.mo27712d();
            this.f14629Z = null;
            m27706g(this.f14630a0);
            this.f14630a0 = -1;
            this.f14631b0 = -1;
        }
    }

    public C4427c mo27675j() {
        return new C4427c(this.f14628Y, this, null);
    }

    @Override
    public Drawable mutate() {
        if (!this.f14632c0 && super.mutate() == this) {
            this.f14628Y.mo27671r();
            this.f14632c0 = true;
        }
        return this;
    }

    public void m27732n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k = C8621i.m11896k(resources, theme, attributeSet, C4899b.f16724a);
        setVisible(k.getBoolean(C4899b.f16726c, true), true);
        m27726t(k);
        m27705i(resources);
        k.recycle();
        m27731o(context, resources, xmlPullParser, attributeSet, theme);
        m27730p();
    }

    public final void m27731o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                        m27729q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m27728r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override
    public boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        int F = this.f14628Y.m27721F(iArr);
        boolean z = F != m27710c() && (m27727s(F) || m27706g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public final void m27730p() {
        onStateChange(getState());
    }

    public final int m27729q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k = C8621i.m11896k(resources, theme, attributeSet, C4899b.f16731h);
        int resourceId = k.getResourceId(C4899b.f16732i, 0);
        int resourceId2 = k.getResourceId(C4899b.f16733j, -1);
        Drawable j = resourceId2 > 0 ? C0487w.m41062h().m41060j(context, resourceId2) : null;
        k.recycle();
        int[] k2 = m27674k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                j = C1522h.m36549c(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j != null) {
            return this.f14628Y.m27725B(k2, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    public final int m27728r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k = C8621i.m11896k(resources, theme, attributeSet, C4899b.f16734k);
        int resourceId = k.getResourceId(C4899b.f16737n, -1);
        int resourceId2 = k.getResourceId(C4899b.f16736m, -1);
        int resourceId3 = k.getResourceId(C4899b.f16735l, -1);
        Drawable j = resourceId3 > 0 ? C0487w.m41062h().m41060j(context, resourceId3) : null;
        boolean z = k.getBoolean(C4899b.f16738o, false);
        k.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                j = C1512b.m36582a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f14628Y.m27724C(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    public final boolean m27727s(int i) {
        int i2;
        int G;
        AbstractC4431g gVar;
        AbstractC4431g gVar2 = this.f14629Z;
        if (gVar2 == null) {
            i2 = m27710c();
        } else if (i == this.f14630a0) {
            return true;
        } else {
            if (i != this.f14631b0 || !gVar2.mo27715a()) {
                i2 = this.f14630a0;
                gVar2.mo27712d();
            } else {
                gVar2.mo27714b();
                this.f14630a0 = this.f14631b0;
                this.f14631b0 = i;
                return true;
            }
        }
        this.f14629Z = null;
        this.f14631b0 = -1;
        this.f14630a0 = -1;
        C4427c cVar = this.f14628Y;
        int E = cVar.m27722E(i2);
        int E2 = cVar.m27722E(i);
        if (E2 == 0 || E == 0 || (G = cVar.m27720G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.m27718I(E, E2);
        m27706g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C4429e((AnimationDrawable) current, cVar.m27719H(E, E2), I);
        } else if (current instanceof C1512b) {
            gVar = new C4428d((C1512b) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C4426b((Animatable) current);
            }
            return false;
        }
        gVar.mo27713c();
        this.f14629Z = gVar;
        this.f14631b0 = i2;
        this.f14630a0 = i;
        return true;
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override
    public void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override
    public void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override
    public void setDither(boolean z) {
        super.setDither(z);
    }

    @Override
    public void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
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
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC4431g gVar = this.f14629Z;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo27713c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public final void m27726t(TypedArray typedArray) {
        C4427c cVar = this.f14628Y;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f14669d |= typedArray.getChangingConfigurations();
        }
        cVar.m27681x(typedArray.getBoolean(C4899b.f16727d, cVar.f14674i));
        cVar.m27685t(typedArray.getBoolean(C4899b.f16728e, cVar.f14677l));
        cVar.m27684u(typedArray.getInt(C4899b.f16729f, cVar.f14657A));
        cVar.m27683v(typedArray.getInt(C4899b.f16730g, cVar.f14658B));
        setDither(typedArray.getBoolean(C4899b.f16725b, cVar.f14689x));
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public C4424a(C4427c cVar, Resources resources) {
        super(null);
        this.f14630a0 = -1;
        this.f14631b0 = -1;
        mo27676h(new C4427c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
