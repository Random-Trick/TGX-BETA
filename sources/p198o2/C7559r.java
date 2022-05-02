package p198o2;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.work.C1070b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p071f2.C4223b;
import p071f2.C4250s;
import p143k0.C6024a;
import p198o2.C7554p;
import p281u1.AbstractC9418b;
import p281u1.AbstractC9421e;
import p281u1.AbstractC9433k;
import p281u1.C9430h;
import p308w1.C9939b;
import p308w1.C9940c;
import p308w1.C9942e;
import p323x1.AbstractC10074f;

public final class C7559r implements AbstractC7558q {
    public final AbstractC9421e f24166a;
    public final AbstractC9418b<C7554p> f24167b;
    public final AbstractC9433k f24168c;
    public final AbstractC9433k f24169d;
    public final AbstractC9433k f24170e;
    public final AbstractC9433k f24171f;
    public final AbstractC9433k f24172g;
    public final AbstractC9433k f24173h;
    public final AbstractC9433k f24174i;
    public final AbstractC9433k f24175j;

    public class CallableC7560a implements Callable<List<C7554p.C7557c>> {
        public final C9430h f24176a;

        public CallableC7560a(C9430h hVar) {
            this.f24176a = hVar;
        }

        public List<C7554p.C7557c> call() {
            C7559r.this.f24166a.m8731c();
            try {
                Cursor b = C9940c.m6454b(C7559r.this.f24166a, this.f24176a, true, null);
                int c = C9939b.m6456c(b, "id");
                int c2 = C9939b.m6456c(b, "state");
                int c3 = C9939b.m6456c(b, "output");
                int c4 = C9939b.m6456c(b, "run_attempt_count");
                C6024a aVar = new C6024a();
                C6024a aVar2 = new C6024a();
                while (b.moveToNext()) {
                    if (!b.isNull(c)) {
                        String string = b.getString(c);
                        if (((ArrayList) aVar.get(string)) == null) {
                            aVar.put(string, new ArrayList());
                        }
                    }
                    if (!b.isNull(c)) {
                        String string2 = b.getString(c);
                        if (((ArrayList) aVar2.get(string2)) == null) {
                            aVar2.put(string2, new ArrayList());
                        }
                    }
                }
                b.moveToPosition(-1);
                C7559r.this.m15671x(aVar);
                C7559r.this.m15672w(aVar2);
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    ArrayList arrayList2 = !b.isNull(c) ? (ArrayList) aVar.get(b.getString(c)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !b.isNull(c) ? (ArrayList) aVar2.get(b.getString(c)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    C7554p.C7557c cVar = new C7554p.C7557c();
                    cVar.f24160a = b.getString(c);
                    cVar.f24161b = C7574v.m15657g(b.getInt(c2));
                    cVar.f24162c = C1070b.m38475g(b.getBlob(c3));
                    cVar.f24163d = b.getInt(c4);
                    cVar.f24164e = arrayList2;
                    cVar.f24165f = arrayList3;
                    arrayList.add(cVar);
                }
                C7559r.this.f24166a.m8714t();
                b.close();
                return arrayList;
            } finally {
                C7559r.this.f24166a.m8727g();
            }
        }

        public void finalize() {
            this.f24176a.m8683B0();
        }
    }

    public class C7561b extends AbstractC9418b<C7554p> {
        public C7561b(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        public void mo8741g(AbstractC10074f fVar, C7554p pVar) {
            String str = pVar.f24140a;
            if (str == null) {
                fVar.mo5374d0(1);
            } else {
                fVar.mo5373q(1, str);
            }
            fVar.mo5376J(2, C7574v.m15654j(pVar.f24141b));
            String str2 = pVar.f24142c;
            if (str2 == null) {
                fVar.mo5374d0(3);
            } else {
                fVar.mo5373q(3, str2);
            }
            String str3 = pVar.f24143d;
            if (str3 == null) {
                fVar.mo5374d0(4);
            } else {
                fVar.mo5373q(4, str3);
            }
            byte[] m = C1070b.m38469m(pVar.f24144e);
            if (m == null) {
                fVar.mo5374d0(5);
            } else {
                fVar.mo5375N(5, m);
            }
            byte[] m2 = C1070b.m38469m(pVar.f24145f);
            if (m2 == null) {
                fVar.mo5374d0(6);
            } else {
                fVar.mo5375N(6, m2);
            }
            fVar.mo5376J(7, pVar.f24146g);
            fVar.mo5376J(8, pVar.f24147h);
            fVar.mo5376J(9, pVar.f24148i);
            fVar.mo5376J(10, pVar.f24150k);
            fVar.mo5376J(11, C7574v.m15663a(pVar.f24151l));
            fVar.mo5376J(12, pVar.f24152m);
            fVar.mo5376J(13, pVar.f24153n);
            fVar.mo5376J(14, pVar.f24154o);
            fVar.mo5376J(15, pVar.f24155p);
            fVar.mo5376J(16, pVar.f24156q ? 1L : 0L);
            fVar.mo5376J(17, C7574v.m15655i(pVar.f24157r));
            C4223b bVar = pVar.f24149j;
            if (bVar != null) {
                fVar.mo5376J(18, C7574v.m15656h(bVar.m28394b()));
                fVar.mo5376J(19, bVar.m28389g() ? 1L : 0L);
                fVar.mo5376J(20, bVar.m28388h() ? 1L : 0L);
                fVar.mo5376J(21, bVar.m28390f() ? 1L : 0L);
                fVar.mo5376J(22, bVar.m28387i() ? 1L : 0L);
                fVar.mo5376J(23, bVar.m28393c());
                fVar.mo5376J(24, bVar.m28392d());
                byte[] c = C7574v.m15661c(bVar.m28395a());
                if (c == null) {
                    fVar.mo5374d0(25);
                } else {
                    fVar.mo5375N(25, c);
                }
            } else {
                fVar.mo5374d0(18);
                fVar.mo5374d0(19);
                fVar.mo5374d0(20);
                fVar.mo5374d0(21);
                fVar.mo5374d0(22);
                fVar.mo5374d0(23);
                fVar.mo5374d0(24);
                fVar.mo5374d0(25);
            }
        }
    }

