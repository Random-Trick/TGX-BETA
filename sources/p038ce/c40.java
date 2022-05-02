package p038ce;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1410y;
import gd.C4779t2;
import ge.C4868i;
import ie.C5375a;
import ie.C5386e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.C6847b2;
import me.C6851c0;
import me.C6853c2;
import me.C6918i3;
import me.C6977n2;
import me.C6985o2;
import me.C7030t1;
import me.C7057w;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import me.vkryl.leveldb.LevelDB;
import nc.C7368l;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import org.thunderdog.challegram.p211v.HeaderEditText;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p053dd.C4007j;
import p053dd.C4012k;
import p082fd.C4383l;
import p082fd.C4403w;
import p082fd.C4411y;
import p108hb.C5062b;
import p108hb.C5064d;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.AbstractC5139r;
import p111he.C5115g0;
import p111he.C5132o;
import p111he.C5137q;
import p139jb.AbstractC5919k;
import p139jb.AbstractRunnableC5910b;
import p193nb.C7321e;
import p194nd.C7484p1;
import p254rd.C8426a;
import p291uc.C9626o4;
import p335xd.C10192g;
import p350yd.C10536ab;
import p350yd.C10930q6;
import p364zd.AbstractC11531p;
import p364zd.C11510b;
import p364zd.C11524j;
import p364zd.C11527m;
import p364zd.C11529n;
import p364zd.C11533r;
import p364zd.C11541z;
import sc.C8731d;
import sd.C8872e;
import tc.C9137c;
import tc.C9139d;
import td.AbstractC9323v4;
import td.C9289s;
import td.View$OnClickListenerC9170d1;
import vc.C9903a;

public class c40 extends AbstractC3204vo<C2234n> implements View.OnClickListener, ClipboardManager.OnPrimaryClipChangedListener, View.OnLongClickListener {
    public C2546iq f7741D0;
    public Pattern f7743F0;
    public View f7744G0;
    public boolean f7745H0;
    public Drawable f7746I0;
    public String f7747J0;
    public int f7748K0;
    public boolean f7749L0;
    public C2964ra f7751N0;
    public C3940f f7752O0;
    public View f7753P0;
    public View f7754Q0;
    public boolean f7755R0;
    public AbstractRunnableC5910b f7756S0;
    public final float[] f7742E0 = new float[3];
    public int f7750M0 = -1;

    public class C2219a implements AbstractC5139r {
        public C9626o4 f7757a;

        public C2219a() {
        }

        @Override
        public void mo23819a(View view, Canvas canvas) {
            C5137q.m23835a(this, view, canvas);
        }

        @Override
        public void mo23818b(View view, Canvas canvas) {
            int i = C1357a0.m37544i(122.0f);
            if (this.f7757a == null) {
                C9626o4 o4Var = new C9626o4(C4779t2.m25664J4(), 1, false);
                this.f7757a = o4Var;
                o4Var.m7968j(i);
            }
            this.f7757a.m7972f(canvas, 0.5f, (view.getMeasuredWidth() - C1357a0.m37544i(12.0f)) - i, view.getMeasuredHeight() / 2);
        }
    }

    public class C2220b implements AbstractC5139r {
        public C9626o4 f7759a;
        public final AbstractC11531p f7760b;

        public C2220b(AbstractC11531p pVar) {
            this.f7760b = pVar;
        }

        @Override
        public void mo23819a(View view, Canvas canvas) {
            C5137q.m23835a(this, view, canvas);
        }

