package p350yd;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.RingtoneManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.provider.Settings;
import android.util.SparseIntArray;
import be.C1379j0;
import gd.C4779t2;
import ge.C4862d;
import ge.C4868i;
import java.util.Arrays;
import me.vkryl.leveldb.LevelDB;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.sync.SyncAdapter;
import p038ce.C2760nb;
import p038ce.View$OnClickListenerC2971rh;
import p039d.C3563j;
import p067ed.C4183a;
import p082fd.C4384m;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5070i;
import p141jd.RunnableC5952j1;
import p193nb.C7316a;
import p213p0.C7976k;
import td.AbstractC9323v4;

public class C10827lb implements C1379j0.AbstractC1380a, C4862d.AbstractC4863a, AbstractC10816l0 {
    public static final String f34660n0;
    public static final String f34661o0;
    public static final int f34662p0;
    public static final long[] f34663q0;
    public static final long[] f34664r0;
    public static final long[] f34665s0;
    public static final long[] f34666t0;
    public static final int[] f34667u0;
    public static final int f34668v0;
    public static final int[] f34669w0;
    public static final int[] f34670x0;
    public AudioManager f34671M;
    public Boolean f34672N;
    public Integer f34673O;
    public final C10677g1 f34674P;
    public final C10677g1 f34675Q;
    public final C10677g1 f34676R;
    public TdApi.ScopeNotificationSettings f34677S;
    public TdApi.ScopeNotificationSettings f34678T;
    public TdApi.ScopeNotificationSettings f34679U;
    public Integer f34680V;
    public Boolean f34681W;
    public boolean f34682X;
    public boolean f34683Y;
    public boolean f34684Z;
    public final C10930q6 f34685a;
    public String f34686a0;
    public final C10762jb f34687b;
    public String f34688b0;
    public final C10828a f34689c;
    public String f34690c0;
    public Integer f34691d0;
    public C10639eb f34692e0;
    public long f34693f0;
    public SoundPool f34694g0;
    public long f34697j0;
    public long f34698k0;
    public long f34699l0;
    public TdApi.User f34700m0;
    public final SparseIntArray f34696i0 = new SparseIntArray();
    public final SparseIntArray f34695h0 = new SparseIntArray();

    public static class C10828a extends C4384m {
        public final C10536ab f34701M;

        public C10828a(String str, C10536ab abVar) {
            super(str);
            this.f34701M = abVar;
        }

        @Override
        public void mo3052f(Message message) {
            boolean z = false;
            switch (message.what) {
                case 0:
                    ((C10827lb) message.obj).m3174S1(message.arg1, message.arg2);
                    return;
                case 1:
                    ((C10827lb) message.obj).m3162W1();
                    return;
                case 2:
                    if (Build.VERSION.SDK_INT >= 26) {
                        C10930q6 q6Var = ((C10827lb) message.obj).f34685a;
                        C10639eb.m4403a(this.f34701M);
                        q6Var.m2440ga().m3208J();
                        C10639eb.m4402b(q6Var);
                        return;
                    }
                    return;
                case 3:
                    ((C10827lb) message.obj).m3202K1(C5063c.m24140f(message.arg1, message.arg2));
                    return;
                case 4:
                    Object[] objArr = (Object[]) message.obj;
                    ((C10827lb) objArr[0]).m3171T1((TdApi.UpdateActiveNotifications) objArr[1]);
                    objArr[1] = null;
                    objArr[0] = null;
                    return;
                case 5:
                default:
                    return;
                case 6:
                    Object[] objArr2 = (Object[]) message.obj;
                    ((C10827lb) objArr2[0]).m3165V1((TdApi.UpdateNotificationGroup) objArr2[1]);
                    objArr2[1] = null;
                    objArr2[0] = null;
                    return;
                case 7:
                    Object[] objArr3 = (Object[]) message.obj;
                    ((C10827lb) objArr3[0]).m3168U1((TdApi.UpdateNotification) objArr3[1]);
                    objArr3[1] = null;
                    objArr3[0] = null;
                    return;
                case 8:
                    ((C10827lb) message.obj).m3054z1(message.arg1);
                    return;
                case 9:
                    Object[] objArr4 = (Object[]) message.obj;
                    ((C10827lb) objArr4[0]).m3242A1((C10666fb) objArr4[1]);
                    objArr4[1] = null;
                    objArr4[0] = null;
                    return;
                case 10:
                    Object[] objArr5 = (Object[]) message.obj;
                    ((C10827lb) objArr5[0]).m3150a2((TdApi.NotificationSettingsScope) objArr5[1]);
                    objArr5[1] = null;
                    objArr5[0] = null;
                    return;
                case 11:
                    ((C10827lb) message.obj).m3153Z1(C5063c.m24140f(message.arg1, message.arg2));
                    return;
                case 12:
                    C10639eb.m4403a(this.f34701M);
                    return;
                case 13:
                    ((C10827lb) message.obj).m3074u1(C5063c.m24140f(message.arg1, message.arg2));
                    return;
                case 14:
                    C10827lb lbVar = (C10827lb) message.obj;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    lbVar.m3066w1(z);
                    return;
                case 15:
                    ((C10827lb) message.obj).f34685a.m2850G4();
                    return;
                case 16:
                    Object[] objArr6 = (Object[]) message.obj;
                    ((Runnable) objArr6[1]).run();
                    ((C10827lb) objArr6[0]).f34685a.m2850G4();
                    objArr6[1] = null;
                    objArr6[0] = null;
                    return;
                case 17:
                    ((C10827lb) message.obj).m3218G1(C5063c.m24140f(message.arg1, message.arg2));
                    return;
                case 18:
                    Object[] objArr7 = (Object[]) message.obj;
                    ((C10827lb) objArr7[0]).m3214H1((TdApi.User) objArr7[1]);
                    objArr7[1] = null;
                    objArr7[0] = null;
                    return;
                case 19:
                    ((C10827lb) message.obj).m3159X1(message.arg1);
                    return;
                case 20:
                    ((C10827lb) message.obj).m3238B1();
                    return;
                case 21:
                    Object[] objArr8 = (Object[]) message.obj;
                    ((C10827lb) objArr8[0]).m3140d2((C10666fb) objArr8[1]);
                    objArr8[1] = null;
                    objArr8[0] = null;
                    return;
            }
        }

        public void m3051i() {
            if (Build.VERSION.SDK_INT >= 26) {
                m28050h(Message.obtain(m28053d(), 12), 0L);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f34660n0 = i >= 26 ? "custom_importance_" : "custom_priority_";
        f34661o0 = i >= 26 ? "_importance" : "_priority";
        f34662p0 = i >= 26 ? 4 : 1;
        f34663q0 = new long[]{0, 100, 0, 100};
        f34664r0 = new long[]{0, 1000};
        f34665s0 = new long[]{0, 140, 0, 140, 750};
        f34666t0 = new long[]{0, 1000, 1000};
        int[] iArr = {-1, -16776961, -65536, -29183, -256, -16711936, -16711681, -2984711, -65281};
        f34667u0 = iArr;
        f34668v0 = iArr[1];
        f34669w0 = new int[]{R.id.theme_color_ledWhite, R.id.theme_color_ledBlue, R.id.theme_color_ledRed, R.id.theme_color_ledOrange, R.id.theme_color_ledYellow, R.id.theme_color_ledGreen, R.id.theme_color_ledCyan, R.id.theme_color_ledPurple, R.id.theme_color_ledPink};
        f34670x0 = new int[]{R.string.LedWhite, R.string.LedBlue, R.string.LedRed, R.string.LedOrange, R.string.LedYellow, R.string.LedGreen, R.string.LedCyan, R.string.LedPurple, R.string.LedPink};
    }

    public C10827lb(C10930q6 q6Var, C10828a aVar) {
        this.f34685a = q6Var;
        this.f34689c = aVar;
        q6Var.m2781K9().m1839l(this);
        this.f34687b = new C10762jb(this, q6Var);
        int w6 = q6Var.m2188w6();
        this.f34674P = new C10677g1(w6, new TdApi.NotificationSettingsScopePrivateChats());
        this.f34675Q = new C10677g1(w6, new TdApi.NotificationSettingsScopeGroupChats());
        this.f34676R = new C10677g1(w6, new TdApi.NotificationSettingsScopeChannelChats());
        C1379j0.m37335d(this);
        C4862d.m24934w().m24955a(this);
    }

    public static boolean m3244A() {
        return RunnableC5952j1.m21779y().m21778z();
    }

    public static int m3220G(C10930q6 q6Var) {
        return (q6Var.m2188w6() * 32767) + 1;
    }

    public static boolean m3212I(String str, String str2) {
        return (str == null) == (str2 == null) && C5070i.m24067c(str, str2);
    }

    public static android.net.Uri m3182Q(android.net.Uri r10, boolean r11, java.lang.String r12) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10827lb.m3182Q(android.net.Uri, boolean, java.lang.String):android.net.Uri");
    }

