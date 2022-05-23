package de;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ce.c0;
import ce.j0;
import de.ww;
import gd.w;
import ie.g0;
import ie.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import jb.g;
import ne.d;
import ne.n2;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import uc.c;
import ud.f2;
import ud.v4;
import zd.hj;
import zd.o6;
import zd.t1;

public class qz extends vo<ww> implements View.OnClickListener, ww.d {
    public iq D0;
    public g E0;
    public boolean F0;
    public ArrayList<TdApi.ConnectedWebsite> G0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void H2(ra raVar, int i10, RelativeLayout relativeLayout, boolean z10, TextView textView, TextView textView2, TextView textView3, TextView textView4, n2 n2Var, d dVar, ImageView imageView, TextView textView5, TextView textView6) {
            TdApi.ConnectedWebsite connectedWebsite = (TdApi.ConnectedWebsite) raVar.d();
            textView2.setText(id.d.z().I(connectedWebsite.domainName));
            textView3.setText(c0.q(", ", id.d.z().I(qz.this.f24495b.e2().J2(connectedWebsite.botUserId)), connectedWebsite.browser, connectedWebsite.platform));
            textView4.setText(c0.r(connectedWebsite.ip, connectedWebsite.location));
            textView.setText(w.V2(connectedWebsite.lastActiveDate, TimeUnit.SECONDS));
            dVar.q(qz.this.f24495b, connectedWebsite.botUserId, false);
            boolean Qg = qz.this.Qg(connectedWebsite.f19912id);
            relativeLayout.setEnabled(!Qg);
            float f10 = 1.0f;
            if (z10) {
                if (!Qg) {
                    f10 = 0.0f;
                }
                n2Var.a(f10);
                return;
            }
            if (!Qg) {
                f10 = 0.0f;
            }
            n2Var.d(f10);
        }

