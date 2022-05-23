package hd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.p0;
import ce.y;
import db.b;
import de.rh;
import eb.k;
import fd.a;
import ib.d;
import ib.i;
import java.io.File;
import ld.c;
import ld.h;
import ld.v;
import md.j;
import md.m;
import ne.g1;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import vc.h1;
import vc.v2;
import vd.o0;
import zd.o6;

public class i6 extends s4 implements g1.c, o0.f {
    public TdApi.VideoNote U2;
    public boolean V2;
    public g1 W2;
    public h X2;
    public h Y2;
    public j Z2;
    public int f13089a3;
    public int f13090b3;
    public String f13091c3;
    public float f13092d3;
    public k f13093e3;
    public float f13094f3;
    public boolean f13095g3;
    public float f13096h3;
    public k f13097i3;
    public int f13098j3;

    public i6(v2 v2Var, TdApi.Message message, TdApi.VideoNote videoNote, boolean z10) {
        super(v2Var, message);
        ia(videoNote);
        fa(!z10, false);
    }

    public static int ca() {
        return a0.i(200.0f);
    }

    public static h da(o6 o6Var, TdApi.VideoNote videoNote) {
        TdApi.Thumbnail thumbnail;
        if (videoNote == null || (thumbnail = videoNote.thumbnail) == null) {
            return null;
        }
        h D5 = t2.D5(o6Var, thumbnail);
        if (D5 != null) {
            D5.t0(a0.i(200.0f));
        }
        return D5;
    }

    @Override
    public int C1(View view, int i10) {
        int b32 = b3();
        int i11 = this.f13098j3 + b32;
        return g6() ? i11 - i10 : ((b32 + i11) / 2) + ((int) (((float) ((this.f13098j3 / 2) * Math.sin(Math.toRadians(45.0d)))) + a0.i(6.0f)));
    }

    @Override
    public final void I7(int i10, float f10, float f11) {
        if (i10 == 0) {
            ja(f10);
        } else if (i10 == 1) {
            ga(f10);
        }
    }

    @Override
    public void I8(m mVar) {
        mVar.r(t2.T2(this.U2.video) ? this.Z2 : null);
    }

