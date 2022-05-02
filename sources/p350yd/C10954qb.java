package p350yd;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.graphics.drawable.IconCompat;
import be.C1379j0;
import be.C1405v;
import gd.C4779t2;
import ie.C5386e;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p012ab.C0245c;
import p067ed.C4183a;
import p082fd.C4403w;
import p108hb.C5070i;
import p193nb.C7316a;
import p213p0.C7956h;
import p213p0.C7976k;
import p213p0.C7983l;
import p241r0.C8339b;
import p241r0.C8343d;

public class C10954qb implements AbstractC10975rb, AbstractC10985s0 {
    public static final long f35205M;
    public static final boolean f35206c;
    public final C10827lb f35207a;
    public final C10930q6 f35208b;

    static {
        int i = Build.VERSION.SDK_INT;
        f35206c = i >= 20;
        f35205M = i >= 28 ? 15000L : 7500L;
    }

    public C10954qb(C10762jb jbVar, C10930q6 q6Var) {
        this.f35207a = jbVar.m3914t();
        this.f35208b = q6Var;
    }

    public static void m2075f(C7956h.C7971i iVar, CharSequence charSequence, C7983l lVar, C10930q6 q6Var, TdApi.Chat chat, List<C10609db> list, long j, boolean z, boolean z2, boolean z3) {
        C10609db dbVar = list.get(0);
        long j2 = chat.f25370id;
        boolean D = dbVar.m4457o().m4247D();
        if (Build.VERSION.SDK_INT >= 28) {
            q6Var.m2440ga().m3098o1(j2, D);
        }
        iVar.m13918h(new C7956h.C7971i.C7972a(C4403w.m27879g1(charSequence, false, q6Var.m2427h7(chat), q6Var.m2568Y6(chat), q6Var.m2752M6(chat), z2, z3), TimeUnit.SECONDS.toMillis(dbVar.m4463i()), lVar));
    }

