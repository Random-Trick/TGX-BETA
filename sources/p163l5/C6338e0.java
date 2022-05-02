package p163l5;

import android.app.Activity;
import android.content.Intent;

public final class C6338e0 extends AbstractDialogInterface$OnClickListenerC6344g0 {
    public final Intent f19919a;
    public final Activity f19920b;
    public final int f19921c;

    public C6338e0(Intent intent, Activity activity, int i) {
        this.f19919a = intent;
        this.f19920b = activity;
        this.f19921c = i;
    }

    @Override
    public final void mo20586a() {
        Intent intent = this.f19919a;
        if (intent != null) {
            this.f19920b.startActivityForResult(intent, this.f19921c);
        }
    }
}
