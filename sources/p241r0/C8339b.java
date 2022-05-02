package p241r0;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p213p0.C7983l;
import p227q0.C8125b;
import p322x0.C10064b;

public class C8339b {
    public Context f27003a;
    public String f27004b;
    public Intent[] f27005c;
    public ComponentName f27006d;
    public CharSequence f27007e;
    public CharSequence f27008f;
    public CharSequence f27009g;
    public IconCompat f27010h;
    public C7983l[] f27011i;
    public Set<String> f27012j;
    public C8125b f27013k;
    public boolean f27014l;
    public int f27015m;
    public PersistableBundle f27016n;
    public boolean f27017o = true;

    public static class C8340a {
        public final C8339b f27018a;
        public boolean f27019b;
        public Set<String> f27020c;
        public Map<String, Map<String, List<String>>> f27021d;
        public Uri f27022e;

        public C8340a(Context context, String str) {
            C8339b bVar = new C8339b();
            this.f27018a = bVar;
            bVar.f27003a = context;
            bVar.f27004b = str;
        }

        public C8339b m12769a() {
            if (!TextUtils.isEmpty(this.f27018a.f27007e)) {
                C8339b bVar = this.f27018a;
                Intent[] intentArr = bVar.f27005c;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                if (this.f27019b) {
                    if (bVar.f27013k == null) {
                        bVar.f27013k = new C8125b(bVar.f27004b);
                    }
                    this.f27018a.f27014l = true;
                }
                if (this.f27020c != null) {
                    C8339b bVar2 = this.f27018a;
                    if (bVar2.f27012j == null) {
                        bVar2.f27012j = new HashSet();
                    }
                    this.f27018a.f27012j.addAll(this.f27020c);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    if (this.f27021d != null) {
                        C8339b bVar3 = this.f27018a;
                        if (bVar3.f27016n == null) {
                            bVar3.f27016n = new PersistableBundle();
                        }
                        for (String str : this.f27021d.keySet()) {
                            Map<String, List<String>> map = this.f27021d.get(str);
                            this.f27018a.f27016n.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                            for (String str2 : map.keySet()) {
                                List<String> list = map.get(str2);
                                PersistableBundle persistableBundle = this.f27018a.f27016n;
                                persistableBundle.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                            }
                        }
                    }
                    if (this.f27022e != null) {
                        C8339b bVar4 = this.f27018a;
                        if (bVar4.f27016n == null) {
                            bVar4.f27016n = new PersistableBundle();
                        }
                        this.f27018a.f27016n.putString("extraSliceUri", C10064b.m6086a(this.f27022e));
                    }
                }
                return this.f27018a;
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        public C8340a m12768b(IconCompat iconCompat) {
            this.f27018a.f27010h = iconCompat;
            return this;
        }

        public C8340a m12767c(Intent intent) {
            return m12766d(new Intent[]{intent});
        }

        public C8340a m12766d(Intent[] intentArr) {
            this.f27018a.f27005c = intentArr;
            return this;
        }

        public C8340a m12765e() {
            this.f27019b = true;
            return this;
        }

        public C8340a m12764f(boolean z) {
            this.f27018a.f27014l = z;
            return this;
        }

        public C8340a m12763g(C7983l lVar) {
            return m12762h(new C7983l[]{lVar});
        }

        public C8340a m12762h(C7983l[] lVarArr) {
            this.f27018a.f27011i = lVarArr;
            return this;
        }

        public C8340a m12761i(CharSequence charSequence) {
            this.f27018a.f27007e = charSequence;
            return this;
        }
    }

    public final PersistableBundle m12775a() {
        if (this.f27016n == null) {
            this.f27016n = new PersistableBundle();
        }
        C7983l[] lVarArr = this.f27011i;
        if (lVarArr != null && lVarArr.length > 0) {
            this.f27016n.putInt("extraPersonCount", lVarArr.length);
            int i = 0;
            while (i < this.f27011i.length) {
                PersistableBundle persistableBundle = this.f27016n;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i2 = i + 1;
                sb2.append(i2);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f27011i[i].m13850k());
                i = i2;
            }
        }
        C8125b bVar = this.f27013k;
        if (bVar != null) {
            this.f27016n.putString("extraLocusId", bVar.m13413a());
        }
        this.f27016n.putBoolean("extraLongLived", this.f27014l);
        return this.f27016n;
    }

    public String m12774b() {
        return this.f27004b;
    }

    public C8125b m12773c() {
        return this.f27013k;
    }

    public int m12772d() {
        return this.f27015m;
    }

    public CharSequence m12771e() {
        return this.f27007e;
    }

    public ShortcutInfo m12770f() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f27003a, this.f27004b).setShortLabel(this.f27007e).setIntents(this.f27005c);
        IconCompat iconCompat = this.f27010h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m40308s(this.f27003a));
        }
        if (!TextUtils.isEmpty(this.f27008f)) {
            intents.setLongLabel(this.f27008f);
        }
        if (!TextUtils.isEmpty(this.f27009g)) {
            intents.setDisabledMessage(this.f27009g);
        }
        ComponentName componentName = this.f27006d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f27012j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f27015m);
        PersistableBundle persistableBundle = this.f27016n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C7983l[] lVarArr = this.f27011i;
            if (lVarArr != null && lVarArr.length > 0) {
                int length = lVarArr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.f27011i[i].m13853h();
                }
                intents.setPersons(personArr);
            }
            C8125b bVar = this.f27013k;
            if (bVar != null) {
                intents.setLocusId(bVar.m13411c());
            }
            intents.setLongLived(this.f27014l);
        } else {
            intents.setExtras(m12775a());
        }
        return intents.build();
    }
}
