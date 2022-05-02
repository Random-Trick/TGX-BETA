package p038ce;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1405v;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import me.C6847b2;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p038ce.C2546iq;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5132o;
import p111he.C5146u0;
import p124ib.C5320c;
import p335xd.C10189d;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import td.AbstractC9201h1;
import td.AbstractC9213j1;
import td.AbstractC9323v4;
import td.C9289s;
import td.View$OnClickListenerC9170d1;

public class C3183v6 extends AbstractC2420g6<C3185b> implements AbstractC9201h1, AbstractC9213j1, C2546iq.AbstractC2551e {
    public View$OnFocusChangeListenerC7069y1 f10639A0;
    public LinearLayout f10640B0;
    public boolean f10641C0;
    public boolean f10642D0;
    public C2546iq f10643v0;
    public TdApi.LanguagePackStringValueOrdinary f10644w0;
    public TdApi.LanguagePackStringValuePluralized f10645x0;
    public C9289s f10646y0;
    public boolean f10647z0;

    public class C3184a extends C2546iq {
        public C3184a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo17892b0(View$OnFocusChangeListenerC7069y1 y1Var, boolean z) {
            super.mo17892b0(y1Var, z);
            if (z) {
                C3183v6.this.f10639A0 = y1Var;
                C3183v6.this.m31329qf();
            } else if (C3183v6.this.f10639A0 == y1Var) {
                C3183v6.this.f10639A0 = null;
                C3183v6.this.m31329qf();
            }
        }

