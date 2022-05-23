package zd;

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
import ce.j0;
import d.j;
import de.nb;
import de.rh;
import gd.m;
import gd.w;
import hd.t2;
import he.d;
import ib.c;
import ib.i;
import java.util.Arrays;
import kd.j1;
import me.vkryl.leveldb.LevelDB;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.sync.SyncAdapter;
import p0.k;
import ud.v4;

public class jb implements j0.a, d.a, j0 {
    public static final String f27795n0;
    public static final String f27796o0;
    public static final int f27797p0;
    public static final long[] f27798q0;
    public static final long[] f27799r0;
    public static final long[] f27800s0;
    public static final long[] f27801t0;
    public static final int[] f27802u0;
    public static final int f27803v0;
    public static final int[] f27804w0;
    public static final int[] f27805x0;
    public AudioManager M;
    public Boolean N;
    public Integer O;
    public final e1 P;
    public final e1 Q;
    public final e1 R;
    public TdApi.ScopeNotificationSettings S;
    public TdApi.ScopeNotificationSettings T;
    public TdApi.ScopeNotificationSettings U;
    public Integer V;
    public Boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final o6 f27806a;
    public String f27807a0;
    public final hb f27808b;
    public String f27809b0;
    public final a f27810c;
    public String f27811c0;
    public Integer f27812d0;
    public cb f27813e0;
    public long f27814f0;
    public SoundPool f27815g0;
    public long f27818j0;
    public long f27819k0;
    public long f27820l0;
    public TdApi.User f27821m0;
    public final SparseIntArray f27817i0 = new SparseIntArray();
    public final SparseIntArray f27816h0 = new SparseIntArray();

    public static class a extends m {
        public final ya M;

        public a(String str, ya yaVar) {
            super(str);
            this.M = yaVar;
        }

        @Override
        public void f(Message message) {
            boolean z10 = false;
            switch (message.what) {
                case 0:
                    ((jb) message.obj).S1(message.arg1, message.arg2);
                    return;
                case 1:
                    ((jb) message.obj).W1();
                    return;
                case 2:
                    if (Build.VERSION.SDK_INT >= 26) {
                        o6 o6Var = ((jb) message.obj).f27806a;
                        cb.a(this.M);
                        o6Var.ka().J();
                        cb.b(o6Var);
                        return;
                    }
                    return;
                case 3:
                    ((jb) message.obj).K1(c.f(message.arg1, message.arg2));
                    return;
                case 4:
                    Object[] objArr = (Object[]) message.obj;
                    ((jb) objArr[0]).T1((TdApi.UpdateActiveNotifications) objArr[1]);
                    objArr[1] = null;
                    objArr[0] = null;
                    return;
                case 5:
                default:
                    return;
                case 6:
                    Object[] objArr2 = (Object[]) message.obj;
                    ((jb) objArr2[0]).V1((TdApi.UpdateNotificationGroup) objArr2[1]);
                    objArr2[1] = null;
                    objArr2[0] = null;
                    return;
                case 7:
                    Object[] objArr3 = (Object[]) message.obj;
                    ((jb) objArr3[0]).U1((TdApi.UpdateNotification) objArr3[1]);
                    objArr3[1] = null;
                    objArr3[0] = null;
                    return;
                case 8:
                    ((jb) message.obj).z1(message.arg1);
                    return;
                case 9:
                    Object[] objArr4 = (Object[]) message.obj;
                    ((jb) objArr4[0]).A1((db) objArr4[1]);
                    objArr4[1] = null;
                    objArr4[0] = null;
                    return;
                case 10:
                    Object[] objArr5 = (Object[]) message.obj;
                    ((jb) objArr5[0]).a2((TdApi.NotificationSettingsScope) objArr5[1]);
                    objArr5[1] = null;
                    objArr5[0] = null;
                    return;
                case 11:
                    ((jb) message.obj).Z1(c.f(message.arg1, message.arg2));
                    return;
                case 12:
                    cb.a(this.M);
                    return;
                case 13:
                    ((jb) message.obj).u1(c.f(message.arg1, message.arg2));
                    return;
                case 14:
                    jb jbVar = (jb) message.obj;
                    if (message.arg1 == 1) {
                        z10 = true;
                    }
                    jbVar.w1(z10);
                    return;
                case 15:
                    ((jb) message.obj).f27806a.K4();
                    return;
                case 16:
                    Object[] objArr6 = (Object[]) message.obj;
                    ((Runnable) objArr6[1]).run();
                    ((jb) objArr6[0]).f27806a.K4();
                    objArr6[1] = null;
                    objArr6[0] = null;
                    return;
                case 17:
                    ((jb) message.obj).G1(c.f(message.arg1, message.arg2));
                    return;
                case 18:
                    Object[] objArr7 = (Object[]) message.obj;
                    ((jb) objArr7[0]).H1((TdApi.User) objArr7[1]);
                    objArr7[1] = null;
                    objArr7[0] = null;
                    return;
                case 19:
                    ((jb) message.obj).X1(message.arg1);
                    return;
                case 20:
                    ((jb) message.obj).B1();
                    return;
                case 21:
                    Object[] objArr8 = (Object[]) message.obj;
                    ((jb) objArr8[0]).d2((db) objArr8[1]);
                    objArr8[1] = null;
                    objArr8[0] = null;
                    return;
            }
        }

