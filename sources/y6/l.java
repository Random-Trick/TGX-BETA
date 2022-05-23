package y6;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.thunderdog.challegram.Log;

public final class l extends FrameLayout {
    public final ProgressBar f26598a;
    public final TextView f26599b;

    public l(Context context) {
        super(context, null, w.d(context));
        k kVar = new k(context);
        setBackgroundColor(-16777216);
        ProgressBar progressBar = new ProgressBar(context);
        this.f26598a = progressBar;
        progressBar.setVisibility(8);
        addView(progressBar, new FrameLayout.LayoutParams(-2, -2, 17));
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        TextView textView = new TextView(context);
        this.f26599b = textView;
        textView.setTextAppearance(context, 16973894);
        textView.setTextColor(-1);
        textView.setVisibility(8);
        textView.setPadding(i10, i10, i10, i10);
        textView.setGravity(17);
        textView.setText(kVar.f26588a);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    public final void a() {
        this.f26598a.setVisibility(8);
        this.f26599b.setVisibility(8);
    }

    public final void b() {
        this.f26598a.setVisibility(0);
        this.f26599b.setVisibility(8);
    }

    public final void c() {
        this.f26598a.setVisibility(8);
        this.f26599b.setVisibility(0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (mode == 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
                size2 = (int) (size / 1.777f);
            } else {
                if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && mode == 0)) {
                    f10 = size2;
                } else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    f10 = size2;
                    float f11 = size / 1.777f;
                    if (f10 >= f11) {
                        size2 = (int) f11;
                    }
                } else {
                    size = 0;
                    size2 = 0;
                }
                size = (int) (f10 * 1.777f);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(FrameLayout.resolveSize(size, i10), Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(FrameLayout.resolveSize(size2, i11), Log.TAG_TDLIB_OPTIONS));
    }
}
