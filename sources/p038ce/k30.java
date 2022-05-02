package p038ce;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import be.C1405v;
import gd.AbstractC4761s4;
import ie.C5428t;
import ie.C5459x0;
import ie.RunnableC5390g;
import java.io.File;
import java.util.ArrayList;
import me.RunnableC6832a3;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.k30;
import p080fb.C4341g;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.C10930q6;
import td.AbstractC9201h1;
import td.AbstractC9213j1;
import td.AbstractC9323v4;
import td.C9289s;
import td.View$OnClickListenerC9170d1;

public class k30 extends AbstractC9323v4<C2608a> implements AbstractC5117h0, Handler.Callback, AbstractC9201h1, AbstractC9213j1 {
    public int f8849n0;
    public RunnableC6832a3 f8850o0;
    public Handler f8851p0;
    public C9289s f8852q0;
    public String f8853r0;
    public String f8854s0;
    public String f8855t0;
    public long f8856u0;
    public String f8857v0;
    public View$OnClickListenerC2611d f8858w0;

    public static class C2608a {
        public int f8859a;
        public int f8860b;
        public String f8861c;
        public String f8862d;
        public String f8863e;

        public static C2608a m34038f(String str, String str2, String str3) {
            C2608a aVar = new C2608a();
            aVar.f8859a = 2;
            aVar.f8861c = str;
            aVar.f8862d = str2;
            aVar.f8863e = str3;
            return aVar;
        }

        public static C2608a m34037g(String str, String str2, String str3) {
            C2608a aVar = new C2608a();
            aVar.f8859a = 1;
            aVar.f8861c = str;
            aVar.f8862d = str2;
            aVar.f8863e = str3;
            return aVar;
        }

        public C2608a m34036h(int i) {
            this.f8860b = i;
            return this;
        }
    }

    public static class C2609b {
        public int f8864a;
        public String f8865b;
        public C5459x0 f8866c;
        public final int f8867d = C1357a0.m37544i(6.0f);
        public final int f8868e = C1357a0.m37544i(3.0f);
        public final C4341g f8869f;
        public boolean f8870g;

        public C2609b(AbstractC9323v4<?> v4Var, int i, String str) {
            C4341g gVar = new C4341g();
            this.f8869f = gVar;
            this.f8864a = i;
            this.f8865b = Integer.toString(i + 1);
            C5459x0 H = new C5459x0(str, AbstractC4761s4.m26126M4(), C5428t.AbstractC5441d.f17872C, RunnableC5390g.m22992I0(str, 1, null, v4Var.mo4348c(), null)).m22636a(41).m22637H(gVar);
            this.f8866c = H;
            H.m22643B(C1357a0.m37546g());
        }

        public void m34033c(View view) {
            this.f8869f.m28243j(view);
        }

        public void m34032d(View view) {
            this.f8869f.m28241l(view);
        }

        public void m34031e(View view, Canvas canvas) {
            this.f8866c.m22632f(canvas, this.f8867d, view.getMeasuredWidth() - this.f8867d, 0, this.f8868e);
        }

        public int m34030f(int i) {
            if (i > 0) {
                m34026j(i);
            } else if (!this.f8870g) {
                m34026j(C1357a0.m37546g());
            }
            return this.f8866c.getHeight() + (this.f8868e * 2);
        }

        public long m34029g() {
            return this.f8864a;
        }

        public String m34028h() {
            return this.f8865b;
        }

        public boolean m34027i(View view, MotionEvent motionEvent) {
            return this.f8866c.m22615x(view, motionEvent);
        }

        public void m34026j(int i) {
            if (i > 0) {
                this.f8866c.m22643B(i - (this.f8867d * 2));
                this.f8870g = true;
            }
        }
    }

    public static class C2610c extends View {
        public C2609b f8871a;

        public C2610c(Context context) {
            super(context);
        }

        public C2609b m34025a() {
            return this.f8871a;
        }

