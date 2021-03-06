package m5;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import org.thunderdog.challegram.Log;

public final class r1 {
    public static final Uri f17254a;
    public static final Uri f17255b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f17254a = parse;
        f17255b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent a(String str) {
        Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent b(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(Log.TAG_PLAYER);
        return intent;
    }

    public static Intent c() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }
}
