package zd;

import ad.x;
import ae.r;
import ae.z;
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
import ce.c0;
import ce.j0;
import ce.v;
import de.a0;
import de.a7;
import de.ac;
import de.ap;
import de.dy;
import de.e7;
import de.fk;
import de.fv;
import de.fw;
import de.fz;
import de.h20;
import de.hw;
import de.ii;
import de.iq;
import de.ix;
import de.lj;
import de.lv;
import de.mi;
import de.nb;
import de.o4;
import de.p0;
import de.qp;
import de.qz;
import de.ra;
import de.rh;
import de.s;
import de.s4;
import de.s6;
import de.s8;
import de.so;
import de.u7;
import de.u9;
import de.wt;
import de.y00;
import de.yb;
import de.yo;
import ee.k;
import gd.w;
import gd.y;
import hd.c7;
import hd.p7;
import hd.s4;
import hd.t2;
import hd.w2;
import ie.c0;
import ie.g0;
import ie.h0;
import ie.o;
import ie.u0;
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
import kb.i;
import kb.j;
import ne.j2;
import ne.k2;
import ne.m1;
import ne.q1;
import ne.y1;
import oc.v0;
import od.j1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import ud.d1;
import ud.e2;
import ud.f2;
import ud.u1;
import ud.v4;
import ud.x2;
import zd.hj;

public class hj extends Handler {
    public final o6 f27643a;
    public j2 f27644b;
    public List<Runnable> f27645c;

    public class a extends kb.b {
        public final TdApi.Chat[] M;
        public final v4 N;
        public final TdApi.Error[] O;

        public a(TdApi.Chat[] chatArr, v4 v4Var, TdApi.Error[] errorArr) {
            this.M = chatArr;
            this.N = v4Var;
            this.O = errorArr;
        }

        @Override
        public void b() {
            TdApi.Chat[] chatArr = this.M;
            if (chatArr[0] != null) {
                hj.this.C4(this.N, chatArr[0], null);
                return;
            }
            TdApi.Error[] errorArr = this.O;
            if (errorArr[0] != null) {
                j0.t0(errorArr[0]);
            }
        }
    }

    public class b implements o4.j {
        public final long f27646a;

        public b(long j10) {
            this.f27646a = j10;
        }

        @Override
        public int a() {
            return R.string.BotInvite;
        }

        @Override
        public void b(j jVar) {
            s4.c(this, jVar);
        }

        @Override
        public Object c() {
            return s4.a(this);
        }

        @Override
        public boolean d(TdApi.Chat chat, Runnable runnable) {
            if (!hj.this.f27643a.A2(chat)) {
                j0.y0(R.string.YouCantInviteMembers, 0);
                return false;
            }
            if (chat.type.getConstructor() == 1579049844) {
                hj.this.f27643a.v4().o(new TdApi.AddChatMember(chat.f19908id, this.f27646a, 0), hj.this.f27643a.na());
            } else if (chat.type.getConstructor() != -1472570774) {
                return false;
            } else {
                hj.this.f27643a.v4().o(new TdApi.AddChatMembers(chat.f19908id, new long[]{this.f27646a}), hj.this.f27643a.na());
            }
            return true;
        }
    }

    public class c implements o4.j {
        public final boolean f27648a;
        public final w2 f27649b;

        public c(boolean z10, w2 w2Var) {
            this.f27648a = z10;
            this.f27649b = w2Var;
        }

        public void f(Runnable runnable, TdApi.Object object) {
            if (object.getConstructor() != 1829953909 || !t2.h3(((TdApi.ChatMember) object).status)) {
                j0.y0(R.string.YouCantInviteMembers, 0);
            } else {
                hj.this.f27643a.hd().post(runnable);
            }
        }

        @Override
        public int a() {
            return this.f27648a ? R.string.GameInvite : R.string.BotInvite;
        }

        @Override
        public void b(j jVar) {
            s4.c(this, jVar);
        }

        @Override
        public Object c() {
            return this.f27649b;
        }