    public static String m3179R(String str) {
        if (C5070i.m24061i(str)) {
            return str;
        }
        try {
            Uri Q = m3182Q(Uri.parse(str), false, null);
            if (Q == null) {
                return null;
            }
            return Q.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static void m3125h2(TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        scopeNotificationSettings.showPreview = true;
        scopeNotificationSettings.muteFor = 0;
        scopeNotificationSettings.disablePinnedMessageNotifications = false;
        scopeNotificationSettings.disableMentionNotifications = false;
    }

    public static String m3114k1(String str, int i) {
        if (i == 0) {
            return str;
        }
        return "account" + i + "_" + str;
    }

    public static void m3110l1(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    public static boolean m3090q1(TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        return scopeNotificationSettings == null || !scopeNotificationSettings.showPreview || scopeNotificationSettings.muteFor != 0 || scopeNotificationSettings.disableMentionNotifications || scopeNotificationSettings.disablePinnedMessageNotifications;
    }

    public static TdApi.ScopeNotificationSettings m3082s1() {
        return new TdApi.ScopeNotificationSettings(0, null, true, false, false);
    }

    public int m3243A0(long j) {
        int m0 = m3107m0(j, 0);
        return m0 != 0 ? m0 : m3079t0(m3117j2(j));
    }

    public final void m3242A1(C10666fb fbVar) {
        this.f34687b.m3932S(fbVar);
    }

    public boolean m3241A2(TdApi.NotificationSettingsScope notificationSettingsScope, int i) {
        if (m3075u0(notificationSettingsScope) == i) {
            return false;
        }
        C10677g1 F0 = m3223F0(notificationSettingsScope);
        F0.m4316p(i);
        LevelDB W = C4868i.m24726c2().m24773W();
        if (i != f34662p0) {
            W.putInt(F0.m4313s(f34661o0), i);
        } else {
            W.remove(F0.m4313s(f34661o0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            m3157Y0(notificationSettingsScope, 0L, W);
            return true;
        }
        W.apply();
        return true;
    }

    public boolean m3240B(long j, boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        int n0 = m3103n0(j, -100);
        return n0 == 0 || (n0 == -100 && m3236C(m3117j2(j)));
    }

    public int m3239B0(long j) {
        int n0 = m3103n0(j, -100);
        return n0 != -100 ? n0 : m3075u0(m3117j2(j));
    }

    public final void m3238B1() {
        this.f34687b.m3929V();
    }

    public void m3237B2(TdApi.NotificationSettingsScope notificationSettingsScope, boolean z) {
        TdApi.ScopeNotificationSettings M0 = m3195M0(notificationSettingsScope);
        if (M0 != null) {
            M0.showPreview = z;
            this.f34685a.m2358lc(notificationSettingsScope, M0);
        }
    }

    public boolean m3236C(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return Build.VERSION.SDK_INT >= 26 && m3075u0(notificationSettingsScope) == 0;
    }

    public String m3235C0(long j) {
        String o0 = m3099o0(j, null);
        return o0 == null ? m3227E0(j).m4327e() : o0;
    }

    public void m3234C1(TdApi.UpdateActiveNotifications updateActiveNotifications, Runnable runnable) {
        m3097o2(Message.obtain(this.f34689c.m28053d(), 4, new Object[]{this, updateActiveNotifications}), runnable);
    }

    public boolean m3233C2(TdApi.NotificationSettingsScope notificationSettingsScope, String str, String str2, String str3) {
        String R = m3179R(str);
        C10677g1 F0 = m3223F0(notificationSettingsScope);
        if (m3212I(F0.m4327e(), R) && C5070i.m24067c(F0.m4326f(), str2) && C5070i.m24067c(F0.m4325g(), str3)) {
            return false;
        }
        F0.m4315q(R, str2, str3);
        LevelDB W = C4868i.m24726c2().m24773W();
        if (R != null) {
            W.putString(F0.m4313s("_sounds"), R);
        } else {
            W.remove(F0.m4313s("_sounds"));
        }
        if (C5070i.m24061i(R) || str2 == null) {
            W.remove(F0.m4313s("_sounds_name"));
        } else {
            W.putString(F0.m4313s("_sounds_name"), str2);
        }
        if (C5070i.m24061i(R) || str3 == null) {
            W.remove(F0.m4313s("_sounds_path"));
        } else {
            W.putString(F0.m4313s("_sounds_path"), str3);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            m3157Y0(notificationSettingsScope, 0L, W);
            return true;
        }
        W.apply();
        return true;
    }

    public boolean m3232D() {
        switch (m3219G0()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public int m3231D0(long r8) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10827lb.m3231D0(long):int");
    }

    public void m3230D1(TdApi.UpdateMessageSendSucceeded updateMessageSendSucceeded) {
        AbstractC9323v4<?> v4Var;
        int constructor;
        TdApi.Message message = updateMessageSendSucceeded.message;
        try {
            v4Var = C1379j0.m37305s();
        } catch (IndexOutOfBoundsException unused) {
            v4Var = null;
        }
        if ((((v4Var instanceof View$OnClickListenerC2971rh) && ((View$OnClickListenerC2971rh) v4Var).m32163yj(message.chatId)) || (v4Var instanceof C2760nb)) && !v4Var.m9312Xa() && (constructor = message.content.getConstructor()) != -1564971605 && constructor != 1810060209) {
            m3177R1();
        }
    }

    public boolean m3229D2(TdApi.NotificationSettingsScope notificationSettingsScope, int i, boolean z) {
        if (m3059y0(notificationSettingsScope) == i && (!C4183a.f14102t || m3055z0(notificationSettingsScope) == z)) {
            return false;
        }
        C10677g1 F0 = m3223F0(notificationSettingsScope);
        F0.m4314r(i, z);
        LevelDB W = C4868i.m24726c2().m24773W();
        if (i != 0) {
            W.putInt(F0.m4313s("_vibrate"), i);
        } else {
            W.remove(F0.m4313s("_vibrate"));
        }
        if (C4183a.f14102t) {
            if (z) {
                W.putBoolean(F0.m4313s("_vibrate_onlysilent"), z);
            } else {
                W.remove(F0.m4313s("_vibrate_onlysilent"));
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            m3157Y0(notificationSettingsScope, 0L, W);
            return true;
        }
        W.apply();
        return true;
    }

    public boolean m3228E(long j) {
        TdApi.ChatNotificationSettings I3 = this.f34685a.m2819I3(j);
        if (I3 == null || I3.useDefaultDisablePinnedMessageNotifications) {
            return m3196M(j);
        }
        return I3.disablePinnedMessageNotifications;
    }

    public C10677g1 m3227E0(long j) {
        switch (C7316a.m17057d(j)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                return this.f34685a.m2299p7(j) ? this.f34675Q : this.f34676R;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return this.f34674P;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return this.f34675Q;
            default:
                throw new RuntimeException("chatId == " + j);
        }
    }

    public void m3226E1(TdApi.User user) {
        m3097o2(Message.obtain(this.f34689c.m28053d(), 18, new Object[]{this, user}), null);
    }

    public void m3225E2(long j, boolean z) {
        TdApi.ChatNotificationSettings I3 = this.f34685a.m2819I3(j);
        boolean M = m3196M(j);
        if (I3 != null) {
            I3.useDefaultDisablePinnedMessageNotifications = z == M;
            I3.disablePinnedMessageNotifications = z;
            this.f34685a.m2763Lb(j, I3);
        }
    }

    public final AudioManager m3224F() {
        if (this.f34671M == null) {
            try {
                this.f34671M = (AudioManager) C1379j0.m37315n().getSystemService("audio");
            } catch (Throwable th) {
                Log.m14728e(4, "Context.AUDIO_SERVICE is not available", th, new Object[0]);
            }
        }
        return this.f34671M;
    }

    public C10677g1 m3223F0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor == 548013448) {
            return this.f34676R;
        }
        if (constructor == 937446759) {
            return this.f34674P;
        }
        if (constructor == 1212142067) {
            return this.f34675Q;
        }
        throw new RuntimeException();
    }

    public void m3222F1(long j) {
        m3097o2(Message.obtain(this.f34689c.m28053d(), 17, C5063c.m24133m(j), C5063c.m24132n(j), this), null);
    }

    public void m3221F2(long j, boolean z) {
        TdApi.ChatNotificationSettings I3 = this.f34685a.m2819I3(j);
        boolean K = m3204K(j);
        if (I3 != null) {
            I3.useDefaultDisableMentionNotifications = z == K;
            I3.disableMentionNotifications = z;
            this.f34685a.m2763Lb(j, I3);
        }
    }

    public int m3219G0() {
        NotificationChannelGroup notificationChannelGroup;
        if (Build.VERSION.SDK_INT >= 28 && this.f34685a.m2519ba() != 0 && (notificationChannelGroup = (NotificationChannelGroup) m3184P0()) != null && notificationChannelGroup.isBlocked()) {
            return 1;
        }
        if (!C7976k.m13878d(C1379j0.m37315n()).m13881a()) {
            return 2;
        }
        if (!m3163W0()) {
            if (m3129g1()) {
                return 3;
            }
            return m3133f1() ? 4 : 5;
        } else if (this.f34685a.m2294pc().m4142O()) {
            return 6;
        } else {
            return (this.f34685a.m2949A1().m1464l() || !C4868i.m24726c2().m24892F(16)) ? 0 : 7;
        }
    }

    public final void m3218G1(long j) {
        this.f34699l0 = j;
        if (j == 0) {
            this.f34700m0 = null;
        }
    }

    public boolean m3217G2(int i) {
        if (m3215H0() == i) {
            return false;
        }
        this.f34691d0 = Integer.valueOf(i);
        C4868i.m24726c2().m24581u3(m3118j1("repeat_notification_minutes"), i);
        if (i == 0) {
            m3216H();
            return true;
        }
        m3121i2();
        return true;
    }

    public final void m3216H() {
    }

    public int m3215H0() {
        if (this.f34691d0 == null) {
            this.f34691d0 = Integer.valueOf(C4868i.m24726c2().m24779V0(m3114k1("repeat_notification_minutes", this.f34685a.m2188w6()), C3563j.f11957L0));
        }
        return this.f34691d0.intValue();
    }

    public final void m3214H1(TdApi.User user) {
        this.f34700m0 = user;
    }

    public void m3213H2(long j, boolean z) {
        TdApi.ChatNotificationSettings I3 = this.f34685a.m2819I3(j);
        boolean O = m3188O(j);
        if (I3 != null) {
            I3.useDefaultShowPreview = z == O;
            I3.showPreview = z;
            this.f34685a.m2763Lb(j, I3);
        }
    }

    public String m3211I0(long j, String str) {
        C4868i c2 = C4868i.m24726c2();
        return m3179R(c2.m24848L1(m3118j1("custom_sound_" + j), str));
    }

    public void m3210I1(TdApi.UpdateNewMessage updateNewMessage) {
        TdApi.Message message = updateNewMessage.message;
        if (!message.isOutgoing && message.sendingState == null) {
            AbstractC9323v4<?> v4Var = null;
            try {
                v4Var = C1379j0.m37305s();
            } catch (IndexOutOfBoundsException unused) {
            }
            if ((v4Var instanceof View$OnClickListenerC2971rh) && v4Var.m9299Za(this.f34685a)) {
                long Sj = ((View$OnClickListenerC2971rh) v4Var).m32581Sj();
                if (Sj != 0 && updateNewMessage.message.chatId == Sj && this.f34685a.m2223u3(Sj)) {
                    TdApi.ChatMemberStatus K3 = this.f34685a.m2787K3(updateNewMessage.message.chatId);
                    if (K3 == null || C4779t2.m25506h3(K3)) {
                        m3180Q1();
                    }
                }
            }
        }
    }

    public boolean m3209I2() {
        if (m3224F() != null) {
            try {
                return m3224F().getRingerMode() == 1;
            } catch (Throwable th) {
                Log.m14708w(th);
            }
        }
        return true;
    }

    public void m3208J() {
        if (Build.VERSION.SDK_INT >= 26 && this.f34685a.m2504ca(true) != 0) {
            m3155Z().m4401c(this.f34685a.m2550Z9());
        }
    }

    public String m3207J0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return m3179R(m3223F0(notificationSettingsScope).m4327e());
    }

    public void m3206J1(TdApi.UpdateNotification updateNotification) {
        m3097o2(Message.obtain(this.f34689c.m28053d(), 7, new Object[]{this, updateNotification}), null);
    }

    public C10930q6 m3205J2() {
        return this.f34685a;
    }

    public boolean m3204K(long j) {
        TdApi.ScopeNotificationSettings K0 = m3203K0(j);
        return K0 != null && K0.disableMentionNotifications;
    }

    public TdApi.ScopeNotificationSettings m3203K0(long j) {
        return m3195M0(m3117j2(j));
    }

    public void m3202K1(long j) {
        Thread currentThread = Thread.currentThread();
        C10828a aVar = this.f34689c;
        if (currentThread != aVar) {
            m3097o2(Message.obtain(aVar.m28053d(), 3, C5063c.m24133m(j), C5063c.m24132n(j), this), null);
        } else {
            m3132f2(j);
        }
    }

    public void m3201K2(TdApi.NotificationSettingsScope notificationSettingsScope) {
        C10677g1 F0 = m3223F0(notificationSettingsScope);
        boolean z = !F0.m4322j();
        F0.m4317o(z);
        C4868i.m24726c2().m24597s3(F0.m4313s("_content_preview"), z);
    }

    public boolean m3200L(TdApi.NotificationSettingsScope notificationSettingsScope) {
        TdApi.ScopeNotificationSettings M0 = m3195M0(notificationSettingsScope);
        return M0 != null && M0.disableMentionNotifications;
    }

    public TdApi.ScopeNotificationSettings m3199L0(TdApi.Chat chat) {
        return m3195M0(m3113k2(chat));
    }

    public void m3198L1(TdApi.UpdateNotificationGroup updateNotificationGroup) {
        m3097o2(Message.obtain(this.f34689c.m28053d(), 6, new Object[]{this, updateNotificationGroup}), null);
    }

    public void m3197L2(TdApi.NotificationSettingsScope notificationSettingsScope) {
        m3237B2(notificationSettingsScope, !m3185P(notificationSettingsScope));
    }

    public boolean m3196M(long j) {
        TdApi.ScopeNotificationSettings K0 = m3203K0(j);
        return K0 != null && K0.disablePinnedMessageNotifications;
    }

    public TdApi.ScopeNotificationSettings m3195M0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor == 548013448) {
            return this.f34679U;
        }
        if (constructor == 937446759) {
            return this.f34677S;
        }
        if (constructor == 1212142067) {
            return this.f34678T;
        }
        throw new RuntimeException();
    }

    public void m3194M1(TdApi.UpdateChatNotificationSettings updateChatNotificationSettings, long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        boolean O = m3188O(j);
        boolean z = chatNotificationSettings.useDefaultShowPreview ? O : chatNotificationSettings.showPreview;
        TdApi.ChatNotificationSettings chatNotificationSettings2 = updateChatNotificationSettings.notificationSettings;
        if (!chatNotificationSettings2.useDefaultShowPreview) {
            O = chatNotificationSettings2.showPreview;
        }
        if (z != O) {
            m3186O1(updateChatNotificationSettings.chatId);
        }
    }

    public void m3193M2() {
        this.f34672N = Boolean.valueOf(!m3060y());
        C4868i.m24726c2().m24597s3(m3118j1("inapp_chatSounds"), this.f34672N.booleanValue());
    }

    public boolean m3192N(TdApi.NotificationSettingsScope notificationSettingsScope) {
        TdApi.ScopeNotificationSettings M0 = m3195M0(notificationSettingsScope);
        return M0 != null && M0.disablePinnedMessageNotifications;
    }

    @TargetApi(26)
    public Object m3191N0(TdApi.NotificationSettingsScope notificationSettingsScope, long j) {
        NotificationManager notificationManager;
        String Q0;
        if (Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) C1379j0.m37315n().getSystemService("notification")) == null || (Q0 = m3181Q0(notificationSettingsScope, j)) == null) {
            return null;
        }
        return notificationManager.getNotificationChannel(Q0);
    }

