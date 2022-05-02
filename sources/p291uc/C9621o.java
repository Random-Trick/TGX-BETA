package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import gd.C4779t2;
import ge.C4896n;
import ie.AbstractC5414n;
import ie.C5428t;
import ie.C5457w0;
import ie.RunnableC5390g;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.SparseDrawableView;
import p037cb.C2061e;
import p082fd.C4403w;
import p108hb.C5064d;
import p139jb.AbstractC5911c;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6250i;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.View$OnClickListenerC9170d1;

public class C9621o extends SparseDrawableView implements AbstractC5911c {
    public Drawable f31193M;
    public RunnableC5390g f31196P;
    public RunnableC5390g f31197Q;
    public int f31199c;
    public final C6240c f31198b = new C6240c(this, 0);
    public final Drawable f31194N = C2061e.m35730a(1996488704, 2, 48, false);
    public final Drawable f31195O = C2061e.m35730a(-1728053248, 2, 80, false);

    public C9621o(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    private int getBottomShadowSize() {
        return (int) ((C1357a0.m37544i(28.0f) + C1357a0.m37544i(5.0f) + ((this.f31196P.getHeight() + this.f31197Q.getHeight()) * 1.3f) + C1357a0.m37544i(8.0f) + C1357a0.m37544i(14.0f)) * 1.1111112f);
    }

    public static int getViewHeight() {
        return (int) (View$OnClickListenerC9170d1.m10088T2(false) * 0.7f);
    }

    @Override
    public void mo4501a3() {
        this.f31198b.mo20250Z();
    }

    public void m7996b() {
        this.f31198b.mo20248b();
    }

    public void m7995f() {
        this.f31198b.mo20246f();
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.f31193M != null) {
            int I0 = this.f31198b.mo20258I0();
            int y0 = this.f31198b.mo20228y0();
            canvas.drawColor(C11524j.m228N(this.f31199c));
            float width = (this.f31198b.getWidth() / 2.0f) / (getMeasuredWidth() / 2.0f);
            canvas.save();
            float f = I0;
            float f2 = y0;
            canvas.scale(width, width, f, f2);
            C1362c.m37490b(canvas, this.f31193M, f - (drawable.getMinimumWidth() / 2.0f), f2 - (this.f31193M.getMinimumHeight() / 2.0f), C1410y.m37058W(C5064d.m24132a(0.3f, -1)));
            canvas.restore();
        } else {
            this.f31198b.draw(canvas);
            this.f31194N.setAlpha(204);
            this.f31194N.draw(canvas);
            canvas.save();
            canvas.translate(0.0f, Math.max(getMeasuredHeight() - getBottomShadowSize(), this.f31194N.getBounds().bottom - C1357a0.m37544i(28.0f)));
            this.f31195O.setAlpha(204);
            this.f31195O.draw(canvas);
            canvas.restore();
        }
        float height = this.f31196P.getHeight() + C1357a0.m37544i(4.0f);
        canvas.save();
        canvas.translate(C1357a0.m37544i(13.0f), getMeasuredHeight() - ((this.f31196P.getHeight() + this.f31197Q.getHeight()) + C1357a0.m37544i(13.0f)));
        this.f31196P.m22892z(canvas, 0, 0, null, 1.0f);
        this.f31197Q.m22892z(canvas, 0, (int) height, null, 1.0f);
        canvas.restore();
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f31198b.mo20257K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.f31196P.m22911q(getMeasuredWidth() - C1357a0.m37544i(13.0f));
        this.f31197Q.m22911q(getMeasuredWidth() - C1357a0.m37544i(13.0f));
        this.f31194N.setBounds(0, 0, getMeasuredWidth(), View$OnClickListenerC9170d1.m10065c3(false) + C4896n.m24480d());
        this.f31195O.setBounds(0, 0, getMeasuredWidth(), getBottomShadowSize());
    }

    public void m7994t(C10930q6 q6Var, TdApi.ChatInviteLinkInfo chatInviteLinkInfo) {
        C6250i iVar;
        boolean N2 = C4779t2.m25638N2(chatInviteLinkInfo.type);
        String str = chatInviteLinkInfo.title;
        int measuredWidth = getMeasuredWidth();
        C5457w0 A0 = C1410y.m37086A0(18.0f);
        AbstractC5414n nVar = C5428t.f17847a;
        this.f31196P = new RunnableC5390g.C5392b(str, measuredWidth, A0, nVar).m22869v().m22884g().m22889b().m22885f();
        this.f31197Q = new RunnableC5390g.C5392b(C4403w.m27814w2(chatInviteLinkInfo.memberCount, 0, N2).toString(), getMeasuredWidth(), C1410y.m37086A0(14.0f), nVar).m22869v().m22885f();
        TdApi.ChatPhotoInfo chatPhotoInfo = chatInviteLinkInfo.photo;
        if (chatPhotoInfo != null) {
            if (chatPhotoInfo.minithumbnail != null) {
                iVar = new C6250i(chatInviteLinkInfo.photo.minithumbnail);
                iVar.mo20768t0(getHeight());
                iVar.m20931Z(true);
                iVar.m20898s0(2);
            } else {
                iVar = null;
            }
            C6246h hVar = new C6246h(q6Var, chatInviteLinkInfo.photo.big);
            hVar.mo20768t0(getHeight());
            hVar.m20898s0(2);
            this.f31193M = null;
            this.f31199c = 0;
            this.f31198b.m20978j(iVar, hVar);
            return;
        }
        this.f31193M = mo14041X(N2 ? R.drawable.baseline_bullhorn_56 : R.drawable.baseline_group_56, 0);
        this.f31199c = C4779t2.m25682H0(chatInviteLinkInfo.chatId, q6Var.m2519ba());
        this.f31198b.clear();
    }
}
