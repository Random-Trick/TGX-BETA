package zd;

import ae.j;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import ce.c0;
import ce.j0;
import ce.v;
import gd.l;
import gd.w;
import hd.t2;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.vkryl.leveldb.LevelDB;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;

public class w8 implements j0 {
    public int M;
    public long N;
    public long O;
    public List<Reference<Object>> P;
    public final o6 Q;
    public int S;
    public long[] T;
    public ArrayList<i> U;
    public lb.d<h> V;
    public kb.b W;
    public AlertDialog X;
    public Runnable Y;
    public Integer f28618a;
    public Integer f28619b;
    public Long f28620c;
    public final List<Reference<f>> R = new ArrayList();
    public final e Z = new e(this);

    public class a implements Client.g {

        public class C0263a implements Client.g {
            public C0263a() {
            }

            @Override
            public void r2(TdApi.Object object) {
                int constructor = object.getConstructor();
                if (constructor == -1679978726) {
                    j0.t0(object);
                } else if (constructor == -722616727) {
                    w8.this.Q.ob(null, 1000, this);
                } else if (constructor == 171203420) {
                    long[] jArr = ((TdApi.Users) object).userIds;
                    if (jArr.length > 0) {
                        w8.this.Q.v4().o(new TdApi.RemoveContacts(jArr), this);
                    }
                }
            }
        }

        public a() {
        }

