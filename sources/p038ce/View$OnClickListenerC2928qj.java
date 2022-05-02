package p038ce;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import be.C1357a0;
import be.C1379j0;
import be.C1405v;
import gd.C4601c3;
import gd.C4618d7;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.C6981o;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p053dd.C4022o;
import p082fd.C4403w;
import p108hb.C5062b;
import p139jb.AbstractC5918j;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11134y8;
import td.AbstractC9299t2;
import td.AbstractC9323v4;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC2928qj extends AbstractC3204vo<C2930b> implements View.OnClickListener, Client.AbstractC7865g, C11059v7.AbstractC11068i, C11059v7.AbstractC11069j, C11134y8.AbstractC11141f {
    public int f9749D0 = 0;
    public C2546iq f9750E0;
    public AbstractC2931c f9751F0;
    public int f9752G0;
    public List<C4618d7> f9753H0;
    public List<C4601c3> f9754I0;

    public class C2929a extends C2546iq {
        public C2929a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo395U2(C2964ra raVar, int i, C4022o oVar, boolean z) {
            int j = raVar.m32835j();
            if (j == R.id.contact) {
                oVar.setContact((C11134y8.C11144i) raVar.m32844d());
            } else if (j == R.id.user) {
                oVar.setUser((C4618d7) raVar.m32844d());
            }
        }

        @Override
        public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
            oVar.setChat((C4601c3) raVar.m32844d());
        }
    }

    public static class C2930b {
        public int f9756a;
        public AbstractC2931c f9757b;

        public C2930b(int i) {
            this.f9756a = i;
        }

        public C2930b m33003a(AbstractC2931c cVar) {
            this.f9757b = cVar;
            return this;
        }
    }

    public interface AbstractC2931c {
        boolean mo33002a(View$OnClickListenerC2928qj qjVar, C4601c3 c3Var);
    }

    public View$OnClickListenerC2928qj(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        m31290zg();
    }

    public static int m33015Kg(List<C2964ra> list, C2964ra raVar, ArrayList<C11134y8.C11144i> arrayList) {
        int size = list.size();
        list.add(new C2964ra(8, R.id.btn_contactsUnregistered, 0, R.string.InviteFriends));
        list.add(new C2964ra(2));
        Iterator<C11134y8.C11144i> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C11134y8.C11144i next = it.next();
            if (z) {
                z = false;
            } else {
                list.add(raVar);
            }
            list.add(new C2964ra(27, R.id.contact).m32870G(next));
        }
        list.add(new C2964ra(3));
        return list.size() - size;
    }

    public void m33013Mg(C11134y8.C11144i iVar, TdApi.Text text) {
        if (!m9347Sa()) {
            C1405v.m37129N(iVar.f35747a.phoneNumber, text.text);
        }
    }

    public void m33010Pg(TdApi.User user) {
        if (!C4779t2.m25630O2(user)) {
            m33008Rg(user.f25439id);
        } else if (m33014Lg(user.f25439id) != -1) {
            this.f9750E0.m34143o3(user.f25439id, false);
        } else {
            m33019Gg(user);
        }
    }

    @Override
    public boolean mo1350D3() {
        return true;
    }

    public final void m33020Fg(int i, C4618d7 d7Var, C2964ra raVar, C2964ra raVar2) {
        this.f9753H0.add(i, d7Var);
        if (raVar == null) {
            raVar = new C2964ra(27, R.id.user).m32863N(d7Var.m26869s()).m32870G(d7Var);
        }
        boolean z = true;
        if (raVar2 == null) {
            raVar2 = new C2964ra(1);
        }
        if (i != this.f9753H0.size() - 1) {
            z = false;
        }
        int N0 = this.f9750E0.m34224N0(R.id.btn_contactsRegistered);
        if (N0 != -1) {
            int i2 = N0 + 2;
            if (z) {
                int i3 = i2 + (i * 2);
                int i4 = i3 - 1;
                this.f9750E0.m34240F0().add(i4, raVar);
                this.f9750E0.m34240F0().add(i4, raVar2);
                this.f9750E0.m39308M(i3, 2);
                return;
            }
            int i5 = i2 + (i * 2);
            this.f9750E0.m34240F0().add(i5, raVar2);
            this.f9750E0.m34240F0().add(i5, raVar);
            this.f9750E0.m39308M(i5, 2);
            return;
        }
        throw new IllegalStateException();
    }

    public final void m33019Gg(TdApi.User user) {
        if (this.f9753H0 != null) {
            C4618d7 d7Var = new C4618d7(this.f30167b, user);
            if (this.f9753H0.isEmpty()) {
                this.f9753H0.add(d7Var);
                if (this.f9752G0 > 0) {
                    List<C2964ra> F0 = this.f9750E0.m34240F0();
                    C5062b.m24159m(F0, F0.size() + 4);
                    F0.add(1, new C2964ra(8, (int) R.id.btn_contactsRegistered, 0, (CharSequence) m33009Qg(), false));
                    F0.add(2, new C2964ra(2));
                    F0.add(3, new C2964ra(27, R.id.user).m32863N(d7Var.m26869s()).m32870G(d7Var));
                    F0.add(4, new C2964ra(3));
                    this.f9750E0.m39308M(1, 4);
                    return;
                }
                m33016Jg();
                return;
            }
            int binarySearch = Collections.binarySearch(this.f9753H0, d7Var, this.f30167b.m2744Me());
            if (binarySearch < 0) {
                m33020Fg((binarySearch * (-1)) - 1, d7Var, null, null);
            }
        }
    }

    public final void m33018Hg() {
        int i = this.f9749D0;
        if (i == 0) {
            m33016Jg();
        } else if (i == 1) {
            m33017Ig();
        }
    }

    public final void m33017Ig() {
        List<C4601c3> list = this.f9754I0;
        boolean z = true;
        if (list == null) {
            this.f9750E0.m34113y2(new C2964ra[]{new C2964ra(15)}, false);
        } else if (list.isEmpty()) {
            this.f9750E0.m34113y2(new C2964ra[]{new C2964ra(24, 0, 0, R.string.NoCommentChats)}, false);
            m9204n9();
        } else {
            ArrayList arrayList = new ArrayList((this.f9754I0.size() * 2) + 3);
            arrayList.add(new C2964ra(14));
            arrayList.add(new C2964ra(8, 0, 0, (CharSequence) C4403w.m27844o2(R.string.xChats, this.f9754I0.size()), false));
            arrayList.add(new C2964ra(2));
            for (C4601c3 c3Var : this.f9754I0) {
                if (z) {
                    z = false;
                } else {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(AbstractC9299t2.m9569Tf(R.id.chat, c3Var, false));
            }
            arrayList.add(new C2964ra(3));
            this.f9750E0.m34116x2(arrayList, false);
            m9204n9();
        }
    }

    @Override
    public void mo419J(int i, View view) {
        if (i != R.id.menu_btn_addContact) {
            super.mo419J(i, view);
            return;
        }
        View$OnClickListenerC2393fk fkVar = new View$OnClickListenerC2393fk(this.f30165a, this.f30167b);
        fkVar.m34654vg(2);
        m9291ac(fkVar);
    }

    @Override
    public void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z) {
        C2964ra raVar;
        int Lg = m33014Lg(j);
        if (Lg != -1) {
            int o3 = this.f9750E0.m34143o3(j, true);
            if (!z && this.f9753H0.size() != 1) {
                boolean z2 = Lg == this.f9753H0.size() - 1;
                C4618d7 remove = this.f9753H0.remove(Lg);
                int binarySearch = Collections.binarySearch(this.f9753H0, remove, this.f30167b.m2744Me());
                if (binarySearch >= 0) {
                    this.f9753H0.add(Lg, remove);
                    return;
                }
                int i = (binarySearch * (-1)) - 1;
                if (i == Lg) {
                    this.f9753H0.add(Lg, remove);
                    return;
                }
                C2964ra remove2 = this.f9750E0.m34240F0().remove(o3);
                if (z2) {
                    int i2 = o3 - 1;
                    raVar = this.f9750E0.m34240F0().remove(i2);
                    this.f9750E0.m39307N(i2, 2);
                } else {
                    raVar = this.f9750E0.m34240F0().remove(o3);
                    this.f9750E0.m39307N(o3, 2);
                }
                m33020Fg(i, remove, remove2, raVar);
            }
        }
    }

    public final void m33016Jg() {
        this.f9752G0 = 0;
        boolean z = true;
        if (this.f9753H0 == null) {
            this.f9750E0.m34113y2(new C2964ra[]{new C2964ra(15)}, false);
            return;
        }
        ArrayList<C11134y8.C11144i> O = this.f30167b.m2946A4().m1423O();
        int size = O != null ? O.size() : 0;
        int size2 = this.f9753H0.size();
        int i = size2 + size;
        if (i == 0) {
            this.f9750E0.m34113y2(new C2964ra[]{new C2964ra(24, 0, 0, R.string.NoContacts)}, false);
            m9204n9();
            return;
        }
        ArrayList arrayList = new ArrayList((size2 == 0 || size == 0) ? (i * 2) + 3 : (size2 * 2) + 3 + (size * 2) + 2);
        arrayList.add(new C2964ra(14));
        C2964ra raVar = new C2964ra(1);
        if (size2 > 0) {
            arrayList.add(new C2964ra(8, (int) R.id.btn_contactsRegistered, 0, (CharSequence) m33009Qg(), false));
            arrayList.add(new C2964ra(2));
            for (C4618d7 d7Var : this.f9753H0) {
                if (z) {
                    z = false;
                } else {
                    arrayList.add(raVar);
                }
                arrayList.add(new C2964ra(27, R.id.user).m32863N(d7Var.m26869s()).m32870G(d7Var));
            }
            arrayList.add(new C2964ra(3));
        }
        if (size > 0) {
            this.f9752G0 = size;
            m33015Kg(arrayList, raVar, O);
        }
        this.f9750E0.m34116x2(arrayList, false);
        m9204n9();
    }

    public final int m33014Lg(long j) {
        List<C4618d7> list = this.f9753H0;
        if (list == null) {
            return -1;
        }
        int i = 0;
        for (C4618d7 d7Var : list) {
            if (d7Var.m26869s() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public void mo9580Nf(C4601c3 c3Var) {
        if (this.f9749D0 == 1) {
            c3Var.m27064A();
        }
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2928qj.this.m33010Pg(user);
            }
        });
    }

    @Override
    public boolean mo9575Qf(View view, C4601c3 c3Var) {
        if (this.f9749D0 != 1) {
            return super.mo9575Qf(view, c3Var);
        }
        AbstractC2931c cVar = this.f9751F0;
        return cVar != null && cVar.mo33002a(this, c3Var);
    }

    public final String m33009Qg() {
        return C4403w.m27844o2(R.string.xContacts, this.f30167b.m2946A4().m1426L());
    }

    @Override
    public int mo407R9() {
        return R.id.controller_people;
    }

    public final void m33008Rg(long j) {
        int Lg = m33014Lg(j);
        if (Lg != -1) {
            m33007Sg(Lg);
        }
    }

    public final void m33007Sg(int i) {
        this.f9753H0.remove(i);
        if (!this.f9753H0.isEmpty()) {
            int N0 = this.f9750E0.m34224N0(R.id.btn_contactsRegistered);
            if (N0 != -1) {
                int i2 = N0 + 2;
                if (i == this.f9753H0.size()) {
                    this.f9750E0.m34204V1((i2 + (i * 2)) - 1, 2);
                } else {
                    this.f9750E0.m34204V1(i2 + (i * 2), 2);
                }
            } else {
                throw new IllegalStateException();
            }
        } else if (this.f9752G0 > 0) {
            this.f9750E0.m34204V1(1, 4);
        } else {
            m33016Jg();
        }
    }

    public void m33006Tg(C2930b bVar) {
        super.m9476Ad(bVar);
        this.f9749D0 = bVar != null ? bVar.f9756a : 0;
        this.f9751F0 = bVar != null ? bVar.f9757b : null;
    }

    public final void m33011Og(List<C4601c3> list) {
        this.f9754I0 = list;
        m33017Ig();
        m31295ug();
        m9592Bf();
    }

    public final void m33012Ng(ArrayList<C4618d7> arrayList) {
        this.f9753H0 = arrayList;
        m33016Jg();
        m31295ug();
    }

    @Override
    public int mo418W9() {
        return this.f9749D0 != 1 ? R.id.menu_people : R.id.menu_search;
    }

    @Override
    public CharSequence mo9313X9() {
        if (this.f9749D0 != 1) {
            return C4403w.m27869i1(R.string.Contacts);
        }
        return C4403w.m27869i1(R.string.LinkGroupTitle);
    }

    @Override
    public void mo1359Z5(long[] jArr, int i, boolean z) {
        int N0;
        C2546iq iqVar = this.f9750E0;
        if (iqVar != null && (N0 = iqVar.m34224N0(R.id.btn_contactsRegistered)) != -1) {
            this.f9750E0.m34240F0().get(N0).m32853X(m33009Qg());
            this.f9750E0.m34124u3(N0);
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30167b.m2480e2().m1710N1(this);
        this.f30167b.m2946A4().m1394i0(this);
    }

    @Override
    public boolean mo9270dc() {
        return true;
    }

    @Override
    public int mo9224ka() {
        return this.f9749D0 != 1 ? R.string.SearchPeople : R.string.Search;
    }

    @Override
    public boolean mo9546mf(TdApi.Chat chat) {
        List<C4601c3> list = this.f9754I0;
        if (list == null) {
            return false;
        }
        for (C4601c3 c3Var : list) {
            if (c3Var.m27047e() == chat.f25367id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.chat) {
            C4601c3 c3Var = (C4601c3) ((C2964ra) view.getTag()).m32844d();
            AbstractC2931c cVar = this.f9751F0;
            if (cVar == null || !cVar.mo33002a(this, c3Var)) {
                this.f30167b.m2485dd().m3569h7(this, c3Var.m27047e(), null);
            }
        } else if (id2 == R.id.contact) {
            final C11134y8.C11144i iVar = (C11134y8.C11144i) ((C2964ra) view.getTag()).m32844d();
            int i = iVar.f35748b;
            if (i == 1000) {
                C1405v.m37129N(iVar.f35747a.phoneNumber, C4403w.m27865j1(R.string.InviteTextCommonOverThousand, "https://telegram.org/dlx"));
            } else if (i > 1) {
                C1405v.m37129N(iVar.f35747a.phoneNumber, C4403w.m27840p2(R.string.InviteTextCommonMany, i, "https://telegram.org/dlx"));
            } else {
                this.f30167b.m2480e2().m1632j0(new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnClickListenerC2928qj.this.m33013Mg(iVar, (TdApi.Text) obj);
                    }
                });
            }
        } else if (id2 == R.id.user) {
            this.f30167b.m2485dd().m3439u7(this, ((C4618d7) ((C2964ra) view.getTag()).m32844d()).m26869s(), null);
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i != R.id.menu_people) {
            super.mo414p0(i, d1Var, linearLayout);
            return;
        }
        d1Var.m10104N1(linearLayout, R.id.menu_btn_addContact, R.drawable.baseline_person_add_24, mo9375O9(), this, C1357a0.m37541i(49.0f));
        d1Var.m10054i2(linearLayout, this);
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f9750E0 = new C2929a(this);
        m33018Hg();
        customRecyclerView.setAdapter(this.f9750E0);
        int i = this.f9749D0;
        if (i == 0) {
            this.f30167b.m2480e2().m1732I(this);
            this.f30167b.m2375kb(null, 10240, this);
            this.f30167b.m2946A4().m1371u(this);
        } else if (i == 1) {
            this.f30167b.m2270r4().m14783o(new TdApi.GetSuitableDiscussionChats(), this);
        }
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        TdApi.User v2;
        C4618d7 d7Var;
        int binarySearch;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == 171203420) {
            long[] jArr = ((TdApi.Users) object).userIds;
            ArrayList<TdApi.User> T2 = this.f30167b.m2480e2().m1686T2(jArr);
            final ArrayList arrayList = new ArrayList(jArr.length);
            long ba2 = this.f30167b.m2519ba();
            Iterator<TdApi.User> it = T2.iterator();
            while (it.hasNext()) {
                TdApi.User next = it.next();
                if (!(next.f25439id == ba2 || (v2 = this.f30167b.m2480e2().m1583v2(next.f25439id)) == null || (binarySearch = Collections.binarySearch(arrayList, (d7Var = new C4618d7(this.f30167b, v2)), this.f30167b.m2744Me())) >= 0)) {
                    arrayList.add((binarySearch * (-1)) - 1, d7Var);
                }
            }
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2928qj.this.m33012Ng(arrayList);
                }
            });
        } else if (constructor == 1809654812) {
            List<TdApi.Chat> i4 = this.f30167b.m2414i4(((TdApi.Chats) object).chatIds);
            final ArrayList arrayList2 = new ArrayList(i4.size());
            for (TdApi.Chat chat : i4) {
                arrayList2.add(new C4601c3(this.f30167b, null, chat, false, null).m27064A());
            }
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2928qj.this.m33011Og(arrayList2);
                }
            });
        }
    }

    @Override
    public void mo1358u1(int i, ArrayList<C11134y8.C11144i> arrayList, int i2) {
        C2546iq iqVar = this.f9750E0;
        if (iqVar != null) {
            int N0 = iqVar.m34224N0(R.id.btn_contactsUnregistered);
            int i3 = 0;
            boolean z = N0 != -1;
            boolean z2 = i2 > 0;
            if (z != z2) {
                List<C4618d7> list = this.f9753H0;
                if (list == null || list.isEmpty()) {
                    m33016Jg();
                } else if (z2) {
                    List<C2964ra> F0 = this.f9750E0.m34240F0();
                    C5062b.m24159m(F0, F0.size() + (i2 * 2) + 2);
                    this.f9750E0.m39308M(F0.size(), m33015Kg(F0, new C2964ra(1), arrayList));
                } else {
                    this.f9750E0.m34204V1(N0, (this.f9752G0 * 2) + 2);
                }
            } else if (z2) {
                int i4 = N0 + 2;
                if (i2 == this.f9752G0) {
                    Iterator<C11134y8.C11144i> it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.f9750E0.m34240F0().get(i4 + i3).m32870G(it.next());
                        i3 += 2;
                    }
                    this.f9750E0.m39309L(i4, (i2 * 2) - 1);
                } else {
                    int i5 = 0;
                    while (i3 < Math.min(this.f9752G0, i2)) {
                        this.f9750E0.m34240F0().get(i4 + i5).m32870G(arrayList.get(i3));
                        i5 += 2;
                        i3++;
                    }
                    int i6 = i5 - 1;
                    this.f9750E0.m39309L(i4, i6);
                    int i7 = i4 + i6;
                    int i8 = this.f9752G0;
                    if (i2 < i8) {
                        this.f9750E0.m34204V1(i7, ((i8 - i2) * 2) - 1);
                    } else {
                        C2964ra raVar = new C2964ra(1);
                        List<C2964ra> F02 = this.f9750E0.m34240F0();
                        C5062b.m24159m(F02, F02.size() + ((i2 - this.f9752G0) * 2));
                        int i9 = i7;
                        for (int i10 = this.f9752G0; i10 < i2; i10++) {
                            int i11 = i9 + 1;
                            F02.add(i9, raVar);
                            i9 = i11 + 1;
                            F02.add(i11, new C2964ra(27, R.id.contact).m32870G(arrayList.get(i10)));
                        }
                        this.f9750E0.m39308M(i7, (i2 - this.f9752G0) * 2);
                    }
                }
            }
            this.f9752G0 = i2;
        }
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
    }

    @Override
    public int mo9536wf() {
        return this.f9749D0 != 1 ? 213 : 1541;
    }

    @Override
    public long mo9125y9(boolean z) {
        return 200L;
    }
}
