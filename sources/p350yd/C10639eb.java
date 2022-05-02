package p350yd;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.net.Uri;
import android.os.Build;
import be.C1379j0;
import gd.C4779t2;
import java.util.Arrays;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p124ib.C5326i;
import p143k0.C6035e;
import p143k0.C6038h;
import p193nb.C7316a;

@TargetApi(26)
public class C10639eb {
    public final C10930q6 f34060a;
    public final long f34061b;
    public final int f34062c;
    public final String f34063d;
    public final boolean f34064e;
    public final C6038h<Object> f34065f = new C6038h<>(3);
    public final C5326i f34066g = new C5326i(3);
    public final C6035e<C10640a> f34067h = new C6035e<>();

    public static class C10640a {
        public final long f34068a;
        public Object f34069b;
        public long f34070c;

        public C10640a(long j, Object obj, long j2) {
            this.f34068a = j;
            this.f34069b = obj;
            this.f34070c = j2;
        }
    }

    public C10639eb(C10930q6 q6Var, long j, boolean z, TdApi.User user) {
        this.f34060a = q6Var;
        this.f34061b = j;
        this.f34064e = z;
        this.f34062c = q6Var.m2440ga().m3130g0();
        this.f34063d = m4387q(j, z);
        m4401c(user);
    }

