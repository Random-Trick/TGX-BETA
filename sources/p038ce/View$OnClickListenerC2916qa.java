package p038ce;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import be.C1405v;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Iterator;
import me.C7030t1;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.C3183v6;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5132o;
import p111he.C5146u0;
import p124ib.C5320c;
import p350yd.C10930q6;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9289s;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC2916qa extends AbstractC3204vo<C2918b> implements View.OnClickListener, C3183v6.AbstractC3186c {
    public C2546iq f9725D0;
    public C4403w.C4405b f9726E0;
    public boolean f9727F0;
    public boolean f9728G0;
    public C9289s f9729H0;

    public class C2917a extends C2546iq {
        public C2917a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32835j() == R.id.btn_string) {
                C4403w.C4406c cVar2 = (C4403w.C4406c) raVar.m32844d();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                View$OnClickListenerC2916qa.this.f9726E0.m27794f(cVar2, spannableStringBuilder, false);
                cVar.setTextColorId(cVar2.f14593b ? R.id.theme_color_text : R.id.theme_color_textNegative);
                cVar.setData(spannableStringBuilder);
            }
        }

        @Override
        public void mo393t2(C2964ra raVar, int i, C7030t1 t1Var) {
            t1Var.m18058E1(C4403w.m27836q2(R.string.xStrings, raVar.m32833l()));
        }
    }

    public static class C2918b {
        public TdApi.LanguagePackInfo f9731a;
        public AbstractC2919c f9732b;

        public C2918b(TdApi.LanguagePackInfo languagePackInfo, AbstractC2919c cVar) {
            this.f9731a = languagePackInfo;
            this.f9732b = cVar;
        }
    }

    public interface AbstractC2919c {
        void mo33025L5(TdApi.LanguagePackInfo languagePackInfo);
    }

    public View$OnClickListenerC2916qa(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m33034Hg(TdApi.Object object) {
        this.f30167b.m2279qb(new TdApi.UpdateLanguagePackStrings("android_x", this.f9726E0.f14587a.f25405id, null), false);
    }

    public boolean m33033Ig(C4403w.C4406c cVar, View view, int i) {
        switch (i) {
            case R.id.btn_copyLink:
                C1379j0.m37325i(C4779t2.m25389y1(cVar.f14592a.key), R.string.CopiedLink);
                break;
            case R.id.btn_copyText:
                C1379j0.m37325i(((TdApi.LanguagePackStringValueOrdinary) cVar.f14592a.value).value, R.string.CopiedText);
                break;
            case R.id.btn_open:
                int constructor = cVar.f14592a.value.getConstructor();
                if (constructor != -249256352) {
                    if (constructor == 1906840261) {
                        int s1 = C4403w.m27829s1(cVar.f14592a.key);
                        for (C4403w.C4407d dVar : (cVar.f14593b ? this.f9726E0.f14588b : this.f9726E0.f14589c).f14598b) {
                            int[] iArr = dVar.f14596b;
                            if (iArr != null && iArr.length > 0) {
                                C1379j0.m37290z0(C4403w.m27844o2(s1, iArr[0]), 0);
                            }
                        }
                        break;
                    }
                } else {
                    C1379j0.m37290z0(((TdApi.LanguagePackStringValueOrdinary) cVar.f14592a.value).value, 1);
                    break;
                }
                break;
            case R.id.btn_string:
                C1405v.m37097x(C4779t2.m25389y1(cVar.f14592a.key));
                break;
        }
        return true;
    }

    public void m33032Jg() {
        if (!m9347Sa()) {
            m33027Og();
            m33035Gg(this.f9726E0.f14590d, this.f9727F0);
            m9204n9();
        }
    }

    public void m33031Kg() {
        this.f9726E0 = C4403w.m27994E0(m9131x9().f9731a);
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2916qa.this.m33032Jg();
            }
        });
    }

    public static boolean m33030Lg(TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized, String str) {
        if (!(((((!C5070i.m24061i(languagePackStringValuePluralized.zeroValue) && languagePackStringValuePluralized.zeroValue.toLowerCase().contains(str)) || (!C5070i.m24061i(languagePackStringValuePluralized.oneValue) && languagePackStringValuePluralized.oneValue.toLowerCase().contains(str))) || (!C5070i.m24061i(languagePackStringValuePluralized.twoValue) && languagePackStringValuePluralized.twoValue.toLowerCase().contains(str))) || (!C5070i.m24061i(languagePackStringValuePluralized.fewValue) && languagePackStringValuePluralized.fewValue.toLowerCase().contains(str))) || (!C5070i.m24061i(languagePackStringValuePluralized.manyValue) && languagePackStringValuePluralized.manyValue.toLowerCase().contains(str)))) {
            return !C5070i.m24061i(languagePackStringValuePluralized.otherValue) && languagePackStringValuePluralized.otherValue.toLowerCase().contains(str);
        }
        return true;
    }

    public static boolean m33029Mg(String str) {
        return str != null && (str.startsWith(" ") || str.endsWith(" ") || str.startsWith("\n") || str.endsWith("\n"));
    }

    @Override
    public void mo9477Ac() {
        super.mo9477Ac();
        m33028Ng();
    }

    @Override
    public void mo420Cc(String str) {
        m9475Ae(!str.isEmpty(), true);
        if (str.equals(" ")) {
            ArrayList arrayList = new ArrayList();
            for (C4403w.C4406c cVar : this.f9726E0.f14590d) {
                int constructor = cVar.f14592a.value.getConstructor();
                if (constructor != -249256352) {
                    if (constructor == 1906840261) {
                        TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized = (TdApi.LanguagePackStringValuePluralized) cVar.f14592a.value;
                        if (m33029Mg(languagePackStringValuePluralized.zeroValue) || m33029Mg(languagePackStringValuePluralized.oneValue) || m33029Mg(languagePackStringValuePluralized.twoValue) || m33029Mg(languagePackStringValuePluralized.fewValue) || m33029Mg(languagePackStringValuePluralized.manyValue) || m33029Mg(languagePackStringValuePluralized.otherValue)) {
                            arrayList.add(cVar);
                        }
                    }
                } else if (m33029Mg(((TdApi.LanguagePackStringValueOrdinary) cVar.f14592a.value).value)) {
                    arrayList.add(cVar);
                }
            }
            m33035Gg(arrayList, this.f9727F0);
            return;
        }
        String lowerCase = str.toLowerCase();
        if (C5070i.m24061i(lowerCase)) {
            m33035Gg(this.f9726E0.f14590d, this.f9727F0);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C4403w.C4406c> arrayList3 = new ArrayList(this.f9726E0.f14590d);
        for (C4403w.C4406c cVar2 : arrayList3) {
            if (cVar2.f14592a.key.toLowerCase().startsWith(lowerCase)) {
                arrayList2.add(cVar2);
            }
        }
        arrayList3.removeAll(arrayList2);
        for (C4403w.C4406c cVar3 : arrayList3) {
            int constructor2 = cVar3.f14592a.value.getConstructor();
            if (constructor2 != -249256352) {
                if (constructor2 == 1906840261 && m33030Lg((TdApi.LanguagePackStringValuePluralized) cVar3.f14592a.value, lowerCase)) {
                    arrayList2.add(cVar3);
                }
            } else if (((TdApi.LanguagePackStringValueOrdinary) cVar3.f14592a.value).value.toLowerCase().contains(lowerCase)) {
                arrayList2.add(cVar3);
            }
        }
        arrayList3.removeAll(arrayList2);
        for (C4403w.C4406c cVar4 : arrayList3) {
            if (cVar4.f14593b) {
                int constructor3 = cVar4.f14592a.value.getConstructor();
                if (constructor3 != -249256352) {
                    if (constructor3 == 1906840261 && cVar4.f14593b && m33030Lg(cVar4.m27791a(this.f9726E0.f14589c.f14598b), lowerCase)) {
                        arrayList2.add(cVar4);
                    }
                } else if (cVar4.f14593b && cVar4.m27790b().value.toLowerCase().contains(lowerCase)) {
                    arrayList2.add(cVar4);
                }
            }
        }
        m33035Gg(arrayList2, this.f9727F0);
    }

    @Override
    public void mo31317G1(C4403w.C4405b bVar, C4403w.C4406c cVar) {
        this.f30167b.m2270r4().m14783o(new TdApi.SetCustomLanguagePackString(bVar.f14587a.f25405id, cVar.f14593b ? cVar.f14592a : new TdApi.LanguagePackString(cVar.m27789c(), C4403w.m27879g())), this.f30167b.m2392ja());
        String c = cVar.m27789c();
        char c2 = 65535;
        int hashCode = c.hashCode();
        if (hashCode != -412800396) {
            if (hashCode != -412485870) {
                if (hashCode == 1441529497 && c.equals("language_nameInEnglish")) {
                    c2 = 1;
                }
            } else if (c.equals("language_name")) {
                c2 = 0;
            }
        } else if (c.equals("language_code")) {
            c2 = 2;
        }
        if (c2 == 0) {
            m33026Pg();
            m9131x9().f9732b.mo33025L5(bVar.f14587a);
        } else if (c2 == 1) {
            m9131x9().f9732b.mo33025L5(bVar.f14587a);
        }
        if (c.startsWith("language_")) {
            this.f9728G0 = true;
        } else if (C4403w.m27860k2().equals(bVar.f14587a.f25405id)) {
            C10930q6 q6Var = this.f30167b;
            String str = bVar.f14587a.f25405id;
            TdApi.LanguagePackString[] languagePackStringArr = new TdApi.LanguagePackString[1];
            languagePackStringArr[0] = cVar.f14593b ? cVar.f14592a : new TdApi.LanguagePackString(cVar.m27789c(), C4403w.m27879g());
            q6Var.m2279qb(new TdApi.UpdateLanguagePackStrings("android_x", str, languagePackStringArr), false);
        }
        this.f9725D0.m34133r3(cVar);
        m33027Og();
    }

    @Override
    public View mo8869G9() {
        return this.f9729H0;
    }

    public final void m33035Gg(java.util.List<p082fd.C4403w.C4406c> r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC2916qa.m33035Gg(java.util.List, boolean):void");
    }

    @Override
    public void mo419J(int i, View view) {
        if (i != R.id.menu_btn_toggle) {
            super.mo419J(i, view);
        } else if (this.f9726E0 != null) {
            this.f9727F0 = !this.f9727F0;
            m33027Og();
            m31303kg().m39496D1();
            m33028Ng();
            C4403w.C4405b bVar = this.f9726E0;
            if (bVar != null) {
                m33035Gg(bVar.f14590d, this.f9727F0);
            }
        }
    }

    @Override
    public boolean mo9409Je() {
        return true;
    }

    public final void m33028Ng() {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            d1Var.m10097P3(mo418W9(), R.id.menu_btn_toggle, 0, this.f9727F0 ? R.drawable.baseline_indeterminate_check_box_24 : R.drawable.baseline_check_box_outline_blank_24);
        }
    }

    public final void m33027Og() {
        String str;
        int e = this.f9726E0.m27795e();
        int size = this.f9726E0.f14590d.size();
        C9289s sVar = this.f9729H0;
        if (this.f9727F0) {
            str = C4403w.m27844o2(R.string.TranslationsMissing, e);
        } else {
            int i = size - e;
            str = C4403w.m27865j1(R.string.format_languageStatus, C4403w.m27844o2(R.string.xStrings, i), Integer.valueOf((int) Math.floor((i / size) * 100.0f)));
        }
        sVar.setSubtitle(str);
    }

    public final void m33026Pg() {
        this.f9729H0.setTitle(m9131x9().f9731a.nativeName);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_strings;
    }

    @Override
    public void mo9343T5(int i, int i2) {
        if (i == 0) {
            this.f9726E0.m27792h();
        } else if (i == 2) {
            Iterator<C4403w.C4406c> it = this.f9726E0.f14590d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4403w.C4406c next = it.next();
                if (C4403w.m27829s1(next.m27789c()) == i2) {
                    next.m27787e(this.f9726E0);
                    break;
                }
            }
        }
        m33027Og();
        super.mo9343T5(i, i2);
    }

    @Override
    public int mo418W9() {
        return R.id.menu_editLangPack;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(this.f9727F0 ? R.string.ToolsUntranslatedTitle : R.string.ToolsAllTitle);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (this.f9728G0) {
            this.f30167b.m2270r4().m14783o(new TdApi.SetAlarm(), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2916qa.this.m33034Hg(object);
                }
            });
            this.f9728G0 = false;
        }
    }

    @Override
    public boolean mo9270dc() {
        return this.f9726E0 == null;
    }

    @Override
    public int mo415la() {
        return R.id.menu_clear;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_string) {
            final C4403w.C4406c cVar = (C4403w.C4406c) ((C2964ra) view.getTag()).m32844d();
            if (m9131x9().f9731a.f25405id.startsWith("X")) {
                m9234id();
                C3183v6 v6Var = new C3183v6(this.f30165a, this.f30167b);
                v6Var.m9476Ad(new C3183v6.C3185b(this, this.f9726E0, cVar));
                m9291ac(v6Var);
                return;
            }
            C5320c cVar2 = new C5320c(3);
            C5320c cVar3 = new C5320c(3);
            C5146u0 u0Var = new C5146u0(3);
            cVar2.m23284a(R.id.btn_string);
            u0Var.m23816a(R.string.ToolsOpenOnPlatform);
            cVar3.m23284a(R.drawable.baseline_open_in_browser_24);
            cVar2.m23284a(R.id.btn_copyLink);
            u0Var.m23816a(R.string.CopyLink);
            cVar3.m23284a(R.drawable.baseline_link_24);
            if (cVar.f14592a.value instanceof TdApi.LanguagePackStringValueOrdinary) {
                cVar2.m23284a(R.id.btn_copyText);
                u0Var.m23816a(R.string.ToolsCopyString);
                cVar3.m23284a(R.drawable.baseline_content_copy_24);
            }
            cVar2.m23284a(R.id.btn_open);
            u0Var.m23816a(R.string.ToolsShowToast);
            cVar3.m23284a(R.drawable.baseline_visibility_24);
            String str = cVar.f14592a.key;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(new C5132o(C1389o.m37261h(), R.id.theme_color_textNeutral).m23852j(new TdApi.TextEntityTypeItalic()), 0, str.length(), 33);
            m9261ee(Spannable.Factory.getInstance().newSpannable(spannableStringBuilder), cVar2.m23280e(), u0Var.m23813d(), null, cVar3.m23280e(), new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean Ig;
                    Ig = View$OnClickListenerC2916qa.this.m33033Ig(cVar, view2, i);
                    return Ig;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23934b(this, i);
                }
            });
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_clear) {
            d1Var.m10096Q1(linearLayout, mo9237ia(), mo9472B9());
        } else if (i != R.id.menu_editLangPack) {
            super.mo414p0(i, d1Var, linearLayout);
        } else {
            d1Var.m10104N1(linearLayout, R.id.menu_btn_toggle, R.drawable.baseline_check_box_outline_blank_24, R.id.theme_color_headerIcon, this, C1357a0.m37541i(49.0f));
            d1Var.m10054i2(linearLayout, this);
        }
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        C9289s sVar = new C9289s(context);
        this.f9729H0 = sVar;
        sVar.setThemedTextColor(this);
        this.f9729H0.m9632D1(C1357a0.m37541i(49.0f) * 2, true);
        m33026Pg();
        this.f9729H0.setSubtitle(m9131x9().f9731a.name);
        this.f9725D0 = new C2917a(this);
        customRecyclerView.setItemAnimator(null);
        customRecyclerView.setAdapter(this.f9725D0);
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2916qa.this.m33031Kg();
            }
        });
    }

    @Override
    public void mo409xc() {
        m33035Gg(this.f9726E0.f14590d, this.f9727F0);
    }
}
