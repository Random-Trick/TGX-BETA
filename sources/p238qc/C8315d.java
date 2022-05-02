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
    public TextView f26803M;
    public boolean f26804N = true;
    public final Drawable f26805O;
    public int f26806P;
    public C7833i f26807Q;
    public final TextView f26808a;
    public final TextView f26809b;
    public final TextView f26810c;

    public C8315d(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(C1389o.m37263i());
        this.f26806P = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        TextView textView = new TextView(context);
        this.f26808a = textView;
        textView.setTextSize(15.0f);
        textView.setTypeface(C1389o.m37263i());
        addView(textView, C7844p.m14881a(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f26806P, 0.0f));
        TextView textView2 = new TextView(context);
        this.f26803M = textView2;
        textView2.setTextSize(15.0f);
        this.f26803M.setTypeface(C1389o.m37263i());
        this.f26803M.setGravity(8388627);
        addView(this.f26803M, C7844p.m14881a(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f26809b = textView3;
        textView3.setTextSize(13.0f);
        textView3.setTypeface(C1389o.m37263i());
        textView3.setGravity(8388629);
        addView(textView3, C7844p.m14881a(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f26810c = textView4;
        textView4.setTextSize(13.0f);
        textView4.setTypeface(C1389o.m37263i());
        textView4.setGravity(8388629);
        addView(textView4, C7844p.m14881a(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        this.f26803M.setVisibility(8);
        this.f26803M.setText(C4403w.m27871i1(R.string.ZoomOut));
        Drawable f = C8117a.m13437f(getContext(), R.drawable.baseline_zoom_in_24);
        this.f26805O = f;
        this.f26803M.setCompoundDrawablesWithIntrinsicBounds(f, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f26803M.setCompoundDrawablePadding(C1357a0.m37544i(4.0f));
        this.f26803M.setPadding(C1357a0.m37544i(8.0f), C1357a0.m37544i(4.0f), C1357a0.m37544i(8.0f), C1357a0.m37544i(4.0f));
        this.f26803M.setBackground(C11524j.m189e0(C11524j.m228N(R.id.theme_color_textNegative)));
        textView4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C8315d.this.m12898d(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        m12897e();
    }

    public void m12898d(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TextView textView = this.f26810c;
        textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
        TextView textView2 = this.f26809b;
        textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
    }

    @Override
    public void mo12900a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            m12895g(false);
            return;
        }
        m12895g(true);
        m12896f(j, j2);
    }

    @Override
    public void mo90c(boolean z) {
        m12897e();
        invalidate();
    }

    public void m12897e() {
        this.f26808a.setTextColor(C11524j.m219R0());
        this.f26809b.setTextColor(C11524j.m219R0());
        this.f26810c.setTextColor(C11524j.m219R0());
        this.f26803M.setTextColor(C11524j.m228N(R.id.theme_color_textNeutral));
        this.f26805O.setColorFilter(C11524j.m228N(R.id.theme_color_textNeutral), PorterDuff.Mode.SRC_IN);
    }

    public void m12896f(long j, long j2) {
        String str;
        if (!this.f26804N) {
            this.f26809b.setVisibility(8);
            this.f26810c.setVisibility(8);
            return;
        }
        if (j2 - j >= TimeUnit.DAYS.toMillis(1L)) {
            str = C4403w.m27844p0(j, j2, TimeUnit.MILLISECONDS, false);
        } else {
            str = C4403w.m27840q0(j2, TimeUnit.MILLISECONDS);
        }
        this.f26809b.setText(str);
        this.f26809b.setVisibility(0);
    }

    public void m12895g(boolean z) {
        if (this.f26804N != z) {
            this.f26804N = z;
            if (!z) {
                this.f26810c.setVisibility(8);
                this.f26809b.setVisibility(8);
                this.f26808a.setLayoutParams(C7844p.m14881a(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
                this.f26808a.requestLayout();
                return;
            }
            this.f26808a.setLayoutParams(C7844p.m14881a(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f26806P, 0.0f));
        }
    }

    public void setChart(C7846r rVar) {
        C1399s0.m37178j0(this.f26808a, C4403w.m27871i1(rVar.f25251a));
        if (rVar.f25252b != null) {
            m12895g(true);
            TextView textView = this.f26809b;
            TdApi.DateRange dateRange = rVar.f25252b;
            textView.setText(C4403w.m27844p0(dateRange.startDate, dateRange.endDate, TimeUnit.SECONDS, false));
            return;
        }
        m12895g(false);
    }

    public void setTitle(String str) {
        this.f26808a.setText(str);
    }

    public void setChart(C7833i iVar) {
        C7833i iVar2 = this.f26807Q;
        if (iVar2 != iVar) {
            if (iVar2 != null) {
                iVar2.m14923f(this);
            }
            this.f26807Q = iVar;
            if (iVar != null) {
                iVar.m14925d(this);
                C1399s0.m37178j0(this.f26808a, C4403w.m27871i1(iVar.m14917l()));
                if (iVar.m14914o()) {
                    m12895g(true);
                    m12896f(iVar.m14918k(), iVar.m14920i());
                    return;
                }
                m12895g(false);
            }
        }
    }
}
