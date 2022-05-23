package ne;

import ae.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import ce.a0;
import ce.p0;
import db.g;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import ud.v4;

public class q0 extends FrameLayoutFix {
    public final ImageView M;
    public final p0 N;

    public q0(Context context) {
        super(context);
        int i10 = a0.i(56.0f);
        ImageView imageView = new ImageView(context);
        this.M = imageView;
        p0 p0Var = new p0(context);
        this.N = p0Var;
        p0Var.e(true);
        p0Var.setLayoutParams(FrameLayoutFix.s1(-1, a0.i(72.0f), 0, i10, 0, 0, 0));
        imageView.setLayoutParams(FrameLayoutFix.q1(i10, a0.i(72.0f)));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(j.L(R.id.theme_color_icon));
        addView(imageView);
        addView(p0Var);
        setBackgroundColor(j.u());
    }

    public ImageView A1() {
        return this.M;
    }

    public p0 B1() {
        return this.N;
    }

    public void b() {
        this.N.d();
    }

    public void e() {
        this.N.b();
    }

    public void s() {
        this.N.s();
    }

    public void setIconClickListener(View.OnClickListener onClickListener) {
        p0.T(this.M);
        g.d(this.M, j.d1());
        this.M.setOnClickListener(onClickListener);
    }

    public void setTextClickListener(View.OnClickListener onClickListener) {
        p0.T(this.N);
        g.d(this.N, j.d1());
        this.N.setOnClickListener(onClickListener);
    }

    public void z1(v4<?> v4Var) {
        if (v4Var != null) {
            this.N.a(v4Var);
            v4Var.o8(this, R.id.theme_color_filling);
            v4Var.q8(this.M, R.id.theme_color_icon);
        }
    }
}
