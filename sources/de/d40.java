package de;

import ae.p;
import ae.z;
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
import ce.a0;
import ce.j0;
import ce.y;
import eb.k;
import eb.l;
import ed.j;
import hd.t2;
import ie.g0;
import ie.h0;
import ie.q;
import ie.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.a;
import me.vkryl.android.widget.FrameLayoutFix;
import me.vkryl.leveldb.LevelDB;
import ne.b2;
import ne.c0;
import ne.c2;
import ne.i3;
import ne.n2;
import ne.o2;
import ne.t1;
import ne.w;
import ne.y1;
import oc.v0;
import od.p1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import org.thunderdog.challegram.v.HeaderEditText;
import ud.d1;
import ud.s;
import ud.v4;
import vc.n4;
import zd.o6;
import zd.ya;

public class d40 extends vo<n> implements View.OnClickListener, ClipboardManager.OnPrimaryClipChangedListener, View.OnLongClickListener {
    public iq D0;
    public Pattern F0;
    public View G0;
    public boolean H0;
    public Drawable I0;
    public String J0;
    public int K0;
    public boolean L0;
    public ra N0;
    public eb.f O0;
    public View P0;
    public View Q0;
    public boolean R0;
    public kb.b S0;
    public final float[] E0 = new float[3];
    public int M0 = -1;

    public class a implements r {
        public n4 f7702a;

        public a() {
        }

        @Override
        public void a(View view, Canvas canvas) {
            q.a(this, view, canvas);
        }

        @Override
        public void b(View view, Canvas canvas) {
            int i10 = a0.i(122.0f);
            if (this.f7702a == null) {
                n4 n4Var = new n4(t2.J4(), 1, false);
                this.f7702a = n4Var;
                n4Var.j(i10);
            }
            this.f7702a.f(canvas, 0.5f, (view.getMeasuredWidth() - a0.i(12.0f)) - i10, view.getMeasuredHeight() / 2);
        }
    }

    public class b implements r {
        public n4 f7704a;
        public final p f7705b;

        public b(p pVar) {
            this.f7705b = pVar;
        }

        @Override
        public void a(View view, Canvas canvas) {
            q.a(this, view, canvas);
        }