        public void i() {
            if (Build.VERSION.SDK_INT >= 26) {
                h(Message.obtain(d(), 12), 0L);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f27795n0 = i10 >= 26 ? "custom_importance_" : "custom_priority_";
        f27796o0 = i10 >= 26 ? "_importance" : "_priority";
        f27797p0 = i10 >= 26 ? 4 : 1;
        f27798q0 = new long[]{0, 100, 0, 100};
        f27799r0 = new long[]{0, 1000};
        f27800s0 = new long[]{0, 140, 0, 140, 750};
        f27801t0 = new long[]{0, 1000, 1000};
        int[] iArr = {-1, -16776961, -65536, -29183, -256, -16711936, -16711681, -2984711, -65281};
        f27802u0 = iArr;
        f27803v0 = iArr[1];
        f27804w0 = new int[]{R.id.theme_color_ledWhite, R.id.theme_color_ledBlue, R.id.theme_color_ledRed, R.id.theme_color_ledOrange, R.id.theme_color_ledYellow, R.id.theme_color_ledGreen, R.id.theme_color_ledCyan, R.id.theme_color_ledPurple, R.id.theme_color_ledPink};
        f27805x0 = new int[]{R.string.LedWhite, R.string.LedBlue, R.string.LedRed, R.string.LedOrange, R.string.LedYellow, R.string.LedGreen, R.string.LedCyan, R.string.LedPurple, R.string.LedPink};
    }

    public jb(o6 o6Var, a aVar) {
        this.f27806a = o6Var;
        this.f27810c = aVar;
        o6Var.O9().l(this);
        this.f27808b = new hb(this, o6Var);
        int A6 = o6Var.A6();
        this.P = new e1(A6, new TdApi.NotificationSettingsScopePrivateChats());
        this.Q = new e1(A6, new TdApi.NotificationSettingsScopeGroupChats());
        this.R = new e1(A6, new TdApi.NotificationSettingsScopeChannelChats());
        j0.d(this);
        d.w().a(this);
    }

    public static boolean A() {
        return j1.y().z();
    }

    public static int G(o6 o6Var) {
        return (o6Var.A6() * 32767) + 1;
    }

    public static boolean I(String str, String str2) {
        return (str == null) == (str2 == null) && i.c(str, str2);
    }

    public static android.net.Uri Q(android.net.Uri r10, boolean r11, java.lang.String r12) {
        throw new UnsupportedOperationException("Method not decompiled: zd.jb.Q(android.net.Uri, boolean, java.lang.String):android.net.Uri");
    }

    public static String R(String str) {
        if (i.i(str)) {
            return str;
        }
        try {
            Uri Q = Q(Uri.parse(str), false, null);
            if (Q == null) {
                return null;
            }
            return Q.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static void h2(TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        scopeNotificationSettings.showPreview = true;
        scopeNotificationSettings.muteFor = 0;
        scopeNotificationSettings.disablePinnedMessageNotifications = false;
        scopeNotificationSettings.disableMentionNotifications = false;
    }

    public static String k1(String str, int i10) {
        if (i10 == 0) {
            return str;
        }
        return "account" + i10 + "_" + str;
    }

    public static void l1(SoundPool soundPool, int i10, int i11) {
        if (i11 == 0) {
            soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    public static boolean q1(TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        return scopeNotificationSettings == null || !scopeNotificationSettings.showPreview || scopeNotificationSettings.muteFor != 0 || scopeNotificationSettings.disableMentionNotifications || scopeNotificationSettings.disablePinnedMessageNotifications;
    }

    public static TdApi.ScopeNotificationSettings s1() {
        return new TdApi.ScopeNotificationSettings(0, 0L, true, false, false);
    }

    public int A0(long j10) {
        int m02 = m0(j10, 0);
        return m02 != 0 ? m02 : t0(j2(j10));
    }

    public final void A1(db dbVar) {
        this.f27808b.S(dbVar);
    }

    public boolean A2(TdApi.NotificationSettingsScope notificationSettingsScope, int i10) {
        if (u0(notificationSettingsScope) == i10) {
            return false;
        }
        e1 F0 = F0(notificationSettingsScope);
        F0.p(i10);
        LevelDB W = he.i.c2().W();
        if (i10 != f27797p0) {
            W.putInt(F0.s(f27796o0), i10);
        } else {
            W.remove(F0.s(f27796o0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Y0(notificationSettingsScope, 0L, W);
            return true;
        }
        W.apply();
        return true;
    }

    public boolean B(long j10, boolean z10) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        int n02 = n0(j10, -100);
        return n02 == 0 || (n02 == -100 && C(j2(j10)));
    }

    public int B0(long j10) {
        int n02 = n0(j10, -100);
        return n02 != -100 ? n02 : u0(j2(j10));
    }

    public final void B1() {
        this.f27808b.V();
    }

    public void B2(TdApi.NotificationSettingsScope notificationSettingsScope, boolean z10) {
        TdApi.ScopeNotificationSettings M0 = M0(notificationSettingsScope);
        if (M0 != null) {
            M0.showPreview = z10;
            this.f27806a.pc(notificationSettingsScope, M0);
        }
    }

    public boolean C(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return Build.VERSION.SDK_INT >= 26 && u0(notificationSettingsScope) == 0;
    }

    public String C0(long j10) {
        String o02 = o0(j10, null);
        return o02 == null ? E0(j10).e() : o02;
    }

    public void C1(TdApi.UpdateActiveNotifications updateActiveNotifications, Runnable runnable) {
        o2(Message.obtain(this.f27810c.d(), 4, new Object[]{this, updateActiveNotifications}), runnable);
    }

    public boolean C2(TdApi.NotificationSettingsScope notificationSettingsScope, String str, String str2, String str3) {
        String R = R(str);
        e1 F0 = F0(notificationSettingsScope);
        if (I(F0.e(), R) && i.c(F0.f(), str2) && i.c(F0.g(), str3)) {
            return false;
        }
        F0.q(R, str2, str3);
        LevelDB W = he.i.c2().W();
        if (R != null) {
            W.putString(F0.s("_sounds"), R);
        } else {
            W.remove(F0.s("_sounds"));
        }
        if (i.i(R) || str2 == null) {
            W.remove(F0.s("_sounds_name"));
        } else {
            W.putString(F0.s("_sounds_name"), str2);
        }
        if (i.i(R) || str3 == null) {
            W.remove(F0.s("_sounds_path"));
        } else {
            W.putString(F0.s("_sounds_path"), str3);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Y0(notificationSettingsScope, 0L, W);
            return true;
        }
        W.apply();
        return true;
    }

    public boolean D() {
        switch (G0()) {
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

    public int D0(long r8) {
        throw new UnsupportedOperationException("Method not decompiled: zd.jb.D0(long):int");
    }

    public void D1(TdApi.UpdateMessageSendSucceeded updateMessageSendSucceeded) {
        v4<?> v4Var;
        int constructor;
        TdApi.Message message = updateMessageSendSucceeded.message;
        try {
            v4Var = j0.s();
        } catch (IndexOutOfBoundsException unused) {
            v4Var = null;
        }
        if ((((v4Var instanceof rh) && ((rh) v4Var).yj(message.chatId)) || (v4Var instanceof nb)) && !v4Var.Xa() && (constructor = message.content.getConstructor()) != -1564971605 && constructor != 1810060209) {
            R1();
        }
    }

    public boolean D2(TdApi.NotificationSettingsScope notificationSettingsScope, int i10, boolean z10) {
        if (y0(notificationSettingsScope) == i10 && (!fd.a.f11898t || z0(notificationSettingsScope) == z10)) {
            return false;
        }
        e1 F0 = F0(notificationSettingsScope);
        F0.r(i10, z10);
        LevelDB W = he.i.c2().W();
        if (i10 != 0) {
            W.putInt(F0.s("_vibrate"), i10);
        } else {
            W.remove(F0.s("_vibrate"));
        }
        if (fd.a.f11898t) {
            if (z10) {
                W.putBoolean(F0.s("_vibrate_onlysilent"), z10);
            } else {
                W.remove(F0.s("_vibrate_onlysilent"));
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Y0(notificationSettingsScope, 0L, W);
            return true;
        }
        W.apply();
        return true;
    }

    public boolean E(long j10) {
        TdApi.ChatNotificationSettings M3 = this.f27806a.M3(j10);
        if (M3 == null || M3.useDefaultDisablePinnedMessageNotifications) {
            return M(j10);
        }
        return M3.disablePinnedMessageNotifications;
    }

    public e1 E0(long j10) {
        switch (ob.a.d(j10)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                return this.f27806a.t7(j10) ? this.Q : this.R;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return this.P;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return this.Q;
            default:
                throw new RuntimeException("chatId == " + j10);
        }
    }

    public void E1(TdApi.User user) {
        o2(Message.obtain(this.f27810c.d(), 18, new Object[]{this, user}), null);
    }

    public void E2(long j10, boolean z10) {
        TdApi.ChatNotificationSettings M3 = this.f27806a.M3(j10);
        boolean M = M(j10);
        if (M3 != null) {
            M3.useDefaultDisablePinnedMessageNotifications = z10 == M;
            M3.disablePinnedMessageNotifications = z10;
            this.f27806a.Pb(j10, M3);
        }
    }

    public final AudioManager F() {
        if (this.M == null) {
            try {
                this.M = (AudioManager) j0.n().getSystemService("audio");
            } catch (Throwable th) {
                Log.e(4, "Context.AUDIO_SERVICE is not available", th, new Object[0]);
            }
        }
        return this.M;
    }

    public e1 F0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor == 548013448) {
            return this.R;
        }
        if (constructor == 937446759) {
            return this.P;
        }
        if (constructor == 1212142067) {
            return this.Q;
        }
        throw new RuntimeException();
    }

    public void F1(long j10) {
        o2(Message.obtain(this.f27810c.d(), 17, c.m(j10), c.n(j10), this), null);
    }

    public void F2(long j10, boolean z10) {
        TdApi.ChatNotificationSettings M3 = this.f27806a.M3(j10);
        boolean K = K(j10);
        if (M3 != null) {
            M3.useDefaultDisableMentionNotifications = z10 == K;
            M3.disableMentionNotifications = z10;
            this.f27806a.Pb(j10, M3);
        }
    }

    public int G0() {
        NotificationChannelGroup notificationChannelGroup;
        if (Build.VERSION.SDK_INT >= 28 && this.f27806a.fa() != 0 && (notificationChannelGroup = (NotificationChannelGroup) P0()) != null && notificationChannelGroup.isBlocked()) {
            return 1;
        }
        if (!k.d(j0.n()).a()) {
            return 2;
        }
        if (!W0()) {
            if (g1()) {
                return 3;
            }
            return f1() ? 4 : 5;
        } else if (this.f27806a.tc().O()) {
            return 6;
        } else {
            return (this.f27806a.A1().l() || !he.i.c2().F(16)) ? 0 : 7;
        }
    }

    public final void G1(long j10) {
        this.f27820l0 = j10;
        if (j10 == 0) {
            this.f27821m0 = null;
        }
    }

    public boolean G2(int i10) {
        if (H0() == i10) {
            return false;
        }
        this.f27812d0 = Integer.valueOf(i10);
        he.i.c2().u3(j1("repeat_notification_minutes"), i10);
        if (i10 == 0) {
            H();
            return true;
        }
        i2();
        return true;
    }

    public final void H() {
    }

    public int H0() {
        if (this.f27812d0 == null) {
            this.f27812d0 = Integer.valueOf(he.i.c2().V0(k1("repeat_notification_minutes", this.f27806a.A6()), j.L0));
        }
        return this.f27812d0.intValue();
    }

    public final void H1(TdApi.User user) {
        this.f27821m0 = user;
    }

    public void H2(long j10, boolean z10) {
        TdApi.ChatNotificationSettings M3 = this.f27806a.M3(j10);
        boolean O = O(j10);
        if (M3 != null) {
            M3.useDefaultShowPreview = z10 == O;
            M3.showPreview = z10;
            this.f27806a.Pb(j10, M3);
        }
    }

    public String I0(long j10, String str) {
        he.i c22 = he.i.c2();
        return R(c22.L1(j1("custom_sound_" + j10), str));
    }

    public void I1(TdApi.UpdateNewMessage updateNewMessage) {
        TdApi.Message message = updateNewMessage.message;
        if (!message.isOutgoing && message.sendingState == null) {
            v4<?> v4Var = null;
            try {
                v4Var = j0.s();
            } catch (IndexOutOfBoundsException unused) {
            }
            if ((v4Var instanceof rh) && v4Var.Za(this.f27806a)) {
                long Sj = ((rh) v4Var).Sj();
                if (Sj != 0 && updateNewMessage.message.chatId == Sj && this.f27806a.x3(Sj)) {
                    TdApi.ChatMemberStatus O3 = this.f27806a.O3(updateNewMessage.message.chatId);
                    if (O3 == null || t2.h3(O3)) {
                        Q1();
                    }
                }
            }
        }
    }

    public boolean I2() {
        if (F() != null) {
            try {
                return F().getRingerMode() == 1;
            } catch (Throwable th) {
                Log.w(th);
            }
        }
        return true;
    }

    public void J() {
        if (Build.VERSION.SDK_INT >= 26 && this.f27806a.ga(true) != 0) {
            Z().c(this.f27806a.da());
        }
    }

    public String J0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return R(F0(notificationSettingsScope).e());
    }

    public void J1(TdApi.UpdateNotification updateNotification) {
        o2(Message.obtain(this.f27810c.d(), 7, new Object[]{this, updateNotification}), null);
    }

    public o6 J2() {
        return this.f27806a;
    }

    public boolean K(long j10) {
        TdApi.ScopeNotificationSettings K0 = K0(j10);
        return K0 != null && K0.disableMentionNotifications;
    }

    public TdApi.ScopeNotificationSettings K0(long j10) {
        return M0(j2(j10));
    }

    public void K1(long j10) {
        Thread currentThread = Thread.currentThread();
        a aVar = this.f27810c;
        if (currentThread != aVar) {
            o2(Message.obtain(aVar.d(), 3, c.m(j10), c.n(j10), this), null);
        } else {
            f2(j10);
        }
    }

    public void K2(TdApi.NotificationSettingsScope notificationSettingsScope) {
        e1 F0 = F0(notificationSettingsScope);
        boolean z10 = !F0.j();
        F0.o(z10);
        he.i.c2().s3(F0.s("_content_preview"), z10);
    }

    public boolean L(TdApi.NotificationSettingsScope notificationSettingsScope) {
        TdApi.ScopeNotificationSettings M0 = M0(notificationSettingsScope);
        return M0 != null && M0.disableMentionNotifications;
    }

    public TdApi.ScopeNotificationSettings L0(TdApi.Chat chat) {
        return M0(k2(chat));
    }

    public void L1(TdApi.UpdateNotificationGroup updateNotificationGroup) {
        o2(Message.obtain(this.f27810c.d(), 6, new Object[]{this, updateNotificationGroup}), null);
    }

    public void L2(TdApi.NotificationSettingsScope notificationSettingsScope) {
        B2(notificationSettingsScope, !P(notificationSettingsScope));
    }

    public boolean M(long j10) {
        TdApi.ScopeNotificationSettings K0 = K0(j10);
        return K0 != null && K0.disablePinnedMessageNotifications;
    }

    public TdApi.ScopeNotificationSettings M0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor == 548013448) {
            return this.U;
        }
        if (constructor == 937446759) {
            return this.S;
        }
        if (constructor == 1212142067) {
            return this.T;
        }
        throw new RuntimeException();
    }

    public void M1(TdApi.UpdateChatNotificationSettings updateChatNotificationSettings, long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        boolean O = O(j10);
        boolean z10 = chatNotificationSettings.useDefaultShowPreview ? O : chatNotificationSettings.showPreview;
        TdApi.ChatNotificationSettings chatNotificationSettings2 = updateChatNotificationSettings.notificationSettings;
        if (!chatNotificationSettings2.useDefaultShowPreview) {
            O = chatNotificationSettings2.showPreview;
        }
        if (z10 != O) {
            O1(updateChatNotificationSettings.chatId);
        }
    }

    public void M2() {
        this.N = Boolean.valueOf(!y());
        he.i.c2().s3(j1("inapp_chatSounds"), this.N.booleanValue());
    }

    public boolean N(TdApi.NotificationSettingsScope notificationSettingsScope) {
        TdApi.ScopeNotificationSettings M0 = M0(notificationSettingsScope);
        return M0 != null && M0.disablePinnedMessageNotifications;
    }

    @TargetApi(26)
    public Object N0(TdApi.NotificationSettingsScope notificationSettingsScope, long j10) {
        NotificationManager notificationManager;
        String Q0;
        if (Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) j0.n().getSystemService("notification")) == null || (Q0 = Q0(notificationSettingsScope, j10)) == null) {
            return null;
        }
        return notificationManager.getNotificationChannel(Q0);
    }

    public void N1(TdApi.UpdateScopeNotificationSettings updateScopeNotificationSettings) {
        TdApi.NotificationSettingsScope notificationSettingsScope = updateScopeNotificationSettings.scope;
        TdApi.ScopeNotificationSettings scopeNotificationSettings = updateScopeNotificationSettings.notificationSettings;
        TdApi.ScopeNotificationSettings M0 = M0(notificationSettingsScope);
        boolean z10 = (M0 == null || M0.showPreview == scopeNotificationSettings.showPreview) ? false : true;
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor == 548013448) {
            this.U = scopeNotificationSettings;
        } else if (constructor == 937446759) {
            this.S = scopeNotificationSettings;
        } else if (constructor == 1212142067) {
            this.T = scopeNotificationSettings;
        } else {
            throw new RuntimeException();
        }
        if (z10) {
            P1(notificationSettingsScope);
        }
    }

    public void N2(long j10) {
        H2(j10, !d1(j10, false));
    }

    public boolean O(long j10) {
        return !ob.a.j(j10) && P(j2(j10));
    }

    public Object O0(fb fbVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Z().j(fbVar, false);
        }
        return null;
    }

