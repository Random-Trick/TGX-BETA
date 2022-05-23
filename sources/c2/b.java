package c2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import s0.i;

public class b extends f implements Animatable {
    public ArgbEvaluator M;
    public Animator.AnimatorListener N;
    public ArrayList<Object> O;
    public final Drawable.Callback P;
    public C0063b f4326b;
    public Context f4327c;

    public class a implements Drawable.Callback {
        public a() {
        }

        @Override
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            b.this.scheduleSelf(runnable, j10);
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    public static class C0063b extends Drawable.ConstantState {
        public int f4329a;
        public g f4330b;
        public AnimatorSet f4331c;
        public ArrayList<Animator> f4332d;
        public k0.a<Animator, String> f4333e;

        public C0063b(Context context, C0063b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f4329a = bVar.f4329a;
                g gVar = bVar.f4330b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    if (resources != null) {
                        this.f4330b = (g) constantState.newDrawable(resources);
                    } else {
                        this.f4330b = (g) constantState.newDrawable();
                    }
                    g gVar2 = (g) this.f4330b.mutate();
                    this.f4330b = gVar2;
                    gVar2.setCallback(callback);
                    this.f4330b.setBounds(bVar.f4330b.getBounds());
                    this.f4330b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.f4332d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4332d = new ArrayList<>(size);
                    this.f4333e = new k0.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = bVar.f4332d.get(i10);
                        Animator clone = animator.clone();
                        String str = bVar.f4333e.get(animator);
                        clone.setTarget(this.f4330b.d(str));
                        this.f4332d.add(clone);
                        this.f4333e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f4331c == null) {
                this.f4331c = new AnimatorSet();
            }
            this.f4331c.playTogether(this.f4332d);
        }

        @Override
        public int getChangingConfigurations() {
            return this.f4329a;
        }

        @Override
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public b() {
        this(null, null, null);
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            u0.a.a(drawable, theme);
        }
    }

    public final void b(String str, Animator animator) {
        animator.setTarget(this.f4326b.f4330b.d(str));
        C0063b bVar = this.f4326b;
        if (bVar.f4332d == null) {
            bVar.f4332d = new ArrayList<>();
            this.f4326b.f4333e = new k0.a<>();
        }
        this.f4326b.f4332d.add(animator);
        this.f4326b.f4333e.put(animator, str);
    }

    @Override
    public boolean canApplyTheme() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return u0.a.b(drawable);
        }
        return false;
    }

    @Override
    public void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4326b.f4330b.draw(canvas);
        if (this.f4326b.f4331c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override
    public int getAlpha() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return u0.a.c(drawable);
        }
        return this.f4326b.f4330b.getAlpha();
    }

    @Override
    public int getChangingConfigurations() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4326b.f4329a;
    }

    @Override
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return u0.a.d(drawable);
        }
        return this.f4326b.f4330b.getColorFilter();
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        if (this.f4337a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f4337a.getConstantState());
    }

    @Override
    public Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f4326b.f4330b.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f4326b.f4330b.getIntrinsicWidth();
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
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f4326b.f4330b.getOpacity();
    }

    @Override
    public boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override
    public int[] getState() {
        return super.getState();
    }

    @Override
    public Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            u0.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k10 = i.k(resources, theme, attributeSet, c2.a.f4318e);
                    int resourceId = k10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g b10 = g.b(resources, resourceId, theme);
                        b10.h(false);
                        b10.setCallback(this.P);
                        g gVar = this.f4326b.f4330b;
                        if (gVar != null) {
                            gVar.setCallback(null);
                        }
                        this.f4326b.f4330b = b10;
                    }
                    k10.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, c2.a.f4319f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4327c;
                        if (context != null) {
                            b(string, d.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f4326b.a();
    }

    @Override
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return u0.a.g(drawable);
        }
        return this.f4326b.f4330b.isAutoMirrored();
    }

    @Override
    public boolean isRunning() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f4326b.f4331c.isRunning();
    }

    @Override
    public boolean isStateful() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f4326b.f4330b.isStateful();
    }

    @Override
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override
    public Drawable mutate() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4326b.f4330b.setBounds(rect);
        }
    }

    @Override
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f4326b.f4330b.setLevel(i10);
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f4326b.f4330b.setState(iArr);
    }

    @Override
    public void setAlpha(int i10) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f4326b.f4330b.setAlpha(i10);
        }
    }

    @Override
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            u0.a.i(drawable, z10);
        } else {
            this.f4326b.f4330b.setAutoMirrored(z10);
        }
    }

    @Override
    public void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override
    public void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
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
    public boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override
    public void setTint(int i10) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            u0.a.m(drawable, i10);
        } else {
            this.f4326b.f4330b.setTint(i10);
        }
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            u0.a.n(drawable, colorStateList);
        } else {
            this.f4326b.f4330b.setTintList(colorStateList);
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            u0.a.o(drawable, mode);
        } else {
            this.f4326b.f4330b.setTintMode(mode);
        }
    }

    @Override
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f4326b.f4330b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override
    public void start() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f4326b.f4331c.isStarted()) {
            this.f4326b.f4331c.start();
            invalidateSelf();
        }
    }

    @Override
    public void stop() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4326b.f4331c.end();
        }
    }

    public b(Context context) {
        this(context, null, null);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4326b.f4330b.setColorFilter(colorFilter);
        }
    }

    public static class c extends Drawable.ConstantState {
        public final Drawable.ConstantState f4334a;

        public c(Drawable.ConstantState constantState) {
            this.f4334a = constantState;
        }

        @Override
        public boolean canApplyTheme() {
            return this.f4334a.canApplyTheme();
        }

        @Override
        public int getChangingConfigurations() {
            return this.f4334a.getChangingConfigurations();
        }

        @Override
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f4334a.newDrawable();
            bVar.f4337a = newDrawable;
            newDrawable.setCallback(bVar.P);
            return bVar;
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f4334a.newDrawable(resources);
            bVar.f4337a = newDrawable;
            newDrawable.setCallback(bVar.P);
            return bVar;
        }

        @Override
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f4334a.newDrawable(resources, theme);
            bVar.f4337a = newDrawable;
            newDrawable.setCallback(bVar.P);
            return bVar;
        }
    }

    public b(Context context, C0063b bVar, Resources resources) {
        this.M = null;
        this.N = null;
        this.O = null;
        a aVar = new a();
        this.P = aVar;
        this.f4327c = context;
        if (bVar != null) {
            this.f4326b = bVar;
        } else {
            this.f4326b = new C0063b(context, bVar, aVar, resources);
        }
    }

    @Override
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
