package tc;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import ce.c0;
import ce.j0;
import db.b;
import ed.l;
import hd.d7;
import hd.t2;
import java.util.ArrayList;
import java.util.Iterator;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.d1;
import ud.h1;

public class t extends o<Void> implements Client.g, l.a, h1 {
    public l I0;
    public ArrayList<d7> J0;
    public String K0 = "";

    public t(y1 y1Var) {
        super(y1Var, (int) R.string.AttachContact);
    }

    public void xg(String str, ArrayList arrayList) {
        if (!Sa() && this.K0.equals(str)) {
            wg(arrayList);
        }
    }

    public void yg(final String str) {
        final ArrayList arrayList = new ArrayList();
        Iterator<d7> it = this.J0.iterator();
        while (it.hasNext()) {
            d7 next = it.next();
            if (next.r() != null) {
                String lowerCase = c0.p(next.i().trim()).toLowerCase();
                String lowerCase2 = c0.p(next.j().trim()).toLowerCase();
                String trim = (lowerCase + " " + lowerCase2).trim();
                if (lowerCase.startsWith(str) || lowerCase2.startsWith(str) || trim.startsWith(str)) {
                    arrayList.add(next);
                }
            }
        }
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                t.this.xg(str, arrayList);
            }
        });
    }

    @Override
    public void Cc(String str) {
        zg(c0.p(str.trim().toLowerCase()));
    }

    @Override
    public void J(int i10, View view) {
        ArrayList<d7> arrayList;
        if (i10 == R.id.menu_btn_clear) {
            T8();
        } else if (i10 == R.id.menu_btn_search && (arrayList = this.J0) != null && !arrayList.isEmpty()) {
            this.f23267n0.getHeaderView().C3();
            this.R = this.f23267n0.getHeaderView();
        }
    }

    @Override
    public int R9() {
        return R.id.controller_media_contacts;
    }

    @Override
    public int W9() {
        return R.id.menu_search;
    }

    @Override
    public void Wf() {
        this.I0.a0((LinearLayoutManager) uf());
    }

    @Override
    public void Yf(TdApi.MessageSendOptions messageSendOptions, boolean z10) {
        this.f23267n0.g3(this.I0.b0(), messageSendOptions);
    }

    @Override
    public int la() {
        return R.id.menu_clear;
    }

    @Override
    public void n0(d7 d7Var) {
        this.f23267n0.f3(d7Var);
    }

    @Override
    public View oc(Context context) {
        bf(true);
        jg(new LinearLayoutManager(t(), 1, false));
        l lVar = new l(this, this, 3, this);
        this.I0 = lVar;
        hg(lVar);
        this.f23277x0.setItemAnimator(new d(b.f7287b, 140L));
        this.f24495b.ob(null, 10240, this);
        return this.f23275v0;
    }

    @Override
    public int pf() {
        return TdApi.ChatActionChoosingContact.CONSTRUCTOR;
    }

    @Override
    public void r2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            m35if(t2.z5(object), true);
        } else if (constructor != 171203420) {
            m35if("Unknown constructor: " + object.getConstructor(), true);
        } else {
            long[] jArr = ((TdApi.Users) object).userIds;
            ArrayList<TdApi.User> T2 = this.f24495b.e2().T2(jArr);
            final ArrayList arrayList = new ArrayList(jArr.length);
            Iterator<TdApi.User> it = T2.iterator();
            while (it.hasNext()) {
                TdApi.User next = it.next();
                if (t2.A2(next)) {
                    arrayList.add(d7.d(this.f24495b, next));
                }
            }
            ud(new Runnable() {
                @Override
                public final void run() {
                    t.this.wg(arrayList);
                }
            });
        }
    }

    @Override
    public void u0(int i10, d7 d7Var, boolean z10) {
        this.f23267n0.setCounter(i10);
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_clear) {
            d1Var.P1(linearLayout, this);
        } else if (i10 == R.id.menu_search) {
            d1Var.g2(linearLayout, this);
        }
    }

    public void wg(ArrayList<d7> arrayList) {
        if (arrayList.isEmpty()) {
            ArrayList<d7> arrayList2 = this.J0;
            lg(arrayList2 == null ? R.string.NoContacts : R.string.NothingFound, arrayList2 == null);
            this.I0.g0(null);
        } else if (this.J0 == null) {
            Gf();
            Ff();
            this.J0 = arrayList;
            this.I0.g0(arrayList);
            lf(this.I0);
        } else {
            this.I0.g0(arrayList);
            Ff();
        }
    }

    @Override
    public void xc() {
        zg("");
    }

    public final void zg(final String str) {
        if (this.J0 != null) {
            this.f23277x0.setItemAnimator(null);
            if (!this.K0.equals(str)) {
                this.K0 = str;
                if (str.isEmpty()) {
                    wg(this.J0);
                } else {
                    gd.l.a().b(new Runnable() {
                        @Override
                        public final void run() {
                            t.this.yg(str);
                        }
                    });
                }
            }
        }
    }
}
