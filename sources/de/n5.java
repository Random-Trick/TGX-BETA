package de;

import ae.j;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.p0;
import ce.x;
import gd.w;
import hd.t2;
import he.n;
import ib.i;
import ie.y0;
import ld.h;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.l2;
import ne.o2;
import ob.f;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.m;
import ud.o;
import ud.v4;
import yd.d;
import yd.g;
import zd.o6;

public class n5 extends v4<b> implements View.OnClickListener, Client.g, y0 {
    public TdApi.Chat f8803n0;
    public h f8804o0;
    public o f8805p0;
    public LinearLayout f8806q0;
    public l2 f8807r0;
    public o2 f8808s0;
    public o2 f8809t0;
    public TextView f8810u0;
    public m f8811v0;
    public String f8812w0;
    public boolean f8813x0;
    public String f8814y0;
    public boolean f8815z0;

    public class a extends o {
        public final Runnable N;

        public a(Context context, Runnable runnable) {
            super(context);
            this.N = runnable;
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            post(this.N);
        }
    }

    public static class b {
        public TdApi.Chat f8816a;
        public h f8817b;

        public b(TdApi.Chat chat, h hVar) {
            this.f8816a = chat;
            this.f8817b = hVar;
        }
    }

    public n5(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Ve() {
        this.f8805p0.fullScroll(130);
    }

    public void Xe(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
            j0.E0(this);
        } else if (constructor != -722616727) {
            Log.unexpectedTdlibResponse(object, TdApi.SetSupergroupUsername.class, TdApi.Ok.class);
            j0.E0(this);
        } else {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    n5.this.Ze();
                }
            });
        }
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public View G9() {
        return this.f8811v0;
    }

    @Override
    public void H4() {
        this.f8815z0 = false;
        bf(true);
    }

    @Override
    public int J9() {
        return R.drawable.baseline_arrow_forward_24;
    }

    @Override
    public int M9() {
        return n.b(false);
    }

    @Override
    public int R9() {
        return R.id.controller_newChannel_link;
    }

    public final o2 Te(Context context, int i10, boolean z10, int i11, int i12, int i13) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = i13;
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        frameLayoutFix.setId(i10);
        frameLayoutFix.setPadding(0, a0.i(8.0f), 0, a0.i(10.0f));
        frameLayoutFix.setOnClickListener(this);
        frameLayoutFix.setLayoutParams(layoutParams);
        p0.T(frameLayoutFix);
        d.j(frameLayoutFix);
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(a0.i(20.0f), a0.i(20.0f));
        q12.topMargin = a0.i(2.0f);
        if (w.G2()) {
            q12.gravity = 5;
            q12.rightMargin = a0.i(18.0f);
        } else {
            q12.gravity = 3;
            q12.leftMargin = a0.i(18.0f);
        }
        o2 o2Var = new o2(context);
        o2Var.c(z10, false);
        o2Var.setLayoutParams(q12);
        frameLayoutFix.addView(o2Var);
        t8(o2Var);
        FrameLayout.LayoutParams q13 = FrameLayoutFix.q1(-2, -2);
        if (w.G2()) {
            q13.gravity = 5;
            q13.rightMargin = a0.i(73.0f);
            q13.leftMargin = a0.i(12.0f);
        } else {
            q13.gravity = 3;
            q13.leftMargin = a0.i(73.0f);
            q13.rightMargin = a0.i(12.0f);
        }
        b2 b2Var = new b2(context);
        b2Var.setGravity(w.F1());
        b2Var.setText(w.i1(i11));
        b2Var.setTextSize(1, 16.0f);
        b2Var.setTextColor(j.P0());
        y8(b2Var);
        b2Var.setTypeface(ce.o.k());
        b2Var.setSingleLine();
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setLayoutParams(q13);
        frameLayoutFix.addView(b2Var);
        FrameLayout.LayoutParams q14 = FrameLayoutFix.q1(-2, -2);
        q14.topMargin = a0.i(24.0f);
        if (w.G2()) {
            q14.gravity = 5;
            q14.rightMargin = a0.i(73.0f);
            q14.leftMargin = a0.i(12.0f);
        } else {
            q14.gravity = 3;
            q14.leftMargin = a0.i(73.0f);
            q14.rightMargin = a0.i(12.0f);
        }
        b2 b2Var2 = new b2(context);
        b2Var2.setGravity(w.F1());
        b2Var2.setText(w.i1(i12));
        b2Var2.setTextSize(1, 13.0f);
        b2Var2.setTextColor(j.R0());
        b2Var2.setTypeface(ce.o.k());
        A8(b2Var2);
        b2Var2.setLayoutParams(q14);
        frameLayoutFix.addView(b2Var2);
        this.f8806q0.addView(frameLayoutFix);
        return o2Var;
    }

    public final long Ue() {
        return ob.a.p(this.f8803n0.f19908id);
    }

    public final void Ye() {
        if (!this.f8813x0) {
            this.f8813x0 = true;
            this.f24495b.U5(this.f8803n0.f19908id, this);
        }
    }

    public final void Ze() {
        x.c(this.f8807r0);
        f5 f5Var = new f5(this.f24493a, this.f24495b);
        f5Var.zg(2);
        f5Var.Yg(this.f8803n0);
        ac(f5Var);
    }

    public void af(b bVar) {
        super.Ad(bVar);
        this.f8803n0 = bVar.f8816a;
        this.f8804o0 = bVar.f8817b;
    }

    public final void bf(boolean z10) {
        this.f8809t0.setEnabled(z10);
        this.f8808s0.setEnabled(z10);
        this.f8807r0.setEnabled(z10);
    }

    public final void cf(String str) {
        if (!this.f8815z0) {
            this.f8815z0 = true;
            bf(false);
            this.f24495b.v4().o(new TdApi.SetSupergroupUsername(Ue(), str), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    n5.this.Xe(object);
                }
            });
        }
    }

    public final void We() {
        if (this.f8809t0.a()) {
            this.f8807r0.setEditable(false);
            String str = this.f8814y0;
            if (str == null) {
                this.f8807r0.setSuffix("...");
                Ye();
                return;
            }
            this.f8807r0.setSuffix(str);
            return;
        }
        this.f8807r0.setEditable(true);
        l2 l2Var = this.f8807r0;
        String str2 = this.f8812w0;
        if (str2 == null) {
            str2 = "";
        }
        l2Var.setSuffix(str2);
    }

    @Override
    public View oc(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f8806q0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f8806q0.setPadding(0, n.f(false), 0, 0);
        this.f8808s0 = Te(context, R.id.btn_publicChannel, true, R.string.ChannelPublic, R.string.ChannelPublicInfo, a0.i(33.0f));
        this.f8809t0 = Te(context, R.id.btn_privateChannel, false, R.string.ChannelPrivate, R.string.ChannelPrivateInfo, a0.i(2.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(a0.i(16.0f), a0.i(32.0f), a0.i(16.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.baseline_link_24);
        imageView.setColorFilter(j.o0());
        q8(imageView, R.id.theme_color_icon);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(a0.i(24.0f), a0.i(46.0f)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = a0.i(32.0f);
        int i10 = a0.i(9.0f);
        l2 l2Var = new l2(context);
        this.f8807r0 = l2Var;
        l2Var.setFocusable(false);
        this.f8807r0.setFocusableInTouchMode(false);
        this.f8807r0.setId(R.id.edit_link);
        this.f8807r0.setTextColor(j.P0());
        y8(this.f8807r0);
        t8(this.f8807r0);
        if (w.G2()) {
            this.f8807r0.setPadding(i10, i10, 0, i10);
        } else {
            this.f8807r0.setPadding(0, i10, i10, i10);
        }
        this.f8807r0.setSingleLine(true);
        this.f8807r0.setImeOptions(268435456);
        l2 l2Var2 = this.f8807r0;
        l2Var2.setInputType(l2Var2.getInputType() | Log.TAG_CONTACT);
        this.f8807r0.setLayoutParams(layoutParams);
        this.f8807r0.setPrefix("t.me/");
        linearLayout2.addView(imageView);
        linearLayout2.addView(this.f8807r0);
        this.f8806q0.addView(linearLayout2);
        b2 b2Var = new b2(context);
        this.f8810u0 = b2Var;
        b2Var.setTextColor(j.R0());
        A8(this.f8810u0);
        this.f8810u0.setTypeface(ce.o.k());
        this.f8810u0.setTextSize(1, 14.0f);
        this.f8810u0.setGravity(w.F1());
        this.f8810u0.setPadding(a0.i(72.0f), a0.i(5.0f), a0.i(16.0f), a0.i(16.0f));
        this.f8810u0.setText(w.i1(R.string.ChannelUsernameHelp));
        this.f8806q0.addView(this.f8810u0);
        m mVar = new m(context, this.f24495b, this);
        this.f8811v0 = mVar;
        mVar.setNoExpand(true);
        this.f8811v0.s1(this, true);
        this.f8811v0.R1(a0.i(56.0f), 0);
        this.f8811v0.T1(this.f8803n0.title, w.o2(R.string.xMembers, 1L));
        h hVar = this.f8804o0;
        if (hVar == null) {
            this.f8811v0.setAvatarPlaceholder(this.f24495b.D3(this.f8803n0, true, m.getBaseAvatarRadiusDp(), null));
        } else {
            this.f8811v0.setAvatar(hVar);
        }
        a aVar = new a(context, new Runnable() {
            @Override
            public final void run() {
                n5.this.Ve();
            }
        });
        this.f8805p0 = aVar;
        aVar.setHeaderView(this.f8811v0);
        g.i(this.f8805p0, R.id.theme_color_filling, this);
        this.f8805p0.addView(this.f8806q0);
        this.f8805p0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        return this.f8805p0;
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.btn_privateChannel) {
            if (id2 == R.id.btn_publicChannel && this.f8809t0.a()) {
                this.f8809t0.f();
                this.f8808s0.f();
                We();
                this.f8810u0.setText(w.i1(R.string.ChannelUsernameHelp));
            }
        } else if (this.f8808s0.a()) {
            this.f8812w0 = this.f8807r0.getSuffix();
            this.f8808s0.f();
            this.f8809t0.f();
            We();
            this.f8810u0.setText(w.i1(R.string.ChannelPrivateLinkHelp));
        }
    }

    @Override
    public void r2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -205812476) {
            this.f8814y0 = i.G(((TdApi.ChatInviteLink) object).inviteLink);
            String[] strArr = f.f19346c;
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                String str = strArr[i10];
                if (this.f8814y0.startsWith(str)) {
                    this.f8814y0 = this.f8814y0.substring(str.length() + 1);
                    break;
                }
                i10++;
            }
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    n5.this.We();
                }
            });
        }
    }

    @Override
    public void rc() {
        if (this.f8808s0.a()) {
            String trim = this.f8807r0.getSuffix().trim();
            if (trim.length() < 5) {
                j0.y0(R.string.PublicLinkTooShort, 0);
            } else if (trim.length() == 0 || t2.v4(trim)) {
                cf(trim);
            } else {
                j0.y0(R.string.PublicLinkIsInvalid, 0);
            }
        } else {
            Ze();
        }
    }

    @Override
    public void sc() {
        super.sc();
        if (this.f8808s0.a()) {
            this.f8807r0.setFocusable(true);
            this.f8807r0.setFocusableInTouchMode(true);
        }
        if (te() == 3 && (se(1) instanceof i5)) {
            b9(1);
        }
    }
}
