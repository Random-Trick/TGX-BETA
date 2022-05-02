package p038ce;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import gd.AbstractC4718o;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.C6952l3;
import me.C7030t1;
import me.C7057w;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.MediaRecyclerView;
import p038ce.View$OnClickListenerC3062so;
import p038ce.x00;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5070i;
import p111he.AbstractC5113f0;
import p111he.AbstractC5123k;
import p139jb.AbstractRunnableC5910b;
import p143k0.C6038h;
import p193nb.C7316a;
import p193nb.C7319d;
import p193nb.C7321e;
import p350yd.AbstractC10664f9;
import p350yd.AbstractC10748j1;
import p350yd.C10722i1;
import p350yd.C10930q6;
import p350yd.C11052v1;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import td.AbstractC9323v4;

public abstract class i10<T extends AbstractC5113f0> extends AbstractC9323v4<C2519d> implements View.OnClickListener, View.OnLongClickListener, C3950k.AbstractC3952b, AbstractC10748j1 {
    public ArrayList<T> f8577A0;
    public ArrayList<T> f8578B0;
    public String f8579C0;
    public ArrayList<C2964ra> f8580D0 = new ArrayList<>();
    public boolean f8581E0;
    public Map<String, TdApi.Message> f8582F0;
    public long f8583n0;
    public long f8584o0;
    public boolean f8585p0;
    public View$OnClickListenerC3062so f8586q0;
    public View$OnClickListenerC2971rh f8587r0;
    public MediaRecyclerView f8588s0;
    public C2546iq f8589t0;
    public boolean f8590u0;
    public boolean f8591v0;
    public boolean f8592w0;
    public String f8593x0;
    public AbstractRunnableC5910b f8594y0;
    public AbstractC5123k f8595z0;

    public class C2516a extends C2546iq {
        public C2516a(AbstractC10664f9 f9Var, View.OnClickListener onClickListener, AbstractC9323v4 v4Var) {
            super(f9Var, onClickListener, v4Var);
        }

        @Override
        public void mo33139s1(C2964ra raVar, C6952l3 l3Var, C7057w wVar, boolean z) {
            i10.this.mo34354gg(raVar, l3Var, wVar, z);
        }

        @Override
        public void mo393t2(C2964ra raVar, int i, C7030t1 t1Var) {
            if (i10.this.f8590u0 || i10.this.m34345qf()) {
                t1Var.m18057F1();
                return;
            }
            i10 i10Var = i10.this;
            t1Var.m18058E1(i10Var.mo33054if(i10Var.m34384Rf() ? i10.this.f8578B0 : i10.this.f8577A0));
        }
    }

