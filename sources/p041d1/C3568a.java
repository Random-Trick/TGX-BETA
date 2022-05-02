package p041d1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class C3568a extends ClickableSpan {
    public final int f12163a;
    public final C3570c f12164b;
    public final int f12165c;

    public C3568a(int i, C3570c cVar, int i2) {
        this.f12163a = i;
        this.f12164b = cVar;
        this.f12165c = i2;
    }

    @Override
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f12163a);
        this.f12164b.m30029L(this.f12165c, bundle);
    }
}
