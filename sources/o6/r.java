package o6;

import android.os.Bundle;
import t6.a;
import t6.j0;
import w6.p;

public class r extends j0 {
    public final a f19249a;
    public final p f19250b;
    public final u f19251c;

    public r(u uVar, a aVar, p pVar) {
        this.f19251c = uVar;
        this.f19249a = aVar;
        this.f19250b = pVar;
    }

    @Override
    public void N0(Bundle bundle) {
        this.f19251c.f19256a.s(this.f19250b);
        this.f19249a.d("onCompleteUpdate", new Object[0]);
    }

    @Override
    public void n(Bundle bundle) {
        this.f19251c.f19256a.s(this.f19250b);
        this.f19249a.d("onRequestInfo", new Object[0]);
    }
}
