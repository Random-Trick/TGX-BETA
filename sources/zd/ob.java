package zd;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.graphics.drawable.IconCompat;
import bb.c;
import ce.j0;
import ce.v;
import gd.w;
import hd.t2;
import ib.i;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import je.e;
import ob.a;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p0.h;
import p0.k;
import p0.l;
import r0.b;
import r0.d;

public class ob implements pb, q0 {
    public static final long M;
    public static final boolean f28191c = true;
    public final jb f28192a;
    public final o6 f28193b;

    static {
        M = Build.VERSION.SDK_INT >= 28 ? 15000L : 7500L;
    }

    public ob(hb hbVar, o6 o6Var) {
        this.f28192a = hbVar.t();
        this.f28193b = o6Var;
    }

    public static void f(h.i iVar, CharSequence charSequence, l lVar, o6 o6Var, TdApi.Chat chat, List<bb> list, long j10, boolean z10, boolean z11, boolean z12) {
        bb bbVar = list.get(0);
        long j11 = chat.f19908id;
        boolean D = bbVar.o().D();
        if (Build.VERSION.SDK_INT >= 28) {
            o6Var.ka().o1(j11, D);
        }
        iVar.h(new h.i.a(w.g1(charSequence, false, o6Var.l7(chat), o6Var.c7(chat), o6Var.Q6(chat), z11, z12), TimeUnit.SECONDS.toMillis(bbVar.i()), lVar));
    }

