package kd;

import ad.a0;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.location.Location;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import ce.c0;
import ce.j0;
import gd.w;
import hd.o;
import hd.p;
import hd.s;
import hd.t;
import hd.t2;
import hd.v;
import ie.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kd.u;
import kd.x0;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.N;
import org.thunderdog.challegram.R;
import ud.v4;
import vc.x;
import vd.o0;
import zd.hj;
import zd.o6;

public class u implements x0.g, x.h {
    public static final m f15875r0 = s.f15852a;
    public static final m f15876s0 = r.f15849a;
    public static final m f15877t0 = kd.h.f15795a;
    public final x0 M;
    public j O;
    public int P;
    public int Q;
    public CharSequence R;
    public boolean T;
    public int U;
    public int V;
    public int W;
    public String X;
    public TdApi.Location Y;
    public String Z;
    public final org.thunderdog.challegram.a f15878a;
    public boolean f15879a0;
    public final o6 f15880b;
    public ie.k f15881b0;
    public final i f15882c;
    public String f15883c0;
    public TdApi.User f15884d0;
    public boolean f15885e0;
    public ie.k f15886f0;
    public ie.k f15887g0;
    public ie.k f15888h0;
    public ArrayList<o<?>> f15890j0;
    public String f15891k0;
    public ie.k f15892l0;
    public ie.k f15893m0;
    public kb.b f15894n0;
    public int f15897q0;
    public final int[] f15889i0 = new int[2];
    public final ArrayList<String> f15895o0 = new ArrayList<>(5);
    public final ArrayList<String> f15896p0 = new ArrayList<>(5);
    public final l N = new l() {
        @Override
        public final void a(String str) {
            u.this.k0(str);
        }
    };
    public String S = "";

    public class a extends ie.k {
        public final String M;
        public final int N;
        public final int[] f15898b;
        public final boolean f15899c;

        public a(int[] iArr, boolean z10, String str, int i10) {
            this.f15898b = iArr;
            this.f15899c = z10;
            this.M = str;
            this.N = i10;
        }

        public void e(TdApi.Sticker[] stickerArr, String str, boolean z10, int i10, int[] iArr) {
            if (!b()) {
                u.this.U(stickerArr, str, z10);
                if (!z10 && i10 == 0) {
                    u.this.F0(str, true, iArr);
                }
            }
        }

