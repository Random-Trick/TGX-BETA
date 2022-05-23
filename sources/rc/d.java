package rc;

import ae.j;
import ae.t;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ce.a0;
import ce.o;
import ce.p0;
import gd.w;
import java.util.concurrent.TimeUnit;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import pc.i;
import pc.p;
import pc.r;
import q0.a;

public class d extends FrameLayout implements i.a, t {
    public TextView M;
    public boolean N = true;
    public final Drawable O;
    public int P;
    public i Q;
    public final TextView f21830a;
    public final TextView f21831b;
    public final TextView f21832c;

    public d(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(o.i());
        this.P = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        TextView textView = new TextView(context);
        this.f21830a = textView;
        textView.setTextSize(15.0f);
        textView.setTypeface(o.i());
        addView(textView, p.a(-2, -2.0f, 8388627, 16.0f, 0.0f, this.P, 0.0f));
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(15.0f);
        this.M.setTypeface(o.i());
        this.M.setGravity(8388627);
        addView(this.M, p.a(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f21831b = textView3;
        textView3.setTextSize(13.0f);
        textView3.setTypeface(o.i());
        textView3.setGravity(8388629);
        addView(textView3, p.a(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f21832c = textView4;
        textView4.setTextSize(13.0f);
        textView4.setTypeface(o.i());
        textView4.setGravity(8388629);
        addView(textView4, p.a(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        this.M.setVisibility(8);
        this.M.setText(w.i1(R.string.ZoomOut));
        Drawable d10 = a.d(getContext(), R.drawable.baseline_zoom_in_24);
        this.O = d10;
        this.M.setCompoundDrawablesWithIntrinsicBounds(d10, (Drawable) null, (Drawable) null, (Drawable) null);
        this.M.setCompoundDrawablePadding(a0.i(4.0f));
        this.M.setPadding(a0.i(8.0f), a0.i(4.0f), a0.i(8.0f), a0.i(4.0f));
        this.M.setBackground(j.c0(j.L(R.id.theme_color_textNegative)));
        textView4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                d.this.d(view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        e();
    }

    public void d(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        TextView textView = this.f21832c;
        textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
        TextView textView2 = this.f21831b;
        textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
    }

    @Override
    public void a(long j10, long j11) {
        if (j10 <= 0 || j11 <= 0) {
            g(false);
            return;
        }
        g(true);
        f(j10, j11);
    }

    @Override
    public void c(boolean z10) {
        e();
        invalidate();
    }

    public void e() {
        this.f21830a.setTextColor(j.O0());
        this.f21831b.setTextColor(j.O0());
        this.f21832c.setTextColor(j.O0());
        this.M.setTextColor(j.L(R.id.theme_color_textNeutral));
        this.O.setColorFilter(j.L(R.id.theme_color_textNeutral), PorterDuff.Mode.SRC_IN);
    }

    public void f(long j10, long j11) {
        String str;
        if (!this.N) {
            this.f21831b.setVisibility(8);
            this.f21832c.setVisibility(8);
            return;
        }
        if (j11 - j10 >= TimeUnit.DAYS.toMillis(1L)) {
            str = w.p0(j10, j11, TimeUnit.MILLISECONDS, false);
        } else {
            str = w.q0(j11, TimeUnit.MILLISECONDS);
        }
        this.f21831b.setText(str);
        this.f21831b.setVisibility(0);
    }

    public void g(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
            if (!z10) {
                this.f21832c.setVisibility(8);
                this.f21831b.setVisibility(8);
                this.f21830a.setLayoutParams(p.a(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
                this.f21830a.requestLayout();
                return;
            }
            this.f21830a.setLayoutParams(p.a(-2, -2.0f, 8388627, 16.0f, 0.0f, this.P, 0.0f));
        }
    }

    public void setChart(r rVar) {
        p0.c0(this.f21830a, w.i1(rVar.f21141a));
        if (rVar.f21142b != null) {
            g(true);
            TextView textView = this.f21831b;
            TdApi.DateRange dateRange = rVar.f21142b;
            textView.setText(w.p0(dateRange.startDate, dateRange.endDate, TimeUnit.SECONDS, false));
            return;
        }
        g(false);
    }

    public void setTitle(String str) {
        this.f21830a.setText(str);
    }

    public void setChart(i iVar) {
        i iVar2 = this.Q;
        if (iVar2 != iVar) {
            if (iVar2 != null) {
                iVar2.f(this);
            }
            this.Q = iVar;
            if (iVar != null) {
                iVar.d(this);
                p0.c0(this.f21830a, w.i1(iVar.l()));
                if (iVar.o()) {
                    g(true);
                    f(iVar.k(), iVar.i());
                    return;
                }
                g(false);
            }
        }
    }
}
