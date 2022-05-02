package p238qc;

import android.graphics.Paint;
import be.C1357a0;
import org.thunderdog.challegram.Log;
import p224pc.C8105a;
import p267t0.C8929a;
import p364zd.C11524j;

public class C8322h extends C8321g {
    public final Paint f26856p;
    public int f26857q = 0;

    public C8322h(C8105a.C8106a aVar) {
        super(aVar);
        Paint paint = new Paint();
        this.f26856p = paint;
        this.f26843c.setStrokeWidth(C1357a0.m37542k(1.0f));
        this.f26843c.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.STROKE);
        this.f26843c.setAntiAlias(false);
    }

    @Override
    public void mo12883a() {
        super.mo12883a();
        this.f26857q = C8929a.m10944d(C11524j.m148w(), this.f26853m, 0.3f);
    }

    public boolean m12882b() {
        if (this.f26857q == 0) {
            mo12883a();
            if (this.f26857q == 0) {
                Log.m14725e("blendColor is empty", Log.generateException(), new Object[0]);
            }
        }
        return this.f26857q != 0;
    }
}
