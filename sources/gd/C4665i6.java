package gd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1363c0;
import be.C1379j0;
import be.C1399s0;
import be.C1410y;
import ge.C4868i;
import java.io.File;
import me.C6883g1;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2971rh;
import p051db.C3950k;
import p067ed.C4183a;
import p108hb.C5064d;
import p108hb.C5070i;
import p156kd.AbstractC6264v;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6250i;
import p168ld.C6503j;
import p168ld.RunnableC6507m;
import p291uc.C9552h1;
import p291uc.C9565i1;
import p291uc.C9678w2;
import p292ud.C9773p0;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C4665i6 extends AbstractC4761s4 implements C6883g1.AbstractC6886c, C9773p0.AbstractC9779f {
    public TdApi.VideoNote f15566U2;
    public boolean f15567V2;
    public C6883g1 f15568W2;
    public C6246h f15569X2;
    public C6246h f15570Y2;
    public C6503j f15571Z2;
    public int f15572a3;
    public int f15573b3;
    public String f15574c3;
    public float f15575d3;
    public C3950k f15576e3;
    public float f15577f3;
    public boolean f15578g3;
    public float f15579h3;
    public C3950k f15580i3;
    public int f15581j3;

    public C4665i6(C9678w2 w2Var, TdApi.Message message, TdApi.VideoNote videoNote, boolean z) {
        super(w2Var, message);
        m26595ia(videoNote);
        m26598fa(!z, false);
    }

    public static int m26601ca() {
        return C1357a0.m37544i(200.0f);
    }

    public static C6246h m26600da(C10930q6 q6Var, TdApi.VideoNote videoNote) {
        TdApi.Thumbnail thumbnail;
        if (videoNote == null || (thumbnail = videoNote.thumbnail) == null) {
            return null;
        }
        C6246h D5 = C4779t2.m25705D5(q6Var, thumbnail);
        if (D5 != null) {
            D5.mo20768t0(C1357a0.m37544i(200.0f));
        }
        return D5;
    }

    @Override
    public int mo26199F1(View view, int i) {
        int d3 = m25960d3();
        int i2 = this.f15581j3 + d3;
        return m25919h6() ? i2 - i : ((d3 + i2) / 2) + ((int) (((float) ((this.f15581j3 / 2) * Math.sin(Math.toRadians(45.0d)))) + C1357a0.m37544i(6.0f)));
    }

    @Override
    public final void mo25339I7(int i, float f, float f2) {
        if (i == 0) {
            m26594ja(f);
        } else if (i == 1) {
            m26597ga(f);
        }
    }

    @Override
    public void mo26161I8(RunnableC6507m mVar) {
        mVar.m20232r(C4779t2.m25599T2(this.f15566U2.video) ? this.f15571Z2 : null);
    }

    @Override
    public boolean mo25334L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        m26598fa(!((TdApi.MessageVideoNote) messageContent).isViewed, true);
        return false;
    }

    @Override
    public void mo26122M8(C6240c cVar) {
        cVar.m20978j(this.f15569X2, this.f15570Y2);
    }

    @Override
    public void mo26092P7(boolean z) {
        if (z) {
            this.f16099O0.m2930B4().m4636w2().m7026r(this.f16099O0, m25994Z3(), this);
        } else {
            this.f16099O0.m2930B4().m4636w2().m7081T0(this.f16099O0, m25994Z3(), this);
        }
    }

    @Override
    public void mo26082Q7(View view, boolean z) {
        this.f15568W2.m18655P();
    }

    @Override
    public boolean mo26079R() {
        return false;
    }

    @Override
    public int mo26075R3(boolean z) {
        return this.f15581j3 / 2;
    }

    @Override
    public void mo26071R7(C9552h1 h1Var, boolean z) {
        if (C1379j0.m37310r(h1Var.getContext()).m14522X0().m7350j(this.f16099O0, this.f16122a)) {
            AbstractC9323v4<?> q9 = AbstractC9323v4.m9183q9(h1Var);
            if (q9 instanceof View$OnClickListenerC2971rh) {
                ((View$OnClickListenerC2971rh) q9).m32479aj();
            }
        }
        this.f15568W2.m18655P();
    }

    @Override
    public boolean mo26070R8() {
        return true;
    }

    @Override
    public boolean mo26058S9() {
        return true;
    }

    @Override
    public void mo6973V2(C10930q6 q6Var, long j, long j2, int i, float f, long j3, long j4, boolean z) {
        if (this.f15578g3) {
            m26599ea((j3 == -1 || j4 == -1) ? this.f15572a3 : Math.min(this.f15572a3, C7389v0.m16570w(j4 - j3)));
        }
    }

    @Override
    public boolean mo26017X0() {
        return true;
    }

    @Override
    public int mo25223X2() {
        return this.f15581j3;
    }

    @Override
    public void mo26011X7(long j) {
        m26598fa(false, true);
    }

    @Override
    public void mo26008Y(TdApi.ChatType chatType) {
        this.f15568W2.m18619l(chatType);
    }

    @Override
    public void mo25991Z7(long j, long j2, boolean z) {
        this.f15568W2.m18652Q0(j, j2, z);
    }

    @Override
    public void mo25222a0(int i) {
        this.f15581j3 = m26601ca();
    }

    @Override
    public void mo15929b(TdApi.File file, int i) {
    }

    @Override
    public int mo25220b2() {
        return C1357a0.m37544i(2.0f);
    }

    @Override
    public int mo25219c3() {
        return this.f15581j3;
    }

    @Override
    public void mo25962d1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, AbstractC6264v vVar, AbstractC6264v vVar2) {
        int i4 = this.f15581j3;
        vVar.mo20257K0(i, i2, i + i4, i4 + i2);
        if (vVar.mo20247c0()) {
            vVar.mo20229u0(canvas, this.f15581j3 / 2);
        }
        vVar.draw(canvas);
    }

    @Override
    public boolean mo15925e(C6883g1 g1Var, View view, TdApi.File file, long j) {
        if (!C4183a.f14097o) {
            C7389v0.m16607m2(this.f16097N0.m7645r0(), "video.mp4", new File(file.local.path), "video/mp4", 0);
            m25770w8();
            return true;
        } else if (!(view.getParent() instanceof C9565i1)) {
            return true;
        } else {
            this.f16099O0.m2930B4().m4636w2().m7105H0(this.f16099O0, this.f16122a, this.f16097N0);
            return true;
        }
    }

    public final void m26599ea(int i) {
        if (C5070i.m24062i(this.f15574c3) || this.f15573b3 != i) {
            this.f15573b3 = i;
            String h = C1363c0.m37436h(i);
            this.f15574c3 = h;
            this.f15575d3 = C7389v0.m16680T1(h, m26069R9() ? AbstractC4761s4.m26093P6() : AbstractC4761s4.m26102O6(false));
            m26237B5();
        }
    }

    @Override
    public void mo15923f(TdApi.File file, float f) {
    }

    @Override
    public boolean mo25218f8(C9552h1 h1Var, MotionEvent motionEvent) {
        return super.mo25218f8(h1Var, motionEvent) || this.f15568W2.m18653Q(h1Var, motionEvent);
    }

    public final void m26598fa(boolean z, boolean z2) {
        if (this.f15567V2 != z && m25929g6()) {
            this.f15567V2 = z;
            float f = z ? 1.0f : 0.0f;
            if (!z2 || !this.f16103Q0.mo28227g()) {
                C3950k kVar = this.f15576e3;
                if (kVar != null) {
                    kVar.m29543l(f);
                }
                m26594ja(f);
                return;
            }
            if (this.f15576e3 == null) {
                this.f15576e3 = new C3950k(0, this, C2057b.f7280b, 180L, this.f15577f3);
            }
            this.f15576e3.m29546i(f);
        }
    }

    public final void m26597ga(float f) {
        if (this.f15579h3 != f) {
            this.f15579h3 = f;
            m26237B5();
        }
    }

    public final void m26596ha(boolean z) {
        if (this.f15578g3 != z) {
            this.f15578g3 = z;
            float f = z ? 1.0f : 0.0f;
            if (this.f16101P0.mo28227g()) {
                if (this.f15580i3 == null) {
                    this.f15580i3 = new C3950k(1, this, C2057b.f7280b, 180L, this.f15579h3);
                }
                this.f15580i3.m29546i(f);
                return;
            }
            C3950k kVar = this.f15580i3;
            if (kVar != null) {
                kVar.m29543l(f);
            }
            m26597ga(f);
        }
    }

    public final void m26595ia(TdApi.VideoNote videoNote) {
        this.f15566U2 = videoNote;
        C6883g1 g1Var = new C6883g1(mo4347s(), this.f16099O0, 64, true, m26146K2(), m26116N3());
        this.f15568W2 = g1Var;
        g1Var.m18668I0(this);
        this.f15568W2.m18658N0(this.f16103Q0);
        this.f15568W2.m18614n0(videoNote.video, m25994Z3());
        if (videoNote.minithumbnail != null) {
            this.f15569X2 = new C6250i(videoNote.minithumbnail);
        }
        this.f15570Y2 = m26600da(this.f16099O0, videoNote);
        C6503j jVar = new C6503j(this.f16099O0, videoNote.video, 2);
        this.f15571Z2 = jVar;
        TdApi.Message message = this.f16122a;
        jVar.m20304C(message.chatId, message.f25409id);
        this.f15571Z2.m20297J(C1357a0.m37544i(200.0f));
        if (!C4868i.m24727c2().m24547z2()) {
            this.f15571Z2.m20303D(true);
        }
        int i = videoNote.duration;
        this.f15572a3 = i;
        m26599ea(i);
    }

    @Override
    public void mo25904j1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3) {
        int i4;
        Drawable X;
        C6883g1 g1Var = this.f15568W2;
        int i5 = this.f15581j3;
        g1Var.m18630f0(i, i2, i + i5, i5 + i2);
        this.f15568W2.m18615n(h1Var, canvas);
        C6240c previewReceiver = h1Var.getPreviewReceiver();
        int I0 = previewReceiver.mo20258I0();
        int width = I0 - ((int) ((previewReceiver.getWidth() / 2) * Math.sin(Math.toRadians(45.0d))));
        int i6 = (int) (this.f15575d3 + (C1357a0.m37544i(5.0f) * this.f15577f3));
        int bottom = (previewReceiver.getBottom() - AbstractC4761s4.m25795u2()) - C1357a0.m37544i(8.0f);
        boolean R9 = m26069R9();
        if (R9) {
            int i7 = bottom - C1357a0.m37544i(3.5f);
            RectF a0 = C1410y.m37053a0();
            int i8 = C1357a0.m37544i(6.0f);
            int i9 = width - i6;
            a0.set(i9 - (i8 * 2), i7, width, i7 + C1357a0.m37544i(21.0f));
            canvas.drawRoundRect(a0, C1357a0.m37544i(12.0f), C1357a0.m37544i(12.0f), C1410y.m37042g(m25816s2()));
            bottom = i7 - C1357a0.m37544i(1.0f);
            canvas.drawText(this.f15574c3, i9 - i8, C1357a0.m37544i(15.5f) + bottom, C1410y.m37054a(AbstractC4761s4.m26093P6(), m25765x2()));
            width -= C1357a0.m37544i(7.0f);
        } else {
            canvas.drawText(this.f15574c3, width - i6, C1357a0.m37544i(15.0f) + bottom, AbstractC4761s4.m26102O6(true));
        }
        if (this.f15577f3 > 0.0f) {
            canvas.drawCircle(width, bottom + C1357a0.m37544i(11.5f), C1357a0.m37544i(1.5f), C1410y.m37042g(C5064d.m24132a(this.f15577f3, R9 ? -1 : C11524j.m228N(R.id.theme_color_online))));
        }
        float r = (1.0f - this.f15579h3) * (1.0f - this.f15568W2.m18607r());
        if (r > 0.0f) {
            int i10 = C1357a0.m37544i(12.0f);
            int bottom2 = (previewReceiver.getBottom() - i10) - C1357a0.m37544i(10.0f);
            float f = ((1.0f - this.f15579h3) * 0.4f) + 0.6f;
            int i11 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i11 != 0) {
                i4 = C1399s0.m37202V(canvas);
                canvas.scale(f, f, I0, bottom2);
            } else {
                i4 = -1;
            }
            float f2 = I0;
            float f3 = bottom2;
            canvas.drawCircle(f2, f3, i10, C1410y.m37042g(C5064d.m24132a(r, Log.TAG_TDLIB_OPTIONS)));
            Paint W = C1410y.m37058W(-1);
            W.setAlpha((int) (r * 255.0f));
            C1362c.m37490b(canvas, h1Var.mo14041X(R.drawable.deproko_baseline_sound_muted_24, 0), f2 - (X.getMinimumWidth() / 2.0f), f3 - (X.getMinimumHeight() / 2.0f), W);
            W.setAlpha(255);
            if (i11 != 0) {
                C1399s0.m37204T(canvas, i4);
            }
        }
    }

    public final void m26594ja(float f) {
        if (this.f15577f3 != f) {
            this.f15577f3 = f;
            m26237B5();
        }
    }

    @Override
    public boolean mo25830q7() {
        return true;
    }

    @Override
    public boolean mo25750y7() {
        return true;
    }

    @Override
    public void mo6972z1(C10930q6 q6Var, long j, long j2, int i, int i2) {
        boolean z = i2 != 0;
        m26596ha(z);
        if (!z) {
            m26599ea(this.f15572a3);
        }
    }
}
