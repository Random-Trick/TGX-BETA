package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.ArrayList;
import p.a;
import p0.d;

public final class b {
    public final Intent f20227a;
    public final Bundle f20228b;

    public static final class a {
        public ArrayList<Bundle> f20231c;
        public Bundle f20232d;
        public ArrayList<Bundle> f20233e;
        public SparseArray<Bundle> f20234f;
        public Bundle f20235g;
        public final Intent f20229a = new Intent("android.intent.action.VIEW");
        public final a.C0174a f20230b = new a.C0174a();
        public int f20236h = 0;
        public boolean f20237i = true;

        public b a() {
            if (!this.f20229a.hasExtra("android.support.customtabs.extra.SESSION")) {
                d(null, null);
            }
            ArrayList<Bundle> arrayList = this.f20231c;
            if (arrayList != null) {
                this.f20229a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f20233e;
            if (arrayList2 != null) {
                this.f20229a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f20229a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f20237i);
            this.f20229a.putExtras(this.f20230b.a().a());
            Bundle bundle = this.f20235g;
            if (bundle != null) {
                this.f20229a.putExtras(bundle);
            }
            if (this.f20234f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f20234f);
                this.f20229a.putExtras(bundle2);
            }
            this.f20229a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f20236h);
            return new b(this.f20229a, this.f20232d);
        }

        public a b(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.customaction.ID", 0);
            bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
            bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f20229a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
            this.f20229a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z10);
            return this;
        }

        @Deprecated
        public a c(int i10) {
            this.f20230b.b(i10);
            return this;
        }

        public final void d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            d.a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f20229a.putExtras(bundle);
        }

        public a e(boolean z10) {
            this.f20229a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        @Deprecated
        public a f(int i10) {
            this.f20230b.c(i10);
            return this;
        }
    }

    public b(Intent intent, Bundle bundle) {
        this.f20227a = intent;
        this.f20228b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f20227a.setData(uri);
        q0.a.j(context, this.f20227a, this.f20228b);
    }
}
