package de;

import android.content.Context;
import android.view.View;
import de.y00;
import gd.w;
import hd.o;
import hd.s;
import hd.y;
import ie.g0;
import ie.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ob.d;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.MediaRecyclerView;
import vd.o0;
import vd.p0;
import zd.hj;
import zd.o6;

public class p10 extends j10<o<?>> implements o0.d, o0.c {
    public TdApi.SearchMessagesFilter G0;

    public p10(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static void Rg() {
    }

    public boolean Sg(o oVar, View view, View view2, int i10) {
        if (i10 == R.id.btn_delete) {
            this.f24495b.hd();
            hj.w8(this.f8365r0, new TdApi.Message[]{oVar.getMessage()}, o10.f8934a);
        } else if (i10 == R.id.btn_share) {
            y00 y00Var = new y00(this.f24493a, this.f24495b);
            y00Var.Vi(new y00.m(oVar.getMessage()).A(true));
            y00Var.ej();
        } else if (i10 == R.id.btn_showInChat) {
            this.f8365r0.X8(false);
            this.f24495b.hd().s7(this, oVar.getMessage(), new hj.q().s(t().I3().g(view)));
        }
        return true;
    }

    public static void Ug(ArrayList<o<?>> arrayList, TdApi.Message message) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (message == null) {
                Iterator<o<?>> it = arrayList.iterator();
                while (it.hasNext()) {
                    o<?> next = it.next();
                    if (next instanceof s) {
                        ((s) next).k0(false);
                    }
                }
                return;
            }
            Iterator<o<?>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                o<?> next2 = it2.next();
                if (next2 instanceof s) {
                    ((s) next2).k0(o0.D(next2.getMessage(), message));
                }
            }
        }
    }

    @Override
    public void E2(int i10) {
        p0.b(this, i10);
    }

    @Override
    public boolean Lg() {
        return true;
    }

    public o<?> rg(TdApi.Object object) {
        o<?> oVar;
        TdApi.Message message = (TdApi.Message) object;
        TdApi.SearchMessagesFilter searchMessagesFilter = this.G0;
        if (searchMessagesFilter == null || searchMessagesFilter.getConstructor() != -1828724341) {
            oVar = o.X(this.f24493a, this.f24495b, message);
        } else {
            oVar = new y(this.f24493a, this.f24495b, message);
        }
        if (oVar != null) {
            oVar.T(message.f19946id);
            oVar.O(message.date);
            if ((oVar instanceof s) && message.content.getConstructor() == 276722716) {
                ((s) oVar).j0(false);
            }
        }
        return oVar;
    }

    public p10 Vg(TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.G0 = searchMessagesFilter;
        return this;
    }

    @Override
    public CharSequence X9() {
        switch (this.G0.getConstructor()) {
            case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                return w.i1(R.string.TabLinks);
            case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                return w.i1(R.string.TabAudio);
            case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                return w.i1(R.string.TabDocs);
            case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                return w.i1(R.string.TabVoiceMessages);
            default:
                return "";
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        TdApi.SearchMessagesFilter searchMessagesFilter = this.G0;
        if (searchMessagesFilter != null && searchMessagesFilter.getConstructor() == 867505275) {
            this.f24495b.F4().w2().Q0(this);
        }
    }

    @Override
    public void e5(o6 o6Var, TdApi.Message message, int i10, int i11, float f10, boolean z10) {
        Ug(this.A0, message);
        if (Rf()) {
            Ug(this.B0, message);
        }
    }

    @Override
    public void g0(o6 o6Var, TdApi.Message message) {
        p0.a(this, o6Var, message);
    }

    @Override
    public CharSequence mo1if(ArrayList<o<?>> arrayList) {
        switch (this.G0.getConstructor()) {
            case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                return w.q2(R.string.xLinks, arrayList.size());
            case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                return w.q2(R.string.xAudios, arrayList.size());
            case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                return w.q2(R.string.xFiles, arrayList.size());
            case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                return w.q2(R.string.xVoiceMessages, arrayList.size());
            default:
                return null;
        }
    }

    @Override
    public boolean kg() {
        rh rhVar = this.f8365r0;
        return rhVar != null && rhVar.Na();
    }

    @Override
    public o0.b m5(TdApi.Message message) {
        ArrayList arrayList;
        String str;
        int i10;
        if (Rf()) {
            str = Bf();
            arrayList = this.B0;
        } else {
            arrayList = this.A0;
            str = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            throw new IllegalStateException();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int constructor = message.content.getConstructor();
        if (constructor == 276722716) {
            i10 = 7;
        } else if (constructor != 527777781) {
            return null;
        } else {
            i10 = 8;
        }
        int i11 = -1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o oVar = (o) arrayList.get(size);
            if (oVar.v() == i10 && (oVar instanceof s)) {
                TdApi.Message message2 = oVar.getMessage();
                if (o0.D(message, message2)) {
                    if (i11 == -1) {
                        i11 = arrayList2.size();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                arrayList2.add(message2);
            }
        }
        if (i11 != -1) {
            return new o0.b(arrayList2, i11).q(Log.TAG_ROUND).u(str);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void ng(Context context, MediaRecyclerView mediaRecyclerView, iq iqVar) {
        super.ng(context, mediaRecyclerView, iqVar);
        TdApi.SearchMessagesFilter searchMessagesFilter = this.G0;
        if (searchMessagesFilter != null && searchMessagesFilter.getConstructor() == 867505275) {
            this.f24495b.F4().w2().p(this);
        }
    }

    @Override
    public void onClick(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar != null && raVar.A() == 41) {
            if (this.f8367t0.W0()) {
                Mg(raVar);
                return;
            }
            o oVar = (o) raVar.d();
            int v10 = oVar.v();
            if (v10 == 0) {
                this.f24495b.hd().r7(this, this.f8361n0, new d(this.f8361n0, oVar.r()), new hj.q().s(t().I3().g(view)));
            } else if (v10 == 7 || v10 == 8) {
                this.f24495b.F4().w2().H0(this.f24495b, oVar.getMessage(), this);
            } else if (v10 == 9) {
                ((s) oVar).h0(view);
            }
        }
    }

    @Override
    public boolean p7(TdApi.Message message, boolean z10, boolean z11, List<TdApi.Message> list, long j10) {
        return j10 != 0 && j10 == message.chatId && z10;
    }

    @Override
    public boolean qg(final View view, ra raVar) {
        final o oVar = (o) raVar.d();
        this.f8365r0.ee(null, new int[]{R.id.btn_showInChat, R.id.btn_share, R.id.btn_delete}, new String[]{w.i1(R.string.ShowInChat), w.i1(R.string.Share), w.i1(R.string.Delete)}, new int[]{1, 1, 2}, new int[]{R.drawable.baseline_visibility_24, R.drawable.baseline_forward_24, R.drawable.baseline_delete_24}, new h0() {
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
                boolean Sg;
                Sg = p10.this.Sg(oVar, view, view2, i10);
                return Sg;
            }
        });
        return true;
    }

    @Override
    public boolean rf() {
        return this.G0 != null;
    }

    @Override
    public boolean tg() {
        return true;
    }

    @Override
    public TdApi.SearchMessagesFilter wg() {
        return this.G0;
    }

    @Override
    public int xg() {
        return 41;
    }
}
