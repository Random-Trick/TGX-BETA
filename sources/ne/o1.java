package ne;

import ae.j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import ce.a0;
import db.b;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;

public class o1 extends FrameLayoutFix {
    public ImageView M;
    public ImageView N;
    public ImageView O;
    public boolean P;
    public ValueAnimator Q;

    public o1(Context context) {
        super(context);
        int i10 = a0.i(96.0f) + a0.i(56.0f) + a0.i(12.0f);
        int i11 = a0.i(56.0f) / 2;
        setLayoutParams(new ViewGroup.LayoutParams(i10, i10));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.baseline_settings_96);
        imageView.setColorFilter(j.L(R.id.theme_color_iconActive));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setLayoutParams(FrameLayoutFix.r1(-2, -2, 17));
        this.M = imageView;
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.baseline_settings_56);
        imageView2.setAlpha(0.5f);
        imageView2.setColorFilter(j.L(R.id.theme_color_iconActive));
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setLayoutParams(FrameLayoutFix.s1(-2, -2, 17, 0, i11, i11, 0));
        imageView2.setRotation(90.0f);
        this.N = imageView2;
        addView(imageView2);
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.baseline_settings_56);
        imageView3.setAlpha(0.5f);
        imageView3.setColorFilter(j.L(R.id.theme_color_iconActive));
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        imageView3.setLayoutParams(FrameLayoutFix.s1(-2, -2, 17, i11, 0, 0, i11));
        this.O = imageView3;
        addView(imageView3);
    }

    public void A1(ValueAnimator valueAnimator) {
        float a10 = b.a(valueAnimator);
        this.M.setRotation(a10 * 360.0f);
        float f10 = (-a10) * 360.0f;
        this.N.setRotation(90.0f + f10);
        this.O.setRotation(f10);
    }

    public void setLooping(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (z10) {
                ValueAnimator b10 = b.b();
                this.Q = b10;
                b10.setRepeatCount(-1);
                this.Q.setDuration(4000L);
                this.Q.setInterpolator(b.f7290e);
                this.Q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        o1.this.A1(valueAnimator);
                    }
                });
                this.Q.start();
                return;
            }
            this.Q.cancel();
            this.Q = null;
        }
    }
}
