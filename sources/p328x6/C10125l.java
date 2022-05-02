package p328x6;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.thunderdog.challegram.Log;

public final class C10125l extends FrameLayout {
    public final ProgressBar f32814a;
    public final TextView f32815b;

    public C10125l(Context context) {
        super(context, null, C10149w.m5893d(context));
        C10124k kVar = new C10124k(context);
        setBackgroundColor(-16777216);
        ProgressBar progressBar = new ProgressBar(context);
        this.f32814a = progressBar;
        progressBar.setVisibility(8);
        addView(progressBar, new FrameLayout.LayoutParams(-2, -2, 17));
        int i = (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        TextView textView = new TextView(context);
        this.f32815b = textView;
        textView.setTextAppearance(context, 16973894);
        textView.setTextColor(-1);
        textView.setVisibility(8);
        textView.setPadding(i, i, i, i);
        textView.setGravity(17);
        textView.setText(kVar.f32804a);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    public final void m5979a() {
        this.f32814a.setVisibility(8);
        this.f32815b.setVisibility(8);
    }

    public final void m5978b() {
        this.f32814a.setVisibility(0);
        this.f32815b.setVisibility(8);
    }

    public final void m5977c() {
        this.f32814a.setVisibility(8);
        this.f32815b.setVisibility(0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (mode == 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
                size2 = (int) (size / 1.777f);
            } else {
                if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && mode == 0)) {
                    f = size2;
                } else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    f = size2;
                    float f2 = size / 1.777f;
                    if (f >= f2) {
                        size2 = (int) f2;
                    }
                } else {
                    size = 0;
                    size2 = 0;
                }
                size = (int) (f * 1.777f);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(FrameLayout.resolveSize(size, i), Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(FrameLayout.resolveSize(size2, i2), Log.TAG_TDLIB_OPTIONS));
    }
}