    public static void m2074g(C7956h.C7971i iVar, CharSequence charSequence, C7983l lVar, final C10930q6 q6Var, TdApi.Chat chat, C10609db dbVar, long j, boolean z, boolean z2, boolean z3) {
        Uri uri;
        long j2 = chat.f25370id;
        boolean D = dbVar.m4457o().m4247D();
        if (Build.VERSION.SDK_INT >= 28 && q6Var.m2440ga().m3098o1(j2, D)) {
            long i = dbVar.m4463i() * 1000;
            final C10851mb b = C10851mb.m3001b(q6Var, chat, dbVar.m4461k());
            if (b != null) {
                if (!z) {
                    q6Var.m2413i5().m3967t(b.f34773a, j, null, null);
                }
                if (C4779t2.m25599T2(b.f34773a)) {
                    if (b.f34774b == 2) {
                        final AtomicReference atomicReference = new AtomicReference();
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        q6Var.m2270r4().m14783o(new TdApi.UploadFile(new TdApi.InputFileGenerated(b.f34773a.local.path, "asthumb", 0), new TdApi.FileTypeSticker(), 32), new Client.AbstractC7865g() {
                            @Override
                            public final void mo255t2(TdApi.Object object) {
                                C10954qb.m2061t(C10930q6.this, atomicReference, countDownLatch, b, object);
                            }
                        });
                        try {
                            countDownLatch.await(j, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                        }
                        TdApi.File file = (TdApi.File) atomicReference.get();
                        uri = C4779t2.m25599T2(file) ? C7389v0.m16714L(new File(file.local.path)) : null;
                    } else {
                        uri = C7389v0.m16714L(new File(b.f34773a.local.path));
                    }
                    if (uri != null) {
                        if (dbVar.m4448x()) {
                            iVar.m13918h(new C7956h.C7971i.C7972a(charSequence, i, lVar).m13904g("image/", uri));
                            if (!C5070i.m24062i(charSequence)) {
                                iVar.m13918h(new C7956h.C7971i.C7972a(charSequence, i + 1, lVar));
                                return;
                            }
                            return;
                        }
                        iVar.m13918h(new C7956h.C7971i.C7972a(charSequence, i, lVar).m13904g("image/", uri));
                        String h = dbVar.m4464h();
                        if (!C5070i.m24062i(h)) {
                            iVar.m13918h(new C7956h.C7971i.C7972a(new C4779t2.C4783d(C4779t2.f16240b, (int) R.string.ChatContentPhoto, h).toString(), i - 1, lVar));
                            return;
                        }
                        return;
                    }
                }
            }
        }
        iVar.m13918h(new C7956h.C7971i.C7972a(C4403w.m27879g1(charSequence, false, q6Var.m2427h7(chat), q6Var.m2568Y6(chat), q6Var.m2752M6(chat), z2, z3), TimeUnit.SECONDS.toMillis(dbVar.m4463i()), lVar));
    }

    public static C7983l m2072i(C10827lb lbVar, TdApi.Chat chat, C10609db dbVar, boolean z, boolean z2, boolean z3) {
        TdApi.ChatPhotoInfo chatPhotoInfo;
        C10930q6 J2 = lbVar.m3205J2();
        long e = dbVar.m4467e();
        long e4 = J2.m2478e4(chat);
        if (e4 == 0 && C7316a.m17049l(e) && dbVar.m4447y()) {
            e4 = C7316a.m17044q(e);
        }
        if (e4 != 0) {
            return m2070k(lbVar, dbVar.m4449w(), C4779t2.m25479l3(chat), J2.m2752M6(chat), J2.m2480e2().m1583v2(e4), Long.toString(C7316a.m17051j(chat.f25370id) ? chat.f25370id : C7316a.m17058c(e4)), z, z2, z3);
        }
        TdApi.File file = null;
        boolean z4 = false;
        if (C4779t2.m25479l3(chat)) {
            String f = dbVar.m4466f();
            TdApi.Chat U2 = J2.m2632U2(e);
            boolean w = dbVar.m4449w();
            boolean l3 = C4779t2.m25479l3(chat);
            boolean M6 = J2.m2752M6(chat);
            String l = Long.toString(e);
            boolean z5 = J2.m2832H6(e) || J2.m2784K6(e);
            C5386e B1 = C4779t2.m25723B1(f);
            int c3 = J2.m2511c3(e);
            if (!(U2 == null || (chatPhotoInfo = U2.photo) == null)) {
                file = chatPhotoInfo.small;
            }
            return m2071j(lbVar, w, l3, M6, l, z5, f, B1, c3, file, z, z2, z3);
        }
        boolean w2 = dbVar.m4449w();
        boolean l32 = C4779t2.m25479l3(chat);
        boolean M62 = J2.m2752M6(chat);
        String l2 = Long.toString(chat.f25370id);
        if (J2.m2816I6(chat) || J2.m2752M6(chat)) {
            z4 = true;
        }
        String str = chat.title;
        C5386e k3 = J2.m2383k3(chat);
        int d3 = J2.m2495d3(chat);
        TdApi.ChatPhotoInfo chatPhotoInfo2 = chat.photo;
        if (chatPhotoInfo2 != null) {
            file = chatPhotoInfo2.small;
        }
        return m2071j(lbVar, w2, l32, M62, l2, z4, str, k3, d3, file, z, z2, z3);
    }

    public static C7983l m2071j(C10827lb lbVar, boolean z, boolean z2, boolean z3, String str, boolean z4, String str2, C5386e eVar, int i, TdApi.File file, boolean z5, boolean z6, boolean z7) {
        C7983l.C7984a aVar = new C7983l.C7984a();
        if (Build.VERSION.SDK_INT >= 28) {
            aVar.m13846d(str);
            aVar.m13848b(z4);
            aVar.m13845e(C4403w.m27879g1(str2, true, z, z2, z3, z5, z6));
            Bitmap bitmap = null;
            if (!C7389v0.m16756A1(null)) {
                C10930q6 J2 = lbVar.m3205J2();
                bitmap = z ? C10996sb.m2028c(J2) : C10996sb.m2029b(J2, file, i, eVar, true, z7);
            }
            if (C7389v0.m16756A1(bitmap)) {
                aVar.m13847c(IconCompat.m40324c(bitmap));
            }
        } else if (!C4183a.f14099q || !z2) {
            aVar.m13845e("");
        } else {
            aVar.m13845e(C4403w.m27879g1(str2, true, z, z2, z3, z5, z6));
        }
        return aVar.m13849a();
    }

    public static p213p0.C7983l m2070k(p350yd.C10827lb r16, boolean r17, boolean r18, boolean r19, org.drinkless.p210td.libcore.telegram.TdApi.User r20, java.lang.String r21, boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10954qb.m2070k(yd.lb, boolean, boolean, boolean, org.drinkless.td.libcore.telegram.TdApi$User, java.lang.String, boolean, boolean, boolean):p0.l");
    }

    public static boolean m2069l(C10711hb hbVar) {
        if (hbVar.isEmpty() || hbVar.m4244G()) {
            return false;
        }
        if (hbVar.m4247D()) {
            return true;
        }
        C10609db dbVar = null;
        Iterator<C10609db> it = hbVar.iterator();
        while (it.hasNext()) {
            C10609db next = it.next();
            if (dbVar != null && !dbVar.m4451u(next)) {
                return false;
            }
            dbVar = next;
        }
        return false;
    }

    public static CharSequence m2064q(C10930q6 q6Var, C10762jb jbVar, boolean z, TdApi.Chat chat, C10609db dbVar, boolean z2, boolean z3, boolean[] zArr) {
        if (chat == null || !z) {
            return C4403w.m27871i1(R.string.YouHaveNewMessage);
        }
        boolean O = jbVar.m3936O(dbVar.m4457o());
        String str = null;
        if (z2) {
            if (C7316a.m17049l(chat.f25370id)) {
                TdApi.User b4 = q6Var.m2525b4(chat);
                if (b4 != null) {
                    str = C4779t2.m25445q2(b4.firstName, b4.lastName);
                }
            } else if (C4779t2.m25638N2(chat.type)) {
                str = chat.title;
            } else {
                str = dbVar.m4466f();
                if (!z3) {
                    str = C4403w.m27867j1(R.string.format_notificationGroupSender, str, chat.title);
                }
            }
        }
        CharSequence n = dbVar.m4458n(q6Var, dbVar.m4457o().m4247D() && dbVar.m4457o().m4245F(), O, zArr);
        return str != null ? C4403w.m27864k0(R.string.format_notificationTicker, str, n) : n;
    }

    public static void m2062s(AtomicReference atomicReference, CountDownLatch countDownLatch, C10851mb mbVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("Cannot generate sticker preview (2): %s, path: %s", C4779t2.m25379z5(object), mbVar.f34773a.local.path);
        } else if (constructor == 766337656) {
            atomicReference.set((TdApi.File) object);
            countDownLatch.countDown();
        }
    }

