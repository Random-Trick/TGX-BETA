package sc;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import be.C1363c0;
import be.C1379j0;
import gd.C4618d7;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Iterator;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p053dd.View$OnClickListenerC4013l;
import p082fd.C4383l;
import td.AbstractC9201h1;
import td.View$OnClickListenerC9170d1;

public class C8829t extends AbstractC8809o<Void> implements Client.AbstractC7865g, View$OnClickListenerC4013l.AbstractC4014a, AbstractC9201h1 {
    public View$OnClickListenerC4013l f28494I0;
    public ArrayList<C4618d7> f28495J0;
    public String f28496K0 = "";

    public C8829t(View$OnClickListenerC8851y1 y1Var) {
        super(y1Var, (int) R.string.AttachContact);
    }

    public void m11261xg(String str, ArrayList arrayList) {
        if (!m9347Sa() && this.f28496K0.equals(str)) {
            m11262wg(arrayList);
        }
    }

    public void m11260yg(final String str) {
        final ArrayList arrayList = new ArrayList();
        Iterator<C4618d7> it = this.f28495J0.iterator();
        while (it.hasNext()) {
            C4618d7 next = it.next();
            if (next.m26872r() != null) {
                String lowerCase = C1363c0.m37420p(next.m26881i().trim()).toLowerCase();
                String lowerCase2 = C1363c0.m37420p(next.m26880j().trim()).toLowerCase();
                String trim = (lowerCase + " " + lowerCase2).trim();
                if (lowerCase.startsWith(str) || lowerCase2.startsWith(str) || trim.startsWith(str)) {
                    arrayList.add(next);
                }
            }
        }
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                C8829t.this.m11261xg(str, arrayList);
            }
        });
    }

    @Override
    public void mo420Cc(String str) {
        m11259zg(C1363c0.m37420p(str.trim().toLowerCase()));
    }

    @Override
    public void mo419J(int i, View view) {
        ArrayList<C4618d7> arrayList;
        if (i == R.id.menu_btn_clear) {
            m9341T8();
        } else if (i == R.id.menu_btn_search && (arrayList = this.f28495J0) != null && !arrayList.isEmpty()) {
            this.f28443n0.getHeaderView().m10018z3();
            this.f30159R = this.f28443n0.getHeaderView();
        }
    }

    @Override
    public void mo11097O1(C4618d7 d7Var) {
        this.f28443n0.m11134h3(d7Var);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_media_contacts;
    }

    @Override
    public int mo418W9() {
        return R.id.menu_search;
    }

    @Override
    public void mo11231Wf() {
        this.f28494I0.m29330a0((LinearLayoutManager) m11273uf());
    }

    @Override
    public void mo11225Yf(TdApi.MessageSendOptions messageSendOptions, boolean z) {
        this.f28443n0.m11131i3(this.f28494I0.m29329c0(), messageSendOptions);
    }

    @Override
    public void mo11096f0(int i, C4618d7 d7Var, boolean z) {
        this.f28443n0.setCounter(i);
    }

    @Override
    public int mo415la() {
        return R.id.menu_clear;
    }

    @Override
    public View mo403oc(Context context) {
        m11300bf(true);
        m11288jg(new LinearLayoutManager(mo4347s(), 1, false));
        View$OnClickListenerC4013l lVar = new View$OnClickListenerC4013l(this, this, 3, this);
        this.f28494I0 = lVar;
        m11292hg(lVar);
        this.f28453x0.setItemAnimator(new C8731d(C2057b.f7280b, 140L));
        this.f30170b.m2375kb(null, 10240, this);
        return this.f28451v0;
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_clear) {
            d1Var.m10090S1(linearLayout, this);
        } else if (i == R.id.menu_search) {
            d1Var.m10053i2(linearLayout, this);
        }
    }

    @Override
    public int mo11267pf() {
        return TdApi.ChatActionChoosingContact.CONSTRUCTOR;
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            m11291if(C4779t2.m25379z5(object), true);
        } else if (constructor != 171203420) {
            m11291if("Unknown constructor: " + object.getConstructor(), true);
        } else {
            long[] jArr = ((TdApi.Users) object).userIds;
            ArrayList<TdApi.User> T2 = this.f30170b.m2480e2().m1686T2(jArr);
            final ArrayList arrayList = new ArrayList(jArr.length);
            Iterator<TdApi.User> it = T2.iterator();
            while (it.hasNext()) {
                TdApi.User next = it.next();
                if (C4779t2.m25729A2(next)) {
                    arrayList.add(C4618d7.m26886d(this.f30170b, next));
                }
            }
            m9151ud(new Runnable() {
                @Override
                public final void run() {
                    C8829t.this.m11262wg(arrayList);
                }
            });
        }
    }

    public void m11262wg(ArrayList<C4618d7> arrayList) {
        if (arrayList.isEmpty()) {
            ArrayList<C4618d7> arrayList2 = this.f28495J0;
            m11284lg(arrayList2 == null ? R.string.NoContacts : R.string.NothingFound, arrayList2 == null);
            this.f28494I0.m29324h0(null);
        } else if (this.f28495J0 == null) {
            m11328Gf();
            m11329Ff();
            this.f28495J0 = arrayList;
            this.f28494I0.m29324h0(arrayList);
            m11285lf(this.f28494I0);
        } else {
            this.f28494I0.m29324h0(arrayList);
            m11329Ff();
        }
    }

    @Override
    public void mo409xc() {
        m11259zg("");
    }

    public final void m11259zg(final String str) {
        if (this.f28495J0 != null) {
            this.f28453x0.setItemAnimator(null);
            if (!this.f28496K0.equals(str)) {
                this.f28496K0 = str;
                if (str.isEmpty()) {
                    m11262wg(this.f28495J0);
                } else {
                    C4383l.m28061a().m28060b(new Runnable() {
                        @Override
                        public final void run() {
                            C8829t.this.m11260yg(str);
                        }
                    });
                }
            }
        }
    }
}
