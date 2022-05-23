package ie;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import ce.a0;
import ib.i;
import id.d;
import oc.v0;

public class u implements r {
    public final Layout f14290a;

    public u(CharSequence charSequence, TextPaint textPaint) {
        CharSequence I = d.z().I(charSequence);
        int g10 = i.g(I, "\n", 0);
        this.f14290a = v0.Q(I, (int) v0.R1(I, 0, g10 == -1 ? I.length() : g10, textPaint), textPaint);
    }

    @Override
    public void a(View view, Canvas canvas) {
        q.a(this, view, canvas);
    }

    @Override
    public void b(View view, Canvas canvas) {
        canvas.save();
        canvas.translate((view.getMeasuredWidth() - a0.i(18.0f)) - this.f14290a.getWidth(), (view.getMeasuredHeight() / 2) - (this.f14290a.getHeight() / 2));
        this.f14290a.draw(canvas);
        canvas.restore();
    }
}
