package vc;

import ae.q;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import gd.w;
import hd.p7;
import hd.t2;
import ib.i;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.d1;
import ud.m;
import ud.v4;
import zd.o6;

public class f extends m {
    public a S0;
    public CharSequence T0;
    public o6 U0;

    public interface a {
        void p3();
    }

    public f(Context context, o6 o6Var, v4<?> v4Var) {
        super(context, o6Var, v4Var);
        setPhotoOpenDisabled(true);
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                f.this.d2(view);
            }
        });
        setUseDefaultClickListener(true);
        setBackgroundResource(q.b());
        R1(a0.i(56.0f), a0.i(49.0f));
    }

    public void d2(View view) {
        a aVar = this.S0;
        if (aVar != null) {
            aVar.p3();
        }
    }

    public void f2(o6 o6Var, TdApi.Chat chat, p7 p7Var) {
        this.U0 = o6Var;
        setShowLock(chat != null && ob.a.j(chat.f19908id));
        if (chat == null) {
            T1("Debug controller", "nobody should find this view");
        } else if (p7Var != null) {
            R1(a0.i(56.0f), a0.i(49.0f));
            T1(w.o2(p7Var.a() ? R.string.xComments : R.string.xReplies, p7Var.j()), null);
            b1(p7Var.b(), p7Var.g());
        } else {
            g2(chat, chat.photo);
            setShowVerify(o6Var.l4(chat));
            setShowScam(o6Var.L3(chat));
            setShowFake(o6Var.k3(chat));
            setShowMute(t2.x4(chat.notificationSettings, o6Var.lb(chat.f19908id)));
            T1(o6Var.W3(chat), !i.i(this.T0) ? this.T0 : o6Var.Bc().n(chat));
            setExpandedSubtitle(o6Var.Bc().o(chat));
            setUseRedHighlight(o6Var.h7(chat.f19908id));
            b1(chat.f19908id, 0L);
        }
    }

    public final void g2(TdApi.Chat chat, TdApi.ChatPhotoInfo chatPhotoInfo) {
        boolean z10 = this.U0.k7(chat.f19908id) || chatPhotoInfo == null;
        setPhotoOpenDisabled(z10);
        if (z10) {
            setAvatarPlaceholder(this.U0.D3(chat, true, m.getBaseAvatarRadiusDp(), null));
        } else {
            setAvatar(chatPhotoInfo);
        }
    }

    public void h2(TdApi.Chat chat, TdApi.ChatPhotoInfo chatPhotoInfo) {
        g2(chat, chatPhotoInfo);
        W1();
    }

    public void i2(long j10, String str) {
        setTitle(str);
        TdApi.Chat W2 = this.U0.W2(j10);
        if (W2 != null && W2.photo == null) {
            g2(W2, null);
            W1();
        }
    }

    public void j2(long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        boolean x42 = t2.x4(chatNotificationSettings, this.U0.lb(j10));
        if (getShowMute() != x42) {
            setShowMute(x42);
        }
    }

    @Override
    public void k0(float f10, float f11, float f12, boolean z10) {
        float f13 = this.f24278k0;
        if (f13 != f10) {
            boolean z11 = false;
            boolean z12 = f13 == 0.0f || f10 == 0.0f;
            super.k0(f10, f11, f12, z10);
            if (z12) {
                if (f10 == 0.0f) {
                    z11 = true;
                }
                setEnabled(z11);
                requestLayout();
            }
        }
    }

    public void k2(TdApi.Chat chat) {
        if (i.i(this.T0)) {
            setSubtitle(this.U0.Bc().n(chat));
            setExpandedSubtitle(this.U0.Bc().o(chat));
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, d1.b3(this.f24278k0 != 0.0f, true));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.S0 != null && super.onTouchEvent(motionEvent);
    }

    public void setCallback(a aVar) {
        this.S0 = aVar;
    }

    public void setForcedSubtitle(CharSequence charSequence) {
        if (!i.c(this.T0, charSequence)) {
            this.T0 = charSequence;
            setNoStatus(!i.i(charSequence));
            if (q1()) {
                setSubtitle(charSequence);
            }
        }
    }
}
