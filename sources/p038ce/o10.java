package p038ce;

import android.content.Context;
import android.view.View;
import gd.AbstractC4718o;
import gd.C4756s;
import gd.C4836y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.MediaRecyclerView;
import p038ce.x00;
import p082fd.C4403w;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p193nb.C7319d;
import p292ud.C9773p0;
import p292ud.C9781q0;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;

public class o10 extends i10<AbstractC4718o<?>> implements C9773p0.AbstractC9777d, C9773p0.AbstractC9776c {
    public TdApi.SearchMessagesFilter f9444G0;

    public o10(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static void m33507Rg() {
    }

    public boolean m33506Sg(AbstractC4718o oVar, View view, View view2, int i) {
        if (i == R.id.btn_delete) {
            this.f30167b.m2485dd();
            HandlerC10770jj.m3418w8(this.f8587r0, new TdApi.Message[]{oVar.getMessage()}, n10.f9248a);
        } else if (i == R.id.btn_share) {
            x00 x00Var = new x00(this.f30165a, this.f30167b);
            x00Var.m30994Vi(new x00.C3281m(oVar.getMessage()).m30888A(true));
            x00Var.m30960ej();
        } else if (i == R.id.btn_showInChat) {
            this.f8587r0.mo9314X8(false);
            this.f30167b.m2485dd().m3459s7(this, oVar.getMessage(), new HandlerC10770jj.C10788q().m3312s(mo4347s().m14584H3().m8985g(view)));
        }
        return true;
    }

    public static void m33504Ug(ArrayList<AbstractC4718o<?>> arrayList, TdApi.Message message) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (message == null) {
                Iterator<AbstractC4718o<?>> it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC4718o<?> next = it.next();
                    if (next instanceof C4756s) {
                        ((C4756s) next).m26256k0(false);
                    }
                }
                return;
            }
            Iterator<AbstractC4718o<?>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC4718o<?> next2 = it2.next();
                if (next2 instanceof C4756s) {
                    ((C4756s) next2).m26256k0(C9773p0.m7114D(next2.getMessage(), message));
                }
            }
        }
    }

    @Override
    public boolean mo33058Lg() {
        return true;
    }

    @Override
    public void mo6985N2(int i) {
        C9781q0.m6970b(this, i);
    }

    public AbstractC4718o<?> mo33044rg(TdApi.Object object) {
        AbstractC4718o<?> oVar;
        TdApi.Message message = (TdApi.Message) object;
        TdApi.SearchMessagesFilter searchMessagesFilter = this.f9444G0;
        if (searchMessagesFilter == null || searchMessagesFilter.getConstructor() != -1828724341) {
            oVar = AbstractC4718o.m26343X(this.f30165a, this.f30167b, message);
        } else {
            oVar = new C4836y(this.f30165a, this.f30167b, message);
        }
        if (oVar != null) {
            oVar.m26347T(message.f25406id);
            oVar.m26350O(message.date);
            if ((oVar instanceof C4756s) && message.content.getConstructor() == 276722716) {
                ((C4756s) oVar).m26257j0(false);
            }
        }
        return oVar;
    }

    public o10 m33503Vg(TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.f9444G0 = searchMessagesFilter;
        return this;
    }

    @Override
    public void mo6984X(C10930q6 q6Var, TdApi.Message message) {
        C9781q0.m6971a(this, q6Var, message);
    }

    @Override
    public CharSequence mo9313X9() {
        switch (this.f9444G0.getConstructor()) {
            case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                return C4403w.m27869i1(R.string.TabLinks);
            case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                return C4403w.m27869i1(R.string.TabAudio);
            case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                return C4403w.m27869i1(R.string.TabDocs);
            case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                return C4403w.m27869i1(R.string.TabVoiceMessages);
            default:
                return "";
        }
    }

    @Override
    public void mo6983Y1(C10930q6 q6Var, TdApi.Message message, int i, int i2, float f, boolean z) {
        m33504Ug(this.f8577A0, message);
        if (m34381Rf()) {
            m33504Ug(this.f8578B0, message);
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        TdApi.SearchMessagesFilter searchMessagesFilter = this.f9444G0;
        if (searchMessagesFilter != null && searchMessagesFilter.getConstructor() == 867505275) {
            this.f30167b.m2930B4().m4636w2().m7087Q0(this);
        }
    }

    @Override
    public CharSequence mo33051if(ArrayList<AbstractC4718o<?>> arrayList) {
        switch (this.f9444G0.getConstructor()) {
            case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                return C4403w.m27836q2(R.string.xLinks, arrayList.size());
            case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                return C4403w.m27836q2(R.string.xAudios, arrayList.size());
            case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                return C4403w.m27836q2(R.string.xFiles, arrayList.size());
            case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                return C4403w.m27836q2(R.string.xVoiceMessages, arrayList.size());
            default:
                return null;
        }
    }

    @Override
    public boolean mo33502kg() {
        View$OnClickListenerC2971rh rhVar = this.f8587r0;
        return rhVar != null && rhVar.m9382Na();
    }

    @Override
    public void mo33045ng(Context context, MediaRecyclerView mediaRecyclerView, C2546iq iqVar) {
        super.mo33045ng(context, mediaRecyclerView, iqVar);
        TdApi.SearchMessagesFilter searchMessagesFilter = this.f9444G0;
        if (searchMessagesFilter != null && searchMessagesFilter.getConstructor() == 867505275) {
            this.f30167b.m2930B4().m4636w2().m7030p(this);
        }
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar != null && raVar.m32876A() == 41) {
            if (this.f8589t0.m34195Z0()) {
                m34392Mg(raVar);
                return;
            }
            AbstractC4718o oVar = (AbstractC4718o) raVar.m32844d();
            int v = oVar.m26330v();
            if (v == 0) {
                this.f30167b.m2485dd().m3469r7(this, this.f8583n0, new C7319d(this.f8583n0, oVar.m26334r()), new HandlerC10770jj.C10788q().m3312s(mo4347s().m14584H3().m8985g(view)));
            } else if (v == 7 || v == 8) {
                this.f30167b.m2930B4().m4636w2().m7105H0(this.f30167b, oVar.getMessage(), this);
            } else if (v == 9) {
                ((C4756s) oVar).m26259h0(view);
            }
        }
    }

    @Override
    public boolean mo6987q7(TdApi.Message message, boolean z, boolean z2, List<TdApi.Message> list, long j) {
        return j != 0 && j == message.chatId && z;
    }

    @Override
    public boolean mo33501qg(final View view, C2964ra raVar) {
        final AbstractC4718o oVar = (AbstractC4718o) raVar.m32844d();
        this.f8587r0.m9261ee(null, new int[]{R.id.btn_showInChat, R.id.btn_share, R.id.btn_delete}, new String[]{C4403w.m27869i1(R.string.ShowInChat), C4403w.m27869i1(R.string.Share), C4403w.m27869i1(R.string.Delete)}, new int[]{1, 1, 2}, new int[]{R.drawable.baseline_visibility_24, R.drawable.baseline_forward_24, R.drawable.baseline_delete_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view2, int i) {
                boolean Sg;
                Sg = o10.this.m33506Sg(oVar, view, view2, i);
                return Sg;
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
        return true;
    }

    @Override
    public boolean mo33500rf() {
        return this.f9444G0 != null;
    }

    @Override
    public C9773p0.C9775b mo6986s5(TdApi.Message message) {
        ArrayList arrayList;
        String str;
        int i;
        if (m34381Rf()) {
            str = m34409Bf();
            arrayList = this.f8578B0;
        } else {
            arrayList = this.f8577A0;
            str = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            throw new IllegalStateException();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int constructor = message.content.getConstructor();
        if (constructor == 276722716) {
            i = 7;
        } else if (constructor != 527777781) {
            return null;
        } else {
            i = 8;
        }
        int i2 = -1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC4718o oVar = (AbstractC4718o) arrayList.get(size);
            if (oVar.m26330v() == i && (oVar instanceof C4756s)) {
                TdApi.Message message2 = oVar.getMessage();
                if (C9773p0.m7114D(message, message2)) {
                    if (i2 == -1) {
                        i2 = arrayList2.size();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                arrayList2.add(message2);
            }
        }
        if (i2 != -1) {
            return new C9773p0.C9775b(arrayList2, i2).m6992q(Log.TAG_ROUND).m6988u(str);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public boolean mo33043tg() {
        return true;
    }

    @Override
    public TdApi.SearchMessagesFilter mo33042wg() {
        return this.f9444G0;
    }

    @Override
    public int mo33041xg() {
        return 41;
    }
}