        public void m34024b(C2609b bVar) {
            if (this.f8871a == null || bVar == null || bVar.m34029g() != this.f8871a.m34029g()) {
                C2609b bVar2 = this.f8871a;
                if (bVar2 != null) {
                    bVar2.m34032d(this);
                }
                this.f8871a = bVar;
                if (bVar != null) {
                    bVar.m34033c(this);
                }
                int f = bVar == null ? 0 : bVar.m34030f(getMeasuredWidth());
                int measuredHeight = getMeasuredHeight();
                if (measuredHeight != f && measuredHeight > 0) {
                    requestLayout();
                    invalidate();
                }
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            C2609b bVar = this.f8871a;
            if (bVar != null) {
                bVar.m34031e(this, canvas);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            C2609b bVar = this.f8871a;
            setMeasuredDimension(defaultSize, bVar == null ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : View.MeasureSpec.makeMeasureSpec(bVar.m34030f(View.MeasureSpec.getSize(i)), Log.TAG_TDLIB_OPTIONS));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            C2609b bVar = this.f8871a;
            return (bVar != null && bVar.m34027i(this, motionEvent)) || super.onTouchEvent(motionEvent);
        }
    }

    public static class View$OnClickListenerC2611d extends RunnableC6832a3.AbstractC6836d implements View.OnClickListener {
        public k30 f8872R;
        public ArrayList<C2609b> f8873S;
        public int f8874T;

        public View$OnClickListenerC2611d(RunnableC6832a3 a3Var, k30 k30Var) {
            super(a3Var);
            this.f8872R = k30Var;
        }

        public void m34020z0(int i, ArrayList arrayList, int i2) {
            for (int i3 = 0; i3 < i; i3++) {
                ((C2609b) arrayList.get(i3)).m34026j(i2);
                if (this.f8872R.m9347Sa()) {
                    return;
                }
            }
            this.f8872R.m34048ff();
        }

        public void m34023A0() {
            final ArrayList<C2609b> arrayList = this.f8873S;
            if (arrayList != null) {
                final int i = this.f8874T;
                final int g = C1357a0.m37546g();
                C4383l.m28061a().m28060b(new Runnable() {
                    @Override
                    public final void run() {
                        k30.View$OnClickListenerC2611d.this.m34020z0(i, arrayList, g);
                    }
                });
            }
        }

        @Override
        public View mo18843e0(int i) {
            C2610c cVar = new C2610c(this.f21425P);
            cVar.setOnClickListener(this);
            C1399s0.m37196a0(cVar);
            C10189d.m5794j(cVar);
            cVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            this.f8872R.m9163t8(cVar);
            return cVar;
        }

        @Override
        public int mo18841g0() {
            return C1357a0.m37544i(25.0f);
        }

        @Override
        public int mo18840h0(int i) {
            if (i < 0 || i >= this.f8873S.size()) {
                return 0;
            }
            return this.f8873S.get(i).m34030f(0);
        }

        @Override
        public int mo18839i0(int i) {
            return 1;
        }

        @Override
        public int mo18838j0() {
            return this.f8874T;
        }

        @Override
        public String mo18836l0(int i) {
            return this.f8873S.get(i).m34028h();
        }

        @Override
        public void onClick(View view) {
            if (this.f8873S.size() == 1) {
                this.f8872R.m34046hf();
                return;
            }
            C2609b a = ((C2610c) view).m34025a();
            if (a != null) {
                this.f8872R.m34045if(a.f8864a, a.f8866c.m22617v());
            }
        }

        @Override
        public void mo18826w0(RunnableC6832a3.C6835c cVar, int i) {
            ((C2610c) cVar.f3479a).m34024b(this.f8873S.get(i));
        }

        public void m34021y0(ArrayList<C2609b> arrayList, int i) {
            int i2 = this.f8874T;
            this.f8873S = arrayList;
            this.f8874T = i;
            int i3 = i - i2;
            if (i3 > 0) {
                m18827u0();
                m39311M(i2, i3);
            }
        }
    }

    public k30(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m34054Ze(String str) {
        String[] split = str.split("\n");
        ArrayList<C2609b> arrayList = new ArrayList<>();
        int i = 0;
        for (String str2 : split) {
            m34060Te(i);
            arrayList.add(new C2609b(this, i, str2));
            i++;
            if (!m9347Sa()) {
                if (i % 100 == 0) {
                    m34047gf(i, arrayList);
                }
                if (i == 100000) {
                    break;
                }
            } else {
                return;
            }
        }
        m34049ef(i, arrayList);
    }

    public void m34053af(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.k30.m34053af(java.lang.String):void");
    }

    @Override
    public boolean mo493A3(View view, int i) {
        if (i == R.id.btn_copyLine) {
            C1379j0.m37328i(this.f8853r0, R.string.CopiedText);
            return true;
        } else if (i != R.id.btn_copyText) {
            return true;
        } else {
            m34059Ue();
            return true;
        }
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public View mo8869G9() {
        return this.f8852q0;
    }

    @Override
    public View mo8868Ga() {
        return this.f8850o0;
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_more) {
            m34044jf();
        }
    }

    @Override
    public void mo8864N0(int i) {
        switch (i) {
            case R.id.btn_copyText:
                m34059Ue();
                return;
            case R.id.btn_openLink:
                C1405v.m37106r(new File(this.f8855t0), this.f8854s0);
                return;
            case R.id.btn_search:
                m9303Yc();
                return;
            case R.id.btn_share:
                C1405v.m37131O(this.f8857v0);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean mo492Q() {
        return C5115g0.m23936a(this);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_text;
    }

    public final boolean m34061Se() {
        return this.f8857v0 != null;
    }

    public final void m34060Te(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 0 || currentTimeMillis - this.f8856u0 >= 40) {
            this.f8856u0 = currentTimeMillis;
            m34050df(i);
        }
    }

    public final void m34059Ue() {
        String str = this.f8857v0;
        if (str == null) {
            C1379j0.m37295y0(R.string.TextNotLoadedHint, 0);
        } else {
            C1379j0.m37328i(str, R.string.CopiedText);
        }
    }

    public final void m34058Ve(ArrayList<C2609b> arrayList, int i) {
        if (!m9347Sa()) {
            this.f8858w0.m34021y0(arrayList, i);
        }
    }

    @Override
    public int mo418W9() {
        return R.id.menu_text;
    }

    public final void m34057We(int i, boolean z) {
        if (z) {
            this.f8852q0.setSubtitle(C4403w.m27953P(R.string.ReadingXLine, i + 1));
        } else if (this.f8849n0 > 0) {
            this.f8852q0.setSubtitle(C4403w.m27864k0(R.string.format_linesAndViews, C4403w.m27838q2(R.string.xLines, i), C4403w.m27838q2(R.string.xViews, this.f8849n0)));
        } else {
            this.f8852q0.setSubtitle(C4403w.m27838q2(R.string.xLines, i));
        }
    }

    public final void m34056Xe(final String str) {
        if (!m9347Sa()) {
            if (!C5070i.m24062i(m9131x9().f8861c)) {
                this.f8852q0.setTitle(m9131x9().f8861c);
            } else {
                this.f8852q0.setTitle(R.string.Text);
            }
            this.f8857v0 = str;
            C1379j0.m37294z();
            C1357a0.m37546g();
            C4383l.m28061a().m28060b(new Runnable() {
                @Override
                public final void run() {
                    k30.this.m34054Ze(str);
                }
            });
        }
    }

    public final void m34055Ye() {
        if (!m9347Sa()) {
            this.f8850o0.m18855N1();
            this.f8850o0.m18851R1();
        }
    }

    @Override
    public Object mo491b2(int i) {
        return C5115g0.m23935b(this, i);
    }

    public final void m34052bf(final String str) {
        C1379j0.m37294z();
        C1357a0.m37546g();
        C4383l.m28061a().m28060b(new Runnable() {
            @Override
            public final void run() {
                k30.this.m34053af(str);
            }
        });
    }

    public final void m34051cf() {
        C2608a w9 = m9139w9();
        if (w9 != null) {
            this.f8854s0 = w9.f8863e;
            this.f8849n0 = w9.f8860b;
            this.f8852q0.setTitle(w9.f8861c);
            int i = w9.f8859a;
            if (i == 1) {
                m34056Xe(w9.f8862d);
            } else if (i == 2) {
                String str = w9.f8862d;
                this.f8855t0 = str;
                m34052bf(str);
            }
        }
    }

    public final void m34050df(int i) {
        Handler handler = this.f8851p0;
        handler.sendMessage(Message.obtain(handler, 0, i, 0));
    }

    public final void m34049ef(int i, ArrayList<C2609b> arrayList) {
        Handler handler = this.f8851p0;
        handler.sendMessage(Message.obtain(handler, 2, i, 0, arrayList));
    }

    public final void m34048ff() {
        Handler handler = this.f8851p0;
        handler.sendMessage(Message.obtain(handler, 3));
    }

    public final void m34047gf(int i, ArrayList<C2609b> arrayList) {
        Handler handler = this.f8851p0;
        handler.sendMessage(Message.obtain(handler, 1, i, 0, arrayList));
    }

    @Override
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            m34057We(message.arg1, true);
            return true;
        } else if (i == 1) {
            m34058Ve((ArrayList) message.obj, message.arg1);
            return true;
        } else if (i == 2) {
            m34057We(message.arg1, false);
            m34058Ve((ArrayList) message.obj, message.arg1);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            m34055Ye();
            return true;
        }
    }

    public void m34046hf() {
        String str = this.f8857v0;
        if (str != null && str.trim().length() > 0) {
            m9233ie(new int[]{R.id.btn_copyText}, new String[]{C4403w.m27871i1(R.string.CopyText)});
        }
    }

    public void m34045if(int i, String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() != 0) {
                this.f8853r0 = str;
                int[] iArr = {R.id.btn_copyLine};
                m9268de(trim, iArr, new String[]{C4403w.m27871i1(R.string.CopyLine) + " " + (i + 1)}, null, new int[]{R.drawable.baseline_content_copy_24});
            }
        }
    }

