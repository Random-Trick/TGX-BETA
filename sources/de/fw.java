package de;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import gd.w;
import hd.t2;
import ib.i;
import id.d;
import ie.g0;
import ie.h0;
import ie.j0;
import ie.p0;
import ie.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je.g;
import k0.h;
import ne.j2;
import ne.k2;
import ne.o2;
import ne.q1;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import uc.c;
import ud.v4;
import zd.gc;
import zd.j1;
import zd.jb;
import zd.o6;
import zd.rb;
import zd.sb;
import zd.w6;
import zd.ya;

public class fw extends vo<b> implements View.OnClickListener, View.OnLongClickListener, v4.r, v4.s, j1, sb, ud.a, j2.f, ud.j1, gc.d {
    public ra D0;
    public ra E0;
    public ra F0;
    public ra G0;
    public ra H0;
    public ra I0;
    public ra J0;
    public ra K0;
    public ra L0;
    public iq M0;
    public ArrayList<j0> N0;
    public ArrayList<j0> O0;
    public long P0;
    public long Q0;
    public boolean R0;
    public TdApi.NotificationSettingsScope S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public List<w6> W0;
    public int X0;
    public boolean Y0;
    public long Z0;
    public HashMap<String, Ringtone> f8001a1;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
            fw.this = r1;
        }

        @Override
        public void R2(de.ra r12, uc.c r13, boolean r14) {
            throw new UnsupportedOperationException("Method not decompiled: de.fw.a.R2(de.ra, uc.c, boolean):void");
        }
    }

    public fw(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static void Ai(int i10, View view, int i11, ra raVar, TextView textView, iq iqVar) {
        int j10 = raVar.j();
        if (j10 == R.id.btn_long) {
            try {
                Vibrator vibrator = (Vibrator) ce.j0.q().getSystemService("vibrator");
                if (vibrator != null) {
                    if (ri(i10)) {
                        vibrator.vibrate(jb.f27801t0, 0);
                    } else {
                        vibrator.vibrate(jb.f27799r0, -1);
                    }
                }
            } catch (Throwable th) {
                Log.w("Cannot vibrate", th, new Object[0]);
            }
        } else if (j10 == R.id.btn_short) {
            try {
                Vibrator vibrator2 = (Vibrator) ce.j0.q().getSystemService("vibrator");
                if (vibrator2 != null) {
                    if (ri(i10)) {
                        vibrator2.vibrate(jb.f27800s0, 0);
                    } else {
                        vibrator2.vibrate(jb.f27798q0, -1);
                    }
                }
            } catch (Throwable th2) {
                Log.w("Cannot vibrate", th2, new Object[0]);
            }
        }
    }

    public void Bi(ArrayList arrayList, View view, int i10, ra raVar, TextView textView, iq iqVar) {
        String v10 = raVar.v();
        if (v10 != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j0 j0Var = (j0) it.next();
                if (v10.equals(j0Var.b().toString())) {
                    Qi(j0Var);
                    return;
                }
            }
        }
    }

    public void Ci() {
        this.M0.p3(R.id.btn_events_contactJoined);
    }

    public void Di() {
        this.M0.p3(R.id.btn_archiveMuteNonContacts);
    }

    public void Ei() {
        if (!Sa()) {
            Yh();
        }
    }

    public void Fi() {
        this.M0.p3(R.id.btn_events_sentScheduled);
    }

    public boolean Gi(View view, int i10) {
        if (i10 != R.id.btn_resetNotifications) {
            return true;
        }
        Ri();
        return true;
    }

    public static ra Ni() {
        return new ra(5, R.id.btn_notifications_priorityOrImportance, 0, Build.VERSION.SDK_INT >= 26 ? R.string.NotificationImportance : R.string.NotificationsPriority);
    }

    public static int Oi(int i10) {
        if (i10 == 0) {
            return R.id.btn_notificationMode_all;
        }
        if (i10 == 1) {
            return R.id.btn_notificationMode_active;
        }
        if (i10 == 2) {
            return R.id.btn_notificationMode_selected;
        }
        throw new IllegalArgumentException(Integer.toString(i10));
    }

    public static int ci(int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            switch (i10) {
                case R.id.btn_importanceDefault:
                    return 3;
                case R.id.btn_importanceHigh:
                    return 4;
                case R.id.btn_importanceLow:
                    return 2;
                case R.id.btn_importanceMin:
                    return 1;
            }
        } else {
            switch (i10) {
                case R.id.btn_priorityHigh:
                    return 1;
                case R.id.btn_priorityLow:
                    return -1;
                case R.id.btn_priorityMax:
                    return 2;
            }
        }
        throw new IllegalArgumentException("id == " + w.e1(i10));
    }

    public static ArrayList<j0> ki(Context context, int i10, String str) {
        boolean z10;
        ArrayList<j0> arrayList = new ArrayList<>();
        Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(context, i10);
        boolean z11 = false;
        Cursor cursor = null;
        try {
            RingtoneManager ringtoneManager = new RingtoneManager(context);
            ringtoneManager.setType(i10);
            cursor = ringtoneManager.getCursor();
            arrayList.ensureCapacity(cursor.getCount());
            while (cursor.moveToNext()) {
                int i11 = cursor.getInt(0);
                String string = cursor.getString(1);
                Uri ringtoneUri = ringtoneManager.getRingtoneUri(cursor.getPosition());
                if (!(string == null || string.isEmpty() || ringtoneUri == null)) {
                    if (str != null) {
                        z10 = str.equals(ringtoneUri.toString());
                    } else {
                        z10 = actualDefaultRingtoneUri != null && actualDefaultRingtoneUri.equals(ringtoneUri);
                    }
                    arrayList.add(new j0(i11, string, ringtoneUri, z10));
                }
            }
        } catch (Throwable th) {
            Log.e(th);
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, ew.f7894a);
            String i12 = w.i1(i10 == 1 ? R.string.RingtoneDisabled : R.string.SoundDisabled);
            Uri uri = Uri.EMPTY;
            if (str != null && str.isEmpty()) {
                z11 = true;
            }
            arrayList.add(1, new j0(-1, i12, uri, z11));
        }
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static boolean ri(int i10) {
        return i10 == R.id.btn_calls_ringtone || i10 == R.id.btn_calls_vibrate || i10 == R.id.btn_customChat_calls_ringtone || i10 == R.id.btn_customChat_calls_vibrate;
    }

    public int si(w6 w6Var, w6 w6Var2) {
        int x22 = this.f24495b.F4().x2();
        int i10 = w6Var.f28608b;
        boolean z10 = true;
        boolean z11 = i10 == x22;
        int i11 = w6Var2.f28608b;
        if (z11 != (i11 == x22)) {
            boolean z12 = i11 == x22;
            if (i10 != x22) {
                z10 = false;
            }
            return Boolean.compare(z12, z10);
        } else if (w6Var.l() != w6Var2.l()) {
            return Boolean.compare(w6Var2.l(), w6Var.l());
        } else {
            return 0;
        }
    }

    public static int ti(j0 j0Var, j0 j0Var2) {
        boolean c10 = j0Var.c();
        boolean c11 = j0Var2.c();
        if (!c10 || c11) {
            return (c10 || !c11) ? 0 : 1;
        }
        return -1;
    }

    public void ui(TdApi.NotificationSettingsScope notificationSettingsScope, boolean z10) {
        if (!Sa()) {
            TdApi.NotificationSettingsScope notificationSettingsScope2 = this.S0;
            if (notificationSettingsScope2 == null) {
                notificationSettingsScope2 = this.P0 != 0 ? this.f24495b.ka().j2(this.P0) : null;
            }
            if (notificationSettingsScope2 == null) {
                this.M0.Y2(R.id.btn_notifications_snooze);
            } else if (notificationSettingsScope2.getConstructor() == notificationSettingsScope.getConstructor()) {
                long j10 = this.P0;
                if (j10 != 0) {
                    oi(j10, z10);
                    return;
                }
                ai();
                if (z10) {
                    Hi();
                    return;
                }
                this.M0.p3(R.id.btn_notifications_preview);
                Xh(this.f24495b.ka().P(notificationSettingsScope), R.id.btn_notifications_preview, R.id.btn_notifications_contentPreview);
            }
        }
    }

    public void vi(long j10, boolean z10) {
        if (!Sa() && j10 != 0 && this.P0 == j10) {
            if (z10) {
                Hi();
            } else {
                this.M0.p3(R.id.btn_customChat_preview);
            }
        }
    }

    public void wi(q1 q1Var, DialogInterface dialogInterface, int i10) {
        p0 p0Var = (p0) q1Var.getCurrentItem();
        if (p0Var != null && this.f24495b.ka().G2((int) p0Var.a())) {
            this.M0.p3(R.id.btn_repeatNotifications);
        }
    }

    public static boolean xi(w6 w6Var, w6 w6Var2) {
        return w6Var2.f28608b == w6Var.f28608b;
    }

    public static void yi(ra raVar, c cVar, boolean z10) {
        ((o2) cVar.getChildAt(0)).setApplyColor(true);
    }

    public void zi(boolean z10, int i10, ra raVar, int i11, int i12, SparseIntArray sparseIntArray) {
        int i13;
        int i14 = sparseIntArray.get(i12);
        int i15 = 0;
        if (i14 != R.id.btn_ledDisabled) {
            int[] iArr = jb.f27804w0;
            int length = iArr.length;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i16 >= length) {
                    i13 = 0;
                    i17 = -1;
                    break;
                } else if (iArr[i16] == i14) {
                    i13 = jb.f27802u0[i17];
                    break;
                } else {
                    i17++;
                    i16++;
                }
            }
            if (i17 == -1) {
                throw new RuntimeException();
            }
        } else {
            i13 = 0;
        }
        if (z10) {
            jb ka2 = this.f24495b.ka();
            long j10 = this.P0;
            if (i13 != i10) {
                i15 = i13;
            }
            ka2.t2(j10, i15);
        } else {
            this.f24495b.ka().z2(li(raVar), i13);
        }
        this.M0.p3(i11);
        Pi();
    }

    @Override
    public void A2(int i10, h<String> hVar) {
        switch (i10) {
            case R.id.btn_calls_ringtone:
            case R.id.btn_customChat_calls_ringtone:
            case R.id.btn_customChat_sound:
            case R.id.btn_notifications_sound:
                if (hVar.n() == 1) {
                    ArrayList<j0> ei = ri(i10) ? ei() : ji();
                    String o10 = hVar.o(0);
                    Iterator<j0> it = ei.iterator();
                    while (it.hasNext()) {
                        j0 next = it.next();
                        if (o10.equals(next.b().toString())) {
                            boolean c10 = next.c();
                            Ui(i10, c10 ? null : next.b().toString(), c10 ? null : next.a(), null);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void A5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        pi(notificationSettingsScope, true);
    }

    @Override
    public void G0(boolean z10) {
        rb.a(this, z10);
    }

    @Override
    public void G2(TdApi.SuggestedAction[] suggestedActionArr, TdApi.SuggestedAction[] suggestedActionArr2) {
        rb.d(this, suggestedActionArr, suggestedActionArr2);
    }

    @TargetApi(26)
    public final void Hi() {
        this.M0.V2();
        Pi();
    }

    public final CharSequence Ii(int i10) {
        int i11;
        TdApi.Chat R3;
        switch (i10) {
            case 1:
                i11 = R.string.NotificationsGuideBlockedCategory;
                break;
            case 2:
                if (Build.VERSION.SDK_INT >= 28) {
                    i11 = R.string.NotificationsGuideBlockedAll;
                    break;
                }
                i11 = R.string.NotificationsGuideBlockedApp;
                break;
            case 3:
                i11 = R.string.NotificationsGuideSyncGlobalOff;
                break;
            case 4:
                i11 = R.string.NotificationsGuideSyncAppOff;
                break;
            case 5:
                i11 = R.string.NotificationsGuideFirebaseUnavailable;
                break;
            case 6:
                long v10 = this.f24495b.tc().v();
                if (v10 == 0 || (R3 = this.f24495b.R3(v10)) == null) {
                    i11 = R.string.NotificationsGuideError;
                    break;
                } else {
                    return w.G0(this, R.string.NotificationsGuideErrorChat, w.p(), this.f24495b.W3(R3));
                }
                break;
            default:
                i11 = R.string.NotificationsGuideBlockedApp;
                break;
        }
        CharSequence H0 = w.H0(this, i11, new Object[0]);
        if (i11 != R.string.NotificationsGuideBlockedCategory) {
            return H0;
        }
        String E1 = this.f24495b.E1();
        if (H0 instanceof String) {
            return w.m1(i11, E1);
        }
        if (H0 instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) H0;
            int g10 = i.g(H0, "%1$s", 0);
            if (g10 != -1) {
                spannableStringBuilder.replace(g10, g10 + 4, (CharSequence) E1);
                spannableStringBuilder.setSpan(w.d2(g.M0(E1)), g10, E1.length() + g10, 33);
                return spannableStringBuilder;
            }
        }
        return w.i1(R.string.NotificationsGuideBlockedApp);
    }

    public final boolean Ji() {
        return this.P0 == 0 && this.S0 == null && this.f24495b.ka().D();
    }

    public final boolean Ki() {
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        TdApi.NotificationSettingsScope notificationSettingsScope = this.S0;
        return notificationSettingsScope != null ? (notificationSettingsScope.getConstructor() == 937446759 && this.f24495b.ka().u0(this.S0) == jb.f27797p0) ? false : true : this.P0 != 0;
    }

    public final boolean Li() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.P0 != 0 ? this.f24495b.ka().B0(this.P0) >= 3 : this.S0 != null && this.f24495b.ka().u0(this.S0) >= 3;
        }
        return true;
    }

    public final ra Mi(w6 w6Var) {
        CharSequence I = d.z().I(w6Var.t());
        int i10 = w6Var.f28608b;
        int i11 = i10 + 1;
        if (i10 == this.f24495b.A6()) {
            I = w.k0(R.string.CurrentAccount, I);
        }
        return new ra(69, i11, 0, I, w6Var.f28608b + 1, w6Var.l()).G(w6Var).O(w6Var.r());
    }

    @Override
    public void N2(o6 o6Var, boolean z10) {
        o6Var.hd().post(new Runnable() {
            @Override
            public final void run() {
                fw.this.Ei();
            }
        });
    }

    @Override
    public void P0(int i10) {
        if (i10 == R.id.btn_resetNotifications) {
            Xi();
        }
    }

    public final void Pi() {
        if (Build.VERSION.SDK_INT >= 26) {
            if (this.P0 != 0) {
                boolean R0 = this.f24495b.ka().R0(this.P0);
                if (R0 != this.R0) {
                    this.R0 = R0;
                    if (R0) {
                        int L0 = this.M0.L0(ob.a.j(this.P0) ? R.id.btn_customChat_led : R.id.btn_customChat_preview);
                        if (L0 != -1) {
                            int i10 = L0 + 1;
                            this.M0.D0().add(i10, new ra(11));
                            this.M0.D0().add(L0 + 2, new ra(4, R.id.btn_customChat_channel, 0, R.string.NotificationChannelMore));
                            this.M0.M(i10, 2);
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int L02 = this.M0.L0(R.id.btn_customChat_channel);
                        if (L02 != -1) {
                            this.M0.R1(L02 - 1, 2);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
            } else {
                Zh();
            }
            bi();
            Yh();
            ai();
        }
    }

    public final void Qi(j0 j0Var) {
        if (!j0Var.b().equals(Uri.EMPTY) && System.currentTimeMillis() - this.Z0 > 100) {
            this.Z0 = System.currentTimeMillis();
            Ringtone ringtone = null;
            HashMap<String, Ringtone> hashMap = this.f8001a1;
            if (hashMap == null) {
                this.f8001a1 = new HashMap<>();
            } else {
                ringtone = hashMap.get(j0Var.b().toString());
            }
            try {
                if (ringtone == null) {
                    ringtone = RingtoneManager.getRingtone(t(), j0Var.b());
                    if (ringtone != null) {
                        this.f8001a1.put(j0Var.b().toString(), ringtone);
                    }
                } else {
                    ringtone.stop();
                }
                Yi();
            } catch (Throwable th) {
                Log.w(th);
            }
            if (ringtone != null) {
                try {
                    ringtone.play();
                } catch (Throwable th2) {
                    Log.w(th2);
                }
            }
        }
    }

    @Override
    public int R9() {
        return R.id.controller_notificationSettings;
    }

    public final void Ri() {
        int ii;
        this.f24495b.ka().g2(false);
        this.f24495b.Tb(false);
        this.f24495b.v4().o(new TdApi.ResetAllNotificationSettings(), this.f24495b.na());
        int ii2 = ii();
        if (he.i.c2().T3() && ii2 != (ii = ii()) && Zi(ii2, ii, true)) {
            ya.o1().o2();
        }
        this.M0.V2();
    }

    public void Si(b bVar) {
        super.Ad(bVar);
        Ti(bVar.f8003a);
        Wi(bVar.f8004b);
    }

    public final void Ti(long j10) {
        TdApi.User u22;
        this.P0 = j10;
        long j11 = 0;
        if (j10 != 0 && ob.a.l(j10)) {
            long h42 = this.f24495b.h4(j10);
            if (!(h42 == 0 || (u22 = this.f24495b.e2().u2(h42)) == null || u22.type.getConstructor() != -598644325)) {
                j11 = ob.a.c(h42);
            }
        }
        this.Q0 = j11;
    }

    public final void Ui(int i10, String str, String str2, String str3) {
        boolean z10 = true;
        switch (i10) {
            case R.id.btn_calls_ringtone:
                z10 = this.f24495b.ka().p2(str, str2, str3);
                break;
            case R.id.btn_customChat_calls_ringtone:
                this.f24495b.ka().r2(this.Q0, str, str2, str3);
                break;
            case R.id.btn_customChat_sound:
                this.f24495b.ka().v2(this.P0, str, str2, str3);
                break;
            case R.id.btn_notifications_sound:
                z10 = this.f24495b.ka().C2(this.S0, str, str2, str3);
                break;
            default:
                throw new IllegalStateException("Stub");
        }
        if (z10) {
            this.M0.p3(i10);
            Pi();
        }
    }

    public final void Vi(int i10) {
        if (i10 == 0) {
            Wi(null);
        } else if (i10 == 548013448) {
            Wi(new TdApi.NotificationSettingsScopeChannelChats());
        } else if (i10 == 937446759) {
            Wi(new TdApi.NotificationSettingsScopePrivateChats());
        } else if (i10 == 1212142067) {
            Wi(new TdApi.NotificationSettingsScopeGroupChats());
        } else {
            throw new UnsupportedOperationException("constructor == " + i10);
        }
    }

    @Override
    public int W9() {
        if (qi()) {
            return R.id.menu_more;
        }
        return 0;
    }

    public final void Wi(TdApi.NotificationSettingsScope notificationSettingsScope) {
        this.S0 = notificationSettingsScope;
    }

    @Override
    public CharSequence X9() {
        if (this.P0 != 0) {
            return w.i1(R.string.CustomNotifications);
        }
        TdApi.NotificationSettingsScope notificationSettingsScope = this.S0;
        if (notificationSettingsScope != null) {
            int constructor = notificationSettingsScope.getConstructor();
            if (constructor == 548013448) {
                return w.i1(R.string.Channels);
            }
            if (constructor == 937446759) {
                return w.i1(R.string.PrivateChats);
            }
            if (constructor == 1212142067) {
                return w.i1(R.string.Groups);
            }
        }
        return w.i1(R.string.Notifications);
    }

    public final void Xh(boolean z10, int i10, int i11) {
        int L0;
        int L02 = this.M0.L0(i11);
        if (z10) {
            if (L02 == -1 && (L0 = this.M0.L0(i10)) != -1) {
                int i12 = L0 + 1;
                this.M0.D0().add(i12, new ra(11));
                this.M0.D0().add(L0 + 2, new ra(7, i11, 0, R.string.MessageContentPreview));
                this.M0.M(i12, 2);
            }
        } else if (L02 != -1) {
            this.M0.R1(L02 - 1, 2);
        }
    }

    public final void Xi() {
        ee(w.i1(R.string.ResetNotificationsConfirm), new int[]{R.id.btn_resetNotifications, R.id.btn_cancel}, new String[]{w.i1(R.string.ResetNotifications), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
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
                boolean Gi;
                Gi = fw.this.Gi(view, i10);
                return Gi;
            }
        });
    }

    @Override
    public void Y3(long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        oi(j10, false);
    }

    public final void Yh() {
        boolean Ji = Ji();
        boolean z10 = true;
        if (this.V0 != Ji) {
            wg();
            if (Ji) {
                int L0 = this.M0.L0(R.id.btn_showAdvanced);
                if (L0 != -1) {
                    this.M0.R1(L0 - 1, 3);
                    int A = this.M0.D0().get(0).A();
                    int G0 = this.f24495b.ka().G0();
                    ArrayList arrayList = new ArrayList();
                    ra d02 = new ra(4, R.id.btn_showAdvanced, gi(G0), hi(G0)).d0(R.id.theme_color_textNegative);
                    this.L0 = d02;
                    arrayList.add(d02);
                    arrayList.add(new ra(3));
                    ra raVar = new ra(9, 0, 0, Ii(G0), false);
                    this.K0 = raVar;
                    arrayList.add(raVar);
                    if (A != 70) {
                        arrayList.add(new ra(2));
                    }
                    this.M0.D0().addAll(0, arrayList);
                    this.M0.M(0, arrayList.size());
                    if (A == 70) {
                        int size = arrayList.size();
                        this.M0.D0().get(size).f0(8);
                        this.M0.I(size);
                    }
                } else {
                    return;
                }
            } else {
                boolean z11 = this.H0 != null;
                this.M0.R1(0, z11 ? 3 : 4);
                int size2 = this.M0.D0().size();
                this.M0.D0().addAll(Arrays.asList(new ra(2), new ra(4, R.id.btn_showAdvanced, 0, R.string.SystemNotificationSettings), new ra(3)));
                this.M0.M(size2, 3);
                if (z11) {
                    this.M0.D0().get(0).f0(70);
                    this.M0.I(0);
                }
            }
            this.V0 = Ji;
            if (Ji) {
                ((LinearLayoutManager) kg().getLayoutManager()).z2(0, 0);
            } else {
                gg();
            }
        } else if (!Ji) {
        } else {
            if (this.K0 != null || this.L0 != null) {
                int G02 = this.f24495b.ka().G0();
                ra raVar2 = this.K0;
                if (raVar2 != null && raVar2.Z(Ii(G02))) {
                    this.M0.n3(this.K0);
                }
                ra raVar3 = this.L0;
                if (raVar3 != null) {
                    boolean Y = raVar3.Y(hi(G02));
                    if (!this.L0.K(gi(G02)) && !Y) {
                        z10 = false;
                    }
                    if (z10) {
                        this.M0.n3(this.L0);
                    }
                }
            }
        }
    }

    public final void Yi() {
        HashMap<String, Ringtone> hashMap = this.f8001a1;
        if (hashMap != null) {
            for (Ringtone ringtone : hashMap.values()) {
                try {
                    ringtone.stop();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        Yi();
        this.f24495b.O9().x0(this);
        this.f24495b.tc().c0(this);
        if (qi()) {
            this.f24495b.O9().V(this);
        }
    }

    public final void Zh() {
        boolean Ki;
        if (this.T0) {
            this.M0.p3(R.id.btn_notifications_priorityOrImportance);
        } else if (this.P0 == 0 && this.S0 != null && this.T0 != (Ki = Ki())) {
            wg();
            if (Ki) {
                int L0 = this.M0.L0(R.id.btn_notifications_led);
                if (L0 != -1) {
                    int i10 = L0 + 1;
                    this.M0.D0().add(i10, new ra(11));
                    this.M0.D0().add(L0 + 2, Ni());
                    this.M0.M(i10, 2);
                } else {
                    return;
                }
            } else {
                int L02 = this.M0.L0(R.id.btn_notifications_priorityOrImportance);
                if (L02 != -1) {
                    this.M0.R1(L02, 2);
                } else {
                    return;
                }
            }
            this.T0 = Ki;
            gg();
        }
    }

    public final boolean Zi(int i10, int i11, boolean z10) {
        if (z10) {
            int L0 = this.M0.L0(Oi(i10));
            int L02 = this.M0.L0(Oi(i11));
            if (L0 != L02) {
                iq iqVar = this.M0;
                iqVar.I1(null, iqVar.D0().get(L02), true);
            }
        }
        if (i10 == i11 || i11 == -1) {
            return false;
        }
        int i12 = 16;
        if (i11 == 0) {
            he.i c22 = he.i.c2();
            if (i10 != 2) {
                i12 = 8;
            }
            c22.n5(i12, false);
        } else if (i11 == 1) {
            he.i.c2().n5(8, true);
        } else if (i11 == 2) {
            he.i.c2().n5(16, true);
        }
        aj(false);
        boolean z11 = i10 == 2;
        boolean z12 = i11 == 2;
        if (z11 != z12) {
            int F0 = this.M0.F0(this.H0);
            if (F0 != -1) {
                if (z12) {
                    List<ra> di = di();
                    int i13 = F0 + 1;
                    this.M0.D0().addAll(i13, di);
                    this.M0.M(i13, di.size());
                } else {
                    List<w6> list = this.W0;
                    if (list != null) {
                        iq iqVar2 = this.M0;
                        int i14 = F0 + 1;
                        int size = list.size();
                        int i15 = this.X0;
                        iqVar2.R1(i14, (((size - i15) + (i15 > 0 ? 1 : 0)) * 2) + 1);
                        this.W0 = null;
                        this.X0 = 0;
                    }
                }
                this.M0.T1();
            } else {
                throw new IllegalStateException();
            }
        }
        return true;
    }

    public final void ai() {
        TdApi.NotificationSettingsScope notificationSettingsScope = this.S0;
        if (notificationSettingsScope != null) {
            int i10 = this.f24495b.kb(notificationSettingsScope) == 0 ? this.f24495b.ka().C(this.S0) ? R.string.NotificationsSettingBlocked : R.string.NotificationsSettingOn : R.string.NotificationsSettingOff;
            ra raVar = this.I0;
            if (raVar != null && raVar.Y(i10)) {
                this.M0.n3(this.I0);
            }
            int L0 = this.M0.L0(R.id.btn_notifications_snooze);
            if (L0 != -1) {
                if (this.M0.D0().get(L0).f0(ni())) {
                    this.M0.I(L0);
                    return;
                }
            }
            this.M0.p3(R.id.btn_notifications_snooze);
        }
    }

    public final void aj(boolean z10) {
        boolean z11;
        int F0;
        if (this.H0 != null) {
            int ii = ii();
            if (ii == 0) {
                z11 = this.H0.Y(R.string.NotificationsModeAllHint);
            } else if (ii == 1) {
                z11 = this.H0.Z(w.m1(R.string.NotificationsModeActiveHint, this.f24495b.E1()));
            } else if (ii == 2) {
                z11 = this.H0.Z(w.q2(R.string.NotificationsModeSelectedHint, this.f24495b.F4().I0()));
            } else {
                throw new IllegalArgumentException(Integer.toString(ii));
            }
            if (z11 && (F0 = this.M0.F0(this.H0)) != -1) {
                if (z10) {
                    this.M0.r3(F0);
                } else {
                    this.M0.I(F0);
                }
            }
        }
    }

    public final void bi() {
        int i10;
        int i11;
        int i12;
        boolean Li = Li();
        if (this.U0 != Li) {
            if (this.P0 != 0) {
                i12 = R.id.btn_customChat_priorityOrImportance;
                i11 = R.id.btn_customChat_vibrate;
                i10 = R.id.btn_customChat_sound;
            } else {
                i12 = R.id.btn_notifications_led;
                i11 = R.id.btn_notifications_vibrate;
                i10 = R.id.btn_notifications_sound;
            }
            wg();
            if (Li) {
                int L0 = this.M0.L0(i12);
                if (L0 != -1) {
                    this.M0.D0().add(L0, new ra(5, i11, 0, R.string.Vibrate));
                    this.M0.D0().add(L0 + 1, new ra(11));
                    this.M0.D0().add(L0 + 2, new ra(5, i10, 0, R.string.Sound));
                    this.M0.D0().add(L0 + 3, new ra(11));
                    this.M0.M(L0, 4);
                } else {
                    return;
                }
            } else {
                int L02 = this.M0.L0(i11);
                if (L02 != -1) {
                    this.M0.R1(L02, 4);
                } else {
                    return;
                }
            }
            this.U0 = Li;
            gg();
        }
    }

    public final List<ra> di() {
        this.W0 = fi();
        int i10 = 0;
        this.X0 = 0;
        ArrayList arrayList = new ArrayList((this.W0.size() * 2) + 1);
        for (w6 w6Var : this.W0) {
            if (arrayList.isEmpty()) {
                arrayList.add(new ra(2));
            } else {
                arrayList.add(new ra(11));
            }
            if (i10 < 1 || this.W0.size() - i10 <= 1 || (w6Var.l() && i10 < 3)) {
                arrayList.add(Mi(w6Var));
                i10++;
            } else {
                this.X0 = this.W0.size() - i10;
                arrayList.add(new ra(4, (int) R.id.btn_showMore, (int) R.drawable.baseline_direction_arrow_down_24, w.q2(w6Var.l() ? R.string.NotificationsModeSelectedMore : R.string.NotificationsModeSelectedMoreMuted, this.X0), false));
                arrayList.add(new ra(3));
                return arrayList;
            }
        }
        arrayList.add(new ra(3));
        return arrayList;
    }

    @Override
    public void e(String str, TdApi.LanguagePackInfo languagePackInfo) {
        rb.e(this, str, languagePackInfo);
    }

    public final ArrayList<j0> ei() {
        ArrayList<j0> arrayList = this.O0;
        if (arrayList == null || arrayList.isEmpty()) {
            this.O0 = ki(t(), 1, this.P0 != 0 ? this.f24495b.ka().S() : null);
        }
        return this.O0;
    }

    @Override
    public void f3(boolean z10) {
        xd(new Runnable() {
            @Override
            public final void run() {
                fw.this.Ci();
            }
        }, new rv(this));
    }

    public final List<w6> fi() {
        LinkedList<w6> V = this.f24495b.F4().V();
        Collections.sort(V, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int si;
                si = fw.this.si((w6) obj, (w6) obj2);
                return si;
            }
        });
        return V;
    }

    public final int gi(int i10) {
        return (i10 == 3 || i10 == 4) ? R.drawable.baseline_sync_problem_24 : i10 != 5 ? R.drawable.baseline_notification_important_24 : R.drawable.baseline_system_update_24;
    }

    @Override
    public void h3(j2 j2Var) {
        try {
            Vibrator vibrator = (Vibrator) ce.j0.q().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.cancel();
            }
        } catch (Throwable th) {
            Log.w("Cannot vibrate", th, new Object[0]);
        }
        Yi();
    }

    public final int hi(int i10) {
        return i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? R.string.SystemNotificationSettings : R.string.ShareNotificationError : R.string.InstallGooglePlayServices : R.string.TurnSyncOnApp : R.string.TurnSyncOnSystem;
    }

    public final int ii() {
        if (he.i.c2().F(8)) {
            return 1;
        }
        return he.i.c2().F(16) ? 2 : 0;
    }

    public final ArrayList<j0> ji() {
        ArrayList<j0> arrayList = this.N0;
        if (arrayList == null || arrayList.isEmpty()) {
            this.N0 = ki(t(), 2, this.P0 != 0 ? this.f24495b.ka().v0(this.f24495b.ka().j2(this.P0)) : null);
        }
        return this.N0;
    }

    @Override
    public void k4(boolean z10) {
        xd(new Runnable() {
            @Override
            public final void run() {
                fw.this.Fi();
            }
        }, new rv(this));
    }

    @Override
    public void l6(int i10, SparseIntArray sparseIntArray) {
        boolean z10;
        boolean z11 = true;
        switch (i10) {
            case R.id.btn_calls_vibrate:
            case R.id.btn_customChat_calls_vibrate:
            case R.id.btn_customChat_vibrate:
            case R.id.btn_notifications_vibrate:
                int i11 = 0;
                if (sparseIntArray.get(R.id.btn_vibrateOnlyIfSilent) != 0) {
                    sparseIntArray.delete(R.id.btn_vibrateOnlyIfSilent);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (sparseIntArray.size() == 1) {
                    int valueAt = sparseIntArray.valueAt(0);
                    if (valueAt == R.id.btn_disabled) {
                        i11 = 3;
                    } else if (valueAt == R.id.btn_long) {
                        i11 = 2;
                    } else if (valueAt == R.id.btn_short) {
                        i11 = 1;
                    }
                    switch (i10) {
                        case R.id.btn_calls_vibrate:
                            z11 = this.f24495b.ka().q2(i11, z10);
                            break;
                        case R.id.btn_customChat_calls_vibrate:
                            this.f24495b.ka().s2(this.Q0, i11, z10);
                            break;
                        case R.id.btn_customChat_vibrate:
                            this.f24495b.ka().w2(this.P0, i11, z10);
                            break;
                        case R.id.btn_notifications_vibrate:
                            z11 = this.f24495b.ka().D2(this.S0, i11, z10);
                            break;
                        default:
                            throw new IllegalStateException();
                    }
                    if (z11) {
                        this.M0.p3(i10);
                        Pi();
                        return;
                    }
                    return;
                }
                return;
            case R.id.btn_customChat_priorityOrImportance:
            case R.id.btn_notifications_priorityOrImportance:
                int i12 = sparseIntArray.get(i10);
                if (i12 != 0) {
                    int ci = ci(i12);
                    if (i10 == R.id.btn_customChat_priorityOrImportance) {
                        int u02 = this.f24495b.ka().u0(this.f24495b.ka().j2(this.P0));
                        jb ka2 = this.f24495b.ka();
                        long j10 = this.P0;
                        if (ci == u02) {
                            ci = -100;
                        }
                        ka2.u2(j10, ci);
                    } else if (i10 == R.id.btn_notifications_priorityOrImportance) {
                        z11 = this.f24495b.ka().A2(this.S0, ci);
                    } else {
                        throw new IllegalStateException();
                    }
                    if (z11) {
                        this.M0.p3(i10);
                        Pi();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final TdApi.NotificationSettingsScope li(ra raVar) {
        return (raVar == null || !(raVar.d() instanceof TdApi.NotificationSettingsScope)) ? this.S0 : (TdApi.NotificationSettingsScope) raVar.d();
    }

    public final TdApi.NotificationSettingsScope mi(ra raVar, TdApi.NotificationSettingsScope notificationSettingsScope) {
        TdApi.NotificationSettingsScope li = li(raVar);
        return li != null ? li : notificationSettingsScope;
    }

    public final int ni() {
        int kb2 = this.f24495b.kb(this.S0);
        return (kb2 != 0 && !t2.n3(kb2)) || (kb2 == 0 && this.f24495b.ka().C(this.S0)) ? 92 : 7;
    }

    @Override
    public void o6() {
        super.o6();
        if (Build.VERSION.SDK_INT >= 26 && this.M0 != null) {
            Hi();
        }
    }

    public final void oi(final long j10, final boolean z10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                fw.this.vi(j10, z10);
            }
        });
    }

    @Override
    public void onClick(android.view.View r41) {
        throw new UnsupportedOperationException("Method not decompiled: de.fw.onClick(android.view.View):void");
    }

    @Override
    public boolean onLongClick(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar == null || view.getId() != R.id.btn_notifications_snooze || this.S0 != null) {
            return false;
        }
        this.f24495b.hd().I8(this, li(raVar), true);
        return true;
    }

    @Override
    public boolean pg() {
        return true;
    }

    public final void pi(final TdApi.NotificationSettingsScope notificationSettingsScope, final boolean z10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                fw.this.ui(notificationSettingsScope, z10);
            }
        });
    }

    @Override
    public void q7(boolean z10) {
        rb.f(this, z10);
    }

    public final boolean qi() {
        return this.S0 == null && this.P0 == 0;
    }

    @Override
    public void rg(android.content.Context r30, org.thunderdog.challegram.v.CustomRecyclerView r31) {
        throw new UnsupportedOperationException("Method not decompiled: de.fw.rg(android.content.Context, org.thunderdog.challegram.v.CustomRecyclerView):void");
    }

    @Override
    public void sc() {
        super.sc();
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (!this.Y0 || this.M0 == null) {
            this.Y0 = true;
        } else {
            Hi();
        }
    }

    @Override
    public boolean sd(Bundle bundle, String str) {
        super.sd(bundle, str);
        Ti(bundle.getLong(str + "chat_id", 0L));
        Vi(bundle.getInt(str + "scope", 0));
        return true;
    }

    @Override
    public void tg() {
        jb.c cVar = new jb.c(1);
        u0 u0Var = new u0(1);
        cVar.a(R.id.btn_resetNotifications);
        u0Var.a(R.string.ResetNotifications);
        Yd(cVar.e(), u0Var.d(), 0);
    }

    @Override
    public void u(int i10, int i11, Intent intent) {
        String str;
        String str2;
        int i12;
        String str3;
        if (i11 != -1) {
            return;
        }
        if (i10 == 107 || i10 == 108) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            String str4 = null;
            if (uri == null) {
                str2 = "";
                str = null;
            } else {
                String O0 = v0.O0(uri, null);
                if (this.P0 != 0) {
                    str3 = null;
                } else if (i10 == 107) {
                    str3 = this.f24495b.A6() + "_ringtone.ogg";
                } else {
                    int constructor = this.S0.getConstructor();
                    if (constructor == 548013448) {
                        str3 = this.f24495b.A6() + "_channel.ogg";
                    } else if (constructor == 937446759) {
                        str3 = this.f24495b.A6() + "_private.ogg";
                    } else if (constructor == 1212142067) {
                        str3 = this.f24495b.A6() + "_group.ogg";
                    } else {
                        throw new UnsupportedOperationException(this.S0.toString());
                    }
                }
                Uri Q = jb.Q(uri, true, str3);
                String uri2 = Q != null ? Q.toString() : null;
                if (O0 == null && Q != null) {
                    O0 = Q.getLastPathSegment();
                } else if (i.i(uri2)) {
                    str = null;
                    str2 = uri2;
                }
                str = O0;
                str2 = uri2;
            }
            if (i10 == 107) {
                i12 = this.P0 != 0 ? R.id.btn_customChat_calls_ringtone : R.id.btn_calls_ringtone;
            } else if (i10 == 108) {
                i12 = this.P0 != 0 ? R.id.btn_customChat_sound : R.id.btn_notifications_sound;
            } else {
                throw new RuntimeException();
            }
            if (!i.i(str2) && uri != null && !uri.toString().equals(str2)) {
                str4 = uri.toString();
            }
            Ui(i12, str2, str, str4);
        }
    }

    @Override
    public void w(j2 j2Var) {
        k2.a(this, j2Var);
    }

    @Override
    public void x1(long j10) {
        oi(j10, true);
    }

    @Override
    public void x2(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        pi(notificationSettingsScope, false);
    }

    @Override
    public boolean yd(Bundle bundle, String str) {
        super.yd(bundle, str);
        bundle.putLong(str + "chat_id", this.P0);
        String str2 = str + "scope";
        TdApi.NotificationSettingsScope notificationSettingsScope = this.S0;
        bundle.putInt(str2, notificationSettingsScope != null ? notificationSettingsScope.getConstructor() : 0);
        return true;
    }

    @Override
    public void z0() {
        xd(new Runnable() {
            @Override
            public final void run() {
                fw.this.Di();
            }
        }, new rv(this));
    }

    public static class b {
        public final long f8003a;
        public final TdApi.NotificationSettingsScope f8004b;

        public b(long j10) {
            this.f8003a = j10;
            this.f8004b = null;
        }

        public b(TdApi.NotificationSettingsScope notificationSettingsScope) {
            this.f8004b = notificationSettingsScope;
            this.f8003a = 0L;
        }
    }
}
