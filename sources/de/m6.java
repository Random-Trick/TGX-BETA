package de;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce.j0;
import ce.p0;
import de.g6;
import de.iq;
import fb.a;
import gd.w;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.y1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.o6;

public class m6 extends g6<b> implements iq.e {
    public String f8707v0;
    public iq f8708w0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void r1(ra raVar, ViewGroup viewGroup, y1 y1Var) {
            y1Var.getEditText().setInputType(16385);
            p0.j0(y1Var.getEditText(), false);
            y1Var.setMaxLength(m6.this.qf() ? 255 : 70);
        }
    }

    public static class b {
        public final String f8710a;
        public final long f8711b;
        public so f8712c;

        public b(String str, long j10) {
            this.f8710a = str;
            this.f8711b = j10;
        }

        public b a(so soVar) {
            this.f8712c = soVar;
            return this;
        }
    }

    public m6(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void rf(fb.a aVar, CharSequence charSequence, int i10, int i11, int i12, char c10) {
        if (i11 - i10 == 1) {
            v5(null);
        }
    }

    public void sf(TdApi.Object object, String str) {
        if (!Sa()) {
            m2if(false);
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                j0.t0(object);
            } else if (constructor == -722616727) {
                if (x9().f8712c != null) {
                    x9().f8712c.nn(x9().f8711b, str);
                }
                cf();
            }
        }
    }

    public void tf(final String str, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                m6.this.sf(object, str);
            }
        });
    }

    public void uf(TdApi.Object object, String str) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            this.f24495b.e2().k1(str);
        }
        if (!Sa()) {
            m2if(false);
            if (object.getConstructor() == -722616727) {
                cf();
            }
        }
    }

    public void vf(final String str, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                m6.this.uf(object, str);
            }
        });
    }

    @Override
    public void N5(int i10, ra raVar, y1 y1Var, String str) {
        this.f8707v0 = str;
    }

    @Override
    public int R9() {
        return qf() ? R.id.controller_editDescription : R.id.controller_editBio;
    }

    @Override
    public CharSequence X9() {
        return w.i1(qf() ? R.string.Description : R.string.UserBio);
    }

    @Override
    public void Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        ra[] raVarArr;
        this.f8708w0 = new a(this);
        ra b02 = new ra(62, R.id.input, 0, qf() ? R.string.Description : R.string.UserBio).b0(this.f8707v0);
        if (qf()) {
            b02.L(new InputFilter[]{new InputFilter.LengthFilter(255)});
            raVarArr = new ra[]{b02};
        } else {
            b02.L(new InputFilter[]{new InputFilter.LengthFilter(70), new fb.b(new char[]{'\n'}).b(new a.AbstractC0104a() {
                @Override
                public final void a(a aVar, CharSequence charSequence, int i10, int i11, int i12, char c10) {
                    m6.this.rf(aVar, charSequence, i10, i11, i12, c10);
                }
            })}).P(new g6.a(6, this));
            raVarArr = new ra[]{b02, new ra(9, R.id.description, 0, R.string.BioDescription).d0(R.id.theme_color_textLight)};
        }
        this.f8708w0.O2(this);
        this.f8708w0.v2(this, true);
        this.f8708w0.t2(raVarArr, false);
        recyclerView.setAdapter(this.f8708w0);
        recyclerView.setOverScrollMode(2);
        hf(true);
    }

    @Override
    public final boolean af() {
        if (!Ue()) {
            m2if(true);
            final String str = this.f8707v0;
            if (qf()) {
                this.f24495b.v4().o(new TdApi.SetChatDescription(x9().f8711b, str), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        m6.this.tf(str, object);
                    }
                });
            } else {
                this.f24495b.v4().o(new TdApi.SetBio(str), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        m6.this.vf(str, object);
                    }
                });
            }
        }
        return true;
    }

    @Override
    public void bf(boolean z10) {
        this.f8708w0.e3(R.id.input, z10 ? this.f8707v0 : null);
    }

    public final boolean qf() {
        long j10 = w9() != null ? w9().f8711b : 0L;
        return j10 != 0 && !this.f24495b.k7(j10);
    }

    public void wf(b bVar) {
        super.Ad(bVar);
        this.f8707v0 = bVar.f8710a;
    }
}
