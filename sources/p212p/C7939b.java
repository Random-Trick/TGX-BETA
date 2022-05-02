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
    public final Intent f25825a;
    public final Bundle f25826b;

    public static final class C7940a {
        public ArrayList<Bundle> f25829c;
        public Bundle f25830d;
        public ArrayList<Bundle> f25831e;
        public SparseArray<Bundle> f25832f;
        public Bundle f25833g;
        public final Intent f25827a = new Intent("android.intent.action.VIEW");
        public final C7937a.C7938a f25828b = new C7937a.C7938a();
        public int f25834h = 0;
        public boolean f25835i = true;

        public C7939b m14034a() {
            if (!this.f25827a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m14031d(null, null);
            }
            ArrayList<Bundle> arrayList = this.f25829c;
            if (arrayList != null) {
                this.f25827a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f25831e;
            if (arrayList2 != null) {
                this.f25827a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f25827a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f25835i);
            this.f25827a.putExtras(this.f25828b.m14038a().m14039a());
            Bundle bundle = this.f25833g;
            if (bundle != null) {
                this.f25827a.putExtras(bundle);
            }
            if (this.f25832f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f25832f);
                this.f25827a.putExtras(bundle2);
            }
            this.f25827a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f25834h);
            return new C7939b(this.f25827a, this.f25830d);
        }

        public C7940a m14033b(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.customaction.ID", 0);
            bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
            bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f25827a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
            this.f25827a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z);
            return this;
        }

        @Deprecated
        public C7940a m14032c(int i) {
            this.f25828b.m14037b(i);
            return this;
        }

        public final void m14031d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C7951d.m14009a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f25827a.putExtras(bundle);
        }

        public C7940a m14030e(boolean z) {
            this.f25827a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        @Deprecated
        public C7940a m14029f(int i) {
            this.f25828b.m14036c(i);
            return this;
        }
    }

    public C7939b(Intent intent, Bundle bundle) {
        this.f25825a = intent;
        this.f25826b = bundle;
    }

    public void m14035a(Context context, Uri uri) {
        this.f25825a.setData(uri);
        C8117a.m13431l(context, this.f25825a, this.f25826b);
    }
}