    public void O1(long j10) {
        o2(Message.obtain(this.f27810c.d(), 11, c.m(j10), c.n(j10), this), null);
    }

    public boolean P(TdApi.NotificationSettingsScope notificationSettingsScope) {
        TdApi.ScopeNotificationSettings M0 = M0(notificationSettingsScope);
        return M0 != null && M0.showPreview;
    }

    @TargetApi(26)
    public Object P0() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            long fa2 = this.f27806a.fa();
            if (fa2 == 0) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) j0.n().getSystemService("notification");
            String q10 = cb.q(fa2, this.f27806a.A1().G());
            if (i10 >= 28) {
                return notificationManager.getNotificationChannelGroup(q10);
            }
            for (NotificationChannelGroup notificationChannelGroup : notificationManager.getNotificationChannelGroups()) {
                if (q10.equals(notificationChannelGroup.getId())) {
                    return notificationChannelGroup;
                }
            }
        }
        return null;
    }

    public void P1(TdApi.NotificationSettingsScope notificationSettingsScope) {
        o2(Message.obtain(this.f27810c.d(), 10, new Object[]{this, notificationSettingsScope}), null);
    }

    @TargetApi(26)
    public String Q0(TdApi.NotificationSettingsScope notificationSettingsScope, long j10) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        long fa2 = this.f27806a.fa();
        if (fa2 == 0) {
            return null;
        }
        return cb.o(fa2, g0(), notificationSettingsScope, j10, e0(notificationSettingsScope, j10));
    }

    public final void Q1() {
        if (y()) {
            S1(R.raw.sound_in, 500);
        }
    }

    public boolean R0(long j10) {
        if (j10 == 0) {
            return false;
        }
        if (T0(j10) || S0(j10)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (((NotificationChannel) N0(null, j10)) != null) {
                return true;
            }
            if (B0(j10) < 3) {
                return false;
            }
        }
        return V0(j10) || U0(j10);
    }

    public final void R1() {
        if (y()) {
            S1(R.raw.sound_out, 100);
        }
    }

    public String S() {
        if (!this.X) {
            this.f27807a0 = he.i.c2().L1(k1("voice_ringtone", this.f27806a.A6()), null);
            this.X = true;
        }
        return this.f27807a0;
    }

    public boolean S0(long j10) {
        return m0(j10, 0) != 0;
    }

    public final void S1(int i10, int i11) {
        int i12;
        if (F() != null && !j1.y().z()) {
            Thread currentThread = Thread.currentThread();
            a aVar = this.f27810c;
            if (currentThread != aVar) {
                aVar.h(Message.obtain(aVar.d(), 0, i10, i11, this), 0L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.f27814f0;
            if (j10 == 0 || j10 <= currentTimeMillis) {
                try {
                    if (this.f27815g0 == null) {
                        SoundPool build = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).build()).build();
                        this.f27815g0 = build;
                        build.setOnLoadCompleteListener(ib.f27734a);
                    }
                    int i13 = this.f27817i0.get(i10);
                    if (i13 != 0 || this.f27816h0.get(i10) == 1) {
                        i12 = i13;
                    } else {
                        this.f27816h0.put(i10, 1);
                        SparseIntArray sparseIntArray = this.f27817i0;
                        i12 = this.f27815g0.load(j0.n(), i10, 1);
                        sparseIntArray.put(i10, i12);
                    }
                    if (i12 != 0) {
                        this.f27815g0.play(i12, 1.0f, 1.0f, 1, 0, 1.0f);
                        this.f27814f0 = currentTimeMillis + i11;
                        return;
                    }
                    this.f27814f0 = currentTimeMillis + i11 + 30;
                } catch (Throwable th) {
                    Log.e(4, "Unable to play raw sound", th, new Object[0]);
                }
            }
        }
    }

    public String T(long j10) {
        String h02 = h0(j10);
        if (h02 == null) {
            h02 = S();
        }
        return i.i(h02) ? RingtoneManager.getDefaultUri(1).toString() : h02;
    }

    public boolean T0(long j10) {
        return n0(j10, -100) != -100;
    }

    public final void T1(TdApi.UpdateActiveNotifications updateActiveNotifications) {
        this.f27808b.c0(updateActiveNotifications);
    }

    public String U() {
        if (!this.Y) {
            this.f27809b0 = he.i.c2().L1(k1("voice_ringtone_name", this.f27806a.A6()), null);
            this.Y = true;
        }
        return this.f27809b0;
    }

    public boolean U0(long j10) {
        return o0(j10, null) != null;
    }

    public final void U1(TdApi.UpdateNotification updateNotification) {
        this.f27808b.v(updateNotification);
    }

    public String V() {
        if (!this.Z) {
            this.f27811c0 = he.i.c2().L1(k1("voice_ringtone_path", this.f27806a.A6()), null);
            this.Z = true;
        }
        return this.f27811c0;
    }

    public boolean V0(long j10) {
        return r0(j10, 0) != 0;
    }

    public final void V1(TdApi.UpdateNotificationGroup updateNotificationGroup) {
        this.f27808b.e0(updateNotificationGroup);
    }

    public int W() {
        if (this.V == null) {
            this.V = Integer.valueOf(he.i.c2().V0(k1("voice_vibrate", this.f27806a.A6()), 0));
        }
        return this.V.intValue();
    }

    public final boolean W0() {
        return v0.l1(j0.n());
    }

    public final void W1() {
        Thread currentThread = Thread.currentThread();
        a aVar = this.f27810c;
        if (currentThread != aVar) {
            o2(Message.obtain(aVar.d(), 1, this), null);
        } else {
            Y1();
        }
    }

    public int X(long j10) {
        boolean z10;
        int k02 = k0(j10);
        if (k02 != 0) {
            z10 = l0(j10);
        } else {
            k02 = W();
            z10 = Y();
        }
        if (!z10 || F() == null) {
            return k02;
        }
        try {
            int ringerMode = F().getRingerMode();
            if (ringerMode == 0 || ringerMode == 1) {
                return k02;
            }
            return 3;
        } catch (Throwable th) {
            Log.e(4, "Cannot get ringer mode", th, new Object[0]);
            return k02;
        }
    }

    public boolean X0() {
        return D() || C(n2()) || C(m2()) || C(l2()) || !W0() || this.f27806a.ka().G0() == 7;
    }

    public final void X1(int i10) {
        this.f27808b.a0(i10);
    }

    public boolean Y() {
        if (this.W == null) {
            boolean z10 = false;
            if (fd.a.f11898t && he.i.c2().o0(k1("voice_vibrate_onlysilent", this.f27806a.A6()), false)) {
                z10 = true;
            }
            this.W = Boolean.valueOf(z10);
        }
        return this.W.booleanValue();
    }

    @TargetApi(26)
    public final void Y0(TdApi.NotificationSettingsScope notificationSettingsScope, long j10, LevelDB levelDB) {
        String str;
        long fa2 = this.f27806a.fa();
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        e1 F0 = i10 != 0 ? null : F0(notificationSettingsScope);
        if (i10 != 0) {
            str = j1("channels_version_custom_" + j10);
        } else {
            str = F0.k("channels_version_");
        }
        long e12 = i10 != 0 ? he.i.c2().e1(str, 0L) : F0.a();
        long j11 = e12 == Long.MAX_VALUE ? Long.MIN_VALUE : e12 + 1;
        levelDB.putLong(str, j11);
        if (i10 == 0) {
            F0.m(j11);
        }
        levelDB.apply();
        o6 o6Var = this.f27806a;
        cb.u(o6Var, fa2, o6Var.A1().G(), g0(), notificationSettingsScope, j10, j11);
        K1(fa2);
        if (i10 != 0) {
            this.f27806a.O9().B2(j10);
        } else {
            this.f27806a.O9().C2(notificationSettingsScope);
        }
    }

    public final void Y1() {
        this.f27808b.W();
    }

    public cb Z() {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        long ga2 = this.f27806a.ga(true);
        TdApi.User m12 = m1();
        if (ga2 == 0) {
            cb cbVar = this.f27813e0;
            if (cbVar != null) {
                return cbVar;
            }
            throw new IllegalStateException("Cannot retrieve accountUserId, required by channelGroup, authorizationStatus: " + this.f27806a.T1());
        }
        cb cbVar2 = this.f27813e0;
        if (cbVar2 == null || cbVar2.g() != ga2) {
            o6 o6Var = this.f27806a;
            this.f27813e0 = new cb(o6Var, ga2, o6Var.A1().G(), m12);
        }
        return this.f27813e0;
    }

    public boolean Z0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return fd.a.f11901w && F0(notificationSettingsScope).j();
    }

    public final void Z1(long j10) {
        this.f27808b.Z(j10);
    }

    @Override
    public void a() {
        a aVar = this.f27810c;
        aVar.h(Message.obtain(aVar.d(), 20, this), 0L);
    }

    public final int a0(TdApi.NotificationSettingsScope notificationSettingsScope, long j10, int i10) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = (NotificationChannel) N0(notificationSettingsScope, j10)) == null) {
            return i10;
        }
        if (notificationChannel.shouldShowLights()) {
            return notificationChannel.getLightColor();
        }
        return 0;
    }

    public boolean a1(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return !"".equals(v0(notificationSettingsScope));
    }

    public final void a2(TdApi.NotificationSettingsScope notificationSettingsScope) {
        this.f27808b.X(notificationSettingsScope);
    }

    @Override
    public void b(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o2(Message.obtain(this.f27810c.d(), 2, this), null);
        }
    }

    public final int b0(TdApi.NotificationSettingsScope notificationSettingsScope, long j10, int i10) {
        NotificationChannel notificationChannel;
        return (Build.VERSION.SDK_INT < 26 || (notificationChannel = (NotificationChannel) N0(notificationSettingsScope, j10)) == null) ? i10 : notificationChannel.getImportance();
    }

    public boolean b1(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return y0(notificationSettingsScope) != 3;
    }

    public void b2(Runnable runnable) {
        if (runnable != null) {
            a aVar = this.f27810c;
            aVar.h(Message.obtain(aVar.d(), 16, new Object[]{this, runnable}), 0L);
            return;
        }
        a aVar2 = this.f27810c;
        aVar2.h(Message.obtain(aVar2.d(), 15, this), 0L);
    }

    @Override
    public void c() {
        g2(true);
    }

    public final String c0(TdApi.NotificationSettingsScope notificationSettingsScope, long j10, String str) {
        NotificationChannel notificationChannel;
        Uri defaultUri;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = (NotificationChannel) N0(notificationSettingsScope, j10)) == null) {
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
            if (defaultUri != null && i.c(defaultUri.toString(), uri)) {
                return null;
            }
            Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(j0.n(), 2);
            if (actualDefaultRingtoneUri != null) {
                if (i.c(actualDefaultRingtoneUri.toString(), uri)) {
                    return null;
                }
            }
            return sound.toString();
        }
    }

    public boolean c1(long j10) {
        return j10 != 0 && j10 == this.f27820l0;
    }

    public void c2(db dbVar) {
        a aVar = this.f27810c;
        aVar.h(Message.obtain(aVar.d(), 21, new Object[]{this, dbVar}), 0L);
    }

    @Override
    public void d(boolean z10) {
        W1();
    }

    public final String d0(String str, String str2, String str3) {
        if (i.i(str3)) {
            return str3;
        }
        if (I(str3, str)) {
            return v0.P0(str, str2);
        }
        return v0.P0(str3, w.i1(R.string.RingtoneCustom));
    }

    public boolean d1(long j10, boolean z10) {
        TdApi.ChatNotificationSettings M3 = this.f27806a.M3(j10);
        if (M3 != null && !M3.useDefaultShowPreview) {
            return M3.showPreview;
        }
        if (ob.a.j(j10)) {
            return false;
        }
        if (!z10) {
            return O(j10);
        }
        TdApi.ScopeNotificationSettings scopeNotificationSettings = this.S;
        return scopeNotificationSettings != null && scopeNotificationSettings.showPreview;
    }

    public final void d2(db dbVar) {
        this.f27808b.b0(dbVar);
    }

    @TargetApi(26)
    public long e0(TdApi.NotificationSettingsScope notificationSettingsScope, long j10) {
        if (j10 == 0) {
            return F0(notificationSettingsScope).a();
        }
        he.i c22 = he.i.c2();
        return c22.e1(j1("channels_version_custom_" + j10), 0L);
    }

    public boolean e1(long j10) {
        String o02 = o0(j10, null);
        return o02 != null ? !"".equals(o02) : a1(j2(j10));
    }

    public boolean e2(long j10) {
        cb cbVar;
        if (Build.VERSION.SDK_INT < 26 || (cbVar = this.f27813e0) == null || cbVar.g() != j10) {
            return false;
        }
        this.f27813e0 = null;
        return true;
    }

    @Override
    public void f(int i10) {
        if (d.w().x() && d.w().y()) {
            W1();
        }
    }

    public final int f0(TdApi.NotificationSettingsScope notificationSettingsScope, long j10, int i10) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = (NotificationChannel) N0(notificationSettingsScope, j10)) == null) {
            return i10;
        }
        if (!notificationChannel.shouldVibrate()) {
            return 3;
        }
        long[] vibrationPattern = notificationChannel.getVibrationPattern();
        if (vibrationPattern == null) {
            return 0;
        }
        if (Arrays.equals(vibrationPattern, f27798q0)) {
            return 1;
        }
        return Arrays.equals(vibrationPattern, f27799r0) ? 2 : 0;
    }

    public final boolean f1() {
        return !SyncAdapter.b(j0.q());
    }

    public final void f2(long j10) {
        this.f27808b.U(j10);
    }

    public int g0() {
        if (this.O == null) {
            int i10 = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                i10 = he.i.c2().V0(k1("channels_version_global", this.f27806a.A6()), 0);
            }
            this.O = Integer.valueOf(i10);
        }
        return this.O.intValue();
    }

    public final boolean g1() {
        return !SyncAdapter.c();
    }

    public void g2(boolean z10) {
        int A6 = this.f27806a.A6();
        LevelDB W = he.i.c2().W();
        W.remove(k1("inapp_vibrate", A6)).remove(k1("inapp_sounds", A6)).remove(k1("inapp_chatSounds", A6)).remove(k1("voice_ringtone", A6)).remove(k1("voice_ringtone_name", A6)).remove(k1("voice_ringtone_path", A6)).remove(k1("voice_vibrate", A6)).remove(k1("voice_vibrate_onlysilent", A6));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            int g02 = g0();
            String k12 = k1("channels_version_global", A6);
            Integer valueOf = Integer.valueOf(g02 == Integer.MAX_VALUE ? Integer.MIN_VALUE : g02 + 1);
            this.O = valueOf;
            W.putInt(k12, valueOf.intValue());
        }
        he.i.c2().G3(new String[]{k1("custom_sound_", A6), k1("custom_sound_name_", A6), k1("custom_sound_path_", A6), k1("custom_led_", A6), k1("custom_vibrate_", A6), k1("custom_vibrate_onlysilent_", A6), k1("custom_call_ringtone_", A6), k1("custom_call_ringtone_name_", A6), k1("custom_call_vibrate_", A6), k1("custom_call_vibrate_onlysilent_", A6), k1(f27795n0, A6), k1("channels_version_custom_", A6)}, W);
        W.apply();
        this.N = null;
        this.P.l(W);
        this.Q.l(W);
        this.R.l(W);
        this.V = null;
        this.W = null;
        this.f27809b0 = null;
        this.f27807a0 = null;
        this.X = false;
        this.Y = false;
        this.f27812d0 = null;
        if (i10 >= 26) {
            long fa2 = this.f27806a.fa();
            TdApi.User da2 = this.f27806a.da();
            if (fa2 != 0) {
                o6 o6Var = this.f27806a;
                cb.e(o6Var, fa2, o6Var.A1().G(), da2, !z10);
            }
        }
        if (!z10) {
            if (q1(this.S)) {
                TdApi.ScopeNotificationSettings scopeNotificationSettings = this.S;
                if (scopeNotificationSettings != null) {
                    h2(scopeNotificationSettings);
                } else {
                    this.S = s1();
                }
                this.f27806a.v4().o(new TdApi.SetScopeNotificationSettings(new TdApi.NotificationSettingsScopePrivateChats(), this.S), this.f27806a.na());
            }
            if (q1(this.T)) {
                TdApi.ScopeNotificationSettings scopeNotificationSettings2 = this.T;
                if (scopeNotificationSettings2 != null) {
                    h2(scopeNotificationSettings2);
                } else {
                    this.T = s1();
                }
                this.f27806a.v4().o(new TdApi.SetScopeNotificationSettings(new TdApi.NotificationSettingsScopeGroupChats(), this.T), this.f27806a.na());
            }
            if (q1(this.U)) {
                TdApi.ScopeNotificationSettings scopeNotificationSettings3 = this.U;
                if (scopeNotificationSettings3 != null) {
                    h2(scopeNotificationSettings3);
                } else {
                    this.U = s1();
                }
                this.f27806a.v4().o(new TdApi.SetScopeNotificationSettings(new TdApi.NotificationSettingsScopeChannelChats(), this.U), this.f27806a.na());
            }
            boolean z11 = he.i.c2().Z4(false) || he.i.c2().g5(true);
            if (he.i.c2().R3()) {
                this.f27806a.F4().F2();
            }
            if (z11) {
                this.f27806a.F4().o2();
            }
        }
        W1();
    }

    public String h0(long j10) {
        he.i c22 = he.i.c2();
        return c22.L1(j1("custom_call_ringtone_" + j10), null);
    }

    public boolean h1(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f27808b.I(i10);
        }
        return false;
    }

    public String i0(long j10) {
        he.i c22 = he.i.c2();
        return c22.L1(j1("custom_call_ringtone_name_" + j10), null);
    }

    public boolean i1(long j10) {
        int r02 = r0(j10, 0);
        if (r02 == 0) {
            r02 = y0(j2(j10));
        }
        return r02 != 3;
    }

    public final void i2() {
    }

    public String j0(long j10) {
        he.i c22 = he.i.c2();
        return c22.L1(j1("custom_call_ringtone_path_" + j10), null);
    }

    public final String j1(String str) {
        return k1(str, this.f27806a.A6());
    }

    public TdApi.NotificationSettingsScope j2(long j10) {
        switch (ob.a.d(j10)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                return this.f27806a.t7(j10) ? m2() : l2();
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return n2();
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return m2();
            default:
                throw new RuntimeException();
        }
    }

    public int k0(long j10) {
        he.i c22 = he.i.c2();
        return c22.V0(j1("custom_call_vibrate_" + j10), 0);
    }

    public TdApi.NotificationSettingsScope k2(TdApi.Chat chat) {
        switch (chat.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                return t2.E3(chat.type) ? m2() : l2();
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return n2();
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return m2();
            default:
                throw new RuntimeException();
        }
    }

    public boolean l0(long j10) {
        if (!fd.a.f11898t) {
            return false;
        }
        he.i c22 = he.i.c2();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("custom_call_vibrate_onlysilent_");
        sb2.append(j10);
        return c22.o0(j1(sb2.toString()), false);
    }

    public TdApi.NotificationSettingsScope l2() {
        return this.R.f27421b;
    }

    public int m0(long j10, int i10) {
        he.i c22 = he.i.c2();
        return a0(null, j10, c22.V0(j1("custom_led_" + j10), i10));
    }

    public TdApi.User m1() {
        return this.f27821m0;
    }

    public TdApi.NotificationSettingsScope m2() {
        return this.Q.f27421b;
    }

    public int n0(long j10, int i10) {
        he.i c22 = he.i.c2();
        return b0(null, j10, c22.V0(j1(f27795n0 + j10), i10));
    }

    public long n1() {
        return this.f27820l0;
    }

    public TdApi.NotificationSettingsScope n2() {
        return this.P.f27421b;
    }

    public String o0(long j10, String str) {
        return c0(null, j10, I0(j10, str));
    }

    public boolean o1(long j10, boolean z10) {
        TdApi.ScopeNotificationSettings scopeNotificationSettings;
        TdApi.ScopeNotificationSettings scopeNotificationSettings2;
        TdApi.ScopeNotificationSettings scopeNotificationSettings3;
        if (!fd.a.f11901w || !d1(j10, z10)) {
            return false;
        }
        return (ob.a.l(j10) || z10) ? this.P.j() && (scopeNotificationSettings = this.S) != null && scopeNotificationSettings.showPreview : this.f27806a.O6(j10) ? this.R.j() && (scopeNotificationSettings3 = this.U) != null && scopeNotificationSettings3.showPreview : this.Q.j() && (scopeNotificationSettings2 = this.T) != null && scopeNotificationSettings2.showPreview;
    }

    public final void o2(Message message, Runnable runnable) {
        this.f27806a.G6();
        this.f27810c.h(message, 0L);
        b2(runnable);
    }

    public String p0(long j10) {
        String o02 = o0(j10, null);
        if (i.i(o02)) {
            return o02;
        }
        he.i c22 = he.i.c2();
        String L1 = c22.L1(j1("custom_sound_" + j10), null);
        he.i c23 = he.i.c2();
        return d0(L1, c23.L1(j1("custom_sound_name_" + j10), null), o02);
    }

    public boolean p1() {
        return g1() && !W0();
    }

    public boolean p2(String str, String str2, String str3) {
        if (i.c(str, S()) && i.c(str2, U()) && i.c(str3, V())) {
            return false;
        }
        this.f27807a0 = str;
        this.X = true;
        this.f27809b0 = str2;
        this.Y = true;
        this.f27811c0 = str3;
        this.Z = true;
        LevelDB W = he.i.c2().W();
        if (str == null) {
            W.remove(j1("voice_ringtone"));
            W.remove(j1("voice_ringtone_name"));
            W.remove(j1("voice_ringtone_path"));
        } else {
            W.putString(j1("voice_ringtone"), str);
            if (i.i(str2)) {
                W.remove(j1("voice_ringtone_name"));
            } else {
                W.putString(j1("voice_ringtone_name"), str2);
            }
            if (i.i(str3)) {
                W.remove(j1("voice_ringtone_path"));
            } else {
                W.putString(j1("voice_ringtone_path"), str3);
            }
        }
        W.apply();
        return true;
    }

    public String q0(long j10) {
        String o02 = o0(j10, null);
        if (i.i(o02)) {
            return o02;
        }
        he.i c22 = he.i.c2();
        return c22.L1(j1("custom_sound_path_" + j10), null);
    }

    public boolean q2(int i10, boolean z10) {
        if (W() == i10 && Y() == z10) {
            return false;
        }
        this.V = Integer.valueOf(i10);
        this.W = Boolean.valueOf(z10);
        he.i.c2().W().putInt(j1("voice_vibrate"), i10).putBoolean(j1("voice_vibrate_onlysilent"), z10).apply();
        return true;
    }

    public int r0(long j10, int i10) {
        he.i c22 = he.i.c2();
        return f0(null, j10, c22.V0(j1("custom_vibrate_" + j10), i10));
    }

    public boolean r1() {
        return I2() || Build.VERSION.SDK_INT < 23 || Settings.System.getInt(j0.q().getContentResolver(), "vibrate_when_ringing", 0) != 0;
    }

    public void r2(long j10, String str, String str2, String str3) {
        if (str == null) {
            LevelDB W = he.i.c2().W();
            SharedPreferences.Editor remove = W.remove(j1("custom_call_ringtone_" + j10));
            SharedPreferences.Editor remove2 = remove.remove(j1("custom_call_ringtone_name_" + j10));
            remove2.remove(j1("custom_call_ringtone_path_" + j10)).apply();
            return;
        }
        LevelDB W2 = he.i.c2().W();
        W2.putString(j1("custom_call_ringtone_" + j10), str);
        if (i.i(str2)) {
            W2.remove(j1("custom_call_ringtone_name_" + j10));
        } else {
            W2.putString(j1("custom_call_ringtone_name_" + j10), str2);
        }
        if (i.i(str3)) {
            W2.remove(j1("custom_call_ringtone_path_" + j10));
        } else {
            W2.putString(j1("custom_call_ringtone_path_" + j10), str3);
        }
        W2.apply();
    }

    public boolean s0(long j10) {
        if (!fd.a.f11898t) {
            return false;
        }
        he.i c22 = he.i.c2();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("custom_vibrate_onlysilent_");
        sb2.append(j10);
        return c22.o0(j1(sb2.toString()), false);
    }

    public void s2(long j10, int i10, boolean z10) {
        if (i10 == 0) {
            LevelDB W = he.i.c2().W();
            SharedPreferences.Editor remove = W.remove(j1("custom_call_vibrate_" + j10));
            remove.remove(j1("custom_call_vibrate_onlysilent_" + j10)).apply();
        } else if (fd.a.f11898t) {
            LevelDB W2 = he.i.c2().W();
            SharedPreferences.Editor putInt = W2.putInt(j1("custom_call_vibrate_" + j10), i10);
            putInt.putBoolean(j1("custom_call_vibrate_onlysilent_" + j10), z10).apply();
        } else {
            he.i c22 = he.i.c2();
            c22.u3(j1("custom_call_vibrate_" + j10), i10);
        }
    }

    public int t0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return a0(notificationSettingsScope, 0L, F0(notificationSettingsScope).c());
    }

    public void t1(long j10) {
        if (ob.a.j(j10)) {
            o2(Message.obtain(this.f27810c.d(), 13, c.m(j10), c.n(j10), this), null);
        }
    }

    public void t2(long j10, int i10) {
        int m02 = m0(j10, 0);
        LevelDB W = he.i.c2().W();
        if (i10 == 0) {
            W.remove(j1("custom_led_" + j10));
        } else {
            W.putInt(j1("custom_led_" + j10), i10);
        }
        if (Build.VERSION.SDK_INT < 26 || i10 == m02) {
            W.apply();
        } else {
            Y0(null, j10, W);
        }
    }

    public int u0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return b0(notificationSettingsScope, 0L, F0(notificationSettingsScope).d());
    }

    public final void u1(long j10) {
        this.f27808b.P(j10);
    }

    public void u2(long j10, int i10) {
        int n02 = n0(j10, -100);
        LevelDB W = he.i.c2().W();
        if (i10 == -100) {
            W.remove(j1(f27795n0 + j10));
        } else {
            W.putInt(j1(f27795n0 + j10), i10);
        }
        if (Build.VERSION.SDK_INT < 26 || n02 == i10) {
            W.apply();
        } else {
            Y0(null, j10, W);
        }
    }

    public String v0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return c0(notificationSettingsScope, 0L, J0(notificationSettingsScope));
    }

    public void v1(boolean z10) {
        a aVar = this.f27810c;
        aVar.h(Message.obtain(aVar.d(), 14, z10 ? 1 : 0, 0, this), 0L);
    }

    public void v2(long j10, String str, String str2, String str3) {
        String R = R(str);
        String o02 = o0(j10, null);
        LevelDB W = he.i.c2().W();
        if (R == null) {
            W.remove(j1("custom_sound_" + j10));
        } else {
            W.putString(j1("custom_sound_" + j10), R);
        }
        if (i.i(str2)) {
            W.remove(j1("custom_sound_name_" + j10));
        } else {
            W.putString(j1("custom_sound_name_" + j10), str2);
        }
        if (i.i(str3)) {
            W.remove(j1("custom_sound_path_" + j10));
        } else {
            W.putString(j1("custom_sound_path_" + j10), str3);
        }
        if (Build.VERSION.SDK_INT < 26 || I(R, o02)) {
            W.apply();
        } else {
            Y0(null, j10, W);
        }
    }

    public String w0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        e1 F0 = F0(notificationSettingsScope);
        return d0(F0.e(), F0.f(), v0(notificationSettingsScope));
    }

    public final void w1(boolean z10) {
        this.f27808b.Q(z10);
    }

    public void w2(long j10, int i10, boolean z10) {
        int r02 = r0(j10, 0);
        LevelDB W = he.i.c2().W();
        if (i10 == 0) {
            W.remove(j1("custom_vibrate_" + j10));
            if (fd.a.f11898t) {
                W.remove(j1("custom_vibrate_onlysilent_" + j10));
            }
        } else {
            W.putInt(j1("custom_vibrate_" + j10), i10);
            if (fd.a.f11898t) {
                W.putBoolean(j1("custom_vibrate_onlysilent_" + j10), z10);
            }
        }
        if (Build.VERSION.SDK_INT < 26 || r02 == i10) {
            W.apply();
        } else {
            Y0(null, j10, W);
        }
    }

    public boolean x(long j10) {
        if (A()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f27818j0 >= 800 || currentTimeMillis - this.f27819k0 >= 5000) {
            this.f27819k0 = currentTimeMillis;
            this.f27818j0 = currentTimeMillis;
            return true;
        }
        this.f27818j0 = currentTimeMillis;
        return false;
    }

    public String x0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return F0(notificationSettingsScope).g();
    }

    public void x1(db dbVar) {
        o2(Message.obtain(this.f27810c.d(), 9, new Object[]{this, dbVar}), null);
    }

    public void x2(TdApi.NotificationSettingsScope notificationSettingsScope, boolean z10) {
        TdApi.ScopeNotificationSettings M0 = M0(notificationSettingsScope);
        if (M0 != null) {
            M0.disableMentionNotifications = z10;
            this.f27806a.pc(notificationSettingsScope, M0);
        }
    }

    public boolean y() {
        if (this.N == null) {
            this.N = Boolean.valueOf(he.i.c2().o0(k1("inapp_chatSounds", this.f27806a.A6()), true));
        }
        return this.N.booleanValue();
    }

    public int y0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return f0(notificationSettingsScope, 0L, F0(notificationSettingsScope).h());
    }

    public void y1(int i10) {
        a aVar = this.f27810c;
        aVar.h(Message.obtain(aVar.d(), 8, i10, 0, this), 0L);
    }

    public void y2(TdApi.NotificationSettingsScope notificationSettingsScope, boolean z10) {
        TdApi.ScopeNotificationSettings M0 = M0(notificationSettingsScope);
        if (M0 != null) {
            M0.disablePinnedMessageNotifications = z10;
            this.f27806a.pc(notificationSettingsScope, M0);
        }
    }

    public boolean z(long j10) {
        TdApi.ChatNotificationSettings M3 = this.f27806a.M3(j10);
        if (M3 == null || M3.useDefaultDisableMentionNotifications) {
            return K(j10);
        }
        return M3.disableMentionNotifications;
    }

    public boolean z0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        if (fd.a.f11898t) {
            return F0(notificationSettingsScope).i();
        }
        return false;
    }

    public final void z1(int i10) {
        this.f27808b.T(i10);
    }

    public boolean z2(TdApi.NotificationSettingsScope notificationSettingsScope, int i10) {
        if (t0(notificationSettingsScope) == i10) {
            return false;
        }
        e1 F0 = F0(notificationSettingsScope);
        F0.n(i10);
        LevelDB W = he.i.c2().W();
        if (i10 != f27803v0) {
            W.putInt(F0.s("_led"), i10);
        } else {
            W.remove(F0.s("_led"));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Y0(notificationSettingsScope, 0L, W);
            return true;
        }
        W.apply();
        return true;
    }
}
