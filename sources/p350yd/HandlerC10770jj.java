package p350yd;

import ad.AbstractView$OnClickListenerC0259c;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1405v;
import cd.View$OnClickListenerC2096i;
import de.View$OnClickListenerC4045k;
import gd.AbstractC4761s4;
import gd.C4609c7;
import gd.C4737p7;
import gd.C4779t2;
import gd.C4822w2;
import ge.C4868i;
import id.C5337d;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lb.EnumC6459p;
import me.C6924j2;
import me.C6941k2;
import me.C6957m1;
import me.C7057w;
import me.View$OnClickListenerC6999q1;
import me.View$OnFocusChangeListenerC7069y1;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import p038ce.AbstractView$OnClickListenerC3344yb;
import p038ce.C2125ac;
import p038ce.C2139ap;
import p038ce.C2536ii;
import p038ce.C2546iq;
import p038ce.C2760nb;
import p038ce.C2964ra;
import p038ce.C3033s4;
import p038ce.C3365yo;
import p038ce.View$OnClickListenerC2107a0;
import p038ce.View$OnClickListenerC2118a7;
import p038ce.View$OnClickListenerC2265cy;
import p038ce.View$OnClickListenerC2325e7;
import p038ce.View$OnClickListenerC2355ev;
import p038ce.View$OnClickListenerC2359ew;
import p038ce.View$OnClickListenerC2364ez;
import p038ce.View$OnClickListenerC2393fk;
import p038ce.View$OnClickListenerC2461gw;
import p038ce.View$OnClickListenerC2639kv;
import p038ce.View$OnClickListenerC2665lj;
import p038ce.View$OnClickListenerC2714mi;
import p038ce.View$OnClickListenerC2805o4;
import p038ce.View$OnClickListenerC2855p0;
import p038ce.View$OnClickListenerC2899pz;
import p038ce.View$OnClickListenerC2937qp;
import p038ce.View$OnClickListenerC2971rh;
import p038ce.View$OnClickListenerC3021s;
import p038ce.View$OnClickListenerC3038s6;
import p038ce.View$OnClickListenerC3043s8;
import p038ce.View$OnClickListenerC3062so;
import p038ce.View$OnClickListenerC3141u7;
import p038ce.View$OnClickListenerC3147u9;
import p038ce.View$OnClickListenerC3217vt;
import p038ce.View$OnLongClickListenerC2502hx;
import p038ce.g20;
import p038ce.x00;
import p082fd.C4383l;
import p082fd.C4403w;
import p082fd.C4411y;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5132o;
import p111he.C5146u0;
import p111he.View$OnTouchListenerC5103c0;
import p124ib.C5320c;
import p139jb.AbstractC5914f;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5920l;
import p139jb.AbstractRunnableC5910b;
import p143k0.C6035e;
import p156kd.C6250i;
import p193nb.C7316a;
import p193nb.C7317b;
import p193nb.C7319d;
import p193nb.C7321e;
import p194nd.View$OnClickListenerC7430j1;
import p350yd.HandlerC10770jj;
import p363zc.C11504x;
import p364zd.AbstractC11531p;
import p364zd.C11514c0;
import p364zd.C11524j;
import p364zd.C11529n;
import p364zd.C11530o;
import p364zd.C11533r;
import p364zd.C11541z;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9180e2;
import td.C9188f2;
import td.C9262p0;
import td.C9270q1;
import td.C9312u1;
import td.C9357x2;
import td.View$OnClickListenerC9170d1;
import vc.C9903a;

public class HandlerC10770jj extends Handler {
    public final C10930q6 f34459a;
    public C6924j2 f34460b;
    public List<Runnable> f34461c;

    public class C10771a extends AbstractRunnableC5910b {
        public final TdApi.Chat[] f34462M;
        public final AbstractC9323v4 f34463N;
        public final TdApi.Error[] f34464O;

        public C10771a(TdApi.Chat[] chatArr, AbstractC9323v4 v4Var, TdApi.Error[] errorArr) {
            this.f34462M = chatArr;
            this.f34463N = v4Var;
            this.f34464O = errorArr;
        }

        @Override
        public void mo1364b() {
            TdApi.Chat[] chatArr = this.f34462M;
            if (chatArr[0] != null) {
                HandlerC10770jj.this.m3881C4(this.f34463N, chatArr[0], null);
                return;
            }
            TdApi.Error[] errorArr = this.f34464O;
            if (errorArr[0] != null) {
                C1379j0.m37302t0(errorArr[0]);
            }
        }
    }

    public class C10772b implements View$OnClickListenerC2805o4.AbstractC2815j {
        public final long f34466a;

        public C10772b(long j) {
            this.f34466a = j;
        }

        @Override
        public void mo3382a(C10780j jVar) {
            C3033s4.m32020c(this, jVar);
        }

        @Override
        public int mo3381b() {
            return R.string.BotInvite;
        }

        @Override
        public Object mo3380c() {
            return C3033s4.m32022a(this);
        }

        @Override
        public boolean mo3379d(TdApi.Chat chat, Runnable runnable) {
            if (!HandlerC10770jj.this.f34459a.m2160y2(chat)) {
                C1379j0.m37292y0(R.string.YouCantInviteMembers, 0);
                return false;
            }
            if (chat.type.getConstructor() == 1579049844) {
                HandlerC10770jj.this.f34459a.m2270r4().m14783o(new TdApi.AddChatMember(chat.f25367id, this.f34466a, 0), HandlerC10770jj.this.f34459a.m2392ja());
            } else if (chat.type.getConstructor() != -1472570774) {
                return false;
            } else {
                HandlerC10770jj.this.f34459a.m2270r4().m14783o(new TdApi.AddChatMembers(chat.f25367id, new long[]{this.f34466a}), HandlerC10770jj.this.f34459a.m2392ja());
            }
            return true;
        }
    }

    public class C10773c implements View$OnClickListenerC2805o4.AbstractC2815j {
        public final boolean f34468a;
        public final C4822w2 f34469b;

        public C10773c(boolean z, C4822w2 w2Var) {
            this.f34468a = z;
            this.f34469b = w2Var;
        }

        public void m3386f(Runnable runnable, TdApi.Object object) {
            if (object.getConstructor() != 1829953909 || !C4779t2.m25506h3(((TdApi.ChatMember) object).status)) {
                C1379j0.m37292y0(R.string.YouCantInviteMembers, 0);
            } else {
                HandlerC10770jj.this.f34459a.m2485dd().post(runnable);
            }
        }

        @Override
        public void mo3382a(C10780j jVar) {
            C3033s4.m32020c(this, jVar);
        }

        @Override
        public int mo3381b() {
            return this.f34468a ? R.string.GameInvite : R.string.BotInvite;
        }

        @Override
        public Object mo3380c() {
            return this.f34469b;
        }

