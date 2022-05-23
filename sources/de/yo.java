package de;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce.p0;
import de.iq;
import kb.i;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.y1;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.o6;

public class yo extends g6<b> implements iq.e {
    public iq f10228v0;
    public String f10229w0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void r1(ra raVar, ViewGroup viewGroup, y1 y1Var) {
            y1Var.getEditText().setInputType(16385);
            p0.j0(y1Var.getEditText(), false);
        }
    }

    public interface b {
        int a();

        CharSequence b();

        void c(String str, i iVar);
    }

    public yo(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void mf(boolean z10) {
        if (!Sa()) {
            m2if(false);
            if (z10) {
                cf();
            }
        }
    }

    public void nf(final boolean z10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                yo.this.mf(z10);
            }
        });
    }

    @Override
    public void N5(int i10, ra raVar, y1 y1Var, String str) {
        this.f10229w0 = str;
    }

    @Override
    public int R9() {
        return R.id.controller_request;
    }

    @Override
    public CharSequence X9() {
        return x9().b();
    }

    @Override
    public void Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        a aVar = new a(this);
        this.f10228v0 = aVar;
        aVar.O2(this);
        this.f10228v0.v2(this, true);
        this.f10228v0.t2(new ra[]{new ra(31, R.id.input, 0, x9().a())}, false);
        recyclerView.setAdapter(this.f10228v0);
        recyclerView.setOverScrollMode(2);
        hf(true);
    }

    @Override
    public final boolean af() {
        if (!Ue()) {
            m2if(true);
            x9().c(this.f10229w0, new i() {
                @Override
                public final void a(boolean z10) {
                    yo.this.nf(z10);
                }
            });
        }
        return true;
    }

    @Override
    public void bf(boolean z10) {
        this.f10228v0.e3(R.id.input, z10 ? this.f10229w0 : null);
    }
}
