package me;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1389o;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C7030t1 extends FrameLayoutFix {
    public TextView f22307M;
    public ProgressBar f22308N;
    public RunnableC6996p3 f22309O;
    public boolean f22310P;

    public C7030t1(Context context) {
        super(context);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        C6847b2 b2Var = new C6847b2(context);
        this.f22307M = b2Var;
        b2Var.setTypeface(C1389o.m37258k());
        this.f22307M.setTextSize(1, 15.0f);
        this.f22307M.setTextColor(C11524j.m215T0());
        this.f22307M.setVisibility(8);
        if (Build.VERSION.SDK_INT >= 21) {
            ProgressBar progressBar = new ProgressBar(getContext());
            this.f22308N = progressBar;
            progressBar.setIndeterminate(true);
            addView(this.f22308N, new FrameLayout.LayoutParams(C1357a0.m37541i(32.0f), C1357a0.m37541i(32.0f), 17));
        } else {
            RunnableC6996p3 p3Var = new RunnableC6996p3(context);
            this.f22309O = p3Var;
            p3Var.setImageResource(R.drawable.spinner_48_inner);
            addView(this.f22309O, new FrameLayout.LayoutParams(C1357a0.m37541i(32.0f), C1357a0.m37541i(32.0f), 17));
        }
        addView(this.f22307M, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    private int getCurrentHeight() {
        if (!this.f22310P) {
            return C1357a0.m37541i(42.0f);
        }
        return Math.max(getParent() == null ? 0 : ((ViewGroup) getParent()).getMeasuredHeight(), C1357a0.m37541i(42.0f));
    }

    private void setText(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f22308N.setVisibility(8);
        } else {
            this.f22309O.setVisibility(8);
        }
        this.f22307M.setText(charSequence);
        this.f22307M.setVisibility(0);
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight != 0 && measuredHeight != getCurrentHeight()) {
            requestLayout();
        }
    }

    public void m18060C1(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.m9119z8(this.f22307M, R.id.theme_color_background_textLight);
        }
    }

    public void m18059D1(CharSequence charSequence) {
        if (!this.f22310P) {
            this.f22307M.setTextSize(1, 16.0f);
            this.f22310P = true;
        }
        setText(charSequence);
    }

    public void m18058E1(CharSequence charSequence) {
        if (this.f22310P) {
            this.f22307M.setTextSize(1, 15.0f);
            this.f22310P = false;
        }
        setText(charSequence);
    }

    public void m18057F1() {
        this.f22310P = false;
        if (Build.VERSION.SDK_INT >= 21) {
            this.f22308N.setVisibility(0);
        } else {
            this.f22309O.setVisibility(0);
        }
        this.f22307M.setVisibility(8);
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight != 0 && measuredHeight != getCurrentHeight()) {
            requestLayout();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getCurrentHeight(), Log.TAG_TDLIB_OPTIONS));
    }
}
