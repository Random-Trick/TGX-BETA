package p238qc;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1389o;
import be.C1399s0;
import java.util.concurrent.TimeUnit;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p208oc.C7833i;
import p208oc.C7844p;
import p208oc.C7846r;
import p227q0.C8117a;
import p364zd.AbstractC11535t;
import p364zd.C11524j;

public class C8315d extends FrameLayout implements C7833i.AbstractC7834a, AbstractC11535t {
    public TextView f26800M;
    public boolean f26801N = true;
    public final Drawable f26802O;
    public int f26803P;
    public C7833i f26804Q;
    public final TextView f26805a;
    public final TextView f26806b;
    public final TextView f26807c;

    public C8315d(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(C1389o.m37260i());
        this.f26803P = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        TextView textView = new TextView(context);
        this.f26805a = textView;
        textView.setTextSize(15.0f);
        textView.setTypeface(C1389o.m37260i());
        addView(textView, C7844p.m14881a(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f26803P, 0.0f));
        TextView textView2 = new TextView(context);
        this.f26800M = textView2;
        textView2.setTextSize(15.0f);
        this.f26800M.setTypeface(C1389o.m37260i());
        this.f26800M.setGravity(8388627);
        addView(this.f26800M, C7844p.m14881a(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f26806b = textView3;
        textView3.setTextSize(13.0f);
        textView3.setTypeface(C1389o.m37260i());
        textView3.setGravity(8388629);
        addView(textView3, C7844p.m14881a(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f26807c = textView4;
        textView4.setTextSize(13.0f);
        textView4.setTypeface(C1389o.m37260i());
        textView4.setGravity(8388629);
        addView(textView4, C7844p.m14881a(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        this.f26800M.setVisibility(8);
        this.f26800M.setText(C4403w.m27869i1(R.string.ZoomOut));
        Drawable f = C8117a.m13438f(getContext(), R.drawable.baseline_zoom_in_24);
        this.f26802O = f;
        this.f26800M.setCompoundDrawablesWithIntrinsicBounds(f, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f26800M.setCompoundDrawablePadding(C1357a0.m37541i(4.0f));
        this.f26800M.setPadding(C1357a0.m37541i(8.0f), C1357a0.m37541i(4.0f), C1357a0.m37541i(8.0f), C1357a0.m37541i(4.0f));
        this.f26800M.setBackground(C11524j.m189e0(C11524j.m228N(R.id.theme_color_textNegative)));
        textView4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C8315d.this.m12899d(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        m12898e();
    }

    public void m12899d(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TextView textView = this.f26807c;
        textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
        TextView textView2 = this.f26806b;
        textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
    }

    @Override
    public void mo12901a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            m12896g(false);
            return;
        }
        m12896g(true);
        m12897f(j, j2);
    }

    @Override
    public void mo90c(boolean z) {
        m12898e();
        invalidate();
    }

    public void m12898e() {
        this.f26805a.setTextColor(C11524j.m219R0());
        this.f26806b.setTextColor(C11524j.m219R0());
        this.f26807c.setTextColor(C11524j.m219R0());
        this.f26800M.setTextColor(C11524j.m228N(R.id.theme_color_textNeutral));
        this.f26802O.setColorFilter(C11524j.m228N(R.id.theme_color_textNeutral), PorterDuff.Mode.SRC_IN);
    }

    public void m12897f(long j, long j2) {
        String str;
        if (!this.f26801N) {
            this.f26806b.setVisibility(8);
            this.f26807c.setVisibility(8);
            return;
        }
        if (j2 - j >= TimeUnit.DAYS.toMillis(1L)) {
            str = C4403w.m27842p0(j, j2, TimeUnit.MILLISECONDS, false);
        } else {
            str = C4403w.m27838q0(j2, TimeUnit.MILLISECONDS);
        }
        this.f26806b.setText(str);
        this.f26806b.setVisibility(0);
    }

    public void m12896g(boolean z) {
        if (this.f26801N != z) {
            this.f26801N = z;
            if (!z) {
                this.f26807c.setVisibility(8);
                this.f26806b.setVisibility(8);
                this.f26805a.setLayoutParams(C7844p.m14881a(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
                this.f26805a.requestLayout();
                return;
            }
            this.f26805a.setLayoutParams(C7844p.m14881a(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f26803P, 0.0f));
        }
    }

    public void setChart(C7846r rVar) {
        C1399s0.m37175j0(this.f26805a, C4403w.m27869i1(rVar.f25248a));
        if (rVar.f25249b != null) {
            m12896g(true);
            TextView textView = this.f26806b;
            TdApi.DateRange dateRange = rVar.f25249b;
            textView.setText(C4403w.m27842p0(dateRange.startDate, dateRange.endDate, TimeUnit.SECONDS, false));
            return;
        }
        m12896g(false);
    }

    public void setTitle(String str) {
        this.f26805a.setText(str);
    }

    public void setChart(C7833i iVar) {
        C7833i iVar2 = this.f26804Q;
        if (iVar2 != iVar) {
            if (iVar2 != null) {
                iVar2.m14923f(this);
            }
            this.f26804Q = iVar;
            if (iVar != null) {
                iVar.m14925d(this);
                C1399s0.m37175j0(this.f26805a, C4403w.m27869i1(iVar.m14917l()));
                if (iVar.m14914o()) {
                    m12896g(true);
                    m12897f(iVar.m14918k(), iVar.m14920i());
                    return;
                }
                m12896g(false);
            }
        }
    }
}
