package a2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import c1.v;

public class a extends ImageView {
    public Animation.AnimationListener f73a;
    public int f74b;

    public class C0007a extends OvalShape {
        public RadialGradient f75a;
        public Paint f76b = new Paint();

        public C0007a(int i10) {
            a.this.f74b = i10;
            a((int) rect().width());
        }

        public final void a(int i10) {
            float f10 = i10 / 2;
            RadialGradient radialGradient = new RadialGradient(f10, f10, a.this.f74b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f75a = radialGradient;
            this.f76b.setShader(radialGradient);
        }

        @Override
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = a.this.getWidth() / 2;
            float height = a.this.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f76b);
            canvas.drawCircle(width2, height, width - a.this.f74b, paint);
        }

        @Override
        public void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    public a(Context context, int i10) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i11 = (int) (1.75f * f10);
        int i12 = (int) (0.0f * f10);
        this.f74b = (int) (3.5f * f10);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            v.d0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0007a(this.f74b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f74b, i12, i11, 503316480);
            int i13 = this.f74b;
            setPadding(i13, i13, i13, i13);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i10);
        v.a0(this, shapeDrawable);
    }

    public final boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f73a = animationListener;
    }

    @Override
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f73a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f73a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f74b * 2), getMeasuredHeight() + (this.f74b * 2));
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
        }
    }
}
