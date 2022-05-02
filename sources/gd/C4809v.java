package gd;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextUtils;
import be.C1357a0;
import be.C1363c0;
import be.C1410y;
import nc.C7389v0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p156kd.C6238b;
import p334xc.C10185a;
import p350yd.C10930q6;
import p364zd.C11524j;

public class C4809v extends AbstractC4718o<String> {
    public final CharSequence f16391a0;
    public CharSequence f16392b0;
    public Layout f16393c0;

    public C4809v(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, String str, String str2) {
        super(aVar, q6Var, 13, null, '#' + str);
        this.f16391a0 = C1363c0.m37465I((String) this.f15886M, str2, 1, null);
    }

    @Override
    public void mo25116E(int i) {
        int i2 = i - (C1357a0.m37541i(12.0f) * 2);
        CharSequence ellipsize = TextUtils.ellipsize(this.f16391a0, C1410y.m37084A(), i2, TextUtils.TruncateAt.END);
        this.f16392b0 = ellipsize;
        if (ellipsize instanceof String) {
            this.f16393c0 = null;
        } else {
            this.f16393c0 = C7389v0.m16694Q(ellipsize, i2, C1410y.m37084A());
        }
    }

    @Override
    public void mo25206P(boolean z) {
        super.mo25206P(z);
        C1363c0.m37412u(this.f16391a0, z ? 2 : 0);
    }

    @Override
    public void mo25112k(C10185a aVar, Canvas canvas, C6238b bVar, int i, int i2, int i3) {
        if (this.f16392b0 != null) {
            int i4 = C1357a0.m37541i(12.0f);
            int i5 = i3 + C1357a0.m37541i(4.0f) + C1357a0.m37541i(14.0f) + C1357a0.m37541i(5.0f);
            int O = this.f15890Q ? C11524j.m226O(R.id.theme_color_text, 2) : C11524j.m217S0();
            if (this.f16393c0 != null) {
                int color = C1410y.m37084A().getColor();
                C1410y.m37084A().setColor(O);
                canvas.save();
                canvas.translate(i4, i5 - C1357a0.m37541i(13.0f));
                this.f16393c0.draw(canvas);
                canvas.restore();
                C1410y.m37084A().setColor(color);
                return;
            }
            canvas.drawText((String) this.f16392b0, i4, i5, C1410y.m37082B(O));
        }
    }

    @Override
    public int mo25111n() {
        return (C1357a0.m37541i(4.0f) * 2) + (C1357a0.m37541i(14.0f) * 2);
    }
}
