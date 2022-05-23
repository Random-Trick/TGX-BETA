package p0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class o implements Iterable<Intent> {
    public final ArrayList<Intent> f20398a = new ArrayList<>();
    public final Context f20399b;

    public interface a {
        Intent c();
    }

    public o(Context context) {
        this.f20399b = context;
    }

    public static o r(Context context) {
        return new o(context);
    }

    public o f(Intent intent) {
        this.f20398a.add(intent);
        return this;
    }

    public o g(Activity activity) {
        Intent c10 = activity instanceof a ? ((a) activity).c() : null;
        if (c10 == null) {
            c10 = f.a(activity);
        }
        if (c10 != null) {
            ComponentName component = c10.getComponent();
            if (component == null) {
                component = c10.resolveActivity(this.f20399b.getPackageManager());
            }
            m(component);
            f(c10);
        }
        return this;
    }

    @Override
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f20398a.iterator();
    }

    public o m(ComponentName componentName) {
        int size = this.f20398a.size();
        try {
            Intent b10 = f.b(this.f20399b, componentName);
            while (b10 != null) {
                this.f20398a.add(size, b10);
                b10 = f.b(this.f20399b, b10.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void s() {
        t(null);
    }

    public void t(Bundle bundle) {
        if (!this.f20398a.isEmpty()) {
            ArrayList<Intent> arrayList = this.f20398a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!q0.a.i(this.f20399b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f20399b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
