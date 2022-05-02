package p038ce;

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
import be.C1379j0;
import gd.C4779t2;
import ge.C4868i;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.C6924j2;
import me.C6941k2;
import me.C6985o2;
import me.View$OnClickListenerC6999q1;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p110hd.C5078d;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5122j0;
import p111he.C5136p0;
import p111he.C5146u0;
import p124ib.C5320c;
import p143k0.C6038h;
import p193nb.C7316a;
import p350yd.AbstractC10817l1;
import p350yd.AbstractC11041ub;
import p350yd.C10536ab;
import p350yd.C10733ic;
import p350yd.C10827lb;
import p350yd.C10930q6;
import p350yd.C11020tb;
import p350yd.C11131y6;
import tc.C9137c;
import td.AbstractC9142a;
import td.AbstractC9213j1;
import td.AbstractC9323v4;

public class View$OnClickListenerC2359ew extends AbstractC3204vo<C2361b> implements View.OnClickListener, View.OnLongClickListener, AbstractC9323v4.AbstractC9343r, AbstractC9323v4.AbstractC9344s, AbstractC10817l1, AbstractC11041ub, AbstractC9142a, C6924j2.AbstractC6930f, AbstractC9213j1, C10733ic.AbstractC10737d {
    public C2964ra f8072D0;
    public C2964ra f8073E0;
    public C2964ra f8074F0;
    public C2964ra f8075G0;
    public C2964ra f8076H0;
    public C2964ra f8077I0;
    public C2964ra f8078J0;
    public C2964ra f8079K0;
    public C2964ra f8080L0;
    public C2546iq f8081M0;
    public ArrayList<C5122j0> f8082N0;
    public ArrayList<C5122j0> f8083O0;
    public long f8084P0;
    public long f8085Q0;
    public boolean f8086R0;
    public TdApi.NotificationSettingsScope f8087S0;
    public boolean f8088T0;
    public boolean f8089U0;
    public boolean f8090V0;
    public List<C11131y6> f8091W0;
    public int f8092X0;
    public boolean f8093Y0;
    public long f8094Z0;
    public HashMap<String, Ringtone> f8095a1;

    public class C2360a extends C2546iq {
        public C2360a(AbstractC9323v4 v4Var) {
            super(v4Var);
            View$OnClickListenerC2359ew.this = r1;
        }

        @Override
        public void mo394V2(p038ce.C2964ra r12, tc.C9137c r13, boolean r14) {
            throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC2359ew.C2360a.mo394V2(ce.ra, tc.c, boolean):void");
        }
    }

    public View$OnClickListenerC2359ew(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static void m35004Ai(int i, View view, int i2, C2964ra raVar, TextView textView, C2546iq iqVar) {
        int j = raVar.m32835j();
        if (j == R.id.btn_long) {
            try {
                Vibrator vibrator = (Vibrator) C1379j0.m37309q().getSystemService("vibrator");
                if (vibrator != null) {
                    if (m34892ri(i)) {
                        vibrator.vibrate(C10827lb.f34666t0, 0);
                    } else {
                        vibrator.vibrate(C10827lb.f34664r0, -1);
                    }
                }
            } catch (Throwable th) {
                Log.m14710w("Cannot vibrate", th, new Object[0]);
            }
        } else if (j == R.id.btn_short) {
            try {
                Vibrator vibrator2 = (Vibrator) C1379j0.m37309q().getSystemService("vibrator");
                if (vibrator2 != null) {
                    if (m34892ri(i)) {
                        vibrator2.vibrate(C10827lb.f34665s0, 0);
                    } else {
                        vibrator2.vibrate(C10827lb.f34663q0, -1);
                    }
                }
            } catch (Throwable th2) {
                Log.m14710w("Cannot vibrate", th2, new Object[0]);
            }
        }
    }

    public void m35001Bi(ArrayList arrayList, View view, int i, C2964ra raVar, TextView textView, C2546iq iqVar) {
        String v = raVar.m32823v();
        if (v != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5122j0 j0Var = (C5122j0) it.next();
                if (v.equals(j0Var.m23884b().toString())) {
                    m34956Qi(j0Var);
                    return;
                }
            }
        }
    }

    public void m34998Ci() {
        this.f8081M0.m34130s3(R.id.btn_events_contactJoined);
    }

    public void m34995Di() {
        this.f8081M0.m34130s3(R.id.btn_archiveMuteNonContacts);
    }

    public void m34992Ei() {
        if (!m9347Sa()) {
            m34933Yh();
        }
    }

    public void m34989Fi() {
        this.f8081M0.m34130s3(R.id.btn_events_sentScheduled);
    }

    public boolean m34986Gi(View view, int i) {
        if (i != R.id.btn_resetNotifications) {
            return true;
        }
        m34953Ri();
        return true;
    }

    public static C2964ra m34965Ni() {
        return new C2964ra(5, R.id.btn_notifications_priorityOrImportance, 0, Build.VERSION.SDK_INT >= 26 ? R.string.NotificationImportance : R.string.NotificationsPriority);
    }

    public static int m34962Oi(int i) {
        if (i == 0) {
            return R.id.btn_notificationMode_all;
        }
        if (i == 1) {
            return R.id.btn_notificationMode_active;
        }
        if (i == 2) {
            return R.id.btn_notificationMode_selected;
        }
        throw new IllegalArgumentException(Integer.toString(i));
    }

    public static int m34922ci(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            switch (i) {
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
            switch (i) {
                case R.id.btn_priorityHigh:
                    return 1;
                case R.id.btn_priorityLow:
                    return -1;
                case R.id.btn_priorityMax:
                    return 2;
            }
        }
        throw new IllegalArgumentException("id == " + C4403w.m27885e1(i));
    }

