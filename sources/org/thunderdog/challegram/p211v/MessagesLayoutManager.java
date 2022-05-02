package org.thunderdog.challegram.p211v;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import p291uc.C9678w2;

public class MessagesLayoutManager extends LinearLayoutManager {
    public final Context f25735I;
    public C9678w2 f25736J;

    public MessagesLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        this.f25735I = context;
    }

    public void m14147L2(C9678w2 w2Var) {
        this.f25736J = w2Var;
    }
}
