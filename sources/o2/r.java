package o2;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import f2.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import o2.p;
import u1.k;

public final class r implements q {
    public final u1.e f18616a;
    public final u1.b<p> f18617b;
    public final k f18618c;
    public final k f18619d;
    public final k f18620e;
    public final k f18621f;
    public final k f18622g;
    public final k f18623h;
    public final k f18624i;
    public final k f18625j;

    public class a implements Callable<List<p.c>> {
        public final u1.h f18626a;

        public a(u1.h hVar) {
            this.f18626a = hVar;
        }

        public List<p.c> call() {
            r.this.f18616a.c();
            try {
                Cursor b10 = w1.c.b(r.this.f18616a, this.f18626a, true, null);
                int c10 = w1.b.c(b10, "id");
                int c11 = w1.b.c(b10, "state");
                int c12 = w1.b.c(b10, "output");
                int c13 = w1.b.c(b10, "run_attempt_count");
                k0.a aVar = new k0.a();
                k0.a aVar2 = new k0.a();
                while (b10.moveToNext()) {
                    if (!b10.isNull(c10)) {
                        String string = b10.getString(c10);
                        if (((ArrayList) aVar.get(string)) == null) {
                            aVar.put(string, new ArrayList());
                        }
                    }
                    if (!b10.isNull(c10)) {
                        String string2 = b10.getString(c10);
                        if (((ArrayList) aVar2.get(string2)) == null) {
                            aVar2.put(string2, new ArrayList());
                        }
                    }
                }
                b10.moveToPosition(-1);
                r.this.x(aVar);
                r.this.w(aVar2);
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    ArrayList arrayList2 = !b10.isNull(c10) ? (ArrayList) aVar.get(b10.getString(c10)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !b10.isNull(c10) ? (ArrayList) aVar2.get(b10.getString(c10)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    p.c cVar = new p.c();
                    cVar.f18610a = b10.getString(c10);
                    cVar.f18611b = v.g(b10.getInt(c11));
                    cVar.f18612c = androidx.work.b.g(b10.getBlob(c12));
                    cVar.f18613d = b10.getInt(c13);
                    cVar.f18614e = arrayList2;
                    cVar.f18615f = arrayList3;
                    arrayList.add(cVar);
                }
                r.this.f18616a.t();
                b10.close();
                return arrayList;
            } finally {
                r.this.f18616a.g();
            }
        }

        public void finalize() {
            this.f18626a.B0();
        }
    }

    public class b extends u1.b<p> {
        public b(u1.e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        public void g(x1.f fVar, p pVar) {
            String str = pVar.f18590a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.q(1, str);
            }
            fVar.K(2, v.j(pVar.f18591b));
            String str2 = pVar.f18592c;
            if (str2 == null) {
                fVar.f0(3);
            } else {
                fVar.q(3, str2);
            }
            String str3 = pVar.f18593d;
            if (str3 == null) {
                fVar.f0(4);
            } else {
                fVar.q(4, str3);
            }
            byte[] m10 = androidx.work.b.m(pVar.f18594e);
            if (m10 == null) {
                fVar.f0(5);
            } else {
                fVar.O(5, m10);
            }
            byte[] m11 = androidx.work.b.m(pVar.f18595f);
            if (m11 == null) {
                fVar.f0(6);
            } else {
                fVar.O(6, m11);
            }
            fVar.K(7, pVar.f18596g);
            fVar.K(8, pVar.f18597h);
            fVar.K(9, pVar.f18598i);
            fVar.K(10, pVar.f18600k);
            fVar.K(11, v.a(pVar.f18601l));
            fVar.K(12, pVar.f18602m);
            fVar.K(13, pVar.f18603n);
            fVar.K(14, pVar.f18604o);
            fVar.K(15, pVar.f18605p);
            fVar.K(16, pVar.f18606q ? 1L : 0L);
            fVar.K(17, v.i(pVar.f18607r));
            f2.b bVar = pVar.f18599j;
            if (bVar != null) {
                fVar.K(18, v.h(bVar.b()));
                fVar.K(19, bVar.g() ? 1L : 0L);
                fVar.K(20, bVar.h() ? 1L : 0L);
                fVar.K(21, bVar.f() ? 1L : 0L);
                fVar.K(22, bVar.i() ? 1L : 0L);
                fVar.K(23, bVar.c());
                fVar.K(24, bVar.d());
                byte[] c10 = v.c(bVar.a());
                if (c10 == null) {
                    fVar.f0(25);
                } else {
                    fVar.O(25, c10);
                }
            } else {
                fVar.f0(18);
                fVar.f0(19);
                fVar.f0(20);
                fVar.f0(21);
                fVar.f0(22);
                fVar.f0(23);
                fVar.f0(24);
                fVar.f0(25);
            }
        }
    }