    public static ArrayList<C5122j0> m34906ki(Context context, int i, String str) {
        boolean z;
        ArrayList<C5122j0> arrayList = new ArrayList<>();
        Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(context, i);
        boolean z2 = false;
        Cursor cursor = null;
        try {
            RingtoneManager ringtoneManager = new RingtoneManager(context);
            ringtoneManager.setType(i);
            cursor = ringtoneManager.getCursor();
            arrayList.ensureCapacity(cursor.getCount());
            while (cursor.moveToNext()) {
                int i2 = cursor.getInt(0);
                String string = cursor.getString(1);
                Uri ringtoneUri = ringtoneManager.getRingtoneUri(cursor.getPosition());
                if (!(string == null || string.isEmpty() || ringtoneUri == null)) {
                    if (str != null) {
                        z = str.equals(ringtoneUri.toString());
                    } else {
                        z = actualDefaultRingtoneUri != null && actualDefaultRingtoneUri.equals(ringtoneUri);
                    }
                    arrayList.add(new C5122j0(i2, string, ringtoneUri, z));
                }
            }
        } catch (Throwable th) {
            Log.m14723e(th);
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, C2312dw.f7967a);
            String i1 = C4403w.m27869i1(i == 1 ? R.string.RingtoneDisabled : R.string.SoundDisabled);
            Uri uri = Uri.EMPTY;
            if (str != null && str.isEmpty()) {
                z2 = true;
            }
            arrayList.add(1, new C5122j0(-1, i1, uri, z2));
        }
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static boolean m34892ri(int i) {
        return i == R.id.btn_calls_ringtone || i == R.id.btn_calls_vibrate || i == R.id.btn_customChat_calls_ringtone || i == R.id.btn_customChat_calls_vibrate;
    }

    public int m34890si(C11131y6 y6Var, C11131y6 y6Var2) {
        int x2 = this.f30167b.m2930B4().m4632x2();
        int i = y6Var.f35705b;
        boolean z = true;
        boolean z2 = i == x2;
        int i2 = y6Var2.f35705b;
        if (z2 != (i2 == x2)) {
            boolean z3 = i2 == x2;
            if (i != x2) {
                z = false;
            }
            return Boolean.compare(z3, z);
        } else if (y6Var.m1464l() != y6Var2.m1464l()) {
            return Boolean.compare(y6Var2.m1464l(), y6Var.m1464l());
        } else {
            return 0;
        }
    }

    public static int m34888ti(C5122j0 j0Var, C5122j0 j0Var2) {
        boolean c = j0Var.m23883c();
        boolean c2 = j0Var2.m23883c();
        if (!c || c2) {
            return (c || !c2) ? 0 : 1;
        }
        return -1;
    }

    public void m34886ui(TdApi.NotificationSettingsScope notificationSettingsScope, boolean z) {
        if (!m9347Sa()) {
            TdApi.NotificationSettingsScope notificationSettingsScope2 = this.f8087S0;
            if (notificationSettingsScope2 == null) {
                notificationSettingsScope2 = this.f8084P0 != 0 ? this.f30167b.m2440ga().m3117j2(this.f8084P0) : null;
            }
            if (notificationSettingsScope2 == null) {
                this.f8081M0.m34186b3(R.id.btn_notifications_snooze);
            } else if (notificationSettingsScope2.getConstructor() == notificationSettingsScope.getConstructor()) {
                long j = this.f8084P0;
                if (j != 0) {
                    m34898oi(j, z);
                    return;
                }
                m34927ai();
                if (z) {
                    m34983Hi();
                    return;
                }
                this.f8081M0.m34130s3(R.id.btn_notifications_preview);
                m34936Xh(this.f30167b.m2440ga().m3185P(notificationSettingsScope), R.id.btn_notifications_preview, R.id.btn_notifications_contentPreview);
            }
        }
    }

    public void m34884vi(long j, boolean z) {
        if (!m9347Sa() && j != 0 && this.f8084P0 == j) {
            if (z) {
                m34983Hi();
            } else {
                this.f8081M0.m34130s3(R.id.btn_customChat_preview);
            }
        }
    }

    public void m34882wi(View$OnClickListenerC6999q1 q1Var, DialogInterface dialogInterface, int i) {
        C5136p0 p0Var = (C5136p0) q1Var.getCurrentItem();
        if (p0Var != null && this.f30167b.m2440ga().m3217G2((int) p0Var.m23838a())) {
            this.f8081M0.m34130s3(R.id.btn_repeatNotifications);
        }
    }

    public static boolean m34880xi(C11131y6 y6Var, C11131y6 y6Var2) {
        return y6Var2.f35705b == y6Var.f35705b;
    }

    public static void m34878yi(C2964ra raVar, C9137c cVar, boolean z) {
        ((C6985o2) cVar.getChildAt(0)).setApplyColor(true);
    }

