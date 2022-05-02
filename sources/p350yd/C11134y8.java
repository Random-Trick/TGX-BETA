package p350yd;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import be.C1363c0;
import be.C1379j0;
import be.C1405v;
import gd.C4779t2;
import ge.C4868i;
import ie.C5386e;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.vkryl.leveldb.LevelDB;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5067f;
import p108hb.C5070i;
import p139jb.AbstractC5917i;
import p139jb.AbstractRunnableC5910b;
import p154kb.C6227d;
import p154kb.C6235i;
import p364zd.C11524j;

public class C11134y8 implements AbstractC10816l0 {
    public int f35715M;
    public long f35716N;
    public long f35717O;
    public List<Reference<Object>> f35718P;
    public final C10930q6 f35719Q;
    public int f35721S;
    public long[] f35722T;
    public ArrayList<C11144i> f35723U;
    public C6227d<AbstractC11143h> f35724V;
    public AbstractRunnableC5910b f35725W;
    public AlertDialog f35726X;
    public Runnable f35727Y;
    public Integer f35729a;
    public Integer f35730b;
    public Long f35731c;
    public final List<Reference<AbstractC11141f>> f35720R = new ArrayList();
    public final HandlerC11140e f35728Z = new HandlerC11140e(this);

    public class C11135a implements Client.AbstractC7865g {

        public class C11136a implements Client.AbstractC7865g {
            public C11136a() {
            }

            @Override
            public void mo255t2(TdApi.Object object) {
                int constructor = object.getConstructor();
                if (constructor == -1679978726) {
                    C1379j0.m37302t0(object);
                } else if (constructor == -722616727) {
                    C11134y8.this.f35719Q.m2375kb(null, 1000, this);
                } else if (constructor == 171203420) {
                    long[] jArr = ((TdApi.Users) object).userIds;
                    if (jArr.length > 0) {
                        C11134y8.this.f35719Q.m2270r4().m14783o(new TdApi.RemoveContacts(jArr), this);
                    }
                }
            }
        }

