package p004a3;

import android.util.SparseArray;
import p004a3.C0065i;

public abstract class AbstractC0077o {

    public static abstract class AbstractC0078a {
        public abstract AbstractC0077o mo42429a();

        public abstract AbstractC0078a mo42428b(EnumC0079b bVar);

        public abstract AbstractC0078a mo42427c(EnumC0080c cVar);
    }

    public enum EnumC0079b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        
        public static final SparseArray<EnumC0079b> f245f0;
        public final int f247a;

        static {
            EnumC0079b bVar = UNKNOWN_MOBILE_SUBTYPE;
            EnumC0079b bVar2 = GPRS;
            EnumC0079b bVar3 = EDGE;
            EnumC0079b bVar4 = UMTS;
            EnumC0079b bVar5 = CDMA;
            EnumC0079b bVar6 = EVDO_0;
            EnumC0079b bVar7 = EVDO_A;
            EnumC0079b bVar8 = RTT;
            EnumC0079b bVar9 = HSDPA;
            EnumC0079b bVar10 = HSUPA;
            EnumC0079b bVar11 = HSPA;
            EnumC0079b bVar12 = IDEN;
            EnumC0079b bVar13 = EVDO_B;
            EnumC0079b bVar14 = LTE;
            EnumC0079b bVar15 = EHRPD;
            EnumC0079b bVar16 = HSPAP;
            EnumC0079b bVar17 = GSM;
            EnumC0079b bVar18 = TD_SCDMA;
            EnumC0079b bVar19 = IWLAN;
            EnumC0079b bVar20 = LTE_CA;
            SparseArray<EnumC0079b> sparseArray = new SparseArray<>();
            f245f0 = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar13);
            sparseArray.put(13, bVar14);
            sparseArray.put(14, bVar15);
            sparseArray.put(15, bVar16);
            sparseArray.put(16, bVar17);
            sparseArray.put(17, bVar18);
            sparseArray.put(18, bVar19);
            sparseArray.put(19, bVar20);
        }

        EnumC0079b(int i) {
            this.f247a = i;
        }

        public static EnumC0079b m42426a(int i) {
            return f245f0.get(i);
        }

        public int m42425b() {
            return this.f247a;
        }
    }

    public enum EnumC0080c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        
        public static final SparseArray<EnumC0080c> f267d0;
        public final int f269a;

        static {
            EnumC0080c cVar = MOBILE;
            EnumC0080c cVar2 = WIFI;
            EnumC0080c cVar3 = MOBILE_MMS;
            EnumC0080c cVar4 = MOBILE_SUPL;
            EnumC0080c cVar5 = MOBILE_DUN;
            EnumC0080c cVar6 = MOBILE_HIPRI;
            EnumC0080c cVar7 = WIMAX;
            EnumC0080c cVar8 = BLUETOOTH;
            EnumC0080c cVar9 = DUMMY;
            EnumC0080c cVar10 = ETHERNET;
            EnumC0080c cVar11 = MOBILE_FOTA;
            EnumC0080c cVar12 = MOBILE_IMS;
            EnumC0080c cVar13 = MOBILE_CBS;
            EnumC0080c cVar14 = WIFI_P2P;
            EnumC0080c cVar15 = MOBILE_IA;
            EnumC0080c cVar16 = MOBILE_EMERGENCY;
            EnumC0080c cVar17 = PROXY;
            EnumC0080c cVar18 = VPN;
            EnumC0080c cVar19 = NONE;
            SparseArray<EnumC0080c> sparseArray = new SparseArray<>();
            f267d0 = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar13);
            sparseArray.put(13, cVar14);
            sparseArray.put(14, cVar15);
            sparseArray.put(15, cVar16);
            sparseArray.put(16, cVar17);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar19);
        }

        EnumC0080c(int i) {
            this.f269a = i;
        }

        public static EnumC0080c m42424a(int i) {
            return f267d0.get(i);
        }

        public int m42423b() {
            return this.f269a;
        }
    }

    public static AbstractC0078a m42432a() {
        return new C0065i.C0067b();
    }

    public abstract EnumC0079b mo42431b();

    public abstract EnumC0080c mo42430c();
}
