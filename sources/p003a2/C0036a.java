package p003a2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import p028c1.C1489y;

public class C0036a extends ImageView {
    public Animation.AnimationListener f81a;
    public int f82b;

    public class C0037a extends OvalShape {
        public RadialGradient f83a;
        public Paint f84b = new Paint();

        public C0037a(int i) {
            C0036a.this.f82b = i;
            m42554a((int) rect().width());
        }

        public final void m42554a(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, C0036a.this.f82b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f83a = radialGradient;
            this.f84b.setShader(radialGradient);
        }

        @Override
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = C0036a.this.getWidth() / 2;
            float height = C0036a.this.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f84b);
            canvas.drawCircle(width2, height, width - C0036a.this.f82b, paint);
        }

        @Override
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m42554a((int) f);
        }
    }

    public C0036a(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f82b = (int) (3.5f * f);
        if (m42556a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C1489y.m36737e0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0037a(this.f82b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f82b, i3, i2, 503316480);
            int i4 = this.f82b;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C1489y.m36743b0(this, shapeDrawable);
    }

    public final boolean m42556a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void m42555b(Animation.AnimationListener animationListener) {
        this.f81a = animationListener;
    }

    @Override
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f81a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f81a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m42556a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f82b * 2), getMeasuredHeight() + (this.f82b * 2));
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