    public final void m34044jf() {
        C5320c cVar = new C5320c(2);
        C5146u0 u0Var = new C5146u0(2);
        if (this.f8855t0 != null && C7389v0.m16758A(new File(this.f8855t0), this.f8854s0)) {
            cVar.m23285a(R.id.btn_openLink);
            u0Var.m23817a(R.string.OpenInExternalApp);
        }
        if (m34061Se()) {
            cVar.m23285a(R.id.btn_copyText);
            u0Var.m23817a(R.string.CopyText);
            if (m9131x9().f8859a == 1) {
                cVar.m23285a(R.id.btn_share);
                u0Var.m23817a(R.string.Share);
            }
        }
        m9302Yd(cVar.m23281e(), u0Var.m23814d(), 0);
    }

    @Override
    public void mo9208mc(Configuration configuration) {
        super.mo9208mc(configuration);
        this.f8850o0.m18855N1();
        this.f8850o0.m18851R1();
        this.f8858w0.m34023A0();
    }

    @Override
    public View mo403oc(Context context) {
        C9289s sVar = new C9289s(context);
        this.f8852q0 = sVar;
        sVar.setThemedTextColor(this);
        this.f8852q0.m9631D1(C1357a0.m37544i(49.0f), true);
        RunnableC6832a3 a3Var = new RunnableC6832a3(context);
        this.f8850o0 = a3Var;
        a3Var.setItemAnimator(null);
        this.f8850o0.m18847V1();
        this.f8850o0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        RunnableC6832a3 a3Var2 = this.f8850o0;
        View$OnClickListenerC2611d dVar = new View$OnClickListenerC2611d(a3Var2, this);
        this.f8858w0 = dVar;
        a3Var2.setSectionedAdapter(dVar);
        this.f8851p0 = new Handler(Looper.getMainLooper(), this);
        m34051cf();
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        C10192g.m5782i(frameLayoutFix, R.id.theme_color_filling, this);
        frameLayoutFix.addView(this.f8850o0);
        return frameLayoutFix;
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_text) {
            d1Var.m10068b2(linearLayout, this);
        }
    }
}