        @Override
        public void mo23818b(View view, Canvas canvas) {
            int i = C1357a0.m37544i(122.0f);
            canvas.drawRect((view.getMeasuredWidth() - i) - (C1357a0.m37544i(12.0f) * 2), 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), C1410y.m37042g(this.f7760b.mo92e(R.id.theme_color_bubbleOut_background)));
            if (this.f7759a == null) {
                C9626o4 o4Var = new C9626o4(C4779t2.m25664J4(), 1, true);
                this.f7759a = o4Var;
                o4Var.m7968j(i);
            }
            this.f7759a.m7972f(canvas, 0.5f, (view.getMeasuredWidth() - C1357a0.m37544i(12.0f)) - i, view.getMeasuredHeight() / 2);
        }
    }

    public class C2221c extends ClickableSpan {
        public final String f7762a;

        public C2221c(String str) {
            this.f7762a = str;
        }

        @Override
        public void onClick(View view) {
            c40.this.f30170b.m2485dd().m3697U8(c40.this, this.f7762a, "", true);
        }
    }

    public class C2222d extends AbstractRunnableC5910b {
        public C2222d() {
        }

        @Override
        public void mo1364b() {
            c40.this.m35252hi(false, null);
        }
    }

    public class C2223e implements TextWatcher {
        public C2223e() {
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            c40.this.m35262ci(charSequence.toString().trim().toLowerCase(), null);
            if (c40.this.f30159R != null) {
                c40.this.f30159R.m10060e4(R.id.menu_clear, R.id.menu_btn_clear, charSequence.length() > 0, true);
            }
        }
    }

    public class C2224f extends C2546iq {
        public boolean f7766m0;
        public final Context f7767n0;

        public class C2225a implements C7484p1.AbstractC7485a {
            public final int f7769a;

            public C2225a(int i) {
                this.f7769a = i;
            }

            @Override
            public void mo15839U0(C7484p1 p1Var, float f) {
            }

            @Override
            public void mo15838q2(C7484p1 p1Var, boolean z) {
                if (!z) {
                    p1Var.m15847b(Math.round(p1Var.getValue() * (this.f7769a - 1)) / (this.f7769a - 1));
                }
            }

            @Override
            public boolean mo15837s0(C7484p1 p1Var) {
                return true;
            }
        }

        public class C2226b extends View$OnFocusChangeListenerC7069y1 {
            public C2226b(Context context) {
                super(context);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return true;
            }
        }

        public C2224f(AbstractC9323v4 v4Var, Context context) {
            super(v4Var);
            this.f7767n0 = context;
        }

        @Override
        public C2139ap mo34208V0(ViewGroup viewGroup, int i) {
            float f;
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -1, 21);
            C2139ap G1 = c40.this.f7741D0.mo6145S(viewGroup, 89);
            LinearLayout linearLayout = new LinearLayout(this.f7767n0);
            linearLayout.setGravity(16);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(t1);
            linearLayout.setPadding(C1357a0.m37544i(12.0f), 0, 0, 0);
            switch (i) {
                case 0:
                    C10192g.m5782i(linearLayout, 0, c40.this);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C6853c2.m18774c());
                    layoutParams.rightMargin = C1357a0.m37544i(6.0f);
                    C6853c2 c2Var = new C6853c2(this.f7767n0);
                    c40.this.m9163t8(c2Var);
                    c2Var.setText(R.string.Demo);
                    c2Var.m18770g(true, false);
                    c2Var.setLayoutParams(layoutParams);
                    linearLayout.addView(c2Var);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, C6853c2.m18774c());
                    layoutParams2.rightMargin = C1357a0.m37544i(12.0f);
                    C6853c2 c2Var2 = new C6853c2(this.f7767n0);
                    c40.this.m9163t8(c2Var2);
                    c2Var2.setText(R.string.Demo);
                    c2Var2.setForceActive(true);
                    c2Var2.m18770g(true, false);
                    c2Var2.setLayoutParams(layoutParams2);
                    linearLayout.addView(c2Var2);
                    break;
                case 1:
                    for (int i2 = 0; i2 < 4; i2++) {
                        C6977n2 n2Var = new C6977n2(this.f7767n0);
                        c40.this.m9163t8(n2Var);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C1357a0.m37544i(32.0f), C1357a0.m37544i(64.0f));
                        layoutParams3.rightMargin = C1357a0.m37544i(4.0f);
                        if (i2 == 0) {
                            n2Var.m18224j(1.0f);
                            n2Var.getProgress().m18265y();
                            layoutParams3.width = C1357a0.m37544i(12.0f);
                        } else if (i2 == 1) {
                            n2Var.m18225i(1.0f);
                            layoutParams3.width = C1357a0.m37544i(18.0f);
                        } else if (i2 == 2) {
                            n2Var.m18228e(1.0f);
                            layoutParams3.width = C1357a0.m37544i(22.0f);
                        } else if (i2 == 3) {
                            n2Var.m18226h(1.0f);
                            layoutParams3.rightMargin = C1357a0.m37544i(12.0f);
                            layoutParams3.width = C1357a0.m37544i(42.0f);
                        }
                        n2Var.getProgress().m18271s(true);
                        n2Var.setLayoutParams(layoutParams3);
                        linearLayout.addView(n2Var);
                    }
                    break;
                case 2:
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C1357a0.m37544i(18.0f), C1357a0.m37544i(18.0f));
                    layoutParams4.rightMargin = C1357a0.m37544i(4.0f);
                    View f2 = C7057w.m17932f(this.f7767n0);
                    c40.this.m9163t8(f2);
                    f2.setLayoutParams(layoutParams4);
                    layoutParams4.gravity = 16;
                    linearLayout.addView(f2);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(C1357a0.m37544i(22.0f), C1357a0.m37544i(22.0f));
                    layoutParams5.gravity = 16;
                    layoutParams5.rightMargin = C1357a0.m37544i(18.0f);
                    View d = C6985o2.m18177d(this.f7767n0);
                    c40.this.m9163t8(d);
                    d.setLayoutParams(layoutParams5);
                    linearLayout.addView(d);
                    break;
                case 3:
                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, C1357a0.m37544i(16.0f));
                    layoutParams6.rightMargin = C1357a0.m37544i(18.0f);
                    C6847b2 b2Var = new C6847b2(this.f7767n0);
                    C10192g.m5782i(b2Var, R.id.theme_color_promo, c40.this).m16760e(3.0f);
                    b2Var.setId(R.id.btn_new);
                    b2Var.setSingleLine(true);
                    b2Var.setPadding(C1357a0.m37544i(4.0f), C1357a0.m37544i(1.0f), C1357a0.m37544i(4.0f), 0);
                    b2Var.setTextColor(C11524j.m228N(R.id.theme_color_promoContent));
                    c40.this.m9119z8(b2Var, R.id.theme_color_promoContent);
                    c40.this.m9163t8(b2Var);
                    b2Var.setTypeface(C1389o.m37265g());
                    b2Var.setTextSize(1, 10.0f);
                    b2Var.setText(C4403w.m27871i1(R.string.New).toUpperCase());
                    b2Var.setLayoutParams(layoutParams6);
                    linearLayout.addView(b2Var);
                    break;
                case 4:
                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(C1357a0.m37544i(82.0f), -2);
                    layoutParams7.rightMargin = C1357a0.m37544i(12.0f);
                    t1.bottomMargin = C1357a0.m37544i(4.0f);
                    C2226b bVar = new C2226b(this.f7767n0);
                    bVar.setHint(R.string.Demo);
                    bVar.getEditText().setEnabled(false);
                    bVar.getEditText().getLayoutParams().height = C1357a0.m37544i(40.0f);
                    bVar.setLayoutParams(layoutParams7);
                    bVar.m17922J1(c40.this);
                    linearLayout.addView(bVar);
                    break;
                case 5:
                    LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(C1357a0.m37544i(122.0f), C6853c2.m18774c());
                    C7484p1 p1Var = new C7484p1(this.f7767n0);
                    c40.this.m9163t8(p1Var);
                    p1Var.m15841h(true, false);
                    p1Var.setValueCount(5);
                    p1Var.setPadding(C1357a0.m37544i(12.0f), 0, C1357a0.m37544i(12.0f), 0);
                    p1Var.setValue(Math.round(0.5f * f) / 4);
                    p1Var.setListener(new C2225a(5));
                    p1Var.setLayoutParams(layoutParams8);
                    p1Var.setForceBackgroundColorId(R.id.theme_color_sliderInactive);
                    p1Var.m15842g(R.id.theme_color_sliderActive, false);
                    linearLayout.addView(p1Var);
                    break;
                case 6:
                    View c0Var = new C6851c0(this.f7767n0);
                    c0Var.setEnabled(false);
                    c40.this.m9163t8(c0Var);
                    int i3 = C1357a0.m37544i(4.0f);
                    int i4 = i3 * 2;
                    FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1((C1357a0.m37544i(23.0f) * 2) + i4, (C1357a0.m37544i(23.0f) * 2) + i4, 85);
                    t12.rightMargin = C1357a0.m37544i(12.0f) - i3;
                    c0Var.setLayoutParams(t12);
                    linearLayout.addView(c0Var);
                    break;
                default:
                    throw new IllegalArgumentException("customViewType == " + i);
            }
            ((C9137c) G1.f3479a).addView(linearLayout);
            return G1;
        }

        @Override
        public void mo394V2(p038ce.C2964ra r8, tc.C9137c r9, boolean r10) {
            throw new UnsupportedOperationException("Method not decompiled: p038ce.c40.C2224f.mo394V2(ce.ra, tc.c, boolean):void");
        }

        @Override
        public void mo17889i2(me.View$OnFocusChangeListenerC7069y1 r14, java.lang.CharSequence r15) {
            throw new UnsupportedOperationException("Method not decompiled: p038ce.c40.C2224f.mo17889i2(me.y1, java.lang.CharSequence):void");
        }

        @Override
        public void mo11044j(C8872e eVar, float f, float f2, boolean z) {
            ViewGroup th = c40.m35239th(eVar);
            if (th != null) {
                C2964ra raVar = (C2964ra) th.getTag();
                C11510b bVar = (C11510b) raVar.m32847d();
                if (bVar != null) {
                    if (bVar.m358s(2, f2, z) || bVar.m358s(1, f, z)) {
                        c40.this.m35266ai(bVar, !z);
                    }
                    this.f7766m0 = true;
                    m34164j2(raVar, -1, th, eVar);
                    this.f7766m0 = false;
                }
            }
        }

        @Override
        public void mo11043k(C8872e eVar, boolean z) {
            c40.this.m35252hi(z, eVar);
        }

        @Override
        public void mo34160k2(C2964ra raVar, int i, ViewGroup viewGroup, View view, C8872e eVar, C8426a aVar, C8426a aVar2, View$OnFocusChangeListenerC7069y1 y1Var, View$OnFocusChangeListenerC7069y1 y1Var2, View$OnFocusChangeListenerC7069y1 y1Var3, View$OnFocusChangeListenerC7069y1 y1Var4, View$OnFocusChangeListenerC7069y1 y1Var5, View$OnFocusChangeListenerC7069y1 y1Var6, View$OnFocusChangeListenerC7069y1 y1Var7, View$OnFocusChangeListenerC7069y1 y1Var8, View$OnFocusChangeListenerC7069y1 y1Var9, View$OnFocusChangeListenerC7069y1 y1Var10, C6853c2 c2Var, C6853c2 c2Var2, C6853c2 c2Var3, C6853c2 c2Var4, C6853c2 c2Var5, C6853c2 c2Var6, C6853c2 c2Var7) {
            C6853c2 c2Var8;
            C11529n Dh = c40.this.m35312Dh();
            int Ah = c40.m35318Ah(raVar);
            int e = Dh.mo92e(Ah);
            int e2 = Dh.m124g().mo92e(Ah);
            String Q = C11524j.m222Q(Ah);
            C11510b bVar = (C11510b) raVar.m32847d();
            if (bVar == null) {
                bVar = new C11510b(Dh.mo96a(), Ah, e, e2);
                raVar.m32873G(bVar);
            }
            int f = bVar.m371f();
            int Ch = c40.m35314Ch(Ah, Q);
            if (c2Var2 != null) {
                c2Var2.setBackgroundColorId(Ch);
            }
            if (c2Var3 != null) {
                c2Var3.setBackgroundColorId(Ch);
            }
            float[] h = bVar.m369h();
            if (view != eVar) {
                eVar.m11048e(f, h);
            }
            boolean z = false;
            if (view != aVar) {
                aVar.setHue(h[0]);
            }
            if (view != aVar2) {
                aVar2.setTransparentColor(f);
            }
            m35232x3(y1Var, C1363c0.m37474C(f, false).substring(1), view);
            m35232x3(y1Var2, String.valueOf(Color.red(f)), view);
            m35232x3(y1Var3, String.valueOf(Color.green(f)), view);
            m35232x3(y1Var4, String.valueOf(Color.blue(f)), view);
            m35232x3(y1Var5, String.valueOf(Color.alpha(f)), view);
            if (view == null) {
                y1Var6.setBlockedText(C1363c0.m37474C(e2, false).substring(1));
            }
            if (!(view == y1Var7 || view == y1Var8 || view == y1Var9)) {
                m35232x3(y1Var7, C7389v0.m16641e0(h[0], false), view);
                m35232x3(y1Var8, C7389v0.m16641e0(h[1] * 100.0f, false), view);
                m35232x3(y1Var9, C7389v0.m16641e0(h[2] * 100.0f, false), view);
            }
            m35232x3(y1Var10, C7389v0.m16641e0((Color.alpha(f) / 255.0f) * 100.0f, false), view);
            c2Var.setEnabled(bVar.m376a());
            c2Var2.setEnabled(bVar.m373d());
            c2Var3.setEnabled(bVar.m375b());
            if (view == null) {
                c2Var5.setEnabled(c40.this.m35248kh());
            }
            c2Var6.setEnabled(bVar.m365l());
            if (y1Var.m17912W1() || y1Var.getText().length() <= 0) {
                c2Var8 = c2Var4;
            } else {
                c2Var8 = c2Var4;
                z = true;
            }
            c2Var8.setEnabled(z);
            c2Var7.setEnabled(bVar.m374c());
        }

        @Override
        public void mo18766l(C6853c2 c2Var, boolean z) {
            if (c40.this.m35308Fh()) {
                if ((c2Var.getId() != R.id.btn_colorUndo && c2Var.getId() != R.id.btn_colorRedo) || c40.this.f7754Q0 != c2Var.getParent()) {
                    return;
                }
                if (z) {
                    c40.this.m35247lh();
                } else {
                    c40.this.m35243ph();
                }
            }
        }

        @Override
        public void mo23800m(View view, float f, boolean z) {
            ViewGroup th = c40.m35239th(view);
            if (th != null) {
                C2964ra raVar = (C2964ra) th.getTag();
                C11510b bVar = (C11510b) raVar.m32847d();
                if (bVar != null) {
                    int id2 = view.getId();
                    if (id2 == R.id.color_alphaPalette) {
                        if (!c40.this.m35246mh(raVar, th, view, bVar, C5064d.m24131b((int) (255.0f * f), bVar.m371f()), !z, false)) {
                            this.f7766m0 = true;
                            m34164j2(raVar, -1, th, view);
                            this.f7766m0 = false;
                        }
                    } else if (id2 == R.id.color_huePalette) {
                        if (!c40.this.m35245nh(raVar, th, view, bVar, 0, f * 360.0f, !z, false)) {
                            this.f7766m0 = true;
                            m34164j2(raVar, -1, th, view);
                            this.f7766m0 = false;
                        }
                    }
                }
            }
        }

        @Override
        public void mo23799o(View view, boolean z) {
            c40.this.m35252hi(z, view);
        }

        @Override
        public void mo34131t1(C2139ap apVar, int i, C2964ra raVar, int i2, View view, boolean z) {
            float f;
            float f2;
            int i3;
            int i4;
            super.mo34125v3(apVar, i, 89);
            int Ah = c40.m35318Ah(raVar);
            if (i2 == 2 || i2 == 4 || i2 == 6) {
                ViewGroup viewGroup = (ViewGroup) ((ViewGroup) apVar.f3479a).getChildAt(0);
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    boolean z2 = true;
                    boolean z3 = Ah == R.id.theme_color_controlActive;
                    if (childAt instanceof C7057w) {
                        ((C7057w) childAt).m17933e(z3, false);
                    } else if (childAt instanceof C6985o2) {
                        ((C6985o2) childAt).m18178c(z3, false);
                    } else if (childAt instanceof View$OnFocusChangeListenerC7069y1) {
                        if (Ah == R.id.theme_color_inputInactive) {
                            z2 = false;
                        }
                        View$OnFocusChangeListenerC7069y1 y1Var = (View$OnFocusChangeListenerC7069y1) childAt;
                        y1Var.setAlwaysActive(z2);
                        y1Var.setText(z2 ? C4403w.m27871i1(R.string.Demo) : "");
                        y1Var.getEditText().setForceColorId(z2 ? Ah : 0);
                    } else if (childAt instanceof C6851c0) {
                        C6851c0 c0Var = (C6851c0) childAt;
                        if (c0Var.getId() != Ah) {
                            float f3 = 0.0f;
                            switch (Ah) {
                                case R.id.theme_color_circleButtonChat:
                                    i4 = R.drawable.baseline_arrow_downward_24;
                                    i3 = R.id.theme_color_circleButtonChatIcon;
                                    f2 = 0.0f;
                                    f = 48.0f;
                                    break;
                                case R.id.theme_color_circleButtonNegative:
                                case R.id.theme_color_circleButtonPositive:
                                    int i6 = Ah == R.id.theme_color_circleButtonPositive ? R.id.theme_color_circleButtonPositiveIcon : R.id.theme_color_circleButtonNegativeIcon;
                                    if (Ah == R.id.theme_color_circleButtonNegative) {
                                        f3 = 135.0f;
                                    }
                                    i3 = i6;
                                    f2 = f3;
                                    i4 = R.drawable.baseline_phone_24;
                                    f = 52.0f;
                                    break;
                                case R.id.theme_color_circleButtonNewChannel:
                                    i4 = R.drawable.baseline_bullhorn_24;
                                    i3 = R.id.theme_color_circleButtonNewChannelIcon;
                                    f2 = 0.0f;
                                    f = 40.0f;
                                    break;
                                case R.id.theme_color_circleButtonNewChat:
                                    i4 = R.drawable.baseline_person_24;
                                    i3 = R.id.theme_color_circleButtonNewChatIcon;
                                    f2 = 0.0f;
                                    f = 40.0f;
                                    break;
                                case R.id.theme_color_circleButtonNewGroup:
                                    i4 = R.drawable.baseline_group_24;
                                    i3 = R.id.theme_color_circleButtonNewGroupIcon;
                                    f2 = 0.0f;
                                    f = 40.0f;
                                    break;
                                case R.id.theme_color_circleButtonNewSecret:
                                    i4 = R.drawable.baseline_lock_24;
                                    i3 = R.id.theme_color_circleButtonNewSecretIcon;
                                    f2 = 0.0f;
                                    f = 40.0f;
                                    break;
                                case R.id.theme_color_circleButtonOverlay:
                                    i4 = R.drawable.baseline_backspace_24;
                                    i3 = R.id.theme_color_circleButtonOverlayIcon;
                                    f2 = 0.0f;
                                    f = 46.0f;
                                    break;
                                case R.id.theme_color_circleButtonRegular:
                                    i4 = R.drawable.baseline_create_24;
                                    i3 = R.id.theme_color_circleButtonRegularIcon;
                                    f2 = 0.0f;
                                    f = 52.0f;
                                    break;
                                case R.id.theme_color_circleButtonTheme:
                                    i4 = R.drawable.baseline_palette_24;
                                    i3 = R.id.theme_color_circleButtonThemeIcon;
                                    f2 = 0.0f;
                                    f = 52.0f;
                                    break;
                                case R.id.theme_color_headerButton:
                                    i4 = R.drawable.baseline_create_24;
                                    i3 = R.id.theme_color_headerButtonIcon;
                                    f2 = 0.0f;
                                    f = 52.0f;
                                    break;
                                default:
                                    return;
                            }
                            c0Var.setId(Ah);
                            c0Var.m18790d(i4, f, 4.0f, Ah, i3);
                            c0Var.m18782l(f2, false);
                            int i7 = C1357a0.m37544i(4.0f);
                            int i8 = C1357a0.m37544i(f) + (i7 * 2);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c0Var.getLayoutParams();
                            int i9 = (C1357a0.m37544i(12.0f) - i7) + ((C1357a0.m37544i(56.0f) / 2) - (i8 / 2));
                            if (marginLayoutParams.width != i8 || marginLayoutParams.height != i8 || marginLayoutParams.rightMargin != i9) {
                                marginLayoutParams.height = i8;
                                marginLayoutParams.width = i8;
                                marginLayoutParams.rightMargin = i9;
                                c0Var.setLayoutParams(marginLayoutParams);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

        @Override
        public void mo393t2(C2964ra raVar, int i, C7030t1 t1Var) {
            int i2 = c40.this.m9131x9().f7785b;
            t1Var.m18058E1(C4403w.m27838q2((i2 == 0 || i2 == R.id.theme_category_bubbles || i2 == R.id.theme_category_navigation) ? R.string.xItem : i2 != R.id.theme_category_settings ? R.string.xColors : R.string.xProperty, c40.this.f7748K0));
        }

        @Override
        public void mo34125v3(C2139ap apVar, int i, int i2) {
            c40.this.m35258ei(apVar.f3479a);
            super.mo34125v3(apVar, i, i2);
        }

        public final void m35232x3(View$OnFocusChangeListenerC7069y1 y1Var, CharSequence charSequence, View view) {
            if (view != y1Var && !y1Var.getText().toString().equals(charSequence.toString())) {
                this.f7766m0 = true;
                y1Var.setText(charSequence);
                y1Var.getEditText().setScrollX(0);
                this.f7766m0 = false;
            }
        }
    }

    public class C2227g extends RecyclerView.AbstractC0901o {
        public C2227g() {
        }

        @Override
        public void mo8191i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            C2964ra raVar;
            int F;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int X1 = linearLayoutManager.m39552X1();
            int a2 = linearLayoutManager.m39549a2();
            if (!(X1 == -1 || a2 == -1)) {
                int measuredWidth = recyclerView.getMeasuredWidth();
                View view = null;
                int i = 0;
                for (int i2 = 0; i2 < linearLayoutManager.m39251J(); i2++) {
                    View I = linearLayoutManager.m39254I(i2);
                    if (!(I == null || (raVar = (C2964ra) I.getTag()) == null)) {
                        int top = I.getTop() + ((int) I.getTranslationY());
                        int bottom = I.getBottom() + ((int) I.getTranslationY());
                        if (top > i && (F = C11524j.m244F(view)) != 0) {
                            canvas.drawRect(0.0f, i, measuredWidth, top, C1410y.m37042g(C5064d.m24132a(c40.this.m35235xh(), C11524j.m228N(F))));
                        }
                        if (raVar.m32879A() == 94 && bottom > top) {
                            int Ah = c40.m35318Ah(raVar);
                            canvas.drawRect(0.0f, top, measuredWidth, bottom, C1410y.m37042g(C5064d.m24132a(c40.this.m35235xh(), C11524j.m228N(c40.m35314Ch(Ah, C11524j.m222Q(Ah))))));
                        }
                        view = I;
                        i = bottom;
                    }
                }
            }
        }
    }

    public class C2228h extends RecyclerView.AbstractC0910t {
        public C2228h() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (i == 1 && c40.this.m9300Z9().m9333U9() != null) {
                c40.this.m9300Z9().mo9397La();
                c40.this.mo4347s().m14585H2();
                c40.this.mo4347s().m14482i1();
            }
        }
    }

    public class C2229i implements C4007j.AbstractC4009b {
        public C2229i() {
        }

        @Override
        public void mo9527a(RecyclerView.AbstractC0886d0 d0Var) {
        }

        @Override
        public boolean mo9526b(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i) {
            C2964ra raVar = (C2964ra) d0Var.f3479a.getTag();
            return raVar.m32838j() == R.id.btn_color && c40.m35318Ah(raVar) == R.id.theme_color_fillingNegative;
        }

        @Override
        public float mo9525e() {
            return C4012k.m29331a(this);
        }
    }

    public class C2230j implements AbstractC5139r {
        public C2230j() {
        }

        @Override
        public void mo23819a(View view, Canvas canvas) {
            C5137q.m23835a(this, view, canvas);
        }

        @Override
        public void mo23818b(View view, Canvas canvas) {
            C6918i3.m18466b(canvas, view.getMeasuredWidth() - C1357a0.m37544i(32.0f), view.getMeasuredHeight() / 2, 1.0f, null);
        }
    }

    public class C2231k implements AbstractC5139r {
        public final AbstractC11531p f7776a;

        public C2231k(AbstractC11531p pVar) {
            this.f7776a = pVar;
        }

        @Override
        public void mo23819a(View view, Canvas canvas) {
            C5137q.m23835a(this, view, canvas);
        }

        @Override
        public void mo23818b(View view, Canvas canvas) {
            int i;
            int i2 = C1357a0.m37544i(122.0f);
            int measuredWidth = (view.getMeasuredWidth() - C1357a0.m37544i(12.0f)) - i2;
            int i3 = C1357a0.m37544i(2.0f);
            float f = measuredWidth;
            float measuredHeight = view.getMeasuredHeight() / 2;
            float f2 = i3;
            canvas.drawLine(f, measuredHeight, measuredWidth + i2, measuredHeight, C1410y.m37056Y(this.f7776a.mo92e(R.id.theme_color_seekEmpty), f2));
            canvas.drawLine(f, measuredHeight, (i * 2) + measuredWidth, measuredHeight, C1410y.m37056Y(this.f7776a.mo92e(R.id.theme_color_seekReady), f2));
            float f3 = measuredWidth + (i2 / 3);
            canvas.drawLine(f, measuredHeight, f3, measuredHeight, C1410y.m37056Y(this.f7776a.mo92e(R.id.theme_color_seekDone), f2));
            canvas.drawCircle(f3, measuredHeight, C1357a0.m37544i(6.0f), C1410y.m37042g(this.f7776a.mo92e(R.id.theme_color_seekDone)));
        }
    }

    public class C2232l implements AbstractC5139r {
        public C2232l() {
        }

        @Override
        public void mo23819a(View view, Canvas canvas) {
            C5137q.m23835a(this, view, canvas);
        }

        @Override
        public void mo23818b(View view, Canvas canvas) {
            int i = C1357a0.m37544i(4.0f);
            int i2 = C1357a0.m37544i(2.5f);
            int measuredWidth = view.getMeasuredWidth() - C1357a0.m37544i(18.0f);
            int measuredHeight = view.getMeasuredHeight() / 2;
            int i3 = 0;
            while (i3 < 6) {
                int i4 = measuredWidth - i2;
                canvas.drawCircle(i4, measuredHeight, i2, C1410y.m37042g(C11524j.m228N(i3 == 5 ? R.id.theme_color_introSectionActive : R.id.theme_color_introSection)));
                measuredWidth = i4 - (i2 + i);
                i3++;
            }
        }
    }

    public class C2233m implements AbstractC5139r {
        public String f7779a;
        public int f7780b;
        public Drawable f7781c;
        public final AbstractC11531p f7782d;

        public C2233m(AbstractC11531p pVar) {
            this.f7782d = pVar;
        }

        @Override
        public void mo23819a(View view, Canvas canvas) {
            C5137q.m23835a(this, view, canvas);
        }

        @Override
        public void mo23818b(View view, Canvas canvas) {
            int i;
            int i2;
            int measuredWidth;
            int i3;
            Drawable drawable;
            TextPaint c0 = C1410y.m37049c0(14.0f, -1);
            if (this.f7779a == null) {
                String i1 = C4403w.m27871i1(R.string.Demo);
                this.f7779a = i1;
                this.f7780b = (int) C7389v0.m16680T1(i1, c0);
                this.f7781c = C1362c.m37486f(R.drawable.baseline_close_18);
            }
            int i4 = C1357a0.m37544i(16.0f);
            int i5 = C1357a0.m37544i(7.0f);
            RectF a0 = C1410y.m37053a0();
            int measuredWidth2 = (view.getMeasuredWidth() - C1357a0.m37544i(12.0f)) - ((((i4 * 2) + i5) + this.f7780b) + C1357a0.m37544i(10.0f));
            int measuredHeight = (view.getMeasuredHeight() / 2) - i4;
            canvas.drawRect(measuredWidth2 - ((measuredWidth - measuredWidth2) - i2), 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), C1410y.m37042g(this.f7782d.mo92e(R.id.theme_color_headerBackground)));
            int i6 = measuredHeight + i4;
            a0.set(measuredWidth2, measuredHeight, i2 + measuredWidth2, i6 + i4);
            float f = i4;
            canvas.drawRoundRect(a0, f, f, C1410y.m37042g(this.f7782d.mo92e(R.id.theme_color_headerRemoveBackground)));
            canvas.drawCircle(i4 + measuredWidth2, i6, f, C1410y.m37042g(this.f7782d.mo92e(R.id.theme_color_headerRemoveBackgroundHighlight)));
            C1362c.m37490b(canvas, this.f7781c, i3 - (drawable.getMinimumWidth() / 2), i6 - (this.f7781c.getMinimumHeight() / 2), C1410y.m37058W(-1));
            canvas.drawText(this.f7779a, measuredWidth2 + i + i5, i6 + C1357a0.m37544i(5.0f), c0);
        }
    }

    public static class C2234n {
        public final C11533r f7784a;
        public int f7785b;
        public s30 f7786c;

        public C2234n(C11533r rVar, int i) {
            this.f7784a = rVar;
            this.f7785b = i;
        }

        public C2234n m35228d(s30 s30Var) {
            this.f7786c = s30Var;
            return this;
        }
    }

    public static class C2235o implements AbstractC5139r {
        public final C11529n f7787a;
        public final int f7788b;
        public boolean f7789c;
        public AbstractC5139r f7790d;
        public int f7791e;
        public int f7792f;
        public int f7793g = R.id.theme_color_white;
        public C5386e f7794h;
        public float f7795i;
        public Drawable f7796j;
        public Path f7797k;
        public Drawable[] f7798l;
        public boolean f7799m;
        public boolean f7800n;
        public Paint f7801o;
        public int f7802p;
        public int f7803q;
        public C5375a f7804r;

        public C2235o(C11529n nVar, int i) {
            this.f7787a = nVar;
            this.f7788b = i;
            m35220j();
        }

        @Override
        public void mo23819a(View view, Canvas canvas) {
            AbstractC5139r rVar = this.f7790d;
            if (rVar != null) {
                rVar.mo23819a(view, canvas);
            }
        }

        @Override
        public void mo23818b(View view, Canvas canvas) {
            Drawable[] drawableArr;
            Paint paint;
            Paint paint2;
            Drawable drawable;
            AbstractC5139r rVar = this.f7790d;
            if (rVar != null) {
                rVar.mo23818b(view, canvas);
            }
            boolean h = this.f7787a.m123h(this.f7788b, true);
            if (h || this.f7789c) {
                canvas.drawCircle(C1357a0.m37544i(8.0f), (view.getMeasuredHeight() / 2) - C1357a0.m37544i(9.0f), C1357a0.m37544i(3.0f), C1410y.m37042g(this.f7787a.mo92e(h ? R.id.theme_color_iconActive : R.id.theme_color_iconLight)));
            }
            int i = 0;
            if (this.f7792f != 0) {
                int J0 = C9903a.m6659J0(1);
                int measuredWidth = (view.getMeasuredWidth() - J0) - C1357a0.m37544i(12.0f);
                int measuredHeight = view.getMeasuredHeight() / 2;
                if (this.f7791e != 0) {
                    canvas.drawRect((measuredWidth - J0) - C1357a0.m37544i(12.0f), 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), C1410y.m37042g(this.f7787a.mo92e(this.f7791e)));
                }
                float f = measuredWidth;
                canvas.drawCircle(f, measuredHeight, J0, C1410y.m37042g(this.f7787a.mo92e(this.f7792f)));
                if (this.f7796j != null) {
                    int N = C11524j.m228N(this.f7793g);
                    if (this.f7802p != N || (paint2 = this.f7801o) == null) {
                        Paint paint3 = this.f7801o;
                        this.f7802p = N;
                        paint2 = C1410y.m37050c(paint3, N);
                        this.f7801o = paint2;
                    }
                    C1362c.m37490b(canvas, this.f7796j, measuredWidth - (drawable.getMinimumWidth() / 2), measuredHeight - (this.f7796j.getMinimumHeight() / 2), paint2);
                } else {
                    C5386e eVar = this.f7794h;
                    if (eVar != null) {
                        TextPaint G0 = C1410y.m37074G0(20.0f, eVar.f17712b, false);
                        int color = G0.getColor();
                        G0.setColor(C11524j.m228N(R.id.theme_color_avatar_content));
                        canvas.drawText(this.f7794h.f17711a, f - (this.f7795i / 2.0f), measuredHeight + C1357a0.m37544i(7.0f), G0);
                        G0.setColor(color);
                    } else if (this.f7797k != null) {
                        C1359b.m37502t(canvas, measuredWidth, measuredHeight, C1357a0.m37544i(13.0f), this.f7797k, 0.0f, 0.0f, 0.0f, -1);
                    }
                }
                if (this.f7800n) {
                    C1359b.m37505q(canvas, (view.getMeasuredWidth() - C9903a.m6659J0(1)) - C1357a0.m37544i(12.0f), view.getMeasuredHeight() / 2, C9903a.m6659J0(1), 1.0f);
                }
            }
            if (this.f7804r != null) {
                this.f7804r.m23040d(canvas, (view.getMeasuredWidth() - C1357a0.m37544i(18.0f)) - C1357a0.m37544i(12.0f), view.getMeasuredHeight() / 2, 3, 1.0f);
            }
            if (this.f7798l != null) {
                int measuredWidth2 = view.getMeasuredWidth() - C1357a0.m37544i(18.0f);
                Drawable[] drawableArr2 = this.f7798l;
                int length = drawableArr2.length;
                while (i < length) {
                    Drawable drawable2 = drawableArr2[i];
                    int minimumWidth = measuredWidth2 - drawable2.getMinimumWidth();
                    int N2 = C11524j.m228N(this.f7788b);
                    int measuredHeight2 = (view.getMeasuredHeight() / 2) - (drawable2.getMinimumHeight() / 2);
                    int minimumWidth2 = drawable2.getMinimumWidth();
                    int minimumHeight = drawable2.getMinimumHeight();
                    if (this.f7803q != 0) {
                        RectF a0 = C1410y.m37053a0();
                        float f2 = minimumWidth;
                        a0.left = f2;
                        float f3 = minimumWidth + minimumWidth2;
                        a0.right = f3;
                        float f4 = measuredHeight2;
                        a0.top = f4;
                        drawableArr = drawableArr2;
                        float f5 = measuredHeight2 + minimumHeight;
                        a0.bottom = f5;
                        float f6 = minimumWidth2 / 2;
                        a0.left = f2 - f6;
                        a0.right = f3 + f6;
                        float f7 = minimumHeight / 2;
                        a0.top = f4 - f7;
                        a0.bottom = f5 + f7;
                        canvas.drawRoundRect(a0, C1357a0.m37544i(3.0f), C1357a0.m37544i(3.0f), C1410y.m37042g(this.f7787a.mo92e(this.f7803q)));
                    } else {
                        drawableArr = drawableArr2;
                    }
                    if (this.f7802p != N2 || (paint = this.f7801o) == null) {
                        Paint paint4 = this.f7801o;
                        this.f7802p = N2;
                        paint = C1410y.m37050c(paint4, N2);
                        this.f7801o = paint;
                    }
                    C1362c.m37490b(canvas, drawable2, minimumWidth, measuredHeight2, paint);
                    measuredWidth2 = minimumWidth - C1357a0.m37544i(6.0f);
                    i++;
                    drawableArr2 = drawableArr;
                }
            }
        }

        public void m35220j() {
            this.f7789c = C4868i.m24727c2().m24786U1(C11541z.m41T(this.f7787a.mo96a()), this.f7788b);
        }

        public void m35219k(int i, int i2) {
            this.f7792f = i;
            this.f7796j = i2 != 0 ? C1362c.m37486f(i2) : null;
        }

        public void m35218l(int i, String str) {
            this.f7792f = i;
            m35214p(str);
        }

        public void m35217m(int i) {
            C5375a b = new C5375a.C5377b().m23022b();
            this.f7804r = b;
            b.m23027u(i, this.f7788b == R.id.theme_color_badgeMuted, false);
        }

        public void m35216n(boolean z) {
            this.f7789c = z;
        }

        public void m35215o(int... iArr) {
            this.f7798l = new Drawable[iArr.length];
            int i = 0;
            for (int i2 : iArr) {
                this.f7798l[i] = C1362c.m37486f(i2);
                i++;
            }
        }

        public void m35214p(String str) {
            if (str != null) {
                C5386e eVar = new C5386e(str);
                this.f7794h = eVar;
                this.f7795i = C1410y.m37011v0(eVar, 20.0f);
                return;
            }
            this.f7794h = null;
            this.f7795i = 0.0f;
        }

        public void m35213q(AbstractC5139r rVar) {
            this.f7790d = rVar;
        }

        public void m35212r() {
            Path path = new Path();
            this.f7797k = path;
            C1359b.m37520b(path, C1357a0.m37544i(13.0f), -1.0f, 0.0f);
        }
    }

    public c40(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static int m35318Ah(C2964ra raVar) {
        return (int) raVar.m32835m();
    }

    public static int m35314Ch(int i, String str) {
        int yh = m35234yh(i, str);
        return yh != R.id.theme_color_black ? yh : R.id.theme_color_filling;
    }

    public static boolean m35306Gh(int i) {
        switch (i) {
            case R.id.theme_color_badge:
            case R.id.theme_color_bubbleIn_progress:
            case R.id.theme_color_bubbleIn_textLink:
            case R.id.theme_color_bubbleIn_textLinkPressHighlight:
            case R.id.theme_color_bubbleOut_background:
            case R.id.theme_color_bubbleOut_chatVerticalLine:
            case R.id.theme_color_bubbleOut_file:
            case R.id.theme_color_bubbleOut_inlineIcon:
            case R.id.theme_color_bubbleOut_inlineOutline:
            case R.id.theme_color_bubbleOut_inlineText:
            case R.id.theme_color_bubbleOut_messageAuthor:
            case R.id.theme_color_bubbleOut_messageAuthorPsa:
            case R.id.theme_color_bubbleOut_progress:
            case R.id.theme_color_bubbleOut_textLink:
            case R.id.theme_color_bubbleOut_textLinkPressHighlight:
            case R.id.theme_color_bubbleOut_ticks:
            case R.id.theme_color_bubbleOut_time:
            case R.id.theme_color_bubbleOut_waveformActive:
            case R.id.theme_color_bubbleOut_waveformInactive:
            case R.id.theme_color_chatListAction:
            case R.id.theme_color_chatListVerify:
            case R.id.theme_color_chatSendButton:
            case R.id.theme_color_checkActive:
            case R.id.theme_color_circleButtonRegular:
            case R.id.theme_color_circleButtonTheme:
            case R.id.theme_color_controlActive:
            case R.id.theme_color_file:
            case R.id.theme_color_fillingPositive:
            case R.id.theme_color_headerBackground:
            case R.id.theme_color_headerBarCallActive:
            case R.id.theme_color_iconActive:
            case R.id.theme_color_inlineIcon:
            case R.id.theme_color_inlineOutline:
            case R.id.theme_color_inlineText:
            case R.id.theme_color_inputActive:
            case R.id.theme_color_messageAuthor:
            case R.id.theme_color_messageAuthorPsa:
            case R.id.theme_color_messageSelection:
            case R.id.theme_color_messageSwipeBackground:
            case R.id.theme_color_messageVerticalLine:
            case R.id.theme_color_notification:
            case R.id.theme_color_notificationPlayer:
            case R.id.theme_color_online:
            case R.id.theme_color_passcode:
            case R.id.theme_color_playerButtonActive:
            case R.id.theme_color_profileSectionActive:
            case R.id.theme_color_profileSectionActiveContent:
            case R.id.theme_color_progress:
            case R.id.theme_color_promo:
            case R.id.theme_color_seekDone:
            case R.id.theme_color_seekReady:
            case R.id.theme_color_sliderActive:
            case R.id.theme_color_textLink:
            case R.id.theme_color_textLinkPressHighlight:
            case R.id.theme_color_textNeutral:
            case R.id.theme_color_textSearchQueryHighlight:
            case R.id.theme_color_textSelectionHighlight:
            case R.id.theme_color_ticks:
            case R.id.theme_color_togglerActive:
            case R.id.theme_color_togglerActiveBackground:
            case R.id.theme_color_unread:
            case R.id.theme_color_unreadText:
            case R.id.theme_color_waveformActive:
            case R.id.theme_color_waveformInactive:
                return true;
            default:
                return false;
        }
    }

    public boolean m35304Hh(int i, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        float f;
        if (str.equals("true")) {
            f = 1.0f;
        } else if (str.equals("false")) {
            f = 0.0f;
        } else {
            try {
                f = Float.parseFloat(str);
            } catch (Throwable unused) {
                return false;
            }
        }
        return m35264bi(i, f);
    }

    public void m35302Ih(RecyclerView.AbstractC0896m mVar) {
        m31305kg().setItemAnimator(mVar);
    }

    public void m35300Jh() {
        m9298Zb();
    }

    public boolean m35298Kh(int i, C2964ra raVar, ViewGroup viewGroup, View view, C11510b bVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        try {
            int Vh = m35276Vh(str);
            if (Color.alpha(Vh) != 255 || i != this.f7750M0) {
                return false;
            }
            m35246mh(raVar, viewGroup, view, bVar, C5064d.m24130c(Vh, bVar.m371f()), false, false);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean m35296Lh(int i, C11510b bVar, C2964ra raVar, ViewGroup viewGroup, View view, View view2, int i2) {
        if (i2 != R.id.btn_done || i != this.f7750M0 || !bVar.m372e() || m35246mh(raVar, viewGroup, view, bVar, bVar.m371f(), false, true)) {
            return true;
        }
        viewGroup.findViewById(R.id.btn_colorUndo).setEnabled(bVar.m373d());
        viewGroup.findViewById(R.id.btn_colorRedo).setEnabled(bVar.m375b());
        viewGroup.findViewById(R.id.btn_colorClear).setEnabled(bVar.m376a());
        m35240sh(bVar.m370g());
        return true;
    }

    public boolean m35294Mh(int i, C11510b bVar, C2964ra raVar, ViewGroup viewGroup, View view, View view2, int i2) {
        if (i2 != R.id.btn_done || i != this.f7750M0 || !bVar.m362o() || m35246mh(raVar, viewGroup, view, bVar, bVar.m371f(), false, true)) {
            return true;
        }
        viewGroup.findViewById(R.id.btn_colorUndo).setEnabled(bVar.m373d());
        viewGroup.findViewById(R.id.btn_colorRedo).setEnabled(bVar.m375b());
        viewGroup.findViewById(R.id.btn_colorClear).setEnabled(bVar.m376a());
        return true;
    }

    public void m35292Nh(String str, int i, List list, AbstractC5919k kVar) {
        if (!m9347Sa() && C5070i.m24068c(this.f7747J0, str)) {
            if (this.f7750M0 != -1) {
                m35237vh();
            }
            this.f7748K0 = i;
            this.f7741D0.m34119x2(list, false);
            ((LinearLayoutManager) m31305kg().getLayoutManager()).m39525z2(0, 0);
            if (kVar != null) {
                kVar.mo3250a(i);
            }
        }
    }

    public void m35290Oh(final String str, final AbstractC5919k kVar) {
        final ArrayList arrayList = new ArrayList();
        final int ih = m35251ih(arrayList, m35312Dh().mo96a(), str);
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                c40.this.m35292Nh(str, ih, arrayList, kVar);
            }
        });
    }

    public void m35288Ph(int i, float f, float f2, C3950k kVar) {
        boolean z = false;
        for (int i2 = 0; i2 < m31305kg().getChildCount(); i2++) {
            m35258ei(m31305kg().getChildAt(i2));
        }
        C7368l D = C11524j.m248D(get());
        if (D != null) {
            D.m16762c(1.0f - f);
        }
        if (f > 0.0f) {
            z = true;
        }
        m35254gi(z);
        m31305kg().invalidate();
    }

    public static boolean m35284Rh(int i, boolean z, String str) {
        if (C5070i.m24062i(str)) {
            return true;
        }
        String d0 = z ? C11524j.m192d0(i) : C11524j.m222Q(i);
        String lowerCase = d0.toLowerCase();
        if (lowerCase.startsWith(str)) {
            return true;
        }
        int i2 = 0;
        while (i2 < d0.length()) {
            int codePointAt = d0.codePointAt(i2);
            if (Character.isUpperCase(codePointAt) && lowerCase.startsWith(str, i2)) {
                return true;
            }
            i2 += Character.charCount(codePointAt);
        }
        return C1363c0.m37416t(d0, str);
    }

    public static boolean m35282Sh(int i, int i2) {
        return (i == R.id.theme_color_caption_textLink && i2 == R.id.theme_color_caption_textLinkPressHighlight) ? false : true;
    }

    public static int m35278Uh(String str) {
        if (str.endsWith("%")) {
            return m35274Wh(str);
        }
        float parseFloat = Float.parseFloat(str);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return (int) (parseFloat * 255.0f);
        }
        throw new IllegalArgumentException();
    }

    public static int m35274Wh(String str) {
        int i;
        if (str.endsWith("%")) {
            i = (int) ((Integer.parseInt(str.substring(0, str.length() - 1)) / 100.0f) * 255.0f);
        } else {
            i = Integer.parseInt(str);
        }
        if (i <= 255 && i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static ViewGroup m35239th(View view) {
        while (!(view.getTag() instanceof C2964ra)) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        if (((C2964ra) view.getTag()).m32879A() == 94) {
            return (ViewGroup) view;
        }
        return null;
    }

    public static int m35234yh(int i, String str) {
        switch (i) {
            case R.id.theme_color_background:
            case R.id.theme_color_background_icon:
            case R.id.theme_color_background_text:
            case R.id.theme_color_background_textLight:
                return R.id.theme_color_background;
            case R.id.theme_color_caption_textLink:
            case R.id.theme_color_caption_textLinkPressHighlight:
                return R.id.theme_color_black;
            case R.id.theme_color_iv_preBlockBackground:
            case R.id.theme_color_iv_textCodeBackground:
                return i;
            default:
                return R.id.theme_color_filling;
        }
    }

    public final int m35316Bh() {
        ClipboardManager clipboardManager = (ClipboardManager) this.f30168a.getSystemService("clipboard");
        if (clipboardManager == null) {
            throw new IllegalStateException();
        } else if (!clipboardManager.hasPrimaryClip() || !clipboardManager.getPrimaryClipDescription().hasMimeType("text/plain")) {
            throw new IllegalStateException();
        } else {
            CharSequence text = clipboardManager.getPrimaryClip().getItemAt(0).getText();
            if (text == null || text.length() > 256) {
                throw new IllegalArgumentException();
            }
            String lowerCase = text.toString().trim().toLowerCase();
            int indexOf = lowerCase.indexOf(58);
            if (indexOf != -1) {
                lowerCase = lowerCase.substring(indexOf + 1).trim();
            }
            return m35276Vh(lowerCase);
        }
    }

    public final C11529n m35312Dh() {
        return (C11529n) m9131x9().f7784a.m108e();
    }

    @Override
    public boolean mo9450E8() {
        return false;
    }

    public boolean m35310Eh(int i) {
        int sh = m35240sh(i);
        if (sh == -1) {
            return false;
        }
        if (this.f7750M0 != sh) {
            m35256fi(sh, i, false);
        }
        ((LinearLayoutManager) m31305kg().getLayoutManager()).m39525z2(this.f7750M0, 0);
        return true;
    }

    public final boolean m35308Fh() {
        C3940f fVar = this.f7752O0;
        return fVar != null && fVar.m29585h();
    }

    @Override
    public View mo8869G9() {
        return this.f7744G0;
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        if (this.f7745H0) {
            View$OnClickListenerC9170d1.m10069a4(this.f7744G0, C1357a0.m37544i(68.0f), C1357a0.m37544i(49.0f));
        }
    }

    @Override
    public void mo9417Id(AbstractC9323v4<?> v4Var) {
        super.mo9417Id(v4Var);
        C2546iq iqVar = this.f7741D0;
        if (iqVar != null) {
            iqVar.m34253A2(m9300Z9(), false);
        }
    }

    @Override
    public void mo419J(int i, View view) {
        if (!this.f7745H0 || i != R.id.menu_btn_clear) {
            super.mo419J(i, view);
        } else {
            ((HeaderEditText) this.f7744G0).setText("");
        }
    }

    @Override
    public void mo137J4(int i, int i2, float f, boolean z) {
        if (!this.f7749L0) {
            this.f7741D0.m34130t3(i2);
        }
    }

    @Override
    public int mo9398L9() {
        return this.f7745H0 ? R.id.theme_color_filling : super.mo9398L9();
    }

    @Override
    public int mo9375O9() {
        return this.f7745H0 ? R.id.theme_color_icon : super.mo9375O9();
    }

    @Override
    public int mo9360Q9() {
        return this.f7745H0 ? R.id.theme_color_text : super.mo9360Q9();
    }

    public final CharSequence m35286Qh(int i) {
        CharSequence Y = C1363c0.m37452Y(C4403w.m27871i1(i));
        TdApi.TextEntity[] C0 = C7321e.m17014C0(Y.toString());
        if (C0 != null) {
            ArrayList arrayList = new ArrayList();
            for (TdApi.TextEntity textEntity : C0) {
                if (textEntity.type.getConstructor() == 934535013) {
                    int i2 = textEntity.offset;
                    arrayList.add(new C2221c(Y.subSequence(i2 + 1, i2 + textEntity.length).toString()));
                    arrayList.add(new C5132o(null, R.id.theme_color_textLink).m23853j(textEntity.type).m23845r(true));
                }
                if (!arrayList.isEmpty()) {
                    if (!(Y instanceof SpannableStringBuilder)) {
                        Y = new SpannableStringBuilder(Y);
                    }
                    for (Object obj : arrayList) {
                        int i3 = textEntity.offset;
                        ((SpannableStringBuilder) Y).setSpan(obj, i3, textEntity.length + i3, 33);
                    }
                    arrayList.clear();
                }
            }
        }
        return Y;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_themeColors;
    }

    public final p038ce.C2964ra m35280Th(p364zd.AbstractC11531p r22, int r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.c40.m35280Th(zd.p, int, boolean):ce.ra");
    }

    public final int m35276Vh(String str) {
        boolean z;
        String trim = str.trim();
        if (C5070i.m24062i(trim)) {
            throw new IllegalArgumentException();
        } else if (trim.startsWith("#")) {
            return C5064d.m24126g(trim.substring(1), false);
        } else {
            int i = 0;
            while (true) {
                if (i >= trim.length()) {
                    z = false;
                    break;
                }
                int codePointAt = trim.codePointAt(i);
                if ((codePointAt < 97 || codePointAt > 122) && ((codePointAt < 65 || codePointAt > 90) && ((codePointAt < 48 || codePointAt > 57) && codePointAt != 95))) {
                    z = true;
                    break;
                }
                i += Character.charCount(codePointAt);
            }
            if (!z) {
                int W = C11524j.m210W("theme_color_" + trim);
                if (W != 0) {
                    try {
                        return m35312Dh().mo92e(W);
                    } catch (Throwable unused) {
                    }
                }
                return C5064d.m24126g(trim, true);
            }
            if (this.f7743F0 == null) {
                this.f7743F0 = Pattern.compile("^(?:\\s+)?([A-Za-z]{0,3}[Aa]?)(?:\\s+)?\\((?:\\s+)?([\\d.]+%?)(?:\\s+)?,(?:\\s+)?([\\d.]+%?)(?:\\s+)?,(?:\\s+)?([\\d.]+%?)(?:\\s+)?(?:,(?:\\s+)?([\\d.]+%?)(?:\\s+)?)?\\)(?:\\s+)?$");
            }
            Matcher matcher = this.f7743F0.matcher(trim);
            if (matcher.find()) {
                int groupCount = matcher.groupCount();
                if (groupCount >= 5) {
                    String lowerCase = matcher.group(1).toLowerCase();
                    String group = matcher.group(2);
                    String group2 = matcher.group(3);
                    String group3 = matcher.group(4);
                    String group4 = groupCount > 5 ? matcher.group(5) : null;
                    int Uh = group4 != null ? m35278Uh(group4) : 255;
                    lowerCase.hashCode();
                    if (lowerCase.equals("hsl")) {
                        float parseFloat = Float.parseFloat(group);
                        if (group2.endsWith("%")) {
                            group2 = group2.substring(0, group2.length() - 1);
                        }
                        float parseFloat2 = Float.parseFloat(group2) / 100.0f;
                        if (group3.endsWith("%")) {
                            group3 = group3.substring(0, group3.length() - 1);
                        }
                        float[] fArr = this.f7742E0;
                        fArr[0] = parseFloat;
                        fArr[1] = parseFloat2;
                        fArr[2] = Float.parseFloat(group3) / 100.0f;
                        return Color.HSVToColor(Uh, fArr);
                    } else if (lowerCase.equals("rgb")) {
                        return Color.argb(Uh, m35274Wh(group), m35274Wh(group2), m35274Wh(group3));
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @Override
    public int mo418W9() {
        if (this.f7745H0) {
            return R.id.menu_clear;
        }
        return 0;
    }

    public final void m35272Xh(final View view, boolean z) {
        final ViewGroup th = m35239th(view);
        if (th != null) {
            final C2964ra raVar = (C2964ra) th.getTag();
            final C11510b bVar = (C11510b) raVar.m32847d();
            if (bVar != null) {
                final int i = this.f7750M0;
                if (z) {
                    m9261ee(C4403w.m27850n2(R.string.ColorClearAll, bVar.m367j(false), C4403w.m27845p(), C11524j.m222Q(bVar.m370g())), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{C4403w.m27846o2(R.string.ColorClearDone, bVar.m367j(false)), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i2) {
                            boolean Lh;
                            Lh = c40.this.m35296Lh(i, bVar, raVar, th, view, view2, i2);
                            return Lh;
                        }

                        @Override
                        public boolean mo492Q() {
                            return C5115g0.m23936a(this);
                        }

                        @Override
                        public Object mo491b2(int i2) {
                            return C5115g0.m23935b(this, i2);
                        }
                    });
                } else {
                    m9261ee(C4403w.m27855m1(R.string.ColorRemove, C11524j.m222Q(bVar.m370g())), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.ColorRemoveDone), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i2) {
                            boolean Mh;
                            Mh = c40.this.m35294Mh(i, bVar, raVar, th, view, view2, i2);
                            return Mh;
                        }

                        @Override
                        public boolean mo492Q() {
                            return C5115g0.m23936a(this);
                        }

                        @Override
                        public Object mo491b2(int i2) {
                            return C5115g0.m23935b(this, i2);
                        }
                    });
                }
            }
        }
    }

    public final void m35270Yh(int i) {
        int i2 = i + 1;
        if (this.f7741D0.m34243F0().get(i2).m32879A() == 93) {
            i = i2;
        }
        this.f7741D0.m34207V1(i + 1, 1);
        C11510b bVar = (C11510b) this.f7751N0.m32847d();
        if (bVar != null) {
            m35268Zh(this.f7751N0, bVar);
        }
        this.f7751N0 = null;
        if (m9300Z9().m9333U9() != null) {
            m9300Z9().mo9397La();
            mo4347s().m14585H2();
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C2964ra raVar = this.f7751N0;
        if (raVar != null) {
            m35268Zh(this.f7751N0, (C11510b) raVar.m32847d());
        }
    }

    public final void m35268Zh(C2964ra raVar, C11510b bVar) {
        if (bVar.m359r(bVar.m371f(), true)) {
            m35266ai(bVar, false);
        }
    }

    public final void m35266ai(C11510b bVar, boolean z) {
        C11529n Dh = m35312Dh();
        int g = bVar.m370g();
        int e = Dh.mo92e(g);
        int f = bVar.m371f();
        int T = C11541z.m41T(Dh.mo96a());
        Integer valueOf = bVar.m364m() ? null : Integer.valueOf(f);
        if (!z) {
            if (bVar.m360q(bVar.m368i())) {
                LevelDB W = C4868i.m24727c2().m24774W();
                C4868i.m24727c2().m24605r4(T, g, valueOf);
                C4868i.m24727c2().m24621p4(T, g, bVar.m368i());
                W.apply();
            } else {
                C4868i.m24727c2().m24605r4(T, g, valueOf);
            }
        }
        if (e != f) {
            Dh.m121j(g, valueOf);
            C11541z.m7t().m52K(Dh.mo96a(), bVar, z);
            if (!m9347Sa()) {
                m35250ii(g, false);
            }
        } else if (!z) {
            C11541z.m7t().m52K(Dh.mo96a(), bVar, false);
            m35240sh(g);
        }
        switch (g) {
            case R.id.theme_color_background:
            case R.id.theme_color_filling:
            case R.id.theme_color_iv_preBlockBackground:
            case R.id.theme_color_iv_textCodeBackground:
                m31305kg().invalidate();
                return;
            default:
                return;
        }
    }

    public final boolean m35264bi(int i, float f) {
        boolean z = false;
        if ((i == R.id.theme_property_wallpaperId && !this.f30170b.m2712Oe().m2012l((int) f)) || !C11541z.m64A(i, f)) {
            return false;
        }
        C11529n Dh = m35312Dh();
        float d = Dh.mo93d(i);
        Float valueOf = (d != f || i == R.id.theme_property_parentTheme) ? Float.valueOf(f) : null;
        Dh.m118m(i, valueOf);
        C4868i.m24727c2().m24589t4(C11541z.m41T(Dh.mo96a()), i, valueOf);
        if (i == R.id.theme_property_dark) {
            C10536ab.m4667o1().m4688i0(Dh.mo96a(), f == 1.0f, Dh.m124g().mo96a());
        }
        C11541z.m7t().m51L(Dh.mo96a(), i, f, d);
        if (i == R.id.theme_property_dark) {
            AbstractView$OnTouchListenerC7889a s = mo4347s();
            if (f == 1.0f) {
                z = true;
            }
            s.m14587H0(z);
        }
        if (i == R.id.theme_property_wallpaperId) {
            this.f30170b.m2712Oe().m2004t(Dh.mo96a());
        }
        return true;
    }

    public void m35262ci(final String str, final AbstractC5919k kVar) {
        this.f7747J0 = str;
        if (this.f7741D0 != null) {
            C4383l.m28061a().m28060b(new Runnable() {
                @Override
                public final void run() {
                    c40.this.m35290Oh(str, kVar);
                }
            });
        }
    }

    public void m35260di(C2234n nVar) {
        super.m9476Ad(nVar);
        this.f7745H0 = nVar.f7786c != null;
    }

    public final void m35258ei(View view) {
        if (view != null) {
            float xh = m35235xh();
            if (view != this.f7753P0) {
                view.setAlpha(xh);
                return;
            }
            float f = (0.3f * xh) + 0.7f;
            if (view instanceof C8872e) {
                view.setAlpha(f);
            } else {
                view.setAlpha(1.0f);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    View view2 = this.f7754Q0;
                    if (childAt == view2) {
                        childAt.setAlpha(view2 instanceof C8872e ? f : 1.0f);
                    } else if (childAt != null) {
                        childAt.setAlpha(xh);
                    }
                }
            }
        }
    }

    public final void m35256fi(int i, int i2, boolean z) {
        int i3 = this.f7750M0;
        if (i3 != i) {
            if (i3 != -1) {
                m35270Yh(i3);
                if (i != -1 && i > this.f7750M0) {
                    i--;
                }
            }
            this.f7750M0 = i;
            if (i != -1) {
                mo4347s().m14585H2();
                m35255gh(i, i2, z);
                s30 uh = m35238uh();
                if (uh != null) {
                    uh.m32044Dg(this, i2);
                }
            }
        } else if (i != -1) {
            m35270Yh(i);
            this.f7750M0 = -1;
        }
    }

    public final void m35255gh(int i, int i2, boolean z) {
        int i3 = i + 1;
        int i4 = this.f7741D0.m34243F0().get(i3).m32879A() == 93 ? 2 : 1;
        List<C2964ra> F0 = this.f7741D0.m34243F0();
        int i5 = i + i4;
        C2964ra N = new C2964ra(94).m32866N(i2);
        this.f7751N0 = N;
        F0.add(i5, N);
        this.f7741D0.m39311M(i5, 1);
        if (z) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) m31305kg().getLayoutManager();
            View C = linearLayoutManager.mo39265C(i);
            int i6 = 0;
            if (C == null || C.getTop() >= 0) {
                int W = C2139ap.m35482W(94);
                int i7 = -1;
                for (int i8 = i5 + 1; i8 < this.f7741D0.m34243F0().size() && i7 == -1; i8++) {
                    int A = this.f7741D0.m34243F0().get(i8).m32879A();
                    try {
                        i6 += C2139ap.m35482W(A);
                        switch (A) {
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                                break;
                            default:
                                if (A > -1) {
                                    continue;
                                }
                                break;
                        }
                        i7 = i8;
                    } catch (Throwable unused) {
                    }
                }
                if (i7 != -1) {
                    W += i6;
                }
                if (i4 != 1) {
                    C = linearLayoutManager.mo39265C(i3);
                }
                if (C == null || C.getBottom() + W > m31305kg().getMeasuredHeight()) {
                    linearLayoutManager.m39525z2(i5, m31305kg().getMeasuredHeight() - W);
                    return;
                }
                return;
            }
            linearLayoutManager.m39525z2(i, 0);
        }
    }

    public final void m35254gi(boolean z) {
        if (this.f7755R0 != z) {
            this.f7755R0 = z;
            if (z) {
                m9300Z9().m9284bc().m9768C();
            } else {
                m9300Z9().m9284bc().m9690w();
            }
            m9387Md(z);
        }
    }

    public final int m35253hh(List<C2964ra> list, int i, int i2, int i3, int[] iArr, boolean z, String str, boolean z2, List<Integer> list2) {
        if (list2 != null) {
            C5062b.m24160m(list2, list2.size() + iArr.length);
        }
        int length = iArr.length;
        int i4 = 0;
        int i5 = i2;
        boolean z3 = true;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            int i9 = iArr[i6];
            if (list2 != null) {
                list2.add(Integer.valueOf(i9));
            }
            if (m35249jh(i, i9, z) && m35284Rh(i9, z, str)) {
                i7++;
                int e = C4411y.m27781e(i9);
                if (z3) {
                    if (i5 != 0 && !list.isEmpty()) {
                        list.add(new C2964ra(list.isEmpty() ? 70 : 8, i4, i4, i5));
                        i5 = 0;
                    }
                    if (z2 && !list.isEmpty()) {
                        list.add(new C2964ra(2));
                    }
                    z3 = false;
                } else if (z2 && (i8 == 0 || m35282Sh(i8, i9))) {
                    list.add(new C2964ra(11));
                }
                list.add(m35280Th(m9131x9().f7784a.m108e(), i9, z));
                if (e != 0) {
                    list.add(new C2964ra(93, 0, 0, m35286Qh(e), false).m32846d0(R.id.theme_color_textLight));
                }
                i8 = i9;
            }
            i6++;
            i4 = 0;
        }
        if (!z3) {
            if (z2) {
                list.add(new C2964ra(3));
            }
            if (i3 != 0) {
                list.add(new C2964ra(9, 0, 0, C1363c0.m37452Y(C4403w.m27871i1(i3)), false));
            }
        }
        return i7;
    }

    public final void m35252hi(boolean z, View view) {
        m35247lh();
        s30 uh = m35238uh();
        if (uh != null && uh.m32041Gg()) {
            if (this.f7752O0 == null) {
                this.f7752O0 = new C3940f(0, new C3950k.AbstractC3952b() {
                    @Override
                    public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                        c40.this.m35288Ph(i, f, f2, kVar);
                    }

                    @Override
                    public void mo35Y0(int i, float f, C3950k kVar) {
                        C3953l.m29528a(this, i, f, kVar);
                    }
                }, C2057b.f7280b, 180L);
            }
            if (z) {
                this.f7753P0 = m35239th(view);
                this.f7754Q0 = view;
            }
            m31305kg().m14159K1(z, false);
            uh.m8848kg().setPagingEnabled(!z);
            this.f7752O0.m29577p(z, true);
        }
    }

    public final int m35251ih(List<C2964ra> list, int i, String str) {
        int i2 = m9131x9().f7785b;
        ArrayList arrayList = (i2 == R.id.theme_category_other || i2 == R.id.theme_category_main || (i2 == 0 && !C5070i.m24062i(str))) ? new ArrayList() : null;
        if (i2 == R.id.theme_category_main) {
            list.add(new C2964ra(14));
            list.add(new C2964ra(9, 0, 0, R.string.ThemeCategoryAccent_info));
        }
        int hh = m35253hh(list, R.id.theme_category_content, 0, 0, new int[]{R.id.theme_color_filling, R.id.theme_color_separator, R.id.theme_color_fillingPressed, R.id.theme_color_placeholder, R.id.theme_color_previewBackground, R.id.theme_color_overlayFilling, R.id.theme_color_fillingNegative, R.id.theme_color_fillingPositive, R.id.theme_color_fillingPositiveContent}, false, str, true, arrayList) + 0 + m35253hh(list, R.id.theme_category_content, R.string.ThemeSectionText, 0, new int[]{R.id.theme_color_text, R.id.theme_color_textSelectionHighlight, R.id.theme_color_textLight, R.id.theme_color_textSecure, R.id.theme_color_textLink, R.id.theme_color_textLinkPressHighlight, R.id.theme_color_textNeutral, R.id.theme_color_textNegative, R.id.theme_color_textSearchQueryHighlight}, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_content, R.string.ThemeSectionBackground, 0, new int[]{R.id.theme_color_background, R.id.theme_color_background_text, R.id.theme_color_background_textLight, R.id.theme_color_background_icon}, false, str, false, arrayList) + m35253hh(list, R.id.theme_category_content, R.string.ThemeSectionIcons, 0, new int[]{R.id.theme_color_icon, R.id.theme_color_iconLight, R.id.theme_color_iconActive, R.id.theme_color_iconPositive, R.id.theme_color_iconNegative}, false, str, true, arrayList);
        int[] iArr = {R.id.theme_color_headerBackground, R.id.theme_color_headerText, R.id.theme_color_headerIcon};
        int[] iArr2 = {R.id.theme_color_headerLightBackground, R.id.theme_color_headerLightText, R.id.theme_color_headerLightIcon};
        int[] iArr3 = {R.id.theme_color_headerPickerBackground, R.id.theme_color_headerPickerText};
        int[] iArr4 = {R.id.theme_color_headerButton, R.id.theme_color_headerButtonIcon};
        int[] iArr5 = {R.id.theme_color_headerRemoveBackground, R.id.theme_color_headerRemoveBackgroundHighlight};
        int[] iArr6 = {R.id.theme_color_headerBarCallIncoming, R.id.theme_color_headerBarCallActive, R.id.theme_color_headerBarCallMuted};
        int[] iArr7 = {R.id.theme_color_headerPlaceholder, R.id.theme_color_statusBarLegacy, R.id.theme_color_statusBarLegacyContent, R.id.theme_color_statusBar, R.id.theme_color_statusBarContent};
        int[] iArr8 = {R.id.theme_property_lightStatusBar};
        int[] iArr9 = {R.id.theme_color_headerTabActive, R.id.theme_color_headerTabActiveText, R.id.theme_color_headerTabInactiveText};
        int[] iArr10 = {R.id.theme_color_profileSectionActive, R.id.theme_color_profileSectionActiveContent};
        int[] iArr11 = {R.id.theme_color_drawer, R.id.theme_color_drawerText};
        int[] iArr12 = {R.id.theme_color_passcode, R.id.theme_color_passcodeIcon, R.id.theme_color_passcodeText};
        int[] iArr13 = {R.id.theme_color_notification, R.id.theme_color_notificationPlayer, R.id.theme_color_notificationSecure};
        int hh2 = m35253hh(list, R.id.theme_category_navigation, R.string.ThemeCategoryNavigation, 0, iArr, false, str, true, arrayList) + 0;
        int hh3 = hh2 + m35253hh(list, R.id.theme_category_navigation, hh2 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr9, false, str, true, arrayList);
        int hh4 = hh3 + m35253hh(list, R.id.theme_category_navigation, hh3 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr2, false, str, true, arrayList);
        int hh5 = hh4 + m35253hh(list, R.id.theme_category_navigation, hh4 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr3, false, str, true, arrayList);
        int hh6 = hh5 + m35253hh(list, R.id.theme_category_navigation, hh5 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr4, false, str, true, arrayList);
        int hh7 = hh6 + m35253hh(list, R.id.theme_category_navigation, hh6 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr5, false, str, true, arrayList);
        int hh8 = hh7 + m35253hh(list, R.id.theme_category_navigation, hh7 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr6, false, str, true, arrayList);
        int hh9 = hh8 + m35253hh(list, R.id.theme_category_navigation, hh8 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr7, false, str, true, arrayList);
        int hh10 = hh9 + m35253hh(list, R.id.theme_category_navigation, hh9 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr8, true, str, true, arrayList);
        int hh11 = hh10 + m35253hh(list, R.id.theme_category_navigation, hh10 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr10, false, str, true, arrayList);
        int hh12 = hh11 + m35253hh(list, R.id.theme_category_navigation, hh11 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr11, false, str, true, arrayList);
        int hh13 = hh12 + m35253hh(list, R.id.theme_category_navigation, hh12 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr12, false, str, true, arrayList);
        int hh14 = hh + hh13 + m35253hh(list, R.id.theme_category_navigation, hh13 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr13, false, str, true, arrayList);
        int[] iArr14 = {R.id.theme_color_progress};
        int[] iArr15 = {R.id.theme_color_controlInactive, R.id.theme_color_controlActive, R.id.theme_color_controlContent};
        int[] iArr16 = {R.id.theme_color_checkActive, R.id.theme_color_checkContent};
        int[] iArr17 = {R.id.theme_color_sliderActive, R.id.theme_color_sliderInactive};
        int[] iArr18 = {R.id.theme_color_togglerActive, R.id.theme_color_togglerActiveBackground};
        int[] iArr19 = {R.id.theme_color_togglerInactive, R.id.theme_color_togglerInactiveBackground};
        int[] iArr20 = {R.id.theme_color_togglerPositive, R.id.theme_color_togglerPositiveBackground, R.id.theme_color_togglerPositiveContent};
        int[] iArr21 = {R.id.theme_color_togglerNegative, R.id.theme_color_togglerNegativeBackground, R.id.theme_color_togglerNegativeContent};
        int[] iArr22 = {R.id.theme_color_inputInactive, R.id.theme_color_inputActive, R.id.theme_color_inputPositive, R.id.theme_color_inputNegative, R.id.theme_color_textPlaceholder};
        int[] iArr23 = {R.id.theme_color_inlineOutline, R.id.theme_color_inlineText, R.id.theme_color_inlineIcon, R.id.theme_color_inlineContentActive};
        int[] iArr24 = {R.id.theme_color_circleButtonRegular, R.id.theme_color_circleButtonRegularIcon, R.id.theme_color_circleButtonNewChat, R.id.theme_color_circleButtonNewChatIcon, R.id.theme_color_circleButtonNewGroup, R.id.theme_color_circleButtonNewGroupIcon, R.id.theme_color_circleButtonNewChannel, R.id.theme_color_circleButtonNewChannelIcon, R.id.theme_color_circleButtonNewSecret, R.id.theme_color_circleButtonNewSecretIcon, R.id.theme_color_circleButtonPositive, R.id.theme_color_circleButtonPositiveIcon, R.id.theme_color_circleButtonNegative, R.id.theme_color_circleButtonNegativeIcon, R.id.theme_color_circleButtonOverlay, R.id.theme_color_circleButtonOverlayIcon, R.id.theme_color_circleButtonChat, R.id.theme_color_circleButtonChatIcon, R.id.theme_color_circleButtonTheme, R.id.theme_color_circleButtonThemeIcon};
        int[] iArr25 = {R.id.theme_color_online, R.id.theme_color_promo, R.id.theme_color_promoContent};
        int[] iArr26 = {R.id.theme_color_introSectionActive, R.id.theme_color_introSection};
        int hh15 = m35253hh(list, R.id.theme_category_controls, R.string.ThemeCategoryControls, 0, iArr14, false, str, true, arrayList) + 0;
        int hh16 = hh15 + m35253hh(list, R.id.theme_category_controls, hh15 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr15, false, str, true, arrayList);
        int hh17 = hh16 + m35253hh(list, R.id.theme_category_controls, hh16 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr16, false, str, true, arrayList);
        int hh18 = hh17 + m35253hh(list, R.id.theme_category_controls, hh17 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr17, false, str, true, arrayList);
        int hh19 = hh18 + m35253hh(list, R.id.theme_category_controls, hh18 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr18, false, str, true, arrayList);
        int hh20 = hh19 + m35253hh(list, R.id.theme_category_controls, hh19 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr19, false, str, true, arrayList);
        int hh21 = hh20 + m35253hh(list, R.id.theme_category_controls, hh20 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr20, false, str, true, arrayList);
        int hh22 = hh21 + m35253hh(list, R.id.theme_category_controls, hh21 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr21, false, str, true, arrayList);
        int hh23 = hh22 + m35253hh(list, R.id.theme_category_controls, hh22 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr22, false, str, true, arrayList);
        int hh24 = hh23 + m35253hh(list, R.id.theme_category_controls, hh23 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr23, false, str, true, arrayList);
        int hh25 = hh24 + m35253hh(list, R.id.theme_category_controls, hh24 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr24, false, str, true, arrayList);
        int hh26 = hh25 + m35253hh(list, R.id.theme_category_controls, hh25 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr25, false, str, true, arrayList);
        int hh27 = hh14 + hh26 + m35253hh(list, R.id.theme_category_controls, hh26 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr26, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_controls, R.string.ThemeSectionPlayer, 0, new int[]{R.id.theme_color_seekDone, R.id.theme_color_seekReady, R.id.theme_color_seekEmpty, R.id.theme_color_playerButtonActive, R.id.theme_color_playerButton, R.id.theme_color_playerCoverIcon, R.id.theme_color_playerCoverPlaceholder}, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_settings, R.string.ThemeAdvanced, 0, new int[]{R.id.theme_property_parentTheme, R.id.theme_property_bubbleCorner, R.id.theme_property_bubbleCornerMerged, R.id.theme_property_bubbleCornerLegacy, R.id.theme_property_bubbleOutline, R.id.theme_property_bubbleOutlineSize, R.id.theme_property_bubbleDateCorner, R.id.theme_property_bubbleUnreadShadow, R.id.theme_property_lightStatusBar, R.id.theme_property_imageCorner, R.id.theme_property_dateCorner, R.id.theme_property_replaceShadowsWithSeparators, R.id.theme_property_shadowDepth, R.id.theme_property_subtitleAlpha, R.id.theme_property_wallpaperUsageId, R.id.theme_property_wallpaperId, R.id.theme_property_dark, R.id.theme_property_wallpaperOverrideUnread, R.id.theme_property_wallpaperOverrideDate, R.id.theme_property_wallpaperOverrideButton, R.id.theme_property_wallpaperOverrideMediaReply, R.id.theme_property_wallpaperOverrideTime, R.id.theme_property_wallpaperOverrideOverlay}, true, str, true, arrayList) + m35253hh(list, R.id.theme_category_chat, 0, 0, new int[]{R.id.theme_color_chatListAction, R.id.theme_color_chatListMute, R.id.theme_color_chatListIcon, R.id.theme_color_chatListVerify, R.id.theme_color_ticks, R.id.theme_color_ticksRead, R.id.theme_color_badge, R.id.theme_color_badgeText, R.id.theme_color_badgeFailed, R.id.theme_color_badgeFailedText, R.id.theme_color_badgeMuted, R.id.theme_color_badgeMutedText}, false, str, true, arrayList) + 0 + m35253hh(list, R.id.theme_category_chat, 0, 0, new int[]{R.id.theme_color_chatSendButton, R.id.theme_color_chatKeyboard, R.id.theme_color_chatKeyboardButton}, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_chat, 0, 0, new int[]{R.id.theme_color_chatBackground, R.id.theme_color_chatSeparator, R.id.theme_color_unread, R.id.theme_color_unreadText, R.id.theme_color_messageVerticalLine, R.id.theme_color_messageSelection, R.id.theme_color_messageSwipeBackground, R.id.theme_color_messageSwipeContent, R.id.theme_color_messageAuthor, R.id.theme_color_messageAuthorPsa}, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_chat, 0, 0, new int[]{R.id.theme_color_shareSeparator}, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_bubbles, 0, 0, new int[]{R.id.theme_color_bubble_chatBackground, R.id.theme_color_bubble_chatSeparator, R.id.theme_color_bubble_messageSelection, R.id.theme_color_bubble_messageSelectionNoWallpaper, R.id.theme_color_bubble_messageCheckOutline, R.id.theme_color_bubble_messageCheckOutlineNoWallpaper}, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_bubbles, 0, 0, new int[]{R.id.theme_color_bubbleIn_background, R.id.theme_color_bubbleIn_time, R.id.theme_color_bubbleIn_progress, R.id.theme_color_bubbleIn_text, R.id.theme_color_bubbleIn_textLink, R.id.theme_color_bubbleIn_textLinkPressHighlight, R.id.theme_color_bubbleIn_outline, R.id.theme_color_bubbleIn_pressed, R.id.theme_color_bubbleIn_separator}, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_bubbles, 0, 0, new int[]{R.id.theme_color_bubbleOut_background, R.id.theme_color_bubbleOut_ticks, R.id.theme_color_bubbleOut_ticksRead, R.id.theme_color_bubbleOut_time, R.id.theme_color_bubbleOut_progress, R.id.theme_color_bubbleOut_text, R.id.theme_color_bubbleOut_textLink, R.id.theme_color_bubbleOut_textLinkPressHighlight, R.id.theme_color_bubbleOut_messageAuthor, R.id.theme_color_bubbleOut_messageAuthorPsa, R.id.theme_color_bubbleOut_chatVerticalLine, R.id.theme_color_bubbleOut_inlineOutline, R.id.theme_color_bubbleOut_inlineText, R.id.theme_color_bubbleOut_inlineIcon, R.id.theme_color_bubbleOut_waveformActive, R.id.theme_color_bubbleOut_waveformInactive, R.id.theme_color_bubbleOut_file, R.id.theme_color_bubbleOut_outline, R.id.theme_color_bubbleOut_pressed, R.id.theme_color_bubbleOut_separator}, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_bubbles, 0, 0, new int[]{R.id.theme_color_bubble_unread, R.id.theme_color_bubble_unreadText, R.id.theme_color_bubble_date, R.id.theme_color_bubble_dateText, R.id.theme_color_bubble_button, R.id.theme_color_bubble_buttonRipple, R.id.theme_color_bubble_buttonText, R.id.theme_color_bubble_mediaReply, R.id.theme_color_bubble_mediaReplyText, R.id.theme_color_bubble_mediaTime, R.id.theme_color_bubble_mediaTimeText, R.id.theme_color_bubble_mediaOverlay, R.id.theme_color_bubble_mediaOverlayText, R.id.theme_color_bubble_overlay, R.id.theme_color_bubble_overlayText}, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_bubbles, 0, R.string.g_noWallpaper, new int[]{R.id.theme_color_bubble_unread_noWallpaper, R.id.theme_color_bubble_unreadText_noWallpaper, R.id.theme_color_bubble_date_noWallpaper, R.id.theme_color_bubble_dateText_noWallpaper, R.id.theme_color_bubble_button_noWallpaper, R.id.theme_color_bubble_buttonRipple_noWallpaper, R.id.theme_color_bubble_buttonText_noWallpaper, R.id.theme_color_bubble_mediaReply_noWallpaper, R.id.theme_color_bubble_mediaReplyText_noWallpaper, R.id.theme_color_bubble_mediaTime_noWallpaper, R.id.theme_color_bubble_mediaTimeText_noWallpaper, R.id.theme_color_bubble_overlay_noWallpaper, R.id.theme_color_bubble_overlayText_noWallpaper}, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_bubbles, R.string.ThemeAdvanced, 0, new int[]{R.id.theme_property_bubbleCorner, R.id.theme_property_bubbleCornerMerged, R.id.theme_property_bubbleCornerLegacy, R.id.theme_property_bubbleOutline, R.id.theme_property_bubbleOutlineSize, R.id.theme_property_bubbleDateCorner, R.id.theme_property_bubbleUnreadShadow, R.id.theme_property_imageCorner, R.id.theme_property_dateCorner, R.id.theme_property_wallpaperUsageId, R.id.theme_property_wallpaperId, R.id.theme_property_wallpaperOverrideUnread, R.id.theme_property_wallpaperOverrideDate, R.id.theme_property_wallpaperOverrideButton, R.id.theme_property_wallpaperOverrideMediaReply, R.id.theme_property_wallpaperOverrideTime, R.id.theme_property_wallpaperOverrideOverlay}, true, str, true, arrayList) + m35253hh(list, R.id.theme_category_colors, 0, 0, new int[]{R.id.theme_color_avatar_content, R.id.theme_color_avatarArchive, R.id.theme_color_avatarArchivePinned, R.id.theme_color_avatarSavedMessages, R.id.theme_color_avatarSavedMessages_big, R.id.theme_color_avatarReplies, R.id.theme_color_avatarReplies_big, R.id.theme_color_avatarInactive, R.id.theme_color_avatarInactive_big, R.id.theme_color_nameInactive, R.id.theme_color_avatarRed, R.id.theme_color_avatarRed_big, R.id.theme_color_nameRed, R.id.theme_color_avatarOrange, R.id.theme_color_avatarOrange_big, R.id.theme_color_nameOrange, R.id.theme_color_avatarYellow, R.id.theme_color_avatarYellow_big, R.id.theme_color_nameYellow, R.id.theme_color_avatarGreen, R.id.theme_color_avatarGreen_big, R.id.theme_color_nameGreen, R.id.theme_color_avatarCyan, R.id.theme_color_avatarCyan_big, R.id.theme_color_nameCyan, R.id.theme_color_avatarBlue, R.id.theme_color_avatarBlue_big, R.id.theme_color_nameBlue, R.id.theme_color_avatarViolet, R.id.theme_color_avatarViolet_big, R.id.theme_color_nameViolet, R.id.theme_color_avatarPink, R.id.theme_color_avatarPink_big, R.id.theme_color_namePink}, false, str, true, arrayList) + 0;
        int[] iArr27 = {R.id.theme_color_file, R.id.theme_color_fileYellow, R.id.theme_color_fileGreen, R.id.theme_color_fileRed};
        int[] iArr28 = {R.id.theme_color_waveformActive, R.id.theme_color_waveformInactive};
        int hh28 = m35253hh(list, R.id.theme_category_colors, R.string.ThemeSectionMedia, 0, iArr27, false, str, true, arrayList) + 0;
        int hh29 = hh27 + hh28 + m35253hh(list, R.id.theme_category_colors, hh28 == 0 ? R.string.ThemeSectionMedia : 0, 0, iArr28, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_colors, R.string.ThemeSectionAttach, 0, new int[]{R.id.theme_color_attachPhoto, R.id.theme_color_attachFile, R.id.theme_color_attachLocation, R.id.theme_color_attachContact, R.id.theme_color_attachInlineBot, R.id.theme_color_attachText, R.id.theme_color_fileAttach}, false, str, true, arrayList) + m35253hh(list, R.id.theme_category_iv, R.string.ThemeCategoryIV, 0, new int[]{R.id.theme_color_iv_pageTitle, R.id.theme_color_iv_pageSubtitle, R.id.theme_color_iv_text, R.id.theme_color_iv_textLink, R.id.theme_color_iv_textLinkPressHighlight, R.id.theme_color_iv_textMarked, R.id.theme_color_iv_textMarkedBackground, R.id.theme_color_iv_textMarkedLink, R.id.theme_color_iv_textMarkedLinkPressHighlight, R.id.theme_color_iv_textReference, R.id.theme_color_iv_textReferenceBackground, R.id.theme_color_iv_textReferenceBackgroundPressed, R.id.theme_color_iv_textReferenceOutline, R.id.theme_color_iv_textReferenceOutlinePressed, R.id.theme_color_iv_textCode, R.id.theme_color_iv_pageAuthor, R.id.theme_color_iv_caption, R.id.theme_color_iv_pageFooter, R.id.theme_color_iv_header, R.id.theme_color_iv_pullQuote, R.id.theme_color_iv_blockQuote, R.id.theme_color_iv_blockQuoteLine, R.id.theme_color_iv_preBlockBackground, R.id.theme_color_iv_textCodeBackground, R.id.theme_color_iv_textCodeBackgroundPressed, R.id.theme_color_iv_separator, R.id.theme_color_ivHeaderIcon, R.id.theme_color_ivHeader}, false, str, true, arrayList);
        int hh30 = m35253hh(list, R.id.theme_category_other, R.string.ThemeCategoryOther, R.string.ThemeSectionRadios_info, new int[]{R.id.theme_color_themeClassic, R.id.theme_color_themeBlue, R.id.theme_color_themeRed, R.id.theme_color_themeOrange, R.id.theme_color_themeGreen, R.id.theme_color_themePink, R.id.theme_color_themeCyan, R.id.theme_color_themeNightBlue, R.id.theme_color_themeNightBlack, R.id.theme_color_themeBlackWhite, R.id.theme_color_themeWhiteBlack}, false, str, true, arrayList);
        int hh31 = hh30 + m35253hh(list, R.id.theme_category_other, hh30 == 0 ? R.string.ThemeCategoryOther : 0, R.string.ThemeSectionWP_info, new int[]{R.id.theme_color_wp_cats, R.id.theme_color_wp_catsPink, R.id.theme_color_wp_catsGreen, R.id.theme_color_wp_catsOrange, R.id.theme_color_wp_catsBeige, R.id.theme_color_wp_circlesBlue}, false, str, true, arrayList);
        int hh32 = hh31 + m35253hh(list, R.id.theme_category_other, hh31 == 0 ? R.string.ThemeCategoryOther : 0, 0, new int[]{R.id.theme_color_sectionedScrollBar, R.id.theme_color_sectionedScrollBarActive, R.id.theme_color_sectionedScrollBarActiveContent}, false, str, true, arrayList);
        int hh33 = hh29 + hh32 + m35253hh(list, R.id.theme_category_other, hh32 == 0 ? R.string.ThemeCategoryOther : 0, 0, new int[]{R.id.theme_color_snackbarUpdate, R.id.theme_color_snackbarUpdateAction, R.id.theme_color_snackbarUpdateText}, false, str, true, arrayList);
        int[] iArr29 = {R.id.theme_color_caption_textLink, R.id.theme_color_caption_textLinkPressHighlight, R.id.theme_color_videoSliderActive, R.id.theme_color_videoSliderInactive, R.id.theme_color_white, R.id.theme_color_black, R.id.theme_color_transparentEditor};
        int[] iArr30 = {R.id.theme_color_photoShadowTint1, R.id.theme_color_photoShadowTint2, R.id.theme_color_photoShadowTint3, R.id.theme_color_photoShadowTint4, R.id.theme_color_photoShadowTint5, R.id.theme_color_photoShadowTint6, R.id.theme_color_photoShadowTint7, R.id.theme_color_photoHighlightTint1, R.id.theme_color_photoHighlightTint2, R.id.theme_color_photoHighlightTint3, R.id.theme_color_photoHighlightTint4, R.id.theme_color_photoHighlightTint5, R.id.theme_color_photoHighlightTint6, R.id.theme_color_photoHighlightTint7};
        int[] iArr31 = {R.id.theme_color_ledBlue, R.id.theme_color_ledOrange, R.id.theme_color_ledYellow, R.id.theme_color_ledGreen, R.id.theme_color_ledCyan, R.id.theme_color_ledRed, R.id.theme_color_ledPurple, R.id.theme_color_ledPink, R.id.theme_color_ledWhite};
        int hh34 = m35253hh(list, R.id.theme_category_internal, R.string.ThemeCategoryInternal, 0, iArr29, false, str, true, arrayList) + 0;
        int hh35 = hh34 + m35253hh(list, R.id.theme_category_internal, hh34 == 0 ? R.string.ThemeCategoryInternal : 0, 0, iArr30, false, str, true, arrayList);
        int hh36 = hh33 + hh35 + m35253hh(list, R.id.theme_category_internal, hh35 == 0 ? R.string.ThemeCategoryInternal : 0, 0, iArr31, false, str, true, arrayList);
        if (arrayList != null) {
            Set<Integer> b = C11527m.m131b();
            b.removeAll(arrayList);
            if (!b.isEmpty()) {
                int[] iArr32 = new int[b.size()];
                int i3 = 0;
                for (Integer num : b) {
                    iArr32[i3] = num.intValue();
                    i3++;
                }
                hh36 += m35253hh(list, R.id.theme_category_other, R.string.ThemeSectionUnsorted, 0, iArr32, false, str, true, arrayList);
            }
        }
        list.add(new C2964ra(42));
        return hh36;
    }

    public void m35250ii(int i, boolean z) {
        C2964ra raVar;
        int I0;
        int sh = m35240sh(i);
        if (sh != -1) {
            this.f7741D0.m34127u3(sh);
            if (z && this.f7750M0 != -1 && m35318Ah(this.f7741D0.m34243F0().get(this.f7750M0)) == i && (raVar = this.f7751N0) != null && (I0 = this.f7741D0.m34237I0(raVar, this.f7750M0)) != -1) {
                View C = m31305kg().getLayoutManager().mo39265C(I0);
                if (C instanceof ViewGroup) {
                    this.f7741D0.m34164j2(this.f7751N0, -1, (ViewGroup) C, null);
                }
            }
        }
    }

    public final boolean m35249jh(int i, int i2, boolean z) {
        C2234n x9 = m9131x9();
        return x9.f7785b == 0 || x9.f7785b == i || (!z && x9.f7785b == R.id.theme_category_main && m35306Gh(i2));
    }

    public final boolean m35248kh() {
        try {
            m35316Bh();
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        } catch (Throwable unused2) {
            Log.m14709w("Some error with Clipboard API", new Object[0]);
            return false;
        }
    }

    public final void m35247lh() {
        AbstractRunnableC5910b bVar = this.f7756S0;
        if (bVar != null) {
            bVar.m21858c();
            this.f7756S0 = null;
        }
    }

    public final boolean m35246mh(C2964ra raVar, ViewGroup viewGroup, View view, C11510b bVar, int i, boolean z, boolean z2) {
        if (bVar.m359r(i, !z)) {
            m35266ai(bVar, z);
            if (m9347Sa()) {
                return true;
            }
            this.f7741D0.m34164j2(raVar, -1, viewGroup, view);
            return true;
        } else if (!z2) {
            return false;
        } else {
            m35266ai(bVar, z);
            return false;
        }
    }

    public final boolean m35245nh(C2964ra raVar, ViewGroup viewGroup, View view, C11510b bVar, int i, float f, boolean z, boolean z2) {
        if (bVar.m358s(i, f, !z)) {
            m35266ai(bVar, z);
            if (m9347Sa()) {
                return true;
            }
            this.f7741D0.m34164j2(raVar, -1, viewGroup, view);
            return true;
        } else if (!z2) {
            return false;
        } else {
            m35266ai(bVar, z);
            return false;
        }
    }

    public final void m35244oh(int i, boolean z, boolean z2) {
        if (i != -1) {
            AbstractC5139r f = this.f7741D0.m34243F0().get(i).m32843f();
            if (!(f instanceof C2235o)) {
                return;
            }
            if (z) {
                ((C2235o) f).m35220j();
            } else {
                ((C2235o) f).m35216n(z2);
            }
        }
    }

    @Override
    public void onClick(final View view) {
        final ViewGroup th;
        if (!m35308Fh() || view.getId() == R.id.btn_colorUndo || view.getId() == R.id.btn_colorRedo) {
            C2964ra raVar = (C2964ra) view.getTag();
            int id2 = view.getId();
            if (id2 != R.id.btn_color) {
                if (id2 == R.id.btn_property) {
                    int Ah = m35318Ah(raVar);
                    if (C11541z.m5v(Ah)) {
                        C9137c cVar = (C9137c) view;
                        C9139d toggler = cVar.getToggler();
                        if (toggler != null) {
                            this.f7749L0 = true;
                            if (m35264bi(Ah, toggler.isEnabled() ? 0.0f : 1.0f)) {
                                this.f7741D0.mo394V2(raVar, cVar, true);
                            }
                            this.f7749L0 = false;
                            return;
                        }
                        return;
                    }
                    m35241rh(Ah);
                } else if (raVar == null && (th = m35239th(view)) != null) {
                    final C2964ra raVar2 = (C2964ra) th.getTag();
                    final C11510b bVar = (C11510b) raVar2.m32847d();
                    if (bVar != null) {
                        final int i = this.f7750M0;
                        int id3 = view.getId();
                        switch (id3) {
                            case R.id.btn_colorCalculate:
                                m9364Pc(C4403w.m27871i1(R.string.ThemeCalcTitle), C4403w.m27871i1(R.string.ThemeCalcHint), R.string.ThemeCalcSave, R.string.Cancel, C1363c0.m37474C(m35312Dh().mo92e(R.id.theme_color_filling), false), new AbstractC9323v4.AbstractC9336m() {
                                    @Override
                                    public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                                        boolean Kh;
                                        Kh = c40.this.m35298Kh(i, raVar2, th, view, bVar, y1Var, str);
                                        return Kh;
                                    }
                                }, true);
                                return;
                            case R.id.btn_colorClear:
                                m35272Xh(view, !bVar.m373d());
                                return;
                            case R.id.btn_colorCopy:
                                int f = bVar.m371f();
                                C1379j0.m37328i(C11524j.m222Q(bVar.m370g()) + ": " + m35233zh(f, true), R.string.CopiedColor);
                                return;
                            case R.id.btn_colorFormatHex:
                            case R.id.btn_colorFormatHsl:
                            case R.id.btn_colorFormatRgb:
                            default:
                                return;
                            case R.id.btn_colorPaste:
                                try {
                                    int Bh = m35316Bh();
                                    if (bVar.m371f() != Bh) {
                                        bVar.m361p();
                                    }
                                    m35246mh(raVar2, th, view, bVar, Bh, false, false);
                                    return;
                                } catch (Throwable unused) {
                                    return;
                                }
                            case R.id.btn_colorRedo:
                            case R.id.btn_colorUndo:
                                if ((id3 == R.id.btn_colorUndo ? bVar.m357t() : bVar.m363n()) && !m35246mh(raVar2, th, view, bVar, bVar.m371f(), false, false)) {
                                    this.f7741D0.m34164j2(raVar2, -1, th, view);
                                }
                                ViewGroup viewGroup = (ViewGroup) view.getParent();
                                s30 uh = m35238uh();
                                if (uh != null && uh.m32041Gg()) {
                                    if (!m35308Fh() || this.f7754Q0 == viewGroup) {
                                        m35252hi(true, viewGroup);
                                        m35243ph();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case R.id.btn_colorSave:
                                if (bVar.m361p()) {
                                    view.setEnabled(false);
                                    return;
                                }
                                return;
                        }
                    }
                }
            } else if (this.f7745H0) {
                m9131x9().f7786c.m32042Fg(m35318Ah(raVar));
                mo9397La();
                this.f30170b.m2485dd().postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        c40.this.m35300Jh();
                    }
                }, 120L);
            } else {
                m35242qh(m31305kg().m39424k0(view), m35318Ah(raVar));
            }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() != R.id.btn_colorClear) {
            return false;
        }
        m35272Xh(view, true);
        return true;
    }

    @Override
    public void onPrimaryClipChanged() {
        int I0;
        C6853c2 c2Var;
        C2964ra raVar = this.f7751N0;
        if (raVar != null && (I0 = this.f7741D0.m34237I0(raVar, this.f7750M0)) != -1) {
            C2964ra raVar2 = this.f7741D0.m34243F0().get(I0);
            View C = m31305kg().getLayoutManager().mo39265C(I0);
            if ((C instanceof ViewGroup) && C.getTag() == raVar2 && (c2Var = (C6853c2) C.findViewById(R.id.btn_colorPaste)) != null) {
                c2Var.setEnabled(m35248kh());
            }
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (!this.f7745H0 || i != R.id.menu_clear) {
            super.mo414p0(i, d1Var, linearLayout);
        } else {
            d1Var.m10090S1(linearLayout, this);
        }
    }

    public final void m35243ph() {
        m35247lh();
        this.f7756S0 = new C2222d();
        this.f30170b.m2485dd().postDelayed(this.f7756S0, 1500L);
    }

    public final void m35242qh(int i, int i2) {
        m35256fi(i, i2, true);
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        C2234n nVar = (C2234n) m9131x9();
        if (nVar.f7785b == R.id.theme_category_settings) {
            C9289s sVar = new C9289s(context);
            sVar.setThemedTextColor(this);
            sVar.m9631D1(0, true);
            sVar.setTitle(nVar.f7784a.m109d());
            sVar.setSubtitle(R.string.ThemeAdvanced);
            this.f7744G0 = sVar;
        } else if (this.f7745H0) {
            HeaderEditText F2 = View$OnClickListenerC9170d1.m10121F2(customRecyclerView, this);
            F2.setHint(C4403w.m27871i1(m9368P8(mo9224ka(), F2, true, false)));
            F2.addTextChangedListener(new C2223e());
            mo9438Fd(F2, true);
            this.f7744G0 = F2;
        }
        C2224f fVar = new C2224f(this, context);
        this.f7741D0 = fVar;
        fVar.m34241F2(this);
        if (!this.f7745H0) {
            this.f7741D0.m34253A2(m9300Z9(), false);
        }
        customRecyclerView.m39437g(new C2227g());
        customRecyclerView.m39425k(new C2228h());
        List<C2964ra> arrayList = new ArrayList<>();
        this.f7748K0 = m35251ih(arrayList, nVar.f7784a.m110c(), this.f7747J0);
        this.f7741D0.m34119x2(arrayList, false);
        arrayList.add(new C2964ra(4, R.id.theme_color_filling));
        customRecyclerView.setItemAnimator(this.f7745H0 ? null : new C8731d(C2057b.f7280b, 120L));
        customRecyclerView.setAdapter(this.f7741D0);
        C4007j.m29344a(customRecyclerView, new C2229i());
    }

    public final void m35241rh(final int i) {
        C11529n Dh = m35312Dh();
        float d = Dh.mo93d(i);
        String e0 = C7389v0.m16641e0(Dh.m124g().mo93d(i), true);
        if (i == R.id.theme_property_parentTheme) {
            e0 = null;
        }
        m9372Oc(C4403w.m27871i1(R.string.ThemeAdvancedEdit), C11524j.m192d0(i), R.string.Save, R.string.Cancel, C7389v0.m16641e0(d, true), e0, new AbstractC9323v4.AbstractC9336m() {
            @Override
            public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                boolean Hh;
                Hh = c40.this.m35304Hh(i, y1Var, str);
                return Hh;
            }
        }, true, null, null);
    }

    public final int m35240sh(int i) {
        if (this.f7750M0 == -1 || m35318Ah(this.f7741D0.m34243F0().get(this.f7750M0)) != i) {
            int R0 = this.f7741D0.m34218R0(i);
            m35244oh(R0, true, false);
            return R0;
        }
        C11510b bVar = (C11510b) this.f7751N0.m32847d();
        if (bVar != null) {
            m35244oh(this.f7750M0, false, bVar.m366k());
        } else {
            m35244oh(this.f7750M0, true, false);
        }
        return this.f7750M0;
    }

    public final s30 m35238uh() {
        AbstractC9323v4<?> Z9 = m9300Z9();
        if (Z9 instanceof s30) {
            return (s30) Z9;
        }
        return null;
    }

    public void m35237vh() {
        C2964ra raVar = this.f7751N0;
        if (raVar != null) {
            m35236wh(((C11510b) raVar.m32847d()).m370g());
        }
    }

    public void m35236wh(int i) {
        C2964ra raVar = this.f7751N0;
        if (raVar != null && ((C11510b) raVar.m32847d()).m370g() == i) {
            final RecyclerView.AbstractC0896m itemAnimator = m31305kg().getItemAnimator();
            if (itemAnimator != null) {
                m31305kg().setItemAnimator(null);
            }
            m35256fi(-1, i, true);
            if (itemAnimator != null) {
                this.f30170b.m2485dd().postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        c40.this.m35302Ih(itemAnimator);
                    }
                }, 100L);
            }
        }
    }

    public final float m35235xh() {
        C3940f fVar = this.f7752O0;
        if (fVar != null) {
            return 1.0f - fVar.m29586g();
        }
        return 1.0f;
    }

    public final String m35233zh(int i, boolean z) {
        Color.colorToHSV(i, this.f7742E0);
        int v0 = C4868i.m24727c2().m24577v0();
        float[] fArr = this.f7742E0;
        return C1363c0.m37475B(v0, fArr[0], fArr[1], fArr[2], i, z);
    }
}
