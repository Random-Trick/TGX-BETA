package p212p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.ArrayList;
import p212p.C7937a;
import p213p0.C7951d;
import p227q0.C8117a;

public final class C7939b {
    public final Intent f25822a;
    public final Bundle f25823b;

    public static final class C7940a {
        public ArrayList<Bundle> f25826c;
        public Bundle f25827d;
        public ArrayList<Bundle> f25828e;
        public SparseArray<Bundle> f25829f;
        public Bundle f25830g;
        public final Intent f25824a = new Intent("android.intent.action.VIEW");
        public final C7937a.C7938a f25825b = new C7937a.C7938a();
        public int f25831h = 0;
        public boolean f25832i = true;

        public C7939b m14035a() {
            if (!this.f25824a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m14032d(null, null);
            }
            ArrayList<Bundle> arrayList = this.f25826c;
            if (arrayList != null) {
                this.f25824a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f25828e;
            if (arrayList2 != null) {
                this.f25824a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f25824a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f25832i);
            this.f25824a.putExtras(this.f25825b.m14039a().m14040a());
            Bundle bundle = this.f25830g;
            if (bundle != null) {
                this.f25824a.putExtras(bundle);
            }
            if (this.f25829f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f25829f);
                this.f25824a.putExtras(bundle2);
            }
            this.f25824a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f25831h);
            return new C7939b(this.f25824a, this.f25827d);
        }

        public C7940a m14034b(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.customaction.ID", 0);
            bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
            bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f25824a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
            this.f25824a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z);
            return this;
        }

        @Deprecated
        public C7940a m14033c(int i) {
            this.f25825b.m14038b(i);
            return this;
        }

        public final void m14032d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C7951d.m14010a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f25824a.putExtras(bundle);
        }

        public C7940a m14031e(boolean z) {
            this.f25824a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        @Deprecated
        public C7940a m14030f(int i) {
            this.f25825b.m14037c(i);
            return this;
        }
    }

    public C7939b(Intent intent, Bundle bundle) {
        this.f25822a = intent;
        this.f25823b = bundle;
    }

    public void m14036a(Context context, Uri uri) {
        this.f25822a.setData(uri);
        C8117a.m13432l(context, this.f25822a, this.f25823b);
    }
}