    public static void g(h.i iVar, CharSequence charSequence, l lVar, final o6 o6Var, TdApi.Chat chat, bb bbVar, long j10, boolean z10, boolean z11, boolean z12) {
        Uri uri;
        long j11 = chat.f19908id;
        boolean D = bbVar.o().D();
        if (Build.VERSION.SDK_INT >= 28 && o6Var.ka().o1(j11, D)) {
            long i10 = bbVar.i() * 1000;
            final kb b10 = kb.b(o6Var, chat, bbVar.k());
            if (b10 != null) {
                if (!z10) {
                    o6Var.m5().t(b10.f27874a, j10, null, null);
                }
                if (t2.T2(b10.f27874a)) {
                    if (b10.f27875b == 2) {
                        final AtomicReference atomicReference = new AtomicReference();
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        o6Var.v4().o(new TdApi.UploadFile(new TdApi.InputFileGenerated(b10.f27874a.local.path, "asthumb", 0), new TdApi.FileTypeSticker(), 32), new Client.g() {
                            @Override
                            public final void r2(TdApi.Object object) {
                                ob.t(o6.this, atomicReference, countDownLatch, b10, object);
                            }
                        });
                        try {
                            countDownLatch.await(j10, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                        }
                        TdApi.File file = (TdApi.File) atomicReference.get();
                        uri = t2.T2(file) ? v0.L(new File(file.local.path)) : null;
                    } else {
                        uri = v0.L(new File(b10.f27874a.local.path));
                    }
                    if (uri != null) {
                        if (bbVar.x()) {
                            iVar.h(new h.i.a(charSequence, i10, lVar).g("image/", uri));
                            if (!i.i(charSequence)) {
                                iVar.h(new h.i.a(charSequence, i10 + 1, lVar));
                                return;
                            }
                            return;
                        }
                        iVar.h(new h.i.a(charSequence, i10, lVar).g("image/", uri));
                        String h10 = bbVar.h();
                        if (!i.i(h10)) {
                            iVar.h(new h.i.a(new t2.d(t2.f13538b, (int) R.string.ChatContentPhoto, h10).toString(), i10 - 1, lVar));
                            return;
                        }
                        return;
                    }
                }
            }
        }
        iVar.h(new h.i.a(w.g1(charSequence, false, o6Var.l7(chat), o6Var.c7(chat), o6Var.Q6(chat), z11, z12), TimeUnit.SECONDS.toMillis(bbVar.i()), lVar));
    }

    public static l i(jb jbVar, TdApi.Chat chat, bb bbVar, boolean z10, boolean z11, boolean z12) {
        TdApi.ChatPhotoInfo chatPhotoInfo;
        o6 J2 = jbVar.J2();
        long e10 = bbVar.e();
        long i42 = J2.i4(chat);
        if (i42 == 0 && a.l(e10) && bbVar.y()) {
            i42 = a.q(e10);
        }
        if (i42 != 0) {
            return k(jbVar, bbVar.w(), t2.l3(chat), J2.Q6(chat), J2.e2().u2(i42), Long.toString(a.j(chat.f19908id) ? chat.f19908id : a.c(i42)), z10, z11, z12);
        }
        TdApi.File file = null;
        boolean z13 = false;
        if (t2.l3(chat)) {
            String f10 = bbVar.f();
            TdApi.Chat W2 = J2.W2(e10);
            boolean w10 = bbVar.w();
            boolean l32 = t2.l3(chat);
            boolean Q6 = J2.Q6(chat);
            String l10 = Long.toString(e10);
            boolean z14 = J2.L6(e10) || J2.O6(e10);
            e B1 = t2.B1(f10);
            int e32 = J2.e3(e10);
            if (!(W2 == null || (chatPhotoInfo = W2.photo) == null)) {
                file = chatPhotoInfo.small;
            }
            return j(jbVar, w10, l32, Q6, l10, z14, f10, B1, e32, file, z10, z11, z12);
        }
        boolean w11 = bbVar.w();
        boolean l33 = t2.l3(chat);
        boolean Q62 = J2.Q6(chat);
        String l11 = Long.toString(chat.f19908id);
        if (J2.M6(chat) || J2.Q6(chat)) {
            z13 = true;
        }
        String str = chat.title;
        e n32 = J2.n3(chat);
        int f32 = J2.f3(chat);
        TdApi.ChatPhotoInfo chatPhotoInfo2 = chat.photo;
        if (chatPhotoInfo2 != null) {
            file = chatPhotoInfo2.small;
        }
        return j(jbVar, w11, l33, Q62, l11, z13, str, n32, f32, file, z10, z11, z12);
    }

    public static l j(jb jbVar, boolean z10, boolean z11, boolean z12, String str, boolean z13, String str2, e eVar, int i10, TdApi.File file, boolean z14, boolean z15, boolean z16) {
        l.a aVar = new l.a();
        if (Build.VERSION.SDK_INT >= 28) {
            aVar.d(str);
            aVar.b(z13);
            aVar.e(w.g1(str2, true, z10, z11, z12, z14, z15));
            Bitmap bitmap = null;
            if (!v0.A1(null)) {
                o6 J2 = jbVar.J2();
                bitmap = z10 ? qb.c(J2) : qb.b(J2, file, i10, eVar, true, z16);
            }
            if (v0.A1(bitmap)) {
                aVar.c(IconCompat.c(bitmap));
            }
        } else if (!fd.a.f11895q || !z11) {
            aVar.e("");
        } else {
            aVar.e(w.g1(str2, true, z10, z11, z12, z14, z15));
        }
        return aVar.a();
    }

    public static p0.l k(zd.jb r16, boolean r17, boolean r18, boolean r19, org.drinkless.td.libcore.telegram.TdApi.User r20, java.lang.String r21, boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: zd.ob.k(zd.jb, boolean, boolean, boolean, org.drinkless.td.libcore.telegram.TdApi$User, java.lang.String, boolean, boolean, boolean):p0.l");
    }

    public static boolean l(fb fbVar) {
        if (fbVar.isEmpty() || fbVar.G()) {
            return false;
        }
        if (fbVar.D()) {
            return true;
        }
        bb bbVar = null;
        Iterator<bb> it = fbVar.iterator();
        while (it.hasNext()) {
            bb next = it.next();
            if (bbVar != null && !bbVar.u(next)) {
                return false;
            }
            bbVar = next;
        }
        return false;
    }

    public static CharSequence q(o6 o6Var, hb hbVar, boolean z10, TdApi.Chat chat, bb bbVar, boolean z11, boolean z12, boolean[] zArr) {
        if (chat == null || !z10) {
            return w.i1(R.string.YouHaveNewMessage);
        }
        boolean O = hbVar.O(bbVar.o());
        String str = null;
        if (z11) {
            if (a.l(chat.f19908id)) {
                TdApi.User f42 = o6Var.f4(chat);
                if (f42 != null) {
                    str = t2.q2(f42.firstName, f42.lastName);
                }
            } else if (t2.N2(chat.type)) {
                str = chat.title;
            } else {
                str = bbVar.f();
                if (!z12) {
                    str = w.j1(R.string.format_notificationGroupSender, str, chat.title);
                }
            }
        }
        CharSequence n10 = bbVar.n(o6Var, bbVar.o().D() && bbVar.o().F(), O, zArr);
        return str != null ? w.k0(R.string.format_notificationTicker, str, n10) : n10;
    }

    public static void s(AtomicReference atomicReference, CountDownLatch countDownLatch, kb kbVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("Cannot generate sticker preview (2): %s, path: %s", t2.z5(object), kbVar.f27874a.local.path);
        } else if (constructor == 766337656) {
            atomicReference.set((TdApi.File) object);
            countDownLatch.countDown();
        }
    }

