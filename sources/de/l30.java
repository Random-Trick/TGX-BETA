package de;

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
import ce.a0;
import ce.j0;
import ce.p0;
import ce.v;
import de.l30;
import gb.g;
import gd.l;
import gd.w;
import hd.s4;
import ib.i;
import ie.g0;
import ie.h0;
import ie.u0;
import java.io.File;
import java.util.ArrayList;
import je.t;
import je.x0;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.a3;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.d1;
import ud.h1;
import ud.j1;
import ud.s;
import ud.v4;
import zd.o6;

public class l30 extends v4<a> implements h0, Handler.Callback, h1, j1 {
    public int f8543n0;
    public a3 f8544o0;
    public Handler f8545p0;
    public s f8546q0;
    public String f8547r0;
    public String f8548s0;
    public String f8549t0;
    public long f8550u0;
    public String f8551v0;
    public d f8552w0;

    public static class a {
        public int f8553a;
        public int f8554b;
        public String f8555c;
        public String f8556d;
        public String f8557e;

        public static a f(String str, String str2, String str3) {
            a aVar = new a();
            aVar.f8553a = 2;
            aVar.f8555c = str;
            aVar.f8556d = str2;
            aVar.f8557e = str3;
            return aVar;
        }

        public static a g(String str, String str2, String str3) {
            a aVar = new a();
            aVar.f8553a = 1;
            aVar.f8555c = str;
            aVar.f8556d = str2;
            aVar.f8557e = str3;
            return aVar;
        }

        public a h(int i10) {
            this.f8554b = i10;
            return this;
        }
    }

    public static class b {
        public int f8558a;
        public String f8559b;
        public x0 f8560c;
        public final int f8561d = a0.i(6.0f);
        public final int f8562e = a0.i(3.0f);
        public final g f8563f;
        public boolean f8564g;

        public b(v4<?> v4Var, int i10, String str) {
            g gVar = new g();
            this.f8563f = gVar;
            this.f8558a = i10;
            this.f8559b = Integer.toString(i10 + 1);
            x0 H = new x0(str, s4.L4(), t.d.C, je.g.I0(str, 1, null, v4Var.c(), null)).a(41).H(gVar);
            this.f8560c = H;
            H.B(a0.g());
        }

        public void c(View view) {
            this.f8563f.j(view);
        }

        public void d(View view) {
            this.f8563f.l(view);
        }

        public void e(View view, Canvas canvas) {
            this.f8560c.f(canvas, this.f8561d, view.getMeasuredWidth() - this.f8561d, 0, this.f8562e);
        }

        public int f(int i10) {
            if (i10 > 0) {
                j(i10);
            } else if (!this.f8564g) {
                j(a0.g());
            }
            return this.f8560c.getHeight() + (this.f8562e * 2);
        }

        public long g() {
            return this.f8558a;
        }

        public String h() {
            return this.f8559b;
        }

        public boolean i(View view, MotionEvent motionEvent) {
            return this.f8560c.x(view, motionEvent);
        }

        public void j(int i10) {
            if (i10 > 0) {
                this.f8560c.B(i10 - (this.f8561d * 2));
                this.f8564g = true;
            }
        }
    }

    public static class c extends View {
        public b f8565a;

        public c(Context context) {
            super(context);
        }

        public b a() {
            return this.f8565a;
        }