    public void m34876zi(boolean z, int i, C2964ra raVar, int i2, int i3, SparseIntArray sparseIntArray) {
        int i4;
        int i5 = sparseIntArray.get(i3);
        int i6 = 0;
        if (i5 != R.id.btn_ledDisabled) {
            int[] iArr = C10827lb.f34669w0;
            int length = iArr.length;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 >= length) {
                    i4 = 0;
                    i8 = -1;
                    break;
                } else if (iArr[i7] == i5) {
                    i4 = C10827lb.f34667u0[i8];
                    break;
                } else {
                    i8++;
                    i7++;
                }
            }
            if (i8 == -1) {
                throw new RuntimeException();
            }
        } else {
            i4 = 0;
        }
        if (z) {
            C10827lb ga2 = this.f30167b.m2440ga();
            long j = this.f8084P0;
            if (i4 != i) {
                i6 = i4;
            }
            ga2.m3077t2(j, i6);
        } else {
            this.f30167b.m2440ga().m3053z2(m34904li(raVar), i4);
        }
        this.f8081M0.m34130s3(i2);
        m34959Pi();
    }

    @Override
    public void mo3249D2(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        m34896pi(notificationSettingsScope, false);
    }

    @Override
    public void mo3248E5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        m34896pi(notificationSettingsScope, true);
    }

    @Override
    public void mo1779G0(boolean z) {
        C11020tb.m1988a(this, z);
    }

    @TargetApi(26)
    public final void m34983Hi() {
        this.f8081M0.m34193Z2();
        m34959Pi();
    }

    public final CharSequence m34980Ii(int i) {
        int i2;
        TdApi.Chat N3;
        switch (i) {
            case 1:
                i2 = R.string.NotificationsGuideBlockedCategory;
                break;
            case 2:
                if (Build.VERSION.SDK_INT >= 28) {
                    i2 = R.string.NotificationsGuideBlockedAll;
                    break;
                }
                i2 = R.string.NotificationsGuideBlockedApp;
                break;
            case 3:
                i2 = R.string.NotificationsGuideSyncGlobalOff;
                break;
            case 4:
                i2 = R.string.NotificationsGuideSyncAppOff;
                break;
            case 5:
                i2 = R.string.NotificationsGuideFirebaseUnavailable;
                break;
            case 6:
                long v = this.f30167b.m2294pc().m4091v();
                if (v == 0 || (N3 = this.f30167b.m2739N3(v)) == null) {
                    i2 = R.string.NotificationsGuideError;
                    break;
                } else {
                    return C4403w.m27986G0(this, R.string.NotificationsGuideErrorChat, C4403w.m27843p(), this.f30167b.m2661S3(N3));
                }
                break;
            default:
                i2 = R.string.NotificationsGuideBlockedApp;
                break;
        }
        CharSequence H0 = C4403w.m27982H0(this, i2, new Object[0]);
        if (i2 != R.string.NotificationsGuideBlockedCategory) {
            return H0;
        }
        String E1 = this.f30167b.m2885E1();
        if (H0 instanceof String) {
            return C4403w.m27853m1(i2, E1);
        }
        if (H0 instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) H0;
            int g = C5070i.m24063g(H0, "%1$s", 0);
            if (g != -1) {
                spannableStringBuilder.replace(g, g + 4, (CharSequence) E1);
                spannableStringBuilder.setSpan(C4403w.m27889d2(RunnableC5390g.m22983M0(E1)), g, E1.length() + g, 33);
                return spannableStringBuilder;
            }
        }
        return C4403w.m27869i1(R.string.NotificationsGuideBlockedApp);
    }

    public final boolean m34977Ji() {
        return Build.VERSION.SDK_INT >= 19 && this.f8084P0 == 0 && this.f8087S0 == null && this.f30167b.m2440ga().m3232D();
    }

    @Override
    public void mo9089K2(int i, C6038h<String> hVar) {
        switch (i) {
            case R.id.btn_calls_ringtone:
            case R.id.btn_customChat_calls_ringtone:
            case R.id.btn_customChat_sound:
            case R.id.btn_notifications_sound:
                if (hVar.m21463n() == 1) {
                    ArrayList<C5122j0> ei = m34892ri(i) ? m34918ei() : m34908ji();
                    String o = hVar.m21462o(0);
                    Iterator<C5122j0> it = ei.iterator();
                    while (it.hasNext()) {
                        C5122j0 next = it.next();
                        if (o.equals(next.m23884b().toString())) {
                            boolean c = next.m23883c();
                            m34944Ui(i, c ? null : next.m23884b().toString(), c ? null : next.m23885a(), null);
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

    public final boolean m34974Ki() {
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        TdApi.NotificationSettingsScope notificationSettingsScope = this.f8087S0;
        return notificationSettingsScope != null ? (notificationSettingsScope.getConstructor() == 937446759 && this.f30167b.m2440ga().m3075u0(this.f8087S0) == C10827lb.f34662p0) ? false : true : this.f8084P0 != 0;
    }

    public final boolean m34971Li() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f8084P0 != 0 ? this.f30167b.m2440ga().m3239B0(this.f8084P0) >= 3 : this.f8087S0 != null && this.f30167b.m2440ga().m3075u0(this.f8087S0) >= 3;
        }
        return true;
    }

    public final C2964ra m34968Mi(C11131y6 y6Var) {
        CharSequence I = C5078d.m23986z().m24024I(y6Var.m1456t());
        int i = y6Var.f35705b;
        int i2 = i + 1;
        if (i == this.f30167b.m2188w6()) {
            I = C4403w.m27862k0(R.string.CurrentAccount, I);
        }
        return new C2964ra(69, i2, 0, I, y6Var.f35705b + 1, y6Var.m1464l()).m32870G(y6Var).m32862O(y6Var.m1458r());
    }

    @Override
    public void mo8864N0(int i) {
        if (i == R.id.btn_resetNotifications) {
            m34935Xi();
        }
    }

    public final void m34959Pi() {
        if (Build.VERSION.SDK_INT >= 26) {
            if (this.f8084P0 != 0) {
                boolean R0 = this.f30167b.m2440ga().m3178R0(this.f8084P0);
                if (R0 != this.f8086R0) {
                    this.f8086R0 = R0;
                    if (R0) {
                        int N0 = this.f8081M0.m34224N0(C7316a.m17051j(this.f8084P0) ? R.id.btn_customChat_led : R.id.btn_customChat_preview);
                        if (N0 != -1) {
                            int i = N0 + 1;
                            this.f8081M0.m34240F0().add(i, new C2964ra(11));
                            this.f8081M0.m34240F0().add(N0 + 2, new C2964ra(4, R.id.btn_customChat_channel, 0, R.string.NotificationChannelMore));
                            this.f8081M0.m39308M(i, 2);
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int N02 = this.f8081M0.m34224N0(R.id.btn_customChat_channel);
                        if (N02 != -1) {
                            this.f8081M0.m34204V1(N02 - 1, 2);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
            } else {
                m34930Zh();
            }
            m34924bi();
            m34933Yh();
            m34927ai();
        }
    }

    @Override
    public void mo1778Q2(TdApi.SuggestedAction[] suggestedActionArr, TdApi.SuggestedAction[] suggestedActionArr2) {
        C11020tb.m1985d(this, suggestedActionArr, suggestedActionArr2);
    }

    public final void m34956Qi(C5122j0 j0Var) {
        if (!j0Var.m23884b().equals(Uri.EMPTY) && System.currentTimeMillis() - this.f8094Z0 > 100) {
            this.f8094Z0 = System.currentTimeMillis();
            Ringtone ringtone = null;
            HashMap<String, Ringtone> hashMap = this.f8095a1;
            if (hashMap == null) {
                this.f8095a1 = new HashMap<>();
            } else {
                ringtone = hashMap.get(j0Var.m23884b().toString());
            }
            try {
                if (ringtone == null) {
                    ringtone = RingtoneManager.getRingtone(mo4347s(), j0Var.m23884b());
                    if (ringtone != null) {
                        this.f8095a1.put(j0Var.m23884b().toString(), ringtone);
                    }
                } else {
                    ringtone.stop();
                }
                m34932Yi();
            } catch (Throwable th) {
                Log.m14708w(th);
            }
            if (ringtone != null) {
                try {
                    ringtone.play();
                } catch (Throwable th2) {
                    Log.m14708w(th2);
                }
            }
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_notificationSettings;
    }

    public final void m34953Ri() {
        int ii;
        this.f30167b.m2440ga().m3128g2(false);
        this.f30167b.m2699Pb(false);
        this.f30167b.m2270r4().m14783o(new TdApi.ResetAllNotificationSettings(), this.f30167b.m2392ja());
        int ii2 = m34910ii();
        if (C4868i.m24726c2().m24790T3() && ii2 != (ii = m34910ii()) && m34929Zi(ii2, ii, true)) {
            C10536ab.m4667o1().m4666o2();
        }
        this.f8081M0.m34193Z2();
    }

    public void m34950Si(C2361b bVar) {
        super.m9476Ad(bVar);
        m34947Ti(bVar.f8097a);
        m34938Wi(bVar.f8098b);
    }

    public final void m34947Ti(long j) {
        TdApi.User v2;
        this.f8084P0 = j;
        long j2 = 0;
        if (j != 0 && C7316a.m17049l(j)) {
            long d4 = this.f30167b.m2494d4(j);
            if (!(d4 == 0 || (v2 = this.f30167b.m2480e2().m1583v2(d4)) == null || v2.type.getConstructor() != -598644325)) {
                j2 = C7316a.m17058c(d4);
            }
        }
        this.f8085Q0 = j2;
    }

    public final void m34944Ui(int i, String str, String str2, String str3) {
        boolean z = true;
        switch (i) {
            case R.id.btn_calls_ringtone:
                z = this.f30167b.m2440ga().m3093p2(str, str2, str3);
                break;
            case R.id.btn_customChat_calls_ringtone:
                this.f30167b.m2440ga().m3085r2(this.f8085Q0, str, str2, str3);
                break;
            case R.id.btn_customChat_sound:
                this.f30167b.m2440ga().m3069v2(this.f8084P0, str, str2, str3);
                break;
            case R.id.btn_notifications_sound:
                z = this.f30167b.m2440ga().m3233C2(this.f8087S0, str, str2, str3);
                break;
            default:
                throw new IllegalStateException("Stub");
        }
        if (z) {
            this.f8081M0.m34130s3(i);
            m34959Pi();
        }
    }

    public final void m34941Vi(int i) {
        if (i == 0) {
            m34938Wi(null);
        } else if (i == 548013448) {
            m34938Wi(new TdApi.NotificationSettingsScopeChannelChats());
        } else if (i == 937446759) {
            m34938Wi(new TdApi.NotificationSettingsScopePrivateChats());
        } else if (i == 1212142067) {
            m34938Wi(new TdApi.NotificationSettingsScopeGroupChats());
        } else {
            throw new UnsupportedOperationException("constructor == " + i);
        }
    }

    @Override
    public int mo418W9() {
        if (m34894qi()) {
            return R.id.menu_more;
        }
        return 0;
    }

    public final void m34938Wi(TdApi.NotificationSettingsScope notificationSettingsScope) {
        this.f8087S0 = notificationSettingsScope;
    }

    @Override
    public CharSequence mo9313X9() {
        if (this.f8084P0 != 0) {
            return C4403w.m27869i1(R.string.CustomNotifications);
        }
        TdApi.NotificationSettingsScope notificationSettingsScope = this.f8087S0;
        if (notificationSettingsScope != null) {
            int constructor = notificationSettingsScope.getConstructor();
            if (constructor == 548013448) {
                return C4403w.m27869i1(R.string.Channels);
            }
            if (constructor == 937446759) {
                return C4403w.m27869i1(R.string.PrivateChats);
            }
            if (constructor == 1212142067) {
                return C4403w.m27869i1(R.string.Groups);
            }
        }
        return C4403w.m27869i1(R.string.Notifications);
    }

    public final void m34936Xh(boolean z, int i, int i2) {
        int N0;
        int N02 = this.f8081M0.m34224N0(i2);
        if (z) {
            if (N02 == -1 && (N0 = this.f8081M0.m34224N0(i)) != -1) {
                int i3 = N0 + 1;
                this.f8081M0.m34240F0().add(i3, new C2964ra(11));
                this.f8081M0.m34240F0().add(N0 + 2, new C2964ra(7, i2, 0, R.string.MessageContentPreview));
                this.f8081M0.m39308M(i3, 2);
            }
        } else if (N02 != -1) {
            this.f8081M0.m34204V1(N02 - 1, 2);
        }
    }

    public final void m34935Xi() {
        m9261ee(C4403w.m27869i1(R.string.ResetNotificationsConfirm), new int[]{R.id.btn_resetNotifications, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.ResetNotifications), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Gi;
                Gi = View$OnClickListenerC2359ew.this.m34986Gi(view, i);
                return Gi;
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

    public final void m34933Yh() {
        boolean Ji = m34977Ji();
        boolean z = true;
        if (this.f8090V0 != Ji) {
            m31293wg();
            if (Ji) {
                int N0 = this.f8081M0.m34224N0(R.id.btn_showAdvanced);
                if (N0 != -1) {
                    this.f8081M0.m34204V1(N0 - 1, 3);
                    int A = this.f8081M0.m34240F0().get(0).m32876A();
                    int G0 = this.f30167b.m2440ga().m3219G0();
                    ArrayList arrayList = new ArrayList();
                    C2964ra d0 = new C2964ra(4, R.id.btn_showAdvanced, m34914gi(G0), m34912hi(G0)).m32843d0(R.id.theme_color_textNegative);
                    this.f8080L0 = d0;
                    arrayList.add(d0);
                    arrayList.add(new C2964ra(3));
                    C2964ra raVar = new C2964ra(9, 0, 0, m34980Ii(G0), false);
                    this.f8079K0 = raVar;
                    arrayList.add(raVar);
                    if (A != 70) {
                        arrayList.add(new C2964ra(2));
                    }
                    this.f8081M0.m34240F0().addAll(0, arrayList);
                    this.f8081M0.m39308M(0, arrayList.size());
                    if (A == 70) {
                        int size = arrayList.size();
                        this.f8081M0.m34240F0().get(size).m32839f0(8);
                        this.f8081M0.m39312I(size);
                    }
                } else {
                    return;
                }
            } else {
                boolean z2 = this.f8076H0 != null;
                this.f8081M0.m34204V1(0, z2 ? 3 : 4);
                int size2 = this.f8081M0.m34240F0().size();
                this.f8081M0.m34240F0().addAll(Arrays.asList(new C2964ra(2), new C2964ra(4, R.id.btn_showAdvanced, 0, R.string.SystemNotificationSettings), new C2964ra(3)));
                this.f8081M0.m39308M(size2, 3);
                if (z2) {
                    this.f8081M0.m34240F0().get(0).m32839f0(70);
                    this.f8081M0.m39312I(0);
                }
            }
            this.f8090V0 = Ji;
            if (Ji) {
                ((LinearLayoutManager) m31303kg().getLayoutManager()).m39522z2(0, 0);
            } else {
                m31307gg();
            }
        } else if (!Ji) {
        } else {
            if (this.f8079K0 != null || this.f8080L0 != null) {
                int G02 = this.f30167b.m2440ga().m3219G0();
                C2964ra raVar2 = this.f8079K0;
                if (raVar2 != null && raVar2.m32851Z(m34980Ii(G02))) {
                    this.f8081M0.m34137q3(this.f8079K0);
                }
                C2964ra raVar3 = this.f8080L0;
                if (raVar3 != null) {
                    boolean Y = raVar3.m32852Y(m34912hi(G02));
                    if (!this.f8080L0.m32866K(m34914gi(G02)) && !Y) {
                        z = false;
                    }
                    if (z) {
                        this.f8081M0.m34137q3(this.f8080L0);
                    }
                }
            }
        }
    }

    public final void m34932Yi() {
        HashMap<String, Ringtone> hashMap = this.f8095a1;
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
    public void mo417Z8() {
        super.mo417Z8();
        m34932Yi();
        this.f30167b.m2781K9().m1790x0(this);
        this.f30167b.m2294pc().m4128c0(this);
        if (m34894qi()) {
            this.f30167b.m2781K9().m1898V(this);
        }
    }

    public final void m34930Zh() {
        boolean Ki;
        if (this.f8088T0) {
            this.f8081M0.m34130s3(R.id.btn_notifications_priorityOrImportance);
        } else if (this.f8084P0 == 0 && this.f8087S0 != null && this.f8088T0 != (Ki = m34974Ki())) {
            m31293wg();
            if (Ki) {
                int N0 = this.f8081M0.m34224N0(R.id.btn_notifications_led);
                if (N0 != -1) {
                    int i = N0 + 1;
                    this.f8081M0.m34240F0().add(i, new C2964ra(11));
                    this.f8081M0.m34240F0().add(N0 + 2, m34965Ni());
                    this.f8081M0.m39308M(i, 2);
                } else {
                    return;
                }
            } else {
                int N02 = this.f8081M0.m34224N0(R.id.btn_notifications_priorityOrImportance);
                if (N02 != -1) {
                    this.f8081M0.m34204V1(N02, 2);
                } else {
                    return;
                }
            }
            this.f8088T0 = Ki;
            m31307gg();
        }
    }

    public final boolean m34929Zi(int i, int i2, boolean z) {
        if (z) {
            int N0 = this.f8081M0.m34224N0(m34962Oi(i));
            int N02 = this.f8081M0.m34224N0(m34962Oi(i2));
            if (N0 != N02) {
                C2546iq iqVar = this.f8081M0;
                iqVar.m34220O1(null, iqVar.m34240F0().get(N02), true);
            }
        }
        if (i == i2 || i2 == -1) {
            return false;
        }
        int i3 = 16;
        if (i2 == 0) {
            C4868i c2 = C4868i.m24726c2();
            if (i != 2) {
                i3 = 8;
            }
            c2.m24635n5(i3, false);
        } else if (i2 == 1) {
            C4868i.m24726c2().m24635n5(8, true);
        } else if (i2 == 2) {
            C4868i.m24726c2().m24635n5(16, true);
        }
        m34926aj(false);
        boolean z2 = i == 2;
        boolean z3 = i2 == 2;
        if (z2 != z3) {
            int H0 = this.f8081M0.m34235H0(this.f8076H0);
            if (H0 != -1) {
                if (z3) {
                    List<C2964ra> di = m34920di();
                    int i4 = H0 + 1;
                    this.f8081M0.m34240F0().addAll(i4, di);
                    this.f8081M0.m39308M(i4, di.size());
                } else {
                    List<C11131y6> list = this.f8091W0;
                    if (list != null) {
                        C2546iq iqVar2 = this.f8081M0;
                        int i5 = H0 + 1;
                        int size = list.size();
                        int i6 = this.f8092X0;
                        iqVar2.m34204V1(i5, (((size - i6) + (i6 > 0 ? 1 : 0)) * 2) + 1);
                        this.f8091W0 = null;
                        this.f8092X0 = 0;
                    }
                }
                this.f8081M0.m34199X1();
            } else {
                throw new IllegalStateException();
            }
        }
        return true;
    }

    public final void m34927ai() {
        TdApi.NotificationSettingsScope notificationSettingsScope = this.f8087S0;
        if (notificationSettingsScope != null) {
            int i = this.f30167b.m2439gb(notificationSettingsScope) == 0 ? this.f30167b.m2440ga().m3236C(this.f8087S0) ? R.string.NotificationsSettingBlocked : R.string.NotificationsSettingOn : R.string.NotificationsSettingOff;
            C2964ra raVar = this.f8077I0;
            if (raVar != null && raVar.m32852Y(i)) {
                this.f8081M0.m34137q3(this.f8077I0);
            }
            int N0 = this.f8081M0.m34224N0(R.id.btn_notifications_snooze);
            if (N0 != -1) {
                if (this.f8081M0.m34240F0().get(N0).m32839f0(m34900ni())) {
                    this.f8081M0.m39312I(N0);
                    return;
                }
            }
            this.f8081M0.m34130s3(R.id.btn_notifications_snooze);
        }
    }

    public final void m34926aj(boolean z) {
        boolean z2;
        int H0;
        if (this.f8076H0 != null) {
            int ii = m34910ii();
            if (ii == 0) {
                z2 = this.f8076H0.m32852Y(R.string.NotificationsModeAllHint);
            } else if (ii == 1) {
                z2 = this.f8076H0.m32851Z(C4403w.m27853m1(R.string.NotificationsModeActiveHint, this.f30167b.m2885E1()));
            } else if (ii == 2) {
                z2 = this.f8076H0.m32851Z(C4403w.m27836q2(R.string.NotificationsModeSelectedHint, this.f30167b.m2930B4().m4792I0()));
            } else {
                throw new IllegalArgumentException(Integer.toString(ii));
            }
            if (z2 && (H0 = this.f8081M0.m34235H0(this.f8076H0)) != -1) {
                if (z) {
                    this.f8081M0.m34124u3(H0);
                } else {
                    this.f8081M0.m39312I(H0);
                }
            }
        }
    }

    public final void m34924bi() {
        int i;
        int i2;
        int i3;
        boolean Li = m34971Li();
        if (this.f8089U0 != Li) {
            if (this.f8084P0 != 0) {
                i3 = R.id.btn_customChat_priorityOrImportance;
                i2 = R.id.btn_customChat_vibrate;
                i = R.id.btn_customChat_sound;
            } else {
                i3 = R.id.btn_notifications_led;
                i2 = R.id.btn_notifications_vibrate;
                i = R.id.btn_notifications_sound;
            }
            m31293wg();
            if (Li) {
                int N0 = this.f8081M0.m34224N0(i3);
                if (N0 != -1) {
                    this.f8081M0.m34240F0().add(N0, new C2964ra(5, i2, 0, R.string.Vibrate));
                    this.f8081M0.m34240F0().add(N0 + 1, new C2964ra(11));
                    this.f8081M0.m34240F0().add(N0 + 2, new C2964ra(5, i, 0, R.string.Sound));
                    this.f8081M0.m34240F0().add(N0 + 3, new C2964ra(11));
                    this.f8081M0.m39308M(N0, 4);
                } else {
                    return;
                }
            } else {
                int N02 = this.f8081M0.m34224N0(i2);
                if (N02 != -1) {
                    this.f8081M0.m34204V1(N02, 4);
                } else {
                    return;
                }
            }
            this.f8089U0 = Li;
            m31307gg();
        }
    }

    public final List<C2964ra> m34920di() {
        this.f8091W0 = m34916fi();
        int i = 0;
        this.f8092X0 = 0;
        ArrayList arrayList = new ArrayList((this.f8091W0.size() * 2) + 1);
        for (C11131y6 y6Var : this.f8091W0) {
            if (arrayList.isEmpty()) {
                arrayList.add(new C2964ra(2));
            } else {
                arrayList.add(new C2964ra(11));
            }
            if (i < 1 || this.f8091W0.size() - i <= 1 || (y6Var.m1464l() && i < 3)) {
                arrayList.add(m34968Mi(y6Var));
                i++;
            } else {
                this.f8092X0 = this.f8091W0.size() - i;
                arrayList.add(new C2964ra(4, (int) R.id.btn_showMore, (int) R.drawable.baseline_direction_arrow_down_24, C4403w.m27836q2(y6Var.m1464l() ? R.string.NotificationsModeSelectedMore : R.string.NotificationsModeSelectedMoreMuted, this.f8092X0), false));
                arrayList.add(new C2964ra(3));
                return arrayList;
            }
        }
        arrayList.add(new C2964ra(3));
        return arrayList;
    }

    public final ArrayList<C5122j0> m34918ei() {
        ArrayList<C5122j0> arrayList = this.f8083O0;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f8083O0 = m34906ki(mo4347s(), 1, this.f8084P0 != 0 ? this.f30167b.m2440ga().m3176S() : null);
        }
        return this.f8083O0;
    }

    public final List<C11131y6> m34916fi() {
        LinkedList<C11131y6> V = this.f30167b.m2930B4().m4741V();
        Collections.sort(V, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int si;
                si = View$OnClickListenerC2359ew.this.m34890si((C11131y6) obj, (C11131y6) obj2);
                return si;
            }
        });
        return V;
    }

    @Override
    public void mo1777g(String str, TdApi.LanguagePackInfo languagePackInfo) {
        C11020tb.m1984e(this, str, languagePackInfo);
    }

    public final int m34914gi(int i) {
        return (i == 3 || i == 4) ? R.drawable.baseline_sync_problem_24 : i != 5 ? R.drawable.baseline_notification_important_24 : R.drawable.baseline_system_update_24;
    }

    public final int m34912hi(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? R.string.SystemNotificationSettings : R.string.ShareNotificationError : R.string.InstallGooglePlayServices : R.string.TurnSyncOnApp : R.string.TurnSyncOnSystem;
    }

    public final int m34910ii() {
        if (C4868i.m24726c2().m24892F(8)) {
            return 1;
        }
        return C4868i.m24726c2().m24892F(16) ? 2 : 0;
    }

    @Override
    public void mo3000j2(C6924j2 j2Var) {
        C6941k2.m18400a(this, j2Var);
    }

    public final ArrayList<C5122j0> m34908ji() {
        ArrayList<C5122j0> arrayList = this.f8082N0;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f8082N0 = m34906ki(mo4347s(), 2, this.f8084P0 != 0 ? this.f30167b.m2440ga().m3071v0(this.f30167b.m2440ga().m3117j2(this.f8084P0)) : null);
        }
        return this.f8082N0;
    }

    @Override
    public void mo3247l4(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        m34898oi(j, false);
    }

    @Override
    public void mo1773l6(int i, SparseIntArray sparseIntArray) {
        boolean z;
        boolean z2 = true;
        switch (i) {
            case R.id.btn_calls_vibrate:
            case R.id.btn_customChat_calls_vibrate:
            case R.id.btn_customChat_vibrate:
            case R.id.btn_notifications_vibrate:
                int i2 = 0;
                if (sparseIntArray.get(R.id.btn_vibrateOnlyIfSilent) != 0) {
                    sparseIntArray.delete(R.id.btn_vibrateOnlyIfSilent);
                    z = true;
                } else {
                    z = false;
                }
                if (sparseIntArray.size() == 1) {
                    int valueAt = sparseIntArray.valueAt(0);
                    if (valueAt == R.id.btn_disabled) {
                        i2 = 3;
                    } else if (valueAt == R.id.btn_long) {
                        i2 = 2;
                    } else if (valueAt == R.id.btn_short) {
                        i2 = 1;
                    }
                    switch (i) {
                        case R.id.btn_calls_vibrate:
                            z2 = this.f30167b.m2440ga().m3089q2(i2, z);
                            break;
                        case R.id.btn_customChat_calls_vibrate:
                            this.f30167b.m2440ga().m3081s2(this.f8085Q0, i2, z);
                            break;
                        case R.id.btn_customChat_vibrate:
                            this.f30167b.m2440ga().m3065w2(this.f8084P0, i2, z);
                            break;
                        case R.id.btn_notifications_vibrate:
                            z2 = this.f30167b.m2440ga().m3229D2(this.f8087S0, i2, z);
                            break;
                        default:
                            throw new IllegalStateException();
                    }
                    if (z2) {
                        this.f8081M0.m34130s3(i);
                        m34959Pi();
                        return;
                    }
                    return;
                }
                return;
            case R.id.btn_customChat_priorityOrImportance:
            case R.id.btn_notifications_priorityOrImportance:
                int i3 = sparseIntArray.get(i);
                if (i3 != 0) {
                    int ci = m34922ci(i3);
                    if (i == R.id.btn_customChat_priorityOrImportance) {
                        int u0 = this.f30167b.m2440ga().m3075u0(this.f30167b.m2440ga().m3117j2(this.f8084P0));
                        C10827lb ga2 = this.f30167b.m2440ga();
                        long j = this.f8084P0;
                        if (ci == u0) {
                            ci = -100;
                        }
                        ga2.m3073u2(j, ci);
                    } else if (i == R.id.btn_notifications_priorityOrImportance) {
                        z2 = this.f30167b.m2440ga().m3241A2(this.f8087S0, ci);
                    } else {
                        throw new IllegalStateException();
                    }
                    if (z2) {
                        this.f8081M0.m34130s3(i);
                        m34959Pi();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final TdApi.NotificationSettingsScope m34904li(C2964ra raVar) {
        return (raVar == null || !(raVar.m32844d() instanceof TdApi.NotificationSettingsScope)) ? this.f8087S0 : (TdApi.NotificationSettingsScope) raVar.m32844d();
    }

    public final TdApi.NotificationSettingsScope m34902mi(C2964ra raVar, TdApi.NotificationSettingsScope notificationSettingsScope) {
        TdApi.NotificationSettingsScope li = m34904li(raVar);
        return li != null ? li : notificationSettingsScope;
    }

    public final int m34900ni() {
        int gb2 = this.f30167b.m2439gb(this.f8087S0);
        return (gb2 != 0 && !C4779t2.m25464n3(gb2)) || (gb2 == 0 && this.f30167b.m2440ga().m3236C(this.f8087S0)) ? 92 : 7;
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        if (Build.VERSION.SDK_INT >= 26 && this.f8081M0 != null) {
            m34983Hi();
        }
    }

    public final void m34898oi(final long j, final boolean z) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2359ew.this.m34884vi(j, z);
            }
        });
    }

    @Override
    public void onClick(android.view.View r41) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC2359ew.onClick(android.view.View):void");
    }

    @Override
    public boolean onLongClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar == null || view.getId() != R.id.btn_notifications_snooze || this.f8087S0 != null) {
            return false;
        }
        this.f30167b.m2485dd().m3817I8(this, m34904li(raVar), true);
        return true;
    }

    @Override
    public boolean mo31074pg() {
        return true;
    }

    public final void m34896pi(final TdApi.NotificationSettingsScope notificationSettingsScope, final boolean z) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2359ew.this.m34886ui(notificationSettingsScope, z);
            }
        });
    }

    @Override
    public void mo1776q3(boolean z) {
        m9129xd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2359ew.this.m34998Ci();
            }
        }, new C2948qv(this));
    }

    public final boolean m34894qi() {
        return this.f8087S0 == null && this.f8084P0 == 0;
    }

    @Override
    public void mo4078r3(C10930q6 q6Var, boolean z) {
        q6Var.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2359ew.this.m34992Ei();
            }
        });
    }

    @Override
    public void mo1775r7(boolean z) {
        C11020tb.m1983f(this, z);
    }

    @Override
    public void mo30633rg(android.content.Context r30, org.thunderdog.challegram.p211v.CustomRecyclerView r31) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC2359ew.mo30633rg(android.content.Context, org.thunderdog.challegram.v.CustomRecyclerView):void");
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (!this.f8093Y0 || this.f8081M0 == null) {
            this.f8093Y0 = true;
        } else {
            m34983Hi();
        }
    }

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        super.mo9165sd(bundle, str);
        m34947Ti(bundle.getLong(str + "chat_id", 0L));
        m34941Vi(bundle.getInt(str + "scope", 0));
        return true;
    }

    @Override
    public void mo10182t(int i, int i2, Intent intent) {
        String str;
        String str2;
        int i3;
        String str3;
        if (i2 != -1) {
            return;
        }
        if (i == 107 || i == 108) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            String str4 = null;
            if (uri == null) {
                str2 = "";
                str = null;
            } else {
                String O0 = C7389v0.m16701O0(uri, null);
                if (this.f8084P0 != 0) {
                    str3 = null;
                } else if (i == 107) {
                    str3 = this.f30167b.m2188w6() + "_ringtone.ogg";
                } else {
                    int constructor = this.f8087S0.getConstructor();
                    if (constructor == 548013448) {
                        str3 = this.f30167b.m2188w6() + "_channel.ogg";
                    } else if (constructor == 937446759) {
                        str3 = this.f30167b.m2188w6() + "_private.ogg";
                    } else if (constructor == 1212142067) {
                        str3 = this.f30167b.m2188w6() + "_group.ogg";
                    } else {
                        throw new UnsupportedOperationException(this.f8087S0.toString());
                    }
                }
                Uri Q = C10827lb.m3182Q(uri, true, str3);
                String uri2 = Q != null ? Q.toString() : null;
                if (O0 == null && Q != null) {
                    O0 = Q.getLastPathSegment();
                } else if (C5070i.m24061i(uri2)) {
                    str = null;
                    str2 = uri2;
                }
                str = O0;
                str2 = uri2;
            }
            if (i == 107) {
                i3 = this.f8084P0 != 0 ? R.id.btn_customChat_calls_ringtone : R.id.btn_calls_ringtone;
            } else if (i == 108) {
                i3 = this.f8084P0 != 0 ? R.id.btn_customChat_sound : R.id.btn_notifications_sound;
            } else {
                throw new RuntimeException();
            }
            if (!C5070i.m24061i(str2) && uri != null && !uri.toString().equals(str2)) {
                str4 = uri.toString();
            }
            m34944Ui(i3, str2, str, str4);
        }
    }

    @Override
    public void mo1774t4(boolean z) {
        m9129xd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2359ew.this.m34989Fi();
            }
        }, new C2948qv(this));
    }

    @Override
    public void mo31296tg() {
        C5320c cVar = new C5320c(1);
        C5146u0 u0Var = new C5146u0(1);
        cVar.m23284a(R.id.btn_resetNotifications);
        u0Var.m23816a(R.string.ResetNotifications);
        m9302Yd(cVar.m23280e(), u0Var.m23813d(), 0);
    }

    @Override
    public void mo3246x1(long j) {
        m34898oi(j, true);
    }

    @Override
    public void mo2999y4(C6924j2 j2Var) {
        try {
            Vibrator vibrator = (Vibrator) C1379j0.m37309q().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.cancel();
            }
        } catch (Throwable th) {
            Log.m14710w("Cannot vibrate", th, new Object[0]);
        }
        m34932Yi();
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        super.mo9122yd(bundle, str);
        bundle.putLong(str + "chat_id", this.f8084P0);
        String str2 = str + "scope";
        TdApi.NotificationSettingsScope notificationSettingsScope = this.f8087S0;
        bundle.putInt(str2, notificationSettingsScope != null ? notificationSettingsScope.getConstructor() : 0);
        return true;
    }

    @Override
    public void mo3245z0() {
        m9129xd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2359ew.this.m34995Di();
            }
        }, new C2948qv(this));
    }

    public static class C2361b {
        public final long f8097a;
        public final TdApi.NotificationSettingsScope f8098b;

        public C2361b(long j) {
            this.f8097a = j;
            this.f8098b = null;
        }

        public C2361b(TdApi.NotificationSettingsScope notificationSettingsScope) {
            this.f8098b = notificationSettingsScope;
            this.f8097a = 0L;
        }
    }
}
