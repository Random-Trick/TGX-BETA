package hd;

import ae.j;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextUtils;
import ce.a0;
import ce.c0;
import ce.y;
import ld.b;
import oc.v0;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import zd.o6;

public class v extends o<String> {
    public final CharSequence f13649a0;
    public CharSequence f13650b0;
    public Layout f13651c0;

    public v(a aVar, o6 o6Var, String str, String str2) {
        super(aVar, o6Var, 13, null, '#' + str);
        this.f13649a0 = c0.I((String) this.M, str2, 1, null);
    }

    @Override
    public void E(int i10) {
        int i11 = i10 - (a0.i(12.0f) * 2);
        CharSequence ellipsize = TextUtils.ellipsize(this.f13649a0, y.A(), i11, TextUtils.TruncateAt.END);
        this.f13650b0 = ellipsize;
        if (ellipsize instanceof String) {
            this.f13651c0 = null;
        } else {
            this.f13651c0 = v0.Q(ellipsize, i11, y.A());
        }
    }

    @Override
    public void P(boolean z10) {
        super.P(z10);
        c0.u(this.f13649a0, z10 ? 2 : 0);
    }

    @Override
    public void j(yc.a aVar, Canvas canvas, b bVar, int i10, int i11, int i12) {
        if (this.f13650b0 != null) {
            int i13 = a0.i(12.0f);
            int i14 = i12 + a0.i(4.0f) + a0.i(14.0f) + a0.i(5.0f);
            int M = this.Q ? j.M(R.id.theme_color_text, 2) : j.P0();
            if (this.f13651c0 != null) {
                int color = y.A().getColor();
                y.A().setColor(M);
                canvas.save();
                canvas.translate(i13, i14 - a0.i(13.0f));
                this.f13651c0.draw(canvas);
                canvas.restore();
                y.A().setColor(color);
                return;
            }
            canvas.drawText((String) this.f13650b0, i13, i14, y.B(M));
        }
    }

    @Override
    public int n() {
        return (a0.i(4.0f) * 2) + (a0.i(14.0f) * 2);
    }
}
