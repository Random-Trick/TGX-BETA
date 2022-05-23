package ne;

import ae.j;
import android.content.Context;
import ce.o;

public class d1 extends b2 {
    public int f17938a;

    public d1(Context context) {
        super(context);
        setTextColor(j.Q0());
        setTypeface(o.k());
        setTextSize(1, 16.0f);
        setGravity(17);
    }

    @Override
    public void setTextColor(int i10) {
        this.f17938a = i10;
        super.setTextColor(i10);
    }

    public void setTextColorIfNeeded(int i10) {
        if (this.f17938a != i10) {
            this.f17938a = i10;
            super.setTextColor(i10);
        }
    }
}
