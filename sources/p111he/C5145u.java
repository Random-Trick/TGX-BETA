package p111he;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import be.C1357a0;
import nc.C7389v0;
import p108hb.C5070i;
import p110hd.C5078d;

public class C5145u implements AbstractC5139r {
    public final Layout f17232a;

    public C5145u(CharSequence charSequence, TextPaint textPaint) {
        CharSequence I = C5078d.m23986z().m24024I(charSequence);
        int g = C5070i.m24063g(I, "\n", 0);
        this.f17232a = C7389v0.m16694Q(I, (int) C7389v0.m16688R1(I, 0, g == -1 ? I.length() : g, textPaint), textPaint);
    }

    @Override
    public void mo23818a(View view, Canvas canvas) {
        C5137q.m23834a(this, view, canvas);
    }

    @Override
    public void mo23817b(View view, Canvas canvas) {
        canvas.save();
        canvas.translate((view.getMeasuredWidth() - C1357a0.m37541i(18.0f)) - this.f17232a.getWidth(), (view.getMeasuredHeight() / 2) - (this.f17232a.getHeight() / 2));
        this.f17232a.draw(canvas);
        canvas.restore();
    }
}
