package p213p0;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.thunderdog.challegram.Log;
import p143k0.C6031b;
import p213p0.C7956h;
import p227q0.C8125b;
import p337y0.C10326a;

public class C7974i implements AbstractC7955g {
    public final Context f25963a;
    public final Notification.Builder f25964b;
    public final C7956h.C7965e f25965c;
    public RemoteViews f25966d;
    public RemoteViews f25967e;
    public final List<Bundle> f25968f = new ArrayList();
    public final Bundle f25969g = new Bundle();
    public int f25970h;
    public RemoteViews f25971i;

    public C7974i(C7956h.C7965e eVar) {
        int i;
        Icon icon;
        List<String> list;
        List<String> e;
        this.f25965c = eVar;
        this.f25963a = eVar.f25906a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f25964b = new Notification.Builder(eVar.f25906a, eVar.f25893K);
        } else {
            this.f25964b = new Notification.Builder(eVar.f25906a);
        }
        Notification notification = eVar.f25902T;
        this.f25964b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f25914i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f25910e).setContentText(eVar.f25911f).setContentInfo(eVar.f25916k).setContentIntent(eVar.f25912g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f25913h, (notification.flags & Log.TAG_YOUTUBE) != 0).setLargeIcon(eVar.f25915j).setNumber(eVar.f25917l).setProgress(eVar.f25925t, eVar.f25926u, eVar.f25927v);
        if (i2 < 21) {
            this.f25964b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i2 >= 16) {
            this.f25964b.setSubText(eVar.f25922q).setUsesChronometer(eVar.f25920o).setPriority(eVar.f25918m);
            Iterator<C7956h.C7957a> it = eVar.f25907b.iterator();
            while (it.hasNext()) {
                m13894b(it.next());
            }
            Bundle bundle = eVar.f25886D;
            if (bundle != null) {
                this.f25969g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.f25931z) {
                    this.f25969g.putBoolean("android.support.localOnly", true);
                }
                String str = eVar.f25928w;
                if (str != null) {
                    this.f25969g.putString("android.support.groupKey", str);
                    if (eVar.f25929x) {
                        this.f25969g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f25969g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = eVar.f25930y;
                if (str2 != null) {
                    this.f25969g.putString("android.support.sortKey", str2);
                }
            }
            this.f25966d = eVar.f25890H;
            this.f25967e = eVar.f25891I;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 17) {
            this.f25964b.setShowWhen(eVar.f25919n);
        }
        if (i3 >= 19 && i3 < 21 && (e = m13891e(m13889g(eVar.f25908c), eVar.f25905W)) != null && !e.isEmpty()) {
            this.f25969g.putStringArray("android.people", (String[]) e.toArray(new String[e.size()]));
        }
        if (i3 >= 20) {
            this.f25964b.setLocalOnly(eVar.f25931z).setGroup(eVar.f25928w).setGroupSummary(eVar.f25929x).setSortKey(eVar.f25930y);
            this.f25970h = eVar.f25898P;
        }
        if (i3 >= 21) {
            this.f25964b.setCategory(eVar.f25885C).setColor(eVar.f25887E).setVisibility(eVar.f25888F).setPublicVersion(eVar.f25889G).setSound(notification.sound, notification.audioAttributes);
            if (i3 < 28) {
                list = m13891e(m13889g(eVar.f25908c), eVar.f25905W);
            } else {
                list = eVar.f25905W;
            }
            if (list != null && !list.isEmpty()) {
                for (String str3 : list) {
                    this.f25964b.addPerson(str3);
                }
            }
            this.f25971i = eVar.f25892J;
            if (eVar.f25909d.size() > 0) {
                Bundle bundle2 = eVar.m13956g().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i4 = 0; i4 < eVar.f25909d.size(); i4++) {
                    bundle4.putBundle(Integer.toString(i4), C7975j.m13886b(eVar.f25909d.get(i4)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                eVar.m13956g().putBundle("android.car.EXTENSIONS", bundle2);
                this.f25969g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (icon = eVar.f25904V) != null) {
            this.f25964b.setSmallIcon(icon);
        }
        if (i5 >= 24) {
            this.f25964b.setExtras(eVar.f25886D).setRemoteInputHistory(eVar.f25924s);
            RemoteViews remoteViews = eVar.f25890H;
            if (remoteViews != null) {
                this.f25964b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f25891I;
            if (remoteViews2 != null) {
                this.f25964b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f25892J;
            if (remoteViews3 != null) {
                this.f25964b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            this.f25964b.setBadgeIconType(eVar.f25894L).setSettingsText(eVar.f25923r).setShortcutId(eVar.f25895M).setTimeoutAfter(eVar.f25897O).setGroupAlertBehavior(eVar.f25898P);
            if (eVar.f25884B) {
                this.f25964b.setColorized(eVar.f25883A);
            }
            if (!TextUtils.isEmpty(eVar.f25893K)) {
                this.f25964b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 28) {
            Iterator<C7983l> it2 = eVar.f25908c.iterator();
            while (it2.hasNext()) {
                this.f25964b.addPerson(it2.next().m13854h());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.f25964b.setAllowSystemGeneratedContextualActions(eVar.f25900R);
            this.f25964b.setBubbleMetadata(C7956h.C7964d.m13977a(eVar.f25901S));
            C8125b bVar = eVar.f25896N;
            if (bVar != null) {
                this.f25964b.setLocusId(bVar.m13412c());
            }
        }
        if (C10326a.m5418c() && (i = eVar.f25899Q) != 0) {
            this.f25964b.setForegroundServiceBehavior(i);
        }
        if (eVar.f25903U) {
            if (this.f25965c.f25929x) {
                this.f25970h = 2;
            } else {
                this.f25970h = 1;
            }
            this.f25964b.setVibrate(null);
            this.f25964b.setSound(null);
            int i7 = notification.defaults & (-2);
            notification.defaults = i7;
            int i8 = i7 & (-3);
            notification.defaults = i8;
            this.f25964b.setDefaults(i8);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f25965c.f25928w)) {
                    this.f25964b.setGroup("silent");
                }
                this.f25964b.setGroupAlertBehavior(this.f25970h);
            }
        }
    }

    public static List<String> m13891e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C6031b bVar = new C6031b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    public static List<String> m13889g(List<C7983l> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C7983l lVar : list) {
            arrayList.add(lVar.m13855g());
        }
        return arrayList;
    }

    @Override
    public Notification.Builder mo13895a() {
        return this.f25964b;
    }

    public final void m13894b(C7956h.C7957a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            IconCompat e = aVar.m13995e();
            if (i >= 23) {
                builder = new Notification.Action.Builder(e != null ? e.m40306r() : null, aVar.m13991i(), aVar.m13999a());
            } else {
                builder = new Notification.Action.Builder(e != null ? e.m40318f() : 0, aVar.m13991i(), aVar.m13999a());
            }
            if (aVar.m13994f() != null) {
                for (RemoteInput remoteInput : C7985m.m13844b(aVar.m13994f())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (aVar.m13996d() != null) {
                bundle = new Bundle(aVar.m13996d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m13998b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(aVar.m13998b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.m13993g());
            if (i2 >= 28) {
                builder.setSemanticAction(aVar.m13993g());
            }
            if (i2 >= 29) {
                builder.setContextual(aVar.m13990j());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.m13992h());
            builder.addExtras(bundle);
            this.f25964b.addAction(builder.build());
        } else if (i >= 16) {
            this.f25968f.add(C7975j.m13882f(this.f25964b, aVar));
        }
    }

    public Notification m13893c() {
        Bundle a;
        RemoteViews f;
        RemoteViews d;
        C7956h.AbstractC7973j jVar = this.f25965c.f25921p;
        if (jVar != null) {
            jVar.mo13901b(this);
        }
        RemoteViews e = jVar != null ? jVar.m13898e(this) : null;
        Notification d2 = m13892d();
        if (e != null) {
            d2.contentView = e;
        } else {
            RemoteViews remoteViews = this.f25965c.f25890H;
            if (remoteViews != null) {
                d2.contentView = remoteViews;
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (!(i < 16 || jVar == null || (d = jVar.m13899d(this)) == null)) {
            d2.bigContentView = d;
        }
        if (!(i < 21 || jVar == null || (f = this.f25965c.f25921p.m13897f(this)) == null)) {
            d2.headsUpContentView = f;
        }
        if (!(i < 16 || jVar == null || (a = C7956h.m14000a(d2)) == null)) {
            jVar.mo13902a(a);
        }
        return d2;
    }

    public Notification m13892d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f25964b.build();
        }
        if (i >= 24) {
            Notification build = this.f25964b.build();
            if (this.f25970h != 0) {
                if (!(build.getGroup() == null || (build.flags & Log.TAG_GIF_LOADER) == 0 || this.f25970h != 2)) {
                    m13888h(build);
                }
                if (build.getGroup() != null && (build.flags & Log.TAG_GIF_LOADER) == 0 && this.f25970h == 1) {
                    m13888h(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f25964b.setExtras(this.f25969g);
            Notification build2 = this.f25964b.build();
            RemoteViews remoteViews = this.f25966d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f25967e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f25971i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f25970h != 0) {
                if (!(build2.getGroup() == null || (build2.flags & Log.TAG_GIF_LOADER) == 0 || this.f25970h != 2)) {
                    m13888h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & Log.TAG_GIF_LOADER) == 0 && this.f25970h == 1) {
                    m13888h(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f25964b.setExtras(this.f25969g);
            Notification build3 = this.f25964b.build();
            RemoteViews remoteViews4 = this.f25966d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f25967e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f25970h != 0) {
                if (!(build3.getGroup() == null || (build3.flags & Log.TAG_GIF_LOADER) == 0 || this.f25970h != 2)) {
                    m13888h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & Log.TAG_GIF_LOADER) == 0 && this.f25970h == 1) {
                    m13888h(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a = C7975j.m13887a(this.f25968f);
            if (a != null) {
                this.f25969g.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f25964b.setExtras(this.f25969g);
            Notification build4 = this.f25964b.build();
            RemoteViews remoteViews6 = this.f25966d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f25967e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f25964b.getNotification();
        } else {
            Notification build5 = this.f25964b.build();
            Bundle a2 = C7956h.m14000a(build5);
            Bundle bundle = new Bundle(this.f25969g);
            for (String str : this.f25969g.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C7975j.m13887a(this.f25968f);
            if (a3 != null) {
                C7956h.m14000a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f25966d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f25967e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    public Context m13890f() {
        return this.f25963a;
    }

    public final void m13888h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }
}