        @Override
        public void mo30692v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
            String c = C3183v6.this.m9131x9().f10651c.m27791c();
            y1Var.getEditText().setInputType(c.equals("language_rtl") || c.equals("language_disable_lowercase") ? 2 : 16385);
            C1399s0.m37164q0(y1Var.getEditText(), false);
        }
    }

    public static class C3185b {
        public AbstractC3186c f10649a;
        public C4403w.C4405b f10650b;
        public C4403w.C4406c f10651c;
        public List<C4403w.C4406c> f10652d;

        public C3185b(AbstractC3186c cVar, C4403w.C4405b bVar, C4403w.C4406c cVar2) {
            this.f10649a = cVar;
            this.f10650b = bVar;
            this.f10651c = cVar2;
        }
    }

    public interface AbstractC3186c {
        void mo31319G1(C4403w.C4405b bVar, C4403w.C4406c cVar);
    }

    public C3183v6(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static void m31328rf(TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized, TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized2) {
        languagePackStringValuePluralized.zeroValue = languagePackStringValuePluralized2.zeroValue;
        languagePackStringValuePluralized.oneValue = languagePackStringValuePluralized2.oneValue;
        languagePackStringValuePluralized.twoValue = languagePackStringValuePluralized2.twoValue;
        languagePackStringValuePluralized.fewValue = languagePackStringValuePluralized2.fewValue;
        languagePackStringValuePluralized.manyValue = languagePackStringValuePluralized2.manyValue;
        languagePackStringValuePluralized.otherValue = languagePackStringValuePluralized2.otherValue;
    }

    public static int m31323wf(int i) {
        if (i == 0) {
            return R.id.pluralZero;
        }
        if (i == 1) {
            return R.id.pluralOne;
        }
        if (i == 2) {
            return R.id.pluralTwo;
        }
        if (i == 3) {
            return R.id.pluralFew;
        }
        if (i == 4) {
            return R.id.pluralMany;
        }
        if (i == 5) {
            return R.id.pluralOther;
        }
        throw new IllegalArgumentException("form == " + i);
    }

    public static CharSequence m31322xf(C4403w.C4407d dVar) {
        String str;
        int[] iArr;
        int i = dVar.f14595a;
        boolean z = true;
        if (i == 0) {
            str = "zero";
        } else if (i == 1) {
            str = "one";
        } else if (i == 2) {
            str = "two";
        } else if (i == 3) {
            str = "few";
        } else if (i == 4) {
            str = "many";
        } else if (i == 5) {
            str = "other";
        } else {
            throw new IllegalArgumentException("form == " + dVar);
        }
        if (dVar.f14596b.length <= 0) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i2 : dVar.f14596b) {
            if (z) {
                spannableStringBuilder.append((CharSequence) ": ");
                z = false;
            } else {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            String valueOf = String.valueOf(i2);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) valueOf);
            spannableStringBuilder.setSpan(new C5132o(C1389o.m37263i(), R.id.theme_color_background_textLight), length, valueOf.length() + length, 33);
        }
        return spannableStringBuilder;
    }

    public boolean m31321yf(boolean z, View view, int i) {
        if ((i != R.id.btn_discard && i != R.id.btn_save) || (i == R.id.btn_save && !m31336Cf())) {
            return true;
        }
        if (z || !m31337Bf()) {
            m9298Zb();
        }
        return true;
    }

    public void m31320zf(View view) {
        View$OnFocusChangeListenerC7069y1 y1Var;
        String charSequence = ((TextView) view).getText().toString();
        if (!C5070i.m24062i(charSequence) && (y1Var = this.f10639A0) != null) {
            y1Var.getEditText().getText().replace(this.f10639A0.getEditText().getSelectionStart(), this.f10639A0.getEditText().getSelectionEnd(), charSequence);
        }
    }

    public final void m31338Af() {
        C3185b bVar;
        C3185b x9 = m9131x9();
        List<C4403w.C4406c> list = x9.f10652d;
        int indexOf = list != null ? list.indexOf(x9.f10651c) : -1;
        if (indexOf == -1 || indexOf >= list.size() - 1) {
            C4403w.C4406c a = x9.f10650b.m27801a(x9.f10651c);
            if (a == null) {
                C1379j0.m37293z0("No more untranslated strings found", 0);
                return;
            }
            if (indexOf == -1) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(x9.f10651c);
            }
            bVar = new C3185b(x9.f10649a, x9.f10650b, a);
            bVar.f10652d = list;
        } else {
            bVar = new C3185b(x9.f10649a, x9.f10650b, x9.f10652d.get(indexOf + 1));
            bVar.f10652d = list;
        }
        C3183v6 v6Var = new C3183v6(this.f30168a, this.f30170b);
        v6Var.m9476Ad(bVar);
        m9291ac(v6Var);
    }

    @Override
    public boolean mo23840B5(View view) {
        if (!m31336Cf()) {
            return true;
        }
        if (this.f10647z0) {
            m34632cf();
            return true;
        }
        m31338Af();
        return true;
    }

    public final boolean m31337Bf() {
        C3185b x9 = m9131x9();
        List<C4403w.C4406c> list = x9.f10652d;
        if (list == null || list.isEmpty()) {
            return false;
        }
        int indexOf = list.indexOf(x9.f10651c);
        if (indexOf == -1) {
            indexOf = list.size();
        }
        if (indexOf <= 0) {
            return false;
        }
        C3185b bVar = new C3185b(x9.f10649a, x9.f10650b, x9.f10652d.get(indexOf - 1));
        bVar.f10652d = list;
        C3183v6 v6Var = new C3183v6(this.f30168a, this.f30170b);
        v6Var.m9476Ad(bVar);
        m9291ac(v6Var);
        return true;
    }

    public final boolean m31336Cf() {
        int N0;
        C3185b x9 = m9131x9();
        C4403w.C4406c cVar = x9.f10651c;
        String c = cVar.m27791c();
        int constructor = x9.f10651c.f14592a.value.getConstructor();
        if (constructor == -249256352) {
            String str = this.f10644w0.value;
            if (C5070i.m24062i(str)) {
                cVar.f14593b = false;
                ((TdApi.LanguagePackStringValueOrdinary) cVar.f14592a.value).value = cVar.m27792b().value;
            } else {
                cVar.f14593b = true;
                ((TdApi.LanguagePackStringValueOrdinary) cVar.f14592a.value).value = str;
            }
            if (c.equals("language_nameInEnglish")) {
                x9.f10650b.f14587a.name = str;
            } else if (c.equals("language_name")) {
                x9.f10650b.f14587a.nativeName = str;
            }
        } else if (constructor == 1906840261) {
            int i = 0;
            for (C4403w.C4407d dVar : x9.f10650b.f14588b.f14598b) {
                if (C5070i.m24062i(dVar.m27788a(this.f10645x0))) {
                    i++;
                }
            }
            if (i == x9.f10650b.f14588b.f14598b.size()) {
                cVar.f14593b = false;
                m31328rf((TdApi.LanguagePackStringValuePluralized) cVar.f14592a.value, C4403w.m27893d0(cVar.m27791c(), x9.f10650b.f14589c.f14598b));
            } else if (i > 0) {
                for (C4403w.C4407d dVar2 : x9.f10650b.f14588b.f14598b) {
                    if (C5070i.m24062i(dVar2.m27788a(this.f10645x0)) && (N0 = this.f10643v0.m34227N0(m31323wf(dVar2.f14595a))) != -1) {
                        View C = this.f8298o0.getLayoutManager().mo39265C(N0);
                        View childAt = C instanceof ViewGroup ? ((ViewGroup) C).getChildAt(0) : null;
                        if (childAt instanceof View$OnFocusChangeListenerC7069y1) {
                            ((View$OnFocusChangeListenerC7069y1) childAt).setInErrorState(true);
                        }
                    }
                }
                return false;
            } else {
                cVar.f14593b = true;
                m31328rf((TdApi.LanguagePackStringValuePluralized) cVar.f14592a.value, this.f10645x0);
            }
        } else {
            throw new IllegalArgumentException(x9.f10651c.f14592a.toString());
        }
        x9.f10649a.mo31319G1(x9.f10650b, cVar);
        return true;
    }

    @Override
    public View mo8869G9() {
        return this.f10646y0;
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_more) {
            C5320c cVar = new C5320c(3);
            C5146u0 u0Var = new C5146u0(3);
            cVar.m23285a(R.id.btn_copyLink);
            u0Var.m23817a(R.string.CopyLink);
            if (m9131x9().f10651c.f14592a.value.getConstructor() == -249256352) {
                cVar.m23285a(R.id.btn_copyText);
                u0Var.m23817a(R.string.LocalizationCopy);
                if (this.f10639A0 != null && C5070i.m24062i(this.f10644w0.value)) {
                    cVar.m23285a(R.id.btn_pasteText);
                    u0Var.m23817a(R.string.LocalizationPaste);
                }
            }
            if (!mo9134we()) {
                cVar.m23285a(R.id.btn_close);
                u0Var.m23817a(R.string.LocalizationExit);
            }
            m9302Yd(cVar.m23281e(), u0Var.m23814d(), 0);
        } else if (i == R.id.menu_btn_view) {
            String y1 = C4779t2.m25390y1(m9131x9().f10651c.m27791c());
            if (!C1405v.m37102v(this.f30168a, Uri.parse(y1), true)) {
                this.f30170b.m2485dd().m3858E7(this, y1, new HandlerC10770jj.C10788q().m3326e());
            }
        }
    }

    @Override
    public void mo30700K(int r2, p038ce.C2964ra r3, me.View$OnFocusChangeListenerC7069y1 r4, java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C3183v6.mo30700K(int, ce.ra, me.y1, java.lang.String):void");
    }

    @Override
    public void mo8864N0(int i) {
        switch (i) {
            case R.id.btn_close:
                m31327sf(true);
                return;
            case R.id.btn_copyLink:
                C1379j0.m37328i(C4779t2.m25390y1(m9131x9().f10651c.m27791c()), R.string.CopiedLink);
                return;
            case R.id.btn_copyText:
                C1379j0.m37328i(m31324vf(), R.string.CopiedText);
                return;
            case R.id.btn_pasteText:
                if (this.f10639A0 != null) {
                    String vf = m31324vf();
                    if (!C5070i.m24062i(vf)) {
                        this.f10639A0.getEditText().getText().replace(this.f10639A0.getEditText().getSelectionStart(), this.f10639A0.getEditText().getSelectionEnd(), vf);
                        this.f10642D0 = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_editLanguage;
    }

    @Override
    public int mo418W9() {
        return R.id.menu_editLangPackString;
    }

    @Override
    public void mo30699Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        List<C4403w.C4406c> list;
        C3185b x9 = m9131x9();
        C4403w.C4405b bVar = x9.f10650b;
        C9289s sVar = new C9289s(context);
        this.f10646y0 = sVar;
        sVar.setThemedTextColor(this);
        this.f10646y0.m9631D1(C1357a0.m37544i(49.0f), true);
        this.f10646y0.setTitle(bVar.f14587a.nativeName);
        this.f10647z0 = (x9.f10651c.f14593b || x9.f10650b.m27797e() == 1) && ((list = x9.f10652d) == null || list.indexOf(x9.f10651c) == -1);
        this.f10641C0 = x9.f10652d != null;
        C3184a aVar = new C3184a(this);
        this.f10643v0 = aVar;
        aVar.m34253A2(this, true);
        this.f10643v0.m34214S2(this);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, -2, 80);
        t1.rightMargin = C1357a0.m37544i(72.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10640B0 = linearLayout;
        linearLayout.setGravity(1);
        this.f10640B0.setOrientation(0);
        this.f10640B0.setLayoutParams(t1);
        frameLayoutFix.addView(this.f10640B0);
        m31330pf();
        recyclerView.setAdapter(this.f10643v0);
        m34631df(this.f10647z0 ? R.drawable.baseline_check_24 : R.drawable.baseline_arrow_forward_24);
        mo31399hf(true);
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (!this.f10642D0) {
            return m31337Bf() || super.mo404jc(z);
        }
        m31327sf(false);
        return true;
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_editLangPackString) {
            d1Var.m10100O1(linearLayout, R.id.menu_btn_view, mo9375O9(), this, R.drawable.baseline_open_in_browser_24, C1357a0.m37544i(49.0f), R.drawable.bg_btn_header);
            d1Var.m10064d2(linearLayout, this, mo9375O9());
        }
    }

    public final void m31330pf() {
        HashSet hashSet = new HashSet();
        C3185b x9 = m9131x9();
        this.f10646y0.setSubtitle(x9.f10651c.m27791c());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(36));
        C4403w.C4406c cVar = x9.f10651c;
        int constructor = cVar.f14592a.value.getConstructor();
        if (constructor == -249256352) {
            TdApi.LanguagePackStringValueOrdinary languagePackStringValueOrdinary = (TdApi.LanguagePackStringValueOrdinary) cVar.f14592a.value;
            this.f10644w0 = cVar.f14593b ? new TdApi.LanguagePackStringValueOrdinary(languagePackStringValueOrdinary.value) : new TdApi.LanguagePackStringValueOrdinary();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str = cVar.m27792b().value;
            if (!cVar.f14593b) {
                x9.f10650b.m27795g(languagePackStringValueOrdinary.value, spannableStringBuilder, true, -1);
            } else {
                x9.f10650b.m27795g(str, spannableStringBuilder, true, -1);
            }
            arrayList.add(new C2964ra(9, (int) R.id.description, 0, (CharSequence) spannableStringBuilder, false));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(31, (int) R.id.string, 0, (int) R.string.LocalizationTranslation, false).m32850b0(cVar.f14593b ? languagePackStringValueOrdinary.value : null));
            m31325uf(hashSet, str);
        } else if (constructor == 1906840261) {
            TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized = (TdApi.LanguagePackStringValuePluralized) cVar.f14592a.value;
            TdApi.LanguagePackStringValuePluralized d0 = C4403w.m27893d0(cVar.m27791c(), x9.f10650b.f14589c.f14598b);
            m31325uf(hashSet, d0.zeroValue);
            m31325uf(hashSet, d0.oneValue);
            m31325uf(hashSet, d0.twoValue);
            m31325uf(hashSet, d0.fewValue);
            m31325uf(hashSet, d0.manyValue);
            m31325uf(hashSet, d0.otherValue);
            this.f10645x0 = cVar.f14593b ? new TdApi.LanguagePackStringValuePluralized(languagePackStringValuePluralized.zeroValue, languagePackStringValuePluralized.oneValue, languagePackStringValuePluralized.twoValue, languagePackStringValuePluralized.fewValue, languagePackStringValuePluralized.manyValue, languagePackStringValuePluralized.otherValue) : new TdApi.LanguagePackStringValuePluralized();
            for (C4403w.C4407d dVar : x9.f10650b.f14589c.f14598b) {
                String a = dVar.m27788a(d0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                x9.f10650b.m27795g(a, spannableStringBuilder2, true, -1);
                arrayList.add(new C2964ra(9, (int) R.id.description, 0, (CharSequence) spannableStringBuilder2, false));
            }
            arrayList.add(new C2964ra(11));
            for (C4403w.C4407d dVar2 : x9.f10650b.f14588b.f14598b) {
                arrayList.add(new C2964ra(31, m31323wf(dVar2.f14595a), 0, m31322xf(dVar2), false).m32850b0(cVar.f14593b ? dVar2.m27788a(languagePackStringValuePluralized) : null));
            }
        } else {
            throw new IllegalArgumentException(cVar.f14592a.toString());
        }
        this.f10643v0.m34119x2(arrayList, false);
        m31326tf(hashSet);
    }

    public final void m31329qf() {
        View$OnFocusChangeListenerC7069y1 y1Var = this.f10639A0;
        String charSequence = y1Var != null ? y1Var.getText().toString() : null;
        for (int i = 0; i < this.f10640B0.getChildCount(); i++) {
            TextView textView = (TextView) this.f10640B0.getChildAt(i);
            boolean z = charSequence != null && !charSequence.contains(textView.getText().toString());
            m9180qd(textView);
            int i2 = z ? R.id.theme_color_textLink : R.id.theme_color_background_textLight;
            m9119z8(textView, i2);
            textView.setTextColor(C11524j.m228N(i2));
        }
    }

    @Override
    public boolean mo9169s9() {
        return this.f10641C0;
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        this.f10641C0 = false;
        m9273d9(mo407R9());
    }

    public final void m31327sf(final boolean z) {
        m9261ee(C4403w.m27855m1(R.string.LocalizationEditConfirmPrompt, m9131x9().f10651c.m27791c()), new int[]{R.id.btn_save, R.id.btn_discard, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.LocalizationEditConfirmSave), C4403w.m27871i1(R.string.LocalizationEditConfirmDiscard), C4403w.m27871i1(R.string.Cancel)}, new int[]{3, 2, 1}, new int[]{R.drawable.baseline_check_24, R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean yf;
                yf = C3183v6.this.m31321yf(z, view, i);
                return yf;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23935b(this, i);
            }
        });
    }

    public final void m31326tf(Set<String> set) {
        this.f10640B0.removeAllViews();
        if (!set.isEmpty()) {
            View.OnClickListener t6Var = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    C3183v6.this.m31320zf(view);
                }
            };
            int size = set.size();
            String[] strArr = new String[size];
            set.toArray(strArr);
            Arrays.sort(strArr);
            for (int i = 0; i < size; i++) {
                String str = strArr[i];
                C6847b2 b2Var = new C6847b2(this.f30168a);
                b2Var.setTypeface(C1389o.m37263i());
                b2Var.setTextColor(C11524j.m228N(R.id.theme_color_background_textLight));
                b2Var.setText(str);
                b2Var.setTextSize(1, 16.0f);
                b2Var.setPadding(C1357a0.m37544i(12.0f), C1357a0.m37544i(30.0f), C1357a0.m37544i(12.0f), C1357a0.m37544i(30.0f));
                b2Var.setOnClickListener(t6Var);
                C10189d.m5794j(b2Var);
                C1399s0.m37196a0(b2Var);
                m9119z8(b2Var, R.id.theme_color_background_textLight);
                this.f10640B0.addView(b2Var);
            }
        }
    }

    public final void m31325uf(Set<String> set, String str) {
        Matcher matcher = m9131x9().f10650b.m27800b().matcher(str);
        while (matcher.find()) {
            set.add(matcher.group());
        }
    }

    public final String m31324vf() {
        if (m9131x9().f10651c.f14593b) {
            return m9131x9().f10651c.m27792b().value;
        }
        return ((TdApi.LanguagePackStringValueOrdinary) m9131x9().f10651c.f14592a.value).value;
    }

    @Override
    public boolean mo9134we() {
        return !this.f10642D0 && m9131x9().f10652d == null;
    }
}
