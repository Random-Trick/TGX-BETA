package de;

import ae.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import ce.p0;
import de.so;
import de.y00;
import eb.k;
import hd.o;
import hd.t2;
import ib.i;
import ie.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k0.h;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.l3;
import ne.t1;
import ne.w;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.MediaRecyclerView;
import ud.v4;
import zd.d9;
import zd.g1;
import zd.h1;
import zd.hj;
import zd.o6;

public abstract class j10<T extends f0> extends v4<d> implements View.OnClickListener, View.OnLongClickListener, k.b, h1 {
    public ArrayList<T> A0;
    public ArrayList<T> B0;
    public String C0;
    public ArrayList<ra> D0 = new ArrayList<>();
    public boolean E0;
    public Map<String, TdApi.Message> F0;
    public long f8361n0;
    public long f8362o0;
    public boolean f8363p0;
    public so f8364q0;
    public rh f8365r0;
    public MediaRecyclerView f8366s0;
    public iq f8367t0;
    public boolean f8368u0;
    public boolean f8369v0;
    public boolean f8370w0;
    public String f8371x0;
    public kb.b f8372y0;
    public ie.k f8373z0;

    public class a extends iq {
        public a(d9 d9Var, View.OnClickListener onClickListener, v4 v4Var) {
            super(d9Var, onClickListener, v4Var);
        }

        @Override
        public void o1(ra raVar, l3 l3Var, w wVar, boolean z10) {
            j10.this.gg(raVar, l3Var, wVar, z10);
        }

        @Override
        public void o2(ra raVar, int i10, t1 t1Var) {
            if (j10.this.f8368u0 || j10.this.qf()) {
                t1Var.C1();
                return;
            }
            j10 j10Var = j10.this;
            t1Var.B1(j10Var.mo1if(j10Var.Rf() ? j10.this.B0 : j10.this.A0));
        }
    }

