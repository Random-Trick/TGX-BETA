package c2;

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
import t0.c;

public class g extends c2.f {
    public static final PorterDuff.Mode T = PorterDuff.Mode.SRC_IN;
    public ColorFilter M;
    public boolean N;
    public boolean O;
    public Drawable.ConstantState P;
    public final float[] Q;
    public final Matrix R;
    public final Rect S;
    public h f4338b;
    public PorterDuffColorFilter f4339c;

    public static class b extends f {
        public b() {
        }

        @Override
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (s0.i.j(xmlPullParser, "pathData")) {
                TypedArray k10 = s0.i.k(resources, theme, attributeSet, c2.a.f4317d);
                f(k10, xmlPullParser);
                k10.recycle();
            }
        }

        public final void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4366b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4365a = t0.c.d(string2);
            }
            this.f4367c = s0.i.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static class h extends Drawable.ConstantState {
        public int f4386a;
        public C0064g f4387b;
        public ColorStateList f4388c;
        public PorterDuff.Mode f4389d;
        public boolean f4390e;
        public Bitmap f4391f;
        public ColorStateList f4392g;
        public PorterDuff.Mode f4393h;
        public int f4394i;
        public boolean f4395j;
        public boolean f4396k;
        public Paint f4397l;

        public h(h hVar) {
            this.f4388c = null;
            this.f4389d = g.T;
            if (hVar != null) {
                this.f4386a = hVar.f4386a;
                C0064g gVar = new C0064g(hVar.f4387b);
                this.f4387b = gVar;
                if (hVar.f4387b.f4374e != null) {
                    gVar.f4374e = new Paint(hVar.f4387b.f4374e);
                }
                if (hVar.f4387b.f4373d != null) {
                    this.f4387b.f4373d = new Paint(hVar.f4387b.f4373d);
                }
                this.f4388c = hVar.f4388c;
                this.f4389d = hVar.f4389d;
                this.f4390e = hVar.f4390e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f4391f.getWidth() && i11 == this.f4391f.getHeight();
        }

        public boolean b() {
            return !this.f4396k && this.f4392g == this.f4388c && this.f4393h == this.f4389d && this.f4395j == this.f4390e && this.f4394i == this.f4387b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f4391f == null || !a(i10, i11)) {
                this.f4391f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f4396k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f4391f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f4397l == null) {
                Paint paint = new Paint();
                this.f4397l = paint;
                paint.setFilterBitmap(true);
            }
            this.f4397l.setAlpha(this.f4387b.getRootAlpha());
            this.f4397l.setColorFilter(colorFilter);
            return this.f4397l;
        }

        public boolean f() {
            return this.f4387b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f4387b.f();
        }

        @Override
        public int getChangingConfigurations() {
            return this.f4386a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f4387b.g(iArr);
            this.f4396k |= g10;
            return g10;
        }

        public void i() {
            this.f4392g = this.f4388c;
            this.f4393h = this.f4389d;
            this.f4394i = this.f4387b.getRootAlpha();
            this.f4395j = this.f4390e;
            this.f4396k = false;
        }

        public void j(int i10, int i11) {
            this.f4391f.eraseColor(0);
            this.f4387b.b(new Canvas(this.f4391f), i10, i11, null);
        }

        @Override
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }

        public h() {
            this.f4388c = null;
            this.f4389d = g.T;
            this.f4387b = new C0064g();
        }
    }

    public g() {
        this.O = true;
        this.Q = new float[9];
        this.R = new Matrix();
        this.S = new Rect();
        this.f4338b = new h();
    }

    public static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static g b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            g gVar = new g();
            gVar.f4337a = s0.h.d(resources, i10, theme);
            gVar.P = new i(gVar.f4337a.getConstantState());
            return gVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    public static g c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    public static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
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
        Drawable drawable = this.f4337a;
        if (drawable == null) {
            return false;
        }
        u0.a.b(drawable);
        return false;
    }

    @Override
    public void clearColorFilter() {
        super.clearColorFilter();
    }

    public Object d(String str) {
        return this.f4338b.f4387b.f4385p.get(str);
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.S);
        if (this.S.width() > 0 && this.S.height() > 0) {
            ColorFilter colorFilter = this.M;
            if (colorFilter == null) {
                colorFilter = this.f4339c;
            }
            canvas.getMatrix(this.R);
            this.R.getValues(this.Q);
            float abs = Math.abs(this.Q[0]);
            float abs2 = Math.abs(this.Q[4]);
            float abs3 = Math.abs(this.Q[1]);
            float abs4 = Math.abs(this.Q[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min((int) org.thunderdog.challegram.Log.TAG_VOICE, (int) (this.S.width() * abs));
            int min2 = Math.min((int) org.thunderdog.challegram.Log.TAG_VOICE, (int) (this.S.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.S;
                canvas.translate(rect.left, rect.top);
                if (f()) {
                    canvas.translate(this.S.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.S.offsetTo(0, 0);
                this.f4338b.c(min, min2);
                if (!this.O) {
                    this.f4338b.j(min, min2);
                } else if (!this.f4338b.b()) {
                    this.f4338b.j(min, min2);
                    this.f4338b.i();
                }
                this.f4338b.d(canvas, colorFilter, this.S);
                canvas.restoreToCount(save);
            }
        }
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = this.f4338b;
        C0064g gVar = hVar.f4387b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f4377h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4353b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f4385p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    hVar.f4386a = cVar.f4368d | hVar.f4386a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4353b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f4385p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f4386a = bVar.f4368d | hVar.f4386a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4353b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f4385p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f4386a = dVar2.f4362k | hVar.f4386a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public final boolean f() {
        return isAutoMirrored() && u0.a.e(this) == 1;
    }

    @Override
    public int getAlpha() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return u0.a.c(drawable);
        }
        return this.f4338b.f4387b.getRootAlpha();
    }

    @Override
    public int getChangingConfigurations() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4338b.getChangingConfigurations();
    }

    @Override
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return u0.a.d(drawable);
        }
        return this.M;
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        if (this.f4337a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f4337a.getConstantState());
        }
        this.f4338b.f4386a = getChangingConfigurations();
        return this.f4338b;
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
        return (int) this.f4338b.f4387b.f4379j;
    }

    @Override
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f4338b.f4387b.f4378i;
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

    public void h(boolean z10) {
        this.O = z10;
    }

    public final void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f4338b;
        C0064g gVar = hVar.f4387b;
        hVar.f4389d = g(s0.i.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c10 = s0.i.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c10 != null) {
            hVar.f4388c = c10;
        }
        hVar.f4390e = s0.i.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f4390e);
        gVar.f4380k = s0.i.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f4380k);
        float f10 = s0.i.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f4381l);
        gVar.f4381l = f10;
        if (gVar.f4380k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f10 > 0.0f) {
            gVar.f4378i = typedArray.getDimension(3, gVar.f4378i);
            float dimension = typedArray.getDimension(2, gVar.f4379j);
            gVar.f4379j = dimension;
            if (gVar.f4378i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(s0.i.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f4383n = string;
                    gVar.f4385p.put(string, gVar);
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
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public void invalidateSelf() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return u0.a.g(drawable);
        }
        return this.f4338b.f4390e;
    }

    @Override
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f4338b) != null && (hVar.g() || ((colorStateList = this.f4338b.f4388c) != null && colorStateList.isStateful())));
    }

    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
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
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.N && super.mutate() == this) {
            this.f4338b = new h(this.f4338b);
            this.N = true;
        }
        return this;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        h hVar = this.f4338b;
        ColorStateList colorStateList = hVar.f4388c;
        if (!(colorStateList == null || (mode = hVar.f4389d) == null)) {
            this.f4339c = j(this.f4339c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override
    public void setAlpha(int i10) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f4338b.f4387b.getRootAlpha() != i10) {
            this.f4338b.f4387b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            u0.a.i(drawable, z10);
        } else {
            this.f4338b.f4390e = z10;
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
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            u0.a.n(drawable, colorStateList);
            return;
        }
        h hVar = this.f4338b;
        if (hVar.f4388c != colorStateList) {
            hVar.f4388c = colorStateList;
            this.f4339c = j(this.f4339c, colorStateList, hVar.f4389d);
            invalidateSelf();
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            u0.a.o(drawable, mode);
            return;
        }
        h hVar = this.f4338b;
        if (hVar.f4389d != mode) {
            hVar.f4389d = mode;
            this.f4339c = j(this.f4339c, hVar.f4388c, mode);
            invalidateSelf();
        }
    }

    @Override
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class i extends Drawable.ConstantState {
        public final Drawable.ConstantState f4398a;

        public i(Drawable.ConstantState constantState) {
            this.f4398a = constantState;
        }

        @Override
        public boolean canApplyTheme() {
            return this.f4398a.canApplyTheme();
        }

        @Override
        public int getChangingConfigurations() {
            return this.f4398a.getChangingConfigurations();
        }

        @Override
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f4337a = (VectorDrawable) this.f4398a.newDrawable();
            return gVar;
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f4337a = (VectorDrawable) this.f4398a.newDrawable(resources);
            return gVar;
        }

        @Override
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f4337a = (VectorDrawable) this.f4398a.newDrawable(resources, theme);
            return gVar;
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.M = colorFilter;
        invalidateSelf();
    }

    public static abstract class f extends e {
        public c.b[] f4365a;
        public String f4366b;
        public int f4367c;
        public int f4368d;

        public f() {
            super();
            this.f4365a = null;
            this.f4367c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.f4365a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.f4365a;
        }

        public String getPathName() {
            return this.f4366b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (!t0.c.b(this.f4365a, bVarArr)) {
                this.f4365a = t0.c.f(bVarArr);
            } else {
                t0.c.j(this.f4365a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f4365a = null;
            this.f4367c = 0;
            this.f4366b = fVar.f4366b;
            this.f4368d = fVar.f4368d;
            this.f4365a = t0.c.f(fVar.f4365a);
        }
    }

    @Override
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            u0.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f4338b;
        hVar.f4387b = new C0064g();
        TypedArray k10 = s0.i.k(resources, theme, attributeSet, c2.a.f4314a);
        i(k10, xmlPullParser, theme);
        k10.recycle();
        hVar.f4386a = getChangingConfigurations();
        hVar.f4396k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f4339c = j(this.f4339c, hVar.f4388c, hVar.f4389d);
    }

    public g(h hVar) {
        this.O = true;
        this.Q = new float[9];
        this.R = new Matrix();
        this.S = new Rect();
        this.f4338b = hVar;
        this.f4339c = j(this.f4339c, hVar.f4388c, hVar.f4389d);
    }

    public static class c extends f {
        public int[] f4340e;
        public s0.d f4341f;
        public float f4342g;
        public s0.d f4343h;
        public float f4344i;
        public float f4345j;
        public float f4346k;
        public float f4347l;
        public float f4348m;
        public Paint.Cap f4349n;
        public Paint.Join f4350o;
        public float f4351p;

        public c() {
            this.f4342g = 0.0f;
            this.f4344i = 1.0f;
            this.f4345j = 1.0f;
            this.f4346k = 0.0f;
            this.f4347l = 1.0f;
            this.f4348m = 0.0f;
            this.f4349n = Paint.Cap.BUTT;
            this.f4350o = Paint.Join.MITER;
            this.f4351p = 4.0f;
        }

        @Override
        public boolean a() {
            return this.f4343h.i() || this.f4341f.i();
        }

        @Override
        public boolean b(int[] iArr) {
            return this.f4341f.j(iArr) | this.f4343h.j(iArr);
        }

        public final Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        public final Paint.Join f(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = s0.i.k(resources, theme, attributeSet, c2.a.f4316c);
            h(k10, xmlPullParser, theme);
            k10.recycle();
        }

        public float getFillAlpha() {
            return this.f4345j;
        }

        public int getFillColor() {
            return this.f4343h.e();
        }

        public float getStrokeAlpha() {
            return this.f4344i;
        }

        public int getStrokeColor() {
            return this.f4341f.e();
        }

        public float getStrokeWidth() {
            return this.f4342g;
        }

        public float getTrimPathEnd() {
            return this.f4347l;
        }

        public float getTrimPathOffset() {
            return this.f4348m;
        }

        public float getTrimPathStart() {
            return this.f4346k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f4340e = null;
            if (s0.i.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4366b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4365a = t0.c.d(string2);
                }
                this.f4343h = s0.i.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f4345j = s0.i.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f4345j);
                this.f4349n = e(s0.i.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f4349n);
                this.f4350o = f(s0.i.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f4350o);
                this.f4351p = s0.i.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4351p);
                this.f4341f = s0.i.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f4344i = s0.i.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4344i);
                this.f4342g = s0.i.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f4342g);
                this.f4347l = s0.i.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4347l);
                this.f4348m = s0.i.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4348m);
                this.f4346k = s0.i.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f4346k);
                this.f4367c = s0.i.g(typedArray, xmlPullParser, "fillType", 13, this.f4367c);
            }
        }

        public void setFillAlpha(float f10) {
            this.f4345j = f10;
        }

        public void setFillColor(int i10) {
            this.f4343h.k(i10);
        }

        public void setStrokeAlpha(float f10) {
            this.f4344i = f10;
        }

        public void setStrokeColor(int i10) {
            this.f4341f.k(i10);
        }

        public void setStrokeWidth(float f10) {
            this.f4342g = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f4347l = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f4348m = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f4346k = f10;
        }

        public c(c cVar) {
            super(cVar);
            this.f4342g = 0.0f;
            this.f4344i = 1.0f;
            this.f4345j = 1.0f;
            this.f4346k = 0.0f;
            this.f4347l = 1.0f;
            this.f4348m = 0.0f;
            this.f4349n = Paint.Cap.BUTT;
            this.f4350o = Paint.Join.MITER;
            this.f4351p = 4.0f;
            this.f4340e = cVar.f4340e;
            this.f4341f = cVar.f4341f;
            this.f4342g = cVar.f4342g;
            this.f4344i = cVar.f4344i;
            this.f4343h = cVar.f4343h;
            this.f4367c = cVar.f4367c;
            this.f4345j = cVar.f4345j;
            this.f4346k = cVar.f4346k;
            this.f4347l = cVar.f4347l;
            this.f4348m = cVar.f4348m;
            this.f4349n = cVar.f4349n;
            this.f4350o = cVar.f4350o;
            this.f4351p = cVar.f4351p;
        }
    }

    public static class C0064g {
        public static final Matrix f4369q = new Matrix();
        public final Path f4370a;
        public final Path f4371b;
        public final Matrix f4372c;
        public Paint f4373d;
        public Paint f4374e;
        public PathMeasure f4375f;
        public int f4376g;
        public final d f4377h;
        public float f4378i;
        public float f4379j;
        public float f4380k;
        public float f4381l;
        public int f4382m;
        public String f4383n;
        public Boolean f4384o;
        public final k0.a<String, Object> f4385p;

        public C0064g() {
            this.f4372c = new Matrix();
            this.f4378i = 0.0f;
            this.f4379j = 0.0f;
            this.f4380k = 0.0f;
            this.f4381l = 0.0f;
            this.f4382m = 255;
            this.f4383n = null;
            this.f4384o = null;
            this.f4385p = new k0.a<>();
            this.f4377h = new d();
            this.f4370a = new Path();
            this.f4371b = new Path();
        }

        public static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f4377h, f4369q, canvas, i10, i11, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f4352a.set(matrix);
            dVar.f4352a.preConcat(dVar.f4361j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f4353b.size(); i12++) {
                e eVar = dVar.f4353b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f4352a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f4380k;
            float f11 = i11 / this.f4381l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f4352a;
            this.f4372c.set(matrix);
            this.f4372c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 != 0.0f) {
                fVar.d(this.f4370a);
                Path path = this.f4370a;
                this.f4371b.reset();
                if (fVar.c()) {
                    this.f4371b.setFillType(fVar.f4367c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f4371b.addPath(path, this.f4372c);
                    canvas.clipPath(this.f4371b);
                    return;
                }
                c cVar = (c) fVar;
                float f12 = cVar.f4346k;
                if (!(f12 == 0.0f && cVar.f4347l == 1.0f)) {
                    float f13 = cVar.f4348m;
                    float f14 = (f12 + f13) % 1.0f;
                    float f15 = (cVar.f4347l + f13) % 1.0f;
                    if (this.f4375f == null) {
                        this.f4375f = new PathMeasure();
                    }
                    this.f4375f.setPath(this.f4370a, false);
                    float length = this.f4375f.getLength();
                    float f16 = f14 * length;
                    float f17 = f15 * length;
                    path.reset();
                    if (f16 > f17) {
                        this.f4375f.getSegment(f16, length, path, true);
                        this.f4375f.getSegment(0.0f, f17, path, true);
                    } else {
                        this.f4375f.getSegment(f16, f17, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f4371b.addPath(path, this.f4372c);
                if (cVar.f4343h.l()) {
                    s0.d dVar2 = cVar.f4343h;
                    if (this.f4374e == null) {
                        Paint paint = new Paint(1);
                        this.f4374e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f4374e;
                    if (dVar2.h()) {
                        Shader f18 = dVar2.f();
                        f18.setLocalMatrix(this.f4372c);
                        paint2.setShader(f18);
                        paint2.setAlpha(Math.round(cVar.f4345j * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(g.a(dVar2.e(), cVar.f4345j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f4371b.setFillType(cVar.f4367c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f4371b, paint2);
                }
                if (cVar.f4341f.l()) {
                    s0.d dVar3 = cVar.f4341f;
                    if (this.f4373d == null) {
                        Paint paint3 = new Paint(1);
                        this.f4373d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f4373d;
                    Paint.Join join = cVar.f4350o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f4349n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f4351p);
                    if (dVar3.h()) {
                        Shader f19 = dVar3.f();
                        f19.setLocalMatrix(this.f4372c);
                        paint4.setShader(f19);
                        paint4.setAlpha(Math.round(cVar.f4344i * 255.0f));
                    } else {
                        paint4.setShader(null);
                        paint4.setAlpha(255);
                        paint4.setColor(g.a(dVar3.e(), cVar.f4344i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f4342g * min * e10);
                    canvas.drawPath(this.f4371b, paint4);
                }
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.f4384o == null) {
                this.f4384o = Boolean.valueOf(this.f4377h.a());
            }
            return this.f4384o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f4377h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4382m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f4382m = i10;
        }

        public C0064g(C0064g gVar) {
            this.f4372c = new Matrix();
            this.f4378i = 0.0f;
            this.f4379j = 0.0f;
            this.f4380k = 0.0f;
            this.f4381l = 0.0f;
            this.f4382m = 255;
            this.f4383n = null;
            this.f4384o = null;
            k0.a<String, Object> aVar = new k0.a<>();
            this.f4385p = aVar;
            this.f4377h = new d(gVar.f4377h, aVar);
            this.f4370a = new Path(gVar.f4370a);
            this.f4371b = new Path(gVar.f4371b);
            this.f4378i = gVar.f4378i;
            this.f4379j = gVar.f4379j;
            this.f4380k = gVar.f4380k;
            this.f4381l = gVar.f4381l;
            this.f4376g = gVar.f4376g;
            this.f4382m = gVar.f4382m;
            this.f4383n = gVar.f4383n;
            String str = gVar.f4383n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4384o = gVar.f4384o;
        }
    }

    public static class d extends e {
        public final Matrix f4352a;
        public final ArrayList<e> f4353b;
        public float f4354c;
        public float f4355d;
        public float f4356e;
        public float f4357f;
        public float f4358g;
        public float f4359h;
        public float f4360i;
        public final Matrix f4361j;
        public int f4362k;
        public int[] f4363l;
        public String f4364m;

        public d(d dVar, k0.a<String, Object> aVar) {
            super();
            f fVar;
            this.f4352a = new Matrix();
            this.f4353b = new ArrayList<>();
            this.f4354c = 0.0f;
            this.f4355d = 0.0f;
            this.f4356e = 0.0f;
            this.f4357f = 1.0f;
            this.f4358g = 1.0f;
            this.f4359h = 0.0f;
            this.f4360i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4361j = matrix;
            this.f4364m = null;
            this.f4354c = dVar.f4354c;
            this.f4355d = dVar.f4355d;
            this.f4356e = dVar.f4356e;
            this.f4357f = dVar.f4357f;
            this.f4358g = dVar.f4358g;
            this.f4359h = dVar.f4359h;
            this.f4360i = dVar.f4360i;
            this.f4363l = dVar.f4363l;
            String str = dVar.f4364m;
            this.f4364m = str;
            this.f4362k = dVar.f4362k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f4361j);
            ArrayList<e> arrayList = dVar.f4353b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f4353b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4353b.add(fVar);
                    String str2 = fVar.f4366b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        @Override
        public boolean a() {
            for (int i10 = 0; i10 < this.f4353b.size(); i10++) {
                if (this.f4353b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f4353b.size(); i10++) {
                z10 |= this.f4353b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = s0.i.k(resources, theme, attributeSet, c2.a.f4315b);
            e(k10, xmlPullParser);
            k10.recycle();
        }

        public final void d() {
            this.f4361j.reset();
            this.f4361j.postTranslate(-this.f4355d, -this.f4356e);
            this.f4361j.postScale(this.f4357f, this.f4358g);
            this.f4361j.postRotate(this.f4354c, 0.0f, 0.0f);
            this.f4361j.postTranslate(this.f4359h + this.f4355d, this.f4360i + this.f4356e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f4363l = null;
            this.f4354c = s0.i.f(typedArray, xmlPullParser, "rotation", 5, this.f4354c);
            this.f4355d = typedArray.getFloat(1, this.f4355d);
            this.f4356e = typedArray.getFloat(2, this.f4356e);
            this.f4357f = s0.i.f(typedArray, xmlPullParser, "scaleX", 3, this.f4357f);
            this.f4358g = s0.i.f(typedArray, xmlPullParser, "scaleY", 4, this.f4358g);
            this.f4359h = s0.i.f(typedArray, xmlPullParser, "translateX", 6, this.f4359h);
            this.f4360i = s0.i.f(typedArray, xmlPullParser, "translateY", 7, this.f4360i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4364m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f4364m;
        }

        public Matrix getLocalMatrix() {
            return this.f4361j;
        }

        public float getPivotX() {
            return this.f4355d;
        }

        public float getPivotY() {
            return this.f4356e;
        }

        public float getRotation() {
            return this.f4354c;
        }

        public float getScaleX() {
            return this.f4357f;
        }

        public float getScaleY() {
            return this.f4358g;
        }

        public float getTranslateX() {
            return this.f4359h;
        }

        public float getTranslateY() {
            return this.f4360i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f4355d) {
                this.f4355d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f4356e) {
                this.f4356e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f4354c) {
                this.f4354c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f4357f) {
                this.f4357f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f4358g) {
                this.f4358g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f4359h) {
                this.f4359h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f4360i) {
                this.f4360i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f4352a = new Matrix();
            this.f4353b = new ArrayList<>();
            this.f4354c = 0.0f;
            this.f4355d = 0.0f;
            this.f4356e = 0.0f;
            this.f4357f = 1.0f;
            this.f4358g = 1.0f;
            this.f4359h = 0.0f;
            this.f4360i = 0.0f;
            this.f4361j = new Matrix();
            this.f4364m = null;
        }
    }
}