    public static void t(o6 o6Var, final AtomicReference atomicReference, final CountDownLatch countDownLatch, final kb kbVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("Cannot generate sticker preview: %s, path: %s", t2.z5(object), kbVar.f27874a.local.path);
        } else if (constructor == 766337656) {
            TdApi.File file = (TdApi.File) object;
            o6Var.v4().o(new TdApi.CancelUploadFile(file.f19913id), o6Var.na());
            o6Var.v4().o(new TdApi.DownloadFile(file.f19913id, 32, 0, 0, true), new Client.g() {
                @Override
                public final void r2(TdApi.Object object2) {
                    ob.s(atomicReference, countDownLatch, kbVar, object2);
                }
            });
        }
    }

    public static String u(o6 o6Var, int i10) {
        return "messages" + o6Var.A6() + "_" + i10;
    }

    public static String v(bb bbVar, boolean z10) {
        if (z10) {
            return i.q(bbVar.i());
        }
        return i.q(Integer.MAX_VALUE - bbVar.j());
    }

    public static h.i w(jb jbVar, TdApi.Chat chat, int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        h.i iVar;
        o6 J2 = jbVar.J2();
        TdApi.User m12 = jbVar.m1();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28 || m12 == null) {
            iVar = new h.i("");
        } else {
            iVar = new h.i(k(jbVar, J2.l7(chat), J2.c7(chat), J2.Q6(chat), m12, null, false, false, z14));
        }
        boolean z15 = true;
        if (i11 >= 28) {
            if (J2.B7(chat) || J2.Q6(chat)) {
                z15 = false;
            }
            if (z15) {
                iVar.n(w.O0(chat.f19908id, J2.W3(chat), i10, J2.l7(chat), J2.c7(chat), J2.Q6(chat), z10, z11, z12, z13));
            }
            iVar.o(z15);
        } else {
            iVar.n(w.O0(chat.f19908id, J2.W3(chat), i10, J2.l7(chat), J2.c7(chat), J2.Q6(chat), z10, z11, z12, z13));
            iVar.o(true);
        }
        return iVar;
    }

    public static void x(String str, Intent intent, o6 o6Var, fb fbVar, boolean z10, long[] jArr, long[] jArr2) {
        v.I(intent, true);
        intent.setAction(str);
        db.g(intent, o6Var, fbVar, z10, jArr, jArr2);
    }

    public static void y(o6 o6Var, h.e eVar, long j10, TdApi.Chat chat, boolean z10) {
        TdApi.User f42;
        eVar.l("msg");
        eVar.n(o6Var.C1(j10));
        if (z10 && chat != null && chat.type.getConstructor() == 1579049844 && (f42 = o6Var.f4(chat)) != null && !i.i(f42.phoneNumber)) {
            eVar.c("tel:+" + f42.phoneNumber);
        }
    }

    @Override
    public final void a(Context context, hb hbVar, int i10, boolean z10, TdApi.NotificationSettingsScope notificationSettingsScope, long j10, int i11) {
        boolean z11;
        k L = hbVar.L();
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        if (!f28191c) {
            Iterator<fb> it = hbVar.iterator();
            while (it.hasNext()) {
                sparseIntArray.put(it.next().u(), 1);
            }
        } else if (i11 != 0) {
            fb x10 = hbVar.x(i11);
            if (!(x10 == null || o(L, context, hbVar, i10, z10, x10, null, true) == 0)) {
                sparseIntArray.put(x10.u(), 1);
            }
        } else if (j10 != 0) {
            Iterator<fb> it2 = hbVar.iterator();
            while (it2.hasNext()) {
                fb next = it2.next();
                if (next.v() == j10 && o(L, context, hbVar, i10, z10, next, null, true) != 0) {
                    sparseIntArray.put(next.u(), 1);
                }
            }
        } else if (notificationSettingsScope != null) {
            Iterator<fb> it3 = hbVar.iterator();
            while (it3.hasNext()) {
                fb next2 = it3.next();
                int constructor = notificationSettingsScope.getConstructor();
                if (constructor == 548013448) {
                    z11 = this.f28193b.R6(next2.v());
                } else if (constructor == 937446759) {
                    z11 = a.l(next2.v());
                } else if (constructor == 1212142067) {
                    z11 = a.g(next2.v()) || (a.k(next2.v()) && !this.f28193b.R6(next2.v()));
                } else {
                    throw new UnsupportedOperationException(notificationSettingsScope.toString());
                }
                if (z11 && o(L, context, hbVar, i10, z10, next2, null, true) != 0) {
                    sparseIntArray.put(next2.u(), 1);
                }
            }
        } else {
            Iterator<fb> it4 = hbVar.iterator();
            while (it4.hasNext()) {
                fb next3 = it4.next();
                if (o(L, context, hbVar, i10, z10, next3, null, true) != 0) {
                    sparseIntArray.put(next3.u(), 1);
                }
            }
        }
        r(L, hbVar, sparseIntArray);
        if (sparseIntArray.size() > 0) {
            for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                p(L, context, hbVar, i10, z10, null, sparseIntArray.keyAt(i12), true);
            }
        }
    }

    @Override
    public final void b(Context context, hb hbVar, int i10, boolean z10, fb fbVar, lb lbVar) {
        k L = hbVar.L();
        if (!f28191c || o(L, context, hbVar, i10, z10, fbVar, lbVar, false) != 0) {
            p(L, context, hbVar, i10, z10, lbVar, fbVar.u(), false);
        }
    }

    @Override
    public final void c(Context context, hb hbVar, int i10, boolean z10, fb fbVar) {
        k L = hbVar.L();
        if (f28191c) {
            o(L, context, hbVar, i10, false, fbVar, null, false);
        }
        p(L, context, hbVar, i10, z10, null, fbVar.u(), true);
    }

    public final p0.h.e h(android.content.Context r31, zd.hb r32, int r33, boolean r34, zd.lb r35, java.util.List<zd.bb> r36, int r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: zd.ob.h(android.content.Context, zd.hb, int, boolean, zd.lb, java.util.List, int, boolean):p0.h$e");
    }

    @Override
    public void h2(TdApi.UpdateFile updateFile) {
    }

    public final String m(h.e eVar, Context context, fb fbVar, CharSequence charSequence, long j10, Bitmap bitmap) {
        long w10 = this.f28193b.tc().w(j10);
        String str = "tgx_ns_" + this.f28193b.A6() + "_" + w10;
        IconCompat c10 = v0.A1(bitmap) ? IconCompat.c(bitmap) : null;
        b a10 = new b.a(context, str).g(new l.a().e(charSequence).c(c10).d(str).a()).e().f(true).i(charSequence).c(qb.e(this.f28193b.A6(), w10, fbVar.m())).b(c10).a();
        d.f(context, a10);
        eVar.D(a10);
        return a10.b();
    }

    public final int n(p0.k r58, android.content.Context r59, zd.hb r60, int r61, boolean r62, zd.fb r63, zd.lb r64, int r65, boolean r66, boolean r67) {
        throw new UnsupportedOperationException("Method not decompiled: zd.ob.n(p0.k, android.content.Context, zd.hb, int, boolean, zd.fb, zd.lb, int, boolean, boolean):int");
    }

    public final int o(k kVar, Context context, hb hbVar, int i10, boolean z10, fb fbVar, lb lbVar, boolean z11) {
        return n(kVar, context, hbVar, i10, z10, fbVar, lbVar, hbVar.C(fbVar.w()), false, z11);
    }

    public final void p(k kVar, Context context, hb hbVar, int i10, boolean z10, lb lbVar, int i11, boolean z11) {
        fb fbVar;
        int B = hbVar.B(i11);
        if (hbVar.isEmpty() || !this.f28193b.A1().b()) {
            kVar.b(B);
            return;
        }
        List<bb> D = hbVar.D(i11);
        if (D.isEmpty()) {
            kVar.b(B);
            return;
        }
        if (z10) {
            Iterator<bb> it = D.iterator();
            fb fbVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    fbVar = fbVar2;
                    break;
                }
                bb next = it.next();
                if (fbVar2 == null) {
                    fbVar2 = next.o();
                } else if (fbVar2 != next.o()) {
                    fbVar = null;
                    break;
                }
            }
            if (fbVar != null) {
                if (n(kVar, context, hbVar, i10, z10, fbVar, lbVar, B, true, z11) != 0) {
                    this.f28193b.tc().t();
                    return;
                }
                return;
            }
        }
        h.e h10 = h(context, hbVar, i10, z10, lbVar, D, i11, z11);
        if (h10 != null) {
            try {
                Notification d10 = h10.d();
                c.b(j0.n(), d10, i10);
                try {
                    kVar.f(B, d10);
                    this.f28193b.tc().t();
                } catch (Throwable th) {
                    Log.e("Unable to display common notification", th, new Object[0]);
                    this.f28193b.tc().v0(th, true, 0L);
                }
            } catch (Throwable th2) {
                Log.e("Unable to build common notification", th2, new Object[0]);
                this.f28193b.tc().v0(th2, false, 0L);
            }
        }
    }

    public final void r(k kVar, hb hbVar, SparseIntArray sparseIntArray) {
        for (int i10 = 0; i10 <= 4; i10++) {
            if (sparseIntArray.indexOfKey(i10) < 0) {
                kVar.b(hbVar.B(i10));
            }
        }
    }
}
