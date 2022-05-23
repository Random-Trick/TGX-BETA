package org.thunderdog.challegram.v;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import vc.v2;

public class MessagesLayoutManager extends LinearLayoutManager {
    public final Context H;
    public v2 I;

    public MessagesLayoutManager(Context context, int i10, boolean z10) {
        super(context, i10, z10);
        this.H = context;
    }

    public void L2(v2 v2Var) {
        this.I = v2Var;
    }
}