    public class c extends k {
        public c(u1.e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class d extends k {
        public d(u1.e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class e extends k {
        public e(u1.e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    public class f extends k {
        public f(u1.e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class g extends k {
        public g(u1.e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class h extends k {
        public h(u1.e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class i extends k {
        public i(u1.e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class j extends k {
        public j(u1.e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(u1.e eVar) {
        this.f18616a = eVar;
        this.f18617b = new b(eVar);
        this.f18618c = new c(eVar);
        this.f18619d = new d(eVar);
        this.f18620e = new e(eVar);
        this.f18621f = new f(eVar);
        this.f18622g = new g(eVar);
        this.f18623h = new h(eVar);
        this.f18624i = new i(eVar);
        this.f18625j = new j(eVar);
    }

    @Override
    public void a(String str) {
        this.f18616a.b();
        x1.f a10 = this.f18618c.a();
        if (str == null) {
            a10.f0(1);
        } else {
            a10.q(1, str);
        }
        this.f18616a.c();
        try {
            a10.t();
            this.f18616a.t();
        } finally {
            this.f18616a.g();
            this.f18618c.f(a10);
        }
    }

    @Override
    public int b(String str, long j10) {
        this.f18616a.b();
        x1.f a10 = this.f18623h.a();
        a10.K(1, j10);
        if (str == null) {
            a10.f0(2);
        } else {
            a10.q(2, str);
        }
        this.f18616a.c();
        try {
            int t10 = a10.t();
            this.f18616a.t();
            return t10;
        } finally {
            this.f18616a.g();
            this.f18623h.f(a10);
        }
    }

    @Override
    public List<p.b> c(String str) {
        u1.h y02 = u1.h.y0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18616a.b();
        Cursor b10 = w1.c.b(this.f18616a, y02, false, null);
        try {
            int c10 = w1.b.c(b10, "id");
            int c11 = w1.b.c(b10, "state");
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f18608a = b10.getString(c10);
                bVar.f18609b = v.g(b10.getInt(c11));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b10.close();
            y02.B0();
        }
    }

    @Override
    public List<p> d(long j10) {
        u1.h hVar;
        Throwable th;
        u1.h y02 = u1.h.y0("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        y02.K(1, j10);
        this.f18616a.b();
        Cursor b10 = w1.c.b(this.f18616a, y02, false, null);
        try {
            int c10 = w1.b.c(b10, "required_network_type");
            int c11 = w1.b.c(b10, "requires_charging");
            int c12 = w1.b.c(b10, "requires_device_idle");
            int c13 = w1.b.c(b10, "requires_battery_not_low");
            int c14 = w1.b.c(b10, "requires_storage_not_low");
            int c15 = w1.b.c(b10, "trigger_content_update_delay");
            int c16 = w1.b.c(b10, "trigger_max_content_delay");
            int c17 = w1.b.c(b10, "content_uri_triggers");
            int c18 = w1.b.c(b10, "id");
            int c19 = w1.b.c(b10, "state");
            int c20 = w1.b.c(b10, "worker_class_name");
            int c21 = w1.b.c(b10, "input_merger_class_name");
            int c22 = w1.b.c(b10, "input");
            int c23 = w1.b.c(b10, "output");
            hVar = y02;
            try {
                int c24 = w1.b.c(b10, "initial_delay");
                int c25 = w1.b.c(b10, "interval_duration");
                int c26 = w1.b.c(b10, "flex_duration");
                int c27 = w1.b.c(b10, "run_attempt_count");
                int c28 = w1.b.c(b10, "backoff_policy");
                int c29 = w1.b.c(b10, "backoff_delay_duration");
                int c30 = w1.b.c(b10, "period_start_time");
                int c31 = w1.b.c(b10, "minimum_retention_duration");
                int c32 = w1.b.c(b10, "schedule_requested_at");
                int c33 = w1.b.c(b10, "run_in_foreground");
                int c34 = w1.b.c(b10, "out_of_quota_policy");
                int i10 = c23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(c18);
                    c18 = c18;
                    String string2 = b10.getString(c20);
                    c20 = c20;
                    f2.b bVar = new f2.b();
                    int i11 = b10.getInt(c10);
                    c10 = c10;
                    bVar.k(v.e(i11));
                    bVar.m(b10.getInt(c11) != 0);
                    bVar.n(b10.getInt(c12) != 0);
                    bVar.l(b10.getInt(c13) != 0);
                    bVar.o(b10.getInt(c14) != 0);
                    c11 = c11;
                    c12 = c12;
                    bVar.p(b10.getLong(c15));
                    bVar.q(b10.getLong(c16));
                    bVar.j(v.b(b10.getBlob(c17)));
                    p pVar = new p(string, string2);
                    pVar.f18591b = v.g(b10.getInt(c19));
                    pVar.f18593d = b10.getString(c21);
                    pVar.f18594e = androidx.work.b.g(b10.getBlob(c22));
                    int i12 = i10;
                    pVar.f18595f = androidx.work.b.g(b10.getBlob(i12));
                    int i13 = c24;
                    i10 = i12;
                    pVar.f18596g = b10.getLong(i13);
                    c21 = c21;
                    int i14 = c25;
                    pVar.f18597h = b10.getLong(i14);
                    c13 = c13;
                    int i15 = c26;
                    pVar.f18598i = b10.getLong(i15);
                    int i16 = c27;
                    pVar.f18600k = b10.getInt(i16);
                    int i17 = c28;
                    pVar.f18601l = v.d(b10.getInt(i17));
                    c26 = i15;
                    int i18 = c29;
                    pVar.f18602m = b10.getLong(i18);
                    int i19 = c30;
                    pVar.f18603n = b10.getLong(i19);
                    c30 = i19;
                    int i20 = c31;
                    pVar.f18604o = b10.getLong(i20);
                    int i21 = c32;
                    pVar.f18605p = b10.getLong(i21);
                    int i22 = c33;
                    pVar.f18606q = b10.getInt(i22) != 0;
                    int i23 = c34;
                    pVar.f18607r = v.f(b10.getInt(i23));
                    pVar.f18599j = bVar;
                    arrayList.add(pVar);
                    c34 = i23;
                    c24 = i13;
                    c25 = i14;
                    c27 = i16;
                    c32 = i21;
                    c33 = i22;
                    c31 = i20;
                    c29 = i18;
                    c28 = i17;
                }
                b10.close();
                hVar.B0();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                hVar.B0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = y02;
        }
    }

    @Override
    public List<p> e(int i10) {
        u1.h hVar;
        Throwable th;
        u1.h y02 = u1.h.y0("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        y02.K(1, i10);
        this.f18616a.b();
        Cursor b10 = w1.c.b(this.f18616a, y02, false, null);
        try {
            int c10 = w1.b.c(b10, "required_network_type");
            int c11 = w1.b.c(b10, "requires_charging");
            int c12 = w1.b.c(b10, "requires_device_idle");
            int c13 = w1.b.c(b10, "requires_battery_not_low");
            int c14 = w1.b.c(b10, "requires_storage_not_low");
            int c15 = w1.b.c(b10, "trigger_content_update_delay");
            int c16 = w1.b.c(b10, "trigger_max_content_delay");
            int c17 = w1.b.c(b10, "content_uri_triggers");
            int c18 = w1.b.c(b10, "id");
            int c19 = w1.b.c(b10, "state");
            int c20 = w1.b.c(b10, "worker_class_name");
            int c21 = w1.b.c(b10, "input_merger_class_name");
            int c22 = w1.b.c(b10, "input");
            int c23 = w1.b.c(b10, "output");
            hVar = y02;
            try {
                int c24 = w1.b.c(b10, "initial_delay");
                int c25 = w1.b.c(b10, "interval_duration");
                int c26 = w1.b.c(b10, "flex_duration");
                int c27 = w1.b.c(b10, "run_attempt_count");
                int c28 = w1.b.c(b10, "backoff_policy");
                int c29 = w1.b.c(b10, "backoff_delay_duration");
                int c30 = w1.b.c(b10, "period_start_time");
                int c31 = w1.b.c(b10, "minimum_retention_duration");
                int c32 = w1.b.c(b10, "schedule_requested_at");
                int c33 = w1.b.c(b10, "run_in_foreground");
                int c34 = w1.b.c(b10, "out_of_quota_policy");
                int i11 = c23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(c18);
                    c18 = c18;
                    String string2 = b10.getString(c20);
                    c20 = c20;
                    f2.b bVar = new f2.b();
                    int i12 = b10.getInt(c10);
                    c10 = c10;
                    bVar.k(v.e(i12));
                    bVar.m(b10.getInt(c11) != 0);
                    bVar.n(b10.getInt(c12) != 0);
                    bVar.l(b10.getInt(c13) != 0);
                    bVar.o(b10.getInt(c14) != 0);
                    c11 = c11;
                    c12 = c12;
                    bVar.p(b10.getLong(c15));
                    bVar.q(b10.getLong(c16));
                    bVar.j(v.b(b10.getBlob(c17)));
                    p pVar = new p(string, string2);
                    pVar.f18591b = v.g(b10.getInt(c19));
                    pVar.f18593d = b10.getString(c21);
                    pVar.f18594e = androidx.work.b.g(b10.getBlob(c22));
                    int i13 = i11;
                    pVar.f18595f = androidx.work.b.g(b10.getBlob(i13));
                    i11 = i13;
                    int i14 = c24;
                    pVar.f18596g = b10.getLong(i14);
                    c21 = c21;
                    int i15 = c25;
                    pVar.f18597h = b10.getLong(i15);
                    c13 = c13;
                    int i16 = c26;
                    pVar.f18598i = b10.getLong(i16);
                    int i17 = c27;
                    pVar.f18600k = b10.getInt(i17);
                    int i18 = c28;
                    pVar.f18601l = v.d(b10.getInt(i18));
                    c26 = i16;
                    int i19 = c29;
                    pVar.f18602m = b10.getLong(i19);
                    int i20 = c30;
                    pVar.f18603n = b10.getLong(i20);
                    c30 = i20;
                    int i21 = c31;
                    pVar.f18604o = b10.getLong(i21);
                    int i22 = c32;
                    pVar.f18605p = b10.getLong(i22);
                    int i23 = c33;
                    pVar.f18606q = b10.getInt(i23) != 0;
                    int i24 = c34;
                    pVar.f18607r = v.f(b10.getInt(i24));
                    pVar.f18599j = bVar;
                    arrayList.add(pVar);
                    c34 = i24;
                    c24 = i14;
                    c25 = i15;
                    c27 = i17;
                    c32 = i22;
                    c33 = i23;
                    c31 = i21;
                    c29 = i19;
                    c28 = i18;
                }
                b10.close();
                hVar.B0();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                hVar.B0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = y02;
        }
    }

    @Override
    public List<p> f() {
        u1.h hVar;
        Throwable th;
        u1.h y02 = u1.h.y0("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f18616a.b();
        Cursor b10 = w1.c.b(this.f18616a, y02, false, null);
        try {
            int c10 = w1.b.c(b10, "required_network_type");
            int c11 = w1.b.c(b10, "requires_charging");
            int c12 = w1.b.c(b10, "requires_device_idle");
            int c13 = w1.b.c(b10, "requires_battery_not_low");
            int c14 = w1.b.c(b10, "requires_storage_not_low");
            int c15 = w1.b.c(b10, "trigger_content_update_delay");
            int c16 = w1.b.c(b10, "trigger_max_content_delay");
            int c17 = w1.b.c(b10, "content_uri_triggers");
            int c18 = w1.b.c(b10, "id");
            int c19 = w1.b.c(b10, "state");
            int c20 = w1.b.c(b10, "worker_class_name");
            int c21 = w1.b.c(b10, "input_merger_class_name");
            int c22 = w1.b.c(b10, "input");
            int c23 = w1.b.c(b10, "output");
            hVar = y02;
            try {
                int c24 = w1.b.c(b10, "initial_delay");
                int c25 = w1.b.c(b10, "interval_duration");
                int c26 = w1.b.c(b10, "flex_duration");
                int c27 = w1.b.c(b10, "run_attempt_count");
                int c28 = w1.b.c(b10, "backoff_policy");
                int c29 = w1.b.c(b10, "backoff_delay_duration");
                int c30 = w1.b.c(b10, "period_start_time");
                int c31 = w1.b.c(b10, "minimum_retention_duration");
                int c32 = w1.b.c(b10, "schedule_requested_at");
                int c33 = w1.b.c(b10, "run_in_foreground");
                int c34 = w1.b.c(b10, "out_of_quota_policy");
                int i10 = c23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(c18);
                    c18 = c18;
                    String string2 = b10.getString(c20);
                    c20 = c20;
                    f2.b bVar = new f2.b();
                    int i11 = b10.getInt(c10);
                    c10 = c10;
                    bVar.k(v.e(i11));
                    bVar.m(b10.getInt(c11) != 0);
                    bVar.n(b10.getInt(c12) != 0);
                    bVar.l(b10.getInt(c13) != 0);
                    bVar.o(b10.getInt(c14) != 0);
                    c11 = c11;
                    c12 = c12;
                    bVar.p(b10.getLong(c15));
                    bVar.q(b10.getLong(c16));
                    bVar.j(v.b(b10.getBlob(c17)));
                    p pVar = new p(string, string2);
                    pVar.f18591b = v.g(b10.getInt(c19));
                    pVar.f18593d = b10.getString(c21);
                    pVar.f18594e = androidx.work.b.g(b10.getBlob(c22));
                    int i12 = i10;
                    pVar.f18595f = androidx.work.b.g(b10.getBlob(i12));
                    i10 = i12;
                    int i13 = c24;
                    pVar.f18596g = b10.getLong(i13);
                    c22 = c22;
                    int i14 = c25;
                    pVar.f18597h = b10.getLong(i14);
                    c13 = c13;
                    int i15 = c26;
                    pVar.f18598i = b10.getLong(i15);
                    int i16 = c27;
                    pVar.f18600k = b10.getInt(i16);
                    int i17 = c28;
                    pVar.f18601l = v.d(b10.getInt(i17));
                    c26 = i15;
                    int i18 = c29;
                    pVar.f18602m = b10.getLong(i18);
                    int i19 = c30;
                    pVar.f18603n = b10.getLong(i19);
                    c30 = i19;
                    int i20 = c31;
                    pVar.f18604o = b10.getLong(i20);
                    int i21 = c32;
                    pVar.f18605p = b10.getLong(i21);
                    int i22 = c33;
                    pVar.f18606q = b10.getInt(i22) != 0;
                    int i23 = c34;
                    pVar.f18607r = v.f(b10.getInt(i23));
                    pVar.f18599j = bVar;
                    arrayList.add(pVar);
                    c34 = i23;
                    c24 = i13;
                    c25 = i14;
                    c27 = i16;
                    c32 = i21;
                    c33 = i22;
                    c31 = i20;
                    c29 = i18;
                    c28 = i17;
                }
                b10.close();
                hVar.B0();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                hVar.B0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = y02;
        }
    }

    @Override
    public void g(String str, androidx.work.b bVar) {
        this.f18616a.b();
        x1.f a10 = this.f18619d.a();
        byte[] m10 = androidx.work.b.m(bVar);
        if (m10 == null) {
            a10.f0(1);
        } else {
            a10.O(1, m10);
        }
        if (str == null) {
            a10.f0(2);
        } else {
            a10.q(2, str);
        }
        this.f18616a.c();
        try {
            a10.t();
            this.f18616a.t();
        } finally {
            this.f18616a.g();
            this.f18619d.f(a10);
        }
    }

    @Override
    public void h(p pVar) {
        this.f18616a.b();
        this.f18616a.c();
        try {
            this.f18617b.h(pVar);
            this.f18616a.t();
        } finally {
            this.f18616a.g();
        }
    }

    @Override
    public LiveData<List<p.c>> i(String str) {
        u1.h y02 = u1.h.y0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        return this.f18616a.i().d(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new a(y02));
    }

    @Override
    public int j(s.a aVar, String... strArr) {
        this.f18616a.b();
        StringBuilder b10 = w1.e.b();
        b10.append("UPDATE workspec SET state=");
        b10.append("?");
        b10.append(" WHERE id IN (");
        w1.e.a(b10, strArr.length);
        b10.append(")");
        x1.f d10 = this.f18616a.d(b10.toString());
        d10.K(1, v.j(aVar));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                d10.f0(i10);
            } else {
                d10.q(i10, str);
            }
            i10++;
        }
        this.f18616a.c();
        try {
            int t10 = d10.t();
            this.f18616a.t();
            return t10;
        } finally {
            this.f18616a.g();
        }
    }

    @Override
    public List<p> k() {
        u1.h hVar;
        Throwable th;
        u1.h y02 = u1.h.y0("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f18616a.b();
        Cursor b10 = w1.c.b(this.f18616a, y02, false, null);
        try {
            int c10 = w1.b.c(b10, "required_network_type");
            int c11 = w1.b.c(b10, "requires_charging");
            int c12 = w1.b.c(b10, "requires_device_idle");
            int c13 = w1.b.c(b10, "requires_battery_not_low");
            int c14 = w1.b.c(b10, "requires_storage_not_low");
            int c15 = w1.b.c(b10, "trigger_content_update_delay");
            int c16 = w1.b.c(b10, "trigger_max_content_delay");
            int c17 = w1.b.c(b10, "content_uri_triggers");
            int c18 = w1.b.c(b10, "id");
            int c19 = w1.b.c(b10, "state");
            int c20 = w1.b.c(b10, "worker_class_name");
            int c21 = w1.b.c(b10, "input_merger_class_name");
            int c22 = w1.b.c(b10, "input");
            int c23 = w1.b.c(b10, "output");
            hVar = y02;
            try {
                int c24 = w1.b.c(b10, "initial_delay");
                int c25 = w1.b.c(b10, "interval_duration");
                int c26 = w1.b.c(b10, "flex_duration");
                int c27 = w1.b.c(b10, "run_attempt_count");
                int c28 = w1.b.c(b10, "backoff_policy");
                int c29 = w1.b.c(b10, "backoff_delay_duration");
                int c30 = w1.b.c(b10, "period_start_time");
                int c31 = w1.b.c(b10, "minimum_retention_duration");
                int c32 = w1.b.c(b10, "schedule_requested_at");
                int c33 = w1.b.c(b10, "run_in_foreground");
                int c34 = w1.b.c(b10, "out_of_quota_policy");
                int i10 = c23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(c18);
                    c18 = c18;
                    String string2 = b10.getString(c20);
                    c20 = c20;
                    f2.b bVar = new f2.b();
                    int i11 = b10.getInt(c10);
                    c10 = c10;
                    bVar.k(v.e(i11));
                    bVar.m(b10.getInt(c11) != 0);
                    bVar.n(b10.getInt(c12) != 0);
                    bVar.l(b10.getInt(c13) != 0);
                    bVar.o(b10.getInt(c14) != 0);
                    c11 = c11;
                    c12 = c12;
                    bVar.p(b10.getLong(c15));
                    bVar.q(b10.getLong(c16));
                    bVar.j(v.b(b10.getBlob(c17)));
                    p pVar = new p(string, string2);
                    pVar.f18591b = v.g(b10.getInt(c19));
                    pVar.f18593d = b10.getString(c21);
                    pVar.f18594e = androidx.work.b.g(b10.getBlob(c22));
                    int i12 = i10;
                    pVar.f18595f = androidx.work.b.g(b10.getBlob(i12));
                    i10 = i12;
                    int i13 = c24;
                    pVar.f18596g = b10.getLong(i13);
                    c22 = c22;
                    int i14 = c25;
                    pVar.f18597h = b10.getLong(i14);
                    c13 = c13;
                    int i15 = c26;
                    pVar.f18598i = b10.getLong(i15);
                    int i16 = c27;
                    pVar.f18600k = b10.getInt(i16);
                    int i17 = c28;
                    pVar.f18601l = v.d(b10.getInt(i17));
                    c26 = i15;
                    int i18 = c29;
                    pVar.f18602m = b10.getLong(i18);
                    int i19 = c30;
                    pVar.f18603n = b10.getLong(i19);
                    c30 = i19;
                    int i20 = c31;
                    pVar.f18604o = b10.getLong(i20);
                    int i21 = c32;
                    pVar.f18605p = b10.getLong(i21);
                    int i22 = c33;
                    pVar.f18606q = b10.getInt(i22) != 0;
                    int i23 = c34;
                    pVar.f18607r = v.f(b10.getInt(i23));
                    pVar.f18599j = bVar;
                    arrayList.add(pVar);
                    c34 = i23;
                    c24 = i13;
                    c25 = i14;
                    c27 = i16;
                    c32 = i21;
                    c33 = i22;
                    c31 = i20;
                    c29 = i18;
                    c28 = i17;
                }
                b10.close();
                hVar.B0();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                hVar.B0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = y02;
        }
    }

    @Override
    public boolean l() {
        boolean z10 = false;
        u1.h y02 = u1.h.y0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f18616a.b();
        Cursor b10 = w1.c.b(this.f18616a, y02, false, null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            b10.close();
            y02.B0();
        }
    }

    @Override
    public List<String> m(String str) {
        u1.h y02 = u1.h.y0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18616a.b();
        Cursor b10 = w1.c.b(this.f18616a, y02, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            y02.B0();
        }
    }

    @Override
    public s.a n(String str) {
        u1.h y02 = u1.h.y0("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18616a.b();
        s.a aVar = null;
        Cursor b10 = w1.c.b(this.f18616a, y02, false, null);
        try {
            if (b10.moveToFirst()) {
                aVar = v.g(b10.getInt(0));
            }
            return aVar;
        } finally {
            b10.close();
            y02.B0();
        }
    }

    @Override
    public p o(String str) {
        u1.h hVar;
        Throwable th;
        p pVar;
        u1.h y02 = u1.h.y0("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18616a.b();
        Cursor b10 = w1.c.b(this.f18616a, y02, false, null);
        try {
            int c10 = w1.b.c(b10, "required_network_type");
            int c11 = w1.b.c(b10, "requires_charging");
            int c12 = w1.b.c(b10, "requires_device_idle");
            int c13 = w1.b.c(b10, "requires_battery_not_low");
            int c14 = w1.b.c(b10, "requires_storage_not_low");
            int c15 = w1.b.c(b10, "trigger_content_update_delay");
            int c16 = w1.b.c(b10, "trigger_max_content_delay");
            int c17 = w1.b.c(b10, "content_uri_triggers");
            int c18 = w1.b.c(b10, "id");
            int c19 = w1.b.c(b10, "state");
            int c20 = w1.b.c(b10, "worker_class_name");
            int c21 = w1.b.c(b10, "input_merger_class_name");
            int c22 = w1.b.c(b10, "input");
            int c23 = w1.b.c(b10, "output");
            hVar = y02;
            try {
                int c24 = w1.b.c(b10, "initial_delay");
                int c25 = w1.b.c(b10, "interval_duration");
                int c26 = w1.b.c(b10, "flex_duration");
                int c27 = w1.b.c(b10, "run_attempt_count");
                int c28 = w1.b.c(b10, "backoff_policy");
                int c29 = w1.b.c(b10, "backoff_delay_duration");
                int c30 = w1.b.c(b10, "period_start_time");
                int c31 = w1.b.c(b10, "minimum_retention_duration");
                int c32 = w1.b.c(b10, "schedule_requested_at");
                int c33 = w1.b.c(b10, "run_in_foreground");
                int c34 = w1.b.c(b10, "out_of_quota_policy");
                if (b10.moveToFirst()) {
                    String string = b10.getString(c18);
                    String string2 = b10.getString(c20);
                    f2.b bVar = new f2.b();
                    bVar.k(v.e(b10.getInt(c10)));
                    bVar.m(b10.getInt(c11) != 0);
                    bVar.n(b10.getInt(c12) != 0);
                    bVar.l(b10.getInt(c13) != 0);
                    bVar.o(b10.getInt(c14) != 0);
                    bVar.p(b10.getLong(c15));
                    bVar.q(b10.getLong(c16));
                    bVar.j(v.b(b10.getBlob(c17)));
                    p pVar2 = new p(string, string2);
                    pVar2.f18591b = v.g(b10.getInt(c19));
                    pVar2.f18593d = b10.getString(c21);
                    pVar2.f18594e = androidx.work.b.g(b10.getBlob(c22));
                    pVar2.f18595f = androidx.work.b.g(b10.getBlob(c23));
                    pVar2.f18596g = b10.getLong(c24);
                    pVar2.f18597h = b10.getLong(c25);
                    pVar2.f18598i = b10.getLong(c26);
                    pVar2.f18600k = b10.getInt(c27);
                    pVar2.f18601l = v.d(b10.getInt(c28));
                    pVar2.f18602m = b10.getLong(c29);
                    pVar2.f18603n = b10.getLong(c30);
                    pVar2.f18604o = b10.getLong(c31);
                    pVar2.f18605p = b10.getLong(c32);
                    pVar2.f18606q = b10.getInt(c33) != 0;
                    pVar2.f18607r = v.f(b10.getInt(c34));
                    pVar2.f18599j = bVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b10.close();
                hVar.B0();
                return pVar;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                hVar.B0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = y02;
        }
    }

    @Override
    public int p(String str) {
        this.f18616a.b();
        x1.f a10 = this.f18622g.a();
        if (str == null) {
            a10.f0(1);
        } else {
            a10.q(1, str);
        }
        this.f18616a.c();
        try {
            int t10 = a10.t();
            this.f18616a.t();
            return t10;
        } finally {
            this.f18616a.g();
            this.f18622g.f(a10);
        }
    }

    @Override
    public List<String> q(String str) {
        u1.h y02 = u1.h.y0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18616a.b();
        Cursor b10 = w1.c.b(this.f18616a, y02, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            y02.B0();
        }
    }

    @Override
    public List<androidx.work.b> r(String str) {
        u1.h y02 = u1.h.y0("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18616a.b();
        Cursor b10 = w1.c.b(this.f18616a, y02, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(androidx.work.b.g(b10.getBlob(0)));
            }
            return arrayList;
        } finally {
            b10.close();
            y02.B0();
        }
    }

    @Override
    public int s(String str) {
        this.f18616a.b();
        x1.f a10 = this.f18621f.a();
        if (str == null) {
            a10.f0(1);
        } else {
            a10.q(1, str);
        }
        this.f18616a.c();
        try {
            int t10 = a10.t();
            this.f18616a.t();
            return t10;
        } finally {
            this.f18616a.g();
            this.f18621f.f(a10);
        }
    }

    @Override
    public void t(String str, long j10) {
        this.f18616a.b();
        x1.f a10 = this.f18620e.a();
        a10.K(1, j10);
        if (str == null) {
            a10.f0(2);
        } else {
            a10.q(2, str);
        }
        this.f18616a.c();
        try {
            a10.t();
            this.f18616a.t();
        } finally {
            this.f18616a.g();
            this.f18620e.f(a10);
        }
    }

    @Override
    public List<p> u(int i10) {
        u1.h hVar;
        Throwable th;
        u1.h y02 = u1.h.y0("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        y02.K(1, i10);
        this.f18616a.b();
        Cursor b10 = w1.c.b(this.f18616a, y02, false, null);
        try {
            int c10 = w1.b.c(b10, "required_network_type");
            int c11 = w1.b.c(b10, "requires_charging");
            int c12 = w1.b.c(b10, "requires_device_idle");
            int c13 = w1.b.c(b10, "requires_battery_not_low");
            int c14 = w1.b.c(b10, "requires_storage_not_low");
            int c15 = w1.b.c(b10, "trigger_content_update_delay");
            int c16 = w1.b.c(b10, "trigger_max_content_delay");
            int c17 = w1.b.c(b10, "content_uri_triggers");
            int c18 = w1.b.c(b10, "id");
            int c19 = w1.b.c(b10, "state");
            int c20 = w1.b.c(b10, "worker_class_name");
            int c21 = w1.b.c(b10, "input_merger_class_name");
            int c22 = w1.b.c(b10, "input");
            int c23 = w1.b.c(b10, "output");
            hVar = y02;
            try {
                int c24 = w1.b.c(b10, "initial_delay");
                int c25 = w1.b.c(b10, "interval_duration");
                int c26 = w1.b.c(b10, "flex_duration");
                int c27 = w1.b.c(b10, "run_attempt_count");
                int c28 = w1.b.c(b10, "backoff_policy");
                int c29 = w1.b.c(b10, "backoff_delay_duration");
                int c30 = w1.b.c(b10, "period_start_time");
                int c31 = w1.b.c(b10, "minimum_retention_duration");
                int c32 = w1.b.c(b10, "schedule_requested_at");
                int c33 = w1.b.c(b10, "run_in_foreground");
                int c34 = w1.b.c(b10, "out_of_quota_policy");
                int i11 = c23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(c18);
                    c18 = c18;
                    String string2 = b10.getString(c20);
                    c20 = c20;
                    f2.b bVar = new f2.b();
                    int i12 = b10.getInt(c10);
                    c10 = c10;
                    bVar.k(v.e(i12));
                    bVar.m(b10.getInt(c11) != 0);
                    bVar.n(b10.getInt(c12) != 0);
                    bVar.l(b10.getInt(c13) != 0);
                    bVar.o(b10.getInt(c14) != 0);
                    c11 = c11;
                    c12 = c12;
                    bVar.p(b10.getLong(c15));
                    bVar.q(b10.getLong(c16));
                    bVar.j(v.b(b10.getBlob(c17)));
                    p pVar = new p(string, string2);
                    pVar.f18591b = v.g(b10.getInt(c19));
                    pVar.f18593d = b10.getString(c21);
                    pVar.f18594e = androidx.work.b.g(b10.getBlob(c22));
                    int i13 = i11;
                    pVar.f18595f = androidx.work.b.g(b10.getBlob(i13));
                    i11 = i13;
                    int i14 = c24;
                    pVar.f18596g = b10.getLong(i14);
                    c21 = c21;
                    int i15 = c25;
                    pVar.f18597h = b10.getLong(i15);
                    c13 = c13;
                    int i16 = c26;
                    pVar.f18598i = b10.getLong(i16);
                    int i17 = c27;
                    pVar.f18600k = b10.getInt(i17);
                    int i18 = c28;
                    pVar.f18601l = v.d(b10.getInt(i18));
                    c26 = i16;
                    int i19 = c29;
                    pVar.f18602m = b10.getLong(i19);
                    int i20 = c30;
                    pVar.f18603n = b10.getLong(i20);
                    c30 = i20;
                    int i21 = c31;
                    pVar.f18604o = b10.getLong(i21);
                    int i22 = c32;
                    pVar.f18605p = b10.getLong(i22);
                    int i23 = c33;
                    pVar.f18606q = b10.getInt(i23) != 0;
                    int i24 = c34;
                    pVar.f18607r = v.f(b10.getInt(i24));
                    pVar.f18599j = bVar;
                    arrayList.add(pVar);
                    c34 = i24;
                    c24 = i14;
                    c25 = i15;
                    c27 = i17;
                    c32 = i22;
                    c33 = i23;
                    c31 = i21;
                    c29 = i19;
                    c28 = i18;
                }
                b10.close();
                hVar.B0();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                hVar.B0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = y02;
        }
    }

    @Override
    public int v() {
        this.f18616a.b();
        x1.f a10 = this.f18624i.a();
        this.f18616a.c();
        try {
            int t10 = a10.t();
            this.f18616a.t();
            return t10;
        } finally {
            this.f18616a.g();
            this.f18624i.f(a10);
        }
    }

    public final void w(k0.a<String, ArrayList<androidx.work.b>> aVar) {
        ArrayList<androidx.work.b> arrayList;
        int i10;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                k0.a<String, ArrayList<androidx.work.b>> aVar2 = new k0.a<>(999);
                int size = aVar.size();
                int i11 = 0;
                loop0: while (true) {
                    i10 = 0;
                    while (i11 < size) {
                        aVar2.put(aVar.i(i11), aVar.l(i11));
                        i11++;
                        i10++;
                        if (i10 == 999) {
                            break;
                        }
                    }
                    w(aVar2);
                    aVar2 = new k0.a<>(999);
                }
                if (i10 > 0) {
                    w(aVar2);
                    return;
                }
                return;
            }
            StringBuilder b10 = w1.e.b();
            b10.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            w1.e.a(b10, size2);
            b10.append(")");
            u1.h y02 = u1.h.y0(b10.toString(), size2 + 0);
            int i12 = 1;
            for (String str : keySet) {
                if (str == null) {
                    y02.f0(i12);
                } else {
                    y02.q(i12, str);
                }
                i12++;
            }
            Cursor b11 = w1.c.b(this.f18616a, y02, false, null);
            try {
                int b12 = w1.b.b(b11, "work_spec_id");
                if (b12 != -1) {
                    while (b11.moveToNext()) {
                        if (!b11.isNull(b12) && (arrayList = aVar.get(b11.getString(b12))) != null) {
                            arrayList.add(androidx.work.b.g(b11.getBlob(0)));
                        }
                    }
                }
            } finally {
                b11.close();
            }
        }
    }

    public final void x(k0.a<String, ArrayList<String>> aVar) {
        ArrayList<String> arrayList;
        int i10;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                k0.a<String, ArrayList<String>> aVar2 = new k0.a<>(999);
                int size = aVar.size();
                int i11 = 0;
                loop0: while (true) {
                    i10 = 0;
                    while (i11 < size) {
                        aVar2.put(aVar.i(i11), aVar.l(i11));
                        i11++;
                        i10++;
                        if (i10 == 999) {
                            break;
                        }
                    }
                    x(aVar2);
                    aVar2 = new k0.a<>(999);
                }
                if (i10 > 0) {
                    x(aVar2);
                    return;
                }
                return;
            }
            StringBuilder b10 = w1.e.b();
            b10.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            w1.e.a(b10, size2);
            b10.append(")");
            u1.h y02 = u1.h.y0(b10.toString(), size2 + 0);
            int i12 = 1;
            for (String str : keySet) {
                if (str == null) {
                    y02.f0(i12);
                } else {
                    y02.q(i12, str);
                }
                i12++;
            }
            Cursor b11 = w1.c.b(this.f18616a, y02, false, null);
            try {
                int b12 = w1.b.b(b11, "work_spec_id");
                if (b12 != -1) {
                    while (b11.moveToNext()) {
                        if (!b11.isNull(b12) && (arrayList = aVar.get(b11.getString(b12))) != null) {
                            arrayList.add(b11.getString(0));
                        }
                    }
                }
            } finally {
                b11.close();
            }
        }
    }
}
