package p213p0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p227q0.C8117a;

public final class C7988o implements Iterable<Intent> {
    public final ArrayList<Intent> f26029a = new ArrayList<>();
    public final Context f26030b;

    public interface AbstractC7989a {
        Intent mo13827c();
    }

    public C7988o(Context context) {
        this.f26030b = context;
    }

    public static C7988o m13830r(Context context) {
        return new C7988o(context);
    }

    public C7988o m13833h(Intent intent) {
        this.f26029a.add(intent);
        return this;
    }

    public C7988o m13832i(Activity activity) {
        Intent c = activity instanceof AbstractC7989a ? ((AbstractC7989a) activity).mo13827c() : null;
        if (c == null) {
            c = C7954f.m14006a(activity);
        }
        if (c != null) {
            ComponentName component = c.getComponent();
            if (component == null) {
                component = c.resolveActivity(this.f26030b.getPackageManager());
            }
            m13831m(component);
            m13833h(c);
        }
        return this;
    }

    @Override
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f26029a.iterator();
    }

    public C7988o m13831m(ComponentName componentName) {
        int size = this.f26029a.size();
        try {
            Intent b = C7954f.m14005b(this.f26030b, componentName);
            while (b != null) {
                this.f26029a.add(size, b);
                b = C7954f.m14005b(this.f26030b, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public void m13829s() {
        m13828t(null);
    }

    public void m13828t(Bundle bundle) {
        if (!this.f26029a.isEmpty()) {
            ArrayList<Intent> arrayList = this.f26029a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C8117a.m13433k(this.f26030b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f26030b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
