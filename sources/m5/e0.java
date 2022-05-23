package m5;

import android.app.Activity;
import android.content.Intent;

public final class e0 extends g0 {
    public final Intent f17190a;
    public final Activity f17191b;
    public final int f17192c;

    public e0(Intent intent, Activity activity, int i10) {
        this.f17190a = intent;
        this.f17191b = activity;
        this.f17192c = i10;
    }

    @Override
    public final void a() {
        Intent intent = this.f17190a;
        if (intent != null) {
            this.f17191b.startActivityForResult(intent, this.f17192c);
        }
    }
}
