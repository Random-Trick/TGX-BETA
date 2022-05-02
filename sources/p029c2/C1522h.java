package p029c2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p143k0.C6024a;
import p256s0.C8605d;
import p256s0.C8614h;
import p256s0.C8621i;
import p267t0.C8931c;
import p280u0.C9411a;

public class C1522h extends AbstractC1521g {
    public static final PorterDuff.Mode f5412T = PorterDuff.Mode.SRC_IN;
    public ColorFilter f5413M;
    public boolean f5414N;
    public boolean f5415O;
    public Drawable.ConstantState f5416P;
    public final float[] f5417Q;
    public final Matrix f5418R;
    public final Rect f5419S;
    public C1530h f5420b;
    public PorterDuffColorFilter f5421c;

    public static class C1524b extends AbstractC1528f {
        public C1524b() {
        }

        @Override
        public boolean mo36530c() {
            return true;
        }

        public void m36541e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C8621i.m11897j(xmlPullParser, "pathData")) {
                TypedArray k = C8621i.m11896k(resources, theme, attributeSet, C1511a.f5385d);
                m36540f(k, xmlPullParser);
                k.recycle();
            }
        }

        public final void m36540f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5448b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f5447a = C8931c.m10924d(string2);
            }
            this.f5449c = C8621i.m11900g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public C1524b(C1524b bVar) {
            super(bVar);
        }
    }

    public static abstract class AbstractC1527e {
        public AbstractC1527e() {
        }

        public boolean mo36532a() {
            return false;
        }

        public boolean mo36531b(int[] iArr) {
            return false;
        }
    }

    public static class C1530h extends Drawable.ConstantState {
        public int f5468a;
        public C1529g f5469b;
        public ColorStateList f5470c;
        public PorterDuff.Mode f5471d;
        public boolean f5472e;
        public Bitmap f5473f;
        public ColorStateList f5474g;
        public PorterDuff.Mode f5475h;
        public int f5476i;
        public boolean f5477j;
        public boolean f5478k;
        public Paint f5479l;

        public C1530h(C1530h hVar) {
            this.f5470c = null;
            this.f5471d = C1522h.f5412T;
            if (hVar != null) {
                this.f5468a = hVar.f5468a;
                C1529g gVar = new C1529g(hVar.f5469b);
                this.f5469b = gVar;
                if (hVar.f5469b.f5456e != null) {
                    gVar.f5456e = new Paint(hVar.f5469b.f5456e);
                }
                if (hVar.f5469b.f5455d != null) {
                    this.f5469b.f5455d = new Paint(hVar.f5469b.f5455d);
                }
                this.f5470c = hVar.f5470c;
                this.f5471d = hVar.f5471d;
                this.f5472e = hVar.f5472e;
            }
        }

        public boolean m36521a(int i, int i2) {
            return i == this.f5473f.getWidth() && i2 == this.f5473f.getHeight();
        }

        public boolean m36520b() {
            return !this.f5478k && this.f5474g == this.f5470c && this.f5475h == this.f5471d && this.f5477j == this.f5472e && this.f5476i == this.f5469b.getRootAlpha();
        }

        public void m36519c(int i, int i2) {
            if (this.f5473f == null || !m36521a(i, i2)) {
                this.f5473f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f5478k = true;
            }
        }

        public void m36518d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5473f, (Rect) null, rect, m36517e(colorFilter));
        }

        public Paint m36517e(ColorFilter colorFilter) {
            if (!m36516f() && colorFilter == null) {
                return null;
            }
            if (this.f5479l == null) {
                Paint paint = new Paint();
                this.f5479l = paint;
                paint.setFilterBitmap(true);
            }
            this.f5479l.setAlpha(this.f5469b.getRootAlpha());
            this.f5479l.setColorFilter(colorFilter);
            return this.f5479l;
        }

        public boolean m36516f() {
            return this.f5469b.getRootAlpha() < 255;
        }

        public boolean m36515g() {
            return this.f5469b.m36523f();
        }

        @Override
        public int getChangingConfigurations() {
            return this.f5468a;
        }

        public boolean m36514h(int[] iArr) {
            boolean g = this.f5469b.m36522g(iArr);
            this.f5478k |= g;
            return g;
        }

        public void m36513i() {
            this.f5474g = this.f5470c;
            this.f5475h = this.f5471d;
            this.f5476i = this.f5469b.getRootAlpha();
            this.f5477j = this.f5472e;
            this.f5478k = false;
        }

        public void m36512j(int i, int i2) {
            this.f5473f.eraseColor(0);
            this.f5469b.m36527b(new Canvas(this.f5473f), i, i2, null);
        }

        @Override
        public Drawable newDrawable() {
            return new C1522h(this);
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            return new C1522h(this);
        }

        public C1530h() {
            this.f5470c = null;
            this.f5471d = C1522h.f5412T;
            this.f5469b = new C1529g();
        }
    }

    public C1522h() {
        this.f5415O = true;
        this.f5417Q = new float[9];
        this.f5418R = new Matrix();
        this.f5419S = new Rect();
        this.f5420b = new C1530h();
    }

    public static int m36551a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    public static C1522h m36550b(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C1522h hVar = new C1522h();
            hVar.f5411a = C8614h.m11919d(resources, i, theme);
            hVar.f5416P = new C1531i(hVar.f5411a.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return m36549c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static C1522h m36549c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1522h hVar = new C1522h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    public static PorterDuff.Mode m36545g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override
    public boolean canApplyTheme() {
        Drawable drawable = this.f5411a;
        if (drawable == null) {
            return false;
        }
        C9411a.m8766b(drawable);
        return false;
    }

    @Override
    public void clearColorFilter() {
        super.clearColorFilter();
    }

    public Object m36548d(String str) {
        return this.f5420b.f5469b.f5467p.get(str);
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f5419S);
        if (this.f5419S.width() > 0 && this.f5419S.height() > 0) {
            ColorFilter colorFilter = this.f5413M;
            if (colorFilter == null) {
                colorFilter = this.f5421c;
            }
            canvas.getMatrix(this.f5418R);
            this.f5418R.getValues(this.f5417Q);
            float abs = Math.abs(this.f5417Q[0]);
            float abs2 = Math.abs(this.f5417Q[4]);
            float abs3 = Math.abs(this.f5417Q[1]);
            float abs4 = Math.abs(this.f5417Q[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min((int) org.thunderdog.challegram.Log.TAG_VOICE, (int) (this.f5419S.width() * abs));
            int min2 = Math.min((int) org.thunderdog.challegram.Log.TAG_VOICE, (int) (this.f5419S.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f5419S;
                canvas.translate(rect.left, rect.top);
                if (m36546f()) {
                    canvas.translate(this.f5419S.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f5419S.offsetTo(0, 0);
                this.f5420b.m36519c(min, min2);
                if (!this.f5415O) {
                    this.f5420b.m36512j(min, min2);
                } else if (!this.f5420b.m36520b()) {
                    this.f5420b.m36512j(min, min2);
                    this.f5420b.m36513i();
                }
                this.f5420b.m36518d(canvas, colorFilter, this.f5419S);
                canvas.restoreToCount(save);
            }
        }
    }

    public final void m36547e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1530h hVar = this.f5420b;
        C1529g gVar = hVar.f5469b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f5459h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1526d dVar = (C1526d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1525c cVar = new C1525c();
                    cVar.m36537g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5435b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f5467p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.f5468a = cVar.f5450d | hVar.f5468a;
                } else if ("clip-path".equals(name)) {
                    C1524b bVar = new C1524b();
                    bVar.m36541e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5435b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f5467p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f5468a = bVar.f5450d | hVar.f5468a;
                } else if ("group".equals(name)) {
                    C1526d dVar2 = new C1526d();
                    dVar2.m36535c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5435b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f5467p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f5468a = dVar2.f5444k | hVar.f5468a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public final boolean m36546f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C9411a.m8763e(this) == 1;
    }

    @Override
    public int getAlpha() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return C9411a.m8765c(drawable);
        }
        return this.f5420b.f5469b.getRootAlpha();
    }

    @Override
    public int getChangingConfigurations() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5420b.getChangingConfigurations();
    }

    @Override
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return C9411a.m8764d(drawable);
        }
        return this.f5413M;
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        if (this.f5411a != null && Build.VERSION.SDK_INT >= 24) {
            return new C1531i(this.f5411a.getConstantState());
        }
        this.f5420b.f5468a = getChangingConfigurations();
        return this.f5420b;
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
        return (int) this.f5420b.f5469b.f5461j;
    }

    @Override
    public int getIntrinsicWidth() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f5420b.f5469b.f5460i;
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
        return -3;
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

    public void m36544h(boolean z) {
        this.f5415O = z;
    }

    public final void m36543i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C1530h hVar = this.f5420b;
        C1529g gVar = hVar.f5469b;
        hVar.f5471d = m36545g(C8621i.m11900g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c = C8621i.m11904c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c != null) {
            hVar.f5470c = c;
        }
        hVar.f5472e = C8621i.m11906a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f5472e);
        gVar.f5462k = C8621i.m11901f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f5462k);
        float f = C8621i.m11901f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f5463l);
        gVar.f5463l = f;
        if (gVar.f5462k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f > 0.0f) {
            gVar.f5460i = typedArray.getDimension(3, gVar.f5460i);
            float dimension = typedArray.getDimension(2, gVar.f5461j);
            gVar.f5461j = dimension;
            if (gVar.f5460i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C8621i.m11901f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f5465n = string;
                    gVar.f5467p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    @Override
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public void invalidateSelf() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public boolean isAutoMirrored() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return C9411a.m8761g(drawable);
        }
        return this.f5420b.f5472e;
    }

    @Override
    public boolean isStateful() {
        C1530h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f5420b) != null && (hVar.m36515g() || ((colorStateList = this.f5420b.f5470c) != null && colorStateList.isStateful())));
    }

    public PorterDuffColorFilter m36542j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
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
            return this;
        }
        if (!this.f5414N && super.mutate() == this) {
            this.f5420b = new C1530h(this.f5420b);
            this.f5414N = true;
        }
        return this;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1530h hVar = this.f5420b;
        ColorStateList colorStateList = hVar.f5470c;
        if (!(colorStateList == null || (mode = hVar.f5471d) == null)) {
            this.f5421c = m36542j(this.f5421c, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.m36515g() || !hVar.m36514h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override
    public void setAlpha(int i) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f5420b.f5469b.getRootAlpha() != i) {
            this.f5420b.f5469b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8759i(drawable, z);
        } else {
            this.f5420b.f5472e = z;
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
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8754n(drawable, colorStateList);
            return;
        }
        C1530h hVar = this.f5420b;
        if (hVar.f5470c != colorStateList) {
            hVar.f5470c = colorStateList;
            this.f5421c = m36542j(this.f5421c, colorStateList, hVar.f5471d);
            invalidateSelf();
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8753o(drawable, mode);
            return;
        }
        C1530h hVar = this.f5420b;
        if (hVar.f5471d != mode) {
            hVar.f5471d = mode;
            this.f5421c = m36542j(this.f5421c, hVar.f5470c, mode);
            invalidateSelf();
        }
    }

    @Override
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class C1531i extends Drawable.ConstantState {
        public final Drawable.ConstantState f5480a;

        public C1531i(Drawable.ConstantState constantState) {
            this.f5480a = constantState;
        }

        @Override
        public boolean canApplyTheme() {
            return this.f5480a.canApplyTheme();
        }

        @Override
        public int getChangingConfigurations() {
            return this.f5480a.getChangingConfigurations();
        }

        @Override
        public Drawable newDrawable() {
            C1522h hVar = new C1522h();
            hVar.f5411a = (VectorDrawable) this.f5480a.newDrawable();
            return hVar;
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            C1522h hVar = new C1522h();
            hVar.f5411a = (VectorDrawable) this.f5480a.newDrawable(resources);
            return hVar;
        }

        @Override
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1522h hVar = new C1522h();
            hVar.f5411a = (VectorDrawable) this.f5480a.newDrawable(resources, theme);
            return hVar;
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5413M = colorFilter;
        invalidateSelf();
    }

    public static abstract class AbstractC1528f extends AbstractC1527e {
        public C8931c.C8933b[] f5447a;
        public String f5448b;
        public int f5449c;
        public int f5450d;

        public AbstractC1528f() {
            super();
            this.f5447a = null;
            this.f5449c = 0;
        }

        public boolean mo36530c() {
            return false;
        }

        public void m36529d(Path path) {
            path.reset();
            C8931c.C8933b[] bVarArr = this.f5447a;
            if (bVarArr != null) {
                C8931c.C8933b.m10913e(bVarArr, path);
            }
        }

        public C8931c.C8933b[] getPathData() {
            return this.f5447a;
        }

        public String getPathName() {
            return this.f5448b;
        }

        public void setPathData(C8931c.C8933b[] bVarArr) {
            if (!C8931c.m10926b(this.f5447a, bVarArr)) {
                this.f5447a = C8931c.m10922f(bVarArr);
            } else {
                C8931c.m10918j(this.f5447a, bVarArr);
            }
        }

        public AbstractC1528f(AbstractC1528f fVar) {
            super();
            this.f5447a = null;
            this.f5449c = 0;
            this.f5448b = fVar.f5448b;
            this.f5450d = fVar.f5450d;
            this.f5447a = C8931c.m10922f(fVar.f5447a);
        }
    }

    @Override
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8762f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1530h hVar = this.f5420b;
        hVar.f5469b = new C1529g();
        TypedArray k = C8621i.m11896k(resources, theme, attributeSet, C1511a.f5382a);
        m36543i(k, xmlPullParser, theme);
        k.recycle();
        hVar.f5468a = getChangingConfigurations();
        hVar.f5478k = true;
        m36547e(resources, xmlPullParser, attributeSet, theme);
        this.f5421c = m36542j(this.f5421c, hVar.f5470c, hVar.f5471d);
    }

    public C1522h(C1530h hVar) {
        this.f5415O = true;
        this.f5417Q = new float[9];
        this.f5418R = new Matrix();
        this.f5419S = new Rect();
        this.f5420b = hVar;
        this.f5421c = m36542j(this.f5421c, hVar.f5470c, hVar.f5471d);
    }

    public static class C1525c extends AbstractC1528f {
        public int[] f5422e;
        public C8605d f5423f;
        public float f5424g;
        public C8605d f5425h;
        public float f5426i;
        public float f5427j;
        public float f5428k;
        public float f5429l;
        public float f5430m;
        public Paint.Cap f5431n;
        public Paint.Join f5432o;
        public float f5433p;

        public C1525c() {
            this.f5424g = 0.0f;
            this.f5426i = 1.0f;
            this.f5427j = 1.0f;
            this.f5428k = 0.0f;
            this.f5429l = 1.0f;
            this.f5430m = 0.0f;
            this.f5431n = Paint.Cap.BUTT;
            this.f5432o = Paint.Join.MITER;
            this.f5433p = 4.0f;
        }

        @Override
        public boolean mo36532a() {
            return this.f5425h.m11952i() || this.f5423f.m11952i();
        }

        @Override
        public boolean mo36531b(int[] iArr) {
            return this.f5423f.m11951j(iArr) | this.f5425h.m11951j(iArr);
        }

        public final Paint.Cap m36539e(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        public final Paint.Join m36538f(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        public void m36537g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C8621i.m11896k(resources, theme, attributeSet, C1511a.f5384c);
            m36536h(k, xmlPullParser, theme);
            k.recycle();
        }

        public float getFillAlpha() {
            return this.f5427j;
        }

        public int getFillColor() {
            return this.f5425h.m11956e();
        }

        public float getStrokeAlpha() {
            return this.f5426i;
        }

        public int getStrokeColor() {
            return this.f5423f.m11956e();
        }

        public float getStrokeWidth() {
            return this.f5424g;
        }

        public float getTrimPathEnd() {
            return this.f5429l;
        }

        public float getTrimPathOffset() {
            return this.f5430m;
        }

        public float getTrimPathStart() {
            return this.f5428k;
        }

        public final void m36536h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f5422e = null;
            if (C8621i.m11897j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f5448b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f5447a = C8931c.m10924d(string2);
                }
                this.f5425h = C8621i.m11902e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f5427j = C8621i.m11901f(typedArray, xmlPullParser, "fillAlpha", 12, this.f5427j);
                this.f5431n = m36539e(C8621i.m11900g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f5431n);
                this.f5432o = m36538f(C8621i.m11900g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f5432o);
                this.f5433p = C8621i.m11901f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f5433p);
                this.f5423f = C8621i.m11902e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f5426i = C8621i.m11901f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f5426i);
                this.f5424g = C8621i.m11901f(typedArray, xmlPullParser, "strokeWidth", 4, this.f5424g);
                this.f5429l = C8621i.m11901f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f5429l);
                this.f5430m = C8621i.m11901f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f5430m);
                this.f5428k = C8621i.m11901f(typedArray, xmlPullParser, "trimPathStart", 5, this.f5428k);
                this.f5449c = C8621i.m11900g(typedArray, xmlPullParser, "fillType", 13, this.f5449c);
            }
        }

        public void setFillAlpha(float f) {
            this.f5427j = f;
        }

        public void setFillColor(int i) {
            this.f5425h.m11950k(i);
        }

        public void setStrokeAlpha(float f) {
            this.f5426i = f;
        }

        public void setStrokeColor(int i) {
            this.f5423f.m11950k(i);
        }

        public void setStrokeWidth(float f) {
            this.f5424g = f;
        }

        public void setTrimPathEnd(float f) {
            this.f5429l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f5430m = f;
        }

        public void setTrimPathStart(float f) {
            this.f5428k = f;
        }

        public C1525c(C1525c cVar) {
            super(cVar);
            this.f5424g = 0.0f;
            this.f5426i = 1.0f;
            this.f5427j = 1.0f;
            this.f5428k = 0.0f;
            this.f5429l = 1.0f;
            this.f5430m = 0.0f;
            this.f5431n = Paint.Cap.BUTT;
            this.f5432o = Paint.Join.MITER;
            this.f5433p = 4.0f;
            this.f5422e = cVar.f5422e;
            this.f5423f = cVar.f5423f;
            this.f5424g = cVar.f5424g;
            this.f5426i = cVar.f5426i;
            this.f5425h = cVar.f5425h;
            this.f5449c = cVar.f5449c;
            this.f5427j = cVar.f5427j;
            this.f5428k = cVar.f5428k;
            this.f5429l = cVar.f5429l;
            this.f5430m = cVar.f5430m;
            this.f5431n = cVar.f5431n;
            this.f5432o = cVar.f5432o;
            this.f5433p = cVar.f5433p;
        }
    }

    public static class C1529g {
        public static final Matrix f5451q = new Matrix();
        public final Path f5452a;
        public final Path f5453b;
        public final Matrix f5454c;
        public Paint f5455d;
        public Paint f5456e;
        public PathMeasure f5457f;
        public int f5458g;
        public final C1526d f5459h;
        public float f5460i;
        public float f5461j;
        public float f5462k;
        public float f5463l;
        public int f5464m;
        public String f5465n;
        public Boolean f5466o;
        public final C6024a<String, Object> f5467p;

        public C1529g() {
            this.f5454c = new Matrix();
            this.f5460i = 0.0f;
            this.f5461j = 0.0f;
            this.f5462k = 0.0f;
            this.f5463l = 0.0f;
            this.f5464m = 255;
            this.f5465n = null;
            this.f5466o = null;
            this.f5467p = new C6024a<>();
            this.f5459h = new C1526d();
            this.f5452a = new Path();
            this.f5453b = new Path();
        }

        public static float m36528a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public void m36527b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m36526c(this.f5459h, f5451q, canvas, i, i2, colorFilter);
        }

        public final void m36526c(C1526d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f5434a.set(matrix);
            dVar.f5434a.preConcat(dVar.f5443j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f5435b.size(); i3++) {
                AbstractC1527e eVar = dVar.f5435b.get(i3);
                if (eVar instanceof C1526d) {
                    m36526c((C1526d) eVar, dVar.f5434a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof AbstractC1528f) {
                    m36525d(dVar, (AbstractC1528f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void m36525d(C1526d dVar, AbstractC1528f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f5462k;
            float f2 = i2 / this.f5463l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f5434a;
            this.f5454c.set(matrix);
            this.f5454c.postScale(f, f2);
            float e = m36524e(matrix);
            if (e != 0.0f) {
                fVar.m36529d(this.f5452a);
                Path path = this.f5452a;
                this.f5453b.reset();
                if (fVar.mo36530c()) {
                    this.f5453b.setFillType(fVar.f5449c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f5453b.addPath(path, this.f5454c);
                    canvas.clipPath(this.f5453b);
                    return;
                }
                C1525c cVar = (C1525c) fVar;
                float f3 = cVar.f5428k;
                if (!(f3 == 0.0f && cVar.f5429l == 1.0f)) {
                    float f4 = cVar.f5430m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f5429l + f4) % 1.0f;
                    if (this.f5457f == null) {
                        this.f5457f = new PathMeasure();
                    }
                    this.f5457f.setPath(this.f5452a, false);
                    float length = this.f5457f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f5457f.getSegment(f7, length, path, true);
                        this.f5457f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f5457f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f5453b.addPath(path, this.f5454c);
                if (cVar.f5425h.m11949l()) {
                    C8605d dVar2 = cVar.f5425h;
                    if (this.f5456e == null) {
                        Paint paint = new Paint(1);
                        this.f5456e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f5456e;
                    if (dVar2.m11953h()) {
                        Shader f9 = dVar2.m11955f();
                        f9.setLocalMatrix(this.f5454c);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f5427j * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(C1522h.m36551a(dVar2.m11956e(), cVar.f5427j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f5453b.setFillType(cVar.f5449c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f5453b, paint2);
                }
                if (cVar.f5423f.m11949l()) {
                    C8605d dVar3 = cVar.f5423f;
                    if (this.f5455d == null) {
                        Paint paint3 = new Paint(1);
                        this.f5455d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f5455d;
                    Paint.Join join = cVar.f5432o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f5431n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f5433p);
                    if (dVar3.m11953h()) {
                        Shader f10 = dVar3.m11955f();
                        f10.setLocalMatrix(this.f5454c);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f5426i * 255.0f));
                    } else {
                        paint4.setShader(null);
                        paint4.setAlpha(255);
                        paint4.setColor(C1522h.m36551a(dVar3.m11956e(), cVar.f5426i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f5424g * min * e);
                    canvas.drawPath(this.f5453b, paint4);
                }
            }
        }

        public final float m36524e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m36528a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        public boolean m36523f() {
            if (this.f5466o == null) {
                this.f5466o = Boolean.valueOf(this.f5459h.mo36532a());
            }
            return this.f5466o.booleanValue();
        }

        public boolean m36522g(int[] iArr) {
            return this.f5459h.mo36531b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f5464m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f5464m = i;
        }

        public C1529g(C1529g gVar) {
            this.f5454c = new Matrix();
            this.f5460i = 0.0f;
            this.f5461j = 0.0f;
            this.f5462k = 0.0f;
            this.f5463l = 0.0f;
            this.f5464m = 255;
            this.f5465n = null;
            this.f5466o = null;
            C6024a<String, Object> aVar = new C6024a<>();
            this.f5467p = aVar;
            this.f5459h = new C1526d(gVar.f5459h, aVar);
            this.f5452a = new Path(gVar.f5452a);
            this.f5453b = new Path(gVar.f5453b);
            this.f5460i = gVar.f5460i;
            this.f5461j = gVar.f5461j;
            this.f5462k = gVar.f5462k;
            this.f5463l = gVar.f5463l;
            this.f5458g = gVar.f5458g;
            this.f5464m = gVar.f5464m;
            this.f5465n = gVar.f5465n;
            String str = gVar.f5465n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f5466o = gVar.f5466o;
        }
    }

    public static class C1526d extends AbstractC1527e {
        public final Matrix f5434a;
        public final ArrayList<AbstractC1527e> f5435b;
        public float f5436c;
        public float f5437d;
        public float f5438e;
        public float f5439f;
        public float f5440g;
        public float f5441h;
        public float f5442i;
        public final Matrix f5443j;
        public int f5444k;
        public int[] f5445l;
        public String f5446m;

        public C1526d(C1526d dVar, C6024a<String, Object> aVar) {
            super();
            AbstractC1528f fVar;
            this.f5434a = new Matrix();
            this.f5435b = new ArrayList<>();
            this.f5436c = 0.0f;
            this.f5437d = 0.0f;
            this.f5438e = 0.0f;
            this.f5439f = 1.0f;
            this.f5440g = 1.0f;
            this.f5441h = 0.0f;
            this.f5442i = 0.0f;
            Matrix matrix = new Matrix();
            this.f5443j = matrix;
            this.f5446m = null;
            this.f5436c = dVar.f5436c;
            this.f5437d = dVar.f5437d;
            this.f5438e = dVar.f5438e;
            this.f5439f = dVar.f5439f;
            this.f5440g = dVar.f5440g;
            this.f5441h = dVar.f5441h;
            this.f5442i = dVar.f5442i;
            this.f5445l = dVar.f5445l;
            String str = dVar.f5446m;
            this.f5446m = str;
            this.f5444k = dVar.f5444k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f5443j);
            ArrayList<AbstractC1527e> arrayList = dVar.f5435b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC1527e eVar = arrayList.get(i);
                if (eVar instanceof C1526d) {
                    this.f5435b.add(new C1526d((C1526d) eVar, aVar));
                } else {
                    if (eVar instanceof C1525c) {
                        fVar = new C1525c((C1525c) eVar);
                    } else if (eVar instanceof C1524b) {
                        fVar = new C1524b((C1524b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f5435b.add(fVar);
                    String str2 = fVar.f5448b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        @Override
        public boolean mo36532a() {
            for (int i = 0; i < this.f5435b.size(); i++) {
                if (this.f5435b.get(i).mo36532a()) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean mo36531b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f5435b.size(); i++) {
                z |= this.f5435b.get(i).mo36531b(iArr);
            }
            return z;
        }

        public void m36535c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C8621i.m11896k(resources, theme, attributeSet, C1511a.f5383b);
            m36533e(k, xmlPullParser);
            k.recycle();
        }

        public final void m36534d() {
            this.f5443j.reset();
            this.f5443j.postTranslate(-this.f5437d, -this.f5438e);
            this.f5443j.postScale(this.f5439f, this.f5440g);
            this.f5443j.postRotate(this.f5436c, 0.0f, 0.0f);
            this.f5443j.postTranslate(this.f5441h + this.f5437d, this.f5442i + this.f5438e);
        }

        public final void m36533e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f5445l = null;
            this.f5436c = C8621i.m11901f(typedArray, xmlPullParser, "rotation", 5, this.f5436c);
            this.f5437d = typedArray.getFloat(1, this.f5437d);
            this.f5438e = typedArray.getFloat(2, this.f5438e);
            this.f5439f = C8621i.m11901f(typedArray, xmlPullParser, "scaleX", 3, this.f5439f);
            this.f5440g = C8621i.m11901f(typedArray, xmlPullParser, "scaleY", 4, this.f5440g);
            this.f5441h = C8621i.m11901f(typedArray, xmlPullParser, "translateX", 6, this.f5441h);
            this.f5442i = C8621i.m11901f(typedArray, xmlPullParser, "translateY", 7, this.f5442i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5446m = string;
            }
            m36534d();
        }

        public String getGroupName() {
            return this.f5446m;
        }

        public Matrix getLocalMatrix() {
            return this.f5443j;
        }

        public float getPivotX() {
            return this.f5437d;
        }

        public float getPivotY() {
            return this.f5438e;
        }

        public float getRotation() {
            return this.f5436c;
        }

        public float getScaleX() {
            return this.f5439f;
        }

        public float getScaleY() {
            return this.f5440g;
        }

        public float getTranslateX() {
            return this.f5441h;
        }

        public float getTranslateY() {
            return this.f5442i;
        }

        public void setPivotX(float f) {
            if (f != this.f5437d) {
                this.f5437d = f;
                m36534d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f5438e) {
                this.f5438e = f;
                m36534d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f5436c) {
                this.f5436c = f;
                m36534d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f5439f) {
                this.f5439f = f;
                m36534d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f5440g) {
                this.f5440g = f;
                m36534d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f5441h) {
                this.f5441h = f;
                m36534d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f5442i) {
                this.f5442i = f;
                m36534d();
            }
        }

        public C1526d() {
            super();
            this.f5434a = new Matrix();
            this.f5435b = new ArrayList<>();
            this.f5436c = 0.0f;
            this.f5437d = 0.0f;
            this.f5438e = 0.0f;
            this.f5439f = 1.0f;
            this.f5440g = 1.0f;
            this.f5441h = 0.0f;
            this.f5442i = 0.0f;
            this.f5443j = new Matrix();
            this.f5446m = null;
        }
    }
}
