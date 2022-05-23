package hd;

import ld.h;
import md.j;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public class e3 {
    public TdApi.Animation f12934a;
    public j f12935b;
    public h f12936c;

    public e3(o6 o6Var, TdApi.Animation animation) {
        this.f12934a = animation;
        h D5 = t2.D5(o6Var, animation.thumbnail);
        this.f12936c = D5;
        if (D5 != null) {
            D5.s0(2);
            this.f12936c.g0(false);
        }
        j jVar = new j(o6Var, animation);
        this.f12935b = jVar;
        jVar.I(2);
    }

    public TdApi.Animation a() {
        return this.f12934a;
    }

    public j b() {
        return this.f12935b;
    }

    public int c() {
        return this.f12934a.animation.f19913id;
    }

    public h d() {
        return this.f12936c;
    }

    public int e() {
        TdApi.Animation animation = this.f12934a;
        int i10 = animation.height;
        if (i10 != 0) {
            return i10;
        }
        TdApi.Thumbnail thumbnail = animation.thumbnail;
        if (thumbnail != null) {
            return thumbnail.height;
        }
        return 0;
    }

    public int f() {
        TdApi.Animation animation = this.f12934a;
        int i10 = animation.width;
        if (i10 != 0) {
            return i10;
        }
        TdApi.Thumbnail thumbnail = animation.thumbnail;
        if (thumbnail != null) {
            return thumbnail.width;
        }
        return 0;
    }
}
