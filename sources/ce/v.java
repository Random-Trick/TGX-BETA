package ce;

import ae.j;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import gd.w;
import hd.t2;
import ib.b;
import ib.i;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import org.thunderdog.challegram.receiver.LiveLocationReceiver;
import org.thunderdog.challegram.receiver.TGShareBroadcastReceiver;
import p.b;

public class v {
    public static File f5354a;

    public static boolean A(double d10, double d11, String str, String str2) {
        try {
            String encode = URLEncoder.encode(g(d10, d11, str, str2, true), "UTF-8");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.google.com/maps/search/?api=1&query=" + encode));
            j0.A0(intent);
            return true;
        } catch (Throwable th) {
            Log.w("Cannot launch map intent", th, new Object[0]);
            return z(d10, d11);
        }
    }

    public static void B(String str) {
        try {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + str));
            j0.A0(intent);
        } catch (Throwable th) {
            Log.w("Cannot open dial intent", th, new Object[0]);
        }
    }

    public static void C() {
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + j0.n().getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(Log.TAG_TDLIB_OPTIONS);
            intent.addFlags(8388608);
            j0.A0(intent);
        } catch (Throwable th) {
            Log.w("Cannot open settings intent", th, new Object[0]);
        }
    }

    public static boolean D() {
        return u("org.thunderdog.challegram");
    }

    public static boolean E(String str) {
        if (str != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.setFlags(268435456);
                a E = j0.E();
                if (E != null) {
                    E.startActivity(intent);
                    return true;
                }
            } catch (Throwable th) {
                Log.w("Cannot open uri: %s", th, str);
            }
        }
        return false;
    }

    public static boolean F(Uri uri) {
        if (v(j0.E(), uri, false)) {
            return true;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        return q(intent, null);
    }

    public static void G() {
        w("android.settings.WIRELESS_SETTINGS");
    }

    public static void H() {
    }

    public static Intent I(Intent intent, boolean z10) {
        intent.setPackage("org.thunderdog.challegram");
        if (z10) {
            intent.addFlags(32);
        }
        return intent;
    }

    public static void J(String str) {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str, null));
            intent.putExtra("android.intent.extra.SUBJECT", "");
            intent.putExtra("android.intent.extra.TEXT", "");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
            j0.A0(Intent.createChooser(intent, w.j1(R.string.SendMessageToX, str)));
        } catch (Throwable unused) {
            j0.z0("No Email app found", 0);
        }
    }

    public static void K(String str, String str2, String str3) {
        L(str, str2, str3, null);
    }

    public static void L(String str, String str2, String str3, String str4) {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str, null));
            intent.putExtra("android.intent.extra.SUBJECT", str2);
            intent.putExtra("android.intent.extra.TEXT", str3);
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
            j0.A0(Intent.createChooser(intent, w.j1(R.string.SendMessageToX, str)));
        } catch (Throwable unused) {
            if (str4 != null) {
                j0.z0(str4, 1);
                return;
            }
            j0.y0(R.string.NoEmailApp, 0);
            j0.z0(w.j1(R.string.SendMessageToX, str), 1);
        }
    }

    public static void M(String str, String str2) {
        try {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
                intent.putExtra("sms_body", str2);
                j0.A0(intent);
            } catch (Throwable unused) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setType("vnd.android-dir/mms-sms");
                intent2.putExtra("address", str);
                intent2.putExtra("sms_body", str2);
                j0.A0(intent2);
            }
        } catch (Throwable th) {
            Log.w("Cannot send SMS", th, new Object[0]);
        }
    }

    public static void N(String str) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            j0.A0(Intent.createChooser(intent, w.i1(R.string.ShareTitleText)));
        } catch (Throwable th) {
            Log.w("Cannot share text", th, new Object[0]);
        }
    }

    public static File O() {
        File file = f5354a;
        if (file != null && !file.exists()) {
            file = null;
        }
        f5354a = null;
        return file;
    }

    public static Intent P() {
        Intent intent = new Intent(j0.q(), MainActivity.class);
        I(intent, false);
        intent.setAction("org.thunderdog.challegram.OPEN_CALL");
        return intent;
    }

    public static Intent Q(int i10, long j10, long j11) {
        Intent intent = new Intent(j0.q(), MainActivity.class);
        I(intent, true);
        intent.setAction("org.thunderdog.challegram.OPEN_CHAT." + i10 + "." + j10 + "." + Math.random());
        intent.putExtra("account_id", i10);
        intent.putExtra("local_id", j10);
        intent.putExtra("message_id", j11);
        return intent;
    }

    public static Intent R(boolean z10) {
        Intent intent = new Intent(j0.q(), MainActivity.class);
        I(intent, false);
        intent.setAction(z10 ? "org.thunderdog.challegram.ACTION_RESOLVE_LOCATION" : "org.thunderdog.challegram.ACTION_VIEW_LOCATION");
        return intent;
    }

    public static Intent S(String str) {
        Intent intent = new Intent(j0.q(), LiveLocationReceiver.class);
        I(intent, false);
        intent.setAction(str);
        return intent;
    }

    public static Intent T(int i10) {
        Intent intent = new Intent(j0.q(), MainActivity.class);
        I(intent, true);
        intent.setAction("org.thunderdog.challegram.OPEN_MAIN." + i10);
        intent.putExtra("account_id", i10);
        return intent;
    }

    public static Intent U(int i10) {
        Intent intent = new Intent(j0.q(), MainActivity.class);
        I(intent, false);
        intent.setAction("org.thunderdog.challegram.OPEN_PLAYER." + i10);
        intent.putExtra("account_id", i10);
        return intent;
    }

    public static String e(String str) {
        int indexOf;
        return (i.i(str) || (indexOf = str.indexOf("?random_id=")) == -1) ? str : str.substring(0, indexOf);
    }

    public static List<ResolveInfo> f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent, 0) != null) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public static String g(double d10, double d11, String str, String str2, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        if (!i.i(str)) {
            sb2.append(str);
            sb2.append(", ");
        }
        if (!i.i(str2)) {
            sb2.append(str2);
            if (z10) {
                sb2.append(", ");
                sb2.append(d10);
                sb2.append(",");
                sb2.append(d11);
            }
        } else {
            sb2.append(d10);
            sb2.append(",");
            sb2.append(d11);
        }
        return sb2.toString();
    }

    @TargetApi(26)
    public static String l(String str, int i10) {
        NotificationManager notificationManager = (NotificationManager) j0.n().getSystemService("notification");
        if (notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel(str, w.i1(i10), 2);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return str;
    }

    public static void m() {
        w("android.settings.AIRPLANE_MODE_SETTINGS");
    }

    public static void n() {
        if (!v0.y2(u.f5353a, "android.permission.READ_EXTERNAL_STORAGE")) {
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("audio/*");
                j0.B0(intent, 102);
            } catch (Throwable th) {
                Log.w("Cannot open audio intent", th, new Object[0]);
            }
        }
    }

    public static void o(final Context context, final boolean z10, final boolean z11) {
        if (z11) {
            if (v0.y2(new Runnable() {
                @Override
                public final void run() {
                    v.o(context, z10, z11);
                }
            }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) {
                return;
            }
        } else if (v0.y2(new Runnable() {
            @Override
            public final void run() {
                v.o(context, z10, z11);
            }
        }, "android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return;
        }
        try {
            Intent intent = new Intent(z11 ? "android.media.action.VIDEO_CAPTURE" : "android.media.action.IMAGE_CAPTURE");
            File j02 = v0.j0(z10, z11);
            if (j02 != null) {
                Uri L = v0.L(j02);
                if (L != null) {
                    intent.putExtra("output", L);
                } else {
                    return;
                }
            }
            f5354a = j02;
            j0.r(context).startActivityForResult(intent, z11 ? 109 : 100);
        } catch (Throwable th) {
            Log.w("Cannot open camera intent", th, new Object[0]);
        }
    }

    public static void p(double d10, double d11, String str, String str2) {
        try {
            String encode = URLEncoder.encode(g(d10, d11, str, str2, false), "UTF-8");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.google.com/maps/dir/?api=1&destination=" + encode));
            j0.A0(intent);
        } catch (Throwable th) {
            Log.w("Cannot launch directions intent", th, new Object[0]);
            A(d10, d11, str, str2);
        }
    }

    public static boolean q(Intent intent, Bundle bundle) {
        Uri data = intent.getData();
        if (data != null && ("http".equals(intent.getScheme()) || "https".equals(intent.getScheme()))) {
            try {
                intent.setData(Uri.parse("https://www.example.com/"));
                List<ResolveInfo> queryIntentActivities = j0.n().getPackageManager().queryIntentActivities(intent, 0);
                ArrayList arrayList = new ArrayList();
                String[] strArr = {"org.thunderdog.challegram", "org.telegram.messenger"};
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    String str = resolveInfo.activityInfo.packageName;
                    if (b.t(strArr, str) == -1) {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setPackage(str);
                        intent2.setData(data);
                        arrayList.add(intent2);
                    }
                }
                a E = j0.E();
                if (E != null) {
                    if (arrayList.size() == 1) {
                        q0.a.j(E, (Intent) arrayList.get(0), bundle);
                        return true;
                    } else if (arrayList.size() > 0) {
                        Intent createChooser = Intent.createChooser((Intent) arrayList.remove(0), w.i1(R.string.OpenInExternalApp));
                        if (!arrayList.isEmpty()) {
                            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                        }
                        q0.a.j(E, createChooser, bundle);
                        return true;
                    }
                }
            } catch (Throwable th) {
                Log.e("Unable to find proper activity", th, new Object[0]);
            }
        }
        return false;
    }

    public static boolean r(File file, String str) {
        return s(file, str, false);
    }

    public static boolean s(final File file, final String str, final boolean z10) {
        Uri O1;
        int lastIndexOf;
        Intent intent;
        if (!z10) {
            String z22 = v0.z2(file.getPath());
            if (!i.i(z22)) {
                str = z22;
            }
        }
        if (v0.y2(new Runnable() {
            @Override
            public final void run() {
                v.s(file, str, z10);
            }
        }, "android.permission.READ_EXTERNAL_STORAGE") || (O1 = v0.O1(file, str, z10)) == null) {
            return false;
        }
        try {
            boolean z11 = Build.VERSION.SDK_INT >= 24 && i.c(str, "application/vnd.android.package-archive");
            if (z11) {
                intent = new Intent("android.intent.action.INSTALL_PACKAGE");
            } else {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.setDataAndType(O1, str);
            if (z11 || "content".equals(O1.getScheme())) {
                intent.setFlags(1);
            }
            if (intent.resolveActivity(j0.n().getPackageManager()) != null) {
                j0.A0(intent);
                return true;
            }
        } catch (Throwable th) {
            Log.e("Cannot open Intent", th, new Object[0]);
            j0.z0(th.toString(), 1);
        }
        Log.e("ACTION_VIEW failed. Mime: %s, Uri:\n%s", str, O1.toString());
        if (z10 || i.i(str)) {
            return !z10 && s(file, str, true);
        }
        if (str.endsWith("/*") || (lastIndexOf = str.lastIndexOf(47)) == -1) {
            return s(file, null, true);
        }
        return s(file, str.substring(0, lastIndexOf + 1) + "*", true);
    }

    public static void t(final boolean z10) {
        if (!v0.y2(new Runnable() {
            @Override
            public final void run() {
                v.t(z10);
            }
        }, "android.permission.READ_EXTERNAL_STORAGE")) {
            try {
                Intent intent = new Intent("android.intent.action.PICK");
                intent.setType("image/*");
                j0.B0(intent, z10 ? 104 : 101);
            } catch (Throwable th) {
                Log.w("Cannot open gallery intent", th, new Object[0]);
            }
        }
    }

    public static boolean u(String str) {
        if (!E("market://details?id=" + str)) {
            if (!E("https://play.google.com/store/apps/details?id=" + str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(Activity activity, Uri uri, boolean z10) {
        if (!(activity == null || uri == null)) {
            try {
                String lowerCase = uri.getScheme() != null ? uri.getScheme().toLowerCase() : "";
                if (fd.a.f11890l && ((z10 || he.i.c2().q6()) && !lowerCase.equals("tel"))) {
                    Intent intent = new Intent(j0.q(), TGShareBroadcastReceiver.class);
                    intent.setAction("android.intent.action.SEND");
                    b.a aVar = new b.a();
                    aVar.f(j.L(R.id.theme_color_headerBackground));
                    aVar.c(j.L(R.id.theme_color_headerText));
                    aVar.e(true);
                    aVar.b(c.h(R.drawable.baseline_share_24), w.i1(R.string.Share), PendingIntent.getBroadcast(j0.q(), 0, intent, 0), true);
                    p.b a10 = aVar.a();
                    a10.f20227a.addFlags(268435456);
                    if (t2.e3(uri)) {
                        List<ResolveInfo> f10 = f(activity);
                        if (f10.isEmpty()) {
                            return q(a10.f20227a, a10.f20228b);
                        }
                        a10.f20227a.setPackage(f10.get(0).activityInfo.packageName);
                    }
                    a10.a(activity, uri);
                    return true;
                }
            } catch (Throwable th) {
                Log.e("Cant launch CustomTabs client", th, new Object[0]);
            }
        }
        return false;
    }

    public static void w(String str) {
        try {
            Intent intent = new Intent(str);
            intent.setFlags(268435456);
            j0.A0(intent);
        } catch (Throwable th) {
            Log.w("Cannot open settings intent", th, new Object[0]);
        }
    }

    public static void x(String str) {
        Uri l02;
        if (!i.i(str) && (l02 = c0.l0(str)) != null && !y(l02)) {
            String scheme = l02.getScheme();
            if (c0.Q(scheme) && scheme.contains("/")) {
                x("http://" + l02);
            }
        }
    }

    public static boolean y(Uri uri) {
        if (uri != null) {
            try {
                a E = j0.E();
                if (j0.F() == 0 && v(E, uri, false)) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                intent.setFlags(268435456);
                j0.A0(intent);
                return true;
            } catch (Throwable th) {
                Log.w("Cannot open link: %s", th, uri);
            }
        }
        return false;
    }

    public static boolean z(double d10, double d11) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format(Locale.US, "geo:%f,%f?q=%f,%f", Double.valueOf(d10), Double.valueOf(d11), Double.valueOf(d10), Double.valueOf(d11))));
            j0.A0(intent);
            return true;
        } catch (Throwable th) {
            Log.w("Cannot open map", th, new Object[0]);
            return false;
        }
    }
}