    public class C7562c extends AbstractC9433k {
        public C7562c(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class C7563d extends AbstractC9433k {
        public C7563d(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class C7564e extends AbstractC9433k {
        public C7564e(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    public class C7565f extends AbstractC9433k {
        public C7565f(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class C7566g extends AbstractC9433k {
        public C7566g(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class C7567h extends AbstractC9433k {
        public C7567h(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class C7568i extends AbstractC9433k {
        public C7568i(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class C7569j extends AbstractC9433k {
        public C7569j(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C7559r(AbstractC9421e eVar) {
        this.f24166a = eVar;
        this.f24167b = new C7561b(eVar);
        this.f24168c = new C7562c(eVar);
        this.f24169d = new C7563d(eVar);
        this.f24170e = new C7564e(eVar);
        this.f24171f = new C7565f(eVar);
        this.f24172g = new C7566g(eVar);
        this.f24173h = new C7567h(eVar);
        this.f24174i = new C7568i(eVar);
        this.f24175j = new C7569j(eVar);
    }

    @Override
    public void mo15694a(String str) {
        this.f24166a.m8732b();
        AbstractC10074f a = this.f24168c.m8677a();
        if (str == null) {
            a.mo5374d0(1);
        } else {
            a.mo5373q(1, str);
        }
        this.f24166a.m8731c();
        try {
            a.mo5371u();
            this.f24166a.m8714t();
        } finally {
            this.f24166a.m8727g();
            this.f24168c.m8672f(a);
        }
    }

    @Override
    public int mo15693b(String str, long j) {
        this.f24166a.m8732b();
        AbstractC10074f a = this.f24173h.m8677a();
        a.mo5376J(1, j);
        if (str == null) {
            a.mo5374d0(2);
        } else {
            a.mo5373q(2, str);
        }
        this.f24166a.m8731c();
        try {
            int u = a.mo5371u();
            this.f24166a.m8714t();
            return u;
        } finally {
            this.f24166a.m8727g();
            this.f24173h.m8672f(a);
        }
    }

    @Override
    public List<C7554p.C7556b> mo15692c(String str) {
        C9430h y0 = C9430h.m8682y0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24166a.m8732b();
        Cursor b = C9940c.m6454b(this.f24166a, y0, false, null);
        try {
            int c = C9939b.m6456c(b, "id");
            int c2 = C9939b.m6456c(b, "state");
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                C7554p.C7556b bVar = new C7554p.C7556b();
                bVar.f24158a = b.getString(c);
                bVar.f24159b = C7574v.m15657g(b.getInt(c2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b.close();
            y0.m8683B0();
        }
    }

    @Override
    public List<C7554p> mo15691d(long j) {
        C9430h hVar;
        Throwable th;
        C9430h y0 = C9430h.m8682y0("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        y0.mo5376J(1, j);
        this.f24166a.m8732b();
        Cursor b = C9940c.m6454b(this.f24166a, y0, false, null);
        try {
            int c = C9939b.m6456c(b, "required_network_type");
            int c2 = C9939b.m6456c(b, "requires_charging");
            int c3 = C9939b.m6456c(b, "requires_device_idle");
            int c4 = C9939b.m6456c(b, "requires_battery_not_low");
            int c5 = C9939b.m6456c(b, "requires_storage_not_low");
            int c6 = C9939b.m6456c(b, "trigger_content_update_delay");
            int c7 = C9939b.m6456c(b, "trigger_max_content_delay");
            int c8 = C9939b.m6456c(b, "content_uri_triggers");
            int c9 = C9939b.m6456c(b, "id");
            int c10 = C9939b.m6456c(b, "state");
            int c11 = C9939b.m6456c(b, "worker_class_name");
            int c12 = C9939b.m6456c(b, "input_merger_class_name");
            int c13 = C9939b.m6456c(b, "input");
            int c14 = C9939b.m6456c(b, "output");
            hVar = y0;
            try {
                int c15 = C9939b.m6456c(b, "initial_delay");
                int c16 = C9939b.m6456c(b, "interval_duration");
                int c17 = C9939b.m6456c(b, "flex_duration");
                int c18 = C9939b.m6456c(b, "run_attempt_count");
                int c19 = C9939b.m6456c(b, "backoff_policy");
                int c20 = C9939b.m6456c(b, "backoff_delay_duration");
                int c21 = C9939b.m6456c(b, "period_start_time");
                int c22 = C9939b.m6456c(b, "minimum_retention_duration");
                int c23 = C9939b.m6456c(b, "schedule_requested_at");
                int c24 = C9939b.m6456c(b, "run_in_foreground");
                int c25 = C9939b.m6456c(b, "out_of_quota_policy");
                int i = c14;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(c9);
                    c9 = c9;
                    String string2 = b.getString(c11);
                    c11 = c11;
                    C4223b bVar = new C4223b();
                    int i2 = b.getInt(c);
                    c = c;
                    bVar.m28385k(C7574v.m15659e(i2));
                    bVar.m28383m(b.getInt(c2) != 0);
                    bVar.m28382n(b.getInt(c3) != 0);
                    bVar.m28384l(b.getInt(c4) != 0);
                    bVar.m28381o(b.getInt(c5) != 0);
                    c2 = c2;
                    c3 = c3;
                    bVar.m28380p(b.getLong(c6));
                    bVar.m28379q(b.getLong(c7));
                    bVar.m28386j(C7574v.m15662b(b.getBlob(c8)));
                    C7554p pVar = new C7554p(string, string2);
                    pVar.f24141b = C7574v.m15657g(b.getInt(c10));
                    pVar.f24143d = b.getString(c12);
                    pVar.f24144e = C1070b.m38475g(b.getBlob(c13));
                    int i3 = i;
                    pVar.f24145f = C1070b.m38475g(b.getBlob(i3));
                    int i4 = c15;
                    i = i3;
                    pVar.f24146g = b.getLong(i4);
                    c12 = c12;
                    int i5 = c16;
                    pVar.f24147h = b.getLong(i5);
                    c4 = c4;
                    int i6 = c17;
                    pVar.f24148i = b.getLong(i6);
                    int i7 = c18;
                    pVar.f24150k = b.getInt(i7);
                    int i8 = c19;
                    pVar.f24151l = C7574v.m15660d(b.getInt(i8));
                    c17 = i6;
                    int i9 = c20;
                    pVar.f24152m = b.getLong(i9);
                    int i10 = c21;
                    pVar.f24153n = b.getLong(i10);
                    c21 = i10;
                    int i11 = c22;
                    pVar.f24154o = b.getLong(i11);
                    int i12 = c23;
                    pVar.f24155p = b.getLong(i12);
                    int i13 = c24;
                    pVar.f24156q = b.getInt(i13) != 0;
                    int i14 = c25;
                    pVar.f24157r = C7574v.m15658f(b.getInt(i14));
                    pVar.f24149j = bVar;
                    arrayList.add(pVar);
                    c25 = i14;
                    c15 = i4;
                    c16 = i5;
                    c18 = i7;
                    c23 = i12;
                    c24 = i13;
                    c22 = i11;
                    c20 = i9;
                    c19 = i8;
                }
                b.close();
                hVar.m8683B0();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b.close();
                hVar.m8683B0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = y0;
        }
    }

    @Override
    public List<C7554p> mo15690e(int i) {
        C9430h hVar;
        Throwable th;
        C9430h y0 = C9430h.m8682y0("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        y0.mo5376J(1, i);
        this.f24166a.m8732b();
        Cursor b = C9940c.m6454b(this.f24166a, y0, false, null);
        try {
            int c = C9939b.m6456c(b, "required_network_type");
            int c2 = C9939b.m6456c(b, "requires_charging");
            int c3 = C9939b.m6456c(b, "requires_device_idle");
            int c4 = C9939b.m6456c(b, "requires_battery_not_low");
            int c5 = C9939b.m6456c(b, "requires_storage_not_low");
            int c6 = C9939b.m6456c(b, "trigger_content_update_delay");
            int c7 = C9939b.m6456c(b, "trigger_max_content_delay");
            int c8 = C9939b.m6456c(b, "content_uri_triggers");
            int c9 = C9939b.m6456c(b, "id");
            int c10 = C9939b.m6456c(b, "state");
            int c11 = C9939b.m6456c(b, "worker_class_name");
            int c12 = C9939b.m6456c(b, "input_merger_class_name");
            int c13 = C9939b.m6456c(b, "input");
            int c14 = C9939b.m6456c(b, "output");
            hVar = y0;
            try {
                int c15 = C9939b.m6456c(b, "initial_delay");
                int c16 = C9939b.m6456c(b, "interval_duration");
                int c17 = C9939b.m6456c(b, "flex_duration");
                int c18 = C9939b.m6456c(b, "run_attempt_count");
                int c19 = C9939b.m6456c(b, "backoff_policy");
                int c20 = C9939b.m6456c(b, "backoff_delay_duration");
                int c21 = C9939b.m6456c(b, "period_start_time");
                int c22 = C9939b.m6456c(b, "minimum_retention_duration");
                int c23 = C9939b.m6456c(b, "schedule_requested_at");
                int c24 = C9939b.m6456c(b, "run_in_foreground");
                int c25 = C9939b.m6456c(b, "out_of_quota_policy");
                int i2 = c14;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(c9);
                    c9 = c9;
                    String string2 = b.getString(c11);
                    c11 = c11;
                    C4223b bVar = new C4223b();
                    int i3 = b.getInt(c);
                    c = c;
                    bVar.m28385k(C7574v.m15659e(i3));
                    bVar.m28383m(b.getInt(c2) != 0);
                    bVar.m28382n(b.getInt(c3) != 0);
                    bVar.m28384l(b.getInt(c4) != 0);
                    bVar.m28381o(b.getInt(c5) != 0);
                    c2 = c2;
                    c3 = c3;
                    bVar.m28380p(b.getLong(c6));
                    bVar.m28379q(b.getLong(c7));
                    bVar.m28386j(C7574v.m15662b(b.getBlob(c8)));
                    C7554p pVar = new C7554p(string, string2);
                    pVar.f24141b = C7574v.m15657g(b.getInt(c10));
                    pVar.f24143d = b.getString(c12);
                    pVar.f24144e = C1070b.m38475g(b.getBlob(c13));
                    int i4 = i2;
                    pVar.f24145f = C1070b.m38475g(b.getBlob(i4));
                    i2 = i4;
                    int i5 = c15;
                    pVar.f24146g = b.getLong(i5);
                    c12 = c12;
                    int i6 = c16;
                    pVar.f24147h = b.getLong(i6);
                    c4 = c4;
                    int i7 = c17;
                    pVar.f24148i = b.getLong(i7);
                    int i8 = c18;
                    pVar.f24150k = b.getInt(i8);
                    int i9 = c19;
                    pVar.f24151l = C7574v.m15660d(b.getInt(i9));
                    c17 = i7;
                    int i10 = c20;
                    pVar.f24152m = b.getLong(i10);
                    int i11 = c21;
                    pVar.f24153n = b.getLong(i11);
                    c21 = i11;
                    int i12 = c22;
                    pVar.f24154o = b.getLong(i12);
                    int i13 = c23;
                    pVar.f24155p = b.getLong(i13);
                    int i14 = c24;
                    pVar.f24156q = b.getInt(i14) != 0;
                    int i15 = c25;
                    pVar.f24157r = C7574v.m15658f(b.getInt(i15));
                    pVar.f24149j = bVar;
                    arrayList.add(pVar);
                    c25 = i15;
                    c15 = i5;
                    c16 = i6;
                    c18 = i8;
                    c23 = i13;
                    c24 = i14;
                    c22 = i12;
                    c20 = i10;
                    c19 = i9;
                }
                b.close();
                hVar.m8683B0();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b.close();
                hVar.m8683B0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = y0;
        }
    }

    @Override
    public List<C7554p> mo15689f() {
        C9430h hVar;
        Throwable th;
        C9430h y0 = C9430h.m8682y0("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f24166a.m8732b();
        Cursor b = C9940c.m6454b(this.f24166a, y0, false, null);
        try {
            int c = C9939b.m6456c(b, "required_network_type");
            int c2 = C9939b.m6456c(b, "requires_charging");
            int c3 = C9939b.m6456c(b, "requires_device_idle");
            int c4 = C9939b.m6456c(b, "requires_battery_not_low");
            int c5 = C9939b.m6456c(b, "requires_storage_not_low");
            int c6 = C9939b.m6456c(b, "trigger_content_update_delay");
            int c7 = C9939b.m6456c(b, "trigger_max_content_delay");
            int c8 = C9939b.m6456c(b, "content_uri_triggers");
            int c9 = C9939b.m6456c(b, "id");
            int c10 = C9939b.m6456c(b, "state");
            int c11 = C9939b.m6456c(b, "worker_class_name");
            int c12 = C9939b.m6456c(b, "input_merger_class_name");
            int c13 = C9939b.m6456c(b, "input");
            int c14 = C9939b.m6456c(b, "output");
            hVar = y0;
            try {
                int c15 = C9939b.m6456c(b, "initial_delay");
                int c16 = C9939b.m6456c(b, "interval_duration");
                int c17 = C9939b.m6456c(b, "flex_duration");
                int c18 = C9939b.m6456c(b, "run_attempt_count");
                int c19 = C9939b.m6456c(b, "backoff_policy");
                int c20 = C9939b.m6456c(b, "backoff_delay_duration");
                int c21 = C9939b.m6456c(b, "period_start_time");
                int c22 = C9939b.m6456c(b, "minimum_retention_duration");
                int c23 = C9939b.m6456c(b, "schedule_requested_at");
                int c24 = C9939b.m6456c(b, "run_in_foreground");
                int c25 = C9939b.m6456c(b, "out_of_quota_policy");
                int i = c14;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(c9);
                    c9 = c9;
                    String string2 = b.getString(c11);
                    c11 = c11;
                    C4223b bVar = new C4223b();
                    int i2 = b.getInt(c);
                    c = c;
                    bVar.m28385k(C7574v.m15659e(i2));
                    bVar.m28383m(b.getInt(c2) != 0);
                    bVar.m28382n(b.getInt(c3) != 0);
                    bVar.m28384l(b.getInt(c4) != 0);
                    bVar.m28381o(b.getInt(c5) != 0);
                    c2 = c2;
                    c3 = c3;
                    bVar.m28380p(b.getLong(c6));
                    bVar.m28379q(b.getLong(c7));
                    bVar.m28386j(C7574v.m15662b(b.getBlob(c8)));
                    C7554p pVar = new C7554p(string, string2);
                    pVar.f24141b = C7574v.m15657g(b.getInt(c10));
                    pVar.f24143d = b.getString(c12);
                    pVar.f24144e = C1070b.m38475g(b.getBlob(c13));
                    int i3 = i;
                    pVar.f24145f = C1070b.m38475g(b.getBlob(i3));
                    i = i3;
                    int i4 = c15;
                    pVar.f24146g = b.getLong(i4);
                    c13 = c13;
                    int i5 = c16;
                    pVar.f24147h = b.getLong(i5);
                    c4 = c4;
                    int i6 = c17;
                    pVar.f24148i = b.getLong(i6);
                    int i7 = c18;
                    pVar.f24150k = b.getInt(i7);
                    int i8 = c19;
                    pVar.f24151l = C7574v.m15660d(b.getInt(i8));
                    c17 = i6;
                    int i9 = c20;
                    pVar.f24152m = b.getLong(i9);
                    int i10 = c21;
                    pVar.f24153n = b.getLong(i10);
                    c21 = i10;
                    int i11 = c22;
                    pVar.f24154o = b.getLong(i11);
                    int i12 = c23;
                    pVar.f24155p = b.getLong(i12);
                    int i13 = c24;
                    pVar.f24156q = b.getInt(i13) != 0;
                    int i14 = c25;
                    pVar.f24157r = C7574v.m15658f(b.getInt(i14));
                    pVar.f24149j = bVar;
                    arrayList.add(pVar);
                    c25 = i14;
                    c15 = i4;
                    c16 = i5;
                    c18 = i7;
                    c23 = i12;
                    c24 = i13;
                    c22 = i11;
                    c20 = i9;
                    c19 = i8;
                }
                b.close();
                hVar.m8683B0();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b.close();
                hVar.m8683B0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = y0;
        }
    }

    @Override
    public void mo15688g(String str, C1070b bVar) {
        this.f24166a.m8732b();
        AbstractC10074f a = this.f24169d.m8677a();
        byte[] m = C1070b.m38469m(bVar);
        if (m == null) {
            a.mo5374d0(1);
        } else {
            a.mo5375N(1, m);
        }
        if (str == null) {
            a.mo5374d0(2);
        } else {
            a.mo5373q(2, str);
        }
        this.f24166a.m8731c();
        try {
            a.mo5371u();
            this.f24166a.m8714t();
        } finally {
            this.f24166a.m8727g();
            this.f24169d.m8672f(a);
        }
    }

    @Override
    public void mo15687h(C7554p pVar) {
        this.f24166a.m8732b();
        this.f24166a.m8731c();
        try {
            this.f24167b.m8740h(pVar);
            this.f24166a.m8714t();
        } finally {
            this.f24166a.m8727g();
        }
    }

    @Override
    public LiveData<List<C7554p.C7557c>> mo15686i(String str) {
        C9430h y0 = C9430h.m8682y0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        return this.f24166a.m8725i().m38667d(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new CallableC7560a(y0));
    }

    @Override
    public int mo15685j(C4250s.EnumC4251a aVar, String... strArr) {
        this.f24166a.m8732b();
        StringBuilder b = C9942e.m6450b();
        b.append("UPDATE workspec SET state=");
        b.append("?");
        b.append(" WHERE id IN (");
        C9942e.m6451a(b, strArr.length);
        b.append(")");
        AbstractC10074f d = this.f24166a.m8730d(b.toString());
        d.mo5376J(1, C7574v.m15654j(aVar));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                d.mo5374d0(i);
            } else {
                d.mo5373q(i, str);
            }
            i++;
        }
        this.f24166a.m8731c();
        try {
            int u = d.mo5371u();
            this.f24166a.m8714t();
            return u;
        } finally {
            this.f24166a.m8727g();
        }
    }

    @Override
    public List<C7554p> mo15684k() {
        C9430h hVar;
        Throwable th;
        C9430h y0 = C9430h.m8682y0("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f24166a.m8732b();
        Cursor b = C9940c.m6454b(this.f24166a, y0, false, null);
        try {
            int c = C9939b.m6456c(b, "required_network_type");
            int c2 = C9939b.m6456c(b, "requires_charging");
            int c3 = C9939b.m6456c(b, "requires_device_idle");
            int c4 = C9939b.m6456c(b, "requires_battery_not_low");
            int c5 = C9939b.m6456c(b, "requires_storage_not_low");
            int c6 = C9939b.m6456c(b, "trigger_content_update_delay");
            int c7 = C9939b.m6456c(b, "trigger_max_content_delay");
            int c8 = C9939b.m6456c(b, "content_uri_triggers");
            int c9 = C9939b.m6456c(b, "id");
            int c10 = C9939b.m6456c(b, "state");
            int c11 = C9939b.m6456c(b, "worker_class_name");
            int c12 = C9939b.m6456c(b, "input_merger_class_name");
            int c13 = C9939b.m6456c(b, "input");
            int c14 = C9939b.m6456c(b, "output");
            hVar = y0;
            try {
                int c15 = C9939b.m6456c(b, "initial_delay");
                int c16 = C9939b.m6456c(b, "interval_duration");
                int c17 = C9939b.m6456c(b, "flex_duration");
                int c18 = C9939b.m6456c(b, "run_attempt_count");
                int c19 = C9939b.m6456c(b, "backoff_policy");
                int c20 = C9939b.m6456c(b, "backoff_delay_duration");
                int c21 = C9939b.m6456c(b, "period_start_time");
                int c22 = C9939b.m6456c(b, "minimum_retention_duration");
                int c23 = C9939b.m6456c(b, "schedule_requested_at");
                int c24 = C9939b.m6456c(b, "run_in_foreground");
                int c25 = C9939b.m6456c(b, "out_of_quota_policy");
                int i = c14;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(c9);
                    c9 = c9;
                    String string2 = b.getString(c11);
                    c11 = c11;
                    C4223b bVar = new C4223b();
                    int i2 = b.getInt(c);
                    c = c;
                    bVar.m28385k(C7574v.m15659e(i2));
                    bVar.m28383m(b.getInt(c2) != 0);
                    bVar.m28382n(b.getInt(c3) != 0);
                    bVar.m28384l(b.getInt(c4) != 0);
                    bVar.m28381o(b.getInt(c5) != 0);
                    c2 = c2;
                    c3 = c3;
                    bVar.m28380p(b.getLong(c6));
                    bVar.m28379q(b.getLong(c7));
                    bVar.m28386j(C7574v.m15662b(b.getBlob(c8)));
                    C7554p pVar = new C7554p(string, string2);
                    pVar.f24141b = C7574v.m15657g(b.getInt(c10));
                    pVar.f24143d = b.getString(c12);
                    pVar.f24144e = C1070b.m38475g(b.getBlob(c13));
                    int i3 = i;
                    pVar.f24145f = C1070b.m38475g(b.getBlob(i3));
                    i = i3;
                    int i4 = c15;
                    pVar.f24146g = b.getLong(i4);
                    c13 = c13;
                    int i5 = c16;
                    pVar.f24147h = b.getLong(i5);
                    c4 = c4;
                    int i6 = c17;
                    pVar.f24148i = b.getLong(i6);
                    int i7 = c18;
                    pVar.f24150k = b.getInt(i7);
                    int i8 = c19;
                    pVar.f24151l = C7574v.m15660d(b.getInt(i8));
                    c17 = i6;
                    int i9 = c20;
                    pVar.f24152m = b.getLong(i9);
                    int i10 = c21;
                    pVar.f24153n = b.getLong(i10);
                    c21 = i10;
                    int i11 = c22;
                    pVar.f24154o = b.getLong(i11);
                    int i12 = c23;
                    pVar.f24155p = b.getLong(i12);
                    int i13 = c24;
                    pVar.f24156q = b.getInt(i13) != 0;
                    int i14 = c25;
                    pVar.f24157r = C7574v.m15658f(b.getInt(i14));
                    pVar.f24149j = bVar;
                    arrayList.add(pVar);
                    c25 = i14;
                    c15 = i4;
                    c16 = i5;
                    c18 = i7;
                    c23 = i12;
                    c24 = i13;
                    c22 = i11;
                    c20 = i9;
                    c19 = i8;
                }
                b.close();
                hVar.m8683B0();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b.close();
                hVar.m8683B0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = y0;
        }
    }

    @Override
    public boolean mo15683l() {
        boolean z = false;
        C9430h y0 = C9430h.m8682y0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f24166a.m8732b();
        Cursor b = C9940c.m6454b(this.f24166a, y0, false, null);
        try {
            if (b.moveToFirst()) {
                if (b.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            b.close();
            y0.m8683B0();
        }
    }

    @Override
    public List<String> mo15682m(String str) {
        C9430h y0 = C9430h.m8682y0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24166a.m8732b();
        Cursor b = C9940c.m6454b(this.f24166a, y0, false, null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            y0.m8683B0();
        }
    }

    @Override
    public C4250s.EnumC4251a mo15681n(String str) {
        C9430h y0 = C9430h.m8682y0("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24166a.m8732b();
        C4250s.EnumC4251a aVar = null;
        Cursor b = C9940c.m6454b(this.f24166a, y0, false, null);
        try {
            if (b.moveToFirst()) {
                aVar = C7574v.m15657g(b.getInt(0));
            }
            return aVar;
        } finally {
            b.close();
            y0.m8683B0();
        }
    }

    @Override
    public C7554p mo15680o(String str) {
        C9430h hVar;
        Throwable th;
        C7554p pVar;
        C9430h y0 = C9430h.m8682y0("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24166a.m8732b();
        Cursor b = C9940c.m6454b(this.f24166a, y0, false, null);
        try {
            int c = C9939b.m6456c(b, "required_network_type");
            int c2 = C9939b.m6456c(b, "requires_charging");
            int c3 = C9939b.m6456c(b, "requires_device_idle");
            int c4 = C9939b.m6456c(b, "requires_battery_not_low");
            int c5 = C9939b.m6456c(b, "requires_storage_not_low");
            int c6 = C9939b.m6456c(b, "trigger_content_update_delay");
            int c7 = C9939b.m6456c(b, "trigger_max_content_delay");
            int c8 = C9939b.m6456c(b, "content_uri_triggers");
            int c9 = C9939b.m6456c(b, "id");
            int c10 = C9939b.m6456c(b, "state");
            int c11 = C9939b.m6456c(b, "worker_class_name");
            int c12 = C9939b.m6456c(b, "input_merger_class_name");
            int c13 = C9939b.m6456c(b, "input");
            int c14 = C9939b.m6456c(b, "output");
            hVar = y0;
            try {
                int c15 = C9939b.m6456c(b, "initial_delay");
                int c16 = C9939b.m6456c(b, "interval_duration");
                int c17 = C9939b.m6456c(b, "flex_duration");
                int c18 = C9939b.m6456c(b, "run_attempt_count");
                int c19 = C9939b.m6456c(b, "backoff_policy");
                int c20 = C9939b.m6456c(b, "backoff_delay_duration");
                int c21 = C9939b.m6456c(b, "period_start_time");
                int c22 = C9939b.m6456c(b, "minimum_retention_duration");
                int c23 = C9939b.m6456c(b, "schedule_requested_at");
                int c24 = C9939b.m6456c(b, "run_in_foreground");
                int c25 = C9939b.m6456c(b, "out_of_quota_policy");
                if (b.moveToFirst()) {
                    String string = b.getString(c9);
                    String string2 = b.getString(c11);
                    C4223b bVar = new C4223b();
                    bVar.m28385k(C7574v.m15659e(b.getInt(c)));
                    bVar.m28383m(b.getInt(c2) != 0);
                    bVar.m28382n(b.getInt(c3) != 0);
                    bVar.m28384l(b.getInt(c4) != 0);
                    bVar.m28381o(b.getInt(c5) != 0);
                    bVar.m28380p(b.getLong(c6));
                    bVar.m28379q(b.getLong(c7));
                    bVar.m28386j(C7574v.m15662b(b.getBlob(c8)));
                    C7554p pVar2 = new C7554p(string, string2);
                    pVar2.f24141b = C7574v.m15657g(b.getInt(c10));
                    pVar2.f24143d = b.getString(c12);
                    pVar2.f24144e = C1070b.m38475g(b.getBlob(c13));
                    pVar2.f24145f = C1070b.m38475g(b.getBlob(c14));
                    pVar2.f24146g = b.getLong(c15);
                    pVar2.f24147h = b.getLong(c16);
                    pVar2.f24148i = b.getLong(c17);
                    pVar2.f24150k = b.getInt(c18);
                    pVar2.f24151l = C7574v.m15660d(b.getInt(c19));
                    pVar2.f24152m = b.getLong(c20);
                    pVar2.f24153n = b.getLong(c21);
                    pVar2.f24154o = b.getLong(c22);
                    pVar2.f24155p = b.getLong(c23);
                    pVar2.f24156q = b.getInt(c24) != 0;
                    pVar2.f24157r = C7574v.m15658f(b.getInt(c25));
                    pVar2.f24149j = bVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b.close();
                hVar.m8683B0();
                return pVar;
            } catch (Throwable th2) {
                th = th2;
                b.close();
                hVar.m8683B0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = y0;
        }
    }

    @Override
    public int mo15679p(String str) {
        this.f24166a.m8732b();
        AbstractC10074f a = this.f24172g.m8677a();
        if (str == null) {
            a.mo5374d0(1);
        } else {
            a.mo5373q(1, str);
        }
        this.f24166a.m8731c();
        try {
            int u = a.mo5371u();
            this.f24166a.m8714t();
            return u;
        } finally {
            this.f24166a.m8727g();
            this.f24172g.m8672f(a);
        }
    }

    @Override
    public List<String> mo15678q(String str) {
        C9430h y0 = C9430h.m8682y0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24166a.m8732b();
        Cursor b = C9940c.m6454b(this.f24166a, y0, false, null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            y0.m8683B0();
        }
    }

    @Override
    public List<C1070b> mo15677r(String str) {
        C9430h y0 = C9430h.m8682y0("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24166a.m8732b();
        Cursor b = C9940c.m6454b(this.f24166a, y0, false, null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(C1070b.m38475g(b.getBlob(0)));
            }
            return arrayList;
        } finally {
            b.close();
            y0.m8683B0();
        }
    }

    @Override
    public int mo15676s(String str) {
        this.f24166a.m8732b();
        AbstractC10074f a = this.f24171f.m8677a();
        if (str == null) {
            a.mo5374d0(1);
        } else {
            a.mo5373q(1, str);
        }
        this.f24166a.m8731c();
        try {
            int u = a.mo5371u();
            this.f24166a.m8714t();
            return u;
        } finally {
            this.f24166a.m8727g();
            this.f24171f.m8672f(a);
        }
    }

    @Override
    public void mo15675t(String str, long j) {
        this.f24166a.m8732b();
        AbstractC10074f a = this.f24170e.m8677a();
        a.mo5376J(1, j);
        if (str == null) {
            a.mo5374d0(2);
        } else {
            a.mo5373q(2, str);
        }
        this.f24166a.m8731c();
        try {
            a.mo5371u();
            this.f24166a.m8714t();
        } finally {
            this.f24166a.m8727g();
            this.f24170e.m8672f(a);
        }
    }

    @Override
    public List<C7554p> mo15674u(int i) {
        C9430h hVar;
        Throwable th;
        C9430h y0 = C9430h.m8682y0("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        y0.mo5376J(1, i);
        this.f24166a.m8732b();
        Cursor b = C9940c.m6454b(this.f24166a, y0, false, null);
        try {
            int c = C9939b.m6456c(b, "required_network_type");
            int c2 = C9939b.m6456c(b, "requires_charging");
            int c3 = C9939b.m6456c(b, "requires_device_idle");
            int c4 = C9939b.m6456c(b, "requires_battery_not_low");
            int c5 = C9939b.m6456c(b, "requires_storage_not_low");
            int c6 = C9939b.m6456c(b, "trigger_content_update_delay");
            int c7 = C9939b.m6456c(b, "trigger_max_content_delay");
            int c8 = C9939b.m6456c(b, "content_uri_triggers");
            int c9 = C9939b.m6456c(b, "id");
            int c10 = C9939b.m6456c(b, "state");
            int c11 = C9939b.m6456c(b, "worker_class_name");
            int c12 = C9939b.m6456c(b, "input_merger_class_name");
            int c13 = C9939b.m6456c(b, "input");
            int c14 = C9939b.m6456c(b, "output");
            hVar = y0;
            try {
                int c15 = C9939b.m6456c(b, "initial_delay");
                int c16 = C9939b.m6456c(b, "interval_duration");
                int c17 = C9939b.m6456c(b, "flex_duration");
                int c18 = C9939b.m6456c(b, "run_attempt_count");
                int c19 = C9939b.m6456c(b, "backoff_policy");
                int c20 = C9939b.m6456c(b, "backoff_delay_duration");
                int c21 = C9939b.m6456c(b, "period_start_time");
                int c22 = C9939b.m6456c(b, "minimum_retention_duration");
                int c23 = C9939b.m6456c(b, "schedule_requested_at");
                int c24 = C9939b.m6456c(b, "run_in_foreground");
                int c25 = C9939b.m6456c(b, "out_of_quota_policy");
                int i2 = c14;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(c9);
                    c9 = c9;
                    String string2 = b.getString(c11);
                    c11 = c11;
                    C4223b bVar = new C4223b();
                    int i3 = b.getInt(c);
                    c = c;
                    bVar.m28385k(C7574v.m15659e(i3));
                    bVar.m28383m(b.getInt(c2) != 0);
                    bVar.m28382n(b.getInt(c3) != 0);
                    bVar.m28384l(b.getInt(c4) != 0);
                    bVar.m28381o(b.getInt(c5) != 0);
                    c2 = c2;
                    c3 = c3;
                    bVar.m28380p(b.getLong(c6));
                    bVar.m28379q(b.getLong(c7));
                    bVar.m28386j(C7574v.m15662b(b.getBlob(c8)));
                    C7554p pVar = new C7554p(string, string2);
                    pVar.f24141b = C7574v.m15657g(b.getInt(c10));
                    pVar.f24143d = b.getString(c12);
                    pVar.f24144e = C1070b.m38475g(b.getBlob(c13));
                    int i4 = i2;
                    pVar.f24145f = C1070b.m38475g(b.getBlob(i4));
                    i2 = i4;
                    int i5 = c15;
                    pVar.f24146g = b.getLong(i5);
                    c12 = c12;
                    int i6 = c16;
                    pVar.f24147h = b.getLong(i6);
                    c4 = c4;
                    int i7 = c17;
                    pVar.f24148i = b.getLong(i7);
                    int i8 = c18;
                    pVar.f24150k = b.getInt(i8);
                    int i9 = c19;
                    pVar.f24151l = C7574v.m15660d(b.getInt(i9));
                    c17 = i7;
                    int i10 = c20;
                    pVar.f24152m = b.getLong(i10);
                    int i11 = c21;
                    pVar.f24153n = b.getLong(i11);
                    c21 = i11;
                    int i12 = c22;
                    pVar.f24154o = b.getLong(i12);
                    int i13 = c23;
                    pVar.f24155p = b.getLong(i13);
                    int i14 = c24;
                    pVar.f24156q = b.getInt(i14) != 0;
                    int i15 = c25;
                    pVar.f24157r = C7574v.m15658f(b.getInt(i15));
                    pVar.f24149j = bVar;
                    arrayList.add(pVar);
                    c25 = i15;
                    c15 = i5;
                    c16 = i6;
                    c18 = i8;
                    c23 = i13;
                    c24 = i14;
                    c22 = i12;
                    c20 = i10;
                    c19 = i9;
                }
                b.close();
                hVar.m8683B0();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b.close();
                hVar.m8683B0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = y0;
        }
    }

    @Override
    public int mo15673v() {
        this.f24166a.m8732b();
        AbstractC10074f a = this.f24174i.m8677a();
        this.f24166a.m8731c();
        try {
            int u = a.mo5371u();
            this.f24166a.m8714t();
            return u;
        } finally {
            this.f24166a.m8727g();
            this.f24174i.m8672f(a);
        }
    }

    public final void m15672w(C6024a<String, ArrayList<C1070b>> aVar) {
        ArrayList<C1070b> arrayList;
        int i;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                C6024a<String, ArrayList<C1070b>> aVar2 = new C6024a<>(999);
                int size = aVar.size();
                int i2 = 0;
                loop0: while (true) {
                    i = 0;
                    while (i2 < size) {
                        aVar2.put(aVar.m21479i(i2), aVar.m21476l(i2));
                        i2++;
                        i++;
                        if (i == 999) {
                            break;
                        }
                    }
                    m15672w(aVar2);
                    aVar2 = new C6024a<>(999);
                }
                if (i > 0) {
                    m15672w(aVar2);
                    return;
                }
                return;
            }
            StringBuilder b = C9942e.m6450b();
            b.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C9942e.m6451a(b, size2);
            b.append(")");
            C9430h y0 = C9430h.m8682y0(b.toString(), size2 + 0);
            int i3 = 1;
            for (String str : keySet) {
                if (str == null) {
                    y0.mo5374d0(i3);
                } else {
                    y0.mo5373q(i3, str);
                }
                i3++;
            }
            Cursor b2 = C9940c.m6454b(this.f24166a, y0, false, null);
            try {
                int b3 = C9939b.m6457b(b2, "work_spec_id");
                if (b3 != -1) {
                    while (b2.moveToNext()) {
                        if (!b2.isNull(b3) && (arrayList = aVar.get(b2.getString(b3))) != null) {
                            arrayList.add(C1070b.m38475g(b2.getBlob(0)));
                        }
                    }
                }
            } finally {
                b2.close();
            }
        }
    }

    public final void m15671x(C6024a<String, ArrayList<String>> aVar) {
        ArrayList<String> arrayList;
        int i;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                C6024a<String, ArrayList<String>> aVar2 = new C6024a<>(999);
                int size = aVar.size();
                int i2 = 0;
                loop0: while (true) {
                    i = 0;
                    while (i2 < size) {
                        aVar2.put(aVar.m21479i(i2), aVar.m21476l(i2));
                        i2++;
                        i++;
                        if (i == 999) {
                            break;
                        }
                    }
                    m15671x(aVar2);
                    aVar2 = new C6024a<>(999);
                }
                if (i > 0) {
                    m15671x(aVar2);
                    return;
                }
                return;
            }
            StringBuilder b = C9942e.m6450b();
            b.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C9942e.m6451a(b, size2);
            b.append(")");
            C9430h y0 = C9430h.m8682y0(b.toString(), size2 + 0);
            int i3 = 1;
            for (String str : keySet) {
                if (str == null) {
                    y0.mo5374d0(i3);
                } else {
                    y0.mo5373q(i3, str);
                }
                i3++;
            }
            Cursor b2 = C9940c.m6454b(this.f24166a, y0, false, null);
            try {
                int b3 = C9939b.m6457b(b2, "work_spec_id");
                if (b3 != -1) {
                    while (b2.moveToNext()) {
                        if (!b2.isNull(b3) && (arrayList = aVar.get(b2.getString(b3))) != null) {
                            arrayList.add(b2.getString(0));
                        }
                    }
                }
            } finally {
                b2.close();
            }
        }
    }
}
