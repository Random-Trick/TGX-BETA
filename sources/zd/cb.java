package zd;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.net.Uri;
import android.os.Build;
import ce.j0;
import gd.w;
import hd.t2;
import java.util.Arrays;
import java.util.List;
import jb.i;
import k0.e;
import k0.h;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;

@TargetApi(26)
public class cb {
    public final o6 f27342a;
    public final long f27343b;
    public final int f27344c;
    public final String f27345d;
    public final boolean f27346e;
    public final h<Object> f27347f = new h<>(3);
    public final i f27348g = new i(3);
    public final e<a> f27349h = new e<>();

    public static class a {
        public final long f27350a;
        public Object f27351b;
        public long f27352c;

        public a(long j10, Object obj, long j11) {
            this.f27350a = j10;
            this.f27351b = obj;
            this.f27352c = j11;
        }
    }

    public cb(o6 o6Var, long j10, boolean z10, TdApi.User user) {
        this.f27342a = o6Var;
        this.f27343b = j10;
        this.f27346e = z10;
        this.f27344c = o6Var.ka().g0();
        this.f27345d = q(j10, z10);
        c(user);
    }

    @TargetApi(26)
    public static void a(ya yaVar) {
        NotificationManager notificationManager;
        List<NotificationChannelGroup> notificationChannelGroups;
        int s10;
        if (!(Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) j0.n().getSystemService("notification")) == null || (notificationChannelGroups = notificationManager.getNotificationChannelGroups()) == null || notificationChannelGroups.isEmpty())) {
            int i10 = 0;
            while (i10 < 2) {
                boolean z10 = i10 == 1;
                long[] Z = yaVar.Z(z10);
                String str = z10 ? "debug_account_" : "account_";
                for (int size = notificationChannelGroups.size() - 1; size >= 0; size--) {
                    String id2 = notificationChannelGroups.get(size).getId();
                    if (!ib.i.i(id2) && id2.startsWith(str) && ((s10 = ib.i.s(id2.substring(str.length()))) == 0 || Arrays.binarySearch(Z, s10) < 0)) {
                        notificationManager.deleteNotificationChannelGroup(id2);
                    }
                }
                i10++;
            }
        }
    }

    @android.annotation.TargetApi(26)
    public static void b(zd.o6 r19) {
        throw new UnsupportedOperationException("Method not decompiled: zd.cb.b(zd.o6):void");
    }

    public static void e(o6 o6Var, long j10, boolean z10, TdApi.User user, boolean z11) {
        NotificationManager notificationManager;
        if (!(user == null || (notificationManager = (NotificationManager) j0.n().getSystemService("notification")) == null)) {
            List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
            String q10 = q(j10, z10);
            if (notificationChannels != null && !notificationChannels.isEmpty()) {
                for (NotificationChannel notificationChannel : notificationChannels) {
                    if (ib.i.c(notificationChannel.getGroup(), q10)) {
                        notificationManager.deleteNotificationChannel(notificationChannel.getId());
                    }
                }
            }
            List<NotificationChannelGroup> notificationChannelGroups = notificationManager.getNotificationChannelGroups();
            if (notificationChannelGroups != null && !notificationChannelGroups.isEmpty()) {
                for (int size = notificationChannelGroups.size() - 1; size >= 0; size--) {
                    if (ib.i.c(notificationChannelGroups.get(size).getId(), q10)) {
                        notificationManager.deleteNotificationChannelGroup(q10);
                    }
                }
            }
            if (z11) {
                o6Var.ka().J();
            }
            o6Var.ka().K1(j10);
        }
    }

    public static String n(TdApi.NotificationSettingsScope notificationSettingsScope) {
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

    public static String o(long j10, int i10, TdApi.NotificationSettingsScope notificationSettingsScope, long j11, long j12) {
        StringBuilder sb2 = new StringBuilder(r(j10, i10));
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        sb2.append(i11 != 0 ? "_chat_" : n(notificationSettingsScope));
        if (i11 != 0) {
            sb2.append(j11);
        }
        if (j12 != 0) {
            sb2.append('_');
            sb2.append(j12);
        }
        return sb2.toString();
    }

    public static Object p(o6 o6Var, long j10, boolean z10, int i10, long j11, long j12) {
        int B0 = o6Var.ka().B0(j11);
        int D0 = o6Var.ka().D0(j11);
        int A0 = o6Var.ka().A0(j11);
        NotificationChannel notificationChannel = (NotificationChannel) s(o(j10, i10, o6Var.ka().j2(j11), j11, j12), w.j1(R.string.NotificationChannelCustom, o6Var.U3(j11)), q(j10, z10), B0, D0, o6Var.ka().C0(j11), A0);
        t(o6Var, notificationChannel, j11);
        return notificationChannel;
    }

    public static String q(long j10, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "debug_account_" : "account_");
        sb2.append(j10);
        return sb2.toString();
    }

    public static String r(long j10, int i10) {
        return j10 + "_" + i10;
    }

    public static Object s(String str, String str2, String str3, int i10, int i11, String str4, int i12) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i10);
        notificationChannel.setGroup(str3);
        if (i11 == 0) {
            notificationChannel.enableVibration(true);
        } else if (i11 == 1) {
            notificationChannel.setVibrationPattern(jb.f27798q0);
        } else if (i11 == 2) {
            notificationChannel.setVibrationPattern(jb.f27799r0);
        }
        if (str4 != null) {
            notificationChannel.setSound(str4.isEmpty() ? null : Uri.parse(str4), null);
        }
        if (i12 != 0) {
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(i12);
        }
        notificationChannel.setShowBadge(true);
        return notificationChannel;
    }

    public static void t(o6 o6Var, Object obj, long j10) {
        NotificationChannel notificationChannel = (NotificationChannel) obj;
        int d10 = ob.a.d(j10);
        int i10 = R.string.NotificationChannelGroupChat;
        switch (d10) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.Supergroup c42 = o6Var.c4(j10);
                if (c42 == null) {
                    notificationChannel.setDescription(w.j1(R.string.NotificationChannelGroupChat, o6Var.U3(j10)));
                    return;
                } else if (ib.i.i(c42.username)) {
                    if (c42.isChannel) {
                        i10 = R.string.NotificationChannelChannelChat;
                    }
                    notificationChannel.setDescription(w.j1(i10, o6Var.U3(j10)));
                    return;
                } else {
                    int i11 = c42.isChannel ? R.string.NotificationChannelChannelChatPublic : R.string.NotificationChannelGroupChatPublic;
                    notificationChannel.setDescription(w.j1(i11, o6Var.U3(j10), o6Var.Qc() + c42.username));
                    return;
                }
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                notificationChannel.setDescription(w.j1(R.string.NotificationChannelSecretChat, o6Var.U3(j10)));
                return;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                notificationChannel.setDescription(w.j1(R.string.NotificationChannelGroupChat, o6Var.U3(j10)));
                return;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                notificationChannel.setDescription(w.j1(R.string.NotificationChannelUser, o6Var.e2().J2(ob.a.q(j10))));
                return;
            default:
                return;
        }
    }

    public static void u(o6 o6Var, long j10, boolean z10, int i10, TdApi.NotificationSettingsScope notificationSettingsScope, long j11, long j12) {
        NotificationManager notificationManager;
        if (j10 != 0 && (notificationManager = (NotificationManager) j0.n().getSystemService("notification")) != null) {
            if (j11 != 0) {
                TdApi.Chat W2 = o6Var.W2(j11);
                if (W2 != null) {
                    NotificationChannel notificationChannel = (NotificationChannel) p(o6Var, j10, z10, i10, W2.f19908id, j12);
                    if (o6Var.ka().R0(j11)) {
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            } else {
                o6Var.ka().J();
            }
            long j13 = j12;
            while (j13 > 0) {
                long j14 = j13 - 1;
                NotificationManager notificationManager2 = notificationManager;
                notificationManager2.deleteNotificationChannel(o(j10, i10, notificationSettingsScope, j11, j14));
                j13 = j14;
                notificationManager = notificationManager2;
            }
        }
    }

    public static void v(o6 o6Var, long j10, TdApi.Chat chat) {
        NotificationManager notificationManager;
        if (j10 != 0 && (notificationManager = (NotificationManager) j0.n().getSystemService("notification")) != null) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(o(j10, o6Var.ka().g0(), null, chat.f19908id, o6Var.ka().e0(null, chat.f19908id)));
            if (notificationChannel != null) {
                notificationChannel.setName(o6Var.W3(chat));
                t(o6Var, notificationChannel, chat.f19908id);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    public static void w(TdApi.User user) {
        NotificationManager notificationManager = (NotificationManager) j0.n().getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup("account_" + user.f19979id, t2.r2(user)));
        }
    }

    public void c(TdApi.User user) {
        NotificationManager notificationManager = (NotificationManager) j0.n().getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(this.f27345d, w.r0(t2.p2(this.f27343b, user), this.f27346e)));
            o6 o6Var = this.f27342a;
            d(o6Var, notificationManager, o6Var.ka().n2());
            o6 o6Var2 = this.f27342a;
            d(o6Var2, notificationManager, o6Var2.ka().m2());
            o6 o6Var3 = this.f27342a;
            d(o6Var3, notificationManager, o6Var3.ka().l2());
            return;
        }
        throw new IllegalStateException();
    }

    public final Object d(o6 o6Var, NotificationManager notificationManager, TdApi.NotificationSettingsScope notificationSettingsScope) {
        String str;
        String str2;
        e1 F0 = o6Var.ka().F0(notificationSettingsScope);
        long e02 = o6Var.ka().e0(notificationSettingsScope, 0L);
        int d10 = F0.d();
        int h10 = F0.h();
        String e10 = F0.e();
        int c10 = F0.c();
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor == 548013448) {
            str2 = w.i1(R.string.Channels);
            str = w.i1(R.string.NotificationChannelCommonChannels);
        } else if (constructor == 937446759) {
            str2 = w.i1(R.string.PrivateChatsMentions);
            str = w.i1(R.string.NotificationChannelCommonPrivate);
        } else if (constructor == 1212142067) {
            str2 = w.i1(R.string.Groups);
            str = w.i1(R.string.NotificationChannelCommonGroups);
        } else {
            throw new IllegalArgumentException("scope == " + notificationSettingsScope);
        }
        NotificationChannel notificationChannel = (NotificationChannel) s(o(this.f27343b, this.f27344c, notificationSettingsScope, 0L, e02), str2, this.f27345d, d10, h10, e10, c10);
        notificationChannel.setDescription(str);
        notificationManager.createNotificationChannel(notificationChannel);
        this.f27347f.j(notificationSettingsScope.getConstructor(), notificationChannel);
        this.f27348g.f(notificationSettingsScope.getConstructor(), e02);
        return notificationChannel;
    }

    public final Object f(o6 o6Var, TdApi.NotificationSettingsScope notificationSettingsScope, a aVar) {
        NotificationChannel notificationChannel;
        long j10;
        long e02 = o6Var.ka().e0(notificationSettingsScope, aVar != null ? aVar.f27350a : 0L);
        if (aVar != null) {
            j10 = aVar.f27352c;
            notificationChannel = (NotificationChannel) aVar.f27351b;
        } else {
            j10 = l(notificationSettingsScope);
            notificationChannel = (NotificationChannel) i(notificationSettingsScope);
        }
        NotificationManager notificationManager = (NotificationManager) j0.n().getSystemService("notification");
        if (notificationManager == null) {
            throw new IllegalStateException();
        } else if (j10 == e02) {
            return notificationChannel;
        } else {
            if (aVar == null) {
                return (NotificationChannel) d(o6Var, notificationManager, notificationSettingsScope);
            }
            NotificationChannel notificationChannel2 = (NotificationChannel) p(o6Var, this.f27343b, this.f27346e, this.f27344c, aVar.f27350a, e02);
            aVar.f27351b = notificationChannel2;
            aVar.f27352c = e02;
            return notificationChannel2;
        }
    }

    public long g() {
        return this.f27343b;
    }

    @TargetApi(26)
    public final Object h(long j10, boolean z10, long j11, boolean z11) {
        NotificationChannel notificationChannel = (NotificationChannel) k(j10, z10, j11);
        if (notificationChannel == null) {
            throw new IllegalStateException("Could not create channel, chatId:" + j10 + ", areMentions:" + z10 + ", singleSenderId:" + j11);
        } else if (z11 || notificationChannel.getImportance() != 0) {
            return notificationChannel;
        } else {
            return null;
        }
    }

    public final Object i(TdApi.NotificationSettingsScope notificationSettingsScope) {
        Object e10 = this.f27347f.e(notificationSettingsScope.getConstructor());
        if (e10 != null) {
            return e10;
        }
        throw new IllegalStateException("scope == " + notificationSettingsScope);
    }

    @TargetApi(26)
    public Object j(fb fbVar, boolean z10) {
        return h(fbVar.v(), fbVar.D(), fbVar.T(), z10);
    }

    @TargetApi(26)
    public final Object k(long j10, boolean z10, long j11) {
        if (z10) {
            if (this.f27342a.ka().R0(j11)) {
                return m(j11);
            }
            o6 o6Var = this.f27342a;
            return f(o6Var, o6Var.O6(j10) ? this.f27342a.ka().l2() : this.f27342a.ka().n2(), null);
        } else if (this.f27342a.ka().R0(j10)) {
            return m(j10);
        } else {
            o6 o6Var2 = this.f27342a;
            return f(o6Var2, o6Var2.ka().j2(j10), null);
        }
    }

    public final long l(TdApi.NotificationSettingsScope notificationSettingsScope) {
        int d10 = this.f27348g.d(notificationSettingsScope.getConstructor());
        if (d10 >= 0) {
            return this.f27348g.i(d10);
        }
        throw new IllegalStateException("scope == " + notificationSettingsScope);
    }

    public final Object m(long j10) {
        if (j10 != 0) {
            a f10 = this.f27349h.f(j10);
            if (f10 != null) {
                return (NotificationChannel) f(this.f27342a, null, f10);
            }
            long e02 = this.f27342a.ka().e0(null, j10);
            NotificationChannel notificationChannel = (NotificationChannel) p(this.f27342a, this.f27343b, this.f27346e, this.f27344c, j10, e02);
            this.f27349h.k(j10, new a(j10, notificationChannel, e02));
            return notificationChannel;
        }
        throw new IllegalArgumentException();
    }
}
