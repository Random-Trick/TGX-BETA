package p038ce;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import be.C1363c0;
import be.C1379j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import me.C6857d;
import me.C6977n2;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.View$OnClickListenerC3222vw;
import p082fd.C4403w;
import p110hd.C5078d;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p124ib.C5324g;
import p350yd.C10930q6;
import p350yd.C11052v1;
import p350yd.HandlerC10770jj;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9188f2;

public class View$OnClickListenerC2899pz extends AbstractC3204vo<View$OnClickListenerC3222vw> implements View.OnClickListener, View$OnClickListenerC3222vw.AbstractC3226d {
    public C2546iq f9683D0;
    public C5324g f9684E0;
    public boolean f9685F0;
    public ArrayList<TdApi.ConnectedWebsite> f9686G0;

    public class C2900a extends C2546iq {
        public C2900a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo33061L2(C2964ra raVar, int i, RelativeLayout relativeLayout, boolean z, TextView textView, TextView textView2, TextView textView3, TextView textView4, C6977n2 n2Var, C6857d dVar, ImageView imageView, TextView textView5, TextView textView6) {
            TdApi.ConnectedWebsite connectedWebsite = (TdApi.ConnectedWebsite) raVar.m32844d();
            textView2.setText(C5078d.m23986z().m24024I(connectedWebsite.domainName));
            textView3.setText(C1363c0.m37416q(", ", C5078d.m23986z().m24024I(View$OnClickListenerC2899pz.this.f30167b.m2480e2().m1721K2(connectedWebsite.botUserId)), connectedWebsite.browser, connectedWebsite.platform));
            textView4.setText(C1363c0.m37415r(connectedWebsite.f25372ip, connectedWebsite.location));
            textView.setText(C4403w.m27924V2(connectedWebsite.lastActiveDate, TimeUnit.SECONDS));
            dVar.m18745q(View$OnClickListenerC2899pz.this.f30167b, connectedWebsite.botUserId, false);
            boolean Qg = View$OnClickListenerC2899pz.this.m33075Qg(connectedWebsite.f25371id);
            relativeLayout.setEnabled(!Qg);
            float f = 1.0f;
            if (z) {
                if (!Qg) {
                    f = 0.0f;
                }
                n2Var.m18231a(f);
                return;
            }
            if (!Qg) {
                f = 0.0f;
            }
            n2Var.m18229d(f);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32835j() == R.id.btn_terminateAllSessions) {
                if (z) {
                    cVar.setEnabledAnimated(!View$OnClickListenerC2899pz.this.f9685F0);
                } else {
                    cVar.setEnabled(!View$OnClickListenerC2899pz.this.f9685F0);
                }
            }
        }
    }

    public View$OnClickListenerC2899pz(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m33074Rg(TdApi.Object object) {
        this.f9683D0.m34196Y2();
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            this.f9686G0.clear();
            m33077Og();
            if (m9139w9() != null) {
                m9139w9().m31109Gh(this.f9686G0);
            }
        }
    }

    public void m33073Sg(final TdApi.Object object) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2899pz.this.m33074Rg(object);
            }
        });
    }

    public boolean m33072Tg(View view, int i) {
        if (i != R.id.btn_terminateAllSessions) {
            return true;
        }
        m33076Pg();
        return true;
    }

    public boolean m33071Ug(TdApi.ConnectedWebsite connectedWebsite, View view, int i) {
        if (i == R.id.btn_openChat) {
            this.f30167b.m2485dd().m3439u7(this, connectedWebsite.botUserId, new HandlerC10770jj.C10780j().m3368h());
        } else if (i == R.id.btn_terminateSession) {
            m33062dh(connectedWebsite, false, true);
        }
        return true;
    }

    public void m33070Vg(TdApi.Object object) {
        if (!m9347Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -1727949694) {
                m33063ch(((TdApi.ConnectedWebsites) object).websites);
                m33077Og();
            } else if (constructor != -1679978726) {
                Log.unexpectedTdlibResponse(object, TdApi.GetConnectedWebsites.class, TdApi.ConnectedWebsites.class);
            } else {
                C1379j0.m37302t0(object);
            }
        }
    }

    public void m33069Wg(final TdApi.Object object) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2899pz.this.m33070Vg(object);
            }
        });
    }

    public void m33068Xg(TdApi.ConnectedWebsite connectedWebsite, int i, SparseIntArray sparseIntArray) {
        m33062dh(connectedWebsite, sparseIntArray.get(R.id.btn_banMember) == R.id.btn_banMember, false);
    }

    public void m33067Yg(TdApi.ConnectedWebsite connectedWebsite, TdApi.Object object) {
        if (!m9347Sa()) {
            this.f9684E0.m23256c(connectedWebsite.f25371id);
            int R0 = this.f9683D0.m34215R0(connectedWebsite.f25371id);
            this.f9683D0.m34160j3(R0);
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                C1379j0.m37302t0(object);
            } else if (constructor == -722616727) {
                m33065ah(connectedWebsite, R0);
            }
        }
    }

    public void m33066Zg(final TdApi.ConnectedWebsite connectedWebsite, final TdApi.Object object) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2899pz.this.m33067Yg(connectedWebsite, object);
            }
        });
    }

    public final void m33077Og() {
        if (this.f9686G0 != null && !m9347Sa() && this.f9683D0 != null) {
            boolean z = true;
            if (this.f9686G0.isEmpty()) {
                this.f9683D0.m34113y2(new C2964ra[]{new C2964ra(75, (int) R.id.btn_loggedWebsites, 0, C1363c0.m37448Z(C4403w.m27869i1(R.string.NoActiveLogins), R.id.theme_color_background_textLight), false)}, false);
                return;
            }
            ArrayList arrayList = new ArrayList((this.f9686G0.size() * 2) + 6);
            arrayList.add(new C2964ra(4, R.id.btn_terminateAllSessions, 0, R.string.TerminateAllWebSessions).m32843d0(R.id.theme_color_textNegative));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, R.string.ClearOtherWebSessionsHelp));
            arrayList.add(new C2964ra(8, 0, 0, R.string.OtherWebSessions));
            arrayList.add(new C2964ra(2));
            Iterator<TdApi.ConnectedWebsite> it = this.f9686G0.iterator();
            while (it.hasNext()) {
                TdApi.ConnectedWebsite next = it.next();
                if (z) {
                    z = false;
                } else {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(76, R.id.btn_session).m32863N(next.f25371id).m32870G(next));
            }
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, R.string.ConnectedWebsitesDesc));
            this.f9683D0.m34116x2(arrayList, false);
            C11052v1.m1768b().m1769a(this.f9683D0);
        }
    }

    public final void m33076Pg() {
        if (!this.f9685F0) {
            this.f9685F0 = true;
            this.f9683D0.m34196Y2();
            this.f30167b.m2270r4().m14783o(new TdApi.DisconnectAllWebsites(), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2899pz.this.m33073Sg(object);
                }
            });
        }
    }

    public final boolean m33075Qg(long j) {
        if (this.f9685F0) {
            return true;
        }
        C5324g gVar = this.f9684E0;
        return gVar != null && gVar.m23255d(j) == 1;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_websites;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(R.string.WebSessionsTitle);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C11052v1.m1768b().m1766d(this.f9683D0);
        View$OnClickListenerC3222vw w9 = m9139w9();
        if (w9 != null) {
            w9.m31113Eh(null);
        }
    }

    public final void m33065ah(TdApi.ConnectedWebsite connectedWebsite, int i) {
        Iterator<TdApi.ConnectedWebsite> it = this.f9686G0.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().f25371id == connectedWebsite.f25371id) {
                this.f9686G0.remove(i2);
                if (this.f9686G0.isEmpty()) {
                    m33077Og();
                } else {
                    C2546iq iqVar = this.f9683D0;
                    if (i2 != 0) {
                        i--;
                    }
                    iqVar.m34204V1(i, 2);
                }
                if (m9139w9() != null) {
                    m9139w9().m31109Gh(this.f9686G0);
                    return;
                }
                return;
            }
            i2++;
        }
    }

    public void m33064bh(View$OnClickListenerC3222vw vwVar) {
        super.m9476Ad(vwVar);
        TdApi.ConnectedWebsites ih = vwVar.m31081ih();
        if (ih == null) {
            vwVar.m31113Eh(this);
        } else {
            m33063ch(ih.websites);
        }
    }

    public final void m33063ch(TdApi.ConnectedWebsite[] connectedWebsiteArr) {
        ArrayList<TdApi.ConnectedWebsite> arrayList = new ArrayList<>(connectedWebsiteArr.length);
        this.f9686G0 = arrayList;
        Collections.addAll(arrayList, connectedWebsiteArr);
    }

    public final void m33062dh(final TdApi.ConnectedWebsite connectedWebsite, boolean z, boolean z2) {
        if (!m33075Qg(connectedWebsite.f25371id)) {
            if (z2) {
                m9206me(new C9188f2(R.id.btn_terminateSession).m9997p(new C2964ra[]{new C2964ra(12, (int) R.id.btn_banMember, 0, C4403w.m27865j1(R.string.DisconnectWebsiteBan, this.f30167b.m2480e2().m1721K2(connectedWebsite.botUserId)), (int) R.id.btn_banMember, z)}).m10011b(C4403w.m27865j1(R.string.TerminateWebSessionQuestion, connectedWebsite.domainName)).m10003j(new AbstractC9323v4.AbstractC9343r() {
                    @Override
                    public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                        View$OnClickListenerC2899pz.this.m33068Xg(connectedWebsite, i, sparseIntArray);
                    }
                }).m9995r(R.string.DisconnectWebsite).m9996q(R.id.theme_color_textNegative));
                return;
            }
            if (this.f9684E0 == null) {
                this.f9684E0 = new C5324g();
            }
            this.f9684E0.m23252g(connectedWebsite.f25371id, 1);
            this.f9683D0.m34164i3(connectedWebsite.f25371id);
            if (this.f9684E0.m23250i() == this.f9686G0.size()) {
                this.f9685F0 = true;
                this.f9683D0.m34130s3(R.id.btn_terminateAllSessions);
            }
            this.f30167b.m2270r4().m14783o(new TdApi.DisconnectWebsite(connectedWebsite.f25371id), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2899pz.this.m33066Zg(connectedWebsite, object);
                }
            });
            if (z) {
                this.f30167b.m2496d2(new TdApi.MessageSenderUser(connectedWebsite.botUserId), true, this.f30167b.m2392ja());
            }
        }
    }

    @Override
    public void mo31060g3(TdApi.ConnectedWebsites connectedWebsites) {
        if (!m9347Sa()) {
            m33063ch(connectedWebsites.websites);
            m33077Og();
        }
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_session) {
            final TdApi.ConnectedWebsite connectedWebsite = (TdApi.ConnectedWebsite) ((C2964ra) view.getTag()).m32844d();
            m9261ee(connectedWebsite.domainName, new int[]{R.id.btn_terminateSession, R.id.btn_openChat}, new String[]{C4403w.m27869i1(R.string.DisconnectWebsiteAction), C4403w.m27869i1(R.string.OpenChat)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_chat_bubble_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean Ug;
                    Ug = View$OnClickListenerC2899pz.this.m33071Ug(connectedWebsite, view2, i);
                    return Ug;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23934b(this, i);
                }
            });
        } else if (id2 == R.id.btn_terminateAllSessions) {
            m9261ee(C4403w.m27869i1(R.string.DisconnectAllWebsitesHint), new int[]{R.id.btn_terminateAllSessions, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.TerminateAllWebSessions), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean Tg;
                    Tg = View$OnClickListenerC2899pz.this.m33072Tg(view2, i);
                    return Tg;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23934b(this, i);
                }
            });
        }
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f9683D0 = new C2900a(this);
        if (this.f9686G0 != null) {
            m33077Og();
        }
        if (m9139w9() == null) {
            this.f30167b.m2270r4().m14783o(new TdApi.GetConnectedWebsites(), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2899pz.this.m33069Wg(object);
                }
            });
        }
        customRecyclerView.setAdapter(this.f9683D0);
    }
}