        @Override
        public void c(TdApi.Object object) {
            TdApi.Sticker[] stickerArr;
            int[] iArr;
            TdApi.Sticker[] stickerArr2;
            if (object.getConstructor() == 1974859260) {
                TdApi.Stickers stickers = (TdApi.Stickers) object;
                int[] iArr2 = this.f15898b;
                if (iArr2 == null || iArr2.length <= 0) {
                    stickerArr = stickers.stickers;
                } else {
                    ArrayList arrayList = new ArrayList(stickers.stickers.length);
                    for (TdApi.Sticker sticker : stickers.stickers) {
                        if (Arrays.binarySearch(this.f15898b, sticker.sticker.f19913id) < 0) {
                            arrayList.add(sticker);
                        }
                    }
                    stickerArr = new TdApi.Sticker[arrayList.size()];
                    arrayList.toArray(stickerArr);
                }
                final TdApi.Sticker[] stickerArr3 = stickerArr;
                if (this.f15899c) {
                    iArr = null;
                } else {
                    iArr = new int[stickerArr3.length];
                    int i10 = 0;
                    for (TdApi.Sticker sticker2 : stickerArr3) {
                        iArr[i10] = sticker2.sticker.f19913id;
                        i10++;
                    }
                    Arrays.sort(iArr);
                }
                final int[] iArr3 = iArr;
                hj hd2 = u.this.f15880b.hd();
                final String str = this.M;
                final boolean z10 = this.f15899c;
                final int i11 = this.N;
                hd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        u.a.this.e(stickerArr3, str, z10, i11, iArr3);
                    }
                });
            }
        }
    }

    public class b extends ie.k {
        public final String f15900b;

        public b(String str) {
            this.f15900b = str;
        }

        public void e(String str, TdApi.User user) {
            String str2;
            String X = u.this.X();
            if (!b() && X != null && str.toLowerCase().equals(X.toLowerCase()) && (str2 = user.username) != null && str2.toLowerCase().equals(X.toLowerCase())) {
                u.this.H(user);
            }
        }

        @Override
        public void c(TdApi.Object object) {
            final TdApi.User f42;
            if (t2.P0(object) != 0 && (f42 = u.this.f15880b.f4((TdApi.Chat) object)) != null && f42.type.getConstructor() == -970625144 && ((TdApi.UserTypeBot) f42.type).isInline) {
                hj hd2 = u.this.f15880b.hd();
                final String str = this.f15900b;
                hd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        u.b.this.e(str, f42);
                    }
                });
            }
        }
    }

    public class c extends ie.k {
        public final TdApi.GetInlineQueryResults M;
        public final TdApi.Location N;
        public final boolean O;
        public final String P;
        public final long f15902b;
        public final String f15903c;

        public c(long j10, String str, TdApi.GetInlineQueryResults getInlineQueryResults, TdApi.Location location, boolean z10, String str2) {
            this.f15902b = j10;
            this.f15903c = str;
            this.M = getInlineQueryResults;
            this.N = location;
            this.O = z10;
            this.P = str2;
        }

        public void f(String str, TdApi.Location location, TdApi.InlineQueryResults inlineQueryResults, ArrayList arrayList) {
            if (!b() && u.this.X() != null) {
                u.this.P0(str, location, inlineQueryResults.nextOffset, arrayList);
            }
        }

        public void g() {
            if (!b() && u.this.X() != null) {
                u.this.K0(false);
                u.this.Y();
            }
        }

        @Override
        public void c(TdApi.Object object) {
            int constructor = object.getConstructor();
            if (constructor != -1679978726) {
                if (constructor == 1000709656) {
                    final TdApi.InlineQueryResults inlineQueryResults = (TdApi.InlineQueryResults) object;
                    long uptimeMillis = SystemClock.uptimeMillis() - this.f15902b;
                    long j10 = 0;
                    final ArrayList p02 = u.p0(u.this.f15878a, u.this.f15880b, u.this.f15884d0 != null ? u.this.f15884d0.f19979id : 0L, this.f15903c, inlineQueryResults, inlineQueryResults.switchPmText, inlineQueryResults.switchPmParameter, this.M, inlineQueryResults.nextOffset);
                    hj hd2 = u.this.f15880b.hd();
                    final String str = this.f15903c;
                    final TdApi.Location location = this.N;
                    Runnable xVar = new Runnable() {
                        @Override
                        public final void run() {
                            u.c.this.f(str, location, inlineQueryResults, p02);
                        }
                    };
                    if (this.O && uptimeMillis < 100) {
                        j10 = 100 - uptimeMillis;
                    }
                    hd2.postDelayed(xVar, j10);
                    return;
                }
            } else if (t2.l0(object) != 406) {
                if (t2.l0(object) == 502) {
                    j0.q0(this.P);
                }
            } else {
                return;
            }
            u.this.f15880b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    u.c.this.g();
                }
            });
        }
    }

    public class d extends ie.k {
        public final String M;
        public final String f15904b;
        public final TdApi.GetInlineQueryResults f15905c;

        public d(String str, TdApi.GetInlineQueryResults getInlineQueryResults, String str2) {
            this.f15904b = str;
            this.f15905c = getInlineQueryResults;
            this.M = str2;
        }

        public void f(String str, TdApi.InlineQueryResults inlineQueryResults, ArrayList arrayList) {
            if (!b() && u.this.Z != null && str.equals(u.this.Z)) {
                u.this.K();
                u.this.G(inlineQueryResults.nextOffset, arrayList);
            }
        }

        public void g(String str) {
            if (!b() && u.this.Z != null && str.equals(u.this.Z)) {
                u.this.K();
                u.this.K0(false);
            }
        }

        @Override
        public void c(TdApi.Object object) {
            if (object.getConstructor() != 1000709656) {
                hj hd2 = u.this.f15880b.hd();
                final String str = this.M;
                hd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        u.d.this.g(str);
                    }
                });
                return;
            }
            final TdApi.InlineQueryResults inlineQueryResults = (TdApi.InlineQueryResults) object;
            final ArrayList p02 = u.p0(u.this.f15878a, u.this.f15880b, u.this.f15884d0 != null ? u.this.f15884d0.f19979id : 0L, this.f15904b, inlineQueryResults, null, null, this.f15905c, inlineQueryResults.nextOffset);
            hj hd3 = u.this.f15880b.hd();
            final String str2 = this.M;
            hd3.post(new Runnable() {
                @Override
                public final void run() {
                    u.d.this.f(str2, inlineQueryResults, p02);
                }
            });
        }
    }

    public class e implements Client.g {
        public final String f15906a;

        public e(String str) {
            this.f15906a = str;
        }

        public void b(ArrayList arrayList, String str) {
            u.this.f15890j0 = arrayList;
            if (str.equals(u.this.f15891k0)) {
                u.this.k0(str);
            }
        }

        @Override
        public void r2(TdApi.Object object) {
            final ArrayList arrayList = new ArrayList();
            int constructor = object.getConstructor();
            if (constructor == 171203420) {
                long[] jArr = ((TdApi.Users) object).userIds;
                ArrayList<TdApi.User> T2 = u.this.f15880b.e2().T2(jArr);
                arrayList.ensureCapacity(jArr.length);
                Iterator<TdApi.User> it = T2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new hd.x(u.this.f15878a, u.this.f15880b, it.next(), true));
                }
            } else if (constructor == 1809654812) {
                List<TdApi.Chat> m42 = u.this.f15880b.m4(((TdApi.Chats) object).chatIds);
                arrayList.ensureCapacity(m42.size());
                for (TdApi.Chat chat : m42) {
                    TdApi.User f42 = u.this.f15880b.f4(chat);
                    if (f42 != null) {
                        arrayList.add(new hd.x(u.this.f15878a, u.this.f15880b, f42, true));
                    }
                }
                if (m42.isEmpty()) {
                    u.this.f15880b.v4().o(new TdApi.GetRecentInlineBots(), this);
                    return;
                }
            }
            hj hd2 = u.this.f15880b.hd();
            final String str = this.f15906a;
            hd2.post(new Runnable() {
                @Override
                public final void run() {
                    u.e.this.b(arrayList, str);
                }
            });
        }
    }

    public class f extends ie.k {
        public final int M;
        public final TdApi.Function N;
        public final String O;
        public final ArrayList P;
        public final boolean f15908b;
        public final int f15909c;

        public f(boolean z10, int i10, int i11, TdApi.Function function, String str, ArrayList arrayList) {
            this.f15908b = z10;
            this.f15909c = i10;
            this.M = i11;
            this.N = function;
            this.O = str;
            this.P = arrayList;
        }

        public void e(String str, ArrayList arrayList, ArrayList arrayList2) {
            if (!b() && ib.i.c(u.this.S, str)) {
                if (arrayList.isEmpty()) {
                    if (arrayList2.isEmpty()) {
                        u.this.Y();
                    }
                } else if (arrayList2.isEmpty()) {
                    u.this.Q0(arrayList);
                } else {
                    arrayList2.ensureCapacity(arrayList2.size() + arrayList.size());
                    arrayList2.addAll(arrayList);
                    u.this.Q0(arrayList2);
                }
            }
        }

        @Override
        public void c(TdApi.Object object) {
            ArrayList arrayList = this.f15908b ? u.this.f15890j0 : null;
            final ArrayList arrayList2 = new ArrayList();
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                Log.w("Cannot invoke %s: %s", this.N.toString(), t2.z5(object));
            } else if (constructor == -497558622) {
                TdApi.ChatMember[] chatMemberArr = ((TdApi.ChatMembers) object).members;
                if (chatMemberArr.length > 0) {
                    arrayList2.ensureCapacity(chatMemberArr.length);
                    for (TdApi.ChatMember chatMember : chatMemberArr) {
                        if (chatMember.memberId.getConstructor() == -336109341 && u.Z(arrayList, ((TdApi.MessageSenderUser) chatMember.memberId).userId) == -1) {
                            hd.x xVar = new hd.x(u.this.f15878a, u.this.f15880b, u.this.f15880b.e2().u2(((TdApi.MessageSenderUser) chatMember.memberId).userId), false);
                            xVar.U(this.f15909c, this.M);
                            arrayList2.add(xVar);
                        }
                    }
                }
            } else if (constructor == 171203420) {
                long[] jArr = ((TdApi.Users) object).userIds;
                if (jArr.length > 0) {
                    ArrayList<TdApi.User> T2 = u.this.f15880b.e2().T2(jArr);
                    arrayList2.ensureCapacity(jArr.length);
                    Iterator<TdApi.User> it = T2.iterator();
                    while (it.hasNext()) {
                        TdApi.User next = it.next();
                        if (u.Z(arrayList, next.f19979id) == -1) {
                            hd.x xVar2 = new hd.x(u.this.f15878a, u.this.f15880b, next, false);
                            xVar2.U(this.f15909c, this.M);
                            arrayList2.add(xVar2);
                        }
                    }
                }
            }
            hj hd2 = u.this.f15880b.hd();
            final String str = this.O;
            final ArrayList arrayList3 = this.P;
            hd2.post(new Runnable() {
                @Override
                public final void run() {
                    u.f.this.e(str, arrayList2, arrayList3);
                }
            });
        }
    }

    public class g extends ie.k {
        public final int M;
        public final String N;
        public final String f15910b;
        public final int f15911c;

        public g(String str, int i10, int i11, String str2) {
            this.f15910b = str;
            this.f15911c = i10;
            this.M = i11;
            this.N = str2;
        }

        public void e(String str, ArrayList arrayList) {
            if (!b() && ib.i.c(u.this.S, str)) {
                if (arrayList == null || arrayList.isEmpty()) {
                    u.this.Y();
                } else {
                    u.this.O0(arrayList);
                }
            }
        }

        @Override
        public void c(TdApi.Object object) {
            final ArrayList arrayList;
            if (object.getConstructor() == 676798885) {
                String[] strArr = ((TdApi.Hashtags) object).hashtags;
                if (strArr.length != 0) {
                    arrayList = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        v vVar = new v(u.this.f15878a, u.this.f15880b, str, this.f15910b);
                        vVar.U(this.f15911c, this.M);
                        arrayList.add(vVar);
                    }
                } else {
                    arrayList = null;
                }
                hj hd2 = u.this.f15880b.hd();
                final String str2 = this.N;
                hd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        u.g.this.e(str2, arrayList);
                    }
                });
            }
        }
    }

    public class h extends kb.b {
        public final String M;
        public final int N;
        public final int O;
        public final List P;
        public final String Q;

        public h(String str, int i10, int i11, List list, String str2) {
            this.M = str;
            this.N = i10;
            this.O = i11;
            this.P = list;
            this.Q = str2;
        }

        public void j(String str, ArrayList arrayList, ArrayList arrayList2) {
            if (d() && ib.i.c(str, u.this.S)) {
                if (arrayList == null || arrayList.isEmpty()) {
                    u.this.N0(arrayList2);
                    return;
                }
                arrayList.addAll(arrayList2);
                u.this.N0(arrayList);
            }
        }

        public void k(final ArrayList arrayList, int i10, int i11, final String str, TdApi.Object object) {
            String[] strArr;
            boolean z10;
            if (object.getConstructor() == 950339552) {
                TdApi.Emojis emojis = (TdApi.Emojis) object;
                final ArrayList arrayList2 = new ArrayList(emojis.emojis.length);
                for (String str2 : emojis.emojis) {
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            o oVar = (o) it.next();
                            if ((oVar instanceof t) && id.d.m(str2, ((t) oVar).Z())) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (!z10) {
                        arrayList2.add(new t(u.this.f15878a, u.this.f15880b, new N.Suggestion(str2, null, null), null).U(i10, i11));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    u.this.f15880b.hd().post(new Runnable() {
                        @Override
                        public final void run() {
                            u.h.this.j(str, arrayList, arrayList2);
                        }
                    });
                }
            }
        }

        public void l(String str, ArrayList arrayList) {
            if (d() && ib.i.c(str, u.this.S)) {
                if (arrayList == null || arrayList.isEmpty()) {
                    u.this.Y();
                } else {
                    u.this.N0(arrayList);
                }
            }
        }

        @Override
        public void b() {
            throw new UnsupportedOperationException("Method not decompiled: kd.u.h.b():void");
        }
    }

    public interface i {
        TdApi.WebPage a(TdApi.FormattedText formattedText);

        void b(ArrayList<o<?>> arrayList, boolean z10);

        boolean c();

        TdApi.FormattedText d(boolean z10);

        long e();

        void g(boolean z10, boolean z11);

        void h(ArrayList<o<?>> arrayList);

        boolean j();

        TdApi.Chat m();

        void n();

        long o();

        void r(String str, String str2);

        void t(ArrayList<dd.l> arrayList, boolean z10);

        boolean u(String str, TdApi.WebPage webPage);

        boolean v();

        int w(int i10, String str);
    }

    public interface j {
        ArrayList<o<?>> a(String str, String str2, l lVar);
    }

    public static class k implements o0.c {
        public final ArrayList<o<?>> f15912a;
        public final TdApi.GetInlineQueryResults f15913b;
        public final String f15914c;

        public k(ArrayList<o<?>> arrayList, TdApi.GetInlineQueryResults getInlineQueryResults, String str) {
            this.f15912a = arrayList;
            this.f15913b = getInlineQueryResults;
            this.f15914c = str;
        }

        @Override
        public o0.b m5(TdApi.Message message) {
            TdApi.Message a02;
            ArrayList<o<?>> arrayList = this.f15912a;
            if (arrayList != null && !arrayList.isEmpty()) {
                int constructor = message.content.getConstructor();
                Iterator<o<?>> it = this.f15912a.iterator();
                ArrayList arrayList2 = null;
                int i10 = -1;
                while (it.hasNext()) {
                    o<?> next = it.next();
                    if ((next instanceof s) && (a02 = ((s) next).a0()) != null && a02.content.getConstructor() == constructor) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        if (o0.D(a02, message)) {
                            i10 = arrayList2.size();
                        }
                        arrayList2.add(a02);
                    }
                }
                if (i10 != -1) {
                    return new o0.b(arrayList2, i10).p(this.f15913b, this.f15914c);
                }
            }
            return null;
        }

        @Override
        public boolean p7(TdApi.Message message, boolean z10, boolean z11, List<TdApi.Message> list, long j10) {
            return false;
        }
    }

    public interface l {
        void a(String str);
    }

    public interface m {
        boolean a(char c10);
    }

    public u(final org.thunderdog.challegram.a aVar, o6 o6Var, i iVar) {
        this.f15878a = aVar;
        x0 x0Var = new x0(aVar, this, true, false);
        this.M = x0Var;
        x0Var.z(new x0.h() {
            @Override
            public final void a(boolean z10, Runnable runnable, a aVar2) {
                u.this.e0(aVar, z10, runnable, aVar2);
            }
        });
        this.f15880b = o6Var;
        this.f15882c = iVar;
    }

    public static void G0(char c10, String str, int i10, int[] iArr, m mVar) {
        int i11 = -1;
        boolean z10 = i10 != -1 && i10 >= 0 && i10 <= str.length();
        if (!z10) {
            i10 = str.length();
        }
        int i12 = i10 - 1;
        while (true) {
            if (i12 >= 0) {
                char charAt = str.charAt(i12);
                if (charAt == c10) {
                    break;
                }
                i12--;
                if (!mVar.a(charAt)) {
                    i12 = -1;
                    break;
                }
            } else {
                break;
            }
        }
        if (i12 != -1 && (str.charAt(i12) != c10 || (i12 > 0 && !c0.O(str.charAt(i12 - 1))))) {
            i12 = -1;
        }
        if (i12 != -1 && !z10) {
            int length = str.length();
            while (i10 < length) {
                char charAt2 = str.charAt(i10);
                if (charAt2 != ' ' && charAt2 != '\n') {
                    i10++;
                    if (!mVar.a(charAt2)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        i11 = i10;
        iArr[0] = i12;
        iArr[1] = i11;
    }

    public static String R0(InputMethodSubtype inputMethodSubtype) {
        Locale r02;
        if (inputMethodSubtype == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            String languageTag = inputMethodSubtype.getLanguageTag();
            if (!ib.i.i(languageTag)) {
                return languageTag;
            }
        }
        String locale = inputMethodSubtype.getLocale();
        if (ib.i.i(locale) || (r02 = v0.r0(locale)) == null) {
            return null;
        }
        return db.d.a(r02);
    }

    public static int Z(ArrayList<o<?>> arrayList, long j10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            Iterator<o<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                o<?> next = it.next();
                if ((next instanceof hd.x) && ((hd.x) next).d0() == j10) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public void c0(int i10, String str, TdApi.WebPage webPage) {
        if (this.f15897q0 == i10) {
            this.f15882c.u(str, webPage);
        }
    }

    public void e0(final org.thunderdog.challegram.a aVar, boolean z10, Runnable runnable, final ie.a aVar2) {
        if (z10) {
            aVar.L2(false, true, aVar2);
        } else {
            a0.g(aVar, X(), runnable, new Runnable() {
                @Override
                public final void run() {
                    org.thunderdog.challegram.a.this.L2(false, true, aVar2);
                }
            });
        }
    }

    public void f0(int i10, String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            if (((TdApi.Error) object).code != 404) {
                Log.w("Cannot load link preview: %s", t2.z5(object));
            }
            T(i10, null, null);
        } else if (constructor != -577333714) {
            Log.unexpectedTdlibResponse(object, TdApi.GetWebPagePreview.class, TdApi.WebPage.class);
        } else {
            T(i10, str, (TdApi.WebPage) object);
        }
    }

    public void g0(final int i10, final String str) {
        if (this.f15897q0 == i10) {
            this.f15880b.v4().o(new TdApi.GetWebPagePreview(this.f15882c.d(true)), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    u.this.f0(i10, str, object);
                }
            });
        }
    }

    public void h0(boolean[] zArr, String str, boolean z10) {
        if (!zArr[0]) {
            zArr[0] = true;
            if (str != null && str.equals(X())) {
                B0(this.f15884d0.username, this.S.substring(str.length() + 2), null, z10);
            }
        }
    }

    public void i0(boolean[] zArr, String str) {
        if (!zArr[0]) {
            zArr[0] = true;
            if (str != null && str.equals(X())) {
                this.f15885e0 = true;
                he.i.c2().e4(this.f15884d0.f19979id);
                C0(this.S.substring(str.length() + 2), true, true);
            }
        }
    }

    public static void j0(DialogInterface dialogInterface, int i10) {
        he.i.c2().u2(1L);
    }

    public static boolean l0(char c10) {
        return c10 == '_' || Character.isLetterOrDigit(c10);
    }

    public static ArrayList<o<?>> p0(org.thunderdog.challegram.a aVar, o6 o6Var, long j10, String str, TdApi.InlineQueryResults inlineQueryResults, String str2, String str3, TdApi.GetInlineQueryResults getInlineQueryResults, String str4) {
        ArrayList<o<?>> arrayList = new ArrayList<>(inlineQueryResults.results.length + ((str2 == null || str2.isEmpty()) ? 0 : 1));
        if (str2 != null && !str2.isEmpty()) {
            arrayList.add(new p(aVar, o6Var, j10, str2, str3));
        }
        k kVar = new k(arrayList, getInlineQueryResults, str4);
        for (TdApi.InlineQueryResult inlineQueryResult : inlineQueryResults.results) {
            o<?> W = o.W(aVar, o6Var, str, inlineQueryResult, kVar);
            if (W != null) {
                W.N(arrayList);
                W.T(inlineQueryResults.inlineQueryId);
                arrayList.add(W);
            }
        }
        return arrayList;
    }

    public final void A0(int i10, int i11, String str, String str2) {
        if (this.W != 4) {
            Y();
        }
        this.f15880b.v4().o(new TdApi.SearchHashtags(str2, 50), new g(str2, i10, i11, str));
    }

    public final void B0(String str, String str2, Location location, boolean z10) {
        v4<?> s10;
        K0(true);
        K();
        TdApi.Location location2 = location != null ? new TdApi.Location(location.getLatitude(), location.getLongitude(), location.getAccuracy()) : null;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.f15884d0.f19979id;
        long o10 = this.f15882c.o();
        TdApi.Location location3 = location2;
        TdApi.GetInlineQueryResults getInlineQueryResults = new TdApi.GetInlineQueryResults(j10, o10, location3, str2, null);
        this.f15887g0 = new c(uptimeMillis, str2, getInlineQueryResults, location3, z10, str);
        if (o10 != 0 && ib.i.i(str2) && he.i.c2().X2(1L) && ob.a.j(this.f15882c.o()) && (s10 = j0.s()) != null) {
            s10.Fc(R.string.AppName, w.i1(R.string.SecretChatContextBotAlert), w.i1(R.string.Confirm), kd.g.f15788a, 3);
        }
        this.f15880b.v4().o(getInlineQueryResults, this.f15887g0);
    }

    public final void C0(String str, boolean z10, boolean z11) {
        K0(true);
        this.M.t(this.S, null, 7000L, z10, z11);
    }

    public final void D0(int i10, int i11, final String str, String str2, boolean z10) {
        TdApi.Function function;
        if (z10) {
            Y();
            this.f15880b.hd().postDelayed(new Runnable() {
                @Override
                public final void run() {
                    u.this.k0(str);
                }
            }, 100L);
            return;
        }
        ArrayList<o<?>> arrayList = new ArrayList<>();
        boolean z11 = true;
        boolean z12 = i10 == 0 && !a0() && this.f15882c.j();
        if (z12) {
            ArrayList<o<?>> arrayList2 = this.f15890j0;
            if (arrayList2 == null) {
                if (this.f15891k0 != null) {
                    z11 = false;
                }
                this.f15891k0 = str;
                if (z11) {
                    this.f15880b.v4().o(new TdApi.GetTopChats(new TdApi.TopChatCategoryInlineBots(), 10), new e(str));
                    return;
                }
                return;
            }
            Iterator<o<?>> it = arrayList2.iterator();
            while (it.hasNext()) {
                o<?> next = it.next();
                if (str2.isEmpty() || ((hd.x) next).h0(str2, false)) {
                    next.U(i10, i11);
                    arrayList.add(next);
                }
            }
        }
        TdApi.Chat m10 = this.f15882c.m();
        if (m10 == null || !t2.N2(m10.type)) {
            if (!arrayList.isEmpty()) {
                Q0(arrayList);
            } else if (this.W != 2) {
                Y();
            }
            if (this.f15882c.e() == 0) {
                function = new TdApi.SearchChatMembers(this.f15882c.o(), str2, 20, null);
            } else if (!z12) {
                function = new TdApi.SearchContacts(str2, 50);
            } else if (arrayList.isEmpty()) {
                Y();
                return;
            } else {
                return;
            }
            Client v42 = this.f15880b.v4();
            f fVar = new f(z12, i10, i11, function, str, arrayList);
            this.f15892l0 = fVar;
            v42.o(function, fVar);
        } else if (arrayList.isEmpty()) {
            Y();
        } else {
            Q0(arrayList);
        }
    }

    public final boolean E0(int i10) {
        int i11;
        boolean z10;
        this.T = true;
        this.U = i10;
        if (this.S.charAt(0) == '/') {
            int length = this.S.length();
            int i12 = 1;
            while (true) {
                if (i12 >= length) {
                    z10 = true;
                    break;
                } else if (!t2.s4(this.S.charAt(i12))) {
                    z10 = false;
                    break;
                } else {
                    i12++;
                }
            }
            if (z10) {
                I0(5);
                y0(this.S.substring(1));
                return false;
            }
        }
        G0('@', this.S, i10, this.f15889i0, f15876s0);
        int[] iArr = this.f15889i0;
        if (iArr[0] == -1 || iArr[1] == -1) {
            G0('#', this.S, i10, iArr, f15875r0);
            int[] iArr2 = this.f15889i0;
            if (iArr2[0] == -1 || iArr2[1] == -1) {
                G0(':', this.S, i10, iArr2, f15877t0);
                int[] iArr3 = this.f15889i0;
                if (iArr3[0] == -1 || iArr3[1] == -1 || (i11 = (iArr3[1] - iArr3[0]) - 1) <= 0 || i11 > N.getEmojiSuggestionMaxLength() - 5) {
                    I0(0);
                    return true;
                }
                I0(3);
                int[] iArr4 = this.f15889i0;
                int i13 = iArr4[0];
                int i14 = iArr4[1];
                String str = this.S;
                z0(i13, i14, str, str.substring(iArr4[0] + 1, iArr4[1]));
                return true;
            }
            I0(2);
            int[] iArr5 = this.f15889i0;
            int i15 = iArr5[0];
            int i16 = iArr5[1];
            String str2 = this.S;
            A0(i15, i16, str2, str2.substring(iArr5[0] + 1, iArr5[1]));
            return true;
        }
        boolean z11 = this.Q == 6;
        I0(1);
        int[] iArr6 = this.f15889i0;
        int i17 = iArr6[0];
        int i18 = iArr6[1];
        String str3 = this.S;
        D0(i17, i18, str3, str3.substring(iArr6[0] + 1, iArr6[1]), z11);
        return true;
    }

    public final void F0(String str, boolean z10, int[] iArr) {
        TdApi.Function function;
        int K1 = he.i.c2().K1();
        if (K1 != 2) {
            if (K1 != 0 || z10 || !this.f15880b.Ec()) {
                this.f15881b0 = new a(iArr, z10, str, K1);
                if (z10) {
                    function = new TdApi.SearchStickers(str, 1000);
                } else {
                    function = new TdApi.GetStickers(str, 1000);
                }
                this.f15880b.v4().o(function, this.f15881b0);
                return;
            }
            F0(str, true, iArr);
        }
    }

    public final void G(String str, ArrayList<o<?>> arrayList) {
        K();
        this.Z = str;
        this.f15882c.h(arrayList);
        K0(false);
    }

    public final void H(TdApi.User user) {
        this.f15884d0 = user;
        this.f15885e0 = ((TdApi.UserTypeBot) user.type).needLocation && he.i.c2().v(this.f15884d0.f19979id);
        String X = X();
        i iVar = this.f15882c;
        if (X == null) {
            X = user.username;
        }
        iVar.r(X, ((TdApi.UserTypeBot) user.type).inlineQueryPlaceholder);
        I0(6);
        u0(this.S.substring(user.username.length() + 2), true);
    }

    public void H0(j jVar) {
        this.O = jVar;
    }

    public final void I() {
        kb.b bVar = this.f15894n0;
        if (bVar != null) {
            bVar.c();
            this.f15894n0 = null;
        }
    }

    public final void I0(int i10) {
        int i11 = this.Q;
        if (i11 != i10) {
            boolean z10 = true;
            boolean z11 = i11 == 6;
            this.Q = i10;
            if (i10 != 6) {
                z10 = false;
            }
            if (z11 != z10) {
                this.f15882c.g(z10, this.f15879a0);
            }
            Y();
        }
    }

    public final void J() {
        ie.k kVar = this.f15893m0;
        if (kVar != null) {
            kVar.a();
            this.f15893m0 = null;
        }
    }

    public void J0(boolean z10, boolean z11) {
        if (S() != z10) {
            if (z10) {
                this.P |= 2;
            } else {
                this.P &= -3;
            }
            if (!this.S.trim().isEmpty() && z11) {
                String str = this.S;
                CharSequence charSequence = this.R;
                this.S = "";
                this.R = "";
                o0(charSequence, str, this.V);
            }
        }
    }

    public final void K() {
        ie.k kVar = this.f15888h0;
        if (kVar != null) {
            kVar.a();
            this.f15888h0 = null;
        }
    }

    public final void K0(boolean z10) {
        if (this.f15879a0 != z10) {
            this.f15879a0 = z10;
            this.f15882c.g(this.Q == 6, z10);
        }
    }

    public final void L() {
        ie.k kVar = this.f15887g0;
        if (kVar != null) {
            kVar.a();
            this.f15887g0 = null;
        }
        K();
    }

    public void L0(boolean z10) {
        if (z10) {
            this.P |= 1;
        } else {
            this.P &= -2;
        }
    }

    public final void M() {
        this.M.h();
    }

    public final void M0(ArrayList<o<?>> arrayList) {
        this.W = 3;
        this.f15882c.b(arrayList, true);
    }

    public final void N() {
        ie.k kVar = this.f15892l0;
        if (kVar != null) {
            kVar.a();
            this.f15892l0 = null;
        }
    }

    public final void N0(ArrayList<o<?>> arrayList) {
        this.W = 5;
        this.f15882c.b(arrayList, false);
    }

    public final void O() {
        P();
        L();
        M();
        J();
        I();
        N();
    }

    public final void O0(ArrayList<o<?>> arrayList) {
        this.W = 4;
        this.f15882c.b(arrayList, false);
    }

    public final void P() {
        ie.k kVar = this.f15881b0;
        if (kVar != null) {
            kVar.a();
            this.f15881b0 = null;
        }
    }

    public final void P0(String str, TdApi.Location location, String str2, ArrayList<o<?>> arrayList) {
        this.X = str;
        this.Z = str2;
        this.Y = location;
        this.W = 1;
        this.f15882c.b(arrayList, true);
        K0(false);
    }

    public final void Q() {
        ie.k kVar = this.f15886f0;
        if (kVar != null) {
            kVar.a();
            this.f15886f0 = null;
        }
        this.f15882c.r("", "");
        x0();
        this.f15884d0 = null;
        this.f15883c0 = null;
    }

    public final void Q0(ArrayList<o<?>> arrayList) {
        this.W = 2;
        this.f15882c.b(arrayList, false);
    }

    public final void R() {
        this.f15882c.u(null, null);
    }

    public final boolean S() {
        return (this.P & 2) != 0;
    }

    @Override
    public void S4(x0 x0Var, String str, Location location) {
        if (this.S.equals(str)) {
            B0(this.f15884d0.username, W(), location, false);
        }
    }

    public final void T(final int i10, final String str, final TdApi.WebPage webPage) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                u.this.c0(i10, str, webPage);
            }
        });
    }

    public final void U(TdApi.Sticker[] stickerArr, String str, boolean z10) {
        ArrayList<dd.l> arrayList = new ArrayList<>(stickerArr.length);
        for (TdApi.Sticker sticker : stickerArr) {
            arrayList.add(new dd.l(this.f15880b, sticker, str, sticker.type));
        }
        this.f15882c.t(arrayList, z10);
    }

    public void V() {
        k0(this.S);
    }

    public final String W() {
        String X = X();
        if (X != null) {
            return this.S.substring(X.length() + 2);
        }
        return null;
    }

    public String X() {
        if (!a0() && !S() && this.S.length() > 1 && this.S.charAt(0) == '@') {
            int length = this.S.length();
            for (int i10 = 1; i10 < length; i10++) {
                char charAt = this.S.charAt(i10);
                if (!t2.u4(charAt)) {
                    if (charAt == ' ') {
                        return this.S.substring(1, i10);
                    } else {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final void Y() {
        this.f15882c.n();
    }

    @Override
    public void a() {
        v0();
    }

    public boolean a0() {
        return (this.P & 1) != 0;
    }

    public boolean b0() {
        return this.f15879a0 || this.f15882c.v();
    }

    @Override
    public void l4(x0 x0Var, int i10, String str, Location location) {
        String W = W();
        if (i10 == -1 && ((W == null || W.isEmpty()) && !v0.L2("android.permission.ACCESS_FINE_LOCATION"))) {
            ce.v.C();
        }
        if (this.S.equals(str)) {
            B0(this.f15884d0.username, W, location, false);
        }
    }

    public void m0(int i10) {
        this.V = i10;
        if (this.T && this.U != i10) {
            O();
            E0(i10);
        }
    }

    public void k0(String str) {
        if (!this.S.isEmpty() && this.S.equals(str)) {
            this.S = "";
            this.R = "";
            o0(str, str, this.V);
        }
    }

    public void o0(CharSequence charSequence, String str, int i10) {
        this.V = i10;
        if (!ib.i.c(this.S, str)) {
            this.S = str;
            boolean z10 = false;
            this.T = false;
            O();
            if (str.trim().isEmpty()) {
                Q();
                I0(0);
            } else if (ce.h.j(charSequence)) {
                Q();
                if (a0() || S()) {
                    I0(0);
                } else {
                    I0(4);
                    F0(str, false, null);
                }
            } else {
                String X = X();
                if (X != null) {
                    q0(X, this.S.substring(X.length() + 2), i10);
                } else {
                    Q();
                    z10 = E0(i10);
                }
            }
            if (!z10) {
                str = "";
            }
            s0(str);
        }
    }

    public final void q0(String str, String str2, int i10) {
        String str3 = this.f15883c0;
        if (str3 == null || !str3.toLowerCase().equals(str.toLowerCase())) {
            this.f15883c0 = str;
            ie.k kVar = this.f15886f0;
            if (kVar != null) {
                kVar.a();
                this.f15886f0 = null;
            }
            TdApi.User P1 = this.f15880b.e2().P1(str.toLowerCase());
            if (P1 == null) {
                E0(i10);
                this.f15886f0 = new b(str);
                this.f15880b.v4().o(new TdApi.SearchPublicChat(str), this.f15886f0);
            } else if (P1.type.getConstructor() != -970625144 || !((TdApi.UserTypeBot) P1.type).isInline) {
                E0(i10);
            } else if (this.f15880b.wc(this.f15882c.m(), R.id.right_sendStickersAndGifs, R.string.ChatDisabledBots, R.string.ChatRestrictedBots, R.string.ChatRestrictedBotsUntil)) {
                E0(i10);
            } else {
                H(P1);
            }
        } else {
            TdApi.User user = this.f15884d0;
            if (user == null) {
                E0(i10);
            } else if (this.f15885e0) {
                C0(str2, str2 != null && str2.isEmpty(), false);
            } else {
                B0(user.username, str2, null, false);
            }
        }
    }

    public final void r0(final int i10, final String str) {
        int w10 = !ib.i.i(str) ? this.f15882c.w(i10, str) : 2;
        if (w10 != 1 && this.f15882c.u(str, null)) {
            if (w10 == 0) {
                i iVar = this.f15882c;
                TdApi.WebPage a10 = iVar.a(iVar.d(false));
                if (a10 != null) {
                    T(i10, str, a10);
                } else {
                    j0.e0(new Runnable() {
                        @Override
                        public final void run() {
                            u.this.g0(i10, str);
                        }
                    }, 400L);
                }
            } else if (w10 == 2) {
                T(i10, null, null);
            }
        }
    }

    public final void s0(String str) {
        boolean z10;
        List<String> v02;
        this.f15896p0.clear();
        if (!ib.i.i(str) && (v02 = t2.v0(this.f15882c.d(true))) != null && !v02.isEmpty()) {
            this.f15896p0.addAll(v02);
        }
        int size = this.f15896p0.size();
        if (this.f15895o0.size() == size) {
            if (size != 0) {
                Iterator<String> it = this.f15895o0.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                    if (!this.f15896p0.get(i10).equals(it.next())) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f15895o0.clear();
        this.f15895o0.addAll(this.f15896p0);
        int i11 = this.f15897q0 + 1;
        this.f15897q0 = i11;
        if (size == 0 || !this.f15882c.c()) {
            R();
        } else {
            r0(i11, this.f15895o0.get(0));
        }
    }

    public void t0(long j10) {
        ArrayList<o<?>> arrayList = this.f15890j0;
        if (arrayList != null) {
            int i10 = 0;
            Iterator<o<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                o<?> next = it.next();
                if (!(next instanceof hd.x) || ((hd.x) next).d0() != j10) {
                    i10++;
                } else {
                    this.f15890j0.remove(i10);
                    return;
                }
            }
        }
    }

    public final void u0(String str, final boolean z10) {
        TdApi.User user = this.f15884d0;
        if (!((TdApi.UserTypeBot) user.type).needLocation) {
            B0(user.username, str, null, z10);
        } else if (this.f15885e0) {
            C0(str, true, false);
        } else {
            final boolean[] zArr = new boolean[1];
            final String X = X();
            a0.g(this.f15878a, X, new Runnable() {
                @Override
                public final void run() {
                    u.this.h0(zArr, X, z10);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    u.this.i0(zArr, X);
                }
            });
        }
    }

    public void v0() {
        String str = this.Z;
        if (str != null && !str.isEmpty() && this.f15888h0 == null) {
            String str2 = this.X;
            TdApi.GetInlineQueryResults getInlineQueryResults = new TdApi.GetInlineQueryResults(this.f15884d0.f19979id, this.f15882c.o(), this.Y, str2, this.Z);
            this.f15888h0 = new d(str2, getInlineQueryResults, this.Z);
            K0(true);
            this.f15880b.v4().o(getInlineQueryResults, this.f15888h0);
        }
    }

    public void w0() {
        if (this.f15890j0 != null) {
            this.f15890j0 = null;
            this.f15891k0 = null;
        }
    }

    public final void x0() {
        this.X = null;
        this.Z = null;
        this.Y = null;
        K0(false);
    }

    public final void y0(String str) {
        ArrayList<o<?>> a10;
        j jVar = this.O;
        if (jVar == null || (a10 = jVar.a(str, this.S, this.N)) == null || a10.isEmpty()) {
            Y();
        } else {
            M0(a10);
        }
    }

    public final void z0(int i10, int i11, String str, String str2) {
        if (this.W != 5) {
            Y();
        }
        ArrayList arrayList = new ArrayList();
        InputMethodManager inputMethodManager = (InputMethodManager) j0.n().getSystemService("input_method");
        if (inputMethodManager != null) {
            String str3 = null;
            try {
                str3 = R0(inputMethodManager.getCurrentInputMethodSubtype());
            } catch (Throwable unused) {
            }
            if (ib.i.i(str3)) {
                try {
                    str3 = R0(inputMethodManager.getLastInputMethodSubtype());
                } catch (Throwable unused2) {
                }
            }
            if (!ib.i.i(str3)) {
                arrayList.add(str3);
            }
        }
        if (arrayList.isEmpty()) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
                    for (int i12 = 0; i12 < locales.size(); i12++) {
                        String a10 = db.d.a(locales.get(i12));
                        if (!ib.i.i(a10) && !arrayList.contains(a10)) {
                            arrayList.add(a10);
                        }
                    }
                } else {
                    String a11 = db.d.a(Resources.getSystem().getConfiguration().locale);
                    if (!ib.i.i(a11)) {
                        arrayList.add(a11);
                    }
                }
            } catch (Throwable unused3) {
            }
        }
        gd.l.a().b(new h(str2, i10, i11, arrayList, str));
    }
}