    @TargetApi(26)
    public static void m4403a(C10536ab abVar) {
        NotificationManager notificationManager;
        List<NotificationChannelGroup> notificationChannelGroups;
        int s;
        if (!(Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) C1379j0.m37315n().getSystemService("notification")) == null || (notificationChannelGroups = notificationManager.getNotificationChannelGroups()) == null || notificationChannelGroups.isEmpty())) {
            int i = 0;
            while (i < 2) {
                boolean z = i == 1;
                long[] Z = abVar.m4725Z(z);
                String str = z ? "debug_account_" : "account_";
                for (int size = notificationChannelGroups.size() - 1; size >= 0; size--) {
                    String id2 = notificationChannelGroups.get(size).getId();
                    if (!C5070i.m24061i(id2) && id2.startsWith(str) && ((s = C5070i.m24051s(id2.substring(str.length()))) == 0 || Arrays.binarySearch(Z, s) < 0)) {
                        notificationManager.deleteNotificationChannelGroup(id2);
                    }
                }
                i++;
            }
        }
    }

    @android.annotation.TargetApi(26)
    public static void m4402b(p350yd.C10930q6 r19) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10639eb.m4402b(yd.q6):void");
    }

    public static void m4399e(C10930q6 q6Var, long j, boolean z, TdApi.User user, boolean z2) {
        NotificationManager notificationManager;
        if (!(user == null || (notificationManager = (NotificationManager) C1379j0.m37315n().getSystemService("notification")) == null)) {
            List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
            String q = m4387q(j, z);
            if (notificationChannels != null && !notificationChannels.isEmpty()) {
                for (NotificationChannel notificationChannel : notificationChannels) {
                    if (C5070i.m24067c(notificationChannel.getGroup(), q)) {
                        notificationManager.deleteNotificationChannel(notificationChannel.getId());
                    }
                }
            }
            List<NotificationChannelGroup> notificationChannelGroups = notificationManager.getNotificationChannelGroups();
            if (notificationChannelGroups != null && !notificationChannelGroups.isEmpty()) {
                for (int size = notificationChannelGroups.size() - 1; size >= 0; size--) {
                    if (C5070i.m24067c(notificationChannelGroups.get(size).getId(), q)) {
                        notificationManager.deleteNotificationChannelGroup(q);
                    }
                }
            }
            if (z2) {
                q6Var.m2440ga().m3208J();
            }
            q6Var.m2440ga().m3202K1(j);
        }
    }

    public static String m4390n(TdApi.NotificationSettingsScope notificationSettingsScope) {
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor == 548013448) {
            return "_channel";
        }
        if (constructor == 937446759) {
            return "_private";
        }
        if (constructor == 1212142067) {
            return "_group";
        }
        throw new RuntimeException();
    }

    public static String m4389o(long j, int i, TdApi.NotificationSettingsScope notificationSettingsScope, long j2, long j3) {
        StringBuilder sb2 = new StringBuilder(m4386r(j, i));
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        sb2.append(i2 != 0 ? "_chat_" : m4390n(notificationSettingsScope));
        if (i2 != 0) {
            sb2.append(j2);
        }
        if (j3 != 0) {
            sb2.append('_');
            sb2.append(j3);
        }
        return sb2.toString();
    }

    public static Object m4388p(C10930q6 q6Var, long j, boolean z, int i, long j2, long j3) {
        int B0 = q6Var.m2440ga().m3239B0(j2);
        int D0 = q6Var.m2440ga().m3231D0(j2);
        int A0 = q6Var.m2440ga().m3243A0(j2);
        NotificationChannel notificationChannel = (NotificationChannel) m4385s(m4389o(j, i, q6Var.m2440ga().m3117j2(j2), j2, j3), C4403w.m27865j1(R.string.NotificationChannelCustom, q6Var.m2691Q3(j2)), m4387q(j, z), B0, D0, q6Var.m2440ga().m3235C0(j2), A0);
        m4384t(q6Var, notificationChannel, j2);
        return notificationChannel;
    }

    public static String m4387q(long j, boolean z) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "debug_account_" : "account_");
        sb2.append(j);
        return sb2.toString();
    }

    public static String m4386r(long j, int i) {
        return j + "_" + i;
    }

    public static Object m4385s(String str, String str2, String str3, int i, int i2, String str4, int i3) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.setGroup(str3);
        if (i2 == 0) {
            notificationChannel.enableVibration(true);
        } else if (i2 == 1) {
            notificationChannel.setVibrationPattern(C10827lb.f34663q0);
        } else if (i2 == 2) {
            notificationChannel.setVibrationPattern(C10827lb.f34664r0);
        }
        if (str4 != null) {
            notificationChannel.setSound(str4.isEmpty() ? null : Uri.parse(str4), null);
        }
        if (i3 != 0) {
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(i3);
        }
        notificationChannel.setShowBadge(true);
        return notificationChannel;
    }

    public static void m4384t(C10930q6 q6Var, Object obj, long j) {
        NotificationChannel notificationChannel = (NotificationChannel) obj;
        int d = C7316a.m17057d(j);
        int i = R.string.NotificationChannelGroupChat;
        switch (d) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.Supergroup Y3 = q6Var.m2571Y3(j);
                if (Y3 == null) {
                    notificationChannel.setDescription(C4403w.m27865j1(R.string.NotificationChannelGroupChat, q6Var.m2691Q3(j)));
                    return;
                } else if (C5070i.m24061i(Y3.username)) {
                    if (Y3.isChannel) {
                        i = R.string.NotificationChannelChannelChat;
                    }
                    notificationChannel.setDescription(C4403w.m27865j1(i, q6Var.m2691Q3(j)));
                    return;
                } else {
                    int i2 = Y3.isChannel ? R.string.NotificationChannelChannelChatPublic : R.string.NotificationChannelGroupChatPublic;
                    notificationChannel.setDescription(C4403w.m27865j1(i2, q6Var.m2691Q3(j), q6Var.m2746Mc() + Y3.username));
                    return;
                }
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                notificationChannel.setDescription(C4403w.m27865j1(R.string.NotificationChannelSecretChat, q6Var.m2691Q3(j)));
                return;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                notificationChannel.setDescription(C4403w.m27865j1(R.string.NotificationChannelGroupChat, q6Var.m2691Q3(j)));
                return;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                notificationChannel.setDescription(C4403w.m27865j1(R.string.NotificationChannelUser, q6Var.m2480e2().m1721K2(C7316a.m17044q(j))));
                return;
            default:
                return;
        }
    }

    public static void m4383u(C10930q6 q6Var, long j, boolean z, int i, TdApi.NotificationSettingsScope notificationSettingsScope, long j2, long j3) {
        NotificationManager notificationManager;
        if (j != 0 && (notificationManager = (NotificationManager) C1379j0.m37315n().getSystemService("notification")) != null) {
            if (j2 != 0) {
                TdApi.Chat U2 = q6Var.m2632U2(j2);
                if (U2 != null) {
                    NotificationChannel notificationChannel = (NotificationChannel) m4388p(q6Var, j, z, i, U2.f25367id, j3);
                    if (q6Var.m2440ga().m3178R0(j2)) {
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            } else {
                q6Var.m2440ga().m3208J();
            }
            long j4 = j3;
            while (j4 > 0) {
                long j5 = j4 - 1;
                NotificationManager notificationManager2 = notificationManager;
                notificationManager2.deleteNotificationChannel(m4389o(j, i, notificationSettingsScope, j2, j5));
                j4 = j5;
                notificationManager = notificationManager2;
            }
        }
    }

    public static void m4382v(C10930q6 q6Var, long j, TdApi.Chat chat) {
        NotificationManager notificationManager;
        if (j != 0 && (notificationManager = (NotificationManager) C1379j0.m37315n().getSystemService("notification")) != null) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(m4389o(j, q6Var.m2440ga().m3130g0(), null, chat.f25367id, q6Var.m2440ga().m3138e0(null, chat.f25367id)));
            if (notificationChannel != null) {
                notificationChannel.setName(q6Var.m2661S3(chat));
                m4384t(q6Var, notificationChannel, chat.f25367id);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    public static void m4381w(TdApi.User user) {
        NotificationManager notificationManager = (NotificationManager) C1379j0.m37315n().getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup("account_" + user.f25439id, C4779t2.m25437r2(user)));
        }
    }

    public void m4401c(TdApi.User user) {
        NotificationManager notificationManager = (NotificationManager) C1379j0.m37315n().getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(this.f34063d, C4403w.m27834r0(C4779t2.m25451p2(this.f34061b, user), this.f34064e)));
            C10930q6 q6Var = this.f34060a;
            m4400d(q6Var, notificationManager, q6Var.m2440ga().m3101n2());
            C10930q6 q6Var2 = this.f34060a;
            m4400d(q6Var2, notificationManager, q6Var2.m2440ga().m3105m2());
            C10930q6 q6Var3 = this.f34060a;
            m4400d(q6Var3, notificationManager, q6Var3.m2440ga().m3109l2());
            return;
        }
        throw new IllegalStateException();
    }

    public final Object m4400d(C10930q6 q6Var, NotificationManager notificationManager, TdApi.NotificationSettingsScope notificationSettingsScope) {
        String str;
        String str2;
        C10677g1 F0 = q6Var.m2440ga().m3223F0(notificationSettingsScope);
        long e0 = q6Var.m2440ga().m3138e0(notificationSettingsScope, 0L);
        int d = F0.m4328d();
        int h = F0.m4324h();
        String e = F0.m4327e();
        int c = F0.m4329c();
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor == 548013448) {
            str2 = C4403w.m27869i1(R.string.Channels);
            str = C4403w.m27869i1(R.string.NotificationChannelCommonChannels);
        } else if (constructor == 937446759) {
            str2 = C4403w.m27869i1(R.string.PrivateChatsMentions);
            str = C4403w.m27869i1(R.string.NotificationChannelCommonPrivate);
        } else if (constructor == 1212142067) {
            str2 = C4403w.m27869i1(R.string.Groups);
            str = C4403w.m27869i1(R.string.NotificationChannelCommonGroups);
        } else {
            throw new IllegalArgumentException("scope == " + notificationSettingsScope);
        }
        NotificationChannel notificationChannel = (NotificationChannel) m4385s(m4389o(this.f34061b, this.f34062c, notificationSettingsScope, 0L, e0), str2, this.f34063d, d, h, e, c);
        notificationChannel.setDescription(str);
        notificationManager.createNotificationChannel(notificationChannel);
        this.f34065f.m21466j(notificationSettingsScope.getConstructor(), notificationChannel);
        this.f34066g.m23233f(notificationSettingsScope.getConstructor(), e0);
        return notificationChannel;
    }

    public final Object m4398f(C10930q6 q6Var, TdApi.NotificationSettingsScope notificationSettingsScope, C10640a aVar) {
        NotificationChannel notificationChannel;
        long j;
        long e0 = q6Var.m2440ga().m3138e0(notificationSettingsScope, aVar != null ? aVar.f34068a : 0L);
        if (aVar != null) {
            j = aVar.f34070c;
            notificationChannel = (NotificationChannel) aVar.f34069b;
        } else {
            j = m4392l(notificationSettingsScope);
            notificationChannel = (NotificationChannel) m4395i(notificationSettingsScope);
        }
        NotificationManager notificationManager = (NotificationManager) C1379j0.m37315n().getSystemService("notification");
        if (notificationManager == null) {
            throw new IllegalStateException();
        } else if (j == e0) {
            return notificationChannel;
        } else {
            if (aVar == null) {
                return (NotificationChannel) m4400d(q6Var, notificationManager, notificationSettingsScope);
            }
            NotificationChannel notificationChannel2 = (NotificationChannel) m4388p(q6Var, this.f34061b, this.f34064e, this.f34062c, aVar.f34068a, e0);
            aVar.f34069b = notificationChannel2;
            aVar.f34070c = e0;
            return notificationChannel2;
        }
    }

    public long m4397g() {
        return this.f34061b;
    }

    @TargetApi(26)
    public final Object m4396h(long j, boolean z, long j2, boolean z2) {
        NotificationChannel notificationChannel = (NotificationChannel) m4393k(j, z, j2);
        if (notificationChannel == null) {
            throw new IllegalStateException("Could not create channel, chatId:" + j + ", areMentions:" + z + ", singleSenderId:" + j2);
        } else if (z2 || notificationChannel.getImportance() != 0) {
            return notificationChannel;
        } else {
            return null;
        }
    }

    public final Object m4395i(TdApi.NotificationSettingsScope notificationSettingsScope) {
        Object e = this.f34065f.m21471e(notificationSettingsScope.getConstructor());
        if (e != null) {
            return e;
        }
        throw new IllegalStateException("scope == " + notificationSettingsScope);
    }

    @TargetApi(26)
    public Object m4394j(C10711hb hbVar, boolean z) {
        return m4396h(hbVar.m4220v(), hbVar.m4247D(), hbVar.m4231T(), z);
    }

    @TargetApi(26)
    public final Object m4393k(long j, boolean z, long j2) {
        if (z) {
            if (this.f34060a.m2440ga().m3178R0(j2)) {
                return m4391m(j2);
            }
            C10930q6 q6Var = this.f34060a;
            return m4398f(q6Var, q6Var.m2784K6(j) ? this.f34060a.m2440ga().m3109l2() : this.f34060a.m2440ga().m3101n2(), null);
        } else if (this.f34060a.m2440ga().m3178R0(j)) {
            return m4391m(j);
        } else {
            C10930q6 q6Var2 = this.f34060a;
            return m4398f(q6Var2, q6Var2.m2440ga().m3117j2(j), null);
        }
    }

    public final long m4392l(TdApi.NotificationSettingsScope notificationSettingsScope) {
        int d = this.f34066g.m23235d(notificationSettingsScope.getConstructor());
        if (d >= 0) {
            return this.f34066g.m23230i(d);
        }
        throw new IllegalStateException("scope == " + notificationSettingsScope);
    }

    public final Object m4391m(long j) {
        if (j != 0) {
            C10640a f = this.f34067h.m21505f(j);
            if (f != null) {
                return (NotificationChannel) m4398f(this.f34060a, null, f);
            }
            long e0 = this.f34060a.m2440ga().m3138e0(null, j);
            NotificationChannel notificationChannel = (NotificationChannel) m4388p(this.f34060a, this.f34061b, this.f34064e, this.f34062c, j, e0);
            this.f34067h.m21500k(j, new C10640a(j, notificationChannel, e0));
            return notificationChannel;
        }
        throw new IllegalArgumentException();
    }
}
