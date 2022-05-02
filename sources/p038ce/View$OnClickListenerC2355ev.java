package p038ce;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1363c0;
import be.C1379j0;
import be.C1408x;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.View$OnFocusChangeListenerC7069y1;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.View$OnClickListenerC2916qa;
import p038ce.x00;
import p053dd.C4007j;
import p053dd.C4012k;
import p066eb.AbstractC4178a;
import p066eb.C4180b;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5132o;
import p139jb.AbstractC5917i;
import p193nb.C7321e;
import p350yd.C10930q6;
import p364zd.C11524j;
import tc.C9137c;
import td.AbstractC9323v4;

public class View$OnClickListenerC2355ev extends AbstractC3204vo<Void> implements View.OnClickListener, View$OnClickListenerC2916qa.AbstractC2919c, View.OnLongClickListener {
    public C2546iq f8066D0;
    public boolean f8067E0;
    public TdApi.LanguagePackInfo f8068F0;

    public class C2356a extends C2546iq {
        public C2356a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32835j() == R.id.language) {
                TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) raVar.m32844d();
                cVar.m10206a2(View$OnClickListenerC2355ev.this.f8068F0 == languagePackInfo, z);
                cVar.m10216O1().m18178c(languagePackInfo.f25405id.equals(C4403w.m27860k2()), z);
                if (C7321e.m16972X0(languagePackInfo)) {
                    cVar.setName(View$OnClickListenerC2355ev.m35043Rh(languagePackInfo.nativeName));
                    String Rh = View$OnClickListenerC2355ev.m35043Rh(languagePackInfo.name);
                    int floor = (int) Math.floor((languagePackInfo.translatedStringCount / languagePackInfo.totalStringCount) * 100.0f);
                    if (C7321e.m16953e1(languagePackInfo) || floor == 100) {
                        cVar.setData(Rh);
                    } else {
                        cVar.setData(C4403w.m27865j1(R.string.format_languageStatus, Rh, Integer.valueOf(floor)));
                    }
                } else {
                    if (raVar.m32851Z(languagePackInfo.nativeName)) {
                        cVar.setName(languagePackInfo.nativeName);
                    }
                    cVar.setData(languagePackInfo.name);
                }
            }
        }
    }

    public class C2357b implements C4007j.AbstractC4009b {
        public C2357b() {
        }

        @Override
        public void mo9527a(RecyclerView.AbstractC0886d0 d0Var) {
            C2964ra raVar = (C2964ra) d0Var.f3479a.getTag();
            if (raVar != null) {
                View$OnClickListenerC2355ev.this.m35037Uh(raVar);
            }
        }

        @Override
        public boolean mo9526b(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i) {
            TdApi.LanguagePackInfo languagePackInfo;
            C2964ra raVar = (C2964ra) d0Var.f3479a.getTag();
            return raVar != null && raVar.m32835j() == R.id.language && (languagePackInfo = (TdApi.LanguagePackInfo) raVar.m32844d()) != null && languagePackInfo.f25405id.startsWith("X");
        }

        @Override
        public float mo9525e() {
            return C4012k.m29329a(this);
        }
    }

    public class C2358c extends AbstractC4178a {
        public C2358c() {
        }

        @Override
        public boolean mo25355a(char c) {
            return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == '-';
        }
    }

    public View$OnClickListenerC2355ev(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m35075Bh() {
        if (!m9347Sa()) {
            m35024hh();
        }
    }

    public void m35073Ch(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f30167b.m2485dd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2355ev.this.m35075Bh();
            }
        }, 200L);
    }

    public void m35071Dh(TdApi.LanguagePackInfo languagePackInfo) {
        View$OnClickListenerC2916qa qaVar = new View$OnClickListenerC2916qa(this.f30165a, this.f30167b);
        qaVar.m9476Ad(new View$OnClickListenerC2916qa.C2918b(languagePackInfo, this));
        m9291ac(qaVar);
    }

    public void m35069Eh(Runnable runnable) {
        if (!m9347Sa()) {
            runnable.run();
        }
    }

    public void m35067Fh(final Runnable runnable, boolean z) {
        if (z) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2355ev.this.m35069Eh(runnable);
                }
            });
        }
    }

    public void m35065Gh(final C2964ra raVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2355ev.this.m35061Ih(raVar);
                }
            });
        }
    }

    public void m35063Hh(TdApi.LanguagePackInfo languagePackInfo, Client.AbstractC7865g gVar) {
        this.f30167b.m2270r4().m14783o(new TdApi.DeleteLanguagePack(languagePackInfo.f25405id), gVar);
    }

    public void m35061Ih(C2964ra raVar) {
        int H0;
        if (!m9347Sa() && (H0 = this.f8066D0.m34235H0(raVar)) != -1) {
            int i = H0 - 1;
            C2964ra raVar2 = this.f8066D0.m34240F0().get(H0 + 1);
            if (this.f8066D0.m34240F0().get(i).m32876A() == 11) {
                this.f8066D0.m34204V1(i, 2);
            } else if (raVar2.m32876A() == 11) {
                this.f8066D0.m34204V1(H0, 2);
            } else {
                this.f8066D0.m34204V1(H0 - 2, 6);
            }
        }
    }

    public void m35057Kh(final TdApi.LanguagePackInfo languagePackInfo, boolean z) {
        if (z) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2355ev.this.m35059Jh(languagePackInfo);
                }
            });
        }
    }

    public boolean m35055Lh(final TdApi.LanguagePackInfo languagePackInfo, C2964ra raVar, View view, int i) {
        switch (i) {
            case R.id.btn_delete:
                m35037Uh(raVar);
                return true;
            case R.id.btn_help:
                m35049Oh();
                return true;
            case R.id.btn_new:
                m35024hh();
                return true;
            case R.id.btn_share:
                if (C7321e.m16950f1(languagePackInfo) || languagePackInfo.f25405id.equals(C4403w.m27860k2())) {
                    m35059Jh(languagePackInfo);
                    return true;
                }
                this.f30167b.m2794Jc(languagePackInfo, new AbstractC5917i() {
                    @Override
                    public final void mo1322a(boolean z) {
                        View$OnClickListenerC2355ev.this.m35057Kh(languagePackInfo, z);
                    }
                });
                return true;
            case R.id.btn_shareLink:
                this.f30167b.m2485dd().m3588f8(this, languagePackInfo);
                return true;
            case R.id.btn_view:
                m35047Ph(languagePackInfo);
                return true;
            default:
                return true;
        }
    }

    public boolean m35053Mh(C2964ra raVar, TdApi.LanguagePackInfo languagePackInfo, View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        m35041Sh(raVar, languagePackInfo);
        return true;
    }

    public static C2964ra m35051Nh(TdApi.LanguagePackInfo languagePackInfo) {
        return new C2964ra(90, (int) R.id.language, 0, (CharSequence) languagePackInfo.nativeName, false).m32870G(languagePackInfo);
    }

    public static String m35043Rh(String str) {
        int length;
        if (str.endsWith(" (raw)")) {
            length = str.length() - 6;
        } else if (!str.endsWith(" (beta)")) {
            return str;
        } else {
            length = str.length() - 7;
        }
        return str.substring(0, length);
    }

    public static int m35021kh(TdApi.LanguagePackInfo languagePackInfo) {
        return C7321e.m16953e1(languagePackInfo) ? R.string.LanguageSectionInstalled : C7321e.m16972X0(languagePackInfo) ? R.string.LanguageSectionRaw : R.string.LanguageSectionOfficial;
    }

    public void m35019mh(TdApi.LanguagePackInfo languagePackInfo, Runnable runnable, boolean z, TdApi.LanguagePackInfo languagePackInfo2, boolean z2, boolean z3) {
        if (!m9347Sa()) {
            this.f8068F0 = null;
            this.f8066D0.m34133r3(languagePackInfo);
            if (z3) {
                if (runnable != null) {
                    runnable.run();
                }
                if (z) {
                    m9298Zb();
                    return;
                }
                this.f8066D0.m34133r3(languagePackInfo);
                if (languagePackInfo2 != null) {
                    this.f8066D0.m34133r3(languagePackInfo2);
                }
                if (z2) {
                    C1379j0.m37292y0(R.string.LocalisationApplied, 0);
                }
            }
        }
    }

    public void m35018nh(TdApi.LanguagePackInfo languagePackInfo) {
        if (!m9347Sa()) {
            m35026fh(languagePackInfo);
        }
    }

    public void m35017oh(final TdApi.LanguagePackInfo languagePackInfo, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2355ev.this.m35018nh(languagePackInfo);
                }
            });
        }
    }

    public boolean m35016ph(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        if (!str.matches("[A-Za-z\\-]*")) {
            return false;
        }
        final TdApi.LanguagePackInfo languagePackInfo = new TdApi.LanguagePackInfo("X" + str + "X-android-x-local", null, "Unknown (" + str + ")", "Unknown", C4403w.m27815w(str), false, false, false, true, 0, 0, 0, null);
        if (m35022jh(languagePackInfo.f25405id) != null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new TdApi.LanguagePackString("language_code", new TdApi.LanguagePackStringValueOrdinary(str)));
        String str2 = languagePackInfo.f25405id;
        if (str2.startsWith("X")) {
            int indexOf = str2.indexOf(88, 1);
            if (indexOf == -1) {
                indexOf = str2.length();
            }
            str2 = str2.substring(1, indexOf);
        }
        if (C4403w.m27959N(str2, languagePackInfo)) {
            arrayList.add(new TdApi.LanguagePackString("language_nameInEnglish", new TdApi.LanguagePackStringValueOrdinary(languagePackInfo.name)));
            arrayList.add(new TdApi.LanguagePackString("language_name", new TdApi.LanguagePackStringValueOrdinary(languagePackInfo.nativeName)));
            if (str2.indexOf(45) != -1) {
                arrayList.add(new TdApi.LanguagePackString("language_dateFormatLocale", new TdApi.LanguagePackStringValueOrdinary(str2)));
            }
        }
        languagePackInfo.localStringCount = arrayList.size();
        TdApi.LanguagePackString[] languagePackStringArr = new TdApi.LanguagePackString[arrayList.size()];
        arrayList.toArray(languagePackStringArr);
        this.f30167b.m2270r4().m14783o(new TdApi.SetCustomLanguagePack(languagePackInfo, languagePackStringArr), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2355ev.this.m35017oh(languagePackInfo, object);
            }
        });
        return true;
    }

    public static Object m35015qh(String str, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 == 2) {
            return C4779t2.m25656K4(new TdApi.TextEntityTypeTextUrl(str));
        }
        return null;
    }

    public boolean m35014rh(TdApi.LanguagePackInfo languagePackInfo, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        if (str.indexOf(47) != -1 && C5070i.m24061i(str.trim())) {
            return false;
        }
        if (!str.endsWith(".xml")) {
            str = str + ".xml";
        }
        TdApi.InputMessageDocument inputMessageDocument = new TdApi.InputMessageDocument(new TdApi.InputFileGenerated(C5070i.m24076B(str), "language_export_" + System.currentTimeMillis() + "_" + languagePackInfo.f25405id, 0), null, false, C4779t2.m25649L4(C4403w.m27873h1(R.string.ToolsExportText, new C4403w.AbstractC4409f() {
            @Override
            public final Object mo379a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
                Object qh;
                qh = View$OnClickListenerC2355ev.m35015qh(r1, charSequence, i, i2, i3, z);
                return qh;
            }
        }, languagePackInfo.nativeName, languagePackInfo.name, "Telegram X")));
        final x00 x00Var = new x00(this.f30165a, this.f30167b);
        x00Var.m30994Vi(new x00.C3281m(inputMessageDocument));
        C1408x.m37088c(y1Var.getEditText());
        this.f30167b.m2485dd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                x00.this.m30960ej();
            }
        }, 200L);
        return true;
    }

    public void m35013sh(final TdApi.LanguagePackInfo languagePackInfo) {
        if (!m9347Sa()) {
            String i1 = C4403w.m27869i1(R.string.FileName);
            CharSequence c0 = C1363c0.m37442c0(C1363c0.m37425l(this, "**" + C4403w.m27869i1(R.string.LocalizationFileNamePlaceholder) + "**.xml", null), R.id.theme_color_text);
            View$OnFocusChangeListenerC7069y1 Pc = m9364Pc(i1, c0, R.string.Share, R.string.Cancel, ("android_x_" + C4403w.m27815w(languagePackInfo.f25405id)) + "_" + C4403w.m27805y1(System.currentTimeMillis(), TimeUnit.MILLISECONDS).replace('/', '.'), new AbstractC9323v4.AbstractC9336m() {
                @Override
                public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                    boolean rh;
                    rh = View$OnClickListenerC2355ev.this.m35014rh(languagePackInfo, y1Var, str);
                    return rh;
                }
            }, true);
            if (Pc != null) {
                Pc.getEditText().setFilters(new InputFilter[]{new C4180b(new char[]{'/'})});
            }
        }
    }

    public void m35012th(final TdApi.LanguagePackInfo languagePackInfo, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == 1172082922) {
            if (((TdApi.LanguagePackStrings) object).strings.length == 0) {
                C1379j0.m37292y0(R.string.LanguageEmpty, 0);
                return;
            }
            for (int i : C4403w.m27890d1()) {
                if (C4403w.m27992E2(C4403w.m27885e1(i), languagePackInfo.f25405id) == null) {
                    C1379j0.m37292y0(R.string.InvalidLocalisation, 0);
                    return;
                }
            }
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2355ev.this.m35013sh(languagePackInfo);
                }
            });
        }
    }

    public void m35011uh(TdApi.LocalizationTargetInfo localizationTargetInfo) {
        if (!m9347Sa()) {
            m35045Qh(localizationTargetInfo);
        }
    }

    public void m35010vh(List list, TdApi.Object object) {
        if (!m9347Sa()) {
            this.f8067E0 = false;
            if (list == null || !list.isEmpty()) {
                m35045Qh(object);
            }
        }
    }

    public void m35009wh(TdApi.LocalizationTargetInfo localizationTargetInfo, final TdApi.Object object) {
        final ArrayList arrayList;
        if (localizationTargetInfo == null || localizationTargetInfo.languagePacks.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            if (object.getConstructor() == -2048670809) {
                TdApi.LanguagePackInfo[] languagePackInfoArr = ((TdApi.LocalizationTargetInfo) object).languagePacks;
                C7321e.m16923o1(languagePackInfoArr, C4403w.m27860k2());
                Collections.addAll(arrayList, languagePackInfoArr);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) arrayList.get(size);
                    TdApi.LanguagePackInfo[] languagePackInfoArr2 = localizationTargetInfo.languagePacks;
                    int length = languagePackInfoArr2.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (languagePackInfoArr2[i].f25405id.equals(languagePackInfo.f25405id)) {
                            arrayList.remove(size);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2355ev.this.m35010vh(arrayList, object);
            }
        });
    }

    public void m35008xh(TdApi.Object object) {
        final TdApi.LocalizationTargetInfo localizationTargetInfo = object.getConstructor() == -2048670809 ? (TdApi.LocalizationTargetInfo) object : null;
        if (localizationTargetInfo != null) {
            TdApi.LanguagePackInfo[] languagePackInfoArr = localizationTargetInfo.languagePacks;
            if (languagePackInfoArr.length > 0) {
                C7321e.m16923o1(languagePackInfoArr, C4403w.m27860k2());
                this.f30167b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2355ev.this.m35011uh(localizationTargetInfo);
                    }
                });
            }
        }
        this.f30167b.m2270r4().m14783o(new TdApi.GetLocalizationTargetInfo(false), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object2) {
                View$OnClickListenerC2355ev.this.m35009wh(localizationTargetInfo, object2);
            }
        });
    }

    public static boolean m35007yh(C2964ra raVar) {
        return raVar.m32876A() == 8 || raVar.m32876A() == 70;
    }

    public static boolean m35006zh(AlertDialog[] alertDialogArr, View view, C5132o oVar) {
        if (alertDialogArr[0] != null) {
            try {
                alertDialogArr[0].dismiss();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_help) {
            m35049Oh();
        }
    }

    @Override
    public void mo33025L5(TdApi.LanguagePackInfo languagePackInfo) {
        this.f8066D0.m34133r3(languagePackInfo);
    }

    public final void m35049Oh() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f30165a, C11524j.m150v());
        builder.setTitle(C4403w.m27869i1(R.string.TranslationMoreTitle));
        builder.setMessage(C1363c0.m37425l(this, C4403w.m27869i1(R.string.TranslationMoreText), new C5132o.AbstractC5133a() {
            @Override
            public final boolean mo490a(View view, C5132o oVar) {
                boolean zh;
                zh = View$OnClickListenerC2355ev.m35006zh(r1, view, oVar);
                return zh;
            }
        }));
        builder.setPositiveButton(C4403w.m27869i1(R.string.TranslationMoreDone), DialogInterface$OnClickListenerC2792nu.f9429a);
        builder.setNeutralButton(C4403w.m27869i1(R.string.TranslationMoreCreate), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC2355ev.this.m35073Ch(dialogInterface, i);
            }
        });
        final AlertDialog[] alertDialogArr = {m9311Xb(m9344Sd(builder), 4)};
    }

    public final void m35047Ph(final TdApi.LanguagePackInfo languagePackInfo) {
        final Runnable euVar = new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2355ev.this.m35071Dh(languagePackInfo);
            }
        };
        if (!C4403w.m27860k2().equals(languagePackInfo.f25405id)) {
            this.f30167b.m2794Jc(languagePackInfo, new AbstractC5917i() {
                @Override
                public final void mo1322a(boolean z) {
                    View$OnClickListenerC2355ev.this.m35067Fh(euVar, z);
                }
            });
        } else {
            euVar.run();
        }
    }

    public final void m35045Qh(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -2048670809) {
            TdApi.LocalizationTargetInfo localizationTargetInfo = (TdApi.LocalizationTargetInfo) object;
            ArrayList arrayList = new ArrayList(localizationTargetInfo.languagePacks.length * 2);
            TdApi.LanguagePackInfo languagePackInfo = null;
            TdApi.LanguagePackInfo[] languagePackInfoArr = localizationTargetInfo.languagePacks;
            int length = languagePackInfoArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                TdApi.LanguagePackInfo languagePackInfo2 = languagePackInfoArr[i];
                if (languagePackInfo != null && (C7321e.m16953e1(languagePackInfo) != C7321e.m16953e1(languagePackInfo2) || (!C7321e.m16953e1(languagePackInfo) && C7321e.m16972X0(languagePackInfo) != C7321e.m16972X0(languagePackInfo2)))) {
                    z = true;
                }
                if (z) {
                    int kh = m35021kh(languagePackInfo2);
                    if (kh != R.string.LanguageSectionOfficial || !arrayList.isEmpty()) {
                        if (!arrayList.isEmpty()) {
                            arrayList.add(new C2964ra(3));
                        }
                        arrayList.add(new C2964ra(arrayList.isEmpty() ? 70 : 8, 0, 0, kh));
                        arrayList.add(new C2964ra(2));
                    }
                    z = false;
                } else {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(m35051Nh(languagePackInfo2));
                i++;
                languagePackInfo = languagePackInfo2;
            }
            arrayList.add(new C2964ra(3));
            this.f8066D0.m34116x2(arrayList, false);
        } else if (constructor == -1679978726) {
            this.f8066D0.m34113y2(new C2964ra[]{new C2964ra(24, 0, 0, (CharSequence) C4779t2.m25378z5(object), false)}, false);
        }
        m9204n9();
    }

    @Override
    public int mo407R9() {
        return R.id.controller_language;
    }

    public final void m35041Sh(final C2964ra raVar, final TdApi.LanguagePackInfo languagePackInfo) {
        final Client.AbstractC7865g quVar = new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2355ev.this.m35065Gh(raVar, object);
            }
        };
        if (languagePackInfo.f25405id.equals(C4403w.m27860k2())) {
            TdApi.LanguagePackInfo jh = !C5070i.m24061i(languagePackInfo.baseLanguagePackId) ? m35022jh(languagePackInfo.baseLanguagePackId) : null;
            if (jh == null) {
                jh = m35022jh(C4403w.m27906a0());
            }
            if (jh != null) {
                m35025gh(jh, false, false, new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2355ev.this.m35063Hh(languagePackInfo, quVar);
                    }
                });
                return;
            }
            return;
        }
        this.f30167b.m2270r4().m14783o(new TdApi.DeleteLanguagePack(languagePackInfo.f25405id), quVar);
    }

    @Override
    public void mo9343T5(int i, int i2) {
        if (C4403w.m27981H1(i, i2)) {
            super.mo9343T5(i, i2);
        } else if (i == 0 || i == 2) {
            m9424Hd(mo9313X9());
            this.f8066D0.m34189a3(C2638ku.f8930a);
        }
    }

    public final boolean m35039Th(final p038ce.C2964ra r17) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC2355ev.m35039Th(ce.ra):boolean");
    }

    public final void m35037Uh(final C2964ra raVar) {
        final TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) raVar.m32844d();
        if (languagePackInfo != null && !languagePackInfo.isOfficial) {
            boolean f1 = C7321e.m16950f1(languagePackInfo);
            CharSequence m1 = C4403w.m27853m1(f1 ? R.string.DeleteLanguageConfirm : R.string.LanguageDeleteConfirm, languagePackInfo.nativeName, languagePackInfo.name, C4779t2.m25687G1(languagePackInfo));
            int[] iArr = {R.id.btn_delete, R.id.btn_cancel};
            String[] strArr = new String[2];
            strArr[0] = C4403w.m27869i1(f1 ? R.string.RemoveLanguage : R.string.LanguageDelete);
            strArr[1] = C4403w.m27869i1(R.string.Cancel);
            m9261ee(m1, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean Mh;
                    Mh = View$OnClickListenerC2355ev.this.m35053Mh(raVar, languagePackInfo, view, i);
                    return Mh;
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
    public int mo418W9() {
        return R.id.menu_help;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(R.string.Language);
    }

    @Override
    public boolean mo9270dc() {
        return this.f8067E0;
    }

    @Override
    public boolean mo9269dd() {
        return true;
    }

    public final void m35026fh(TdApi.LanguagePackInfo languagePackInfo) {
        TdApi.LanguagePackInfo jh = m35022jh(null);
        if (jh != null) {
            C2964ra Nh = m35051Nh(languagePackInfo);
            if (C7321e.m16953e1(jh)) {
                this.f8066D0.m34240F0().add(2, new C2964ra(11));
                this.f8066D0.m34240F0().add(2, Nh);
                this.f8066D0.m39308M(2, 2);
                return;
            }
            this.f8066D0.m34240F0().add(0, new C2964ra(2));
            this.f8066D0.m34240F0().add(0, new C2964ra(8, 0, 0, R.string.LanguageSectionOfficial));
            this.f8066D0.m34240F0().add(0, new C2964ra(3));
            this.f8066D0.m34240F0().add(0, Nh);
            this.f8066D0.m34240F0().add(0, new C2964ra(2));
            this.f8066D0.m34240F0().add(0, new C2964ra(70, 0, 0, R.string.LanguageSectionInstalled));
            this.f8066D0.m39308M(0, 6);
            ((LinearLayoutManager) m31303kg().getLayoutManager()).m39522z2(0, 0);
        }
    }

    public final void m35025gh(final TdApi.LanguagePackInfo languagePackInfo, final boolean z, final boolean z2, final Runnable runnable) {
        TdApi.LanguagePackInfo languagePackInfo2 = this.f8068F0;
        if (languagePackInfo2 != languagePackInfo) {
            this.f8068F0 = languagePackInfo;
            if (languagePackInfo2 != null) {
                this.f8066D0.m34133r3(languagePackInfo2);
            }
            final TdApi.LanguagePackInfo jh = m35022jh(C4403w.m27860k2());
            if (languagePackInfo != null) {
                this.f8066D0.m34133r3(languagePackInfo);
                this.f30167b.m2757M1(languagePackInfo, new AbstractC5917i() {
                    @Override
                    public final void mo1322a(boolean z3) {
                        View$OnClickListenerC2355ev.this.m35019mh(languagePackInfo, runnable, z, jh, z2, z3);
                    }
                }, true);
            }
        }
    }

    public final void m35024hh() {
        View$OnFocusChangeListenerC7069y1 Pc = m9364Pc(C4403w.m27869i1(R.string.LocalizationCreateTitle), C1363c0.m37442c0(C1363c0.m37425l(this, C4403w.m27869i1(R.string.ToolsLocalePlaceholder), null), R.id.theme_color_text), R.string.LocalizationCreateDone, R.string.Cancel, null, new AbstractC9323v4.AbstractC9336m() {
            @Override
            public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                boolean ph;
                ph = View$OnClickListenerC2355ev.this.m35016ph(y1Var, str);
                return ph;
            }
        }, true);
        if (Pc != null) {
            Pc.getEditText().setFilters(new InputFilter[]{new C2358c(), new InputFilter.LengthFilter(46)});
        }
    }

    public final void m35059Jh(final TdApi.LanguagePackInfo languagePackInfo) {
        this.f30167b.m2270r4().m14783o(new TdApi.GetLanguagePackStrings(languagePackInfo.f25405id, null), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2355ev.this.m35012th(languagePackInfo, object);
            }
        });
    }

    public final TdApi.LanguagePackInfo m35022jh(String str) {
        for (C2964ra raVar : this.f8066D0.m34240F0()) {
            if (raVar.m32835j() == R.id.language) {
                TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) raVar.m32844d();
                if (str == null || languagePackInfo.f25405id.equals(str)) {
                    return languagePackInfo;
                }
            }
        }
        return null;
    }

    public final boolean m35020lh() {
        C2546iq iqVar = this.f8066D0;
        if (iqVar == null) {
            return false;
        }
        List<C2964ra> F0 = iqVar.m34240F0();
        for (int size = F0.size() - 1; size >= 0; size--) {
            C2964ra raVar = F0.get(size);
            if (raVar.m32835j() == R.id.language && C7321e.m16972X0((TdApi.LanguagePackInfo) raVar.m32844d())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.language) {
            TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) ((C2964ra) view.getTag()).m32844d();
            String k2 = C4403w.m27860k2();
            if (!k2.equals(languagePackInfo.f25405id)) {
                m35025gh(languagePackInfo, !C7321e.m16953e1(languagePackInfo) && !C7321e.m16972X0(languagePackInfo) && !k2.startsWith("X") && !k2.endsWith("-raw"), true, null);
            } else if (C7321e.m16972X0(languagePackInfo) || C7321e.m16953e1(languagePackInfo) || m35020lh()) {
                m35039Th((C2964ra) view.getTag());
            } else {
                m9298Zb();
            }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() != R.id.language) {
            return false;
        }
        TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) ((C2964ra) view.getTag()).m32844d();
        return (!C7321e.m16972X0(languagePackInfo) || languagePackInfo.f25405id.equals(C4403w.m27860k2()) || m35020lh()) && m35039Th((C2964ra) view.getTag());
    }

    @Override
    public boolean mo31074pg() {
        return true;
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        C2356a aVar = new C2356a(this);
        this.f8066D0 = aVar;
        aVar.m34238F2(this);
        customRecyclerView.setAdapter(this.f8066D0);
        this.f8067E0 = true;
        this.f30167b.m2270r4().m14783o(new TdApi.GetLocalizationTargetInfo(true), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2355ev.this.m35008xh(object);
            }
        });
        C4007j.m29342a(customRecyclerView, new C2357b());
    }

    @Override
    public long mo9125y9(boolean z) {
        return 300L;
    }
}
