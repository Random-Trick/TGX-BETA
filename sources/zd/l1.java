package zd;

import ib.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ob.a;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;

public class l1 {
    public final List<TdApi.UserPrivacySettingRule> f27894a;
    public final int f27895b;
    public final long[] f27896c;
    public final long[] f27897d;
    public final long[] f27898e;
    public final long[] f27899f;

    public l1(TdApi.UserPrivacySettingRules userPrivacySettingRules, int i10, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
        this.f27894a = Arrays.asList(userPrivacySettingRules.rules);
        this.f27895b = i10;
        this.f27896c = jArr;
        this.f27897d = jArr2;
        this.f27898e = jArr3;
        this.f27899f = jArr4;
    }

    public static TdApi.UserPrivacySettingRule f(List<TdApi.UserPrivacySettingRule> list, long j10, boolean z10) {
        TdApi.UserPrivacySettingRule userPrivacySettingRule = null;
        for (TdApi.UserPrivacySettingRule userPrivacySettingRule2 : list) {
            switch (userPrivacySettingRule2.getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
                    if (b.s(((TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule2).chatIds, j10) < 0) {
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
                    if (b.s(((TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule2).chatIds, j10) < 0) {
                        break;
                    } else {
                        return userPrivacySettingRule2;
                    }
            }
        }
        if (z10) {
            return userPrivacySettingRule;
        }
        return null;
    }

    public static TdApi.UserPrivacySettingRule g(List<TdApi.UserPrivacySettingRule> list, long j10, boolean z10, long[] jArr) {
        for (TdApi.UserPrivacySettingRule userPrivacySettingRule : list) {
            switch (userPrivacySettingRule.getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
                    if (b.p(((TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule).chatIds, jArr) == 0) {
                        break;
                    } else {
                        return userPrivacySettingRule;
                    }
                case TdApi.UserPrivacySettingRuleAllowAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictAll.CONSTRUCTOR:
                    return userPrivacySettingRule;
                case TdApi.UserPrivacySettingRuleAllowContacts.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictContacts.CONSTRUCTOR:
                    if (!z10) {
                        break;
                    } else {
                        return userPrivacySettingRule;
                    }
                case TdApi.UserPrivacySettingRuleRestrictChatMembers.CONSTRUCTOR:
                    if (b.p(((TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule).chatIds, jArr) == 0) {
                        break;
                    } else {
                        return userPrivacySettingRule;
                    }
                case TdApi.UserPrivacySettingRuleRestrictUsers.CONSTRUCTOR:
                    if (b.s(((TdApi.UserPrivacySettingRuleRestrictUsers) userPrivacySettingRule).userIds, j10) < 0) {
                        break;
                    } else {
                        return userPrivacySettingRule;
                    }
                case TdApi.UserPrivacySettingRuleAllowUsers.CONSTRUCTOR:
                    if (b.s(((TdApi.UserPrivacySettingRuleAllowUsers) userPrivacySettingRule).userIds, j10) < 0) {
                        break;
                    } else {
                        return userPrivacySettingRule;
                    }
            }
        }
        return null;
    }

    public static boolean q(TdApi.UserPrivacySettingRule userPrivacySettingRule) {
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

    public static boolean r(TdApi.UserPrivacySettingRule userPrivacySettingRule, boolean z10) {
        if (userPrivacySettingRule == null) {
            return true;
        }
        switch (userPrivacySettingRule.getConstructor()) {
            case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
            case TdApi.UserPrivacySettingRuleRestrictChatMembers.CONSTRUCTOR:
                return z10;
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

    public static zd.l1 z(org.drinkless.td.libcore.telegram.TdApi.UserPrivacySettingRules r15) {
        throw new UnsupportedOperationException("Method not decompiled: zd.l1.z(org.drinkless.td.libcore.telegram.TdApi$UserPrivacySettingRules):zd.l1");
    }

    public org.drinkless.td.libcore.telegram.TdApi.UserPrivacySettingRules a(long[] r5, long[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: zd.l1.a(long[], long[]):org.drinkless.td.libcore.telegram.TdApi$UserPrivacySettingRules");
    }

    public TdApi.UserPrivacySettingRules b(long[] jArr, long[] jArr2) {
        ArrayList arrayList = new ArrayList(this.f27894a);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            TdApi.UserPrivacySettingRule userPrivacySettingRule = (TdApi.UserPrivacySettingRule) arrayList.get(size);
            switch (userPrivacySettingRule.getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
                    TdApi.UserPrivacySettingRuleAllowChatMembers userPrivacySettingRuleAllowChatMembers = (TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule;
                    long[] x10 = b.x(userPrivacySettingRuleAllowChatMembers.chatIds, jArr2);
                    userPrivacySettingRuleAllowChatMembers.chatIds = x10;
                    if (x10.length == 0) {
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
                    long[] x11 = b.x(userPrivacySettingRuleAllowUsers.userIds, jArr);
                    userPrivacySettingRuleAllowUsers.userIds = x11;
                    if (x11.length == 0) {
                        arrayList.remove(size);
                        break;
                    } else {
                        break;
                    }
            }
        }
        if (jArr2 != null && jArr2.length > 0) {
            int i10 = 0;
            while (i10 < arrayList.size() && !r((TdApi.UserPrivacySettingRule) arrayList.get(i10), true)) {
                i10++;
            }
            TdApi.UserPrivacySettingRuleRestrictChatMembers userPrivacySettingRuleRestrictChatMembers = new TdApi.UserPrivacySettingRuleRestrictChatMembers(jArr2);
            if (i10 < arrayList.size()) {
                arrayList.add(i10, userPrivacySettingRuleRestrictChatMembers);
            } else {
                arrayList.add(userPrivacySettingRuleRestrictChatMembers);
            }
        }
        if (jArr != null && jArr.length > 0) {
            arrayList.add(0, new TdApi.UserPrivacySettingRuleRestrictUsers(jArr));
        }
        return new TdApi.UserPrivacySettingRules((TdApi.UserPrivacySettingRule[]) arrayList.toArray(new TdApi.UserPrivacySettingRule[0]));
    }

    public TdApi.UserPrivacySettingRule c(boolean z10) {
        for (TdApi.UserPrivacySettingRule userPrivacySettingRule : this.f27894a) {
            switch (userPrivacySettingRule.getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictAll.CONSTRUCTOR:
                    return userPrivacySettingRule;
                case TdApi.UserPrivacySettingRuleAllowContacts.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictContacts.CONSTRUCTOR:
                    if (!z10) {
                        break;
                    } else {
                        return userPrivacySettingRule;
                    }
            }
        }
        return null;
    }

    public TdApi.UserPrivacySettingRule d(long j10, boolean z10) {
        return f(this.f27894a, j10, z10);
    }

    public TdApi.UserPrivacySettingRule e(long j10, boolean z10, long[] jArr) {
        return g(this.f27894a, j10, z10, jArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (l1Var.f27894a.size() != this.f27894a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < l1Var.f27894a.size(); i10++) {
            if (!e.l0(l1Var.f27894a.get(i10), this.f27894a.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public long[] h() {
        long[] jArr = this.f27897d;
        int length = jArr != null ? jArr.length : 0;
        long[] jArr2 = this.f27899f;
        jb.e eVar = new jb.e(length + (jArr2 != null ? jArr2.length : 0));
        for (TdApi.UserPrivacySettingRule userPrivacySettingRule : this.f27894a) {
            int constructor = userPrivacySettingRule.getConstructor();
            if (constructor == 392530897) {
                for (long j10 : ((TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule).chatIds) {
                    eVar.a(j10);
                }
            } else if (constructor == 622796522) {
                for (long j11 : ((TdApi.UserPrivacySettingRuleRestrictUsers) userPrivacySettingRule).userIds) {
                    eVar.a(a.c(j11));
                }
            } else if (r(userPrivacySettingRule, false)) {
                break;
            }
        }
        return eVar.g();
    }

    public long[] i() {
        long[] jArr = this.f27896c;
        int length = jArr != null ? jArr.length : 0;
        long[] jArr2 = this.f27898e;
        jb.e eVar = new jb.e(length + (jArr2 != null ? jArr2.length : 0));
        for (TdApi.UserPrivacySettingRule userPrivacySettingRule : this.f27894a) {
            switch (userPrivacySettingRule.getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
                    for (long j10 : ((TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule).chatIds) {
                        eVar.a(j10);
                    }
                    break;
                case TdApi.UserPrivacySettingRuleAllowAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictAll.CONSTRUCTOR:
                    return eVar.g();
                case TdApi.UserPrivacySettingRuleAllowUsers.CONSTRUCTOR:
                    for (long j11 : ((TdApi.UserPrivacySettingRuleAllowUsers) userPrivacySettingRule).userIds) {
                        eVar.a(a.c(j11));
                    }
                    break;
            }
        }
        return eVar.g();
    }

    public int j(o6 o6Var) {
        long[] jArr = this.f27899f;
        if (jArr == null) {
            return 0;
        }
        int i10 = 0;
        for (long j10 : jArr) {
            i10 += o6Var.s3(j10);
        }
        return i10;
    }

    public int k(o6 o6Var) {
        return l() + j(o6Var);
    }

    public int l() {
        long[] jArr = this.f27897d;
        if (jArr != null) {
            return jArr.length;
        }
        return 0;
    }

    public int m() {
        return this.f27895b;
    }

    public int n(o6 o6Var) {
        long[] jArr = this.f27898e;
        if (jArr == null) {
            return 0;
        }
        int i10 = 0;
        for (long j10 : jArr) {
            i10 += o6Var.s3(j10);
        }
        return i10;
    }

    public int o(o6 o6Var) {
        return p() + n(o6Var);
    }

    public int p() {
        long[] jArr = this.f27896c;
        if (jArr != null) {
            return jArr.length;
        }
        return 0;
    }

    public boolean s() {
        if (this.f27895b != 2) {
            return true;
        }
        for (TdApi.UserPrivacySettingRule userPrivacySettingRule : this.f27894a) {
            if (r(userPrivacySettingRule, false)) {
                break;
            } else if (userPrivacySettingRule.getConstructor() == 392530897) {
                return true;
            }
        }
        return false;
    }

    public boolean t() {
        return this.f27895b != 0;
    }

    public TdApi.UserPrivacySettingRules u() {
        return new TdApi.UserPrivacySettingRules((TdApi.UserPrivacySettingRule[]) this.f27894a.toArray(new TdApi.UserPrivacySettingRule[0]));
    }

    public TdApi.UserPrivacySettingRules v(long j10, boolean z10, boolean z11) {
        int i10;
        long[] jArr;
        ArrayList arrayList = new ArrayList(this.f27894a);
        while (true) {
            TdApi.UserPrivacySettingRule f10 = f(arrayList, j10, z10);
            if (q(f10) == z11) {
                return new TdApi.UserPrivacySettingRules((TdApi.UserPrivacySettingRule[]) arrayList.toArray(new TdApi.UserPrivacySettingRule[0]));
            }
            if (r(f10, false)) {
                if (!arrayList.isEmpty()) {
                    i10 = 0;
                    while (true) {
                        if (i10 != -1 && i10 < arrayList.size()) {
                            TdApi.UserPrivacySettingRule userPrivacySettingRule = (TdApi.UserPrivacySettingRule) arrayList.get(i10);
                            switch (userPrivacySettingRule.getConstructor()) {
                                case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
                                    TdApi.UserPrivacySettingRuleAllowChatMembers userPrivacySettingRuleAllowChatMembers = (TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule;
                                    if (z11) {
                                        userPrivacySettingRuleAllowChatMembers.chatIds = b.b(userPrivacySettingRuleAllowChatMembers.chatIds, j10);
                                        break;
                                    } else {
                                        i10++;
                                    }
                                case TdApi.UserPrivacySettingRuleAllowContacts.CONSTRUCTOR:
                                case TdApi.UserPrivacySettingRuleRestrictUsers.CONSTRUCTOR:
                                case TdApi.UserPrivacySettingRuleRestrictContacts.CONSTRUCTOR:
                                case TdApi.UserPrivacySettingRuleAllowUsers.CONSTRUCTOR:
                                    i10++;
                                case TdApi.UserPrivacySettingRuleRestrictChatMembers.CONSTRUCTOR:
                                    TdApi.UserPrivacySettingRuleRestrictChatMembers userPrivacySettingRuleRestrictChatMembers = (TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule;
                                    if (!z11) {
                                        userPrivacySettingRuleRestrictChatMembers.chatIds = b.b(userPrivacySettingRuleRestrictChatMembers.chatIds, j10);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                    i10 = -1;
                } else {
                    i10 = 0;
                }
                if (i10 != -1) {
                    Object userPrivacySettingRuleAllowChatMembers2 = z11 ? new TdApi.UserPrivacySettingRuleAllowChatMembers(new long[]{j10}) : new TdApi.UserPrivacySettingRuleRestrictChatMembers(new long[]{j10});
                    if (i10 < arrayList.size()) {
                        arrayList.add(i10, userPrivacySettingRuleAllowChatMembers2);
                    } else {
                        arrayList.add(userPrivacySettingRuleAllowChatMembers2);
                    }
                }
            } else {
                int constructor = f10.getConstructor();
                if (constructor == -2048749863) {
                    jArr = ((TdApi.UserPrivacySettingRuleAllowChatMembers) f10).chatIds;
                } else if (constructor == 392530897) {
                    jArr = ((TdApi.UserPrivacySettingRuleRestrictChatMembers) f10).chatIds;
                } else {
                    throw new UnsupportedOperationException();
                }
                int s10 = b.s(jArr, j10);
                if (s10 == -1) {
                    throw new UnsupportedOperationException();
                } else if (jArr.length > 1) {
                    long[] y10 = b.y(jArr, s10);
                    int constructor2 = f10.getConstructor();
                    if (constructor2 == -2048749863) {
                        ((TdApi.UserPrivacySettingRuleAllowChatMembers) f10).chatIds = y10;
                    } else if (constructor2 == 392530897) {
                        ((TdApi.UserPrivacySettingRuleRestrictChatMembers) f10).chatIds = y10;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                } else {
                    arrayList.remove(f10);
                }
            }
        }
    }

    public TdApi.UserPrivacySettingRules w(int i10) {
        if (i10 == 0) {
            return x(false, false);
        }
        if (i10 == 1) {
            return x(true, false);
        }
        if (i10 == 2) {
            return x(true, true);
        }
        throw new UnsupportedOperationException("mode == " + i10);
    }

    public TdApi.UserPrivacySettingRules x(boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList(this.f27894a);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            switch (((TdApi.UserPrivacySettingRule) arrayList.get(i10)).getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleAllowContacts.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictContacts.CONSTRUCTOR:
                    arrayList.remove(i10);
                    i10--;
                    break;
            }
            i10++;
        }
        if (z10 && z11) {
            arrayList.add(new TdApi.UserPrivacySettingRuleAllowAll());
        } else if (z10) {
            arrayList.add(new TdApi.UserPrivacySettingRuleAllowContacts());
            arrayList.add(new TdApi.UserPrivacySettingRuleRestrictAll());
        } else if (z11) {
            arrayList.add(new TdApi.UserPrivacySettingRuleRestrictContacts());
            arrayList.add(new TdApi.UserPrivacySettingRuleAllowAll());
        } else if (!arrayList.isEmpty()) {
            arrayList.add(new TdApi.UserPrivacySettingRuleRestrictAll());
        }
        return new TdApi.UserPrivacySettingRules((TdApi.UserPrivacySettingRule[]) arrayList.toArray(new TdApi.UserPrivacySettingRule[0]));
    }

    public org.drinkless.td.libcore.telegram.TdApi.UserPrivacySettingRules y(long r10, boolean r12, long[] r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: zd.l1.y(long, boolean, long[], boolean):org.drinkless.td.libcore.telegram.TdApi$UserPrivacySettingRules");
    }
}
