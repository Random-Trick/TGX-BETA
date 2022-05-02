package gd;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import be.C1357a0;
import be.C1363c0;
import be.C1410y;
import nc.C7389v0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.R;
import p108hb.C5070i;
import p110hd.C5078d;
import p156kd.C6238b;
import p334xc.C10185a;
import p350yd.C10930q6;
import p364zd.C11524j;

public class C4776t extends AbstractC4718o<C7888N.Suggestion> {
    public static final char[] f16203g0 = {'_', '{', '}', '/', '(', ')', ':', ';'};
    public CharSequence f16204a0;
    public CharSequence f16205b0;
    public float f16206c0;
    public Layout f16207d0;
    public CharSequence f16208e0;
    public Layout f16209f0;

    public C4776t(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, C7888N.Suggestion suggestion, String str) {
        super(aVar, q6Var, 16, null, suggestion);
        this.f16205b0 = C5078d.m23987z().m24025I(suggestion.emoji);
        this.f16204a0 = C1363c0.m37468I(suggestion.label, str, 1, f16203g0);
        this.f16206c0 = C7389v0.m16680T1(suggestion.label, C1410y.m37039h0());
    }

    @Override
    public void mo25117E(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4776t.mo25117E(int):void");
    }

    @Override
    public void mo25207P(boolean z) {
        super.mo25207P(z);
        C1363c0.m37415u(this.f16204a0, z ? 2 : 0);
    }

    public String m25733Z() {
        return ((C7888N.Suggestion) this.f15886M).emoji;
    }

    @Override
    public void mo25113k(C10185a aVar, Canvas canvas, C6238b bVar, int i, int i2, int i3) {
        int i4 = C1357a0.m37544i(55.0f);
        int i5 = i3 + C1357a0.m37544i(4.0f) + C1357a0.m37544i(14.0f) + C1357a0.m37544i(5.0f);
        if (this.f16207d0 != null) {
            canvas.save();
            canvas.translate(i4, i5 - C1357a0.m37544i(13.0f));
            this.f16207d0.draw(canvas);
            canvas.restore();
            i4 += C1357a0.m37544i(24.0f);
        }
        if (this.f16208e0 != null) {
            int O = this.f15890Q ? C11524j.m226O(R.id.theme_color_text, 2) : C11524j.m217S0();
            if (this.f16209f0 != null) {
                canvas.save();
                canvas.translate(i4, i5 - C1357a0.m37544i(13.0f));
                TextPaint i0 = C1410y.m37037i0(O);
                this.f16209f0.draw(canvas);
                i0.setColor(O);
                canvas.restore();
            } else if (!C5070i.m24062i(this.f16208e0)) {
                canvas.drawText((String) this.f16208e0, i4, i5, C1410y.m37037i0(O));
            }
        }
    }

    @Override
    public int mo25112n() {
        return (C1357a0.m37544i(4.0f) * 2) + (C1357a0.m37544i(14.0f) * 2);
    }
}
