package p238qc;

import android.graphics.Paint;
import be.C1357a0;
import org.thunderdog.challegram.Log;
import p224pc.C8105a;
import p267t0.C8929a;
import p364zd.C11524j;

public class C8322h extends C8321g {
    public final Paint f26853p;
    public int f26854q = 0;

    public C8322h(C8105a.C8106a aVar) {
        super(aVar);
        Paint paint = new Paint();
        this.f26853p = paint;
        this.f26840c.setStrokeWidth(C1357a0.m37539k(1.0f));
        this.f26840c.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.STROKE);
        this.f26840c.setAntiAlias(false);
    }

    @Override
    public void mo12884a() {
        super.mo12884a();
        this.f26854q = C8929a.m10945d(C11524j.m148w(), this.f26850m, 0.3f);
    }

    public boolean m12883b() {
        if (this.f26854q == 0) {
            mo12884a();
            if (this.f26854q == 0) {
                Log.m14725e("blendColor is empty", Log.generateException(), new Object[0]);
            }
        }
        return this.f26854q != 0;
    }
}
