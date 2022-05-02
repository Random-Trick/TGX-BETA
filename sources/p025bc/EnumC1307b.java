package p025bc;

import qa.C8294g;

public enum EnumC1307b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public static final C1308a f4718Z = new C1308a(null);
    public final int f4721a;

    public static final class C1308a {
        public C1308a() {
        }

        public final EnumC1307b m37782a(int i) {
            EnumC1307b[] values;
            for (EnumC1307b bVar : EnumC1307b.values()) {
                if (bVar.m37783a() == i) {
                    return bVar;
                }
            }
            return null;
        }

        public C1308a(C8294g gVar) {
            this();
        }
    }

    EnumC1307b(int i) {
        this.f4721a = i;
    }

    public final int m37783a() {
        return this.f4721a;
    }
}