        @Override
        public boolean d(TdApi.Chat chat, final Runnable runnable) {
            if (!hj.this.f27643a.y6(chat)) {
                j0.y0(R.string.YouCantSendMessages, 0);
                return false;
            } else if (this.f27648a || hj.this.f27643a.A2(chat)) {
                return true;
            } else {
                hj.this.f27643a.v4().o(new TdApi.GetChatMember(chat.f19908id, new TdApi.MessageSenderUser(this.f27649b.b())), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        hj.c.this.f(runnable, object);
                    }
                });
                return false;
            }
        }
    }

    public class d extends kb.b {
        public final AtomicBoolean M;
        public final Uri N;
        public final d9 O;
        public final q P;
        public final int Q;
        public final AtomicReference R;
        public final boolean S;
        public final String T;

        public d(AtomicBoolean atomicBoolean, Uri uri, d9 d9Var, q qVar, int i10, AtomicReference atomicReference, boolean z10, String str) {
            this.M = atomicBoolean;
            this.N = uri;
            this.O = d9Var;
            this.P = qVar;
            this.Q = i10;
            this.R = atomicReference;
            this.S = z10;
            this.T = str;
        }

        @Override
        public void b() {
            List<String> pathSegments;
            if (!this.M.getAndSet(true)) {
                if (hj.this.f27643a.a7(this.N.getHost(), false) && (pathSegments = this.N.getPathSegments()) != null && pathSegments.size() == 1 && "iv".equals(pathSegments.get(0))) {
                    String queryParameter = this.N.getQueryParameter("url");
                    if (c0.Q(queryParameter)) {
                        hj.this.E7(this.O, queryParameter, new q(this.P).e());
                        return;
                    }
                }
                if (this.Q == 0) {
                    TdApi.WebPage webPage = (TdApi.WebPage) this.R.get();
                    d9 d9Var = this.O;
                    if ((d9Var instanceof v4) && webPage != null && bd.c.P1((v4) d9Var, webPage, this.S)) {
                        return;
                    }
                }
                j0.c0(this.T);
            }
        }
    }

    public class e implements m1.e {
        public final long M;
        public final p7 N;
        public final Runnable f27651a;
        public final v4 f27652b;
        public final TdApi.ChatList f27653c;

        public e(Runnable runnable, v4 v4Var, TdApi.ChatList chatList, long j10, p7 p7Var) {
            this.f27651a = runnable;
            this.f27652b = v4Var;
            this.f27653c = chatList;
            this.M = j10;
            this.N = p7Var;
        }

        @Override
        public void a7(m1.f fVar, int i10, Object obj) {
        }

        @Override
        public void t2(m1.f fVar, int i10, Object obj) {
            if (i10 == R.id.btn_selectChat) {
                this.f27651a.run();
            } else {
                hj.this.K7(this.f27652b, this.f27653c, this.M, this.N, i10, null);
            }
        }
    }

    public class f implements v4.l {
        public final int f27654a;
        public final Runnable f27655b;

        public f(int i10, Runnable runnable) {
            this.f27654a = i10;
            this.f27655b = runnable;
        }

        @Override
        public void a(v4<?> v4Var, boolean z10) {
            if (z10) {
                v4Var.od(this);
                hj.this.F8(v4Var, this.f27654a, this.f27655b);
            }
        }
    }

    public class g implements o4.j {
        public final String f27657a;
        public final String f27658b;
        public final boolean f27659c;

        public g(String str, String str2, boolean z10) {
            this.f27657a = str;
            this.f27658b = str2;
            this.f27659c = z10;
        }

        @Override
        public int a() {
            return s4.b(this);
        }

        @Override
        public void b(j jVar) {
            if (this.f27659c) {
                jVar.h();
            }
        }

        @Override
        public Object c() {
            return new c7(this.f27657a, this.f27658b);
        }

        @Override
        public boolean d(TdApi.Chat chat, Runnable runnable) {
            if (hj.this.f27643a.y6(chat)) {
                return true;
            }
            j0.y0(R.string.YouCantSendMessages, 0);
            return false;
        }
    }

    public class h implements yo.b {
        public final CharSequence f27661a;
        public final TdApi.Function f27662b;
        public final kb.j f27663c;

        public h(CharSequence charSequence, TdApi.Function function, kb.j jVar) {
            this.f27661a = charSequence;
            this.f27662b = function;
            this.f27663c = jVar;
        }

        @Override
        public int a() {
            return R.string.ReportReasonDescription;
        }

        @Override
        public CharSequence b() {
            return this.f27661a;
        }

        @Override
        public void c(String str, kb.i iVar) {
            if (ib.i.i(str)) {
                iVar.a(false);
                return;
            }
            int constructor = this.f27662b.getConstructor();
            if (constructor == -964543587) {
                ((TdApi.ReportChat) this.f27662b).text = str;
            } else if (constructor == 734652708) {
                ((TdApi.ReportChatPhoto) this.f27662b).text = str;
            }
            iVar.a(true);
            this.f27663c.a(this.f27662b);
        }
    }

    public class i implements h0 {
        public final String f27664a;
        public final boolean f27665b;
        public final TdApi.BankCardInfo f27666c;

        public i(String str, boolean z10, TdApi.BankCardInfo bankCardInfo) {
            this.f27664a = str;
            this.f27665b = z10;
            this.f27666c = bankCardInfo;
        }

        @Override
        public boolean P() {
            return g0.a(this);
        }

        @Override
        public Object a2(int i10) {
            if (this.f27665b) {
                return this.f27666c.actions[i10].url;
            }
            return null;
        }

        @Override
        public boolean r3(View view, int i10) {
            if (i10 == R.id.btn_openLink) {
                v.E((String) view.getTag());
                return true;
            } else if (i10 != R.id.btn_copyLink) {
                return true;
            } else {
                j0.i(this.f27664a, R.string.CopiedBankCard);
                return true;
            }
        }
    }

    public static class j {
        public int f27667a;
        public kb.l f27668b;
        public Runnable f27669c;
        public Object f27670d;
        public boolean f27671e;
        public int f27672f;
        public ob.d f27673g;
        public q f27674h;
        public TdApi.ChatList f27675i;
        public String f27676j;
        public TdApi.ChatInviteLinkInfo f27677k;
        public p7 f27678l;
        public TdApi.SearchMessagesFilter f27679m;
        public TdApi.InternalLinkTypeVideoChat f27680n;

        public static void a(j jVar) {
            jVar.k();
        }

        public static j o(Bundle bundle, String str) {
            j jVar = new j();
            jVar.f27667a = bundle.getInt(str + "cp_options", 0);
            jVar.f27671e = bundle.getBoolean(str + "cp_highlightSet", false);
            jVar.f27672f = bundle.getInt(str + "cp_highlightMode", 0);
            jVar.f27673g = t2.W4(bundle, str + "cp_highlightMessageId");
            jVar.f27675i = t2.W(bundle.getString(str + "cp_chatList", null));
            jVar.f27678l = p7.l(bundle, str + "cp_messageThread");
            jVar.f27679m = t2.V4(bundle, str + "cp_filter");
            return jVar;
        }

        public j b(kb.l lVar) {
            this.f27668b = lVar;
            return this;
        }

        public j c() {
            this.f27667a |= 8;
            return this;
        }

        public j d(int i10, ob.d dVar) {
            this.f27671e = true;
            this.f27672f = i10;
            this.f27673g = dVar;
            return this;
        }

        public j e(ob.d dVar) {
            this.f27671e = true;
            this.f27672f = 1;
            this.f27673g = dVar;
            return this;
        }

        public j f(TdApi.Message message) {
            return e(new ob.d(message.chatId, message.f19946id));
        }

        public j g(String str, TdApi.ChatInviteLinkInfo chatInviteLinkInfo) {
            this.f27676j = str;
            this.f27677k = chatInviteLinkInfo;
            return this;
        }

        public j h() {
            this.f27667a |= 1;
            return this;
        }

        public j i() {
            this.f27667a |= 2;
            return this;
        }

        public j j(Runnable runnable) {
            this.f27669c = runnable;
            return this;
        }

        public final void k() {
            Runnable runnable = this.f27669c;
            if (runnable != null) {
                runnable.run();
                this.f27669c = null;
            }
        }

        public j l() {
            this.f27667a |= 4;
            return this;
        }

        public j m() {
            this.f27667a |= 16;
            return this;
        }

        public j n() {
            this.f27667a |= 32;
            return this;
        }

        public boolean p(Bundle bundle, String str) {
            if (this.f27668b != null || this.f27669c != null || this.f27670d != null) {
                return false;
            }
            if (this.f27667a != 0) {
                bundle.putInt(str + "cp_options", this.f27667a);
            }
            if (this.f27671e) {
                bundle.putBoolean(str + "cp_highlightSet", this.f27671e);
            }
            if (this.f27672f != 0) {
                bundle.putInt(str + "cp_highlightMode", this.f27672f);
            }
            if (this.f27673g != null) {
                t2.b5(bundle, str + "cp_highlightMessageId", this.f27673g);
            }
            if (this.f27675i != null) {
                bundle.putString(str + "cp_chatList", t2.o4(this.f27675i));
            }
            p7 p7Var = this.f27678l;
            if (p7Var != null) {
                p7Var.m(bundle, str + "cp_messageThread");
            }
            if (this.f27679m == null) {
                return true;
            }
            t2.a5(bundle, str + "cp_filter", this.f27679m);
            return true;
        }

        public j q() {
            this.f27667a |= 64;
            return this;
        }

        public j r(Object obj) {
            this.f27670d = obj;
            return this;
        }

        public j s(q qVar) {
            this.f27674h = qVar;
            return this;
        }

        public j t(TdApi.InternalLinkTypeVideoChat internalLinkTypeVideoChat) {
            this.f27680n = internalLinkTypeVideoChat;
            return this;
        }
    }

    public static class k {
        public String[][] f27681a;
        public final Map<String, TdApi.LanguagePackStringValue> f27682b = new HashMap();
        public int f27683c;
        public final String f27684d;
        public String f27685e;

        public k(TdApi.Document document) {
            this.f27684d = document.fileName;
        }

        public boolean a() {
            return !this.f27682b.isEmpty() && this.f27683c < this.f27682b.size() && k();
        }

        public int b() {
            String[][] strArr = this.f27681a;
            return strArr[0].length + strArr[1].length;
        }

        public int c() {
            return (int) Math.floor((j() / b()) * 100.0f);
        }

        public String d() {
            String h10 = h(R.string.language_code);
            return "X" + h10;
        }

        public String e() {
            String h10 = h(R.string.language_nameInEnglish);
            if (ib.i.i(this.f27684d)) {
                return h10;
            }
            StringBuilder sb2 = new StringBuilder(h10);
            sb2.append(" [");
            if (this.f27684d.endsWith(".xml")) {
                String str = this.f27684d;
                sb2.append((CharSequence) str, 0, str.length() - 4);
            } else {
                sb2.append(this.f27684d);
            }
            sb2.append("]");
            return sb2.toString();
        }

        public int f() {
            String[] strArr;
            String[] strArr2;
            int b10 = b() - j();
            if (b10 > 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.f27681a[0]) {
                    if (this.f27682b.get(str) == null) {
                        arrayList.add(str);
                    }
                }
                for (String str2 : this.f27681a[1]) {
                    if (this.f27682b.get(str2) == null) {
                        arrayList.add(str2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Log.e("Language pack %s misses following strings: %s", this.f27684d, TextUtils.join(", ", arrayList));
                }
            }
            return b10;
        }

        public TdApi.LanguagePackStringValue g(int i10) {
            return this.f27682b.get(w.e1(i10));
        }

        public String h(int i10) {
            TdApi.LanguagePackStringValue languagePackStringValue = this.f27682b.get(w.e1(i10));
            if (languagePackStringValue instanceof TdApi.LanguagePackStringValueOrdinary) {
                return ((TdApi.LanguagePackStringValueOrdinary) languagePackStringValue).value;
            }
            return null;
        }

        public TdApi.LanguagePackString[] i() {
            TdApi.LanguagePackString[] languagePackStringArr = new TdApi.LanguagePackString[this.f27682b.size()];
            int i10 = 0;
            for (Map.Entry<String, TdApi.LanguagePackStringValue> entry : this.f27682b.entrySet()) {
                i10++;
                languagePackStringArr[i10] = new TdApi.LanguagePackString(entry.getKey(), entry.getValue());
            }
            return languagePackStringArr;
        }

        public int j() {
            return this.f27682b.size() - this.f27683c;
        }

        public boolean k() {
            int[] d12;
            boolean z10 = true;
            for (int i10 : w.d1()) {
                TdApi.LanguagePackStringValue g10 = g(i10);
                if (!(g10 instanceof TdApi.LanguagePackStringValueOrdinary)) {
                    Log.e("Language Pack is missing required string: %s", w.e1(i10));
                } else {
                    TdApi.LanguagePackStringValueOrdinary languagePackStringValueOrdinary = (TdApi.LanguagePackStringValueOrdinary) g10;
                    if (ib.i.i(languagePackStringValueOrdinary.value.trim())) {
                        Log.e("Language Pack required string is empty: %s", w.e1(i10));
                    } else {
                        if (i10 == R.string.language_code && languagePackStringValueOrdinary.value.charAt(0) == 'X') {
                            Log.e("Language Pack language_code starts with 'X': %s", languagePackStringValueOrdinary.value);
                        }
                    }
                }
                z10 = false;
            }
            return z10;
        }

        public boolean l() {
            return j() == b();
        }

        public void m() {
            this.f27681a = y.a();
        }

        public k n(String str) {
            this.f27685e = str;
            return this;
        }
    }

    public interface l {
        void a();

        void b();
    }

    public interface n {
        void a(TdApi.Object object);

        void b(String str);
    }

    public interface o {
        void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11);
    }

    public static class p {
        public final int f27699a;
        public final String f27700b;

        public p(int i10, String str) {
            this.f27699a = i10;
            this.f27700b = str;
        }

        public int b() {
            return this.f27699a;
        }

        public String toString() {
            return this.f27700b;
        }
    }

    public hj(o6 o6Var) {
        super(Looper.getMainLooper());
        this.f27643a = o6Var;
    }

    public static void A4(d9 d9Var, TdApi.Chat chat, j jVar) {
        E8(d9Var.c(), R.drawable.baseline_warning_24, w.i1(t2.N2(chat.type) ? R.string.PostNotFound : R.string.MessageNotFound), jVar.f27674h);
        jVar.k();
    }

    public static Object A5(m mVar, CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        return i12 == 1 ? new ie.o(null, R.id.theme_color_textLink).j(new TdApi.TextEntityTypeMention()).m(mVar) : w.d2(z10);
    }

    public static Object A6(v4 v4Var, TdApi.ChatInviteLink chatInviteLink, CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 == 0) {
            return w.h2(new y8(v4Var.t(), v4Var.c()), chatInviteLink.creatorUserId);
        }
        return null;
    }

    public void B3(TdApi.Object object, d9 d9Var) {
        TdApi.InternalLinkTypeProxy internalLinkTypeProxy = (TdApi.InternalLinkTypeProxy) object;
        String str = internalLinkTypeProxy.server;
        int i10 = internalLinkTypeProxy.port;
        w7(d9Var, str, i10, internalLinkTypeProxy.type, c7(str, Integer.toString(i10)).toString());
    }

    public void B4(final zd.d9 r6, final org.drinkless.td.libcore.telegram.TdApi.Chat r7, final zd.hj.j r8, org.drinkless.td.libcore.telegram.TdApi.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: zd.hj.B4(zd.d9, org.drinkless.td.libcore.telegram.TdApi$Chat, zd.hj$j, org.drinkless.td.libcore.telegram.TdApi$Object):void");
    }

    public static void B5(v4 v4Var, m mVar) {
        v4Var.c().hd().y3(v4Var, mVar);
    }

    public static Object B6(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 == 0) {
            return w.d2(z10);
        }
        return null;
    }

    public void C3(final d9 d9Var, final TdApi.Object object) {
        if (object.getConstructor() == -1313788694) {
            post(new Runnable() {
                @Override
                public final void run() {
                    hj.this.B3(object, d9Var);
                }
            });
        }
    }

    public boolean C5(final m mVar, final v4 v4Var, Runnable runnable, View view, int i10) {
        if (i10 == R.id.btn_done) {
            this.f27643a.Ue().r(mVar.f27689d, 1000L, new Runnable() {
                @Override
                public final void run() {
                    hj.B5(v4.this, mVar);
                }
            });
            return true;
        } else if (i10 != R.id.btn_open) {
            return true;
        } else {
            v0.D2(runnable);
            return true;
        }
    }

    public static boolean C6(Runnable runnable, v4 v4Var, long j10, TdApi.ChatInviteLink chatInviteLink, View view, int i10) {
        if (i10 != R.id.btn_deleteLink) {
            return true;
        }
        if (runnable != null) {
            runnable.run();
        }
        v4Var.c().v4().o(new TdApi.DeleteRevokedChatInviteLink(j10, chatInviteLink.inviteLink), null);
        return true;
    }

    public void D3(final d9 d9Var, String str) {
        d9Var.c().v4().o(new TdApi.GetInternalLinkType(str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.this.C3(d9Var, object);
            }
        });
    }

    public static void D4(rh rhVar) {
        v4<?> se = rhVar.se(rhVar.te() - 2);
        if ((se instanceof ii) && se.C9() == rhVar.C9()) {
            rhVar.b9(rhVar.te() - 2);
        }
    }

    public void D5(final m mVar, final Runnable runnable, final v4 v4Var) {
        CharSequence charSequence;
        int i10 = 2;
        if (mVar.f27688c != null) {
            w.f ohVar = new w.f() {
                @Override
                public final Object a(CharSequence charSequence2, int i11, int i12, int i13, boolean z10) {
                    Object A5;
                    A5 = hj.A5(hj.m.this, charSequence2, i11, i12, i13, z10);
                    return A5;
                }
            };
            charSequence = w.h1(R.string.ThemeInstallAuthor, ohVar, mVar.f27686a, "@" + mVar.f27688c);
        } else {
            charSequence = w.m1(R.string.ThemeInstall, mVar.f27686a);
        }
        CharSequence charSequence2 = charSequence;
        if (runnable != null) {
            i10 = 3;
        }
        jb.c cVar = new jb.c(i10);
        jb.c cVar2 = new jb.c(i10);
        jb.c cVar3 = new jb.c(i10);
        u0 u0Var = new u0(i10);
        cVar.a(R.id.btn_done);
        cVar3.a(R.drawable.baseline_palette_24);
        cVar2.a(3);
        u0Var.a(R.string.ThemeInstallDone);
        if (runnable != null) {
            cVar.a(R.id.btn_open);
            cVar3.a(R.drawable.baseline_open_in_browser_24);
            cVar2.a(1);
            u0Var.a(R.string.Open);
        }
        cVar.a(R.id.btn_cancel);
        cVar3.a(R.drawable.baseline_cancel_24);
        cVar2.a(1);
        u0Var.a(R.string.Cancel);
        if (charSequence2 != null) {
            SpannableStringBuilder spannableStringBuilder = charSequence2 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence2 : new SpannableStringBuilder(charSequence2);
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) w.i1(R.string.ThemeInstallHint));
        }
        v4Var.fe(charSequence2, cVar.e(), u0Var.d(), cVar2.e(), cVar3.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i11) {
                return g0.b(this, i11);
            }

            @Override
            public final boolean r3(View view, int i11) {
                boolean C5;
                C5 = hj.this.C5(mVar, v4Var, runnable, view, i11);
                return C5;
            }
        }, mVar);
    }

    public static void D6(kb.j jVar, TdApi.Object object) {
        jVar.a((TdApi.ChatInviteLinks) object);
    }

    public void E3(v4 v4Var, final d9 d9Var) {
        v4Var.Nc(new v4.k().c(true).e(true).a(false).f(true).i(R.string.ScanQRFullSubtitleProxy).d(2).g(new k.f() {
            @Override
            public final void q3(String str) {
                hj.this.D3(d9Var, str);
            }
        }));
    }

    public static void E4(rh rhVar, boolean z10) {
        if (z10) {
            rhVar.eq();
        }
    }

    public void E5(org.drinkless.td.libcore.telegram.TdApi.File r21, final kb.j r22, final java.lang.Runnable r23, final ud.v4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: zd.hj.E5(org.drinkless.td.libcore.telegram.TdApi$File, kb.j, java.lang.Runnable, ud.v4):void");
    }

    public static void E6(final kb.j jVar, v4 v4Var, final TdApi.Object object) {
        if (object.getConstructor() == 112891427 && jVar != null) {
            v4Var.wd(new Runnable() {
                @Override
                public final void run() {
                    hj.D6(j.this, object);
                }
            });
        }
    }

    public static void E8(final o6 o6Var, final int i10, final CharSequence charSequence, final q qVar) {
        x2.h hVar;
        if (charSequence == null) {
            throw new IllegalArgumentException();
        } else if (!j0.K()) {
            o6Var.hd().post(new Runnable() {
                @Override
                public final void run() {
                    hj.E8(o6.this, i10, charSequence, qVar);
                }
            });
        } else if (qVar == null || (hVar = qVar.f27707g) == null || !hVar.p()) {
            j0.z0(charSequence, 0);
        } else if (i10 == 0) {
            qVar.f27707g.D(o6Var, charSequence).G(3500L, TimeUnit.MILLISECONDS);
        } else {
            new x2.h(qVar.f27707g).q(i10).D(o6Var, charSequence).G(3500L, TimeUnit.MILLISECONDS);
        }
    }

    public boolean F3(final d9 d9Var, final v4 v4Var, View view, int i10) {
        switch (i10) {
            case R.id.btn_proxyHttp:
                e7 e7Var = new e7(d9Var.t(), d9Var.c());
                e7Var.Ad(new e7.d(3));
                v4Var.ac(e7Var);
                break;
            case R.id.btn_proxyQr:
                postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        hj.this.E3(v4Var, d9Var);
                    }
                }, 250L);
                break;
            case R.id.btn_proxySocks5:
                e7 e7Var2 = new e7(d9Var.t(), d9Var.c());
                e7Var2.Ad(new e7.d(1));
                v4Var.ac(e7Var2);
                break;
            case R.id.btn_proxyTelegram:
                e7 e7Var3 = new e7(d9Var.t(), d9Var.c());
                e7Var3.Ad(new e7.d(2));
                v4Var.ac(e7Var3);
                break;
        }
        return true;
    }

    public static void F4(kb.l lVar, TdApi.Chat chat, d9 d9Var, final rh rhVar) {
        if (lVar != null) {
            lVar.a(chat.f19908id);
        }
        d9Var.c().F4().e0(d9Var.c().A6(), 3, new kb.i() {
            @Override
            public final void a(boolean z10) {
                hj.E4(rh.this, z10);
            }
        });
    }

    public static boolean F5(w6 w6Var, View view, int i10) {
        if (i10 != R.id.btn_removeAccount) {
            return true;
        }
        w6Var.c().xc();
        return true;
    }

    public static boolean F6(final v4 v4Var, long j10, TdApi.ChatInviteLink chatInviteLink, final kb.j jVar, View view, int i10) {
        if (i10 != R.id.btn_revokeLink) {
            return true;
        }
        v4Var.c().v4().o(new TdApi.RevokeChatInviteLink(j10, chatInviteLink.inviteLink), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.E6(j.this, v4Var, object);
            }
        });
        return true;
    }

    public static void G5(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            j0.y0(R.string.ReportChatSent, 0);
        }
    }

    public boolean G6(final v4 v4Var, final long j10, final TdApi.ChatInviteLink chatInviteLink, final Runnable runnable, final kb.j jVar, View view, int i10) {
        switch (i10) {
            case R.id.btn_copyLink:
                j0.i(chatInviteLink.inviteLink, R.string.CopiedLink);
                break;
            case R.id.btn_deleteLink:
                v4Var.ee(w.i1(R.string.AreYouSureDeleteInviteLink), new int[]{R.id.btn_deleteLink, R.id.btn_cancel}, new String[]{w.i1(R.string.InviteLinkDelete), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
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
                        boolean C6;
                        C6 = hj.C6(runnable, v4Var, j10, chatInviteLink, view2, i11);
                        return C6;
                    }
                });
                break;
            case R.id.btn_edit:
                s6 s6Var = new s6(v4Var.t(), v4Var.c());
                s6Var.Qf(new s6.c(chatInviteLink, j10, (p0) v4Var));
                v4Var.ac(s6Var);
                break;
            case R.id.btn_manageInviteLinks:
                p0 p0Var = new p0(v4Var.t(), v4Var.c());
                p0Var.Hh(new p0.d(j10, v4Var.c().fa(), null, null, this.f27643a.O3(j10).getConstructor() == -160019714));
                v4Var.ac(p0Var);
                break;
            case R.id.btn_manageJoinRequests:
                s sVar = new s(v4Var.t(), v4Var.c());
                sVar.Cg(new s.a(j10, chatInviteLink.inviteLink, v4Var));
                v4Var.ac(sVar);
                break;
            case R.id.btn_revokeLink:
                v4Var.ee(w.i1(v4Var.c().O6(j10) ? R.string.AreYouSureRevokeInviteLinkChannel : R.string.AreYouSureRevokeInviteLinkGroup), new int[]{R.id.btn_revokeLink, R.id.btn_cancel}, new String[]{w.i1(R.string.RevokeLink), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_link_off_24, R.drawable.baseline_cancel_24}, new h0() {
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
                        boolean F6;
                        F6 = hj.F6(v4.this, j10, chatInviteLink, jVar, view2, i11);
                        return F6;
                    }
                });
                break;
            case R.id.btn_shareLink:
                String U3 = v4Var.c().U3(j10);
                String j12 = w.j1(v4Var.c().O6(j10) ? R.string.ShareTextChannelLink : R.string.ShareTextChatLink, U3, chatInviteLink.inviteLink);
                String j13 = w.j1(R.string.ShareTextLink, U3, chatInviteLink.inviteLink);
                y00 y00Var = new y00(v4Var.t(), v4Var.c());
                y00Var.Vi(new y00.m(j13).E(j12, null));
                y00Var.ej();
                break;
            case R.id.btn_viewInviteLinkMembers:
                v4<?> a0Var = new a0(v4Var.t(), v4Var.c());
                a0Var.Ad(new a0.c(j10, chatInviteLink.inviteLink));
                v4Var.ac(a0Var);
                break;
        }
        return true;
    }

    public void H4(d9 d9Var, p7 p7Var, q qVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -1601123095) {
            G4(d9Var, this.f27643a.ma(object), p7Var, qVar);
        } else if (constructor == -537797015) {
            long j10 = ((TdApi.User) object).f19979id;
            k7(d9Var, ob.a.c(j10), p7Var, new TdApi.CreatePrivateChat(j10, false), qVar);
        }
    }

    public static void H5(Runnable runnable, o6 o6Var, TdApi.ReportChat reportChat) {
        if (runnable != null) {
            runnable.run();
        }
        o6Var.v4().o(reportChat, bf.f27297a);
    }

    public void H6(TdApi.Object object, v4 v4Var, long j10, boolean z10, Runnable runnable, kb.j jVar, TdApi.ChatInviteLink chatInviteLink) {
        if (object.getConstructor() == -205812476) {
            A8(v4Var, (TdApi.ChatInviteLink) object, j10, z10, false, runnable, jVar);
        } else {
            A8(v4Var, chatInviteLink, j10, z10, true, runnable, jVar);
        }
    }

    public static boolean I2(TdApi.Document document) {
        return ((!ib.i.i(document.fileName) && document.fileName.endsWith(".xml")) || (!ib.i.i(document.mimeType) && document.mimeType.equals("application/xml"))) && ((long) document.document.size) <= mb.p.f17347c.b(1.0d) && t2.V2(document.document);
    }

    public static void I3(boolean z10) {
        if (z10) {
            j0.y0(R.string.LocalisationApplied, 0);
        }
    }

    public static Object I4(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 == 1) {
            return new ie.o(null, R.id.theme_color_textLink);
        }
        return w.d2(z10);
    }

    public static boolean I5(v4 v4Var, CharSequence charSequence, long j10, long[] jArr, final Runnable runnable, final o6 o6Var, View view, int i10) {
        W8(v4Var, i10, charSequence, new TdApi.ReportChat(j10, jArr, null, null), false, new kb.j() {
            @Override
            public final void a(Object obj) {
                hj.H5(runnable, o6Var, (TdApi.ReportChat) obj);
            }
        });
        return true;
    }

    public void I6(final v4 v4Var, final long j10, final boolean z10, final Runnable runnable, final kb.j jVar, final TdApi.ChatInviteLink chatInviteLink, final TdApi.Object object) {
        v4Var.wd(new Runnable() {
            @Override
            public final void run() {
                hj.this.H6(object, v4Var, j10, z10, runnable, jVar, chatInviteLink);
            }
        });
    }

    public static boolean J2(TdApi.Document document) {
        return document != null && !ib.i.i(document.fileName) && document.fileName.endsWith("tgx-theme") && t2.V2(document.document);
    }

    public static void J3(v4 v4Var, TdApi.LanguagePackInfo languagePackInfo, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            v4Var.c().M1(languagePackInfo, xc.f28678a, true);
        }
    }

    public static Object J4(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        return new ie.o(null, R.id.theme_color_textLink);
    }

    public static void J5(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            j0.y0(R.string.ReportChatSent, 0);
        }
    }

    public static boolean J6(v4 v4Var, d9 d9Var, View view, int i10) {
        if (i10 != R.id.btn_settings) {
            return true;
        }
        v4Var.ac(new fv(d9Var.t(), d9Var.c()));
        return true;
    }

    public void K3(d9 d9Var, String str, q qVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            E8(this.f27643a, R.drawable.baseline_error_24, t2.z5(object), qVar);
        } else if (constructor == 546234276) {
            TdApi.ChatInviteLinkInfo chatInviteLinkInfo = (TdApi.ChatInviteLinkInfo) object;
            this.f27643a.fd(chatInviteLinkInfo);
            int Z2 = this.f27643a.Z2(chatInviteLinkInfo.chatId);
            long j10 = chatInviteLinkInfo.chatId;
            if (j10 == 0 || Z2 == -3) {
                P4(d9Var, str, chatInviteLinkInfo, qVar);
            } else {
                h7(d9Var, j10, new j().s(qVar).g(str, chatInviteLinkInfo).h().n());
            }
        }
    }

    public void K4(d9 d9Var, q qVar, String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        q qVar2 = null;
        if (constructor == -2018019930) {
            String str2 = ((TdApi.HttpUrl) object).url;
            if (qVar != null) {
                qVar2 = qVar.f();
            }
            l5(d9Var, str2, qVar2);
        } else if (constructor == -1679978726) {
            if (qVar != null) {
                qVar2 = qVar.f();
            }
            l5(d9Var, str, qVar2);
        }
    }

    public static void K5(Runnable runnable, o6 o6Var, TdApi.ReportChatPhoto reportChatPhoto) {
        if (runnable != null) {
            runnable.run();
        }
        o6Var.v4().o(reportChatPhoto, cf.f27360a);
    }

    public static void K6(boolean z10) {
        if (z10) {
            j0.y0(R.string.LanguageChangeSuccess, 0);
        }
    }

    public static void L2(final boolean z10, final kb.l lVar) {
        gd.l.a().b(new Runnable() {
            @Override
            public final void run() {
                hj.M3(z10, lVar);
            }
        });
    }

    public static void L3(String str, kb.l lVar, boolean z10) {
        if (!ib.i.i(str)) {
            j0.z0(str, 0);
        }
        if (lVar != null) {
            lVar.a(new File(ya.H0(z10)).length());
        }
    }

    public void L4(List list, final d9 d9Var, final String str, final q qVar, int i10, SparseIntArray sparseIntArray) {
        boolean z10 = false;
        boolean D = ((ra) list.get(0)).D();
        if (list.size() > 1 && ((ra) list.get(1)).D()) {
            z10 = true;
        }
        if (D) {
            d9Var.c().v4().o(new TdApi.GetExternalLink(str, z10), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    hj.this.K4(d9Var, qVar, str, object);
                }
            });
        } else {
            l5(d9Var, str, qVar != null ? qVar.f() : null);
        }
    }

    public static boolean L5(v4 v4Var, CharSequence charSequence, long j10, int i10, final Runnable runnable, final o6 o6Var, View view, int i11) {
        W8(v4Var, i11, charSequence, new TdApi.ReportChatPhoto(j10, i10, null, null), false, new kb.j() {
            @Override
            public final void a(Object obj) {
                hj.K5(runnable, o6Var, (TdApi.ReportChatPhoto) obj);
            }
        });
        return true;
    }

    public static void L6(d9 d9Var, TdApi.LanguagePackInfo languagePackInfo, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            d9Var.c().M1(languagePackInfo, wc.f28642a, true);
        }
    }

    public static void M3(final boolean z10, final kb.l lVar) {
        final String str;
        try {
            long n02 = ya.n0(z10);
            if (n02 == -1) {
                str = w.i1(R.string.TdlibLogClearFail);
            } else {
                str = n02 == 0 ? w.i1(R.string.TdlibLogClearEmpty) : w.j1(R.string.TdlibLogClearOk, c0.m(n02));
            }
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    hj.L3(str, lVar, z10);
                }
            });
        } catch (Throwable th) {
            Log.w("Cannot work with TG log", th, new Object[0]);
        }
    }

    public static void M4(ra raVar, uc.c cVar, boolean z10) {
        int A = raVar.A();
        if (A == 12 || A == 69 || A == 99) {
            ((ne.w) cVar.getChildAt(0)).e(raVar.D(), z10);
        }
    }

    public static void M5(AtomicInteger atomicInteger, long[] jArr, Runnable runnable, o6 o6Var, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727 && atomicInteger.decrementAndGet() == 0) {
            j0.z0(w.o2(R.string.ReportedXChats, jArr.length), 0);
            if (runnable != null) {
                o6Var.hd().post(runnable);
            }
        }
    }

    public static boolean M6(final d9 d9Var, final TdApi.LanguagePackInfo languagePackInfo, View view, int i10) {
        if (i10 != R.id.btn_done) {
            return true;
        }
        d9Var.c().v4().o(new TdApi.AddCustomServerLanguagePack(languagePackInfo.f19945id), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.L6(d9.this, languagePackInfo, object);
            }
        });
        return true;
    }

    public List N3(kb.f fVar, long j10, kb.f fVar2, kb.j jVar, View view) {
        if (fVar != null && !fVar.get()) {
            return null;
        }
        List<c0.a> X2 = X2(j10, false, fVar2 != null && fVar2.get(), true);
        if (jVar != null) {
            if (X2 == null) {
                X2 = new ArrayList<>();
            }
            jVar.a(X2);
        }
        return X2;
    }

    public static void N4(List list, View view, int i10, ra raVar, TextView textView, iq iqVar) {
        int j10 = raVar.j();
        if (j10 == R.id.btn_allowWriteAccess) {
            if (iqVar.y0().get(R.id.btn_allowWriteAccess) == R.id.btn_allowWriteAccess) {
                ((ra) list.get(0)).S(true);
                iqVar.p3(R.id.btn_signIn);
            }
        } else if (j10 == R.id.btn_signIn) {
            if (!(iqVar.y0().get(R.id.btn_signIn) == R.id.btn_signIn)) {
                ((ra) list.get(1)).S(false);
                iqVar.p3(R.id.btn_allowWriteAccess);
            }
        }
    }

    public static void N5(final long[] jArr, final o6 o6Var, final Runnable runnable, TdApi.ReportChat reportChat) {
        final AtomicInteger atomicInteger = new AtomicInteger(jArr.length);
        for (long j10 : jArr) {
            o6Var.v4().o(new TdApi.ReportChat(j10, null, reportChat.reason, reportChat.text), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    hj.M5(atomicInteger, jArr, runnable, o6Var, object);
                }
            });
        }
    }

    public boolean N6(v4 v4Var, k kVar, View view, int i10) {
        if (i10 != R.id.btn_messageApplyLocalization) {
            return true;
        }
        H2(v4Var, kVar);
        return true;
    }

    public void O4(final q qVar, final String str, final d9 d9Var, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            l5(d9Var, str, qVar);
        } else if (constructor == -1079045420) {
            TdApi.LoginUrlInfoOpen loginUrlInfoOpen = (TdApi.LoginUrlInfoOpen) object;
            if (qVar != null) {
                if (loginUrlInfoOpen.skipConfirm) {
                    qVar.f();
                }
                qVar.g(str);
            }
            l5(d9Var, loginUrlInfoOpen.url, qVar);
        } else if (constructor == 2128290863) {
            TdApi.LoginUrlInfoRequestConfirmation loginUrlInfoRequestConfirmation = (TdApi.LoginUrlInfoRequestConfirmation) object;
            final ArrayList arrayList = new ArrayList();
            arrayList.add(new ra(99, (int) R.id.btn_signIn, 0, w.h1(R.string.LogInAsOn, zh.f28821a, d9Var.c().E1(), loginUrlInfoRequestConfirmation.domain), true));
            if (loginUrlInfoRequestConfirmation.requestWriteAccess) {
                arrayList.add(new ra(99, (int) R.id.btn_allowWriteAccess, 0, w.h1(R.string.AllowWriteAccess, w.p(), d9Var.c().e2().J2(loginUrlInfoRequestConfirmation.botUserId)), true));
            }
            v4<?> F = d9Var instanceof v4 ? (v4) d9Var : d9Var.t().Q1().F();
            if (F != null && !F.Sa()) {
                F.me(new f2(R.id.btn_open).b(w.h1(R.string.OpenLinkConfirm, ki.f27892a, loginUrlInfoRequestConfirmation.url)).o(arrayList).j(new v4.r() {
                    @Override
                    public final void l6(int i10, SparseIntArray sparseIntArray) {
                        hj.this.L4(arrayList, d9Var, str, qVar, i10, sparseIntArray);
                    }
                }).t(ef.f27474a).n(loginUrlInfoRequestConfirmation.requestWriteAccess ? new v4.n() {
                    @Override
                    public final void a(View view, int i10, ra raVar, TextView textView, iq iqVar) {
                        hj.N4(arrayList, view, i10, raVar, textView, iqVar);
                    }
                } : null).r(R.string.Open).o(arrayList));
            }
        }
    }

    public static boolean O5(v4 v4Var, CharSequence charSequence, final long[] jArr, final o6 o6Var, final Runnable runnable, View view, int i10) {
        W8(v4Var, i10, charSequence, new TdApi.ReportChat(), false, new kb.j() {
            @Override
            public final void a(Object obj) {
                hj.N5(jArr, o6Var, runnable, (TdApi.ReportChat) obj);
            }
        });
        return true;
    }

    public static void O8(Context context, int i10, boolean z10, boolean z11, int i11, final kb.j<p> jVar) {
        ArrayList arrayList = new ArrayList(21);
        int i12 = 0;
        arrayList.add(new p(0, w.i1(R.string.Off)));
        int i13 = z11 ? 20 : 15;
        for (int i14 = 1; i14 <= i13; i14++) {
            arrayList.add(new p(i14, w.o2(R.string.xSeconds, i14)));
        }
        if (z11) {
            while (true) {
                i13 += 5;
                if (i13 >= 60) {
                    break;
                }
                arrayList.add(new p(i13, w.o2(R.string.xSeconds, i13)));
            }
            arrayList.add(new p(60, w.o2(R.string.xMinutes, 1L)));
        } else {
            arrayList.add(new p(30, w.o2(R.string.xSeconds, 30L)));
            arrayList.add(new p(60, w.o2(R.string.xMinutes, 1L)));
            arrayList.add(new p(3600, w.o2(R.string.xHours, 1L)));
            arrayList.add(new p(86400, w.o2(R.string.xDays, 1L)));
            arrayList.add(new p(604800, w.o2(R.string.xWeeks, 1L)));
        }
        Iterator it = arrayList.iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((p) it.next()).f27699a == i10) {
                i12 = i15;
                break;
            } else {
                i15++;
            }
        }
        final q1 q1Var = new q1(context, true);
        if (z10) {
            q1Var.N1();
        }
        q1Var.P1(arrayList, i12);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, z10 ? R.style.DialogThemeDark : ae.j.t());
        builder.setTitle(w.i1(R.string.MessageLifetime));
        if (i11 != 0) {
            builder.setMessage(w.i1(i11));
        }
        builder.setPositiveButton(w.i1(R.string.Done), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i16) {
                hj.V6(q1.this, jVar, dialogInterface, i16);
            }
        });
        builder.setView(q1Var);
        j0.r(context).y3(builder, z10 ? ae.c0.a(2) : null);
    }

    public void P3(v4 v4Var, final o oVar, long j10, ae.p pVar, View view, View view2) {
        switch (view.getId()) {
            case R.id.btn_sendNoMarkdown:
                oVar.a(false, null, true);
                return;
            case R.id.btn_sendNoSound:
                oVar.a(true, null, false);
                return;
            case R.id.btn_sendOnceOnline:
                oVar.a(false, new TdApi.MessageSchedulingStateSendWhenOnline(), false);
                return;
            case R.id.btn_sendScheduled:
                if (v4Var != null) {
                    this.f27643a.hd().J7(v4Var, new kb.j() {
                        @Override
                        public final void a(Object obj) {
                            hj.o.this.a(false, (TdApi.MessageSchedulingState) obj, false);
                        }
                    }, j10, false, false, pVar);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static boolean P5(n nVar, String str, View view, int i10) {
        if (i10 != R.id.btn_next) {
            return true;
        }
        nVar.b(str);
        return true;
    }

    public void P6(j2 j2Var) {
        if (this.f27644b != null) {
            this.f27644b = null;
            this.f27645c.clear();
            this.f27645c = null;
        }
    }

    public static void P7(org.xmlpull.v1.XmlPullParser r8, zd.hj.k r9) {
        throw new UnsupportedOperationException("Method not decompiled: zd.hj.P7(org.xmlpull.v1.XmlPullParser, zd.hj$k):void");
    }

    public boolean Q3(v4 v4Var, long j10, View view, int i10) {
        if (!v4Var.Sa() && i10 == R.id.btn_delete) {
            this.f27643a.v4().o(new TdApi.RemoveContacts(new long[]{j10}), this.f27643a.na());
        }
        return true;
    }

    public static void Q5(v4 v4Var, CharSequence charSequence, final n nVar, final String str) {
        v4Var.ge(new v4.p.a().c(ce.c0.H(w.i1(R.string.TransferOwnershipAlert), charSequence)).d(new v4.o(R.id.btn_next, w.i1(R.string.TransferOwnershipConfirm), 2, R.drawable.templarian_baseline_account_switch_24)).b().a(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean P5;
                P5 = hj.P5(hj.n.this, str, view, i10);
                return P5;
            }
        });
    }

    public void Q6(int i10, Runnable runnable, int i11, SparseIntArray sparseIntArray) {
        int i12;
        int i13 = sparseIntArray.get(R.id.btn_mapProvider);
        boolean z10 = true;
        switch (i13) {
            case R.id.btn_mapProviderGoogle:
                i12 = 2;
                break;
            case R.id.btn_mapProviderNone:
                i12 = 0;
                break;
            case R.id.btn_mapProviderTelegram:
                i12 = 1;
                break;
            default:
                return;
        }
        he.i c22 = he.i.c2();
        if (i10 != 2) {
            z10 = false;
        }
        c22.T4(i12, z10);
        if (i10 == 0 && this.f27644b != null) {
            List<Runnable> list = this.f27645c;
            this.f27644b = null;
            this.f27645c = null;
            for (Runnable runnable2 : list) {
                runnable2.run();
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public static void Q7(XmlPullParser xmlPullParser, k kVar) {
        xmlPullParser.require(2, null, "resources");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("string".equals(name)) {
                    P7(xmlPullParser, kVar);
                } else {
                    throw new IllegalArgumentException("Unknown tag: " + name);
                }
            }
        }
    }

    public static void Q8(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i10++;
                } else if (next == 3) {
                    i10--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static boolean R2(final v4<?> v4Var, final TdApi.Message[] messageArr, final Runnable runnable) {
        final TdApi.MessageSender c22;
        final o6 c10 = v4Var.c();
        if (messageArr == null || messageArr.length == 0) {
            return false;
        }
        final long Q0 = t2.Q0(messageArr);
        if (Q0 == 0 || !v4Var.c().t7(Q0) || (c22 = t2.c2(messageArr)) == null || v4Var.c().n7(c22)) {
            return false;
        }
        final String Db = c10.Db(c22, true);
        f2 i10 = new f2(R.id.btn_deleteSupergroupMessages).i(new ra(28, (int) R.id.text_title, 0, w.r2(R.string.QDeleteXMessagesFromY, messageArr.length, Db), false));
        ra[] raVarArr = new ra[3];
        raVarArr[0] = new ra(12, (int) R.id.btn_banMember, 0, c22.getConstructor() == -336109341 ? R.string.RestrictUser : c10.O6(((TdApi.MessageSenderChat) c22).chatId) ? R.string.BanChannel : R.string.BanChat, false);
        raVarArr[1] = new ra(12, (int) R.id.btn_reportSpam, 0, (int) R.string.ReportSpam, false);
        raVarArr[2] = new ra(12, (int) R.id.btn_deleteAll, 0, w.m1(R.string.DeleteAllFrom, Db), false);
        final e2 me2 = v4Var.me(i10.p(raVarArr).j(new v4.r() {
            @Override
            public final void l6(int i11, SparseIntArray sparseIntArray) {
                hj.T3(messageArr, c10, Q0, v4Var, c22, runnable, i11, sparseIntArray);
            }
        }).r(R.string.Delete).q(R.id.theme_color_textNegative));
        if (me2 == null) {
            return true;
        }
        c10.v4().o(new TdApi.GetChatMember(messageArr[0].chatId, messageArr[0].senderId), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.W3(o6.this, messageArr, Db, me2, object);
            }
        });
        c10.v4().o(new TdApi.SearchChatMessages(Q0, null, c22, 0L, 0, 1, null, 0L), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.Y3(messageArr, c10, me2, Db, object);
            }
        });
        return true;
    }

    public static void R3(v4 v4Var, o6 o6Var, long j10, TdApi.MessageSender messageSender, TdApi.ChatMember chatMember) {
        TdApi.ChatMemberStatus O3;
        if (!v4Var.Sa() && (O3 = o6Var.O3(j10)) != null) {
            u7 u7Var = new u7(v4Var.t(), v4Var.c());
            u7Var.sg(new u7.d(j10, messageSender, true, O3, chatMember));
            v4Var.ac(u7Var);
        }
    }

    public static boolean R4(String str, int i10, TdApi.ProxyType proxyType, View view, int i11) {
        if (i11 == R.id.btn_addProxy) {
            he.i.c2().o(str, i10, proxyType, null, true);
            return true;
        } else if (i11 != R.id.btn_save) {
            return true;
        } else {
            he.i.c2().o(str, i10, proxyType, null, false);
            return true;
        }
    }

    public static void R5(final v4 v4Var, final CharSequence charSequence, final n nVar, final String str) {
        v4Var.m8(new Runnable() {
            @Override
            public final void run() {
                hj.Q5(v4.this, charSequence, nVar, str);
            }
        });
    }

    public boolean R6(v4 v4Var, TdApi.NotificationSettingsScope notificationSettingsScope, long j10, Runnable runnable, View view, int i10) {
        if (i10 == R.id.btn_menu_customize) {
            fw fwVar = new fw(v4Var.t(), this.f27643a);
            if (notificationSettingsScope != null) {
                fwVar.Si(new fw.b(notificationSettingsScope));
            } else {
                fwVar.Si(new fw.b(j10));
            }
            v4Var.ac(fwVar);
            v0.D2(runnable);
            return true;
        } else if (j10 == 0 || i10 != R.id.btn_menu_resetToDefault) {
            int i32 = i3(i10);
            if (notificationSettingsScope != null) {
                this.f27643a.oc(notificationSettingsScope, i32);
            } else {
                this.f27643a.hc(j10, i32);
            }
            v0.D2(runnable);
            return true;
        } else {
            TdApi.ChatNotificationSettings chatNotificationSettings = this.f27643a.P3(j10).notificationSettings;
            chatNotificationSettings.useDefaultMuteFor = true;
            this.f27643a.Pb(j10, chatNotificationSettings);
            v0.D2(runnable);
            return true;
        }
    }

    public static void R7(v4<?> v4Var, w6 w6Var) {
        S7(v4Var, w6Var, false);
    }

    public static boolean S2(v4<?> v4Var, final TdApi.Message[] messageArr, final Runnable runnable) {
        CharSequence charSequence;
        if (messageArr == null || messageArr.length == 0) {
            return false;
        }
        final o6 c10 = v4Var.c();
        long Q0 = t2.Q0(messageArr);
        if (c10.k7(Q0)) {
            return false;
        }
        int length = messageArr.length;
        int i10 = 0;
        int i11 = 0;
        final int i12 = 0;
        for (TdApi.Message message : messageArr) {
            boolean z10 = message.canBeDeletedForAllUsers;
            if (z10 && message.canBeDeletedOnlyForSelf) {
                i11++;
                if (message.isOutgoing) {
                    i10++;
                }
            }
            if (!z10 && message.canBeDeletedOnlyForSelf) {
                i12++;
            }
        }
        boolean z11 = i10 > 0;
        if (i11 == 0) {
            return false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(w.q2(R.string.QDeleteXMessages, messageArr.length));
        if (i12 > 0) {
            spannableStringBuilder.append((CharSequence) "\n").append(w.q2(R.string.DeleteXForMeWarning, i12));
        }
        if (i11 == length) {
            charSequence = ob.a.h(Q0) ? w.i1(R.string.DeleteForEveryone) : w.m1(R.string.DeleteForUser, c10.e2().C2(c10.h4(Q0)));
        } else {
            charSequence = ob.a.h(Q0) ? w.q2(R.string.DeleteXForEveryone, i11) : w.r2(R.string.DeleteXForUser, i11, c10.e2().C2(c10.h4(Q0)));
        }
        v4Var.me(new f2(R.id.btn_deleteMessagesWithRevoke).b(spannableStringBuilder).p(new ra[]{new ra(12, (int) R.id.btn_revokeMessages, 0, charSequence, z11)}).j(new v4.r() {
            @Override
            public final void l6(int i13, SparseIntArray sparseIntArray) {
                hj.Z3(i12, messageArr, c10, runnable, i13, sparseIntArray);
            }
        }).r(R.string.Delete).q(R.id.theme_color_textNegative).c(false));
        return true;
    }

    public static void S3(final o6 o6Var, final v4 v4Var, final long j10, final TdApi.MessageSender messageSender, TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            final TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
            o6Var.hd().post(new Runnable() {
                @Override
                public final void run() {
                    hj.R3(v4.this, o6Var, j10, messageSender, chatMember);
                }
            });
        }
    }

    public static boolean S4(j2[] j2VarArr, View view, ie.o oVar) {
        if (j2VarArr[0] != null) {
            j2VarArr[0].s2(true);
        }
        return false;
    }

    public static void S5(final v4 v4Var, final CharSequence charSequence, final n nVar, TdApi.Object object) {
        if (object.getConstructor() == -2001619202) {
            lj ljVar = new lj(v4Var.t(), v4Var.c());
            ljVar.bg(new lj.a(10, (TdApi.PasswordState) object).d(new kb.j() {
                @Override
                public final void a(Object obj) {
                    hj.R5(v4.this, charSequence, nVar, (String) obj);
                }
            }));
            v4Var.ac(ljVar);
        }
    }

    public boolean S6(v4 v4Var, TdApi.ChatList chatList, long j10, Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_unpinChat && i10 != R.id.btn_pinChat) {
            return true;
        }
        K7(v4Var, chatList, j10, null, i10, runnable);
        return true;
    }

    public static void S7(v4<?> v4Var, final w6 w6Var, boolean z10) {
        v4Var.ee(w.m1(z10 ? R.string.SignOutHint2 : R.string.RemoveAccountHint2, w6Var.u()), new int[]{R.id.btn_removeAccount, R.id.btn_cancel}, new String[]{w.i1(R.string.LogOut), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean F5;
                F5 = hj.F5(w6.this, view, i10);
                return F5;
            }
        });
    }

    public static void T3(TdApi.Message[] messageArr, final o6 o6Var, final long j10, final v4 v4Var, final TdApi.MessageSender messageSender, Runnable runnable, int i10, SparseIntArray sparseIntArray) {
        if (i10 == R.id.btn_deleteSupergroupMessages) {
            boolean z10 = sparseIntArray.get(R.id.btn_banMember) != 0;
            boolean z11 = sparseIntArray.get(R.id.btn_reportSpam) != 0;
            boolean z12 = sparseIntArray.get(R.id.btn_deleteAll) != 0;
            long[] q10 = t2.M1(messageArr).q(0);
            if (z10) {
                o6Var.v4().o(new TdApi.GetChatMember(j10, messageArr[0].senderId), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        hj.S3(o6.this, v4Var, j10, messageSender, object);
                    }
                });
            }
            if (z11) {
                o6Var.v4().o(new TdApi.ReportSupergroupSpam(ob.a.p(j10), q10), o6Var.na());
            }
            if (z12) {
                o6Var.v4().o(new TdApi.DeleteChatMessagesBySender(j10, messageSender), o6Var.na());
            } else {
                o6Var.P4(j10, q10, true);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void T4(TdApi.Chat[] chatArr, kb.b bVar, TdApi.Error[] errorArr, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            errorArr[0] = (TdApi.Error) object;
            this.f27643a.hd().post(bVar);
        } else if (constructor == -1601123095) {
            chatArr[0] = (TdApi.Chat) object;
            this.f27643a.hd().post(bVar);
        }
    }

    public static boolean T5(v4 v4Var, View view, int i10) {
        if (i10 != R.id.btn_next) {
            return true;
        }
        qp qpVar = new qp(v4Var.t(), v4Var.c());
        qpVar.ih(new qp.b(null));
        v4Var.ac(qpVar);
        return true;
    }

    public static void T6(o oVar, TdApi.MessageSchedulingState messageSchedulingState) {
        if (messageSchedulingState == null) {
            oVar.a(true, null, false);
        } else {
            oVar.a(false, messageSchedulingState, false);
        }
    }

    public static void T7(final v4<?> v4Var, final long j10, TdApi.Message[] messageArr, final Runnable runnable, ae.p pVar) {
        CharSequence charSequence;
        long[] jArr;
        CharSequence charSequence2;
        int i10;
        final o6 c10 = v4Var.c();
        if (messageArr == null || messageArr.length <= 0) {
            jArr = null;
            charSequence = w.m1(R.string.ReportChat, c10.U3(j10));
        } else {
            long[] jArr2 = new long[messageArr.length];
            long R0 = ob.e.R0(messageArr[0]);
            boolean z10 = true;
            int i11 = 0;
            for (TdApi.Message message : messageArr) {
                i11++;
                jArr2[i11] = message.f19946id;
                if (z10 && ob.e.R0(message) != R0) {
                    R0 = 0;
                    z10 = false;
                }
            }
            if (z10) {
                int i12 = R.string.ReportMessage;
                if (R0 != 0) {
                    if (ob.a.l(R0)) {
                        i10 = 1;
                        i12 = messageArr.length == 1 ? R.string.ReportMessageUser : R.string.ReportMessagesUser;
                    } else {
                        i10 = 1;
                        if (messageArr.length != 1) {
                            i12 = R.string.ReportMessages;
                        }
                    }
                    Object[] objArr = new Object[i10];
                    objArr[0] = c10.U3(R0);
                    charSequence2 = w.m1(i12, objArr);
                } else {
                    if (messageArr.length != 1) {
                        i12 = R.string.ReportMessages;
                    }
                    charSequence2 = w.m1(i12, c10.U3(messageArr[0].chatId));
                }
            } else {
                charSequence2 = w.n2(R.string.ReportXMessages, messageArr.length, w.p(), new Object[0]);
            }
            charSequence = charSequence2;
            jArr = jArr2;
        }
        jb.c cVar = new jb.c(7);
        u0 u0Var = new u0(7);
        a3(cVar, u0Var);
        int[] e10 = cVar.e();
        String[] d10 = u0Var.d();
        final CharSequence charSequence3 = charSequence;
        final long[] jArr3 = jArr;
        v4Var.fe(charSequence, e10, d10, null, null, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i13) {
                return g0.b(this, i13);
            }

            @Override
            public final boolean r3(View view, int i13) {
                boolean I5;
                I5 = hj.I5(v4.this, charSequence3, j10, jArr3, runnable, c10, view, i13);
                return I5;
            }
        }, pVar);
    }

    public static int T8(int i10) {
        if (i10 == -1) {
            return R.string.network_Connecting;
        }
        if (i10 == 0) {
            return R.string.Connected;
        }
        if (i10 == 1) {
            return R.string.ConnectingToProxy;
        }
        if (i10 == 2) {
            return R.string.network_Connecting;
        }
        if (i10 == 3) {
            return R.string.network_Updating;
        }
        if (i10 == 4) {
            return R.string.network_WaitingForNetwork;
        }
        throw new RuntimeException();
    }

    public static Object U3(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 < 2) {
            return w.d2(z10);
        }
        return null;
    }

    public void U4(final TdApi.Chat[] chatArr, final kb.b bVar, final TdApi.Error[] errorArr, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            errorArr[0] = (TdApi.Error) object;
            this.f27643a.hd().post(bVar);
        } else if (constructor == -537797015) {
            this.f27643a.v4().o(new TdApi.CreatePrivateChat(((TdApi.User) object).f19979id, false), new Client.g() {
                @Override
                public final void r2(TdApi.Object object2) {
                    hj.this.T4(chatArr, bVar, errorArr, object2);
                }
            });
        }
    }

    public static boolean U5(View view, int i10) {
        return true;
    }

    public void U6(TdApi.Chat chat, p pVar) {
        c8(chat, pVar.f27699a);
    }

    public static void U7(final v4<?> v4Var, final long j10, final int i10, final Runnable runnable, ae.p pVar) {
        final o6 c10 = v4Var.c();
        final CharSequence m12 = w.m1(R.string.ReportChatPhoto, c10.U3(j10));
        jb.c cVar = new jb.c(7);
        u0 u0Var = new u0(7);
        a3(cVar, u0Var);
        v4Var.fe(m12, cVar.e(), u0Var.d(), null, null, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i11) {
                return g0.b(this, i11);
            }

            @Override
            public final boolean r3(View view, int i11) {
                boolean L5;
                L5 = hj.L5(v4.this, m12, j10, i10, runnable, c10, view, i11);
                return L5;
            }
        }, pVar);
    }

    public static void V3(TdApi.ChatMember chatMember, o6 o6Var, TdApi.Message[] messageArr, String str, e2 e2Var) {
        String str2;
        if (chatMember.status.getConstructor() == -160019714) {
            str2 = w.i1(R.string.RoleOwner);
        } else if (chatMember.status.getConstructor() == -1653518666) {
            str2 = w.i1(R.string.RoleBanned);
        } else if (t2.i3(chatMember.status, false) || chatMember.memberId.getConstructor() == -239660751) {
            int i10 = chatMember.joinedChatDate;
            if (i10 != 0) {
                str2 = w.X0(i10, TimeUnit.SECONDS, o6Var.H4(), TimeUnit.MILLISECONDS, true, 60, R.string.RoleMember, true);
            } else if (chatMember.memberId.getConstructor() == -239660751) {
                str2 = w.i1(o6Var.O6(ob.e.S0(chatMember.memberId)) ? R.string.RoleChannel : R.string.RoleGroup);
            } else {
                return;
            }
        } else {
            str2 = w.i1(R.string.RoleLeft);
        }
        CharSequence n22 = w.n2(R.string.QDeleteXMessagesFromYRole, messageArr.length, gj.f27592a, str, str2);
        int L0 = e2Var.f24134a.L0(R.id.text_title);
        if (L0 != -1 && e2Var.f24134a.C0(L0).Z(n22)) {
            e2Var.f24134a.I(L0);
        }
    }

    public boolean V4(final TdApi.Chat[] chatArr, final kb.b bVar, final TdApi.Error[] errorArr, View view, int i10) {
        if (i10 != R.id.btn_openChat) {
            return true;
        }
        this.f27643a.v4().o(new TdApi.GetSupportUser(), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.this.U4(chatArr, bVar, errorArr, object);
            }
        });
        return true;
    }

    public static boolean V5(View view, int i10) {
        return true;
    }

    public static void V6(q1 q1Var, kb.j jVar, DialogInterface dialogInterface, int i10) {
        p pVar = (p) q1Var.getCurrentItem();
        if (pVar != null && jVar != null) {
            jVar.a(pVar);
        }
    }

    public static void V7(final v4<?> v4Var, final long[] jArr, final Runnable runnable) {
        final o6 c10 = v4Var.c();
        jb.c cVar = new jb.c(7);
        u0 u0Var = new u0(7);
        a3(cVar, u0Var);
        final CharSequence q22 = w.q2(R.string.ReportXChats, jArr.length);
        v4Var.fe(q22, cVar.e(), u0Var.d(), null, null, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean O5;
                O5 = hj.O5(v4.this, q22, jArr, c10, runnable, view, i10);
                return O5;
            }
        }, null);
    }

    public static void W3(final o6 o6Var, final TdApi.Message[] messageArr, final String str, final e2 e2Var, TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            final TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
            o6Var.hd().post(new Runnable() {
                @Override
                public final void run() {
                    hj.V3(TdApi.ChatMember.this, o6Var, messageArr, str, e2Var);
                }
            });
        }
    }

    public void W4(v4 v4Var, d9 d9Var, TdApi.AuthenticationCodeInfo authenticationCodeInfo, TdApi.InternalLinkTypePhoneNumberConfirmation internalLinkTypePhoneNumberConfirmation) {
        if (v4Var != null && !v4Var.Sa()) {
            M2(d9Var, authenticationCodeInfo, internalLinkTypePhoneNumberConfirmation.phoneNumber);
        }
    }

    public void W5(final n nVar, TdApi.Object object, final v4 v4Var, final CharSequence charSequence) {
        nVar.a(object);
        switch (object.getConstructor()) {
            case TdApi.CanTransferOwnershipResultOk.CONSTRUCTOR:
                this.f27643a.v4().o(new TdApi.GetPasswordState(), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object2) {
                        hj.S5(v4.this, charSequence, nVar, object2);
                    }
                });
                return;
            case TdApi.CanTransferOwnershipResultPasswordTooFresh.CONSTRUCTOR:
                v4Var.ge(new v4.p.a().c(ce.c0.H(w.i1(R.string.TransferOwnershipSecurityAlert), w.H0(v4Var, R.string.TransferOwnershipSecurityWaitPassword, w.v0(((TdApi.CanTransferOwnershipResultPasswordTooFresh) object).retryAfter)))).d(new v4.o(R.id.btn_next, w.i1(R.string.OK), 1, R.drawable.baseline_check_circle_24)).b().a(), ah.f27252a);
                return;
            case TdApi.CanTransferOwnershipResultSessionTooFresh.CONSTRUCTOR:
                v4Var.ge(new v4.p.a().c(ce.c0.H(w.i1(R.string.TransferOwnershipSecurityAlert), w.H0(v4Var, R.string.TransferOwnershipSecurityWaitSession, w.v0(((TdApi.CanTransferOwnershipResultSessionTooFresh) object).retryAfter)))).d(new v4.o(R.id.btn_next, w.i1(R.string.OK), 1, R.drawable.baseline_check_circle_24)).b().a(), bh.f27299a);
                return;
            case TdApi.CanTransferOwnershipResultPasswordNeeded.CONSTRUCTOR:
                v4Var.ge(new v4.p.a().c(ce.c0.H(w.i1(R.string.TransferOwnershipSecurityAlert), w.H0(v4Var, R.string.TransferOwnershipSecurityPasswordNeeded, new Object[0]))).d(new v4.o(R.id.btn_next, w.i1(R.string.TransferOwnershipSecurityActionSetPassword), 3, R.drawable.mrgrigri_baseline_textbox_password_24)).b().a(), new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view, int i10) {
                        boolean T5;
                        T5 = hj.T5(v4.this, view, i10);
                        return T5;
                    }
                });
                return;
            default:
                return;
        }
    }

    public void W6(d9 d9Var, String str, q qVar, int i10, String str2, TdApi.Object object) {
        int constructor = object.getConstructor();
        boolean z10 = false;
        if (constructor == -1679978726) {
            E8(d9Var.c(), R.drawable.baseline_warning_24, w.m1(R.string.BotNotFound, str), qVar);
        } else if (constructor == -1601123095) {
            TdApi.Chat ma2 = this.f27643a.ma(object);
            if (!this.f27643a.M6(ma2)) {
                E8(d9Var.c(), R.drawable.baseline_warning_24, w.m1(R.string.BotNotFound, str), qVar);
                return;
            }
            TdApi.User f42 = this.f27643a.f4(ma2);
            if (f42 == null || f42.type.getConstructor() != -970625144) {
                E8(d9Var.c(), R.drawable.baseline_warning_24, w.m1(R.string.BotNotFound, str), qVar);
            } else if (i10 == 0) {
                C4(d9Var, ma2, new j().s(qVar).r(new w2(f42.f19979id, str2, false)).h());
            } else if (i10 == 1 || i10 == 2) {
                if (i10 == 2) {
                    z10 = true;
                }
                H3(d9Var, new w2(f42.f19979id, str2, z10), z10);
            }
        }
    }

    public static <T extends TdApi.Function> void W8(v4<?> v4Var, int i10, CharSequence charSequence, T t10, boolean z10, kb.j<T> jVar) {
        TdApi.ChatReportReason chatReportReason;
        switch (i10) {
            case R.id.btn_reportChatChildAbuse:
                chatReportReason = new TdApi.ChatReportReasonChildAbuse();
                break;
            case R.id.btn_reportChatCopyright:
                chatReportReason = new TdApi.ChatReportReasonCopyright();
                break;
            case R.id.btn_reportChatFake:
                chatReportReason = new TdApi.ChatReportReasonFake();
                break;
            case R.id.btn_reportChatIllegalDrugs:
                chatReportReason = new TdApi.ChatReportReasonIllegalDrugs();
                break;
            case R.id.btn_reportChatOther:
                chatReportReason = new TdApi.ChatReportReasonCustom();
                z10 = true;
                break;
            case R.id.btn_reportChatPersonalDetails:
                chatReportReason = new TdApi.ChatReportReasonPersonalDetails();
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
                throw new IllegalArgumentException(w.e1(i10));
        }
        int constructor = t10.getConstructor();
        if (constructor == -964543587) {
            ((TdApi.ReportChat) t10).reason = chatReportReason;
        } else if (constructor == 734652708) {
            ((TdApi.ReportChatPhoto) t10).reason = chatReportReason;
        } else {
            throw new UnsupportedOperationException(t10.toString());
        }
        if (z10) {
            yo yoVar = new yo(v4Var.t(), v4Var.c());
            yoVar.Ad(new h(charSequence, t10, jVar));
            v4Var.t().Q1().h0(yoVar);
            return;
        }
        jVar.a(t10);
    }

    public static void X3(e2 e2Var, int i10, String str) {
        int L0 = e2Var.f24134a.L0(R.id.btn_deleteAll);
        if (L0 != -1 && e2Var.f24134a.C0(L0).Z(w.r2(R.string.DeleteXMoreFrom, i10, str))) {
            e2Var.f24134a.I(L0);
        }
    }

    public void X4(final v4 v4Var, final d9 d9Var, final TdApi.InternalLinkTypePhoneNumberConfirmation internalLinkTypePhoneNumberConfirmation, q qVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            E8(this.f27643a, R.drawable.baseline_warning_24, t2.z5(object), qVar);
        } else if (constructor == -860345416) {
            final TdApi.AuthenticationCodeInfo authenticationCodeInfo = (TdApi.AuthenticationCodeInfo) object;
            post(new Runnable() {
                @Override
                public final void run() {
                    hj.this.W4(v4Var, d9Var, authenticationCodeInfo, internalLinkTypePhoneNumberConfirmation);
                }
            });
        }
    }

    public void X5(final n nVar, final v4 v4Var, final CharSequence charSequence, final TdApi.Object object) {
        this.f27643a.hd().post(new Runnable() {
            @Override
            public final void run() {
                hj.this.W5(nVar, object, v4Var, charSequence);
            }
        });
    }

    public void X6(d9 d9Var, j jVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -1601123095) {
            C4(d9Var, this.f27643a.ma(object), jVar);
        }
    }

    public static void Y3(TdApi.Message[] messageArr, o6 o6Var, final e2 e2Var, final String str, TdApi.Object object) {
        final int length;
        if (object.getConstructor() == -16498159 && (length = ((TdApi.Messages) object).totalCount - messageArr.length) > 0) {
            o6Var.hd().post(new Runnable() {
                @Override
                public final void run() {
                    hj.X3(e2.this, length, str);
                }
            });
        }
    }

    public void Y4(d9 d9Var, TdApi.MessageLinkInfo messageLinkInfo, q qVar, kb.i iVar) {
        t7(d9Var, messageLinkInfo, qVar);
        if (iVar != null) {
            iVar.a(true);
        }
    }

    public static void Y5(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            j0.y0(R.string.GifSaved, 0);
        }
    }

    public void Y6(long j10, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, int i10, SparseIntArray sparseIntArray) {
        this.f27643a.Mb(j10, messageSender, sparseIntArray.get(R.id.right_readMessages) != 0 ? new TdApi.ChatMemberStatusMember() : new TdApi.ChatMemberStatusLeft(), chatMemberStatus, null);
    }

    public static void Z2(jb.c cVar, jb.c cVar2, u0 u0Var, jb.c cVar3, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, boolean z15) {
        int i10 = 1;
        if (z10) {
            if (z14) {
                u0Var.b(w.j1(R.string.NotificationsDefaultValue, w.i1(R.string.EnableNotifications)));
            } else {
                u0Var.a(R.string.EnableNotifications);
            }
            cVar2.a(R.drawable.baseline_notifications_24);
            cVar.a(R.id.btn_menu_enable);
            if (cVar3 != null) {
                cVar3.a(1);
            }
        }
        if (str != null) {
            u0Var.b(w.j1(R.string.NotificationsDefault, w.Z1(str)));
            cVar2.a(R.drawable.baseline_notifications_off_24);
            cVar.a(R.id.btn_menu_resetToDefault);
            if (cVar3 != null) {
                cVar3.a(1);
            }
        }
        if (z11) {
            u0Var.a(R.string.MuteForever);
            cVar2.a(R.drawable.baseline_notifications_off_24);
            cVar.a(R.id.btn_menu_disable);
            if (cVar3 != null) {
                cVar3.a(1);
            }
        }
        if (z12) {
            u0Var.b(w.o2(R.string.MuteForXHours, 1L));
            u0Var.b(w.o2(R.string.MuteForXHours, 8L));
            u0Var.b(w.o2(R.string.MuteForXDays, 2L));
            cVar2.a(R.drawable.baseline_notifications_paused_24);
            cVar2.a(R.drawable.baseline_notifications_paused_24);
            cVar2.a(R.drawable.baseline_notifications_paused_24);
            cVar.a(R.id.btn_menu_1hour);
            cVar.a(R.id.btn_menu_8hours);
            cVar.a(R.id.btn_menu_2days);
            if (cVar3 != null) {
                cVar3.a(1);
                cVar3.a(1);
                cVar3.a(1);
            }
        }
        if (z13) {
            cVar.a(R.id.btn_menu_customize);
            u0Var.a(R.string.NotificationsCustomize);
            cVar2.a(R.drawable.baseline_settings_24);
            if (cVar3 != null) {
                if (z15) {
                    i10 = 2;
                }
                cVar3.a(i10);
            }
        }
    }

    public static void Z3(int i10, TdApi.Message[] messageArr, o6 o6Var, Runnable runnable, int i11, SparseIntArray sparseIntArray) {
        if (i11 == R.id.btn_deleteMessagesWithRevoke) {
            boolean z10 = sparseIntArray.get(R.id.btn_revokeMessages) != 0;
            if (!z10 || i10 <= 0) {
                k0.e<long[]> M1 = t2.M1(messageArr);
                for (int i12 = 0; i12 < M1.p(); i12++) {
                    o6Var.P4(M1.j(i12), M1.q(i12), z10);
                }
            } else {
                TdApi.Message[] messageArr2 = new TdApi.Message[messageArr.length - i10];
                TdApi.Message[] messageArr3 = new TdApi.Message[i10];
                int i13 = 0;
                int i14 = 0;
                for (TdApi.Message message : messageArr) {
                    if (message.canBeDeletedForAllUsers) {
                        i14++;
                        messageArr2[i14] = message;
                    } else {
                        i13++;
                        messageArr3[i13] = message;
                    }
                }
                k0.e<long[]> M12 = t2.M1(messageArr2);
                for (int i15 = 0; i15 < M12.p(); i15++) {
                    o6Var.P4(M12.j(i15), M12.q(i15), true);
                }
                k0.e<long[]> M13 = t2.M1(messageArr3);
                for (int i16 = 0; i16 < M13.p(); i16++) {
                    o6Var.P4(M13.j(i16), M13.q(i16), false);
                }
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static void Z5(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, List list, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            atomicInteger.incrementAndGet();
        }
        if (atomicInteger2.decrementAndGet() != 0) {
            return;
        }
        if (atomicInteger.get() == 1) {
            j0.y0(R.string.GifSaved, 0);
        } else {
            j0.z0(w.q2(R.string.XGifSaved, list.size()), 0);
        }
    }

    public static void Z7(v4<?> v4Var, boolean z10, boolean z11) {
        String H0 = ya.H0(z10);
        File file = new File(H0);
        if (!file.exists()) {
            j0.z0("Log does not exist", 0);
        } else if (file.length() == 0) {
            j0.z0("Log is empty", 0);
        } else {
            y00 y00Var = new y00(v4Var.t(), z11 ? null : v4Var.c());
            y00Var.Vi(new y00.m(H0, "text/plain"));
            y00Var.ej();
        }
    }

    public static void a3(jb.c cVar, u0 u0Var) {
        cVar.a(R.id.btn_reportChatSpam);
        u0Var.a(R.string.Spam);
        cVar.a(R.id.btn_reportChatFake);
        u0Var.a(R.string.Fake);
        cVar.a(R.id.btn_reportChatViolence);
        u0Var.a(R.string.Violence);
        cVar.a(R.id.btn_reportChatPornography);
        u0Var.a(R.string.Pornography);
        cVar.a(R.id.btn_reportChatChildAbuse);
        u0Var.a(R.string.ChildAbuse);
        cVar.a(R.id.btn_reportChatCopyright);
        u0Var.a(R.string.Copyright);
        cVar.a(R.id.btn_reportChatIllegalDrugs);
        u0Var.a(R.string.IllegalDrugs);
        cVar.a(R.id.btn_reportChatPersonalDetails);
        u0Var.a(R.string.PersonalDetails);
        cVar.a(R.id.btn_reportChatOther);
        u0Var.a(R.string.Other);
    }

    public static void a4(v4 v4Var, l lVar) {
        if (!v4Var.Sa() && v4Var.bc() != null) {
            v4Var.bc().M().B(false);
            lVar.a();
        }
        j0.y0(R.string.EraseDatabaseDone, 0);
    }

    public void a5(final d9 d9Var, final q qVar, final kb.i iVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == -981646294) {
                final TdApi.MessageLinkInfo messageLinkInfo = (TdApi.MessageLinkInfo) object;
                post(new Runnable() {
                    @Override
                    public final void run() {
                        hj.this.Y4(d9Var, messageLinkInfo, qVar, iVar);
                    }
                });
            }
        } else if (iVar != null) {
            post(new Runnable() {
                @Override
                public final void run() {
                    i.this.a(false);
                }
            });
        }
    }

    public static void a6(int i10) {
        j0.z0(w.o2(R.string.ReadAllChatsDone, i10), 0);
    }

    public static void a8(String str, ud.p0 p0Var) {
        ld.i iVar = new ld.i(str);
        iVar.t0(wc.a.getDefaultAvatarCacheSize());
        iVar.Z(true);
        p0Var.setPhoto(iVar);
    }

    public static int[] b3() {
        return Build.VERSION.SDK_INT >= 26 ? new int[]{4, 3, 2, 1} : new int[]{2, 1, -1};
    }

    public void b4(final v4 v4Var, final l lVar) {
        this.f27643a.hd().post(new Runnable() {
            @Override
            public final void run() {
                hj.a4(v4.this, lVar);
            }
        });
    }

    public static void b5(d9 d9Var, TdApi.Background background, kb.i iVar) {
        rh rhVar = new rh(d9Var.t(), d9Var.c());
        rhVar.Lp(new rh.c0(5, null, null).f(background));
        d9Var.t().Q1().h0(rhVar);
        if (iVar != null) {
            iVar.a(true);
        }
    }

    public boolean b6(View view, int i10) {
        if (i10 == R.id.btn_markChatAsRead) {
            this.f27643a.Ra(new TdApi.ChatListArchive(), id.f27754a);
            return true;
        } else if (i10 != R.id.btn_pinUnpinChat) {
            return true;
        } else {
            this.f27643a.tc().u0(1L);
            return true;
        }
    }

    public void c4(final v4 v4Var, final l lVar, boolean z10, boolean z11) {
        Runnable riVar = new Runnable() {
            @Override
            public final void run() {
                hj.this.b4(v4Var, lVar);
            }
        };
        if (z10) {
            this.f27643a.Y1(riVar);
        } else {
            riVar.run();
        }
    }

    public boolean c6(v4 v4Var, TdApi.ChatList chatList, long j10, Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_unarchiveChat && i10 != R.id.btn_archiveChat) {
            return true;
        }
        K7(v4Var, chatList, j10, null, i10, runnable);
        return true;
    }

    public static StringBuilder c7(String str, String str2) {
        StringBuilder sb2 = new StringBuilder("<b>");
        sb2.append(w.i1(R.string.UseProxyServer));
        sb2.append(":</b> ");
        sb2.append(str);
        sb2.append("<br/><b>");
        sb2.append(w.i1(R.string.UseProxyPort));
        sb2.append(":</b> ");
        sb2.append(str2);
        return sb2;
    }

    public void d4(final v4 v4Var, final l lVar, final boolean z10) {
        this.f27643a.g5(new kb.i() {
            @Override
            public final void a(boolean z11) {
                hj.this.c4(v4Var, lVar, z10, z11);
            }
        });
    }

    public void d5(final d9 d9Var, final kb.i iVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == -429971172) {
                final TdApi.Background background = (TdApi.Background) object;
                post(new Runnable() {
                    @Override
                    public final void run() {
                        hj.b5(d9.this, background, iVar);
                    }
                });
            }
        } else if (iVar != null) {
            post(new Runnable() {
                @Override
                public final void run() {
                    i.this.a(false);
                }
            });
        }
    }

    public static String e3(long j10, TimeUnit timeUnit, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int seconds = (int) timeUnit.toSeconds(j10);
        if (seconds < 0) {
            seconds = 0;
        }
        if (seconds < 60) {
            if (i10 == 0) {
                i14 = R.string.xSeconds;
            } else if (i10 == 1) {
                i14 = R.string.xSecondsShort;
            } else if (i10 == 2) {
                i14 = R.string.xSecondsRelative;
            } else {
                throw new IllegalArgumentException("mode == " + i10);
            }
            return w.o2(i14, seconds);
        }
        int i15 = seconds / 60;
        if (i15 < 60) {
            if (i10 == 0) {
                i13 = R.string.xMinutes;
            } else if (i10 == 1) {
                i13 = R.string.xMinutesShort;
            } else if (i10 == 2) {
                i13 = R.string.xMinutesRelative;
            } else {
                throw new IllegalArgumentException("mode == " + i10);
            }
            return w.o2(i13, i15);
        }
        int i16 = i15 / 60;
        if (i16 < 24) {
            if (i10 == 0) {
                i12 = R.string.xHours;
            } else if (i10 == 1) {
                i12 = R.string.xHoursShort;
            } else if (i10 == 2) {
                i12 = R.string.xHoursRelative;
            } else {
                throw new IllegalArgumentException("mode == " + i10);
            }
            return w.o2(i12, i16);
        }
        int i17 = i16 / 24;
        if (i17 < 7) {
            if (i10 == 0) {
                i11 = R.string.xDays;
            } else if (i10 == 1) {
                i11 = R.string.xDaysShort;
            } else if (i10 == 2) {
                i11 = R.string.xDaysRelative;
            } else {
                throw new IllegalArgumentException("mode == " + i10);
            }
            return w.o2(i11, i17);
        }
        int i18 = i17 / 7;
        int i19 = R.string.xWeeks;
        if (!(i10 == 0 || i10 == 1)) {
            if (i10 == 2) {
                i19 = R.string.xWeeksRelative;
            } else {
                throw new IllegalArgumentException("mode == " + i10);
            }
        }
        return w.o2(i19, i18);
    }

    public static void e5(d9 d9Var, TdApi.DeepLinkInfo deepLinkInfo, kb.i iVar) {
        v4<?> F = d9Var.t().Q1().F();
        if (F != null) {
            F.ld(deepLinkInfo);
        }
        if (iVar != null) {
            iVar.a(true);
        }
    }

    public boolean e6(Runnable runnable, v4 v4Var, TdApi.ChatList chatList, long j10, p7 p7Var, View view, int i10) {
        if (i10 != R.id.btn_selectChat) {
            return K7(v4Var, chatList, j10, p7Var, i10, null);
        }
        runnable.run();
        return true;
    }

    public static String f3(long j10, TimeUnit timeUnit, boolean z10) {
        return e3(j10, timeUnit, !z10 ? 1 : 0);
    }

    public void f4(final v4 v4Var, final l lVar, final boolean z10, boolean z11) {
        if (z11 && !v4Var.Sa() && v4Var.Ta() && v4Var.bc() != null) {
            j0.y0(R.string.EraseDatabaseProgress, 0);
            v4Var.bc().M().B(true);
            lVar.b();
            j0.y0(R.string.EraseDatabaseProgress, 0);
            final Runnable siVar = new Runnable() {
                @Override
                public final void run() {
                    hj.this.d4(v4Var, lVar, z10);
                }
            };
            if (z10) {
                this.f27643a.N4(new kb.i() {
                    @Override
                    public final void a(boolean z12) {
                        siVar.run();
                    }
                });
            } else {
                siVar.run();
            }
        }
    }

    public void f6(long j10, Runnable runnable, int i10, SparseIntArray sparseIntArray) {
        this.f27643a.v4().o(new TdApi.DeleteChatHistory(j10, false, sparseIntArray.get(R.id.btn_clearChatHistory) == R.id.btn_clearChatHistory), this.f27643a.na());
        v0.D2(runnable);
    }

    public void g4(final v4 v4Var, final l lVar, final boolean z10, boolean z11) {
        if (z11) {
            v4Var.re(w.H0(v4Var, R.string.EraseDatabaseWarn2, new Object[0]), new kb.i() {
                @Override
                public final void a(boolean z12) {
                    hj.this.f4(v4Var, lVar, z10, z12);
                }
            });
        }
    }

    public void g5(final d9 d9Var, final kb.i iVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == 1864081662) {
                final TdApi.DeepLinkInfo deepLinkInfo = (TdApi.DeepLinkInfo) object;
                post(new Runnable() {
                    @Override
                    public final void run() {
                        hj.e5(d9.this, deepLinkInfo, iVar);
                    }
                });
            }
        } else if (iVar != null) {
            post(new Runnable() {
                @Override
                public final void run() {
                    i.this.a(false);
                }
            });
        }
    }

    public boolean g6(long j10, Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_clearChatHistory) {
            return true;
        }
        this.f27643a.v4().o(new TdApi.DeleteChatHistory(j10, false, false), this.f27643a.na());
        v0.D2(runnable);
        return true;
    }

    public void h4(v4 v4Var, r rVar, String str, boolean z10, boolean z11, String str2) {
        W2(v4Var, rVar.c(), str, str2, z10, z11);
    }

    public void h5(final d9 d9Var, TdApi.InternalLinkType internalLinkType, final q qVar, String str, final kb.i iVar) {
        if (!d9Var.t().Q1().W()) {
            boolean z10 = true;
            switch (internalLinkType.getConstructor()) {
                case TdApi.InternalLinkTypeVideoChat.CONSTRUCTOR:
                    H7(d9Var, (TdApi.InternalLinkTypeVideoChat) internalLinkType, qVar);
                    break;
                case TdApi.InternalLinkTypeUserPhoneNumber.CONSTRUCTOR:
                    k7(d9Var, 0L, null, new TdApi.SearchUserByPhoneNumber(((TdApi.InternalLinkTypeUserPhoneNumber) internalLinkType).phoneNumber), null);
                    break;
                case TdApi.InternalLinkTypePublicChat.CONSTRUCTOR:
                    TdApi.InternalLinkTypePublicChat internalLinkTypePublicChat = (TdApi.InternalLinkTypePublicChat) internalLinkType;
                    if (!"iv".equals(internalLinkTypePublicChat.chatUsername)) {
                        y7(d9Var, internalLinkTypePublicChat.chatUsername, qVar);
                        break;
                    } else {
                        n7(d9Var, str, new q(qVar).i());
                        break;
                    }
                case TdApi.InternalLinkTypeLanguagePack.CONSTRUCTOR:
                    z10 = x3(d9Var, ((TdApi.InternalLinkTypeLanguagePack) internalLinkType).languagePackId, qVar);
                    break;
                case TdApi.InternalLinkTypeProxy.CONSTRUCTOR:
                    TdApi.InternalLinkTypeProxy internalLinkTypeProxy = (TdApi.InternalLinkTypeProxy) internalLinkType;
                    String str2 = internalLinkTypeProxy.server;
                    int i10 = internalLinkTypeProxy.port;
                    w7(d9Var, str2, i10, internalLinkTypeProxy.type, c7(str2, Integer.toString(i10)).toString());
                    break;
                case TdApi.InternalLinkTypeBotStart.CONSTRUCTOR:
                    TdApi.InternalLinkTypeBotStart internalLinkTypeBotStart = (TdApi.InternalLinkTypeBotStart) internalLinkType;
                    R8(d9Var, internalLinkTypeBotStart.botUsername, internalLinkTypeBotStart.startParameter, 0, qVar);
                    break;
                case TdApi.InternalLinkTypeQrCodeAuthentication.CONSTRUCTOR:
                    E8(this.f27643a, R.drawable.baseline_warning_24, w.i1(R.string.ScanQRLinkHint), qVar);
                    break;
                case TdApi.InternalLinkTypeThemeSettings.CONSTRUCTOR:
                    fz fzVar = new fz(d9Var.t(), d9Var.c());
                    fzVar.Wh(new fz.c(0));
                    d9Var.t().Q1().h0(fzVar);
                    break;
                case TdApi.InternalLinkTypePassportDataRequest.CONSTRUCTOR:
                    TdApi.InternalLinkTypePassportDataRequest internalLinkTypePassportDataRequest = (TdApi.InternalLinkTypePassportDataRequest) internalLinkType;
                    break;
                case TdApi.InternalLinkTypeBotStartInGroup.CONSTRUCTOR:
                    TdApi.InternalLinkTypeBotStartInGroup internalLinkTypeBotStartInGroup = (TdApi.InternalLinkTypeBotStartInGroup) internalLinkType;
                    R8(d9Var, internalLinkTypeBotStartInGroup.botUsername, internalLinkTypeBotStartInGroup.startParameter, 1, qVar);
                    break;
                case TdApi.InternalLinkTypeUnsupportedProxy.CONSTRUCTOR:
                    E8(this.f27643a, R.drawable.baseline_warning_24, w.i1(R.string.ProxyLinkUnsupported), qVar);
                    break;
                case TdApi.InternalLinkTypeStickerSet.CONSTRUCTOR:
                    N8(d9Var, ((TdApi.InternalLinkTypeStickerSet) internalLinkType).stickerSetName, qVar);
                    break;
                case TdApi.InternalLinkTypeChangePhoneNumber.CONSTRUCTOR:
                    d9Var.t().Q1().h0(new hw(d9Var.t(), d9Var.c()));
                    break;
                case TdApi.InternalLinkTypeGame.CONSTRUCTOR:
                    TdApi.InternalLinkTypeGame internalLinkTypeGame = (TdApi.InternalLinkTypeGame) internalLinkType;
                    R8(d9Var, internalLinkTypeGame.botUsername, internalLinkTypeGame.gameShortName, 2, qVar);
                    break;
                case TdApi.InternalLinkTypeAuthenticationCode.CONSTRUCTOR:
                    this.f27643a.O9().D0(((TdApi.InternalLinkTypeAuthenticationCode) internalLinkType).code);
                    break;
                case TdApi.InternalLinkTypeTheme.CONSTRUCTOR:
                    TdApi.InternalLinkTypeTheme internalLinkTypeTheme = (TdApi.InternalLinkTypeTheme) internalLinkType;
                    E8(this.f27643a, R.drawable.baseline_info_24, w.H0(d9Var, R.string.NoCloudThemeSupport, new Object[0]), qVar);
                    break;
                case TdApi.InternalLinkTypeBackground.CONSTRUCTOR:
                    this.f27643a.v4().o(new TdApi.SearchBackground(((TdApi.InternalLinkTypeBackground) internalLinkType).backgroundName), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            hj.this.d5(d9Var, iVar, object);
                        }
                    });
                    return;
                case TdApi.InternalLinkTypeSettings.CONSTRUCTOR:
                    d9Var.t().Q1().h0(new wt(d9Var.t(), d9Var.c()));
                    break;
                case TdApi.InternalLinkTypeChatInvite.CONSTRUCTOR:
                    K2(d9Var, ((TdApi.InternalLinkTypeChatInvite) internalLinkType).inviteLink, qVar);
                    break;
                case TdApi.InternalLinkTypeUnknownDeepLink.CONSTRUCTOR:
                    this.f27643a.v4().o(new TdApi.GetDeepLinkInfo(str), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            hj.this.g5(d9Var, iVar, object);
                        }
                    });
                    return;
                case TdApi.InternalLinkTypeMessageDraft.CONSTRUCTOR:
                    y00 y00Var = new y00(d9Var.t(), d9Var.c());
                    y00Var.Vi(new y00.m(((TdApi.InternalLinkTypeMessageDraft) internalLinkType).text));
                    y00Var.ej();
                    break;
                case TdApi.InternalLinkTypeMessage.CONSTRUCTOR:
                    this.f27643a.v4().o(new TdApi.GetMessageLinkInfo(((TdApi.InternalLinkTypeMessage) internalLinkType).url), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            hj.this.a5(d9Var, qVar, iVar, object);
                        }
                    });
                    return;
                case TdApi.InternalLinkTypeFilterSettings.CONSTRUCTOR:
                default:
                    z10 = false;
                    break;
                case TdApi.InternalLinkTypePhoneNumberConfirmation.CONSTRUCTOR:
                    final TdApi.InternalLinkTypePhoneNumberConfirmation internalLinkTypePhoneNumberConfirmation = (TdApi.InternalLinkTypePhoneNumberConfirmation) internalLinkType;
                    final v4<?> F = d9Var.t().Q1().F();
                    this.f27643a.v4().o(new TdApi.SendPhoneNumberConfirmationCode(internalLinkTypePhoneNumberConfirmation.hash, internalLinkTypePhoneNumberConfirmation.phoneNumber, t2.h0()), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            hj.this.X4(F, d9Var, internalLinkTypePhoneNumberConfirmation, qVar, object);
                        }
                    });
                    break;
                case TdApi.InternalLinkTypeActiveSessions.CONSTRUCTOR:
                    d9Var.t().Q1().h0(new h20(d9Var.t(), d9Var.c(), new v4[]{new dy(d9Var.t(), d9Var.c()), new qz(d9Var.t(), d9Var.c())}, new String[]{w.i1(R.string.Devices).toUpperCase(), w.i1(R.string.Websites).toUpperCase()}, false));
                    break;
            }
            if (iVar != null) {
                iVar.a(z10);
            }
        }
    }

    public static int i3(int i10) {
        switch (i10) {
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

    public boolean i6(boolean z10, TdApi.SecretChat secretChat, final kb.i iVar, View view, int i10) {
        if (i10 == R.id.btn_removeChatFromList) {
            if (z10) {
                this.f27643a.d2(new TdApi.MessageSenderUser(secretChat.userId), true, new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        i.this.a(false);
                    }
                });
            } else {
                iVar.a(false);
            }
        }
        return true;
    }

    public static TdApi.LanguagePackStringValuePluralized j3(String str, String str2, Map<String, TdApi.LanguagePackStringValue> map) {
        String substring = str.substring(0, (str.length() - str2.length()) - 1);
        TdApi.LanguagePackStringValue languagePackStringValue = map.get(substring);
        if (languagePackStringValue instanceof TdApi.LanguagePackStringValuePluralized) {
            return (TdApi.LanguagePackStringValuePluralized) languagePackStringValue;
        }
        TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized = new TdApi.LanguagePackStringValuePluralized();
        map.put(substring, languagePackStringValuePluralized);
        return languagePackStringValuePluralized;
    }

    public boolean j4(final kb.j jVar, y1 y1Var, final String str) {
        if (str.startsWith("@")) {
            str = str.substring(1);
        } else if (this.f27643a.x7(str)) {
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
        if (ib.i.i(str)) {
            str = null;
        } else if (!t2.v4(str) || str.length() > 32) {
            return false;
        }
        this.f27643a.hd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                j.this.a(str);
            }
        }, 100L);
        return true;
    }

    public void j5(final d9 d9Var, final q qVar, final String str, final kb.i iVar, TdApi.Object object) {
        if (object instanceof TdApi.InternalLinkType) {
            final TdApi.InternalLinkType internalLinkType = (TdApi.InternalLinkType) object;
            post(new Runnable() {
                @Override
                public final void run() {
                    hj.this.h5(d9Var, internalLinkType, qVar, str, iVar);
                }
            });
        } else if (iVar != null) {
            post(new Runnable() {
                @Override
                public final void run() {
                    i.this.a(false);
                }
            });
        }
    }

    public void j6(final long j10, v4 v4Var, String str, final kb.i iVar, final boolean z10) {
        final TdApi.SecretChat b42 = this.f27643a.b4(j10);
        if (b42 != null) {
            if (b42.state.getConstructor() != -1611352087 || !this.f27643a.o2(j10) || (!(v4Var instanceof rh) && this.f27643a.t6(j10))) {
                v4Var.ee(w.m1(b42.state.getConstructor() == -1637050756 ? R.string.DeleteSecretChatPendingConfirm : R.string.DeleteSecretChatClosedConfirm, str), new int[]{R.id.btn_removeChatFromList, R.id.btn_cancel}, new String[]{w.i1(R.string.DeleteChat), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view, int i10) {
                        boolean i62;
                        i62 = hj.this.i6(z10, b42, iVar, view, i10);
                        return i62;
                    }
                });
            } else {
                v4Var.me(new f2(R.id.btn_removeChatFromList).c(false).b(w.m1(R.string.DeleteSecretChatConfirm, str)).p(new ra[]{new ra(12, (int) R.id.btn_clearChatHistory, 0, (CharSequence) w.j1(R.string.DeleteSecretChatHistoryForOtherParty, str), (int) R.id.btn_clearChatHistory, false)}).q(R.id.theme_color_textNegative).r(R.string.Delete).j(new v4.r() {
                    @Override
                    public final void l6(int i10, SparseIntArray sparseIntArray) {
                        hj.this.u6(j10, iVar, i10, sparseIntArray);
                    }
                }));
            }
        }
    }

    public static int k3(int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (i10 == 1) {
                return R.id.btn_importanceMin;
            }
            if (i10 == 2) {
                return R.id.btn_importanceLow;
            }
            if (i10 == 3) {
                return R.id.btn_importanceDefault;
            }
            if (i10 == 4) {
                return R.id.btn_importanceHigh;
            }
        } else if (i10 == -1) {
            return R.id.btn_priorityLow;
        } else {
            if (i10 == 1) {
                return R.id.btn_priorityHigh;
            }
            if (i10 == 2) {
                return R.id.btn_priorityMax;
            }
        }
        throw new IllegalArgumentException("priorityOrImportance == " + i10);
    }

    public static void k4(v4 v4Var, ViewGroup viewGroup) {
        TextView R = ap.R(v4Var.t(), 9, R.id.theme_color_textLight, null, v4Var);
        R.setText(w.i1(R.string.ThemeExportInfo));
        R.setPadding(0, ce.a0.i(12.0f), 0, 0);
        viewGroup.addView(R);
    }

    public void k5(d9 d9Var, String str, q qVar, boolean z10) {
        if (!z10) {
            n7(d9Var, str, qVar);
        }
    }

    public static boolean k6(kb.i iVar, View view, int i10) {
        if (i10 != R.id.btn_removeChatFromList) {
            return true;
        }
        iVar.a(false);
        return true;
    }

    public static int l3(int i10, boolean z10, boolean z11) {
        if (i10 == -100) {
            return R.string.Default;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return i10 != -1 ? i10 != 2 ? R.string.PriorityRegular : R.string.PriorityUrgent : R.string.PriorityLow;
        }
        if (i10 == 0) {
            return R.string.NotificationImportanceNone;
        }
        if (i10 == 1) {
            return R.string.NotificationImportanceMin;
        }
        if (i10 == 2) {
            return (z10 || z11) ? R.string.NotificationImportanceLow : R.string.NotificationImportanceLowMuted;
        }
        if (i10 == 3) {
            return z10 ? R.string.NotificationImportanceDefault : z11 ? R.string.NotificationImportanceDefaultNoSound : R.string.NotificationImportanceDefaultMuted;
        }
        if (i10 == 4 || i10 == 5) {
            return z10 ? R.string.NotificationImportanceHigh : z11 ? R.string.NotificationImportanceHighNoSound : R.string.NotificationImportanceHighMuted;
        }
        throw new IllegalArgumentException("priorityOrImportance == " + i10);
    }

    public void l4(d9 d9Var, TdApi.LanguagePackInfo languagePackInfo) {
        if (d9Var.t().L0() != 2) {
            D8(d9Var, languagePackInfo);
        }
    }

    public void l6(long j10, v4 v4Var, Runnable runnable, final kb.i iVar) {
        TdApi.ChatMemberStatus O3 = this.f27643a.O3(j10);
        if (O3 == null || !t2.i3(O3, false)) {
            v4Var.ee(w.i1(R.string.AreYouSureDeleteThisChat), new int[]{R.id.btn_removeChatFromList, R.id.btn_cancel}, new String[]{w.i1(R.string.DeleteChat), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view, int i10) {
                    boolean k62;
                    k62 = hj.k6(i.this, view, i10);
                    return k62;
                }
            });
        } else {
            Z6(v4Var, j10, false, runnable);
        }
    }

    public void m4(final d9 d9Var, q qVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            E8(d9Var.c(), R.drawable.baseline_warning_24, t2.z5(object), qVar);
        } else if (constructor != 542199642) {
            Log.unexpectedTdlibResponse(object, TdApi.GetLanguagePackInfo.class, TdApi.LanguagePackInfo.class, TdApi.Error.class);
        } else {
            final TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) object;
            this.f27643a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    hj.this.l4(d9Var, languagePackInfo);
                }
            });
        }
    }

    public void m5(d9 d9Var, String str, q qVar, DialogInterface dialogInterface, int i10) {
        this.f27643a.hd().n7(d9Var, str, qVar.f());
    }

    public void m6(v4 v4Var, long j10, Runnable runnable) {
        Z6(v4Var, j10, false, runnable);
    }

    public static void m8(d9 d9Var, q qVar, int i10, boolean z10) {
        E8(d9Var.c(), R.drawable.baseline_warning_24, w.i1(i10 != -3 ? i10 != -2 ? R.string.ChatAccessFailed : z10 ? R.string.ChatAccessRestrictedChannel : R.string.ChatAccessRestrictedGroup : z10 ? R.string.ChatAccessPrivateChannel : R.string.ChatAccessPrivateGroup), qVar);
    }

    public void n4(TdApi.ChatMemberStatus chatMemberStatus, long j10, TdApi.MessageSender messageSender, int i10, SparseIntArray sparseIntArray) {
        boolean z10 = sparseIntArray.get(R.id.right_readMessages) != 0;
        if (chatMemberStatus.getConstructor() != 1661432998 || z10) {
            this.f27643a.Mb(j10, messageSender, new TdApi.ChatMemberStatusBanned(), chatMemberStatus, null);
            if (!z10) {
                this.f27643a.Mb(j10, messageSender, new TdApi.ChatMemberStatusLeft(), chatMemberStatus, null);
                return;
            }
            return;
        }
        TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) chatMemberStatus;
        this.f27643a.Mb(j10, messageSender, new TdApi.ChatMemberStatusRestricted(false, chatMemberStatusRestricted.restrictedUntilDate, chatMemberStatusRestricted.permissions), chatMemberStatus, null);
    }

    public void n6(long j10, v4 v4Var, Runnable runnable, boolean z10) {
        this.f27643a.O4(j10, z10, null);
        U2(v4Var, j10);
        v0.D2(runnable);
    }

    public static String o3(int i10) {
        return p3(i10, false);
    }

    public void o4(ra raVar, long j10, TdApi.MessageSender messageSender, View view, int i10, ra raVar2, TextView textView, iq iqVar) {
        raVar.X(c3(j10, messageSender, iqVar.y0().get(R.id.right_readMessages) != 0));
        iqVar.r3(iqVar.F0(raVar));
    }

    public static void o5(AtomicBoolean atomicBoolean, kb.b[] bVarArr, d9 d9Var, TdApi.WebPage webPage, TdApi.WebPageInstantView webPageInstantView, String str) {
        if (!atomicBoolean.getAndSet(true)) {
            bVarArr[0].c();
            u9 u9Var = new u9(d9Var.t(), d9Var.c());
            try {
                u9Var.Ad(new u9.b(webPage, webPageInstantView, Uri.parse(str).getEncodedFragment()));
                u9Var.bf();
            } catch (Throwable th) {
                Log.e("Unable to open instantView, url:%s", th, str);
                j0.y0(R.string.InstantViewUnsupported, 0);
                j0.c0(str);
            }
        }
    }

    public static String p3(int i10, boolean z10) {
        String str;
        if (i10 <= 0) {
            return w.i1(z10 ? R.string.NotificationsDefaultEnabled : R.string.NotificationsEnabled);
        } else if (i10 >= 345600) {
            return w.i1(z10 ? R.string.NotificationsDefaultDisabled : R.string.NotificationsDisabled);
        } else {
            float f10 = i10;
            int round = Math.round(f10 / 60.0f);
            int round2 = Math.round(f10 / 3600.0f);
            int round3 = Math.round(f10 / 86400.0f);
            if (round3 > 0) {
                str = w.o2(R.string.xDays, round3);
            } else if (round2 > 0) {
                str = w.o2(R.string.xHours, round2);
            } else {
                str = w.o2(R.string.xMinutes, Math.max(0, round));
            }
            return w.j1(z10 ? R.string.NotificationsDefaultUnmutesIn : R.string.UnmutesInX, str);
        }
    }

    public boolean p4(long j10, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, View view, int i10) {
        if (i10 != R.id.btn_blockSender) {
            return true;
        }
        this.f27643a.Mb(j10, messageSender, new TdApi.ChatMemberStatusLeft(), chatMemberStatus, null);
        return true;
    }

    public void p5(final kb.b[] bVarArr, final AtomicBoolean atomicBoolean, final d9 d9Var, final TdApi.WebPage webPage, final String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            post(bVarArr[0]);
        } else if (constructor == 778202453) {
            final TdApi.WebPageInstantView webPageInstantView = (TdApi.WebPageInstantView) object;
            if (!t2.y2(webPageInstantView.version)) {
                post(bVarArr[0]);
            } else {
                post(new Runnable() {
                    @Override
                    public final void run() {
                        hj.o5(atomicBoolean, bVarArr, d9Var, webPage, webPageInstantView, str);
                    }
                });
            }
        }
    }

    public void p6(boolean z10, long j10, final kb.i iVar, int i10, SparseIntArray sparseIntArray) {
        final boolean z11 = sparseIntArray.get(R.id.btn_clearChatHistory) == R.id.btn_clearChatHistory;
        if (z10) {
            this.f27643a.d2(new TdApi.MessageSenderUser(j10), true, new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    i.this.a(z11);
                }
            });
        } else {
            iVar.a(z11);
        }
    }

    public void q4(long j10, TdApi.ChatMemberStatus chatMemberStatus, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
            Log.e("setChatMemberStatus chatId:%d, status:%s error:%s", Long.valueOf(j10), chatMemberStatus, t2.z5(object));
        } else if (constructor == -722616727 && ob.a.g(j10)) {
            this.f27643a.v4().o(new TdApi.DeleteChatHistory(j10, true, false), this.f27643a.na());
        }
    }

    public void q5(AtomicReference atomicReference, int i10, final kb.b[] bVarArr, final String str, final AtomicBoolean atomicBoolean, final d9 d9Var, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            post(bVarArr[0]);
        } else if (constructor == -577333714) {
            final TdApi.WebPage webPage = (TdApi.WebPage) object;
            atomicReference.set(webPage);
            if (i10 == 0 || !t2.y2(webPage.instantViewVersion) || t2.l5(webPage)) {
                post(bVarArr[0]);
            } else {
                this.f27643a.v4().o(new TdApi.GetWebPageInstantView(str, false), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object2) {
                        hj.this.p5(bVarArr, atomicBoolean, d9Var, webPage, str, object2);
                    }
                });
            }
        }
    }

    public void r4(boolean z10, final long j10, final TdApi.ChatMemberStatus chatMemberStatus, v4 v4Var, boolean z11) {
        long fa2 = this.f27643a.fa();
        if (fa2 == 0) {
            return;
        }
        if (z10) {
            this.f27643a.v4().o(new TdApi.AddChatMember(j10, fa2, 0), this.f27643a.na());
            return;
        }
        Client.g na2 = this.f27643a.na();
        if (z11) {
            na2 = new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    hj.this.q4(j10, chatMemberStatus, object);
                }
            };
        }
        this.f27643a.v4().o(new TdApi.SetChatMemberStatus(j10, new TdApi.MessageSenderUser(fa2), chatMemberStatus), na2);
        if (!t2.i3(chatMemberStatus, false)) {
            U2(v4Var, j10);
        }
    }

    public boolean r5(v4 v4Var, String str, q qVar, View view, int i10) {
        if (i10 == R.id.btn_copyLink) {
            j0.i(str, R.string.CopiedLink);
            return true;
        } else if (i10 != R.id.btn_open) {
            return true;
        } else {
            E7(v4Var, str, qVar);
            return true;
        }
    }

    public boolean r6(boolean z10, long j10, final kb.i iVar, View view, int i10) {
        if (i10 == R.id.btn_removeChatFromList) {
            if (z10) {
                this.f27643a.d2(new TdApi.MessageSenderUser(j10), true, new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        i.this.a(false);
                    }
                });
            } else {
                iVar.a(false);
            }
        }
        return true;
    }

    public static void s4(kb.i iVar, int i10, SparseIntArray sparseIntArray) {
        iVar.a(sparseIntArray.get(R.id.btn_removeChatFromList) == R.id.btn_removeChatFromList);
    }

    public static void s5(d9 d9Var, TdApi.DeepLinkInfo deepLinkInfo) {
        v4<?> F = d9Var.t().Q1().F();
        if (F != null) {
            F.ld(deepLinkInfo);
        }
    }

    public void s6(final long j10, v4 v4Var, boolean z10, String str, long j11, final boolean z11, final kb.i iVar) {
        CharSequence m12;
        if (this.f27643a.o7(j10)) {
            m12 = w.H0(v4Var, R.string.DeleteSavedMessagesConfirm, new Object[0]);
        } else if (z10) {
            if (this.f27643a.i7(ob.a.c(j10))) {
                m12 = w.H0(v4Var, R.string.DeleteAndStopRepliesConfirm, new Object[0]);
            } else {
                m12 = w.m1(R.string.DeleteAndStopBotConfirm, str);
            }
        } else if (this.f27643a.i7(ob.a.c(j10))) {
            m12 = w.H0(v4Var, R.string.DeleteRepliesConfirm, new Object[0]);
        } else {
            m12 = w.m1(R.string.DeleteUserChatConfirm, str);
        }
        CharSequence charSequence = m12;
        if (this.f27643a.J2(j11)) {
            v4Var.me(new f2(R.id.btn_removeChatFromList).c(false).b(charSequence).p(new ra[]{new ra(12, (int) R.id.btn_clearChatHistory, 0, (CharSequence) w.j1(R.string.DeleteSecretChatHistoryForOtherParty, str), (int) R.id.btn_clearChatHistory, false)}).q(R.id.theme_color_textNegative).r(R.string.Delete).j(new v4.r() {
                @Override
                public final void l6(int i10, SparseIntArray sparseIntArray) {
                    hj.this.p6(z11, j10, iVar, i10, sparseIntArray);
                }
            }));
            return;
        }
        int[] iArr = {R.id.btn_removeChatFromList, R.id.btn_cancel};
        String[] strArr = new String[2];
        strArr[0] = w.i1(z10 ? R.string.DeleteAndStop : R.string.DeleteChat);
        strArr[1] = w.i1(R.string.Cancel);
        v4Var.ee(charSequence, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean r62;
                r62 = hj.this.r6(z11, j10, iVar, view, i10);
                return r62;
            }
        });
    }

    public static boolean t4(int i10, kb.i iVar, View view, int i11) {
        if (i11 != i10) {
            return true;
        }
        iVar.a(false);
        return true;
    }

    public void t5(final d9 d9Var, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.y0(R.string.DeepLinkUnsupported, 0);
        } else if (constructor == 1864081662) {
            final TdApi.DeepLinkInfo deepLinkInfo = (TdApi.DeepLinkInfo) object;
            this.f27643a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    hj.s5(d9.this, deepLinkInfo);
                }
            });
        }
    }

    public static void t6(long j10, kb.i iVar, TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.e("Cannot clear secret chat history, secretChatId:%d, error: %s", Integer.valueOf(ob.a.n(j10)), t2.z5(object));
        }
        iVar.a(false);
    }

    public static void u4(v4 v4Var, TdApi.Object object, d9 d9Var, q qVar) {
        if (v4Var != null && !v4Var.Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -1816236758) {
                dd.i.V1(d9Var, (TdApi.StickerSet) object);
            } else if (constructor == -1679978726) {
                E8(d9Var.c(), R.drawable.baseline_warning_24, t2.z5(object), qVar);
            } else if (constructor == 1207538697) {
                dd.i.W1(d9Var, (TdApi.StickerSetInfo) object);
            }
        }
    }

    public static void u5(kb.j jVar, long j10) {
        jVar.a(new TdApi.MessageSchedulingStateSendAtDate((int) (j10 / 1000)));
    }

    public void u6(final long j10, final kb.i iVar, int i10, SparseIntArray sparseIntArray) {
        if (sparseIntArray.get(R.id.btn_clearChatHistory) == R.id.btn_clearChatHistory) {
            this.f27643a.v4().o(new TdApi.DeleteChatHistory(j10, false, false), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    hj.t6(j10, iVar, object);
                }
            });
        } else {
            iVar.a(false);
        }
    }

    public static void v4(final d9 d9Var, final v4 v4Var, final q qVar, final TdApi.Object object) {
        d9Var.c().hd().post(new Runnable() {
            @Override
            public final void run() {
                hj.u4(v4.this, object, d9Var, qVar);
            }
        });
    }

    public boolean v5(final kb.j jVar, boolean z10, v4 v4Var, ae.p pVar, View view, int i10) {
        long j10;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (i10) {
            case R.id.btn_sendNoSound:
                jVar.a(null);
                return true;
            case R.id.btn_sendOnceOnline:
                jVar.a(new TdApi.MessageSchedulingStateSendWhenOnline());
                return true;
            case R.id.btn_sendScheduled:
            default:
                j10 = 0;
                break;
            case R.id.btn_sendScheduled2Hr:
                j10 = TimeUnit.HOURS.toSeconds(2L);
                break;
            case R.id.btn_sendScheduled30Min:
                j10 = TimeUnit.MINUTES.toSeconds(30L);
                break;
            case R.id.btn_sendScheduled8Hr:
                j10 = TimeUnit.HOURS.toSeconds(8L);
                break;
            case R.id.btn_sendScheduledCustom:
                if (z10) {
                    i11 = R.string.SendReminder;
                    i14 = R.string.RemindTodayAt;
                    i13 = R.string.RemindTomorrowAt;
                    i12 = R.string.RemindDateAt;
                } else {
                    i11 = R.string.SendSchedule;
                    i14 = R.string.SendTodayAt;
                    i13 = R.string.SendTomorrowAt;
                    i12 = R.string.SendDateAt;
                }
                v4Var.Xd(w.i1(i11), i14, i13, i12, new kb.l() {
                    @Override
                    public final void a(long j11) {
                        hj.u5(j.this, j11);
                    }
                }, pVar);
                return true;
        }
        if (j10 > 0) {
            jVar.a(new TdApi.MessageSchedulingStateSendAtDate((int) ((this.f27643a.H4() / 1000) + j10)));
        }
        return true;
    }

    public static boolean v6(TdApi.Message[] messageArr, o6 o6Var, Runnable runnable, View view, int i10) {
        if (i10 != R.id.menu_btn_delete) {
            return true;
        }
        k0.e<long[]> M1 = t2.M1(messageArr);
        for (int i11 = 0; i11 < M1.p(); i11++) {
            o6Var.P4(M1.j(i11), M1.q(i11), false);
        }
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    public static void v8(v4<?> v4Var, TdApi.Message message) {
        w8(v4Var, new TdApi.Message[]{message}, null);
    }

    public void w4(d9 d9Var, TdApi.BankCardInfo bankCardInfo, String str) {
        TdApi.BankCardActionOpenUrl[] bankCardActionOpenUrlArr;
        v4<?> s10 = d9Var instanceof v4 ? (v4) d9Var : j0.s();
        boolean z10 = bankCardInfo.actions.length > 0;
        if (!(s10 == null || s10.Sa())) {
            jb.c cVar = new jb.c(z10 ? 1 : bankCardInfo.actions.length);
            u0 u0Var = new u0(z10 ? 1 : bankCardInfo.actions.length);
            int[] iArr = null;
            if (z10) {
                for (TdApi.BankCardActionOpenUrl bankCardActionOpenUrl : bankCardInfo.actions) {
                    cVar.a(R.id.btn_openLink);
                    u0Var.b(bankCardActionOpenUrl.text);
                }
            } else {
                cVar.a(R.id.btn_copyLink);
                u0Var.a(R.string.CopyBankCard);
                iArr = new int[]{R.drawable.baseline_content_copy_24};
            }
            s10.ee(bankCardInfo.title, cVar.e(), u0Var.d(), null, iArr, new i(str, z10, bankCardInfo));
        }
    }

    public boolean w6(Runnable runnable, v4 v4Var, long j10, Runnable runnable2, View view, int i10) {
        if (i10 == R.id.btn_clearChatHistory) {
            s8(v4Var, j10, runnable2);
            return true;
        } else if (i10 != R.id.btn_removeChatFromList) {
            return true;
        } else {
            runnable.run();
            return true;
        }
    }

    public static void w8(v4<?> v4Var, final TdApi.Message[] messageArr, final Runnable runnable) {
        boolean z10;
        String str;
        int i10;
        int i11;
        if (v4Var != null && messageArr != null && messageArr.length > 0 && !R2(v4Var, messageArr, runnable) && !S2(v4Var, messageArr, runnable)) {
            final o6 c10 = v4Var.c();
            long Q0 = t2.Q0(messageArr);
            int length = messageArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    z10 = true;
                    break;
                } else if (!t2.A3(messageArr[i12])) {
                    z10 = false;
                    break;
                } else {
                    i12++;
                }
            }
            if (messageArr.length == 1) {
                if (z10) {
                    i11 = c10.k7(Q0) ? R.string.DeleteReminder : R.string.DeleteScheduled;
                } else {
                    i11 = c10.k7(Q0) ? R.string.DeleteMessage : R.string.DeleteForMe;
                }
                str = w.i1(i11);
            } else {
                if (z10) {
                    i10 = c10.k7(Q0) ? R.string.DeleteXReminders : R.string.DeleteXScheduled;
                } else {
                    i10 = c10.k7(Q0) ? R.string.DeleteXMessages : R.string.DeleteXForMe;
                }
                str = w.o2(i10, messageArr.length);
            }
            if (!z10) {
                int length2 = messageArr.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        break;
                    } else if (!messageArr[i13].canBeDeletedOnlyForSelf) {
                        str = ob.a.l(Q0) ? w.j1(R.string.DeleteForMeAndX, c10.e2().C2(c10.h4(Q0))) : w.i1(R.string.DeleteForEveryone);
                    } else {
                        i13++;
                    }
                }
            }
            v4Var.ee(null, new int[]{R.id.menu_btn_delete, R.id.btn_cancel}, new String[]{str, w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i14) {
                    return g0.b(this, i14);
                }

                @Override
                public final boolean r3(View view, int i14) {
                    boolean v62;
                    v62 = hj.v6(messageArr, c10, runnable, view, i14);
                    return v62;
                }
            });
        }
    }

    public void x4(final d9 d9Var, final String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -2116647730) {
            final TdApi.BankCardInfo bankCardInfo = (TdApi.BankCardInfo) object;
            this.f27643a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    hj.this.w4(d9Var, bankCardInfo, str);
                }
            });
        } else if (constructor == -1679978726) {
            j0.t0(object);
        }
    }

    public boolean x6(r rVar, Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_done) {
            return true;
        }
        z.u().T(this.f27643a, rVar.c(), rVar.m(), runnable);
        return true;
    }

    public void y5(TdApi.Document document, final kb.j jVar, Runnable runnable) {
        FileInputStream fileInputStream;
        final k kVar;
        try {
            fileInputStream = new FileInputStream(document.document.local.path);
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(fileInputStream, "UTF-8");
            kVar = new k(document);
            while (newPullParser.next() != 1) {
                if (newPullParser.getEventType() == 2) {
                    String name = newPullParser.getName();
                    if ("resources".equals(name)) {
                        Q7(newPullParser, kVar);
                    } else {
                        throw new IllegalArgumentException("Unknown tag: " + name);
                    }
                }
            }
        } catch (Throwable th) {
            Log.e("Cannot install custom language", th, new Object[0]);
        }
        if (kVar.a()) {
            kVar.m();
            this.f27643a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    j.this.a(kVar);
                }
            });
            fileInputStream.close();
            return;
        }
        fileInputStream.close();
        hj hd2 = this.f27643a.hd();
        if (runnable == null) {
            runnable = mc.f27973a;
        }
        hd2.post(runnable);
    }

    public void y6(long j10, v4 v4Var, Runnable runnable) {
        this.f27643a.O4(j10, false, null);
        U2(v4Var, j10);
        v0.D2(runnable);
    }

    public void z4(d9 d9Var, final j jVar, TdApi.Function function, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            d6(function, (TdApi.Error) object, jVar);
            if (jVar != null) {
                this.f27643a.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        hj.j.a(hj.j.this);
                    }
                });
            }
        } else if (constructor == -1601123095) {
            C4(d9Var, this.f27643a.ma(object), jVar);
        } else if (constructor == -1035719349) {
            h7(d9Var, ((TdApi.SupergroupFullInfo) object).linkedChatId, jVar);
        }
    }

    public static boolean z6(Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_delete) {
            return true;
        }
        runnable.run();
        return true;
    }

    public void A2(v4<?> v4Var, TdApi.Contact contact) {
        if (contact != null) {
            TdApi.User u22 = contact.userId != 0 ? this.f27643a.e2().u2(contact.userId) : null;
            if (u22 != null) {
                C2(v4Var, u22, contact.phoneNumber);
                return;
            }
            fk fkVar = new fk(v4Var.t(), v4Var.c());
            fkVar.vg(2);
            fkVar.rg(contact.phoneNumber, contact.firstName, contact.lastName);
            v4Var.bc().h0(fkVar);
        }
    }

    public void A3(v4<?> v4Var, final long j10, final TdApi.MessageSender messageSender, final TdApi.ChatMemberStatus chatMemberStatus) {
        if (messageSender.getConstructor() != -239660751) {
            if (ob.a.d(j10) == 973884508) {
                v4Var.ee(w.m1(R.string.MemberCannotJoinRegularGroup, this.f27643a.Db(messageSender, true)), new int[]{R.id.btn_blockSender, R.id.btn_cancel}, new String[]{w.i1(R.string.RemoveFromGroup), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view, int i10) {
                        boolean p42;
                        p42 = hj.this.p4(j10, messageSender, chatMemberStatus, view, i10);
                        return p42;
                    }
                });
                return;
            }
            final ra raVar = new ra(28, 0, 0, c3(j10, messageSender, true), false);
            v4Var.me(new f2(R.id.btn_blockSender).a(raVar).j(new v4.r() {
                @Override
                public final void l6(int i10, SparseIntArray sparseIntArray) {
                    hj.this.n4(chatMemberStatus, j10, messageSender, i10, sparseIntArray);
                }
            }).n(new v4.n() {
                @Override
                public final void a(View view, int i10, ra raVar2, TextView textView, iq iqVar) {
                    hj.this.o4(raVar, j10, messageSender, view, i10, raVar2, textView, iqVar);
                }
            }).p(new ra[]{new ra(12, (int) R.id.right_readMessages, 0, (int) R.string.BanMember, true)}).r(R.string.RemoveMember).q(R.id.theme_color_textNegative));
        }
    }

    public void A7(d9 d9Var, TdApi.Message message) {
        z7(d9Var, message.chatId, new ob.d(message.chatId, message.f19946id));
    }

    public void A8(final v4<?> v4Var, final TdApi.ChatInviteLink chatInviteLink, final long j10, boolean z10, boolean z11, final Runnable runnable, final kb.j<TdApi.ChatInviteLinks> jVar) {
        TdApi.Chat W2 = this.f27643a.W2(j10);
        u0 u0Var = new u0(6);
        jb.c cVar = new jb.c(6);
        jb.c cVar2 = new jb.c(6);
        jb.c cVar3 = new jb.c(6);
        if (!z11 && chatInviteLink.memberCount > 0) {
            cVar2.a(R.id.btn_viewInviteLinkMembers);
            u0Var.a(R.string.InviteLinkViewMembers);
            cVar.a(R.drawable.baseline_visibility_24);
            cVar3.a(1);
        }
        if (!z11 && chatInviteLink.createsJoinRequest && chatInviteLink.pendingJoinRequestCount > 0) {
            cVar2.a(R.id.btn_manageJoinRequests);
            u0Var.a(R.string.InviteLinkViewRequests);
            cVar.a(R.drawable.baseline_pending_24);
            cVar3.a(1);
        }
        if (z10 && this.f27643a.C2(W2)) {
            cVar2.a(R.id.btn_manageInviteLinks);
            u0Var.a(R.string.InviteLinkManage);
            cVar.a(R.drawable.baseline_add_link_24);
            cVar3.a(1);
        }
        if (z11 || chatInviteLink.isRevoked) {
            cVar2.a(R.id.btn_copyLink);
            u0Var.a(R.string.InviteLinkCopy);
            cVar.a(R.drawable.baseline_content_copy_24);
            cVar3.a(1);
            if (!z11) {
                cVar.a(R.drawable.baseline_delete_24);
                cVar2.a(R.id.btn_deleteLink);
                u0Var.a(R.string.InviteLinkDelete);
                cVar3.a(2);
            }
        } else {
            if (!chatInviteLink.isPrimary && (v4Var instanceof p0)) {
                cVar2.a(R.id.btn_edit);
                u0Var.a(R.string.InviteLinkEdit);
                cVar.a(R.drawable.baseline_edit_24);
                cVar3.a(1);
            }
            cVar2.a(R.id.btn_copyLink);
            u0Var.a(R.string.InviteLinkCopy);
            cVar.a(R.drawable.baseline_content_copy_24);
            cVar3.a(1);
            cVar2.a(R.id.btn_shareLink);
            u0Var.a(R.string.ShareLink);
            cVar.a(R.drawable.baseline_forward_24);
            cVar3.a(1);
            cVar.a(R.drawable.baseline_link_off_24);
            cVar2.a(R.id.btn_revokeLink);
            u0Var.a(R.string.RevokeLink);
            cVar3.a(2);
        }
        CharSequence p42 = t2.p4(w.h1(R.string.CreatedByXOnDate, new w.f() {
            @Override
            public final Object a(CharSequence charSequence, int i10, int i11, int i12, boolean z12) {
                Object A6;
                A6 = hj.A6(v4.this, chatInviteLink, charSequence, i10, i11, i12, z12);
                return A6;
            }
        }, v4Var.c().e2().J2(chatInviteLink.creatorUserId), w.Z0(chatInviteLink.date, TimeUnit.SECONDS)));
        vi viVar = vi.f28594a;
        String str = chatInviteLink.name;
        v4Var.ee((str == null || str.isEmpty()) ? w.h1(R.string.format_nameAndStatus, viVar, chatInviteLink.inviteLink, p42) : w.h1(R.string.format_nameAndSubtitleAndStatus, viVar, chatInviteLink.inviteLink, chatInviteLink.name, p42), cVar2.e(), u0Var.d(), cVar3.e(), cVar.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean G6;
                G6 = hj.this.G6(v4Var, j10, chatInviteLink, runnable, jVar, view, i10);
                return G6;
            }
        });
    }

    public void B2(v4<?> v4Var, TdApi.User user) {
        if (user != null) {
            C2(v4Var, user, ib.i.i(user.phoneNumber) ? null : user.phoneNumber);
        }
    }

    public void B7(d9 d9Var, long j10, j jVar) {
        g7(d9Var, ob.a.b(j10), new TdApi.CreateSupergroupChat(j10, false), jVar);
    }

    public void B8(final v4<?> v4Var, final TdApi.ChatInviteLink chatInviteLink, final long j10, final boolean z10, final Runnable runnable, final kb.j<TdApi.ChatInviteLinks> jVar) {
        v4Var.c().rb(new TdApi.GetChatInviteLink(j10, chatInviteLink.inviteLink), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.this.I6(v4Var, j10, z10, runnable, jVar, chatInviteLink, object);
            }
        });
    }

    public void C2(v4<?> v4Var, TdApi.User user, String str) {
        if (user != null) {
            a7 a7Var = new a7(v4Var.t(), v4Var.c());
            a7Var.uf(3);
            a7Var.vf(user);
            a7Var.tf(str);
            v4Var.bc().h0(a7Var);
        }
    }

    public kb.b C7(v4<?> v4Var) {
        final TdApi.Chat[] chatArr = new TdApi.Chat[1];
        final TdApi.Error[] errorArr = new TdApi.Error[1];
        final a aVar = new a(chatArr, v4Var, errorArr);
        this.f27643a.v4().o(new TdApi.GetSupportUser(), this.f27643a.yc());
        final j2[] j2VarArr = {v4Var.ee(ce.c0.l(v4Var, w.i1(R.string.AskAQuestionInfo), new o.a() {
            @Override
            public final boolean a(View view, o oVar) {
                boolean S4;
                S4 = hj.S4(j2VarArr, view, oVar);
                return S4;
            }
        }), new int[]{R.id.btn_openChat, R.id.btn_cancel}, u0.c(R.string.AskButton, R.string.Cancel), new int[]{3, 1}, new int[]{R.drawable.baseline_help_24, R.drawable.baseline_cancel_24}, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean V4;
                V4 = hj.this.V4(chatArr, aVar, errorArr, view, i10);
                return V4;
            }
        })};
        return aVar;
    }

    public void C8(final v4<?> v4Var, final k kVar, TdApi.Message message) {
        String str;
        TdApi.Chat chat;
        if (message != null) {
            TdApi.MessageForwardInfo messageForwardInfo = message.forwardInfo;
            if (messageForwardInfo == null || messageForwardInfo.origin.getConstructor() != 1490730723) {
                chat = (!message.isOutgoing || message.isChannelPost) ? this.f27643a.W2(message.chatId) : null;
            } else {
                chat = this.f27643a.W2(((TdApi.MessageForwardOriginChannel) message.forwardInfo.origin).chatId);
            }
            if (chat != null) {
                String j42 = this.f27643a.j4(chat.f19908id);
                if (!ib.i.i(j42)) {
                    kVar.n("@" + j42);
                } else {
                    kVar.n(this.f27643a.W3(chat));
                }
            }
        }
        Object[] objArr = new Object[6];
        objArr[0] = kVar.h(R.string.language_name);
        objArr[1] = kVar.h(R.string.language_nameInEnglish);
        objArr[2] = kVar.h(R.string.language_code);
        objArr[3] = kVar.h(R.string.language_dateFormatLocale);
        objArr[4] = Integer.valueOf(kVar.c());
        if (kVar.l()) {
            str = w.o2(R.string.xStrings, kVar.j());
        } else {
            str = w.o2(R.string.xStrings, kVar.j()) + ", " + w.o2(R.string.TranslationsMissing, kVar.f());
        }
        objArr[5] = str;
        v4Var.ee(w.m1(R.string.LanguageInfo, objArr), new int[]{R.id.btn_messageApplyLocalization, R.id.btn_cancel}, new String[]{w.i1(R.string.LanguageInstall), w.i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_language_24, R.drawable.baseline_cancel_24}, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean N6;
                N6 = hj.this.N6(v4Var, kVar, view, i10);
                return N6;
            }
        });
    }

    public void D2(long j10, jb.c cVar, u0 u0Var, boolean z10, boolean z11) {
        TdApi.Chat W2 = this.f27643a.W2(j10);
        if (W2 != null) {
            int d10 = ob.a.d(j10);
            int i10 = R.string.returnToGroup;
            int i11 = R.string.LeaveMegaMenu;
            switch (d10) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    if (z10 && this.f27643a.p2(W2)) {
                        cVar.a(R.id.btn_clearChatHistory);
                        u0Var.a(R.string.ClearHistory);
                    }
                    TdApi.ChatMemberStatus O3 = this.f27643a.O3(j10);
                    if (this.f27643a.c3(W2)) {
                        cVar.a(R.id.btn_removeChatFromList);
                        if (this.f27643a.O6(j10)) {
                            i11 = R.string.LeaveChannel;
                        }
                        u0Var.a(i11);
                        return;
                    } else if (!t2.T(O3)) {
                        return;
                    } else {
                        if (O3.getConstructor() != -5815259 || (!this.f27643a.g7(j10) && !this.f27643a.w7(j10))) {
                            cVar.a(R.id.btn_returnToChat);
                            if (this.f27643a.O6(j10)) {
                                i10 = R.string.returnToChannel;
                            }
                            u0Var.a(i10);
                            return;
                        } else if (z11) {
                            cVar.a(R.id.btn_returnToChat);
                            u0Var.a(this.f27643a.O6(j10) ? R.string.JoinChannel : R.string.JoinChat);
                            return;
                        } else {
                            return;
                        }
                    }
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    if (z10 && this.f27643a.o2(j10)) {
                        cVar.a(R.id.btn_clearChatHistory);
                        u0Var.a(R.string.ClearHistory);
                    }
                    if (this.f27643a.Gc(W2)) {
                        cVar.a(R.id.btn_removeChatFromListAndStop);
                        u0Var.a(R.string.DeleteAndStop);
                        return;
                    }
                    cVar.a(R.id.btn_removeChatFromList);
                    u0Var.a(R.string.DeleteChat);
                    return;
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    if (z10 && this.f27643a.p2(W2)) {
                        cVar.a(R.id.btn_clearChatHistory);
                        u0Var.a(R.string.ClearHistory);
                    }
                    TdApi.BasicGroup a42 = this.f27643a.a4(j10);
                    TdApi.ChatMemberStatus O32 = this.f27643a.O3(j10);
                    if (this.f27643a.c3(W2) && O32 != null) {
                        if (t2.i3(O32, false) || (a42 != null && !a42.isActive)) {
                            cVar.a(R.id.btn_removeChatFromList);
                            u0Var.a(R.string.LeaveMegaMenu);
                        } else {
                            cVar.a(R.id.btn_removeChatFromList);
                            u0Var.a(R.string.DeleteChat);
                        }
                        if (!t2.T(O32)) {
                            return;
                        }
                        if (a42 == null || a42.isActive) {
                            cVar.a(R.id.btn_returnToChat);
                            u0Var.a(R.string.returnToGroup);
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

    public void D7(final d9 d9Var, final String str, final q qVar, final kb.i iVar) {
        if (!ib.i.i(str) && !this.f27643a.F4().k1()) {
            this.f27643a.v4().o(new TdApi.GetInternalLinkType(str), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    hj.this.j5(d9Var, qVar, str, iVar, object);
                }
            });
        } else if (iVar != null) {
            iVar.a(false);
        }
    }

    public void D8(final d9 d9Var, final TdApi.LanguagePackInfo languagePackInfo) {
        final v4<?> F = d9Var.t().Q1().F();
        if (F != null && !F.Sa()) {
            if (w.k2().equals(languagePackInfo.f19945id)) {
                F.ee(ce.c0.l(d9Var, w.j1(R.string.LanguageSame, languagePackInfo.name), null), new int[]{R.id.btn_done, R.id.btn_settings}, new String[]{w.i1(R.string.OK), w.i1(R.string.Settings)}, null, new int[]{R.drawable.baseline_check_circle_24, R.drawable.baseline_settings_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view, int i10) {
                        boolean J6;
                        J6 = hj.J6(v4.this, d9Var, view, i10);
                        return J6;
                    }
                });
            } else {
                F.ee(ce.c0.l(d9Var, w.j1(languagePackInfo.isOfficial ? R.string.LanguageAlert : R.string.LanguageCustomAlert, languagePackInfo.name, Integer.valueOf((int) Math.floor((languagePackInfo.translatedStringCount / languagePackInfo.totalStringCount) * 100.0f)), languagePackInfo.translationUrl), null), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{w.i1(R.string.LanguageChange), w.i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_language_24, R.drawable.baseline_cancel_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view, int i10) {
                        boolean M6;
                        M6 = hj.M6(d9.this, languagePackInfo, view, i10);
                        return M6;
                    }
                });
            }
        }
    }

    public void E2(final d9 d9Var, boolean z10) {
        final v4<?> F = d9Var.t().Q1().F();
        if (F != null) {
            boolean L1 = this.f27643a.L1();
            int i10 = 4;
            jb.c cVar = new jb.c(L1 ? 4 : 3);
            if (!L1) {
                i10 = 3;
            }
            u0 u0Var = new u0(i10);
            cVar.a(R.id.btn_proxyTelegram);
            cVar.a(R.id.btn_proxySocks5);
            cVar.a(R.id.btn_proxyHttp);
            if (z10) {
                u0Var.a(R.string.AddMtprotoProxy);
                u0Var.a(R.string.AddSocks5Proxy);
                u0Var.a(R.string.AddHttpProxy);
            } else {
                u0Var.a(R.string.MtprotoProxy);
                u0Var.a(R.string.Socks5Proxy);
                u0Var.a(R.string.HttpProxy);
            }
            if (L1) {
                cVar.a(R.id.btn_proxyQr);
                u0Var.a(R.string.ScanQR);
            }
            h0 ugVar = new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i11) {
                    return g0.b(this, i11);
                }

                @Override
                public final boolean r3(View view, int i11) {
                    boolean F3;
                    F3 = hj.this.F3(d9Var, F, view, i11);
                    return F3;
                }
            };
            String str = null;
            if (cVar.g() == 1) {
                ugVar.r3(null, cVar.d(0));
                return;
            }
            if (z10) {
                str = w.i1(R.string.ProxyInfo);
            }
            F.ce(str, cVar.e(), u0Var.d(), ugVar);
        }
    }

    public void E7(final d9 d9Var, final String str, final q qVar) {
        D7(d9Var, str, qVar, new kb.i() {
            @Override
            public final void a(boolean z10) {
                hj.this.k5(d9Var, str, qVar, z10);
            }
        });
    }

    public final void G3(final d9 d9Var, final long j10) {
        if (ya.j1()) {
            this.f27643a.db(new Runnable() {
                @Override
                public final void run() {
                    hj.this.G3(d9Var, j10);
                }
            });
            return;
        }
        o4 o4Var = new o4(d9Var.t(), d9Var.c());
        o4Var.hk(new o4.h(c0.i(this.f27643a), new b(j10)));
        d9Var.t().Q1().h0(o4Var);
    }

    public final void l5(final zd.d9 r20, final java.lang.String r21, final zd.hj.q r22) {
        throw new UnsupportedOperationException("Method not decompiled: zd.hj.l5(zd.d9, java.lang.String, zd.hj$q):void");
    }

    public void F8(v4<?> v4Var, final int i10, final Runnable runnable) {
        j2 j2Var;
        if (!v4Var.Ta()) {
            v4Var.l8(new f(i10, runnable));
        } else if (i10 != 0 || (j2Var = this.f27644b) == null || j2Var.getContext() != v4Var.t()) {
            f2 f2Var = new f2(R.id.btn_mapProvider);
            if (i10 == 0) {
                f2Var.b(w.i1(R.string.MapPreviewProviderHint));
                f2Var.g(new j2.f() {
                    @Override
                    public final void h3(j2 j2Var2) {
                        hj.this.P6(j2Var2);
                    }

                    @Override
                    public void w(j2 j2Var2) {
                        k2.a(this, j2Var2);
                    }
                });
            }
            int g12 = he.i.c2().g1(i10 == 2);
            if (i10 == 2) {
                ra[] raVarArr = new ra[1];
                raVarArr[0] = new ra(13, (int) R.id.btn_mapProviderTelegram, 0, (int) R.string.MapPreviewProviderTelegram, (int) R.id.btn_mapProvider, g12 == 1);
                f2Var.p(raVarArr);
            } else {
                ra[] raVarArr2 = new ra[2];
                raVarArr2[0] = new ra(13, (int) R.id.btn_mapProviderTelegram, 0, (int) R.string.MapPreviewProviderTelegram, (int) R.id.btn_mapProvider, g12 == 1 || (g12 == -1 && i10 == 0));
                raVarArr2[1] = new ra(13, (int) R.id.btn_mapProviderNone, 0, (int) R.string.MapPreviewProviderNone, (int) R.id.btn_mapProvider, g12 == 0);
                f2Var.p(raVarArr2);
            }
            e2 me2 = v4Var.me(f2Var.r(R.string.Save).j(new v4.r() {
                @Override
                public final void l6(int i11, SparseIntArray sparseIntArray) {
                    hj.this.Q6(i10, runnable, i11, sparseIntArray);
                }
            }));
            if (i10 != 0) {
                return;
            }
            if (me2 != null) {
                this.f27644b = me2.f24138e;
                ArrayList arrayList = new ArrayList();
                this.f27645c = arrayList;
                arrayList.add(runnable);
                return;
            }
            this.f27644b = null;
            this.f27645c = null;
        } else if (runnable != null) {
            this.f27645c.add(runnable);
        }
    }

    public void H3(final d9 d9Var, final w2 w2Var, final boolean z10) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(new Runnable() {
                @Override
                public final void run() {
                    hj.this.H3(d9Var, w2Var, z10);
                }
            });
            return;
        }
        o4 o4Var = new o4(d9Var.t(), d9Var.c());
        o6 o6Var = this.f27643a;
        o4Var.hk(new o4.h(z10 ? c0.g(o6Var) : c0.i(o6Var), new c(z10, w2Var)));
        d9Var.t().Q1().h0(o4Var);
    }

    public void G7(final v4<?> v4Var, final String str, final q qVar) {
        v4Var.ee(str, new int[]{R.id.btn_open, R.id.btn_copyLink}, new String[]{w.i1(R.string.Open), w.i1(R.string.CopyLink)}, null, new int[]{R.drawable.baseline_open_in_browser_24, R.drawable.baseline_content_copy_24}, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean r52;
                r52 = hj.this.r5(v4Var, str, qVar, view, i10);
                return r52;
            }
        });
    }

    public void G8(v4<?> v4Var, long j10, boolean z10, Runnable runnable) {
        H8(v4Var, null, j10, z10, runnable);
    }

    public final void H2(final v4<?> v4Var, k kVar) {
        TdApi.LanguagePackString[] i10 = kVar.i();
        String d10 = kVar.d();
        final TdApi.LanguagePackInfo languagePackInfo = new TdApi.LanguagePackInfo(d10, w.a0(), kVar.e(), kVar.h(R.string.language_name), w.w(d10), false, "1".equals(kVar.h(R.string.language_rtl)), false, true, i10.length, i10.length, i10.length, null);
        v4Var.c().v4().o(new TdApi.SetCustomLanguagePack(languagePackInfo, i10), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.J3(v4.this, languagePackInfo, object);
            }
        });
    }

    public void H7(d9 d9Var, TdApi.InternalLinkTypeVideoChat internalLinkTypeVideoChat, q qVar) {
        g7(d9Var, 0L, new TdApi.SearchPublicChat(internalLinkTypeVideoChat.chatUsername), new j().s(qVar).t(internalLinkTypeVideoChat).h().l());
    }

    public final void H8(final ud.v4<?> r26, final org.drinkless.td.libcore.telegram.TdApi.NotificationSettingsScope r27, final long r28, boolean r30, final java.lang.Runnable r31) {
        throw new UnsupportedOperationException("Method not decompiled: zd.hj.H8(ud.v4, org.drinkless.td.libcore.telegram.TdApi$NotificationSettingsScope, long, boolean, java.lang.Runnable):void");
    }

    public final java.lang.String I7(final zd.d9 r9, java.lang.String r10, android.net.Uri r11) {
        throw new UnsupportedOperationException("Method not decompiled: zd.hj.I7(zd.d9, java.lang.String, android.net.Uri):java.lang.String");
    }

    public void I8(v4<?> v4Var, TdApi.NotificationSettingsScope notificationSettingsScope, boolean z10) {
        H8(v4Var, notificationSettingsScope, 0L, z10, null);
    }

    public boolean J7(final v4<?> v4Var, final kb.j<TdApi.MessageSchedulingState> jVar, long j10, boolean z10, boolean z11, final ae.p pVar) {
        if (ob.a.j(j10)) {
            return false;
        }
        final boolean k72 = this.f27643a.k7(j10);
        int i10 = 4;
        if (z10) {
            i10 = 5;
        }
        if (z11) {
            i10++;
        }
        jb.c cVar = new jb.c(i10);
        u0 u0Var = new u0(i10);
        jb.c cVar2 = new jb.c(i10);
        if (z11) {
            cVar.a(R.id.btn_sendNoSound);
            u0Var.a(R.string.SendNoSound);
            cVar2.a(R.drawable.baseline_notifications_off_24);
        }
        if (z10) {
            cVar.a(R.id.btn_sendOnceOnline);
            u0Var.a(R.string.SendOnceOnline);
            cVar2.a(R.drawable.baseline_visibility_24);
        }
        cVar.a(R.id.btn_sendScheduled30Min);
        u0Var.b(w.o2(k72 ? R.string.RemindInXMinutes : R.string.SendInXMinutes, 30L));
        cVar2.a(R.drawable.baseline_schedule_24);
        cVar.a(R.id.btn_sendScheduled2Hr);
        int i11 = R.string.RemindInXHours;
        u0Var.b(w.o2(k72 ? R.string.RemindInXHours : R.string.SendInXHours, 2L));
        cVar2.a(R.drawable.baseline_schedule_24);
        cVar.a(R.id.btn_sendScheduled8Hr);
        if (!k72) {
            i11 = R.string.SendInXHours;
        }
        u0Var.b(w.o2(i11, 8L));
        cVar2.a(R.drawable.baseline_schedule_24);
        cVar.a(R.id.btn_sendScheduledCustom);
        u0Var.b(w.i1(k72 ? R.string.RemindAtCustomTime : R.string.SendAtCustomTime));
        cVar2.a(R.drawable.baseline_date_range_24);
        v4Var.fe(null, cVar.e(), u0Var.d(), null, cVar2.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i12) {
                return g0.b(this, i12);
            }

            @Override
            public final boolean r3(View view, int i12) {
                boolean v52;
                v52 = hj.this.v5(jVar, k72, v4Var, pVar, view, i12);
                return v52;
            }
        }, pVar);
        return true;
    }

    public final void J8(v4<?> v4Var, long j10) {
        TdApi.Chat W2 = this.f27643a.W2(j10);
        if (W2 != null && this.f27643a.N2(W2)) {
            mi miVar = new mi(v4Var.t(), v4Var.c());
            miVar.df(new mi.b(W2, this.f27643a.A3(W2)));
            v4Var.ac(miVar);
        }
    }

    public final void K2(final d9 d9Var, final String str, final q qVar) {
        this.f27643a.v4().o(new TdApi.CheckChatInviteLink(str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.this.K3(d9Var, str, qVar, object);
            }
        });
    }

    public boolean K7(v4<?> v4Var, TdApi.ChatList chatList, long j10, p7 p7Var, int i10, Runnable runnable) {
        TdApi.Chat W2 = this.f27643a.W2(j10);
        if (W2 == null) {
            return false;
        }
        switch (i10) {
            case R.id.btn_archiveChat:
                this.f27643a.v4().o(new TdApi.AddChatToList(j10, ob.b.f19339b), this.f27643a.oa(runnable));
                return true;
            case R.id.btn_archiveUnarchiveChat:
                o8(v4Var, chatList, j10, runnable);
                return true;
            case R.id.btn_markChatAsRead:
                if (p7Var != null) {
                    this.f27643a.R9(p7Var.b(), p7Var.g(), runnable);
                } else {
                    this.f27643a.R9(W2.f19908id, 0L, runnable);
                }
                return true;
            case R.id.btn_markChatAsUnread:
                this.f27643a.S9(W2, runnable);
                return true;
            case R.id.btn_notifications:
                this.f27643a.hd().X8(v4Var, j10, false, runnable);
                return true;
            case R.id.btn_phone_call:
                this.f27643a.F4().c0().r0(v4Var, t2.n2(W2), null, true);
                return true;
            case R.id.btn_pinChat:
                this.f27643a.v4().o(new TdApi.ToggleChatIsPinned(chatList, j10, true), this.f27643a.oa(runnable));
                return true;
            case R.id.btn_pinUnpinChat:
                K8(v4Var, chatList, j10, runnable);
                return true;
            case R.id.btn_unarchiveChat:
                this.f27643a.v4().o(new TdApi.AddChatToList(j10, ob.b.f19338a), this.f27643a.oa(runnable));
                return true;
            case R.id.btn_unpinChat:
                this.f27643a.v4().o(new TdApi.ToggleChatIsPinned(chatList, j10, false), this.f27643a.oa(runnable));
                return true;
            default:
                return L7(v4Var, chatList, j10, i10, runnable);
        }
    }

    public final void K8(final v4<?> v4Var, final TdApi.ChatList chatList, final long j10, final Runnable runnable) {
        boolean C3 = this.f27643a.C3(chatList, j10);
        String U3 = this.f27643a.U3(j10);
        int[] iArr = new int[2];
        iArr[0] = C3 ? R.id.btn_unpinChat : R.id.btn_pinChat;
        iArr[1] = R.id.btn_cancel;
        String[] strArr = new String[2];
        strArr[0] = w.i1(C3 ? R.string.UnpinFromTop : R.string.PinToTop);
        strArr[1] = w.i1(R.string.Cancel);
        int[] iArr2 = new int[2];
        iArr2[0] = C3 ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24;
        iArr2[1] = R.drawable.baseline_cancel_24;
        v4Var.ee(U3, iArr, strArr, null, iArr2, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean S6;
                S6 = hj.this.S6(v4Var, chatList, j10, runnable, view, i10);
                return S6;
            }
        });
    }

    public boolean L7(v4<?> v4Var, TdApi.ChatList chatList, long j10, int i10, Runnable runnable) {
        switch (i10) {
            case R.id.btn_clearChatHistory:
                s8(v4Var, j10, runnable);
                return true;
            case R.id.btn_removeChatFromList:
            case R.id.btn_removeChatFromListAndStop:
                u8(v4Var, j10, false, i10 == R.id.btn_removeChatFromListAndStop, runnable);
                return true;
            case R.id.btn_removeChatFromListOrClearHistory:
                u8(v4Var, j10, true, false, runnable);
                return true;
            case R.id.btn_removePsaChatFromList:
                z8(v4Var, chatList, j10, runnable);
                return true;
            case R.id.btn_returnToChat:
                Z6(v4Var, j10, true, runnable);
                return true;
            case R.id.btn_setPasscode:
                J8(v4Var, j10);
                return true;
            default:
                return false;
        }
    }

    public boolean L8(v4<?> v4Var, long j10, boolean z10, final o oVar, ae.p pVar) {
        return J7(v4Var, new kb.j() {
            @Override
            public final void a(Object obj) {
                hj.T6(hj.o.this, (TdApi.MessageSchedulingState) obj);
            }
        }, j10, this.f27643a.e2().H2(this.f27643a.h4(j10)), z10, pVar);
    }

    public void M2(d9 d9Var, TdApi.AuthenticationCodeInfo authenticationCodeInfo, String str) {
        lj ljVar = new lj(d9Var.t(), d9Var.c());
        ljVar.bg(new lj.a(9, authenticationCodeInfo, ce.c0.w(str)));
        d9Var.t().Q1().h0(ljVar);
    }

    public void M7(v4<?> v4Var, final TdApi.Document document, final kb.j<k> jVar, final Runnable runnable) {
        if (I2(document)) {
            gd.l.a().b(new Runnable() {
                @Override
                public final void run() {
                    hj.this.y5(document, jVar, runnable);
                }
            });
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void M8(d9 d9Var, long j10) {
        this.f27643a.v4().o(new TdApi.GetStickerSet(j10), d7(d9Var, null));
    }

    public final m1.e N2(v4<?> v4Var, TdApi.ChatList chatList, long j10, p7 p7Var, jb.c cVar, jb.c cVar2, u0 u0Var, boolean z10, boolean z11, boolean z12, Runnable runnable) {
        TdApi.Chat W2 = this.f27643a.W2(j10);
        if (W2 == null) {
            return null;
        }
        TdApi.ChatPosition a10 = ob.b.a(W2, chatList);
        boolean z13 = z11 && runnable != null;
        if (z10) {
            if (this.f27643a.c3(W2)) {
                if (!this.f27643a.o7(t2.n2(W2))) {
                    boolean x32 = this.f27643a.x3(W2.f19908id);
                    cVar.a(R.id.btn_notifications);
                    u0Var.a(x32 ? R.string.Mute : R.string.Unmute);
                    cVar2.a(x32 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_24);
                }
                if (!z13 && a10 != null) {
                    cVar.a(R.id.btn_pinUnpinChat);
                    u0Var.a(a10.isPinned ? R.string.Unpin : R.string.Pin);
                    cVar2.a(a10.isPinned ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24);
                }
                boolean D2 = this.f27643a.D2(W2);
                cVar.a(D2 ? R.id.btn_markChatAsRead : R.id.btn_markChatAsUnread);
                u0Var.a(D2 ? R.string.MarkAsRead : R.string.MarkAsUnread);
                cVar2.a(D2 ? R.drawable.baseline_done_all_24 : R.drawable.baseline_unsubscribe_24);
                if (this.f27643a.l2(chatList, W2)) {
                    cVar.a(R.id.btn_archiveUnarchiveChat);
                    boolean z14 = chatList instanceof TdApi.ChatListArchive;
                    u0Var.a(z14 ? R.string.Unarchive : R.string.Archive);
                    cVar2.a(z14 ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24);
                }
                cVar.a(R.id.btn_removeChatFromListOrClearHistory);
                u0Var.a(R.string.Delete);
                cVar2.a(R.drawable.baseline_delete_24);
            } else if (a10 != null && (a10.source instanceof TdApi.ChatSourcePublicServiceAnnouncement)) {
                cVar.a(R.id.btn_removePsaChatFromList);
                u0Var.a(R.string.PsaHide);
                cVar2.a(R.drawable.baseline_delete_sweep_24);
            }
        }
        if (z13) {
            cVar.a(R.id.btn_selectChat);
            if (cVar.g() > 1) {
                u0Var.a(R.string.MoreChatOptions);
                cVar2.a(R.drawable.baseline_more_horiz_24);
            } else {
                u0Var.a(z12 ? R.string.Unselect : R.string.Select);
                cVar2.a(R.drawable.baseline_playlist_add_check_24);
            }
        }
        return new e(runnable, v4Var, chatList, j10, p7Var);
    }

    public void N7(v4<?> v4Var, TdApi.Document document, kb.j<m> jVar, Runnable runnable) {
        if (J2(document)) {
            O7(v4Var, document.document, jVar, runnable);
        } else {
            v0.D2(runnable);
        }
    }

    public void N8(d9 d9Var, String str, q qVar) {
        this.f27643a.v4().o(new TdApi.SearchStickerSet(str), d7(d9Var, qVar));
    }

    public ie.c0 O2(final v4<?> v4Var, final long j10, final kb.f fVar, final kb.f fVar2, final kb.j<List<c0.a>> jVar, final o oVar, final ae.p pVar) {
        return new ie.c0(new c0.c() {
            @Override
            public final List F3(View view) {
                List N3;
                N3 = hj.this.N3(fVar, j10, fVar2, jVar, view);
                return N3;
            }
        }, new c0.b() {
            @Override
            public final void I0(View view, View view2) {
                hj.this.P3(v4Var, oVar, j10, pVar, view, view2);
            }
        }, v4Var != null ? v4Var.Ba() : null, pVar);
    }

    public void O7(final v4<?> v4Var, final TdApi.File file, final kb.j<m> jVar, final Runnable runnable) {
        gd.l.a().b(new Runnable() {
            @Override
            public final void run() {
                hj.this.E5(file, jVar, runnable, v4Var);
            }
        });
    }

    public void P2(final v4<?> v4Var, final long j10) {
        if (this.f27643a.e2().z2(j10)) {
            v4Var.ee(w.m1(R.string.DeleteContactConfirm, this.f27643a.e2().J2(j10)), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.i1(R.string.Delete), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view, int i10) {
                    boolean Q3;
                    Q3 = hj.this.Q3(v4Var, j10, view, i10);
                    return Q3;
                }
            });
        }
    }

    public void P8(Context context, final TdApi.Chat chat) {
        O8(context, this.f27643a.T3(chat.f19908id), false, false, 0, new kb.j() {
            @Override
            public final void a(Object obj) {
                hj.this.U6(chat, (hj.p) obj);
            }
        });
    }

    public final void Q2(long j10) {
        j0.y0(R.string.DeletingPhotoWait, 0);
        this.f27643a.v4().o(new TdApi.DeleteProfilePhoto(j10), this.f27643a.Oa());
    }

    public final void R8(final d9 d9Var, final String str, final String str2, final int i10, final q qVar) {
        this.f27643a.v4().o(new TdApi.SearchPublicChat(str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.this.W6(d9Var, str, qVar, i10, str2, object);
            }
        });
    }

    public void S8(final d9 d9Var, long j10, boolean z10, final j jVar) {
        this.f27643a.v4().o(new TdApi.CreateNewSecretChat(j10), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.this.X6(d9Var, jVar, object);
            }
        });
    }

    public void T2(final v4<?> v4Var, final boolean z10, final l lVar) {
        CharSequence H0 = w.H0(v4Var, R.string.EraseDatabaseWarn, new Object[0]);
        CharSequence H02 = v4Var.c().F4().q1() ? w.H0(v4Var, R.string.EraseDatabaseMultiUser, new Object[0]) : null;
        if (H02 != null) {
            H0 = TextUtils.concat(H0, "\n\n", H02);
        }
        v4Var.re(H0, new kb.i() {
            @Override
            public final void a(boolean z11) {
                hj.this.g4(v4Var, lVar, z10, z11);
            }
        });
    }

    public void U2(v4<?> v4Var, long j10) {
        u1 M = v4Var.t().Q1().M();
        v4<?> l10 = M.l();
        if (M.C() > 1 && v4Var.C9() == j10) {
            if (l10 == v4Var || (l10 != null && l10.C9() == j10)) {
                for (int C = M.C() - 2; C >= 1 && !(M.j(C) instanceof o4); C--) {
                    M.c(C);
                }
                l10.Ld(false);
                l10.Zb();
            }
        }
    }

    public void U8(d9 d9Var) {
        E7(d9Var, w.u1(R.string.url_betaSubscription, new Object[0]), null);
    }

    public void V2(final v4<?> v4Var, final r rVar, final boolean z10, final boolean z11) {
        final String d10 = rVar.d();
        int V = z.V(rVar.c());
        String N1 = he.i.c2().N1(V);
        if (!rVar.k() || !he.i.c2().z(V)) {
            W2(v4Var, rVar.c(), d10, N1, z10, z11);
            return;
        }
        final kb.j gdVar = new kb.j() {
            @Override
            public final void a(Object obj) {
                hj.this.h4(v4Var, rVar, d10, z10, z11, (String) obj);
            }
        };
        if (ib.i.i(N1)) {
            N1 = v4Var.c().ha();
        }
        v4Var.Oc(w.i1(R.string.ThemeExportAddAuthorTitle), w.i1(R.string.ThemeExportAddAuthorInfo), R.string.ThemeExportDone, R.string.Cancel, N1, null, new v4.m() {
            @Override
            public final boolean a(y1 y1Var, String str) {
                boolean j42;
                j42 = hj.this.j4(gdVar, y1Var, str);
                return j42;
            }
        }, true, new kb.j() {
            @Override
            public final void a(Object obj) {
                hj.k4(v4.this, (ViewGroup) obj);
            }
        }, null);
    }

    public void V8(v4<?> v4Var, String str, String str2, boolean z10) {
        o4 o4Var = new o4(v4Var.t(), v4Var.c());
        o4Var.hk(new o4.h(new g(str, str2, z10)));
        v4Var.ac(o4Var);
    }

    public final void W2(d9 d9Var, int i10, String str, String str2, boolean z10, boolean z11) {
        String str3;
        if (z11) {
            boolean z12 = z10 ? 1 : 0;
            char c10 = z10 ? 1 : 0;
            z10 = z12 | true;
        }
        if (z11) {
            str3 = ib.i.B(str) + ".java";
        } else {
            str3 = ib.i.B(str) + ".tgx-theme";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("theme_export_");
        sb2.append(System.currentTimeMillis());
        sb2.append("_");
        sb2.append(i10);
        sb2.append(",");
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        sb2.append(i11);
        String sb3 = sb2.toString();
        if (!ib.i.i(str2)) {
            sb3 = sb3 + "," + str2;
        }
        TdApi.InputMessageDocument inputMessageDocument = new TdApi.InputMessageDocument(new TdApi.InputFileGenerated(str3, sb3, 0), null, false, null);
        y00 y00Var = new y00(d9Var.t(), d9Var.c());
        y00Var.Vi(new y00.m(inputMessageDocument));
        y00Var.ej();
    }

    public void W7(final v4<?> v4Var, final CharSequence charSequence, final n nVar) {
        this.f27643a.v4().o(new TdApi.CanTransferOwnership(), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.this.X5(nVar, v4Var, charSequence, object);
            }
        });
    }

    public List<c0.a> X2(long j10, boolean z10, boolean z11, boolean z12) {
        return Y2(j10, z10, z11, z12, false);
    }

    public void X7(int i10) {
        if (i10 != 0) {
            this.f27643a.v4().o(new TdApi.AddSavedAnimation(new TdApi.InputFileId(i10)), df.f27410a);
        }
    }

    public void X8(v4<?> v4Var, long j10, boolean z10, Runnable runnable) {
        TdApi.Chat W2 = this.f27643a.W2(j10);
        TdApi.ScopeNotificationSettings lb2 = this.f27643a.lb(j10);
        if (W2 != null && lb2 != null) {
            if (lb2.muteFor == 0) {
                TdApi.ChatNotificationSettings chatNotificationSettings = W2.notificationSettings;
                if (!chatNotificationSettings.useDefaultMuteFor && chatNotificationSettings.muteFor > 0 && !z10) {
                    this.f27643a.hc(W2.f19908id, 0);
                    v0.D2(runnable);
                    return;
                }
            }
            G8(v4Var, j10, z10, runnable);
        }
    }

    public List<c0.a> Y2(long j10, boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = new ArrayList();
        if (!z10 && !ob.a.j(j10)) {
            if (this.f27643a.k7(j10)) {
                arrayList.add(new c0.a((int) R.id.btn_sendScheduled, w.i1(R.string.SendReminder), (int) R.drawable.baseline_date_range_24).g(1024L));
            } else {
                long h42 = this.f27643a.h4(j10);
                if (h42 != 0) {
                    arrayList.add(new c0.a((int) R.id.btn_sendOnceOnline, w.i1(R.string.SendOnceOnline), (int) R.drawable.baseline_visibility_24).f(this.f27643a, h42));
                }
                arrayList.add(new c0.a((int) R.id.btn_sendScheduled, w.i1(R.string.SendSchedule), (int) R.drawable.baseline_date_range_24).g(z13 ? 8192L : 512L));
            }
        }
        if (!z10 && z12) {
            arrayList.add(new c0.a((int) R.id.btn_sendNoSound, w.i1(R.string.SendNoSound), (int) R.drawable.baseline_notifications_off_24));
        }
        if (z11) {
            arrayList.add(new c0.a((int) R.id.btn_sendNoMarkdown, w.i1(z10 ? R.string.SaveNoMarkdown : R.string.SendNoMarkdown), (int) R.drawable.baseline_code_24).g(2048L));
        }
        return arrayList;
    }

    public void Y7(final List<t2.e> list) {
        final AtomicInteger atomicInteger = new AtomicInteger(list.size());
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        for (t2.e eVar : list) {
            this.f27643a.v4().o(new TdApi.AddSavedAnimation(new TdApi.InputFileId(eVar.d())), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    hj.Z5(atomicInteger2, atomicInteger, list, object);
                }
            });
        }
    }

    public void Y8(v4<?> v4Var, final long j10, final TdApi.MessageSender messageSender, final TdApi.ChatMemberStatus chatMemberStatus) {
        if (messageSender.getConstructor() == -239660751) {
            this.f27643a.Mb(j10, messageSender, new TdApi.ChatMemberStatusLeft(), chatMemberStatus, null);
        } else if (chatMemberStatus.getConstructor() == 1661432998) {
            this.f27643a.Mb(j10, messageSender, new TdApi.ChatMemberStatusMember(), chatMemberStatus, null);
        } else {
            f2 j11 = new f2(R.id.btn_unblockSender).a(new ra(28, 0, 0, (CharSequence) w.j1(R.string.QUnblockX, this.f27643a.Cb(messageSender)), false)).j(new v4.r() {
                @Override
                public final void l6(int i10, SparseIntArray sparseIntArray) {
                    hj.this.Y6(j10, messageSender, chatMemberStatus, i10, sparseIntArray);
                }
            });
            ra[] raVarArr = new ra[1];
            raVarArr[0] = new ra(12, (int) R.id.right_readMessages, 0, this.f27643a.O6(j10) ? R.string.InviteBackToChannel : R.string.InviteBackToGroup, false);
            v4Var.me(j11.p(raVarArr).r(R.string.Unban).q(R.id.theme_color_textNegative));
        }
    }

    public final void Z6(final v4<?> v4Var, final long j10, boolean z10, Runnable runnable) {
        String str;
        final TdApi.ChatMemberStatusMember chatMemberStatusMember;
        boolean z11;
        TdApi.ChatMemberStatusLeft chatMemberStatusLeft;
        TdApi.ChatMemberStatus O3 = this.f27643a.O3(j10);
        if (O3 != null) {
            if (this.f27643a.F4().g3().j()) {
                j0.v0();
                return;
            }
            boolean z12 = !ib.i.i(this.f27643a.j4(j10));
            boolean O6 = this.f27643a.O6(j10);
            boolean z13 = ob.a.g(j10) || z12;
            int constructor = O3.getConstructor();
            int i10 = R.string.LeaveNoReturnHintGroup;
            int i11 = R.string.LeaveReturnPublicLinkHintChannel;
            int i12 = R.string.LeaveChannel;
            String str2 = null;
            switch (constructor) {
                case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                    TdApi.ChatMemberStatusCreator chatMemberStatusCreator = (TdApi.ChatMemberStatusCreator) O3;
                    z11 = !chatMemberStatusCreator.isMember;
                    if (z10 == z11) {
                        chatMemberStatusMember = new TdApi.ChatMemberStatusCreator(chatMemberStatusCreator.customTitle, chatMemberStatusCreator.isAnonymous, z11);
                        if (z11) {
                            str = null;
                            i12 = 0;
                            break;
                        } else {
                            if (!z12) {
                                i11 = O6 ? R.string.LeaveCreatorHintChannel : R.string.LeaveCreatorHintGroup;
                            } else if (!O6) {
                                i11 = R.string.LeaveReturnPublicLinkHintGroup;
                            }
                            String i13 = w.i1(i11);
                            if (!O6) {
                                i12 = R.string.LeaveMegaMenu;
                            }
                            str = i13;
                            break;
                        }
                    } else {
                        return;
                    }
                case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                    if (!z10) {
                        str2 = w.i1(z13 ? R.string.LeaveChatAdminHint : O6 ? R.string.LeaveAdminNoReturnHintChannel : R.string.LeaveAdminNoReturnHintGroup);
                        if (!O6) {
                            i12 = R.string.LeaveMegaMenu;
                        }
                        chatMemberStatusLeft = new TdApi.ChatMemberStatusLeft();
                        chatMemberStatusMember = chatMemberStatusLeft;
                        str = str2;
                        z11 = false;
                        break;
                    } else {
                        return;
                    }
                case TdApi.ChatMemberStatusLeft.CONSTRUCTOR:
                    if (z10) {
                        chatMemberStatusMember = new TdApi.ChatMemberStatusMember();
                        str = null;
                        z11 = false;
                        i12 = 0;
                        break;
                    } else {
                        return;
                    }
                case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                    if (!z10) {
                        if (!O6) {
                            i12 = R.string.LeaveMegaMenu;
                        }
                        if (!z13) {
                            if (O6) {
                                i10 = R.string.LeaveNoReturnHintChannel;
                            }
                            str2 = w.i1(i10);
                        } else if (z12) {
                            if (!O6) {
                                i11 = R.string.LeaveReturnPublicLinkHintGroup;
                            }
                            str2 = w.i1(i11);
                        }
                        chatMemberStatusLeft = new TdApi.ChatMemberStatusLeft();
                        chatMemberStatusMember = chatMemberStatusLeft;
                        str = str2;
                        z11 = false;
                        break;
                    } else {
                        return;
                    }
                case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                    boolean z14 = ((TdApi.ChatMemberStatusRestricted) O3).isMember;
                    if (z10 != z14) {
                        if (!z14) {
                            chatMemberStatusMember = new TdApi.ChatMemberStatusMember();
                            str = null;
                            z11 = true;
                            i12 = 0;
                            break;
                        } else {
                            TdApi.ChatMemberStatusLeft chatMemberStatusLeft2 = new TdApi.ChatMemberStatusLeft();
                            if (!z13) {
                                if (!O6) {
                                    i10 = R.string.LeaveNoReturnHintChannel;
                                }
                                str2 = w.i1(i10);
                            } else if (z12) {
                                if (!O6) {
                                    i11 = R.string.LeaveReturnPublicLinkHintGroup;
                                }
                                str2 = w.i1(i11);
                            }
                            if (!O6) {
                                i12 = R.string.LeaveMegaMenu;
                            }
                            chatMemberStatusMember = chatMemberStatusLeft2;
                            str = str2;
                            z11 = false;
                            break;
                        }
                    } else {
                        return;
                    }
                default:
                    chatMemberStatusMember = null;
                    str = null;
                    z11 = false;
                    i12 = 0;
                    break;
            }
            if (chatMemberStatusMember != null) {
                final boolean z15 = z11 || (ob.a.g(j10) && O3.getConstructor() == -5815259 && chatMemberStatusMember.getConstructor() == 844723285);
                final kb.i vcVar = new kb.i() {
                    @Override
                    public final void a(boolean z16) {
                        hj.this.r4(z15, j10, chatMemberStatusMember, v4Var, z16);
                    }
                };
                if (i12 != 0) {
                    final int i14 = z10 ? R.id.btn_returnToChat : R.id.btn_removeChatFromList;
                    if (z10 || !ob.a.g(j10)) {
                        v4Var.ee(str, new int[]{i14, R.id.btn_cancel}, new String[]{w.i1(i12), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
                            @Override
                            public boolean P() {
                                return g0.a(this);
                            }

                            @Override
                            public Object a2(int i15) {
                                return g0.b(this, i15);
                            }

                            @Override
                            public final boolean r3(View view, int i15) {
                                boolean t42;
                                t42 = hj.t4(i14, vcVar, view, i15);
                                return t42;
                            }
                        });
                        return;
                    }
                    f2 q10 = new f2(R.id.btn_removeChatFromList).r(R.string.LeaveDoneGroup).q(R.id.theme_color_textNegative);
                    if (str != null) {
                        q10.b(str);
                    }
                    q10.p(new ra[]{new ra(12, (int) R.id.btn_removeChatFromList, 0, (int) R.string.LeaveRemoveFromList, (int) R.id.btn_removeChatFromList, true)});
                    q10.j(new v4.r() {
                        @Override
                        public final void l6(int i15, SparseIntArray sparseIntArray) {
                            hj.s4(i.this, i15, sparseIntArray);
                        }
                    });
                    v4Var.me(q10);
                    return;
                }
                vcVar.a(false);
            } else if (z10) {
                j0.y0(R.string.NoReturnToChat, 0);
            }
        }
    }

    public boolean Z8(int i10, d1 d1Var, TdApi.Chat chat, boolean z10) {
        if (d1Var == null) {
            return false;
        }
        String m32 = m3(chat != null ? chat.f19908id : 0L);
        boolean y62 = this.f27643a.y6(chat);
        d1Var.m4(i10, R.id.menu_btn_stopwatch, m32, y62, z10);
        return y62;
    }

    public void a7(v4<?> v4Var, boolean z10) {
        if (this.f27643a.fa() != 0) {
            if (z10) {
                v4Var.ac(new lv(v4Var.t(), this.f27643a));
            } else {
                S7(v4Var, this.f27643a.A1(), true);
            }
        }
    }

    public boolean b7(String str) {
        List<String> pathSegments;
        if (ib.i.i(str)) {
            return false;
        }
        if (ya.o1().k1()) {
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
        if (ib.i.i(scheme)) {
            parse = Uri.parse("https://" + parse.toString());
        }
        if (this.f27643a.a7(replace, false) && (pathSegments = parse.getPathSegments()) != null && !pathSegments.isEmpty()) {
            String str2 = pathSegments.get(0);
            String str3 = pathSegments.size() > 1 ? pathSegments.get(1) : null;
            str2.hashCode();
            if (str2.equals("s")) {
                return !ib.i.i(str3);
            }
        }
        return false;
    }

    public final void b8(String str) {
        j0.y0(R.string.UploadingPhotoWait, 0);
        this.f27643a.v4().o(new TdApi.SetProfilePhoto(new TdApi.InputChatPhotoStatic(new TdApi.InputFileGenerated(str, jd.d.j(str), 0))), this.f27643a.Oa());
    }

    public final CharSequence c3(long j10, TdApi.MessageSender messageSender, boolean z10) {
        if (this.f27643a.O6(j10)) {
            return w.m1(z10 ? R.string.MemberCannotJoinChannel : R.string.MemberCanJoinChannel, this.f27643a.Cb(messageSender));
        }
        return w.m1(z10 ? R.string.MemberCannotJoinGroup : R.string.MemberCanJoinGroup, this.f27643a.Cb(messageSender));
    }

    public final void c8(TdApi.Chat chat, int i10) {
        if (chat != null && this.f27643a.T3(chat.f19908id) != i10) {
            this.f27643a.Ob(chat.f19908id, i10);
        }
    }

    public final int d3(long j10) {
        TdApi.Chat W2 = this.f27643a.W2(j10);
        if (W2 == null) {
            return R.string.DeleteChat;
        }
        switch (ob.a.d(j10)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                if (this.f27643a.c3(W2)) {
                    return this.f27643a.O6(j10) ? R.string.LeaveChannel : R.string.LeaveMegaMenu;
                }
                break;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return this.f27643a.Gc(W2) ? R.string.DeleteAndStop : R.string.DeleteChat;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                TdApi.BasicGroup a42 = this.f27643a.a4(j10);
                TdApi.ChatMemberStatus O3 = this.f27643a.O3(j10);
                if (this.f27643a.c3(W2) && O3 != null) {
                    return (t2.i3(O3, false) || (a42 != null && !a42.isActive)) ? R.string.LeaveMegaMenu : R.string.DeleteChat;
                }
                break;
        }
        return R.string.DeleteChat;
    }

    public final Client.g d7(final d9 d9Var, final q qVar) {
        final v4<?> F = d9Var.t().Q1().F();
        return new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.v4(d9.this, F, qVar, object);
            }
        };
    }

    public void d8(uc.c cVar, long j10) {
        if (this.f27643a.ka().B(j10, true)) {
            cVar.setDataColorId(R.id.theme_color_textNegative);
            cVar.setData(R.string.NotificationsBlocked);
            return;
        }
        TdApi.ChatNotificationSettings M3 = this.f27643a.M3(j10);
        cVar.setDataColorId(0);
        if (M3 != null) {
            cVar.setData(o3(this.f27643a.t3(j10)));
        } else {
            cVar.setData(R.string.LoadingInformation);
        }
    }

    public void e7(d9 d9Var, long j10, j jVar) {
        g7(d9Var, ob.a.b(j10), new TdApi.CreateBasicGroupChat(j10, false), jVar);
    }

    public void e8(uc.c cVar, TdApi.NotificationSettingsScope notificationSettingsScope, boolean z10) {
        int u02;
        if (this.f27643a.ka().C(notificationSettingsScope)) {
            cVar.setDataColorId(R.id.theme_color_textNegative);
            cVar.setData(R.string.NotificationsBlocked);
            return;
        }
        TdApi.ScopeNotificationSettings M0 = this.f27643a.ka().M0(notificationSettingsScope);
        cVar.setDataColorId(0);
        if (M0 == null) {
            cVar.setData(w.i1(R.string.LoadingInformation));
        } else if (Build.VERSION.SDK_INT < 26 || !z10 || M0.muteFor != 0 || (u02 = this.f27643a.ka().u0(notificationSettingsScope)) >= 3) {
            cVar.setData(o3(M0.muteFor));
        } else {
            cVar.setData(w.j1(R.string.NotificationsEnabledHint, w.Z1(w.i1(l3(u02, this.f27643a.ka().a1(notificationSettingsScope), this.f27643a.ka().b1(notificationSettingsScope))))));
        }
    }

    public void f7(final d9 d9Var, final String str) {
        this.f27643a.v4().o(new TdApi.GetBankCardInfo(str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.this.x4(d9Var, str, object);
            }
        });
    }

    public void f8(d9 d9Var, TdApi.LanguagePackInfo languagePackInfo) {
        String j12 = w.j1(R.string.ShareTextLanguageLink, languagePackInfo.name, d9Var.c().Rc(languagePackInfo.f19945id));
        y00 y00Var = new y00(d9Var.t(), d9Var.c());
        y00Var.Vi(new y00.m(j12).E(j12, w.i1(R.string.ShareBtnLanguage)));
        y00Var.ej();
    }

    public int g3(TdApi.Chat chat) {
        int u32 = this.f27643a.u3(chat);
        return u32 >= 345600 ? R.drawable.baseline_notifications_off_24 : u32 > 0 ? R.drawable.baseline_notifications_paused_24 : R.drawable.baseline_notifications_24;
    }

    public final void g7(final d9 d9Var, long j10, final TdApi.Function function, final j jVar) {
        TdApi.Chat W2;
        if (j10 == 0 || (W2 = this.f27643a.W2(j10)) == null) {
            this.f27643a.v4().o(function, new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    hj.this.z4(d9Var, jVar, function, object);
                }
            });
        } else {
            C4(d9Var, W2, jVar);
        }
    }

    public void g8(d9 d9Var, String str) {
        if (!ib.i.i(str)) {
            y00 y00Var = new y00(d9Var.t(), d9Var.c());
            y00Var.Vi(new y00.m(w.j1(R.string.ShareTextProxyLink2, str)).E(w.j1(R.string.ShareTextProxyLink, str), w.i1(R.string.ShareBtnProxy)));
            y00Var.ej();
        }
    }

    public final CharSequence h3(TdApi.User user) {
        if (user.isMutualContact) {
            return w.m1(t2.A2(user) ? R.string.ContactStateMutual : R.string.ContactStateMutualNoPhone, t2.r2(user));
        } else if (!user.isContact) {
            return null;
        } else {
            return w.m1(t2.A2(user) ? R.string.ContactStateOutgoing : R.string.ContactStateOutgoingNoPhone, t2.r2(user));
        }
    }

    public void h7(d9 d9Var, long j10, j jVar) {
        g7(d9Var, j10, new TdApi.GetChat(j10), jVar);
    }

    public void h8(d9 d9Var, TdApi.StickerSetInfo stickerSetInfo) {
        String Vc = this.f27643a.Vc(stickerSetInfo.name);
        String str = stickerSetInfo.title;
        y00 y00Var = new y00(d9Var.t(), d9Var.c());
        y00Var.Vi(new y00.m(w.j1(R.string.ShareTextStickerLink2, str, Vc)).E(w.j1(R.string.ShareTextStickerLink, str, Vc), w.i1(R.string.ShareBtnStickerSet)));
        y00Var.ej();
    }

    @Override
    public void handleMessage(Message message) {
        if (message.what >= 0) {
            this.f27643a.p6(message);
        }
    }

    public void C4(final zd.d9 r22, final org.drinkless.td.libcore.telegram.TdApi.Chat r23, final zd.hj.j r24) {
        throw new UnsupportedOperationException("Method not decompiled: zd.hj.C4(zd.d9, org.drinkless.td.libcore.telegram.TdApi$Chat, zd.hj$j):void");
    }

    public void i8(d9 d9Var, String str) {
        y00 y00Var = new y00(d9Var.t(), d9Var.c());
        y00Var.Vi(new y00.m(str).C(str));
        y00Var.ej();
    }

    public void j7(d9 d9Var, TdApi.MessageSender messageSender, j jVar) {
        int constructor = messageSender.getConstructor();
        if (constructor == -336109341) {
            u7(d9Var, ((TdApi.MessageSenderUser) messageSender).userId, new j().h());
        } else if (constructor == -239660751) {
            u7(d9Var, ((TdApi.MessageSenderChat) messageSender).chatId, new j().h());
        } else {
            throw new UnsupportedOperationException(messageSender.toString());
        }
    }

    public final void j8(v4<?> v4Var, TdApi.User user) {
        String Q2 = this.f27643a.e2().Q2(user.f19979id);
        String J2 = this.f27643a.e2().J2(user.f19979id);
        String Xc = ib.i.i(Q2) ? null : this.f27643a.Xc(Q2);
        if (t2.K2(user)) {
            String j12 = w.j1(R.string.ShareTextLink, J2, Xc);
            y00 y00Var = new y00(v4Var.t(), v4Var.c());
            y00Var.Vi(new y00.m(j12).E(w.j1(R.string.ShareTextBotLink, Xc), w.i1(R.string.ShareBtnBot)));
            y00Var.ej();
            return;
        }
        y00 y00Var2 = new y00(v4Var.t(), v4Var.c());
        y00Var2.Vi(new y00.m(user));
        y00Var2.ej();
    }

    public final void k7(final d9 d9Var, long j10, final p7 p7Var, TdApi.Function function, final q qVar) {
        TdApi.Chat W2 = this.f27643a.W2(j10);
        if (W2 != null) {
            G4(d9Var, W2, p7Var, qVar);
        } else {
            this.f27643a.v4().o(function, new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    hj.this.H4(d9Var, p7Var, qVar, object);
                }
            });
        }
    }

    public final void k8(v4<?> v4Var, TdApi.User user) {
        String str;
        String str2;
        String str3 = user.username;
        if (!ib.i.i(str3)) {
            String Xc = this.f27643a.Xc(str3);
            if (this.f27643a.o7(user.f19979id)) {
                str = w.j1(R.string.ShareTextMyLink2, Xc);
                str2 = w.j1(R.string.ShareTextMyLink, Xc);
            } else {
                String J2 = this.f27643a.e2().J2(user.f19979id);
                String j12 = w.j1(R.string.ShareTextProfileLink2, J2, Xc);
                str2 = w.j1(R.string.ShareTextProfileLink, J2, Xc);
                str = j12;
            }
            y00 y00Var = new y00(v4Var.t(), v4Var.c());
            y00Var.Vi(new y00.m(str).E(str2, w.i1(R.string.ShareLink)));
            y00Var.ej();
        }
    }

    public void l7(d9 d9Var, long j10, p7 p7Var, q qVar) {
        k7(d9Var, j10, p7Var, new TdApi.GetChat(j10), qVar);
    }

    public boolean l8(TdApi.Chat chat) {
        j2 Q0;
        org.thunderdog.challegram.a E = j0.E();
        return E != null && (Q0 = E.Q0()) != null && (Q0.getBoundController() instanceof j1) && ((j1) Q0.getBoundController()).x9().f19673b == 4;
    }

    public String m3(long j10) {
        int T3 = this.f27643a.T3(j10);
        if (T3 > 0) {
            return f3(T3, TimeUnit.SECONDS, false);
        }
        return null;
    }

    public void G4(final d9 d9Var, final TdApi.Chat chat, final p7 p7Var, final q qVar) {
        if (ya.j1()) {
            this.f27643a.db(new Runnable() {
                @Override
                public final void run() {
                    hj.this.G4(d9Var, chat, p7Var, qVar);
                }
            });
            return;
        }
        int a32 = this.f27643a.a3(chat);
        if (a32 < 0) {
            m8(d9Var, qVar, a32, this.f27643a.O6(chat.f19908id));
        } else if (!d9Var.t().x1()) {
            ud.q1 Q1 = d9Var.t().Q1();
            so soVar = new so(d9Var.t(), d9Var.c());
            try {
                soVar.Hm(new so.m(chat, p7Var, false));
                if (Q1.X()) {
                    Q1.Q(soVar);
                    nb nbVar = new nb(d9Var.t(), d9Var.c());
                    nbVar.get();
                    Q1.M().o(nbVar, 0);
                    return;
                }
                v4<?> F = Q1.F();
                if ((F instanceof rh) && F.C9() == chat.f19908id && !((rh) F).Tk()) {
                    soVar.Ld(true);
                }
                Q1.h0(soVar);
            } catch (Throwable th) {
                Log.e("Unable to open profile", th, new Object[0]);
            }
        }
    }

    public int n3(String str) {
        List<String> pathSegments;
        if (ib.i.i(str)) {
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
            replace = I7(null, null, parse);
            if (ib.i.i(replace)) {
                return 0;
            }
            parse = Uri.parse(replace);
        } else if (ib.i.i(scheme)) {
            replace = "https://" + replace;
            parse = Uri.parse(replace);
        }
        if (this.f27643a.a7(replace, false) && (pathSegments = parse.getPathSegments()) != null && !pathSegments.isEmpty()) {
            String str3 = pathSegments.get(0);
            if (pathSegments.size() > 1) {
                str2 = pathSegments.get(1);
            }
            int s10 = ib.i.s(str2);
            if (!ce.c0.Q(str3) && s10 != 0) {
                return 1;
            }
        }
        return 0;
    }

    public final void n7(final d9 d9Var, final String str, final q qVar) {
        ob.d dVar;
        if (qVar == null || (dVar = qVar.f27704d) == null || !ob.a.j(dVar.c())) {
            this.f27643a.v4().o(new TdApi.GetExternalLinkInfo(str), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    hj.this.O4(qVar, str, d9Var, object);
                }
            });
        } else {
            l5(d9Var, str, qVar);
        }
    }

    public void n8(v4<?> v4Var, e8 e8Var) {
        boolean w62 = this.f27643a.w6(ob.b.f19339b);
        int i10 = w62 ? 2 : 1;
        jb.c cVar = new jb.c(i10);
        u0 u0Var = new u0(i10);
        jb.c cVar2 = new jb.c(i10);
        if (w62) {
            cVar.a(R.id.btn_markChatAsRead);
            u0Var.a(R.string.ArchiveRead);
            cVar2.a(R.drawable.baseline_done_all_24);
        }
        boolean V = this.f27643a.tc().V();
        cVar.a(R.id.btn_pinUnpinChat);
        if (V) {
            cVar2.a(R.drawable.deproko_baseline_pin_24);
            u0Var.a(R.string.ArchivePin);
        } else {
            cVar2.a(R.drawable.baseline_arrow_upward_24);
            u0Var.a(R.string.ArchiveHide);
        }
        v4Var.ee(w.q2(R.string.xArchivedChats, e8Var.L()), cVar.e(), u0Var.d(), null, cVar2.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i11) {
                return g0.b(this, i11);
            }

            @Override
            public final boolean r3(View view, int i11) {
                boolean b62;
                b62 = hj.this.b6(view, i11);
                return b62;
            }
        });
    }

    public final void P4(final d9 d9Var, final String str, final TdApi.ChatInviteLinkInfo chatInviteLinkInfo, final q qVar) {
        if (ya.j1()) {
            this.f27643a.db(new Runnable() {
                @Override
                public final void run() {
                    hj.this.P4(d9Var, str, chatInviteLinkInfo, qVar);
                }
            });
            return;
        }
        v4<?> F = d9Var.t().Q1().F();
        if (F != null) {
            x.H3(F, chatInviteLinkInfo, new Runnable() {
                @Override
                public final void run() {
                    hj.this.Q4(d9Var, str, chatInviteLinkInfo, qVar);
                }
            });
        }
    }

    public final void o8(final v4<?> v4Var, final TdApi.ChatList chatList, final long j10, final Runnable runnable) {
        boolean b32 = this.f27643a.b3(j10);
        String U3 = this.f27643a.U3(j10);
        int[] iArr = new int[2];
        iArr[0] = b32 ? R.id.btn_unarchiveChat : R.id.btn_archiveChat;
        iArr[1] = R.id.btn_cancel;
        String[] strArr = new String[2];
        strArr[0] = w.i1(b32 ? R.string.UnarchiveChat : R.string.ArchiveChat);
        strArr[1] = w.i1(R.string.Cancel);
        int[] iArr2 = new int[2];
        iArr2[0] = b32 ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24;
        iArr2[1] = R.drawable.baseline_cancel_24;
        v4Var.ee(U3, iArr, strArr, null, iArr2, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean c62;
                c62 = hj.this.c6(v4Var, chatList, j10, runnable, view, i10);
                return c62;
            }
        });
    }

    public void p7(d9 d9Var, long j10, j jVar) {
        g7(d9Var, 0L, new TdApi.GetSupergroupFullInfo(j10), jVar);
    }

    public void p8(v4<?> v4Var, boolean z10) {
        if (z10) {
            v4Var.de(null, new int[]{R.id.btn_changePhotoCamera, R.id.btn_changePhotoGallery, R.id.btn_changePhotoDelete}, new String[]{w.i1(R.string.takePhoto), w.i1(R.string.pickFromGallery), w.i1(R.string.DeletePhoto)}, new int[]{1, 1, 2}, new int[]{R.drawable.baseline_camera_alt_24, R.drawable.baseline_image_24, R.drawable.baseline_remove_circle_24});
        } else {
            v4Var.de(null, new int[]{R.id.btn_changePhotoCamera, R.id.btn_changePhotoGallery}, new String[]{w.i1(R.string.takePhoto), w.i1(R.string.pickFromGallery)}, null, new int[]{R.drawable.baseline_camera_alt_24, R.drawable.baseline_image_24});
        }
    }

    public void q3(int i10, Intent intent, ud.p0 p0Var) {
        r3(i10, intent, p0Var, p0Var == null);
    }

    public boolean q7(d9 d9Var, yb.f fVar) {
        if (!v0.l1(d9Var.t())) {
            return v.A(fVar.f10185b, fVar.f10186c, fVar.f10187d, fVar.f10188e);
        }
        ac acVar = new ac(d9Var.t(), d9Var.c());
        acVar.Ad(fVar);
        d9Var.t().Q1().h0(acVar);
        return true;
    }

    public final void d6(final TdApi.Function function, final TdApi.Error error, final j jVar) {
        TdApi.ChatInviteLinkInfo chatInviteLinkInfo;
        if (!j0.K()) {
            this.f27643a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    hj.this.d6(function, error, jVar);
                }
            });
            return;
        }
        CharSequence z52 = t2.z5(error);
        if (!ib.i.i(z52)) {
            String str = error.message;
            str.hashCode();
            if (!str.equals("INVITE_REQUEST_SENT")) {
                if (str.equals("USERNAME_NOT_OCCUPIED") && function.getConstructor() == 857135533) {
                    z52 = w.m1(R.string.UsernameNotOccupied, ((TdApi.SearchPublicChat) function).username);
                }
            } else if (!(jVar == null || (chatInviteLinkInfo = jVar.f27677k) == null || !chatInviteLinkInfo.createsJoinRequest)) {
                z52 = w.m1(t2.N2(chatInviteLinkInfo.type) ? R.string.RequestJoinChannelSent : R.string.RequestJoinGroupSent, jVar.f27677k.title);
            }
            E8(this.f27643a, R.drawable.baseline_error_24, z52, jVar != null ? jVar.f27674h : null);
        }
    }

    public void r3(int i10, Intent intent, ud.p0 p0Var, boolean z10) {
        Uri data;
        String U2;
        if (i10 == 100) {
            File O = v.O();
            if (O != null) {
                v0.m(O);
                if (z10) {
                    b8(O.getPath());
                } else {
                    a8(O.getPath(), p0Var);
                }
            }
        } else if (i10 == 101) {
            if (intent == null || (data = intent.getData()) == null || (U2 = v0.U2(data)) == null) {
                j0.z0("Error", 0);
            } else if (U2.endsWith(".webp")) {
                j0.z0("Webp is not supported for profile photos", 1);
            } else if (z10) {
                b8(U2);
            } else {
                a8(U2, p0Var);
            }
        }
    }

    public void r7(d9 d9Var, long j10, ob.d dVar, q qVar) {
        h7(d9Var, j10, new j().h().e(dVar).c().s(qVar));
    }

    public void r8(final v4<?> v4Var, final TdApi.ChatList chatList, final long j10, final p7 p7Var, boolean z10, boolean z11, final Runnable runnable) {
        CharSequence charSequence;
        TdApi.Chat W2 = this.f27643a.W2(j10);
        if (W2 != null) {
            boolean c32 = this.f27643a.c3(W2);
            TdApi.ChatPosition a10 = ob.b.a(W2, chatList);
            if (c32) {
                boolean y32 = this.f27643a.y3(W2);
                int i10 = (!z10 || runnable == null) ? 5 : 6;
                jb.c cVar = new jb.c(i10);
                u0 u0Var = new u0(i10);
                jb.c cVar2 = new jb.c(i10);
                jb.c cVar3 = new jb.c(i10);
                if (z10 && runnable != null) {
                    cVar.a(R.id.btn_selectChat);
                    u0Var.a(z11 ? R.string.Unselect : R.string.Select);
                    cVar2.a(1);
                    cVar3.a(R.drawable.baseline_playlist_add_check_24);
                }
                if (!this.f27643a.k7(j10)) {
                    cVar.a(R.id.btn_notifications);
                    u0Var.a(y32 ? R.string.MuteNotifications : R.string.EnableNotifications);
                    cVar2.a(1);
                    cVar3.a(y32 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_24);
                }
                if (a10 != null) {
                    cVar.a(a10.isPinned ? R.id.btn_unpinChat : R.id.btn_pinChat);
                    u0Var.a(a10.isPinned ? R.string.UnpinFromTop : R.string.PinToTop);
                    cVar2.a(1);
                    cVar3.a(a10.isPinned ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24);
                }
                if (this.f27643a.l2(chatList, W2)) {
                    boolean z12 = chatList instanceof TdApi.ChatListArchive;
                    cVar.a(z12 ? R.id.btn_unarchiveChat : R.id.btn_archiveChat);
                    u0Var.a(z12 ? R.string.UnarchiveChat : R.string.ArchiveChat);
                    cVar2.a(1);
                    cVar3.a(z12 ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24);
                }
                boolean u62 = this.f27643a.u6(W2);
                boolean D2 = this.f27643a.D2(W2);
                if (!D2 || W2.unreadCount == 0 || !u62) {
                    cVar.a(D2 ? R.id.btn_markChatAsRead : R.id.btn_markChatAsUnread);
                    u0Var.a(D2 ? R.string.MarkAsRead : R.string.MarkAsUnread);
                    cVar2.a(1);
                    cVar3.a(D2 ? R.drawable.baseline_done_all_24 : R.drawable.baseline_unsubscribe_24);
                }
                if (!u62 && this.f27643a.p2(W2)) {
                    cVar.a(R.id.btn_clearChatHistory);
                    u0Var.a(R.string.ClearHistory);
                    cVar2.a(1);
                    cVar3.a(R.drawable.templarian_baseline_broom_24);
                }
                cVar2.a(2);
                cVar3.a(R.drawable.baseline_delete_24);
                int constructor = W2.type.getConstructor();
                int i11 = R.string.LeaveMegaMenu;
                int i12 = R.string.DeleteChat;
                switch (constructor) {
                    case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                        if (this.f27643a.O6(j10)) {
                            i11 = R.string.LeaveChannel;
                        }
                        u0Var.a(i11);
                        break;
                    case TdApi.ChatTypeSecret.CONSTRUCTOR:
                        u0Var.a(R.string.DeleteChat);
                        break;
                    case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                        TdApi.ChatMemberStatus O3 = this.f27643a.O3(j10);
                        if (O3 == null || !t2.i3(O3, false)) {
                            i11 = R.string.DeleteChat;
                        }
                        u0Var.a(i11);
                        break;
                    case TdApi.ChatTypePrivate.CONSTRUCTOR:
                        if (this.f27643a.M6(W2)) {
                            i12 = R.string.DeleteAndStop;
                        }
                        u0Var.a(i12);
                        break;
                }
                cVar.a(R.id.btn_removeChatFromList);
                switch (W2.type.getConstructor()) {
                    case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                        charSequence = W2.title;
                        break;
                    case TdApi.ChatTypeSecret.CONSTRUCTOR:
                        charSequence = w.m1(R.string.SecretChatWithUser, this.f27643a.e2().C2(this.f27643a.i4(W2)));
                        break;
                    case TdApi.ChatTypePrivate.CONSTRUCTOR:
                        String C2 = this.f27643a.e2().C2(this.f27643a.i4(W2));
                        if (!this.f27643a.k7(j10)) {
                            charSequence = w.m1(R.string.ChatWithUser, C2);
                            break;
                        } else {
                            charSequence = w.i1(R.string.ChatWithYourself);
                            break;
                        }
                    default:
                        throw new IllegalArgumentException();
                }
                v4Var.ee(charSequence, cVar.e(), u0Var.d(), cVar2.e(), cVar3.e(), new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i13) {
                        return g0.b(this, i13);
                    }

                    @Override
                    public final boolean r3(View view, int i13) {
                        boolean e62;
                        e62 = hj.this.e6(runnable, v4Var, chatList, j10, p7Var, view, i13);
                        return e62;
                    }
                });
            } else if (a10 != null && (a10.source instanceof TdApi.ChatSourcePublicServiceAnnouncement)) {
                z8(v4Var, chatList, j10, null);
            }
        }
    }

    public boolean s3(Context context, int i10, TdApi.User user, ud.p0 p0Var) {
        TdApi.ProfilePhoto profilePhoto;
        if (user == null && i10 == R.id.btn_changePhotoDelete && p0Var == null) {
            return false;
        }
        switch (i10) {
            case R.id.btn_changePhotoCamera:
                j0.Y(context);
                return true;
            case R.id.btn_changePhotoDelete:
                if (user == null || (profilePhoto = user.profilePhoto) == null) {
                    p0Var.setPhoto(null);
                } else {
                    Q2(profilePhoto.f19955id);
                }
                return true;
            case R.id.btn_changePhotoGallery:
                j0.a0(false);
                return true;
            default:
                return false;
        }
    }

    public void s7(d9 d9Var, TdApi.Message message, q qVar) {
        r7(d9Var, message.chatId, new ob.d(message.chatId, message.f19946id), qVar);
    }

    public final void s8(v4<?> v4Var, final long j10, final Runnable runnable) {
        boolean z10 = true;
        if (this.f27643a.J2(j10) || this.f27643a.q2(j10)) {
            f2 r10 = new f2(R.id.btn_removeChatFromList).c(false).b(this.f27643a.k7(j10) ? w.H0(v4Var, R.string.ClearSavedMessagesConfirm, new Object[0]) : w.i1(R.string.ClearHistoryConfirm)).q(R.id.theme_color_textNegative).r(R.string.Delete);
            ra[] raVarArr = new ra[1];
            String j12 = ob.a.i(j10) ? w.j1(R.string.DeleteSecretChatHistoryForOtherParty, this.f27643a.e2().C2(ob.a.q(j10))) : w.i1(R.string.DeleteChatHistoryForAllUsers);
            if (!this.f27643a.J2(j10) || !this.f27643a.A7(j10) || !this.f27643a.e2().A2(this.f27643a.h4(j10))) {
                z10 = false;
            }
            raVarArr[0] = new ra(12, (int) R.id.btn_clearChatHistory, 0, j12, (int) R.id.btn_clearChatHistory, z10);
            v4Var.me(r10.p(raVarArr).j(new v4.r() {
                @Override
                public final void l6(int i10, SparseIntArray sparseIntArray) {
                    hj.this.f6(j10, runnable, i10, sparseIntArray);
                }
            }));
            return;
        }
        v4Var.ee(this.f27643a.k7(j10) ? w.H0(v4Var, R.string.ClearSavedMessagesConfirm, new Object[0]) : w.i1(R.string.ClearHistoryConfirm), new int[]{R.id.btn_clearChatHistory, R.id.btn_cancel}, new String[]{w.i1(R.string.ClearHistory), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.templarian_baseline_broom_24, R.drawable.baseline_cancel_24}, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean g62;
                g62 = hj.this.g6(j10, runnable, view, i10);
                return g62;
            }
        });
    }

    public boolean t3(v4<?> v4Var, View view, int i10, TdApi.User user, boolean z10) {
        CharSequence h32;
        String str;
        String str2;
        boolean z11 = false;
        if (user == null) {
            return false;
        }
        if (i10 != R.id.btn_addToGroup) {
            int i11 = 4;
            if (i10 == R.id.btn_phone) {
                if (!ib.i.i(user.phoneNumber)) {
                    if (!z10) {
                        i11 = 3;
                    }
                    jb.c cVar = new jb.c(i11);
                    jb.c cVar2 = new jb.c(i11);
                    u0 u0Var = new u0(i11);
                    if (z10) {
                        cVar.a(R.id.btn_changePhoneNumber);
                        cVar2.a(R.drawable.baseline_edit_24);
                        u0Var.a(R.string.PhoneNumberChange);
                    }
                    cVar.a(R.id.btn_phone_call);
                    cVar2.a(R.drawable.baseline_phone_24);
                    u0Var.a(R.string.Call);
                    cVar.a(R.id.btn_phone_copy);
                    cVar2.a(R.drawable.baseline_content_copy_24);
                    u0Var.a(R.string.Copy);
                    cVar.a(R.id.btn_phone_share);
                    cVar2.a(R.drawable.baseline_forward_24);
                    u0Var.a(R.string.ShareContact);
                    String w10 = ce.c0.w(user.phoneNumber);
                    if (!z10) {
                        CharSequence h33 = h3(user);
                        if (h33 instanceof SpannableStringBuilder) {
                            ((SpannableStringBuilder) h33).append((CharSequence) "\n\n").append((CharSequence) w10);
                            str = h33;
                            v4Var.de(str, cVar.e(), u0Var.d(), null, cVar2.e());
                        } else if (!ib.i.i(h33)) {
                            w10 = ((Object) h33) + "\n\n" + w10;
                        }
                    }
                    str = w10;
                    v4Var.de(str, cVar.e(), u0Var.d(), null, cVar2.e());
                } else if (!z10 && (h32 = h3(user)) != null) {
                    if (view != null) {
                        v4Var.t().I3().g(view).F(v4Var, this.f27643a, R.drawable.baseline_info_24, h32);
                    } else {
                        j0.z0(h32, 0);
                    }
                }
                return true;
            } else if (i10 != R.id.btn_username) {
                return false;
            } else {
                jb.c cVar3 = new jb.c(4);
                jb.c cVar4 = new jb.c(4);
                u0 u0Var2 = new u0(4);
                if (this.f27643a.o7(user.f19979id)) {
                    if (ib.i.i(user.username)) {
                        v4Var.bc().h0(new s8(v4Var.t(), v4Var.c()));
                        return true;
                    }
                    cVar3.a(R.id.btn_username_edit);
                    cVar4.a(R.drawable.baseline_edit_24);
                    u0Var2.a(R.string.EditUsername);
                    z11 = true;
                }
                cVar3.a(R.id.btn_username_copy_link);
                cVar4.a(R.drawable.baseline_link_24);
                u0Var2.a(R.string.CopyLink);
                cVar3.a(R.id.btn_username_share);
                cVar4.a(R.drawable.baseline_forward_24);
                u0Var2.a(R.string.ShareLink);
                if (z11) {
                    str2 = null;
                } else {
                    str2 = "@" + user.username;
                }
                v4Var.de(str2, cVar3.e(), u0Var2.d(), null, cVar4.e());
                return true;
            }
        } else {
            G3(v4Var, user.f19979id);
            return true;
        }
    }

    public void t7(d9 d9Var, TdApi.MessageLinkInfo messageLinkInfo, q qVar) {
        if (messageLinkInfo.message != null) {
            long j10 = messageLinkInfo.chatId;
            TdApi.Message message = messageLinkInfo.message;
            r7(d9Var, j10, new ob.d(message.chatId, message.f19946id), qVar);
            return;
        }
        if (this.f27643a.W2(messageLinkInfo.chatId) != null) {
            j0.y0(this.f27643a.O6(messageLinkInfo.chatId) ? R.string.PostNotFound : R.string.MessageNotFound, 0);
        }
        h7(d9Var, messageLinkInfo.chatId, new j().h().s(qVar));
    }

    public void t8(v4<?> v4Var, long j10) {
        u8(v4Var, j10, false, this.f27643a.Fc(j10), null);
    }

    public boolean u3(v4<?> v4Var, int i10, TdApi.User user, TdApi.UserFullInfo userFullInfo) {
        switch (i10) {
            case R.id.more_btn_addToContacts:
                if (user != null) {
                    B2(v4Var, user);
                }
                return true;
            case R.id.more_btn_addToGroup:
                G3(v4Var, user.f19979id);
                return true;
            case R.id.more_btn_edit:
                if (user != null) {
                    a7 a7Var = new a7(v4Var.t(), v4Var.c());
                    if (v4Var.c().o7(user.f19979id)) {
                        a7Var.uf(1);
                    } else {
                        a7Var.uf(2);
                        a7Var.vf(user);
                    }
                    v4Var.bc().h0(a7Var);
                }
                return true;
            case R.id.more_btn_logout:
                a7(v4Var, true);
                return true;
            case R.id.more_btn_share:
                j8(v4Var, user);
                return true;
            default:
                return false;
        }
    }

    public void u7(d9 d9Var, long j10, j jVar) {
        g7(d9Var, ob.a.c(j10), new TdApi.CreatePrivateChat(j10, false), jVar);
    }

    public final void u8(final v4<?> v4Var, final long j10, boolean z10, final boolean z11, final Runnable runnable) {
        String i12;
        final kb.i pcVar = new kb.i() {
            @Override
            public final void a(boolean z12) {
                hj.this.n6(j10, v4Var, runnable, z12);
            }
        };
        switch (ob.a.d(j10)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                x8(v4Var, j10, this.f27643a.U3(j10), new Runnable() {
                    @Override
                    public final void run() {
                        hj.this.m6(v4Var, j10, runnable);
                    }
                }, z10, runnable);
                return;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                final String C2 = this.f27643a.e2().C2(this.f27643a.h4(j10));
                x8(v4Var, j10, w.m1(R.string.SecretChatWithUser, C2), new Runnable() {
                    @Override
                    public final void run() {
                        hj.this.j6(j10, v4Var, C2, pcVar, z11);
                    }
                }, z10, runnable);
                return;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                x8(v4Var, j10, this.f27643a.U3(j10), new Runnable() {
                    @Override
                    public final void run() {
                        hj.this.l6(j10, v4Var, runnable, pcVar);
                    }
                }, z10, runnable);
                return;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                final long q10 = ob.a.q(j10);
                final String C22 = this.f27643a.e2().C2(q10);
                final boolean z12 = z11 && this.f27643a.L6(j10);
                if (this.f27643a.o7(q10)) {
                    i12 = w.i1(R.string.SavedMessages);
                } else {
                    i12 = this.f27643a.i7(ob.a.c(q10)) ? w.i1(R.string.RepliesBot) : w.j1(R.string.ChatWithUser, C22);
                }
                x8(v4Var, j10, i12, new Runnable() {
                    @Override
                    public final void run() {
                        hj.this.s6(q10, v4Var, z12, C22, j10, z11, pcVar);
                    }
                }, z10, runnable);
                return;
            default:
                return;
        }
    }

    public boolean v3(v4<?> v4Var, int i10, TdApi.User user) {
        if (user == null) {
            return false;
        }
        if (i10 != R.id.btn_changePhoneNumber) {
            switch (i10) {
                case R.id.btn_phone_call:
                    v.B('+' + user.phoneNumber);
                    return true;
                case R.id.btn_phone_copy:
                    j0.i('+' + user.phoneNumber, R.string.copied_phone);
                    return true;
                case R.id.btn_phone_share:
                    j8(v4Var, user);
                    return true;
                default:
                    switch (i10) {
                        case R.id.btn_username_copy:
                            j0.i('@' + user.username, R.string.CopiedUsername);
                            return true;
                        case R.id.btn_username_copy_link:
                            j0.i(t2.H1(user), R.string.CopiedLink);
                            return true;
                        case R.id.btn_username_edit:
                            v4Var.bc().h0(new s8(v4Var.t(), v4Var.c()));
                            return true;
                        case R.id.btn_username_share:
                            k8(v4Var, user);
                            return true;
                        default:
                            return false;
                    }
            }
        } else {
            v4Var.bc().h0(new hw(v4Var.t(), v4Var.c()));
            return true;
        }
    }

    public void v7(d9 d9Var, long j10, q qVar) {
        k7(d9Var, ob.a.c(j10), null, new TdApi.CreatePrivateChat(j10, false), qVar);
    }

    public void w3(TdApi.UpdateTermsOfService updateTermsOfService) {
    }

    public void w7(d9 d9Var, final String str, final int i10, final TdApi.ProxyType proxyType, String str2) {
        v4<?> F = d9Var.t().Q1().F();
        if (F != null) {
            SpannableStringBuilder k10 = ce.c0.k(str2);
            k10.insert(0, (CharSequence) "\n\n");
            String i12 = w.i1(R.string.EnableProxyAlertTitle);
            k10.insert(0, (CharSequence) i12);
            k10.setSpan(t2.A4(i12), 0, i12.length(), 33);
            k10.append((CharSequence) "\n\n");
            k10.append((CharSequence) w.i1(R.string.EnableProxyAlertHint));
            if (proxyType.getConstructor() == -1964826627) {
                k10.append((CharSequence) "\n\n");
                k10.append((CharSequence) w.i1(R.string.EnableProxyAlertHintMtproto));
            }
            jb.c cVar = new jb.c(3);
            u0 u0Var = new u0(3);
            jb.c cVar2 = new jb.c(3);
            jb.c cVar3 = new jb.c(3);
            cVar.a(R.id.btn_addProxy);
            u0Var.a(R.string.ProxyEnable);
            cVar2.a(R.drawable.baseline_security_24);
            cVar3.a(3);
            cVar.a(R.id.btn_save);
            u0Var.a(R.string.ProxySaveForLater);
            cVar2.a(R.drawable.baseline_playlist_add_24);
            cVar3.a(1);
            cVar.a(R.id.btn_cancel);
            u0Var.a(R.string.Cancel);
            cVar2.a(R.drawable.baseline_cancel_24);
            cVar3.a(1);
            F.ee(k10, cVar.e(), u0Var.d(), cVar3.e(), cVar2.e(), new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i11) {
                    return g0.b(this, i11);
                }

                @Override
                public final boolean r3(View view, int i11) {
                    boolean R4;
                    R4 = hj.R4(str, i10, proxyType, view, i11);
                    return R4;
                }
            });
        }
    }

    public final boolean x3(final d9 d9Var, String str, final q qVar) {
        if (t2.g3(str)) {
            Log.e("Attempt to install custom local languagePackId:%s", str);
            return true;
        }
        this.f27643a.v4().o(new TdApi.GetLanguagePackInfo(str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                hj.this.m4(d9Var, qVar, object);
            }
        });
        return true;
    }

    public void x7(d9 d9Var, boolean z10) {
        if (he.i.c2().k0() == 0) {
            E2(d9Var, z10);
        } else {
            d9Var.t().Q1().h0(new ix(d9Var.t(), d9Var.c()));
        }
    }

    public final void x8(final v4<?> v4Var, final long j10, CharSequence charSequence, final Runnable runnable, boolean z10, final Runnable runnable2) {
        if (!z10 || !this.f27643a.o2(j10)) {
            runnable.run();
        } else {
            v4Var.ee(charSequence, new int[]{R.id.btn_removeChatFromList, R.id.btn_clearChatHistory}, new String[]{w.i1(d3(j10)), w.i1(R.string.ClearHistory)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.templarian_baseline_broom_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view, int i10) {
                    boolean w62;
                    w62 = hj.this.w6(runnable, v4Var, j10, runnable2, view, i10);
                    return w62;
                }
            });
        }
    }

    public void y3(d9 d9Var, m mVar) {
        if (z.u().t(mVar) != 0) {
            z.u().h(this.f27643a, mVar.f27695j, false, null);
        }
    }

    public void y7(d9 d9Var, String str, q qVar) {
        g7(d9Var, 0L, new TdApi.SearchPublicChat(str), new j().s(qVar).h().l());
    }

    public void y8(v4<?> v4Var, final r rVar, final Runnable runnable) {
        if (z.A(rVar.c())) {
            v4Var.ee(w.i1(R.string.ThemeRemoveInfo), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{w.i1(R.string.ThemeRemoveConfirm), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view, int i10) {
                    boolean x62;
                    x62 = hj.this.x6(rVar, runnable, view, i10);
                    return x62;
                }
            });
        }
    }

    public void z2(org.thunderdog.challegram.a aVar, boolean z10, boolean z11) {
        int c22 = ya.o1().c2(z11);
        if (c22 != -1) {
            fk fkVar = new fk(aVar, ya.R0(c22));
            fkVar.sg(true);
            aVar.Q1().h0(fkVar);
        }
    }

    public final void Q4(d9 d9Var, String str, TdApi.ChatInviteLinkInfo chatInviteLinkInfo, q qVar) {
        g7(d9Var, 0L, new TdApi.JoinChatByInviteLink(str), new j().s(qVar).g(str, chatInviteLinkInfo).h().n());
    }

    public void z7(d9 d9Var, long j10, ob.d dVar) {
        h7(d9Var, j10, new j().h().q().e(dVar).c());
    }

    public final void z8(final v4<?> v4Var, TdApi.ChatList chatList, final long j10, final Runnable runnable) {
        final Runnable eiVar = new Runnable() {
            @Override
            public final void run() {
                hj.this.y6(j10, v4Var, runnable);
            }
        };
        TdApi.ChatSource N3 = this.f27643a.N3(chatList, j10);
        if (N3 instanceof TdApi.ChatSourcePublicServiceAnnouncement) {
            v4Var.ee(w.T0((TdApi.ChatSourcePublicServiceAnnouncement) N3, this.f27643a.U3(j10)), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.i1(R.string.PsaHideDone), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_sweep_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view, int i10) {
                    boolean z62;
                    z62 = hj.z6(eiVar, view, i10);
                    return z62;
                }
            });
        }
    }

    public static class m implements ae.p {
        public String f27686a;
        public long f27687b;
        public String f27688c;
        public String f27689d;
        public int f27690e = 0;
        public final Map<Integer, Float> f27691f = new HashMap();
        public final Map<Integer, Integer> f27692g = new HashMap();
        public final List<a> f27693h = new ArrayList();
        public final List<a> f27694i = new ArrayList();
        public ae.n f27695j;

        @Override
        public int a() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public String b() {
            if (!ib.i.i(this.f27689d)) {
                return this.f27689d;
            }
            return ae.c0.a(this.f27690e).b();
        }

        @Override
        public boolean c() {
            return ae.o.a(this);
        }

        @Override
        public float d(int i10) {
            Float f10 = this.f27691f.get(Integer.valueOf(i10));
            if (f10 != null) {
                return f10.floatValue();
            }
            return ae.c0.a(this.f27690e).d(i10);
        }

        @Override
        public int e(int i10) {
            Integer num = this.f27692g.get(Integer.valueOf(i10));
            if (num != null) {
                return num.intValue();
            }
            return ae.c0.a(this.f27690e).e(i10);
        }

        @Override
        public boolean f() {
            return ae.o.b(this);
        }

        public void g(String str, int i10, int i11) {
            if (!this.f27692g.containsKey(Integer.valueOf(i10))) {
                this.f27692g.put(Integer.valueOf(i10), Integer.valueOf(i11));
                this.f27694i.add(new a(str, i10, i11));
                return;
            }
            throw new IllegalArgumentException("Duplicate color: " + ae.j.O(i10));
        }

        public void h(String str, int i10, float f10) {
            if (this.f27691f.containsKey(Integer.valueOf(i10))) {
                throw new IllegalArgumentException("Duplicate property: " + ae.j.b0(i10));
            } else if (z.C(i10, f10)) {
                this.f27691f.put(Integer.valueOf(i10), Float.valueOf(f10));
                if (i10 == R.id.theme_property_parentTheme) {
                    this.f27690e = (int) f10;
                }
                this.f27693h.add(new a(str, i10, f10));
            } else {
                throw new IllegalArgumentException("Invalid property: " + ae.j.b0(i10) + "=" + f10);
            }
        }

        public void i() {
            if (this.f27690e == 0) {
                throw new IllegalArgumentException("theme.parentThemeId is missing");
            } else if (!ib.i.i(this.f27686a)) {
                ae.p d10 = ae.c0.d(this.f27690e, false);
                for (int size = this.f27694i.size() - 1; size >= 0; size--) {
                    a aVar = this.f27694i.get(size);
                    if (d10.e(aVar.f27697b) == aVar.f27698c) {
                        this.f27694i.remove(size);
                        this.f27692g.remove(Integer.valueOf(aVar.f27697b));
                    }
                }
                for (int size2 = this.f27693h.size() - 1; size2 >= 0; size2--) {
                    a aVar2 = this.f27693h.get(size2);
                    int i10 = aVar2.f27697b;
                    if (i10 != R.id.theme_property_parentTheme && d10.d(i10) == aVar2.M) {
                        this.f27693h.remove(size2);
                        this.f27691f.remove(Integer.valueOf(aVar2.f27697b));
                    }
                }
                jj jjVar = jj.f27838a;
                Collections.sort(this.f27693h, jjVar);
                Collections.sort(this.f27694i, jjVar);
            } else {
                throw new IllegalArgumentException("theme.name is missing");
            }
        }

        public static class a implements Comparable<a> {
            public float M;
            public final String f27696a;
            public final int f27697b;
            public int f27698c;

            public a(String str, int i10, int i11) {
                this.f27696a = str;
                this.f27697b = i10;
                this.f27698c = i11;
            }

            public int compareTo(a aVar) {
                return this.f27696a.compareToIgnoreCase(aVar.f27696a);
            }

            public a(String str, int i10, float f10) {
                this.f27696a = str;
                this.f27697b = i10;
                this.M = f10;
            }
        }
    }

    public static class q implements s4.i {
        public int f27701a;
        public int f27702b;
        public TdApi.WebPage f27703c;
        public ob.d f27704d;
        public String f27705e;
        public String f27706f;
        public x2.h f27707g;
        public boolean f27708h;
        public String f27709i;
        public v4<?> f27710j;
        public hd.s4 f27711k;

        public q() {
            this.f27701a = -1;
            this.f27702b = -1;
        }

        @Override
        public void a(hd.s4 s4Var, long j10, long j11, boolean z10) {
            ob.d dVar = this.f27704d;
            if (dVar != null && dVar.a(s4Var.I2(), j10)) {
                this.f27704d = this.f27704d.h(j10, j11);
                s4Var.c4().remove(this);
                this.f27711k = null;
            }
        }

        public q c(v4<?> v4Var) {
            this.f27710j = v4Var;
            return this;
        }

        public q d() {
            return h(1);
        }

        public q e() {
            return k(0);
        }

        public q f() {
            this.f27708h = false;
            return this;
        }

        public q g(String str) {
            this.f27709i = str;
            return this;
        }

        public q h(int i10) {
            this.f27702b = i10;
            return this;
        }

        public q i() {
            return k(1);
        }

        public q j(String str) {
            this.f27706f = str;
            return this;
        }

        public q k(int i10) {
            this.f27701a = i10;
            return this;
        }

        public q l(String str) {
            this.f27705e = str;
            return this;
        }

        public q m() {
            return n(true);
        }

        public q n(boolean z10) {
            this.f27708h = z10;
            return this;
        }

        public q o(long j10) {
            hd.s4 s4Var = this.f27711k;
            if (s4Var == null) {
                return q(new ob.d(j10, 0L));
            }
            if (s4Var.I2() == j10) {
                return this;
            }
            throw new IllegalStateException();
        }

        public q p(hd.s4 s4Var) {
            if (s4Var != null) {
                if (s4Var.n6()) {
                    this.f27711k = s4Var;
                    s4Var.c4().add(this);
                } else {
                    this.f27711k = null;
                }
                c(s4Var.Q0());
                return q(new ob.d(s4Var.I2(), s4Var.K3(), s4Var.i4(s4Var.K3())));
            }
            this.f27711k = null;
            return q(null);
        }

        public q q(ob.d dVar) {
            this.f27704d = dVar;
            return this;
        }

        public q r(TdApi.WebPage webPage) {
            this.f27703c = webPage;
            return this;
        }

        public q s(x2.h hVar) {
            this.f27707g = hVar;
            if (!(hVar == null || this.f27710j == null || hVar.o())) {
                hVar.i(this.f27710j);
            }
            return this;
        }

        public q(q qVar) {
            this.f27701a = -1;
            this.f27702b = -1;
            if (qVar != null) {
                this.f27701a = qVar.f27701a;
                this.f27702b = qVar.f27702b;
                this.f27704d = qVar.f27704d;
                this.f27705e = qVar.f27705e;
                this.f27706f = qVar.f27706f;
                this.f27707g = qVar.f27707g;
                this.f27708h = qVar.f27708h;
                this.f27709i = qVar.f27709i;
                this.f27710j = qVar.f27710j;
                hd.s4 s4Var = qVar.f27711k;
                if (s4Var != null) {
                    p(s4Var);
                }
            }
        }
    }
}
