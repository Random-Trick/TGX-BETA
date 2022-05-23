package de;

import ae.j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.o;
import ce.x;
import de.n5;
import gd.w;
import hd.t2;
import he.n;
import ib.i;
import ie.g0;
import ie.h0;
import jd.d;
import ld.h;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.t0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.a;
import ud.p0;
import ud.s0;
import ud.v4;
import yd.g;
import zd.o6;

public class i5 extends v4<String[]> implements p0.a, h0, a, Client.g, TextView.OnEditorActionListener {
    public t0 f8253n0;
    public ImageView f8254o0;
    public p0 f8255p0;
    public TextView f8256q0;
    public boolean f8257r0;
    public String f8258s0;
    public h f8259t0;
    public TdApi.Chat f8260u0;

    public i5(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Xe(View view, boolean z10) {
        qd(this.f8254o0);
        this.f8254o0.setColorFilter(z10 ? j.X0() : j.o0());
        q8(this.f8254o0, z10 ? R.id.theme_color_togglerActive : R.id.theme_color_icon);
    }

    public void Ye() {
        Re(this.f8260u0);
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public void E0(boolean z10) {
        s0 s0Var = this.S;
        if (s0Var == null) {
            return;
        }
        if (z10) {
            s0Var.l(this);
            Ed(this.f8253n0);
            return;
        }
        s0Var.f();
        Ed(this.f8255p0.getInputView());
    }

    @Override
    public View G9() {
        return this.f8255p0;
    }

    @Override
    public int J9() {
        if (this.f8255p0.z1()) {
            return 0;
        }
        return R.drawable.baseline_arrow_forward_24;
    }

    @Override
    public void La() {
        super.La();
        View[] viewArr = new View[2];
        p0 p0Var = this.f8255p0;
        viewArr[0] = p0Var == null ? null : p0Var.getInputView();
        viewArr[1] = this.f8253n0;
        x.d(viewArr);
    }

    @Override
    public int M9() {
        return n.b(false);
    }

    @Override
    public boolean P() {
        return g0.a(this);
    }

    @Override
    public int R9() {
        return R.id.controller_newChannel;
    }

    public void Re(TdApi.Chat chat) {
        if (this.f8257r0) {
            Ze();
            if (chat != null) {
                n5 n5Var = new n5(this.f24493a, this.f24495b);
                n5Var.af(new n5.b(chat, this.f8259t0));
                ac(n5Var);
            }
        }
    }

    public void Se() {
        if (!this.f8257r0) {
            String We = We();
            if (!i.j(We)) {
                String Te = Te();
                Ze();
                this.f8258s0 = Ve();
                this.f8259t0 = Ue();
                j0.x0(w.i1(R.string.ProgressCreateChannel), null, 300L);
                this.f24495b.v4().o(new TdApi.CreateNewSupergroupChat(We, true, Te, null, false), this);
            }
        }
    }

    public String Te() {
        return this.f8253n0.getText().toString();
    }

    public h Ue() {
        return this.f8255p0.getImageFile();
    }

    public String Ve() {
        return this.f8255p0.getPhoto();
    }

    public String We() {
        return this.f8255p0.getInput().trim();
    }

    @Override
    public void Z8() {
        super.Z8();
        p0 p0Var = this.f8255p0;
        if (p0Var != null) {
            p0Var.Q2();
        }
    }

    public final void Ze() {
        boolean z10 = !this.f8257r0;
        this.f8257r0 = z10;
        this.f8255p0.setInputEnabled(!z10);
        this.f8253n0.setEnabled(!this.f8257r0);
    }

    @Override
    public Object a2(int i10) {
        return g0.b(this, i10);
    }

    @Override
    public View oc(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        g.i(linearLayout, R.id.theme_color_filling, this);
        linearLayout.setPadding(0, n.f(false), 0, 0);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        frameLayoutFix.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayoutFix.setPadding(a0.i(16.0f), a0.i(32.0f), a0.i(16.0f), 0);
        ImageView imageView = new ImageView(context);
        this.f8254o0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f8254o0.setImageResource(R.drawable.baseline_info_24);
        this.f8254o0.setColorFilter(j.o0());
        q8(this.f8254o0, R.id.theme_color_icon);
        this.f8254o0.setLayoutParams(FrameLayoutFix.s1(a0.i(24.0f), a0.i(46.0f), w.F1(), w.G2() ? 0 : a0.i(6.0f), 0, w.G2() ? a0.i(6.0f) : 0, 0));
        frameLayoutFix.addView(this.f8254o0);
        String[] w92 = w9();
        int i10 = a0.i(24.0f) + (a0.i(16.0f) * 2);
        int i11 = a0.i(9.0f);
        t0 t0Var = new t0(context);
        this.f8253n0 = t0Var;
        t0Var.setId(R.id.edit_description);
        this.f8253n0.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z10) {
                i5.this.Xe(view, z10);
            }
        });
        this.f8253n0.setPadding(0, i11, 0, i11);
        this.f8253n0.setSingleLine(false);
        this.f8253n0.setMaxLines(4);
        this.f8253n0.setHint(w.i1(R.string.Description));
        this.f8253n0.setImeOptions(268435456);
        this.f8253n0.setGravity(w.F1());
        this.f8253n0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        t0 t0Var2 = this.f8253n0;
        t0Var2.setInputType(t0Var2.getInputType() | Log.TAG_VIDEO | Log.TAG_CONTACT);
        this.f8253n0.setLayoutParams(FrameLayoutFix.s1(-1, -2, 0, w.G2() ? 0 : i10, 0, w.G2() ? i10 : 0, 0));
        frameLayoutFix.addView(this.f8253n0);
        if (w92 != null) {
            ce.p0.k0(this.f8253n0, w92[1]);
        }
        linearLayout.addView(frameLayoutFix);
        b2 b2Var = new b2(context);
        this.f8256q0 = b2Var;
        b2Var.setTextColor(j.Q0());
        this.f8256q0.setTypeface(o.k());
        this.f8256q0.setTextSize(1, 14.0f);
        TextView textView = this.f8256q0;
        float f10 = 22.0f;
        int i12 = a0.i(w.G2() ? 22.0f : 72.0f);
        int i13 = a0.i(5.0f);
        if (w.G2()) {
            f10 = 72.0f;
        }
        textView.setPadding(i12, i13, a0.i(f10), a0.i(16.0f));
        this.f8256q0.setGravity(w.F1());
        this.f8256q0.setText(w.i1(R.string.DescriptionInfo));
        linearLayout.addView(this.f8256q0);
        p0 p0Var = new p0(context, this);
        this.f8255p0 = p0Var;
        p0Var.D1(R.string.ChannelName, Log.TAG_LUX);
        this.f8255p0.setNextField(R.id.edit_description);
        this.f8255p0.setReadyCallback(this);
        Ed(this.f8255p0.getInputView());
        if (w92 != null) {
            ce.p0.k0(this.f8255p0.getInputView(), w92[0]);
        }
        return linearLayout;
    }

    @Override
    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6 || We().length() <= 0) {
            return false;
        }
        Se();
        return true;
    }

    @Override
    public void r2(TdApi.Object object) {
        j0.I();
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
            this.f8260u0 = null;
        } else if (constructor == -1601123095) {
            this.f8260u0 = this.f24495b.P3(t2.P0(object));
            if (this.f8258s0 != null) {
                Client v42 = this.f24495b.v4();
                long j10 = this.f8260u0.f19908id;
                String str = this.f8258s0;
                v42.o(new TdApi.SetChatPhoto(j10, new TdApi.InputChatPhotoStatic(new TdApi.InputFileGenerated(str, d.j(str), 0))), this);
            }
        } else if (constructor != -722616727) {
            Log.unexpectedTdlibResponse(object, TdApi.CreateNewSupergroupChat.class, TdApi.Ok.class, TdApi.Chat.class, TdApi.Error.class);
            return;
        } else {
            return;
        }
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                i5.this.Ye();
            }
        });
    }

    @Override
    public boolean r3(View view, int i10) {
        this.f24495b.hd().s3(this.f24493a, i10, null, this.f8255p0);
        return true;
    }

    @Override
    public void rc() {
        Se();
    }

    @Override
    public boolean sd(Bundle bundle, String str) {
        super.sd(bundle, str);
        String string = bundle.getString(str + "title", "");
        Ad(new String[]{string, bundle.getString(str + "description", "")});
        return true;
    }

    @Override
    public void u(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            this.f24495b.hd().q3(i10, intent, this.f8255p0);
        }
    }

    @Override
    public boolean yd(Bundle bundle, String str) {
        super.yd(bundle, str);
        bundle.putString(str + "title", We());
        bundle.putString(str + "description", Te());
        return true;
    }
}
