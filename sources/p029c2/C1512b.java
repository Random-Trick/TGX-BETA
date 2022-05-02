package p029c2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
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
import p143k0.C6024a;
import p256s0.C8621i;
import p280u0.C9411a;

public class C1512b extends AbstractC1521g implements Animatable {
    public ArgbEvaluator f5394M;
    public Animator.AnimatorListener f5395N;
    public ArrayList<Object> f5396O;
    public final Drawable.Callback f5397P;
    public C1514b f5398b;
    public Context f5399c;

    public class C1513a implements Drawable.Callback {
        public C1513a() {
        }

        @Override
        public void invalidateDrawable(Drawable drawable) {
            C1512b.this.invalidateSelf();
        }

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1512b.this.scheduleSelf(runnable, j);
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1512b.this.unscheduleSelf(runnable);
        }
    }

    public static class C1514b extends Drawable.ConstantState {
        public int f5401a;
        public C1522h f5402b;
        public AnimatorSet f5403c;
        public ArrayList<Animator> f5404d;
        public C6024a<Animator, String> f5405e;

        public C1514b(Context context, C1514b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f5401a = bVar.f5401a;
                C1522h hVar = bVar.f5402b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f5402b = (C1522h) constantState.newDrawable(resources);
                    } else {
                        this.f5402b = (C1522h) constantState.newDrawable();
                    }
                    C1522h hVar2 = (C1522h) this.f5402b.mutate();
                    this.f5402b = hVar2;
                    hVar2.setCallback(callback);
                    this.f5402b.setBounds(bVar.f5402b.getBounds());
                    this.f5402b.m36547h(false);
                }
                ArrayList<Animator> arrayList = bVar.f5404d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f5404d = new ArrayList<>(size);
                    this.f5405e = new C6024a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f5404d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f5405e.get(animator);
                        clone.setTarget(this.f5402b.m36551d(str));
                        this.f5404d.add(clone);
                        this.f5405e.put(clone, str);
                    }
                    m36582a();
                }
            }
        }

        public void m36582a() {
            if (this.f5403c == null) {
                this.f5403c = new AnimatorSet();
            }
            this.f5403c.playTogether(this.f5404d);
        }

        @Override
        public int getChangingConfigurations() {
            return this.f5401a;
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

    public C1512b() {
        this(null, null, null);
    }

    public static C1512b m36585a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1512b bVar = new C1512b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8767a(drawable, theme);
        }
    }

    public final void m36584b(String str, Animator animator) {
        animator.setTarget(this.f5398b.f5402b.m36551d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m36583c(animator);
        }
        C1514b bVar = this.f5398b;
        if (bVar.f5404d == null) {
            bVar.f5404d = new ArrayList<>();
            this.f5398b.f5405e = new C6024a<>();
        }
        this.f5398b.f5404d.add(animator);
        this.f5398b.f5405e.put(animator, str);
    }

    public final void m36583c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m36583c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f5394M == null) {
                    this.f5394M = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f5394M);
            }
        }
    }

    @Override
    public boolean canApplyTheme() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return C9411a.m8766b(drawable);
        }
        return false;
    }

    @Override
    public void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f5398b.f5402b.draw(canvas);
        if (this.f5398b.f5403c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override
    public int getAlpha() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return C9411a.m8765c(drawable);
        }
        return this.f5398b.f5402b.getAlpha();
    }

    @Override
    public int getChangingConfigurations() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5398b.f5401a;
    }

    @Override
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return C9411a.m8764d(drawable);
        }
        return this.f5398b.f5402b.getColorFilter();
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        if (this.f5411a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1515c(this.f5411a.getConstantState());
    }

    @Override
    public Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override
    public int getIntrinsicHeight() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f5398b.f5402b.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f5398b.f5402b.getIntrinsicWidth();
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
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f5398b.f5402b.getOpacity();
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
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8762f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k = C8621i.m11895k(resources, theme, attributeSet, C1511a.f5386e);
                    int resourceId = k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1522h b = C1522h.m36553b(resources, resourceId, theme);
                        b.m36547h(false);
                        b.setCallback(this.f5397P);
                        C1522h hVar = this.f5398b.f5402b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f5398b.f5402b = b;
                    }
                    k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1511a.f5387f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f5399c;
                        if (context != null) {
                            m36584b(string, C1517d.m36571i(context, resourceId2));
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
        this.f5398b.m36582a();
    }

    @Override
    public boolean isAutoMirrored() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return C9411a.m8761g(drawable);
        }
        return this.f5398b.f5402b.isAutoMirrored();
    }

    @Override
    public boolean isRunning() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f5398b.f5403c.isRunning();
    }

    @Override
    public boolean isStateful() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f5398b.f5402b.isStateful();
    }

    @Override
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override
    public Drawable mutate() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5398b.f5402b.setBounds(rect);
        }
    }

    @Override
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f5398b.f5402b.setLevel(i);
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f5398b.f5402b.setState(iArr);
    }

    @Override
    public void setAlpha(int i) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f5398b.f5402b.setAlpha(i);
        }
    }

    @Override
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8759i(drawable, z);
        } else {
            this.f5398b.f5402b.setAutoMirrored(z);
        }
    }

    @Override
    public void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override
    public void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
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
    public boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override
    public void setTint(int i) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8755m(drawable, i);
        } else {
            this.f5398b.f5402b.setTint(i);
        }
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8754n(drawable, colorStateList);
        } else {
            this.f5398b.f5402b.setTintList(colorStateList);
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8753o(drawable, mode);
        } else {
            this.f5398b.f5402b.setTintMode(mode);
        }
    }

    @Override
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f5398b.f5402b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override
    public void start() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f5398b.f5403c.isStarted()) {
            this.f5398b.f5403c.start();
            invalidateSelf();
        }
    }

    @Override
    public void stop() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5398b.f5403c.end();
        }
    }

    public C1512b(Context context) {
        this(context, null, null);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5398b.f5402b.setColorFilter(colorFilter);
        }
    }

    public static class C1515c extends Drawable.ConstantState {
        public final Drawable.ConstantState f5406a;

        public C1515c(Drawable.ConstantState constantState) {
            this.f5406a = constantState;
        }

        @Override
        public boolean canApplyTheme() {
            return this.f5406a.canApplyTheme();
        }

        @Override
        public int getChangingConfigurations() {
            return this.f5406a.getChangingConfigurations();
        }

        @Override
        public Drawable newDrawable() {
            C1512b bVar = new C1512b();
            Drawable newDrawable = this.f5406a.newDrawable();
            bVar.f5411a = newDrawable;
            newDrawable.setCallback(bVar.f5397P);
            return bVar;
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            C1512b bVar = new C1512b();
            Drawable newDrawable = this.f5406a.newDrawable(resources);
            bVar.f5411a = newDrawable;
            newDrawable.setCallback(bVar.f5397P);
            return bVar;
        }

        @Override
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1512b bVar = new C1512b();
            Drawable newDrawable = this.f5406a.newDrawable(resources, theme);
            bVar.f5411a = newDrawable;
            newDrawable.setCallback(bVar.f5397P);
            return bVar;
        }
    }

    public C1512b(Context context, C1514b bVar, Resources resources) {
        this.f5394M = null;
        this.f5395N = null;
        this.f5396O = null;
        C1513a aVar = new C1513a();
        this.f5397P = aVar;
        this.f5399c = context;
        if (bVar != null) {
            this.f5398b = bVar;
        } else {
            this.f5398b = new C1514b(context, bVar, aVar, resources);
        }
    }

    @Override
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
