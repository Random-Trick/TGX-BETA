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
    public final Context f25966a;
    public final Notification.Builder f25967b;
    public final C7956h.C7965e f25968c;
    public RemoteViews f25969d;
    public RemoteViews f25970e;
    public final List<Bundle> f25971f = new ArrayList();
    public final Bundle f25972g = new Bundle();
    public int f25973h;
    public RemoteViews f25974i;

    public C7974i(C7956h.C7965e eVar) {
        int i;
        Icon icon;
        List<String> list;
        List<String> e;
        this.f25968c = eVar;
        this.f25966a = eVar.f25909a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f25967b = new Notification.Builder(eVar.f25909a, eVar.f25896K);
        } else {
            this.f25967b = new Notification.Builder(eVar.f25909a);
        }
        Notification notification = eVar.f25905T;
        this.f25967b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f25917i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f25913e).setContentText(eVar.f25914f).setContentInfo(eVar.f25919k).setContentIntent(eVar.f25915g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f25916h, (notification.flags & Log.TAG_YOUTUBE) != 0).setLargeIcon(eVar.f25918j).setNumber(eVar.f25920l).setProgress(eVar.f25928t, eVar.f25929u, eVar.f25930v);
        if (i2 < 21) {
            this.f25967b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i2 >= 16) {
            this.f25967b.setSubText(eVar.f25925q).setUsesChronometer(eVar.f25923o).setPriority(eVar.f25921m);
            Iterator<C7956h.C7957a> it = eVar.f25910b.iterator();
            while (it.hasNext()) {
                m13893b(it.next());
            }
            Bundle bundle = eVar.f25889D;
            if (bundle != null) {
                this.f25972g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.f25934z) {
                    this.f25972g.putBoolean("android.support.localOnly", true);
                }
                String str = eVar.f25931w;
                if (str != null) {
                    this.f25972g.putString("android.support.groupKey", str);
                    if (eVar.f25932x) {
                        this.f25972g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f25972g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = eVar.f25933y;
                if (str2 != null) {
                    this.f25972g.putString("android.support.sortKey", str2);
                }
            }
            this.f25969d = eVar.f25893H;
            this.f25970e = eVar.f25894I;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 17) {
            this.f25967b.setShowWhen(eVar.f25922n);
        }
        if (i3 >= 19 && i3 < 21 && (e = m13890e(m13888g(eVar.f25911c), eVar.f25908W)) != null && !e.isEmpty()) {
            this.f25972g.putStringArray("android.people", (String[]) e.toArray(new String[e.size()]));
        }
        if (i3 >= 20) {
            this.f25967b.setLocalOnly(eVar.f25934z).setGroup(eVar.f25931w).setGroupSummary(eVar.f25932x).setSortKey(eVar.f25933y);
            this.f25973h = eVar.f25901P;
        }
        if (i3 >= 21) {
            this.f25967b.setCategory(eVar.f25888C).setColor(eVar.f25890E).setVisibility(eVar.f25891F).setPublicVersion(eVar.f25892G).setSound(notification.sound, notification.audioAttributes);
            if (i3 < 28) {
                list = m13890e(m13888g(eVar.f25911c), eVar.f25908W);
            } else {
                list = eVar.f25908W;
            }
            if (list != null && !list.isEmpty()) {
                for (String str3 : list) {
                    this.f25967b.addPerson(str3);
                }
            }
            this.f25974i = eVar.f25895J;
            if (eVar.f25912d.size() > 0) {
                Bundle bundle2 = eVar.m13955g().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i4 = 0; i4 < eVar.f25912d.size(); i4++) {
                    bundle4.putBundle(Integer.toString(i4), C7975j.m13885b(eVar.f25912d.get(i4)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                eVar.m13955g().putBundle("android.car.EXTENSIONS", bundle2);
                this.f25972g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (icon = eVar.f25907V) != null) {
            this.f25967b.setSmallIcon(icon);
        }
        if (i5 >= 24) {
            this.f25967b.setExtras(eVar.f25889D).setRemoteInputHistory(eVar.f25927s);
            RemoteViews remoteViews = eVar.f25893H;
            if (remoteViews != null) {
                this.f25967b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f25894I;
            if (remoteViews2 != null) {
                this.f25967b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f25895J;
            if (remoteViews3 != null) {
                this.f25967b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            this.f25967b.setBadgeIconType(eVar.f25897L).setSettingsText(eVar.f25926r).setShortcutId(eVar.f25898M).setTimeoutAfter(eVar.f25900O).setGroupAlertBehavior(eVar.f25901P);
            if (eVar.f25887B) {
                this.f25967b.setColorized(eVar.f25886A);
            }
            if (!TextUtils.isEmpty(eVar.f25896K)) {
                this.f25967b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 28) {
            Iterator<C7983l> it2 = eVar.f25911c.iterator();
            while (it2.hasNext()) {
                this.f25967b.addPerson(it2.next().m13853h());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.f25967b.setAllowSystemGeneratedContextualActions(eVar.f25903R);
            this.f25967b.setBubbleMetadata(C7956h.C7964d.m13976a(eVar.f25904S));
            C8125b bVar = eVar.f25899N;
            if (bVar != null) {
                this.f25967b.setLocusId(bVar.m13411c());
            }
        }
        if (C10326a.m5418c() && (i = eVar.f25902Q) != 0) {
            this.f25967b.setForegroundServiceBehavior(i);
        }
        if (eVar.f25906U) {
            if (this.f25968c.f25932x) {
                this.f25973h = 2;
            } else {
                this.f25973h = 1;
            }
            this.f25967b.setVibrate(null);
            this.f25967b.setSound(null);
            int i7 = notification.defaults & (-2);
            notification.defaults = i7;
            int i8 = i7 & (-3);
            notification.defaults = i8;
            this.f25967b.setDefaults(i8);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f25968c.f25931w)) {
                    this.f25967b.setGroup("silent");
                }
                this.f25967b.setGroupAlertBehavior(this.f25973h);
            }
        }
    }

    public static List<String> m13890e(List<String> list, List<String> list2) {
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

    public static List<String> m13888g(List<C7983l> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C7983l lVar : list) {
            arrayList.add(lVar.m13854g());
        }
        return arrayList;
    }

    @Override
    public Notification.Builder mo13894a() {
        return this.f25967b;
    }

    public final void m13893b(C7956h.C7957a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            IconCompat e = aVar.m13994e();
            if (i >= 23) {
                builder = new Notification.Action.Builder(e != null ? e.m40309r() : null, aVar.m13990i(), aVar.m13998a());
            } else {
                builder = new Notification.Action.Builder(e != null ? e.m40321f() : 0, aVar.m13990i(), aVar.m13998a());
            }
            if (aVar.m13993f() != null) {
                for (RemoteInput remoteInput : C7985m.m13843b(aVar.m13993f())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (aVar.m13995d() != null) {
                bundle = new Bundle(aVar.m13995d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m13997b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(aVar.m13997b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.m13992g());
            if (i2 >= 28) {
                builder.setSemanticAction(aVar.m13992g());
            }
            if (i2 >= 29) {
                builder.setContextual(aVar.m13989j());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.m13991h());
            builder.addExtras(bundle);
            this.f25967b.addAction(builder.build());
        } else if (i >= 16) {
            this.f25971f.add(C7975j.m13881f(this.f25967b, aVar));
        }
    }

    public Notification m13892c() {
        Bundle a;
        RemoteViews f;
        RemoteViews d;
        C7956h.AbstractC7973j jVar = this.f25968c.f25924p;
        if (jVar != null) {
            jVar.mo13900b(this);
        }
        RemoteViews e = jVar != null ? jVar.m13897e(this) : null;
        Notification d2 = m13891d();
        if (e != null) {
            d2.contentView = e;
        } else {
            RemoteViews remoteViews = this.f25968c.f25893H;
            if (remoteViews != null) {
                d2.contentView = remoteViews;
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (!(i < 16 || jVar == null || (d = jVar.m13898d(this)) == null)) {
            d2.bigContentView = d;
        }
        if (!(i < 21 || jVar == null || (f = this.f25968c.f25924p.m13896f(this)) == null)) {
            d2.headsUpContentView = f;
        }
        if (!(i < 16 || jVar == null || (a = C7956h.m13999a(d2)) == null)) {
            jVar.mo13901a(a);
        }
        return d2;
    }

    public Notification m13891d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f25967b.build();
        }
        if (i >= 24) {
            Notification build = this.f25967b.build();
            if (this.f25973h != 0) {
                if (!(build.getGroup() == null || (build.flags & Log.TAG_GIF_LOADER) == 0 || this.f25973h != 2)) {
                    m13887h(build);
                }
                if (build.getGroup() != null && (build.flags & Log.TAG_GIF_LOADER) == 0 && this.f25973h == 1) {
                    m13887h(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f25967b.setExtras(this.f25972g);
            Notification build2 = this.f25967b.build();
            RemoteViews remoteViews = this.f25969d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f25970e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f25974i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f25973h != 0) {
                if (!(build2.getGroup() == null || (build2.flags & Log.TAG_GIF_LOADER) == 0 || this.f25973h != 2)) {
                    m13887h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & Log.TAG_GIF_LOADER) == 0 && this.f25973h == 1) {
                    m13887h(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f25967b.setExtras(this.f25972g);
            Notification build3 = this.f25967b.build();
            RemoteViews remoteViews4 = this.f25969d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f25970e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f25973h != 0) {
                if (!(build3.getGroup() == null || (build3.flags & Log.TAG_GIF_LOADER) == 0 || this.f25973h != 2)) {
                    m13887h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & Log.TAG_GIF_LOADER) == 0 && this.f25973h == 1) {
                    m13887h(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a = C7975j.m13886a(this.f25971f);
            if (a != null) {
                this.f25972g.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f25967b.setExtras(this.f25972g);
            Notification build4 = this.f25967b.build();
            RemoteViews remoteViews6 = this.f25969d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f25970e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f25967b.getNotification();
        } else {
            Notification build5 = this.f25967b.build();
            Bundle a2 = C7956h.m13999a(build5);
            Bundle bundle = new Bundle(this.f25972g);
            for (String str : this.f25972g.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C7975j.m13886a(this.f25971f);
            if (a3 != null) {
                C7956h.m13999a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f25969d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f25970e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    public Context m13889f() {
        return this.f25966a;
    }

    public final void m13887h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }
}
