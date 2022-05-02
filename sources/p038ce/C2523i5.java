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

    public void m34323Xe(View view, boolean z) {
        m9180qd(this.f8615o0);
        this.f8615o0.setColorFilter(z ? C11524j.m200a1() : C11524j.m159q0());
        m9184q8(this.f8615o0, z ? R.id.theme_color_togglerActive : R.id.theme_color_icon);
    }

    public void m34322Ye() {
        m34329Re(this.f8621u0);
    }

    @Override
    public boolean mo493A3(View view, int i) {
        this.f30170b.m2485dd().m3463s3(this.f30168a, i, null, this.f8616p0);
        return true;
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public void mo9773E0(boolean z) {
        C9290s0 s0Var = this.f30160S;
        if (s0Var == null) {
            return;
        }
        if (z) {
            s0Var.m9616l(this);
            m9446Ed(this.f8614n0);
            return;
        }
        s0Var.m9622f();
        m9446Ed(this.f8616p0.getInputView());
    }

    @Override
    public View mo8869G9() {
        return this.f8616p0;
    }

    @Override
    public int mo9413J9() {
        if (this.f8616p0.m9779C1()) {
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
        C1408x.m37090d(viewArr);
    }

    @Override
    public int mo8865M9() {
        return C4896n.m24482b(false);
    }

    @Override
    public boolean mo492Q() {
        return C5115g0.m23936a(this);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_newChannel;
    }

    public void m34329Re(TdApi.Chat chat) {
        if (this.f8618r0) {
            m34321Ze();
            if (chat != null) {
                View$OnClickListenerC2740n5 n5Var = new View$OnClickListenerC2740n5(this.f30168a, this.f30170b);
                n5Var.m33758af(new View$OnClickListenerC2740n5.C2742b(chat, this.f8620t0));
                m9291ac(n5Var);
            }
        }
    }

    public void m34328Se() {
        if (!this.f8618r0) {
            String We = m34324We();
            if (!C5070i.m24061j(We)) {
                String Te = m34327Te();
                m34321Ze();
                this.f8619s0 = m34325Ve();
                this.f8620t0 = m34326Ue();
                C1379j0.m37297x0(C4403w.m27871i1(R.string.ProgressCreateChannel), null, 300L);
                this.f30170b.m2270r4().m14783o(new TdApi.CreateNewSupergroupChat(We, true, Te, null, false), this);
            }
        }
    }

    public String m34327Te() {
        return this.f8614n0.getText().toString();
    }

    public C6246h m34326Ue() {
        return this.f8616p0.getImageFile();
    }

    public String m34325Ve() {
        return this.f8616p0.getPhoto();
    }

    public String m34324We() {
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

    public final void m34321Ze() {
        boolean z = !this.f8618r0;
        this.f8618r0 = z;
        this.f8616p0.setInputEnabled(!z);
        this.f8614n0.setEnabled(!this.f8618r0);
    }

    @Override
    public Object mo491b2(int i) {
        return C5115g0.m23935b(this, i);
    }

    @Override
    public View mo403oc(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        C10192g.m5782i(linearLayout, R.id.theme_color_filling, this);
        linearLayout.setPadding(0, C4896n.m24478f(false), 0, 0);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        frameLayoutFix.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayoutFix.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(32.0f), C1357a0.m37544i(16.0f), 0);
        ImageView imageView = new ImageView(context);
        this.f8615o0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f8615o0.setImageResource(R.drawable.baseline_info_24);
        this.f8615o0.setColorFilter(C11524j.m159q0());
        m9184q8(this.f8615o0, R.id.theme_color_icon);
        this.f8615o0.setLayoutParams(FrameLayoutFix.m18006u1(C1357a0.m37544i(24.0f), C1357a0.m37544i(46.0f), C4403w.m27991F1(), C4403w.m27986G2() ? 0 : C1357a0.m37544i(6.0f), 0, C4403w.m27986G2() ? C1357a0.m37544i(6.0f) : 0, 0));
        frameLayoutFix.addView(this.f8615o0);
        String[] w9 = m9139w9();
        int i = C1357a0.m37544i(24.0f) + (C1357a0.m37544i(16.0f) * 2);
        int i2 = C1357a0.m37544i(9.0f);
        C7029t0 t0Var = new C7029t0(context);
        this.f8614n0 = t0Var;
        t0Var.setId(R.id.edit_description);
        this.f8614n0.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z) {
                C2523i5.this.m34323Xe(view, z);
            }
        });
        this.f8614n0.setPadding(0, i2, 0, i2);
        this.f8614n0.setSingleLine(false);
        this.f8614n0.setMaxLines(4);
        this.f8614n0.setHint(C4403w.m27871i1(R.string.Description));
        this.f8614n0.setImeOptions(268435456);
        this.f8614n0.setGravity(C4403w.m27991F1());
        this.f8614n0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        C7029t0 t0Var2 = this.f8614n0;
        t0Var2.setInputType(t0Var2.getInputType() | Log.TAG_VIDEO | Log.TAG_CONTACT);
        this.f8614n0.setLayoutParams(FrameLayoutFix.m18006u1(-1, -2, 0, C4403w.m27986G2() ? 0 : i, 0, C4403w.m27986G2() ? i : 0, 0));
        frameLayoutFix.addView(this.f8614n0);
        if (w9 != null) {
            C1399s0.m37162r0(this.f8614n0, w9[1]);
        }
        linearLayout.addView(frameLayoutFix);
        C6847b2 b2Var = new C6847b2(context);
        this.f8617q0 = b2Var;
        b2Var.setTextColor(C11524j.m215T0());
        this.f8617q0.setTypeface(C1389o.m37261k());
        this.f8617q0.setTextSize(1, 14.0f);
        TextView textView = this.f8617q0;
        float f = 22.0f;
        int i3 = C1357a0.m37544i(C4403w.m27986G2() ? 22.0f : 72.0f);
        int i4 = C1357a0.m37544i(5.0f);
        if (C4403w.m27986G2()) {
            f = 72.0f;
        }
        textView.setPadding(i3, i4, C1357a0.m37544i(f), C1357a0.m37544i(16.0f));
        this.f8617q0.setGravity(C4403w.m27991F1());
        this.f8617q0.setText(C4403w.m27871i1(R.string.DescriptionInfo));
        linearLayout.addView(this.f8617q0);
        C9262p0 p0Var = new C9262p0(context, this);
        this.f8616p0 = p0Var;
        p0Var.m9775G1(R.string.ChannelName, Log.TAG_LUX);
        this.f8616p0.setNextField(R.id.edit_description);
        this.f8616p0.setReadyCallback(this);
        m9446Ed(this.f8616p0.getInputView());
        if (w9 != null) {
            C1399s0.m37162r0(this.f8616p0.getInputView(), w9[0]);
        }
        return linearLayout;
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 || m34324We().length() <= 0) {
            return false;
        }
        m34328Se();
        return true;
    }

    @Override
    public void mo9174rc() {
        m34328Se();
    }

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        super.mo9165sd(bundle, str);
        String string = bundle.getString(str + "title", "");
        m9476Ad(new String[]{string, bundle.getString(str + "description", "")});
        return true;
    }

    @Override
    public void mo10181t(int i, int i2, Intent intent) {
        if (i2 == -1) {
            this.f30170b.m2485dd().m3483q3(i, intent, this.f8616p0);
        }
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        C1379j0.m37362I();
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
            this.f8621u0 = null;
        } else if (constructor == -1601123095) {
            this.f8621u0 = this.f30170b.m2771L3(C4779t2.m25626P0(object));
            if (this.f8619s0 != null) {
                Client r4 = this.f30170b.m2270r4();
                long j = this.f8621u0.f25370id;
                String str = this.f8619s0;
                r4.m14783o(new TdApi.SetChatPhoto(j, new TdApi.InputChatPhotoStatic(new TdApi.InputFileGenerated(str, C5337d.m23203j(str), 0))), this);
            }
        } else if (constructor != -722616727) {
            Log.unexpectedTdlibResponse(object, TdApi.CreateNewSupergroupChat.class, TdApi.C7866Ok.class, TdApi.Chat.class, TdApi.Error.class);
            return;
        } else {
            return;
        }
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                C2523i5.this.m34322Ye();
            }
        });
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        super.mo9122yd(bundle, str);
        bundle.putString(str + "title", m34324We());
        bundle.putString(str + "description", m34327Te());
        return true;
    }
}