        public void b(b bVar) {
            if (this.f8565a == null || bVar == null || bVar.g() != this.f8565a.g()) {
                b bVar2 = this.f8565a;
                if (bVar2 != null) {
                    bVar2.d(this);
                }
                this.f8565a = bVar;
                if (bVar != null) {
                    bVar.c(this);
                }
                int f10 = bVar == null ? 0 : bVar.f(getMeasuredWidth());
                int measuredHeight = getMeasuredHeight();
                if (measuredHeight != f10 && measuredHeight > 0) {
                    requestLayout();
                    invalidate();
                }
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            b bVar = this.f8565a;
            if (bVar != null) {
                bVar.e(this, canvas);
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
            b bVar = this.f8565a;
            setMeasuredDimension(defaultSize, bVar == null ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : View.MeasureSpec.makeMeasureSpec(bVar.f(View.MeasureSpec.getSize(i10)), Log.TAG_TDLIB_OPTIONS));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            b bVar = this.f8565a;
            return (bVar != null && bVar.i(this, motionEvent)) || super.onTouchEvent(motionEvent);
        }
    }

    public static class d extends a3.d implements View.OnClickListener {
        public l30 R;
        public ArrayList<b> S;
        public int T;

        public d(a3 a3Var, l30 l30Var) {
            super(a3Var);
            this.R = l30Var;
        }

        public void x0(int i10, ArrayList arrayList, int i11) {
            for (int i12 = 0; i12 < i10; i12++) {
                ((b) arrayList.get(i12)).j(i11);
                if (this.R.Sa()) {
                    return;
                }
            }
            this.R.ff();
        }

        @Override
        public View d0(int i10) {
            c cVar = new c(this.P);
            cVar.setOnClickListener(this);
            p0.T(cVar);
            yd.d.j(cVar);
            cVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            this.R.t8(cVar);
            return cVar;
        }

        @Override
        public int f0() {
            return a0.i(25.0f);
        }

        @Override
        public int g0(int i10) {
            if (i10 < 0 || i10 >= this.S.size()) {
                return 0;
            }
            return this.S.get(i10).f(0);
        }

        @Override
        public int h0(int i10) {
            return 1;
        }

        @Override
        public int i0() {
            return this.T;
        }

        @Override
        public String k0(int i10) {
            return this.S.get(i10).h();
        }

        @Override
        public void onClick(View view) {
            if (this.S.size() == 1) {
                this.R.hf();
                return;
            }
            b a10 = ((c) view).a();
            if (a10 != null) {
                this.R.m6if(a10.f8558a, a10.f8560c.v());
            }
        }

        @Override
        public void u0(a3.c cVar, int i10) {
            ((c) cVar.f2982a).b(this.S.get(i10));
        }

        public void w0(ArrayList<b> arrayList, int i10) {
            int i11 = this.T;
            this.S = arrayList;
            this.T = i10;
            int i12 = i10 - i11;
            if (i12 > 0) {
                t0();
                M(i11, i12);
            }
        }

        public void y0() {
            final ArrayList<b> arrayList = this.S;
            if (arrayList != null) {
                final int i10 = this.T;
                final int g10 = a0.g();
                l.a().b(new Runnable() {
                    @Override
                    public final void run() {
                        l30.d.this.x0(i10, arrayList, g10);
                    }
                });
            }
        }
    }

    public l30(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Ze(String str) {
        String[] split = str.split("\n");
        ArrayList<b> arrayList = new ArrayList<>();
        int i10 = 0;
        for (String str2 : split) {
            Te(i10);
            arrayList.add(new b(this, i10, str2));
            i10++;
            if (!Sa()) {
                if (i10 % 100 == 0) {
                    gf(i10, arrayList);
                }
                if (i10 == 100000) {
                    break;
                }
            } else {
                return;
            }
        }
        ef(i10, arrayList);
    }

    public void af(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: de.l30.af(java.lang.String):void");
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public View G9() {
        return this.f8546q0;
    }

    @Override
    public View Ga() {
        return this.f8544o0;
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_more) {
            jf();
        }
    }

    @Override
    public boolean P() {
        return g0.a(this);
    }

    @Override
    public void P0(int i10) {
        switch (i10) {
            case R.id.btn_copyText:
                Ue();
                return;
            case R.id.btn_openLink:
                v.r(new File(this.f8549t0), this.f8548s0);
                return;
            case R.id.btn_search:
                Yc();
                return;
            case R.id.btn_share:
                v.N(this.f8551v0);
                return;
            default:
                return;
        }
    }

    @Override
    public int R9() {
        return R.id.controller_text;
    }

    public final boolean Se() {
        return this.f8551v0 != null;
    }

    public final void Te(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i10 == 0 || currentTimeMillis - this.f8550u0 >= 40) {
            this.f8550u0 = currentTimeMillis;
            df(i10);
        }
    }

    public final void Ue() {
        String str = this.f8551v0;
        if (str == null) {
            j0.y0(R.string.TextNotLoadedHint, 0);
        } else {
            j0.i(str, R.string.CopiedText);
        }
    }

    public final void Ve(ArrayList<b> arrayList, int i10) {
        if (!Sa()) {
            this.f8552w0.w0(arrayList, i10);
        }
    }

    @Override
    public int W9() {
        return R.id.menu_text;
    }

    public final void We(int i10, boolean z10) {
        if (z10) {
            this.f8546q0.setSubtitle(w.P(R.string.ReadingXLine, i10 + 1));
        } else if (this.f8543n0 > 0) {
            this.f8546q0.setSubtitle(w.k0(R.string.format_linesAndViews, w.q2(R.string.xLines, i10), w.q2(R.string.xViews, this.f8543n0)));
        } else {
            this.f8546q0.setSubtitle(w.q2(R.string.xLines, i10));
        }
    }

    public final void Xe(final String str) {
        if (!Sa()) {
            if (!i.i(x9().f8555c)) {
                this.f8546q0.setTitle(x9().f8555c);
            } else {
                this.f8546q0.setTitle(R.string.Text);
            }
            this.f8551v0 = str;
            j0.z();
            a0.g();
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    l30.this.Ze(str);
                }
            });
        }
    }

    public final void Ye() {
        if (!Sa()) {
            this.f8544o0.M1();
            this.f8544o0.Q1();
        }
    }

    @Override
    public Object a2(int i10) {
        return g0.b(this, i10);
    }

    public final void bf(final String str) {
        j0.z();
        a0.g();
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                l30.this.af(str);
            }
        });
    }

    public final void cf() {
        a w92 = w9();
        if (w92 != null) {
            this.f8548s0 = w92.f8557e;
            this.f8543n0 = w92.f8554b;
            this.f8546q0.setTitle(w92.f8555c);
            int i10 = w92.f8553a;
            if (i10 == 1) {
                Xe(w92.f8556d);
            } else if (i10 == 2) {
                String str = w92.f8556d;
                this.f8549t0 = str;
                bf(str);
            }
        }
    }

    public final void df(int i10) {
        Handler handler = this.f8545p0;
        handler.sendMessage(Message.obtain(handler, 0, i10, 0));
    }

    public final void ef(int i10, ArrayList<b> arrayList) {
        Handler handler = this.f8545p0;
        handler.sendMessage(Message.obtain(handler, 2, i10, 0, arrayList));
    }

    public final void ff() {
        Handler handler = this.f8545p0;
        handler.sendMessage(Message.obtain(handler, 3));
    }

    public final void gf(int i10, ArrayList<b> arrayList) {
        Handler handler = this.f8545p0;
        handler.sendMessage(Message.obtain(handler, 1, i10, 0, arrayList));
    }

    @Override
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            We(message.arg1, true);
            return true;
        } else if (i10 == 1) {
            Ve((ArrayList) message.obj, message.arg1);
            return true;
        } else if (i10 == 2) {
            We(message.arg1, false);
            Ve((ArrayList) message.obj, message.arg1);
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            Ye();
            return true;
        }
    }

    public void hf() {
        String str = this.f8551v0;
        if (str != null && str.trim().length() > 0) {
            ie(new int[]{R.id.btn_copyText}, new String[]{w.i1(R.string.CopyText)});
        }
    }

    public void m6if(int i10, String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() != 0) {
                this.f8547r0 = str;
                int[] iArr = {R.id.btn_copyLine};
                de(trim, iArr, new String[]{w.i1(R.string.CopyLine) + " " + (i10 + 1)}, null, new int[]{R.drawable.baseline_content_copy_24});
            }
        }
    }

    public final void jf() {
        jb.c cVar = new jb.c(2);
        u0 u0Var = new u0(2);
        if (this.f8549t0 != null && v0.A(new File(this.f8549t0), this.f8548s0)) {
            cVar.a(R.id.btn_openLink);
            u0Var.a(R.string.OpenInExternalApp);
        }
        if (Se()) {
            cVar.a(R.id.btn_copyText);
            u0Var.a(R.string.CopyText);
            if (x9().f8553a == 1) {
                cVar.a(R.id.btn_share);
                u0Var.a(R.string.Share);
            }
        }
        Yd(cVar.e(), u0Var.d(), 0);
    }

    @Override
    public void mc(Configuration configuration) {
        super.mc(configuration);
        this.f8544o0.M1();
        this.f8544o0.Q1();
        this.f8552w0.y0();
    }

    @Override
    public View oc(Context context) {
        s sVar = new s(context);
        this.f8546q0 = sVar;
        sVar.setThemedTextColor(this);
        this.f8546q0.A1(a0.i(49.0f), true);
        a3 a3Var = new a3(context);
        this.f8544o0 = a3Var;
        a3Var.setItemAnimator(null);
        this.f8544o0.U1();
        this.f8544o0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        a3 a3Var2 = this.f8544o0;
        d dVar = new d(a3Var2, this);
        this.f8552w0 = dVar;
        a3Var2.setSectionedAdapter(dVar);
        this.f8545p0 = new Handler(Looper.getMainLooper(), this);
        cf();
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        yd.g.i(frameLayoutFix, R.id.theme_color_filling, this);
        frameLayoutFix.addView(this.f8544o0);
        return frameLayoutFix;
    }

    @Override
    public boolean r3(View view, int i10) {
        if (i10 == R.id.btn_copyLine) {
            j0.i(this.f8547r0, R.string.CopiedText);
            return true;
        } else if (i10 != R.id.btn_copyText) {
            return true;
        } else {
            Ue();
            return true;
        }
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_text) {
            d1Var.a2(linearLayout, this);
        }
    }
}