    public class C2517b extends RecyclerView.AbstractC0910t {
        public C2517b() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            View C;
            i10.this.m34358eg();
            List<C2964ra> F0 = i10.this.f8589t0.m34243F0();
            if (F0.size() == 1 && F0.get(0).m32879A() == 44 && (C = recyclerView.getLayoutManager().mo39265C(0)) != null) {
                C.invalidate();
            }
        }
    }

    public class C2518c extends AbstractRunnableC5910b {
        public final String f8598M;
        public final long f8599N;
        public final int f8600O;

        public C2518c(String str, long j, int i) {
            this.f8598M = str;
            this.f8599N = j;
            this.f8600O = i;
        }

        @Override
        public void mo1364b() {
            i10 i10Var = i10.this;
            i10Var.m34343sg(i10Var.f8583n0, i10Var.f8584o0, this.f8598M, this.f8599N, i10Var.f8579C0, this.f8600O);
        }
    }

    public static class C2519d {
        public long f8602a;
        public long f8603b;

        public C2519d(long j, long j2) {
            this.f8602a = j;
            this.f8603b = j2;
        }
    }

    public i10(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static long m34402If(ArrayList<? extends AbstractC5113f0> arrayList, long j) {
        return (arrayList == null || arrayList.isEmpty()) ? j : arrayList.get(arrayList.size() - 1).mo13512d();
    }

    public static i10<?> m34393Ng(Context context, C10930q6 q6Var, TdApi.SearchMessagesFilter searchMessagesFilter) {
        switch (searchMessagesFilter.getConstructor()) {
            case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                return new o10(context, q6Var).m33506Vg(searchMessagesFilter);
            case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                return new q10(context, q6Var).m33055Ug(searchMessagesFilter);
            default:
                throw new IllegalArgumentException("unsupported filter: " + searchMessagesFilter);
        }
    }

    public static boolean m34388Pf(i10<?> i10Var) {
        return (i10Var instanceof o10) || (i10Var instanceof q10);
    }

    public void m34382Sf() {
        m34407Eg(false);
    }

    public void m34380Tf() {
        m34407Eg(false);
    }

    public void m34378Uf(long j, long j2, TdApi.MessageContent messageContent) {
        if (!m9347Sa() && this.f8583n0 == j) {
            m34337wf(j2, messageContent);
        }
    }

    public void m34376Vf(TdApi.Message message) {
        if (!m9347Sa()) {
            mo34359ef(message);
        }
    }

    public void m34374Wf(long j, long[] jArr) {
        if (!m9347Sa() && this.f8583n0 == j) {
            m34332zg(jArr);
        }
    }

    public void m34372Xf(TdApi.Message message) {
        if (!m9347Sa()) {
            mo34359ef(message);
        }
    }

    public void m34368Zf(ArrayList arrayList, long j, String str, String str2) {
        if (!m9347Sa()) {
            boolean z = false;
            mo34353hg(arrayList, false);
            if (m34333zf(0L) == j && C5070i.m24068c(str, this.f8593x0)) {
                if (j == 0) {
                    z = true;
                }
                m34363cf(arrayList, str2, z);
            } else if (C5070i.m24062i(str) && m34384Rf()) {
                ArrayList<T> arrayList2 = this.f8577A0;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    this.f8577A0 = arrayList;
                } else {
                    this.f8577A0.addAll(arrayList);
                }
                if (!arrayList.isEmpty() && mo34399Jg(!C5070i.m24062i(str))) {
                    z = true;
                }
                this.f8591v0 = z;
            }
        }
    }

    public static int m34366ag(TdApi.Message message, TdApi.Message message2) {
        return Long.compare(message.f25409id, message2.f25409id);
    }

    public void m34364bg() {
        View$OnClickListenerC3062so soVar = this.f8586q0;
        if (soVar != null) {
            soVar.m31676cj();
        }
    }

    public static <T extends AbstractC5113f0> boolean m34361df(List<C2964ra> list, int i, ArrayList<T> arrayList, int i2, List<C2964ra> list2, C2546iq iqVar, i10<?> i10Var, int i3) {
        boolean z;
        ArrayList<T> arrayList2 = arrayList;
        if (arrayList.isEmpty()) {
            return false;
        }
        boolean z2 = (i3 & 1) != 0;
        boolean z3 = (i3 & 2) != 0;
        int size = list2.size();
        list.clear();
        C5062b.m24160m(list, arrayList.size());
        int i4 = -1;
        int g = i2 == 0 ? -1 : arrayList2.get(i2 - 1).mo13506g();
        int B0 = i2 == 0 ? -1 : C4779t2.m25724B0(g);
        boolean z4 = arrayList2.get(0) instanceof AbstractC4718o;
        int size2 = arrayList.size();
        int i5 = i2;
        while (i5 < size2) {
            T t = arrayList2.get(i5);
            if (z2) {
                int g2 = t.mo13506g();
                int B02 = C4779t2.m25724B0(g2);
                if (B02 != B0 || g == i4 || C4779t2.m25463n5(B02, g, g2)) {
                    if (!(i5 == i2 && i2 == 0)) {
                        list.add(new C2964ra(3));
                    }
                    list.add(new C2964ra((i2 != 0 || !z3) ? 8 : 70, 0, 0, (CharSequence) C4403w.m27916Y0(g2, TimeUnit.SECONDS, true), false));
                    list.add(new C2964ra(2));
                    g = g2;
                    B0 = B02;
                    z = false;
                } else {
                    z = true;
                }
                if (z4) {
                    ((AbstractC4718o) t).m26350Q(z);
                }
            } else if (i2 == 0 && i5 == 0) {
                String Ef = i10Var.mo34017Ef();
                if (!C5070i.m24062i(Ef)) {
                    list.add(new C2964ra(8, 0, 0, (CharSequence) Ef, false));
                }
                list.add(new C2964ra(2, R.id.shadowTop));
            } else {
                list.add(new C2964ra(1));
            }
            list.add(new C2964ra(i).m32873G(t).m32866N(t.mo13512d()));
            i5++;
            arrayList2 = arrayList;
            i4 = -1;
        }
        if (i2 == 0) {
            list.add(new C2964ra(3));
            list.add(new C2964ra(42, R.id.search_counter).m32867M(-1));
            list2.addAll(list);
            if (iqVar != null) {
                iqVar.m39311M(size, list.size());
                i10Var.m34346pg();
            }
        } else {
            int i6 = size - 2;
            list2.addAll(i6, list);
            if (iqVar != null) {
                iqVar.m39311M(i6, list.size());
                i10Var.m34346pg();
            }
        }
        return !list.isEmpty();
    }

    public void m34358eg() {
        int a2;
        int i;
        if (m34345qf() && (a2 = ((LinearLayoutManager) this.f8588s0.getLayoutManager()).m39549a2()) != -1 && a2 + 6 >= this.f8589t0.m34243F0().size()) {
            long zf = m34333zf(-1L);
            if (zf != -1) {
                int i2 = 40;
                int Hf = mo33063Hf();
                if (Hf > 1 && (i = 40 % Hf) != 0) {
                    i2 = 40 + ((Hf - i) - 1);
                }
                m34360dg(this.f8593x0, zf, i2);
            }
        }
    }

    public long mo34019Af(ArrayList<T> arrayList, long j) {
        return m34402If(arrayList, j);
    }

    public void m34413Ag(String str) {
        if (!C5070i.m24068c(this.f8593x0, str)) {
            m34407Eg(false);
            m34360dg(str, 0L, mo33053jf());
        }
    }

    public final String m34412Bf() {
        return this.f8593x0;
    }

    public void m34411Bg(C2519d dVar) {
        super.m9476Ad(dVar);
        this.f8583n0 = dVar.f8602a;
        this.f8584o0 = dVar.f8603b;
    }

    @Override
    public long mo9464C9() {
        return this.f8583n0;
    }

    public String mo34410Cf() {
        return null;
    }

    public final void m34409Cg(boolean z, boolean z2) {
        if (m34345qf() != z) {
            if (m34384Rf()) {
                this.f8592w0 = z;
            } else {
                this.f8591v0 = z;
            }
            if (z2) {
                C2546iq iqVar = this.f8589t0;
                iqVar.m39315I(iqVar.m34243F0().size() - 1);
            }
        }
    }

    public int mo34018Df() {
        TdApi.SearchMessagesFilter wg = mo33045wg();
        if (wg == null) {
            return 0;
        }
        switch (wg.getConstructor()) {
            case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                return 4;
            case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                return 9;
            case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                return 13;
            case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                return 11;
            case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                return 3;
            case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                return 12;
            case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                return 1;
            case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                return 2;
            case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                return 10;
            default:
                return 0;
        }
    }

    public final void m34408Dg(ArrayList<T> arrayList, String str) {
        if (m34384Rf()) {
            this.f8578B0 = arrayList;
            this.f8579C0 = str;
            return;
        }
        this.f8577A0 = arrayList;
    }

    @Override
    public final void mo4051E2(final TdApi.Message message) {
        if (View$OnClickListenerC3062so.m31577nj(message)) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    i10.this.m34372Xf(message);
                }
            });
        }
    }

    public String mo34017Ef() {
        throw new RuntimeException("Stub!");
    }

    public boolean m34407Eg(boolean z) {
        if (this.f8581E0 == z) {
            return false;
        }
        this.f8581E0 = z;
        View$OnClickListenerC3062so soVar = this.f8586q0;
        if (soVar != null) {
            soVar.m31735Vm(z, m34398Kf());
        } else {
            View$OnClickListenerC2971rh rhVar = this.f8587r0;
            if (rhVar != null) {
                if (z) {
                    rhVar.m9297Zc(1);
                } else {
                    rhVar.m9307Y8();
                }
            }
        }
        Map<String, TdApi.Message> map = this.f8582F0;
        if (map != null && map.size() > 0 && !z) {
            this.f8589t0.m34121x0();
            this.f8582F0.clear();
        }
        this.f8589t0.m34134s2(z, mo33052jg(), this);
        return true;
    }

    public int m34406Ff() {
        int N0 = this.f8589t0.m34227N0(R.id.shadowTop);
        if (N0 != -1) {
            return N0 + 1;
        }
        return 0;
    }

    public void m34405Fg(View$OnClickListenerC2971rh rhVar) {
        this.f8587r0 = rhVar;
        this.f30170b.m2781K9().m1858g0(this.f8583n0, this);
    }

    public int mo34016Gf() {
        return C1357a0.m37544i(72.0f);
    }

    public void m34404Gg(View$OnClickListenerC3062so soVar) {
        this.f8586q0 = soVar;
    }

    @Override
    public final void mo4050H(final long j, final long[] jArr) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                i10.this.m34374Wf(j, jArr);
            }
        });
    }

    public int mo33063Hf() {
        return 0;
    }

    public void m34403Hg() {
        this.f8585p0 = true;
    }

    public void m34401Ig() {
        Map<String, TdApi.Message> map;
        if (this.f30170b.m2632U2(this.f8583n0) != null && (map = this.f8582F0) != null && map.size() > 0) {
            x00 x00Var = new x00(this.f30168a, this.f30170b);
            TdApi.Message[] messageArr = (TdApi.Message[]) this.f8582F0.values().toArray(new TdApi.Message[0]);
            Arrays.sort(messageArr, g10.f8282a);
            x00Var.m30996Vi(new x00.C3281m(messageArr).m30860z(new Runnable() {
                @Override
                public final void run() {
                    i10.this.m34364bg();
                }
            }).m30890A(true));
            x00Var.m30962ej();
        }
    }

    @Override
    public void mo4049J5(long j, long j2) {
        C10722i1.m4167e(this, j, j2);
    }

    @Override
    public void mo8866Ja(int i, int i2) {
        super.mo8866Ja(i, i2);
        C2546iq iqVar = this.f8589t0;
        if (iqVar != null) {
            iqVar.mo9343T5(i, i2);
        }
    }

    public RecyclerView m34400Jf() {
        return this.f8588s0;
    }

    public boolean mo34399Jg(boolean z) {
        return true;
    }

    public final int m34398Kf() {
        if (m34390P0() == 0) {
            return R.string.SelectedSuffix;
        }
        SparseIntArray F = C4779t2.m25697F(this.f8582F0);
        int size = F.size();
        if (size == 2 && F.indexOfKey(TdApi.MessagePhoto.CONSTRUCTOR) >= 0 && F.indexOfKey(TdApi.MessageVideo.CONSTRUCTOR) >= 0) {
            return R.string.AttachMediasSuffix;
        }
        if (size == 1) {
            switch (F.keyAt(0)) {
                case TdApi.MessagePhoto.CONSTRUCTOR:
                    return R.string.SelectedPhotoSuffix;
                case TdApi.MessageAudio.CONSTRUCTOR:
                    return R.string.SelectedAudioSuffix;
                case TdApi.MessageVoiceNote.CONSTRUCTOR:
                    return R.string.SelectedVoiceSuffix;
                case TdApi.MessageDocument.CONSTRUCTOR:
                    return R.string.SelectedFileSuffix;
                case TdApi.MessageVideoNote.CONSTRUCTOR:
                    return R.string.SelectedRoundVideoSuffix;
                case TdApi.MessageAnimation.CONSTRUCTOR:
                    return R.string.SelectedGifSuffix;
                case TdApi.MessageText.CONSTRUCTOR:
                    return R.string.SelectedLinkSuffix;
                case TdApi.MessageVideo.CONSTRUCTOR:
                    return R.string.SelectedVideoSuffix;
            }
        }
        return R.string.SelectedSuffix;
    }

    public boolean mo33062Kg() {
        return true;
    }

    public C7319d m34397Lf() {
        Map<String, TdApi.Message> map = this.f8582F0;
        if (map == null || map.size() != 1) {
            return null;
        }
        Iterator<TdApi.Message> it = this.f8582F0.values().iterator();
        if (!it.hasNext()) {
            return null;
        }
        TdApi.Message next = it.next();
        return new C7319d(next.chatId, next.f25409id);
    }

    public abstract boolean mo33061Lg();

    public final int m34396Mf(long j) {
        if (this.f8577A0 == null || !mo33061Lg()) {
            return -1;
        }
        int i = 0;
        Iterator<T> it = this.f8577A0.iterator();
        while (it.hasNext()) {
            if (it.next().mo13512d() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void m34395Mg(C2964ra raVar) {
        boolean z;
        long m = raVar.m32835m();
        AbstractC5113f0 f0Var = (AbstractC5113f0) raVar.m32847d();
        if (f0Var != null && m != 0) {
            if (raVar.m32879A() == 40 || raVar.m32879A() == 41) {
                TdApi.Message message = f0Var.getMessage();
                String str = message.chatId + "_" + message.f25409id;
                Map<String, TdApi.Message> map = this.f8582F0;
                if (map == null) {
                    this.f8582F0 = new HashMap();
                    z = false;
                } else {
                    z = map.containsKey(str);
                }
                if (z) {
                    this.f8582F0.remove(str);
                } else {
                    this.f8582F0.put(str, f0Var.getMessage());
                }
                if (!m34407Eg(this.f8582F0.size() > 0)) {
                    View$OnClickListenerC3062so soVar = this.f8586q0;
                    if (soVar != null) {
                        soVar.m31690an(m34390P0(), m34398Kf());
                        this.f8586q0.m31546qn(m34349of(), m34347pf(), m34344sf(), m34350nf(), this.f8582F0.size() == 1);
                    } else {
                        View$OnClickListenerC2971rh rhVar = this.f8587r0;
                        if (rhVar != null) {
                            rhVar.m9402Kd(this.f8582F0.size());
                            this.f8587r0.m32757Er();
                        }
                    }
                } else if (this.f8581E0) {
                    View$OnClickListenerC3062so soVar2 = this.f8586q0;
                    if (soVar2 != null) {
                        soVar2.m31546qn(m34349of(), m34347pf(), m34344sf(), m34350nf(), this.f8582F0.size() == 1);
                    } else {
                        View$OnClickListenerC2971rh rhVar2 = this.f8587r0;
                        if (rhVar2 != null) {
                            rhVar2.m32757Er();
                        }
                    }
                }
                raVar.m32861S(!z);
                int R0 = this.f8589t0.m34218R0(m);
                if (R0 != -1) {
                    this.f8589t0.m34126v2(R0, !z, -1);
                }
            }
        }
    }

    public boolean mo34394Nf() {
        return false;
    }

    public boolean m34392Of() {
        return this.f8581E0;
    }

    public void m34391Og() {
        C7319d Lf = m34397Lf();
        if (Lf != null) {
            this.f30170b.m2485dd().m3569h7(this, mo9464C9(), new HandlerC10770jj.C10780j().m3363m().m3371e(Lf).m3373c());
        }
    }

    public final int m34390P0() {
        Map<String, TdApi.Message> map = this.f8582F0;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    @Override
    public final void mo45P5(int i, float f, float f2, C3950k kVar) {
        View$OnClickListenerC3062so soVar = this.f8586q0;
        if (soVar != null) {
            soVar.m31699Zm(f);
        }
    }

    public boolean m34386Qf() {
        return this.f8585p0;
    }

    @Override
    public void mo4048R3(long j, long j2) {
        C10722i1.m4163i(this, j, j2);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_media__new;
    }

    public final boolean m34384Rf() {
        String str = this.f8593x0;
        return str != null && !str.isEmpty();
    }

    @Override
    public void mo4047T0(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        C10722i1.m4168d(this, j, j2, messageInteractionInfo);
    }

    @Override
    public void mo4046V(long j, long j2) {
        C10722i1.m4166f(this, j, j2);
    }

    @Override
    public void mo4045V1(long j, long j2, boolean z) {
        C10722i1.m4164h(this, j, j2, z);
    }

    @Override
    public boolean mo136W0() {
        View$OnClickListenerC3062so soVar = this.f8586q0;
        return soVar != null && soVar.mo136W0();
    }

    @Override
    public final void mo4044X1(final TdApi.Message message, long j) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                i10.this.m34376Vf(message);
            }
        });
    }

    @Override
    public abstract CharSequence mo9313X9();

    @Override
    public final void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (this.f8587r0 != null) {
            this.f30170b.m2781K9().m1806t0(this.f8583n0, this);
        }
        C11052v1.m1768b().m1766d(this.f8589t0);
        C1399s0.m37165q(this.f8588s0);
    }

    @Override
    public void mo4043c6(long j, long j2, TdApi.Sticker sticker) {
        C10722i1.m4171a(this, j, j2, sticker);
    }

    public final void m34363cf(ArrayList<T> arrayList, String str, boolean z) {
        ArrayList<T> arrayList2 = m34384Rf() ? this.f8578B0 : this.f8577A0;
        this.f8590u0 = false;
        boolean z2 = true;
        if (arrayList2 == null || arrayList2.isEmpty() || z) {
            if (arrayList.isEmpty() || !mo34399Jg(m34384Rf())) {
                z2 = false;
            }
            m34409Cg(z2, false);
            if (arrayList2 == null || !arrayList2.isEmpty() || !arrayList.isEmpty()) {
                m34408Dg(arrayList, str);
                m34357ff();
            }
        } else if (!arrayList.isEmpty()) {
            m34409Cg(mo34399Jg(m34384Rf()), false);
            Comparator<T> vg = mo34338vg();
            if (vg != null) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    T next = it.next();
                    int binarySearch = Collections.binarySearch(arrayList2, next, vg);
                    if (binarySearch < 0) {
                        int i = (binarySearch * (-1)) - 1;
                        arrayList2.add(i, next);
                        C2964ra raVar = new C2964ra(1);
                        C2964ra N = new C2964ra(mo33044xg()).m32873G(next).m32866N(next.mo13512d());
                        if (i == 0) {
                            this.f8589t0.m34243F0().add(2, raVar);
                            this.f8589t0.m34243F0().add(2, N);
                            this.f8589t0.m39311M(2, 2);
                        } else {
                            int i2 = ((i * 2) + 2) - 1;
                            this.f8589t0.m34243F0().add(i2, N);
                            this.f8589t0.m34243F0().add(i2, raVar);
                            this.f8589t0.m39311M(i2, 2);
                        }
                    }
                }
            } else {
                int size = arrayList2.size();
                arrayList2.addAll(arrayList);
                m34361df(this.f8580D0, mo33044xg(), arrayList2, size, this.f8589t0.m34243F0(), this.f8589t0, this, m34355gf());
            }
            if (!m34345qf()) {
                C2546iq iqVar = this.f8589t0;
                iqVar.m39315I(iqVar.m34243F0().size());
            }
        } else {
            m34409Cg(false, true);
        }
    }

    public final void m34362cg() {
        m34360dg(null, 0L, mo33053jf());
    }

    public final void m34360dg(String str, long j, int i) {
        if (!this.f8590u0 || !C5070i.m24068c(str, this.f8593x0)) {
            this.f8590u0 = true;
            boolean c = true ^ C5070i.m24068c(str, this.f8593x0);
            this.f8593x0 = str;
            AbstractRunnableC5910b bVar = this.f8594y0;
            if (bVar != null) {
                bVar.m21858c();
                this.f8594y0 = null;
            }
            AbstractC5123k kVar = this.f8595z0;
            if (kVar != null) {
                kVar.m23883a();
                this.f8595z0 = null;
            }
            if (c) {
                this.f8578B0 = null;
                m34351lf();
                m34357ff();
                this.f8588s0.m39507A0();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f8588s0.getLayoutManager();
                View$OnClickListenerC3062so soVar = this.f8586q0;
                linearLayoutManager.m39525z2(0, soVar != null ? -soVar.m31745Ul() : 0);
            }
            String str2 = this.f8593x0;
            if (str2 == null || str2.isEmpty()) {
                if (!c) {
                    m34343sg(this.f8583n0, this.f8584o0, str, j, this.f8579C0, i);
                    if (j == 0) {
                        this.f8595z0 = null;
                        return;
                    }
                    return;
                }
                this.f8590u0 = false;
            } else if (j == 0) {
                C2518c cVar = new C2518c(str, j, i);
                this.f8594y0 = cVar;
                cVar.m21856e(C1379j0.m37316o());
                C1379j0.m37335e0(this.f8594y0, 300L);
            } else {
                m34343sg(this.f8583n0, this.f8584o0, str, j, this.f8579C0, i);
            }
        }
    }

    public void mo34359ef(TdApi.Message message) {
        TdApi.SearchMessagesFilter wg;
        T rg;
        int yf;
        int R0;
        if (View$OnClickListenerC3062so.m31577nj(message) && this.f8583n0 == message.chatId && mo33061Lg() && (wg = mo33045wg()) != null && C7321e.m16941i1(message, wg) && this.f8577A0 != null && m34396Mf(message.f25409id) == -1 && (rg = mo33047rg(message)) != null && (yf = m34335yf(message.f25409id)) != -1) {
            if (m34384Rf()) {
                this.f8577A0.add(yf, rg);
                return;
            }
            T t = null;
            T t2 = yf < this.f8577A0.size() ? this.f8577A0.get(yf) : null;
            if (yf > 0) {
                t = this.f8577A0.get(yf - 1);
            }
            int g = rg.mo13506g();
            int B0 = C4779t2.m25724B0(g);
            boolean z = (t == null || C4779t2.m25724B0(t.mo13506g()) != B0 || C4779t2.m25463n5(B0, t.mo13506g(), g)) && (t2 == null || C4779t2.m25724B0(t2.mo13506g()) != B0 || C4779t2.m25463n5(B0, g, t2.mo13506g()));
            if (this.f8577A0.isEmpty()) {
                this.f8577A0.add(yf, rg);
                m34357ff();
                return;
            }
            List<C2964ra> F0 = this.f8589t0.m34243F0();
            C2964ra N = new C2964ra(mo33044xg()).m32873G(rg).m32866N(rg.mo13512d());
            if (t != null) {
                int R02 = this.f8589t0.m34218R0(t.mo13512d());
                if (R02 != -1) {
                    this.f8577A0.add(yf, rg);
                    if (z) {
                        int i = R02 + 1;
                        F0.add(i, new C2964ra(3));
                        F0.add(i, N);
                        F0.add(i, new C2964ra(2));
                        F0.add(i, new C2964ra(8, 0, 0, (CharSequence) C4403w.m27916Y0(g, TimeUnit.SECONDS, true), false));
                        this.f8589t0.m39311M(i, 4);
                    } else {
                        int i2 = R02 + 1;
                        F0.add(i2, N);
                        this.f8589t0.m39314J(i2);
                    }
                    m34346pg();
                }
            } else if (t2 != null && (R0 = this.f8589t0.m34218R0(t2.mo13512d())) != -1) {
                if (z) {
                    int i3 = (R0 - 1) - 1;
                    if (i3 >= 0) {
                        this.f8577A0.add(yf, rg);
                        F0.add(i3, new C2964ra(3));
                        F0.add(i3, N);
                        F0.add(i3, new C2964ra(2));
                        F0.add(i3, new C2964ra(8, 0, 0, (CharSequence) C4403w.m27916Y0(g, TimeUnit.SECONDS, true), false));
                        this.f8589t0.m39311M(i3, 4);
                    } else {
                        return;
                    }
                } else {
                    this.f8577A0.add(yf, rg);
                    F0.add(R0, N);
                    this.f8589t0.m39314J(R0);
                }
                m34346pg();
            }
        }
    }

    public final void m34357ff() {
        ArrayList arrayList = new ArrayList();
        ArrayList<T> arrayList2 = m34384Rf() ? this.f8578B0 : this.f8577A0;
        if (mo34394Nf() || (arrayList2 != null && arrayList2.isEmpty())) {
            if (this.f8589t0.m34243F0().size() != 1 || this.f8589t0.m34243F0().get(0).m32879A() != 44) {
                this.f8588s0.setOverScrollMode(2);
                arrayList.add(new C2964ra(44).m32867M(mo34018Df()).m32850b0(mo34410Cf()).m32875E(this.f30170b.m2784K6(this.f8583n0)));
            } else {
                return;
            }
        } else if (arrayList2 == null) {
            this.f8588s0.setOverScrollMode(2);
            if (this.f8589t0.m34243F0().size() != 1 || this.f8589t0.m34243F0().get(0).m32879A() != 43) {
                arrayList.add(new C2964ra(43));
            } else {
                return;
            }
        } else {
            m34361df(this.f8580D0, mo33044xg(), arrayList2, 0, arrayList, null, this, m34355gf());
        }
        this.f8589t0.m34205W1(arrayList);
        m34346pg();
    }

    public final int m34356fg(int i) {
        if (i == 43 || i == 44) {
            return this.f8588s0.getMeasuredHeight();
        }
        return C2139ap.m35482W(i);
    }

    public final int m34355gf() {
        boolean ig = mo34007ig();
        return this.f8587r0 != null ? (ig ? 1 : 0) | 2 : ig ? 1 : 0;
    }

    public void mo34354gg(C2964ra raVar, C6952l3 l3Var, C7057w wVar, boolean z) {
    }

    public TdApi.Function mo34008hf(long j, long j2, String str, long j3, String str2, int i) {
        if (C5070i.m24062i(str) || !C7316a.m17051j(j)) {
            return new TdApi.SearchChatMessages(j, str, null, j3, 0, i, mo33045wg(), j2);
        }
        return new TdApi.SearchSecretMessages(j, str, str2, i, mo33045wg());
    }

    public void mo34353hg(ArrayList<T> arrayList, boolean z) {
    }

    public abstract CharSequence mo33054if(ArrayList<T> arrayList);

    public boolean mo34007ig() {
        return true;
    }

    public int mo33053jf() {
        return C1357a0.m37551b(mo34016Gf(), 10);
    }

    public boolean mo33052jg() {
        return false;
    }

    @Override
    public void mo4042k5(TdApi.Message message, long j, int i, String str) {
        C10722i1.m4162j(this, message, j, i, str);
    }

    public final int m34352kf() {
        return mo33050mf(this.f8589t0.m34243F0().size());
    }

    public boolean mo33505kg() {
        return false;
    }

    @Override
    public final void mo4041l0(final long j, final long j2, final TdApi.MessageContent messageContent) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                i10.this.m34378Uf(j, j2, messageContent);
            }
        });
    }

    public final int m34351lf() {
        int X1;
        MediaRecyclerView mediaRecyclerView = this.f8588s0;
        if (mediaRecyclerView == null || (X1 = ((LinearLayoutManager) mediaRecyclerView.getLayoutManager()).m39552X1()) == -1) {
            return 0;
        }
        int mf = mo33050mf(X1);
        View C = this.f8588s0.getLayoutManager().mo39265C(X1);
        return C != null ? mf - C.getTop() : mf;
    }

    public boolean mo33051lg() {
        return true;
    }

    public int mo33050mf(int i) {
        int o;
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = 0;
        for (C2964ra raVar : this.f8589t0.m34243F0()) {
            int A = raVar.m32879A();
            if (A == 41) {
                AbstractC4718o oVar = (AbstractC4718o) raVar.m32847d();
                int measuredWidth = this.f8588s0.getMeasuredWidth();
                if (measuredWidth != 0) {
                    oVar.m26355J(measuredWidth);
                }
                o = oVar.m26338o();
            } else if (A == 43 || A == 44) {
                o = m34356fg(raVar.m32879A());
            } else {
                o = C2139ap.m35482W(raVar.m32879A());
            }
            i2 += o;
            i3++;
            if (i3 == i) {
                break;
            }
        }
        return i2;
    }

    public boolean mo33049mg() {
        return true;
    }

    public boolean m34350nf() {
        if (this.f8582F0 == null || !mo33062Kg() || this.f8582F0.isEmpty()) {
            return false;
        }
        for (TdApi.Message message : this.f8582F0.values()) {
            TdApi.File j1 = C4779t2.m25495j1(message);
            if (j1 != null) {
                TdApi.LocalFile localFile = j1.local;
                if (localFile.canBeDeleted) {
                    if (localFile.downloadedSize == 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void mo33048ng(Context context, MediaRecyclerView mediaRecyclerView, C2546iq iqVar) {
        mediaRecyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    @Override
    @SuppressLint({"InflateParams"})
    public final View mo403oc(Context context) {
        i10<T> i10Var = null;
        MediaRecyclerView mediaRecyclerView = (MediaRecyclerView) C1399s0.m37149y(mo4347s(), R.layout.recycler_sharedmedia, null);
        this.f8588s0 = mediaRecyclerView;
        mediaRecyclerView.setOverScrollMode(2);
        m9163t8(this.f8588s0);
        if (this.f8587r0 != null) {
            this.f8588s0.setBackgroundColor(C11524j.m199b());
            m9197o8(this.f8588s0, R.id.theme_color_background);
        }
        this.f8588s0.setHasFixedSize(true);
        this.f8588s0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f8588s0.setItemAnimator(null);
        if (mo33049mg()) {
            i10Var = this;
        }
        this.f8589t0 = new C2516a(this, i10Var, this);
        if (mo33046tg()) {
            C11052v1.m1768b().m1769a(this.f8589t0);
        }
        if (mo33051lg()) {
            this.f8589t0.m34241F2(this);
        }
        View$OnClickListenerC3062so soVar = this.f8586q0;
        if (soVar != null) {
            View$OnClickListenerC3062so.C3077o Yl = soVar.m31709Yl(this);
            if (Yl != null) {
                this.f8588s0.m39437g(Yl);
            }
            this.f8586q0.m31578ni(this.f8588s0);
        }
        this.f8588s0.m39425k(new C2517b());
        mo33048ng(context, this.f8588s0, this.f8589t0);
        m34357ff();
        this.f8588s0.setAdapter(this.f8589t0);
        m34362cg();
        return this.f8588s0;
    }

    public boolean m34349of() {
        Map<String, TdApi.Message> map = this.f8582F0;
        return map != null && map.size() == 1 && this.f8582F0.values().iterator().next().canBeSaved && mo33045wg().getConstructor() == -1828724341;
    }

    public final void m34348og() {
        m34346pg();
    }

    @Override
    public final boolean onLongClick(View view) {
        Object tag;
        RecyclerView.AbstractC0886d0 l0 = this.f8588s0.m39421l0(view);
        if (l0 == null || !(l0 instanceof C2139ap) || (tag = view.getTag()) == null || !(tag instanceof C2964ra)) {
            return false;
        }
        C2964ra raVar = (C2964ra) tag;
        if (mo33505kg()) {
            return mo33504qg(view, raVar);
        }
        m34395Mg(raVar);
        return true;
    }

    @Override
    public void mo4040p1(long j, long j2, TdApi.UnreadReaction[] unreadReactionArr, int i) {
        C10722i1.m4160l(this, j, j2, unreadReactionArr, i);
    }

    public boolean m34347pf() {
        Map<String, TdApi.Message> map = this.f8582F0;
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (TdApi.Message message : this.f8582F0.values()) {
            if (!(message.canBeDeletedOnlyForSelf || message.canBeDeletedForAllUsers)) {
                return false;
            }
        }
        return true;
    }

    public final void m34346pg() {
        View$OnClickListenerC3062so soVar;
        if (this.f8588s0 != null && (soVar = this.f8586q0) != null) {
            soVar.m31753Tm(true);
            this.f8588s0.m39507A0();
            this.f8586q0.m31793Pi(this);
            this.f8586q0.m31753Tm(false);
        }
    }

    public final boolean m34345qf() {
        return m34384Rf() ? this.f8592w0 : this.f8591v0;
    }

    public boolean mo33504qg(View view, C2964ra raVar) {
        return false;
    }

    @Override
    public void mo4039r5(long j, long j2, int i, TdApi.ReplyMarkup replyMarkup) {
        C10722i1.m4169c(this, j, j2, i, replyMarkup);
    }

    public boolean mo33503rf() {
        return true;
    }

    public abstract T mo33047rg(TdApi.Object object);

    public boolean m34344sf() {
        Map<String, TdApi.Message> map = this.f8582F0;
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (TdApi.Message message : this.f8582F0.values()) {
            if (!message.canBeForwarded) {
                return false;
            }
        }
        return true;
    }

    public final void m34343sg(long j, long j2, final String str, final long j3, String str2, final int i) {
        TdApi.Function hf = mo34008hf(j, j2, str, j3, str2, i);
        if (hf != null) {
            this.f30170b.m2270r4().m14783o(hf, new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    i10.this.m34370Yf(str, j3, i, object);
                }
            });
        }
    }

    public void m34342tf() {
        if (m34350nf()) {
            C6038h hVar = new C6038h(this.f8582F0.size());
            for (TdApi.Message message : this.f8582F0.values()) {
                TdApi.File j1 = C4779t2.m25495j1(message);
                if (j1 != null) {
                    TdApi.LocalFile localFile = j1.local;
                    if (localFile.canBeDeleted && localFile.downloadedSize > 0) {
                        hVar.m21467j(j1.f25376id, j1);
                    }
                }
            }
            C4779t2.m25489k0(this, (TdApi.File[]) C5062b.m24167f(hVar, new TdApi.File[hVar.m21464n()]), new Runnable() {
                @Override
                public final void run() {
                    i10.this.m34382Sf();
                }
            });
        }
    }

    public boolean mo33046tg() {
        return false;
    }

    public void m34341uf() {
        Map<String, TdApi.Message> map = this.f8582F0;
        if (map != null && map.size() == 1) {
            for (TdApi.Message message : this.f8582F0.values()) {
                String o0 = C4779t2.m25461o0(C7321e.m16899w1(message.content));
                if (!C5070i.m24062i(o0)) {
                    C1379j0.m37328i(o0, R.string.CopiedLink);
                    m34407Eg(false);
                }
            }
        }
    }

    public final void m34370Yf(final String str, final long j, TdApi.Object object, int i) {
        final ArrayList<T> arrayList;
        ArrayList<T> arrayList2;
        T rg;
        T rg2;
        int i2 = 0;
        String str2 = null;
        switch (object.getConstructor()) {
            case TdApi.Error.CONSTRUCTOR:
                C1379j0.m37305t0(object);
                arrayList2 = new ArrayList<>(0);
                arrayList = arrayList2;
                break;
            case TdApi.FoundMessages.CONSTRUCTOR:
                TdApi.FoundMessages foundMessages = (TdApi.FoundMessages) object;
                arrayList2 = new ArrayList<>(foundMessages.messages.length);
                TdApi.Message[] messageArr = foundMessages.messages;
                int length = messageArr.length;
                while (i2 < length) {
                    TdApi.Message message = messageArr[i2];
                    if (!(message == null || (rg = mo33047rg(message)) == null)) {
                        arrayList2.add(rg);
                    }
                    i2++;
                }
                str2 = foundMessages.nextOffset;
                mo34353hg(arrayList2, true);
                arrayList = arrayList2;
                break;
            case TdApi.ChatMembers.CONSTRUCTOR:
                TdApi.ChatMembers chatMembers = (TdApi.ChatMembers) object;
                arrayList2 = new ArrayList<>(chatMembers.members.length);
                TdApi.ChatMember[] chatMemberArr = chatMembers.members;
                int length2 = chatMemberArr.length;
                while (i2 < length2) {
                    T rg3 = mo33047rg(chatMemberArr[i2]);
                    if (rg3 != null) {
                        arrayList2.add(rg3);
                    }
                    i2++;
                }
                mo34353hg(arrayList2, true);
                int length3 = chatMembers.members.length;
                arrayList = arrayList2;
                break;
            case TdApi.Messages.CONSTRUCTOR:
                TdApi.Messages messages = (TdApi.Messages) object;
                arrayList2 = new ArrayList<>(messages.messages.length);
                TdApi.Message[] messageArr2 = messages.messages;
                int length4 = messageArr2.length;
                while (i2 < length4) {
                    TdApi.Message message2 = messageArr2[i2];
                    if (!(message2 == null || (rg2 = mo33047rg(message2)) == null)) {
                        arrayList2.add(rg2);
                    }
                    i2++;
                }
                mo34353hg(arrayList2, true);
                arrayList = arrayList2;
                break;
            case TdApi.Users.CONSTRUCTOR:
                long[] jArr = ((TdApi.Users) object).userIds;
                ArrayList<TdApi.User> T2 = this.f30170b.m2480e2().m1686T2(jArr);
                ArrayList<T> arrayList3 = new ArrayList<>(T2.size());
                Iterator<TdApi.User> it = T2.iterator();
                while (it.hasNext()) {
                    T rg4 = mo33047rg(it.next());
                    if (rg4 != null) {
                        arrayList3.add(rg4);
                    }
                }
                mo34353hg(arrayList3, true);
                int length5 = jArr.length;
                arrayList = arrayList3;
                break;
            case TdApi.Chats.CONSTRUCTOR:
                List<TdApi.Chat> i4 = this.f30170b.m2414i4(((TdApi.Chats) object).chatIds);
                arrayList2 = new ArrayList<>(i4.size());
                for (TdApi.Chat chat : i4) {
                    T rg5 = mo33047rg(chat);
                    if (rg5 != null) {
                        arrayList2.add(rg5);
                    }
                }
                mo34353hg(arrayList2, true);
                arrayList = arrayList2;
                break;
            case TdApi.BasicGroupFullInfo.CONSTRUCTOR:
                TdApi.BasicGroupFullInfo basicGroupFullInfo = (TdApi.BasicGroupFullInfo) object;
                arrayList2 = new ArrayList<>(basicGroupFullInfo.members.length);
                TdApi.ChatMember[] chatMemberArr2 = basicGroupFullInfo.members;
                int length6 = chatMemberArr2.length;
                while (i2 < length6) {
                    T rg6 = mo33047rg(chatMemberArr2[i2]);
                    if (rg6 != null) {
                        arrayList2.add(rg6);
                    }
                    i2++;
                }
                mo34353hg(arrayList2, true);
                arrayList = arrayList2;
                break;
            default:
                Log.unexpectedTdlibResponse(object, TdApi.GetChats.class, TdApi.Chats.class);
                return;
        }
        final String str3 = str2;
        this.f30170b.m2469ed(new Runnable() {
            @Override
            public final void run() {
                i10.this.m34368Zf(arrayList, j, str, str3);
            }
        });
    }

    public void m34339vf() {
        if (m34347pf()) {
            this.f30170b.m2485dd();
            HandlerC10770jj.m3418w8(this, (TdApi.Message[]) this.f8582F0.values().toArray(new TdApi.Message[0]), new Runnable() {
                @Override
                public final void run() {
                    i10.this.m34380Tf();
                }
            });
        }
    }

    public Comparator<T> mo34338vg() {
        return null;
    }

    public final void m34337wf(long j, TdApi.MessageContent messageContent) {
        int Mf;
        if (this.f8577A0 != null && mo33061Lg() && (Mf = m34396Mf(j)) != -1) {
            this.f8577A0.get(Mf).getMessage().content = messageContent;
        }
    }

    public TdApi.SearchMessagesFilter mo33045wg() {
        throw new RuntimeException("Stub!");
    }

    public final void m34336xf(int i, int i2) {
        MediaRecyclerView mediaRecyclerView = this.f8588s0;
        if (mediaRecyclerView != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mediaRecyclerView.getLayoutManager();
            if (i < i2) {
                linearLayoutManager.m39525z2(0, -i);
                return;
            }
            int X1 = linearLayoutManager.m39552X1();
            if (X1 == 0 || X1 == -1) {
                View C = linearLayoutManager.mo39265C(0);
                if (C != null) {
                    int top = C.getTop();
                    View$OnClickListenerC3062so soVar = this.f8586q0;
                    if (soVar != null) {
                        top -= soVar.m31498wj();
                    }
                    if (top > 0) {
                        linearLayoutManager.m39525z2(0, -i2);
                        return;
                    }
                    return;
                }
                linearLayoutManager.m39525z2(0, -i2);
            }
        }
    }

    public abstract int mo33044xg();

    public final int m34335yf(long j) {
        ArrayList<T> arrayList = this.f8577A0;
        if (arrayList == null) {
            return -1;
        }
        int i = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        Iterator<T> it = this.f8577A0.iterator();
        while (it.hasNext()) {
            if (j > it.next().mo13512d()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void m34334yg(long j) {
        int Mf;
        if (this.f8577A0 != null && mo33061Lg() && (Mf = m34396Mf(j)) != -1) {
            if (m34384Rf()) {
                this.f8577A0.remove(Mf);
                return;
            }
            T t = this.f8577A0.get(Mf);
            int i = Mf + 1;
            T t2 = null;
            T t3 = i < this.f8577A0.size() ? this.f8577A0.get(i) : null;
            if (Mf > 0) {
                t2 = this.f8577A0.get(Mf - 1);
            }
            int g = t.mo13506g();
            int B0 = C4779t2.m25724B0(g);
            boolean z = (t2 == null || C4779t2.m25724B0(t2.mo13506g()) != B0 || C4779t2.m25463n5(B0, t2.mo13506g(), g)) && (t3 == null || C4779t2.m25724B0(t3.mo13506g()) != B0 || C4779t2.m25463n5(B0, g, t3.mo13506g()));
            int R0 = this.f8589t0.m34218R0(j);
            if (R0 != -1) {
                this.f8577A0.remove(Mf);
                List<C2964ra> F0 = this.f8589t0.m34243F0();
                if (this.f8577A0.isEmpty()) {
                    m34357ff();
                } else if (z) {
                    F0.remove(R0 + 1);
                    F0.remove(R0);
                    F0.remove(R0 - 1);
                    int i2 = R0 - 2;
                    F0.remove(i2);
                    this.f8589t0.m39310N(i2, 4);
                    this.f8589t0.m34133s3(R.id.search_counter);
                    m34346pg();
                } else {
                    F0.remove(R0);
                    this.f8589t0.m39309O(R0);
                    this.f8589t0.m34133s3(R.id.search_counter);
                    m34346pg();
                }
            }
        }
    }

    @Override
    public void mo4038z5(long j, long j2) {
        C10722i1.m4165g(this, j, j2);
    }

    public final long m34333zf(long j) {
        return mo34019Af(m34384Rf() ? this.f8578B0 : this.f8577A0, j);
    }

    public final void m34332zg(long[] jArr) {
        if (mo33061Lg()) {
            for (long j : jArr) {
                m34334yg(j);
            }
        }
    }
}
