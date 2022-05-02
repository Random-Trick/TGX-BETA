package p038ce;

import android.content.Context;
import gd.C4817v6;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.ViewPager;
import p038ce.View$OnClickListenerC3217vt;
import p038ce.s20;
import p082fd.C4403w;
import p350yd.C10930q6;
import td.AbstractC9323v4;
import td.AbstractC9376x4;

public class C2314dy extends AbstractC9376x4<View$OnClickListenerC3217vt> implements View$OnClickListenerC3217vt.AbstractC3219b {
    public ArrayList<C4817v6> f7971x0;

    public C2314dy(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public boolean mo9423He() {
        return false;
    }

    @Override
    public void mo31124K5(ArrayList<C4817v6> arrayList) {
        if (m9139w9() != null) {
            m9139w9().m31155bg(null);
        }
        m35105yg(arrayList);
        AbstractC9323v4<?> ag = m8860ag(R.id.controller_stickers);
        if (ag != null) {
            ((s20) ag).m32096Kh(this.f7971x0, null);
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_stickerManagement;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(R.string.Stickers);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (m9139w9() != null) {
            m9139w9().m31155bg(null);
        }
    }

    @Override
    public boolean mo9270dc() {
        AbstractC9323v4<?> ag = m8860ag(R.id.controller_stickersTrending);
        return ag == null || !((h30) ag).m34478if();
    }

    @Override
    public int mo8854gg() {
        return 4;
    }

    @Override
    public String[] mo8852hg() {
        return new String[]{C4403w.m27871i1(R.string.Trending).toUpperCase(), C4403w.m27871i1(R.string.Installed).toUpperCase(), C4403w.m27871i1(R.string.Archived).toUpperCase(), C4403w.m27871i1(R.string.Masks).toUpperCase()};
    }

    @Override
    public int mo8850jg() {
        return 3;
    }

    @Override
    public AbstractC9323v4<?> mo8846mg(Context context, int i) {
        if (i == 0) {
            return new h30(this.f30168a, this.f30170b);
        }
        if (i == 1) {
            s20 s20Var = new s20(this.f30168a, this.f30170b);
            s20Var.m32100Ih(new s20.C3030e(0, true).m32048a(this.f7971x0));
            return s20Var;
        } else if (i == 2) {
            s20 s20Var2 = new s20(this.f30168a, this.f30170b);
            s20Var2.m32100Ih(new s20.C3030e(1, false));
            return s20Var2;
        } else if (i == 3) {
            s20 s20Var3 = new s20(this.f30168a, this.f30170b);
            s20Var3.m32100Ih(new s20.C3030e(2, false));
            return s20Var3;
        } else {
            throw new IllegalArgumentException("position == " + i);
        }
    }

    @Override
    public void mo8845ng(Context context, FrameLayoutFix frameLayoutFix, ViewPager viewPager) {
        viewPager.setOffscreenPageLimit(1);
        m8840rg(0, null);
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        AbstractC9323v4<?> ag = m8860ag(R.id.controller_stickers);
        if (ag != null) {
            ((s20) ag).m32114Bh();
        }
        m8848kg().setOffscreenPageLimit(mo8854gg());
    }

    public void m35106xg(View$OnClickListenerC3217vt vtVar) {
        super.m9476Ad(vtVar);
        ArrayList<C4817v6> zf = vtVar.m31125zf();
        if (zf == null) {
            vtVar.m31155bg(this);
        } else {
            m35105yg(zf);
        }
    }

    public final void m35105yg(ArrayList<C4817v6> arrayList) {
        this.f7971x0 = new ArrayList<>(arrayList.size());
        Iterator<C4817v6> it = arrayList.iterator();
        while (it.hasNext()) {
            C4817v6 next = it.next();
            next.m25164v(this.f7971x0);
            this.f7971x0.add(next);
        }
    }
}
