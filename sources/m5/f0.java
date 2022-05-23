package m5;

import android.content.Intent;
import l5.h;

public final class f0 extends g0 {
    public final Intent f17198a;
    public final h f17199b;

    public f0(Intent intent, h hVar, int i10) {
        this.f17198a = intent;
        this.f17199b = hVar;
    }

    @Override
    public final void a() {
        Intent intent = this.f17198a;
        if (intent != null) {
            this.f17199b.d(intent, 2);
        }
    }
}