        @Override
        public void r2(TdApi.Object object) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                j0.t0(object);
            } else if (constructor == -722616727) {
                w8.this.Q.v4().o(new TdApi.ChangeImportedContacts(new TdApi.Contact[0]), this);
            } else if (constructor == 2068432290) {
                w8.this.Q.ob(null, 1000, new C0263a());
            }
        }
    }

    public class b extends kb.b {
        public b() {
        }

        @Override
        public void b() {
        }
    }

    public class c extends kb.b {
        public final boolean M;

        public c(boolean z10) {
            this.M = z10;
        }

        @Override
        public void b() {
            w8.this.R(this, this.M);
        }
    }

    public static class d {
        public final long f28623a;
        public final String f28624b;
        public final ArrayList<String> f28625c = new ArrayList<>();
        public final ArrayList<String> f28626d = new ArrayList<>();
        public ArrayList<g> f28627e;

        public d(long j10, String str) {
            this.f28623a = j10;
            this.f28624b = str;
        }

        public static String c(String str, List<String> list) {
            if (!list.isEmpty()) {
                if (list.indexOf(str) != -1) {
                    return null;
                }
                String D = c0.D(str);
                if (!ib.i.c(D, str) && list.indexOf(D) != -1) {
                    return null;
                }
            }
            return str;
        }

        public void a(g gVar) {
            if (gVar.c() > 0) {
                ArrayList<g> arrayList = this.f28627e;
                if (arrayList == null) {
                    ArrayList<g> arrayList2 = new ArrayList<>();
                    this.f28627e = arrayList2;
                    arrayList2.add(gVar);
                    return;
                }
                boolean z10 = true;
                Iterator<g> it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().a(gVar)) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    this.f28627e.add(gVar);
                }
            }
        }

        public void b(java.util.ArrayList<org.drinkless.td.libcore.telegram.TdApi.Contact> r18) {
            throw new UnsupportedOperationException("Method not decompiled: zd.w8.d.b(java.util.ArrayList):void");
        }

        public String d() {
            return c(this.f28624b, this.f28625c);
        }

        public String toString() {
            return "ContactData{contactId=" + this.f28623a + ", displayName='" + this.f28624b + "', phoneNumbers=" + this.f28625c + ", nameVariations=" + this.f28627e + '}';
        }
    }

    public static class e extends Handler {
        public final w8 f28628a;

        public e(w8 w8Var) {
            super(Looper.getMainLooper());
            this.f28628a = w8Var;
        }

        @Override
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                boolean z10 = true;
                if (i10 == 1) {
                    this.f28628a.r0((ArrayList) message.obj);
                } else if (i10 == 2) {
                    w8 w8Var = this.f28628a;
                    long[] jArr = (long[]) message.obj;
                    int i11 = message.arg1;
                    if (message.arg2 != 1) {
                        z10 = false;
                    }
                    w8Var.n0(jArr, i11, z10);
                }
            } else {
                this.f28628a.M = message.arg1;
            }
        }
    }

    public interface f {
        void Y5(long[] jArr, int i10, boolean z10);

        void v1(int i10, ArrayList<i> arrayList, int i11);
    }

    public static class g implements Comparable<g> {
        public final long M;
        public final String f28629a;
        public final String f28630b;
        public final String f28631c;

        public g(ArrayList<String> arrayList, String str, String str2, String str3, long j10) {
            this.f28629a = d.c(str, arrayList);
            this.f28630b = d.c(str2, arrayList);
            this.f28631c = d.c(str3, arrayList);
            this.M = j10;
        }

        public boolean a(g gVar) {
            return ib.i.c(d(), gVar.d());
        }

        public int compareTo(g gVar) {
            return Integer.compare(gVar.c(), c());
        }

        public int c() {
            int i10 = !ib.i.i(this.f28629a) ? 1 : 0;
            if (!ib.i.i(this.f28630b)) {
                i10++;
            }
            return !ib.i.i(this.f28631c) ? i10 + 1 : i10;
        }

        public String d() {
            StringBuilder sb2;
            if (!ib.i.i(this.f28629a)) {
                sb2 = new StringBuilder(this.f28629a);
                sb2.append(' ');
            } else {
                sb2 = null;
            }
            if (!ib.i.i(this.f28630b)) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(this.f28630b);
                } else {
                    sb2.append(this.f28630b);
                }
                sb2.append(' ');
            }
            if (!ib.i.i(this.f28631c)) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(this.f28631c);
                } else {
                    sb2.append(this.f28631c);
                }
                sb2.append(' ');
            }
            if (sb2 != null) {
                return sb2.toString();
            }
            return null;
        }
    }

    public interface h {
        void j(o6 o6Var, boolean z10);
    }

    public static class i {
        public final TdApi.Contact f28632a;
        public final int f28633b;
        public final String f28634c;
        public final je.e f28635d;

        public i(TdApi.Contact contact, String str, int i10) {
            this.f28632a = contact;
            this.f28634c = str;
            this.f28633b = i10 <= 1 ? 0 : i10;
            this.f28635d = t2.C1(contact.firstName, contact.lastName);
        }

        public String a() {
            TdApi.Contact contact = this.f28632a;
            return t2.q2(contact.firstName, contact.lastName);
        }

        public String b() {
            int i10 = this.f28633b;
            if (i10 <= 1) {
                return this.f28634c;
            }
            if (i10 == 1000) {
                return w.i1(R.string.ManyContactsJoined);
            }
            return w.o2(R.string.xContactsJoined, i10);
        }
    }

    public w8(o6 o6Var) {
        this.Q = o6Var;
        o6Var.O9().l(this);
    }

    public static String A(String str) {
        if (ib.i.i(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            int type = Character.getType(codePointAt);
            int charCount = Character.charCount(codePointAt);
            boolean z10 = type != 12;
            if (z10 && charCount == 1) {
                if (!(codePointAt == 45 || codePointAt == 40 || codePointAt == 41)) {
                    if ((codePointAt >= 97 && codePointAt <= 122) || (codePointAt >= 65 && codePointAt <= 90)) {
                        sb2.append(c0.e0((char) codePointAt));
                    }
                }
                z10 = false;
            }
            if (z10) {
                sb2.append((CharSequence) str, i10, i10 + charCount);
            }
            i10 += charCount;
        }
        return sb2.toString();
    }

    public static String G(String str) {
        if (ib.i.i(str)) {
            return str;
        }
        int length = str.length();
        boolean z10 = true;
        if (length <= 1) {
            return str;
        }
        if (str.charAt(0) != '+') {
            return c0.d0(str);
        }
        int i10 = 1;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            int charCount = Character.charCount(codePointAt);
            if (charCount != 1 || !ib.i.l((char) codePointAt)) {
                z10 = false;
                break;
            }
            i10 += charCount;
        }
        return z10 ? c0.w(str) : str;
    }

    public static int J(long[] jArr, int i10) {
        if (jArr != null) {
            return jArr.length < 5 ? jArr.length : i10;
        }
        return 0;
    }

    public static void U(Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.w((int) Log.TAG_CONTACT, "Failed to reset contacts: %s", t2.z5(object));
        }
        v0.D2(runnable);
    }

    public void V(TdApi.Contact[] contactArr, kb.b bVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e((int) Log.TAG_CONTACT, "changeImportedContacts: %s", t2.z5(object));
        } else if (constructor == 2068432290) {
            TdApi.ImportedContacts importedContacts = (TdApi.ImportedContacts) object;
            ArrayList<i> arrayList = null;
            int i10 = 0;
            for (long j10 : importedContacts.userIds) {
                if (j10 == 0) {
                    TdApi.Contact contact = contactArr[i10];
                    int i11 = importedContacts.importerCount[i10];
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(new i(contact, G(contact.phoneNumber), i11));
                }
                i10++;
            }
            if (bVar.d()) {
                if (arrayList != null) {
                    arrayList.trimToSize();
                    Collections.sort(arrayList, q8.f28269a);
                    q0(arrayList);
                } else {
                    q0(null);
                }
                z();
            }
        }
        o0(2);
    }

    public static int W(i iVar, i iVar2) {
        int compare = Integer.compare(iVar2.f28633b, iVar.f28633b);
        if (compare != 0) {
            return compare;
        }
        TdApi.Contact contact = iVar.f28632a;
        String lowerCase = t2.q2(contact.firstName, contact.lastName).toLowerCase();
        TdApi.Contact contact2 = iVar2.f28632a;
        int compareTo = lowerCase.compareTo(t2.q2(contact2.firstName, contact2.lastName).toLowerCase());
        return compareTo != 0 ? compareTo : iVar.f28632a.phoneNumber.compareTo(iVar2.f28632a.phoneNumber);
    }

    public void X(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e((int) Log.TAG_CONTACT, "Received error: %s", t2.z5(object));
        } else if (constructor == 171203420) {
            TdApi.Users users = (TdApi.Users) object;
            int i10 = users.totalCount;
            long[] jArr = users.userIds;
            if (jArr.length > 0) {
                ArrayList<TdApi.User> T2 = this.Q.e2().T2(jArr);
                Collections.sort(T2, this.Q.Re());
                int min = Math.min(5, T2.size());
                long[] jArr2 = new long[min];
                boolean P = P();
                for (int i11 = 0; i11 < min; i11++) {
                    TdApi.User user = T2.get(i11);
                    jArr2[i11] = user.f19979id;
                    if (user.profilePhoto != null && P) {
                        this.Q.v4().o(new TdApi.DownloadFile(user.profilePhoto.small.f19913id, 1, 0, 0, false), this.Q.yc());
                    }
                }
                jArr = jArr2;
            }
            m0(jArr, i10, false);
        }
    }

    public void Z(Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.e((int) Log.TAG_CONTACT, "changeImportedContacts contact[0]: %s", t2.z5(object));
        }
        D(runnable);
    }

    public int a0(Long l10, Long l11) {
        return this.Q.Re().compare(this.Q.e2().u2(l10.longValue()), this.Q.e2().u2(l11.longValue()));
    }

    public void b0(org.thunderdog.challegram.a aVar, boolean z10, Runnable runnable, int i10, boolean z11) {
        if (z11) {
            if (N() == 0) {
                p0(1);
            }
            u0(aVar, z10, runnable);
        } else if (v0.L2("android.permission.READ_CONTACTS")) {
            s0(aVar, i10 | 2, runnable);
        } else {
            s0(aVar, i10 | 2 | 1, runnable);
        }
    }

    public void c0(boolean z10, final org.thunderdog.challegram.a aVar, final boolean z11, final Runnable runnable, final int i10, DialogInterface dialogInterface, int i11) {
        if (z10) {
            v.C();
            return;
        }
        dialogInterface.dismiss();
        l0(0);
        if (Build.VERSION.SDK_INT >= 23) {
            v0.x2(new String[]{"android.permission.READ_CONTACTS"}, new kb.i() {
                @Override
                public final void a(boolean z12) {
                    w8.this.b0(aVar, z11, runnable, i10, z12);
                }
            });
            return;
        }
        p0(1);
        u0(aVar, z11, runnable);
    }

    public void d0(boolean z10, Runnable runnable, DialogInterface dialogInterface, int i10) {
        if (z10) {
            B(dialogInterface);
        }
        dialogInterface.dismiss();
        if (runnable != null) {
            runnable.run();
        }
        l0(2);
        p0(0);
    }

    public void e0(org.thunderdog.challegram.a aVar, boolean z10, Runnable runnable, boolean z11) {
        if (z11) {
            if (N() == 0) {
                p0(1);
            }
            u0(aVar, z10, runnable);
            return;
        }
        int i10 = 0;
        p0(0);
        if (x(z10)) {
            if (v0.L2("android.permission.READ_CONTACTS")) {
                if (z10) {
                    i10 = 4;
                }
                s0(aVar, i10, runnable);
                return;
            }
            s0(aVar, 5, runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public static void v(ArrayList<TdApi.Contact> arrayList) {
        arrayList.ensureCapacity(arrayList.size() + 9);
        for (int i10 = 1; i10 <= 9; i10++) {
            arrayList.add(new TdApi.Contact("99966173" + (i10 + 50), "Robot #" + i10, "(imported)", null, 0L));
        }
    }

    public final void B(DialogInterface dialogInterface) {
        if (this.X == dialogInterface) {
            this.X = null;
            this.Y = null;
        }
    }

    public void C() {
        this.Q.v4().o(new TdApi.ClearImportedContacts(), new a());
    }

    public final void D(final Runnable runnable) {
        this.Q.v4().o(new TdApi.ClearImportedContacts(), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                w8.U(runnable, object);
            }
        });
    }

    public void E() {
        y();
        l0(2);
        p0(0);
        o0(0);
    }

    public void F(org.thunderdog.challegram.a aVar) {
        if (K() == 2) {
            l0(0);
        }
        if (N() == 0) {
            p0(1);
        }
        u0(aVar, true, null);
    }

    public final long H() {
        if (this.f28620c == null) {
            this.f28620c = Long.valueOf(he.i.c2().e1(T("sync_later"), 0L));
        }
        return this.f28620c.longValue();
    }

    public int I() {
        return J(this.T, this.S);
    }

    public final int K() {
        if (this.f28618a == null) {
            this.f28618a = Integer.valueOf(he.i.c2().V0(T("sync_hidden"), 0));
        }
        return this.f28618a.intValue();
    }

    public int L() {
        return this.S;
    }

    public long[] M() {
        return this.T;
    }

    public final int N() {
        if (this.f28619b == null) {
            this.f28619b = Integer.valueOf(he.i.c2().V0(T("sync_state"), 0));
        }
        return this.f28619b.intValue();
    }

    public ArrayList<i> O() {
        return this.U;
    }

    public final boolean P() {
        synchronized (this) {
            List<Reference<Object>> list = this.P;
            boolean z10 = false;
            if (list == null) {
                return false;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                if (this.P.get(size).get() != null) {
                    z10 = true;
                } else {
                    this.P.remove(size);
                }
            }
            return z10;
        }
    }

    public final void Q(final kb.b bVar, final TdApi.Contact[] contactArr) {
        if (Log.isEnabled(Log.TAG_CONTACT)) {
            if (Log.checkLogLevel(5)) {
                Log.v((int) Log.TAG_CONTACT, "Importing %d contacts...\n%s", Integer.valueOf(contactArr.length), TextUtils.join("\n", contactArr));
            } else {
                Log.i((int) Log.TAG_CONTACT, "Found %d contacts, importing...", Integer.valueOf(contactArr.length));
            }
        }
        this.Q.v4().o(new TdApi.ChangeImportedContacts(contactArr), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                w8.this.V(contactArr, bVar, object);
            }
        });
    }

    public final void R(kb.b r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: zd.w8.R(kb.b, boolean):void");
    }

    public boolean S() {
        return N() != 0;
    }

    public final String T(String str) {
        if (this.Q.A6() == 0) {
            return str;
        }
        return str + "_" + this.Q.A6();
    }

    @Override
    public void a() {
    }

    @Override
    public void b(boolean z10) {
        z();
    }

    @Override
    public void c() {
        Y(false, null);
    }

    public void f0(org.thunderdog.challegram.a aVar) {
        boolean z10 = !v0.X1("android.permission.READ_CONTACTS");
        AlertDialog alertDialog = this.X;
        if (alertDialog != null && alertDialog.getContext() == aVar && z10) {
            AlertDialog alertDialog2 = this.X;
            Runnable runnable = this.Y;
            this.X = null;
            this.Y = null;
            if (runnable != null) {
                runnable.run();
            }
            alertDialog2.dismiss();
        }
        if (z10) {
            t0();
        }
    }

    public final Client.g g0() {
        return new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                w8.this.X(object);
            }
        };
    }

    public void h0(Object obj) {
        synchronized (this) {
            List<Reference<Object>> list = this.P;
            if (list != null) {
                lb.i.e(list, obj);
            }
        }
    }

    public void i0(f fVar) {
        lb.i.e(this.R, fVar);
    }

    public void j0(h hVar) {
        lb.d<h> dVar = this.V;
        if (dVar != null) {
            dVar.remove(hVar);
        }
    }

    public void Y(final boolean z10, final Runnable runnable) {
        if (!j0.K()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    w8.this.Y(z10, runnable);
                }
            });
            return;
        }
        y();
        l0(0);
        p0(0);
        o0(0);
        n0(null, 0, false);
        this.N = 0L;
        if (z10) {
            this.Q.v4().o(new TdApi.ClearImportedContacts(), this.Q.na());
            this.Q.v4().o(new TdApi.ChangeImportedContacts(new TdApi.Contact[0]), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    w8.this.Z(runnable, object);
                }
            });
        }
    }

    public final void l0(int i10) {
        LevelDB levelDB;
        Log.i((int) Log.TAG_CONTACT, "setHideOption %d -> %d", Integer.valueOf(K()), Integer.valueOf(i10));
        if (K() != i10) {
            this.f28618a = Integer.valueOf(i10);
            levelDB = he.i.c2().W();
            levelDB.putInt(T("sync_hidden"), i10);
        } else {
            levelDB = null;
        }
        long g10 = i10 == 1 ? ib.f.g() : 0L;
        if (H() != g10) {
            this.f28620c = Long.valueOf(g10);
            if (levelDB == null) {
                levelDB = he.i.c2().W();
            }
            levelDB.putLong(T("sync_later"), g10);
        }
        if (levelDB != null) {
            levelDB.apply();
        }
    }

    public final void m0(long[] jArr, int i10, boolean z10) {
        if (jArr != null && jArr.length > 1) {
            ArrayList arrayList = new ArrayList(jArr.length);
            for (long j10 : jArr) {
                arrayList.add(Long.valueOf(j10));
            }
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int a02;
                    a02 = w8.this.a0((Long) obj, (Long) obj2);
                    return a02;
                }
            });
            ib.b.H(arrayList, jArr);
            if (jArr.length > 5) {
                long[] jArr2 = new long[5];
                System.arraycopy(jArr, 0, jArr2, 0, 5);
                jArr = jArr2;
            }
        }
        e eVar = this.Z;
        eVar.sendMessage(Message.obtain(eVar, 2, i10, z10 ? 1 : 0, jArr));
    }

    public final void n0(long[] jArr, int i10, boolean z10) {
        boolean z11;
        if (!z10 || i10 > this.S) {
            int i11 = this.S;
            boolean z12 = i11 == 0 && i10 > 0;
            if (i11 != i10) {
                this.S = i10;
                Log.i((int) Log.TAG_CONTACT, "registeredCount -> %d", Integer.valueOf(i10));
                z11 = true;
            } else {
                z11 = false;
            }
            if (!ib.b.n(jArr, this.T)) {
                this.T = jArr;
                Object[] objArr = new Object[1];
                objArr[0] = Integer.valueOf(jArr != null ? jArr.length : 0);
                Log.i((int) Log.TAG_CONTACT, "userIds[] -> %d", objArr);
                z11 = true;
            }
            if (z11) {
                int J = J(jArr, i10);
                for (int size = this.R.size() - 1; size >= 0; size--) {
                    f fVar = this.R.get(size).get();
                    if (fVar != null) {
                        fVar.Y5(jArr, J, z12);
                    } else {
                        this.R.remove(size);
                    }
                }
            }
        }
    }

    public final void o0(int i10) {
        e eVar = this.Z;
        eVar.sendMessage(Message.obtain(eVar, 0, i10, 0));
    }

    public final void p0(int i10) {
        if (N() != i10) {
            this.f28619b = Integer.valueOf(i10);
            he.i.c2().u3(T("sync_state"), i10);
            Log.i((int) Log.TAG_CONTACT, "setStatus -> %d", Integer.valueOf(i10));
            lb.d<h> dVar = this.V;
            if (dVar != null) {
                Iterator<h> it = dVar.iterator();
                while (it.hasNext()) {
                    it.next().j(this.Q, i10 != 0);
                }
            }
        }
    }

    public final void q0(ArrayList<i> arrayList) {
        e eVar = this.Z;
        eVar.sendMessage(Message.obtain(eVar, 1, arrayList));
    }

    public final void r0(ArrayList<i> arrayList) {
        ArrayList<i> arrayList2 = this.U;
        int size = arrayList2 != null ? arrayList2.size() : 0;
        int size2 = arrayList != null ? arrayList.size() : 0;
        if (size != size2 || size2 > 0) {
            Log.i((int) Log.TAG_CONTACT, "unregisteredContacts %d -> %d", Integer.valueOf(size), Integer.valueOf(size2));
            this.U = arrayList;
            for (int size3 = this.R.size() - 1; size3 >= 0; size3--) {
                f fVar = this.R.get(size3).get();
                if (fVar != null) {
                    fVar.v1(size, arrayList, size2);
                } else {
                    this.R.remove(size3);
                }
            }
        }
    }

    public final void s0(final org.thunderdog.challegram.a aVar, final int i10, final Runnable runnable) {
        String str;
        if (this.M == 0 && K() != 2) {
            boolean z10 = (i10 & 2) == 0;
            final boolean z11 = (i10 & 1) != 0;
            final boolean z12 = (i10 & 4) != 0;
            if (!z11) {
                str = w.j1(R.string.SyncHint, w.i1(R.string.AppName));
            } else if (z10) {
                str = w.i1(R.string.SyncHintRetry);
            } else {
                str = w.i1(R.string.SyncHintUnavailable);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(aVar, j.t());
            builder.setTitle(w.i1(R.string.SyncHintTitle));
            builder.setMessage(str);
            final boolean z13 = z11;
            builder.setPositiveButton(w.i1((Build.VERSION.SDK_INT < 23 || !v0.X1("android.permission.READ_CONTACTS")) ? R.string.Allow : z11 ? R.string.Settings : R.string.Continue), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    w8.this.c0(z13, aVar, z12, runnable, i10, dialogInterface, i11);
                }
            });
            builder.setNegativeButton(w.i1(R.string.Never), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    w8.this.d0(z11, runnable, dialogInterface, i11);
                }
            });
            if (!aVar.isFinishing()) {
                AlertDialog x32 = aVar.x3(builder);
                if (z11) {
                    this.X = x32;
                    this.Y = runnable;
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void t(Object obj) {
        synchronized (this) {
            if (this.P == null) {
                this.P = new ArrayList();
            }
            lb.i.a(this.P, obj);
        }
    }

    public final void t0() {
        int i10;
        if ((N() == 1 || N() == 2) && (i10 = this.M) != 1) {
            boolean z10 = i10 == 2;
            Log.i((int) Log.TAG_CONTACT, "Starting contacts synchronization, ignoreIfNoChanges:%b, status:%d", Boolean.valueOf(z10), Integer.valueOf(N()));
            this.M = 1;
            y();
            l a10 = l.a();
            c cVar = new c(z10);
            this.W = cVar;
            a10.b(cVar);
        }
    }

    public void u(f fVar) {
        lb.i.a(this.R, fVar);
    }

    public void u0(final org.thunderdog.challegram.a aVar, final boolean z10, final Runnable runnable) {
        if (j0.f5280g == 2) {
            ArrayList arrayList = new ArrayList(9);
            v(arrayList);
            TdApi.Contact[] contactArr = new TdApi.Contact[arrayList.size()];
            arrayList.toArray(contactArr);
            Q(new b(), contactArr);
            if (runnable != null) {
                runnable.run();
            }
        } else if (N() != 0 && v0.X1("android.permission.READ_CONTACTS")) {
            v0.x2(new String[]{"android.permission.READ_CONTACTS"}, new kb.i() {
                @Override
                public final void a(boolean z11) {
                    w8.this.e0(aVar, z10, runnable, z11);
                }
            });
        } else if (!z10 || !((N() == 1 || N() == 2) && this.M == 2)) {
            int N = N();
            if (N != 0) {
                if (N == 1 || N == 2) {
                    v0.D2(runnable);
                    t0();
                }
            } else if (x(z10)) {
                s0(aVar, z10 ? 6 : 0, runnable);
            } else {
                v0.D2(runnable);
            }
        } else {
            v0.D2(runnable);
        }
    }

    public void w(h hVar) {
        if (this.V == null) {
            this.V = new lb.d<>();
        }
        this.V.add(hVar);
    }

    public final boolean x(boolean z10) {
        int K = K();
        if (K == 2) {
            return false;
        }
        return (K == 1 && !z10 && ib.f.g() == H()) ? false : true;
    }

    public final void y() {
        kb.b bVar = this.W;
        if (bVar != null) {
            bVar.c();
            this.W = null;
        }
    }

    public final void z() {
        this.Q.ob(null, 5, g0());
    }
}