    public class b extends RecyclerView.t {
        public b() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            View C;
            j10.this.eg();
            List<ra> D0 = j10.this.f8367t0.D0();
            if (D0.size() == 1 && D0.get(0).A() == 44 && (C = recyclerView.getLayoutManager().C(0)) != null) {
                C.invalidate();
            }
        }
    }

    public class c extends kb.b {
        public final String M;
        public final long N;
        public final int O;

        public c(String str, long j10, int i10) {
            this.M = str;
            this.N = j10;
            this.O = i10;
        }

        @Override
        public void b() {
            j10 j10Var = j10.this;
            j10Var.sg(j10Var.f8361n0, j10Var.f8362o0, this.M, this.N, j10Var.C0, this.O);
        }
    }

    public static class d {
        public long f8376a;
        public long f8377b;

        public d(long j10, long j11) {
            this.f8376a = j10;
            this.f8377b = j11;
        }
    }

    public j10(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static long If(ArrayList<? extends f0> arrayList, long j10) {
        return (arrayList == null || arrayList.isEmpty()) ? j10 : arrayList.get(arrayList.size() - 1).d();
    }

    public static j10<?> Ng(Context context, o6 o6Var, TdApi.SearchMessagesFilter searchMessagesFilter) {
        switch (searchMessagesFilter.getConstructor()) {
            case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                return new p10(context, o6Var).Vg(searchMessagesFilter);
            case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                return new r10(context, o6Var).Ug(searchMessagesFilter);
            default:
                throw new IllegalArgumentException("unsupported filter: " + searchMessagesFilter);
        }
    }

    public static boolean Pf(j10<?> j10Var) {
        return (j10Var instanceof p10) || (j10Var instanceof r10);
    }

    public void Sf() {
        Eg(false);
    }

    public void Tf() {
        Eg(false);
    }

    public void Uf(long j10, long j11, TdApi.MessageContent messageContent) {
        if (!Sa() && this.f8361n0 == j10) {
            wf(j11, messageContent);
        }
    }

    public void Vf(TdApi.Message message) {
        if (!Sa()) {
            ef(message);
        }
    }

    public void Wf(long j10, long[] jArr) {
        if (!Sa() && this.f8361n0 == j10) {
            zg(jArr);
        }
    }

    public void Xf(TdApi.Message message) {
        if (!Sa()) {
            ef(message);
        }
    }

    public void Zf(ArrayList arrayList, long j10, String str, String str2) {
        if (!Sa()) {
            boolean z10 = false;
            hg(arrayList, false);
            if (zf(0L) == j10 && i.c(str, this.f8371x0)) {
                if (j10 == 0) {
                    z10 = true;
                }
                cf(arrayList, str2, z10);
            } else if (i.i(str) && Rf()) {
                ArrayList<T> arrayList2 = this.A0;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    this.A0 = arrayList;
                } else {
                    this.A0.addAll(arrayList);
                }
                if (!arrayList.isEmpty() && Jg(!i.i(str))) {
                    z10 = true;
                }
                this.f8369v0 = z10;
            }
        }
    }

    public static int ag(TdApi.Message message, TdApi.Message message2) {
        return Long.compare(message.f19946id, message2.f19946id);
    }

    public void bg() {
        so soVar = this.f8364q0;
        if (soVar != null) {
            soVar.cj();
        }
    }

    public static <T extends f0> boolean df(List<ra> list, int i10, ArrayList<T> arrayList, int i11, List<ra> list2, iq iqVar, j10<?> j10Var, int i12) {
        boolean z10;
        ArrayList<T> arrayList2 = arrayList;
        if (arrayList.isEmpty()) {
            return false;
        }
        boolean z11 = (i12 & 1) != 0;
        boolean z12 = (i12 & 2) != 0;
        int size = list2.size();
        list.clear();
        ib.b.m(list, arrayList.size());
        int i13 = -1;
        int f10 = i11 == 0 ? -1 : arrayList2.get(i11 - 1).f();
        int B0 = i11 == 0 ? -1 : t2.B0(f10);
        boolean z13 = arrayList2.get(0) instanceof o;
        int size2 = arrayList.size();
        int i14 = i11;
        while (i14 < size2) {
            T t10 = arrayList2.get(i14);
            if (z11) {
                int f11 = t10.f();
                int B02 = t2.B0(f11);
                if (B02 != B0 || f10 == i13 || t2.n5(B02, f10, f11)) {
                    if (!(i14 == i11 && i11 == 0)) {
                        list.add(new ra(3));
                    }
                    list.add(new ra((i11 != 0 || !z12) ? 8 : 70, 0, 0, (CharSequence) gd.w.Y0(f11, TimeUnit.SECONDS, true), false));
                    list.add(new ra(2));
                    f10 = f11;
                    B0 = B02;
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z13) {
                    ((o) t10).Q(z10);
                }
            } else if (i11 == 0 && i14 == 0) {
                String Ef = j10Var.Ef();
                if (!i.i(Ef)) {
                    list.add(new ra(8, 0, 0, (CharSequence) Ef, false));
                }
                list.add(new ra(2, R.id.shadowTop));
            } else {
                list.add(new ra(1));
            }
            list.add(new ra(i10).G(t10).N(t10.d()));
            i14++;
            arrayList2 = arrayList;
            i13 = -1;
        }
        if (i11 == 0) {
            list.add(new ra(3));
            list.add(new ra(42, R.id.search_counter).M(-1));
            list2.addAll(list);
            if (iqVar != null) {
                iqVar.M(size, list.size());
                j10Var.pg();
            }
        } else {
            int i15 = size - 2;
            list2.addAll(i15, list);
            if (iqVar != null) {
                iqVar.M(i15, list.size());
                j10Var.pg();
            }
        }
        return !list.isEmpty();
    }

    public void eg() {
        int a22;
        int i10;
        if (qf() && (a22 = ((LinearLayoutManager) this.f8366s0.getLayoutManager()).a2()) != -1 && a22 + 6 >= this.f8367t0.D0().size()) {
            long zf = zf(-1L);
            if (zf != -1) {
                int i11 = 40;
                int Hf = Hf();
                if (Hf > 1 && (i10 = 40 % Hf) != 0) {
                    i11 = 40 + ((Hf - i10) - 1);
                }
                dg(this.f8371x0, zf, i11);
            }
        }
    }

    public long Af(ArrayList<T> arrayList, long j10) {
        return If(arrayList, j10);
    }

    public void Ag(String str) {
        if (!i.c(this.f8371x0, str)) {
            Eg(false);
            dg(str, 0L, jf());
        }
    }

    public final String Bf() {
        return this.f8371x0;
    }

    public void Bg(d dVar) {
        super.Ad(dVar);
        this.f8361n0 = dVar.f8376a;
        this.f8362o0 = dVar.f8377b;
    }

    @Override
    public long C9() {
        return this.f8361n0;
    }

    public String Cf() {
        return null;
    }

    public final void Cg(boolean z10, boolean z11) {
        if (qf() != z10) {
            if (Rf()) {
                this.f8370w0 = z10;
            } else {
                this.f8369v0 = z10;
            }
            if (z11) {
                iq iqVar = this.f8367t0;
                iqVar.I(iqVar.D0().size() - 1);
            }
        }
    }

    @Override
    public void D5(long j10, long j11) {
        g1.e(this, j10, j11);
    }

    public int Df() {
        TdApi.SearchMessagesFilter wg = wg();
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

    public final void Dg(ArrayList<T> arrayList, String str) {
        if (Rf()) {
            this.B0 = arrayList;
            this.C0 = str;
            return;
        }
        this.A0 = arrayList;
    }

    public String Ef() {
        throw new RuntimeException("Stub!");
    }

    public boolean Eg(boolean z10) {
        if (this.E0 == z10) {
            return false;
        }
        this.E0 = z10;
        so soVar = this.f8364q0;
        if (soVar != null) {
            soVar.Vm(z10, Kf());
        } else {
            rh rhVar = this.f8365r0;
            if (rhVar != null) {
                if (z10) {
                    rhVar.Zc(1);
                } else {
                    rhVar.Y8();
                }
            }
        }
        Map<String, TdApi.Message> map = this.F0;
        if (map != null && map.size() > 0 && !z10) {
            this.f8367t0.v0();
            this.F0.clear();
        }
        this.f8367t0.n2(z10, jg(), this);
        return true;
    }

    public int Ff() {
        int L0 = this.f8367t0.L0(R.id.shadowTop);
        if (L0 != -1) {
            return L0 + 1;
        }
        return 0;
    }

    public void Fg(rh rhVar) {
        this.f8365r0 = rhVar;
        this.f24495b.O9().g0(this.f8361n0, this);
    }

    public int Gf() {
        return a0.i(72.0f);
    }

    public void Gg(so soVar) {
        this.f8364q0 = soVar;
    }

    @Override
    public final void H(final long j10, final long[] jArr) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                j10.this.Wf(j10, jArr);
            }
        });
    }

    public int Hf() {
        return 0;
    }

    public void Hg() {
        this.f8363p0 = true;
    }

    public void Ig() {
        Map<String, TdApi.Message> map;
        if (this.f24495b.W2(this.f8361n0) != null && (map = this.F0) != null && map.size() > 0) {
            y00 y00Var = new y00(this.f24493a, this.f24495b);
            TdApi.Message[] messageArr = (TdApi.Message[]) this.F0.values().toArray(new TdApi.Message[0]);
            Arrays.sort(messageArr, h10.f8161a);
            y00Var.Vi(new y00.m(messageArr).z(new Runnable() {
                @Override
                public final void run() {
                    j10.this.bg();
                }
            }).A(true));
            y00Var.ej();
        }
    }

    @Override
    public void J3(long j10, long j11) {
        g1.i(this, j10, j11);
    }

    @Override
    public void Ja(int i10, int i11) {
        super.Ja(i10, i11);
        iq iqVar = this.f8367t0;
        if (iqVar != null) {
            iqVar.Q5(i10, i11);
        }
    }

    public RecyclerView Jf() {
        return this.f8366s0;
    }

    public boolean Jg(boolean z10) {
        return true;
    }

    public final int Kf() {
        if (S0() == 0) {
            return R.string.SelectedSuffix;
        }
        SparseIntArray F = t2.F(this.F0);
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

    public boolean Kg() {
        return true;
    }

    public ob.d Lf() {
        Map<String, TdApi.Message> map = this.F0;
        if (map == null || map.size() != 1) {
            return null;
        }
        Iterator<TdApi.Message> it = this.F0.values().iterator();
        if (!it.hasNext()) {
            return null;
        }
        TdApi.Message next = it.next();
        return new ob.d(next.chatId, next.f19946id);
    }

    public abstract boolean Lg();

    public final int Mf(long j10) {
        if (this.A0 == null || !Lg()) {
            return -1;
        }
        int i10 = 0;
        Iterator<T> it = this.A0.iterator();
        while (it.hasNext()) {
            if (it.next().d() == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void Mg(ra raVar) {
        boolean z10;
        long m10 = raVar.m();
        f0 f0Var = (f0) raVar.d();
        if (f0Var != null && m10 != 0) {
            if (raVar.A() == 40 || raVar.A() == 41) {
                TdApi.Message message = f0Var.getMessage();
                String str = message.chatId + "_" + message.f19946id;
                Map<String, TdApi.Message> map = this.F0;
                if (map == null) {
                    this.F0 = new HashMap();
                    z10 = false;
                } else {
                    z10 = map.containsKey(str);
                }
                if (z10) {
                    this.F0.remove(str);
                } else {
                    this.F0.put(str, f0Var.getMessage());
                }
                if (!Eg(this.F0.size() > 0)) {
                    so soVar = this.f8364q0;
                    if (soVar != null) {
                        soVar.an(S0(), Kf());
                        this.f8364q0.qn(of(), pf(), sf(), nf(), this.F0.size() == 1);
                    } else {
                        rh rhVar = this.f8365r0;
                        if (rhVar != null) {
                            rhVar.Kd(this.F0.size());
                            this.f8365r0.Er();
                        }
                    }
                } else if (this.E0) {
                    so soVar2 = this.f8364q0;
                    if (soVar2 != null) {
                        soVar2.qn(of(), pf(), sf(), nf(), this.F0.size() == 1);
                    } else {
                        rh rhVar2 = this.f8365r0;
                        if (rhVar2 != null) {
                            rhVar2.Er();
                        }
                    }
                }
                raVar.S(!z10);
                int P0 = this.f8367t0.P0(m10);
                if (P0 != -1) {
                    this.f8367t0.q2(P0, !z10, -1);
                }
            }
        }
    }

    public boolean Nf() {
        return false;
    }

    public boolean Of() {
        return this.E0;
    }

    public void Og() {
        ob.d Lf = Lf();
        if (Lf != null) {
            this.f24495b.hd().h7(this, C9(), new hj.j().m().e(Lf).c());
        }
    }

    public boolean Qf() {
        return this.f8363p0;
    }

    @Override
    public int R9() {
        return R.id.controller_media__new;
    }

    public final boolean Rf() {
        String str = this.f8371x0;
        return str != null && !str.isEmpty();
    }

    public final int S0() {
        Map<String, TdApi.Message> map = this.F0;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    @Override
    public void S1(long j10, long j11, boolean z10) {
        g1.h(this, j10, j11, z10);
    }

    @Override
    public void T0(long j10, long j11, TdApi.MessageInteractionInfo messageInteractionInfo) {
        g1.d(this, j10, j11, messageInteractionInfo);
    }

    @Override
    public boolean V0() {
        so soVar = this.f8364q0;
        return soVar != null && soVar.V0();
    }

    @Override
    public void W(long j10, long j11) {
        g1.f(this, j10, j11);
    }

    @Override
    public final void X1(final TdApi.Message message, long j10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                j10.this.Vf(message);
            }
        });
    }

    @Override
    public abstract CharSequence X9();

    @Override
    public void Z8() {
        super.Z8();
        if (this.f8365r0 != null) {
            this.f24495b.O9().t0(this.f8361n0, this);
        }
        zd.t1.b().d(this.f8367t0);
        p0.n(this.f8366s0);
    }

    @Override
    public void b6(long j10, long j11, TdApi.Sticker sticker) {
        g1.a(this, j10, j11, sticker);
    }

    public final void cf(ArrayList<T> arrayList, String str, boolean z10) {
        ArrayList<T> arrayList2 = Rf() ? this.B0 : this.A0;
        this.f8368u0 = false;
        boolean z11 = true;
        if (arrayList2 == null || arrayList2.isEmpty() || z10) {
            if (arrayList.isEmpty() || !Jg(Rf())) {
                z11 = false;
            }
            Cg(z11, false);
            if (arrayList2 == null || !arrayList2.isEmpty() || !arrayList.isEmpty()) {
                Dg(arrayList, str);
                ff();
            }
        } else if (!arrayList.isEmpty()) {
            Cg(Jg(Rf()), false);
            Comparator<T> vg = vg();
            if (vg != null) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    T next = it.next();
                    int binarySearch = Collections.binarySearch(arrayList2, next, vg);
                    if (binarySearch < 0) {
                        int i10 = (binarySearch * (-1)) - 1;
                        arrayList2.add(i10, next);
                        ra raVar = new ra(1);
                        ra N = new ra(xg()).G(next).N(next.d());
                        if (i10 == 0) {
                            this.f8367t0.D0().add(2, raVar);
                            this.f8367t0.D0().add(2, N);
                            this.f8367t0.M(2, 2);
                        } else {
                            int i11 = ((i10 * 2) + 2) - 1;
                            this.f8367t0.D0().add(i11, N);
                            this.f8367t0.D0().add(i11, raVar);
                            this.f8367t0.M(i11, 2);
                        }
                    }
                }
            } else {
                int size = arrayList2.size();
                arrayList2.addAll(arrayList);
                df(this.D0, xg(), arrayList2, size, this.f8367t0.D0(), this.f8367t0, this, gf());
            }
            if (!qf()) {
                iq iqVar = this.f8367t0;
                iqVar.I(iqVar.D0().size());
            }
        } else {
            Cg(false, true);
        }
    }

    public final void cg() {
        dg(null, 0L, jf());
    }

    public final void dg(String str, long j10, int i10) {
        if (!this.f8368u0 || !i.c(str, this.f8371x0)) {
            this.f8368u0 = true;
            boolean c10 = true ^ i.c(str, this.f8371x0);
            this.f8371x0 = str;
            kb.b bVar = this.f8372y0;
            if (bVar != null) {
                bVar.c();
                this.f8372y0 = null;
            }
            ie.k kVar = this.f8373z0;
            if (kVar != null) {
                kVar.a();
                this.f8373z0 = null;
            }
            if (c10) {
                this.B0 = null;
                lf();
                ff();
                this.f8366s0.A0();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f8366s0.getLayoutManager();
                so soVar = this.f8364q0;
                linearLayoutManager.z2(0, soVar != null ? -soVar.Ul() : 0);
            }
            String str2 = this.f8371x0;
            if (str2 == null || str2.isEmpty()) {
                if (!c10) {
                    sg(this.f8361n0, this.f8362o0, str, j10, this.C0, i10);
                    if (j10 == 0) {
                        this.f8373z0 = null;
                        return;
                    }
                    return;
                }
                this.f8368u0 = false;
            } else if (j10 == 0) {
                c cVar = new c(str, j10, i10);
                this.f8372y0 = cVar;
                cVar.e(j0.o());
                j0.e0(this.f8372y0, 300L);
            } else {
                sg(this.f8361n0, this.f8362o0, str, j10, this.C0, i10);
            }
        }
    }

    public void ef(TdApi.Message message) {
        TdApi.SearchMessagesFilter wg;
        T rg;
        int yf;
        int P0;
        if (so.nj(message) && this.f8361n0 == message.chatId && Lg() && (wg = wg()) != null && e.k1(message, wg) && this.A0 != null && Mf(message.f19946id) == -1 && (rg = rg(message)) != null && (yf = yf(message.f19946id)) != -1) {
            if (Rf()) {
                this.A0.add(yf, rg);
                return;
            }
            T t10 = null;
            T t11 = yf < this.A0.size() ? this.A0.get(yf) : null;
            if (yf > 0) {
                t10 = this.A0.get(yf - 1);
            }
            int f10 = rg.f();
            int B0 = t2.B0(f10);
            boolean z10 = (t10 == null || t2.B0(t10.f()) != B0 || t2.n5(B0, t10.f(), f10)) && (t11 == null || t2.B0(t11.f()) != B0 || t2.n5(B0, f10, t11.f()));
            if (this.A0.isEmpty()) {
                this.A0.add(yf, rg);
                ff();
                return;
            }
            List<ra> D0 = this.f8367t0.D0();
            ra N = new ra(xg()).G(rg).N(rg.d());
            if (t10 != null) {
                int P02 = this.f8367t0.P0(t10.d());
                if (P02 != -1) {
                    this.A0.add(yf, rg);
                    if (z10) {
                        int i10 = P02 + 1;
                        D0.add(i10, new ra(3));
                        D0.add(i10, N);
                        D0.add(i10, new ra(2));
                        D0.add(i10, new ra(8, 0, 0, (CharSequence) gd.w.Y0(f10, TimeUnit.SECONDS, true), false));
                        this.f8367t0.M(i10, 4);
                    } else {
                        int i11 = P02 + 1;
                        D0.add(i11, N);
                        this.f8367t0.J(i11);
                    }
                    pg();
                }
            } else if (t11 != null && (P0 = this.f8367t0.P0(t11.d())) != -1) {
                if (z10) {
                    int i12 = (P0 - 1) - 1;
                    if (i12 >= 0) {
                        this.A0.add(yf, rg);
                        D0.add(i12, new ra(3));
                        D0.add(i12, N);
                        D0.add(i12, new ra(2));
                        D0.add(i12, new ra(8, 0, 0, (CharSequence) gd.w.Y0(f10, TimeUnit.SECONDS, true), false));
                        this.f8367t0.M(i12, 4);
                    } else {
                        return;
                    }
                } else {
                    this.A0.add(yf, rg);
                    D0.add(P0, N);
                    this.f8367t0.J(P0);
                }
                pg();
            }
        }
    }

    public final void ff() {
        ArrayList arrayList = new ArrayList();
        ArrayList<T> arrayList2 = Rf() ? this.B0 : this.A0;
        if (Nf() || (arrayList2 != null && arrayList2.isEmpty())) {
            if (this.f8367t0.D0().size() != 1 || this.f8367t0.D0().get(0).A() != 44) {
                this.f8366s0.setOverScrollMode(2);
                arrayList.add(new ra(44).M(Df()).b0(Cf()).E(this.f24495b.O6(this.f8361n0)));
            } else {
                return;
            }
        } else if (arrayList2 == null) {
            this.f8366s0.setOverScrollMode(2);
            if (this.f8367t0.D0().size() != 1 || this.f8367t0.D0().get(0).A() != 43) {
                arrayList.add(new ra(43));
            } else {
                return;
            }
        } else {
            df(this.D0, xg(), arrayList2, 0, arrayList, null, this, gf());
        }
        this.f8367t0.S1(arrayList);
        pg();
    }

    public final int fg(int i10) {
        if (i10 == 43 || i10 == 44) {
            return this.f8366s0.getMeasuredHeight();
        }
        return ap.W(i10);
    }

    @Override
    public void g5(TdApi.Message message, long j10, int i10, String str) {
        g1.j(this, message, j10, i10, str);
    }

    public final int gf() {
        boolean ig = ig();
        return this.f8365r0 != null ? (ig ? 1 : 0) | 2 : ig ? 1 : 0;
    }

    public void gg(ra raVar, l3 l3Var, w wVar, boolean z10) {
    }

    public TdApi.Function hf(long j10, long j11, String str, long j12, String str2, int i10) {
        if (i.i(str) || !ob.a.j(j10)) {
            return new TdApi.SearchChatMessages(j10, str, null, j12, 0, i10, wg(), j11);
        }
        return new TdApi.SearchSecretMessages(j10, str, str2, i10, wg());
    }

    public void hg(ArrayList<T> arrayList, boolean z10) {
    }

    public abstract CharSequence mo1if(ArrayList<T> arrayList);

    public boolean ig() {
        return true;
    }

    @Override
    public final void j0(final long j10, final long j11, final TdApi.MessageContent messageContent) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                j10.this.Uf(j10, j11, messageContent);
            }
        });
    }

    public int jf() {
        return a0.b(Gf(), 10);
    }

    public boolean jg() {
        return false;
    }

    @Override
    public void k1(long j10, long j11, TdApi.UnreadReaction[] unreadReactionArr, int i10) {
        g1.l(this, j10, j11, unreadReactionArr, i10);
    }

    public final int kf() {
        return mf(this.f8367t0.D0().size());
    }

    public boolean kg() {
        return false;
    }

    @Override
    public void l5(long j10, long j11, int i10, TdApi.ReplyMarkup replyMarkup) {
        g1.c(this, j10, j11, i10, replyMarkup);
    }

    public final int lf() {
        int X1;
        MediaRecyclerView mediaRecyclerView = this.f8366s0;
        if (mediaRecyclerView == null || (X1 = ((LinearLayoutManager) mediaRecyclerView.getLayoutManager()).X1()) == -1) {
            return 0;
        }
        int mf = mf(X1);
        View C = this.f8366s0.getLayoutManager().C(X1);
        return C != null ? mf - C.getTop() : mf;
    }

    public boolean lg() {
        return true;
    }

    public int mf(int i10) {
        int o10;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = 0;
        for (ra raVar : this.f8367t0.D0()) {
            int A = raVar.A();
            if (A == 41) {
                o oVar = (o) raVar.d();
                int measuredWidth = this.f8366s0.getMeasuredWidth();
                if (measuredWidth != 0) {
                    oVar.J(measuredWidth);
                }
                o10 = oVar.o();
            } else if (A == 43 || A == 44) {
                o10 = fg(raVar.A());
            } else {
                o10 = ap.W(raVar.A());
            }
            i11 += o10;
            i12++;
            if (i12 == i10) {
                break;
            }
        }
        return i11;
    }

    public boolean mg() {
        return true;
    }

    @Override
    public final void n4(int i10, float f10, float f11, k kVar) {
        so soVar = this.f8364q0;
        if (soVar != null) {
            soVar.Zm(f10);
        }
    }

    public boolean nf() {
        if (this.F0 == null || !Kg() || this.F0.isEmpty()) {
            return false;
        }
        for (TdApi.Message message : this.F0.values()) {
            TdApi.File j12 = t2.j1(message);
            if (j12 != null) {
                TdApi.LocalFile localFile = j12.local;
                if (localFile.canBeDeleted) {
                    if (localFile.downloadedSize == 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void ng(Context context, MediaRecyclerView mediaRecyclerView, iq iqVar) {
        mediaRecyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    @Override
    public final void o4(int i10, float f10, k kVar) {
    }

    @Override
    @SuppressLint({"InflateParams"})
    public final View oc(Context context) {
        j10<T> j10Var = null;
        MediaRecyclerView mediaRecyclerView = (MediaRecyclerView) p0.v(t(), R.layout.recycler_sharedmedia, null);
        this.f8366s0 = mediaRecyclerView;
        mediaRecyclerView.setOverScrollMode(2);
        t8(this.f8366s0);
        if (this.f8365r0 != null) {
            this.f8366s0.setBackgroundColor(j.b());
            o8(this.f8366s0, R.id.theme_color_background);
        }
        this.f8366s0.setHasFixedSize(true);
        this.f8366s0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f8366s0.setItemAnimator(null);
        if (mg()) {
            j10Var = this;
        }
        this.f8367t0 = new a(this, j10Var, this);
        if (tg()) {
            zd.t1.b().a(this.f8367t0);
        }
        if (lg()) {
            this.f8367t0.B2(this);
        }
        so soVar = this.f8364q0;
        if (soVar != null) {
            so.o Yl = soVar.Yl(this);
            if (Yl != null) {
                this.f8366s0.g(Yl);
            }
            this.f8364q0.ni(this.f8366s0);
        }
        this.f8366s0.k(new b());
        ng(context, this.f8366s0, this.f8367t0);
        ff();
        this.f8366s0.setAdapter(this.f8367t0);
        cg();
        return this.f8366s0;
    }

    public boolean of() {
        Map<String, TdApi.Message> map = this.F0;
        return map != null && map.size() == 1 && this.F0.values().iterator().next().canBeSaved && wg().getConstructor() == -1828724341;
    }

    public final void og() {
        pg();
    }

    @Override
    public final boolean onLongClick(View view) {
        Object tag;
        RecyclerView.c0 l02 = this.f8366s0.l0(view);
        if (l02 == null || !(l02 instanceof ap) || (tag = view.getTag()) == null || !(tag instanceof ra)) {
            return false;
        }
        ra raVar = (ra) tag;
        if (kg()) {
            return qg(view, raVar);
        }
        Mg(raVar);
        return true;
    }

    public boolean pf() {
        Map<String, TdApi.Message> map = this.F0;
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (TdApi.Message message : this.F0.values()) {
            if (!(message.canBeDeletedOnlyForSelf || message.canBeDeletedForAllUsers)) {
                return false;
            }
        }
        return true;
    }

    public final void pg() {
        so soVar;
        if (this.f8366s0 != null && (soVar = this.f8364q0) != null) {
            soVar.Tm(true);
            this.f8366s0.A0();
            this.f8364q0.Pi(this);
            this.f8364q0.Tm(false);
        }
    }

    public final boolean qf() {
        return Rf() ? this.f8370w0 : this.f8369v0;
    }

    public boolean qg(View view, ra raVar) {
        return false;
    }

    public boolean rf() {
        return true;
    }

    public abstract T rg(TdApi.Object object);

    @Override
    public void s5(long j10, long j11) {
        g1.g(this, j10, j11);
    }

    public boolean sf() {
        Map<String, TdApi.Message> map = this.F0;
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (TdApi.Message message : this.F0.values()) {
            if (!message.canBeForwarded) {
                return false;
            }
        }
        return true;
    }

    public final void sg(long j10, long j11, final String str, final long j12, String str2, final int i10) {
        TdApi.Function hf = hf(j10, j11, str, j12, str2, i10);
        if (hf != null) {
            this.f24495b.v4().o(hf, new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    j10.this.Yf(str, j12, i10, object);
                }
            });
        }
    }

    public void tf() {
        if (nf()) {
            h hVar = new h(this.F0.size());
            for (TdApi.Message message : this.F0.values()) {
                TdApi.File j12 = t2.j1(message);
                if (j12 != null) {
                    TdApi.LocalFile localFile = j12.local;
                    if (localFile.canBeDeleted && localFile.downloadedSize > 0) {
                        hVar.j(j12.f19913id, j12);
                    }
                }
            }
            t2.k0(this, (TdApi.File[]) ib.b.f(hVar, new TdApi.File[hVar.n()]), new Runnable() {
                @Override
                public final void run() {
                    j10.this.Sf();
                }
            });
        }
    }

    public boolean tg() {
        return false;
    }

    public void uf() {
        Map<String, TdApi.Message> map = this.F0;
        if (map != null && map.size() == 1) {
            for (TdApi.Message message : this.F0.values()) {
                String o02 = t2.o0(e.y1(message.content));
                if (!i.i(o02)) {
                    j0.i(o02, R.string.CopiedLink);
                    Eg(false);
                }
            }
        }
    }

    public final void Yf(final String str, final long j10, TdApi.Object object, int i10) {
        final ArrayList<T> arrayList;
        ArrayList<T> arrayList2;
        T rg;
        T rg2;
        int i11 = 0;
        String str2 = null;
        switch (object.getConstructor()) {
            case TdApi.Error.CONSTRUCTOR:
                j0.t0(object);
                arrayList2 = new ArrayList<>(0);
                arrayList = arrayList2;
                break;
            case TdApi.FoundMessages.CONSTRUCTOR:
                TdApi.FoundMessages foundMessages = (TdApi.FoundMessages) object;
                arrayList2 = new ArrayList<>(foundMessages.messages.length);
                TdApi.Message[] messageArr = foundMessages.messages;
                int length = messageArr.length;
                while (i11 < length) {
                    TdApi.Message message = messageArr[i11];
                    if (!(message == null || (rg = rg(message)) == null)) {
                        arrayList2.add(rg);
                    }
                    i11++;
                }
                str2 = foundMessages.nextOffset;
                hg(arrayList2, true);
                arrayList = arrayList2;
                break;
            case TdApi.ChatMembers.CONSTRUCTOR:
                TdApi.ChatMembers chatMembers = (TdApi.ChatMembers) object;
                arrayList2 = new ArrayList<>(chatMembers.members.length);
                TdApi.ChatMember[] chatMemberArr = chatMembers.members;
                int length2 = chatMemberArr.length;
                while (i11 < length2) {
                    T rg3 = rg(chatMemberArr[i11]);
                    if (rg3 != null) {
                        arrayList2.add(rg3);
                    }
                    i11++;
                }
                hg(arrayList2, true);
                int length3 = chatMembers.members.length;
                arrayList = arrayList2;
                break;
            case TdApi.Messages.CONSTRUCTOR:
                TdApi.Messages messages = (TdApi.Messages) object;
                arrayList2 = new ArrayList<>(messages.messages.length);
                TdApi.Message[] messageArr2 = messages.messages;
                int length4 = messageArr2.length;
                while (i11 < length4) {
                    TdApi.Message message2 = messageArr2[i11];
                    if (!(message2 == null || (rg2 = rg(message2)) == null)) {
                        arrayList2.add(rg2);
                    }
                    i11++;
                }
                hg(arrayList2, true);
                arrayList = arrayList2;
                break;
            case TdApi.Users.CONSTRUCTOR:
                long[] jArr = ((TdApi.Users) object).userIds;
                ArrayList<TdApi.User> T2 = this.f24495b.e2().T2(jArr);
                ArrayList<T> arrayList3 = new ArrayList<>(T2.size());
                Iterator<TdApi.User> it = T2.iterator();
                while (it.hasNext()) {
                    T rg4 = rg(it.next());
                    if (rg4 != null) {
                        arrayList3.add(rg4);
                    }
                }
                hg(arrayList3, true);
                int length5 = jArr.length;
                arrayList = arrayList3;
                break;
            case TdApi.Chats.CONSTRUCTOR:
                List<TdApi.Chat> m42 = this.f24495b.m4(((TdApi.Chats) object).chatIds);
                arrayList2 = new ArrayList<>(m42.size());
                for (TdApi.Chat chat : m42) {
                    T rg5 = rg(chat);
                    if (rg5 != null) {
                        arrayList2.add(rg5);
                    }
                }
                hg(arrayList2, true);
                arrayList = arrayList2;
                break;
            case TdApi.BasicGroupFullInfo.CONSTRUCTOR:
                TdApi.BasicGroupFullInfo basicGroupFullInfo = (TdApi.BasicGroupFullInfo) object;
                arrayList2 = new ArrayList<>(basicGroupFullInfo.members.length);
                TdApi.ChatMember[] chatMemberArr2 = basicGroupFullInfo.members;
                int length6 = chatMemberArr2.length;
                while (i11 < length6) {
                    T rg6 = rg(chatMemberArr2[i11]);
                    if (rg6 != null) {
                        arrayList2.add(rg6);
                    }
                    i11++;
                }
                hg(arrayList2, true);
                arrayList = arrayList2;
                break;
            default:
                Log.unexpectedTdlibResponse(object, TdApi.GetChats.class, TdApi.Chats.class);
                return;
        }
        final String str3 = str2;
        this.f24495b.id(new Runnable() {
            @Override
            public final void run() {
                j10.this.Zf(arrayList, j10, str, str3);
            }
        });
    }

    public void vf() {
        if (pf()) {
            this.f24495b.hd();
            hj.w8(this, (TdApi.Message[]) this.F0.values().toArray(new TdApi.Message[0]), new Runnable() {
                @Override
                public final void run() {
                    j10.this.Tf();
                }
            });
        }
    }

    public Comparator<T> vg() {
        return null;
    }

    public final void wf(long j10, TdApi.MessageContent messageContent) {
        int Mf;
        if (this.A0 != null && Lg() && (Mf = Mf(j10)) != -1) {
            this.A0.get(Mf).getMessage().content = messageContent;
        }
    }

    public TdApi.SearchMessagesFilter wg() {
        throw new RuntimeException("Stub!");
    }

    public final void xf(int i10, int i11) {
        MediaRecyclerView mediaRecyclerView = this.f8366s0;
        if (mediaRecyclerView != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mediaRecyclerView.getLayoutManager();
            if (i10 < i11) {
                linearLayoutManager.z2(0, -i10);
                return;
            }
            int X1 = linearLayoutManager.X1();
            if (X1 == 0 || X1 == -1) {
                View C = linearLayoutManager.C(0);
                if (C != null) {
                    int top = C.getTop();
                    so soVar = this.f8364q0;
                    if (soVar != null) {
                        top -= soVar.wj();
                    }
                    if (top > 0) {
                        linearLayoutManager.z2(0, -i11);
                        return;
                    }
                    return;
                }
                linearLayoutManager.z2(0, -i11);
            }
        }
    }

    public abstract int xg();

    @Override
    public final void y2(final TdApi.Message message) {
        if (so.nj(message)) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    j10.this.Xf(message);
                }
            });
        }
    }

    public final int yf(long j10) {
        ArrayList<T> arrayList = this.A0;
        if (arrayList == null) {
            return -1;
        }
        int i10 = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        Iterator<T> it = this.A0.iterator();
        while (it.hasNext()) {
            if (j10 > it.next().d()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void yg(long j10) {
        int Mf;
        if (this.A0 != null && Lg() && (Mf = Mf(j10)) != -1) {
            if (Rf()) {
                this.A0.remove(Mf);
                return;
            }
            T t10 = this.A0.get(Mf);
            int i10 = Mf + 1;
            T t11 = null;
            T t12 = i10 < this.A0.size() ? this.A0.get(i10) : null;
            if (Mf > 0) {
                t11 = this.A0.get(Mf - 1);
            }
            int f10 = t10.f();
            int B0 = t2.B0(f10);
            boolean z10 = (t11 == null || t2.B0(t11.f()) != B0 || t2.n5(B0, t11.f(), f10)) && (t12 == null || t2.B0(t12.f()) != B0 || t2.n5(B0, f10, t12.f()));
            int P0 = this.f8367t0.P0(j10);
            if (P0 != -1) {
                this.A0.remove(Mf);
                List<ra> D0 = this.f8367t0.D0();
                if (this.A0.isEmpty()) {
                    ff();
                } else if (z10) {
                    D0.remove(P0 + 1);
                    D0.remove(P0);
                    D0.remove(P0 - 1);
                    int i11 = P0 - 2;
                    D0.remove(i11);
                    this.f8367t0.N(i11, 4);
                    this.f8367t0.p3(R.id.search_counter);
                    pg();
                } else {
                    D0.remove(P0);
                    this.f8367t0.O(P0);
                    this.f8367t0.p3(R.id.search_counter);
                    pg();
                }
            }
        }
    }

    public final long zf(long j10) {
        return Af(Rf() ? this.B0 : this.A0, j10);
    }

    public final void zg(long[] jArr) {
        if (Lg()) {
            for (long j10 : jArr) {
                yg(j10);
            }
        }
    }
}