    @Override
    public boolean L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z10) {
        fa(!((TdApi.MessageVideoNote) messageContent).isViewed, true);
        return false;
    }

    @Override
    public void M8(c cVar) {
        cVar.j(this.X2, this.Y2);
    }

    @Override
    public int O3(boolean z10) {
        return this.f13098j3 / 2;
    }

    @Override
    public void P7(boolean z10) {
        if (z10) {
            this.O0.F4().w2().r(this.O0, X3(), this);
        } else {
            this.O0.F4().w2().T0(this.O0, X3(), this);
        }
    }

    @Override
    public void Q7(View view, boolean z10) {
        this.W2.R();
    }

    @Override
    public void R7(vc.g1 g1Var, boolean z10) {
        if (j0.r(g1Var.getContext()).a1().E(this.O0, this.f13449a)) {
            v4<?> q92 = v4.q9(g1Var);
            if (q92 instanceof rh) {
                ((rh) q92).aj();
            }
        }
        this.W2.R();
    }

    @Override
    public boolean R8() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean S9() {
        return true;
    }

    @Override
    public int W2() {
        return this.f13098j3;
    }

    @Override
    public boolean X0() {
        return true;
    }

    @Override
    public void X7(long j10) {
        fa(false, true);
    }

    @Override
    public int Y1() {
        return a0.i(2.0f);
    }

    @Override
    public void Z(TdApi.ChatType chatType) {
        this.W2.m(chatType);
    }

    @Override
    public void Z7(long j10, long j11, boolean z10) {
        this.W2.V0(j10, j11, z10);
    }

    @Override
    public int a3() {
        return this.f13098j3;
    }

    @Override
    public void b0(int i10) {
        this.f13098j3 = ca();
    }

    @Override
    public void c1(vc.g1 g1Var, Canvas canvas, int i10, int i11, int i12, v vVar, v vVar2) {
        int i13 = this.f13098j3;
        vVar.K0(i10, i11, i10 + i13, i13 + i11);
        if (vVar.e0()) {
            vVar.u0(canvas, this.f13098j3 / 2);
        }
        vVar.draw(canvas);
    }

    @Override
    public void e(TdApi.File file, int i10) {
    }

    public final void ea(int i10) {
        if (i.i(this.f13091c3) || this.f13090b3 != i10) {
            this.f13090b3 = i10;
            String h10 = c0.h(i10);
            this.f13091c3 = h10;
            this.f13092d3 = v0.T1(h10, R9() ? s4.P6() : s4.O6(false));
            A5();
        }
    }

    @Override
    public boolean f8(vc.g1 g1Var, MotionEvent motionEvent) {
        return super.f8(g1Var, motionEvent) || this.W2.S(g1Var, motionEvent);
    }

    public final void fa(boolean z10, boolean z11) {
        if (this.V2 != z10 && f6()) {
            this.V2 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (!z11 || !this.Q0.g()) {
                k kVar = this.f13093e3;
                if (kVar != null) {
                    kVar.l(f10);
                }
                ja(f10);
                return;
            }
            if (this.f13093e3 == null) {
                this.f13093e3 = new k(0, this, b.f7287b, 180L, this.f13094f3);
            }
            this.f13093e3.i(f10);
        }
    }

    @Override
    public void g(TdApi.File file, float f10) {
    }

    public final void ga(float f10) {
        if (this.f13096h3 != f10) {
            this.f13096h3 = f10;
            A5();
        }
    }

    public final void ha(boolean z10) {
        if (this.f13095g3 != z10) {
            this.f13095g3 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (this.P0.g()) {
                if (this.f13097i3 == null) {
                    this.f13097i3 = new k(1, this, b.f7287b, 180L, this.f13096h3);
                }
                this.f13097i3.i(f10);
                return;
            }
            k kVar = this.f13097i3;
            if (kVar != null) {
                kVar.l(f10);
            }
            ga(f10);
        }
    }

    @Override
    public void i(o6 o6Var, long j10, long j11, int i10, int i11) {
        boolean z10 = i11 != 0;
        ha(z10);
        if (!z10) {
            ea(this.f13089a3);
        }
    }

    @Override
    public void i1(vc.g1 g1Var, Canvas canvas, int i10, int i11, int i12) {
        int i13;
        Drawable Z;
        g1 g1Var2 = this.W2;
        int i14 = this.f13098j3;
        g1Var2.h0(i10, i11, i10 + i14, i14 + i11);
        this.W2.o(g1Var, canvas);
        c previewReceiver = g1Var.getPreviewReceiver();
        int J0 = previewReceiver.J0();
        int width = J0 - ((int) ((previewReceiver.getWidth() / 2) * Math.sin(Math.toRadians(45.0d))));
        int i15 = (int) (this.f13092d3 + (a0.i(5.0f) * this.f13094f3));
        int bottom = (previewReceiver.getBottom() - s4.s2()) - a0.i(8.0f);
        boolean R9 = R9();
        if (R9) {
            int i16 = bottom - a0.i(3.5f);
            RectF a02 = y.a0();
            int i17 = a0.i(6.0f);
            int i18 = width - i15;
            a02.set(i18 - (i17 * 2), i16, width, i16 + a0.i(21.0f));
            canvas.drawRoundRect(a02, a0.i(12.0f), a0.i(12.0f), y.g(q2()));
            bottom = i16 - a0.i(1.0f);
            canvas.drawText(this.f13091c3, i18 - i17, a0.i(15.5f) + bottom, y.a(s4.P6(), v2()));
            width -= a0.i(7.0f);
        } else {
            canvas.drawText(this.f13091c3, width - i15, a0.i(15.0f) + bottom, s4.O6(true));
        }
        if (this.f13094f3 > 0.0f) {
            canvas.drawCircle(width, bottom + a0.i(11.5f), a0.i(1.5f), y.g(d.a(this.f13094f3, R9 ? -1 : ae.j.L(R.id.theme_color_online))));
        }
        float s10 = (1.0f - this.f13096h3) * (1.0f - this.W2.s());
        if (s10 > 0.0f) {
            int i19 = a0.i(12.0f);
            int bottom2 = (previewReceiver.getBottom() - i19) - a0.i(10.0f);
            float f10 = ((1.0f - this.f13096h3) * 0.4f) + 0.6f;
            int i20 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i20 != 0) {
                i13 = p0.O(canvas);
                canvas.scale(f10, f10, J0, bottom2);
            } else {
                i13 = -1;
            }
            float f11 = J0;
            float f12 = bottom2;
            canvas.drawCircle(f11, f12, i19, y.g(d.a(s10, Log.TAG_TDLIB_OPTIONS)));
            Paint W = y.W(-1);
            W.setAlpha((int) (s10 * 255.0f));
            ce.c.b(canvas, g1Var.Z(R.drawable.deproko_baseline_sound_muted_24, 0), f11 - (Z.getMinimumWidth() / 2.0f), f12 - (Z.getMinimumHeight() / 2.0f), W);
            W.setAlpha(255);
            if (i20 != 0) {
                p0.N(canvas, i13);
            }
        }
    }

    public final void ia(TdApi.VideoNote videoNote) {
        this.U2 = videoNote;
        g1 g1Var = new g1(t(), this.O0, 64, true, I2(), K3());
        this.W2 = g1Var;
        g1Var.L0(this);
        this.W2.R0(this.Q0);
        this.W2.p0(videoNote.video, X3());
        if (videoNote.minithumbnail != null) {
            this.X2 = new ld.i(videoNote.minithumbnail);
        }
        this.Y2 = da(this.O0, videoNote);
        j jVar = new j(this.O0, videoNote.video, 2);
        this.Z2 = jVar;
        TdApi.Message message = this.f13449a;
        jVar.C(message.chatId, message.f19946id);
        this.Z2.J(a0.i(200.0f));
        if (!he.i.c2().z2()) {
            this.Z2.D(true);
        }
        int i10 = videoNote.duration;
        this.f13089a3 = i10;
        ea(i10);
    }

    public final void ja(float f10) {
        if (this.f13094f3 != f10) {
            this.f13094f3 = f10;
            A5();
        }
    }

    @Override
    public boolean k(g1 g1Var, View view, TdApi.File file, long j10) {
        if (!a.f11893o) {
            v0.m2(this.N0.r0(), "video.mp4", new File(file.local.path), "video/mp4", 0);
            w8();
            return true;
        } else if (!(view.getParent() instanceof h1)) {
            return true;
        } else {
            this.O0.F4().w2().H0(this.O0, this.f13449a, this.N0);
            return true;
        }
    }

    @Override
    public boolean q7() {
        return true;
    }

    @Override
    public void x6(o6 o6Var, long j10, long j11, int i10, float f10, long j12, long j13, boolean z10) {
        if (this.f13095g3) {
            ea((j12 == -1 || j13 == -1) ? this.f13089a3 : Math.min(this.f13089a3, v0.w(j13 - j12)));
        }
    }

    @Override
    public boolean y7() {
        return true;
    }
}
