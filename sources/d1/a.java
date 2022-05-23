package d1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {
    public final int f6101a;
    public final c f6102b;
    public final int f6103c;

    public a(int i10, c cVar, int i11) {
        this.f6101a = i10;
        this.f6102b = cVar;
        this.f6103c = i11;
    }

    @Override
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f6101a);
        this.f6102b.L(this.f6103c, bundle);
    }
}
