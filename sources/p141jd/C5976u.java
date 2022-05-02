package p141jd;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.location.Location;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import be.C1363c0;
import be.C1374h;
import be.C1379j0;
import be.C1405v;
import cd.C2104l;
import gd.AbstractC4718o;
import gd.C4729p;
import gd.C4756s;
import gd.C4776t;
import gd.C4779t2;
import gd.C4809v;
import gd.C4828x;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2060d;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5070i;
import p110hd.C5078d;
import p111he.AbstractC5096a;
import p111he.AbstractC5123k;
import p139jb.AbstractRunnableC5910b;
import p141jd.C5976u;
import p141jd.C5996x0;
import p193nb.C7316a;
import p291uc.View$OnClickListenerC9694y;
import p292ud.C9773p0;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p363zc.C11477a0;
import td.AbstractC9323v4;

public class C5976u implements C5996x0.AbstractC6003g, View$OnClickListenerC9694y.AbstractC9702h {
    public static final AbstractC5989m f18995r0 = C5971s.f18955a;
    public static final AbstractC5989m f18996s0 = C5969r.f18952a;
    public static final AbstractC5989m f18997t0 = C5944h.f18877a;
    public final C5996x0 f18998M;
    public AbstractC5986j f19000O;
    public int f19001P;
    public int f19002Q;
    public CharSequence f19003R;
    public boolean f19005T;
    public int f19006U;
    public int f19007V;
    public int f19008W;
    public String f19009X;
    public TdApi.Location f19010Y;
    public String f19011Z;
    public final AbstractView$OnTouchListenerC7889a f19012a;
    public boolean f19013a0;
    public final C10930q6 f19014b;
    public AbstractC5123k f19015b0;
    public final AbstractC5985i f19016c;
    public String f19017c0;
    public TdApi.User f19018d0;
    public boolean f19019e0;
    public AbstractC5123k f19020f0;
    public AbstractC5123k f19021g0;
    public AbstractC5123k f19022h0;
    public ArrayList<AbstractC4718o<?>> f19024j0;
    public String f19025k0;
    public AbstractC5123k f19026l0;
    public AbstractC5123k f19027m0;
    public AbstractRunnableC5910b f19028n0;
    public int f19031q0;
    public final int[] f19023i0 = new int[2];
    public final ArrayList<String> f19029o0 = new ArrayList<>(5);
    public final ArrayList<String> f19030p0 = new ArrayList<>(5);
    public final AbstractC5988l f18999N = new AbstractC5988l() {
        @Override
        public final void mo21606a(String str) {
            C5976u.this.m21662k0(str);
        }
    };
    public String f19004S = "";

    public class C5977a extends AbstractC5123k {
        public final String f19032M;
        public final int f19033N;
        public final int[] f19035b;
        public final boolean f19036c;

        public C5977a(int[] iArr, boolean z, String str, int i) {
            this.f19035b = iArr;
            this.f19036c = z;
            this.f19032M = str;
            this.f19033N = i;
        }

        public void m21630e(TdApi.Sticker[] stickerArr, String str, boolean z, int i, int[] iArr) {
            if (!m23882b()) {
                C5976u.this.m21688U(stickerArr, str, z);
                if (!z && i == 0) {
                    C5976u.this.m21715F0(str, true, iArr);
                }
            }
        }

        @Override
        public void mo7438c(TdApi.Object object) {
            TdApi.Sticker[] stickerArr;
            int[] iArr;
            TdApi.Sticker[] stickerArr2;
            if (object.getConstructor() == 1974859260) {
                TdApi.Stickers stickers = (TdApi.Stickers) object;
                int[] iArr2 = this.f19035b;
                if (iArr2 == null || iArr2.length <= 0) {
                    stickerArr = stickers.stickers;
                } else {
                    ArrayList arrayList = new ArrayList(stickers.stickers.length);
                    for (TdApi.Sticker sticker : stickers.stickers) {
                        if (Arrays.binarySearch(this.f19035b, sticker.sticker.f25376id) < 0) {
                            arrayList.add(sticker);
                        }
                    }
                    stickerArr = new TdApi.Sticker[arrayList.size()];
                    arrayList.toArray(stickerArr);
                }
                final TdApi.Sticker[] stickerArr3 = stickerArr;
                if (this.f19036c) {
                    iArr = null;
                } else {
                    iArr = new int[stickerArr3.length];
                    int i = 0;
                    for (TdApi.Sticker sticker2 : stickerArr3) {
                        iArr[i] = sticker2.sticker.f25376id;
                        i++;
                    }
                    Arrays.sort(iArr);
                }
                final int[] iArr3 = iArr;
                HandlerC10770jj dd = C5976u.this.f19014b.m2485dd();
                final String str = this.f19032M;
                final boolean z = this.f19036c;
                final int i2 = this.f19033N;
                dd.post(new Runnable() {
                    @Override
                    public final void run() {
                        C5976u.C5977a.this.m21630e(stickerArr3, str, z, i2, iArr3);
                    }
                });
            }
        }
    }

    public class C5978b extends AbstractC5123k {
        public final String f19037b;

        public C5978b(String str) {
            this.f19037b = str;
        }

        public void m21628e(String str, TdApi.User user) {
            String str2;
            String X = C5976u.this.m21685X();
            if (!m23882b() && X != null && str.toLowerCase().equals(X.toLowerCase()) && (str2 = user.username) != null && str2.toLowerCase().equals(X.toLowerCase())) {
                C5976u.this.m21712H(user);
            }
        }

        @Override
        public void mo7438c(TdApi.Object object) {
            final TdApi.User b4;
            if (C4779t2.m25626P0(object) != 0 && (b4 = C5976u.this.f19014b.m2525b4((TdApi.Chat) object)) != null && b4.type.getConstructor() == 1262387765 && ((TdApi.UserTypeBot) b4.type).isInline) {
                HandlerC10770jj dd = C5976u.this.f19014b.m2485dd();
                final String str = this.f19037b;
                dd.post(new Runnable() {
                    @Override
                    public final void run() {
                        C5976u.C5978b.this.m21628e(str, b4);
                    }
                });
            }
        }
    }

    public class C5979c extends AbstractC5123k {
        public final TdApi.GetInlineQueryResults f19039M;
        public final TdApi.Location f19040N;
        public final boolean f19041O;
        public final String f19042P;
        public final long f19044b;
        public final String f19045c;

