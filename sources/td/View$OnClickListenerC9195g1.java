package td;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1410y;
import ge.C4862d;
import org.thunderdog.challegram.R;
import p038ce.C2536ii;
import p051db.C3940f;
import p051db.C3950k;
import p364zd.C11532q;

public class View$OnClickListenerC9195g1 extends C9310u0 implements View.OnClickListener, View.OnLongClickListener, C3950k.AbstractC3952b {
    public static final OvershootInterpolator f29687a0 = new OvershootInterpolator(3.0f);
    public final C3940f f29688U = new C3940f(0, this, f29687a0, 130);
    public Drawable f29689V = C1362c.m37485g(getResources(), R.drawable.baseline_lock_top_24);
    public Drawable f29690W = C1362c.m37485g(getResources(), R.drawable.baseline_lock_base_24);

    public View$OnClickListenerC9195g1(Context context) {
        super(context);
        setId(R.id.menu_btn_lock);
        setButtonBackground(C11532q.m113b());
        setVisibility(C4862d.m24935w().m24934x() ? 0 : 8);
        setOnClickListener(this);
        setOnLongClickListener(this);
        setLayoutParams(new LinearLayout.LayoutParams(C1357a0.m37544i(49.0f), -1));
    }

    public static boolean m9985i() {
        return C4862d.m24935w().m24933y() || C4862d.m24935w().m24943o() == 5;
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        invalidate();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        invalidate();
    }

    public void m9984j() {
        int i = C4862d.m24935w().m24934x() ? 0 : 8;
        this.f29688U.m29577p(!m9985i(), false);
        if (i != getVisibility()) {
            setVisibility(i);
        }
    }

    @Override
    public void onClick(View view) {
        if (C4862d.m24935w().m24943o() == 5) {
            C1379j0.m37295y0(R.string.AutoLockInstantWarn, 0);
            return;
        }
        this.f29688U.m29577p(!C4862d.m24935w().m24963S(), true);
        C1379j0.m37310r(getContext()).m14458o0(true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Paint H = C1410y.m37073H();
        Drawable drawable = this.f29689V;
        C1362c.m37490b(canvas, drawable, (measuredWidth - (drawable.getMinimumWidth() / 2)) + ((int) (C1357a0.m37544i(8.0f) * this.f29688U.m29586g())), measuredHeight - (this.f29689V.getMinimumHeight() / 2), H);
        Drawable drawable2 = this.f29690W;
        C1362c.m37490b(canvas, drawable2, measuredWidth - (drawable2.getMinimumWidth() / 2), measuredHeight - (this.f29690W.getMinimumHeight() / 2), H);
    }

    @Override
    public boolean onLongClick(View view) {
        C9270q1 P1 = C1379j0.m37310r(getContext()).m14551P1();
        AbstractC9323v4<?> F = P1 != null ? P1.m9762F() : null;
        if (F == null) {
            return false;
        }
        C2536ii iiVar = new C2536ii(C1379j0.m37310r(getContext()), F.mo4348c());
        iiVar.m34310Kf(2);
        P1.m9718h0(iiVar);
        return true;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f29688U.m29577p(!m9985i(), false);
    }
}
