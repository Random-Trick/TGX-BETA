package hd;

import ae.j;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import ce.a0;
import ce.c;
import ce.y;
import ce.z;
import gd.w;
import ib.i;
import java.util.concurrent.TimeUnit;
import je.g;
import ob.a;
import ob.e;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import vc.g1;
import vc.v2;

public class u4 extends s4 {
    public final TdApi.MessageCall U2;
    public int V2;
    public int W2;
    public String X2;
    public String Y2;
    public boolean Z2;
    public float f13642a3;
    public float f13643b3;
    public boolean f13644c3;
    public float f13645d3;
    public float f13646e3;

    public u4(v2 v2Var, TdApi.Message message, TdApi.MessageCall messageCall) {
        super(v2Var, message);
        this.U2 = messageCall;
    }

    @Override
    public int W2() {
        return R9() ? a0.i(46.0f) : a0.i(25.0f) * 2;
    }

    @Override
    public int Y1() {
        return s4.f13429g2 + s4.f13430h2;
    }

    @Override
    public void a1(g1 g1Var, Canvas canvas, int i10, int i11, int i12) {
        Drawable Z = g1Var.Z(this.U2.isVideo ? R.drawable.baseline_videocam_24 : R.drawable.baseline_phone_24, 0);
        Drawable Z2 = g1Var.Z(this.V2, 0);
        boolean R9 = R9();
        int i13 = R.id.theme_color_file;
        if (R9) {
            if (g6()) {
                i13 = R.id.theme_color_bubbleOut_file;
            }
            c.b(canvas, Z, ((a3() + i10) - (W2() / 2.0f)) - (Z.getMinimumWidth() / 2.0f), (i11 + (W2() / 2.0f)) - (Z.getMinimumHeight() / 2.0f), z.b(i13));
        } else {
            int i14 = a0.i(25.0f);
            float f10 = i10 + i14;
            float f11 = i11 + i14;
            canvas.drawCircle(f10, f11, i14, y.g(j.L(R.id.theme_color_file)));
            c.b(canvas, Z, f10 - (Z.getMinimumWidth() / 2.0f), f11 - (Z.getMinimumHeight() / 2.0f), y.W(-1));
            i10 += (i14 * 2) + a0.i(11.0f);
        }
        if (R9()) {
            i11 -= a0.i(4.0f);
        }
        float f12 = i10;
        canvas.drawText(this.X2, f12, a0.i(21.0f) + i11, y.O(15.0f, J4(), this.Z2));
        int i15 = this.V2;
        c.b(canvas, Z2, f12, a0.i(i15 == R.drawable.baseline_call_missed_18 ? 27.5f : i15 == R.drawable.baseline_call_made_18 ? 26.5f : 27.0f) + i11, y.W(j.L(this.W2)));
        canvas.drawText(this.Y2, i10 + a0.i(20.0f), i11 + a0.i(41.0f), y.c0(13.0f, j3()));
    }

    @Override
    public int a3() {
        return ((int) Math.max(Math.max(this.f13642a3, this.f13643b3 + a0.i(20.0f)), R9() ? a0.i(182.0f) : 0.0f)) + a0.i(40.0f) + a0.i(11.0f);
    }

    @Override
    public void b0(int i10) {
        int i11;
        this.V2 = e.j(this.U2, f6());
        this.W2 = e.l(this.U2);
        boolean z10 = R9() || this.U2.duration > 0;
        if (z10) {
            i11 = t2.K0(this.U2, f6(), true);
        } else {
            i11 = f6() ? R.string.OutgoingCall : R.string.IncomingCall;
        }
        String i12 = w.i1(i11);
        String h10 = e.h(this.f13449a, z10, 1);
        if (R9()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(w.T2(this.f13449a.date, TimeUnit.SECONDS));
            if (!i.i(h10)) {
                sb2.append(", ");
                sb2.append(h10);
            }
            h10 = sb2.toString();
        } else {
            i10 -= a0.i(40.0f) + a0.i(11.0f);
        }
        boolean M0 = g.M0(i12);
        this.Z2 = M0;
        this.X2 = TextUtils.ellipsize(i12, y.P(15.0f, M0), i10, TextUtils.TruncateAt.END).toString();
        this.Y2 = TextUtils.ellipsize(h10, y.f0(), i10 - a0.i(20.0f), TextUtils.TruncateAt.END).toString();
        this.f13642a3 = v0.T1(this.X2, y.P(13.0f, this.Z2));
        this.f13643b3 = v0.T1(this.Y2, y.f0());
    }

    @Override
    public boolean f8(g1 g1Var, MotionEvent motionEvent) {
        long j10;
        boolean z10 = true;
        if (super.f8(g1Var, motionEvent)) {
            return true;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.f13644c3) {
                        this.f13644c3 = false;
                        return true;
                    }
                } else if (this.f13644c3 && Math.abs(x10 - this.f13645d3) > a0.p() && Math.abs(y10 - this.f13646e3) > a0.p()) {
                    this.f13644c3 = false;
                    return true;
                }
            } else if (this.f13644c3) {
                this.f13644c3 = true;
                if (f6()) {
                    j10 = a.q(this.f13449a.chatId);
                } else {
                    j10 = e.T0(this.f13449a);
                }
                if (j10 == 0) {
                    return false;
                }
                k8();
                this.O0.F4().c0().p0(Q0(), j10, null);
                return true;
            }
            return this.f13644c3;
        }
        if (x10 < b3() || x10 > b3() + a3() || y10 < c3() || y10 > c3() + W2()) {
            z10 = false;
        }
        this.f13644c3 = z10;
        this.f13645d3 = x10;
        this.f13646e3 = y10;
        return z10;
    }
}