        public C11135a() {
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                C1379j0.m37302t0(object);
            } else if (constructor == -722616727) {
                C11134y8.this.f35719Q.m2270r4().m14783o(new TdApi.ChangeImportedContacts(new TdApi.Contact[0]), this);
            } else if (constructor == 2068432290) {
                C11134y8.this.f35719Q.m2375kb(null, 1000, new C11136a());
            }
        }
    }

    public class C11137b extends AbstractRunnableC5910b {
        public C11137b() {
        }

        @Override
        public void mo1364b() {
        }
    }

    public class C11138c extends AbstractRunnableC5910b {
        public final boolean f35735M;

        public C11138c(boolean z) {
            this.f35735M = z;
        }

        @Override
        public void mo1364b() {
            C11134y8.this.m1420R(this, this.f35735M);
        }
    }

    public static class C11139d {
        public final long f35737a;
        public final String f35738b;
        public final ArrayList<String> f35739c = new ArrayList<>();
        public final ArrayList<String> f35740d = new ArrayList<>();
        public ArrayList<C11142g> f35741e;

        public C11139d(long j, String str) {
            this.f35737a = j;
            this.f35738b = str;
        }

        public static String m1361c(String str, List<String> list) {
            if (!list.isEmpty()) {
                if (list.indexOf(str) != -1) {
                    return null;
                }
                String D = C1363c0.m37470D(str);
                if (!C5070i.m24067c(D, str) && list.indexOf(D) != -1) {
                    return null;
                }
            }
            return str;
        }

        public void m1363a(C11142g gVar) {
            if (gVar.m1355c() > 0) {
                ArrayList<C11142g> arrayList = this.f35741e;
                if (arrayList == null) {
                    ArrayList<C11142g> arrayList2 = new ArrayList<>();
                    this.f35741e = arrayList2;
                    arrayList2.add(gVar);
                    return;
                }
                boolean z = true;
                Iterator<C11142g> it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().m1357a(gVar)) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    this.f35741e.add(gVar);
                }
            }
        }

        public void m1362b(java.util.ArrayList<org.drinkless.p210td.libcore.telegram.TdApi.Contact> r18) {
            throw new UnsupportedOperationException("Method not decompiled: p350yd.C11134y8.C11139d.m1362b(java.util.ArrayList):void");
        }

        public String m1360d() {
            return m1361c(this.f35738b, this.f35739c);
        }

        public String toString() {
            return "ContactData{contactId=" + this.f35737a + ", displayName='" + this.f35738b + "', phoneNumbers=" + this.f35739c + ", nameVariations=" + this.f35741e + '}';
        }
    }

    public static class HandlerC11140e extends Handler {
        public final C11134y8 f35742a;

        public HandlerC11140e(C11134y8 y8Var) {
            super(Looper.getMainLooper());
            this.f35742a = y8Var;
        }

        @Override
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                boolean z = true;
                if (i == 1) {
                    this.f35742a.m1376r0((ArrayList) message.obj);
                } else if (i == 2) {
                    C11134y8 y8Var = this.f35742a;
                    long[] jArr = (long[]) message.obj;
                    int i2 = message.arg1;
                    if (message.arg2 != 1) {
                        z = false;
                    }
                    y8Var.m1384n0(jArr, i2, z);
                }
            } else {
                this.f35742a.f35715M = message.arg1;
            }
        }
    }

    public interface AbstractC11141f {
        void mo1359Z5(long[] jArr, int i, boolean z);

        void mo1358u1(int i, ArrayList<C11144i> arrayList, int i2);
    }

    public static class C11142g implements Comparable<C11142g> {
        public final long f35743M;
        public final String f35744a;
        public final String f35745b;
        public final String f35746c;

        public C11142g(ArrayList<String> arrayList, String str, String str2, String str3, long j) {
            this.f35744a = C11139d.m1361c(str, arrayList);
            this.f35745b = C11139d.m1361c(str2, arrayList);
            this.f35746c = C11139d.m1361c(str3, arrayList);
            this.f35743M = j;
        }

        public boolean m1357a(C11142g gVar) {
            return C5070i.m24067c(m1354d(), gVar.m1354d());
        }

        public int compareTo(C11142g gVar) {
            return Integer.compare(gVar.m1355c(), m1355c());
        }

        public int m1355c() {
            int i = !C5070i.m24061i(this.f35744a) ? 1 : 0;
            if (!C5070i.m24061i(this.f35745b)) {
                i++;
            }
            return !C5070i.m24061i(this.f35746c) ? i + 1 : i;
        }

        public String m1354d() {
            StringBuilder sb2;
            if (!C5070i.m24061i(this.f35744a)) {
                sb2 = new StringBuilder(this.f35744a);
                sb2.append(' ');
            } else {
                sb2 = null;
            }
            if (!C5070i.m24061i(this.f35745b)) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(this.f35745b);
                } else {
                    sb2.append(this.f35745b);
                }
                sb2.append(' ');
            }
            if (!C5070i.m24061i(this.f35746c)) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(this.f35746c);
                } else {
                    sb2.append(this.f35746c);
                }
                sb2.append(' ');
            }
            if (sb2 != null) {
                return sb2.toString();
            }
            return null;
        }
    }

    public interface AbstractC11143h {
        void mo1353Y6(C10930q6 q6Var, boolean z);
    }

    public static class C11144i {
        public final TdApi.Contact f35747a;
        public final int f35748b;
        public final String f35749c;
        public final C5386e f35750d;

        public C11144i(TdApi.Contact contact, String str, int i) {
            this.f35747a = contact;
            this.f35749c = str;
            this.f35748b = i <= 1 ? 0 : i;
            this.f35750d = C4779t2.m25715C1(contact.firstName, contact.lastName);
        }

        public String m1352a() {
            TdApi.Contact contact = this.f35747a;
            return C4779t2.m25444q2(contact.firstName, contact.lastName);
        }

        public String m1351b() {
            int i = this.f35748b;
            if (i <= 1) {
                return this.f35749c;
            }
            if (i == 1000) {
                return C4403w.m27869i1(R.string.ManyContactsJoined);
            }
            return C4403w.m27844o2(R.string.xContactsJoined, i);
        }
    }

    public C11134y8(C10930q6 q6Var) {
        this.f35719Q = q6Var;
        q6Var.m2781K9().m1839l(this);
    }

    public static String m1437A(String str) {
        if (C5070i.m24061i(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            int type = Character.getType(codePointAt);
            int charCount = Character.charCount(codePointAt);
            boolean z = type != 12;
            if (z && charCount == 1) {
                if (!(codePointAt == 45 || codePointAt == 40 || codePointAt == 41)) {
                    if ((codePointAt >= 97 && codePointAt <= 122) || (codePointAt >= 65 && codePointAt <= 90)) {
                        sb2.append(C1363c0.m37438e0((char) codePointAt));
                    }
                }
                z = false;
            }
            if (z) {
                sb2.append((CharSequence) str, i, i + charCount);
            }
            i += charCount;
        }
        return sb2.toString();
    }

    public static String m1431G(String str) {
        if (C5070i.m24061i(str)) {
            return str;
        }
        int length = str.length();
        boolean z = true;
        if (length <= 1) {
            return str;
        }
        if (str.charAt(0) != '+') {
            return C1363c0.m37440d0(str);
        }
        int i = 1;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            int charCount = Character.charCount(codePointAt);
            if (charCount != 1 || !C5070i.m24058l((char) codePointAt)) {
                z = false;
                break;
            }
            i += charCount;
        }
        return z ? C1363c0.m37410w(str) : str;
    }

    public static int m1428J(long[] jArr, int i) {
        if (jArr != null) {
            return jArr.length < 5 ? jArr.length : i;
        }
        return 0;
    }

    public static void m1417U(Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.m14711w((int) Log.TAG_CONTACT, "Failed to reset contacts: %s", C4779t2.m25378z5(object));
        }
        C7389v0.m16743D2(runnable);
    }

    public void m1416V(TdApi.Contact[] contactArr, AbstractRunnableC5910b bVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14727e((int) Log.TAG_CONTACT, "changeImportedContacts: %s", C4779t2.m25378z5(object));
        } else if (constructor == 2068432290) {
            TdApi.ImportedContacts importedContacts = (TdApi.ImportedContacts) object;
            ArrayList<C11144i> arrayList = null;
            int i = 0;
            for (long j : importedContacts.userIds) {
                if (j == 0) {
                    TdApi.Contact contact = contactArr[i];
                    int i2 = importedContacts.importerCount[i];
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(new C11144i(contact, m1431G(contact.phoneNumber), i2));
                }
                i++;
            }
            if (bVar.m21856d()) {
                if (arrayList != null) {
                    arrayList.trimToSize();
                    Collections.sort(arrayList, C10993s8.f35294a);
                    m1378q0(arrayList);
                } else {
                    m1378q0(null);
                }
                m1365z();
            }
        }
        m1382o0(2);
    }

    public static int m1415W(C11144i iVar, C11144i iVar2) {
        int compare = Integer.compare(iVar2.f35748b, iVar.f35748b);
        if (compare != 0) {
            return compare;
        }
        TdApi.Contact contact = iVar.f35747a;
        String lowerCase = C4779t2.m25444q2(contact.firstName, contact.lastName).toLowerCase();
        TdApi.Contact contact2 = iVar2.f35747a;
        int compareTo = lowerCase.compareTo(C4779t2.m25444q2(contact2.firstName, contact2.lastName).toLowerCase());
        return compareTo != 0 ? compareTo : iVar.f35747a.phoneNumber.compareTo(iVar2.f35747a.phoneNumber);
    }

    public void m1414X(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14727e((int) Log.TAG_CONTACT, "Received error: %s", C4779t2.m25378z5(object));
        } else if (constructor == 171203420) {
            TdApi.Users users = (TdApi.Users) object;
            int i = users.totalCount;
            long[] jArr = users.userIds;
            if (jArr.length > 0) {
                ArrayList<TdApi.User> T2 = this.f35719Q.m2480e2().m1686T2(jArr);
                Collections.sort(T2, this.f35719Q.m2760Le());
                int min = Math.min(5, T2.size());
                long[] jArr2 = new long[min];
                boolean P = m1422P();
                for (int i2 = 0; i2 < min; i2++) {
                    TdApi.User user = T2.get(i2);
                    jArr2[i2] = user.f25439id;
                    if (user.profilePhoto != null && P) {
                        this.f35719Q.m2270r4().m14783o(new TdApi.DownloadFile(user.profilePhoto.small.f25373id, 1, 0, 0, false), this.f35719Q.m2214uc());
                    }
                }
                jArr = jArr2;
            }
            m1386m0(jArr, i, false);
        }
    }

    public void m1412Z(Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.m14727e((int) Log.TAG_CONTACT, "changeImportedContacts contact[0]: %s", C4779t2.m25378z5(object));
        }
        m1434D(runnable);
    }

    public int m1410a0(Long l, Long l2) {
        return this.f35719Q.m2760Le().compare(this.f35719Q.m2480e2().m1583v2(l.longValue()), this.f35719Q.m2480e2().m1583v2(l2.longValue()));
    }

    public void m1408b0(AbstractView$OnTouchListenerC7889a aVar, boolean z, Runnable runnable, int i, boolean z2) {
        if (z2) {
            if (m1424N() == 0) {
                m1380p0(1);
            }
            m1370u0(aVar, z, runnable);
        } else if (C7389v0.m16711L2("android.permission.READ_CONTACTS")) {
            m1374s0(aVar, i | 2, runnable);
        } else {
            m1374s0(aVar, i | 2 | 1, runnable);
        }
    }

    public void m1406c0(boolean z, final AbstractView$OnTouchListenerC7889a aVar, final boolean z2, final Runnable runnable, final int i, DialogInterface dialogInterface, int i2) {
        if (z) {
            C1405v.m37140C();
            return;
        }
        dialogInterface.dismiss();
        m1388l0(0);
        if (Build.VERSION.SDK_INT >= 23) {
            C7389v0.m16563x2(new String[]{"android.permission.READ_CONTACTS"}, new AbstractC5917i() {
                @Override
                public final void mo1322a(boolean z3) {
                    C11134y8.this.m1408b0(aVar, z2, runnable, i, z3);
                }
            });
            return;
        }
        m1380p0(1);
        m1370u0(aVar, z2, runnable);
    }

    public void m1404d0(boolean z, Runnable runnable, DialogInterface dialogInterface, int i) {
        if (z) {
            m1436B(dialogInterface);
        }
        dialogInterface.dismiss();
        if (runnable != null) {
            runnable.run();
        }
        m1388l0(2);
        m1380p0(0);
    }

    public void m1402e0(AbstractView$OnTouchListenerC7889a aVar, boolean z, Runnable runnable, boolean z2) {
        if (z2) {
            if (m1424N() == 0) {
                m1380p0(1);
            }
            m1370u0(aVar, z, runnable);
            return;
        }
        int i = 0;
        m1380p0(0);
        if (m1367x(z)) {
            if (C7389v0.m16711L2("android.permission.READ_CONTACTS")) {
                if (z) {
                    i = 4;
                }
                m1374s0(aVar, i, runnable);
                return;
            }
            m1374s0(aVar, 5, runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public static void m1369v(ArrayList<TdApi.Contact> arrayList) {
        arrayList.ensureCapacity(arrayList.size() + 9);
        for (int i = 1; i <= 9; i++) {
            arrayList.add(new TdApi.Contact("99966173" + (i + 50), "Robot #" + i, "(imported)", null, 0L));
        }
    }

    public final void m1436B(DialogInterface dialogInterface) {
        if (this.f35726X == dialogInterface) {
            this.f35726X = null;
            this.f35727Y = null;
        }
    }

    public void m1435C() {
        this.f35719Q.m2270r4().m14783o(new TdApi.ClearImportedContacts(), new C11135a());
    }

    public final void m1434D(final Runnable runnable) {
        this.f35719Q.m2270r4().m14783o(new TdApi.ClearImportedContacts(), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C11134y8.m1417U(runnable, object);
            }
        });
    }

    public void m1433E() {
        m1366y();
        m1388l0(2);
        m1380p0(0);
        m1382o0(0);
    }

    public void m1432F(AbstractView$OnTouchListenerC7889a aVar) {
        if (m1427K() == 2) {
            m1388l0(0);
        }
        if (m1424N() == 0) {
            m1380p0(1);
        }
        m1370u0(aVar, true, null);
    }

    public final long m1430H() {
        if (this.f35731c == null) {
            this.f35731c = Long.valueOf(C4868i.m24726c2().m24711e1(m1418T("sync_later"), 0L));
        }
        return this.f35731c.longValue();
    }

    public int m1429I() {
        return m1428J(this.f35722T, this.f35721S);
    }

    public final int m1427K() {
        if (this.f35729a == null) {
            this.f35729a = Integer.valueOf(C4868i.m24726c2().m24779V0(m1418T("sync_hidden"), 0));
        }
        return this.f35729a.intValue();
    }

    public int m1426L() {
        return this.f35721S;
    }

    public long[] m1425M() {
        return this.f35722T;
    }

    public final int m1424N() {
        if (this.f35730b == null) {
            this.f35730b = Integer.valueOf(C4868i.m24726c2().m24779V0(m1418T("sync_state"), 0));
        }
        return this.f35730b.intValue();
    }

    public ArrayList<C11144i> m1423O() {
        return this.f35723U;
    }

    public final boolean m1422P() {
        synchronized (this) {
            List<Reference<Object>> list = this.f35718P;
            boolean z = false;
            if (list == null) {
                return false;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                if (this.f35718P.get(size).get() != null) {
                    z = true;
                } else {
                    this.f35718P.remove(size);
                }
            }
            return z;
        }
    }

    public final void m1421Q(final AbstractRunnableC5910b bVar, final TdApi.Contact[] contactArr) {
        if (Log.isEnabled(Log.TAG_CONTACT)) {
            if (Log.checkLogLevel(5)) {
                Log.m14716v((int) Log.TAG_CONTACT, "Importing %d contacts...\n%s", Integer.valueOf(contactArr.length), TextUtils.join("\n", contactArr));
            } else {
                Log.m14721i((int) Log.TAG_CONTACT, "Found %d contacts, importing...", Integer.valueOf(contactArr.length));
            }
        }
        this.f35719Q.m2270r4().m14783o(new TdApi.ChangeImportedContacts(contactArr), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C11134y8.this.m1416V(contactArr, bVar, object);
            }
        });
    }

    public final void m1420R(p139jb.AbstractRunnableC5910b r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C11134y8.m1420R(jb.b, boolean):void");
    }

    public boolean m1419S() {
        return m1424N() != 0;
    }

    public final String m1418T(String str) {
        if (this.f35719Q.m2188w6() == 0) {
            return str;
        }
        return str + "_" + this.f35719Q.m2188w6();
    }

    @Override
    public void mo1411a() {
    }

    @Override
    public void mo1409b(boolean z) {
        m1365z();
    }

    @Override
    public void mo1407c() {
        m1413Y(false, null);
    }

    public void m1400f0(AbstractView$OnTouchListenerC7889a aVar) {
        boolean z = !C7389v0.m16665X1("android.permission.READ_CONTACTS");
        AlertDialog alertDialog = this.f35726X;
        if (alertDialog != null && alertDialog.getContext() == aVar && z) {
            AlertDialog alertDialog2 = this.f35726X;
            Runnable runnable = this.f35727Y;
            this.f35726X = null;
            this.f35727Y = null;
            if (runnable != null) {
                runnable.run();
            }
            alertDialog2.dismiss();
        }
        if (z) {
            m1372t0();
        }
    }

    public final Client.AbstractC7865g m1398g0() {
        return new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C11134y8.this.m1414X(object);
            }
        };
    }

    public void m1396h0(Object obj) {
        synchronized (this) {
            List<Reference<Object>> list = this.f35718P;
            if (list != null) {
                C6235i.m21011e(list, obj);
            }
        }
    }

    public void m1394i0(AbstractC11141f fVar) {
        C6235i.m21011e(this.f35720R, fVar);
    }

    public void m1392j0(AbstractC11143h hVar) {
        C6227d<AbstractC11143h> dVar = this.f35724V;
        if (dVar != null) {
            dVar.remove(hVar);
        }
    }

    public void m1413Y(final boolean z, final Runnable runnable) {
        if (!C1379j0.m37357K()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    C11134y8.this.m1413Y(z, runnable);
                }
            });
            return;
        }
        m1366y();
        m1388l0(0);
        m1380p0(0);
        m1382o0(0);
        m1384n0(null, 0, false);
        this.f35716N = 0L;
        if (z) {
            this.f35719Q.m2270r4().m14783o(new TdApi.ClearImportedContacts(), this.f35719Q.m2392ja());
            this.f35719Q.m2270r4().m14783o(new TdApi.ChangeImportedContacts(new TdApi.Contact[0]), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C11134y8.this.m1412Z(runnable, object);
                }
            });
        }
    }

    public final void m1388l0(int i) {
        LevelDB levelDB;
        Log.m14721i((int) Log.TAG_CONTACT, "setHideOption %d -> %d", Integer.valueOf(m1427K()), Integer.valueOf(i));
        if (m1427K() != i) {
            this.f35729a = Integer.valueOf(i);
            levelDB = C4868i.m24726c2().m24773W();
            levelDB.putInt(m1418T("sync_hidden"), i);
        } else {
            levelDB = null;
        }
        long g = i == 1 ? C5067f.m24113g() : 0L;
        if (m1430H() != g) {
            this.f35731c = Long.valueOf(g);
            if (levelDB == null) {
                levelDB = C4868i.m24726c2().m24773W();
            }
            levelDB.putLong(m1418T("sync_later"), g);
        }
        if (levelDB != null) {
            levelDB.apply();
        }
    }

    public final void m1386m0(long[] jArr, int i, boolean z) {
        if (jArr != null && jArr.length > 1) {
            ArrayList arrayList = new ArrayList(jArr.length);
            for (long j : jArr) {
                arrayList.add(Long.valueOf(j));
            }
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int a0;
                    a0 = C11134y8.this.m1410a0((Long) obj, (Long) obj2);
                    return a0;
                }
            });
            C5062b.m24174H(arrayList, jArr);
            if (jArr.length > 5) {
                long[] jArr2 = new long[5];
                System.arraycopy(jArr, 0, jArr2, 0, 5);
                jArr = jArr2;
            }
        }
        HandlerC11140e eVar = this.f35728Z;
        eVar.sendMessage(Message.obtain(eVar, 2, i, z ? 1 : 0, jArr));
    }

    public final void m1384n0(long[] jArr, int i, boolean z) {
        boolean z2;
        if (!z || i > this.f35721S) {
            int i2 = this.f35721S;
            boolean z3 = i2 == 0 && i > 0;
            if (i2 != i) {
                this.f35721S = i;
                Log.m14721i((int) Log.TAG_CONTACT, "registeredCount -> %d", Integer.valueOf(i));
                z2 = true;
            } else {
                z2 = false;
            }
            if (!C5062b.m24158n(jArr, this.f35722T)) {
                this.f35722T = jArr;
                Object[] objArr = new Object[1];
                objArr[0] = Integer.valueOf(jArr != null ? jArr.length : 0);
                Log.m14721i((int) Log.TAG_CONTACT, "userIds[] -> %d", objArr);
                z2 = true;
            }
            if (z2) {
                int J = m1428J(jArr, i);
                for (int size = this.f35720R.size() - 1; size >= 0; size--) {
                    AbstractC11141f fVar = this.f35720R.get(size).get();
                    if (fVar != null) {
                        fVar.mo1359Z5(jArr, J, z3);
                    } else {
                        this.f35720R.remove(size);
                    }
                }
            }
        }
    }

    public final void m1382o0(int i) {
        HandlerC11140e eVar = this.f35728Z;
        eVar.sendMessage(Message.obtain(eVar, 0, i, 0));
    }

    public final void m1380p0(int i) {
        if (m1424N() != i) {
            this.f35730b = Integer.valueOf(i);
            C4868i.m24726c2().m24581u3(m1418T("sync_state"), i);
            Log.m14721i((int) Log.TAG_CONTACT, "setStatus -> %d", Integer.valueOf(i));
            C6227d<AbstractC11143h> dVar = this.f35724V;
            if (dVar != null) {
                Iterator<AbstractC11143h> it = dVar.iterator();
                while (it.hasNext()) {
                    it.next().mo1353Y6(this.f35719Q, i != 0);
                }
            }
        }
    }

    public final void m1378q0(ArrayList<C11144i> arrayList) {
        HandlerC11140e eVar = this.f35728Z;
        eVar.sendMessage(Message.obtain(eVar, 1, arrayList));
    }

    public final void m1376r0(ArrayList<C11144i> arrayList) {
        ArrayList<C11144i> arrayList2 = this.f35723U;
        int size = arrayList2 != null ? arrayList2.size() : 0;
        int size2 = arrayList != null ? arrayList.size() : 0;
        if (size != size2 || size2 > 0) {
            Log.m14721i((int) Log.TAG_CONTACT, "unregisteredContacts %d -> %d", Integer.valueOf(size), Integer.valueOf(size2));
            this.f35723U = arrayList;
            for (int size3 = this.f35720R.size() - 1; size3 >= 0; size3--) {
                AbstractC11141f fVar = this.f35720R.get(size3).get();
                if (fVar != null) {
                    fVar.mo1358u1(size, arrayList, size2);
                } else {
                    this.f35720R.remove(size3);
                }
            }
        }
    }

    public final void m1374s0(final AbstractView$OnTouchListenerC7889a aVar, final int i, final Runnable runnable) {
        String str;
        if (this.f35715M == 0 && m1427K() != 2) {
            boolean z = (i & 2) == 0;
            final boolean z2 = (i & 1) != 0;
            final boolean z3 = (i & 4) != 0;
            if (!z2) {
                str = C4403w.m27865j1(R.string.SyncHint, C4403w.m27869i1(R.string.AppName));
            } else if (z) {
                str = C4403w.m27869i1(R.string.SyncHintRetry);
            } else {
                str = C4403w.m27869i1(R.string.SyncHintUnavailable);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(aVar, C11524j.m150v());
            builder.setTitle(C4403w.m27869i1(R.string.SyncHintTitle));
            builder.setMessage(str);
            final boolean z4 = z2;
            builder.setPositiveButton(C4403w.m27869i1((Build.VERSION.SDK_INT < 23 || !C7389v0.m16665X1("android.permission.READ_CONTACTS")) ? R.string.Allow : z2 ? R.string.Settings : R.string.Continue), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C11134y8.this.m1406c0(z4, aVar, z3, runnable, i, dialogInterface, i2);
                }
            });
            builder.setNegativeButton(C4403w.m27869i1(R.string.Never), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C11134y8.this.m1404d0(z2, runnable, dialogInterface, i2);
                }
            });
            if (!aVar.isFinishing()) {
                AlertDialog w3 = aVar.m14422w3(builder);
                if (z2) {
                    this.f35726X = w3;
                    this.f35727Y = runnable;
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void m1373t(Object obj) {
        synchronized (this) {
            if (this.f35718P == null) {
                this.f35718P = new ArrayList();
            }
            C6235i.m21015a(this.f35718P, obj);
        }
    }

    public final void m1372t0() {
        int i;
        if ((m1424N() == 1 || m1424N() == 2) && (i = this.f35715M) != 1) {
            boolean z = i == 2;
            Log.m14721i((int) Log.TAG_CONTACT, "Starting contacts synchronization, ignoreIfNoChanges:%b, status:%d", Boolean.valueOf(z), Integer.valueOf(m1424N()));
            this.f35715M = 1;
            m1366y();
            C4383l a = C4383l.m28059a();
            C11138c cVar = new C11138c(z);
            this.f35725W = cVar;
            a.m28058b(cVar);
        }
    }

    public void m1371u(AbstractC11141f fVar) {
        C6235i.m21015a(this.f35720R, fVar);
    }

    public void m1370u0(final AbstractView$OnTouchListenerC7889a aVar, final boolean z, final Runnable runnable) {
        if (C1379j0.f5013g == 2) {
            ArrayList arrayList = new ArrayList(9);
            m1369v(arrayList);
            TdApi.Contact[] contactArr = new TdApi.Contact[arrayList.size()];
            arrayList.toArray(contactArr);
            m1421Q(new C11137b(), contactArr);
            if (runnable != null) {
                runnable.run();
            }
        } else if (m1424N() != 0 && C7389v0.m16665X1("android.permission.READ_CONTACTS")) {
            C7389v0.m16563x2(new String[]{"android.permission.READ_CONTACTS"}, new AbstractC5917i() {
                @Override
                public final void mo1322a(boolean z2) {
                    C11134y8.this.m1402e0(aVar, z, runnable, z2);
                }
            });
        } else if (!z || !((m1424N() == 1 || m1424N() == 2) && this.f35715M == 2)) {
            int N = m1424N();
            if (N != 0) {
                if (N == 1 || N == 2) {
                    C7389v0.m16743D2(runnable);
                    m1372t0();
                }
            } else if (m1367x(z)) {
                m1374s0(aVar, z ? 6 : 0, runnable);
            } else {
                C7389v0.m16743D2(runnable);
            }
        } else {
            C7389v0.m16743D2(runnable);
        }
    }

    public void m1368w(AbstractC11143h hVar) {
        if (this.f35724V == null) {
            this.f35724V = new C6227d<>();
        }
        this.f35724V.add(hVar);
    }

    public final boolean m1367x(boolean z) {
        int K = m1427K();
        if (K == 2) {
            return false;
        }
        return (K == 1 && !z && C5067f.m24113g() == m1430H()) ? false : true;
    }

    public final void m1366y() {
        AbstractRunnableC5910b bVar = this.f35725W;
        if (bVar != null) {
            bVar.m21857c();
            this.f35725W = null;
        }
    }

    public final void m1365z() {
        this.f35719Q.m2375kb(null, 5, m1398g0());
    }
}
