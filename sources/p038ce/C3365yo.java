package p038ce;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.C1399s0;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p038ce.C2546iq;
import p139jb.AbstractC5917i;
import p350yd.C10930q6;
import td.AbstractC9323v4;

public class C3365yo extends AbstractC2420g6<AbstractC3367b> implements C2546iq.AbstractC2551e {
    public C2546iq f11201v0;
    public String f11202w0;

    public class C3366a extends C2546iq {
        public C3366a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo30692v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
            y1Var.getEditText().setInputType(16385);
            C1399s0.m37164q0(y1Var.getEditText(), false);
        }
    }

    public interface AbstractC3367b {
        void mo3378a(String str, AbstractC5917i iVar);

        CharSequence mo3377b();

        int mo3376c();
    }

    public C3365yo(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m30694mf(boolean z) {
        if (!m9347Sa()) {
            m34627if(false);
            if (z) {
                m34632cf();
            }
        }
    }

    public void m30693nf(final boolean z) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C3365yo.this.m30694mf(z);
            }
        });
    }

    @Override
    public void mo30700K(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        this.f11202w0 = str;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_request;
    }

    @Override
    public CharSequence mo9313X9() {
        return m9131x9().mo3377b();
    }

    @Override
    public void mo30699Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        C3366a aVar = new C3366a(this);
        this.f11201v0 = aVar;
        aVar.m34214S2(this);
        this.f11201v0.m34253A2(this, true);
        this.f11201v0.m34116y2(new C2964ra[]{new C2964ra(31, R.id.input, 0, m9131x9().mo3376c())}, false);
        recyclerView.setAdapter(this.f11201v0);
        recyclerView.setOverScrollMode(2);
        mo31399hf(true);
    }

    @Override
    public final boolean mo30698af() {
        if (!m34636Ue()) {
            m34627if(true);
            m9131x9().mo3378a(this.f11202w0, new AbstractC5917i() {
                @Override
                public final void mo1322a(boolean z) {
                    C3365yo.this.m30693nf(z);
                }
            });
        }
        return true;
    }

    @Override
    public void mo30697bf(boolean z) {
        this.f11201v0.m34170h3(R.id.input, z ? this.f11202w0 : null);
    }
}