    public void m3190N1(TdApi.UpdateScopeNotificationSettings updateScopeNotificationSettings) {
        TdApi.NotificationSettingsScope notificationSettingsScope = updateScopeNotificationSettings.scope;
        TdApi.ScopeNotificationSettings scopeNotificationSettings = updateScopeNotificationSettings.notificationSettings;
        TdApi.ScopeNotificationSettings M0 = m3195M0(notificationSettingsScope);
        boolean z = (M0 == null || M0.showPreview == scopeNotificationSettings.showPreview) ? false : true;
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor == 548013448) {
            this.f34679U = scopeNotificationSettings;
        } else if (constructor == 937446759) {
            this.f34677S = scopeNotificationSettings;
        } else if (constructor == 1212142067) {
            this.f34678T = scopeNotificationSettings;
        } else {
            throw new RuntimeException();
        }
        if (z) {
            m3183P1(notificationSettingsScope);
        }
    }

    public void m3189N2(long j) {
        m3213H2(j, !m3141d1(j, false));
    }

    public boolean m3188O(long j) {
        return !C7316a.m17051j(j) && m3185P(m3117j2(j));
    }

    public Object m3187O0(C10711hb hbVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return m3155Z().m4394j(hbVar, false);
        }
        return null;
    }

    public void m3186O1(long j) {
        m3097o2(Message.obtain(this.f34689c.m28053d(), 11, C5063c.m24133m(j), C5063c.m24132n(j), this), null);
    }

    public boolean m3185P(TdApi.NotificationSettingsScope notificationSettingsScope) {
        TdApi.ScopeNotificationSettings M0 = m3195M0(notificationSettingsScope);
        return M0 != null && M0.showPreview;
    }

    @TargetApi(26)
    public Object m3184P0() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            long ba2 = this.f34685a.m2519ba();
            if (ba2 == 0) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) C1379j0.m37315n().getSystemService("notification");
            String q = C10639eb.m4387q(ba2, this.f34685a.m2949A1().m1504G());
            if (i >= 28) {
                return notificationManager.getNotificationChannelGroup(q);
            }
            for (NotificationChannelGroup notificationChannelGroup : notificationManager.getNotificationChannelGroups()) {
                if (q.equals(notificationChannelGroup.getId())) {
                    return notificationChannelGroup;
                }
            }
        }
        return null;
    }

    public void m3183P1(TdApi.NotificationSettingsScope notificationSettingsScope) {
        m3097o2(Message.obtain(this.f34689c.m28053d(), 10, new Object[]{this, notificationSettingsScope}), null);
    }

    @TargetApi(26)
    public String m3181Q0(TdApi.NotificationSettingsScope notificationSettingsScope, long j) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        long ba2 = this.f34685a.m2519ba();
        if (ba2 == 0) {
            return null;
        }
        return C10639eb.m4389o(ba2, m3130g0(), notificationSettingsScope, j, m3138e0(notificationSettingsScope, j));
    }

    public final void m3180Q1() {
        if (m3060y()) {
            m3174S1(R.raw.sound_in, 500);
        }
    }

    public boolean m3178R0(long j) {
        if (j == 0) {
            return false;
        }
        if (m3172T0(j) || m3175S0(j)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (((NotificationChannel) m3191N0(null, j)) != null) {
                return true;
            }
            if (m3239B0(j) < 3) {
                return false;
            }
        }
        return m3166V0(j) || m3169U0(j);
    }

    public final void m3177R1() {
        if (m3060y()) {
            m3174S1(R.raw.sound_out, 100);
        }
    }

    public String m3176S() {
        if (!this.f34682X) {
            this.f34686a0 = C4868i.m24726c2().m24848L1(m3114k1("voice_ringtone", this.f34685a.m2188w6()), null);
            this.f34682X = true;
        }
        return this.f34686a0;
    }

    public boolean m3175S0(long j) {
        return m3107m0(j, 0) != 0;
    }

    public final void m3174S1(int i, int i2) {
        int i3;
        if (m3224F() != null && !RunnableC5952j1.m21779y().m21778z()) {
            Thread currentThread = Thread.currentThread();
            C10828a aVar = this.f34689c;
            if (currentThread != aVar) {
                aVar.m28050h(Message.obtain(aVar.m28053d(), 0, i, i2, this), 0L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f34693f0;
            if (j == 0 || j <= currentTimeMillis) {
                try {
                    if (this.f34694g0 == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f34694g0 = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).build()).build();
                        } else {
                            this.f34694g0 = new SoundPool(3, 1, 0);
                        }
                        this.f34694g0.setOnLoadCompleteListener(C10801kb.f34576a);
                    }
                    int i4 = this.f34696i0.get(i);
                    if (i4 != 0 || this.f34695h0.get(i) == 1) {
                        i3 = i4;
                    } else {
                        this.f34695h0.put(i, 1);
                        SparseIntArray sparseIntArray = this.f34696i0;
                        int load = this.f34694g0.load(C1379j0.m37315n(), i, 1);
                        sparseIntArray.put(i, load);
                        i3 = load;
                    }
                    if (i3 != 0) {
                        this.f34694g0.play(i3, 1.0f, 1.0f, 1, 0, 1.0f);
                        this.f34693f0 = currentTimeMillis + i2;
                        return;
                    }
                    this.f34693f0 = currentTimeMillis + i2 + 30;
                } catch (Throwable th) {
                    Log.m14728e(4, "Unable to play raw sound", th, new Object[0]);
                }
            }
        }
    }

    public String m3173T(long j) {
        String h0 = m3127h0(j);
        if (h0 == null) {
            h0 = m3176S();
        }
        return C5070i.m24061i(h0) ? RingtoneManager.getDefaultUri(1).toString() : h0;
    }

    public boolean m3172T0(long j) {
        return m3103n0(j, -100) != -100;
    }

    public final void m3171T1(TdApi.UpdateActiveNotifications updateActiveNotifications) {
        this.f34687b.m3922c0(updateActiveNotifications);
    }

    public String m3170U() {
        if (!this.f34683Y) {
            this.f34688b0 = C4868i.m24726c2().m24848L1(m3114k1("voice_ringtone_name", this.f34685a.m2188w6()), null);
            this.f34683Y = true;
        }
        return this.f34688b0;
    }

    public boolean m3169U0(long j) {
        return m3099o0(j, null) != null;
    }

    public final void m3168U1(TdApi.UpdateNotification updateNotification) {
        this.f34687b.m3912v(updateNotification);
    }

    public String m3167V() {
        if (!this.f34684Z) {
            this.f34690c0 = C4868i.m24726c2().m24848L1(m3114k1("voice_ringtone_path", this.f34685a.m2188w6()), null);
            this.f34684Z = true;
        }
        return this.f34690c0;
    }

    public boolean m3166V0(long j) {
        return m3087r0(j, 0) != 0;
    }

    public final void m3165V1(TdApi.UpdateNotificationGroup updateNotificationGroup) {
        this.f34687b.m3920e0(updateNotificationGroup);
    }

    public int m3164W() {
        if (this.f34680V == null) {
            this.f34680V = Integer.valueOf(C4868i.m24726c2().m24779V0(m3114k1("voice_vibrate", this.f34685a.m2188w6()), 0));
        }
        return this.f34680V.intValue();
    }

    public final boolean m3163W0() {
        return C7389v0.m16612l1(C1379j0.m37315n());
    }

    public final void m3162W1() {
        Thread currentThread = Thread.currentThread();
        C10828a aVar = this.f34689c;
        if (currentThread != aVar) {
            m3097o2(Message.obtain(aVar.m28053d(), 1, this), null);
        } else {
            m3156Y1();
        }
    }

    public int m3161X(long j) {
        boolean z;
        int k0 = m3115k0(j);
        if (k0 != 0) {
            z = m3111l0(j);
        } else {
            k0 = m3164W();
            z = m3158Y();
        }
        if (!z || m3224F() == null) {
            return k0;
        }
        try {
            int ringerMode = m3224F().getRingerMode();
            if (ringerMode == 0 || ringerMode == 1) {
                return k0;
            }
            return 3;
        } catch (Throwable th) {
            Log.m14728e(4, "Cannot get ringer mode", th, new Object[0]);
            return k0;
        }
    }

    public boolean m3160X0() {
        return m3232D() || m3236C(m3101n2()) || m3236C(m3105m2()) || m3236C(m3109l2()) || !m3163W0() || this.f34685a.m2440ga().m3219G0() == 7;
    }

    public final void m3159X1(int i) {
        this.f34687b.m3924a0(i);
    }

    public boolean m3158Y() {
        if (this.f34681W == null) {
            boolean z = false;
            if (C4183a.f14102t && C4868i.m24726c2().m24632o0(m3114k1("voice_vibrate_onlysilent", this.f34685a.m2188w6()), false)) {
                z = true;
            }
            this.f34681W = Boolean.valueOf(z);
        }
        return this.f34681W.booleanValue();
    }

    @TargetApi(26)
    public final void m3157Y0(TdApi.NotificationSettingsScope notificationSettingsScope, long j, LevelDB levelDB) {
        String str;
        long ba2 = this.f34685a.m2519ba();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        C10677g1 F0 = i != 0 ? null : m3223F0(notificationSettingsScope);
        if (i != 0) {
            str = m3118j1("channels_version_custom_" + j);
        } else {
            str = F0.m4321k("channels_version_");
        }
        long e1 = i != 0 ? C4868i.m24726c2().m24711e1(str, 0L) : F0.m4331a();
        long j2 = e1 == Long.MAX_VALUE ? Long.MIN_VALUE : e1 + 1;
        levelDB.putLong(str, j2);
        if (i == 0) {
            F0.m4319m(j2);
        }
        levelDB.apply();
        C10930q6 q6Var = this.f34685a;
        C10639eb.m4383u(q6Var, ba2, q6Var.m2949A1().m1504G(), m3130g0(), notificationSettingsScope, j, j2);
        m3202K1(ba2);
        if (i != 0) {
            this.f34685a.m2781K9().m1972B2(j);
        } else {
            this.f34685a.m2781K9().m1968C2(notificationSettingsScope);
        }
    }

    public final void m3156Y1() {
        this.f34687b.m3928W();
    }

    public C10639eb m3155Z() {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        long ca2 = this.f34685a.m2504ca(true);
        TdApi.User m1 = m3106m1();
        if (ca2 == 0) {
            C10639eb ebVar = this.f34692e0;
            if (ebVar != null) {
                return ebVar;
            }
            throw new IllegalStateException("Cannot retrieve accountUserId, required by channelGroup, authorizationStatus: " + this.f34685a.m2648T1());
        }
        C10639eb ebVar2 = this.f34692e0;
        if (ebVar2 == null || ebVar2.m4397g() != ca2) {
            C10930q6 q6Var = this.f34685a;
            this.f34692e0 = new C10639eb(q6Var, ca2, q6Var.m2949A1().m1504G(), m1);
        }
        return this.f34692e0;
    }

    public boolean m3154Z0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return C4183a.f14105w && m3223F0(notificationSettingsScope).m4322j();
    }

    public final void m3153Z1(long j) {
        this.f34687b.m3925Z(j);
    }

    @Override
    public void mo1411a() {
        C10828a aVar = this.f34689c;
        aVar.m28050h(Message.obtain(aVar.m28053d(), 20, this), 0L);
    }

    public final int m3152a0(TdApi.NotificationSettingsScope notificationSettingsScope, long j, int i) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = (NotificationChannel) m3191N0(notificationSettingsScope, j)) == null) {
            return i;
        }
        if (notificationChannel.shouldShowLights()) {
            return notificationChannel.getLightColor();
        }
        return 0;
    }

    public boolean m3151a1(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return !"".equals(m3071v0(notificationSettingsScope));
    }

    public final void m3150a2(TdApi.NotificationSettingsScope notificationSettingsScope) {
        this.f34687b.m3927X(notificationSettingsScope);
    }

    @Override
    public void mo1409b(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            m3097o2(Message.obtain(this.f34689c.m28053d(), 2, this), null);
        }
    }

    public final int m3149b0(TdApi.NotificationSettingsScope notificationSettingsScope, long j, int i) {
        NotificationChannel notificationChannel;
        return (Build.VERSION.SDK_INT < 26 || (notificationChannel = (NotificationChannel) m3191N0(notificationSettingsScope, j)) == null) ? i : notificationChannel.getImportance();
    }

    public boolean m3148b1(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return m3059y0(notificationSettingsScope) != 3;
    }

    public void m3147b2(Runnable runnable) {
        if (runnable != null) {
            C10828a aVar = this.f34689c;
            aVar.m28050h(Message.obtain(aVar.m28053d(), 16, new Object[]{this, runnable}), 0L);
            return;
        }
        C10828a aVar2 = this.f34689c;
        aVar2.m28050h(Message.obtain(aVar2.m28053d(), 15, this), 0L);
    }

    @Override
    public void mo1407c() {
        m3128g2(true);
    }

    public final String m3146c0(TdApi.NotificationSettingsScope notificationSettingsScope, long j, String str) {
        NotificationChannel notificationChannel;
        Uri defaultUri;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = (NotificationChannel) m3191N0(notificationSettingsScope, j)) == null) {
            return str;
        }
        Uri sound = notificationChannel.getSound();
        AudioAttributes audioAttributes = notificationChannel.getAudioAttributes();
        if (sound == null) {
            if (audioAttributes == null) {
                return "";
            }
            return null;
        } else if (sound.equals(Uri.EMPTY)) {
            return "";
        } else {
            String uri = sound.toString();
            try {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } catch (Throwable unused) {
            }
            if (defaultUri != null && C5070i.m24067c(defaultUri.toString(), uri)) {
                return null;
            }
            Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(C1379j0.m37315n(), 2);
            if (actualDefaultRingtoneUri != null) {
                if (C5070i.m24067c(actualDefaultRingtoneUri.toString(), uri)) {
                    return null;
                }
            }
            return sound.toString();
        }
    }

    public boolean m3145c1(long j) {
        return j != 0 && j == this.f34699l0;
    }

    public void m3144c2(C10666fb fbVar) {
        C10828a aVar = this.f34689c;
        aVar.m28050h(Message.obtain(aVar.m28053d(), 21, new Object[]{this, fbVar}), 0L);
    }

    @Override
    public void mo3143d(boolean z) {
        m3162W1();
    }

    public final String m3142d0(String str, String str2, String str3) {
        if (C5070i.m24061i(str3)) {
            return str3;
        }
        if (m3212I(str3, str)) {
            return C7389v0.m16697P0(str, str2);
        }
        return C7389v0.m16697P0(str3, C4403w.m27869i1(R.string.RingtoneCustom));
    }

    public boolean m3141d1(long j, boolean z) {
        TdApi.ChatNotificationSettings I3 = this.f34685a.m2819I3(j);
        if (I3 != null && !I3.useDefaultShowPreview) {
            return I3.showPreview;
        }
        if (C7316a.m17051j(j)) {
            return false;
        }
        if (!z) {
            return m3188O(j);
        }
        TdApi.ScopeNotificationSettings scopeNotificationSettings = this.f34677S;
        return scopeNotificationSettings != null && scopeNotificationSettings.showPreview;
    }

    public final void m3140d2(C10666fb fbVar) {
        this.f34687b.m3923b0(fbVar);
    }

    @TargetApi(26)
    public long m3138e0(TdApi.NotificationSettingsScope notificationSettingsScope, long j) {
        if (j == 0) {
            return m3223F0(notificationSettingsScope).m4331a();
        }
        C4868i c2 = C4868i.m24726c2();
        return c2.m24711e1(m3118j1("channels_version_custom_" + j), 0L);
    }

    public boolean m3137e1(long j) {
        String o0 = m3099o0(j, null);
        return o0 != null ? !"".equals(o0) : m3151a1(m3117j2(j));
    }

    public boolean m3136e2(long j) {
        C10639eb ebVar;
        if (Build.VERSION.SDK_INT < 26 || (ebVar = this.f34692e0) == null || ebVar.m4397g() != j) {
            return false;
        }
        this.f34692e0 = null;
        return true;
    }

    public final int m3134f0(TdApi.NotificationSettingsScope notificationSettingsScope, long j, int i) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = (NotificationChannel) m3191N0(notificationSettingsScope, j)) == null) {
            return i;
        }
        if (!notificationChannel.shouldVibrate()) {
            return 3;
        }
        long[] vibrationPattern = notificationChannel.getVibrationPattern();
        if (vibrationPattern == null) {
            return 0;
        }
        if (Arrays.equals(vibrationPattern, f34663q0)) {
            return 1;
        }
        return Arrays.equals(vibrationPattern, f34664r0) ? 2 : 0;
    }

    public final boolean m3133f1() {
        return !SyncAdapter.m14206b(C1379j0.m37309q());
    }

    public final void m3132f2(long j) {
        this.f34687b.m3930U(j);
    }

    public int m3130g0() {
        if (this.f34673O == null) {
            int i = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                i = C4868i.m24726c2().m24779V0(m3114k1("channels_version_global", this.f34685a.m2188w6()), 0);
            }
            this.f34673O = Integer.valueOf(i);
        }
        return this.f34673O.intValue();
    }

    public final boolean m3129g1() {
        return !SyncAdapter.m14205c();
    }

    public void m3128g2(boolean z) {
        int w6 = this.f34685a.m2188w6();
        LevelDB W = C4868i.m24726c2().m24773W();
        W.remove(m3114k1("inapp_vibrate", w6)).remove(m3114k1("inapp_sounds", w6)).remove(m3114k1("inapp_chatSounds", w6)).remove(m3114k1("voice_ringtone", w6)).remove(m3114k1("voice_ringtone_name", w6)).remove(m3114k1("voice_ringtone_path", w6)).remove(m3114k1("voice_vibrate", w6)).remove(m3114k1("voice_vibrate_onlysilent", w6));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            int g0 = m3130g0();
            String k1 = m3114k1("channels_version_global", w6);
            Integer valueOf = Integer.valueOf(g0 == Integer.MAX_VALUE ? Integer.MIN_VALUE : g0 + 1);
            this.f34673O = valueOf;
            W.putInt(k1, valueOf.intValue());
        }
        C4868i.m24726c2().m24881G3(new String[]{m3114k1("custom_sound_", w6), m3114k1("custom_sound_name_", w6), m3114k1("custom_sound_path_", w6), m3114k1("custom_led_", w6), m3114k1("custom_vibrate_", w6), m3114k1("custom_vibrate_onlysilent_", w6), m3114k1("custom_call_ringtone_", w6), m3114k1("custom_call_ringtone_name_", w6), m3114k1("custom_call_vibrate_", w6), m3114k1("custom_call_vibrate_onlysilent_", w6), m3114k1(f34660n0, w6), m3114k1("channels_version_custom_", w6)}, W);
        W.apply();
        this.f34672N = null;
        this.f34674P.m4320l(W);
        this.f34675Q.m4320l(W);
        this.f34676R.m4320l(W);
        this.f34680V = null;
        this.f34681W = null;
        this.f34688b0 = null;
        this.f34686a0 = null;
        this.f34682X = false;
        this.f34683Y = false;
        this.f34691d0 = null;
        if (i >= 26) {
            long ba2 = this.f34685a.m2519ba();
            TdApi.User Z9 = this.f34685a.m2550Z9();
            if (ba2 != 0) {
                C10930q6 q6Var = this.f34685a;
                C10639eb.m4399e(q6Var, ba2, q6Var.m2949A1().m1504G(), Z9, !z);
            }
        }
        if (!z) {
            if (m3090q1(this.f34677S)) {
                TdApi.ScopeNotificationSettings scopeNotificationSettings = this.f34677S;
                if (scopeNotificationSettings != null) {
                    m3125h2(scopeNotificationSettings);
                } else {
                    this.f34677S = m3082s1();
                }
                this.f34685a.m2270r4().m14783o(new TdApi.SetScopeNotificationSettings(new TdApi.NotificationSettingsScopePrivateChats(), this.f34677S), this.f34685a.m2392ja());
            }
            if (m3090q1(this.f34678T)) {
                TdApi.ScopeNotificationSettings scopeNotificationSettings2 = this.f34678T;
                if (scopeNotificationSettings2 != null) {
                    m3125h2(scopeNotificationSettings2);
                } else {
                    this.f34678T = m3082s1();
                }
                this.f34685a.m2270r4().m14783o(new TdApi.SetScopeNotificationSettings(new TdApi.NotificationSettingsScopeGroupChats(), this.f34678T), this.f34685a.m2392ja());
            }
            if (m3090q1(this.f34679U)) {
                TdApi.ScopeNotificationSettings scopeNotificationSettings3 = this.f34679U;
                if (scopeNotificationSettings3 != null) {
                    m3125h2(scopeNotificationSettings3);
                } else {
                    this.f34679U = m3082s1();
                }
                this.f34685a.m2270r4().m14783o(new TdApi.SetScopeNotificationSettings(new TdApi.NotificationSettingsScopeChannelChats(), this.f34679U), this.f34685a.m2392ja());
            }
            boolean z2 = C4868i.m24726c2().m24747Z4(false) || C4868i.m24726c2().m24691g5(true);
            if (C4868i.m24726c2().m24804R3()) {
                this.f34685a.m2930B4().m4802F2();
            }
            if (z2) {
                this.f34685a.m2930B4().m4666o2();
            }
        }
        m3162W1();
    }

    @Override
    public void mo1641h(int i) {
        if (C4862d.m24934w().m24933x() && C4862d.m24934w().m24932y()) {
            m3162W1();
        }
    }

    public String m3127h0(long j) {
        C4868i c2 = C4868i.m24726c2();
        return c2.m24848L1(m3118j1("custom_call_ringtone_" + j), null);
    }

    public boolean m3126h1(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f34687b.m3942I(i);
        }
        return false;
    }

    public String m3123i0(long j) {
        C4868i c2 = C4868i.m24726c2();
        return c2.m24848L1(m3118j1("custom_call_ringtone_name_" + j), null);
    }

    public boolean m3122i1(long j) {
        int r0 = m3087r0(j, 0);
        if (r0 == 0) {
            r0 = m3059y0(m3117j2(j));
        }
        return r0 != 3;
    }

    public final void m3121i2() {
    }

    public String m3119j0(long j) {
        C4868i c2 = C4868i.m24726c2();
        return c2.m24848L1(m3118j1("custom_call_ringtone_path_" + j), null);
    }

    public final String m3118j1(String str) {
        return m3114k1(str, this.f34685a.m2188w6());
    }

    public TdApi.NotificationSettingsScope m3117j2(long j) {
        switch (C7316a.m17057d(j)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                return this.f34685a.m2299p7(j) ? m3105m2() : m3109l2();
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return m3101n2();
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return m3105m2();
            default:
                throw new RuntimeException();
        }
    }

    public int m3115k0(long j) {
        C4868i c2 = C4868i.m24726c2();
        return c2.m24779V0(m3118j1("custom_call_vibrate_" + j), 0);
    }

    public TdApi.NotificationSettingsScope m3113k2(TdApi.Chat chat) {
        switch (chat.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                return C4779t2.m25699E3(chat.type) ? m3105m2() : m3109l2();
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return m3101n2();
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return m3105m2();
            default:
                throw new RuntimeException();
        }
    }

    public boolean m3111l0(long j) {
        if (!C4183a.f14102t) {
            return false;
        }
        C4868i c2 = C4868i.m24726c2();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("custom_call_vibrate_onlysilent_");
        sb2.append(j);
        return c2.m24632o0(m3118j1(sb2.toString()), false);
    }

    public TdApi.NotificationSettingsScope m3109l2() {
        return this.f34676R.f34163b;
    }

    public int m3107m0(long j, int i) {
        C4868i c2 = C4868i.m24726c2();
        return m3152a0(null, j, c2.m24779V0(m3118j1("custom_led_" + j), i));
    }

    public TdApi.User m3106m1() {
        return this.f34700m0;
    }

    public TdApi.NotificationSettingsScope m3105m2() {
        return this.f34675Q.f34163b;
    }

    public int m3103n0(long j, int i) {
        C4868i c2 = C4868i.m24726c2();
        return m3149b0(null, j, c2.m24779V0(m3118j1(f34660n0 + j), i));
    }

    public long m3102n1() {
        return this.f34699l0;
    }

    public TdApi.NotificationSettingsScope m3101n2() {
        return this.f34674P.f34163b;
    }

    public String m3099o0(long j, String str) {
        return m3146c0(null, j, m3211I0(j, str));
    }

    public boolean m3098o1(long j, boolean z) {
        TdApi.ScopeNotificationSettings scopeNotificationSettings;
        TdApi.ScopeNotificationSettings scopeNotificationSettings2;
        TdApi.ScopeNotificationSettings scopeNotificationSettings3;
        if (!C4183a.f14105w || !m3141d1(j, z)) {
            return false;
        }
        return (C7316a.m17049l(j) || z) ? this.f34674P.m4322j() && (scopeNotificationSettings = this.f34677S) != null && scopeNotificationSettings.showPreview : this.f34685a.m2784K6(j) ? this.f34676R.m4322j() && (scopeNotificationSettings3 = this.f34679U) != null && scopeNotificationSettings3.showPreview : this.f34675Q.m4322j() && (scopeNotificationSettings2 = this.f34678T) != null && scopeNotificationSettings2.showPreview;
    }

    public final void m3097o2(Message message, Runnable runnable) {
        this.f34685a.m2912C6();
        this.f34689c.m28050h(message, 0L);
        m3147b2(runnable);
    }

    public String m3095p0(long j) {
        String o0 = m3099o0(j, null);
        if (C5070i.m24061i(o0)) {
            return o0;
        }
        C4868i c2 = C4868i.m24726c2();
        String L1 = c2.m24848L1(m3118j1("custom_sound_" + j), null);
        C4868i c22 = C4868i.m24726c2();
        return m3142d0(L1, c22.m24848L1(m3118j1("custom_sound_name_" + j), null), o0);
    }

    public boolean m3094p1() {
        return m3129g1() && !m3163W0();
    }

    public boolean m3093p2(String str, String str2, String str3) {
        if (C5070i.m24067c(str, m3176S()) && C5070i.m24067c(str2, m3170U()) && C5070i.m24067c(str3, m3167V())) {
            return false;
        }
        this.f34686a0 = str;
        this.f34682X = true;
        this.f34688b0 = str2;
        this.f34683Y = true;
        this.f34690c0 = str3;
        this.f34684Z = true;
        LevelDB W = C4868i.m24726c2().m24773W();
        if (str == null) {
            W.remove(m3118j1("voice_ringtone"));
            W.remove(m3118j1("voice_ringtone_name"));
            W.remove(m3118j1("voice_ringtone_path"));
        } else {
            W.putString(m3118j1("voice_ringtone"), str);
            if (C5070i.m24061i(str2)) {
                W.remove(m3118j1("voice_ringtone_name"));
            } else {
                W.putString(m3118j1("voice_ringtone_name"), str2);
            }
            if (C5070i.m24061i(str3)) {
                W.remove(m3118j1("voice_ringtone_path"));
            } else {
                W.putString(m3118j1("voice_ringtone_path"), str3);
            }
        }
        W.apply();
        return true;
    }

    public String m3091q0(long j) {
        String o0 = m3099o0(j, null);
        if (C5070i.m24061i(o0)) {
            return o0;
        }
        C4868i c2 = C4868i.m24726c2();
        return c2.m24848L1(m3118j1("custom_sound_path_" + j), null);
    }

    public boolean m3089q2(int i, boolean z) {
        if (m3164W() == i && m3158Y() == z) {
            return false;
        }
        this.f34680V = Integer.valueOf(i);
        this.f34681W = Boolean.valueOf(z);
        C4868i.m24726c2().m24773W().putInt(m3118j1("voice_vibrate"), i).putBoolean(m3118j1("voice_vibrate_onlysilent"), z).apply();
        return true;
    }

    public int m3087r0(long j, int i) {
        C4868i c2 = C4868i.m24726c2();
        return m3134f0(null, j, c2.m24779V0(m3118j1("custom_vibrate_" + j), i));
    }

    public boolean m3086r1() {
        return m3209I2() || Build.VERSION.SDK_INT < 23 || Settings.System.getInt(C1379j0.m37309q().getContentResolver(), "vibrate_when_ringing", 0) != 0;
    }

    public void m3085r2(long j, String str, String str2, String str3) {
        if (str == null) {
            LevelDB W = C4868i.m24726c2().m24773W();
            SharedPreferences.Editor remove = W.remove(m3118j1("custom_call_ringtone_" + j));
            SharedPreferences.Editor remove2 = remove.remove(m3118j1("custom_call_ringtone_name_" + j));
            remove2.remove(m3118j1("custom_call_ringtone_path_" + j)).apply();
            return;
        }
        LevelDB W2 = C4868i.m24726c2().m24773W();
        W2.putString(m3118j1("custom_call_ringtone_" + j), str);
        if (C5070i.m24061i(str2)) {
            W2.remove(m3118j1("custom_call_ringtone_name_" + j));
        } else {
            W2.putString(m3118j1("custom_call_ringtone_name_" + j), str2);
        }
        if (C5070i.m24061i(str3)) {
            W2.remove(m3118j1("custom_call_ringtone_path_" + j));
        } else {
            W2.putString(m3118j1("custom_call_ringtone_path_" + j), str3);
        }
        W2.apply();
    }

    public boolean m3083s0(long j) {
        if (!C4183a.f14102t) {
            return false;
        }
        C4868i c2 = C4868i.m24726c2();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("custom_vibrate_onlysilent_");
        sb2.append(j);
        return c2.m24632o0(m3118j1(sb2.toString()), false);
    }

    public void m3081s2(long j, int i, boolean z) {
        if (i == 0) {
            LevelDB W = C4868i.m24726c2().m24773W();
            SharedPreferences.Editor remove = W.remove(m3118j1("custom_call_vibrate_" + j));
            remove.remove(m3118j1("custom_call_vibrate_onlysilent_" + j)).apply();
        } else if (C4183a.f14102t) {
            LevelDB W2 = C4868i.m24726c2().m24773W();
            SharedPreferences.Editor putInt = W2.putInt(m3118j1("custom_call_vibrate_" + j), i);
            putInt.putBoolean(m3118j1("custom_call_vibrate_onlysilent_" + j), z).apply();
        } else {
            C4868i c2 = C4868i.m24726c2();
            c2.m24581u3(m3118j1("custom_call_vibrate_" + j), i);
        }
    }

    public int m3079t0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return m3152a0(notificationSettingsScope, 0L, m3223F0(notificationSettingsScope).m4329c());
    }

    public void m3078t1(long j) {
        if (C7316a.m17051j(j)) {
            m3097o2(Message.obtain(this.f34689c.m28053d(), 13, C5063c.m24133m(j), C5063c.m24132n(j), this), null);
        }
    }

    public void m3077t2(long j, int i) {
        int m0 = m3107m0(j, 0);
        LevelDB W = C4868i.m24726c2().m24773W();
        if (i == 0) {
            W.remove(m3118j1("custom_led_" + j));
        } else {
            W.putInt(m3118j1("custom_led_" + j), i);
        }
        if (Build.VERSION.SDK_INT < 26 || i == m0) {
            W.apply();
        } else {
            m3157Y0(null, j, W);
        }
    }

    public int m3075u0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return m3149b0(notificationSettingsScope, 0L, m3223F0(notificationSettingsScope).m4328d());
    }

    public final void m3074u1(long j) {
        this.f34687b.m3935P(j);
    }

    public void m3073u2(long j, int i) {
        int n0 = m3103n0(j, -100);
        LevelDB W = C4868i.m24726c2().m24773W();
        if (i == -100) {
            W.remove(m3118j1(f34660n0 + j));
        } else {
            W.putInt(m3118j1(f34660n0 + j), i);
        }
        if (Build.VERSION.SDK_INT < 26 || n0 == i) {
            W.apply();
        } else {
            m3157Y0(null, j, W);
        }
    }

    public String m3071v0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return m3146c0(notificationSettingsScope, 0L, m3207J0(notificationSettingsScope));
    }

    public void m3070v1(boolean z) {
        C10828a aVar = this.f34689c;
        aVar.m28050h(Message.obtain(aVar.m28053d(), 14, z ? 1 : 0, 0, this), 0L);
    }

    public void m3069v2(long j, String str, String str2, String str3) {
        String R = m3179R(str);
        String o0 = m3099o0(j, null);
        LevelDB W = C4868i.m24726c2().m24773W();
        if (R == null) {
            W.remove(m3118j1("custom_sound_" + j));
        } else {
            W.putString(m3118j1("custom_sound_" + j), R);
        }
        if (C5070i.m24061i(str2)) {
            W.remove(m3118j1("custom_sound_name_" + j));
        } else {
            W.putString(m3118j1("custom_sound_name_" + j), str2);
        }
        if (C5070i.m24061i(str3)) {
            W.remove(m3118j1("custom_sound_path_" + j));
        } else {
            W.putString(m3118j1("custom_sound_path_" + j), str3);
        }
        if (Build.VERSION.SDK_INT < 26 || m3212I(R, o0)) {
            W.apply();
        } else {
            m3157Y0(null, j, W);
        }
    }

    public String m3067w0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        C10677g1 F0 = m3223F0(notificationSettingsScope);
        return m3142d0(F0.m4327e(), F0.m4326f(), m3071v0(notificationSettingsScope));
    }

    public final void m3066w1(boolean z) {
        this.f34687b.m3934Q(z);
    }

    public void m3065w2(long j, int i, boolean z) {
        int r0 = m3087r0(j, 0);
        LevelDB W = C4868i.m24726c2().m24773W();
        if (i == 0) {
            W.remove(m3118j1("custom_vibrate_" + j));
            if (C4183a.f14102t) {
                W.remove(m3118j1("custom_vibrate_onlysilent_" + j));
            }
        } else {
            W.putInt(m3118j1("custom_vibrate_" + j), i);
            if (C4183a.f14102t) {
                W.putBoolean(m3118j1("custom_vibrate_onlysilent_" + j), z);
            }
        }
        if (Build.VERSION.SDK_INT < 26 || r0 == i) {
            W.apply();
        } else {
            m3157Y0(null, j, W);
        }
    }

    public boolean m3064x(long j) {
        if (m3244A()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f34697j0 >= 800 || currentTimeMillis - this.f34698k0 >= 5000) {
            this.f34698k0 = currentTimeMillis;
            this.f34697j0 = currentTimeMillis;
            return true;
        }
        this.f34697j0 = currentTimeMillis;
        return false;
    }

    public String m3063x0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return m3223F0(notificationSettingsScope).m4325g();
    }

    public void m3062x1(C10666fb fbVar) {
        m3097o2(Message.obtain(this.f34689c.m28053d(), 9, new Object[]{this, fbVar}), null);
    }

    public void m3061x2(TdApi.NotificationSettingsScope notificationSettingsScope, boolean z) {
        TdApi.ScopeNotificationSettings M0 = m3195M0(notificationSettingsScope);
        if (M0 != null) {
            M0.disableMentionNotifications = z;
            this.f34685a.m2358lc(notificationSettingsScope, M0);
        }
    }

    public boolean m3060y() {
        if (this.f34672N == null) {
            this.f34672N = Boolean.valueOf(C4868i.m24726c2().m24632o0(m3114k1("inapp_chatSounds", this.f34685a.m2188w6()), true));
        }
        return this.f34672N.booleanValue();
    }

    public int m3059y0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return m3134f0(notificationSettingsScope, 0L, m3223F0(notificationSettingsScope).m4324h());
    }

    public void m3058y1(int i) {
        C10828a aVar = this.f34689c;
        aVar.m28050h(Message.obtain(aVar.m28053d(), 8, i, 0, this), 0L);
    }

    public void m3057y2(TdApi.NotificationSettingsScope notificationSettingsScope, boolean z) {
        TdApi.ScopeNotificationSettings M0 = m3195M0(notificationSettingsScope);
        if (M0 != null) {
            M0.disablePinnedMessageNotifications = z;
            this.f34685a.m2358lc(notificationSettingsScope, M0);
        }
    }

    public boolean m3056z(long j) {
        TdApi.ChatNotificationSettings I3 = this.f34685a.m2819I3(j);
        if (I3 == null || I3.useDefaultDisableMentionNotifications) {
            return m3204K(j);
        }
        return I3.disableMentionNotifications;
    }

    public boolean m3055z0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        if (C4183a.f14102t) {
            return m3223F0(notificationSettingsScope).m4323i();
        }
        return false;
    }

    public final void m3054z1(int i) {
        this.f34687b.m3931T(i);
    }

    public boolean m3053z2(TdApi.NotificationSettingsScope notificationSettingsScope, int i) {
        if (m3079t0(notificationSettingsScope) == i) {
            return false;
        }
        C10677g1 F0 = m3223F0(notificationSettingsScope);
        F0.m4318n(i);
        LevelDB W = C4868i.m24726c2().m24773W();
        if (i != f34668v0) {
            W.putInt(F0.m4313s("_led"), i);
        } else {
            W.remove(F0.m4313s("_led"));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            m3157Y0(notificationSettingsScope, 0L, W);
            return true;
        }
        W.apply();
        return true;
    }
}
