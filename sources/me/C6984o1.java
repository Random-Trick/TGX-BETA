package me;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import be.C1357a0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p364zd.C11524j;

public class C6984o1 extends FrameLayoutFix {
    public ImageView f22137M;
    public ImageView f22138N;
    public ImageView f22139O;
    public boolean f22140P;
    public ValueAnimator f22141Q;

    public C6984o1(Context context) {
        super(context);
        int i = C1357a0.m37541i(96.0f) + C1357a0.m37541i(56.0f) + C1357a0.m37541i(12.0f);
        int i2 = C1357a0.m37541i(56.0f) / 2;
        setLayoutParams(new ViewGroup.LayoutParams(i, i));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.baseline_settings_96);
        imageView.setColorFilter(C11524j.m228N(R.id.theme_color_iconActive));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 17));
        this.f22137M = imageView;
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.baseline_settings_56);
        imageView2.setAlpha(0.5f);
        imageView2.setColorFilter(C11524j.m228N(R.id.theme_color_iconActive));
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setLayoutParams(FrameLayoutFix.m18006u1(-2, -2, 17, 0, i2, i2, 0));
        imageView2.setRotation(90.0f);
        this.f22138N = imageView2;
        addView(imageView2);
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.baseline_settings_56);
        imageView3.setAlpha(0.5f);
        imageView3.setColorFilter(C11524j.m228N(R.id.theme_color_iconActive));
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        imageView3.setLayoutParams(FrameLayoutFix.m18006u1(-2, -2, 17, i2, 0, 0, i2));
        this.f22139O = imageView3;
        addView(imageView3);
    }

    public void m18181D1(ValueAnimator valueAnimator) {
        float a = C2057b.m35735a(valueAnimator);
        this.f22137M.setRotation(a * 360.0f);
        float f = (-a) * 360.0f;
        this.f22138N.setRotation(90.0f + f);
        this.f22139O.setRotation(f);
    }

    public void setLooping(boolean z) {
        if (this.f22140P != z) {
            this.f22140P = z;
            if (z) {
                ValueAnimator b = C2057b.m35734b();
                this.f22141Q = b;
                b.setRepeatCount(-1);
                this.f22141Q.setDuration(4000L);
                this.f22141Q.setInterpolator(C2057b.f7283e);
                this.f22141Q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C6984o1.this.m18181D1(valueAnimator);
                    }
                });
                this.f22141Q.start();
                return;
            }
            this.f22141Q.cancel();
            this.f22141Q = null;
        }
    }
}
