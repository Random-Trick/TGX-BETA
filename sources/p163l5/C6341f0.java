package p163l5;

import android.content.Intent;
import p148k5.AbstractC6116h;

public final class C6341f0 extends AbstractDialogInterface$OnClickListenerC6344g0 {
    public final Intent f19930a;
    public final AbstractC6116h f19931b;

    public C6341f0(Intent intent, AbstractC6116h hVar, int i) {
        this.f19930a = intent;
        this.f19931b = hVar;
    }

    @Override
    public final void mo20586a() {
        Intent intent = this.f19930a;
        if (intent != null) {
            this.f19931b.m21271d(intent, 2);
        }
    }
}
