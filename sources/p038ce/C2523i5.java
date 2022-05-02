package p038ce;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1408x;
import gd.C4779t2;
import ge.C4896n;
import id.C5337d;
import me.C6847b2;
import me.C7029t0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.View$OnClickListenerC2740n5;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p156kd.C6246h;
import p335xd.C10192g;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9142a;
import td.AbstractC9323v4;
import td.C9262p0;
import td.C9290s0;

public class C2523i5 extends AbstractC9323v4<String[]> implements C9262p0.AbstractC9263a, AbstractC5117h0, AbstractC9142a, Client.AbstractC7865g, TextView.OnEditorActionListener {
    public C7029t0 f8614n0;
    public ImageView f8615o0;
    public C9262p0 f8616p0;
    public TextView f8617q0;
    public boolean f8618r0;
    public String f8619s0;
    public C6246h f8620t0;
    public TdApi.Chat f8621u0;

    public C2523i5(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m34320Xe(View view, boolean z) {
        m9180qd(this.f8615o0);
        this.f8615o0.setColorFilter(z ? C11524j.m200a1() : C11524j.m159q0());
        m9184q8(this.f8615o0, z ? R.id.theme_color_togglerActive : R.id.theme_color_icon);
    }

    public void m34319Ye() {
        m34326Re(this.f8621u0);
    }

    @Override
    public boolean mo493A3(View view, int i) {
        this.f30167b.m2485dd().m3463s3(this.f30165a, i, null, this.f8616p0);
        return true;
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public void mo9774E0(boolean z) {
        C9290s0 s0Var = this.f30157S;
        if (s0Var == null) {
            return;
        }
        if (z) {
            s0Var.m9617l(this);
            m9446Ed(this.f8614n0);
            return;
        }
        s0Var.m9623f();
        m9446Ed(this.f8616p0.getInputView());
    }

    @Override
    public View mo8869G9() {
        return this.f8616p0;
    }

    @Override
    public int mo9413J9() {
        if (this.f8616p0.m9780C1()) {
            return 0;
        }
        return R.drawable.baseline_arrow_forward_24;
    }

    @Override
    public void mo9397La() {
        super.mo9397La();
        View[] viewArr = new View[2];
        C9262p0 p0Var = this.f8616p0;
        viewArr[0] = p0Var == null ? null : p0Var.getInputView();
        viewArr[1] = this.f8614n0;
        C1408x.m37087d(viewArr);
    }

    @Override
    public int mo8865M9() {
        return C4896n.m24481b(false);
    }

    @Override
    public boolean mo492Q() {
        return C5115g0.m23935a(this);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_newChannel;
    }

    public void m34326Re(TdApi.Chat chat) {
        if (this.f8618r0) {
            m34318Ze();
            if (chat != null) {
                View$OnClickListenerC2740n5 n5Var = new View$OnClickListenerC2740n5(this.f30165a, this.f30167b);
                n5Var.m33755af(new View$OnClickListenerC2740n5.C2742b(chat, this.f8620t0));
                m9291ac(n5Var);
            }
        }
    }

    public void m34325Se() {
        if (!this.f8618r0) {
            String We = m34321We();
            if (!C5070i.m24060j(We)) {
                String Te = m34324Te();
                m34318Ze();
                this.f8619s0 = m34322Ve();
                this.f8620t0 = m34323Ue();
                C1379j0.m37294x0(C4403w.m27869i1(R.string.ProgressCreateChannel), null, 300L);
                this.f30167b.m2270r4().m14783o(new TdApi.CreateNewSupergroupChat(We, true, Te, null, false), this);
            }
        }
    }

    public String m34324Te() {
        return this.f8614n0.getText().toString();
    }

    public C6246h m34323Ue() {
        return this.f8616p0.getImageFile();
    }

    public String m34322Ve() {
        return this.f8616p0.getPhoto();
    }

    public String m34321We() {
        return this.f8616p0.getInput().trim();
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C9262p0 p0Var = this.f8616p0;
        if (p0Var != null) {
            p0Var.mo4501a3();
        }
    }

    public final void m34318Ze() {
        boolean z = !this.f8618r0;
        this.f8618r0 = z;
        this.f8616p0.setInputEnabled(!z);
        this.f8614n0.setEnabled(!this.f8618r0);
    }

    @Override
    public Object mo491b2(int i) {
        return C5115g0.m23934b(this, i);
    }

    @Override
    public View mo403oc(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        C10192g.m5782i(linearLayout, R.id.theme_color_filling, this);
        linearLayout.setPadding(0, C4896n.m24477f(false), 0, 0);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        frameLayoutFix.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayoutFix.setPadding(C1357a0.m37541i(16.0f), C1357a0.m37541i(32.0f), C1357a0.m37541i(16.0f), 0);
        ImageView imageView = new ImageView(context);
        this.f8615o0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f8615o0.setImageResource(R.drawable.baseline_info_24);
        this.f8615o0.setColorFilter(C11524j.m159q0());
        m9184q8(this.f8615o0, R.id.theme_color_icon);
        this.f8615o0.setLayoutParams(FrameLayoutFix.m18006u1(C1357a0.m37541i(24.0f), C1357a0.m37541i(46.0f), C4403w.m27989F1(), C4403w.m27984G2() ? 0 : C1357a0.m37541i(6.0f), 0, C4403w.m27984G2() ? C1357a0.m37541i(6.0f) : 0, 0));
        frameLayoutFix.addView(this.f8615o0);
        String[] w9 = m9139w9();
        int i = C1357a0.m37541i(24.0f) + (C1357a0.m37541i(16.0f) * 2);
        int i2 = C1357a0.m37541i(9.0f);
        C7029t0 t0Var = new C7029t0(context);
        this.f8614n0 = t0Var;
        t0Var.setId(R.id.edit_description);
        this.f8614n0.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z) {
                C2523i5.this.m34320Xe(view, z);
            }
        });
        this.f8614n0.setPadding(0, i2, 0, i2);
        this.f8614n0.setSingleLine(false);
        this.f8614n0.setMaxLines(4);
        this.f8614n0.setHint(C4403w.m27869i1(R.string.Description));
        this.f8614n0.setImeOptions(268435456);
        this.f8614n0.setGravity(C4403w.m27989F1());
        this.f8614n0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        C7029t0 t0Var2 = this.f8614n0;
        t0Var2.setInputType(t0Var2.getInputType() | Log.TAG_VIDEO | Log.TAG_CONTACT);
        this.f8614n0.setLayoutParams(FrameLayoutFix.m18006u1(-1, -2, 0, C4403w.m27984G2() ? 0 : i, 0, C4403w.m27984G2() ? i : 0, 0));
        frameLayoutFix.addView(this.f8614n0);
        if (w9 != null) {
            C1399s0.m37159r0(this.f8614n0, w9[1]);
        }
        linearLayout.addView(frameLayoutFix);
        C6847b2 b2Var = new C6847b2(context);
        this.f8617q0 = b2Var;
        b2Var.setTextColor(C11524j.m215T0());
        this.f8617q0.setTypeface(C1389o.m37258k());
        this.f8617q0.setTextSize(1, 14.0f);
        TextView textView = this.f8617q0;
        float f = 22.0f;
        int i3 = C1357a0.m37541i(C4403w.m27984G2() ? 22.0f : 72.0f);
        int i4 = C1357a0.m37541i(5.0f);
        if (C4403w.m27984G2()) {
            f = 72.0f;
        }
        textView.setPadding(i3, i4, C1357a0.m37541i(f), C1357a0.m37541i(16.0f));
        this.f8617q0.setGravity(C4403w.m27989F1());
        this.f8617q0.setText(C4403w.m27869i1(R.string.DescriptionInfo));
        linearLayout.addView(this.f8617q0);
        C9262p0 p0Var = new C9262p0(context, this);
        this.f8616p0 = p0Var;
        p0Var.m9776G1(R.string.ChannelName, Log.TAG_LUX);
        this.f8616p0.setNextField(R.id.edit_description);
        this.f8616p0.setReadyCallback(this);
        m9446Ed(this.f8616p0.getInputView());
        if (w9 != null) {
            C1399s0.m37159r0(this.f8616p0.getInputView(), w9[0]);
        }
        return linearLayout;
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 || m34321We().length() <= 0) {
            return false;
        }
        m34325Se();
        return true;
    }

    @Override
    public void mo9174rc() {
        m34325Se();
    }

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        super.mo9165sd(bundle, str);
        String string = bundle.getString(str + "title", "");
        m9476Ad(new String[]{string, bundle.getString(str + "description", "")});
        return true;
    }

    @Override
    public void mo10182t(int i, int i2, Intent intent) {
        if (i2 == -1) {
            this.f30167b.m2485dd().m3483q3(i, intent, this.f8616p0);
        }
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        C1379j0.m37359I();
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
            this.f8621u0 = null;
        } else if (constructor == -1601123095) {
            this.f8621u0 = this.f30167b.m2771L3(C4779t2.m25625P0(object));
            if (this.f8619s0 != null) {
                Client r4 = this.f30167b.m2270r4();
                long j = this.f8621u0.f25367id;
                String str = this.f8619s0;
                r4.m14783o(new TdApi.SetChatPhoto(j, new TdApi.InputChatPhotoStatic(new TdApi.InputFileGenerated(str, C5337d.m23202j(str), 0))), this);
            }
        } else if (constructor != -722616727) {
            Log.unexpectedTdlibResponse(object, TdApi.CreateNewSupergroupChat.class, TdApi.C7866Ok.class, TdApi.Chat.class, TdApi.Error.class);
            return;
        } else {
            return;
        }
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                C2523i5.this.m34319Ye();
            }
        });
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        super.mo9122yd(bundle, str);
        bundle.putString(str + "title", m34321We());
        bundle.putString(str + "description", m34324Te());
        return true;
    }
}
