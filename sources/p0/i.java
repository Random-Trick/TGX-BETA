package p0;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.thunderdog.challegram.Log;
import p0.h;
import q0.b;
import y0.a;

public class i implements g {
    public final Context f20340a;
    public final Notification.Builder f20341b;
    public final h.e f20342c;
    public RemoteViews f20343d;
    public RemoteViews f20344e;
    public final List<Bundle> f20345f = new ArrayList();
    public final Bundle f20346g = new Bundle();
    public int f20347h;
    public RemoteViews f20348i;

    public i(h.e eVar) {
        List<String> list;
        int i10;
        Icon icon;
        this.f20342c = eVar;
        this.f20340a = eVar.f20283a;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20341b = new Notification.Builder(eVar.f20283a, eVar.K);
        } else {
            this.f20341b = new Notification.Builder(eVar.f20283a);
        }
        Notification notification = eVar.S;
        this.f20341b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f20291i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f20287e).setContentText(eVar.f20288f).setContentInfo(eVar.f20293k).setContentIntent(eVar.f20289g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f20290h, (notification.flags & Log.TAG_YOUTUBE) != 0).setLargeIcon(eVar.f20292j).setNumber(eVar.f20294l).setProgress(eVar.f20302t, eVar.f20303u, eVar.f20304v);
        this.f20341b.setSubText(eVar.f20299q).setUsesChronometer(eVar.f20297o).setPriority(eVar.f20295m);
        Iterator<h.a> it = eVar.f20284b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.f20346g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f20343d = eVar.H;
        this.f20344e = eVar.I;
        this.f20341b.setShowWhen(eVar.f20296n);
        this.f20341b.setLocalOnly(eVar.f20308z).setGroup(eVar.f20305w).setGroupSummary(eVar.f20306x).setSortKey(eVar.f20307y);
        this.f20347h = eVar.P;
        this.f20341b.setCategory(eVar.C).setColor(eVar.E).setVisibility(eVar.F).setPublicVersion(eVar.G).setSound(notification.sound, notification.audioAttributes);
        if (i11 < 28) {
            list = e(g(eVar.f20285c), eVar.V);
        } else {
            list = eVar.V;
        }
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                this.f20341b.addPerson(str);
            }
        }
        this.f20348i = eVar.J;
        if (eVar.f20286d.size() > 0) {
            Bundle bundle2 = eVar.g().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f20286d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), j.a(eVar.f20286d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.g().putBundle("android.car.EXTENSIONS", bundle2);
            this.f20346g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 23 && (icon = eVar.U) != null) {
            this.f20341b.setSmallIcon(icon);
        }
        if (i13 >= 24) {
            this.f20341b.setExtras(eVar.D).setRemoteInputHistory(eVar.f20301s);
            RemoteViews remoteViews = eVar.H;
            if (remoteViews != null) {
                this.f20341b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.I;
            if (remoteViews2 != null) {
                this.f20341b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.J;
            if (remoteViews3 != null) {
                this.f20341b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i13 >= 26) {
            this.f20341b.setBadgeIconType(eVar.L).setSettingsText(eVar.f20300r).setShortcutId(eVar.M).setTimeoutAfter(eVar.O).setGroupAlertBehavior(eVar.P);
            if (eVar.B) {
                this.f20341b.setColorized(eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f20341b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator<l> it2 = eVar.f20285c.iterator();
            while (it2.hasNext()) {
                this.f20341b.addPerson(it2.next().h());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            this.f20341b.setAllowSystemGeneratedContextualActions(eVar.R);
            this.f20341b.setBubbleMetadata(h.d.a(null));
            b bVar = eVar.N;
            if (bVar != null) {
                this.f20341b.setLocusId(bVar.c());
            }
        }
        if (a.c() && (i10 = eVar.Q) != 0) {
            this.f20341b.setForegroundServiceBehavior(i10);
        }
        if (eVar.T) {
            if (this.f20342c.f20306x) {
                this.f20347h = 2;
            } else {
                this.f20347h = 1;
            }
            this.f20341b.setVibrate(null);
            this.f20341b.setSound(null);
            int i15 = notification.defaults & (-2) & (-3);
            notification.defaults = i15;
            this.f20341b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f20342c.f20305w)) {
                    this.f20341b.setGroup("silent");
                }
                this.f20341b.setGroupAlertBehavior(this.f20347h);
            }
        }
    }

    public static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        k0.b bVar = new k0.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    public static List<String> g(List<l> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (l lVar : list) {
            arrayList.add(lVar.g());
        }
        return arrayList;
    }

    @Override
    public Notification.Builder a() {
        return this.f20341b;
    }

    public final void b(h.a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i10 = Build.VERSION.SDK_INT;
        IconCompat d10 = aVar.d();
        if (i10 >= 23) {
            builder = new Notification.Action.Builder(d10 != null ? d10.r() : null, aVar.h(), aVar.a());
        } else {
            builder = new Notification.Action.Builder(d10 != null ? d10.f() : 0, aVar.h(), aVar.a());
        }
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : m.b(aVar.e())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (aVar.c() != null) {
            bundle = new Bundle(aVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i11 >= 28) {
            builder.setSemanticAction(aVar.f());
        }
        if (i11 >= 29) {
            builder.setContextual(aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        builder.addExtras(bundle);
        this.f20341b.addAction(builder.build());
    }

    public Notification c() {
        Bundle a10;
        RemoteViews f10;
        RemoteViews d10;
        h.j jVar = this.f20342c.f20298p;
        if (jVar != null) {
            jVar.b(this);
        }
        RemoteViews e10 = jVar != null ? jVar.e(this) : null;
        Notification d11 = d();
        if (e10 != null) {
            d11.contentView = e10;
        } else {
            RemoteViews remoteViews = this.f20342c.H;
            if (remoteViews != null) {
                d11.contentView = remoteViews;
            }
        }
        if (!(jVar == null || (d10 = jVar.d(this)) == null)) {
            d11.bigContentView = d10;
        }
        if (!(jVar == null || (f10 = this.f20342c.f20298p.f(this)) == null)) {
            d11.headsUpContentView = f10;
        }
        if (!(jVar == null || (a10 = h.a(d11)) == null)) {
            jVar.a(a10);
        }
        return d11;
    }

    public Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return this.f20341b.build();
        }
        if (i10 >= 24) {
            Notification build = this.f20341b.build();
            if (this.f20347h != 0) {
                if (!(build.getGroup() == null || (build.flags & Log.TAG_GIF_LOADER) == 0 || this.f20347h != 2)) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & Log.TAG_GIF_LOADER) == 0 && this.f20347h == 1) {
                    h(build);
                }
            }
            return build;
        }
        this.f20341b.setExtras(this.f20346g);
        Notification build2 = this.f20341b.build();
        RemoteViews remoteViews = this.f20343d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f20344e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f20348i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.f20347h != 0) {
            if (!(build2.getGroup() == null || (build2.flags & Log.TAG_GIF_LOADER) == 0 || this.f20347h != 2)) {
                h(build2);
            }
            if (build2.getGroup() != null && (build2.flags & Log.TAG_GIF_LOADER) == 0 && this.f20347h == 1) {
                h(build2);
            }
        }
        return build2;
    }

    public Context f() {
        return this.f20340a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }
}
