package de;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import ce.a0;
import ce.j0;
import ce.v;
import ed.o;
import gd.w;
import hd.c3;
import hd.d7;
import hd.t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kb.j;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.d1;
import ud.v4;
import zd.o6;
import zd.t7;
import zd.w8;

public class qj extends vo<b> implements View.OnClickListener, Client.g, t7.i, t7.j, w8.f {
    public int D0 = 0;
    public iq E0;
    public c F0;
    public int G0;
    public List<d7> H0;
    public List<c3> I0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void Q2(ra raVar, int i10, o oVar, boolean z10) {
            int j10 = raVar.j();
            if (j10 == R.id.contact) {
                oVar.setContact((w8.i) raVar.d());
            } else if (j10 == R.id.user) {
                oVar.setUser((d7) raVar.d());
            }
        }

        @Override
        public void Y1(ra raVar, int i10, ne.o oVar) {
            oVar.setChat((c3) raVar.d());
        }
    }

    public static class b {
        public int f9166a;
        public c f9167b;

        public b(int i10) {
            this.f9166a = i10;
        }

        public b a(c cVar) {
            this.f9167b = cVar;
            return this;
        }
    }

    public interface c {
        boolean a(qj qjVar, c3 c3Var);
    }

    public qj(Context context, o6 o6Var) {
        super(context, o6Var);
        zg();
    }

    public static int Kg(List<ra> list, ra raVar, ArrayList<w8.i> arrayList) {
        int size = list.size();
        list.add(new ra(8, R.id.btn_contactsUnregistered, 0, R.string.InviteFriends));
        list.add(new ra(2));
        Iterator<w8.i> it = arrayList.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            w8.i next = it.next();
            if (z10) {
                z10 = false;
            } else {
                list.add(raVar);
            }
            list.add(new ra(27, R.id.contact).G(next));
        }
        list.add(new ra(3));
        return list.size() - size;
    }

    public void Mg(w8.i iVar, TdApi.Text text) {
        if (!Sa()) {
            v.M(iVar.f28632a.phoneNumber, text.text);
        }
    }

    public void Pg(TdApi.User user) {
        if (!t2.O2(user)) {
            Rg(user.f19979id);
        } else if (Lg(user.f19979id) != -1) {
            this.E0.l3(user.f19979id, false);
        } else {
            Gg(user);
        }
    }

    @Override
    public void A3(long j10, TdApi.UserStatus userStatus, boolean z10) {
        ra raVar;
        int Lg = Lg(j10);
        if (Lg != -1) {
            int l32 = this.E0.l3(j10, true);
            if (!z10 && this.H0.size() != 1) {
                boolean z11 = Lg == this.H0.size() - 1;
                d7 remove = this.H0.remove(Lg);
                int binarySearch = Collections.binarySearch(this.H0, remove, this.f24495b.Se());
                if (binarySearch >= 0) {
                    this.H0.add(Lg, remove);
                    return;
                }
                int i10 = (binarySearch * (-1)) - 1;
                if (i10 == Lg) {
                    this.H0.add(Lg, remove);
                    return;
                }
                ra remove2 = this.E0.D0().remove(l32);
                if (z11) {
                    int i11 = l32 - 1;
                    raVar = this.E0.D0().remove(i11);
                    this.E0.N(i11, 2);
                } else {
                    raVar = this.E0.D0().remove(l32);
                    this.E0.N(l32, 2);
                }
                Fg(i10, remove, remove2, raVar);
            }
        }
    }

    public final void Fg(int i10, d7 d7Var, ra raVar, ra raVar2) {
        this.H0.add(i10, d7Var);
        if (raVar == null) {
            raVar = new ra(27, R.id.user).N(d7Var.s()).G(d7Var);
        }
        boolean z10 = true;
        if (raVar2 == null) {
            raVar2 = new ra(1);
        }
        if (i10 != this.H0.size() - 1) {
            z10 = false;
        }
        int L0 = this.E0.L0(R.id.btn_contactsRegistered);
        if (L0 != -1) {
            int i11 = L0 + 2;
            if (z10) {
                int i12 = i11 + (i10 * 2);
                int i13 = i12 - 1;
                this.E0.D0().add(i13, raVar);
                this.E0.D0().add(i13, raVar2);
                this.E0.M(i12, 2);
                return;
            }
            int i14 = i11 + (i10 * 2);
            this.E0.D0().add(i14, raVar2);
            this.E0.D0().add(i14, raVar);
            this.E0.M(i14, 2);
            return;
        }
        throw new IllegalStateException();
    }

    public final void Gg(TdApi.User user) {
        if (this.H0 != null) {
            d7 d7Var = new d7(this.f24495b, user);
            if (this.H0.isEmpty()) {
                this.H0.add(d7Var);
                if (this.G0 > 0) {
                    List<ra> D0 = this.E0.D0();
                    ib.b.m(D0, D0.size() + 4);
                    D0.add(1, new ra(8, (int) R.id.btn_contactsRegistered, 0, (CharSequence) Qg(), false));
                    D0.add(2, new ra(2));
                    D0.add(3, new ra(27, R.id.user).N(d7Var.s()).G(d7Var));
                    D0.add(4, new ra(3));
                    this.E0.M(1, 4);
                    return;
                }
                Jg();
                return;
            }
            int binarySearch = Collections.binarySearch(this.H0, d7Var, this.f24495b.Se());
            if (binarySearch < 0) {
                Fg((binarySearch * (-1)) - 1, d7Var, null, null);
            }
        }
    }

    public final void Hg() {
        int i10 = this.D0;
        if (i10 == 0) {
            Jg();
        } else if (i10 == 1) {
            Ig();
        }
    }

    public final void Ig() {
        List<c3> list = this.I0;
        boolean z10 = true;
        if (list == null) {
            this.E0.t2(new ra[]{new ra(15)}, false);
        } else if (list.isEmpty()) {
            this.E0.t2(new ra[]{new ra(24, 0, 0, R.string.NoCommentChats)}, false);
            n9();
        } else {
            ArrayList arrayList = new ArrayList((this.I0.size() * 2) + 3);
            arrayList.add(new ra(14));
            arrayList.add(new ra(8, 0, 0, (CharSequence) w.o2(R.string.xChats, this.I0.size()), false));
            arrayList.add(new ra(2));
            for (c3 c3Var : this.I0) {
                if (z10) {
                    z10 = false;
                } else {
                    arrayList.add(new ra(11));
                }
                arrayList.add(ud.t2.Tf(R.id.chat, c3Var, false));
            }
            arrayList.add(new ra(3));
            this.E0.s2(arrayList, false);
            n9();
        }
    }

    @Override
    public void J(int i10, View view) {
        if (i10 != R.id.menu_btn_addContact) {
            super.J(i10, view);
            return;
        }
        fk fkVar = new fk(this.f24493a, this.f24495b);
        fkVar.vg(2);
        ac(fkVar);
    }

    public final void Jg() {
        this.G0 = 0;
        boolean z10 = true;
        if (this.H0 == null) {
            this.E0.t2(new ra[]{new ra(15)}, false);
            return;
        }
        ArrayList<w8.i> O = this.f24495b.E4().O();
        int size = O != null ? O.size() : 0;
        int size2 = this.H0.size();
        int i10 = size2 + size;
        if (i10 == 0) {
            this.E0.t2(new ra[]{new ra(24, 0, 0, R.string.NoContacts)}, false);
            n9();
            return;
        }
        ArrayList arrayList = new ArrayList((size2 == 0 || size == 0) ? (i10 * 2) + 3 : (size2 * 2) + 3 + (size * 2) + 2);
        arrayList.add(new ra(14));
        ra raVar = new ra(1);
        if (size2 > 0) {
            arrayList.add(new ra(8, (int) R.id.btn_contactsRegistered, 0, (CharSequence) Qg(), false));
            arrayList.add(new ra(2));
            for (d7 d7Var : this.H0) {
                if (z10) {
                    z10 = false;
                } else {
                    arrayList.add(raVar);
                }
                arrayList.add(new ra(27, R.id.user).N(d7Var.s()).G(d7Var));
            }
            arrayList.add(new ra(3));
        }
        if (size > 0) {
            this.G0 = size;
            Kg(arrayList, raVar, O);
        }
        this.E0.s2(arrayList, false);
        n9();
    }

    public final int Lg(long j10) {
        List<d7> list = this.H0;
        if (list == null) {
            return -1;
        }
        int i10 = 0;
        for (d7 d7Var : list) {
            if (d7Var.s() == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override
    public void M1(final TdApi.User user) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                qj.this.Pg(user);
            }
        });
    }

    @Override
    public void Nf(c3 c3Var) {
        if (this.D0 == 1) {
            c3Var.A();
        }
    }

    @Override
    public boolean Qf(View view, c3 c3Var) {
        if (this.D0 != 1) {
            return super.Qf(view, c3Var);
        }
        c cVar = this.F0;
        return cVar != null && cVar.a(this, c3Var);
    }

    public final String Qg() {
        return w.o2(R.string.xContacts, this.f24495b.E4().L());
    }

    @Override
    public int R9() {
        return R.id.controller_people;
    }

    public final void Rg(long j10) {
        int Lg = Lg(j10);
        if (Lg != -1) {
            Sg(Lg);
        }
    }

    public final void Sg(int i10) {
        this.H0.remove(i10);
        if (!this.H0.isEmpty()) {
            int L0 = this.E0.L0(R.id.btn_contactsRegistered);
            if (L0 != -1) {
                int i11 = L0 + 2;
                if (i10 == this.H0.size()) {
                    this.E0.R1((i11 + (i10 * 2)) - 1, 2);
                } else {
                    this.E0.R1(i11 + (i10 * 2), 2);
                }
            } else {
                throw new IllegalStateException();
            }
        } else if (this.G0 > 0) {
            this.E0.R1(1, 4);
        } else {
            Jg();
        }
    }

    public void Tg(b bVar) {
        super.Ad(bVar);
        this.D0 = bVar != null ? bVar.f9166a : 0;
        this.F0 = bVar != null ? bVar.f9167b : null;
    }

    public final void Og(List<c3> list) {
        this.I0 = list;
        Ig();
        ug();
        Bf();
    }

    public final void Ng(ArrayList<d7> arrayList) {
        this.H0 = arrayList;
        Jg();
        ug();
    }

    @Override
    public int W9() {
        return this.D0 != 1 ? R.id.menu_people : R.id.menu_search;
    }

    @Override
    public CharSequence X9() {
        if (this.D0 != 1) {
            return w.i1(R.string.Contacts);
        }
        return w.i1(R.string.LinkGroupTitle);
    }

    @Override
    public void Y5(long[] jArr, int i10, boolean z10) {
        int L0;
        iq iqVar = this.E0;
        if (iqVar != null && (L0 = iqVar.L0(R.id.btn_contactsRegistered)) != -1) {
            this.E0.D0().get(L0).X(Qg());
            this.E0.r3(L0);
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.e2().L1(this);
        this.f24495b.E4().i0(this);
    }

    @Override
    public boolean dc() {
        return true;
    }

    @Override
    public int ka() {
        return this.D0 != 1 ? R.string.SearchPeople : R.string.Search;
    }

    @Override
    public boolean mf(TdApi.Chat chat) {
        List<c3> list = this.I0;
        if (list == null) {
            return false;
        }
        for (c3 c3Var : list) {
            if (c3Var.e() == chat.f19908id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.chat) {
            c3 c3Var = (c3) ((ra) view.getTag()).d();
            c cVar = this.F0;
            if (cVar == null || !cVar.a(this, c3Var)) {
                this.f24495b.hd().h7(this, c3Var.e(), null);
            }
        } else if (id2 == R.id.contact) {
            final w8.i iVar = (w8.i) ((ra) view.getTag()).d();
            int i10 = iVar.f28633b;
            if (i10 == 1000) {
                v.M(iVar.f28632a.phoneNumber, w.j1(R.string.InviteTextCommonOverThousand, "https://telegram.org/dlx"));
            } else if (i10 > 1) {
                v.M(iVar.f28632a.phoneNumber, w.p2(R.string.InviteTextCommonMany, i10, "https://telegram.org/dlx"));
            } else {
                this.f24495b.e2().j0(new j() {
                    @Override
                    public final void a(Object obj) {
                        qj.this.Mg(iVar, (TdApi.Text) obj);
                    }
                });
            }
        } else if (id2 == R.id.user) {
            this.f24495b.hd().u7(this, ((d7) ((ra) view.getTag()).d()).s(), null);
        }
    }

    @Override
    public void r2(TdApi.Object object) {
        TdApi.User u22;
        d7 d7Var;
        int binarySearch;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == 171203420) {
            long[] jArr = ((TdApi.Users) object).userIds;
            ArrayList<TdApi.User> T2 = this.f24495b.e2().T2(jArr);
            final ArrayList arrayList = new ArrayList(jArr.length);
            long fa2 = this.f24495b.fa();
            Iterator<TdApi.User> it = T2.iterator();
            while (it.hasNext()) {
                TdApi.User next = it.next();
                if (!(next.f19979id == fa2 || (u22 = this.f24495b.e2().u2(next.f19979id)) == null || (binarySearch = Collections.binarySearch(arrayList, (d7Var = new d7(this.f24495b, u22)), this.f24495b.Se())) >= 0)) {
                    arrayList.add((binarySearch * (-1)) - 1, d7Var);
                }
            }
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    qj.this.Ng(arrayList);
                }
            });
        } else if (constructor == 1809654812) {
            List<TdApi.Chat> m42 = this.f24495b.m4(((TdApi.Chats) object).chatIds);
            final ArrayList arrayList2 = new ArrayList(m42.size());
            for (TdApi.Chat chat : m42) {
                arrayList2.add(new c3(this.f24495b, null, chat, false, null).A());
            }
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    qj.this.Og(arrayList2);
                }
            });
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        this.E0 = new a(this);
        Hg();
        customRecyclerView.setAdapter(this.E0);
        int i10 = this.D0;
        if (i10 == 0) {
            this.f24495b.e2().I(this);
            this.f24495b.ob(null, 10240, this);
            this.f24495b.E4().u(this);
        } else if (i10 == 1) {
            this.f24495b.v4().o(new TdApi.GetSuitableDiscussionChats(), this);
        }
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 != R.id.menu_people) {
            super.u1(i10, d1Var, linearLayout);
            return;
        }
        d1Var.K1(linearLayout, R.id.menu_btn_addContact, R.drawable.baseline_person_add_24, O9(), this, a0.i(49.0f));
        d1Var.g2(linearLayout, this);
    }

    @Override
    public boolean u3() {
        return true;
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
    }

    @Override
    public void v1(int i10, ArrayList<w8.i> arrayList, int i11) {
        iq iqVar = this.E0;
        if (iqVar != null) {
            int L0 = iqVar.L0(R.id.btn_contactsUnregistered);
            int i12 = 0;
            boolean z10 = L0 != -1;
            boolean z11 = i11 > 0;
            if (z10 != z11) {
                List<d7> list = this.H0;
                if (list == null || list.isEmpty()) {
                    Jg();
                } else if (z11) {
                    List<ra> D0 = this.E0.D0();
                    ib.b.m(D0, D0.size() + (i11 * 2) + 2);
                    this.E0.M(D0.size(), Kg(D0, new ra(1), arrayList));
                } else {
                    this.E0.R1(L0, (this.G0 * 2) + 2);
                }
            } else if (z11) {
                int i13 = L0 + 2;
                if (i11 == this.G0) {
                    Iterator<w8.i> it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.E0.D0().get(i13 + i12).G(it.next());
                        i12 += 2;
                    }
                    this.E0.L(i13, (i11 * 2) - 1);
                } else {
                    int i14 = 0;
                    while (i12 < Math.min(this.G0, i11)) {
                        this.E0.D0().get(i13 + i14).G(arrayList.get(i12));
                        i14 += 2;
                        i12++;
                    }
                    int i15 = i14 - 1;
                    this.E0.L(i13, i15);
                    int i16 = i13 + i15;
                    int i17 = this.G0;
                    if (i11 < i17) {
                        this.E0.R1(i16, ((i17 - i11) * 2) - 1);
                    } else {
                        ra raVar = new ra(1);
                        List<ra> D02 = this.E0.D0();
                        ib.b.m(D02, D02.size() + ((i11 - this.G0) * 2));
                        int i18 = i16;
                        for (int i19 = this.G0; i19 < i11; i19++) {
                            int i20 = i18 + 1;
                            D02.add(i18, raVar);
                            i18 = i20 + 1;
                            D02.add(i20, new ra(27, R.id.contact).G(arrayList.get(i19)));
                        }
                        this.E0.M(i16, (i11 - this.G0) * 2);
                    }
                }
            }
            this.G0 = i11;
        }
    }

    @Override
    public int wf() {
        return this.D0 != 1 ? 213 : 1541;
    }

    @Override
    public long y9(boolean z10) {
        return 200L;
    }
}