        public C5979c(long j, String str, TdApi.GetInlineQueryResults getInlineQueryResults, TdApi.Location location, boolean z, String str2) {
            this.f19044b = j;
            this.f19045c = str;
            this.f19039M = getInlineQueryResults;
            this.f19040N = location;
            this.f19041O = z;
            this.f19042P = str2;
        }

        public void m21625f(String str, TdApi.Location location, TdApi.InlineQueryResults inlineQueryResults, ArrayList arrayList) {
            if (!m23882b() && C5976u.this.m21685X() != null) {
                C5976u.this.m21695P0(str, location, inlineQueryResults.nextOffset, arrayList);
            }
        }

        public void m21624g() {
            if (!m23882b() && C5976u.this.m21685X() != null) {
                C5976u.this.m21705K0(false);
                C5976u.this.m21684Y();
            }
        }

        @Override
        public void mo7438c(TdApi.Object object) {
            int constructor = object.getConstructor();
            if (constructor != -1679978726) {
                if (constructor == 1000709656) {
                    final TdApi.InlineQueryResults inlineQueryResults = (TdApi.InlineQueryResults) object;
                    long uptimeMillis = SystemClock.uptimeMillis() - this.f19044b;
                    long j = 0;
                    final ArrayList p0 = C5976u.m21652p0(C5976u.this.f19012a, C5976u.this.f19014b, C5976u.this.f19018d0 != null ? C5976u.this.f19018d0.f25442id : 0L, this.f19045c, inlineQueryResults, inlineQueryResults.switchPmText, inlineQueryResults.switchPmParameter, this.f19039M, inlineQueryResults.nextOffset);
                    HandlerC10770jj dd = C5976u.this.f19014b.m2485dd();
                    final String str = this.f19045c;
                    final TdApi.Location location = this.f19040N;
                    Runnable xVar = new Runnable() {
                        @Override
                        public final void run() {
                            C5976u.C5979c.this.m21625f(str, location, inlineQueryResults, p0);
                        }
                    };
                    if (this.f19041O && uptimeMillis < 100) {
                        j = 100 - uptimeMillis;
                    }
                    dd.postDelayed(xVar, j);
                    return;
                }
            } else if (C4779t2.m25482l0(object) != 406) {
                if (C4779t2.m25482l0(object) == 502) {
                    C1379j0.m37311q0(this.f19042P);
                }
            } else {
                return;
            }
            C5976u.this.f19014b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C5976u.C5979c.this.m21624g();
                }
            });
        }
    }

    public class C5980d extends AbstractC5123k {
        public final String f19046M;
        public final String f19048b;
        public final TdApi.GetInlineQueryResults f19049c;

        public C5980d(String str, TdApi.GetInlineQueryResults getInlineQueryResults, String str2) {
            this.f19048b = str;
            this.f19049c = getInlineQueryResults;
            this.f19046M = str2;
        }

        public void m21621f(String str, TdApi.InlineQueryResults inlineQueryResults, ArrayList arrayList) {
            if (!m23882b() && C5976u.this.f19011Z != null && str.equals(C5976u.this.f19011Z)) {
                C5976u.this.m21706K();
                C5976u.this.m21714G(inlineQueryResults.nextOffset, arrayList);
            }
        }

        public void m21620g(String str) {
            if (!m23882b() && C5976u.this.f19011Z != null && str.equals(C5976u.this.f19011Z)) {
                C5976u.this.m21706K();
                C5976u.this.m21705K0(false);
            }
        }

        @Override
        public void mo7438c(TdApi.Object object) {
            if (object.getConstructor() != 1000709656) {
                HandlerC10770jj dd = C5976u.this.f19014b.m2485dd();
                final String str = this.f19046M;
                dd.post(new Runnable() {
                    @Override
                    public final void run() {
                        C5976u.C5980d.this.m21620g(str);
                    }
                });
                return;
            }
            final TdApi.InlineQueryResults inlineQueryResults = (TdApi.InlineQueryResults) object;
            final ArrayList p0 = C5976u.m21652p0(C5976u.this.f19012a, C5976u.this.f19014b, C5976u.this.f19018d0 != null ? C5976u.this.f19018d0.f25442id : 0L, this.f19048b, inlineQueryResults, null, null, this.f19049c, inlineQueryResults.nextOffset);
            HandlerC10770jj dd2 = C5976u.this.f19014b.m2485dd();
            final String str2 = this.f19046M;
            dd2.post(new Runnable() {
                @Override
                public final void run() {
                    C5976u.C5980d.this.m21621f(str2, inlineQueryResults, p0);
                }
            });
        }
    }

    public class C5981e implements Client.AbstractC7865g {
        public final String f19050a;

        public C5981e(String str) {
            this.f19050a = str;
        }

        public void m21618b(ArrayList arrayList, String str) {
            C5976u.this.f19024j0 = arrayList;
            if (str.equals(C5976u.this.f19025k0)) {
                C5976u.this.m21662k0(str);
            }
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            final ArrayList arrayList = new ArrayList();
            int constructor = object.getConstructor();
            if (constructor == 171203420) {
                long[] jArr = ((TdApi.Users) object).userIds;
                ArrayList<TdApi.User> T2 = C5976u.this.f19014b.m2480e2().m1686T2(jArr);
                arrayList.ensureCapacity(jArr.length);
                Iterator<TdApi.User> it = T2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C4828x(C5976u.this.f19012a, C5976u.this.f19014b, it.next(), true));
                }
            } else if (constructor == 1809654812) {
                List<TdApi.Chat> i4 = C5976u.this.f19014b.m2414i4(((TdApi.Chats) object).chatIds);
                arrayList.ensureCapacity(i4.size());
                for (TdApi.Chat chat : i4) {
                    TdApi.User b4 = C5976u.this.f19014b.m2525b4(chat);
                    if (b4 != null) {
                        arrayList.add(new C4828x(C5976u.this.f19012a, C5976u.this.f19014b, b4, true));
                    }
                }
                if (i4.isEmpty()) {
                    C5976u.this.f19014b.m2270r4().m14783o(new TdApi.GetRecentInlineBots(), this);
                    return;
                }
            }
            HandlerC10770jj dd = C5976u.this.f19014b.m2485dd();
            final String str = this.f19050a;
            dd.post(new Runnable() {
                @Override
                public final void run() {
                    C5976u.C5981e.this.m21618b(arrayList, str);
                }
            });
        }
    }

    public class C5982f extends AbstractC5123k {
        public final int f19052M;
        public final TdApi.Function f19053N;
        public final String f19054O;
        public final ArrayList f19055P;
        public final boolean f19057b;
        public final int f19058c;

        public C5982f(boolean z, int i, int i2, TdApi.Function function, String str, ArrayList arrayList) {
            this.f19057b = z;
            this.f19058c = i;
            this.f19052M = i2;
            this.f19053N = function;
            this.f19054O = str;
            this.f19055P = arrayList;
        }

        public void m21616e(String str, ArrayList arrayList, ArrayList arrayList2) {
            if (!m23882b() && C5070i.m24068c(C5976u.this.f19004S, str)) {
                if (arrayList.isEmpty()) {
                    if (arrayList2.isEmpty()) {
                        C5976u.this.m21684Y();
                    }
                } else if (arrayList2.isEmpty()) {
                    C5976u.this.m21693Q0(arrayList);
                } else {
                    arrayList2.ensureCapacity(arrayList2.size() + arrayList.size());
                    arrayList2.addAll(arrayList);
                    C5976u.this.m21693Q0(arrayList2);
                }
            }
        }

        @Override
        public void mo7438c(TdApi.Object object) {
            ArrayList arrayList = this.f19057b ? C5976u.this.f19024j0 : null;
            final ArrayList arrayList2 = new ArrayList();
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                Log.m14709w("Cannot invoke %s: %s", this.f19053N.toString(), C4779t2.m25379z5(object));
            } else if (constructor == -497558622) {
                TdApi.ChatMember[] chatMemberArr = ((TdApi.ChatMembers) object).members;
                if (chatMemberArr.length > 0) {
                    arrayList2.ensureCapacity(chatMemberArr.length);
                    for (TdApi.ChatMember chatMember : chatMemberArr) {
                        if (chatMember.memberId.getConstructor() == -336109341 && C5976u.m21683Z(arrayList, ((TdApi.MessageSenderUser) chatMember.memberId).userId) == -1) {
                            C4828x xVar = new C4828x(C5976u.this.f19012a, C5976u.this.f19014b, C5976u.this.f19014b.m2480e2().m1583v2(((TdApi.MessageSenderUser) chatMember.memberId).userId), false);
                            xVar.m26347U(this.f19058c, this.f19052M);
                            arrayList2.add(xVar);
                        }
                    }
                }
            } else if (constructor == 171203420) {
                long[] jArr = ((TdApi.Users) object).userIds;
                if (jArr.length > 0) {
                    ArrayList<TdApi.User> T2 = C5976u.this.f19014b.m2480e2().m1686T2(jArr);
                    arrayList2.ensureCapacity(jArr.length);
                    Iterator<TdApi.User> it = T2.iterator();
                    while (it.hasNext()) {
                        TdApi.User next = it.next();
                        if (C5976u.m21683Z(arrayList, next.f25442id) == -1) {
                            C4828x xVar2 = new C4828x(C5976u.this.f19012a, C5976u.this.f19014b, next, false);
                            xVar2.m26347U(this.f19058c, this.f19052M);
                            arrayList2.add(xVar2);
                        }
                    }
                }
            }
            HandlerC10770jj dd = C5976u.this.f19014b.m2485dd();
            final String str = this.f19054O;
            final ArrayList arrayList3 = this.f19055P;
            dd.post(new Runnable() {
                @Override
                public final void run() {
                    C5976u.C5982f.this.m21616e(str, arrayList2, arrayList3);
                }
            });
        }
    }

    public class C5983g extends AbstractC5123k {
        public final int f19059M;
        public final String f19060N;
        public final String f19062b;
        public final int f19063c;

        public C5983g(String str, int i, int i2, String str2) {
            this.f19062b = str;
            this.f19063c = i;
            this.f19059M = i2;
            this.f19060N = str2;
        }

        public void m21614e(String str, ArrayList arrayList) {
            if (!m23882b() && C5070i.m24068c(C5976u.this.f19004S, str)) {
                if (arrayList == null || arrayList.isEmpty()) {
                    C5976u.this.m21684Y();
                } else {
                    C5976u.this.m21697O0(arrayList);
                }
            }
        }

        @Override
        public void mo7438c(TdApi.Object object) {
            final ArrayList arrayList;
            if (object.getConstructor() == 676798885) {
                String[] strArr = ((TdApi.Hashtags) object).hashtags;
                if (strArr.length != 0) {
                    arrayList = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        C4809v vVar = new C4809v(C5976u.this.f19012a, C5976u.this.f19014b, str, this.f19062b);
                        vVar.m26347U(this.f19063c, this.f19059M);
                        arrayList.add(vVar);
                    }
                } else {
                    arrayList = null;
                }
                HandlerC10770jj dd = C5976u.this.f19014b.m2485dd();
                final String str2 = this.f19060N;
                dd.post(new Runnable() {
                    @Override
                    public final void run() {
                        C5976u.C5983g.this.m21614e(str2, arrayList);
                    }
                });
            }
        }
    }

    public class C5984h extends AbstractRunnableC5910b {
        public final String f19064M;
        public final int f19065N;
        public final int f19066O;
        public final List f19067P;
        public final String f19068Q;

        public C5984h(String str, int i, int i2, List list, String str2) {
            this.f19064M = str;
            this.f19065N = i;
            this.f19066O = i2;
            this.f19067P = list;
            this.f19068Q = str2;
        }

        public void m21610j(String str, ArrayList arrayList, ArrayList arrayList2) {
            if (m21857d() && C5070i.m24068c(str, C5976u.this.f19004S)) {
                if (arrayList == null || arrayList.isEmpty()) {
                    C5976u.this.m21699N0(arrayList2);
                    return;
                }
                arrayList.addAll(arrayList2);
                C5976u.this.m21699N0(arrayList);
            }
        }

        public void m21609k(final ArrayList arrayList, int i, int i2, final String str, TdApi.Object object) {
            String[] strArr;
            boolean z;
            if (object.getConstructor() == 950339552) {
                TdApi.Emojis emojis = (TdApi.Emojis) object;
                final ArrayList arrayList2 = new ArrayList(emojis.emojis.length);
                for (String str2 : emojis.emojis) {
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            AbstractC4718o oVar = (AbstractC4718o) it.next();
                            if ((oVar instanceof C4776t) && C5078d.m24000m(str2, ((C4776t) oVar).m25733Z())) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                        arrayList2.add(new C4776t(C5976u.this.f19012a, C5976u.this.f19014b, new C7888N.Suggestion(str2, null, null), null).m26347U(i, i2));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    C5976u.this.f19014b.m2485dd().post(new Runnable() {
                        @Override
                        public final void run() {
                            C5976u.C5984h.this.m21610j(str, arrayList, arrayList2);
                        }
                    });
                }
            }
        }

        public void m21608l(String str, ArrayList arrayList) {
            if (m21857d() && C5070i.m24068c(str, C5976u.this.f19004S)) {
                if (arrayList == null || arrayList.isEmpty()) {
                    C5976u.this.m21684Y();
                } else {
                    C5976u.this.m21699N0(arrayList);
                }
            }
        }

        @Override
        public void mo1364b() {
            throw new UnsupportedOperationException("Method not decompiled: p141jd.C5976u.C5984h.mo1364b():void");
        }
    }

    public interface AbstractC5985i {
        TdApi.WebPage mo8287a(TdApi.FormattedText formattedText);

        void mo8284c(ArrayList<AbstractC4718o<?>> arrayList, boolean z);

        boolean mo8282d();

        TdApi.FormattedText mo8279f(boolean z);

        long mo8277g();

        void mo8275h(boolean z, boolean z2);

        void mo8273i(ArrayList<AbstractC4718o<?>> arrayList);

        boolean mo8271j();

        TdApi.Chat mo8267l();

        void mo8265m();

        long mo8262o();

        void mo8259q(String str, String str2);

        void mo8257r(ArrayList<C2104l> arrayList, boolean z);

        boolean mo8252u(String str, TdApi.WebPage webPage);

        boolean mo8250v();

        int mo8248w(int i, String str);
    }

    public interface AbstractC5986j {
        ArrayList<AbstractC4718o<?>> mo21607a(String str, String str2, AbstractC5988l lVar);
    }

    public static class C5987k implements C9773p0.AbstractC9776c {
        public final ArrayList<AbstractC4718o<?>> f19070a;
        public final TdApi.GetInlineQueryResults f19071b;
        public final String f19072c;

        public C5987k(ArrayList<AbstractC4718o<?>> arrayList, TdApi.GetInlineQueryResults getInlineQueryResults, String str) {
            this.f19070a = arrayList;
            this.f19071b = getInlineQueryResults;
            this.f19072c = str;
        }

        @Override
        public boolean mo6987q7(TdApi.Message message, boolean z, boolean z2, List<TdApi.Message> list, long j) {
            return false;
        }

        @Override
        public C9773p0.C9775b mo6986s5(TdApi.Message message) {
            TdApi.Message a0;
            ArrayList<AbstractC4718o<?>> arrayList = this.f19070a;
            if (arrayList != null && !arrayList.isEmpty()) {
                int constructor = message.content.getConstructor();
                Iterator<AbstractC4718o<?>> it = this.f19070a.iterator();
                ArrayList arrayList2 = null;
                int i = -1;
                while (it.hasNext()) {
                    AbstractC4718o<?> next = it.next();
                    if ((next instanceof C4756s) && (a0 = ((C4756s) next).m26267a0()) != null && a0.content.getConstructor() == constructor) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        if (C9773p0.m7114D(a0, message)) {
                            i = arrayList2.size();
                        }
                        arrayList2.add(a0);
                    }
                }
                if (i != -1) {
                    return new C9773p0.C9775b(arrayList2, i).m6993p(this.f19071b, this.f19072c);
                }
            }
            return null;
        }
    }

    public interface AbstractC5988l {
        void mo21606a(String str);
    }

    public interface AbstractC5989m {
        boolean mo21605a(char c);
    }

    public C5976u(final AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, AbstractC5985i iVar) {
        this.f19012a = aVar;
        C5996x0 x0Var = new C5996x0(aVar, this, true, false);
        this.f18998M = x0Var;
        x0Var.m21580z(new C5996x0.AbstractC6004h() {
            @Override
            public final void mo21577a(boolean z, Runnable runnable, AbstractC5096a aVar2) {
                C5976u.this.m21674e0(aVar, z, runnable, aVar2);
            }
        });
        this.f19014b = q6Var;
        this.f19016c = iVar;
    }

    public static void m21713G0(char c, String str, int i, int[] iArr, AbstractC5989m mVar) {
        int i2 = -1;
        boolean z = i != -1 && i >= 0 && i <= str.length();
        if (!z) {
            i = str.length();
        }
        int i3 = i - 1;
        while (true) {
            if (i3 >= 0) {
                char charAt = str.charAt(i3);
                if (charAt == c) {
                    break;
                }
                i3--;
                if (!mVar.mo21605a(charAt)) {
                    i3 = -1;
                    break;
                }
            } else {
                break;
            }
        }
        if (i3 != -1 && (str.charAt(i3) != c || (i3 > 0 && !C1363c0.m37462O(str.charAt(i3 - 1))))) {
            i3 = -1;
        }
        if (i3 != -1 && !z) {
            int length = str.length();
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 != ' ' && charAt2 != '\n') {
                    i++;
                    if (!mVar.mo21605a(charAt2)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        i2 = i;
        iArr[0] = i3;
        iArr[1] = i2;
    }

    public static String m21691R0(InputMethodSubtype inputMethodSubtype) {
        Locale r0;
        if (inputMethodSubtype == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            String languageTag = inputMethodSubtype.getLanguageTag();
            if (!C5070i.m24062i(languageTag)) {
                return languageTag;
            }
        }
        String locale = inputMethodSubtype.getLocale();
        if (C5070i.m24062i(locale) || (r0 = C7389v0.m16589r0(locale)) == null) {
            return null;
        }
        return C2060d.m35731a(r0);
    }

    public static int m21683Z(ArrayList<AbstractC4718o<?>> arrayList, long j) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = 0;
            Iterator<AbstractC4718o<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC4718o<?> next = it.next();
                if ((next instanceof C4828x) && ((C4828x) next).m25123d0() == j) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public void m21678c0(int i, String str, TdApi.WebPage webPage) {
        if (this.f19031q0 == i) {
            this.f19016c.mo8252u(str, webPage);
        }
    }

    public void m21674e0(final AbstractView$OnTouchListenerC7889a aVar, boolean z, Runnable runnable, final AbstractC5096a aVar2) {
        if (z) {
            aVar.m14570K2(false, true, aVar2);
        } else {
            C11477a0.m495g(aVar, m21685X(), runnable, new Runnable() {
                @Override
                public final void run() {
                    AbstractView$OnTouchListenerC7889a.this.m14570K2(false, true, aVar2);
                }
            });
        }
    }

    public void m21672f0(int i, String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            if (((TdApi.Error) object).code != 404) {
                Log.m14709w("Cannot load link preview: %s", C4779t2.m25379z5(object));
            }
            m21689T(i, null, null);
        } else if (constructor != -577333714) {
            Log.unexpectedTdlibResponse(object, TdApi.GetWebPagePreview.class, TdApi.WebPage.class);
        } else {
            m21689T(i, str, (TdApi.WebPage) object);
        }
    }

    public void m21670g0(final int i, final String str) {
        if (this.f19031q0 == i) {
            this.f19014b.m2270r4().m14783o(new TdApi.GetWebPagePreview(this.f19016c.mo8279f(true)), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C5976u.this.m21672f0(i, str, object);
                }
            });
        }
    }

    public void m21668h0(boolean[] zArr, String str, boolean z) {
        if (!zArr[0]) {
            zArr[0] = true;
            if (str != null && str.equals(m21685X())) {
                m21723B0(this.f19018d0.username, this.f19004S.substring(str.length() + 2), null, z);
            }
        }
    }

    public void m21666i0(boolean[] zArr, String str) {
        if (!zArr[0]) {
            zArr[0] = true;
            if (str != null && str.equals(m21685X())) {
                this.f19019e0 = true;
                C4868i.m24727c2().m24709e4(this.f19018d0.f25442id);
                m21721C0(this.f19004S.substring(str.length() + 2), true, true);
            }
        }
    }

    public static void m21664j0(DialogInterface dialogInterface, int i) {
        C4868i.m24727c2().m24583u2(1L);
    }

    public static boolean m21660l0(char c) {
        return c == '_' || Character.isLetterOrDigit(c);
    }

    public static ArrayList<AbstractC4718o<?>> m21652p0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, String str, TdApi.InlineQueryResults inlineQueryResults, String str2, String str3, TdApi.GetInlineQueryResults getInlineQueryResults, String str4) {
        ArrayList<AbstractC4718o<?>> arrayList = new ArrayList<>(inlineQueryResults.results.length + ((str2 == null || str2.isEmpty()) ? 0 : 1));
        if (str2 != null && !str2.isEmpty()) {
            arrayList.add(new C4729p(aVar, q6Var, j, str2, str3));
        }
        C5987k kVar = new C5987k(arrayList, getInlineQueryResults, str4);
        for (TdApi.InlineQueryResult inlineQueryResult : inlineQueryResults.results) {
            AbstractC4718o<?> W = AbstractC4718o.m26345W(aVar, q6Var, str, inlineQueryResult, kVar);
            if (W != null) {
                W.m26352N(arrayList);
                W.m26348T(inlineQueryResults.inlineQueryId);
                arrayList.add(W);
            }
        }
        return arrayList;
    }

    public final void m21725A0(int i, int i2, String str, String str2) {
        if (this.f19008W != 4) {
            m21684Y();
        }
        this.f19014b.m2270r4().m14783o(new TdApi.SearchHashtags(str2, 50), new C5983g(str2, i, i2, str));
    }

    public final void m21723B0(String str, String str2, Location location, boolean z) {
        AbstractC9323v4<?> s;
        m21705K0(true);
        m21706K();
        TdApi.Location location2 = location != null ? new TdApi.Location(location.getLatitude(), location.getLongitude(), location.getAccuracy()) : null;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f19018d0.f25442id;
        long o = this.f19016c.mo8262o();
        TdApi.Location location3 = location2;
        TdApi.GetInlineQueryResults getInlineQueryResults = new TdApi.GetInlineQueryResults(j, o, location3, str2, null);
        this.f19021g0 = new C5979c(uptimeMillis, str2, getInlineQueryResults, location3, z, str);
        if (o != 0 && C5070i.m24062i(str2) && C4868i.m24727c2().m24764X2(1L) && C7316a.m17051j(this.f19016c.mo8262o()) && (s = C1379j0.m37308s()) != null) {
            s.m9439Fc(R.string.AppName, C4403w.m27871i1(R.string.SecretChatContextBotAlert), C4403w.m27871i1(R.string.Confirm), DialogInterface$OnClickListenerC5941g.f18870a, 3);
        }
        this.f19014b.m2270r4().m14783o(getInlineQueryResults, this.f19021g0);
    }

    public final void m21721C0(String str, boolean z, boolean z2) {
        m21705K0(true);
        this.f18998M.m21585u(this.f19004S, null, 7000L, z, z2);
    }

    public final void m21719D0(int i, int i2, final String str, String str2, boolean z) {
        TdApi.Function function;
        if (z) {
            m21684Y();
            this.f19014b.m2485dd().postDelayed(new Runnable() {
                @Override
                public final void run() {
                    C5976u.this.m21662k0(str);
                }
            }, 100L);
            return;
        }
        ArrayList<AbstractC4718o<?>> arrayList = new ArrayList<>();
        boolean z2 = true;
        boolean z3 = i == 0 && !m21682a0() && this.f19016c.mo8271j();
        if (z3) {
            ArrayList<AbstractC4718o<?>> arrayList2 = this.f19024j0;
            if (arrayList2 == null) {
                if (this.f19025k0 != null) {
                    z2 = false;
                }
                this.f19025k0 = str;
                if (z2) {
                    this.f19014b.m2270r4().m14783o(new TdApi.GetTopChats(new TdApi.TopChatCategoryInlineBots(), 10), new C5981e(str));
                    return;
                }
                return;
            }
            Iterator<AbstractC4718o<?>> it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC4718o<?> next = it.next();
                if (str2.isEmpty() || ((C4828x) next).m25119h0(str2, false)) {
                    next.m26347U(i, i2);
                    arrayList.add(next);
                }
            }
        }
        TdApi.Chat l = this.f19016c.mo8267l();
        if (l == null || !C4779t2.m25638N2(l.type)) {
            if (!arrayList.isEmpty()) {
                m21693Q0(arrayList);
            } else if (this.f19008W != 2) {
                m21684Y();
            }
            if (this.f19016c.mo8277g() == 0) {
                function = new TdApi.SearchChatMembers(this.f19016c.mo8262o(), str2, 20, null);
            } else if (!z3) {
                function = new TdApi.SearchContacts(str2, 50);
            } else if (arrayList.isEmpty()) {
                m21684Y();
                return;
            } else {
                return;
            }
            Client r4 = this.f19014b.m2270r4();
            C5982f fVar = new C5982f(z3, i, i2, function, str, arrayList);
            this.f19026l0 = fVar;
            r4.m14783o(function, fVar);
        } else if (arrayList.isEmpty()) {
            m21684Y();
        } else {
            m21693Q0(arrayList);
        }
    }

    public final boolean m21717E0(int i) {
        int i2;
        boolean z;
        this.f19005T = true;
        this.f19006U = i;
        if (this.f19004S.charAt(0) == '/') {
            int length = this.f19004S.length();
            int i3 = 1;
            while (true) {
                if (i3 >= length) {
                    z = true;
                    break;
                } else if (!C4779t2.m25429s4(this.f19004S.charAt(i3))) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                m21709I0(5);
                m21634y0(this.f19004S.substring(1));
                return false;
            }
        }
        m21713G0('@', this.f19004S, i, this.f19023i0, f18996s0);
        int[] iArr = this.f19023i0;
        if (iArr[0] == -1 || iArr[1] == -1) {
            m21713G0('#', this.f19004S, i, iArr, f18995r0);
            int[] iArr2 = this.f19023i0;
            if (iArr2[0] == -1 || iArr2[1] == -1) {
                m21713G0(':', this.f19004S, i, iArr2, f18997t0);
                int[] iArr3 = this.f19023i0;
                if (iArr3[0] == -1 || iArr3[1] == -1 || (i2 = (iArr3[1] - iArr3[0]) - 1) <= 0 || i2 > C7888N.getEmojiSuggestionMaxLength() - 5) {
                    m21709I0(0);
                    return true;
                }
                m21709I0(3);
                int[] iArr4 = this.f19023i0;
                int i4 = iArr4[0];
                int i5 = iArr4[1];
                String str = this.f19004S;
                m21632z0(i4, i5, str, str.substring(iArr4[0] + 1, iArr4[1]));
                return true;
            }
            m21709I0(2);
            int[] iArr5 = this.f19023i0;
            int i6 = iArr5[0];
            int i7 = iArr5[1];
            String str2 = this.f19004S;
            m21725A0(i6, i7, str2, str2.substring(iArr5[0] + 1, iArr5[1]));
            return true;
        }
        boolean z2 = this.f19002Q == 6;
        m21709I0(1);
        int[] iArr6 = this.f19023i0;
        int i8 = iArr6[0];
        int i9 = iArr6[1];
        String str3 = this.f19004S;
        m21719D0(i8, i9, str3, str3.substring(iArr6[0] + 1, iArr6[1]), z2);
        return true;
    }

    public final void m21715F0(String str, boolean z, int[] iArr) {
        TdApi.Function function;
        int K1 = C4868i.m24727c2().m24856K1();
        if (K1 != 2) {
            if (K1 != 0 || z || !this.f19014b.m2938Ac()) {
                this.f19015b0 = new C5977a(iArr, z, str, K1);
                if (z) {
                    function = new TdApi.SearchStickers(str, 1000);
                } else {
                    function = new TdApi.GetStickers(str, 1000);
                }
                this.f19014b.m2270r4().m14783o(function, this.f19015b0);
                return;
            }
            m21715F0(str, true, iArr);
        }
    }

    public final void m21714G(String str, ArrayList<AbstractC4718o<?>> arrayList) {
        m21706K();
        this.f19011Z = str;
        this.f19016c.mo8273i(arrayList);
        m21705K0(false);
    }

    public final void m21712H(TdApi.User user) {
        this.f19018d0 = user;
        this.f19019e0 = ((TdApi.UserTypeBot) user.type).needLocation && C4868i.m24727c2().m24578v(this.f19018d0.f25442id);
        String X = m21685X();
        AbstractC5985i iVar = this.f19016c;
        if (X == null) {
            X = user.username;
        }
        iVar.mo8259q(X, ((TdApi.UserTypeBot) user.type).inlineQueryPlaceholder);
        m21709I0(6);
        m21642u0(this.f19004S.substring(user.username.length() + 2), true);
    }

    public void m21711H0(AbstractC5986j jVar) {
        this.f19000O = jVar;
    }

    public final void m21710I() {
        AbstractRunnableC5910b bVar = this.f19028n0;
        if (bVar != null) {
            bVar.m21858c();
            this.f19028n0 = null;
        }
    }

    public final void m21709I0(int i) {
        int i2 = this.f19002Q;
        if (i2 != i) {
            boolean z = true;
            boolean z2 = i2 == 6;
            this.f19002Q = i;
            if (i != 6) {
                z = false;
            }
            if (z2 != z) {
                this.f19016c.mo8275h(z, this.f19013a0);
            }
            m21684Y();
        }
    }

    public final void m21708J() {
        AbstractC5123k kVar = this.f19027m0;
        if (kVar != null) {
            kVar.m23883a();
            this.f19027m0 = null;
        }
    }

    public void m21707J0(boolean z, boolean z2) {
        if (m21690S() != z) {
            if (z) {
                this.f19001P |= 2;
            } else {
                this.f19001P &= -3;
            }
            if (!this.f19004S.trim().isEmpty() && z2) {
                String str = this.f19004S;
                CharSequence charSequence = this.f19003R;
                this.f19004S = "";
                this.f19003R = "";
                m21654o0(charSequence, str, this.f19007V);
            }
        }
    }

    public final void m21706K() {
        AbstractC5123k kVar = this.f19022h0;
        if (kVar != null) {
            kVar.m23883a();
            this.f19022h0 = null;
        }
    }

    public final void m21705K0(boolean z) {
        if (this.f19013a0 != z) {
            this.f19013a0 = z;
            this.f19016c.mo8275h(this.f19002Q == 6, z);
        }
    }

    public final void m21704L() {
        AbstractC5123k kVar = this.f19021g0;
        if (kVar != null) {
            kVar.m23883a();
            this.f19021g0 = null;
        }
        m21706K();
    }

    public void m21703L0(boolean z) {
        if (z) {
            this.f19001P |= 1;
        } else {
            this.f19001P &= -2;
        }
    }

    public final void m21702M() {
        this.f18998M.m21597h();
    }

    public final void m21701M0(ArrayList<AbstractC4718o<?>> arrayList) {
        this.f19008W = 3;
        this.f19016c.mo8284c(arrayList, true);
    }

    public final void m21700N() {
        AbstractC5123k kVar = this.f19026l0;
        if (kVar != null) {
            kVar.m23883a();
            this.f19026l0 = null;
        }
    }

    public final void m21699N0(ArrayList<AbstractC4718o<?>> arrayList) {
        this.f19008W = 5;
        this.f19016c.mo8284c(arrayList, false);
    }

    public final void m21698O() {
        m21696P();
        m21704L();
        m21702M();
        m21708J();
        m21710I();
        m21700N();
    }

    public final void m21697O0(ArrayList<AbstractC4718o<?>> arrayList) {
        this.f19008W = 4;
        this.f19016c.mo8284c(arrayList, false);
    }

    public final void m21696P() {
        AbstractC5123k kVar = this.f19015b0;
        if (kVar != null) {
            kVar.m23883a();
            this.f19015b0 = null;
        }
    }

    public final void m21695P0(String str, TdApi.Location location, String str2, ArrayList<AbstractC4718o<?>> arrayList) {
        this.f19009X = str;
        this.f19011Z = str2;
        this.f19010Y = location;
        this.f19008W = 1;
        this.f19016c.mo8284c(arrayList, true);
        m21705K0(false);
    }

    public final void m21694Q() {
        AbstractC5123k kVar = this.f19020f0;
        if (kVar != null) {
            kVar.m23883a();
            this.f19020f0 = null;
        }
        this.f19016c.mo8259q("", "");
        m21636x0();
        this.f19018d0 = null;
        this.f19017c0 = null;
    }

    public final void m21693Q0(ArrayList<AbstractC4718o<?>> arrayList) {
        this.f19008W = 2;
        this.f19016c.mo8284c(arrayList, false);
    }

    public final void m21692R() {
        this.f19016c.mo8252u(null, null);
    }

    public final boolean m21690S() {
        return (this.f19001P & 2) != 0;
    }

    public final void m21689T(final int i, final String str, final TdApi.WebPage webPage) {
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                C5976u.this.m21678c0(i, str, webPage);
            }
        });
    }

    public final void m21688U(TdApi.Sticker[] stickerArr, String str, boolean z) {
        ArrayList<C2104l> arrayList = new ArrayList<>(stickerArr.length);
        for (TdApi.Sticker sticker : stickerArr) {
            arrayList.add(new C2104l(this.f19014b, sticker, str, sticker.type));
        }
        this.f19016c.mo8257r(arrayList, z);
    }

    public void m21687V() {
        m21662k0(this.f19004S);
    }

    @Override
    public void mo4376V3(C5996x0 x0Var, String str, Location location) {
        if (this.f19004S.equals(str)) {
            m21723B0(this.f19018d0.username, m21686W(), location, false);
        }
    }

    public final String m21686W() {
        String X = m21685X();
        if (X != null) {
            return this.f19004S.substring(X.length() + 2);
        }
        return null;
    }

    public String m21685X() {
        if (!m21682a0() && !m21690S() && this.f19004S.length() > 1 && this.f19004S.charAt(0) == '@') {
            int length = this.f19004S.length();
            for (int i = 1; i < length; i++) {
                char charAt = this.f19004S.charAt(i);
                if (!C4779t2.m25415u4(charAt)) {
                    if (charAt == ' ') {
                        return this.f19004S.substring(1, i);
                    } else {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final void m21684Y() {
        this.f19016c.mo8265m();
    }

    @Override
    public void mo7524a() {
        m21640v0();
    }

    public boolean m21682a0() {
        return (this.f19001P & 1) != 0;
    }

    public boolean m21680b0() {
        return this.f19013a0 || this.f19016c.mo8250v();
    }

    public void m21658m0(int i) {
        this.f19007V = i;
        if (this.f19005T && this.f19006U != i) {
            m21698O();
            m21717E0(i);
        }
    }

    public void m21662k0(String str) {
        if (!this.f19004S.isEmpty() && this.f19004S.equals(str)) {
            this.f19004S = "";
            this.f19003R = "";
            m21654o0(str, str, this.f19007V);
        }
    }

    @Override
    public void mo4362n5(C5996x0 x0Var, int i, String str, Location location) {
        String W = m21686W();
        if (i == -1 && ((W == null || W.isEmpty()) && !C7389v0.m16711L2("android.permission.ACCESS_FINE_LOCATION"))) {
            C1405v.m37143C();
        }
        if (this.f19004S.equals(str)) {
            m21723B0(this.f19018d0.username, W, location, false);
        }
    }

    public void m21654o0(CharSequence charSequence, String str, int i) {
        this.f19007V = i;
        if (!C5070i.m24068c(this.f19004S, str)) {
            this.f19004S = str;
            boolean z = false;
            this.f19005T = false;
            m21698O();
            if (str.trim().isEmpty()) {
                m21694Q();
                m21709I0(0);
            } else if (C1374h.m37382j(charSequence)) {
                m21694Q();
                if (m21682a0() || m21690S()) {
                    m21709I0(0);
                } else {
                    m21709I0(4);
                    m21715F0(str, false, null);
                }
            } else {
                String X = m21685X();
                if (X != null) {
                    m21650q0(X, this.f19004S.substring(X.length() + 2), i);
                } else {
                    m21694Q();
                    z = m21717E0(i);
                }
            }
            if (!z) {
                str = "";
            }
            m21646s0(str);
        }
    }

    public final void m21650q0(String str, String str2, int i) {
        String str3 = this.f19017c0;
        if (str3 == null || !str3.toLowerCase().equals(str.toLowerCase())) {
            this.f19017c0 = str;
            AbstractC5123k kVar = this.f19020f0;
            if (kVar != null) {
                kVar.m23883a();
                this.f19020f0 = null;
            }
            TdApi.User R1 = this.f19014b.m2480e2().m1695R1(str.toLowerCase());
            if (R1 == null) {
                m21717E0(i);
                this.f19020f0 = new C5978b(str);
                this.f19014b.m2270r4().m14783o(new TdApi.SearchPublicChat(str), this.f19020f0);
            } else if (R1.type.getConstructor() != 1262387765 || !((TdApi.UserTypeBot) R1.type).isInline) {
                m21717E0(i);
            } else if (this.f19014b.m2246sc(this.f19016c.mo8267l(), R.id.right_sendStickersAndGifs, R.string.ChatDisabledBots, R.string.ChatRestrictedBots, R.string.ChatRestrictedBotsUntil)) {
                m21717E0(i);
            } else {
                m21712H(R1);
            }
        } else {
            TdApi.User user = this.f19018d0;
            if (user == null) {
                m21717E0(i);
            } else if (this.f19019e0) {
                m21721C0(str2, str2 != null && str2.isEmpty(), false);
            } else {
                m21723B0(user.username, str2, null, false);
            }
        }
    }

    public final void m21648r0(final int i, final String str) {
        int w = !C5070i.m24062i(str) ? this.f19016c.mo8248w(i, str) : 2;
        if (w != 1 && this.f19016c.mo8252u(str, null)) {
            if (w == 0) {
                AbstractC5985i iVar = this.f19016c;
                TdApi.WebPage a = iVar.mo8287a(iVar.mo8279f(false));
                if (a != null) {
                    m21689T(i, str, a);
                } else {
                    C1379j0.m37335e0(new Runnable() {
                        @Override
                        public final void run() {
                            C5976u.this.m21670g0(i, str);
                        }
                    }, 400L);
                }
            } else if (w == 2) {
                m21689T(i, null, null);
            }
        }
    }

    public final void m21646s0(String str) {
        boolean z;
        List<String> v0;
        this.f19030p0.clear();
        if (!C5070i.m24062i(str) && (v0 = C4779t2.m25412v0(this.f19016c.mo8279f(true))) != null && !v0.isEmpty()) {
            this.f19030p0.addAll(v0);
        }
        int size = this.f19030p0.size();
        if (this.f19029o0.size() == size) {
            if (size != 0) {
                Iterator<String> it = this.f19029o0.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    i++;
                    if (!this.f19030p0.get(i).equals(it.next())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f19029o0.clear();
        this.f19029o0.addAll(this.f19030p0);
        int i2 = this.f19031q0 + 1;
        this.f19031q0 = i2;
        if (size == 0 || !this.f19016c.mo8282d()) {
            m21692R();
        } else {
            m21648r0(i2, this.f19029o0.get(0));
        }
    }

    public void m21644t0(long j) {
        ArrayList<AbstractC4718o<?>> arrayList = this.f19024j0;
        if (arrayList != null) {
            int i = 0;
            Iterator<AbstractC4718o<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC4718o<?> next = it.next();
                if (!(next instanceof C4828x) || ((C4828x) next).m25123d0() != j) {
                    i++;
                } else {
                    this.f19024j0.remove(i);
                    return;
                }
            }
        }
    }

    public final void m21642u0(String str, final boolean z) {
        TdApi.User user = this.f19018d0;
        if (!((TdApi.UserTypeBot) user.type).needLocation) {
            m21723B0(user.username, str, null, z);
        } else if (this.f19019e0) {
            m21721C0(str, true, false);
        } else {
            final boolean[] zArr = new boolean[1];
            final String X = m21685X();
            C11477a0.m495g(this.f19012a, X, new Runnable() {
                @Override
                public final void run() {
                    C5976u.this.m21668h0(zArr, X, z);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    C5976u.this.m21666i0(zArr, X);
                }
            });
        }
    }

    public void m21640v0() {
        String str = this.f19011Z;
        if (str != null && !str.isEmpty() && this.f19022h0 == null) {
            String str2 = this.f19009X;
            TdApi.GetInlineQueryResults getInlineQueryResults = new TdApi.GetInlineQueryResults(this.f19018d0.f25442id, this.f19016c.mo8262o(), this.f19010Y, str2, this.f19011Z);
            this.f19022h0 = new C5980d(str2, getInlineQueryResults, this.f19011Z);
            m21705K0(true);
            this.f19014b.m2270r4().m14783o(getInlineQueryResults, this.f19022h0);
        }
    }

    public void m21638w0() {
        if (this.f19024j0 != null) {
            this.f19024j0 = null;
            this.f19025k0 = null;
        }
    }

    public final void m21636x0() {
        this.f19009X = null;
        this.f19011Z = null;
        this.f19010Y = null;
        m21705K0(false);
    }

    public final void m21634y0(String str) {
        ArrayList<AbstractC4718o<?>> a;
        AbstractC5986j jVar = this.f19000O;
        if (jVar == null || (a = jVar.mo21607a(str, this.f19004S, this.f18999N)) == null || a.isEmpty()) {
            m21684Y();
        } else {
            m21701M0(a);
        }
    }

    public final void m21632z0(int i, int i2, String str, String str2) {
        if (this.f19008W != 5) {
            m21684Y();
        }
        ArrayList arrayList = new ArrayList();
        InputMethodManager inputMethodManager = (InputMethodManager) C1379j0.m37318n().getSystemService("input_method");
        if (inputMethodManager != null) {
            String str3 = null;
            try {
                str3 = m21691R0(inputMethodManager.getCurrentInputMethodSubtype());
            } catch (Throwable unused) {
            }
            if (C5070i.m24062i(str3)) {
                try {
                    str3 = m21691R0(inputMethodManager.getLastInputMethodSubtype());
                } catch (Throwable unused2) {
                }
            }
            if (!C5070i.m24062i(str3)) {
                arrayList.add(str3);
            }
        }
        if (arrayList.isEmpty()) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
                    for (int i3 = 0; i3 < locales.size(); i3++) {
                        String a = C2060d.m35731a(locales.get(i3));
                        if (!C5070i.m24062i(a) && !arrayList.contains(a)) {
                            arrayList.add(a);
                        }
                    }
                } else {
                    String a2 = C2060d.m35731a(Resources.getSystem().getConfiguration().locale);
                    if (!C5070i.m24062i(a2)) {
                        arrayList.add(a2);
                    }
                }
            } catch (Throwable unused3) {
            }
        }
        C4383l.m28061a().m28060b(new C5984h(str2, i, i2, arrayList, str));
    }
}
