package ud;

import ae.q;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import ce.a0;
import ce.c;
import ce.j0;
import ce.y;
import de.ii;
import eb.f;
import eb.k;
import he.d;
import org.thunderdog.challegram.R;

public class g1 extends u0 implements View.OnClickListener, View.OnLongClickListener, k.b {
    public static final OvershootInterpolator f24181a0 = new OvershootInterpolator(3.0f);
    public final f U = new f(0, this, f24181a0, 130);
    public Drawable V = c.g(getResources(), R.drawable.baseline_lock_top_24);
    public Drawable W = c.g(getResources(), R.drawable.baseline_lock_base_24);

    public g1(Context context) {
        super(context);
        setId(R.id.menu_btn_lock);
        setButtonBackground(q.b());
        setVisibility(d.w().x() ? 0 : 8);
        setOnClickListener(this);
        setOnLongClickListener(this);
        setLayoutParams(new LinearLayout.LayoutParams(a0.i(49.0f), -1));
    }

    public static boolean i() {
        return d.w().y() || d.w().o() == 5;
    }

    public void j() {
        int i10 = d.w().x() ? 0 : 8;
        this.U.p(!i(), false);
        if (i10 != getVisibility()) {
            setVisibility(i10);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        invalidate();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        invalidate();
    }

    @Override
    public void onClick(View view) {
        if (d.w().o() == 5) {
            j0.y0(R.string.AutoLockInstantWarn, 0);
            return;
        }
        this.U.p(!d.w().S(), true);
        j0.r(getContext()).r0(true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Paint H = y.H();
        Drawable drawable = this.V;
        c.b(canvas, drawable, (measuredWidth - (drawable.getMinimumWidth() / 2)) + ((int) (a0.i(8.0f) * this.U.g())), measuredHeight - (this.V.getMinimumHeight() / 2), H);
        Drawable drawable2 = this.W;
        c.b(canvas, drawable2, measuredWidth - (drawable2.getMinimumWidth() / 2), measuredHeight - (this.W.getMinimumHeight() / 2), H);
    }

    @Override
    public boolean onLongClick(View view) {
        q1 Q1 = j0.r(getContext()).Q1();
        v4<?> F = Q1 != null ? Q1.F() : null;
        if (F == null) {
            return false;
        }
        ii iiVar = new ii(j0.r(getContext()), F.c());
        iiVar.Kf(2);
        Q1.h0(iiVar);
        return true;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.U.p(!i(), false);
    }
}