        @Override
        public void b(View view, Canvas canvas) {
            int i10 = a0.i(122.0f);
            canvas.drawRect((view.getMeasuredWidth() - i10) - (a0.i(12.0f) * 2), 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), y.g(this.f7705b.e(R.id.theme_color_bubbleOut_background)));
            if (this.f7704a == null) {
                n4 n4Var = new n4(t2.J4(), 1, true);
                this.f7704a = n4Var;
                n4Var.j(i10);
            }
            this.f7704a.f(canvas, 0.5f, (view.getMeasuredWidth() - a0.i(12.0f)) - i10, view.getMeasuredHeight() / 2);
        }
    }

    public class c extends ClickableSpan {
        public final String f7707a;

        public c(String str) {
            this.f7707a = str;
        }

        @Override
        public void onClick(View view) {
            d40.this.f24495b.hd().V8(d40.this, this.f7707a, "", true);
        }
    }

    public class d extends kb.b {
        public d() {
        }

        @Override
        public void b() {
            d40.this.hi(false, null);
        }
    }

    public class e implements TextWatcher {
        public e() {
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            d40.this.ci(charSequence.toString().trim().toLowerCase(), null);
            if (d40.this.R != null) {
                d40.this.R.k4(R.id.menu_clear, R.id.menu_btn_clear, charSequence.length() > 0, true);
            }
        }
    }

    public class f extends iq {
        public boolean f7710m0;
        public final Context f7711n0;

        public class a implements p1.a {
            public final int f7713a;

            public a(int i10) {
                this.f7713a = i10;
            }

            @Override
            public boolean A4(p1 p1Var) {
                return true;
            }

            @Override
            public void O2(p1 p1Var, boolean z10) {
                if (!z10) {
                    p1Var.b(Math.round(p1Var.getValue() * (this.f7713a - 1)) / (this.f7713a - 1));
                }
            }

            @Override
            public void Y0(p1 p1Var, float f10) {
            }
        }

        public class b extends y1 {
            public b(Context context) {
                super(context);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return true;
            }
        }

        public f(v4 v4Var, Context context) {
            super(v4Var);
            this.f7711n0 = context;
        }

        @Override
        public void R2(de.ra r8, uc.c r9, boolean r10) {
            throw new UnsupportedOperationException("Method not decompiled: de.d40.f.R2(de.ra, uc.c, boolean):void");
        }

        @Override
        public ap T0(ViewGroup viewGroup, int i10) {
            float f10;
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, -1, 21);
            ap B1 = d40.this.D0.S(viewGroup, 89);
            LinearLayout linearLayout = new LinearLayout(this.f7711n0);
            linearLayout.setGravity(16);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(r12);
            linearLayout.setPadding(a0.i(12.0f), 0, 0, 0);
            switch (i10) {
                case 0:
                    yd.g.i(linearLayout, 0, d40.this);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, c2.c());
                    layoutParams.rightMargin = a0.i(6.0f);
                    c2 c2Var = new c2(this.f7711n0);
                    d40.this.t8(c2Var);
                    c2Var.setText(R.string.Demo);
                    c2Var.g(true, false);
                    c2Var.setLayoutParams(layoutParams);
                    linearLayout.addView(c2Var);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, c2.c());
                    layoutParams2.rightMargin = a0.i(12.0f);
                    c2 c2Var2 = new c2(this.f7711n0);
                    d40.this.t8(c2Var2);
                    c2Var2.setText(R.string.Demo);
                    c2Var2.setForceActive(true);
                    c2Var2.g(true, false);
                    c2Var2.setLayoutParams(layoutParams2);
                    linearLayout.addView(c2Var2);
                    break;
                case 1:
                    for (int i11 = 0; i11 < 4; i11++) {
                        n2 n2Var = new n2(this.f7711n0);
                        d40.this.t8(n2Var);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(a0.i(32.0f), a0.i(64.0f));
                        layoutParams3.rightMargin = a0.i(4.0f);
                        if (i11 == 0) {
                            n2Var.j(1.0f);
                            n2Var.getProgress().y();
                            layoutParams3.width = a0.i(12.0f);
                        } else if (i11 == 1) {
                            n2Var.i(1.0f);
                            layoutParams3.width = a0.i(18.0f);
                        } else if (i11 == 2) {
                            n2Var.f(1.0f);
                            layoutParams3.width = a0.i(22.0f);
                        } else if (i11 == 3) {
                            n2Var.h(1.0f);
                            layoutParams3.rightMargin = a0.i(12.0f);
                            layoutParams3.width = a0.i(42.0f);
                        }
                        n2Var.getProgress().s(true);
                        n2Var.setLayoutParams(layoutParams3);
                        linearLayout.addView(n2Var);
                    }
                    break;
                case 2:
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(a0.i(18.0f), a0.i(18.0f));
                    layoutParams4.rightMargin = a0.i(4.0f);
                    View f11 = w.f(this.f7711n0);
                    d40.this.t8(f11);
                    f11.setLayoutParams(layoutParams4);
                    layoutParams4.gravity = 16;
                    linearLayout.addView(f11);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(a0.i(22.0f), a0.i(22.0f));
                    layoutParams5.gravity = 16;
                    layoutParams5.rightMargin = a0.i(18.0f);
                    View d10 = o2.d(this.f7711n0);
                    d40.this.t8(d10);
                    d10.setLayoutParams(layoutParams5);
                    linearLayout.addView(d10);
                    break;
                case 3:
                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, a0.i(16.0f));
                    layoutParams6.rightMargin = a0.i(18.0f);
                    b2 b2Var = new b2(this.f7711n0);
                    yd.g.i(b2Var, R.id.theme_color_promo, d40.this).e(3.0f);
                    b2Var.setId(R.id.btn_new);
                    b2Var.setSingleLine(true);
                    b2Var.setPadding(a0.i(4.0f), a0.i(1.0f), a0.i(4.0f), 0);
                    b2Var.setTextColor(ae.j.L(R.id.theme_color_promoContent));
                    d40.this.z8(b2Var, R.id.theme_color_promoContent);
                    d40.this.t8(b2Var);
                    b2Var.setTypeface(ce.o.g());
                    b2Var.setTextSize(1, 10.0f);
                    b2Var.setText(gd.w.i1(R.string.New).toUpperCase());
                    b2Var.setLayoutParams(layoutParams6);
                    linearLayout.addView(b2Var);
                    break;
                case 4:
                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(a0.i(82.0f), -2);
                    layoutParams7.rightMargin = a0.i(12.0f);
                    r12.bottomMargin = a0.i(4.0f);
                    b bVar = new b(this.f7711n0);
                    bVar.setHint(R.string.Demo);
                    bVar.getEditText().setEnabled(false);
                    bVar.getEditText().getLayoutParams().height = a0.i(40.0f);
                    bVar.setLayoutParams(layoutParams7);
                    bVar.G1(d40.this);
                    linearLayout.addView(bVar);
                    break;
                case 5:
                    LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(a0.i(122.0f), c2.c());
                    p1 p1Var = new p1(this.f7711n0);
                    d40.this.t8(p1Var);
                    p1Var.h(true, false);
                    p1Var.setValueCount(5);
                    p1Var.setPadding(a0.i(12.0f), 0, a0.i(12.0f), 0);
                    p1Var.setValue(Math.round(0.5f * f10) / 4);
                    p1Var.setListener(new a(5));
                    p1Var.setLayoutParams(layoutParams8);
                    p1Var.setForceBackgroundColorId(R.id.theme_color_sliderInactive);
                    p1Var.g(R.id.theme_color_sliderActive, false);
                    linearLayout.addView(p1Var);
                    break;
                case 6:
                    View c0Var = new c0(this.f7711n0);
                    c0Var.setEnabled(false);
                    d40.this.t8(c0Var);
                    int i12 = a0.i(4.0f);
                    int i13 = i12 * 2;
                    FrameLayout.LayoutParams r13 = FrameLayoutFix.r1((a0.i(23.0f) * 2) + i13, (a0.i(23.0f) * 2) + i13, 85);
                    r13.rightMargin = a0.i(12.0f) - i12;
                    c0Var.setLayoutParams(r13);
                    linearLayout.addView(c0Var);
                    break;
                default:
                    throw new IllegalArgumentException("customViewType == " + i10);
            }
            ((uc.c) B1.f2982a).addView(linearLayout);
            return B1;
        }

        @Override
        public void f2(ra raVar, int i10, ViewGroup viewGroup, View view, td.e eVar, sd.a aVar, sd.a aVar2, y1 y1Var, y1 y1Var2, y1 y1Var3, y1 y1Var4, y1 y1Var5, y1 y1Var6, y1 y1Var7, y1 y1Var8, y1 y1Var9, y1 y1Var10, c2 c2Var, c2 c2Var2, c2 c2Var3, c2 c2Var4, c2 c2Var5, c2 c2Var6, c2 c2Var7) {
            c2 c2Var8;
            ae.n Dh = d40.this.Dh();
            int Ah = d40.Ah(raVar);
            int e10 = Dh.e(Ah);
            int e11 = Dh.g().e(Ah);
            String O = ae.j.O(Ah);
            ae.b bVar = (ae.b) raVar.d();
            if (bVar == null) {
                bVar = new ae.b(Dh.a(), Ah, e10, e11);
                raVar.G(bVar);
            }
            int f10 = bVar.f();
            int Ch = d40.Ch(Ah, O);
            if (c2Var2 != null) {
                c2Var2.setBackgroundColorId(Ch);
            }
            if (c2Var3 != null) {
                c2Var3.setBackgroundColorId(Ch);
            }
            float[] h10 = bVar.h();
            if (view != eVar) {
                eVar.e(f10, h10);
            }
            boolean z10 = false;
            if (view != aVar) {
                aVar.setHue(h10[0]);
            }
            if (view != aVar2) {
                aVar2.setTransparentColor(f10);
            }
            v3(y1Var, ce.c0.C(f10, false).substring(1), view);
            v3(y1Var2, String.valueOf(Color.red(f10)), view);
            v3(y1Var3, String.valueOf(Color.green(f10)), view);
            v3(y1Var4, String.valueOf(Color.blue(f10)), view);
            v3(y1Var5, String.valueOf(Color.alpha(f10)), view);
            if (view == null) {
                y1Var6.setBlockedText(ce.c0.C(e11, false).substring(1));
            }
            if (!(view == y1Var7 || view == y1Var8 || view == y1Var9)) {
                v3(y1Var7, v0.e0(h10[0], false), view);
                v3(y1Var8, v0.e0(h10[1] * 100.0f, false), view);
                v3(y1Var9, v0.e0(h10[2] * 100.0f, false), view);
            }
            v3(y1Var10, v0.e0((Color.alpha(f10) / 255.0f) * 100.0f, false), view);
            c2Var.setEnabled(bVar.a());
            c2Var2.setEnabled(bVar.d());
            c2Var3.setEnabled(bVar.b());
            if (view == null) {
                c2Var5.setEnabled(d40.this.kh());
            }
            c2Var6.setEnabled(bVar.l());
            if (y1Var.V1() || y1Var.getText().length() <= 0) {
                c2Var8 = c2Var4;
            } else {
                c2Var8 = c2Var4;
                z10 = true;
            }
            c2Var8.setEnabled(z10);
            c2Var7.setEnabled(bVar.c());
        }

        @Override
        public void h(c2 c2Var, boolean z10) {
            if (d40.this.Fh()) {
                if ((c2Var.getId() != R.id.btn_colorUndo && c2Var.getId() != R.id.btn_colorRedo) || d40.this.Q0 != c2Var.getParent()) {
                    return;
                }
                if (z10) {
                    d40.this.lh();
                } else {
                    d40.this.ph();
                }
            }
        }

        @Override
        public void j(td.e eVar, boolean z10) {
            d40.this.hi(z10, eVar);
        }

        @Override
        public void m(td.e eVar, float f10, float f11, boolean z10) {
            ViewGroup th = d40.th(eVar);
            if (th != null) {
                ra raVar = (ra) th.getTag();
                ae.b bVar = (ae.b) raVar.d();
                if (bVar != null) {
                    if (bVar.s(2, f11, z10) || bVar.s(1, f10, z10)) {
                        d40.this.ai(bVar, !z10);
                    }
                    this.f7710m0 = true;
                    d2(raVar, -1, th, eVar);
                    this.f7710m0 = false;
                }
            }
        }

        @Override
        public void n(View view, float f10, boolean z10) {
            ViewGroup th = d40.th(view);
            if (th != null) {
                ra raVar = (ra) th.getTag();
                ae.b bVar = (ae.b) raVar.d();
                if (bVar != null) {
                    int id2 = view.getId();
                    if (id2 == R.id.color_alphaPalette) {
                        if (!d40.this.mh(raVar, th, view, bVar, ib.d.b((int) (255.0f * f10), bVar.f()), !z10, false)) {
                            this.f7710m0 = true;
                            d2(raVar, -1, th, view);
                            this.f7710m0 = false;
                        }
                    } else if (id2 == R.id.color_huePalette) {
                        if (!d40.this.nh(raVar, th, view, bVar, 0, f10 * 360.0f, !z10, false)) {
                            this.f7710m0 = true;
                            d2(raVar, -1, th, view);
                            this.f7710m0 = false;
                        }
                    }
                }
            }
        }

        @Override
        public void o2(ra raVar, int i10, t1 t1Var) {
            int i11 = d40.this.x9().f7728b;
            t1Var.B1(gd.w.q2((i11 == 0 || i11 == R.id.theme_category_bubbles || i11 == R.id.theme_category_navigation) ? R.string.xItem : i11 != R.id.theme_category_settings ? R.string.xColors : R.string.xProperty, d40.this.K0));
        }

        @Override
        public void p(View view, boolean z10) {
            d40.this.hi(z10, view);
        }

        @Override
        public void p1(ap apVar, int i10, ra raVar, int i11, View view, boolean z10) {
            float f10;
            float f11;
            int i12;
            int i13;
            super.s3(apVar, i10, 89);
            int Ah = d40.Ah(raVar);
            if (i11 == 2 || i11 == 4 || i11 == 6) {
                ViewGroup viewGroup = (ViewGroup) ((ViewGroup) apVar.f2982a).getChildAt(0);
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    View childAt = viewGroup.getChildAt(i14);
                    boolean z11 = true;
                    boolean z12 = Ah == R.id.theme_color_controlActive;
                    if (childAt instanceof w) {
                        ((w) childAt).e(z12, false);
                    } else if (childAt instanceof o2) {
                        ((o2) childAt).c(z12, false);
                    } else if (childAt instanceof y1) {
                        if (Ah == R.id.theme_color_inputInactive) {
                            z11 = false;
                        }
                        y1 y1Var = (y1) childAt;
                        y1Var.setAlwaysActive(z11);
                        y1Var.setText(z11 ? gd.w.i1(R.string.Demo) : "");
                        y1Var.getEditText().setForceColorId(z11 ? Ah : 0);
                    } else if (childAt instanceof c0) {
                        c0 c0Var = (c0) childAt;
                        if (c0Var.getId() != Ah) {
                            float f12 = 0.0f;
                            switch (Ah) {
                                case R.id.theme_color_circleButtonChat:
                                    i13 = R.drawable.baseline_arrow_downward_24;
                                    i12 = R.id.theme_color_circleButtonChatIcon;
                                    f11 = 0.0f;
                                    f10 = 48.0f;
                                    break;
                                case R.id.theme_color_circleButtonNegative:
                                case R.id.theme_color_circleButtonPositive:
                                    int i15 = Ah == R.id.theme_color_circleButtonPositive ? R.id.theme_color_circleButtonPositiveIcon : R.id.theme_color_circleButtonNegativeIcon;
                                    if (Ah == R.id.theme_color_circleButtonNegative) {
                                        f12 = 135.0f;
                                    }
                                    i12 = i15;
                                    f11 = f12;
                                    i13 = R.drawable.baseline_phone_24;
                                    f10 = 52.0f;
                                    break;
                                case R.id.theme_color_circleButtonNewChannel:
                                    i13 = R.drawable.baseline_bullhorn_24;
                                    i12 = R.id.theme_color_circleButtonNewChannelIcon;
                                    f11 = 0.0f;
                                    f10 = 40.0f;
                                    break;
                                case R.id.theme_color_circleButtonNewChat:
                                    i13 = R.drawable.baseline_person_24;
                                    i12 = R.id.theme_color_circleButtonNewChatIcon;
                                    f11 = 0.0f;
                                    f10 = 40.0f;
                                    break;
                                case R.id.theme_color_circleButtonNewGroup:
                                    i13 = R.drawable.baseline_group_24;
                                    i12 = R.id.theme_color_circleButtonNewGroupIcon;
                                    f11 = 0.0f;
                                    f10 = 40.0f;
                                    break;
                                case R.id.theme_color_circleButtonNewSecret:
                                    i13 = R.drawable.baseline_lock_24;
                                    i12 = R.id.theme_color_circleButtonNewSecretIcon;
                                    f11 = 0.0f;
                                    f10 = 40.0f;
                                    break;
                                case R.id.theme_color_circleButtonOverlay:
                                    i13 = R.drawable.baseline_backspace_24;
                                    i12 = R.id.theme_color_circleButtonOverlayIcon;
                                    f11 = 0.0f;
                                    f10 = 46.0f;
                                    break;
                                case R.id.theme_color_circleButtonRegular:
                                    i13 = R.drawable.baseline_create_24;
                                    i12 = R.id.theme_color_circleButtonRegularIcon;
                                    f11 = 0.0f;
                                    f10 = 52.0f;
                                    break;
                                case R.id.theme_color_circleButtonTheme:
                                    i13 = R.drawable.baseline_palette_24;
                                    i12 = R.id.theme_color_circleButtonThemeIcon;
                                    f11 = 0.0f;
                                    f10 = 52.0f;
                                    break;
                                case R.id.theme_color_headerButton:
                                    i13 = R.drawable.baseline_create_24;
                                    i12 = R.id.theme_color_headerButtonIcon;
                                    f11 = 0.0f;
                                    f10 = 52.0f;
                                    break;
                                default:
                                    return;
                            }
                            c0Var.setId(Ah);
                            c0Var.d(i13, f10, 4.0f, Ah, i12);
                            c0Var.l(f11, false);
                            int i16 = a0.i(4.0f);
                            int i17 = a0.i(f10) + (i16 * 2);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c0Var.getLayoutParams();
                            int i18 = (a0.i(12.0f) - i16) + ((a0.i(56.0f) / 2) - (i17 / 2));
                            if (marginLayoutParams.width != i17 || marginLayoutParams.height != i17 || marginLayoutParams.rightMargin != i18) {
                                marginLayoutParams.height = i17;
                                marginLayoutParams.width = i17;
                                marginLayoutParams.rightMargin = i18;
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
        public void p4(ne.y1 r14, java.lang.CharSequence r15) {
            throw new UnsupportedOperationException("Method not decompiled: de.d40.f.p4(ne.y1, java.lang.CharSequence):void");
        }

        @Override
        public void s3(ap apVar, int i10, int i11) {
            d40.this.ei(apVar.f2982a);
            super.s3(apVar, i10, i11);
        }

        public final void v3(y1 y1Var, CharSequence charSequence, View view) {
            if (view != y1Var && !y1Var.getText().toString().equals(charSequence.toString())) {
                this.f7710m0 = true;
                y1Var.setText(charSequence);
                y1Var.getEditText().setScrollX(0);
                this.f7710m0 = false;
            }
        }
    }

    public class g extends RecyclerView.o {
        public g() {
        }

        @Override
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            ra raVar;
            int D;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int X1 = linearLayoutManager.X1();
            int a22 = linearLayoutManager.a2();
            if (!(X1 == -1 || a22 == -1)) {
                int measuredWidth = recyclerView.getMeasuredWidth();
                View view = null;
                int i10 = 0;
                for (int i11 = 0; i11 < linearLayoutManager.J(); i11++) {
                    View I = linearLayoutManager.I(i11);
                    if (!(I == null || (raVar = (ra) I.getTag()) == null)) {
                        int top = I.getTop() + ((int) I.getTranslationY());
                        int bottom = I.getBottom() + ((int) I.getTranslationY());
                        if (top > i10 && (D = ae.j.D(view)) != 0) {
                            canvas.drawRect(0.0f, i10, measuredWidth, top, y.g(ib.d.a(d40.this.xh(), ae.j.L(D))));
                        }
                        if (raVar.A() == 94 && bottom > top) {
                            int Ah = d40.Ah(raVar);
                            canvas.drawRect(0.0f, top, measuredWidth, bottom, y.g(ib.d.a(d40.this.xh(), ae.j.L(d40.Ch(Ah, ae.j.O(Ah))))));
                        }
                        view = I;
                        i10 = bottom;
                    }
                }
            }
        }
    }

    public class h extends RecyclerView.t {
        public h() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 1 && d40.this.Z9().U9() != null) {
                d40.this.Z9().La();
                d40.this.t().I2();
                d40.this.t().j1();
            }
        }
    }

    public class i implements j.b {
        public i() {
        }

        @Override
        public void a(RecyclerView.c0 c0Var) {
        }

        @Override
        public boolean b(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
            ra raVar = (ra) c0Var.f2982a.getTag();
            return raVar.j() == R.id.btn_color && d40.Ah(raVar) == R.id.theme_color_fillingNegative;
        }

        @Override
        public float e() {
            return ed.k.a(this);
        }
    }

    public class j implements r {
        public j() {
        }

        @Override
        public void a(View view, Canvas canvas) {
            q.a(this, view, canvas);
        }

        @Override
        public void b(View view, Canvas canvas) {
            i3.b(canvas, view.getMeasuredWidth() - a0.i(32.0f), view.getMeasuredHeight() / 2, 1.0f, null);
        }
    }

    public class k implements r {
        public final p f7719a;

        public k(p pVar) {
            this.f7719a = pVar;
        }

        @Override
        public void a(View view, Canvas canvas) {
            q.a(this, view, canvas);
        }

        @Override
        public void b(View view, Canvas canvas) {
            int i10;
            int i11 = a0.i(122.0f);
            int measuredWidth = (view.getMeasuredWidth() - a0.i(12.0f)) - i11;
            int i12 = a0.i(2.0f);
            float f10 = measuredWidth;
            float measuredHeight = view.getMeasuredHeight() / 2;
            float f11 = i12;
            canvas.drawLine(f10, measuredHeight, measuredWidth + i11, measuredHeight, y.Y(this.f7719a.e(R.id.theme_color_seekEmpty), f11));
            canvas.drawLine(f10, measuredHeight, (i10 * 2) + measuredWidth, measuredHeight, y.Y(this.f7719a.e(R.id.theme_color_seekReady), f11));
            float f12 = measuredWidth + (i11 / 3);
            canvas.drawLine(f10, measuredHeight, f12, measuredHeight, y.Y(this.f7719a.e(R.id.theme_color_seekDone), f11));
            canvas.drawCircle(f12, measuredHeight, a0.i(6.0f), y.g(this.f7719a.e(R.id.theme_color_seekDone)));
        }
    }

    public class l implements r {
        public l() {
        }

        @Override
        public void a(View view, Canvas canvas) {
            q.a(this, view, canvas);
        }

        @Override
        public void b(View view, Canvas canvas) {
            int i10 = a0.i(4.0f);
            int i11 = a0.i(2.5f);
            int measuredWidth = view.getMeasuredWidth() - a0.i(18.0f);
            int measuredHeight = view.getMeasuredHeight() / 2;
            int i12 = 0;
            while (i12 < 6) {
                int i13 = measuredWidth - i11;
                canvas.drawCircle(i13, measuredHeight, i11, y.g(ae.j.L(i12 == 5 ? R.id.theme_color_introSectionActive : R.id.theme_color_introSection)));
                measuredWidth = i13 - (i11 + i10);
                i12++;
            }
        }
    }

    public class m implements r {
        public String f7722a;
        public int f7723b;
        public Drawable f7724c;
        public final p f7725d;

        public m(p pVar) {
            this.f7725d = pVar;
        }

        @Override
        public void a(View view, Canvas canvas) {
            q.a(this, view, canvas);
        }

        @Override
        public void b(View view, Canvas canvas) {
            int i10;
            int i11;
            int measuredWidth;
            int i12;
            Drawable drawable;
            TextPaint c02 = y.c0(14.0f, -1);
            if (this.f7722a == null) {
                String i13 = gd.w.i1(R.string.Demo);
                this.f7722a = i13;
                this.f7723b = (int) v0.T1(i13, c02);
                this.f7724c = ce.c.f(R.drawable.baseline_close_18);
            }
            int i14 = a0.i(16.0f);
            int i15 = a0.i(7.0f);
            RectF a02 = y.a0();
            int measuredWidth2 = (view.getMeasuredWidth() - a0.i(12.0f)) - ((((i14 * 2) + i15) + this.f7723b) + a0.i(10.0f));
            int measuredHeight = (view.getMeasuredHeight() / 2) - i14;
            canvas.drawRect(measuredWidth2 - ((measuredWidth - measuredWidth2) - i11), 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), y.g(this.f7725d.e(R.id.theme_color_headerBackground)));
            int i16 = measuredHeight + i14;
            a02.set(measuredWidth2, measuredHeight, i11 + measuredWidth2, i16 + i14);
            float f10 = i14;
            canvas.drawRoundRect(a02, f10, f10, y.g(this.f7725d.e(R.id.theme_color_headerRemoveBackground)));
            canvas.drawCircle(i14 + measuredWidth2, i16, f10, y.g(this.f7725d.e(R.id.theme_color_headerRemoveBackgroundHighlight)));
            ce.c.b(canvas, this.f7724c, i12 - (drawable.getMinimumWidth() / 2), i16 - (this.f7724c.getMinimumHeight() / 2), y.W(-1));
            canvas.drawText(this.f7722a, measuredWidth2 + i10 + i15, i16 + a0.i(5.0f), c02);
        }
    }

    public static class n {
        public final ae.r f7727a;
        public int f7728b;
        public t30 f7729c;

        public n(ae.r rVar, int i10) {
            this.f7727a = rVar;
            this.f7728b = i10;
        }

        public n d(t30 t30Var) {
            this.f7729c = t30Var;
            return this;
        }
    }

    public static class o implements r {
        public final ae.n f7730a;
        public final int f7731b;
        public boolean f7732c;
        public r f7733d;
        public int f7734e;
        public int f7735f;
        public int f7736g = R.id.theme_color_white;
        public je.e f7737h;
        public float f7738i;
        public Drawable f7739j;
        public Path f7740k;
        public Drawable[] f7741l;
        public boolean f7742m;
        public boolean f7743n;
        public Paint f7744o;
        public int f7745p;
        public int f7746q;
        public je.a f7747r;

        public o(ae.n nVar, int i10) {
            this.f7730a = nVar;
            this.f7731b = i10;
            j();
        }

        @Override
        public void a(View view, Canvas canvas) {
            r rVar = this.f7733d;
            if (rVar != null) {
                rVar.a(view, canvas);
            }
        }

        @Override
        public void b(View view, Canvas canvas) {
            Drawable[] drawableArr;
            Paint paint;
            Paint paint2;
            Drawable drawable;
            r rVar = this.f7733d;
            if (rVar != null) {
                rVar.b(view, canvas);
            }
            boolean h10 = this.f7730a.h(this.f7731b, true);
            if (h10 || this.f7732c) {
                canvas.drawCircle(a0.i(8.0f), (view.getMeasuredHeight() / 2) - a0.i(9.0f), a0.i(3.0f), y.g(this.f7730a.e(h10 ? R.id.theme_color_iconActive : R.id.theme_color_iconLight)));
            }
            int i10 = 0;
            if (this.f7735f != 0) {
                int L0 = wc.a.L0(1);
                int measuredWidth = (view.getMeasuredWidth() - L0) - a0.i(12.0f);
                int measuredHeight = view.getMeasuredHeight() / 2;
                if (this.f7734e != 0) {
                    canvas.drawRect((measuredWidth - L0) - a0.i(12.0f), 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), y.g(this.f7730a.e(this.f7734e)));
                }
                float f10 = measuredWidth;
                canvas.drawCircle(f10, measuredHeight, L0, y.g(this.f7730a.e(this.f7735f)));
                if (this.f7739j != null) {
                    int L = ae.j.L(this.f7736g);
                    if (this.f7745p != L || (paint2 = this.f7744o) == null) {
                        Paint paint3 = this.f7744o;
                        this.f7745p = L;
                        paint2 = y.c(paint3, L);
                        this.f7744o = paint2;
                    }
                    ce.c.b(canvas, this.f7739j, measuredWidth - (drawable.getMinimumWidth() / 2), measuredHeight - (this.f7739j.getMinimumHeight() / 2), paint2);
                } else {
                    je.e eVar = this.f7737h;
                    if (eVar != null) {
                        TextPaint F0 = y.F0(20.0f, eVar.f15364b, false);
                        int color = F0.getColor();
                        F0.setColor(ae.j.L(R.id.theme_color_avatar_content));
                        canvas.drawText(this.f7737h.f15363a, f10 - (this.f7738i / 2.0f), measuredHeight + a0.i(7.0f), F0);
                        F0.setColor(color);
                    } else if (this.f7740k != null) {
                        ce.b.t(canvas, measuredWidth, measuredHeight, a0.i(13.0f), this.f7740k, 0.0f, 0.0f, 0.0f, -1);
                    }
                }
                if (this.f7743n) {
                    ce.b.q(canvas, (view.getMeasuredWidth() - wc.a.L0(1)) - a0.i(12.0f), view.getMeasuredHeight() / 2, wc.a.L0(1), 1.0f);
                }
            }
            if (this.f7747r != null) {
                this.f7747r.e(canvas, (view.getMeasuredWidth() - a0.i(18.0f)) - a0.i(12.0f), view.getMeasuredHeight() / 2, 3, 1.0f);
            }
            if (this.f7741l != null) {
                int measuredWidth2 = view.getMeasuredWidth() - a0.i(18.0f);
                Drawable[] drawableArr2 = this.f7741l;
                int length = drawableArr2.length;
                while (i10 < length) {
                    Drawable drawable2 = drawableArr2[i10];
                    int minimumWidth = measuredWidth2 - drawable2.getMinimumWidth();
                    int L2 = ae.j.L(this.f7731b);
                    int measuredHeight2 = (view.getMeasuredHeight() / 2) - (drawable2.getMinimumHeight() / 2);
                    int minimumWidth2 = drawable2.getMinimumWidth();
                    int minimumHeight = drawable2.getMinimumHeight();
                    if (this.f7746q != 0) {
                        RectF a02 = y.a0();
                        float f11 = minimumWidth;
                        a02.left = f11;
                        float f12 = minimumWidth + minimumWidth2;
                        a02.right = f12;
                        float f13 = measuredHeight2;
                        a02.top = f13;
                        drawableArr = drawableArr2;
                        float f14 = measuredHeight2 + minimumHeight;
                        a02.bottom = f14;
                        float f15 = minimumWidth2 / 2;
                        a02.left = f11 - f15;
                        a02.right = f12 + f15;
                        float f16 = minimumHeight / 2;
                        a02.top = f13 - f16;
                        a02.bottom = f14 + f16;
                        canvas.drawRoundRect(a02, a0.i(3.0f), a0.i(3.0f), y.g(this.f7730a.e(this.f7746q)));
                    } else {
                        drawableArr = drawableArr2;
                    }
                    if (this.f7745p != L2 || (paint = this.f7744o) == null) {
                        Paint paint4 = this.f7744o;
                        this.f7745p = L2;
                        paint = y.c(paint4, L2);
                        this.f7744o = paint;
                    }
                    ce.c.b(canvas, drawable2, minimumWidth, measuredHeight2, paint);
                    measuredWidth2 = minimumWidth - a0.i(6.0f);
                    i10++;
                    drawableArr2 = drawableArr;
                }
            }
        }

        public void j() {
            this.f7732c = he.i.c2().U1(z.V(this.f7730a.a()), this.f7731b);
        }

        public void k(int i10, int i11) {
            this.f7735f = i10;
            this.f7739j = i11 != 0 ? ce.c.f(i11) : null;
        }

        public void l(int i10, String str) {
            this.f7735f = i10;
            p(str);
        }

        public void m(int i10) {
            je.a b10 = new a.b().b();
            this.f7747r = b10;
            b10.v(i10, this.f7731b == R.id.theme_color_badgeMuted, false);
        }

        public void n(boolean z10) {
            this.f7732c = z10;
        }

        public void o(int... iArr) {
            this.f7741l = new Drawable[iArr.length];
            int i10 = 0;
            for (int i11 : iArr) {
                this.f7741l[i10] = ce.c.f(i11);
                i10++;
            }
        }

        public void p(String str) {
            if (str != null) {
                je.e eVar = new je.e(str);
                this.f7737h = eVar;
                this.f7738i = y.v0(eVar, 20.0f);
                return;
            }
            this.f7737h = null;
            this.f7738i = 0.0f;
        }

        public void q(r rVar) {
            this.f7733d = rVar;
        }

        public void r() {
            Path path = new Path();
            this.f7740k = path;
            ce.b.b(path, a0.i(13.0f), -1.0f, 0.0f);
        }
    }

    public d40(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static int Ah(ra raVar) {
        return (int) raVar.m();
    }

    public static int Ch(int i10, String str) {
        int yh = yh(i10, str);
        return yh != R.id.theme_color_black ? yh : R.id.theme_color_filling;
    }

    public static boolean Gh(int i10) {
        switch (i10) {
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

    public boolean Hh(int i10, y1 y1Var, String str) {
        float f10;
        if (str.equals("true")) {
            f10 = 1.0f;
        } else if (str.equals("false")) {
            f10 = 0.0f;
        } else {
            try {
                f10 = Float.parseFloat(str);
            } catch (Throwable unused) {
                return false;
            }
        }
        return bi(i10, f10);
    }

    public void Ih(RecyclerView.m mVar) {
        kg().setItemAnimator(mVar);
    }

    public void Jh() {
        Zb();
    }

    public boolean Kh(int i10, ra raVar, ViewGroup viewGroup, View view, ae.b bVar, y1 y1Var, String str) {
        try {
            int Vh = Vh(str);
            if (Color.alpha(Vh) != 255 || i10 != this.M0) {
                return false;
            }
            mh(raVar, viewGroup, view, bVar, ib.d.c(Vh, bVar.f()), false, false);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean Lh(int i10, ae.b bVar, ra raVar, ViewGroup viewGroup, View view, View view2, int i11) {
        if (i11 != R.id.btn_done || i10 != this.M0 || !bVar.e() || mh(raVar, viewGroup, view, bVar, bVar.f(), false, true)) {
            return true;
        }
        viewGroup.findViewById(R.id.btn_colorUndo).setEnabled(bVar.d());
        viewGroup.findViewById(R.id.btn_colorRedo).setEnabled(bVar.b());
        viewGroup.findViewById(R.id.btn_colorClear).setEnabled(bVar.a());
        sh(bVar.g());
        return true;
    }

    public boolean Mh(int i10, ae.b bVar, ra raVar, ViewGroup viewGroup, View view, View view2, int i11) {
        if (i11 != R.id.btn_done || i10 != this.M0 || !bVar.o() || mh(raVar, viewGroup, view, bVar, bVar.f(), false, true)) {
            return true;
        }
        viewGroup.findViewById(R.id.btn_colorUndo).setEnabled(bVar.d());
        viewGroup.findViewById(R.id.btn_colorRedo).setEnabled(bVar.b());
        viewGroup.findViewById(R.id.btn_colorClear).setEnabled(bVar.a());
        return true;
    }

    public void Nh(String str, int i10, List list, kb.k kVar) {
        if (!Sa() && ib.i.c(this.J0, str)) {
            if (this.M0 != -1) {
                vh();
            }
            this.K0 = i10;
            this.D0.s2(list, false);
            ((LinearLayoutManager) kg().getLayoutManager()).z2(0, 0);
            if (kVar != null) {
                kVar.a(i10);
            }
        }
    }

    public void Oh(final String str, final kb.k kVar) {
        final ArrayList arrayList = new ArrayList();
        final int ih = ih(arrayList, Dh().a(), str);
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                d40.this.Nh(str, ih, arrayList, kVar);
            }
        });
    }

    public void Ph(int i10, float f10, float f11, eb.k kVar) {
        boolean z10 = false;
        for (int i11 = 0; i11 < kg().getChildCount(); i11++) {
            ei(kg().getChildAt(i11));
        }
        oc.l B = ae.j.B(get());
        if (B != null) {
            B.c(1.0f - f10);
        }
        if (f10 > 0.0f) {
            z10 = true;
        }
        gi(z10);
        kg().invalidate();
    }

    public static boolean Rh(int i10, boolean z10, String str) {
        if (ib.i.i(str)) {
            return true;
        }
        String b02 = z10 ? ae.j.b0(i10) : ae.j.O(i10);
        String lowerCase = b02.toLowerCase();
        if (lowerCase.startsWith(str)) {
            return true;
        }
        int i11 = 0;
        while (i11 < b02.length()) {
            int codePointAt = b02.codePointAt(i11);
            if (Character.isUpperCase(codePointAt) && lowerCase.startsWith(str, i11)) {
                return true;
            }
            i11 += Character.charCount(codePointAt);
        }
        return ce.c0.t(b02, str);
    }

    public static boolean Sh(int i10, int i11) {
        return (i10 == R.id.theme_color_caption_textLink && i11 == R.id.theme_color_caption_textLinkPressHighlight) ? false : true;
    }

    public static int Uh(String str) {
        if (str.endsWith("%")) {
            return Wh(str);
        }
        float parseFloat = Float.parseFloat(str);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return (int) (parseFloat * 255.0f);
        }
        throw new IllegalArgumentException();
    }

    public static int Wh(String str) {
        int i10;
        if (str.endsWith("%")) {
            i10 = (int) ((Integer.parseInt(str.substring(0, str.length() - 1)) / 100.0f) * 255.0f);
        } else {
            i10 = Integer.parseInt(str);
        }
        if (i10 <= 255 && i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    public static ViewGroup th(View view) {
        while (!(view.getTag() instanceof ra)) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        if (((ra) view.getTag()).A() == 94) {
            return (ViewGroup) view;
        }
        return null;
    }

    public static int yh(int i10, String str) {
        switch (i10) {
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
                return i10;
            default:
                return R.id.theme_color_filling;
        }
    }

    public final int Bh() {
        ClipboardManager clipboardManager = (ClipboardManager) this.f24493a.getSystemService("clipboard");
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
            return Vh(lowerCase);
        }
    }

    @Override
    public void C4(int i10, int i11, float f10, boolean z10) {
        if (!this.L0) {
            this.D0.q3(i11);
        }
    }

    public final ae.n Dh() {
        return (ae.n) x9().f7727a.e();
    }

    @Override
    public boolean E8() {
        return false;
    }

    public boolean Eh(int i10) {
        int sh = sh(i10);
        if (sh == -1) {
            return false;
        }
        if (this.M0 != sh) {
            fi(sh, i10, false);
        }
        ((LinearLayoutManager) kg().getLayoutManager()).z2(this.M0, 0);
        return true;
    }

    public final boolean Fh() {
        eb.f fVar = this.O0;
        return fVar != null && fVar.h();
    }

    @Override
    public View G9() {
        return this.G0;
    }

    @Override
    public void Ia() {
        super.Ia();
        if (this.H0) {
            d1.h4(this.G0, a0.i(68.0f), a0.i(49.0f));
        }
    }

    @Override
    public void Id(v4<?> v4Var) {
        super.Id(v4Var);
        iq iqVar = this.D0;
        if (iqVar != null) {
            iqVar.v2(Z9(), false);
        }
    }

    @Override
    public void J(int i10, View view) {
        if (!this.H0 || i10 != R.id.menu_btn_clear) {
            super.J(i10, view);
        } else {
            ((HeaderEditText) this.G0).setText("");
        }
    }

    @Override
    public int L9() {
        return this.H0 ? R.id.theme_color_filling : super.L9();
    }

    @Override
    public int O9() {
        return this.H0 ? R.id.theme_color_icon : super.O9();
    }

    @Override
    public int Q9() {
        return this.H0 ? R.id.theme_color_text : super.Q9();
    }

    public final CharSequence Qh(int i10) {
        CharSequence Y = ce.c0.Y(gd.w.i1(i10));
        TdApi.TextEntity[] E0 = ob.e.E0(Y.toString());
        if (E0 != null) {
            ArrayList arrayList = new ArrayList();
            for (TdApi.TextEntity textEntity : E0) {
                if (textEntity.type.getConstructor() == 934535013) {
                    int i11 = textEntity.offset;
                    arrayList.add(new c(Y.subSequence(i11 + 1, i11 + textEntity.length).toString()));
                    arrayList.add(new ie.o(null, R.id.theme_color_textLink).j(textEntity.type).r(true));
                }
                if (!arrayList.isEmpty()) {
                    if (!(Y instanceof SpannableStringBuilder)) {
                        Y = new SpannableStringBuilder(Y);
                    }
                    for (Object obj : arrayList) {
                        int i12 = textEntity.offset;
                        ((SpannableStringBuilder) Y).setSpan(obj, i12, textEntity.length + i12, 33);
                    }
                    arrayList.clear();
                }
            }
        }
        return Y;
    }

    @Override
    public int R9() {
        return R.id.controller_themeColors;
    }

    public final de.ra Th(ae.p r22, int r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: de.d40.Th(ae.p, int, boolean):de.ra");
    }

    public final int Vh(String str) {
        boolean z10;
        String trim = str.trim();
        if (ib.i.i(trim)) {
            throw new IllegalArgumentException();
        } else if (trim.startsWith("#")) {
            return ib.d.g(trim.substring(1), false);
        } else {
            int i10 = 0;
            while (true) {
                if (i10 >= trim.length()) {
                    z10 = false;
                    break;
                }
                int codePointAt = trim.codePointAt(i10);
                if ((codePointAt < 97 || codePointAt > 122) && ((codePointAt < 65 || codePointAt > 90) && ((codePointAt < 48 || codePointAt > 57) && codePointAt != 95))) {
                    z10 = true;
                    break;
                }
                i10 += Character.charCount(codePointAt);
            }
            if (!z10) {
                int U = ae.j.U("theme_color_" + trim);
                if (U != 0) {
                    try {
                        return Dh().e(U);
                    } catch (Throwable unused) {
                    }
                }
                return ib.d.g(trim, true);
            }
            if (this.F0 == null) {
                this.F0 = Pattern.compile("^(?:\\s+)?([A-Za-z]{0,3}[Aa]?)(?:\\s+)?\\((?:\\s+)?([\\d.]+%?)(?:\\s+)?,(?:\\s+)?([\\d.]+%?)(?:\\s+)?,(?:\\s+)?([\\d.]+%?)(?:\\s+)?(?:,(?:\\s+)?([\\d.]+%?)(?:\\s+)?)?\\)(?:\\s+)?$");
            }
            Matcher matcher = this.F0.matcher(trim);
            if (matcher.find()) {
                int groupCount = matcher.groupCount();
                if (groupCount >= 5) {
                    String lowerCase = matcher.group(1).toLowerCase();
                    String group = matcher.group(2);
                    String group2 = matcher.group(3);
                    String group3 = matcher.group(4);
                    String group4 = groupCount > 5 ? matcher.group(5) : null;
                    int Uh = group4 != null ? Uh(group4) : 255;
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
                        float[] fArr = this.E0;
                        fArr[0] = parseFloat;
                        fArr[1] = parseFloat2;
                        fArr[2] = Float.parseFloat(group3) / 100.0f;
                        return Color.HSVToColor(Uh, fArr);
                    } else if (lowerCase.equals("rgb")) {
                        return Color.argb(Uh, Wh(group), Wh(group2), Wh(group3));
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
    public int W9() {
        if (this.H0) {
            return R.id.menu_clear;
        }
        return 0;
    }

    public final void Xh(final View view, boolean z10) {
        final ViewGroup th = th(view);
        if (th != null) {
            final ra raVar = (ra) th.getTag();
            final ae.b bVar = (ae.b) raVar.d();
            if (bVar != null) {
                final int i10 = this.M0;
                if (z10) {
                    ee(gd.w.n2(R.string.ColorClearAll, bVar.j(false), gd.w.p(), ae.j.O(bVar.g())), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{gd.w.o2(R.string.ColorClearDone, bVar.j(false)), gd.w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                        @Override
                        public boolean P() {
                            return g0.a(this);
                        }

                        @Override
                        public Object a2(int i11) {
                            return g0.b(this, i11);
                        }

                        @Override
                        public final boolean r3(View view2, int i11) {
                            boolean Lh;
                            Lh = d40.this.Lh(i10, bVar, raVar, th, view, view2, i11);
                            return Lh;
                        }
                    });
                } else {
                    ee(gd.w.m1(R.string.ColorRemove, ae.j.O(bVar.g())), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{gd.w.i1(R.string.ColorRemoveDone), gd.w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
                        @Override
                        public boolean P() {
                            return g0.a(this);
                        }

                        @Override
                        public Object a2(int i11) {
                            return g0.b(this, i11);
                        }

                        @Override
                        public final boolean r3(View view2, int i11) {
                            boolean Mh;
                            Mh = d40.this.Mh(i10, bVar, raVar, th, view, view2, i11);
                            return Mh;
                        }
                    });
                }
            }
        }
    }

    public final void Yh(int i10) {
        int i11 = i10 + 1;
        if (this.D0.D0().get(i11).A() == 93) {
            i10 = i11;
        }
        this.D0.R1(i10 + 1, 1);
        ae.b bVar = (ae.b) this.N0.d();
        if (bVar != null) {
            Zh(this.N0, bVar);
        }
        this.N0 = null;
        if (Z9().U9() != null) {
            Z9().La();
            t().I2();
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        ra raVar = this.N0;
        if (raVar != null) {
            Zh(this.N0, (ae.b) raVar.d());
        }
    }

    public final void Zh(ra raVar, ae.b bVar) {
        if (bVar.r(bVar.f(), true)) {
            ai(bVar, false);
        }
    }

    public final void ai(ae.b bVar, boolean z10) {
        ae.n Dh = Dh();
        int g10 = bVar.g();
        int e10 = Dh.e(g10);
        int f10 = bVar.f();
        int V = z.V(Dh.a());
        Integer valueOf = bVar.m() ? null : Integer.valueOf(f10);
        if (!z10) {
            if (bVar.q(bVar.i())) {
                LevelDB W = he.i.c2().W();
                he.i.c2().r4(V, g10, valueOf);
                he.i.c2().p4(V, g10, bVar.i());
                W.apply();
            } else {
                he.i.c2().r4(V, g10, valueOf);
            }
        }
        if (e10 != f10) {
            Dh.j(g10, valueOf);
            z.u().M(Dh.a(), bVar, z10);
            if (!Sa()) {
                ii(g10, false);
            }
        } else if (!z10) {
            z.u().M(Dh.a(), bVar, false);
            sh(g10);
        }
        switch (g10) {
            case R.id.theme_color_background:
            case R.id.theme_color_filling:
            case R.id.theme_color_iv_preBlockBackground:
            case R.id.theme_color_iv_textCodeBackground:
                kg().invalidate();
                return;
            default:
                return;
        }
    }

    public final boolean bi(int i10, float f10) {
        boolean z10 = false;
        if ((i10 == R.id.theme_property_wallpaperId && !this.f24495b.Ue().l((int) f10)) || !z.C(i10, f10)) {
            return false;
        }
        ae.n Dh = Dh();
        float d10 = Dh.d(i10);
        Float valueOf = (d10 != f10 || i10 == R.id.theme_property_parentTheme) ? Float.valueOf(f10) : null;
        Dh.m(i10, valueOf);
        he.i.c2().t4(z.V(Dh.a()), i10, valueOf);
        if (i10 == R.id.theme_property_dark) {
            ya.o1().i0(Dh.a(), f10 == 1.0f, Dh.g().a());
        }
        z.u().N(Dh.a(), i10, f10, d10);
        if (i10 == R.id.theme_property_dark) {
            org.thunderdog.challegram.a t10 = t();
            if (f10 == 1.0f) {
                z10 = true;
            }
            t10.K0(z10);
        }
        if (i10 == R.id.theme_property_wallpaperId) {
            this.f24495b.Ue().t(Dh.a());
        }
        return true;
    }

    public void ci(final String str, final kb.k kVar) {
        this.J0 = str;
        if (this.D0 != null) {
            gd.l.a().b(new Runnable() {
                @Override
                public final void run() {
                    d40.this.Oh(str, kVar);
                }
            });
        }
    }

    public void di(n nVar) {
        super.Ad(nVar);
        this.H0 = nVar.f7729c != null;
    }

    public final void ei(View view) {
        if (view != null) {
            float xh = xh();
            if (view != this.P0) {
                view.setAlpha(xh);
                return;
            }
            float f10 = (0.3f * xh) + 0.7f;
            if (view instanceof td.e) {
                view.setAlpha(f10);
            } else {
                view.setAlpha(1.0f);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    View view2 = this.Q0;
                    if (childAt == view2) {
                        childAt.setAlpha(view2 instanceof td.e ? f10 : 1.0f);
                    } else if (childAt != null) {
                        childAt.setAlpha(xh);
                    }
                }
            }
        }
    }

    public final void fi(int i10, int i11, boolean z10) {
        int i12 = this.M0;
        if (i12 != i10) {
            if (i12 != -1) {
                Yh(i12);
                if (i10 != -1 && i10 > this.M0) {
                    i10--;
                }
            }
            this.M0 = i10;
            if (i10 != -1) {
                t().I2();
                gh(i10, i11, z10);
                t30 uh = uh();
                if (uh != null) {
                    uh.Dg(this, i11);
                }
            }
        } else if (i10 != -1) {
            Yh(i10);
            this.M0 = -1;
        }
    }

    public final void gh(int i10, int i11, boolean z10) {
        int i12 = i10 + 1;
        int i13 = this.D0.D0().get(i12).A() == 93 ? 2 : 1;
        List<ra> D0 = this.D0.D0();
        int i14 = i10 + i13;
        ra N = new ra(94).N(i11);
        this.N0 = N;
        D0.add(i14, N);
        this.D0.M(i14, 1);
        if (z10) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kg().getLayoutManager();
            View C = linearLayoutManager.C(i10);
            int i15 = 0;
            if (C == null || C.getTop() >= 0) {
                int W = ap.W(94);
                int i16 = -1;
                for (int i17 = i14 + 1; i17 < this.D0.D0().size() && i16 == -1; i17++) {
                    int A = this.D0.D0().get(i17).A();
                    try {
                        i15 += ap.W(A);
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
                        i16 = i17;
                    } catch (Throwable unused) {
                    }
                }
                if (i16 != -1) {
                    W += i15;
                }
                if (i13 != 1) {
                    C = linearLayoutManager.C(i12);
                }
                if (C == null || C.getBottom() + W > kg().getMeasuredHeight()) {
                    linearLayoutManager.z2(i14, kg().getMeasuredHeight() - W);
                    return;
                }
                return;
            }
            linearLayoutManager.z2(i10, 0);
        }
    }

    public final void gi(boolean z10) {
        if (this.R0 != z10) {
            this.R0 = z10;
            if (z10) {
                Z9().bc().C();
            } else {
                Z9().bc().w();
            }
            Md(z10);
        }
    }

    public final int hh(List<ra> list, int i10, int i11, int i12, int[] iArr, boolean z10, String str, boolean z11, List<Integer> list2) {
        if (list2 != null) {
            ib.b.m(list2, list2.size() + iArr.length);
        }
        int length = iArr.length;
        int i13 = 0;
        int i14 = i11;
        boolean z12 = true;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < length) {
            int i18 = iArr[i15];
            if (list2 != null) {
                list2.add(Integer.valueOf(i18));
            }
            if (jh(i10, i18, z10) && Rh(i18, z10, str)) {
                i16++;
                int e10 = gd.y.e(i18);
                if (z12) {
                    if (i14 != 0 && !list.isEmpty()) {
                        list.add(new ra(list.isEmpty() ? 70 : 8, i13, i13, i14));
                        i14 = 0;
                    }
                    if (z11 && !list.isEmpty()) {
                        list.add(new ra(2));
                    }
                    z12 = false;
                } else if (z11 && (i17 == 0 || Sh(i17, i18))) {
                    list.add(new ra(11));
                }
                list.add(Th(x9().f7727a.e(), i18, z10));
                if (e10 != 0) {
                    list.add(new ra(93, 0, 0, Qh(e10), false).d0(R.id.theme_color_textLight));
                }
                i17 = i18;
            }
            i15++;
            i13 = 0;
        }
        if (!z12) {
            if (z11) {
                list.add(new ra(3));
            }
            if (i12 != 0) {
                list.add(new ra(9, 0, 0, ce.c0.Y(gd.w.i1(i12)), false));
            }
        }
        return i16;
    }

    public final void hi(boolean z10, View view) {
        lh();
        t30 uh = uh();
        if (uh != null && uh.Gg()) {
            if (this.O0 == null) {
                this.O0 = new eb.f(0, new k.b() {
                    @Override
                    public final void n4(int i10, float f10, float f11, k kVar) {
                        d40.this.Ph(i10, f10, f11, kVar);
                    }

                    @Override
                    public void o4(int i10, float f10, k kVar) {
                        l.a(this, i10, f10, kVar);
                    }
                }, db.b.f7287b, 180L);
            }
            if (z10) {
                this.P0 = th(view);
                this.Q0 = view;
            }
            kg().J1(z10, false);
            uh.kg().setPagingEnabled(!z10);
            this.O0.p(z10, true);
        }
    }

    public final int ih(List<ra> list, int i10, String str) {
        int i11 = x9().f7728b;
        ArrayList arrayList = (i11 == R.id.theme_category_other || i11 == R.id.theme_category_main || (i11 == 0 && !ib.i.i(str))) ? new ArrayList() : null;
        if (i11 == R.id.theme_category_main) {
            list.add(new ra(14));
            list.add(new ra(9, 0, 0, R.string.ThemeCategoryAccent_info));
        }
        int hh = hh(list, R.id.theme_category_content, 0, 0, new int[]{R.id.theme_color_filling, R.id.theme_color_separator, R.id.theme_color_fillingPressed, R.id.theme_color_placeholder, R.id.theme_color_previewBackground, R.id.theme_color_overlayFilling, R.id.theme_color_fillingNegative, R.id.theme_color_fillingPositive, R.id.theme_color_fillingPositiveContent}, false, str, true, arrayList) + 0 + hh(list, R.id.theme_category_content, R.string.ThemeSectionText, 0, new int[]{R.id.theme_color_text, R.id.theme_color_textSelectionHighlight, R.id.theme_color_textLight, R.id.theme_color_textSecure, R.id.theme_color_textLink, R.id.theme_color_textLinkPressHighlight, R.id.theme_color_textNeutral, R.id.theme_color_textNegative, R.id.theme_color_textSearchQueryHighlight}, false, str, true, arrayList) + hh(list, R.id.theme_category_content, R.string.ThemeSectionBackground, 0, new int[]{R.id.theme_color_background, R.id.theme_color_background_text, R.id.theme_color_background_textLight, R.id.theme_color_background_icon}, false, str, false, arrayList) + hh(list, R.id.theme_category_content, R.string.ThemeSectionIcons, 0, new int[]{R.id.theme_color_icon, R.id.theme_color_iconLight, R.id.theme_color_iconActive, R.id.theme_color_iconPositive, R.id.theme_color_iconNegative}, false, str, true, arrayList);
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
        int hh2 = hh(list, R.id.theme_category_navigation, R.string.ThemeCategoryNavigation, 0, iArr, false, str, true, arrayList) + 0;
        int hh3 = hh2 + hh(list, R.id.theme_category_navigation, hh2 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr9, false, str, true, arrayList);
        int hh4 = hh3 + hh(list, R.id.theme_category_navigation, hh3 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr2, false, str, true, arrayList);
        int hh5 = hh4 + hh(list, R.id.theme_category_navigation, hh4 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr3, false, str, true, arrayList);
        int hh6 = hh5 + hh(list, R.id.theme_category_navigation, hh5 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr4, false, str, true, arrayList);
        int hh7 = hh6 + hh(list, R.id.theme_category_navigation, hh6 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr5, false, str, true, arrayList);
        int hh8 = hh7 + hh(list, R.id.theme_category_navigation, hh7 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr6, false, str, true, arrayList);
        int hh9 = hh8 + hh(list, R.id.theme_category_navigation, hh8 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr7, false, str, true, arrayList);
        int hh10 = hh9 + hh(list, R.id.theme_category_navigation, hh9 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr8, true, str, true, arrayList);
        int hh11 = hh10 + hh(list, R.id.theme_category_navigation, hh10 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr10, false, str, true, arrayList);
        int hh12 = hh11 + hh(list, R.id.theme_category_navigation, hh11 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr11, false, str, true, arrayList);
        int hh13 = hh12 + hh(list, R.id.theme_category_navigation, hh12 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr12, false, str, true, arrayList);
        int hh14 = hh + hh13 + hh(list, R.id.theme_category_navigation, hh13 == 0 ? R.string.ThemeCategoryNavigation : 0, 0, iArr13, false, str, true, arrayList);
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
        int hh15 = hh(list, R.id.theme_category_controls, R.string.ThemeCategoryControls, 0, iArr14, false, str, true, arrayList) + 0;
        int hh16 = hh15 + hh(list, R.id.theme_category_controls, hh15 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr15, false, str, true, arrayList);
        int hh17 = hh16 + hh(list, R.id.theme_category_controls, hh16 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr16, false, str, true, arrayList);
        int hh18 = hh17 + hh(list, R.id.theme_category_controls, hh17 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr17, false, str, true, arrayList);
        int hh19 = hh18 + hh(list, R.id.theme_category_controls, hh18 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr18, false, str, true, arrayList);
        int hh20 = hh19 + hh(list, R.id.theme_category_controls, hh19 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr19, false, str, true, arrayList);
        int hh21 = hh20 + hh(list, R.id.theme_category_controls, hh20 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr20, false, str, true, arrayList);
        int hh22 = hh21 + hh(list, R.id.theme_category_controls, hh21 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr21, false, str, true, arrayList);
        int hh23 = hh22 + hh(list, R.id.theme_category_controls, hh22 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr22, false, str, true, arrayList);
        int hh24 = hh23 + hh(list, R.id.theme_category_controls, hh23 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr23, false, str, true, arrayList);
        int hh25 = hh24 + hh(list, R.id.theme_category_controls, hh24 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr24, false, str, true, arrayList);
        int hh26 = hh25 + hh(list, R.id.theme_category_controls, hh25 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr25, false, str, true, arrayList);
        int hh27 = hh14 + hh26 + hh(list, R.id.theme_category_controls, hh26 == 0 ? R.string.ThemeCategoryControls : 0, 0, iArr26, false, str, true, arrayList) + hh(list, R.id.theme_category_controls, R.string.ThemeSectionPlayer, 0, new int[]{R.id.theme_color_seekDone, R.id.theme_color_seekReady, R.id.theme_color_seekEmpty, R.id.theme_color_playerButtonActive, R.id.theme_color_playerButton, R.id.theme_color_playerCoverIcon, R.id.theme_color_playerCoverPlaceholder}, false, str, true, arrayList) + hh(list, R.id.theme_category_settings, R.string.ThemeAdvanced, 0, new int[]{R.id.theme_property_parentTheme, R.id.theme_property_bubbleCorner, R.id.theme_property_bubbleCornerMerged, R.id.theme_property_bubbleCornerLegacy, R.id.theme_property_bubbleOutline, R.id.theme_property_bubbleOutlineSize, R.id.theme_property_bubbleDateCorner, R.id.theme_property_bubbleUnreadShadow, R.id.theme_property_lightStatusBar, R.id.theme_property_imageCorner, R.id.theme_property_dateCorner, R.id.theme_property_replaceShadowsWithSeparators, R.id.theme_property_shadowDepth, R.id.theme_property_subtitleAlpha, R.id.theme_property_wallpaperUsageId, R.id.theme_property_wallpaperId, R.id.theme_property_dark, R.id.theme_property_wallpaperOverrideUnread, R.id.theme_property_wallpaperOverrideDate, R.id.theme_property_wallpaperOverrideButton, R.id.theme_property_wallpaperOverrideMediaReply, R.id.theme_property_wallpaperOverrideTime, R.id.theme_property_wallpaperOverrideOverlay}, true, str, true, arrayList) + hh(list, R.id.theme_category_chat, 0, 0, new int[]{R.id.theme_color_chatListAction, R.id.theme_color_chatListMute, R.id.theme_color_chatListIcon, R.id.theme_color_chatListVerify, R.id.theme_color_ticks, R.id.theme_color_ticksRead, R.id.theme_color_badge, R.id.theme_color_badgeText, R.id.theme_color_badgeFailed, R.id.theme_color_badgeFailedText, R.id.theme_color_badgeMuted, R.id.theme_color_badgeMutedText}, false, str, true, arrayList) + 0 + hh(list, R.id.theme_category_chat, 0, 0, new int[]{R.id.theme_color_chatSendButton, R.id.theme_color_chatKeyboard, R.id.theme_color_chatKeyboardButton}, false, str, true, arrayList) + hh(list, R.id.theme_category_chat, 0, 0, new int[]{R.id.theme_color_chatBackground, R.id.theme_color_chatSeparator, R.id.theme_color_unread, R.id.theme_color_unreadText, R.id.theme_color_messageVerticalLine, R.id.theme_color_messageSelection, R.id.theme_color_messageSwipeBackground, R.id.theme_color_messageSwipeContent, R.id.theme_color_messageAuthor, R.id.theme_color_messageAuthorPsa}, false, str, true, arrayList) + hh(list, R.id.theme_category_chat, 0, 0, new int[]{R.id.theme_color_shareSeparator}, false, str, true, arrayList) + hh(list, R.id.theme_category_bubbles, 0, 0, new int[]{R.id.theme_color_bubble_chatBackground, R.id.theme_color_bubble_chatSeparator, R.id.theme_color_bubble_messageSelection, R.id.theme_color_bubble_messageSelectionNoWallpaper, R.id.theme_color_bubble_messageCheckOutline, R.id.theme_color_bubble_messageCheckOutlineNoWallpaper}, false, str, true, arrayList) + hh(list, R.id.theme_category_bubbles, 0, 0, new int[]{R.id.theme_color_bubbleIn_background, R.id.theme_color_bubbleIn_time, R.id.theme_color_bubbleIn_progress, R.id.theme_color_bubbleIn_text, R.id.theme_color_bubbleIn_textLink, R.id.theme_color_bubbleIn_textLinkPressHighlight, R.id.theme_color_bubbleIn_outline, R.id.theme_color_bubbleIn_pressed, R.id.theme_color_bubbleIn_separator}, false, str, true, arrayList) + hh(list, R.id.theme_category_bubbles, 0, 0, new int[]{R.id.theme_color_bubbleOut_background, R.id.theme_color_bubbleOut_ticks, R.id.theme_color_bubbleOut_ticksRead, R.id.theme_color_bubbleOut_time, R.id.theme_color_bubbleOut_progress, R.id.theme_color_bubbleOut_text, R.id.theme_color_bubbleOut_textLink, R.id.theme_color_bubbleOut_textLinkPressHighlight, R.id.theme_color_bubbleOut_messageAuthor, R.id.theme_color_bubbleOut_messageAuthorPsa, R.id.theme_color_bubbleOut_chatVerticalLine, R.id.theme_color_bubbleOut_inlineOutline, R.id.theme_color_bubbleOut_inlineText, R.id.theme_color_bubbleOut_inlineIcon, R.id.theme_color_bubbleOut_waveformActive, R.id.theme_color_bubbleOut_waveformInactive, R.id.theme_color_bubbleOut_file, R.id.theme_color_bubbleOut_outline, R.id.theme_color_bubbleOut_pressed, R.id.theme_color_bubbleOut_separator}, false, str, true, arrayList) + hh(list, R.id.theme_category_bubbles, 0, 0, new int[]{R.id.theme_color_bubble_unread, R.id.theme_color_bubble_unreadText, R.id.theme_color_bubble_date, R.id.theme_color_bubble_dateText, R.id.theme_color_bubble_button, R.id.theme_color_bubble_buttonRipple, R.id.theme_color_bubble_buttonText, R.id.theme_color_bubble_mediaReply, R.id.theme_color_bubble_mediaReplyText, R.id.theme_color_bubble_mediaTime, R.id.theme_color_bubble_mediaTimeText, R.id.theme_color_bubble_mediaOverlay, R.id.theme_color_bubble_mediaOverlayText, R.id.theme_color_bubble_overlay, R.id.theme_color_bubble_overlayText}, false, str, true, arrayList) + hh(list, R.id.theme_category_bubbles, 0, R.string.g_noWallpaper, new int[]{R.id.theme_color_bubble_unread_noWallpaper, R.id.theme_color_bubble_unreadText_noWallpaper, R.id.theme_color_bubble_date_noWallpaper, R.id.theme_color_bubble_dateText_noWallpaper, R.id.theme_color_bubble_button_noWallpaper, R.id.theme_color_bubble_buttonRipple_noWallpaper, R.id.theme_color_bubble_buttonText_noWallpaper, R.id.theme_color_bubble_mediaReply_noWallpaper, R.id.theme_color_bubble_mediaReplyText_noWallpaper, R.id.theme_color_bubble_mediaTime_noWallpaper, R.id.theme_color_bubble_mediaTimeText_noWallpaper, R.id.theme_color_bubble_overlay_noWallpaper, R.id.theme_color_bubble_overlayText_noWallpaper}, false, str, true, arrayList) + hh(list, R.id.theme_category_bubbles, R.string.ThemeAdvanced, 0, new int[]{R.id.theme_property_bubbleCorner, R.id.theme_property_bubbleCornerMerged, R.id.theme_property_bubbleCornerLegacy, R.id.theme_property_bubbleOutline, R.id.theme_property_bubbleOutlineSize, R.id.theme_property_bubbleDateCorner, R.id.theme_property_bubbleUnreadShadow, R.id.theme_property_imageCorner, R.id.theme_property_dateCorner, R.id.theme_property_wallpaperUsageId, R.id.theme_property_wallpaperId, R.id.theme_property_wallpaperOverrideUnread, R.id.theme_property_wallpaperOverrideDate, R.id.theme_property_wallpaperOverrideButton, R.id.theme_property_wallpaperOverrideMediaReply, R.id.theme_property_wallpaperOverrideTime, R.id.theme_property_wallpaperOverrideOverlay}, true, str, true, arrayList) + hh(list, R.id.theme_category_colors, 0, 0, new int[]{R.id.theme_color_avatar_content, R.id.theme_color_avatarArchive, R.id.theme_color_avatarArchivePinned, R.id.theme_color_avatarSavedMessages, R.id.theme_color_avatarSavedMessages_big, R.id.theme_color_avatarReplies, R.id.theme_color_avatarReplies_big, R.id.theme_color_avatarInactive, R.id.theme_color_avatarInactive_big, R.id.theme_color_nameInactive, R.id.theme_color_avatarRed, R.id.theme_color_avatarRed_big, R.id.theme_color_nameRed, R.id.theme_color_avatarOrange, R.id.theme_color_avatarOrange_big, R.id.theme_color_nameOrange, R.id.theme_color_avatarYellow, R.id.theme_color_avatarYellow_big, R.id.theme_color_nameYellow, R.id.theme_color_avatarGreen, R.id.theme_color_avatarGreen_big, R.id.theme_color_nameGreen, R.id.theme_color_avatarCyan, R.id.theme_color_avatarCyan_big, R.id.theme_color_nameCyan, R.id.theme_color_avatarBlue, R.id.theme_color_avatarBlue_big, R.id.theme_color_nameBlue, R.id.theme_color_avatarViolet, R.id.theme_color_avatarViolet_big, R.id.theme_color_nameViolet, R.id.theme_color_avatarPink, R.id.theme_color_avatarPink_big, R.id.theme_color_namePink}, false, str, true, arrayList) + 0;
        int[] iArr27 = {R.id.theme_color_file, R.id.theme_color_fileYellow, R.id.theme_color_fileGreen, R.id.theme_color_fileRed};
        int[] iArr28 = {R.id.theme_color_waveformActive, R.id.theme_color_waveformInactive};
        int hh28 = hh(list, R.id.theme_category_colors, R.string.ThemeSectionMedia, 0, iArr27, false, str, true, arrayList) + 0;
        int hh29 = hh27 + hh28 + hh(list, R.id.theme_category_colors, hh28 == 0 ? R.string.ThemeSectionMedia : 0, 0, iArr28, false, str, true, arrayList) + hh(list, R.id.theme_category_colors, R.string.ThemeSectionAttach, 0, new int[]{R.id.theme_color_attachPhoto, R.id.theme_color_attachFile, R.id.theme_color_attachLocation, R.id.theme_color_attachContact, R.id.theme_color_attachInlineBot, R.id.theme_color_attachText, R.id.theme_color_fileAttach}, false, str, true, arrayList) + hh(list, R.id.theme_category_iv, R.string.ThemeCategoryIV, 0, new int[]{R.id.theme_color_iv_pageTitle, R.id.theme_color_iv_pageSubtitle, R.id.theme_color_iv_text, R.id.theme_color_iv_textLink, R.id.theme_color_iv_textLinkPressHighlight, R.id.theme_color_iv_textMarked, R.id.theme_color_iv_textMarkedBackground, R.id.theme_color_iv_textMarkedLink, R.id.theme_color_iv_textMarkedLinkPressHighlight, R.id.theme_color_iv_textReference, R.id.theme_color_iv_textReferenceBackground, R.id.theme_color_iv_textReferenceBackgroundPressed, R.id.theme_color_iv_textReferenceOutline, R.id.theme_color_iv_textReferenceOutlinePressed, R.id.theme_color_iv_textCode, R.id.theme_color_iv_pageAuthor, R.id.theme_color_iv_caption, R.id.theme_color_iv_pageFooter, R.id.theme_color_iv_header, R.id.theme_color_iv_pullQuote, R.id.theme_color_iv_blockQuote, R.id.theme_color_iv_blockQuoteLine, R.id.theme_color_iv_preBlockBackground, R.id.theme_color_iv_textCodeBackground, R.id.theme_color_iv_textCodeBackgroundPressed, R.id.theme_color_iv_separator, R.id.theme_color_ivHeaderIcon, R.id.theme_color_ivHeader}, false, str, true, arrayList);
        int hh30 = hh(list, R.id.theme_category_other, R.string.ThemeCategoryOther, R.string.ThemeSectionRadios_info, new int[]{R.id.theme_color_themeClassic, R.id.theme_color_themeBlue, R.id.theme_color_themeRed, R.id.theme_color_themeOrange, R.id.theme_color_themeGreen, R.id.theme_color_themePink, R.id.theme_color_themeCyan, R.id.theme_color_themeNightBlue, R.id.theme_color_themeNightBlack, R.id.theme_color_themeBlackWhite, R.id.theme_color_themeWhiteBlack}, false, str, true, arrayList);
        int hh31 = hh30 + hh(list, R.id.theme_category_other, hh30 == 0 ? R.string.ThemeCategoryOther : 0, R.string.ThemeSectionWP_info, new int[]{R.id.theme_color_wp_cats, R.id.theme_color_wp_catsPink, R.id.theme_color_wp_catsGreen, R.id.theme_color_wp_catsOrange, R.id.theme_color_wp_catsBeige, R.id.theme_color_wp_circlesBlue}, false, str, true, arrayList);
        int hh32 = hh31 + hh(list, R.id.theme_category_other, hh31 == 0 ? R.string.ThemeCategoryOther : 0, 0, new int[]{R.id.theme_color_sectionedScrollBar, R.id.theme_color_sectionedScrollBarActive, R.id.theme_color_sectionedScrollBarActiveContent}, false, str, true, arrayList);
        int hh33 = hh29 + hh32 + hh(list, R.id.theme_category_other, hh32 == 0 ? R.string.ThemeCategoryOther : 0, 0, new int[]{R.id.theme_color_snackbarUpdate, R.id.theme_color_snackbarUpdateAction, R.id.theme_color_snackbarUpdateText}, false, str, true, arrayList);
        int[] iArr29 = {R.id.theme_color_caption_textLink, R.id.theme_color_caption_textLinkPressHighlight, R.id.theme_color_videoSliderActive, R.id.theme_color_videoSliderInactive, R.id.theme_color_white, R.id.theme_color_black, R.id.theme_color_transparentEditor};
        int[] iArr30 = {R.id.theme_color_photoShadowTint1, R.id.theme_color_photoShadowTint2, R.id.theme_color_photoShadowTint3, R.id.theme_color_photoShadowTint4, R.id.theme_color_photoShadowTint5, R.id.theme_color_photoShadowTint6, R.id.theme_color_photoShadowTint7, R.id.theme_color_photoHighlightTint1, R.id.theme_color_photoHighlightTint2, R.id.theme_color_photoHighlightTint3, R.id.theme_color_photoHighlightTint4, R.id.theme_color_photoHighlightTint5, R.id.theme_color_photoHighlightTint6, R.id.theme_color_photoHighlightTint7};
        int[] iArr31 = {R.id.theme_color_ledBlue, R.id.theme_color_ledOrange, R.id.theme_color_ledYellow, R.id.theme_color_ledGreen, R.id.theme_color_ledCyan, R.id.theme_color_ledRed, R.id.theme_color_ledPurple, R.id.theme_color_ledPink, R.id.theme_color_ledWhite};
        int hh34 = hh(list, R.id.theme_category_internal, R.string.ThemeCategoryInternal, 0, iArr29, false, str, true, arrayList) + 0;
        int hh35 = hh34 + hh(list, R.id.theme_category_internal, hh34 == 0 ? R.string.ThemeCategoryInternal : 0, 0, iArr30, false, str, true, arrayList);
        int hh36 = hh33 + hh35 + hh(list, R.id.theme_category_internal, hh35 == 0 ? R.string.ThemeCategoryInternal : 0, 0, iArr31, false, str, true, arrayList);
        if (arrayList != null) {
            Set<Integer> b10 = ae.m.b();
            b10.removeAll(arrayList);
            if (!b10.isEmpty()) {
                int[] iArr32 = new int[b10.size()];
                int i12 = 0;
                for (Integer num : b10) {
                    iArr32[i12] = num.intValue();
                    i12++;
                }
                hh36 += hh(list, R.id.theme_category_other, R.string.ThemeSectionUnsorted, 0, iArr32, false, str, true, arrayList);
            }
        }
        list.add(new ra(42));
        return hh36;
    }

    public void ii(int i10, boolean z10) {
        ra raVar;
        int G0;
        int sh = sh(i10);
        if (sh != -1) {
            this.D0.r3(sh);
            if (z10 && this.M0 != -1 && Ah(this.D0.D0().get(this.M0)) == i10 && (raVar = this.N0) != null && (G0 = this.D0.G0(raVar, this.M0)) != -1) {
                View C = kg().getLayoutManager().C(G0);
                if (C instanceof ViewGroup) {
                    this.D0.d2(this.N0, -1, (ViewGroup) C, null);
                }
            }
        }
    }

    public final boolean jh(int i10, int i11, boolean z10) {
        n x92 = x9();
        return x92.f7728b == 0 || x92.f7728b == i10 || (!z10 && x92.f7728b == R.id.theme_category_main && Gh(i11));
    }

    public final boolean kh() {
        try {
            Bh();
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        } catch (Throwable unused2) {
            Log.w("Some error with Clipboard API", new Object[0]);
            return false;
        }
    }

    public final void lh() {
        kb.b bVar = this.S0;
        if (bVar != null) {
            bVar.c();
            this.S0 = null;
        }
    }

    public final boolean mh(ra raVar, ViewGroup viewGroup, View view, ae.b bVar, int i10, boolean z10, boolean z11) {
        if (bVar.r(i10, !z10)) {
            ai(bVar, z10);
            if (Sa()) {
                return true;
            }
            this.D0.d2(raVar, -1, viewGroup, view);
            return true;
        } else if (!z11) {
            return false;
        } else {
            ai(bVar, z10);
            return false;
        }
    }

    public final boolean nh(ra raVar, ViewGroup viewGroup, View view, ae.b bVar, int i10, float f10, boolean z10, boolean z11) {
        if (bVar.s(i10, f10, !z10)) {
            ai(bVar, z10);
            if (Sa()) {
                return true;
            }
            this.D0.d2(raVar, -1, viewGroup, view);
            return true;
        } else if (!z11) {
            return false;
        } else {
            ai(bVar, z10);
            return false;
        }
    }

    public final void oh(int i10, boolean z10, boolean z11) {
        if (i10 != -1) {
            r f10 = this.D0.D0().get(i10).f();
            if (!(f10 instanceof o)) {
                return;
            }
            if (z10) {
                ((o) f10).j();
            } else {
                ((o) f10).n(z11);
            }
        }
    }

    @Override
    public void onClick(final View view) {
        final ViewGroup th;
        if (!Fh() || view.getId() == R.id.btn_colorUndo || view.getId() == R.id.btn_colorRedo) {
            ra raVar = (ra) view.getTag();
            int id2 = view.getId();
            if (id2 != R.id.btn_color) {
                if (id2 == R.id.btn_property) {
                    int Ah = Ah(raVar);
                    if (z.w(Ah)) {
                        uc.c cVar = (uc.c) view;
                        uc.d toggler = cVar.getToggler();
                        if (toggler != null) {
                            this.L0 = true;
                            if (bi(Ah, toggler.isEnabled() ? 0.0f : 1.0f)) {
                                this.D0.R2(raVar, cVar, true);
                            }
                            this.L0 = false;
                            return;
                        }
                        return;
                    }
                    rh(Ah);
                } else if (raVar == null && (th = th(view)) != null) {
                    final ra raVar2 = (ra) th.getTag();
                    final ae.b bVar = (ae.b) raVar2.d();
                    if (bVar != null) {
                        final int i10 = this.M0;
                        int id3 = view.getId();
                        switch (id3) {
                            case R.id.btn_colorCalculate:
                                Pc(gd.w.i1(R.string.ThemeCalcTitle), gd.w.i1(R.string.ThemeCalcHint), R.string.ThemeCalcSave, R.string.Cancel, ce.c0.C(Dh().e(R.id.theme_color_filling), false), new v4.m() {
                                    @Override
                                    public final boolean a(y1 y1Var, String str) {
                                        boolean Kh;
                                        Kh = d40.this.Kh(i10, raVar2, th, view, bVar, y1Var, str);
                                        return Kh;
                                    }
                                }, true);
                                return;
                            case R.id.btn_colorClear:
                                Xh(view, !bVar.d());
                                return;
                            case R.id.btn_colorCopy:
                                int f10 = bVar.f();
                                j0.i(ae.j.O(bVar.g()) + ": " + zh(f10, true), R.string.CopiedColor);
                                return;
                            case R.id.btn_colorFormatHex:
                            case R.id.btn_colorFormatHsl:
                            case R.id.btn_colorFormatRgb:
                            default:
                                return;
                            case R.id.btn_colorPaste:
                                try {
                                    int Bh = Bh();
                                    if (bVar.f() != Bh) {
                                        bVar.p();
                                    }
                                    mh(raVar2, th, view, bVar, Bh, false, false);
                                    return;
                                } catch (Throwable unused) {
                                    return;
                                }
                            case R.id.btn_colorRedo:
                            case R.id.btn_colorUndo:
                                if ((id3 == R.id.btn_colorUndo ? bVar.t() : bVar.n()) && !mh(raVar2, th, view, bVar, bVar.f(), false, false)) {
                                    this.D0.d2(raVar2, -1, th, view);
                                }
                                ViewGroup viewGroup = (ViewGroup) view.getParent();
                                t30 uh = uh();
                                if (uh != null && uh.Gg()) {
                                    if (!Fh() || this.Q0 == viewGroup) {
                                        hi(true, viewGroup);
                                        ph();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case R.id.btn_colorSave:
                                if (bVar.p()) {
                                    view.setEnabled(false);
                                    return;
                                }
                                return;
                        }
                    }
                }
            } else if (this.H0) {
                x9().f7729c.Fg(Ah(raVar));
                La();
                this.f24495b.hd().postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        d40.this.Jh();
                    }
                }, 120L);
            } else {
                qh(kg().k0(view), Ah(raVar));
            }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() != R.id.btn_colorClear) {
            return false;
        }
        Xh(view, true);
        return true;
    }

    @Override
    public void onPrimaryClipChanged() {
        int G0;
        c2 c2Var;
        ra raVar = this.N0;
        if (raVar != null && (G0 = this.D0.G0(raVar, this.M0)) != -1) {
            ra raVar2 = this.D0.D0().get(G0);
            View C = kg().getLayoutManager().C(G0);
            if ((C instanceof ViewGroup) && C.getTag() == raVar2 && (c2Var = (c2) C.findViewById(R.id.btn_colorPaste)) != null) {
                c2Var.setEnabled(kh());
            }
        }
    }

    public final void ph() {
        lh();
        this.S0 = new d();
        this.f24495b.hd().postDelayed(this.S0, 1500L);
    }

    public final void qh(int i10, int i11) {
        fi(i10, i11, true);
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        n nVar = (n) x9();
        if (nVar.f7728b == R.id.theme_category_settings) {
            s sVar = new s(context);
            sVar.setThemedTextColor(this);
            sVar.A1(0, true);
            sVar.setTitle(nVar.f7727a.d());
            sVar.setSubtitle(R.string.ThemeAdvanced);
            this.G0 = sVar;
        } else if (this.H0) {
            HeaderEditText B2 = d1.B2(customRecyclerView, this);
            B2.setHint(gd.w.i1(P8(ka(), B2, true, false)));
            B2.addTextChangedListener(new e());
            Fd(B2, true);
            this.G0 = B2;
        }
        f fVar = new f(this, context);
        this.D0 = fVar;
        fVar.B2(this);
        if (!this.H0) {
            this.D0.v2(Z9(), false);
        }
        customRecyclerView.g(new g());
        customRecyclerView.k(new h());
        List<ra> arrayList = new ArrayList<>();
        this.K0 = ih(arrayList, nVar.f7727a.c(), this.J0);
        this.D0.s2(arrayList, false);
        arrayList.add(new ra(4, R.id.theme_color_filling));
        customRecyclerView.setItemAnimator(this.H0 ? null : new tc.d(db.b.f7287b, 120L));
        customRecyclerView.setAdapter(this.D0);
        ed.j.a(customRecyclerView, new i());
    }

    public final void rh(final int i10) {
        ae.n Dh = Dh();
        float d10 = Dh.d(i10);
        String e02 = v0.e0(Dh.g().d(i10), true);
        if (i10 == R.id.theme_property_parentTheme) {
            e02 = null;
        }
        Oc(gd.w.i1(R.string.ThemeAdvancedEdit), ae.j.b0(i10), R.string.Save, R.string.Cancel, v0.e0(d10, true), e02, new v4.m() {
            @Override
            public final boolean a(y1 y1Var, String str) {
                boolean Hh;
                Hh = d40.this.Hh(i10, y1Var, str);
                return Hh;
            }
        }, true, null, null);
    }

    public final int sh(int i10) {
        if (this.M0 == -1 || Ah(this.D0.D0().get(this.M0)) != i10) {
            int P0 = this.D0.P0(i10);
            oh(P0, true, false);
            return P0;
        }
        ae.b bVar = (ae.b) this.N0.d();
        if (bVar != null) {
            oh(this.M0, false, bVar.k());
        } else {
            oh(this.M0, true, false);
        }
        return this.M0;
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (!this.H0 || i10 != R.id.menu_clear) {
            super.u1(i10, d1Var, linearLayout);
        } else {
            d1Var.P1(linearLayout, this);
        }
    }

    public final t30 uh() {
        v4<?> Z9 = Z9();
        if (Z9 instanceof t30) {
            return (t30) Z9;
        }
        return null;
    }

    public void vh() {
        ra raVar = this.N0;
        if (raVar != null) {
            wh(((ae.b) raVar.d()).g());
        }
    }

    public void wh(int i10) {
        ra raVar = this.N0;
        if (raVar != null && ((ae.b) raVar.d()).g() == i10) {
            final RecyclerView.m itemAnimator = kg().getItemAnimator();
            if (itemAnimator != null) {
                kg().setItemAnimator(null);
            }
            fi(-1, i10, true);
            if (itemAnimator != null) {
                this.f24495b.hd().postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        d40.this.Ih(itemAnimator);
                    }
                }, 100L);
            }
        }
    }

    public final float xh() {
        eb.f fVar = this.O0;
        if (fVar != null) {
            return 1.0f - fVar.g();
        }
        return 1.0f;
    }

    public final String zh(int i10, boolean z10) {
        Color.colorToHSV(i10, this.E0);
        int v02 = he.i.c2().v0();
        float[] fArr = this.E0;
        return ce.c0.B(v02, fArr[0], fArr[1], fArr[2], i10, z10);
    }
}
