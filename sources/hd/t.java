package hd;

import ae.j;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import ce.a0;
import ce.c0;
import ce.y;
import ib.i;
import id.d;
import ld.b;
import oc.v0;
import org.thunderdog.challegram.N;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import zd.o6;

public class t extends o<N.Suggestion> {
    public static final char[] f13524g0 = {'_', '{', '}', '/', '(', ')', ':', ';'};
    public CharSequence f13525a0;
    public CharSequence f13526b0;
    public float f13527c0;
    public Layout f13528d0;
    public CharSequence f13529e0;
    public Layout f13530f0;

    public t(a aVar, o6 o6Var, N.Suggestion suggestion, String str) {
        super(aVar, o6Var, 16, null, suggestion);
        this.f13526b0 = d.z().I(suggestion.emoji);
        this.f13525a0 = c0.I(suggestion.label, str, 1, f13524g0);
        this.f13527c0 = v0.T1(suggestion.label, y.h0());
    }

    @Override
    public void E(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: hd.t.E(int):void");
    }

    @Override
    public void P(boolean z10) {
        super.P(z10);
        c0.u(this.f13525a0, z10 ? 2 : 0);
    }

    public String Z() {
        return ((N.Suggestion) this.M).emoji;
    }

    @Override
    public void j(yc.a aVar, Canvas canvas, b bVar, int i10, int i11, int i12) {
        int i13 = a0.i(55.0f);
        int i14 = i12 + a0.i(4.0f) + a0.i(14.0f) + a0.i(5.0f);
        if (this.f13528d0 != null) {
            canvas.save();
            canvas.translate(i13, i14 - a0.i(13.0f));
            this.f13528d0.draw(canvas);
            canvas.restore();
            i13 += a0.i(24.0f);
        }
        if (this.f13529e0 != null) {
            int M = this.Q ? j.M(R.id.theme_color_text, 2) : j.P0();
            if (this.f13530f0 != null) {
                canvas.save();
                canvas.translate(i13, i14 - a0.i(13.0f));
                TextPaint i02 = y.i0(M);
                this.f13530f0.draw(canvas);
                i02.setColor(M);
                canvas.restore();
            } else if (!i.i(this.f13529e0)) {
                canvas.drawText((String) this.f13529e0, i13, i14, y.i0(M));
            }
        }
    }

    @Override
    public int n() {
        return (a0.i(4.0f) * 2) + (a0.i(14.0f) * 2);
    }
}
