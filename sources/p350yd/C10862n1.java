package p350yd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p108hb.C5062b;
import p124ib.C5322e;
import p193nb.C7316a;
import p193nb.C7321e;

public class C10862n1 {
    public final List<TdApi.UserPrivacySettingRule> f34797a;
    public final int f34798b;
    public final long[] f34799c;
    public final long[] f34800d;
    public final long[] f34801e;
    public final long[] f34802f;

    public C10862n1(TdApi.UserPrivacySettingRules userPrivacySettingRules, int i, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
        this.f34797a = Arrays.asList(userPrivacySettingRules.rules);
        this.f34798b = i;
        this.f34799c = jArr;
        this.f34800d = jArr2;
        this.f34801e = jArr3;
        this.f34802f = jArr4;
    }

    public static TdApi.UserPrivacySettingRule m2989f(List<TdApi.UserPrivacySettingRule> list, long j, boolean z) {
        TdApi.UserPrivacySettingRule userPrivacySettingRule = null;
        for (TdApi.UserPrivacySettingRule userPrivacySettingRule2 : list) {
            switch (userPrivacySettingRule2.getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
                    if (C5062b.m24154s(((TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule2).chatIds, j) < 0) {
                        break;
                    } else {
                        return userPrivacySettingRule2;
                    }
                case TdApi.UserPrivacySettingRuleAllowAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictAll.CONSTRUCTOR:
                    return userPrivacySettingRule2;
                case TdApi.UserPrivacySettingRuleAllowContacts.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictContacts.CONSTRUCTOR:
                    userPrivacySettingRule = userPrivacySettingRule2;
                    break;
                case TdApi.UserPrivacySettingRuleRestrictChatMembers.CONSTRUCTOR:
                    if (C5062b.m24154s(((TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule2).chatIds, j) < 0) {
                        break;
                    } else {
                        return userPrivacySettingRule2;
                    }
            }
        }
        if (z) {
            return userPrivacySettingRule;
        }
        return null;
    }

    public static TdApi.UserPrivacySettingRule m2988g(List<TdApi.UserPrivacySettingRule> list, long j, boolean z, long[] jArr) {
        for (TdApi.UserPrivacySettingRule userPrivacySettingRule : list) {
            switch (userPrivacySettingRule.getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
                    if (C5062b.m24157p(((TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule).chatIds, jArr) == 0) {
                        break;
                    } else {
                        return userPrivacySettingRule;
                    }
                case TdApi.UserPrivacySettingRuleAllowAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictAll.CONSTRUCTOR:
                    return userPrivacySettingRule;
                case TdApi.UserPrivacySettingRuleAllowContacts.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictContacts.CONSTRUCTOR:
                    if (!z) {
                        break;
                    } else {
                        return userPrivacySettingRule;
                    }
                case TdApi.UserPrivacySettingRuleRestrictChatMembers.CONSTRUCTOR:
                    if (C5062b.m24157p(((TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule).chatIds, jArr) == 0) {
                        break;
                    } else {
                        return userPrivacySettingRule;
                    }
                case TdApi.UserPrivacySettingRuleRestrictUsers.CONSTRUCTOR:
                    if (C5062b.m24154s(((TdApi.UserPrivacySettingRuleRestrictUsers) userPrivacySettingRule).userIds, j) < 0) {
                        break;
                    } else {
                        return userPrivacySettingRule;
                    }
                case TdApi.UserPrivacySettingRuleAllowUsers.CONSTRUCTOR:
                    if (C5062b.m24154s(((TdApi.UserPrivacySettingRuleAllowUsers) userPrivacySettingRule).userIds, j) < 0) {
                        break;
                    } else {
                        return userPrivacySettingRule;
                    }
            }
        }
        return null;
    }

    public static boolean m2978q(TdApi.UserPrivacySettingRule userPrivacySettingRule) {
        if (userPrivacySettingRule == null) {
            return false;
        }
        switch (userPrivacySettingRule.getConstructor()) {
            case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
            case TdApi.UserPrivacySettingRuleAllowAll.CONSTRUCTOR:
            case TdApi.UserPrivacySettingRuleAllowContacts.CONSTRUCTOR:
            case TdApi.UserPrivacySettingRuleAllowUsers.CONSTRUCTOR:
                return true;
            case TdApi.UserPrivacySettingRuleRestrictAll.CONSTRUCTOR:
            case TdApi.UserPrivacySettingRuleRestrictChatMembers.CONSTRUCTOR:
            case TdApi.UserPrivacySettingRuleRestrictUsers.CONSTRUCTOR:
            case TdApi.UserPrivacySettingRuleRestrictContacts.CONSTRUCTOR:
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static boolean m2977r(TdApi.UserPrivacySettingRule userPrivacySettingRule, boolean z) {
        if (userPrivacySettingRule == null) {
            return true;
        }
        switch (userPrivacySettingRule.getConstructor()) {
            case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
            case TdApi.UserPrivacySettingRuleRestrictChatMembers.CONSTRUCTOR:
                return z;
            case TdApi.UserPrivacySettingRuleAllowAll.CONSTRUCTOR:
            case TdApi.UserPrivacySettingRuleAllowContacts.CONSTRUCTOR:
            case TdApi.UserPrivacySettingRuleRestrictAll.CONSTRUCTOR:
            case TdApi.UserPrivacySettingRuleRestrictContacts.CONSTRUCTOR:
                return true;
            case TdApi.UserPrivacySettingRuleRestrictUsers.CONSTRUCTOR:
            case TdApi.UserPrivacySettingRuleAllowUsers.CONSTRUCTOR:
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static p350yd.C10862n1 m2969z(org.drinkless.p210td.libcore.telegram.TdApi.UserPrivacySettingRules r15) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10862n1.m2969z(org.drinkless.td.libcore.telegram.TdApi$UserPrivacySettingRules):yd.n1");
    }

    public org.drinkless.p210td.libcore.telegram.TdApi.UserPrivacySettingRules m2994a(long[] r5, long[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10862n1.m2994a(long[], long[]):org.drinkless.td.libcore.telegram.TdApi$UserPrivacySettingRules");
    }

    public TdApi.UserPrivacySettingRules m2993b(long[] jArr, long[] jArr2) {
        ArrayList arrayList = new ArrayList(this.f34797a);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            TdApi.UserPrivacySettingRule userPrivacySettingRule = (TdApi.UserPrivacySettingRule) arrayList.get(size);
            switch (userPrivacySettingRule.getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
                    TdApi.UserPrivacySettingRuleAllowChatMembers userPrivacySettingRuleAllowChatMembers = (TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule;
                    long[] x = C5062b.m24149x(userPrivacySettingRuleAllowChatMembers.chatIds, jArr2);
                    userPrivacySettingRuleAllowChatMembers.chatIds = x;
                    if (x.length == 0) {
                        arrayList.remove(size);
                        break;
                    } else {
                        break;
                    }
                case TdApi.UserPrivacySettingRuleRestrictChatMembers.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictUsers.CONSTRUCTOR:
                    arrayList.remove(size);
                    break;
                case TdApi.UserPrivacySettingRuleAllowUsers.CONSTRUCTOR:
                    TdApi.UserPrivacySettingRuleAllowUsers userPrivacySettingRuleAllowUsers = (TdApi.UserPrivacySettingRuleAllowUsers) userPrivacySettingRule;
                    long[] x2 = C5062b.m24149x(userPrivacySettingRuleAllowUsers.userIds, jArr);
                    userPrivacySettingRuleAllowUsers.userIds = x2;
                    if (x2.length == 0) {
                        arrayList.remove(size);
                        break;
                    } else {
                        break;
                    }
            }
        }
        if (jArr2 != null && jArr2.length > 0) {
            int i = 0;
            while (i < arrayList.size() && !m2977r((TdApi.UserPrivacySettingRule) arrayList.get(i), true)) {
                i++;
            }
            TdApi.UserPrivacySettingRuleRestrictChatMembers userPrivacySettingRuleRestrictChatMembers = new TdApi.UserPrivacySettingRuleRestrictChatMembers(jArr2);
            if (i < arrayList.size()) {
                arrayList.add(i, userPrivacySettingRuleRestrictChatMembers);
            } else {
                arrayList.add(userPrivacySettingRuleRestrictChatMembers);
            }
        }
        if (jArr != null && jArr.length > 0) {
            arrayList.add(0, new TdApi.UserPrivacySettingRuleRestrictUsers(jArr));
        }
        return new TdApi.UserPrivacySettingRules((TdApi.UserPrivacySettingRule[]) arrayList.toArray(new TdApi.UserPrivacySettingRule[0]));
    }

    public TdApi.UserPrivacySettingRule m2992c(boolean z) {
        for (TdApi.UserPrivacySettingRule userPrivacySettingRule : this.f34797a) {
            switch (userPrivacySettingRule.getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictAll.CONSTRUCTOR:
                    return userPrivacySettingRule;
                case TdApi.UserPrivacySettingRuleAllowContacts.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictContacts.CONSTRUCTOR:
                    if (!z) {
                        break;
                    } else {
                        return userPrivacySettingRule;
                    }
            }
        }
        return null;
    }

    public TdApi.UserPrivacySettingRule m2991d(long j, boolean z) {
        return m2989f(this.f34797a, j, z);
    }

    public TdApi.UserPrivacySettingRule m2990e(long j, boolean z, long[] jArr) {
        return m2988g(this.f34797a, j, z, jArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10862n1)) {
            return false;
        }
        C10862n1 n1Var = (C10862n1) obj;
        if (n1Var.f34797a.size() != this.f34797a.size()) {
            return false;
        }
        for (int i = 0; i < n1Var.f34797a.size(); i++) {
            if (!C7321e.m16939j0(n1Var.f34797a.get(i), this.f34797a.get(i))) {
                return false;
            }
        }
        return true;
    }

    public long[] m2987h() {
        long[] jArr = this.f34800d;
        int length = jArr != null ? jArr.length : 0;
        long[] jArr2 = this.f34802f;
        C5322e eVar = new C5322e(length + (jArr2 != null ? jArr2.length : 0));
        for (TdApi.UserPrivacySettingRule userPrivacySettingRule : this.f34797a) {
            int constructor = userPrivacySettingRule.getConstructor();
            if (constructor == 392530897) {
                for (long j : ((TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule).chatIds) {
                    eVar.m23276a(j);
                }
            } else if (constructor == 622796522) {
                for (long j2 : ((TdApi.UserPrivacySettingRuleRestrictUsers) userPrivacySettingRule).userIds) {
                    eVar.m23276a(C7316a.m17058c(j2));
                }
            } else if (m2977r(userPrivacySettingRule, false)) {
                break;
            }
        }
        return eVar.m23270g();
    }

    public long[] m2986i() {
        long[] jArr = this.f34799c;
        int length = jArr != null ? jArr.length : 0;
        long[] jArr2 = this.f34801e;
        C5322e eVar = new C5322e(length + (jArr2 != null ? jArr2.length : 0));
        for (TdApi.UserPrivacySettingRule userPrivacySettingRule : this.f34797a) {
            switch (userPrivacySettingRule.getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
                    for (long j : ((TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule).chatIds) {
                        eVar.m23276a(j);
                    }
                    break;
                case TdApi.UserPrivacySettingRuleAllowAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictAll.CONSTRUCTOR:
                    return eVar.m23270g();
                case TdApi.UserPrivacySettingRuleAllowUsers.CONSTRUCTOR:
                    for (long j2 : ((TdApi.UserPrivacySettingRuleAllowUsers) userPrivacySettingRule).userIds) {
                        eVar.m23276a(C7316a.m17058c(j2));
                    }
                    break;
            }
        }
        return eVar.m23270g();
    }

    public int m2985j(C10930q6 q6Var) {
        long[] jArr = this.f34802f;
        if (jArr == null) {
            return 0;
        }
        int i = 0;
        for (long j : jArr) {
            i += q6Var.m2303p3(j);
        }
        return i;
    }

    public int m2984k(C10930q6 q6Var) {
        return m2983l() + m2985j(q6Var);
    }

    public int m2983l() {
        long[] jArr = this.f34800d;
        if (jArr != null) {
            return jArr.length;
        }
        return 0;
    }

    public int m2982m() {
        return this.f34798b;
    }

    public int m2981n(C10930q6 q6Var) {
        long[] jArr = this.f34801e;
        if (jArr == null) {
            return 0;
        }
        int i = 0;
        for (long j : jArr) {
            i += q6Var.m2303p3(j);
        }
        return i;
    }

    public int m2980o(C10930q6 q6Var) {
        return m2979p() + m2981n(q6Var);
    }

    public int m2979p() {
        long[] jArr = this.f34799c;
        if (jArr != null) {
            return jArr.length;
        }
        return 0;
    }

    public boolean m2976s() {
        if (this.f34798b != 2) {
            return true;
        }
        for (TdApi.UserPrivacySettingRule userPrivacySettingRule : this.f34797a) {
            if (m2977r(userPrivacySettingRule, false)) {
                break;
            } else if (userPrivacySettingRule.getConstructor() == 392530897) {
                return true;
            }
        }
        return false;
    }

    public boolean m2975t() {
        return this.f34798b != 0;
    }

    public TdApi.UserPrivacySettingRules m2974u() {
        return new TdApi.UserPrivacySettingRules((TdApi.UserPrivacySettingRule[]) this.f34797a.toArray(new TdApi.UserPrivacySettingRule[0]));
    }

    public TdApi.UserPrivacySettingRules m2973v(long j, boolean z, boolean z2) {
        int i;
        long[] jArr;
        ArrayList arrayList = new ArrayList(this.f34797a);
        while (true) {
            TdApi.UserPrivacySettingRule f = m2989f(arrayList, j, z);
            if (m2978q(f) == z2) {
                return new TdApi.UserPrivacySettingRules((TdApi.UserPrivacySettingRule[]) arrayList.toArray(new TdApi.UserPrivacySettingRule[0]));
            }
            if (m2977r(f, false)) {
                if (!arrayList.isEmpty()) {
                    i = 0;
                    while (true) {
                        if (i != -1 && i < arrayList.size()) {
                            TdApi.UserPrivacySettingRule userPrivacySettingRule = (TdApi.UserPrivacySettingRule) arrayList.get(i);
                            switch (userPrivacySettingRule.getConstructor()) {
                                case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
                                    TdApi.UserPrivacySettingRuleAllowChatMembers userPrivacySettingRuleAllowChatMembers = (TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule;
                                    if (z2) {
                                        userPrivacySettingRuleAllowChatMembers.chatIds = C5062b.m24171b(userPrivacySettingRuleAllowChatMembers.chatIds, j);
                                        break;
                                    } else {
                                        i++;
                                    }
                                case TdApi.UserPrivacySettingRuleAllowContacts.CONSTRUCTOR:
                                case TdApi.UserPrivacySettingRuleRestrictUsers.CONSTRUCTOR:
                                case TdApi.UserPrivacySettingRuleRestrictContacts.CONSTRUCTOR:
                                case TdApi.UserPrivacySettingRuleAllowUsers.CONSTRUCTOR:
                                    i++;
                                case TdApi.UserPrivacySettingRuleRestrictChatMembers.CONSTRUCTOR:
                                    TdApi.UserPrivacySettingRuleRestrictChatMembers userPrivacySettingRuleRestrictChatMembers = (TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule;
                                    if (!z2) {
                                        userPrivacySettingRuleRestrictChatMembers.chatIds = C5062b.m24171b(userPrivacySettingRuleRestrictChatMembers.chatIds, j);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = 0;
                }
                if (i != -1) {
                    Object userPrivacySettingRuleAllowChatMembers2 = z2 ? new TdApi.UserPrivacySettingRuleAllowChatMembers(new long[]{j}) : new TdApi.UserPrivacySettingRuleRestrictChatMembers(new long[]{j});
                    if (i < arrayList.size()) {
                        arrayList.add(i, userPrivacySettingRuleAllowChatMembers2);
                    } else {
                        arrayList.add(userPrivacySettingRuleAllowChatMembers2);
                    }
                }
            } else {
                int constructor = f.getConstructor();
                if (constructor == -2048749863) {
                    jArr = ((TdApi.UserPrivacySettingRuleAllowChatMembers) f).chatIds;
                } else if (constructor == 392530897) {
                    jArr = ((TdApi.UserPrivacySettingRuleRestrictChatMembers) f).chatIds;
                } else {
                    throw new UnsupportedOperationException();
                }
                int s = C5062b.m24154s(jArr, j);
                if (s == -1) {
                    throw new UnsupportedOperationException();
                } else if (jArr.length > 1) {
                    long[] y = C5062b.m24148y(jArr, s);
                    int constructor2 = f.getConstructor();
                    if (constructor2 == -2048749863) {
                        ((TdApi.UserPrivacySettingRuleAllowChatMembers) f).chatIds = y;
                    } else if (constructor2 == 392530897) {
                        ((TdApi.UserPrivacySettingRuleRestrictChatMembers) f).chatIds = y;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                } else {
                    arrayList.remove(f);
                }
            }
        }
    }

    public TdApi.UserPrivacySettingRules m2972w(int i) {
        if (i == 0) {
            return m2971x(false, false);
        }
        if (i == 1) {
            return m2971x(true, false);
        }
        if (i == 2) {
            return m2971x(true, true);
        }
        throw new UnsupportedOperationException("mode == " + i);
    }

    public TdApi.UserPrivacySettingRules m2971x(boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList(this.f34797a);
        int i = 0;
        while (i < arrayList.size()) {
            switch (((TdApi.UserPrivacySettingRule) arrayList.get(i)).getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleAllowContacts.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictContacts.CONSTRUCTOR:
                    arrayList.remove(i);
                    i--;
                    break;
            }
            i++;
        }
        if (z && z2) {
            arrayList.add(new TdApi.UserPrivacySettingRuleAllowAll());
        } else if (z) {
            arrayList.add(new TdApi.UserPrivacySettingRuleAllowContacts());
            arrayList.add(new TdApi.UserPrivacySettingRuleRestrictAll());
        } else if (z2) {
            arrayList.add(new TdApi.UserPrivacySettingRuleRestrictContacts());
            arrayList.add(new TdApi.UserPrivacySettingRuleAllowAll());
        } else if (!arrayList.isEmpty()) {
            arrayList.add(new TdApi.UserPrivacySettingRuleRestrictAll());
        }
        return new TdApi.UserPrivacySettingRules((TdApi.UserPrivacySettingRule[]) arrayList.toArray(new TdApi.UserPrivacySettingRule[0]));
    }

    public org.drinkless.p210td.libcore.telegram.TdApi.UserPrivacySettingRules m2970y(long r10, boolean r12, long[] r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10862n1.m2970y(long, boolean, long[], boolean):org.drinkless.td.libcore.telegram.TdApi$UserPrivacySettingRules");
    }
}