    public static void m2061t(C10930q6 q6Var, final AtomicReference atomicReference, final CountDownLatch countDownLatch, final C10851mb mbVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("Cannot generate sticker preview: %s, path: %s", C4779t2.m25379z5(object), mbVar.f34773a.local.path);
        } else if (constructor == 766337656) {
            TdApi.File file = (TdApi.File) object;
            q6Var.m2270r4().m14783o(new TdApi.CancelUploadFile(file.f25376id), q6Var.m2392ja());
            q6Var.m2270r4().m14783o(new TdApi.DownloadFile(file.f25376id, 32, 0, 0, true), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object2) {
                    C10954qb.m2062s(atomicReference, countDownLatch, mbVar, object2);
                }
            });
        }
    }

    public static String m2060u(C10930q6 q6Var, int i) {
        return "messages" + q6Var.m2188w6() + "_" + i;
    }

    public static String m2059v(C10609db dbVar, boolean z) {
        if (z) {
            return C5070i.m24054q(dbVar.m4463i());
        }
        return C5070i.m24054q(Integer.MAX_VALUE - dbVar.m4462j());
    }

    public static C7956h.C7971i m2058w(C10827lb lbVar, TdApi.Chat chat, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C7956h.C7971i iVar;
        C10930q6 J2 = lbVar.m3205J2();
        TdApi.User m1 = lbVar.m3106m1();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28 || m1 == null) {
            iVar = new C7956h.C7971i("");
        } else {
            iVar = new C7956h.C7971i(m2070k(lbVar, J2.m2427h7(chat), J2.m2568Y6(chat), J2.m2752M6(chat), m1, null, false, false, z5));
        }
        boolean z6 = true;
        if (i2 >= 28) {
            if (J2.m2171x7(chat) || J2.m2752M6(chat)) {
                z6 = false;
            }
            if (z6) {
                iVar.m13912n(C4403w.m27956O0(chat.f25370id, J2.m2661S3(chat), i, J2.m2427h7(chat), J2.m2568Y6(chat), J2.m2752M6(chat), z, z2, z3, z4));
            }
            iVar.m13911o(z6);
        } else {
            iVar.m13912n(C4403w.m27956O0(chat.f25370id, J2.m2661S3(chat), i, J2.m2427h7(chat), J2.m2568Y6(chat), J2.m2752M6(chat), z, z2, z3, z4));
            iVar.m13911o(true);
        }
        return iVar;
    }

    public static void m2057x(String str, Intent intent, C10930q6 q6Var, C10711hb hbVar, boolean z, long[] jArr, long[] jArr2) {
        C1405v.m37136J(intent, true);
        intent.setAction(str);
        C10666fb.m4340g(intent, q6Var, hbVar, z, jArr, jArr2);
    }

    public static void m2056y(C10930q6 q6Var, C7956h.C7965e eVar, long j, TdApi.Chat chat, boolean z) {
        TdApi.User b4;
        if (Build.VERSION.SDK_INT >= 21) {
            eVar.m13950l("msg");
            eVar.m13948n(q6Var.m2917C1(j));
            if (z && chat != null && chat.type.getConstructor() == 1579049844 && (b4 = q6Var.m2525b4(chat)) != null && !C5070i.m24062i(b4.phoneNumber)) {
                eVar.m13959c("tel:+" + b4.phoneNumber);
            }
        }
    }

    @Override
    public final void mo2042a(Context context, C10762jb jbVar, int i, boolean z, TdApi.NotificationSettingsScope notificationSettingsScope, long j, int i2) {
        boolean z2;
        C7976k L = jbVar.m3939L();
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        if (!f35206c) {
            Iterator<C10711hb> it = jbVar.iterator();
            while (it.hasNext()) {
                sparseIntArray.put(it.next().m4221u(), 1);
            }
        } else if (i2 != 0) {
            C10711hb x = jbVar.m3910x(i2);
            if (!(x == null || m2066o(L, context, jbVar, i, z, x, null, true) == 0)) {
                sparseIntArray.put(x.m4221u(), 1);
            }
        } else if (j != 0) {
            Iterator<C10711hb> it2 = jbVar.iterator();
            while (it2.hasNext()) {
                C10711hb next = it2.next();
                if (next.m4220v() == j && m2066o(L, context, jbVar, i, z, next, null, true) != 0) {
                    sparseIntArray.put(next.m4221u(), 1);
                }
            }
        } else if (notificationSettingsScope != null) {
            Iterator<C10711hb> it3 = jbVar.iterator();
            while (it3.hasNext()) {
                C10711hb next2 = it3.next();
                int constructor = notificationSettingsScope.getConstructor();
                if (constructor == 548013448) {
                    z2 = this.f35208b.m2736N6(next2.m4220v());
                } else if (constructor == 937446759) {
                    z2 = C7316a.m17049l(next2.m4220v());
                } else if (constructor == 1212142067) {
                    z2 = C7316a.m17054g(next2.m4220v()) || (C7316a.m17050k(next2.m4220v()) && !this.f35208b.m2736N6(next2.m4220v()));
                } else {
                    throw new UnsupportedOperationException(notificationSettingsScope.toString());
                }
                if (z2 && m2066o(L, context, jbVar, i, z, next2, null, true) != 0) {
                    sparseIntArray.put(next2.m4221u(), 1);
                }
            }
        } else {
            Iterator<C10711hb> it4 = jbVar.iterator();
            while (it4.hasNext()) {
                C10711hb next3 = it4.next();
                if (m2066o(L, context, jbVar, i, z, next3, null, true) != 0) {
                    sparseIntArray.put(next3.m4221u(), 1);
                }
            }
        }
        m2063r(L, jbVar, sparseIntArray);
        if (sparseIntArray.size() > 0) {
            for (int i3 = 0; i3 < sparseIntArray.size(); i3++) {
                m2065p(L, context, jbVar, i, z, null, sparseIntArray.keyAt(i3), true);
            }
        }
    }

    @Override
    public final void mo2041b(Context context, C10762jb jbVar, int i, boolean z, C10711hb hbVar, C10872nb nbVar) {
        C7976k L = jbVar.m3939L();
        if (!f35206c || m2066o(L, context, jbVar, i, z, hbVar, nbVar, false) != 0) {
            m2065p(L, context, jbVar, i, z, nbVar, hbVar.m4221u(), false);
        }
    }

    @Override
    public final void mo2040c(Context context, C10762jb jbVar, int i, boolean z, C10711hb hbVar) {
        C7976k L = jbVar.m3939L();
        if (f35206c) {
            m2066o(L, context, jbVar, i, false, hbVar, null, false);
        }
        m2065p(L, context, jbVar, i, z, null, hbVar.m4221u(), true);
    }

    public final p213p0.C7956h.C7965e m2073h(android.content.Context r31, p350yd.C10762jb r32, int r33, boolean r34, p350yd.C10872nb r35, java.util.List<p350yd.C10609db> r36, int r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10954qb.m2073h(android.content.Context, yd.jb, int, boolean, yd.nb, java.util.List, int, boolean):p0.h$e");
    }

    @Override
    public void mo2039h2(TdApi.UpdateFile updateFile) {
    }

    public final String m2068m(C7956h.C7965e eVar, Context context, C10711hb hbVar, CharSequence charSequence, long j, Bitmap bitmap) {
        long w = this.f35208b.m2294pc().m4089w(j);
        String str = "tgx_ns_" + this.f35208b.m2188w6() + "_" + w;
        IconCompat c = C7389v0.m16756A1(bitmap) ? IconCompat.m40324c(bitmap) : null;
        C8339b a = new C8339b.C8340a(context, str).m12763g(new C7983l.C7984a().m13845e(charSequence).m13847c(c).m13846d(str).m13849a()).m12765e().m12764f(true).m12761i(charSequence).m12767c(C10996sb.m2026e(this.f35208b.m2188w6(), w, hbVar.m4225m())).m12768b(c).m12769a();
        C8343d.m12750f(context, a);
        eVar.m13972D(a);
        return a.m12774b();
    }

    public final int m2067n(p213p0.C7976k r58, android.content.Context r59, p350yd.C10762jb r60, int r61, boolean r62, p350yd.C10711hb r63, p350yd.C10872nb r64, int r65, boolean r66, boolean r67) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10954qb.m2067n(p0.k, android.content.Context, yd.jb, int, boolean, yd.hb, yd.nb, int, boolean, boolean):int");
    }

    public final int m2066o(C7976k kVar, Context context, C10762jb jbVar, int i, boolean z, C10711hb hbVar, C10872nb nbVar, boolean z2) {
        return m2067n(kVar, context, jbVar, i, z, hbVar, nbVar, jbVar.m3948C(hbVar.m4219w()), false, z2);
    }

    public final void m2065p(C7976k kVar, Context context, C10762jb jbVar, int i, boolean z, C10872nb nbVar, int i2, boolean z2) {
        C10711hb hbVar;
        int B = jbVar.m3949B(i2);
        if (jbVar.isEmpty() || !this.f35208b.m2949A1().m1482b()) {
            kVar.m13879b(B);
            return;
        }
        List<C10609db> D = jbVar.m3947D(i2);
        if (D.isEmpty()) {
            kVar.m13879b(B);
            return;
        }
        if (z) {
            Iterator<C10609db> it = D.iterator();
            C10711hb hbVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    hbVar = hbVar2;
                    break;
                }
                C10609db next = it.next();
                if (hbVar2 == null) {
                    hbVar2 = next.m4457o();
                } else if (hbVar2 != next.m4457o()) {
                    hbVar = null;
                    break;
                }
            }
            if (hbVar != null) {
                if (m2067n(kVar, context, jbVar, i, z, hbVar, nbVar, B, true, z2) != 0) {
                    this.f35208b.m2294pc().m4095t();
                    return;
                }
                return;
            }
        }
        C7956h.C7965e h = m2073h(context, jbVar, i, z, nbVar, D, i2, z2);
        if (h != null) {
            try {
                Notification d = h.m13958d();
                C0245c.m42024b(C1379j0.m37318n(), d, i);
                try {
                    kVar.m13875f(B, d);
                    this.f35208b.m2294pc().m4095t();
                } catch (Throwable th) {
                    Log.m14725e("Unable to display common notification", th, new Object[0]);
                    this.f35208b.m2294pc().m4090v0(th, true, 0L);
                }
            } catch (Throwable th2) {
                Log.m14725e("Unable to build common notification", th2, new Object[0]);
                this.f35208b.m2294pc().m4090v0(th2, false, 0L);
            }
        }
    }

    public final void m2063r(C7976k kVar, C10762jb jbVar, SparseIntArray sparseIntArray) {
        for (int i = 0; i <= 4; i++) {
            if (sparseIntArray.indexOfKey(i) < 0) {
                kVar.m13879b(jbVar.m3949B(i));
            }
        }
    }
}
