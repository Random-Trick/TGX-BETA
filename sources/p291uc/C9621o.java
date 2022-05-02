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
    public Drawable f31190M;
    public RunnableC5390g f31193P;
    public RunnableC5390g f31194Q;
    public int f31196c;
    public final C6240c f31195b = new C6240c(this, 0);
    public final Drawable f31191N = C2061e.m35727a(1996488704, 2, 48, false);
    public final Drawable f31192O = C2061e.m35727a(-1728053248, 2, 80, false);

    public C9621o(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    private int getBottomShadowSize() {
        return (int) ((C1357a0.m37541i(28.0f) + C1357a0.m37541i(5.0f) + ((this.f31193P.getHeight() + this.f31194Q.getHeight()) * 1.3f) + C1357a0.m37541i(8.0f) + C1357a0.m37541i(14.0f)) * 1.1111112f);
    }

    public static int getViewHeight() {
        return (int) (View$OnClickListenerC9170d1.m10089T2(false) * 0.7f);
    }

    @Override
    public void mo4501a3() {
        this.f31195b.mo20249Z();
    }

    public void m7996b() {
        this.f31195b.mo20247b();
    }

    public void m7995f() {
        this.f31195b.mo20245f();
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.f31190M != null) {
            int I0 = this.f31195b.mo20257I0();
            int y0 = this.f31195b.mo20227y0();
            canvas.drawColor(C11524j.m228N(this.f31196c));
            float width = (this.f31195b.getWidth() / 2.0f) / (getMeasuredWidth() / 2.0f);
            canvas.save();
            float f = I0;
            float f2 = y0;
            canvas.scale(width, width, f, f2);
            C1362c.m37487b(canvas, this.f31190M, f - (drawable.getMinimumWidth() / 2.0f), f2 - (this.f31190M.getMinimumHeight() / 2.0f), C1410y.m37055W(C5064d.m24131a(0.3f, -1)));
            canvas.restore();
        } else {
            this.f31195b.draw(canvas);
            this.f31191N.setAlpha(204);
            this.f31191N.draw(canvas);
            canvas.save();
            canvas.translate(0.0f, Math.max(getMeasuredHeight() - getBottomShadowSize(), this.f31191N.getBounds().bottom - C1357a0.m37541i(28.0f)));
            this.f31192O.setAlpha(204);
            this.f31192O.draw(canvas);
            canvas.restore();
        }
        float height = this.f31193P.getHeight() + C1357a0.m37541i(4.0f);
        canvas.save();
        canvas.translate(C1357a0.m37541i(13.0f), getMeasuredHeight() - ((this.f31193P.getHeight() + this.f31194Q.getHeight()) + C1357a0.m37541i(13.0f)));
        this.f31193P.m22891z(canvas, 0, 0, null, 1.0f);
        this.f31194Q.m22891z(canvas, 0, (int) height, null, 1.0f);
        canvas.restore();
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f31195b.mo20256K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.f31193P.m22910q(getMeasuredWidth() - C1357a0.m37541i(13.0f));
        this.f31194Q.m22910q(getMeasuredWidth() - C1357a0.m37541i(13.0f));
        this.f31191N.setBounds(0, 0, getMeasuredWidth(), View$OnClickListenerC9170d1.m10066c3(false) + C4896n.m24479d());
        this.f31192O.setBounds(0, 0, getMeasuredWidth(), getBottomShadowSize());
    }

    public void m7994t(C10930q6 q6Var, TdApi.ChatInviteLinkInfo chatInviteLinkInfo) {
        C6250i iVar;
        boolean N2 = C4779t2.m25637N2(chatInviteLinkInfo.type);
        String str = chatInviteLinkInfo.title;
        int measuredWidth = getMeasuredWidth();
        C5457w0 A0 = C1410y.m37083A0(18.0f);
        AbstractC5414n nVar = C5428t.f17847a;
        this.f31193P = new RunnableC5390g.C5392b(str, measuredWidth, A0, nVar).m22868v().m22883g().m22888b().m22884f();
        this.f31194Q = new RunnableC5390g.C5392b(C4403w.m27812w2(chatInviteLinkInfo.memberCount, 0, N2).toString(), getMeasuredWidth(), C1410y.m37083A0(14.0f), nVar).m22868v().m22884f();
        TdApi.ChatPhotoInfo chatPhotoInfo = chatInviteLinkInfo.photo;
        if (chatPhotoInfo != null) {
            if (chatPhotoInfo.minithumbnail != null) {
                iVar = new C6250i(chatInviteLinkInfo.photo.minithumbnail);
                iVar.mo20767t0(getHeight());
                iVar.m20930Z(true);
                iVar.m20897s0(2);
            } else {
                iVar = null;
            }
            C6246h hVar = new C6246h(q6Var, chatInviteLinkInfo.photo.big);
            hVar.mo20767t0(getHeight());
            hVar.m20897s0(2);
            this.f31190M = null;
            this.f31196c = 0;
            this.f31195b.m20977j(iVar, hVar);
            return;
        }
        this.f31190M = mo14042X(N2 ? R.drawable.baseline_bullhorn_56 : R.drawable.baseline_group_56, 0);
        this.f31196c = C4779t2.m25681H0(chatInviteLinkInfo.chatId, q6Var.m2519ba());
        this.f31195b.clear();
    }
}
