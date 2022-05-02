package p163l5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public final class C6361l1 {
    public static final Uri f19974f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f19975a;
    public final String f19976b;
    public final ComponentName f19977c = null;
    public final int f19978d;
    public final boolean f19979e;

    public C6361l1(String str, String str2, int i, boolean z) {
        C6378r.m20510g(str);
        this.f19975a = str;
        C6378r.m20510g(str2);
        this.f19976b = str2;
        this.f19978d = i;
        this.f19979e = z;
    }

    public final String m20551a() {
        return this.f19976b;
    }

    public final ComponentName m20550b() {
        return this.f19977c;
    }

    public final int m20549c() {
        return this.f19978d;
    }

    public final Intent m20548d(Context context) {
        Bundle bundle;
        if (this.f19975a == null) {
            return new Intent().setComponent(this.f19977c);
        }
        Intent intent = null;
        if (this.f19979e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f19975a);
            try {
                bundle = context.getContentResolver().call(f19974f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                String valueOf = String.valueOf(e);
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
                String valueOf2 = String.valueOf(this.f19975a);
                Log.w("ConnectionStatusConfig", valueOf2.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf2) : new String("Dynamic lookup for intent failed for action: "));
            }
        }
        return intent != null ? intent : new Intent(this.f19975a).setPackage(this.f19976b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6361l1)) {
            return false;
        }
        C6361l1 l1Var = (C6361l1) obj;
        return C6374q.m20524a(this.f19975a, l1Var.f19975a) && C6374q.m20524a(this.f19976b, l1Var.f19976b) && C6374q.m20524a(this.f19977c, l1Var.f19977c) && this.f19978d == l1Var.f19978d && this.f19979e == l1Var.f19979e;
    }

    public final int hashCode() {
        return C6374q.m20523b(this.f19975a, this.f19976b, this.f19977c, Integer.valueOf(this.f19978d), Boolean.valueOf(this.f19979e));
    }

    public final String toString() {
        String str = this.f19975a;
        if (str != null) {
            return str;
        }
        C6378r.m20506k(this.f19977c);
        return this.f19977c.flattenToString();
    }
}
