package p038ce;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.C1379j0;
import be.C1399s0;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p038ce.AbstractC2420g6;
import p038ce.C2546iq;
import p066eb.AbstractC4178a;
import p066eb.C4180b;
import p082fd.C4403w;
import p350yd.C10930q6;
import td.AbstractC9323v4;

public class C2700m6 extends AbstractC2420g6<C2702b> implements C2546iq.AbstractC2551e {
    public String f9150v0;
    public C2546iq f9151w0;

    public class C2701a extends C2546iq {
        public C2701a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo30690v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
            y1Var.getEditText().setInputType(16385);
            C1399s0.m37161q0(y1Var.getEditText(), false);
            y1Var.setMaxLength(C2700m6.this.m33798qf() ? 255 : 70);
        }
    }

    public static class C2702b {
        public final String f9153a;
        public final long f9154b;
        public View$OnClickListenerC3062so f9155c;

        public C2702b(String str, long j) {
            this.f9153a = str;
            this.f9154b = j;
        }

        public C2702b m33791a(View$OnClickListenerC3062so soVar) {
            this.f9155c = soVar;
            return this;
        }
    }

    public C2700m6(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m33797rf(AbstractC4178a aVar, CharSequence charSequence, int i, int i2, int i3, char c) {
        if (i2 - i == 1) {
            mo23839B5(null);
        }
    }

    public void m33796sf(TdApi.Object object, String str) {
        if (!m9347Sa()) {
            m34624if(false);
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                C1379j0.m37302t0(object);
            } else if (constructor == -722616727) {
                if (m9131x9().f9155c != null) {
                    m9131x9().f9155c.m31570nn(m9131x9().f9154b, str);
                }
                m34629cf();
            }
        }
    }

    public void m33795tf(final String str, final TdApi.Object object) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C2700m6.this.m33796sf(object, str);
            }
        });
    }

    public void m33794uf(TdApi.Object object, String str) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            this.f30167b.m2480e2().m1620m1(str);
        }
        if (!m9347Sa()) {
            m34624if(false);
            if (object.getConstructor() == -722616727) {
                m34629cf();
            }
        }
    }

    public void m33793vf(final String str, final TdApi.Object object) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C2700m6.this.m33794uf(object, str);
            }
        });
    }

    @Override
    public void mo30698K(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        this.f9150v0 = str;
    }

    @Override
    public int mo407R9() {
        return m33798qf() ? R.id.controller_editDescription : R.id.controller_editBio;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(m33798qf() ? R.string.Description : R.string.UserBio);
    }

    @Override
    public void mo30697Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        C2964ra[] raVarArr;
        this.f9151w0 = new C2701a(this);
        C2964ra b0 = new C2964ra(62, R.id.input, 0, m33798qf() ? R.string.Description : R.string.UserBio).m32847b0(this.f9150v0);
        if (m33798qf()) {
            b0.m32865L(new InputFilter[]{new InputFilter.LengthFilter(255)});
            raVarArr = new C2964ra[]{b0};
        } else {
            b0.m32865L(new InputFilter[]{new InputFilter.LengthFilter(70), new C4180b(new char[]{'\n'}).m28619b(new AbstractC4178a.AbstractC4179a() {
                @Override
                public final void mo28618a(AbstractC4178a aVar, CharSequence charSequence, int i, int i2, int i3, char c) {
                    C2700m6.this.m33797rf(aVar, charSequence, i, i2, i3, c);
                }
            })}).m32861P(new AbstractC2420g6.C2421a(6, this));
            raVarArr = new C2964ra[]{b0, new C2964ra(9, R.id.description, 0, R.string.BioDescription).m32843d0(R.id.theme_color_textLight)};
        }
        this.f9151w0.m34211S2(this);
        this.f9151w0.m34250A2(this, true);
        this.f9151w0.m34113y2(raVarArr, false);
        recyclerView.setAdapter(this.f9151w0);
        recyclerView.setOverScrollMode(2);
        mo31397hf(true);
    }

    @Override
    public final boolean mo30696af() {
        if (!m34633Ue()) {
            m34624if(true);
            final String str = this.f9150v0;
            if (m33798qf()) {
                this.f30167b.m2270r4().m14783o(new TdApi.SetChatDescription(m9131x9().f9154b, str), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C2700m6.this.m33795tf(str, object);
                    }
                });
            } else {
                this.f30167b.m2270r4().m14783o(new TdApi.SetBio(str), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C2700m6.this.m33793vf(str, object);
                    }
                });
            }
        }
        return true;
    }

    @Override
    public void mo30695bf(boolean z) {
        this.f9151w0.m34167h3(R.id.input, z ? this.f9150v0 : null);
    }

    public final boolean m33798qf() {
        long j = m9139w9() != null ? m9139w9().f9154b : 0L;
        return j != 0 && !this.f30167b.m2443g7(j);
    }

    public void m33792wf(C2702b bVar) {
        super.m9476Ad(bVar);
        this.f9150v0 = bVar.f9153a;
    }
}
