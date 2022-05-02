package p291uc;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import gd.C4737p7;
import gd.C4779t2;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p193nb.C7316a;
import p350yd.C10930q6;
import p364zd.C11532q;
import td.AbstractC9323v4;
import td.C9239m;
import td.View$OnClickListenerC9170d1;

public class C9534f extends C9239m {
    public AbstractC9535a f30879S0;
    public CharSequence f30880T0;
    public C10930q6 f30881U0;

    public interface AbstractC9535a {
        void mo8397x3();
    }

    public C9534f(Context context, C10930q6 q6Var, AbstractC9323v4<?> v4Var) {
        super(context, q6Var, v4Var);
        setPhotoOpenDisabled(true);
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C9534f.this.m8405d2(view);
            }
        });
        setUseDefaultClickListener(true);
        setBackgroundResource(C11532q.m113b());
        m9833Q1(C1357a0.m37541i(56.0f), C1357a0.m37541i(49.0f));
    }

    public void m8405d2(View view) {
        AbstractC9535a aVar = this.f30879S0;
        if (aVar != null) {
            aVar.mo8397x3();
        }
    }

    public void m8404f2(C10930q6 q6Var, TdApi.Chat chat, C4737p7 p7Var) {
        this.f30881U0 = q6Var;
        setShowLock(chat != null && C7316a.m17051j(chat.f25367id));
        if (chat == null) {
            m9831S1("Debug controller", "nobody should find this view");
        } else if (p7Var != null) {
            m9833Q1(C1357a0.m37541i(56.0f), C1357a0.m37541i(49.0f));
            m9831S1(C4403w.m27844o2(p7Var.m26300a() ? R.string.xComments : R.string.xReplies, p7Var.m26291j()), null);
            m9827W0(p7Var.m26299b(), p7Var.m26294g());
        } else {
            m8403h2(chat, chat.photo);
            setShowVerify(q6Var.m2430h4(chat));
            setShowMute(C4779t2.m25393x4(chat.notificationSettings, q6Var.m2423hb(chat.f25367id)));
            m9831S1(q6Var.m2661S3(chat), !C5070i.m24061i(this.f30880T0) ? this.f30880T0 : q6Var.m2166xc().m3295n(chat));
            setExpandedSubtitle(q6Var.m2166xc().m3294o(chat));
            setUseRedHighlight(q6Var.m2491d7(chat.f25367id));
            m9827W0(chat.f25367id, 0L);
        }
    }

    public final void m8403h2(TdApi.Chat chat, TdApi.ChatPhotoInfo chatPhotoInfo) {
        boolean z = this.f30881U0.m2443g7(chat.f25367id) || chatPhotoInfo == null;
        setPhotoOpenDisabled(z);
        if (z) {
            setAvatarPlaceholder(this.f30881U0.m2947A3(chat, true, C9239m.getBaseAvatarRadiusDp(), null));
        } else {
            setAvatar(chatPhotoInfo);
        }
    }

    @Override
    public void mo8402i0(float f, float f2, float f3, boolean z) {
        float f4 = this.f29838k0;
        if (f4 != f) {
            boolean z2 = false;
            boolean z3 = f4 == 0.0f || f == 0.0f;
            super.mo8402i0(f, f2, f3, z);
            if (z3) {
                if (f == 0.0f) {
                    z2 = true;
                }
                setEnabled(z2);
                requestLayout();
            }
        }
    }

    public void m8401i2(TdApi.Chat chat, TdApi.ChatPhotoInfo chatPhotoInfo) {
        m8403h2(chat, chatPhotoInfo);
        m9826W1();
    }

    public void m8400j2(long j, String str) {
        setTitle(str);
        TdApi.Chat U2 = this.f30881U0.m2632U2(j);
        if (U2 != null && U2.photo == null) {
            m8403h2(U2, null);
            m9826W1();
        }
    }

    public void m8399k2(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        boolean x4 = C4779t2.m25393x4(chatNotificationSettings, this.f30881U0.m2423hb(j));
        if (getShowMute() != x4) {
            setShowMute(x4);
        }
    }

    public void m8398l2(TdApi.Chat chat) {
        if (C5070i.m24061i(this.f30880T0)) {
            setSubtitle(this.f30881U0.m2166xc().m3295n(chat));
            setExpandedSubtitle(this.f30881U0.m2166xc().m3294o(chat));
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(i, View$OnClickListenerC9170d1.m10064d3(this.f29838k0 != 0.0f, true));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f30879S0 != null && super.onTouchEvent(motionEvent);
    }

    public void setCallback(AbstractC9535a aVar) {
        this.f30879S0 = aVar;
    }

    public void setForcedSubtitle(CharSequence charSequence) {
        if (!C5070i.m24067c(this.f30880T0, charSequence)) {
            this.f30880T0 = charSequence;
            setNoStatus(!C5070i.m24061i(charSequence));
            if (m9817n1()) {
                setSubtitle(charSequence);
            }
        }
    }
}
