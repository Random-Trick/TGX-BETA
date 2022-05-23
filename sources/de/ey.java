package de;

import android.content.Context;
import de.t20;
import de.wt;
import gd.w;
import hd.v6;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.ViewPager;
import ud.v4;
import ud.x4;
import zd.o6;

public class ey extends x4<wt> implements wt.b {
    public ArrayList<v6> f7898x0;

    public ey(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public void G5(ArrayList<v6> arrayList) {
        if (w9() != null) {
            w9().bg(null);
        }
        yg(arrayList);
        v4<?> ag = ag(R.id.controller_stickers);
        if (ag != null) {
            ((t20) ag).Kh(this.f7898x0, null);
        }
    }

    @Override
    public boolean He() {
        return false;
    }

    @Override
    public int R9() {
        return R.id.controller_stickerManagement;
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.Stickers);
    }

    @Override
    public void Z8() {
        super.Z8();
        if (w9() != null) {
            w9().bg(null);
        }
    }

    @Override
    public boolean dc() {
        v4<?> ag = ag(R.id.controller_stickersTrending);
        return ag == null || !((i30) ag).m4if();
    }

    @Override
    public int gg() {
        return 4;
    }

    @Override
    public String[] hg() {
        return new String[]{w.i1(R.string.Trending).toUpperCase(), w.i1(R.string.Installed).toUpperCase(), w.i1(R.string.Archived).toUpperCase(), w.i1(R.string.Masks).toUpperCase()};
    }

    @Override
    public int jg() {
        return 3;
    }

    @Override
    public v4<?> mg(Context context, int i10) {
        if (i10 == 0) {
            return new i30(this.f24493a, this.f24495b);
        }
        if (i10 == 1) {
            t20 t20Var = new t20(this.f24493a, this.f24495b);
            t20Var.Ih(new t20.e(0, true).a(this.f7898x0));
            return t20Var;
        } else if (i10 == 2) {
            t20 t20Var2 = new t20(this.f24493a, this.f24495b);
            t20Var2.Ih(new t20.e(1, false));
            return t20Var2;
        } else if (i10 == 3) {
            t20 t20Var3 = new t20(this.f24493a, this.f24495b);
            t20Var3.Ih(new t20.e(2, false));
            return t20Var3;
        } else {
            throw new IllegalArgumentException("position == " + i10);
        }
    }

    @Override
    public void ng(Context context, FrameLayoutFix frameLayoutFix, ViewPager viewPager) {
        viewPager.setOffscreenPageLimit(1);
        rg(0, null);
    }

    @Override
    public void sc() {
        super.sc();
        v4<?> ag = ag(R.id.controller_stickers);
        if (ag != null) {
            ((t20) ag).Bh();
        }
        kg().setOffscreenPageLimit(gg());
    }

    public void xg(wt wtVar) {
        super.Ad(wtVar);
        ArrayList<v6> zf = wtVar.zf();
        if (zf == null) {
            wtVar.bg(this);
        } else {
            yg(zf);
        }
    }

    public final void yg(ArrayList<v6> arrayList) {
        this.f7898x0 = new ArrayList<>(arrayList.size());
        Iterator<v6> it = arrayList.iterator();
        while (it.hasNext()) {
            v6 next = it.next();
            next.v(this.f7898x0);
            this.f7898x0.add(next);
        }
    }
}
