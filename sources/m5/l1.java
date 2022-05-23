package m5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public final class l1 {
    public static final Uri f17224f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f17225a;
    public final String f17226b;
    public final ComponentName f17227c = null;
    public final int f17228d;
    public final boolean f17229e;

    public l1(String str, String str2, int i10, boolean z10) {
        r.g(str);
        this.f17225a = str;
        r.g(str2);
        this.f17226b = str2;
        this.f17228d = i10;
        this.f17229e = z10;
    }

    public final String a() {
        return this.f17226b;
    }

    public final ComponentName b() {
        return this.f17227c;
    }

    public final int c() {
        return this.f17228d;
    }

    public final Intent d(Context context) {
        Bundle bundle;
        if (this.f17225a == null) {
            return new Intent().setComponent(this.f17227c);
        }
        Intent intent = null;
        if (this.f17229e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f17225a);
            try {
                bundle = context.getContentResolver().call(f17224f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 34);
                sb2.append("Dynamic intent resolution failed: ");
                sb2.append(valueOf);
                Log.w("ConnectionStatusConfig", sb2.toString());
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                String valueOf2 = String.valueOf(this.f17225a);
                Log.w("ConnectionStatusConfig", valueOf2.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf2) : new String("Dynamic lookup for intent failed for action: "));
            }
        }
        return intent != null ? intent : new Intent(this.f17225a).setPackage(this.f17226b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return q.a(this.f17225a, l1Var.f17225a) && q.a(this.f17226b, l1Var.f17226b) && q.a(this.f17227c, l1Var.f17227c) && this.f17228d == l1Var.f17228d && this.f17229e == l1Var.f17229e;
    }

    public final int hashCode() {
        return q.b(this.f17225a, this.f17226b, this.f17227c, Integer.valueOf(this.f17228d), Boolean.valueOf(this.f17229e));
    }

    public final String toString() {
        String str = this.f17225a;
        if (str != null) {
            return str;
        }
        r.k(this.f17227c);
        return this.f17227c.flattenToString();
    }
}
