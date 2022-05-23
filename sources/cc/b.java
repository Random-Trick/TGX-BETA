package cc;

import ra.g;

public enum b {
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
    
    public static final a Z = new a(null);
    public final int f5030a;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final b a(int i10) {
            b[] values;
            for (b bVar : b.values()) {
                if (bVar.a() == i10) {
                    return bVar;
                }
            }
            return null;
        }
    }

    b(int i10) {
        this.f5030a = i10;
    }

    public final int a() {
        return this.f5030a;
    }
}