        @Override
        public void R2(ra raVar, c cVar, boolean z10) {
            if (raVar.j() == R.id.btn_terminateAllSessions) {
                if (z10) {
                    cVar.setEnabledAnimated(!qz.this.F0);
                } else {
                    cVar.setEnabled(!qz.this.F0);
                }
            }
        }
    }

    public qz(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Rg(TdApi.Object object) {
        this.D0.U2();
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            this.G0.clear();
            Og();
            if (w9() != null) {
                w9().Gh(this.G0);
            }
        }
    }

    public void Sg(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                qz.this.Rg(object);
            }
        });
    }

    public boolean Tg(View view, int i10) {
        if (i10 != R.id.btn_terminateAllSessions) {
            return true;
        }
        Pg();
        return true;
    }

    public boolean Ug(TdApi.ConnectedWebsite connectedWebsite, View view, int i10) {
        if (i10 == R.id.btn_openChat) {
            this.f24495b.hd().u7(this, connectedWebsite.botUserId, new hj.j().h());
        } else if (i10 == R.id.btn_terminateSession) {
            dh(connectedWebsite, false, true);
        }
        return true;
    }

    public void Vg(TdApi.Object object) {
        if (!Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -1727949694) {
                ch(((TdApi.ConnectedWebsites) object).websites);
                Og();
            } else if (constructor != -1679978726) {
                Log.unexpectedTdlibResponse(object, TdApi.GetConnectedWebsites.class, TdApi.ConnectedWebsites.class);
            } else {
                j0.t0(object);
            }
        }
    }

    public void Wg(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                qz.this.Vg(object);
            }
        });
    }

    public void Xg(TdApi.ConnectedWebsite connectedWebsite, int i10, SparseIntArray sparseIntArray) {
        dh(connectedWebsite, sparseIntArray.get(R.id.btn_banMember) == R.id.btn_banMember, false);
    }

    public void Yg(TdApi.ConnectedWebsite connectedWebsite, TdApi.Object object) {
        if (!Sa()) {
            this.E0.c(connectedWebsite.f19912id);
            int P0 = this.D0.P0(connectedWebsite.f19912id);
            this.D0.g3(P0);
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                j0.t0(object);
            } else if (constructor == -722616727) {
                ah(connectedWebsite, P0);
            }
        }
    }

    public void Zg(final TdApi.ConnectedWebsite connectedWebsite, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                qz.this.Yg(connectedWebsite, object);
            }
        });
    }

    public final void Og() {
        if (this.G0 != null && !Sa() && this.D0 != null) {
            boolean z10 = true;
            if (this.G0.isEmpty()) {
                this.D0.t2(new ra[]{new ra(75, (int) R.id.btn_loggedWebsites, 0, c0.Z(w.i1(R.string.NoActiveLogins), R.id.theme_color_background_textLight), false)}, false);
                return;
            }
            ArrayList arrayList = new ArrayList((this.G0.size() * 2) + 6);
            arrayList.add(new ra(4, R.id.btn_terminateAllSessions, 0, R.string.TerminateAllWebSessions).d0(R.id.theme_color_textNegative));
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, R.string.ClearOtherWebSessionsHelp));
            arrayList.add(new ra(8, 0, 0, R.string.OtherWebSessions));
            arrayList.add(new ra(2));
            Iterator<TdApi.ConnectedWebsite> it = this.G0.iterator();
            while (it.hasNext()) {
                TdApi.ConnectedWebsite next = it.next();
                if (z10) {
                    z10 = false;
                } else {
                    arrayList.add(new ra(11));
                }
                arrayList.add(new ra(76, R.id.btn_session).N(next.f19912id).G(next));
            }
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, R.string.ConnectedWebsitesDesc));
            this.D0.s2(arrayList, false);
            t1.b().a(this.D0);
        }
    }

    public final void Pg() {
        if (!this.F0) {
            this.F0 = true;
            this.D0.U2();
            this.f24495b.v4().o(new TdApi.DisconnectAllWebsites(), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    qz.this.Sg(object);
                }
            });
        }
    }

    public final boolean Qg(long j10) {
        if (this.F0) {
            return true;
        }
        g gVar = this.E0;
        return gVar != null && gVar.d(j10) == 1;
    }

    @Override
    public int R9() {
        return R.id.controller_websites;
    }

    @Override
    public void V2(TdApi.ConnectedWebsites connectedWebsites) {
        if (!Sa()) {
            ch(connectedWebsites.websites);
            Og();
        }
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.WebSessionsTitle);
    }

    @Override
    public void Z8() {
        super.Z8();
        t1.b().d(this.D0);
        ww w92 = w9();
        if (w92 != null) {
            w92.Eh(null);
        }
    }

    public final void ah(TdApi.ConnectedWebsite connectedWebsite, int i10) {
        Iterator<TdApi.ConnectedWebsite> it = this.G0.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().f19912id == connectedWebsite.f19912id) {
                this.G0.remove(i11);
                if (this.G0.isEmpty()) {
                    Og();
                } else {
                    iq iqVar = this.D0;
                    if (i11 != 0) {
                        i10--;
                    }
                    iqVar.R1(i10, 2);
                }
                if (w9() != null) {
                    w9().Gh(this.G0);
                    return;
                }
                return;
            }
            i11++;
        }
    }

    public void bh(ww wwVar) {
        super.Ad(wwVar);
        TdApi.ConnectedWebsites ih = wwVar.ih();
        if (ih == null) {
            wwVar.Eh(this);
        } else {
            ch(ih.websites);
        }
    }

    public final void ch(TdApi.ConnectedWebsite[] connectedWebsiteArr) {
        ArrayList<TdApi.ConnectedWebsite> arrayList = new ArrayList<>(connectedWebsiteArr.length);
        this.G0 = arrayList;
        Collections.addAll(arrayList, connectedWebsiteArr);
    }

    public final void dh(final TdApi.ConnectedWebsite connectedWebsite, boolean z10, boolean z11) {
        if (!Qg(connectedWebsite.f19912id)) {
            if (z11) {
                me(new f2(R.id.btn_terminateSession).p(new ra[]{new ra(12, (int) R.id.btn_banMember, 0, w.j1(R.string.DisconnectWebsiteBan, this.f24495b.e2().J2(connectedWebsite.botUserId)), (int) R.id.btn_banMember, z10)}).b(w.j1(R.string.TerminateWebSessionQuestion, connectedWebsite.domainName)).j(new v4.r() {
                    @Override
                    public final void l6(int i10, SparseIntArray sparseIntArray) {
                        qz.this.Xg(connectedWebsite, i10, sparseIntArray);
                    }
                }).r(R.string.DisconnectWebsite).q(R.id.theme_color_textNegative));
                return;
            }
            if (this.E0 == null) {
                this.E0 = new g();
            }
            this.E0.g(connectedWebsite.f19912id, 1);
            this.D0.f3(connectedWebsite.f19912id);
            if (this.E0.i() == this.G0.size()) {
                this.F0 = true;
                this.D0.p3(R.id.btn_terminateAllSessions);
            }
            this.f24495b.v4().o(new TdApi.DisconnectWebsite(connectedWebsite.f19912id), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    qz.this.Zg(connectedWebsite, object);
                }
            });
            if (z10) {
                this.f24495b.d2(new TdApi.MessageSenderUser(connectedWebsite.botUserId), true, this.f24495b.na());
            }
        }
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_session) {
            final TdApi.ConnectedWebsite connectedWebsite = (TdApi.ConnectedWebsite) ((ra) view.getTag()).d();
            ee(connectedWebsite.domainName, new int[]{R.id.btn_terminateSession, R.id.btn_openChat}, new String[]{w.i1(R.string.DisconnectWebsiteAction), w.i1(R.string.OpenChat)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_chat_bubble_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view2, int i10) {
                    boolean Ug;
                    Ug = qz.this.Ug(connectedWebsite, view2, i10);
                    return Ug;
                }
            });
        } else if (id2 == R.id.btn_terminateAllSessions) {
            ee(w.i1(R.string.DisconnectAllWebsitesHint), new int[]{R.id.btn_terminateAllSessions, R.id.btn_cancel}, new String[]{w.i1(R.string.TerminateAllWebSessions), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view2, int i10) {
                    boolean Tg;
                    Tg = qz.this.Tg(view2, i10);
                    return Tg;
                }
            });
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        this.D0 = new a(this);
        if (this.G0 != null) {
            Og();
        }
        if (w9() == null) {
            this.f24495b.v4().o(new TdApi.GetConnectedWebsites(), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    qz.this.Wg(object);
                }
            });
        }
        customRecyclerView.setAdapter(this.D0);
    }
}
