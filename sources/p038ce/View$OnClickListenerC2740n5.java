package p038ce;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
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
import me.C6847b2;
import me.C6985o2;
import me.View$OnLongClickListenerC6950l2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5155y0;
import p156kd.C6246h;
import p193nb.C7316a;
import p193nb.C7322f;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.C9239m;
import td.C9255o;

public class View$OnClickListenerC2740n5 extends AbstractC9323v4<C2742b> implements View.OnClickListener, Client.AbstractC7865g, AbstractC5155y0 {
    public TdApi.Chat f9257n0;
    public C6246h f9258o0;
    public C9255o f9259p0;
    public LinearLayout f9260q0;
    public View$OnLongClickListenerC6950l2 f9261r0;
    public C6985o2 f9262s0;
    public C6985o2 f9263t0;
    public TextView f9264u0;
    public C9239m f9265v0;
    public String f9266w0;
    public boolean f9267x0;
    public String f9268y0;
    public boolean f9269z0;

    public class C2741a extends C9255o {
        public final Runnable f9270N;

        public C2741a(Context context, Runnable runnable) {
            super(context);
            this.f9270N = runnable;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            post(this.f9270N);
        }
    }

    public static class C2742b {
        public TdApi.Chat f9272a;
        public C6246h f9273b;

        public C2742b(TdApi.Chat chat, C6246h hVar) {
            this.f9272a = chat;
            this.f9273b = hVar;
        }
    }