        @Override
        public boolean mo3379d(TdApi.Chat chat, final Runnable runnable) {
            if (!HandlerC10770jj.this.f34459a.m2220u6(chat)) {
                C1379j0.m37292y0(R.string.YouCantSendMessages, 0);
                return false;
            } else if (this.f34468a || HandlerC10770jj.this.f34459a.m2160y2(chat)) {
                return true;
            } else {
                HandlerC10770jj.this.f34459a.m2270r4().m14783o(new TdApi.GetChatMember(chat.f25367id, new TdApi.MessageSenderUser(this.f34469b.m25156b())), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        HandlerC10770jj.C10773c.this.m3386f(runnable, object);
                    }
                });
                return false;
            }
        }
    }

    public class C10774d extends AbstractRunnableC5910b {
        public final AtomicBoolean f34471M;
        public final Uri f34472N;
        public final AbstractC10664f9 f34473O;
        public final C10788q f34474P;
        public final int f34475Q;
        public final AtomicReference f34476R;
        public final boolean f34477S;
        public final String f34478T;

        public C10774d(AtomicBoolean atomicBoolean, Uri uri, AbstractC10664f9 f9Var, C10788q qVar, int i, AtomicReference atomicReference, boolean z, String str) {
            this.f34471M = atomicBoolean;
            this.f34472N = uri;
            this.f34473O = f9Var;
            this.f34474P = qVar;
            this.f34475Q = i;
            this.f34476R = atomicReference;
            this.f34477S = z;
            this.f34478T = str;
        }

        @Override
        public void mo1364b() {
            List<String> pathSegments;
            if (!this.f34471M.getAndSet(true)) {
                if (HandlerC10770jj.this.f34459a.m2598W6(this.f34472N.getHost(), false) && (pathSegments = this.f34472N.getPathSegments()) != null && pathSegments.size() == 1 && "iv".equals(pathSegments.get(0))) {
                    String queryParameter = this.f34472N.getQueryParameter("url");
                    if (C1363c0.m37457Q(queryParameter)) {
                        HandlerC10770jj.this.m3858E7(this.f34473O, queryParameter, new C10788q(this.f34474P).m3326e());
                        return;
                    }
                }
                if (this.f34475Q == 0) {
                    TdApi.WebPage webPage = (TdApi.WebPage) this.f34476R.get();
                    AbstractC10664f9 f9Var = this.f34473O;
                    if ((f9Var instanceof AbstractC9323v4) && webPage != null && AbstractView$OnClickListenerC0259c.m41987S1((AbstractC9323v4) f9Var, webPage, this.f34477S)) {
                        return;
                    }
                }
                C1379j0.m37336c0(this.f34478T);
            }
        }
    }

    public class C10775e implements C6957m1.AbstractC6962e {
        public final long f34480M;
        public final C4737p7 f34481N;
        public final Runnable f34483a;
        public final AbstractC9323v4 f34484b;
        public final TdApi.ChatList f34485c;

        public C10775e(Runnable runnable, AbstractC9323v4 v4Var, TdApi.ChatList chatList, long j, C4737p7 p7Var) {
            this.f34483a = runnable;
            this.f34484b = v4Var;
            this.f34485c = chatList;
            this.f34480M = j;
            this.f34481N = p7Var;
        }

        @Override
        public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
        }

        @Override
        public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
            if (i == R.id.btn_selectChat) {
                this.f34483a.run();
            } else {
                HandlerC10770jj.this.m3798K7(this.f34484b, this.f34485c, this.f34480M, this.f34481N, i, null);
            }
        }
    }

    public class C10776f implements AbstractC9323v4.AbstractC9335l {
        public final int f34486a;
        public final Runnable f34487b;

        public C10776f(int i, Runnable runnable) {
            this.f34486a = i;
            this.f34487b = runnable;
        }

        @Override
        public void mo3383a(AbstractC9323v4<?> v4Var, boolean z) {
            if (z) {
                v4Var.m9193od(this);
                HandlerC10770jj.this.m3847F8(v4Var, this.f34486a, this.f34487b);
            }
        }
    }

    public class C10777g implements View$OnClickListenerC2805o4.AbstractC2815j {
        public final String f34489a;
        public final String f34490b;
        public final boolean f34491c;

        public C10777g(String str, String str2, boolean z) {
            this.f34489a = str;
            this.f34490b = str2;
            this.f34491c = z;
        }

        @Override
        public void mo3382a(C10780j jVar) {
            if (this.f34491c) {
                jVar.m3368h();
            }
        }

        @Override
        public int mo3381b() {
            return C3033s4.m32021b(this);
        }

        @Override
        public Object mo3380c() {
            return new C4609c7(this.f34489a, this.f34490b);
        }

        @Override
        public boolean mo3379d(TdApi.Chat chat, Runnable runnable) {
            if (HandlerC10770jj.this.f34459a.m2220u6(chat)) {
                return true;
            }
            C1379j0.m37292y0(R.string.YouCantSendMessages, 0);
            return false;
        }
    }

    public class C10778h implements C3365yo.AbstractC3367b {
        public final CharSequence f34493a;
        public final TdApi.Function f34494b;
        public final AbstractC5918j f34495c;

        public C10778h(CharSequence charSequence, TdApi.Function function, AbstractC5918j jVar) {
            this.f34493a = charSequence;
            this.f34494b = function;
            this.f34495c = jVar;
        }

        @Override
        public void mo3378a(String str, AbstractC5917i iVar) {
            if (C5070i.m24061i(str)) {
                iVar.mo1322a(false);
                return;
            }
            int constructor = this.f34494b.getConstructor();
            if (constructor == -964543587) {
                ((TdApi.ReportChat) this.f34494b).text = str;
            } else if (constructor == 734652708) {
                ((TdApi.ReportChatPhoto) this.f34494b).text = str;
            }
            iVar.mo1322a(true);
            this.f34495c.mo1330a(this.f34494b);
        }

        @Override
        public CharSequence mo3377b() {
            return this.f34493a;
        }

        @Override
        public int mo3376c() {
            return R.string.ReportReasonDescription;
        }
    }

    public class C10779i implements AbstractC5117h0 {
        public final String f34497a;
        public final boolean f34498b;
        public final TdApi.BankCardInfo f34499c;

        public C10779i(String str, boolean z, TdApi.BankCardInfo bankCardInfo) {
            this.f34497a = str;
            this.f34498b = z;
            this.f34499c = bankCardInfo;
        }

        @Override
        public boolean mo493A3(View view, int i) {
            if (i == R.id.btn_openLink) {
                C1405v.m37138E((String) view.getTag());
                return true;
            } else if (i != R.id.btn_copyLink) {
                return true;
            } else {
                C1379j0.m37325i(this.f34497a, R.string.CopiedBankCard);
                return true;
            }
        }

        @Override
        public boolean mo492Q() {
            return C5115g0.m23935a(this);
        }

        @Override
        public Object mo491b2(int i) {
            if (this.f34498b) {
                return this.f34499c.actions[i].url;
            }
            return null;
        }
    }

    public static class C10780j {
        public int f34500a;
        public AbstractC5920l f34501b;
        public Runnable f34502c;
        public Object f34503d;
        public boolean f34504e;
        public int f34505f;
        public C7319d f34506g;
        public C10788q f34507h;
        public TdApi.ChatList f34508i;
        public String f34509j;
        public TdApi.ChatInviteLinkInfo f34510k;
        public C4737p7 f34511l;
        public TdApi.SearchMessagesFilter f34512m;
        public TdApi.InternalLinkTypeVideoChat f34513n;

        public static void m3375a(C10780j jVar) {
            jVar.m3365k();
        }

        public static C10780j m3361o(Bundle bundle, String str) {
            C10780j jVar = new C10780j();
            jVar.f34500a = bundle.getInt(str + "cp_options", 0);
            jVar.f34504e = bundle.getBoolean(str + "cp_highlightSet", false);
            jVar.f34505f = bundle.getInt(str + "cp_highlightMode", 0);
            jVar.f34506g = C4779t2.m25578W4(bundle, str + "cp_highlightMessageId");
            jVar.f34508i = C4779t2.m25583W(bundle.getString(str + "cp_chatList", null));
            jVar.f34511l = C4737p7.m26289l(bundle, str + "cp_messageThread");
            jVar.f34512m = C4779t2.m25584V4(bundle, str + "cp_filter");
            return jVar;
        }

        public C10780j m3374b(AbstractC5920l lVar) {
            this.f34501b = lVar;
            return this;
        }

        public C10780j m3373c() {
            this.f34500a |= 8;
            return this;
        }

        public C10780j m3372d(int i, C7319d dVar) {
            this.f34504e = true;
            this.f34505f = i;
            this.f34506g = dVar;
            return this;
        }

        public C10780j m3371e(C7319d dVar) {
            this.f34504e = true;
            this.f34505f = 1;
            this.f34506g = dVar;
            return this;
        }

        public C10780j m3370f(TdApi.Message message) {
            return m3371e(new C7319d(message.chatId, message.f25406id));
        }

        public C10780j m3369g(String str, TdApi.ChatInviteLinkInfo chatInviteLinkInfo) {
            this.f34509j = str;
            this.f34510k = chatInviteLinkInfo;
            return this;
        }

        public C10780j m3368h() {
            this.f34500a |= 1;
            return this;
        }

        public C10780j m3367i() {
            this.f34500a |= 2;
            return this;
        }

        public C10780j m3366j(Runnable runnable) {
            this.f34502c = runnable;
            return this;
        }

        public final void m3365k() {
            Runnable runnable = this.f34502c;
            if (runnable != null) {
                runnable.run();
                this.f34502c = null;
            }
        }

        public C10780j m3364l() {
            this.f34500a |= 4;
            return this;
        }

        public C10780j m3363m() {
            this.f34500a |= 16;
            return this;
        }

        public C10780j m3362n() {
            this.f34500a |= 32;
            return this;
        }

        public boolean m3360p(Bundle bundle, String str) {
            if (this.f34501b != null || this.f34502c != null || this.f34503d != null) {
                return false;
            }
            if (this.f34500a != 0) {
                bundle.putInt(str + "cp_options", this.f34500a);
            }
            if (this.f34504e) {
                bundle.putBoolean(str + "cp_highlightSet", this.f34504e);
            }
            if (this.f34505f != 0) {
                bundle.putInt(str + "cp_highlightMode", this.f34505f);
            }
            if (this.f34506g != null) {
                C4779t2.m25546b5(bundle, str + "cp_highlightMessageId", this.f34506g);
            }
            if (this.f34508i != null) {
                bundle.putString(str + "cp_chatList", C4779t2.m25456o4(this.f34508i));
            }
            C4737p7 p7Var = this.f34511l;
            if (p7Var != null) {
                p7Var.m26288m(bundle, str + "cp_messageThread");
            }
            if (this.f34512m == null) {
                return true;
            }
            C4779t2.m25553a5(bundle, str + "cp_filter", this.f34512m);
            return true;
        }

        public C10780j m3359q() {
            this.f34500a |= 64;
            return this;
        }

        public C10780j m3358r(Object obj) {
            this.f34503d = obj;
            return this;
        }

        public C10780j m3357s(C10788q qVar) {
            this.f34507h = qVar;
            return this;
        }

        public C10780j m3356t(TdApi.InternalLinkTypeVideoChat internalLinkTypeVideoChat) {
            this.f34513n = internalLinkTypeVideoChat;
            return this;
        }
    }

    public static class C10781k {
        public String[][] f34514a;
        public final Map<String, TdApi.LanguagePackStringValue> f34515b = new HashMap();
        public int f34516c;
        public final String f34517d;
        public String f34518e;

        public C10781k(TdApi.Document document) {
            this.f34517d = document.fileName;
        }

        public boolean m3355a() {
            return !this.f34515b.isEmpty() && this.f34516c < this.f34515b.size() && m3345k();
        }

        public int m3354b() {
            String[][] strArr = this.f34514a;
            return strArr[0].length + strArr[1].length;
        }

        public int m3353c() {
            return (int) Math.floor((m3346j() / m3354b()) * 100.0f);
        }

        public String m3352d() {
            String h = m3348h(R.string.language_code);
            return "X" + h;
        }

        public String m3351e() {
            String h = m3348h(R.string.language_nameInEnglish);
            if (C5070i.m24061i(this.f34517d)) {
                return h;
            }
            StringBuilder sb2 = new StringBuilder(h);
            sb2.append(" [");
            if (this.f34517d.endsWith(".xml")) {
                String str = this.f34517d;
                sb2.append((CharSequence) str, 0, str.length() - 4);
            } else {
                sb2.append(this.f34517d);
            }
            sb2.append("]");
            return sb2.toString();
        }

        public int m3350f() {
            String[] strArr;
            String[] strArr2;
            int b = m3354b() - m3346j();
            if (b > 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.f34514a[0]) {
                    if (this.f34515b.get(str) == null) {
                        arrayList.add(str);
                    }
                }
                for (String str2 : this.f34514a[1]) {
                    if (this.f34515b.get(str2) == null) {
                        arrayList.add(str2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Log.m14724e("Language pack %s misses following strings: %s", this.f34517d, TextUtils.join(", ", arrayList));
                }
            }
            return b;
        }

        public TdApi.LanguagePackStringValue m3349g(int i) {
            return this.f34515b.get(C4403w.m27885e1(i));
        }

        public String m3348h(int i) {
            TdApi.LanguagePackStringValue languagePackStringValue = this.f34515b.get(C4403w.m27885e1(i));
            if (languagePackStringValue instanceof TdApi.LanguagePackStringValueOrdinary) {
                return ((TdApi.LanguagePackStringValueOrdinary) languagePackStringValue).value;
            }
            return null;
        }

        public TdApi.LanguagePackString[] m3347i() {
            TdApi.LanguagePackString[] languagePackStringArr = new TdApi.LanguagePackString[this.f34515b.size()];
            int i = 0;
            for (Map.Entry<String, TdApi.LanguagePackStringValue> entry : this.f34515b.entrySet()) {
                i++;
                languagePackStringArr[i] = new TdApi.LanguagePackString(entry.getKey(), entry.getValue());
            }
            return languagePackStringArr;
        }

        public int m3346j() {
            return this.f34515b.size() - this.f34516c;
        }

        public boolean m3345k() {
            int[] d1;
            boolean z = true;
            for (int i : C4403w.m27890d1()) {
                TdApi.LanguagePackStringValue g = m3349g(i);
                if (!(g instanceof TdApi.LanguagePackStringValueOrdinary)) {
                    Log.m14724e("Language Pack is missing required string: %s", C4403w.m27885e1(i));
                } else {
                    TdApi.LanguagePackStringValueOrdinary languagePackStringValueOrdinary = (TdApi.LanguagePackStringValueOrdinary) g;
                    if (C5070i.m24061i(languagePackStringValueOrdinary.value.trim())) {
                        Log.m14724e("Language Pack required string is empty: %s", C4403w.m27885e1(i));
                    } else {
                        if (i == R.string.language_code && languagePackStringValueOrdinary.value.charAt(0) == 'X') {
                            Log.m14724e("Language Pack language_code starts with 'X': %s", languagePackStringValueOrdinary.value);
                        }
                    }
                }
                z = false;
            }
            return z;
        }

        public boolean m3344l() {
            return m3346j() == m3354b();
        }

        public void m3343m() {
            this.f34514a = C4411y.m27783a();
        }

        public C10781k m3342n(String str) {
            this.f34518e = str;
            return this;
        }
    }

    public interface AbstractC10782l {
        void mo3341a();

        void mo3340b();
    }

    public interface AbstractC10785n {
        void mo3335a(TdApi.Object object);

        void mo3334b(String str);
    }

    public interface AbstractC10786o {
        void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2);
    }

    public static class C10787p {
        public final int f34533a;
        public final String f34534b;

        public C10787p(int i, String str) {
            this.f34533a = i;
            this.f34534b = str;
        }

        public int m3331b() {
            return this.f34533a;
        }

        public String toString() {
            return this.f34534b;
        }
    }

    public HandlerC10770jj(C10930q6 q6Var) {
        super(Looper.getMainLooper());
        this.f34459a = q6Var;
    }

    public static void m3901A4(AbstractC10664f9 f9Var, TdApi.Chat chat, C10780j jVar) {
        m3857E8(f9Var.mo4348c(), R.drawable.baseline_warning_24, C4403w.m27869i1(C4779t2.m25637N2(chat.type) ? R.string.PostNotFound : R.string.MessageNotFound), jVar.f34507h);
        jVar.m3365k();
    }

    public static Object m3900A5(C10783m mVar, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        return i3 == 1 ? new C5132o(null, R.id.theme_color_textLink).m23852j(new TdApi.TextEntityTypeMention()).m23849m(mVar) : C4403w.m27889d2(z);
    }

    public static Object m3899A6(AbstractC9323v4 v4Var, TdApi.ChatInviteLink chatInviteLink, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 == 0) {
            return C4403w.m27872h2(new C10534a9(v4Var.mo4347s(), v4Var.mo4348c()), chatInviteLink.creatorUserId);
        }
        return null;
    }

    public void m3892B3(TdApi.Object object, AbstractC10664f9 f9Var) {
        TdApi.InternalLinkTypeProxy internalLinkTypeProxy = (TdApi.InternalLinkTypeProxy) object;
        String str = internalLinkTypeProxy.server;
        int i = internalLinkTypeProxy.port;
        m3419w7(f9Var, str, i, internalLinkTypeProxy.type, m3619c7(str, Integer.toString(i)).toString());
    }

    public void m3891B4(final p350yd.AbstractC10664f9 r6, final org.drinkless.p210td.libcore.telegram.TdApi.Chat r7, final p350yd.HandlerC10770jj.C10780j r8, org.drinkless.p210td.libcore.telegram.TdApi.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.HandlerC10770jj.m3891B4(yd.f9, org.drinkless.td.libcore.telegram.TdApi$Chat, yd.jj$j, org.drinkless.td.libcore.telegram.TdApi$Object):void");
    }

    public static void m3890B5(AbstractC9323v4 v4Var, C10783m mVar) {
        v4Var.mo4348c().m2485dd().m3403y3(v4Var, mVar);
    }

    public static Object m3889B6(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 == 0) {
            return C4403w.m27889d2(z);
        }
        return null;
    }

    public void m3882C3(final AbstractC10664f9 f9Var, final TdApi.Object object) {
        if (object.getConstructor() == -1313788694) {
            post(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3892B3(object, f9Var);
                }
            });
        }
    }

    public boolean m3880C5(final C10783m mVar, final AbstractC9323v4 v4Var, Runnable runnable, View view, int i) {
        if (i == R.id.btn_done) {
            this.f34459a.m2712Oe().m2006r(mVar.f34522d, 1000L, new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.m3890B5(AbstractC9323v4.this, mVar);
                }
            });
            return true;
        } else if (i != R.id.btn_open) {
            return true;
        } else {
            C7389v0.m16743D2(runnable);
            return true;
        }
    }

    public static boolean m3879C6(Runnable runnable, AbstractC9323v4 v4Var, long j, TdApi.ChatInviteLink chatInviteLink, View view, int i) {
        if (i != R.id.btn_deleteLink) {
            return true;
        }
        if (runnable != null) {
            runnable.run();
        }
        v4Var.mo4348c().m2270r4().m14783o(new TdApi.DeleteRevokedChatInviteLink(j, chatInviteLink.inviteLink), null);
        return true;
    }

    public void m3872D3(final AbstractC10664f9 f9Var, String str) {
        f9Var.mo4348c().m2270r4().m14783o(new TdApi.GetInternalLinkType(str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.this.m3882C3(f9Var, object);
            }
        });
    }

    public static void m3871D4(View$OnClickListenerC2971rh rhVar) {
        AbstractC9323v4<?> se = rhVar.m9164se(rhVar.m9157te() - 2);
        if ((se instanceof C2536ii) && se.mo9464C9() == rhVar.mo9464C9()) {
            rhVar.m9287b9(rhVar.m9157te() - 2);
        }
    }

    public void m3870D5(final C10783m mVar, final Runnable runnable, final AbstractC9323v4 v4Var) {
        CharSequence charSequence;
        int i = 2;
        if (mVar.f34521c != null) {
            C4403w.AbstractC4409f qhVar = new C4403w.AbstractC4409f() {
                @Override
                public final Object mo379a(CharSequence charSequence2, int i2, int i3, int i4, boolean z) {
                    Object A5;
                    A5 = HandlerC10770jj.m3900A5(HandlerC10770jj.C10783m.this, charSequence2, i2, i3, i4, z);
                    return A5;
                }
            };
            charSequence = C4403w.m27873h1(R.string.ThemeInstallAuthor, qhVar, mVar.f34519a, "@" + mVar.f34521c);
        } else {
            charSequence = C4403w.m27853m1(R.string.ThemeInstall, mVar.f34519a);
        }
        CharSequence charSequence2 = charSequence;
        if (runnable != null) {
            i = 3;
        }
        C5320c cVar = new C5320c(i);
        C5320c cVar2 = new C5320c(i);
        C5320c cVar3 = new C5320c(i);
        C5146u0 u0Var = new C5146u0(i);
        cVar.m23284a(R.id.btn_done);
        cVar3.m23284a(R.drawable.baseline_palette_24);
        cVar2.m23284a(3);
        u0Var.m23816a(R.string.ThemeInstallDone);
        if (runnable != null) {
            cVar.m23284a(R.id.btn_open);
            cVar3.m23284a(R.drawable.baseline_open_in_browser_24);
            cVar2.m23284a(1);
            u0Var.m23816a(R.string.Open);
        }
        cVar.m23284a(R.id.btn_cancel);
        cVar3.m23284a(R.drawable.baseline_cancel_24);
        cVar2.m23284a(1);
        u0Var.m23816a(R.string.Cancel);
        if (charSequence2 != null) {
            SpannableStringBuilder spannableStringBuilder = charSequence2 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence2 : new SpannableStringBuilder(charSequence2);
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) C4403w.m27869i1(R.string.ThemeInstallHint));
        }
        v4Var.m9254fe(charSequence2, cVar.m23280e(), u0Var.m23813d(), cVar2.m23280e(), cVar3.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i2) {
                boolean C5;
                C5 = HandlerC10770jj.this.m3880C5(mVar, v4Var, runnable, view, i2);
                return C5;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i2) {
                return C5115g0.m23934b(this, i2);
            }
        }, mVar);
    }

    public static void m3869D6(AbstractC5918j jVar, TdApi.Object object) {
        jVar.mo1330a((TdApi.ChatInviteLinks) object);
    }

    public void m3862E3(AbstractC9323v4 v4Var, final AbstractC10664f9 f9Var) {
        v4Var.m9380Nc(new AbstractC9323v4.C9334k().m9108c(true).m9106e(true).m9110a(false).m9105f(true).m9102i(R.string.ScanQRFullSubtitleProxy).m9107d(2).m9104g(new View$OnClickListenerC4045k.AbstractC4051f() {
            @Override
            public final void mo1772y3(String str) {
                HandlerC10770jj.this.m3872D3(f9Var, str);
            }
        }));
    }

    public static void m3861E4(View$OnClickListenerC2971rh rhVar, boolean z) {
        if (z) {
            rhVar.m32417eq();
        }
    }

    public void m3860E5(org.drinkless.p210td.libcore.telegram.TdApi.File r21, final p139jb.AbstractC5918j r22, final java.lang.Runnable r23, final td.AbstractC9323v4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.HandlerC10770jj.m3860E5(org.drinkless.td.libcore.telegram.TdApi$File, jb.j, java.lang.Runnable, td.v4):void");
    }

    public static void m3859E6(final AbstractC5918j jVar, AbstractC9323v4 v4Var, final TdApi.Object object) {
        if (object.getConstructor() == 112891427 && jVar != null) {
            v4Var.m9135wd(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.m3869D6(AbstractC5918j.this, object);
                }
            });
        }
    }

    public static void m3857E8(final C10930q6 q6Var, final int i, final CharSequence charSequence, final C10788q qVar) {
        C9357x2.C9365h hVar;
        if (charSequence == null) {
            throw new IllegalArgumentException();
        } else if (!C1379j0.m37357K()) {
            q6Var.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.m3857E8(C10930q6.this, i, charSequence, qVar);
                }
            });
        } else if (qVar == null || (hVar = qVar.f34541g) == null || !hVar.m8952p()) {
            C1379j0.m37290z0(charSequence, 0);
        } else if (i == 0) {
            qVar.f34541g.m8971D(q6Var, charSequence).m8918G(3500L, TimeUnit.MILLISECONDS);
        } else {
            new C9357x2.C9365h(qVar.f34541g).m8951q(i).m8971D(q6Var, charSequence).m8918G(3500L, TimeUnit.MILLISECONDS);
        }
    }

    public boolean m3852F3(final AbstractC10664f9 f9Var, final AbstractC9323v4 v4Var, View view, int i) {
        switch (i) {
            case R.id.btn_proxyHttp:
                View$OnClickListenerC2325e7 e7Var = new View$OnClickListenerC2325e7(f9Var.mo4347s(), f9Var.mo4348c());
                e7Var.m9476Ad(new View$OnClickListenerC2325e7.C2329d(3));
                v4Var.m9291ac(e7Var);
                break;
            case R.id.btn_proxyQr:
                postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        HandlerC10770jj.this.m3862E3(v4Var, f9Var);
                    }
                }, 250L);
                break;
            case R.id.btn_proxySocks5:
                View$OnClickListenerC2325e7 e7Var2 = new View$OnClickListenerC2325e7(f9Var.mo4347s(), f9Var.mo4348c());
                e7Var2.m9476Ad(new View$OnClickListenerC2325e7.C2329d(1));
                v4Var.m9291ac(e7Var2);
                break;
            case R.id.btn_proxyTelegram:
                View$OnClickListenerC2325e7 e7Var3 = new View$OnClickListenerC2325e7(f9Var.mo4347s(), f9Var.mo4348c());
                e7Var3.m9476Ad(new View$OnClickListenerC2325e7.C2329d(2));
                v4Var.m9291ac(e7Var3);
                break;
        }
        return true;
    }

    public static void m3851F4(AbstractC5920l lVar, TdApi.Chat chat, AbstractC10664f9 f9Var, final View$OnClickListenerC2971rh rhVar) {
        if (lVar != null) {
            lVar.mo3050a(chat.f25367id);
        }
        f9Var.mo4348c().m2930B4().m4705e0(f9Var.mo4348c().m2188w6(), 3, new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z) {
                HandlerC10770jj.m3861E4(View$OnClickListenerC2971rh.this, z);
            }
        });
    }

    public static boolean m3850F5(C11131y6 y6Var, View view, int i) {
        if (i != R.id.btn_removeAccount) {
            return true;
        }
        y6Var.mo1480c().m2230tc();
        return true;
    }

    public static boolean m3849F6(final AbstractC9323v4 v4Var, long j, TdApi.ChatInviteLink chatInviteLink, final AbstractC5918j jVar, View view, int i) {
        if (i != R.id.btn_revokeLink) {
            return true;
        }
        v4Var.mo4348c().m2270r4().m14783o(new TdApi.RevokeChatInviteLink(j, chatInviteLink.inviteLink), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.m3859E6(AbstractC5918j.this, v4Var, object);
            }
        });
        return true;
    }

    public static void m3840G5(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            C1379j0.m37292y0(R.string.ReportChatSent, 0);
        }
    }

    public boolean m3839G6(final AbstractC9323v4 v4Var, final long j, final TdApi.ChatInviteLink chatInviteLink, final Runnable runnable, final AbstractC5918j jVar, View view, int i) {
        switch (i) {
            case R.id.btn_copyLink:
                C1379j0.m37325i(chatInviteLink.inviteLink, R.string.CopiedLink);
                break;
            case R.id.btn_deleteLink:
                v4Var.m9261ee(C4403w.m27869i1(R.string.AreYouSureDeleteInviteLink), new int[]{R.id.btn_deleteLink, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.InviteLinkDelete), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i2) {
                        boolean C6;
                        C6 = HandlerC10770jj.m3879C6(runnable, v4Var, j, chatInviteLink, view2, i2);
                        return C6;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i2) {
                        return C5115g0.m23934b(this, i2);
                    }
                });
                break;
            case R.id.btn_edit:
                View$OnClickListenerC3038s6 s6Var = new View$OnClickListenerC3038s6(v4Var.mo4347s(), v4Var.mo4348c());
                s6Var.m31975Qf(new View$OnClickListenerC3038s6.C3041c(chatInviteLink, j, (View$OnClickListenerC2855p0) v4Var));
                v4Var.m9291ac(s6Var);
                break;
            case R.id.btn_manageInviteLinks:
                View$OnClickListenerC2855p0 p0Var = new View$OnClickListenerC2855p0(v4Var.mo4347s(), v4Var.mo4348c());
                p0Var.m33192Hh(new View$OnClickListenerC2855p0.C2860d(j, v4Var.mo4348c().m2519ba(), null, null, this.f34459a.m2787K3(j).getConstructor() == -160019714));
                v4Var.m9291ac(p0Var);
                break;
            case R.id.btn_manageJoinRequests:
                View$OnClickListenerC3021s sVar = new View$OnClickListenerC3021s(v4Var.mo4347s(), v4Var.mo4348c());
                sVar.m32117Cg(new View$OnClickListenerC3021s.C3022a(j, chatInviteLink.inviteLink, v4Var));
                v4Var.m9291ac(sVar);
                break;
            case R.id.btn_revokeLink:
                v4Var.m9261ee(C4403w.m27869i1(v4Var.mo4348c().m2784K6(j) ? R.string.AreYouSureRevokeInviteLinkChannel : R.string.AreYouSureRevokeInviteLinkGroup), new int[]{R.id.btn_revokeLink, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.RevokeLink), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_link_off_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i2) {
                        boolean F6;
                        F6 = HandlerC10770jj.m3849F6(AbstractC9323v4.this, j, chatInviteLink, jVar, view2, i2);
                        return F6;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i2) {
                        return C5115g0.m23934b(this, i2);
                    }
                });
                break;
            case R.id.btn_shareLink:
                String Q3 = v4Var.mo4348c().m2691Q3(j);
                String j1 = C4403w.m27865j1(v4Var.mo4348c().m2784K6(j) ? R.string.ShareTextChannelLink : R.string.ShareTextChatLink, Q3, chatInviteLink.inviteLink);
                String j12 = C4403w.m27865j1(R.string.ShareTextLink, Q3, chatInviteLink.inviteLink);
                x00 x00Var = new x00(v4Var.mo4347s(), v4Var.mo4348c());
                x00Var.m30994Vi(new x00.C3281m(j12).m30884E(j1, null));
                x00Var.m30960ej();
                break;
            case R.id.btn_viewInviteLinkMembers:
                AbstractC9323v4<?> a0Var = new View$OnClickListenerC2107a0(v4Var.mo4347s(), v4Var.mo4348c());
                a0Var.m9476Ad(new View$OnClickListenerC2107a0.C2111c(j, chatInviteLink.inviteLink));
                v4Var.m9291ac(a0Var);
                break;
        }
        return true;
    }

    public void m3831H4(AbstractC10664f9 f9Var, C4737p7 p7Var, C10788q qVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -1601123095) {
            m3841G4(f9Var, this.f34459a.m2408ia(object), p7Var, qVar);
        } else if (constructor == -537797015) {
            long j = ((TdApi.User) object).f25439id;
            m3539k7(f9Var, C7316a.m17058c(j), p7Var, new TdApi.CreatePrivateChat(j, false), qVar);
        }
    }

    public static void m3830H5(Runnable runnable, C10930q6 q6Var, TdApi.ReportChat reportChat) {
        if (runnable != null) {
            runnable.run();
        }
        q6Var.m2270r4().m14783o(reportChat, C10613df.f34013a);
    }

    public void m3829H6(TdApi.Object object, AbstractC9323v4 v4Var, long j, boolean z, Runnable runnable, AbstractC5918j jVar, TdApi.ChatInviteLink chatInviteLink) {
        if (object.getConstructor() == -205812476) {
            m3897A8(v4Var, (TdApi.ChatInviteLink) object, j, z, false, runnable, jVar);
        } else {
            m3897A8(v4Var, chatInviteLink, j, z, true, runnable, jVar);
        }
    }

    public static boolean m3823I2(TdApi.Document document) {
        return ((!C5070i.m24061i(document.fileName) && document.fileName.endsWith(".xml")) || (!C5070i.m24061i(document.mimeType) && document.mimeType.equals("application/xml"))) && ((long) document.document.size) <= EnumC6459p.f20158c.mo20395b(1.0d) && C4779t2.m25586V2(document.document);
    }

    public static void m3822I3(boolean z) {
        if (z) {
            C1379j0.m37292y0(R.string.LocalisationApplied, 0);
        }
    }

    public static Object m3821I4(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 == 1) {
            return new C5132o(null, R.id.theme_color_textLink);
        }
        return C4403w.m27889d2(z);
    }

    public static boolean m3820I5(AbstractC9323v4 v4Var, CharSequence charSequence, long j, long[] jArr, final Runnable runnable, final C10930q6 q6Var, View view, int i) {
        m3687V8(v4Var, i, charSequence, new TdApi.ReportChat(j, jArr, null, null), false, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                HandlerC10770jj.m3830H5(runnable, q6Var, (TdApi.ReportChat) obj);
            }
        });
        return true;
    }

    public void m3819I6(final AbstractC9323v4 v4Var, final long j, final boolean z, final Runnable runnable, final AbstractC5918j jVar, final TdApi.ChatInviteLink chatInviteLink, final TdApi.Object object) {
        v4Var.m9135wd(new Runnable() {
            @Override
            public final void run() {
                HandlerC10770jj.this.m3829H6(object, v4Var, j, z, runnable, jVar, chatInviteLink);
            }
        });
    }

    public static boolean m3813J2(TdApi.Document document) {
        return document != null && !C5070i.m24061i(document.fileName) && document.fileName.endsWith("tgx-theme") && C4779t2.m25586V2(document.document);
    }

    public static void m3812J3(AbstractC9323v4 v4Var, TdApi.LanguagePackInfo languagePackInfo, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            v4Var.mo4348c().m2757M1(languagePackInfo, C11170zc.f35804a, true);
        }
    }

    public static Object m3811J4(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        return new C5132o(null, R.id.theme_color_textLink);
    }

    public static void m3810J5(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            C1379j0.m37292y0(R.string.ReportChatSent, 0);
        }
    }

    public static boolean m3809J6(AbstractC9323v4 v4Var, AbstractC10664f9 f9Var, View view, int i) {
        if (i != R.id.btn_settings) {
            return true;
        }
        v4Var.m9291ac(new View$OnClickListenerC2355ev(f9Var.mo4347s(), f9Var.mo4348c()));
        return true;
    }

    public void m3802K3(AbstractC10664f9 f9Var, String str, C10788q qVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            m3857E8(this.f34459a, R.drawable.baseline_error_24, C4779t2.m25378z5(object), qVar);
        } else if (constructor == 546234276) {
            TdApi.ChatInviteLinkInfo chatInviteLinkInfo = (TdApi.ChatInviteLinkInfo) object;
            this.f34459a.m2516bd(chatInviteLinkInfo);
            int X2 = this.f34459a.m2587X2(chatInviteLinkInfo.chatId);
            long j = chatInviteLinkInfo.chatId;
            if (j == 0 || X2 == -3) {
                m3751P4(f9Var, str, chatInviteLinkInfo, qVar);
            } else {
                m3569h7(f9Var, j, new C10780j().m3357s(qVar).m3369g(str, chatInviteLinkInfo).m3368h().m3362n());
            }
        }
    }

    public void m3801K4(AbstractC10664f9 f9Var, C10788q qVar, String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        C10788q qVar2 = null;
        if (constructor == -2018019930) {
            String str2 = ((TdApi.HttpUrl) object).url;
            if (qVar != null) {
                qVar2 = qVar.m3325f();
            }
            m3531l5(f9Var, str2, qVar2);
        } else if (constructor == -1679978726) {
            if (qVar != null) {
                qVar2 = qVar.m3325f();
            }
            m3531l5(f9Var, str, qVar2);
        }
    }

    public static void m3800K5(Runnable runnable, C10930q6 q6Var, TdApi.ReportChatPhoto reportChatPhoto) {
        if (runnable != null) {
            runnable.run();
        }
        q6Var.m2270r4().m14783o(reportChatPhoto, C10644ef.f34083a);
    }

    public static void m3799K6(boolean z) {
        if (z) {
            C1379j0.m37292y0(R.string.LanguageChangeSuccess, 0);
        }
    }

    public static void m3793L2(final boolean z, final AbstractC5920l lVar) {
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                HandlerC10770jj.m3782M3(z, lVar);
            }
        });
    }

    public static void m3792L3(String str, AbstractC5920l lVar, boolean z) {
        if (!C5070i.m24061i(str)) {
            C1379j0.m37290z0(str, 0);
        }
        if (lVar != null) {
            lVar.mo3050a(new File(C10536ab.m4796H0(z)).length());
        }
    }

    public void m3791L4(List list, final AbstractC10664f9 f9Var, final String str, final C10788q qVar, int i, SparseIntArray sparseIntArray) {
        boolean z = false;
        boolean D = ((C2964ra) list.get(0)).m32873D();
        if (list.size() > 1 && ((C2964ra) list.get(1)).m32873D()) {
            z = true;
        }
        if (D) {
            f9Var.mo4348c().m2270r4().m14783o(new TdApi.GetExternalLink(str, z), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    HandlerC10770jj.this.m3801K4(f9Var, qVar, str, object);
                }
            });
        } else {
            m3531l5(f9Var, str, qVar != null ? qVar.m3325f() : null);
        }
    }

    public static boolean m3790L5(AbstractC9323v4 v4Var, CharSequence charSequence, long j, int i, final Runnable runnable, final C10930q6 q6Var, View view, int i2) {
        m3687V8(v4Var, i2, charSequence, new TdApi.ReportChatPhoto(j, i, null, null), false, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                HandlerC10770jj.m3800K5(runnable, q6Var, (TdApi.ReportChatPhoto) obj);
            }
        });
        return true;
    }

    public static void m3789L6(AbstractC10664f9 f9Var, TdApi.LanguagePackInfo languagePackInfo, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            f9Var.mo4348c().m2757M1(languagePackInfo, C11148yc.f35759a, true);
        }
    }

    public static void m3782M3(final boolean z, final AbstractC5920l lVar) {
        final String str;
        try {
            long n0 = C10536ab.m4671n0(z);
            if (n0 == -1) {
                str = C4403w.m27869i1(R.string.TdlibLogClearFail);
            } else {
                str = n0 == 0 ? C4403w.m27869i1(R.string.TdlibLogClearEmpty) : C4403w.m27865j1(R.string.TdlibLogClearOk, C1363c0.m37423m(n0));
            }
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.m3792L3(str, lVar, z);
                }
            });
        } catch (Throwable th) {
            Log.m14710w("Cannot work with TG log", th, new Object[0]);
        }
    }

    public static void m3781M4(C2964ra raVar, C9137c cVar, boolean z) {
        int A = raVar.m32876A();
        if (A == 12 || A == 69 || A == 99) {
            ((C7057w) cVar.getChildAt(0)).m17933e(raVar.m32873D(), z);
        }
    }

    public static void m3780M5(AtomicInteger atomicInteger, long[] jArr, Runnable runnable, C10930q6 q6Var, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727 && atomicInteger.decrementAndGet() == 0) {
            C1379j0.m37290z0(C4403w.m27844o2(R.string.ReportedXChats, jArr.length), 0);
            if (runnable != null) {
                q6Var.m2485dd().post(runnable);
            }
        }
    }

    public static boolean m3779M6(final AbstractC10664f9 f9Var, final TdApi.LanguagePackInfo languagePackInfo, View view, int i) {
        if (i != R.id.btn_done) {
            return true;
        }
        f9Var.mo4348c().m2270r4().m14783o(new TdApi.AddCustomServerLanguagePack(languagePackInfo.f25405id), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.m3789L6(AbstractC10664f9.this, languagePackInfo, object);
            }
        });
        return true;
    }

    public List m3772N3(AbstractC5914f fVar, long j, AbstractC5914f fVar2, AbstractC5918j jVar, View view) {
        if (fVar != null && !fVar.get()) {
            return null;
        }
        List<View$OnTouchListenerC5103c0.C5104a> X2 = m3673X2(j, false, fVar2 != null && fVar2.get(), true);
        if (jVar != null) {
            if (X2 == null) {
                X2 = new ArrayList<>();
            }
            jVar.mo1330a(X2);
        }
        return X2;
    }

    public static void m3771N4(List list, View view, int i, C2964ra raVar, TextView textView, C2546iq iqVar) {
        int j = raVar.m32835j();
        if (j == R.id.btn_allowWriteAccess) {
            if (iqVar.m34252A0().get(R.id.btn_allowWriteAccess) == R.id.btn_allowWriteAccess) {
                ((C2964ra) list.get(0)).m32858S(true);
                iqVar.m34130s3(R.id.btn_signIn);
            }
        } else if (j == R.id.btn_signIn) {
            if (!(iqVar.m34252A0().get(R.id.btn_signIn) == R.id.btn_signIn)) {
                ((C2964ra) list.get(1)).m32858S(false);
                iqVar.m34130s3(R.id.btn_allowWriteAccess);
            }
        }
    }

    public static void m3770N5(final long[] jArr, final C10930q6 q6Var, final Runnable runnable, TdApi.ReportChat reportChat) {
        final AtomicInteger atomicInteger = new AtomicInteger(jArr.length);
        for (long j : jArr) {
            q6Var.m2270r4().m14783o(new TdApi.ReportChat(j, null, reportChat.reason, reportChat.text), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    HandlerC10770jj.m3780M5(atomicInteger, jArr, runnable, q6Var, object);
                }
            });
        }
    }

    public boolean m3769N6(AbstractC9323v4 v4Var, C10781k kVar, View view, int i) {
        if (i != R.id.btn_messageApplyLocalization) {
            return true;
        }
        m3833H2(v4Var, kVar);
        return true;
    }

    public void m3761O4(final C10788q qVar, final String str, final AbstractC10664f9 f9Var, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            m3531l5(f9Var, str, qVar);
        } else if (constructor == -1079045420) {
            TdApi.LoginUrlInfoOpen loginUrlInfoOpen = (TdApi.LoginUrlInfoOpen) object;
            if (qVar != null) {
                if (loginUrlInfoOpen.skipConfirm) {
                    qVar.m3325f();
                }
                qVar.m3324g(str);
            }
            m3531l5(f9Var, loginUrlInfoOpen.url, qVar);
        } else if (constructor == 2128290863) {
            TdApi.LoginUrlInfoRequestConfirmation loginUrlInfoRequestConfirmation = (TdApi.LoginUrlInfoRequestConfirmation) object;
            final ArrayList arrayList = new ArrayList();
            arrayList.add(new C2964ra(99, (int) R.id.btn_signIn, 0, C4403w.m27873h1(R.string.LogInAsOn, C10571bi.f33905a, f9Var.mo4348c().m2885E1(), loginUrlInfoRequestConfirmation.domain), true));
            if (loginUrlInfoRequestConfirmation.requestWriteAccess) {
                arrayList.add(new C2964ra(99, (int) R.id.btn_allowWriteAccess, 0, C4403w.m27873h1(R.string.AllowWriteAccess, C4403w.m27843p(), f9Var.mo4348c().m2480e2().m1721K2(loginUrlInfoRequestConfirmation.botUserId)), true));
            }
            AbstractC9323v4<?> F = f9Var instanceof AbstractC9323v4 ? (AbstractC9323v4) f9Var : f9Var.mo4347s().m14552P1().m9763F();
            if (F != null && !F.m9347Sa()) {
                F.m9206me(new C9188f2(R.id.btn_open).m10011b(C4403w.m27873h1(R.string.OpenLinkConfirm, C10858mi.f34792a, loginUrlInfoRequestConfirmation.url)).m9998o(arrayList).m10003j(new AbstractC9323v4.AbstractC9343r() {
                    @Override
                    public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                        HandlerC10770jj.this.m3791L4(arrayList, f9Var, str, qVar, i, sparseIntArray);
                    }
                }).m9993t(C10694gf.f34222a).m9999n(loginUrlInfoRequestConfirmation.requestWriteAccess ? new AbstractC9323v4.AbstractC9337n() {
                    @Override
                    public final void mo3907a(View view, int i, C2964ra raVar, TextView textView, C2546iq iqVar) {
                        HandlerC10770jj.m3771N4(arrayList, view, i, raVar, textView, iqVar);
                    }
                } : null).m9995r(R.string.Open).m9998o(arrayList));
            }
        }
    }

    public static boolean m3760O5(AbstractC9323v4 v4Var, CharSequence charSequence, final long[] jArr, final C10930q6 q6Var, final Runnable runnable, View view, int i) {
        m3687V8(v4Var, i, charSequence, new TdApi.ReportChat(), false, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                HandlerC10770jj.m3770N5(jArr, q6Var, runnable, (TdApi.ReportChat) obj);
            }
        });
        return true;
    }

    public static void m3757O8(Context context, int i, boolean z, boolean z2, int i2, final AbstractC5918j<C10787p> jVar) {
        ArrayList arrayList = new ArrayList(21);
        int i3 = 0;
        arrayList.add(new C10787p(0, C4403w.m27869i1(R.string.Off)));
        int i4 = z2 ? 20 : 15;
        for (int i5 = 1; i5 <= i4; i5++) {
            arrayList.add(new C10787p(i5, C4403w.m27844o2(R.string.xSeconds, i5)));
        }
        if (z2) {
            while (true) {
                i4 += 5;
                if (i4 >= 60) {
                    break;
                }
                arrayList.add(new C10787p(i4, C4403w.m27844o2(R.string.xSeconds, i4)));
            }
            arrayList.add(new C10787p(60, C4403w.m27844o2(R.string.xMinutes, 1L)));
        } else {
            arrayList.add(new C10787p(30, C4403w.m27844o2(R.string.xSeconds, 30L)));
            arrayList.add(new C10787p(60, C4403w.m27844o2(R.string.xMinutes, 1L)));
            arrayList.add(new C10787p(3600, C4403w.m27844o2(R.string.xHours, 1L)));
            arrayList.add(new C10787p(86400, C4403w.m27844o2(R.string.xDays, 1L)));
            arrayList.add(new C10787p(604800, C4403w.m27844o2(R.string.xWeeks, 1L)));
        }
        Iterator it = arrayList.iterator();
        int i6 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((C10787p) it.next()).f34533a == i) {
                i3 = i6;
                break;
            } else {
                i6++;
            }
        }
        final View$OnClickListenerC6999q1 q1Var = new View$OnClickListenerC6999q1(context, true);
        if (z) {
            q1Var.m18113O1();
        }
        q1Var.m18111Q1(arrayList, i3);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, z ? R.style.DialogThemeDark : C11524j.m150v());
        builder.setTitle(C4403w.m27869i1(R.string.MessageLifetime));
        if (i2 != 0) {
            builder.setMessage(C4403w.m27869i1(i2));
        }
        builder.setPositiveButton(C4403w.m27869i1(R.string.Done), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i7) {
                HandlerC10770jj.m3689V6(View$OnClickListenerC6999q1.this, jVar, dialogInterface, i7);
            }
        });
        builder.setView(q1Var);
        C1379j0.m37307r(context).m14417x3(builder, z ? C11514c0.m348a(2) : null);
    }

    public void m3752P3(AbstractC9323v4 v4Var, final AbstractC10786o oVar, long j, AbstractC11531p pVar, View view, View view2) {
        switch (view.getId()) {
            case R.id.btn_sendNoMarkdown:
                oVar.mo3333a(false, null, true);
                return;
            case R.id.btn_sendNoSound:
                oVar.mo3333a(true, null, false);
                return;
            case R.id.btn_sendOnceOnline:
                oVar.mo3333a(false, new TdApi.MessageSchedulingStateSendWhenOnline(), false);
                return;
            case R.id.btn_sendScheduled:
                if (v4Var != null) {
                    this.f34459a.m2485dd().m3808J7(v4Var, new AbstractC5918j() {
                        @Override
                        public final void mo1330a(Object obj) {
                            HandlerC10770jj.AbstractC10786o.this.mo3333a(false, (TdApi.MessageSchedulingState) obj, false);
                        }
                    }, j, false, false, pVar);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static boolean m3750P5(AbstractC10785n nVar, String str, View view, int i) {
        if (i != R.id.btn_next) {
            return true;
        }
        nVar.mo3334b(str);
        return true;
    }

    public void m3749P6(C6924j2 j2Var) {
        if (this.f34460b != null) {
            this.f34460b = null;
            this.f34461c.clear();
            this.f34461c = null;
        }
    }

    public static void m3748P7(org.xmlpull.v1.XmlPullParser r8, p350yd.HandlerC10770jj.C10781k r9) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.HandlerC10770jj.m3748P7(org.xmlpull.v1.XmlPullParser, yd.jj$k):void");
    }

    public boolean m3742Q3(AbstractC9323v4 v4Var, long j, View view, int i) {
        if (!v4Var.m9347Sa() && i == R.id.btn_delete) {
            this.f34459a.m2270r4().m14783o(new TdApi.RemoveContacts(new long[]{j}), this.f34459a.m2392ja());
        }
        return true;
    }

    public static void m3740Q5(AbstractC9323v4 v4Var, CharSequence charSequence, final AbstractC10785n nVar, final String str) {
        v4Var.m9247ge(new AbstractC9323v4.C9340p.C9341a().m9092c(C1363c0.m37466H(C4403w.m27869i1(R.string.TransferOwnershipAlert), charSequence)).m9091d(new AbstractC9323v4.C9338o(R.id.btn_next, C4403w.m27869i1(R.string.TransferOwnershipConfirm), 2, R.drawable.templarian_baseline_account_switch_24)).m9093b().m9094a(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean P5;
                P5 = HandlerC10770jj.m3750P5(HandlerC10770jj.AbstractC10785n.this, str, view, i);
                return P5;
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

    public void m3739Q6(int i, Runnable runnable, int i2, SparseIntArray sparseIntArray) {
        int i3;
        int i4 = sparseIntArray.get(R.id.btn_mapProvider);
        boolean z = true;
        switch (i4) {
            case R.id.btn_mapProviderGoogle:
                i3 = 2;
                break;
            case R.id.btn_mapProviderNone:
                i3 = 0;
                break;
            case R.id.btn_mapProviderTelegram:
                i3 = 1;
                break;
            default:
                return;
        }
        C4868i c2 = C4868i.m24726c2();
        if (i != 2) {
            z = false;
        }
        c2.m24789T4(i3, z);
        if (i == 0 && this.f34460b != null) {
            List<Runnable> list = this.f34461c;
            this.f34460b = null;
            this.f34461c = null;
            for (Runnable runnable2 : list) {
                runnable2.run();
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public static void m3738Q7(XmlPullParser xmlPullParser, C10781k kVar) {
        xmlPullParser.require(2, null, "resources");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("string".equals(name)) {
                    m3748P7(xmlPullParser, kVar);
                } else {
                    throw new IllegalArgumentException("Unknown tag: " + name);
                }
            }
        }
    }

    public static void m3737Q8(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static boolean m3733R2(final AbstractC9323v4<?> v4Var, final TdApi.Message[] messageArr, final Runnable runnable) {
        final TdApi.MessageSender c2;
        final C10930q6 c = v4Var.mo4348c();
        if (messageArr == null || messageArr.length == 0) {
            return false;
        }
        final long Q0 = C4779t2.m25618Q0(messageArr);
        if (Q0 == 0 || !v4Var.mo4348c().m2299p7(Q0) || (c2 = C4779t2.m25542c2(messageArr)) == null || v4Var.mo4348c().m2395j7(c2)) {
            return false;
        }
        final String zb = c.m2135zb(c2, true);
        C9188f2 i = new C9188f2(R.id.btn_deleteSupergroupMessages).m10004i(new C2964ra(28, (int) R.id.text_title, 0, C4403w.m27832r2(R.string.QDeleteXMessagesFromY, messageArr.length, zb), false));
        C2964ra[] raVarArr = new C2964ra[3];
        raVarArr[0] = new C2964ra(12, (int) R.id.btn_banMember, 0, c2.getConstructor() == -336109341 ? R.string.RestrictUser : c.m2784K6(((TdApi.MessageSenderChat) c2).chatId) ? R.string.BanChannel : R.string.BanChat, false);
        raVarArr[1] = new C2964ra(12, (int) R.id.btn_reportSpam, 0, (int) R.string.ReportSpam, false);
        raVarArr[2] = new C2964ra(12, (int) R.id.btn_deleteAll, 0, C4403w.m27853m1(R.string.DeleteAllFrom, zb), false);
        final C9180e2 me2 = v4Var.m9206me(i.m9997p(raVarArr).m10003j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i2, SparseIntArray sparseIntArray) {
                HandlerC10770jj.m3712T3(messageArr, c, Q0, v4Var, c2, runnable, i2, sparseIntArray);
            }
        }).m9995r(R.string.Delete).m9996q(R.id.theme_color_textNegative));
        if (me2 == null) {
            return true;
        }
        c.m2270r4().m14783o(new TdApi.GetChatMember(messageArr[0].chatId, messageArr[0].senderId), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.m3682W3(C10930q6.this, messageArr, zb, me2, object);
            }
        });
        c.m2270r4().m14783o(new TdApi.SearchChatMessages(Q0, null, c2, 0L, 0, 1, null, 0L), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.m3662Y3(messageArr, c, me2, zb, object);
            }
        });
        return true;
    }

    public static void m3732R3(AbstractC9323v4 v4Var, C10930q6 q6Var, long j, TdApi.MessageSender messageSender, TdApi.ChatMember chatMember) {
        TdApi.ChatMemberStatus K3;
        if (!v4Var.m9347Sa() && (K3 = q6Var.m2787K3(j)) != null) {
            View$OnClickListenerC3141u7 u7Var = new View$OnClickListenerC3141u7(v4Var.mo4347s(), v4Var.mo4348c());
            u7Var.m31376sg(new View$OnClickListenerC3141u7.C3145d(j, messageSender, true, K3, chatMember));
            v4Var.m9291ac(u7Var);
        }
    }

    public static boolean m3731R4(String str, int i, TdApi.ProxyType proxyType, View view, int i2) {
        if (i2 == R.id.btn_addProxy) {
            C4868i.m24726c2().m24633o(str, i, proxyType, null, true);
            return true;
        } else if (i2 != R.id.btn_save) {
            return true;
        } else {
            C4868i.m24726c2().m24633o(str, i, proxyType, null, false);
            return true;
        }
    }

    public static void m3730R5(final AbstractC9323v4 v4Var, final CharSequence charSequence, final AbstractC10785n nVar, final String str) {
        v4Var.m9212m8(new Runnable() {
            @Override
            public final void run() {
                HandlerC10770jj.m3740Q5(AbstractC9323v4.this, charSequence, nVar, str);
            }
        });
    }

    public boolean m3729R6(AbstractC9323v4 v4Var, TdApi.NotificationSettingsScope notificationSettingsScope, long j, Runnable runnable, View view, int i) {
        if (i == R.id.btn_menu_customize) {
            View$OnClickListenerC2359ew ewVar = new View$OnClickListenerC2359ew(v4Var.mo4347s(), this.f34459a);
            if (notificationSettingsScope != null) {
                ewVar.m34950Si(new View$OnClickListenerC2359ew.C2361b(notificationSettingsScope));
            } else {
                ewVar.m34950Si(new View$OnClickListenerC2359ew.C2361b(j));
            }
            v4Var.m9291ac(ewVar);
            C7389v0.m16743D2(runnable);
            return true;
        } else if (j == 0 || i != R.id.btn_menu_resetToDefault) {
            int i3 = m3563i3(i);
            if (notificationSettingsScope != null) {
                this.f34459a.m2374kc(notificationSettingsScope, i3);
            } else {
                this.f34459a.m2486dc(j, i3);
            }
            C7389v0.m16743D2(runnable);
            return true;
        } else {
            TdApi.ChatNotificationSettings chatNotificationSettings = this.f34459a.m2771L3(j).notificationSettings;
            chatNotificationSettings.useDefaultMuteFor = true;
            this.f34459a.m2763Lb(j, chatNotificationSettings);
            C7389v0.m16743D2(runnable);
            return true;
        }
    }

    public static void m3728R7(AbstractC9323v4<?> v4Var, C11131y6 y6Var) {
        m3718S7(v4Var, y6Var, false);
    }

    public static boolean m3723S2(AbstractC9323v4<?> v4Var, final TdApi.Message[] messageArr, final Runnable runnable) {
        CharSequence charSequence;
        if (messageArr == null || messageArr.length == 0) {
            return false;
        }
        final C10930q6 c = v4Var.mo4348c();
        long Q0 = C4779t2.m25618Q0(messageArr);
        if (c.m2443g7(Q0)) {
            return false;
        }
        int length = messageArr.length;
        int i = 0;
        int i2 = 0;
        final int i3 = 0;
        for (TdApi.Message message : messageArr) {
            boolean z = message.canBeDeletedForAllUsers;
            if (z && message.canBeDeletedOnlyForSelf) {
                i2++;
                if (message.isOutgoing) {
                    i++;
                }
            }
            if (!z && message.canBeDeletedOnlyForSelf) {
                i3++;
            }
        }
        boolean z2 = i > 0;
        if (i2 == 0) {
            return false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C4403w.m27836q2(R.string.QDeleteXMessages, messageArr.length));
        if (i3 > 0) {
            spannableStringBuilder.append((CharSequence) "\n").append(C4403w.m27836q2(R.string.DeleteXForMeWarning, i3));
        }
        if (i2 == length) {
            charSequence = C7316a.m17053h(Q0) ? C4403w.m27869i1(R.string.DeleteForEveryone) : C4403w.m27853m1(R.string.DeleteForUser, c.m2480e2().m1749D2(c.m2494d4(Q0)));
        } else {
            charSequence = C7316a.m17053h(Q0) ? C4403w.m27836q2(R.string.DeleteXForEveryone, i2) : C4403w.m27832r2(R.string.DeleteXForUser, i2, c.m2480e2().m1749D2(c.m2494d4(Q0)));
        }
        v4Var.m9206me(new C9188f2(R.id.btn_deleteMessagesWithRevoke).m10011b(spannableStringBuilder).m9997p(new C2964ra[]{new C2964ra(12, (int) R.id.btn_revokeMessages, 0, charSequence, z2)}).m10003j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i4, SparseIntArray sparseIntArray) {
                HandlerC10770jj.m3652Z3(i3, messageArr, c, runnable, i4, sparseIntArray);
            }
        }).m9995r(R.string.Delete).m9996q(R.id.theme_color_textNegative).m10010c(false));
        return true;
    }

    public static void m3722S3(final C10930q6 q6Var, final AbstractC9323v4 v4Var, final long j, final TdApi.MessageSender messageSender, TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            final TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
            q6Var.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.m3732R3(AbstractC9323v4.this, q6Var, j, messageSender, chatMember);
                }
            });
        }
    }

    public static boolean m3721S4(C6924j2[] j2VarArr, View view, C5132o oVar) {
        if (j2VarArr[0] != null) {
            j2VarArr[0].m18408y2(true);
        }
        return false;
    }

    public static void m3720S5(final AbstractC9323v4 v4Var, final CharSequence charSequence, final AbstractC10785n nVar, TdApi.Object object) {
        if (object.getConstructor() == -2001619202) {
            View$OnClickListenerC2665lj ljVar = new View$OnClickListenerC2665lj(v4Var.mo4347s(), v4Var.mo4348c());
            ljVar.m33963bg(new View$OnClickListenerC2665lj.C2666a(10, (TdApi.PasswordState) object).m33920d(new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    HandlerC10770jj.m3730R5(AbstractC9323v4.this, charSequence, nVar, (String) obj);
                }
            }));
            v4Var.m9291ac(ljVar);
        }
    }

    public boolean m3719S6(AbstractC9323v4 v4Var, TdApi.ChatList chatList, long j, Runnable runnable, View view, int i) {
        if (i != R.id.btn_unpinChat && i != R.id.btn_pinChat) {
            return true;
        }
        m3798K7(v4Var, chatList, j, null, i, runnable);
        return true;
    }

    public static void m3718S7(AbstractC9323v4<?> v4Var, final C11131y6 y6Var, boolean z) {
        v4Var.m9261ee(C4403w.m27853m1(z ? R.string.SignOutHint2 : R.string.RemoveAccountHint2, y6Var.m1455u()), new int[]{R.id.btn_removeAccount, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.LogOut), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean F5;
                F5 = HandlerC10770jj.m3850F5(C11131y6.this, view, i);
                return F5;
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

    public static void m3712T3(TdApi.Message[] messageArr, final C10930q6 q6Var, final long j, final AbstractC9323v4 v4Var, final TdApi.MessageSender messageSender, Runnable runnable, int i, SparseIntArray sparseIntArray) {
        if (i == R.id.btn_deleteSupergroupMessages) {
            boolean z = sparseIntArray.get(R.id.btn_banMember) != 0;
            boolean z2 = sparseIntArray.get(R.id.btn_reportSpam) != 0;
            boolean z3 = sparseIntArray.get(R.id.btn_deleteAll) != 0;
            long[] q = C4779t2.m25645M1(messageArr).m21495q(0);
            if (z) {
                q6Var.m2270r4().m14783o(new TdApi.GetChatMember(j, messageArr[0].senderId), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        HandlerC10770jj.m3722S3(C10930q6.this, v4Var, j, messageSender, object);
                    }
                });
            }
            if (z2) {
                q6Var.m2270r4().m14783o(new TdApi.ReportSupergroupSpam(C7316a.m17045p(j), q), q6Var.m2392ja());
            }
            if (z3) {
                q6Var.m2270r4().m14783o(new TdApi.DeleteChatMessagesBySender(j, messageSender), q6Var.m2392ja());
            } else {
                q6Var.m2770L4(j, q, true);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void m3711T4(TdApi.Chat[] chatArr, AbstractRunnableC5910b bVar, TdApi.Error[] errorArr, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            errorArr[0] = (TdApi.Error) object;
            this.f34459a.m2485dd().post(bVar);
        } else if (constructor == -1601123095) {
            chatArr[0] = (TdApi.Chat) object;
            this.f34459a.m2485dd().post(bVar);
        }
    }

    public static boolean m3710T5(AbstractC9323v4 v4Var, View view, int i) {
        if (i != R.id.btn_next) {
            return true;
        }
        View$OnClickListenerC2937qp qpVar = new View$OnClickListenerC2937qp(v4Var.mo4347s(), v4Var.mo4348c());
        qpVar.m32968ih(new View$OnClickListenerC2937qp.C2939b(null));
        v4Var.m9291ac(qpVar);
        return true;
    }

    public static void m3709T6(AbstractC10786o oVar, TdApi.MessageSchedulingState messageSchedulingState) {
        if (messageSchedulingState == null) {
            oVar.mo3333a(true, null, false);
        } else {
            oVar.mo3333a(false, messageSchedulingState, false);
        }
    }

    public static void m3708T7(final AbstractC9323v4<?> v4Var, final long j, TdApi.Message[] messageArr, final Runnable runnable, AbstractC11531p pVar) {
        CharSequence charSequence;
        long[] jArr;
        CharSequence charSequence2;
        int i;
        final C10930q6 c = v4Var.mo4348c();
        if (messageArr == null || messageArr.length <= 0) {
            jArr = null;
            charSequence = C4403w.m27853m1(R.string.ReportChat, c.m2691Q3(j));
        } else {
            long[] jArr2 = new long[messageArr.length];
            long P0 = C7321e.m16988P0(messageArr[0]);
            boolean z = true;
            int i2 = 0;
            for (TdApi.Message message : messageArr) {
                i2++;
                jArr2[i2] = message.f25406id;
                if (z && C7321e.m16988P0(message) != P0) {
                    P0 = 0;
                    z = false;
                }
            }
            if (z) {
                int i3 = R.string.ReportMessage;
                if (P0 != 0) {
                    if (C7316a.m17049l(P0)) {
                        i = 1;
                        i3 = messageArr.length == 1 ? R.string.ReportMessageUser : R.string.ReportMessagesUser;
                    } else {
                        i = 1;
                        if (messageArr.length != 1) {
                            i3 = R.string.ReportMessages;
                        }
                    }
                    Object[] objArr = new Object[i];
                    objArr[0] = c.m2691Q3(P0);
                    charSequence2 = C4403w.m27853m1(i3, objArr);
                } else {
                    if (messageArr.length != 1) {
                        i3 = R.string.ReportMessages;
                    }
                    charSequence2 = C4403w.m27853m1(i3, c.m2691Q3(messageArr[0].chatId));
                }
            } else {
                charSequence2 = C4403w.m27848n2(R.string.ReportXMessages, messageArr.length, C4403w.m27843p(), new Object[0]);
            }
            charSequence = charSequence2;
            jArr = jArr2;
        }
        C5320c cVar = new C5320c(7);
        C5146u0 u0Var = new C5146u0(7);
        m3643a3(cVar, u0Var);
        int[] e = cVar.m23280e();
        String[] d = u0Var.m23813d();
        final CharSequence charSequence3 = charSequence;
        final long[] jArr3 = jArr;
        v4Var.m9254fe(charSequence, e, d, null, null, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i4) {
                boolean I5;
                I5 = HandlerC10770jj.m3820I5(AbstractC9323v4.this, charSequence3, j, jArr3, runnable, c, view, i4);
                return I5;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i4) {
                return C5115g0.m23934b(this, i4);
            }
        }, pVar);
    }

    public static int m3707T8(int i) {
        if (i == -1) {
            return R.string.network_Connecting;
        }
        if (i == 0) {
            return R.string.Connected;
        }
        if (i == 1) {
            return R.string.ConnectingToProxy;
        }
        if (i == 2) {
            return R.string.network_Connecting;
        }
        if (i == 3) {
            return R.string.network_Updating;
        }
        if (i == 4) {
            return R.string.network_WaitingForNetwork;
        }
        throw new RuntimeException();
    }

    public static Object m3702U3(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 < 2) {
            return C4403w.m27889d2(z);
        }
        return null;
    }

    public void m3701U4(final TdApi.Chat[] chatArr, final AbstractRunnableC5910b bVar, final TdApi.Error[] errorArr, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            errorArr[0] = (TdApi.Error) object;
            this.f34459a.m2485dd().post(bVar);
        } else if (constructor == -537797015) {
            this.f34459a.m2270r4().m14783o(new TdApi.CreatePrivateChat(((TdApi.User) object).f25439id, false), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object2) {
                    HandlerC10770jj.this.m3711T4(chatArr, bVar, errorArr, object2);
                }
            });
        }
    }

    public static boolean m3700U5(View view, int i) {
        return true;
    }

    public void m3699U6(TdApi.Chat chat, C10787p pVar) {
        m3618c8(chat, pVar.f34533a);
    }

    public static void m3698U7(final AbstractC9323v4<?> v4Var, final long j, final int i, final Runnable runnable, AbstractC11531p pVar) {
        final C10930q6 c = v4Var.mo4348c();
        final CharSequence m1 = C4403w.m27853m1(R.string.ReportChatPhoto, c.m2691Q3(j));
        C5320c cVar = new C5320c(7);
        C5146u0 u0Var = new C5146u0(7);
        m3643a3(cVar, u0Var);
        v4Var.m9254fe(m1, cVar.m23280e(), u0Var.m23813d(), null, null, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i2) {
                boolean L5;
                L5 = HandlerC10770jj.m3790L5(AbstractC9323v4.this, m1, j, i, runnable, c, view, i2);
                return L5;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i2) {
                return C5115g0.m23934b(this, i2);
            }
        }, pVar);
    }

    public static void m3692V3(TdApi.ChatMember chatMember, C10930q6 q6Var, TdApi.Message[] messageArr, String str, C9180e2 e2Var) {
        String str2;
        if (chatMember.status.getConstructor() == -160019714) {
            str2 = C4403w.m27869i1(R.string.RoleOwner);
        } else if (chatMember.status.getConstructor() == -1653518666) {
            str2 = C4403w.m27869i1(R.string.RoleBanned);
        } else if (C4779t2.m25499i3(chatMember.status, false) || chatMember.memberId.getConstructor() == -239660751) {
            int i = chatMember.joinedChatDate;
            if (i != 0) {
                str2 = C4403w.m27918X0(i, TimeUnit.SECONDS, q6Var.m2898D4(), TimeUnit.MILLISECONDS, true, 60, R.string.RoleMember, true);
            } else if (chatMember.memberId.getConstructor() == -239660751) {
                str2 = C4403w.m27869i1(q6Var.m2784K6(C7321e.m16986Q0(chatMember.memberId)) ? R.string.RoleChannel : R.string.RoleGroup);
            } else {
                return;
            }
        } else {
            str2 = C4403w.m27869i1(R.string.RoleLeft);
        }
        CharSequence n2 = C4403w.m27848n2(R.string.QDeleteXMessagesFromYRole, messageArr.length, C10745ij.f34380a, str, str2);
        int N0 = e2Var.f29637a.m34224N0(R.id.text_title);
        if (N0 != -1 && e2Var.f29637a.m34243E0(N0).m32851Z(n2)) {
            e2Var.f29637a.m39312I(N0);
        }
    }

    public boolean m3691V4(final TdApi.Chat[] chatArr, final AbstractRunnableC5910b bVar, final TdApi.Error[] errorArr, View view, int i) {
        if (i != R.id.btn_openChat) {
            return true;
        }
        this.f34459a.m2270r4().m14783o(new TdApi.GetSupportUser(), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.this.m3701U4(chatArr, bVar, errorArr, object);
            }
        });
        return true;
    }

    public static boolean m3690V5(View view, int i) {
        return true;
    }

    public static void m3689V6(View$OnClickListenerC6999q1 q1Var, AbstractC5918j jVar, DialogInterface dialogInterface, int i) {
        C10787p pVar = (C10787p) q1Var.getCurrentItem();
        if (pVar != null && jVar != null) {
            jVar.mo1330a(pVar);
        }
    }

    public static void m3688V7(final AbstractC9323v4<?> v4Var, final long[] jArr, final Runnable runnable) {
        final C10930q6 c = v4Var.mo4348c();
        C5320c cVar = new C5320c(7);
        C5146u0 u0Var = new C5146u0(7);
        m3643a3(cVar, u0Var);
        final CharSequence q2 = C4403w.m27836q2(R.string.ReportXChats, jArr.length);
        v4Var.m9254fe(q2, cVar.m23280e(), u0Var.m23813d(), null, null, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean O5;
                O5 = HandlerC10770jj.m3760O5(AbstractC9323v4.this, q2, jArr, c, runnable, view, i);
                return O5;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        }, null);
    }

    public static <T extends TdApi.Function> void m3687V8(AbstractC9323v4<?> v4Var, int i, CharSequence charSequence, T t, boolean z, AbstractC5918j<T> jVar) {
        TdApi.ChatReportReason chatReportReason;
        switch (i) {
            case R.id.btn_reportChatChildAbuse:
                chatReportReason = new TdApi.ChatReportReasonChildAbuse();
                break;
            case R.id.btn_reportChatCopyright:
                chatReportReason = new TdApi.ChatReportReasonCopyright();
                break;
            case R.id.btn_reportChatFake:
                chatReportReason = new TdApi.ChatReportReasonFake();
                break;
            case R.id.btn_reportChatOther:
                chatReportReason = new TdApi.ChatReportReasonCustom();
                z = true;
                break;
            case R.id.btn_reportChatPornography:
                chatReportReason = new TdApi.ChatReportReasonPornography();
                break;
            case R.id.btn_reportChatSpam:
                chatReportReason = new TdApi.ChatReportReasonSpam();
                break;
            case R.id.btn_reportChatViolence:
                chatReportReason = new TdApi.ChatReportReasonViolence();
                break;
            default:
                throw new IllegalArgumentException(C4403w.m27885e1(i));
        }
        int constructor = t.getConstructor();
        if (constructor == -964543587) {
            ((TdApi.ReportChat) t).reason = chatReportReason;
        } else if (constructor == 734652708) {
            ((TdApi.ReportChatPhoto) t).reason = chatReportReason;
        } else {
            throw new UnsupportedOperationException(t.toString());
        }
        if (z) {
            C3365yo yoVar = new C3365yo(v4Var.mo4347s(), v4Var.mo4348c());
            yoVar.m9476Ad(new C10778h(charSequence, t, jVar));
            v4Var.mo4347s().m14552P1().m9719h0(yoVar);
            return;
        }
        jVar.mo1330a(t);
    }

    public static void m3682W3(final C10930q6 q6Var, final TdApi.Message[] messageArr, final String str, final C9180e2 e2Var, TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            final TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
            q6Var.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.m3692V3(TdApi.ChatMember.this, q6Var, messageArr, str, e2Var);
                }
            });
        }
    }

    public void m3681W4(AbstractC9323v4 v4Var, AbstractC10664f9 f9Var, TdApi.AuthenticationCodeInfo authenticationCodeInfo, TdApi.InternalLinkTypePhoneNumberConfirmation internalLinkTypePhoneNumberConfirmation) {
        if (v4Var != null && !v4Var.m9347Sa()) {
            m3783M2(f9Var, authenticationCodeInfo, internalLinkTypePhoneNumberConfirmation.phoneNumber);
        }
    }

    public void m3680W5(final AbstractC10785n nVar, TdApi.Object object, final AbstractC9323v4 v4Var, final CharSequence charSequence) {
        nVar.mo3335a(object);
        switch (object.getConstructor()) {
            case TdApi.CanTransferOwnershipResultOk.CONSTRUCTOR:
                this.f34459a.m2270r4().m14783o(new TdApi.GetPasswordState(), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object2) {
                        HandlerC10770jj.m3720S5(AbstractC9323v4.this, charSequence, nVar, object2);
                    }
                });
                return;
            case TdApi.CanTransferOwnershipResultPasswordTooFresh.CONSTRUCTOR:
                v4Var.m9247ge(new AbstractC9323v4.C9340p.C9341a().m9092c(C1363c0.m37466H(C4403w.m27869i1(R.string.TransferOwnershipSecurityAlert), C4403w.m27982H0(v4Var, R.string.TransferOwnershipSecurityWaitPassword, C4403w.m27818v0(((TdApi.CanTransferOwnershipResultPasswordTooFresh) object).retryAfter)))).m9091d(new AbstractC9323v4.C9338o(R.id.btn_next, C4403w.m27869i1(R.string.OK), 1, R.drawable.baseline_check_circle_24)).m9093b().m9094a(), C10591ch.f33953a);
                return;
            case TdApi.CanTransferOwnershipResultSessionTooFresh.CONSTRUCTOR:
                v4Var.m9247ge(new AbstractC9323v4.C9340p.C9341a().m9092c(C1363c0.m37466H(C4403w.m27869i1(R.string.TransferOwnershipSecurityAlert), C4403w.m27982H0(v4Var, R.string.TransferOwnershipSecurityWaitSession, C4403w.m27818v0(((TdApi.CanTransferOwnershipResultSessionTooFresh) object).retryAfter)))).m9091d(new AbstractC9323v4.C9338o(R.id.btn_next, C4403w.m27869i1(R.string.OK), 1, R.drawable.baseline_check_circle_24)).m9093b().m9094a(), C10615dh.f34015a);
                return;
            case TdApi.CanTransferOwnershipResultPasswordNeeded.CONSTRUCTOR:
                v4Var.m9247ge(new AbstractC9323v4.C9340p.C9341a().m9092c(C1363c0.m37466H(C4403w.m27869i1(R.string.TransferOwnershipSecurityAlert), C4403w.m27982H0(v4Var, R.string.TransferOwnershipSecurityPasswordNeeded, new Object[0]))).m9091d(new AbstractC9323v4.C9338o(R.id.btn_next, C4403w.m27869i1(R.string.TransferOwnershipSecurityActionSetPassword), 3, R.drawable.mrgrigri_baseline_textbox_password_24)).m9093b().m9094a(), new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i) {
                        boolean T5;
                        T5 = HandlerC10770jj.m3710T5(AbstractC9323v4.this, view, i);
                        return T5;
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
                return;
            default:
                return;
        }
    }

    public void m3679W6(AbstractC10664f9 f9Var, String str, C10788q qVar, int i, String str2, TdApi.Object object) {
        int constructor = object.getConstructor();
        boolean z = false;
        if (constructor == -1679978726) {
            m3857E8(f9Var.mo4348c(), R.drawable.baseline_warning_24, C4403w.m27853m1(R.string.BotNotFound, str), qVar);
        } else if (constructor == -1601123095) {
            TdApi.Chat ia = this.f34459a.m2408ia(object);
            if (!this.f34459a.m2816I6(ia)) {
                m3857E8(f9Var.mo4348c(), R.drawable.baseline_warning_24, C4403w.m27853m1(R.string.BotNotFound, str), qVar);
                return;
            }
            TdApi.User b4 = this.f34459a.m2525b4(ia);
            if (b4 == null || b4.type.getConstructor() != 1262387765) {
                m3857E8(f9Var.mo4348c(), R.drawable.baseline_warning_24, C4403w.m27853m1(R.string.BotNotFound, str), qVar);
            } else if (i == 0) {
                m3881C4(f9Var, ia, new C10780j().m3357s(qVar).m3358r(new C4822w2(b4.f25439id, str2, false)).m3368h());
            } else if (i == 1 || i == 2) {
                if (i == 2) {
                    z = true;
                }
                m3832H3(f9Var, new C4822w2(b4.f25439id, str2, z), z);
            }
        }
    }

    public static void m3672X3(C9180e2 e2Var, int i, String str) {
        int N0 = e2Var.f29637a.m34224N0(R.id.btn_deleteAll);
        if (N0 != -1 && e2Var.f29637a.m34243E0(N0).m32851Z(C4403w.m27832r2(R.string.DeleteXMoreFrom, i, str))) {
            e2Var.f29637a.m39312I(N0);
        }
    }

    public void m3671X4(final AbstractC9323v4 v4Var, final AbstractC10664f9 f9Var, final TdApi.InternalLinkTypePhoneNumberConfirmation internalLinkTypePhoneNumberConfirmation, C10788q qVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            m3857E8(this.f34459a, R.drawable.baseline_warning_24, C4779t2.m25378z5(object), qVar);
        } else if (constructor == -860345416) {
            final TdApi.AuthenticationCodeInfo authenticationCodeInfo = (TdApi.AuthenticationCodeInfo) object;
            post(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3681W4(v4Var, f9Var, authenticationCodeInfo, internalLinkTypePhoneNumberConfirmation);
                }
            });
        }
    }

    public void m3670X5(final AbstractC10785n nVar, final AbstractC9323v4 v4Var, final CharSequence charSequence, final TdApi.Object object) {
        this.f34459a.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                HandlerC10770jj.this.m3680W5(nVar, object, v4Var, charSequence);
            }
        });
    }

    public void m3669X6(AbstractC10664f9 f9Var, C10780j jVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -1601123095) {
            m3881C4(f9Var, this.f34459a.m2408ia(object), jVar);
        }
    }

    public static void m3662Y3(TdApi.Message[] messageArr, C10930q6 q6Var, final C9180e2 e2Var, final String str, TdApi.Object object) {
        final int length;
        if (object.getConstructor() == -16498159 && (length = ((TdApi.Messages) object).totalCount - messageArr.length) > 0) {
            q6Var.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.m3672X3(C9180e2.this, length, str);
                }
            });
        }
    }

    public void m3661Y4(AbstractC10664f9 f9Var, TdApi.MessageLinkInfo messageLinkInfo, C10788q qVar, AbstractC5917i iVar) {
        m3449t7(f9Var, messageLinkInfo, qVar);
        if (iVar != null) {
            iVar.mo1322a(true);
        }
    }

    public static void m3660Y5(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            C1379j0.m37292y0(R.string.GifSaved, 0);
        }
    }

    public void m3659Y6(long j, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, int i, SparseIntArray sparseIntArray) {
        this.f34459a.m2811Ib(j, messageSender, sparseIntArray.get(R.id.right_readMessages) != 0 ? new TdApi.ChatMemberStatusMember() : new TdApi.ChatMemberStatusLeft(), chatMemberStatus, null);
    }

    public static void m3653Z2(C5320c cVar, C5320c cVar2, C5146u0 u0Var, C5320c cVar3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6) {
        int i = 1;
        if (z) {
            if (z5) {
                u0Var.m23815b(C4403w.m27865j1(R.string.NotificationsDefaultValue, C4403w.m27869i1(R.string.EnableNotifications)));
            } else {
                u0Var.m23816a(R.string.EnableNotifications);
            }
            cVar2.m23284a(R.drawable.baseline_notifications_24);
            cVar.m23284a(R.id.btn_menu_enable);
            if (cVar3 != null) {
                cVar3.m23284a(1);
            }
        }
        if (str != null) {
            u0Var.m23815b(C4403w.m27865j1(R.string.NotificationsDefault, C4403w.m27909Z1(str)));
            cVar2.m23284a(R.drawable.baseline_notifications_off_24);
            cVar.m23284a(R.id.btn_menu_resetToDefault);
            if (cVar3 != null) {
                cVar3.m23284a(1);
            }
        }
        if (z2) {
            u0Var.m23816a(R.string.MuteForever);
            cVar2.m23284a(R.drawable.baseline_notifications_off_24);
            cVar.m23284a(R.id.btn_menu_disable);
            if (cVar3 != null) {
                cVar3.m23284a(1);
            }
        }
        if (z3) {
            u0Var.m23815b(C4403w.m27844o2(R.string.MuteForXHours, 1L));
            u0Var.m23815b(C4403w.m27844o2(R.string.MuteForXHours, 8L));
            u0Var.m23815b(C4403w.m27844o2(R.string.MuteForXDays, 2L));
            cVar2.m23284a(R.drawable.baseline_notifications_paused_24);
            cVar2.m23284a(R.drawable.baseline_notifications_paused_24);
            cVar2.m23284a(R.drawable.baseline_notifications_paused_24);
            cVar.m23284a(R.id.btn_menu_1hour);
            cVar.m23284a(R.id.btn_menu_8hours);
            cVar.m23284a(R.id.btn_menu_2days);
            if (cVar3 != null) {
                cVar3.m23284a(1);
                cVar3.m23284a(1);
                cVar3.m23284a(1);
            }
        }
        if (z4) {
            cVar.m23284a(R.id.btn_menu_customize);
            u0Var.m23816a(R.string.NotificationsCustomize);
            cVar2.m23284a(R.drawable.baseline_settings_24);
            if (cVar3 != null) {
                if (z6) {
                    i = 2;
                }
                cVar3.m23284a(i);
            }
        }
    }

    public static void m3652Z3(int i, TdApi.Message[] messageArr, C10930q6 q6Var, Runnable runnable, int i2, SparseIntArray sparseIntArray) {
        if (i2 == R.id.btn_deleteMessagesWithRevoke) {
            boolean z = sparseIntArray.get(R.id.btn_revokeMessages) != 0;
            if (!z || i <= 0) {
                C6035e<long[]> M1 = C4779t2.m25645M1(messageArr);
                for (int i3 = 0; i3 < M1.m21496p(); i3++) {
                    q6Var.m2770L4(M1.m21501j(i3), M1.m21495q(i3), z);
                }
            } else {
                TdApi.Message[] messageArr2 = new TdApi.Message[messageArr.length - i];
                TdApi.Message[] messageArr3 = new TdApi.Message[i];
                int i4 = 0;
                int i5 = 0;
                for (TdApi.Message message : messageArr) {
                    if (message.canBeDeletedForAllUsers) {
                        i5++;
                        messageArr2[i5] = message;
                    } else {
                        i4++;
                        messageArr3[i4] = message;
                    }
                }
                C6035e<long[]> M12 = C4779t2.m25645M1(messageArr2);
                for (int i6 = 0; i6 < M12.m21496p(); i6++) {
                    q6Var.m2770L4(M12.m21501j(i6), M12.m21495q(i6), true);
                }
                C6035e<long[]> M13 = C4779t2.m25645M1(messageArr3);
                for (int i7 = 0; i7 < M13.m21496p(); i7++) {
                    q6Var.m2770L4(M13.m21501j(i7), M13.m21495q(i7), false);
                }
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static void m3650Z5(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, List list, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            atomicInteger.incrementAndGet();
        }
        if (atomicInteger2.decrementAndGet() != 0) {
            return;
        }
        if (atomicInteger.get() == 1) {
            C1379j0.m37292y0(R.string.GifSaved, 0);
        } else {
            C1379j0.m37290z0(C4403w.m27836q2(R.string.XGifSaved, list.size()), 0);
        }
    }

    public static void m3648Z7(AbstractC9323v4<?> v4Var, boolean z, boolean z2) {
        String H0 = C10536ab.m4796H0(z);
        File file = new File(H0);
        if (!file.exists()) {
            C1379j0.m37290z0("Log does not exist", 0);
        } else if (file.length() == 0) {
            C1379j0.m37290z0("Log is empty", 0);
        } else {
            x00 x00Var = new x00(v4Var.mo4347s(), z2 ? null : v4Var.mo4348c());
            x00Var.m30994Vi(new x00.C3281m(H0, "text/plain"));
            x00Var.m30960ej();
        }
    }

    public static void m3643a3(C5320c cVar, C5146u0 u0Var) {
        cVar.m23284a(R.id.btn_reportChatSpam);
        u0Var.m23816a(R.string.Spam);
        cVar.m23284a(R.id.btn_reportChatFake);
        u0Var.m23816a(R.string.Fake);
        cVar.m23284a(R.id.btn_reportChatViolence);
        u0Var.m23816a(R.string.Violence);
        cVar.m23284a(R.id.btn_reportChatPornography);
        u0Var.m23816a(R.string.Pornography);
        cVar.m23284a(R.id.btn_reportChatChildAbuse);
        u0Var.m23816a(R.string.ChildAbuse);
        cVar.m23284a(R.id.btn_reportChatCopyright);
        u0Var.m23816a(R.string.Copyright);
        cVar.m23284a(R.id.btn_reportChatOther);
        u0Var.m23816a(R.string.Other);
    }

    public static void m3642a4(AbstractC9323v4 v4Var, AbstractC10782l lVar) {
        if (!v4Var.m9347Sa() && v4Var.m9284bc() != null) {
            v4Var.m9284bc().m9749M().m9514B(false);
            lVar.mo3341a();
        }
        C1379j0.m37292y0(R.string.EraseDatabaseDone, 0);
    }

    public void m3641a5(final AbstractC10664f9 f9Var, final C10788q qVar, final AbstractC5917i iVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == -981646294) {
                final TdApi.MessageLinkInfo messageLinkInfo = (TdApi.MessageLinkInfo) object;
                post(new Runnable() {
                    @Override
                    public final void run() {
                        HandlerC10770jj.this.m3661Y4(f9Var, messageLinkInfo, qVar, iVar);
                    }
                });
            }
        } else if (iVar != null) {
            post(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5917i.this.mo1322a(false);
                }
            });
        }
    }

    public static void m3640a6(int i) {
        C1379j0.m37290z0(C4403w.m27844o2(R.string.ReadAllChatsDone, i), 0);
    }

    public static void m3638a8(String str, C9262p0 p0Var) {
        C6250i iVar = new C6250i(str);
        iVar.mo20767t0(C9903a.getDefaultAvatarCacheSize());
        iVar.m20930Z(true);
        p0Var.setPhoto(iVar);
    }

    public static int[] m3633b3() {
        return Build.VERSION.SDK_INT >= 26 ? new int[]{4, 3, 2, 1} : new int[]{2, 1, -1};
    }

    public void m3632b4(final AbstractC9323v4 v4Var, final AbstractC10782l lVar) {
        this.f34459a.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                HandlerC10770jj.m3642a4(AbstractC9323v4.this, lVar);
            }
        });
    }

    public static void m3631b5(AbstractC10664f9 f9Var, TdApi.Background background, AbstractC5917i iVar) {
        View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(f9Var.mo4347s(), f9Var.mo4348c());
        rhVar.m32664Lp(new View$OnClickListenerC2971rh.C2977c0(5, null, null).m32136f(background));
        f9Var.mo4347s().m14552P1().m9719h0(rhVar);
        if (iVar != null) {
            iVar.mo1322a(true);
        }
    }

    public boolean m3630b6(View view, int i) {
        if (i == R.id.btn_markChatAsRead) {
            this.f34459a.m2732Na(new TdApi.ChatListArchive(), C10808kd.f34606a);
            return true;
        } else if (i != R.id.btn_pinUnpinChat) {
            return true;
        } else {
            this.f34459a.m2294pc().m4092u0(1L);
            return true;
        }
    }

    public void m3622c4(final AbstractC9323v4 v4Var, final AbstractC10782l lVar, boolean z, boolean z2) {
        Runnable tiVar = new Runnable() {
            @Override
            public final void run() {
                HandlerC10770jj.this.m3632b4(v4Var, lVar);
            }
        };
        if (z) {
            this.f34459a.m2573Y1(tiVar);
        } else {
            tiVar.run();
        }
    }

    public boolean m3620c6(AbstractC9323v4 v4Var, TdApi.ChatList chatList, long j, Runnable runnable, View view, int i) {
        if (i != R.id.btn_unarchiveChat && i != R.id.btn_archiveChat) {
            return true;
        }
        m3798K7(v4Var, chatList, j, null, i, runnable);
        return true;
    }

    public static StringBuilder m3619c7(String str, String str2) {
        StringBuilder sb2 = new StringBuilder("<b>");
        sb2.append(C4403w.m27869i1(R.string.UseProxyServer));
        sb2.append(":</b> ");
        sb2.append(str);
        sb2.append("<br/><b>");
        sb2.append(C4403w.m27869i1(R.string.UseProxyPort));
        sb2.append(":</b> ");
        sb2.append(str2);
        return sb2;
    }

    public void m3612d4(final AbstractC9323v4 v4Var, final AbstractC10782l lVar, final boolean z) {
        this.f34459a.m2509c5(new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z2) {
                HandlerC10770jj.this.m3622c4(v4Var, lVar, z, z2);
            }
        });
    }

    public void m3611d5(final AbstractC10664f9 f9Var, final AbstractC5917i iVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == -429971172) {
                final TdApi.Background background = (TdApi.Background) object;
                post(new Runnable() {
                    @Override
                    public final void run() {
                        HandlerC10770jj.m3631b5(AbstractC10664f9.this, background, iVar);
                    }
                });
            }
        } else if (iVar != null) {
            post(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5917i.this.mo1322a(false);
                }
            });
        }
    }

    public static String m3603e3(long j, TimeUnit timeUnit, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int seconds = (int) timeUnit.toSeconds(j);
        if (seconds < 0) {
            seconds = 0;
        }
        if (seconds < 60) {
            if (i == 0) {
                i5 = R.string.xSeconds;
            } else if (i == 1) {
                i5 = R.string.xSecondsShort;
            } else if (i == 2) {
                i5 = R.string.xSecondsRelative;
            } else {
                throw new IllegalArgumentException("mode == " + i);
            }
            return C4403w.m27844o2(i5, seconds);
        }
        int i6 = seconds / 60;
        if (i6 < 60) {
            if (i == 0) {
                i4 = R.string.xMinutes;
            } else if (i == 1) {
                i4 = R.string.xMinutesShort;
            } else if (i == 2) {
                i4 = R.string.xMinutesRelative;
            } else {
                throw new IllegalArgumentException("mode == " + i);
            }
            return C4403w.m27844o2(i4, i6);
        }
        int i7 = i6 / 60;
        if (i7 < 24) {
            if (i == 0) {
                i3 = R.string.xHours;
            } else if (i == 1) {
                i3 = R.string.xHoursShort;
            } else if (i == 2) {
                i3 = R.string.xHoursRelative;
            } else {
                throw new IllegalArgumentException("mode == " + i);
            }
            return C4403w.m27844o2(i3, i7);
        }
        int i8 = i7 / 24;
        if (i8 < 7) {
            if (i == 0) {
                i2 = R.string.xDays;
            } else if (i == 1) {
                i2 = R.string.xDaysShort;
            } else if (i == 2) {
                i2 = R.string.xDaysRelative;
            } else {
                throw new IllegalArgumentException("mode == " + i);
            }
            return C4403w.m27844o2(i2, i8);
        }
        int i9 = i8 / 7;
        int i10 = R.string.xWeeks;
        if (!(i == 0 || i == 1)) {
            if (i == 2) {
                i10 = R.string.xWeeksRelative;
            } else {
                throw new IllegalArgumentException("mode == " + i);
            }
        }
        return C4403w.m27844o2(i10, i9);
    }

    public static void m3601e5(AbstractC10664f9 f9Var, TdApi.DeepLinkInfo deepLinkInfo, AbstractC5917i iVar) {
        AbstractC9323v4<?> F = f9Var.mo4347s().m14552P1().m9763F();
        if (F != null) {
            F.m9215ld(deepLinkInfo);
        }
        if (iVar != null) {
            iVar.mo1322a(true);
        }
    }

    public boolean m3600e6(Runnable runnable, AbstractC9323v4 v4Var, TdApi.ChatList chatList, long j, C4737p7 p7Var, View view, int i) {
        if (i != R.id.btn_selectChat) {
            return m3798K7(v4Var, chatList, j, p7Var, i, null);
        }
        runnable.run();
        return true;
    }

    public static String m3593f3(long j, TimeUnit timeUnit, boolean z) {
        return m3603e3(j, timeUnit, !z ? 1 : 0);
    }

    public void m3592f4(final AbstractC9323v4 v4Var, final AbstractC10782l lVar, final boolean z, boolean z2) {
        if (z2 && !v4Var.m9347Sa() && v4Var.m9339Ta() && v4Var.m9284bc() != null) {
            C1379j0.m37292y0(R.string.EraseDatabaseProgress, 0);
            v4Var.m9284bc().m9749M().m9514B(true);
            lVar.mo3340b();
            C1379j0.m37292y0(R.string.EraseDatabaseProgress, 0);
            final Runnable uiVar = new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3612d4(v4Var, lVar, z);
                }
            };
            if (z) {
                this.f34459a.m2802J4(new AbstractC5917i() {
                    @Override
                    public final void mo1322a(boolean z3) {
                        uiVar.run();
                    }
                });
            } else {
                uiVar.run();
            }
        }
    }

    public void m3590f6(long j, Runnable runnable, int i, SparseIntArray sparseIntArray) {
        this.f34459a.m2270r4().m14783o(new TdApi.DeleteChatHistory(j, false, sparseIntArray.get(R.id.btn_clearChatHistory) == R.id.btn_clearChatHistory), this.f34459a.m2392ja());
        C7389v0.m16743D2(runnable);
    }

    public void m3582g4(final AbstractC9323v4 v4Var, final AbstractC10782l lVar, final boolean z, boolean z2) {
        if (z2) {
            v4Var.m9172re(C4403w.m27982H0(v4Var, R.string.EraseDatabaseWarn2, new Object[0]), new AbstractC5917i() {
                @Override
                public final void mo1322a(boolean z3) {
                    HandlerC10770jj.this.m3592f4(v4Var, lVar, z, z3);
                }
            });
        }
    }

    public void m3581g5(final AbstractC10664f9 f9Var, final AbstractC5917i iVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == 1864081662) {
                final TdApi.DeepLinkInfo deepLinkInfo = (TdApi.DeepLinkInfo) object;
                post(new Runnable() {
                    @Override
                    public final void run() {
                        HandlerC10770jj.m3601e5(AbstractC10664f9.this, deepLinkInfo, iVar);
                    }
                });
            }
        } else if (iVar != null) {
            post(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5917i.this.mo1322a(false);
                }
            });
        }
    }

    public boolean m3580g6(long j, Runnable runnable, View view, int i) {
        if (i != R.id.btn_clearChatHistory) {
            return true;
        }
        this.f34459a.m2270r4().m14783o(new TdApi.DeleteChatHistory(j, false, false), this.f34459a.m2392ja());
        C7389v0.m16743D2(runnable);
        return true;
    }

    public void m3572h4(AbstractC9323v4 v4Var, C11533r rVar, String str, boolean z, boolean z2, String str2) {
        m3683W2(v4Var, rVar.m110c(), str, str2, z, z2);
    }

    public void m3571h5(final AbstractC10664f9 f9Var, TdApi.InternalLinkType internalLinkType, final C10788q qVar, String str, final AbstractC5917i iVar) {
        if (!f9Var.mo4347s().m14552P1().m9738W()) {
            boolean z = true;
            switch (internalLinkType.getConstructor()) {
                case TdApi.InternalLinkTypeVideoChat.CONSTRUCTOR:
                    m3828H7(f9Var, (TdApi.InternalLinkTypeVideoChat) internalLinkType, qVar);
                    break;
                case TdApi.InternalLinkTypeUserPhoneNumber.CONSTRUCTOR:
                    m3539k7(f9Var, 0L, null, new TdApi.SearchUserByPhoneNumber(((TdApi.InternalLinkTypeUserPhoneNumber) internalLinkType).phoneNumber), null);
                    break;
                case TdApi.InternalLinkTypePublicChat.CONSTRUCTOR:
                    TdApi.InternalLinkTypePublicChat internalLinkTypePublicChat = (TdApi.InternalLinkTypePublicChat) internalLinkType;
                    if (!"iv".equals(internalLinkTypePublicChat.chatUsername)) {
                        m3399y7(f9Var, internalLinkTypePublicChat.chatUsername, qVar);
                        break;
                    } else {
                        m3509n7(f9Var, str, new C10788q(qVar).m3322i());
                        break;
                    }
                case TdApi.InternalLinkTypeLanguagePack.CONSTRUCTOR:
                    z = m3413x3(f9Var, ((TdApi.InternalLinkTypeLanguagePack) internalLinkType).languagePackId, qVar);
                    break;
                case TdApi.InternalLinkTypeProxy.CONSTRUCTOR:
                    TdApi.InternalLinkTypeProxy internalLinkTypeProxy = (TdApi.InternalLinkTypeProxy) internalLinkType;
                    String str2 = internalLinkTypeProxy.server;
                    int i = internalLinkTypeProxy.port;
                    m3419w7(f9Var, str2, i, internalLinkTypeProxy.type, m3619c7(str2, Integer.toString(i)).toString());
                    break;
                case TdApi.InternalLinkTypeBotStart.CONSTRUCTOR:
                    TdApi.InternalLinkTypeBotStart internalLinkTypeBotStart = (TdApi.InternalLinkTypeBotStart) internalLinkType;
                    m3727R8(f9Var, internalLinkTypeBotStart.botUsername, internalLinkTypeBotStart.startParameter, 0, qVar);
                    break;
                case TdApi.InternalLinkTypeQrCodeAuthentication.CONSTRUCTOR:
                    m3857E8(this.f34459a, R.drawable.baseline_warning_24, C4403w.m27869i1(R.string.ScanQRLinkHint), qVar);
                    break;
                case TdApi.InternalLinkTypeThemeSettings.CONSTRUCTOR:
                    View$OnClickListenerC2364ez ezVar = new View$OnClickListenerC2364ez(f9Var.mo4347s(), f9Var.mo4348c());
                    ezVar.m34831Wh(new View$OnClickListenerC2364ez.C2367c(0));
                    f9Var.mo4347s().m14552P1().m9719h0(ezVar);
                    break;
                case TdApi.InternalLinkTypeBotStartInGroup.CONSTRUCTOR:
                    TdApi.InternalLinkTypeBotStartInGroup internalLinkTypeBotStartInGroup = (TdApi.InternalLinkTypeBotStartInGroup) internalLinkType;
                    m3727R8(f9Var, internalLinkTypeBotStartInGroup.botUsername, internalLinkTypeBotStartInGroup.startParameter, 1, qVar);
                    break;
                case TdApi.InternalLinkTypePassportDataRequest.CONSTRUCTOR:
                    TdApi.InternalLinkTypePassportDataRequest internalLinkTypePassportDataRequest = (TdApi.InternalLinkTypePassportDataRequest) internalLinkType;
                    break;
                case TdApi.InternalLinkTypeUnsupportedProxy.CONSTRUCTOR:
                    m3857E8(this.f34459a, R.drawable.baseline_warning_24, C4403w.m27869i1(R.string.ProxyLinkUnsupported), qVar);
                    break;
                case TdApi.InternalLinkTypeStickerSet.CONSTRUCTOR:
                    m3767N8(f9Var, ((TdApi.InternalLinkTypeStickerSet) internalLinkType).stickerSetName, qVar);
                    break;
                case TdApi.InternalLinkTypeChangePhoneNumber.CONSTRUCTOR:
                    f9Var.mo4347s().m14552P1().m9719h0(new View$OnClickListenerC2461gw(f9Var.mo4347s(), f9Var.mo4348c()));
                    break;
                case TdApi.InternalLinkTypeGame.CONSTRUCTOR:
                    TdApi.InternalLinkTypeGame internalLinkTypeGame = (TdApi.InternalLinkTypeGame) internalLinkType;
                    m3727R8(f9Var, internalLinkTypeGame.botUsername, internalLinkTypeGame.gameShortName, 2, qVar);
                    break;
                case TdApi.InternalLinkTypeAuthenticationCode.CONSTRUCTOR:
                    this.f34459a.m2781K9().m1966D0(((TdApi.InternalLinkTypeAuthenticationCode) internalLinkType).code);
                    break;
                case TdApi.InternalLinkTypeTheme.CONSTRUCTOR:
                    TdApi.InternalLinkTypeTheme internalLinkTypeTheme = (TdApi.InternalLinkTypeTheme) internalLinkType;
                    m3857E8(this.f34459a, R.drawable.baseline_info_24, C4403w.m27982H0(f9Var, R.string.NoCloudThemeSupport, new Object[0]), qVar);
                    break;
                case TdApi.InternalLinkTypeBackground.CONSTRUCTOR:
                    this.f34459a.m2270r4().m14783o(new TdApi.SearchBackground(((TdApi.InternalLinkTypeBackground) internalLinkType).backgroundName), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            HandlerC10770jj.this.m3611d5(f9Var, iVar, object);
                        }
                    });
                    return;
                case TdApi.InternalLinkTypeSettings.CONSTRUCTOR:
                    f9Var.mo4347s().m14552P1().m9719h0(new View$OnClickListenerC3217vt(f9Var.mo4347s(), f9Var.mo4348c()));
                    break;
                case TdApi.InternalLinkTypeChatInvite.CONSTRUCTOR:
                    m3803K2(f9Var, ((TdApi.InternalLinkTypeChatInvite) internalLinkType).inviteLink, qVar);
                    break;
                case TdApi.InternalLinkTypeUnknownDeepLink.CONSTRUCTOR:
                    this.f34459a.m2270r4().m14783o(new TdApi.GetDeepLinkInfo(str), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            HandlerC10770jj.this.m3581g5(f9Var, iVar, object);
                        }
                    });
                    return;
                case TdApi.InternalLinkTypeMessageDraft.CONSTRUCTOR:
                    x00 x00Var = new x00(f9Var.mo4347s(), f9Var.mo4348c());
                    x00Var.m30994Vi(new x00.C3281m(((TdApi.InternalLinkTypeMessageDraft) internalLinkType).text));
                    x00Var.m30960ej();
                    break;
                case TdApi.InternalLinkTypeMessage.CONSTRUCTOR:
                    this.f34459a.m2270r4().m14783o(new TdApi.GetMessageLinkInfo(((TdApi.InternalLinkTypeMessage) internalLinkType).url), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            HandlerC10770jj.this.m3641a5(f9Var, qVar, iVar, object);
                        }
                    });
                    return;
                case TdApi.InternalLinkTypeFilterSettings.CONSTRUCTOR:
                default:
                    z = false;
                    break;
                case TdApi.InternalLinkTypePhoneNumberConfirmation.CONSTRUCTOR:
                    final TdApi.InternalLinkTypePhoneNumberConfirmation internalLinkTypePhoneNumberConfirmation = (TdApi.InternalLinkTypePhoneNumberConfirmation) internalLinkType;
                    final AbstractC9323v4<?> F = f9Var.mo4347s().m14552P1().m9763F();
                    this.f34459a.m2270r4().m14783o(new TdApi.SendPhoneNumberConfirmationCode(internalLinkTypePhoneNumberConfirmation.hash, internalLinkTypePhoneNumberConfirmation.phoneNumber, C4779t2.m25509h0()), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            HandlerC10770jj.this.m3671X4(F, f9Var, internalLinkTypePhoneNumberConfirmation, qVar, object);
                        }
                    });
                    break;
                case TdApi.InternalLinkTypeActiveSessions.CONSTRUCTOR:
                    f9Var.mo4347s().m14552P1().m9719h0(new g20(f9Var.mo4347s(), f9Var.mo4348c(), new AbstractC9323v4[]{new View$OnClickListenerC2265cy(f9Var.mo4347s(), f9Var.mo4348c()), new View$OnClickListenerC2899pz(f9Var.mo4347s(), f9Var.mo4348c())}, new String[]{C4403w.m27869i1(R.string.Devices).toUpperCase(), C4403w.m27869i1(R.string.Websites).toUpperCase()}, false));
                    break;
            }
            if (iVar != null) {
                iVar.mo1322a(z);
            }
        }
    }

    public static int m3563i3(int i) {
        switch (i) {
            case R.id.btn_menu_1hour:
                return 3600;
            case R.id.btn_menu_2days:
                return 172800;
            case R.id.btn_menu_8hours:
                return 28800;
            case R.id.btn_menu_customize:
            default:
                return -1;
            case R.id.btn_menu_disable:
                return Integer.MAX_VALUE;
            case R.id.btn_menu_enable:
                return 0;
        }
    }

    public boolean m3560i6(boolean z, TdApi.SecretChat secretChat, final AbstractC5917i iVar, View view, int i) {
        if (i == R.id.btn_removeChatFromList) {
            if (z) {
                this.f34459a.m2496d2(new TdApi.MessageSenderUser(secretChat.userId), true, new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        AbstractC5917i.this.mo1322a(false);
                    }
                });
            } else {
                iVar.mo1322a(false);
            }
        }
        return true;
    }

    public static TdApi.LanguagePackStringValuePluralized m3553j3(String str, String str2, Map<String, TdApi.LanguagePackStringValue> map) {
        String substring = str.substring(0, (str.length() - str2.length()) - 1);
        TdApi.LanguagePackStringValue languagePackStringValue = map.get(substring);
        if (languagePackStringValue instanceof TdApi.LanguagePackStringValuePluralized) {
            return (TdApi.LanguagePackStringValuePluralized) languagePackStringValue;
        }
        TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized = new TdApi.LanguagePackStringValuePluralized();
        map.put(substring, languagePackStringValuePluralized);
        return languagePackStringValuePluralized;
    }

    public boolean m3552j4(final AbstractC5918j jVar, View$OnFocusChangeListenerC7069y1 y1Var, final String str) {
        if (str.startsWith("@")) {
            str = str.substring(1);
        } else if (this.f34459a.m2235t7(str)) {
            int indexOf = str.indexOf("://");
            if (indexOf != -1) {
                str = str.substring(indexOf + 3);
            }
            int indexOf2 = str.indexOf(47);
            if (indexOf2 == -1) {
                return false;
            }
            str = str.substring(indexOf2 + 1);
        }
        if (C5070i.m24061i(str)) {
            str = null;
        } else if (!C4779t2.m25407v4(str) || str.length() > 32) {
            return false;
        }
        this.f34459a.m2485dd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                AbstractC5918j.this.mo1330a(str);
            }
        }, 100L);
        return true;
    }

    public void m3551j5(final AbstractC10664f9 f9Var, final C10788q qVar, final String str, final AbstractC5917i iVar, TdApi.Object object) {
        if (object instanceof TdApi.InternalLinkType) {
            final TdApi.InternalLinkType internalLinkType = (TdApi.InternalLinkType) object;
            post(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3571h5(f9Var, internalLinkType, qVar, str, iVar);
                }
            });
        } else if (iVar != null) {
            post(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5917i.this.mo1322a(false);
                }
            });
        }
    }

    public void m3550j6(final long j, AbstractC9323v4 v4Var, String str, final AbstractC5917i iVar, final boolean z) {
        final TdApi.SecretChat X3 = this.f34459a.m2586X3(j);
        if (X3 != null) {
            if (X3.state.getConstructor() != -1611352087 || !this.f34459a.m2320o2(j) || (!(v4Var instanceof View$OnClickListenerC2971rh) && this.f34459a.m2300p6(j))) {
                v4Var.m9261ee(C4403w.m27853m1(X3.state.getConstructor() == -1637050756 ? R.string.DeleteSecretChatPendingConfirm : R.string.DeleteSecretChatClosedConfirm, str), new int[]{R.id.btn_removeChatFromList, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.DeleteChat), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i) {
                        boolean i6;
                        i6 = HandlerC10770jj.this.m3560i6(z, X3, iVar, view, i);
                        return i6;
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
            } else {
                v4Var.m9206me(new C9188f2(R.id.btn_removeChatFromList).m10010c(false).m10011b(C4403w.m27853m1(R.string.DeleteSecretChatConfirm, str)).m9997p(new C2964ra[]{new C2964ra(12, (int) R.id.btn_clearChatHistory, 0, (CharSequence) C4403w.m27865j1(R.string.DeleteSecretChatHistoryForOtherParty, str), (int) R.id.btn_clearChatHistory, false)}).m9996q(R.id.theme_color_textNegative).m9995r(R.string.Delete).m10003j(new AbstractC9323v4.AbstractC9343r() {
                    @Override
                    public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                        HandlerC10770jj.this.m3440u6(j, iVar, i, sparseIntArray);
                    }
                }));
            }
        }
    }

    public static int m3543k3(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (i == 1) {
                return R.id.btn_importanceMin;
            }
            if (i == 2) {
                return R.id.btn_importanceLow;
            }
            if (i == 3) {
                return R.id.btn_importanceDefault;
            }
            if (i == 4) {
                return R.id.btn_importanceHigh;
            }
        } else if (i == -1) {
            return R.id.btn_priorityLow;
        } else {
            if (i == 1) {
                return R.id.btn_priorityHigh;
            }
            if (i == 2) {
                return R.id.btn_priorityMax;
            }
        }
        throw new IllegalArgumentException("priorityOrImportance == " + i);
    }

    public static void m3542k4(AbstractC9323v4 v4Var, ViewGroup viewGroup) {
        TextView R = C2139ap.m35484R(v4Var.mo4347s(), 9, R.id.theme_color_textLight, null, v4Var);
        R.setText(C4403w.m27869i1(R.string.ThemeExportInfo));
        R.setPadding(0, C1357a0.m37541i(12.0f), 0, 0);
        viewGroup.addView(R);
    }

    public void m3541k5(AbstractC10664f9 f9Var, String str, C10788q qVar, boolean z) {
        if (!z) {
            m3509n7(f9Var, str, qVar);
        }
    }

    public static boolean m3540k6(AbstractC5917i iVar, View view, int i) {
        if (i != R.id.btn_removeChatFromList) {
            return true;
        }
        iVar.mo1322a(false);
        return true;
    }

    public static int m3533l3(int i, boolean z, boolean z2) {
        if (i == -100) {
            return R.string.Default;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return i != -1 ? i != 2 ? R.string.PriorityRegular : R.string.PriorityUrgent : R.string.PriorityLow;
        }
        if (i == 0) {
            return R.string.NotificationImportanceNone;
        }
        if (i == 1) {
            return R.string.NotificationImportanceMin;
        }
        if (i == 2) {
            return (z || z2) ? R.string.NotificationImportanceLow : R.string.NotificationImportanceLowMuted;
        }
        if (i == 3) {
            return z ? R.string.NotificationImportanceDefault : z2 ? R.string.NotificationImportanceDefaultNoSound : R.string.NotificationImportanceDefaultMuted;
        }
        if (i == 4 || i == 5) {
            return z ? R.string.NotificationImportanceHigh : z2 ? R.string.NotificationImportanceHighNoSound : R.string.NotificationImportanceHighMuted;
        }
        throw new IllegalArgumentException("priorityOrImportance == " + i);
    }

    public void m3532l4(AbstractC10664f9 f9Var, TdApi.LanguagePackInfo languagePackInfo) {
        if (f9Var.mo4347s().m14582I0() != 2) {
            m3867D8(f9Var, languagePackInfo);
        }
    }

    public void m3530l6(long j, AbstractC9323v4 v4Var, Runnable runnable, final AbstractC5917i iVar) {
        TdApi.ChatMemberStatus K3 = this.f34459a.m2787K3(j);
        if (K3 == null || !C4779t2.m25499i3(K3, false)) {
            v4Var.m9261ee(C4403w.m27869i1(R.string.AreYouSureDeleteThisChat), new int[]{R.id.btn_removeChatFromList, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.DeleteChat), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean k6;
                    k6 = HandlerC10770jj.m3540k6(AbstractC5917i.this, view, i);
                    return k6;
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
        } else {
            m3649Z6(v4Var, j, false, runnable);
        }
    }

    public void m3522m4(final AbstractC10664f9 f9Var, C10788q qVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            m3857E8(f9Var.mo4348c(), R.drawable.baseline_warning_24, C4779t2.m25378z5(object), qVar);
        } else if (constructor != 542199642) {
            Log.unexpectedTdlibResponse(object, TdApi.GetLanguagePackInfo.class, TdApi.LanguagePackInfo.class, TdApi.Error.class);
        } else {
            final TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) object;
            this.f34459a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3532l4(f9Var, languagePackInfo);
                }
            });
        }
    }

    public void m3521m5(AbstractC10664f9 f9Var, String str, C10788q qVar, DialogInterface dialogInterface, int i) {
        this.f34459a.m2485dd().m3509n7(f9Var, str, qVar.m3325f());
    }

    public void m3520m6(AbstractC9323v4 v4Var, long j, Runnable runnable) {
        m3649Z6(v4Var, j, false, runnable);
    }

    public static void m3518m8(AbstractC10664f9 f9Var, C10788q qVar, int i, boolean z) {
        m3857E8(f9Var.mo4348c(), R.drawable.baseline_warning_24, C4403w.m27869i1(i != -3 ? i != -2 ? R.string.ChatAccessFailed : z ? R.string.ChatAccessRestrictedChannel : R.string.ChatAccessRestrictedGroup : z ? R.string.ChatAccessPrivateChannel : R.string.ChatAccessPrivateGroup), qVar);
    }

    public void m3512n4(TdApi.ChatMemberStatus chatMemberStatus, long j, TdApi.MessageSender messageSender, int i, SparseIntArray sparseIntArray) {
        boolean z = sparseIntArray.get(R.id.right_readMessages) != 0;
        if (chatMemberStatus.getConstructor() != 1661432998 || z) {
            this.f34459a.m2811Ib(j, messageSender, new TdApi.ChatMemberStatusBanned(), chatMemberStatus, null);
            if (!z) {
                this.f34459a.m2811Ib(j, messageSender, new TdApi.ChatMemberStatusLeft(), chatMemberStatus, null);
                return;
            }
            return;
        }
        TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) chatMemberStatus;
        this.f34459a.m2811Ib(j, messageSender, new TdApi.ChatMemberStatusRestricted(false, chatMemberStatusRestricted.restrictedUntilDate, chatMemberStatusRestricted.permissions), chatMemberStatus, null);
    }

    public void m3510n6(long j, AbstractC9323v4 v4Var, Runnable runnable, boolean z) {
        this.f34459a.m2786K4(j, z, null);
        m3703U2(v4Var, j);
        C7389v0.m16743D2(runnable);
    }

    public static String m3503o3(int i) {
        return m3493p3(i, false);
    }

    public void m3502o4(C2964ra raVar, long j, TdApi.MessageSender messageSender, View view, int i, C2964ra raVar2, TextView textView, C2546iq iqVar) {
        raVar.m32853X(m3623c3(j, messageSender, iqVar.m34252A0().get(R.id.right_readMessages) != 0));
        iqVar.m34124u3(iqVar.m34235H0(raVar));
    }

    public static void m3501o5(AtomicBoolean atomicBoolean, AbstractRunnableC5910b[] bVarArr, AbstractC10664f9 f9Var, TdApi.WebPage webPage, TdApi.WebPageInstantView webPageInstantView, String str) {
        if (!atomicBoolean.getAndSet(true)) {
            bVarArr[0].m21857c();
            View$OnClickListenerC3147u9 u9Var = new View$OnClickListenerC3147u9(f9Var.mo4347s(), f9Var.mo4348c());
            try {
                u9Var.m9476Ad(new View$OnClickListenerC3147u9.C3149b(webPage, webPageInstantView, Uri.parse(str).getEncodedFragment()));
                u9Var.m31337bf();
            } catch (Throwable th) {
                Log.m14725e("Unable to open instantView, url:%s", th, str);
                C1379j0.m37292y0(R.string.InstantViewUnsupported, 0);
                C1379j0.m37336c0(str);
            }
        }
    }

    public static String m3493p3(int i, boolean z) {
        String str;
        if (i <= 0) {
            return C4403w.m27869i1(z ? R.string.NotificationsDefaultEnabled : R.string.NotificationsEnabled);
        } else if (i >= 345600) {
            return C4403w.m27869i1(z ? R.string.NotificationsDefaultDisabled : R.string.NotificationsDisabled);
        } else {
            float f = i;
            int round = Math.round(f / 60.0f);
            int round2 = Math.round(f / 3600.0f);
            int round3 = Math.round(f / 86400.0f);
            if (round3 > 0) {
                str = C4403w.m27844o2(R.string.xDays, round3);
            } else if (round2 > 0) {
                str = C4403w.m27844o2(R.string.xHours, round2);
            } else {
                str = C4403w.m27844o2(R.string.xMinutes, Math.max(0, round));
            }
            return C4403w.m27865j1(z ? R.string.NotificationsDefaultUnmutesIn : R.string.UnmutesInX, str);
        }
    }

    public boolean m3492p4(long j, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, View view, int i) {
        if (i != R.id.btn_blockSender) {
            return true;
        }
        this.f34459a.m2811Ib(j, messageSender, new TdApi.ChatMemberStatusLeft(), chatMemberStatus, null);
        return true;
    }

    public void m3491p5(final AbstractRunnableC5910b[] bVarArr, final AtomicBoolean atomicBoolean, final AbstractC10664f9 f9Var, final TdApi.WebPage webPage, final String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            post(bVarArr[0]);
        } else if (constructor == 778202453) {
            final TdApi.WebPageInstantView webPageInstantView = (TdApi.WebPageInstantView) object;
            if (!C4779t2.m25388y2(webPageInstantView.version)) {
                post(bVarArr[0]);
            } else {
                post(new Runnable() {
                    @Override
                    public final void run() {
                        HandlerC10770jj.m3501o5(atomicBoolean, bVarArr, f9Var, webPage, webPageInstantView, str);
                    }
                });
            }
        }
    }

    public void m3490p6(boolean z, long j, final AbstractC5917i iVar, int i, SparseIntArray sparseIntArray) {
        final boolean z2 = sparseIntArray.get(R.id.btn_clearChatHistory) == R.id.btn_clearChatHistory;
        if (z) {
            this.f34459a.m2496d2(new TdApi.MessageSenderUser(j), true, new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    AbstractC5917i.this.mo1322a(z2);
                }
            });
        } else {
            iVar.mo1322a(z2);
        }
    }

    public void m3482q4(long j, TdApi.ChatMemberStatus chatMemberStatus, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
            Log.m14724e("setChatMemberStatus chatId:%d, status:%s error:%s", Long.valueOf(j), chatMemberStatus, C4779t2.m25378z5(object));
        } else if (constructor == -722616727 && C7316a.m17054g(j)) {
            this.f34459a.m2270r4().m14783o(new TdApi.DeleteChatHistory(j, true, false), this.f34459a.m2392ja());
        }
    }

    public void m3481q5(AtomicReference atomicReference, int i, final AbstractRunnableC5910b[] bVarArr, final String str, final AtomicBoolean atomicBoolean, final AbstractC10664f9 f9Var, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            post(bVarArr[0]);
        } else if (constructor == -577333714) {
            final TdApi.WebPage webPage = (TdApi.WebPage) object;
            atomicReference.set(webPage);
            if (i == 0 || !C4779t2.m25388y2(webPage.instantViewVersion) || C4779t2.m25476l5(webPage)) {
                post(bVarArr[0]);
            } else {
                this.f34459a.m2270r4().m14783o(new TdApi.GetWebPageInstantView(str, false), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object2) {
                        HandlerC10770jj.this.m3491p5(bVarArr, atomicBoolean, f9Var, webPage, str, object2);
                    }
                });
            }
        }
    }

    public void m3472r4(boolean z, final long j, final TdApi.ChatMemberStatus chatMemberStatus, AbstractC9323v4 v4Var, boolean z2) {
        long ba2 = this.f34459a.m2519ba();
        if (ba2 == 0) {
            return;
        }
        if (z) {
            this.f34459a.m2270r4().m14783o(new TdApi.AddChatMember(j, ba2, 0), this.f34459a.m2392ja());
            return;
        }
        Client.AbstractC7865g ja = this.f34459a.m2392ja();
        if (z2) {
            ja = new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    HandlerC10770jj.this.m3482q4(j, chatMemberStatus, object);
                }
            };
        }
        this.f34459a.m2270r4().m14783o(new TdApi.SetChatMemberStatus(j, new TdApi.MessageSenderUser(ba2), chatMemberStatus), ja);
        if (!C4779t2.m25499i3(chatMemberStatus, false)) {
            m3703U2(v4Var, j);
        }
    }

    public boolean m3471r5(AbstractC9323v4 v4Var, String str, C10788q qVar, View view, int i) {
        if (i == R.id.btn_copyLink) {
            C1379j0.m37325i(str, R.string.CopiedLink);
            return true;
        } else if (i != R.id.btn_open) {
            return true;
        } else {
            m3858E7(v4Var, str, qVar);
            return true;
        }
    }

    public boolean m3470r6(boolean z, long j, final AbstractC5917i iVar, View view, int i) {
        if (i == R.id.btn_removeChatFromList) {
            if (z) {
                this.f34459a.m2496d2(new TdApi.MessageSenderUser(j), true, new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        AbstractC5917i.this.mo1322a(false);
                    }
                });
            } else {
                iVar.mo1322a(false);
            }
        }
        return true;
    }

    public static void m3462s4(AbstractC5917i iVar, int i, SparseIntArray sparseIntArray) {
        iVar.mo1322a(sparseIntArray.get(R.id.btn_removeChatFromList) == R.id.btn_removeChatFromList);
    }

    public static void m3461s5(AbstractC10664f9 f9Var, TdApi.DeepLinkInfo deepLinkInfo) {
        AbstractC9323v4<?> F = f9Var.mo4347s().m14552P1().m9763F();
        if (F != null) {
            F.m9215ld(deepLinkInfo);
        }
    }

    public void m3460s6(final long j, AbstractC9323v4 v4Var, boolean z, String str, long j2, final boolean z2, final AbstractC5917i iVar) {
        CharSequence m1;
        if (this.f34459a.m2379k7(j)) {
            m1 = C4403w.m27982H0(v4Var, R.string.DeleteSavedMessagesConfirm, new Object[0]);
        } else if (z) {
            if (this.f34459a.m2475e7(C7316a.m17058c(j))) {
                m1 = C4403w.m27982H0(v4Var, R.string.DeleteAndStopRepliesConfirm, new Object[0]);
            } else {
                m1 = C4403w.m27853m1(R.string.DeleteAndStopBotConfirm, str);
            }
        } else if (this.f34459a.m2475e7(C7316a.m17058c(j))) {
            m1 = C4403w.m27982H0(v4Var, R.string.DeleteRepliesConfirm, new Object[0]);
        } else {
            m1 = C4403w.m27853m1(R.string.DeleteUserChatConfirm, str);
        }
        CharSequence charSequence = m1;
        if (this.f34459a.m2836H2(j2)) {
            v4Var.m9206me(new C9188f2(R.id.btn_removeChatFromList).m10010c(false).m10011b(charSequence).m9997p(new C2964ra[]{new C2964ra(12, (int) R.id.btn_clearChatHistory, 0, (CharSequence) C4403w.m27865j1(R.string.DeleteSecretChatHistoryForOtherParty, str), (int) R.id.btn_clearChatHistory, false)}).m9996q(R.id.theme_color_textNegative).m9995r(R.string.Delete).m10003j(new AbstractC9323v4.AbstractC9343r() {
                @Override
                public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                    HandlerC10770jj.this.m3490p6(z2, j, iVar, i, sparseIntArray);
                }
            }));
            return;
        }
        int[] iArr = {R.id.btn_removeChatFromList, R.id.btn_cancel};
        String[] strArr = new String[2];
        strArr[0] = C4403w.m27869i1(z ? R.string.DeleteAndStop : R.string.DeleteChat);
        strArr[1] = C4403w.m27869i1(R.string.Cancel);
        v4Var.m9261ee(charSequence, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean r6;
                r6 = HandlerC10770jj.this.m3470r6(z2, j, iVar, view, i);
                return r6;
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

    public static boolean m3452t4(int i, AbstractC5917i iVar, View view, int i2) {
        if (i2 != i) {
            return true;
        }
        iVar.mo1322a(false);
        return true;
    }

    public void m3451t5(final AbstractC10664f9 f9Var, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37292y0(R.string.DeepLinkUnsupported, 0);
        } else if (constructor == 1864081662) {
            final TdApi.DeepLinkInfo deepLinkInfo = (TdApi.DeepLinkInfo) object;
            this.f34459a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.m3461s5(AbstractC10664f9.this, deepLinkInfo);
                }
            });
        }
    }

    public static void m3450t6(long j, AbstractC5917i iVar, TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.m14724e("Cannot clear secret chat history, secretChatId:%d, error: %s", Integer.valueOf(C7316a.m17047n(j)), C4779t2.m25378z5(object));
        }
        iVar.mo1322a(false);
    }

    public static void m3442u4(AbstractC9323v4 v4Var, TdApi.Object object, AbstractC10664f9 f9Var, C10788q qVar) {
        if (v4Var != null && !v4Var.m9347Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -1816236758) {
                View$OnClickListenerC2096i.m35619W1(f9Var, (TdApi.StickerSet) object);
            } else if (constructor == -1679978726) {
                m3857E8(f9Var.mo4348c(), R.drawable.baseline_warning_24, C4779t2.m25378z5(object), qVar);
            } else if (constructor == 1207538697) {
                View$OnClickListenerC2096i.m35618X1(f9Var, (TdApi.StickerSetInfo) object);
            }
        }
    }

    public static void m3441u5(AbstractC5918j jVar, long j) {
        jVar.mo1330a(new TdApi.MessageSchedulingStateSendAtDate((int) (j / 1000)));
    }

    public void m3440u6(final long j, final AbstractC5917i iVar, int i, SparseIntArray sparseIntArray) {
        if (sparseIntArray.get(R.id.btn_clearChatHistory) == R.id.btn_clearChatHistory) {
            this.f34459a.m2270r4().m14783o(new TdApi.DeleteChatHistory(j, false, false), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    HandlerC10770jj.m3450t6(j, iVar, object);
                }
            });
        } else {
            iVar.mo1322a(false);
        }
    }

    public static void m3432v4(final AbstractC10664f9 f9Var, final AbstractC9323v4 v4Var, final C10788q qVar, final TdApi.Object object) {
        f9Var.mo4348c().m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                HandlerC10770jj.m3442u4(AbstractC9323v4.this, object, f9Var, qVar);
            }
        });
    }

    public boolean m3431v5(final AbstractC5918j jVar, boolean z, AbstractC9323v4 v4Var, AbstractC11531p pVar, View view, int i) {
        long j;
        int i2;
        int i3;
        int i4;
        int i5;
        switch (i) {
            case R.id.btn_sendNoSound:
                jVar.mo1330a(null);
                return true;
            case R.id.btn_sendOnceOnline:
                jVar.mo1330a(new TdApi.MessageSchedulingStateSendWhenOnline());
                return true;
            case R.id.btn_sendScheduled:
            default:
                j = 0;
                break;
            case R.id.btn_sendScheduled2Hr:
                j = TimeUnit.HOURS.toSeconds(2L);
                break;
            case R.id.btn_sendScheduled30Min:
                j = TimeUnit.MINUTES.toSeconds(30L);
                break;
            case R.id.btn_sendScheduled8Hr:
                j = TimeUnit.HOURS.toSeconds(8L);
                break;
            case R.id.btn_sendScheduledCustom:
                if (z) {
                    i2 = R.string.SendReminder;
                    i5 = R.string.RemindTodayAt;
                    i4 = R.string.RemindTomorrowAt;
                    i3 = R.string.RemindDateAt;
                } else {
                    i2 = R.string.SendSchedule;
                    i5 = R.string.SendTodayAt;
                    i4 = R.string.SendTomorrowAt;
                    i3 = R.string.SendDateAt;
                }
                v4Var.m9309Xd(C4403w.m27869i1(i2), i5, i4, i3, new AbstractC5920l() {
                    @Override
                    public final void mo3050a(long j2) {
                        HandlerC10770jj.m3441u5(AbstractC5918j.this, j2);
                    }
                }, pVar);
                return true;
        }
        if (j > 0) {
            jVar.mo1330a(new TdApi.MessageSchedulingStateSendAtDate((int) ((this.f34459a.m2898D4() / 1000) + j)));
        }
        return true;
    }

    public static boolean m3430v6(TdApi.Message[] messageArr, C10930q6 q6Var, Runnable runnable, View view, int i) {
        if (i != R.id.menu_btn_delete) {
            return true;
        }
        C6035e<long[]> M1 = C4779t2.m25645M1(messageArr);
        for (int i2 = 0; i2 < M1.m21496p(); i2++) {
            q6Var.m2770L4(M1.m21501j(i2), M1.m21495q(i2), false);
        }
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    public static void m3428v8(AbstractC9323v4<?> v4Var, TdApi.Message message) {
        m3418w8(v4Var, new TdApi.Message[]{message}, null);
    }

    public void m3422w4(AbstractC10664f9 f9Var, TdApi.BankCardInfo bankCardInfo, String str) {
        TdApi.BankCardActionOpenUrl[] bankCardActionOpenUrlArr;
        AbstractC9323v4<?> s = f9Var instanceof AbstractC9323v4 ? (AbstractC9323v4) f9Var : C1379j0.m37305s();
        boolean z = bankCardInfo.actions.length > 0;
        if (!(s == null || s.m9347Sa())) {
            C5320c cVar = new C5320c(z ? 1 : bankCardInfo.actions.length);
            C5146u0 u0Var = new C5146u0(z ? 1 : bankCardInfo.actions.length);
            int[] iArr = null;
            if (z) {
                for (TdApi.BankCardActionOpenUrl bankCardActionOpenUrl : bankCardInfo.actions) {
                    cVar.m23284a(R.id.btn_openLink);
                    u0Var.m23815b(bankCardActionOpenUrl.text);
                }
            } else {
                cVar.m23284a(R.id.btn_copyLink);
                u0Var.m23816a(R.string.CopyBankCard);
                iArr = new int[]{R.drawable.baseline_content_copy_24};
            }
            s.m9261ee(bankCardInfo.title, cVar.m23280e(), u0Var.m23813d(), null, iArr, new C10779i(str, z, bankCardInfo));
        }
    }

    public boolean m3420w6(Runnable runnable, AbstractC9323v4 v4Var, long j, Runnable runnable2, View view, int i) {
        if (i == R.id.btn_clearChatHistory) {
            m3458s8(v4Var, j, runnable2);
            return true;
        } else if (i != R.id.btn_removeChatFromList) {
            return true;
        } else {
            runnable.run();
            return true;
        }
    }

    public static void m3418w8(AbstractC9323v4<?> v4Var, final TdApi.Message[] messageArr, final Runnable runnable) {
        boolean z;
        String str;
        int i;
        int i2;
        if (v4Var != null && messageArr != null && messageArr.length > 0 && !m3733R2(v4Var, messageArr, runnable) && !m3723S2(v4Var, messageArr, runnable)) {
            final C10930q6 c = v4Var.mo4348c();
            long Q0 = C4779t2.m25618Q0(messageArr);
            int length = messageArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = true;
                    break;
                } else if (!C4779t2.m25727A3(messageArr[i3])) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            if (messageArr.length == 1) {
                if (z) {
                    i2 = c.m2443g7(Q0) ? R.string.DeleteReminder : R.string.DeleteScheduled;
                } else {
                    i2 = c.m2443g7(Q0) ? R.string.DeleteMessage : R.string.DeleteForMe;
                }
                str = C4403w.m27869i1(i2);
            } else {
                if (z) {
                    i = c.m2443g7(Q0) ? R.string.DeleteXReminders : R.string.DeleteXScheduled;
                } else {
                    i = c.m2443g7(Q0) ? R.string.DeleteXMessages : R.string.DeleteXForMe;
                }
                str = C4403w.m27844o2(i, messageArr.length);
            }
            if (!z) {
                int length2 = messageArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    } else if (!messageArr[i4].canBeDeletedOnlyForSelf) {
                        str = C7316a.m17049l(Q0) ? C4403w.m27865j1(R.string.DeleteForMeAndX, c.m2480e2().m1749D2(c.m2494d4(Q0))) : C4403w.m27869i1(R.string.DeleteForEveryone);
                    } else {
                        i4++;
                    }
                }
            }
            v4Var.m9261ee(null, new int[]{R.id.menu_btn_delete, R.id.btn_cancel}, new String[]{str, C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i5) {
                    boolean v6;
                    v6 = HandlerC10770jj.m3430v6(messageArr, c, runnable, view, i5);
                    return v6;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i5) {
                    return C5115g0.m23934b(this, i5);
                }
            });
        }
    }

    public void m3412x4(final AbstractC10664f9 f9Var, final String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -2116647730) {
            final TdApi.BankCardInfo bankCardInfo = (TdApi.BankCardInfo) object;
            this.f34459a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3422w4(f9Var, bankCardInfo, str);
                }
            });
        } else if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        }
    }

    public boolean m3410x6(C11533r rVar, Runnable runnable, View view, int i) {
        if (i != R.id.btn_done) {
            return true;
        }
        C11541z.m7t().m43R(this.f34459a, rVar.m110c(), rVar.m100m(), runnable);
        return true;
    }

    public void m3401y5(TdApi.Document document, final AbstractC5918j jVar, Runnable runnable) {
        FileInputStream fileInputStream;
        final C10781k kVar;
        try {
            fileInputStream = new FileInputStream(document.document.local.path);
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(fileInputStream, "UTF-8");
            kVar = new C10781k(document);
            while (newPullParser.next() != 1) {
                if (newPullParser.getEventType() == 2) {
                    String name = newPullParser.getName();
                    if ("resources".equals(name)) {
                        m3738Q7(newPullParser, kVar);
                    } else {
                        throw new IllegalArgumentException("Unknown tag: " + name);
                    }
                }
            }
        } catch (Throwable th) {
            Log.m14725e("Cannot install custom language", th, new Object[0]);
        }
        if (kVar.m3355a()) {
            kVar.m3343m();
            this.f34459a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5918j.this.mo1330a(kVar);
                }
            });
            fileInputStream.close();
            return;
        }
        fileInputStream.close();
        HandlerC10770jj dd = this.f34459a.m2485dd();
        if (runnable == null) {
            runnable = RunnableC10894oc.f34875a;
        }
        dd.post(runnable);
    }

    public void m3400y6(long j, AbstractC9323v4 v4Var, Runnable runnable) {
        this.f34459a.m2786K4(j, false, null);
        m3703U2(v4Var, j);
        C7389v0.m16743D2(runnable);
    }

    public void m3392z4(AbstractC10664f9 f9Var, final C10780j jVar, TdApi.Function function, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            m3610d6(function, (TdApi.Error) object, jVar);
            if (jVar != null) {
                this.f34459a.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        HandlerC10770jj.C10780j.m3375a(HandlerC10770jj.C10780j.this);
                    }
                });
            }
        } else if (constructor == -1601123095) {
            m3881C4(f9Var, this.f34459a.m2408ia(object), jVar);
        } else if (constructor == -1035719349) {
            m3569h7(f9Var, ((TdApi.SupergroupFullInfo) object).linkedChatId, jVar);
        }
    }

    public static boolean m3390z6(Runnable runnable, View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        runnable.run();
        return true;
    }

    public void m3903A2(AbstractC9323v4<?> v4Var, TdApi.Contact contact) {
        if (contact != null) {
            TdApi.User v2 = contact.userId != 0 ? this.f34459a.m2480e2().m1583v2(contact.userId) : null;
            if (v2 != null) {
                m3883C2(v4Var, v2, contact.phoneNumber);
                return;
            }
            View$OnClickListenerC2393fk fkVar = new View$OnClickListenerC2393fk(v4Var.mo4347s(), v4Var.mo4348c());
            fkVar.m34654vg(2);
            fkVar.m34662rg(contact.phoneNumber, contact.firstName, contact.lastName);
            v4Var.m9284bc().m9719h0(fkVar);
        }
    }

    public void m3902A3(AbstractC9323v4<?> v4Var, final long j, final TdApi.MessageSender messageSender, final TdApi.ChatMemberStatus chatMemberStatus) {
        if (messageSender.getConstructor() != -239660751) {
            if (C7316a.m17057d(j) == 973884508) {
                v4Var.m9261ee(C4403w.m27853m1(R.string.MemberCannotJoinRegularGroup, this.f34459a.m2135zb(messageSender, true)), new int[]{R.id.btn_blockSender, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.RemoveFromGroup), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i) {
                        boolean p4;
                        p4 = HandlerC10770jj.this.m3492p4(j, messageSender, chatMemberStatus, view, i);
                        return p4;
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
                return;
            }
            final C2964ra raVar = new C2964ra(28, 0, 0, m3623c3(j, messageSender, true), false);
            v4Var.m9206me(new C9188f2(R.id.btn_blockSender).m10012a(raVar).m10003j(new AbstractC9323v4.AbstractC9343r() {
                @Override
                public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                    HandlerC10770jj.this.m3512n4(chatMemberStatus, j, messageSender, i, sparseIntArray);
                }
            }).m9999n(new AbstractC9323v4.AbstractC9337n() {
                @Override
                public final void mo3907a(View view, int i, C2964ra raVar2, TextView textView, C2546iq iqVar) {
                    HandlerC10770jj.this.m3502o4(raVar, j, messageSender, view, i, raVar2, textView, iqVar);
                }
            }).m9997p(new C2964ra[]{new C2964ra(12, (int) R.id.right_readMessages, 0, (int) R.string.BanMember, true)}).m9995r(R.string.RemoveMember).m9996q(R.id.theme_color_textNegative));
        }
    }

    public void m3898A7(AbstractC10664f9 f9Var, TdApi.Message message) {
        m3389z7(f9Var, message.chatId, new C7319d(message.chatId, message.f25406id));
    }

    public void m3897A8(final AbstractC9323v4<?> v4Var, final TdApi.ChatInviteLink chatInviteLink, final long j, boolean z, boolean z2, final Runnable runnable, final AbstractC5918j<TdApi.ChatInviteLinks> jVar) {
        TdApi.Chat U2 = this.f34459a.m2632U2(j);
        C5146u0 u0Var = new C5146u0(6);
        C5320c cVar = new C5320c(6);
        C5320c cVar2 = new C5320c(6);
        C5320c cVar3 = new C5320c(6);
        if (!z2 && chatInviteLink.memberCount > 0) {
            cVar2.m23284a(R.id.btn_viewInviteLinkMembers);
            u0Var.m23816a(R.string.InviteLinkViewMembers);
            cVar.m23284a(R.drawable.baseline_visibility_24);
            cVar3.m23284a(1);
        }
        if (!z2 && chatInviteLink.createsJoinRequest && chatInviteLink.pendingJoinRequestCount > 0) {
            cVar2.m23284a(R.id.btn_manageJoinRequests);
            u0Var.m23816a(R.string.InviteLinkViewRequests);
            cVar.m23284a(R.drawable.baseline_pending_24);
            cVar3.m23284a(1);
        }
        if (z && this.f34459a.m2948A2(U2)) {
            cVar2.m23284a(R.id.btn_manageInviteLinks);
            u0Var.m23816a(R.string.InviteLinkManage);
            cVar.m23284a(R.drawable.baseline_add_link_24);
            cVar3.m23284a(1);
        }
        if (z2 || chatInviteLink.isRevoked) {
            cVar2.m23284a(R.id.btn_copyLink);
            u0Var.m23816a(R.string.InviteLinkCopy);
            cVar.m23284a(R.drawable.baseline_content_copy_24);
            cVar3.m23284a(1);
            if (!z2) {
                cVar.m23284a(R.drawable.baseline_delete_24);
                cVar2.m23284a(R.id.btn_deleteLink);
                u0Var.m23816a(R.string.InviteLinkDelete);
                cVar3.m23284a(2);
            }
        } else {
            if (!chatInviteLink.isPrimary && (v4Var instanceof View$OnClickListenerC2855p0)) {
                cVar2.m23284a(R.id.btn_edit);
                u0Var.m23816a(R.string.InviteLinkEdit);
                cVar.m23284a(R.drawable.baseline_edit_24);
                cVar3.m23284a(1);
            }
            cVar2.m23284a(R.id.btn_copyLink);
            u0Var.m23816a(R.string.InviteLinkCopy);
            cVar.m23284a(R.drawable.baseline_content_copy_24);
            cVar3.m23284a(1);
            cVar2.m23284a(R.id.btn_shareLink);
            u0Var.m23816a(R.string.ShareLink);
            cVar.m23284a(R.drawable.baseline_forward_24);
            cVar3.m23284a(1);
            cVar.m23284a(R.drawable.baseline_link_off_24);
            cVar2.m23284a(R.id.btn_revokeLink);
            u0Var.m23816a(R.string.RevokeLink);
            cVar3.m23284a(2);
        }
        CharSequence p4 = C4779t2.m25449p4(C4403w.m27873h1(R.string.CreatedByXOnDate, new C4403w.AbstractC4409f() {
            @Override
            public final Object mo379a(CharSequence charSequence, int i, int i2, int i3, boolean z3) {
                Object A6;
                A6 = HandlerC10770jj.m3899A6(AbstractC9323v4.this, chatInviteLink, charSequence, i, i2, i3, z3);
                return A6;
            }
        }, v4Var.mo4348c().m2480e2().m1721K2(chatInviteLink.creatorUserId), C4403w.m27910Z0(chatInviteLink.date, TimeUnit.SECONDS)));
        C11122xi xiVar = C11122xi.f35674a;
        String str = chatInviteLink.name;
        v4Var.m9261ee((str == null || str.isEmpty()) ? C4403w.m27873h1(R.string.format_nameAndStatus, xiVar, chatInviteLink.inviteLink, p4) : C4403w.m27873h1(R.string.format_nameAndSubtitleAndStatus, xiVar, chatInviteLink.inviteLink, chatInviteLink.name, p4), cVar2.m23280e(), u0Var.m23813d(), cVar3.m23280e(), cVar.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean G6;
                G6 = HandlerC10770jj.this.m3839G6(v4Var, j, chatInviteLink, runnable, jVar, view, i);
                return G6;
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

    public void m3893B2(AbstractC9323v4<?> v4Var, TdApi.User user) {
        if (user != null) {
            m3883C2(v4Var, user, C5070i.m24061i(user.phoneNumber) ? null : user.phoneNumber);
        }
    }

    public void m3888B7(AbstractC10664f9 f9Var, long j, C10780j jVar) {
        m3579g7(f9Var, C7316a.m17059b(j), new TdApi.CreateSupergroupChat(j, false), jVar);
    }

    public void m3887B8(final AbstractC9323v4<?> v4Var, final TdApi.ChatInviteLink chatInviteLink, final long j, final boolean z, final Runnable runnable, final AbstractC5918j<TdApi.ChatInviteLinks> jVar) {
        v4Var.mo4348c().m2327nb(new TdApi.GetChatInviteLink(j, chatInviteLink.inviteLink), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.this.m3819I6(v4Var, j, z, runnable, jVar, chatInviteLink, object);
            }
        });
    }

    public void m3883C2(AbstractC9323v4<?> v4Var, TdApi.User user, String str) {
        if (user != null) {
            View$OnClickListenerC2118a7 a7Var = new View$OnClickListenerC2118a7(v4Var.mo4347s(), v4Var.mo4348c());
            a7Var.m35518uf(3);
            a7Var.m35517vf(user);
            a7Var.m35519tf(str);
            v4Var.m9284bc().m9719h0(a7Var);
        }
    }

    public AbstractRunnableC5910b m3878C7(AbstractC9323v4<?> v4Var) {
        final TdApi.Chat[] chatArr = new TdApi.Chat[1];
        final TdApi.Error[] errorArr = new TdApi.Error[1];
        final C10771a aVar = new C10771a(chatArr, v4Var, errorArr);
        this.f34459a.m2270r4().m14783o(new TdApi.GetSupportUser(), this.f34459a.m2214uc());
        final C6924j2[] j2VarArr = {v4Var.m9261ee(C1363c0.m37425l(v4Var, C4403w.m27869i1(R.string.AskAQuestionInfo), new C5132o.AbstractC5133a() {
            @Override
            public final boolean mo490a(View view, C5132o oVar) {
                boolean S4;
                S4 = HandlerC10770jj.m3721S4(j2VarArr, view, oVar);
                return S4;
            }
        }), new int[]{R.id.btn_openChat, R.id.btn_cancel}, C5146u0.m23814c(R.string.AskButton, R.string.Cancel), new int[]{3, 1}, new int[]{R.drawable.baseline_help_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean V4;
                V4 = HandlerC10770jj.this.m3691V4(chatArr, aVar, errorArr, view, i);
                return V4;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        })};
        return aVar;
    }

    public void m3877C8(final AbstractC9323v4<?> v4Var, final C10781k kVar, TdApi.Message message) {
        String str;
        TdApi.Chat chat;
        if (message != null) {
            TdApi.MessageForwardInfo messageForwardInfo = message.forwardInfo;
            if (messageForwardInfo == null || messageForwardInfo.origin.getConstructor() != 1490730723) {
                chat = (!message.isOutgoing || message.isChannelPost) ? this.f34459a.m2632U2(message.chatId) : null;
            } else {
                chat = this.f34459a.m2632U2(((TdApi.MessageForwardOriginChannel) message.forwardInfo.origin).chatId);
            }
            if (chat != null) {
                String f4 = this.f34459a.m2462f4(chat.f25367id);
                if (!C5070i.m24061i(f4)) {
                    kVar.m3342n("@" + f4);
                } else {
                    kVar.m3342n(this.f34459a.m2661S3(chat));
                }
            }
        }
        Object[] objArr = new Object[6];
        objArr[0] = kVar.m3348h(R.string.language_name);
        objArr[1] = kVar.m3348h(R.string.language_nameInEnglish);
        objArr[2] = kVar.m3348h(R.string.language_code);
        objArr[3] = kVar.m3348h(R.string.language_dateFormatLocale);
        objArr[4] = Integer.valueOf(kVar.m3353c());
        if (kVar.m3344l()) {
            str = C4403w.m27844o2(R.string.xStrings, kVar.m3346j());
        } else {
            str = C4403w.m27844o2(R.string.xStrings, kVar.m3346j()) + ", " + C4403w.m27844o2(R.string.TranslationsMissing, kVar.m3350f());
        }
        objArr[5] = str;
        v4Var.m9261ee(C4403w.m27853m1(R.string.LanguageInfo, objArr), new int[]{R.id.btn_messageApplyLocalization, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.LanguageInstall), C4403w.m27869i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_language_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean N6;
                N6 = HandlerC10770jj.this.m3769N6(v4Var, kVar, view, i);
                return N6;
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

    public void m3873D2(long j, C5320c cVar, C5146u0 u0Var, boolean z, boolean z2) {
        TdApi.Chat U2 = this.f34459a.m2632U2(j);
        if (U2 != null) {
            int d = C7316a.m17057d(j);
            int i = R.string.returnToGroup;
            int i2 = R.string.LeaveMegaMenu;
            switch (d) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    if (z && this.f34459a.m2304p2(U2)) {
                        cVar.m23284a(R.id.btn_clearChatHistory);
                        u0Var.m23816a(R.string.ClearHistory);
                    }
                    TdApi.ChatMemberStatus K3 = this.f34459a.m2787K3(j);
                    if (this.f34459a.m2542a3(U2)) {
                        cVar.m23284a(R.id.btn_removeChatFromList);
                        if (this.f34459a.m2784K6(j)) {
                            i2 = R.string.LeaveChannel;
                        }
                        u0Var.m23816a(i2);
                        return;
                    } else if (!C4779t2.m25601T(K3)) {
                        return;
                    } else {
                        if (K3.getConstructor() != -5815259 || (!this.f34459a.m2507c7(j) && !this.f34459a.m2251s7(j))) {
                            cVar.m23284a(R.id.btn_returnToChat);
                            if (this.f34459a.m2784K6(j)) {
                                i = R.string.returnToChannel;
                            }
                            u0Var.m23816a(i);
                            return;
                        } else if (z2) {
                            cVar.m23284a(R.id.btn_returnToChat);
                            u0Var.m23816a(this.f34459a.m2784K6(j) ? R.string.JoinChannel : R.string.JoinChat);
                            return;
                        } else {
                            return;
                        }
                    }
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    if (z && this.f34459a.m2320o2(j)) {
                        cVar.m23284a(R.id.btn_clearChatHistory);
                        u0Var.m23816a(R.string.ClearHistory);
                    }
                    if (this.f34459a.m2906Cc(U2)) {
                        cVar.m23284a(R.id.btn_removeChatFromListAndStop);
                        u0Var.m23816a(R.string.DeleteAndStop);
                        return;
                    }
                    cVar.m23284a(R.id.btn_removeChatFromList);
                    u0Var.m23816a(R.string.DeleteChat);
                    return;
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    if (z && this.f34459a.m2304p2(U2)) {
                        cVar.m23284a(R.id.btn_clearChatHistory);
                        u0Var.m23816a(R.string.ClearHistory);
                    }
                    TdApi.BasicGroup W3 = this.f34459a.m2601W3(j);
                    TdApi.ChatMemberStatus K32 = this.f34459a.m2787K3(j);
                    if (this.f34459a.m2542a3(U2) && K32 != null) {
                        if (C4779t2.m25499i3(K32, false) || (W3 != null && !W3.isActive)) {
                            cVar.m23284a(R.id.btn_removeChatFromList);
                            u0Var.m23816a(R.string.LeaveMegaMenu);
                        } else {
                            cVar.m23284a(R.id.btn_removeChatFromList);
                            u0Var.m23816a(R.string.DeleteChat);
                        }
                        if (!C4779t2.m25601T(K32)) {
                            return;
                        }
                        if (W3 == null || W3.isActive) {
                            cVar.m23284a(R.id.btn_returnToChat);
                            u0Var.m23816a(R.string.returnToGroup);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void m3868D7(final AbstractC10664f9 f9Var, final String str, final C10788q qVar, final AbstractC5917i iVar) {
        if (!C5070i.m24061i(str) && !this.f34459a.m2930B4().m4680k1()) {
            this.f34459a.m2270r4().m14783o(new TdApi.GetInternalLinkType(str), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    HandlerC10770jj.this.m3551j5(f9Var, qVar, str, iVar, object);
                }
            });
        } else if (iVar != null) {
            iVar.mo1322a(false);
        }
    }

    public void m3867D8(final AbstractC10664f9 f9Var, final TdApi.LanguagePackInfo languagePackInfo) {
        final AbstractC9323v4<?> F = f9Var.mo4347s().m14552P1().m9763F();
        if (F != null && !F.m9347Sa()) {
            if (C4403w.m27860k2().equals(languagePackInfo.f25405id)) {
                F.m9261ee(C1363c0.m37425l(f9Var, C4403w.m27865j1(R.string.LanguageSame, languagePackInfo.name), null), new int[]{R.id.btn_done, R.id.btn_settings}, new String[]{C4403w.m27869i1(R.string.OK), C4403w.m27869i1(R.string.Settings)}, null, new int[]{R.drawable.baseline_check_circle_24, R.drawable.baseline_settings_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i) {
                        boolean J6;
                        J6 = HandlerC10770jj.m3809J6(AbstractC9323v4.this, f9Var, view, i);
                        return J6;
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
            } else {
                F.m9261ee(C1363c0.m37425l(f9Var, C4403w.m27865j1(languagePackInfo.isOfficial ? R.string.LanguageAlert : R.string.LanguageCustomAlert, languagePackInfo.name, Integer.valueOf((int) Math.floor((languagePackInfo.translatedStringCount / languagePackInfo.totalStringCount) * 100.0f)), languagePackInfo.translationUrl), null), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.LanguageChange), C4403w.m27869i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_language_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i) {
                        boolean M6;
                        M6 = HandlerC10770jj.m3779M6(AbstractC10664f9.this, languagePackInfo, view, i);
                        return M6;
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
    }

    public void m3863E2(final AbstractC10664f9 f9Var, boolean z) {
        final AbstractC9323v4<?> F = f9Var.mo4347s().m14552P1().m9763F();
        if (F != null) {
            boolean L1 = this.f34459a.m2773L1();
            int i = 4;
            C5320c cVar = new C5320c(L1 ? 4 : 3);
            if (!L1) {
                i = 3;
            }
            C5146u0 u0Var = new C5146u0(i);
            cVar.m23284a(R.id.btn_proxyTelegram);
            cVar.m23284a(R.id.btn_proxySocks5);
            cVar.m23284a(R.id.btn_proxyHttp);
            if (z) {
                u0Var.m23816a(R.string.AddMtprotoProxy);
                u0Var.m23816a(R.string.AddSocks5Proxy);
                u0Var.m23816a(R.string.AddHttpProxy);
            } else {
                u0Var.m23816a(R.string.MtprotoProxy);
                u0Var.m23816a(R.string.Socks5Proxy);
                u0Var.m23816a(R.string.HttpProxy);
            }
            if (L1) {
                cVar.m23284a(R.id.btn_proxyQr);
                u0Var.m23816a(R.string.ScanQR);
            }
            AbstractC5117h0 vgVar = new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i2) {
                    boolean F3;
                    F3 = HandlerC10770jj.this.m3852F3(f9Var, F, view, i2);
                    return F3;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i2) {
                    return C5115g0.m23934b(this, i2);
                }
            };
            String str = null;
            if (cVar.m23278g() == 1) {
                vgVar.mo493A3(null, cVar.m23281d(0));
                return;
            }
            if (z) {
                str = C4403w.m27869i1(R.string.ProxyInfo);
            }
            F.m9275ce(str, cVar.m23280e(), u0Var.m23813d(), vgVar);
        }
    }

    public void m3858E7(final AbstractC10664f9 f9Var, final String str, final C10788q qVar) {
        m3868D7(f9Var, str, qVar, new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z) {
                HandlerC10770jj.this.m3541k5(f9Var, str, qVar, z);
            }
        });
    }

    public final void m3842G3(final AbstractC10664f9 f9Var, final long j) {
        if (C10536ab.m4683j1()) {
            this.f34459a.m2549Za(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3842G3(f9Var, j);
                }
            });
            return;
        }
        View$OnClickListenerC2805o4 o4Var = new View$OnClickListenerC2805o4(f9Var.mo4347s(), f9Var.mo4348c());
        o4Var.m33354hk(new View$OnClickListenerC2805o4.C2813h(C10619e0.m4436j(this.f34459a), new C10772b(j)));
        f9Var.mo4347s().m14552P1().m9719h0(o4Var);
    }

    public final void m3531l5(final p350yd.AbstractC10664f9 r20, final java.lang.String r21, final p350yd.HandlerC10770jj.C10788q r22) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.HandlerC10770jj.m3531l5(yd.f9, java.lang.String, yd.jj$q):void");
    }

    public void m3847F8(AbstractC9323v4<?> v4Var, final int i, final Runnable runnable) {
        C6924j2 j2Var;
        if (!v4Var.m9339Ta()) {
            v4Var.m9219l8(new C10776f(i, runnable));
        } else if (i != 0 || (j2Var = this.f34460b) == null || j2Var.getContext() != v4Var.mo4347s()) {
            C9188f2 f2Var = new C9188f2(R.id.btn_mapProvider);
            if (i == 0) {
                f2Var.m10011b(C4403w.m27869i1(R.string.MapPreviewProviderHint));
                f2Var.m10006g(new C6924j2.AbstractC6930f() {
                    @Override
                    public void mo3000j2(C6924j2 j2Var2) {
                        C6941k2.m18400a(this, j2Var2);
                    }

                    @Override
                    public final void mo2999y4(C6924j2 j2Var2) {
                        HandlerC10770jj.this.m3749P6(j2Var2);
                    }
                });
            }
            int g1 = C4868i.m24726c2().m24695g1(i == 2);
            if (i == 2) {
                C2964ra[] raVarArr = new C2964ra[1];
                raVarArr[0] = new C2964ra(13, (int) R.id.btn_mapProviderTelegram, 0, (int) R.string.MapPreviewProviderTelegram, (int) R.id.btn_mapProvider, g1 == 1);
                f2Var.m9997p(raVarArr);
            } else {
                C2964ra[] raVarArr2 = new C2964ra[2];
                raVarArr2[0] = new C2964ra(13, (int) R.id.btn_mapProviderTelegram, 0, (int) R.string.MapPreviewProviderTelegram, (int) R.id.btn_mapProvider, g1 == 1 || (g1 == -1 && i == 0));
                raVarArr2[1] = new C2964ra(13, (int) R.id.btn_mapProviderNone, 0, (int) R.string.MapPreviewProviderNone, (int) R.id.btn_mapProvider, g1 == 0);
                f2Var.m9997p(raVarArr2);
            }
            C9180e2 me2 = v4Var.m9206me(f2Var.m9995r(R.string.Save).m10003j(new AbstractC9323v4.AbstractC9343r() {
                @Override
                public final void mo1773l6(int i2, SparseIntArray sparseIntArray) {
                    HandlerC10770jj.this.m3739Q6(i, runnable, i2, sparseIntArray);
                }
            }));
            if (i != 0) {
                return;
            }
            if (me2 != null) {
                this.f34460b = me2.f29641e;
                ArrayList arrayList = new ArrayList();
                this.f34461c = arrayList;
                arrayList.add(runnable);
                return;
            }
            this.f34460b = null;
            this.f34461c = null;
        } else if (runnable != null) {
            this.f34461c.add(runnable);
        }
    }

    public void m3832H3(final AbstractC10664f9 f9Var, final C4822w2 w2Var, final boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3832H3(f9Var, w2Var, z);
                }
            });
            return;
        }
        View$OnClickListenerC2805o4 o4Var = new View$OnClickListenerC2805o4(f9Var.mo4347s(), f9Var.mo4348c());
        C10930q6 q6Var = this.f34459a;
        o4Var.m33354hk(new View$OnClickListenerC2805o4.C2813h(z ? C10619e0.m4438h(q6Var) : C10619e0.m4436j(q6Var), new C10773c(z, w2Var)));
        f9Var.mo4347s().m14552P1().m9719h0(o4Var);
    }

    public void m3838G7(final AbstractC9323v4<?> v4Var, final String str, final C10788q qVar) {
        v4Var.m9261ee(str, new int[]{R.id.btn_open, R.id.btn_copyLink}, new String[]{C4403w.m27869i1(R.string.Open), C4403w.m27869i1(R.string.CopyLink)}, null, new int[]{R.drawable.baseline_open_in_browser_24, R.drawable.baseline_content_copy_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean r5;
                r5 = HandlerC10770jj.this.m3471r5(v4Var, str, qVar, view, i);
                return r5;
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

    public void m3837G8(AbstractC9323v4<?> v4Var, long j, boolean z, Runnable runnable) {
        m3827H8(v4Var, null, j, z, runnable);
    }

    public final void m3833H2(final AbstractC9323v4<?> v4Var, C10781k kVar) {
        TdApi.LanguagePackString[] i = kVar.m3347i();
        String d = kVar.m3352d();
        final TdApi.LanguagePackInfo languagePackInfo = new TdApi.LanguagePackInfo(d, C4403w.m27906a0(), kVar.m3351e(), kVar.m3348h(R.string.language_name), C4403w.m27815w(d), false, "1".equals(kVar.m3348h(R.string.language_rtl)), false, true, i.length, i.length, i.length, null);
        v4Var.mo4348c().m2270r4().m14783o(new TdApi.SetCustomLanguagePack(languagePackInfo, i), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.m3812J3(AbstractC9323v4.this, languagePackInfo, object);
            }
        });
    }

    public void m3828H7(AbstractC10664f9 f9Var, TdApi.InternalLinkTypeVideoChat internalLinkTypeVideoChat, C10788q qVar) {
        m3579g7(f9Var, 0L, new TdApi.SearchPublicChat(internalLinkTypeVideoChat.chatUsername), new C10780j().m3357s(qVar).m3356t(internalLinkTypeVideoChat).m3368h().m3364l());
    }

    public final void m3827H8(final td.AbstractC9323v4<?> r26, final org.drinkless.p210td.libcore.telegram.TdApi.NotificationSettingsScope r27, final long r28, boolean r30, final java.lang.Runnable r31) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.HandlerC10770jj.m3827H8(td.v4, org.drinkless.td.libcore.telegram.TdApi$NotificationSettingsScope, long, boolean, java.lang.Runnable):void");
    }

    public final java.lang.String m3818I7(final p350yd.AbstractC10664f9 r9, java.lang.String r10, android.net.Uri r11) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.HandlerC10770jj.m3818I7(yd.f9, java.lang.String, android.net.Uri):java.lang.String");
    }

    public void m3817I8(AbstractC9323v4<?> v4Var, TdApi.NotificationSettingsScope notificationSettingsScope, boolean z) {
        m3827H8(v4Var, notificationSettingsScope, 0L, z, null);
    }

    public boolean m3808J7(final AbstractC9323v4<?> v4Var, final AbstractC5918j<TdApi.MessageSchedulingState> jVar, long j, boolean z, boolean z2, final AbstractC11531p pVar) {
        if (C7316a.m17051j(j)) {
            return false;
        }
        final boolean g7 = this.f34459a.m2443g7(j);
        int i = 4;
        if (z) {
            i = 5;
        }
        if (z2) {
            i++;
        }
        C5320c cVar = new C5320c(i);
        C5146u0 u0Var = new C5146u0(i);
        C5320c cVar2 = new C5320c(i);
        if (z2) {
            cVar.m23284a(R.id.btn_sendNoSound);
            u0Var.m23816a(R.string.SendNoSound);
            cVar2.m23284a(R.drawable.baseline_notifications_off_24);
        }
        if (z) {
            cVar.m23284a(R.id.btn_sendOnceOnline);
            u0Var.m23816a(R.string.SendOnceOnline);
            cVar2.m23284a(R.drawable.baseline_visibility_24);
        }
        cVar.m23284a(R.id.btn_sendScheduled30Min);
        u0Var.m23815b(C4403w.m27844o2(g7 ? R.string.RemindInXMinutes : R.string.SendInXMinutes, 30L));
        cVar2.m23284a(R.drawable.baseline_schedule_24);
        cVar.m23284a(R.id.btn_sendScheduled2Hr);
        int i2 = R.string.RemindInXHours;
        u0Var.m23815b(C4403w.m27844o2(g7 ? R.string.RemindInXHours : R.string.SendInXHours, 2L));
        cVar2.m23284a(R.drawable.baseline_schedule_24);
        cVar.m23284a(R.id.btn_sendScheduled8Hr);
        if (!g7) {
            i2 = R.string.SendInXHours;
        }
        u0Var.m23815b(C4403w.m27844o2(i2, 8L));
        cVar2.m23284a(R.drawable.baseline_schedule_24);
        cVar.m23284a(R.id.btn_sendScheduledCustom);
        u0Var.m23815b(C4403w.m27869i1(g7 ? R.string.RemindAtCustomTime : R.string.SendAtCustomTime));
        cVar2.m23284a(R.drawable.baseline_date_range_24);
        v4Var.m9254fe(null, cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i3) {
                boolean v5;
                v5 = HandlerC10770jj.this.m3431v5(jVar, g7, v4Var, pVar, view, i3);
                return v5;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i3) {
                return C5115g0.m23934b(this, i3);
            }
        }, pVar);
        return true;
    }

    public final void m3807J8(AbstractC9323v4<?> v4Var, long j) {
        TdApi.Chat U2 = this.f34459a.m2632U2(j);
        if (U2 != null && this.f34459a.m2772L2(U2)) {
            View$OnClickListenerC2714mi miVar = new View$OnClickListenerC2714mi(v4Var.mo4347s(), v4Var.mo4348c());
            miVar.m33775df(new View$OnClickListenerC2714mi.C2716b(U2, this.f34459a.m2175x3(U2)));
            v4Var.m9291ac(miVar);
        }
    }

    public final void m3803K2(final AbstractC10664f9 f9Var, final String str, final C10788q qVar) {
        this.f34459a.m2270r4().m14783o(new TdApi.CheckChatInviteLink(str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.this.m3802K3(f9Var, str, qVar, object);
            }
        });
    }

    public boolean m3798K7(AbstractC9323v4<?> v4Var, TdApi.ChatList chatList, long j, C4737p7 p7Var, int i, Runnable runnable) {
        TdApi.Chat U2 = this.f34459a.m2632U2(j);
        if (U2 == null) {
            return false;
        }
        switch (i) {
            case R.id.btn_archiveChat:
                this.f34459a.m2270r4().m14783o(new TdApi.AddChatToList(j, C7317b.f23225b), this.f34459a.m2376ka(runnable));
                return true;
            case R.id.btn_archiveUnarchiveChat:
                m3498o8(v4Var, chatList, j, runnable);
                return true;
            case R.id.btn_markChatAsRead:
                if (p7Var != null) {
                    this.f34459a.m2733N9(p7Var.m26299b(), p7Var.m26294g(), runnable);
                } else {
                    this.f34459a.m2733N9(U2.f25367id, 0L, runnable);
                }
                return true;
            case R.id.btn_markChatAsUnread:
                this.f34459a.m2717O9(U2, runnable);
                return true;
            case R.id.btn_notifications:
                this.f34459a.m2485dd().m3677W8(v4Var, j, false, runnable);
                return true;
            case R.id.btn_phone_call:
                this.f34459a.m2930B4().m4713c0().m4545v0(v4Var, C4779t2.m25465n2(U2), null, true);
                return true;
            case R.id.btn_pinChat:
                this.f34459a.m2270r4().m14783o(new TdApi.ToggleChatIsPinned(chatList, j, true), this.f34459a.m2376ka(runnable));
                return true;
            case R.id.btn_pinUnpinChat:
                m3797K8(v4Var, chatList, j, runnable);
                return true;
            case R.id.btn_unarchiveChat:
                this.f34459a.m2270r4().m14783o(new TdApi.AddChatToList(j, C7317b.f23224a), this.f34459a.m2376ka(runnable));
                return true;
            case R.id.btn_unpinChat:
                this.f34459a.m2270r4().m14783o(new TdApi.ToggleChatIsPinned(chatList, j, false), this.f34459a.m2376ka(runnable));
                return true;
            default:
                return m3788L7(v4Var, chatList, j, i, runnable);
        }
    }

    public final void m3797K8(final AbstractC9323v4<?> v4Var, final TdApi.ChatList chatList, final long j, final Runnable runnable) {
        boolean z3 = this.f34459a.m2143z3(chatList, j);
        String Q3 = this.f34459a.m2691Q3(j);
        int[] iArr = new int[2];
        iArr[0] = z3 ? R.id.btn_unpinChat : R.id.btn_pinChat;
        iArr[1] = R.id.btn_cancel;
        String[] strArr = new String[2];
        strArr[0] = C4403w.m27869i1(z3 ? R.string.UnpinFromTop : R.string.PinToTop);
        strArr[1] = C4403w.m27869i1(R.string.Cancel);
        int[] iArr2 = new int[2];
        iArr2[0] = z3 ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24;
        iArr2[1] = R.drawable.baseline_cancel_24;
        v4Var.m9261ee(Q3, iArr, strArr, null, iArr2, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean S6;
                S6 = HandlerC10770jj.this.m3719S6(v4Var, chatList, j, runnable, view, i);
                return S6;
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

    public boolean m3788L7(AbstractC9323v4<?> v4Var, TdApi.ChatList chatList, long j, int i, Runnable runnable) {
        switch (i) {
            case R.id.btn_clearChatHistory:
                m3458s8(v4Var, j, runnable);
                return true;
            case R.id.btn_removeChatFromList:
            case R.id.btn_removeChatFromListAndStop:
                m3438u8(v4Var, j, false, i == R.id.btn_removeChatFromListAndStop, runnable);
                return true;
            case R.id.btn_removeChatFromListOrClearHistory:
                m3438u8(v4Var, j, true, false, runnable);
                return true;
            case R.id.btn_removePsaChatFromList:
                m3388z8(v4Var, chatList, j, runnable);
                return true;
            case R.id.btn_returnToChat:
                m3649Z6(v4Var, j, true, runnable);
                return true;
            case R.id.btn_setPasscode:
                m3807J8(v4Var, j);
                return true;
            default:
                return false;
        }
    }

    public boolean m3787L8(AbstractC9323v4<?> v4Var, long j, boolean z, final AbstractC10786o oVar, AbstractC11531p pVar) {
        return m3808J7(v4Var, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                HandlerC10770jj.m3709T6(HandlerC10770jj.AbstractC10786o.this, (TdApi.MessageSchedulingState) obj);
            }
        }, j, this.f34459a.m2480e2().m1729I2(this.f34459a.m2494d4(j)), z, pVar);
    }

    public void m3783M2(AbstractC10664f9 f9Var, TdApi.AuthenticationCodeInfo authenticationCodeInfo, String str) {
        View$OnClickListenerC2665lj ljVar = new View$OnClickListenerC2665lj(f9Var.mo4347s(), f9Var.mo4348c());
        ljVar.m33963bg(new View$OnClickListenerC2665lj.C2666a(9, authenticationCodeInfo, C1363c0.m37410w(str)));
        f9Var.mo4347s().m14552P1().m9719h0(ljVar);
    }

    public void m3778M7(AbstractC9323v4<?> v4Var, final TdApi.Document document, final AbstractC5918j<C10781k> jVar, final Runnable runnable) {
        if (m3823I2(document)) {
            C4383l.m28059a().m28058b(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3401y5(document, jVar, runnable);
                }
            });
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void m3777M8(AbstractC10664f9 f9Var, long j) {
        this.f34459a.m2270r4().m14783o(new TdApi.GetStickerSet(j), m3609d7(f9Var, null));
    }

    public final C6957m1.AbstractC6962e m3773N2(AbstractC9323v4<?> v4Var, TdApi.ChatList chatList, long j, C4737p7 p7Var, C5320c cVar, C5320c cVar2, C5146u0 u0Var, boolean z, boolean z2, boolean z3, Runnable runnable) {
        TdApi.Chat U2 = this.f34459a.m2632U2(j);
        if (U2 == null) {
            return null;
        }
        TdApi.ChatPosition a = C7317b.m17043a(U2, chatList);
        boolean z4 = z2 && runnable != null;
        if (z) {
            if (this.f34459a.m2542a3(U2)) {
                if (!this.f34459a.m2379k7(C4779t2.m25465n2(U2))) {
                    boolean u3 = this.f34459a.m2223u3(U2.f25367id);
                    cVar.m23284a(R.id.btn_notifications);
                    u0Var.m23816a(u3 ? R.string.Mute : R.string.Unmute);
                    cVar2.m23284a(u3 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_24);
                }
                if (!z4 && a != null) {
                    cVar.m23284a(R.id.btn_pinUnpinChat);
                    u0Var.m23816a(a.isPinned ? R.string.Unpin : R.string.Pin);
                    cVar2.m23284a(a.isPinned ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24);
                }
                boolean B2 = this.f34459a.m2932B2(U2);
                cVar.m23284a(B2 ? R.id.btn_markChatAsRead : R.id.btn_markChatAsUnread);
                u0Var.m23816a(B2 ? R.string.MarkAsRead : R.string.MarkAsUnread);
                cVar2.m23284a(B2 ? R.drawable.baseline_done_all_24 : R.drawable.baseline_unsubscribe_24);
                if (this.f34459a.m2368l2(chatList, U2)) {
                    cVar.m23284a(R.id.btn_archiveUnarchiveChat);
                    boolean z5 = chatList instanceof TdApi.ChatListArchive;
                    u0Var.m23816a(z5 ? R.string.Unarchive : R.string.Archive);
                    cVar2.m23284a(z5 ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24);
                }
                cVar.m23284a(R.id.btn_removeChatFromListOrClearHistory);
                u0Var.m23816a(R.string.Delete);
                cVar2.m23284a(R.drawable.baseline_delete_24);
            } else if (a != null && (a.source instanceof TdApi.ChatSourcePublicServiceAnnouncement)) {
                cVar.m23284a(R.id.btn_removePsaChatFromList);
                u0Var.m23816a(R.string.PsaHide);
                cVar2.m23284a(R.drawable.baseline_delete_sweep_24);
            }
        }
        if (z4) {
            cVar.m23284a(R.id.btn_selectChat);
            if (cVar.m23278g() > 1) {
                u0Var.m23816a(R.string.MoreChatOptions);
                cVar2.m23284a(R.drawable.baseline_more_horiz_24);
            } else {
                u0Var.m23816a(z3 ? R.string.Unselect : R.string.Select);
                cVar2.m23284a(R.drawable.baseline_playlist_add_check_24);
            }
        }
        return new C10775e(runnable, v4Var, chatList, j, p7Var);
    }

    public void m3768N7(AbstractC9323v4<?> v4Var, TdApi.Document document, AbstractC5918j<C10783m> jVar, Runnable runnable) {
        if (m3813J2(document)) {
            m3758O7(v4Var, document.document, jVar, runnable);
        } else {
            C7389v0.m16743D2(runnable);
        }
    }

    public void m3767N8(AbstractC10664f9 f9Var, String str, C10788q qVar) {
        this.f34459a.m2270r4().m14783o(new TdApi.SearchStickerSet(str), m3609d7(f9Var, qVar));
    }

    public View$OnTouchListenerC5103c0 m3763O2(final AbstractC9323v4<?> v4Var, final long j, final AbstractC5914f fVar, final AbstractC5914f fVar2, final AbstractC5918j<List<View$OnTouchListenerC5103c0.C5104a>> jVar, final AbstractC10786o oVar, final AbstractC11531p pVar) {
        return new View$OnTouchListenerC5103c0(new View$OnTouchListenerC5103c0.AbstractC5106c() {
            @Override
            public final List mo2024N3(View view) {
                List N3;
                N3 = HandlerC10770jj.this.m3772N3(fVar, j, fVar2, jVar, view);
                return N3;
            }
        }, new View$OnTouchListenerC5103c0.AbstractC5105b() {
            @Override
            public final void mo4198I0(View view, View view2) {
                HandlerC10770jj.this.m3752P3(v4Var, oVar, j, pVar, view, view2);
            }
        }, v4Var != null ? v4Var.m9471Ba() : null, pVar);
    }

    public void m3758O7(final AbstractC9323v4<?> v4Var, final TdApi.File file, final AbstractC5918j<C10783m> jVar, final Runnable runnable) {
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                HandlerC10770jj.this.m3860E5(file, jVar, runnable, v4Var);
            }
        });
    }

    public void m3753P2(final AbstractC9323v4<?> v4Var, final long j) {
        if (this.f34459a.m2480e2().m1761A2(j)) {
            v4Var.m9261ee(C4403w.m27853m1(R.string.DeleteContactConfirm, this.f34459a.m2480e2().m1721K2(j)), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.Delete), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean Q3;
                    Q3 = HandlerC10770jj.this.m3742Q3(v4Var, j, view, i);
                    return Q3;
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

    public void m3747P8(Context context, final TdApi.Chat chat) {
        m3757O8(context, this.f34459a.m2707P3(chat.f25367id), false, false, 0, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                HandlerC10770jj.this.m3699U6(chat, (HandlerC10770jj.C10787p) obj);
            }
        });
    }

    public final void m3743Q2(long j) {
        C1379j0.m37292y0(R.string.DeletingPhotoWait, 0);
        this.f34459a.m2270r4().m14783o(new TdApi.DeleteProfilePhoto(j), this.f34459a.m2780Ka());
    }

    public final void m3727R8(final AbstractC10664f9 f9Var, final String str, final String str2, final int i, final C10788q qVar) {
        this.f34459a.m2270r4().m14783o(new TdApi.SearchPublicChat(str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.this.m3679W6(f9Var, str, qVar, i, str2, object);
            }
        });
    }

    public void m3717S8(final AbstractC10664f9 f9Var, long j, boolean z, final C10780j jVar) {
        this.f34459a.m2270r4().m14783o(new TdApi.CreateNewSecretChat(j), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.this.m3669X6(f9Var, jVar, object);
            }
        });
    }

    public void m3713T2(final AbstractC9323v4<?> v4Var, final boolean z, final AbstractC10782l lVar) {
        CharSequence H0 = C4403w.m27982H0(v4Var, R.string.EraseDatabaseWarn, new Object[0]);
        CharSequence H02 = v4Var.mo4348c().m2930B4().m4661q1() ? C4403w.m27982H0(v4Var, R.string.EraseDatabaseMultiUser, new Object[0]) : null;
        if (H02 != null) {
            H0 = TextUtils.concat(H0, "\n\n", H02);
        }
        v4Var.m9172re(H0, new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z2) {
                HandlerC10770jj.this.m3582g4(v4Var, lVar, z, z2);
            }
        });
    }

    public void m3703U2(AbstractC9323v4<?> v4Var, long j) {
        C9312u1 M = v4Var.mo4347s().m14552P1().m9749M();
        AbstractC9323v4<?> l = M.m9501l();
        if (M.m9513C() > 1 && v4Var.mo9464C9() == j) {
            if (l == v4Var || (l != null && l.mo9464C9() == j)) {
                for (int C = M.m9513C() - 2; C >= 1 && !(M.m9503j(C) instanceof View$OnClickListenerC2805o4); C--) {
                    M.m9510c(C);
                }
                l.m9394Ld(false);
                l.m9298Zb();
            }
        }
    }

    public void m3697U8(AbstractC9323v4<?> v4Var, String str, String str2, boolean z) {
        View$OnClickListenerC2805o4 o4Var = new View$OnClickListenerC2805o4(v4Var.mo4347s(), v4Var.mo4348c());
        o4Var.m33354hk(new View$OnClickListenerC2805o4.C2813h(new C10777g(str, str2, z)));
        v4Var.m9291ac(o4Var);
    }

    public void m3693V2(final AbstractC9323v4<?> v4Var, final C11533r rVar, final boolean z, final boolean z2) {
        final String d = rVar.m109d();
        int T = C11541z.m41T(rVar.m110c());
        String N1 = C4868i.m24726c2().m24834N1(T);
        if (!rVar.m102k() || !C4868i.m24726c2().m24549z(T)) {
            m3683W2(v4Var, rVar.m110c(), d, N1, z, z2);
            return;
        }
        final AbstractC5918j idVar = new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                HandlerC10770jj.this.m3572h4(v4Var, rVar, d, z, z2, (String) obj);
            }
        };
        if (C5070i.m24061i(N1)) {
            N1 = v4Var.mo4348c().m2488da();
        }
        v4Var.m9372Oc(C4403w.m27869i1(R.string.ThemeExportAddAuthorTitle), C4403w.m27869i1(R.string.ThemeExportAddAuthorInfo), R.string.ThemeExportDone, R.string.Cancel, N1, null, new AbstractC9323v4.AbstractC9336m() {
            @Override
            public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                boolean j4;
                j4 = HandlerC10770jj.this.m3552j4(idVar, y1Var, str);
                return j4;
            }
        }, true, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                HandlerC10770jj.m3542k4(AbstractC9323v4.this, (ViewGroup) obj);
            }
        }, null);
    }

    public final void m3683W2(AbstractC10664f9 f9Var, int i, String str, String str2, boolean z, boolean z2) {
        String str3;
        if (z2) {
            boolean z3 = z ? 1 : 0;
            char c = z ? 1 : 0;
            z = z3 | true;
        }
        if (z2) {
            str3 = C5070i.m24076B(str) + ".java";
        } else {
            str3 = C5070i.m24076B(str) + ".tgx-theme";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("theme_export_");
        sb2.append(System.currentTimeMillis());
        sb2.append("_");
        sb2.append(i);
        sb2.append(",");
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        sb2.append(i2);
        String sb3 = sb2.toString();
        if (!C5070i.m24061i(str2)) {
            sb3 = sb3 + "," + str2;
        }
        TdApi.InputMessageDocument inputMessageDocument = new TdApi.InputMessageDocument(new TdApi.InputFileGenerated(str3, sb3, 0), null, false, null);
        x00 x00Var = new x00(f9Var.mo4347s(), f9Var.mo4348c());
        x00Var.m30994Vi(new x00.C3281m(inputMessageDocument));
        x00Var.m30960ej();
    }

    public void m3678W7(final AbstractC9323v4<?> v4Var, final CharSequence charSequence, final AbstractC10785n nVar) {
        this.f34459a.m2270r4().m14783o(new TdApi.CanTransferOwnership(), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.this.m3670X5(nVar, v4Var, charSequence, object);
            }
        });
    }

    public void m3677W8(AbstractC9323v4<?> v4Var, long j, boolean z, Runnable runnable) {
        TdApi.Chat U2 = this.f34459a.m2632U2(j);
        TdApi.ScopeNotificationSettings hb = this.f34459a.m2423hb(j);
        if (U2 != null && hb != null) {
            if (hb.muteFor == 0) {
                TdApi.ChatNotificationSettings chatNotificationSettings = U2.notificationSettings;
                if (!chatNotificationSettings.useDefaultMuteFor && chatNotificationSettings.muteFor > 0 && !z) {
                    this.f34459a.m2486dc(U2.f25367id, 0);
                    C7389v0.m16743D2(runnable);
                    return;
                }
            }
            m3837G8(v4Var, j, z, runnable);
        }
    }

    public List<View$OnTouchListenerC5103c0.C5104a> m3673X2(long j, boolean z, boolean z2, boolean z3) {
        return m3663Y2(j, z, z2, z3, false);
    }

    public void m3668X7(int i) {
        if (i != 0) {
            this.f34459a.m2270r4().m14783o(new TdApi.AddSavedAnimation(new TdApi.InputFileId(i)), C10670ff.f34152a);
        }
    }

    public void m3667X8(AbstractC9323v4<?> v4Var, final long j, final TdApi.MessageSender messageSender, final TdApi.ChatMemberStatus chatMemberStatus) {
        if (messageSender.getConstructor() == -239660751) {
            this.f34459a.m2811Ib(j, messageSender, new TdApi.ChatMemberStatusLeft(), chatMemberStatus, null);
        } else if (chatMemberStatus.getConstructor() == 1661432998) {
            this.f34459a.m2811Ib(j, messageSender, new TdApi.ChatMemberStatusMember(), chatMemberStatus, null);
        } else {
            C9188f2 j2 = new C9188f2(R.id.btn_unblockSender).m10012a(new C2964ra(28, 0, 0, (CharSequence) C4403w.m27865j1(R.string.QUnblockX, this.f34459a.m2151yb(messageSender)), false)).m10003j(new AbstractC9323v4.AbstractC9343r() {
                @Override
                public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                    HandlerC10770jj.this.m3659Y6(j, messageSender, chatMemberStatus, i, sparseIntArray);
                }
            });
            C2964ra[] raVarArr = new C2964ra[1];
            raVarArr[0] = new C2964ra(12, (int) R.id.right_readMessages, 0, this.f34459a.m2784K6(j) ? R.string.InviteBackToChannel : R.string.InviteBackToGroup, false);
            v4Var.m9206me(j2.m9997p(raVarArr).m9995r(R.string.Unban).m9996q(R.id.theme_color_textNegative));
        }
    }

    public List<View$OnTouchListenerC5103c0.C5104a> m3663Y2(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        ArrayList arrayList = new ArrayList();
        if (!z && !C7316a.m17051j(j)) {
            if (this.f34459a.m2443g7(j)) {
                arrayList.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendScheduled, C4403w.m27869i1(R.string.SendReminder), (int) R.drawable.baseline_date_range_24).m23940g(1024L));
            } else {
                long d4 = this.f34459a.m2494d4(j);
                if (d4 != 0) {
                    arrayList.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendOnceOnline, C4403w.m27869i1(R.string.SendOnceOnline), (int) R.drawable.baseline_visibility_24).m23941f(this.f34459a, d4));
                }
                arrayList.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendScheduled, C4403w.m27869i1(R.string.SendSchedule), (int) R.drawable.baseline_date_range_24).m23940g(z4 ? 8192L : 512L));
            }
        }
        if (!z && z3) {
            arrayList.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendNoSound, C4403w.m27869i1(R.string.SendNoSound), (int) R.drawable.baseline_notifications_off_24));
        }
        if (z2) {
            arrayList.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendNoMarkdown, C4403w.m27869i1(z ? R.string.SaveNoMarkdown : R.string.SendNoMarkdown), (int) R.drawable.baseline_code_24).m23940g(2048L));
        }
        return arrayList;
    }

    public void m3658Y7(final List<C4779t2.C4786e> list) {
        final AtomicInteger atomicInteger = new AtomicInteger(list.size());
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        for (C4779t2.C4786e eVar : list) {
            this.f34459a.m2270r4().m14783o(new TdApi.AddSavedAnimation(new TdApi.InputFileId(eVar.m25365d())), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    HandlerC10770jj.m3650Z5(atomicInteger2, atomicInteger, list, object);
                }
            });
        }
    }

    public boolean m3657Y8(int i, View$OnClickListenerC9170d1 d1Var, TdApi.Chat chat, boolean z) {
        if (d1Var == null) {
            return false;
        }
        String m3 = m3523m3(chat != null ? chat.f25367id : 0L);
        boolean u6 = this.f34459a.m2220u6(chat);
        d1Var.m10057g4(i, R.id.menu_btn_stopwatch, m3, u6, z);
        return u6;
    }

    public final void m3649Z6(final AbstractC9323v4<?> v4Var, final long j, boolean z, Runnable runnable) {
        String str;
        final TdApi.ChatMemberStatusMember chatMemberStatusMember;
        boolean z2;
        TdApi.ChatMemberStatusLeft chatMemberStatusLeft;
        TdApi.ChatMemberStatus K3 = this.f34459a.m2787K3(j);
        if (K3 != null) {
            if (this.f34459a.m2930B4().m4694g3().m28143j()) {
                C1379j0.m37298v0();
                return;
            }
            boolean z3 = !C5070i.m24061i(this.f34459a.m2462f4(j));
            boolean K6 = this.f34459a.m2784K6(j);
            boolean z4 = C7316a.m17054g(j) || z3;
            int constructor = K3.getConstructor();
            int i = R.string.LeaveNoReturnHintGroup;
            int i2 = R.string.LeaveReturnPublicLinkHintChannel;
            int i3 = R.string.LeaveChannel;
            String str2 = null;
            switch (constructor) {
                case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                    TdApi.ChatMemberStatusCreator chatMemberStatusCreator = (TdApi.ChatMemberStatusCreator) K3;
                    z2 = !chatMemberStatusCreator.isMember;
                    if (z == z2) {
                        chatMemberStatusMember = new TdApi.ChatMemberStatusCreator(chatMemberStatusCreator.customTitle, chatMemberStatusCreator.isAnonymous, z2);
                        if (z2) {
                            str = null;
                            i3 = 0;
                            break;
                        } else {
                            if (!z3) {
                                i2 = K6 ? R.string.LeaveCreatorHintChannel : R.string.LeaveCreatorHintGroup;
                            } else if (!K6) {
                                i2 = R.string.LeaveReturnPublicLinkHintGroup;
                            }
                            String i1 = C4403w.m27869i1(i2);
                            if (!K6) {
                                i3 = R.string.LeaveMegaMenu;
                            }
                            str = i1;
                            break;
                        }
                    } else {
                        return;
                    }
                case TdApi.ChatMemberStatusLeft.CONSTRUCTOR:
                    if (z) {
                        chatMemberStatusMember = new TdApi.ChatMemberStatusMember();
                        str = null;
                        z2 = false;
                        i3 = 0;
                        break;
                    } else {
                        return;
                    }
                case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                    if (!z) {
                        str2 = C4403w.m27869i1(z4 ? R.string.LeaveChatAdminHint : K6 ? R.string.LeaveAdminNoReturnHintChannel : R.string.LeaveAdminNoReturnHintGroup);
                        if (!K6) {
                            i3 = R.string.LeaveMegaMenu;
                        }
                        chatMemberStatusLeft = new TdApi.ChatMemberStatusLeft();
                        chatMemberStatusMember = chatMemberStatusLeft;
                        str = str2;
                        z2 = false;
                        break;
                    } else {
                        return;
                    }
                case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                    if (!z) {
                        if (!K6) {
                            i3 = R.string.LeaveMegaMenu;
                        }
                        if (!z4) {
                            if (K6) {
                                i = R.string.LeaveNoReturnHintChannel;
                            }
                            str2 = C4403w.m27869i1(i);
                        } else if (z3) {
                            if (!K6) {
                                i2 = R.string.LeaveReturnPublicLinkHintGroup;
                            }
                            str2 = C4403w.m27869i1(i2);
                        }
                        chatMemberStatusLeft = new TdApi.ChatMemberStatusLeft();
                        chatMemberStatusMember = chatMemberStatusLeft;
                        str = str2;
                        z2 = false;
                        break;
                    } else {
                        return;
                    }
                case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                    boolean z5 = ((TdApi.ChatMemberStatusRestricted) K3).isMember;
                    if (z != z5) {
                        if (!z5) {
                            chatMemberStatusMember = new TdApi.ChatMemberStatusMember();
                            str = null;
                            z2 = true;
                            i3 = 0;
                            break;
                        } else {
                            TdApi.ChatMemberStatusLeft chatMemberStatusLeft2 = new TdApi.ChatMemberStatusLeft();
                            if (!z4) {
                                if (!K6) {
                                    i = R.string.LeaveNoReturnHintChannel;
                                }
                                str2 = C4403w.m27869i1(i);
                            } else if (z3) {
                                if (!K6) {
                                    i2 = R.string.LeaveReturnPublicLinkHintGroup;
                                }
                                str2 = C4403w.m27869i1(i2);
                            }
                            if (!K6) {
                                i3 = R.string.LeaveMegaMenu;
                            }
                            chatMemberStatusMember = chatMemberStatusLeft2;
                            str = str2;
                            z2 = false;
                            break;
                        }
                    } else {
                        return;
                    }
                default:
                    chatMemberStatusMember = null;
                    str = null;
                    z2 = false;
                    i3 = 0;
                    break;
            }
            if (chatMemberStatusMember != null) {
                final boolean z6 = z2 || (C7316a.m17054g(j) && K3.getConstructor() == -5815259 && chatMemberStatusMember.getConstructor() == 844723285);
                final AbstractC5917i xcVar = new AbstractC5917i() {
                    @Override
                    public final void mo1322a(boolean z7) {
                        HandlerC10770jj.this.m3472r4(z6, j, chatMemberStatusMember, v4Var, z7);
                    }
                };
                if (i3 != 0) {
                    final int i4 = z ? R.id.btn_returnToChat : R.id.btn_removeChatFromList;
                    if (z || !C7316a.m17054g(j)) {
                        v4Var.m9261ee(str, new int[]{i4, R.id.btn_cancel}, new String[]{C4403w.m27869i1(i3), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view, int i5) {
                                boolean t4;
                                t4 = HandlerC10770jj.m3452t4(i4, xcVar, view, i5);
                                return t4;
                            }

                            @Override
                            public boolean mo492Q() {
                                return C5115g0.m23935a(this);
                            }

                            @Override
                            public Object mo491b2(int i5) {
                                return C5115g0.m23934b(this, i5);
                            }
                        });
                        return;
                    }
                    C9188f2 q = new C9188f2(R.id.btn_removeChatFromList).m9995r(R.string.LeaveDoneGroup).m9996q(R.id.theme_color_textNegative);
                    if (str != null) {
                        q.m10011b(str);
                    }
                    q.m9997p(new C2964ra[]{new C2964ra(12, (int) R.id.btn_removeChatFromList, 0, (int) R.string.LeaveRemoveFromList, (int) R.id.btn_removeChatFromList, true)});
                    q.m10003j(new AbstractC9323v4.AbstractC9343r() {
                        @Override
                        public final void mo1773l6(int i5, SparseIntArray sparseIntArray) {
                            HandlerC10770jj.m3462s4(AbstractC5917i.this, i5, sparseIntArray);
                        }
                    });
                    v4Var.m9206me(q);
                    return;
                }
                xcVar.mo1322a(false);
            } else if (z) {
                C1379j0.m37292y0(R.string.NoReturnToChat, 0);
            }
        }
    }

    public void m3639a7(AbstractC9323v4<?> v4Var, boolean z) {
        if (this.f34459a.m2519ba() != 0) {
            if (z) {
                v4Var.m9291ac(new View$OnClickListenerC2639kv(v4Var.mo4347s(), this.f34459a));
            } else {
                m3718S7(v4Var, this.f34459a.m2949A1(), true);
            }
        }
    }

    public boolean m3629b7(String str) {
        List<String> pathSegments;
        if (C5070i.m24061i(str)) {
            return false;
        }
        if (C10536ab.m4667o1().m4680k1()) {
            return true;
        }
        String replace = str.replace("tg://", "tg:");
        if (replace.startsWith("tg:") && !replace.startsWith("tg://")) {
            replace = "tg://" + replace.substring(3);
        }
        Uri parse = Uri.parse(replace);
        String scheme = parse.getScheme();
        if ("tg".equals(scheme)) {
            return false;
        }
        if (C5070i.m24061i(scheme)) {
            parse = Uri.parse("https://" + parse.toString());
        }
        if (this.f34459a.m2598W6(replace, false) && (pathSegments = parse.getPathSegments()) != null && !pathSegments.isEmpty()) {
            String str2 = pathSegments.get(0);
            String str3 = pathSegments.size() > 1 ? pathSegments.get(1) : null;
            str2.hashCode();
            if (str2.equals("s")) {
                return !C5070i.m24061i(str3);
            }
        }
        return false;
    }

    public final void m3628b8(String str) {
        C1379j0.m37292y0(R.string.UploadingPhotoWait, 0);
        this.f34459a.m2270r4().m14783o(new TdApi.SetProfilePhoto(new TdApi.InputChatPhotoStatic(new TdApi.InputFileGenerated(str, C5337d.m23202j(str), 0))), this.f34459a.m2780Ka());
    }

    public final CharSequence m3623c3(long j, TdApi.MessageSender messageSender, boolean z) {
        if (this.f34459a.m2784K6(j)) {
            return C4403w.m27853m1(z ? R.string.MemberCannotJoinChannel : R.string.MemberCanJoinChannel, this.f34459a.m2151yb(messageSender));
        }
        return C4403w.m27853m1(z ? R.string.MemberCannotJoinGroup : R.string.MemberCanJoinGroup, this.f34459a.m2151yb(messageSender));
    }

    public final void m3618c8(TdApi.Chat chat, int i) {
        if (chat != null && this.f34459a.m2707P3(chat.f25367id) != i) {
            this.f34459a.m2779Kb(chat.f25367id, i);
        }
    }

    public final int m3613d3(long j) {
        TdApi.Chat U2 = this.f34459a.m2632U2(j);
        if (U2 == null) {
            return R.string.DeleteChat;
        }
        switch (C7316a.m17057d(j)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                if (this.f34459a.m2542a3(U2)) {
                    return this.f34459a.m2784K6(j) ? R.string.LeaveChannel : R.string.LeaveMegaMenu;
                }
                break;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return this.f34459a.m2906Cc(U2) ? R.string.DeleteAndStop : R.string.DeleteChat;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                TdApi.BasicGroup W3 = this.f34459a.m2601W3(j);
                TdApi.ChatMemberStatus K3 = this.f34459a.m2787K3(j);
                if (this.f34459a.m2542a3(U2) && K3 != null) {
                    return (C4779t2.m25499i3(K3, false) || (W3 != null && !W3.isActive)) ? R.string.LeaveMegaMenu : R.string.DeleteChat;
                }
                break;
        }
        return R.string.DeleteChat;
    }

    public final Client.AbstractC7865g m3609d7(final AbstractC10664f9 f9Var, final C10788q qVar) {
        final AbstractC9323v4<?> F = f9Var.mo4347s().m14552P1().m9763F();
        return new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.m3432v4(AbstractC10664f9.this, F, qVar, object);
            }
        };
    }

    public void m3608d8(C9137c cVar, long j) {
        if (this.f34459a.m2440ga().m3240B(j, true)) {
            cVar.setDataColorId(R.id.theme_color_textNegative);
            cVar.setData(R.string.NotificationsBlocked);
            return;
        }
        TdApi.ChatNotificationSettings I3 = this.f34459a.m2819I3(j);
        cVar.setDataColorId(0);
        if (I3 != null) {
            cVar.setData(m3503o3(this.f34459a.m2287q3(j)));
        } else {
            cVar.setData(R.string.LoadingInformation);
        }
    }

    public void m3599e7(AbstractC10664f9 f9Var, long j, C10780j jVar) {
        m3579g7(f9Var, C7316a.m17059b(j), new TdApi.CreateBasicGroupChat(j, false), jVar);
    }

    public void m3598e8(C9137c cVar, TdApi.NotificationSettingsScope notificationSettingsScope, boolean z) {
        int u0;
        if (this.f34459a.m2440ga().m3236C(notificationSettingsScope)) {
            cVar.setDataColorId(R.id.theme_color_textNegative);
            cVar.setData(R.string.NotificationsBlocked);
            return;
        }
        TdApi.ScopeNotificationSettings M0 = this.f34459a.m2440ga().m3195M0(notificationSettingsScope);
        cVar.setDataColorId(0);
        if (M0 == null) {
            cVar.setData(C4403w.m27869i1(R.string.LoadingInformation));
        } else if (Build.VERSION.SDK_INT < 26 || !z || M0.muteFor != 0 || (u0 = this.f34459a.m2440ga().m3075u0(notificationSettingsScope)) >= 3) {
            cVar.setData(m3503o3(M0.muteFor));
        } else {
            cVar.setData(C4403w.m27865j1(R.string.NotificationsEnabledHint, C4403w.m27909Z1(C4403w.m27869i1(m3533l3(u0, this.f34459a.m2440ga().m3151a1(notificationSettingsScope), this.f34459a.m2440ga().m3148b1(notificationSettingsScope))))));
        }
    }

    public void m3589f7(final AbstractC10664f9 f9Var, final String str) {
        this.f34459a.m2270r4().m14783o(new TdApi.GetBankCardInfo(str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.this.m3412x4(f9Var, str, object);
            }
        });
    }

    public void m3588f8(AbstractC10664f9 f9Var, TdApi.LanguagePackInfo languagePackInfo) {
        String j1 = C4403w.m27865j1(R.string.ShareTextLanguageLink, languagePackInfo.name, f9Var.mo4348c().m2730Nc(languagePackInfo.f25405id));
        x00 x00Var = new x00(f9Var.mo4347s(), f9Var.mo4348c());
        x00Var.m30994Vi(new x00.C3281m(j1).m30884E(j1, C4403w.m27869i1(R.string.ShareBtnLanguage)));
        x00Var.m30960ej();
    }

    public int m3583g3(TdApi.Chat chat) {
        int r3 = this.f34459a.m2271r3(chat);
        return r3 >= 345600 ? R.drawable.baseline_notifications_off_24 : r3 > 0 ? R.drawable.baseline_notifications_paused_24 : R.drawable.baseline_notifications_24;
    }

    public final void m3579g7(final AbstractC10664f9 f9Var, long j, final TdApi.Function function, final C10780j jVar) {
        TdApi.Chat U2;
        if (j == 0 || (U2 = this.f34459a.m2632U2(j)) == null) {
            this.f34459a.m2270r4().m14783o(function, new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    HandlerC10770jj.this.m3392z4(f9Var, jVar, function, object);
                }
            });
        } else {
            m3881C4(f9Var, U2, jVar);
        }
    }

    public void m3578g8(AbstractC10664f9 f9Var, String str) {
        if (!C5070i.m24061i(str)) {
            x00 x00Var = new x00(f9Var.mo4347s(), f9Var.mo4348c());
            x00Var.m30994Vi(new x00.C3281m(C4403w.m27865j1(R.string.ShareTextProxyLink2, str)).m30884E(C4403w.m27865j1(R.string.ShareTextProxyLink, str), C4403w.m27869i1(R.string.ShareBtnProxy)));
            x00Var.m30960ej();
        }
    }

    public final CharSequence m3573h3(TdApi.User user) {
        if (user.isMutualContact) {
            return C4403w.m27853m1(C4779t2.m25728A2(user) ? R.string.ContactStateMutual : R.string.ContactStateMutualNoPhone, C4779t2.m25437r2(user));
        } else if (!user.isContact) {
            return null;
        } else {
            return C4403w.m27853m1(C4779t2.m25728A2(user) ? R.string.ContactStateOutgoing : R.string.ContactStateOutgoingNoPhone, C4779t2.m25437r2(user));
        }
    }

    public void m3569h7(AbstractC10664f9 f9Var, long j, C10780j jVar) {
        m3579g7(f9Var, j, new TdApi.GetChat(j), jVar);
    }

    public void m3568h8(AbstractC10664f9 f9Var, TdApi.StickerSetInfo stickerSetInfo) {
        String Rc = this.f34459a.m2667Rc(stickerSetInfo.name);
        String str = stickerSetInfo.title;
        x00 x00Var = new x00(f9Var.mo4347s(), f9Var.mo4348c());
        x00Var.m30994Vi(new x00.C3281m(C4403w.m27865j1(R.string.ShareTextStickerLink2, str, Rc)).m30884E(C4403w.m27865j1(R.string.ShareTextStickerLink, str, Rc), C4403w.m27869i1(R.string.ShareBtnStickerSet)));
        x00Var.m30960ej();
    }

    @Override
    public void handleMessage(Message message) {
        if (message.what >= 0) {
            this.f34459a.m2364l6(message);
        }
    }

    public void m3881C4(final p350yd.AbstractC10664f9 r22, final org.drinkless.p210td.libcore.telegram.TdApi.Chat r23, final p350yd.HandlerC10770jj.C10780j r24) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.HandlerC10770jj.m3881C4(yd.f9, org.drinkless.td.libcore.telegram.TdApi$Chat, yd.jj$j):void");
    }

    public void m3558i8(AbstractC10664f9 f9Var, String str) {
        x00 x00Var = new x00(f9Var.mo4347s(), f9Var.mo4348c());
        x00Var.m30994Vi(new x00.C3281m(str).m30886C(str));
        x00Var.m30960ej();
    }

    public void m3549j7(AbstractC10664f9 f9Var, TdApi.MessageSender messageSender, C10780j jVar) {
        int constructor = messageSender.getConstructor();
        if (constructor == -336109341) {
            m3439u7(f9Var, ((TdApi.MessageSenderUser) messageSender).userId, new C10780j().m3368h());
        } else if (constructor == -239660751) {
            m3439u7(f9Var, ((TdApi.MessageSenderChat) messageSender).chatId, new C10780j().m3368h());
        } else {
            throw new UnsupportedOperationException(messageSender.toString());
        }
    }

    public final void m3548j8(AbstractC9323v4<?> v4Var, TdApi.User user) {
        String R2 = this.f34459a.m2480e2().m1694R2(user.f25439id);
        String K2 = this.f34459a.m2480e2().m1721K2(user.f25439id);
        String Tc = C5070i.m24061i(R2) ? null : this.f34459a.m2637Tc(R2);
        if (C4779t2.m25658K2(user)) {
            String j1 = C4403w.m27865j1(R.string.ShareTextLink, K2, Tc);
            x00 x00Var = new x00(v4Var.mo4347s(), v4Var.mo4348c());
            x00Var.m30994Vi(new x00.C3281m(j1).m30884E(C4403w.m27865j1(R.string.ShareTextBotLink, Tc), C4403w.m27869i1(R.string.ShareBtnBot)));
            x00Var.m30960ej();
            return;
        }
        x00 x00Var2 = new x00(v4Var.mo4347s(), v4Var.mo4348c());
        x00Var2.m30994Vi(new x00.C3281m(user));
        x00Var2.m30960ej();
    }

    public final void m3539k7(final AbstractC10664f9 f9Var, long j, final C4737p7 p7Var, TdApi.Function function, final C10788q qVar) {
        TdApi.Chat U2 = this.f34459a.m2632U2(j);
        if (U2 != null) {
            m3841G4(f9Var, U2, p7Var, qVar);
        } else {
            this.f34459a.m2270r4().m14783o(function, new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    HandlerC10770jj.this.m3831H4(f9Var, p7Var, qVar, object);
                }
            });
        }
    }

    public final void m3538k8(AbstractC9323v4<?> v4Var, TdApi.User user) {
        String str;
        String str2;
        String str3 = user.username;
        if (!C5070i.m24061i(str3)) {
            String Tc = this.f34459a.m2637Tc(str3);
            if (this.f34459a.m2379k7(user.f25439id)) {
                str = C4403w.m27865j1(R.string.ShareTextMyLink2, Tc);
                str2 = C4403w.m27865j1(R.string.ShareTextMyLink, Tc);
            } else {
                String K2 = this.f34459a.m2480e2().m1721K2(user.f25439id);
                String j1 = C4403w.m27865j1(R.string.ShareTextProfileLink2, K2, Tc);
                str2 = C4403w.m27865j1(R.string.ShareTextProfileLink, K2, Tc);
                str = j1;
            }
            x00 x00Var = new x00(v4Var.mo4347s(), v4Var.mo4348c());
            x00Var.m30994Vi(new x00.C3281m(str).m30884E(str2, C4403w.m27869i1(R.string.ShareLink)));
            x00Var.m30960ej();
        }
    }

    public void m3529l7(AbstractC10664f9 f9Var, long j, C4737p7 p7Var, C10788q qVar) {
        m3539k7(f9Var, j, p7Var, new TdApi.GetChat(j), qVar);
    }

    public boolean m3528l8(TdApi.Chat chat) {
        C6924j2 N0;
        AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
        return E != null && (N0 = E.m14559N0()) != null && (N0.getBoundController() instanceof View$OnClickListenerC7430j1) && ((View$OnClickListenerC7430j1) N0.getBoundController()).m9131x9().f23721b == 4;
    }

    public String m3523m3(long j) {
        int P3 = this.f34459a.m2707P3(j);
        if (P3 > 0) {
            return m3593f3(P3, TimeUnit.SECONDS, false);
        }
        return null;
    }

    public void m3841G4(final AbstractC10664f9 f9Var, final TdApi.Chat chat, final C4737p7 p7Var, final C10788q qVar) {
        if (C10536ab.m4683j1()) {
            this.f34459a.m2549Za(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3841G4(f9Var, chat, p7Var, qVar);
                }
            });
            return;
        }
        int Y2 = this.f34459a.m2572Y2(chat);
        if (Y2 < 0) {
            m3518m8(f9Var, qVar, Y2, this.f34459a.m2784K6(chat.f25367id));
        } else if (!f9Var.mo4347s().m14424w1()) {
            C9270q1 P1 = f9Var.mo4347s().m14552P1();
            View$OnClickListenerC3062so soVar = new View$OnClickListenerC3062so(f9Var.mo4347s(), f9Var.mo4348c());
            try {
                soVar.m31851Hm(new View$OnClickListenerC3062so.C3075m(chat, p7Var, false));
                if (P1.m9737X()) {
                    P1.m9744Q(soVar);
                    C2760nb nbVar = new C2760nb(f9Var.mo4347s(), f9Var.mo4348c());
                    nbVar.get();
                    P1.m9749M().m9498o(nbVar, 0);
                    return;
                }
                AbstractC9323v4<?> F = P1.m9763F();
                if ((F instanceof View$OnClickListenerC2971rh) && F.mo9464C9() == chat.f25367id && !((View$OnClickListenerC2971rh) F).m32566Tk()) {
                    soVar.m9394Ld(true);
                }
                P1.m9719h0(soVar);
            } catch (Throwable th) {
                Log.m14725e("Unable to open profile", th, new Object[0]);
            }
        }
    }

    public int m3513n3(String str) {
        List<String> pathSegments;
        if (C5070i.m24061i(str)) {
            return 0;
        }
        String replace = str.replace("tg://", "tg:");
        if (replace.startsWith("tg:") && !replace.startsWith("tg://")) {
            replace = "tg://" + replace.substring(3);
        }
        Uri parse = Uri.parse(replace);
        String scheme = parse.getScheme();
        String str2 = null;
        if ("tg".equals(scheme)) {
            replace = m3818I7(null, null, parse);
            if (C5070i.m24061i(replace)) {
                return 0;
            }
            parse = Uri.parse(replace);
        } else if (C5070i.m24061i(scheme)) {
            replace = "https://" + replace;
            parse = Uri.parse(replace);
        }
        if (this.f34459a.m2598W6(replace, false) && (pathSegments = parse.getPathSegments()) != null && !pathSegments.isEmpty()) {
            String str3 = pathSegments.get(0);
            if (pathSegments.size() > 1) {
                str2 = pathSegments.get(1);
            }
            int s = C5070i.m24051s(str2);
            if (!C1363c0.m37457Q(str3) && s != 0) {
                return 1;
            }
        }
        return 0;
    }

    public final void m3509n7(final AbstractC10664f9 f9Var, final String str, final C10788q qVar) {
        C7319d dVar;
        if (qVar == null || (dVar = qVar.f34538d) == null || !C7316a.m17051j(dVar.m17027c())) {
            this.f34459a.m2270r4().m14783o(new TdApi.GetExternalLinkInfo(str), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    HandlerC10770jj.this.m3761O4(qVar, str, f9Var, object);
                }
            });
        } else {
            m3531l5(f9Var, str, qVar);
        }
    }

    public void m3508n8(AbstractC9323v4<?> v4Var, C10684g8 g8Var) {
        boolean s6 = this.f34459a.m2252s6(C7317b.f23225b);
        int i = s6 ? 2 : 1;
        C5320c cVar = new C5320c(i);
        C5146u0 u0Var = new C5146u0(i);
        C5320c cVar2 = new C5320c(i);
        if (s6) {
            cVar.m23284a(R.id.btn_markChatAsRead);
            u0Var.m23816a(R.string.ArchiveRead);
            cVar2.m23284a(R.drawable.baseline_done_all_24);
        }
        boolean V = this.f34459a.m2294pc().m4135V();
        cVar.m23284a(R.id.btn_pinUnpinChat);
        if (V) {
            cVar2.m23284a(R.drawable.deproko_baseline_pin_24);
            u0Var.m23816a(R.string.ArchivePin);
        } else {
            cVar2.m23284a(R.drawable.baseline_arrow_upward_24);
            u0Var.m23816a(R.string.ArchiveHide);
        }
        v4Var.m9261ee(C4403w.m27836q2(R.string.xArchivedChats, g8Var.m4301L()), cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i2) {
                boolean b6;
                b6 = HandlerC10770jj.this.m3630b6(view, i2);
                return b6;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i2) {
                return C5115g0.m23934b(this, i2);
            }
        });
    }

    public final void m3751P4(final AbstractC10664f9 f9Var, final String str, final TdApi.ChatInviteLinkInfo chatInviteLinkInfo, final C10788q qVar) {
        if (C10536ab.m4683j1()) {
            this.f34459a.m2549Za(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3751P4(f9Var, str, chatInviteLinkInfo, qVar);
                }
            });
            return;
        }
        AbstractC9323v4<?> F = f9Var.mo4347s().m14552P1().m9763F();
        if (F != null) {
            C11504x.m388F3(F, chatInviteLinkInfo, new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3741Q4(f9Var, str, chatInviteLinkInfo, qVar);
                }
            });
        }
    }

    public final void m3498o8(final AbstractC9323v4<?> v4Var, final TdApi.ChatList chatList, final long j, final Runnable runnable) {
        boolean Z2 = this.f34459a.m2557Z2(j);
        String Q3 = this.f34459a.m2691Q3(j);
        int[] iArr = new int[2];
        iArr[0] = Z2 ? R.id.btn_unarchiveChat : R.id.btn_archiveChat;
        iArr[1] = R.id.btn_cancel;
        String[] strArr = new String[2];
        strArr[0] = C4403w.m27869i1(Z2 ? R.string.UnarchiveChat : R.string.ArchiveChat);
        strArr[1] = C4403w.m27869i1(R.string.Cancel);
        int[] iArr2 = new int[2];
        iArr2[0] = Z2 ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24;
        iArr2[1] = R.drawable.baseline_cancel_24;
        v4Var.m9261ee(Q3, iArr, strArr, null, iArr2, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean c6;
                c6 = HandlerC10770jj.this.m3620c6(v4Var, chatList, j, runnable, view, i);
                return c6;
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

    public void m3489p7(AbstractC10664f9 f9Var, long j, C10780j jVar) {
        m3579g7(f9Var, 0L, new TdApi.GetSupergroupFullInfo(j), jVar);
    }

    public void m3488p8(AbstractC9323v4<?> v4Var, boolean z) {
        if (z) {
            v4Var.m9268de(null, new int[]{R.id.btn_changePhotoCamera, R.id.btn_changePhotoGallery, R.id.btn_changePhotoDelete}, new String[]{C4403w.m27869i1(R.string.takePhoto), C4403w.m27869i1(R.string.pickFromGallery), C4403w.m27869i1(R.string.DeletePhoto)}, new int[]{1, 1, 2}, new int[]{R.drawable.baseline_camera_alt_24, R.drawable.baseline_image_24, R.drawable.baseline_remove_circle_24});
        } else {
            v4Var.m9268de(null, new int[]{R.id.btn_changePhotoCamera, R.id.btn_changePhotoGallery}, new String[]{C4403w.m27869i1(R.string.takePhoto), C4403w.m27869i1(R.string.pickFromGallery)}, null, new int[]{R.drawable.baseline_camera_alt_24, R.drawable.baseline_image_24});
        }
    }

    public void m3483q3(int i, Intent intent, C9262p0 p0Var) {
        m3473r3(i, intent, p0Var, p0Var == null);
    }

    public boolean m3479q7(AbstractC10664f9 f9Var, AbstractView$OnClickListenerC3344yb.C3351f fVar) {
        if (!C7389v0.m16612l1(f9Var.mo4347s())) {
            return C1405v.m37142A(fVar.f11151b, fVar.f11152c, fVar.f11153d, fVar.f11154e);
        }
        C2125ac acVar = new C2125ac(f9Var.mo4347s(), f9Var.mo4348c());
        acVar.m9476Ad(fVar);
        f9Var.mo4347s().m14552P1().m9719h0(acVar);
        return true;
    }

    public final void m3610d6(final TdApi.Function function, final TdApi.Error error, final C10780j jVar) {
        TdApi.ChatInviteLinkInfo chatInviteLinkInfo;
        if (!C1379j0.m37357K()) {
            this.f34459a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    HandlerC10770jj.this.m3610d6(function, error, jVar);
                }
            });
            return;
        }
        CharSequence z5 = C4779t2.m25378z5(error);
        if (!C5070i.m24061i(z5)) {
            String str = error.message;
            str.hashCode();
            if (!str.equals("INVITE_REQUEST_SENT")) {
                if (str.equals("USERNAME_NOT_OCCUPIED") && function.getConstructor() == 857135533) {
                    z5 = C4403w.m27853m1(R.string.UsernameNotOccupied, ((TdApi.SearchPublicChat) function).username);
                }
            } else if (!(jVar == null || (chatInviteLinkInfo = jVar.f34510k) == null || !chatInviteLinkInfo.createsJoinRequest)) {
                z5 = C4403w.m27853m1(C4779t2.m25637N2(chatInviteLinkInfo.type) ? R.string.RequestJoinChannelSent : R.string.RequestJoinGroupSent, jVar.f34510k.title);
            }
            m3857E8(this.f34459a, R.drawable.baseline_error_24, z5, jVar != null ? jVar.f34507h : null);
        }
    }

    public void m3473r3(int i, Intent intent, C9262p0 p0Var, boolean z) {
        Uri data;
        String U2;
        if (i == 100) {
            File P = C1405v.m37127P();
            if (P != null) {
                C7389v0.m16610m(P);
                if (z) {
                    m3628b8(P.getPath());
                } else {
                    m3638a8(P.getPath(), p0Var);
                }
            }
        } else if (i == 101) {
            if (intent == null || (data = intent.getData()) == null || (U2 = C7389v0.m16675U2(data)) == null) {
                C1379j0.m37290z0("Error", 0);
            } else if (U2.endsWith(".webp")) {
                C1379j0.m37290z0("Webp is not supported for profile photos", 1);
            } else if (z) {
                m3628b8(U2);
            } else {
                m3638a8(U2, p0Var);
            }
        }
    }

    public void m3469r7(AbstractC10664f9 f9Var, long j, C7319d dVar, C10788q qVar) {
        m3569h7(f9Var, j, new C10780j().m3368h().m3371e(dVar).m3373c().m3357s(qVar));
    }

    public void m3468r8(final AbstractC9323v4<?> v4Var, final TdApi.ChatList chatList, final long j, final C4737p7 p7Var, boolean z, boolean z2, final Runnable runnable) {
        CharSequence charSequence;
        TdApi.Chat U2 = this.f34459a.m2632U2(j);
        if (U2 != null) {
            boolean a3 = this.f34459a.m2542a3(U2);
            TdApi.ChatPosition a = C7317b.m17043a(U2, chatList);
            if (a3) {
                boolean v3 = this.f34459a.m2207v3(U2);
                int i = (!z || runnable == null) ? 5 : 6;
                C5320c cVar = new C5320c(i);
                C5146u0 u0Var = new C5146u0(i);
                C5320c cVar2 = new C5320c(i);
                C5320c cVar3 = new C5320c(i);
                if (z && runnable != null) {
                    cVar.m23284a(R.id.btn_selectChat);
                    u0Var.m23816a(z2 ? R.string.Unselect : R.string.Select);
                    cVar2.m23284a(1);
                    cVar3.m23284a(R.drawable.baseline_playlist_add_check_24);
                }
                if (!this.f34459a.m2443g7(j)) {
                    cVar.m23284a(R.id.btn_notifications);
                    u0Var.m23816a(v3 ? R.string.MuteNotifications : R.string.EnableNotifications);
                    cVar2.m23284a(1);
                    cVar3.m23284a(v3 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_24);
                }
                if (a != null) {
                    cVar.m23284a(a.isPinned ? R.id.btn_unpinChat : R.id.btn_pinChat);
                    u0Var.m23816a(a.isPinned ? R.string.UnpinFromTop : R.string.PinToTop);
                    cVar2.m23284a(1);
                    cVar3.m23284a(a.isPinned ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24);
                }
                if (this.f34459a.m2368l2(chatList, U2)) {
                    boolean z3 = chatList instanceof TdApi.ChatListArchive;
                    cVar.m23284a(z3 ? R.id.btn_unarchiveChat : R.id.btn_archiveChat);
                    u0Var.m23816a(z3 ? R.string.UnarchiveChat : R.string.ArchiveChat);
                    cVar2.m23284a(1);
                    cVar3.m23284a(z3 ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24);
                }
                boolean q6 = this.f34459a.m2284q6(U2);
                boolean B2 = this.f34459a.m2932B2(U2);
                if (!B2 || U2.unreadCount == 0 || !q6) {
                    cVar.m23284a(B2 ? R.id.btn_markChatAsRead : R.id.btn_markChatAsUnread);
                    u0Var.m23816a(B2 ? R.string.MarkAsRead : R.string.MarkAsUnread);
                    cVar2.m23284a(1);
                    cVar3.m23284a(B2 ? R.drawable.baseline_done_all_24 : R.drawable.baseline_unsubscribe_24);
                }
                if (!q6 && this.f34459a.m2304p2(U2)) {
                    cVar.m23284a(R.id.btn_clearChatHistory);
                    u0Var.m23816a(R.string.ClearHistory);
                    cVar2.m23284a(1);
                    cVar3.m23284a(R.drawable.templarian_baseline_broom_24);
                }
                cVar2.m23284a(2);
                cVar3.m23284a(R.drawable.baseline_delete_24);
                int constructor = U2.type.getConstructor();
                int i2 = R.string.LeaveMegaMenu;
                int i3 = R.string.DeleteChat;
                switch (constructor) {
                    case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                        if (this.f34459a.m2784K6(j)) {
                            i2 = R.string.LeaveChannel;
                        }
                        u0Var.m23816a(i2);
                        break;
                    case TdApi.ChatTypeSecret.CONSTRUCTOR:
                        u0Var.m23816a(R.string.DeleteChat);
                        break;
                    case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                        TdApi.ChatMemberStatus K3 = this.f34459a.m2787K3(j);
                        if (K3 == null || !C4779t2.m25499i3(K3, false)) {
                            i2 = R.string.DeleteChat;
                        }
                        u0Var.m23816a(i2);
                        break;
                    case TdApi.ChatTypePrivate.CONSTRUCTOR:
                        if (this.f34459a.m2816I6(U2)) {
                            i3 = R.string.DeleteAndStop;
                        }
                        u0Var.m23816a(i3);
                        break;
                }
                cVar.m23284a(R.id.btn_removeChatFromList);
                switch (U2.type.getConstructor()) {
                    case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                        charSequence = U2.title;
                        break;
                    case TdApi.ChatTypeSecret.CONSTRUCTOR:
                        charSequence = C4403w.m27853m1(R.string.SecretChatWithUser, this.f34459a.m2480e2().m1749D2(this.f34459a.m2478e4(U2)));
                        break;
                    case TdApi.ChatTypePrivate.CONSTRUCTOR:
                        String D2 = this.f34459a.m2480e2().m1749D2(this.f34459a.m2478e4(U2));
                        if (!this.f34459a.m2443g7(j)) {
                            charSequence = C4403w.m27853m1(R.string.ChatWithUser, D2);
                            break;
                        } else {
                            charSequence = C4403w.m27869i1(R.string.ChatWithYourself);
                            break;
                        }
                    default:
                        throw new IllegalArgumentException();
                }
                v4Var.m9261ee(charSequence, cVar.m23280e(), u0Var.m23813d(), cVar2.m23280e(), cVar3.m23280e(), new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i4) {
                        boolean e6;
                        e6 = HandlerC10770jj.this.m3600e6(runnable, v4Var, chatList, j, p7Var, view, i4);
                        return e6;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i4) {
                        return C5115g0.m23934b(this, i4);
                    }
                });
            } else if (a != null && (a.source instanceof TdApi.ChatSourcePublicServiceAnnouncement)) {
                m3388z8(v4Var, chatList, j, null);
            }
        }
    }

    public boolean m3463s3(Context context, int i, TdApi.User user, C9262p0 p0Var) {
        TdApi.ProfilePhoto profilePhoto;
        if (user == null && i == R.id.btn_changePhotoDelete && p0Var == null) {
            return false;
        }
        switch (i) {
            case R.id.btn_changePhotoCamera:
                C1379j0.m37343Y(context);
                return true;
            case R.id.btn_changePhotoDelete:
                if (user == null || (profilePhoto = user.profilePhoto) == null) {
                    p0Var.setPhoto(null);
                } else {
                    m3743Q2(profilePhoto.f25414id);
                }
                return true;
            case R.id.btn_changePhotoGallery:
                C1379j0.m37340a0(false);
                return true;
            default:
                return false;
        }
    }

    public void m3459s7(AbstractC10664f9 f9Var, TdApi.Message message, C10788q qVar) {
        m3469r7(f9Var, message.chatId, new C7319d(message.chatId, message.f25406id), qVar);
    }

    public final void m3458s8(AbstractC9323v4<?> v4Var, final long j, final Runnable runnable) {
        boolean z = true;
        if (this.f34459a.m2836H2(j)) {
            C9188f2 b = new C9188f2(R.id.btn_removeChatFromList).m10010c(false).m10011b(this.f34459a.m2443g7(j) ? C4403w.m27982H0(v4Var, R.string.ClearSavedMessagesConfirm, new Object[0]) : C4403w.m27869i1(R.string.ClearHistoryConfirm));
            C2964ra[] raVarArr = new C2964ra[1];
            String j1 = C4403w.m27865j1(R.string.DeleteSecretChatHistoryForOtherParty, this.f34459a.m2480e2().m1749D2(C7316a.m17044q(j)));
            if (!this.f34459a.m2187w7(j) || !this.f34459a.m2480e2().m1757B2(this.f34459a.m2494d4(j))) {
                z = false;
            }
            raVarArr[0] = new C2964ra(12, (int) R.id.btn_clearChatHistory, 0, j1, (int) R.id.btn_clearChatHistory, z);
            v4Var.m9206me(b.m9997p(raVarArr).m9996q(R.id.theme_color_textNegative).m9995r(R.string.Delete).m10003j(new AbstractC9323v4.AbstractC9343r() {
                @Override
                public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                    HandlerC10770jj.this.m3590f6(j, runnable, i, sparseIntArray);
                }
            }));
            return;
        }
        v4Var.m9261ee(this.f34459a.m2443g7(j) ? C4403w.m27982H0(v4Var, R.string.ClearSavedMessagesConfirm, new Object[0]) : C4403w.m27869i1(R.string.ClearHistoryConfirm), new int[]{R.id.btn_clearChatHistory, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.ClearHistory), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.templarian_baseline_broom_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean g6;
                g6 = HandlerC10770jj.this.m3580g6(j, runnable, view, i);
                return g6;
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

    public boolean m3453t3(AbstractC9323v4<?> v4Var, View view, int i, TdApi.User user, boolean z) {
        CharSequence h3;
        String str;
        String str2;
        boolean z2 = false;
        if (user == null) {
            return false;
        }
        if (i != R.id.btn_addToGroup) {
            int i2 = 4;
            if (i == R.id.btn_phone) {
                if (!C5070i.m24061i(user.phoneNumber)) {
                    if (!z) {
                        i2 = 3;
                    }
                    C5320c cVar = new C5320c(i2);
                    C5320c cVar2 = new C5320c(i2);
                    C5146u0 u0Var = new C5146u0(i2);
                    if (z) {
                        cVar.m23284a(R.id.btn_changePhoneNumber);
                        cVar2.m23284a(R.drawable.baseline_edit_24);
                        u0Var.m23816a(R.string.PhoneNumberChange);
                    }
                    cVar.m23284a(R.id.btn_phone_call);
                    cVar2.m23284a(R.drawable.baseline_phone_24);
                    u0Var.m23816a(R.string.Call);
                    cVar.m23284a(R.id.btn_phone_copy);
                    cVar2.m23284a(R.drawable.baseline_content_copy_24);
                    u0Var.m23816a(R.string.Copy);
                    cVar.m23284a(R.id.btn_phone_share);
                    cVar2.m23284a(R.drawable.baseline_forward_24);
                    u0Var.m23816a(R.string.ShareContact);
                    String w = C1363c0.m37410w(user.phoneNumber);
                    if (!z) {
                        CharSequence h32 = m3573h3(user);
                        if (h32 instanceof SpannableStringBuilder) {
                            ((SpannableStringBuilder) h32).append((CharSequence) "\n\n").append((CharSequence) w);
                            str = h32;
                            v4Var.m9268de(str, cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e());
                        } else if (!C5070i.m24061i(h32)) {
                            w = ((Object) h32) + "\n\n" + w;
                        }
                    }
                    str = w;
                    v4Var.m9268de(str, cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e());
                } else if (!z && (h3 = m3573h3(user)) != null) {
                    if (view != null) {
                        v4Var.mo4347s().m14584H3().m8985g(view).m8969F(v4Var, this.f34459a, R.drawable.baseline_info_24, h3);
                    } else {
                        C1379j0.m37290z0(h3, 0);
                    }
                }
                return true;
            } else if (i != R.id.btn_username) {
                return false;
            } else {
                C5320c cVar3 = new C5320c(4);
                C5320c cVar4 = new C5320c(4);
                C5146u0 u0Var2 = new C5146u0(4);
                if (this.f34459a.m2379k7(user.f25439id)) {
                    if (C5070i.m24061i(user.username)) {
                        v4Var.m9284bc().m9719h0(new View$OnClickListenerC3043s8(v4Var.mo4347s(), v4Var.mo4348c()));
                        return true;
                    }
                    cVar3.m23284a(R.id.btn_username_edit);
                    cVar4.m23284a(R.drawable.baseline_edit_24);
                    u0Var2.m23816a(R.string.EditUsername);
                    z2 = true;
                }
                cVar3.m23284a(R.id.btn_username_copy_link);
                cVar4.m23284a(R.drawable.baseline_link_24);
                u0Var2.m23816a(R.string.CopyLink);
                cVar3.m23284a(R.id.btn_username_share);
                cVar4.m23284a(R.drawable.baseline_forward_24);
                u0Var2.m23816a(R.string.ShareLink);
                if (z2) {
                    str2 = null;
                } else {
                    str2 = "@" + user.username;
                }
                v4Var.m9268de(str2, cVar3.m23280e(), u0Var2.m23813d(), null, cVar4.m23280e());
                return true;
            }
        } else {
            m3842G3(v4Var, user.f25439id);
            return true;
        }
    }

    public void m3449t7(AbstractC10664f9 f9Var, TdApi.MessageLinkInfo messageLinkInfo, C10788q qVar) {
        if (messageLinkInfo.message != null) {
            long j = messageLinkInfo.chatId;
            TdApi.Message message = messageLinkInfo.message;
            m3469r7(f9Var, j, new C7319d(message.chatId, message.f25406id), qVar);
            return;
        }
        if (this.f34459a.m2632U2(messageLinkInfo.chatId) != null) {
            C1379j0.m37292y0(this.f34459a.m2784K6(messageLinkInfo.chatId) ? R.string.PostNotFound : R.string.MessageNotFound, 0);
        }
        m3569h7(f9Var, messageLinkInfo.chatId, new C10780j().m3368h().m3357s(qVar));
    }

    public void m3448t8(AbstractC9323v4<?> v4Var, long j) {
        m3438u8(v4Var, j, false, this.f34459a.m2922Bc(j), null);
    }

    public boolean m3443u3(AbstractC9323v4<?> v4Var, int i, TdApi.User user, TdApi.UserFullInfo userFullInfo) {
        switch (i) {
            case R.id.more_btn_addToContacts:
                if (user != null) {
                    m3893B2(v4Var, user);
                }
                return true;
            case R.id.more_btn_addToGroup:
                m3842G3(v4Var, user.f25439id);
                return true;
            case R.id.more_btn_edit:
                if (user != null) {
                    View$OnClickListenerC2118a7 a7Var = new View$OnClickListenerC2118a7(v4Var.mo4347s(), v4Var.mo4348c());
                    if (v4Var.mo4348c().m2379k7(user.f25439id)) {
                        a7Var.m35518uf(1);
                    } else {
                        a7Var.m35518uf(2);
                        a7Var.m35517vf(user);
                    }
                    v4Var.m9284bc().m9719h0(a7Var);
                }
                return true;
            case R.id.more_btn_logout:
                m3639a7(v4Var, true);
                return true;
            case R.id.more_btn_share:
                m3548j8(v4Var, user);
                return true;
            default:
                return false;
        }
    }

    public void m3439u7(AbstractC10664f9 f9Var, long j, C10780j jVar) {
        m3579g7(f9Var, C7316a.m17058c(j), new TdApi.CreatePrivateChat(j, false), jVar);
    }

    public final void m3438u8(final AbstractC9323v4<?> v4Var, final long j, boolean z, final boolean z2, final Runnable runnable) {
        String i1;
        final AbstractC5917i rcVar = new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z3) {
                HandlerC10770jj.this.m3510n6(j, v4Var, runnable, z3);
            }
        };
        switch (C7316a.m17057d(j)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                m3408x8(v4Var, j, this.f34459a.m2691Q3(j), new Runnable() {
                    @Override
                    public final void run() {
                        HandlerC10770jj.this.m3520m6(v4Var, j, runnable);
                    }
                }, z, runnable);
                return;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                final String D2 = this.f34459a.m2480e2().m1749D2(this.f34459a.m2494d4(j));
                m3408x8(v4Var, j, C4403w.m27853m1(R.string.SecretChatWithUser, D2), new Runnable() {
                    @Override
                    public final void run() {
                        HandlerC10770jj.this.m3550j6(j, v4Var, D2, rcVar, z2);
                    }
                }, z, runnable);
                return;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                m3408x8(v4Var, j, this.f34459a.m2691Q3(j), new Runnable() {
                    @Override
                    public final void run() {
                        HandlerC10770jj.this.m3530l6(j, v4Var, runnable, rcVar);
                    }
                }, z, runnable);
                return;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                final long q = C7316a.m17044q(j);
                final String D22 = this.f34459a.m2480e2().m1749D2(q);
                final boolean z3 = z2 && this.f34459a.m2832H6(j);
                if (this.f34459a.m2379k7(q)) {
                    i1 = C4403w.m27869i1(R.string.SavedMessages);
                } else {
                    i1 = this.f34459a.m2475e7(C7316a.m17058c(q)) ? C4403w.m27869i1(R.string.RepliesBot) : C4403w.m27865j1(R.string.ChatWithUser, D22);
                }
                m3408x8(v4Var, j, i1, new Runnable() {
                    @Override
                    public final void run() {
                        HandlerC10770jj.this.m3460s6(q, v4Var, z3, D22, j, z2, rcVar);
                    }
                }, z, runnable);
                return;
            default:
                return;
        }
    }

    public boolean m3433v3(AbstractC9323v4<?> v4Var, int i, TdApi.User user) {
        if (user == null) {
            return false;
        }
        if (i != R.id.btn_changePhoneNumber) {
            switch (i) {
                case R.id.btn_phone_call:
                    C1405v.m37141B('+' + user.phoneNumber);
                    return true;
                case R.id.btn_phone_copy:
                    C1379j0.m37325i('+' + user.phoneNumber, R.string.copied_phone);
                    return true;
                case R.id.btn_phone_share:
                    m3548j8(v4Var, user);
                    return true;
                default:
                    switch (i) {
                        case R.id.btn_username_copy:
                            C1379j0.m37325i('@' + user.username, R.string.CopiedUsername);
                            return true;
                        case R.id.btn_username_copy_link:
                            C1379j0.m37325i(C4779t2.m25680H1(user), R.string.CopiedLink);
                            return true;
                        case R.id.btn_username_edit:
                            v4Var.m9284bc().m9719h0(new View$OnClickListenerC3043s8(v4Var.mo4347s(), v4Var.mo4348c()));
                            return true;
                        case R.id.btn_username_share:
                            m3538k8(v4Var, user);
                            return true;
                        default:
                            return false;
                    }
            }
        } else {
            v4Var.m9284bc().m9719h0(new View$OnClickListenerC2461gw(v4Var.mo4347s(), v4Var.mo4348c()));
            return true;
        }
    }

    public void m3429v7(AbstractC10664f9 f9Var, long j, C10788q qVar) {
        m3539k7(f9Var, C7316a.m17058c(j), null, new TdApi.CreatePrivateChat(j, false), qVar);
    }

    public void m3423w3(TdApi.UpdateTermsOfService updateTermsOfService) {
    }

    public void m3419w7(AbstractC10664f9 f9Var, final String str, final int i, final TdApi.ProxyType proxyType, String str2) {
        AbstractC9323v4<?> F = f9Var.mo4347s().m14552P1().m9763F();
        if (F != null) {
            SpannableStringBuilder k = C1363c0.m37427k(str2);
            k.insert(0, (CharSequence) "\n\n");
            String i1 = C4403w.m27869i1(R.string.EnableProxyAlertTitle);
            k.insert(0, (CharSequence) i1);
            k.setSpan(C4779t2.m25726A4(i1), 0, i1.length(), 33);
            k.append((CharSequence) "\n\n");
            k.append((CharSequence) C4403w.m27869i1(R.string.EnableProxyAlertHint));
            if (proxyType.getConstructor() == -1964826627) {
                k.append((CharSequence) "\n\n");
                k.append((CharSequence) C4403w.m27869i1(R.string.EnableProxyAlertHintMtproto));
            }
            C5320c cVar = new C5320c(3);
            C5146u0 u0Var = new C5146u0(3);
            C5320c cVar2 = new C5320c(3);
            C5320c cVar3 = new C5320c(3);
            cVar.m23284a(R.id.btn_addProxy);
            u0Var.m23816a(R.string.ProxyEnable);
            cVar2.m23284a(R.drawable.baseline_security_24);
            cVar3.m23284a(3);
            cVar.m23284a(R.id.btn_save);
            u0Var.m23816a(R.string.ProxySaveForLater);
            cVar2.m23284a(R.drawable.baseline_playlist_add_24);
            cVar3.m23284a(1);
            cVar.m23284a(R.id.btn_cancel);
            u0Var.m23816a(R.string.Cancel);
            cVar2.m23284a(R.drawable.baseline_cancel_24);
            cVar3.m23284a(1);
            F.m9261ee(k, cVar.m23280e(), u0Var.m23813d(), cVar3.m23280e(), cVar2.m23280e(), new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i2) {
                    boolean R4;
                    R4 = HandlerC10770jj.m3731R4(str, i, proxyType, view, i2);
                    return R4;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i2) {
                    return C5115g0.m23934b(this, i2);
                }
            });
        }
    }

    public final boolean m3413x3(final AbstractC10664f9 f9Var, String str, final C10788q qVar) {
        if (C4779t2.m25513g3(str)) {
            Log.m14724e("Attempt to install custom local languagePackId:%s", str);
            return true;
        }
        this.f34459a.m2270r4().m14783o(new TdApi.GetLanguagePackInfo(str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                HandlerC10770jj.this.m3522m4(f9Var, qVar, object);
            }
        });
        return true;
    }

    public void m3409x7(AbstractC10664f9 f9Var, boolean z) {
        if (C4868i.m24726c2().m24664k0() == 0) {
            m3863E2(f9Var, z);
        } else {
            f9Var.mo4347s().m14552P1().m9719h0(new View$OnLongClickListenerC2502hx(f9Var.mo4347s(), f9Var.mo4348c()));
        }
    }

    public final void m3408x8(final AbstractC9323v4<?> v4Var, final long j, CharSequence charSequence, final Runnable runnable, boolean z, final Runnable runnable2) {
        if (!z || !this.f34459a.m2320o2(j)) {
            runnable.run();
        } else {
            v4Var.m9261ee(charSequence, new int[]{R.id.btn_removeChatFromList, R.id.btn_clearChatHistory}, new String[]{C4403w.m27869i1(m3613d3(j)), C4403w.m27869i1(R.string.ClearHistory)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.templarian_baseline_broom_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean w6;
                    w6 = HandlerC10770jj.this.m3420w6(runnable, v4Var, j, runnable2, view, i);
                    return w6;
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

    public void m3403y3(AbstractC10664f9 f9Var, C10783m mVar) {
        if (C11541z.m7t().m8s(mVar) != 0) {
            C11541z.m7t().m21h(this.f34459a, mVar.f34528j, false, null);
        }
    }

    public void m3399y7(AbstractC10664f9 f9Var, String str, C10788q qVar) {
        m3579g7(f9Var, 0L, new TdApi.SearchPublicChat(str), new C10780j().m3357s(qVar).m3368h().m3364l());
    }

    public void m3398y8(AbstractC9323v4<?> v4Var, final C11533r rVar, final Runnable runnable) {
        if (C11541z.m1y(rVar.m110c())) {
            v4Var.m9261ee(C4403w.m27869i1(R.string.ThemeRemoveInfo), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.ThemeRemoveConfirm), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean x6;
                    x6 = HandlerC10770jj.this.m3410x6(rVar, runnable, view, i);
                    return x6;
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

    public void m3394z2(AbstractView$OnTouchListenerC7889a aVar, boolean z, boolean z2) {
        int c2 = C10536ab.m4667o1().m4711c2(z2);
        if (c2 != -1) {
            View$OnClickListenerC2393fk fkVar = new View$OnClickListenerC2393fk(aVar, C10536ab.m4756R0(c2));
            fkVar.m34660sg(true);
            aVar.m14552P1().m9719h0(fkVar);
        }
    }

    public final void m3741Q4(AbstractC10664f9 f9Var, String str, TdApi.ChatInviteLinkInfo chatInviteLinkInfo, C10788q qVar) {
        m3579g7(f9Var, 0L, new TdApi.JoinChatByInviteLink(str), new C10780j().m3357s(qVar).m3369g(str, chatInviteLinkInfo).m3368h().m3362n());
    }

    public void m3389z7(AbstractC10664f9 f9Var, long j, C7319d dVar) {
        m3569h7(f9Var, j, new C10780j().m3368h().m3359q().m3371e(dVar).m3373c());
    }

    public final void m3388z8(final AbstractC9323v4<?> v4Var, TdApi.ChatList chatList, final long j, final Runnable runnable) {
        final Runnable giVar = new Runnable() {
            @Override
            public final void run() {
                HandlerC10770jj.this.m3400y6(j, v4Var, runnable);
            }
        };
        TdApi.ChatSource J3 = this.f34459a.m2803J3(chatList, j);
        if (J3 instanceof TdApi.ChatSourcePublicServiceAnnouncement) {
            v4Var.m9261ee(C4403w.m27934T0((TdApi.ChatSourcePublicServiceAnnouncement) J3, this.f34459a.m2691Q3(j)), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.PsaHideDone), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_sweep_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean z6;
                    z6 = HandlerC10770jj.m3390z6(giVar, view, i);
                    return z6;
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

    public static class C10783m implements AbstractC11531p {
        public String f34519a;
        public long f34520b;
        public String f34521c;
        public String f34522d;
        public int f34523e = 0;
        public final Map<Integer, Float> f34524f = new HashMap();
        public final Map<Integer, Integer> f34525g = new HashMap();
        public final List<C10784a> f34526h = new ArrayList();
        public final List<C10784a> f34527i = new ArrayList();
        public C11529n f34528j;

        @Override
        public int mo96a() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public String mo95b() {
            if (!C5070i.m24061i(this.f34522d)) {
                return this.f34522d;
            }
            return C11514c0.m348a(this.f34523e).mo95b();
        }

        @Override
        public boolean mo94c() {
            return C11530o.m116a(this);
        }

        @Override
        public float mo93d(int i) {
            Float f = this.f34524f.get(Integer.valueOf(i));
            if (f != null) {
                return f.floatValue();
            }
            return C11514c0.m348a(this.f34523e).mo93d(i);
        }

        @Override
        public int mo92e(int i) {
            Integer num = this.f34525g.get(Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
            return C11514c0.m348a(this.f34523e).mo92e(i);
        }

        @Override
        public boolean mo91f() {
            return C11530o.m115b(this);
        }

        public void m3339g(String str, int i, int i2) {
            if (!this.f34525g.containsKey(Integer.valueOf(i))) {
                this.f34525g.put(Integer.valueOf(i), Integer.valueOf(i2));
                this.f34527i.add(new C10784a(str, i, i2));
                return;
            }
            throw new IllegalArgumentException("Duplicate color: " + C11524j.m222Q(i));
        }

        public void m3338h(String str, int i, float f) {
            if (this.f34524f.containsKey(Integer.valueOf(i))) {
                throw new IllegalArgumentException("Duplicate property: " + C11524j.m192d0(i));
            } else if (C11541z.m64A(i, f)) {
                this.f34524f.put(Integer.valueOf(i), Float.valueOf(f));
                if (i == R.id.theme_property_parentTheme) {
                    this.f34523e = (int) f;
                }
                this.f34526h.add(new C10784a(str, i, f));
            } else {
                throw new IllegalArgumentException("Invalid property: " + C11524j.m192d0(i) + "=" + f);
            }
        }

        public void m3337i() {
            if (this.f34523e == 0) {
                throw new IllegalArgumentException("theme.parentThemeId is missing");
            } else if (!C5070i.m24061i(this.f34519a)) {
                AbstractC11531p d = C11514c0.m345d(this.f34523e, false);
                for (int size = this.f34527i.size() - 1; size >= 0; size--) {
                    C10784a aVar = this.f34527i.get(size);
                    if (d.mo92e(aVar.f34531b) == aVar.f34532c) {
                        this.f34527i.remove(size);
                        this.f34525g.remove(Integer.valueOf(aVar.f34531b));
                    }
                }
                for (int size2 = this.f34526h.size() - 1; size2 >= 0; size2--) {
                    C10784a aVar2 = this.f34526h.get(size2);
                    int i = aVar2.f34531b;
                    if (i != R.id.theme_property_parentTheme && d.mo93d(i) == aVar2.f34529M) {
                        this.f34526h.remove(size2);
                        this.f34524f.remove(Integer.valueOf(aVar2.f34531b));
                    }
                }
                C10836lj ljVar = C10836lj.f34727a;
                Collections.sort(this.f34526h, ljVar);
                Collections.sort(this.f34527i, ljVar);
            } else {
                throw new IllegalArgumentException("theme.name is missing");
            }
        }

        public static class C10784a implements Comparable<C10784a> {
            public float f34529M;
            public final String f34530a;
            public final int f34531b;
            public int f34532c;

            public C10784a(String str, int i, int i2) {
                this.f34530a = str;
                this.f34531b = i;
                this.f34532c = i2;
            }

            public int compareTo(C10784a aVar) {
                return this.f34530a.compareToIgnoreCase(aVar.f34530a);
            }

            public C10784a(String str, int i, float f) {
                this.f34530a = str;
                this.f34531b = i;
                this.f34529M = f;
            }
        }
    }

    public static class C10788q implements AbstractC4761s4.AbstractC4770i {
        public int f34535a;
        public int f34536b;
        public TdApi.WebPage f34537c;
        public C7319d f34538d;
        public String f34539e;
        public String f34540f;
        public C9357x2.C9365h f34541g;
        public boolean f34542h;
        public String f34543i;
        public AbstractC9323v4<?> f34544j;
        public AbstractC4761s4 f34545k;

        public C10788q() {
            this.f34535a = -1;
            this.f34536b = -1;
        }

        @Override
        public void mo3330a(AbstractC4761s4 s4Var, long j, long j2, boolean z) {
            C7319d dVar = this.f34538d;
            if (dVar != null && dVar.m17029a(s4Var.m26145K2(), j)) {
                this.f34538d = this.f34538d.m17022h(j, j2);
                s4Var.m25939f4().remove(this);
                this.f34545k = null;
            }
        }

        public C10788q m3328c(AbstractC9323v4<?> v4Var) {
            this.f34544j = v4Var;
            return this;
        }

        public C10788q m3327d() {
            return m3323h(1);
        }

        public C10788q m3326e() {
            return m3320k(0);
        }

        public C10788q m3325f() {
            this.f34542h = false;
            return this;
        }

        public C10788q m3324g(String str) {
            this.f34543i = str;
            return this;
        }

        public C10788q m3323h(int i) {
            this.f34536b = i;
            return this;
        }

        public C10788q m3322i() {
            return m3320k(1);
        }

        public C10788q m3321j(String str) {
            this.f34540f = str;
            return this;
        }

        public C10788q m3320k(int i) {
            this.f34535a = i;
            return this;
        }

        public C10788q m3319l(String str) {
            this.f34539e = str;
            return this;
        }

        public C10788q m3318m() {
            return m3317n(true);
        }

        public C10788q m3317n(boolean z) {
            this.f34542h = z;
            return this;
        }

        public C10788q m3316o(long j) {
            AbstractC4761s4 s4Var = this.f34545k;
            if (s4Var == null) {
                return m3314q(new C7319d(j, 0L));
            }
            if (s4Var.m26145K2() == j) {
                return this;
            }
            throw new IllegalStateException();
        }

        public C10788q m3315p(AbstractC4761s4 s4Var) {
            if (s4Var != null) {
                if (s4Var.m25851o6()) {
                    this.f34545k = s4Var;
                    s4Var.m25939f4().add(this);
                } else {
                    this.f34545k = null;
                }
                m3328c(s4Var.m26096P0());
                return m3314q(new C7319d(s4Var.m26145K2(), s4Var.m26115N3(), s4Var.m25883l4(s4Var.m26115N3())));
            }
            this.f34545k = null;
            return m3314q(null);
        }

        public C10788q m3314q(C7319d dVar) {
            this.f34538d = dVar;
            return this;
        }

        public C10788q m3313r(TdApi.WebPage webPage) {
            this.f34537c = webPage;
            return this;
        }

        public C10788q m3312s(C9357x2.C9365h hVar) {
            this.f34541g = hVar;
            if (!(hVar == null || this.f34544j == null || hVar.m8953o())) {
                hVar.m8958i(this.f34544j);
            }
            return this;
        }

        public C10788q(C10788q qVar) {
            this.f34535a = -1;
            this.f34536b = -1;
            if (qVar != null) {
                this.f34535a = qVar.f34535a;
                this.f34536b = qVar.f34536b;
                this.f34538d = qVar.f34538d;
                this.f34539e = qVar.f34539e;
                this.f34540f = qVar.f34540f;
                this.f34541g = qVar.f34541g;
                this.f34542h = qVar.f34542h;
                this.f34543i = qVar.f34543i;
                this.f34544j = qVar.f34544j;
                AbstractC4761s4 s4Var = qVar.f34545k;
                if (s4Var != null) {
                    m3315p(s4Var);
                }
            }
        }
    }
}
