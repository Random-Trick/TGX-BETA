package ne;

import ae.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.o;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;

public class t1 extends FrameLayoutFix {
    public TextView M;
    public ProgressBar N;
    public boolean O;

    public t1(Context context) {
        super(context);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        b2 b2Var = new b2(context);
        this.M = b2Var;
        b2Var.setTypeface(o.k());
        this.M.setTextSize(1, 15.0f);
        this.M.setTextColor(j.Q0());
        this.M.setVisibility(8);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.N = progressBar;
        progressBar.setIndeterminate(true);
        addView(this.N, new FrameLayout.LayoutParams(a0.i(32.0f), a0.i(32.0f), 17));
        addView(this.M, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    private int getCurrentHeight() {
        if (!this.O) {
            return a0.i(42.0f);
        }
        return Math.max(getParent() == null ? 0 : ((ViewGroup) getParent()).getMeasuredHeight(), a0.i(42.0f));
    }

    private void setText(CharSequence charSequence) {
        this.N.setVisibility(8);
        this.M.setText(charSequence);
        this.M.setVisibility(0);
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight != 0 && measuredHeight != getCurrentHeight()) {
            requestLayout();
        }
    }

    public void A1(CharSequence charSequence) {
        if (!this.O) {
            this.M.setTextSize(1, 16.0f);
            this.O = true;
        }
        setText(charSequence);
    }

    public void B1(CharSequence charSequence) {
        if (this.O) {
            this.M.setTextSize(1, 15.0f);
            this.O = false;
        }
        setText(charSequence);
    }

    public void C1() {
        this.O = false;
        this.N.setVisibility(0);
        this.M.setVisibility(8);
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight != 0 && measuredHeight != getCurrentHeight()) {
            requestLayout();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getCurrentHeight(), Log.TAG_TDLIB_OPTIONS));
    }

    public void z1(v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.z8(this.M, R.id.theme_color_background_textLight);
        }
    }
}
