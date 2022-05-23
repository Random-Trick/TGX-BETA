package ee;

import android.content.Context;
import android.view.View;
import ib.d;

public class m extends View {
    public float f11717a = 1.0f;

    public m(Context context) {
        super(context);
        setBackgroundColor(d.b(178, 0));
    }

    public void setFadeFactor(float f10) {
        if (this.f11717a != f10) {
            this.f11717a = f10;
            setAlpha(f10);
        }
    }
}
