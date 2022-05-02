package be;

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
import gd.C4779t2;
import ge.C4868i;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import nc.C7389v0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.receiver.LiveLocationReceiver;
import org.thunderdog.challegram.receiver.TGShareBroadcastReceiver;
import p067ed.C4183a;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5070i;
import p212p.C7939b;
import p227q0.C8117a;
import p364zd.C11524j;

public class C1405v {
    public static ArrayList<Uri> f5100a;
    public static File f5101b;

    public static boolean m37142A(double d, double d2, String str, String str2) {
        try {
            String encode = URLEncoder.encode(m37114g(d, d2, str, str2, true), "UTF-8");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.google.com/maps/search/?api=1&query=" + encode));
            C1379j0.m37373A0(intent);
            return true;
        } catch (Throwable th) {
            Log.m14710w("Cannot launch map intent", th, new Object[0]);
            return m37095z(d, d2);
        }
    }

    public static void m37141B(String str) {
        try {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + str));
            C1379j0.m37373A0(intent);
        } catch (Throwable th) {
            Log.m14710w("Cannot open dial intent", th, new Object[0]);
        }
    }

    public static void m37140C() {
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + C1379j0.m37315n().getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(Log.TAG_TDLIB_OPTIONS);
            intent.addFlags(8388608);
            C1379j0.m37373A0(intent);
        } catch (Throwable th) {
            Log.m14710w("Cannot open settings intent", th, new Object[0]);
        }
    }

    public static boolean m37139D() {
        return m37100u("org.thunderdog.challegram");
    }

    public static boolean m37138E(String str) {
        if (str != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.setFlags(268435456);
                AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
                if (E != null) {
                    E.startActivity(intent);
                    return true;
                }
            } catch (Throwable th) {
                Log.m14710w("Cannot open uri: %s", th, str);
            }
        }
        return false;
    }

    public static boolean m37137F(Uri uri) {
        if (m37099v(C1379j0.m37366E(), uri, false)) {
            return true;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        return m37104q(intent, null);
    }

    public static void m37136G() {
        m37098w("android.settings.WIRELESS_SETTINGS");
    }

    public static void m37135H(Uri uri) {
        if (Build.VERSION.SDK_INT <= 19) {
            try {
                C1379j0.m37315n().revokeUriPermission(uri, 1);
            } catch (Throwable th) {
                Log.m14725e("Cannot revokeUriPermission", th, new Object[0]);
            }
        }
    }

    public static void m37134I() {
        if (Build.VERSION.SDK_INT <= 19) {
            synchronized (C1405v.class) {
                if (f5100a != null) {
                    while (!f5100a.isEmpty()) {
                        int size = f5100a.size() - 1;
                        m37135H(f5100a.get(size));
                        f5100a.remove(size);
                    }
                }
            }
        }
    }

    public static Intent m37133J(Intent intent, boolean z) {
        intent.setPackage("org.thunderdog.challegram");
        if (z) {
            intent.addFlags(32);
        }
        return intent;
    }

    public static void m37132K(String str) {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str, null));
            intent.putExtra("android.intent.extra.SUBJECT", "");
            intent.putExtra("android.intent.extra.TEXT", "");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
            C1379j0.m37373A0(Intent.createChooser(intent, C4403w.m27865j1(R.string.SendMessageToX, str)));
        } catch (Throwable unused) {
            C1379j0.m37290z0("No Email app found", 0);
        }
    }

    public static void m37131L(String str, String str2, String str3) {
        m37130M(str, str2, str3, null);
    }

    public static void m37130M(String str, String str2, String str3, String str4) {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str, null));
            intent.putExtra("android.intent.extra.SUBJECT", str2);
            intent.putExtra("android.intent.extra.TEXT", str3);
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
            C1379j0.m37373A0(Intent.createChooser(intent, C4403w.m27865j1(R.string.SendMessageToX, str)));
        } catch (Throwable unused) {
            if (str4 != null) {
                C1379j0.m37290z0(str4, 1);
                return;
            }
            C1379j0.m37292y0(R.string.NoEmailApp, 0);
            C1379j0.m37290z0(C4403w.m27865j1(R.string.SendMessageToX, str), 1);
        }
    }

    public static void m37129N(String str, String str2) {
        try {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
                intent.putExtra("sms_body", str2);
                C1379j0.m37373A0(intent);
            } catch (Throwable unused) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setType("vnd.android-dir/mms-sms");
                intent2.putExtra("address", str);
                intent2.putExtra("sms_body", str2);
                C1379j0.m37373A0(intent2);
            }
        } catch (Throwable th) {
            Log.m14710w("Cannot send SMS", th, new Object[0]);
        }
    }

    public static void m37128O(String str) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            C1379j0.m37373A0(Intent.createChooser(intent, C4403w.m27869i1(R.string.ShareTitleText)));
        } catch (Throwable th) {
            Log.m14710w("Cannot share text", th, new Object[0]);
        }
    }

    public static File m37127P() {
        File file = f5101b;
        if (file != null && !file.exists()) {
            file = null;
        }
        f5101b = null;
        return file;
    }

    public static Intent m37126Q() {
        Intent intent = new Intent(C1379j0.m37309q(), MainActivity.class);
        m37133J(intent, false);
        intent.setAction("org.thunderdog.challegram.OPEN_CALL");
        return intent;
    }

    public static Intent m37125R(int i, long j, long j2) {
        Intent intent = new Intent(C1379j0.m37309q(), MainActivity.class);
        m37133J(intent, true);
        intent.setAction("org.thunderdog.challegram.OPEN_CHAT." + i + "." + j + "." + Math.random());
        intent.putExtra("account_id", i);
        intent.putExtra("local_id", j);
        intent.putExtra("message_id", j2);
        return intent;
    }

    public static Intent m37124S(boolean z) {
        Intent intent = new Intent(C1379j0.m37309q(), MainActivity.class);
        m37133J(intent, false);
        intent.setAction(z ? "org.thunderdog.challegram.ACTION_RESOLVE_LOCATION" : "org.thunderdog.challegram.ACTION_VIEW_LOCATION");
        return intent;
    }

    public static Intent m37123T(String str) {
        Intent intent = new Intent(C1379j0.m37309q(), LiveLocationReceiver.class);
        m37133J(intent, false);
        intent.setAction(str);
        return intent;
    }

    public static Intent m37122U(int i) {
        Intent intent = new Intent(C1379j0.m37309q(), MainActivity.class);
        m37133J(intent, true);
        intent.setAction("org.thunderdog.challegram.OPEN_MAIN." + i);
        intent.putExtra("account_id", i);
        return intent;
    }

    public static Intent m37121V(int i) {
        Intent intent = new Intent(C1379j0.m37309q(), MainActivity.class);
        m37133J(intent, false);
        intent.setAction("org.thunderdog.challegram.OPEN_PLAYER." + i);
        intent.putExtra("account_id", i);
        return intent;
    }

    public static String m37116e(String str) {
        int indexOf;
        return (C5070i.m24061i(str) || (indexOf = str.indexOf("?random_id=")) == -1) ? str : str.substring(0, indexOf);
    }

    public static List<ResolveInfo> m37115f(Context context) {
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

    public static String m37114g(double d, double d2, String str, String str2, boolean z) {
        StringBuilder sb2 = new StringBuilder();
        if (!C5070i.m24061i(str)) {
            sb2.append(str);
            sb2.append(", ");
        }
        if (!C5070i.m24061i(str2)) {
            sb2.append(str2);
            if (z) {
                sb2.append(", ");
                sb2.append(d);
                sb2.append(",");
                sb2.append(d2);
            }
        } else {
            sb2.append(d);
            sb2.append(",");
            sb2.append(d2);
        }
        return sb2.toString();
    }

    @TargetApi(26)
    public static String m37109l(String str, int i) {
        NotificationManager notificationManager = (NotificationManager) C1379j0.m37315n().getSystemService("notification");
        if (notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel(str, C4403w.m27869i1(i), 2);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return str;
    }

    public static void m37108m() {
        m37098w("android.settings.AIRPLANE_MODE_SETTINGS");
    }

    public static void m37107n() {
        if (!C7389v0.m16559y2(RunnableC1404u.f5099a, "android.permission.READ_EXTERNAL_STORAGE")) {
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("audio/*");
                C1379j0.m37371B0(intent, 102);
            } catch (Throwable th) {
                Log.m14710w("Cannot open audio intent", th, new Object[0]);
            }
        }
    }

    public static void m37106o(final Context context, final boolean z, final boolean z2) {
        if (z2) {
            if (C7389v0.m16559y2(new Runnable() {
                @Override
                public final void run() {
                    C1405v.m37106o(context, z, z2);
                }
            }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) {
                return;
            }
        } else if (C7389v0.m16559y2(new Runnable() {
            @Override
            public final void run() {
                C1405v.m37106o(context, z, z2);
            }
        }, "android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return;
        }
        try {
            Intent intent = new Intent(z2 ? "android.media.action.VIDEO_CAPTURE" : "android.media.action.IMAGE_CAPTURE");
            File j0 = C7389v0.m16621j0(z, z2);
            if (j0 != null) {
                Uri L = C7389v0.m16714L(j0);
                if (L != null) {
                    intent.putExtra("output", L);
                } else {
                    return;
                }
            }
            f5101b = j0;
            C1379j0.m37307r(context).startActivityForResult(intent, z2 ? 109 : 100);
        } catch (Throwable th) {
            Log.m14710w("Cannot open camera intent", th, new Object[0]);
        }
    }

    public static void m37105p(double d, double d2, String str, String str2) {
        try {
            String encode = URLEncoder.encode(m37114g(d, d2, str, str2, false), "UTF-8");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.google.com/maps/dir/?api=1&destination=" + encode));
            C1379j0.m37373A0(intent);
        } catch (Throwable th) {
            Log.m14710w("Cannot launch directions intent", th, new Object[0]);
            m37142A(d, d2, str, str2);
        }
    }

    public static boolean m37104q(Intent intent, Bundle bundle) {
        Uri data = intent.getData();
        if (data != null && ("http".equals(intent.getScheme()) || "https".equals(intent.getScheme()))) {
            try {
                intent.setData(Uri.parse("https://www.example.com/"));
                List<ResolveInfo> queryIntentActivities = C1379j0.m37315n().getPackageManager().queryIntentActivities(intent, 0);
                ArrayList arrayList = new ArrayList();
                String[] strArr = {"org.thunderdog.challegram", "org.telegram.messenger"};
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    String str = resolveInfo.activityInfo.packageName;
                    if (C5062b.m24152t(strArr, str) == -1) {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setPackage(str);
                        intent2.setData(data);
                        arrayList.add(intent2);
                    }
                }
                AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
                if (E != null) {
                    if (arrayList.size() == 1) {
                        C8117a.m13432l(E, (Intent) arrayList.get(0), bundle);
                        return true;
                    } else if (arrayList.size() > 0) {
                        Intent createChooser = Intent.createChooser((Intent) arrayList.remove(0), C4403w.m27869i1(R.string.OpenInExternalApp));
                        if (!arrayList.isEmpty()) {
                            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                        }
                        C8117a.m13432l(E, createChooser, bundle);
                        return true;
                    }
                }
            } catch (Throwable th) {
                Log.m14725e("Unable to find proper activity", th, new Object[0]);
            }
        }
        return false;
    }

    public static boolean m37103r(File file, String str) {
        return m37102s(file, str, false);
    }

    public static boolean m37102s(final File file, final String str, final boolean z) {
        Uri O1;
        int lastIndexOf;
        Intent intent;
        if (!z) {
            String z2 = C7389v0.m16555z2(file.getPath());
            if (!C5070i.m24061i(z2)) {
                str = z2;
            }
        }
        if (C7389v0.m16559y2(new Runnable() {
            @Override
            public final void run() {
                C1405v.m37102s(file, str, z);
            }
        }, "android.permission.READ_EXTERNAL_STORAGE") || (O1 = C7389v0.m16700O1(file, str, z)) == null) {
            return false;
        }
        try {
            int i = Build.VERSION.SDK_INT;
            boolean z3 = i >= 24 && C5070i.m24067c(str, "application/vnd.android.package-archive");
            if (z3) {
                intent = new Intent("android.intent.action.INSTALL_PACKAGE");
            } else {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.setDataAndType(O1, str);
            if (z3 || "content".equals(O1.getScheme())) {
                intent.setFlags(1);
            }
            PackageManager packageManager = C1379j0.m37315n().getPackageManager();
            if (i <= 19) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, Log.TAG_COMPRESS)) {
                    C1379j0.m37315n().grantUriPermission(resolveInfo.activityInfo.packageName, O1, 1);
                }
                synchronized (C1405v.class) {
                    if (f5100a == null) {
                        f5100a = new ArrayList<>();
                    }
                    if (!f5100a.contains(O1)) {
                        f5100a.add(O1);
                    }
                }
            }
            if (intent.resolveActivity(packageManager) != null) {
                C1379j0.m37373A0(intent);
                return true;
            }
        } catch (Throwable th) {
            Log.m14725e("Cannot open Intent", th, new Object[0]);
            C1379j0.m37290z0(th.toString(), 1);
        }
        if (Build.VERSION.SDK_INT <= 19) {
            synchronized (C1405v.class) {
                m37135H(O1);
                ArrayList<Uri> arrayList = f5100a;
                if (arrayList != null) {
                    arrayList.remove(O1);
                }
            }
        }
        Log.m14724e("ACTION_VIEW failed. Mime: %s, Uri:\n%s", str, O1.toString());
        if (z || C5070i.m24061i(str)) {
            return !z && m37102s(file, str, true);
        }
        if (str.endsWith("/*") || (lastIndexOf = str.lastIndexOf(47)) == -1) {
            return m37102s(file, null, true);
        }
        return m37102s(file, str.substring(0, lastIndexOf + 1) + "*", true);
    }

    public static void m37101t(final boolean z) {
        if (!C7389v0.m16559y2(new Runnable() {
            @Override
            public final void run() {
                C1405v.m37101t(z);
            }
        }, "android.permission.READ_EXTERNAL_STORAGE")) {
            try {
                Intent intent = new Intent("android.intent.action.PICK");
                intent.setType("image/*");
                C1379j0.m37371B0(intent, z ? 104 : 101);
            } catch (Throwable th) {
                Log.m14710w("Cannot open gallery intent", th, new Object[0]);
            }
        }
    }

    public static boolean m37100u(String str) {
        if (!m37138E("market://details?id=" + str)) {
            if (!m37138E("https://play.google.com/store/apps/details?id=" + str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean m37099v(Activity activity, Uri uri, boolean z) {
        if (!(activity == null || uri == null)) {
            try {
                String lowerCase = uri.getScheme() != null ? uri.getScheme().toLowerCase() : "";
                if (C4183a.f14094l && ((z || C4868i.m24726c2().m24610q6()) && !lowerCase.equals("tel"))) {
                    Intent intent = new Intent(C1379j0.m37309q(), TGShareBroadcastReceiver.class);
                    intent.setAction("android.intent.action.SEND");
                    C7939b.C7940a aVar = new C7939b.C7940a();
                    aVar.m14030f(C11524j.m228N(R.id.theme_color_headerBackground));
                    aVar.m14033c(C11524j.m228N(R.id.theme_color_headerText));
                    aVar.m14031e(true);
                    aVar.m14034b(C1362c.m37481h(R.drawable.baseline_share_24), C4403w.m27869i1(R.string.Share), PendingIntent.getBroadcast(C1379j0.m37309q(), 0, intent, 0), true);
                    C7939b a = aVar.m14035a();
                    a.f25822a.addFlags(268435456);
                    if (C4779t2.m25527e3(uri)) {
                        List<ResolveInfo> f = m37115f(activity);
                        if (f.isEmpty()) {
                            return m37104q(a.f25822a, a.f25823b);
                        }
                        a.f25822a.setPackage(f.get(0).activityInfo.packageName);
                    }
                    a.m14036a(activity, uri);
                    return true;
                }
            } catch (Throwable th) {
                Log.m14725e("Cant launch CustomTabs client", th, new Object[0]);
            }
        }
        return false;
    }

    public static void m37098w(String str) {
        try {
            Intent intent = new Intent(str);
            intent.setFlags(268435456);
            C1379j0.m37373A0(intent);
        } catch (Throwable th) {
            Log.m14710w("Cannot open settings intent", th, new Object[0]);
        }
    }

    public static void m37097x(String str) {
        Uri l0;
        if (!C5070i.m24061i(str) && (l0 = C1363c0.m37424l0(str)) != null && !m37096y(l0)) {
            String scheme = l0.getScheme();
            if (C1363c0.m37457Q(scheme) && scheme.contains("/")) {
                m37097x("http://" + l0);
            }
        }
    }

    public static boolean m37096y(Uri uri) {
        if (uri != null) {
            try {
                AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
                if (C1379j0.m37364F() == 0 && m37099v(E, uri, false)) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                intent.setFlags(268435456);
                C1379j0.m37373A0(intent);
                return true;
            } catch (Throwable th) {
                Log.m14710w("Cannot open link: %s", th, uri);
            }
        }
        return false;
    }

    public static boolean m37095z(double d, double d2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format(Locale.US, "geo:%f,%f?q=%f,%f", Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d), Double.valueOf(d2))));
            C1379j0.m37373A0(intent);
            return true;
        } catch (Throwable th) {
            Log.m14710w("Cannot open map", th, new Object[0]);
            return false;
        }
    }
}