    public View$OnClickListenerC2740n5(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m33763Ve() {
        this.f9259p0.fullScroll(130);
    }

    public void m33761Xe(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
            C1379j0.m37368E0(this);
        } else if (constructor != -722616727) {
            Log.unexpectedTdlibResponse(object, TdApi.SetSupergroupUsername.class, TdApi.C7866Ok.class);
            C1379j0.m37368E0(this);
        } else {
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2740n5.this.m33759Ze();
                }
            });
        }
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public View mo8869G9() {
        return this.f9265v0;
    }

    @Override
    public int mo9413J9() {
        return R.drawable.baseline_arrow_forward_24;
    }

    @Override
    public int mo8865M9() {
        return C4896n.m24482b(false);
    }

    @Override
    public void mo23796O4() {
        this.f9269z0 = false;
        m33757bf(true);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_newChannel_link;
    }

    public final C6985o2 m33765Te(Context context, int i, boolean z, int i2, int i3, int i4) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = i4;
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        frameLayoutFix.setId(i);
        frameLayoutFix.setPadding(0, C1357a0.m37544i(8.0f), 0, C1357a0.m37544i(10.0f));
        frameLayoutFix.setOnClickListener(this);
        frameLayoutFix.setLayoutParams(layoutParams);
        C1399s0.m37196a0(frameLayoutFix);
        C10189d.m5794j(frameLayoutFix);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(C1357a0.m37544i(20.0f), C1357a0.m37544i(20.0f));
        s1.topMargin = C1357a0.m37544i(2.0f);
        if (C4403w.m27986G2()) {
            s1.gravity = 5;
            s1.rightMargin = C1357a0.m37544i(18.0f);
        } else {
            s1.gravity = 3;
            s1.leftMargin = C1357a0.m37544i(18.0f);
        }
        C6985o2 o2Var = new C6985o2(context);
        o2Var.m18178c(z, false);
        o2Var.setLayoutParams(s1);
        frameLayoutFix.addView(o2Var);
        m9163t8(o2Var);
        FrameLayout.LayoutParams s12 = FrameLayoutFix.m18008s1(-2, -2);
        if (C4403w.m27986G2()) {
            s12.gravity = 5;
            s12.rightMargin = C1357a0.m37544i(73.0f);
            s12.leftMargin = C1357a0.m37544i(12.0f);
        } else {
            s12.gravity = 3;
            s12.leftMargin = C1357a0.m37544i(73.0f);
            s12.rightMargin = C1357a0.m37544i(12.0f);
        }
        C6847b2 b2Var = new C6847b2(context);
        b2Var.setGravity(C4403w.m27991F1());
        b2Var.setText(C4403w.m27871i1(i2));
        b2Var.setTextSize(1, 16.0f);
        b2Var.setTextColor(C11524j.m217S0());
        m9126y8(b2Var);
        b2Var.setTypeface(C1389o.m37261k());
        b2Var.setSingleLine();
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setLayoutParams(s12);
        frameLayoutFix.addView(b2Var);
        FrameLayout.LayoutParams s13 = FrameLayoutFix.m18008s1(-2, -2);
        s13.topMargin = C1357a0.m37544i(24.0f);
        if (C4403w.m27986G2()) {
            s13.gravity = 5;
            s13.rightMargin = C1357a0.m37544i(73.0f);
            s13.leftMargin = C1357a0.m37544i(12.0f);
        } else {
            s13.gravity = 3;
            s13.leftMargin = C1357a0.m37544i(73.0f);
            s13.rightMargin = C1357a0.m37544i(12.0f);
        }
        C6847b2 b2Var2 = new C6847b2(context);
        b2Var2.setGravity(C4403w.m27991F1());
        b2Var2.setText(C4403w.m27871i1(i3));
        b2Var2.setTextSize(1, 13.0f);
        b2Var2.setTextColor(C11524j.m213U0());
        b2Var2.setTypeface(C1389o.m37261k());
        m9480A8(b2Var2);
        b2Var2.setLayoutParams(s13);
        frameLayoutFix.addView(b2Var2);
        this.f9260q0.addView(frameLayoutFix);
        return o2Var;
    }

    public final long m33764Ue() {
        return C7316a.m17045p(this.f9257n0.f25370id);
    }

    public final void m33760Ye() {
        if (!this.f9267x0) {
            this.f9267x0 = true;
            this.f30170b.m2689Q5(this.f9257n0.f25370id, this);
        }
    }

    public final void m33759Ze() {
        C1408x.m37091c(this.f9261r0);
        RunnableC2374f5 f5Var = new RunnableC2374f5(this.f30168a, this.f30170b);
        f5Var.m34728zg(2);
        f5Var.m34765Yg(this.f9257n0);
        m9291ac(f5Var);
    }

    public void m33758af(C2742b bVar) {
        super.m9476Ad(bVar);
        this.f9257n0 = bVar.f9272a;
        this.f9258o0 = bVar.f9273b;
    }

    public final void m33757bf(boolean z) {
        this.f9263t0.setEnabled(z);
        this.f9262s0.setEnabled(z);
        this.f9261r0.setEnabled(z);
    }

    public final void m33756cf(String str) {
        if (!this.f9269z0) {
            this.f9269z0 = true;
            m33757bf(false);
            this.f30170b.m2270r4().m14783o(new TdApi.SetSupergroupUsername(m33764Ue(), str), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2740n5.this.m33761Xe(object);
                }
            });
        }
    }

    public final void m33762We() {
        if (this.f9263t0.m18180a()) {
            this.f9261r0.setEditable(false);
            String str = this.f9268y0;
            if (str == null) {
                this.f9261r0.setSuffix("...");
                m33760Ye();
                return;
            }
            this.f9261r0.setSuffix(str);
            return;
        }
        this.f9261r0.setEditable(true);
        View$OnLongClickListenerC6950l2 l2Var = this.f9261r0;
        String str2 = this.f9266w0;
        if (str2 == null) {
            str2 = "";
        }
        l2Var.setSuffix(str2);
    }

    @Override
    public View mo403oc(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9260q0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f9260q0.setPadding(0, C4896n.m24478f(false), 0, 0);
        this.f9262s0 = m33765Te(context, R.id.btn_publicChannel, true, R.string.ChannelPublic, R.string.ChannelPublicInfo, C1357a0.m37544i(33.0f));
        this.f9263t0 = m33765Te(context, R.id.btn_privateChannel, false, R.string.ChannelPrivate, R.string.ChannelPrivateInfo, C1357a0.m37544i(2.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(32.0f), C1357a0.m37544i(16.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.baseline_link_24);
        imageView.setColorFilter(C11524j.m159q0());
        m9184q8(imageView, R.id.theme_color_icon);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(C1357a0.m37544i(24.0f), C1357a0.m37544i(46.0f)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = C1357a0.m37544i(32.0f);
        int i = C1357a0.m37544i(9.0f);
        View$OnLongClickListenerC6950l2 l2Var = new View$OnLongClickListenerC6950l2(context);
        this.f9261r0 = l2Var;
        l2Var.setFocusable(false);
        this.f9261r0.setFocusableInTouchMode(false);
        this.f9261r0.setId(R.id.edit_link);
        this.f9261r0.setTextColor(C11524j.m217S0());
        m9126y8(this.f9261r0);
        m9163t8(this.f9261r0);
        if (C4403w.m27986G2()) {
            this.f9261r0.setPadding(i, i, 0, i);
        } else {
            this.f9261r0.setPadding(0, i, i, i);
        }
        this.f9261r0.setSingleLine(true);
        this.f9261r0.setImeOptions(268435456);
        View$OnLongClickListenerC6950l2 l2Var2 = this.f9261r0;
        l2Var2.setInputType(l2Var2.getInputType() | Log.TAG_CONTACT);
        this.f9261r0.setLayoutParams(layoutParams);
        this.f9261r0.setPrefix("t.me/");
        linearLayout2.addView(imageView);
        linearLayout2.addView(this.f9261r0);
        this.f9260q0.addView(linearLayout2);
        C6847b2 b2Var = new C6847b2(context);
        this.f9264u0 = b2Var;
        b2Var.setTextColor(C11524j.m213U0());
        m9480A8(this.f9264u0);
        this.f9264u0.setTypeface(C1389o.m37261k());
        this.f9264u0.setTextSize(1, 14.0f);
        this.f9264u0.setGravity(C4403w.m27991F1());
        this.f9264u0.setPadding(C1357a0.m37544i(72.0f), C1357a0.m37544i(5.0f), C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f));
        this.f9264u0.setText(C4403w.m27871i1(R.string.ChannelUsernameHelp));
        this.f9260q0.addView(this.f9264u0);
        C9239m mVar = new C9239m(context, this.f30170b, this);
        this.f9265v0 = mVar;
        mVar.setNoExpand(true);
        this.f9265v0.m9814q1(this, true);
        this.f9265v0.m9832Q1(C1357a0.m37544i(56.0f), 0);
        this.f9265v0.m9830S1(this.f9257n0.title, C4403w.m27846o2(R.string.xMembers, 1L));
        C6246h hVar = this.f9258o0;
        if (hVar == null) {
            this.f9265v0.setAvatarPlaceholder(this.f30170b.m2947A3(this.f9257n0, true, C9239m.getBaseAvatarRadiusDp(), null));
        } else {
            this.f9265v0.setAvatar(hVar);
        }
        C2741a aVar = new C2741a(context, new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2740n5.this.m33763Ve();
            }
        });
        this.f9259p0 = aVar;
        aVar.setHeaderView(this.f9265v0);
        C10192g.m5782i(this.f9259p0, R.id.theme_color_filling, this);
        this.f9259p0.addView(this.f9260q0);
        this.f9259p0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        return this.f9259p0;
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.btn_privateChannel) {
            if (id2 == R.id.btn_publicChannel && this.f9263t0.m18180a()) {
                this.f9263t0.m18175f();
                this.f9262s0.m18175f();
                m33762We();
                this.f9264u0.setText(C4403w.m27871i1(R.string.ChannelUsernameHelp));
            }
        } else if (this.f9262s0.m18180a()) {
            this.f9266w0 = this.f9261r0.getSuffix();
            this.f9262s0.m18175f();
            this.f9263t0.m18175f();
            m33762We();
            this.f9264u0.setText(C4403w.m27871i1(R.string.ChannelPrivateLinkHelp));
        }
    }

    @Override
    public void mo9174rc() {
        if (this.f9262s0.m18180a()) {
            String trim = this.f9261r0.getSuffix().trim();
            if (trim.length() < 5) {
                C1379j0.m37295y0(R.string.PublicLinkTooShort, 0);
            } else if (trim.length() == 0 || C4779t2.m25408v4(trim)) {
                m33756cf(trim);
            } else {
                C1379j0.m37295y0(R.string.PublicLinkIsInvalid, 0);
            }
        } else {
            m33759Ze();
        }
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (this.f9262s0.m18180a()) {
            this.f9261r0.setFocusable(true);
            this.f9261r0.setFocusableInTouchMode(true);
        }
        if (m9157te() == 3 && (m9164se(1) instanceof C2523i5)) {
            m9287b9(1);
        }
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        } else if (constructor == -205812476) {
            this.f9268y0 = C5070i.m24072G(((TdApi.ChatInviteLink) object).inviteLink);
            String[] strArr = C7322f.f23235c;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str = strArr[i];
                if (this.f9268y0.startsWith(str)) {
                    this.f9268y0 = this.f9268y0.substring(str.length() + 1);
                    break;
                }
                i++;
            }
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2740n5.this.m33762We();
                }
            });
        }
    }
}
