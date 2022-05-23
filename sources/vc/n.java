package vc;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ce.a0;
import ce.y;
import db.e;
import gd.w;
import hd.t2;
import ib.d;
import je.g;
import je.t;
import je.w0;
import kb.c;
import ld.h;
import ld.i;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.SparseDrawableView;
import ud.d1;
import zd.o6;

public class n extends SparseDrawableView implements c {
    public Drawable M;
    public g P;
    public g Q;
    public int f25127c;
    public final ld.c f25126b = new ld.c(this, 0);
    public final Drawable N = e.a(1996488704, 2, 48, false);
    public final Drawable O = e.a(-1728053248, 2, 80, false);

    public n(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    private int getBottomShadowSize() {
        return (int) ((a0.i(28.0f) + a0.i(5.0f) + ((this.P.getHeight() + this.Q.getHeight()) * 1.3f) + a0.i(8.0f) + a0.i(14.0f)) * 1.1111112f);
    }

    public static int getViewHeight() {
        return (int) (d1.R2(false) * 0.7f);
    }

    @Override
    public void Q2() {
        this.f25126b.b0();
    }

    public void b() {
        this.f25126b.b();
    }

    public void e() {
        this.f25126b.e();
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.M != null) {
            int J0 = this.f25126b.J0();
            int x02 = this.f25126b.x0();
            canvas.drawColor(j.L(this.f25127c));
            float width = (this.f25126b.getWidth() / 2.0f) / (getMeasuredWidth() / 2.0f);
            canvas.save();
            float f10 = J0;
            float f11 = x02;
            canvas.scale(width, width, f10, f11);
            ce.c.b(canvas, this.M, f10 - (drawable.getMinimumWidth() / 2.0f), f11 - (this.M.getMinimumHeight() / 2.0f), y.W(d.a(0.3f, -1)));
            canvas.restore();
        } else {
            this.f25126b.draw(canvas);
            this.N.setAlpha(204);
            this.N.draw(canvas);
            canvas.save();
            canvas.translate(0.0f, Math.max(getMeasuredHeight() - getBottomShadowSize(), this.N.getBounds().bottom - a0.i(28.0f)));
            this.O.setAlpha(204);
            this.O.draw(canvas);
            canvas.restore();
        }
        float height = this.P.getHeight() + a0.i(4.0f);
        canvas.save();
        canvas.translate(a0.i(13.0f), getMeasuredHeight() - ((this.P.getHeight() + this.Q.getHeight()) + a0.i(13.0f)));
        this.P.z(canvas, 0, 0, null, 1.0f);
        this.Q.z(canvas, 0, (int) height, null, 1.0f);
        canvas.restore();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f25126b.K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.P.q(getMeasuredWidth() - a0.i(13.0f));
        this.Q.q(getMeasuredWidth() - a0.i(13.0f));
        this.N.setBounds(0, 0, getMeasuredWidth(), d1.a3(false) + he.n.d());
        this.O.setBounds(0, 0, getMeasuredWidth(), getBottomShadowSize());
    }

    public void v(o6 o6Var, TdApi.ChatInviteLinkInfo chatInviteLinkInfo) {
        i iVar;
        boolean N2 = t2.N2(chatInviteLinkInfo.type);
        String str = chatInviteLinkInfo.title;
        int measuredWidth = getMeasuredWidth();
        w0 A0 = y.A0(18.0f);
        je.n nVar = t.f15467a;
        this.P = new g.b(str, measuredWidth, A0, nVar).v().g().b().f();
        this.Q = new g.b(w.w2(chatInviteLinkInfo.memberCount, 0, N2).toString(), getMeasuredWidth(), y.A0(14.0f), nVar).v().f();
        TdApi.ChatPhotoInfo chatPhotoInfo = chatInviteLinkInfo.photo;
        if (chatPhotoInfo != null) {
            if (chatPhotoInfo.minithumbnail != null) {
                iVar = new i(chatInviteLinkInfo.photo.minithumbnail);
                iVar.t0(getHeight());
                iVar.Z(true);
                iVar.s0(2);
            } else {
                iVar = null;
            }
            h hVar = new h(o6Var, chatInviteLinkInfo.photo.big);
            hVar.t0(getHeight());
            hVar.s0(2);
            this.M = null;
            this.f25127c = 0;
            this.f25126b.j(iVar, hVar);
            return;
        }
        this.M = Z(N2 ? R.drawable.baseline_bullhorn_56 : R.drawable.baseline_group_56, 0);
        this.f25127c = t2.H0(chatInviteLinkInfo.chatId, o6Var.fa());
        this.f25126b.clear();
    }
}
