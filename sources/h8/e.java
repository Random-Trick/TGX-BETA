package h8;

import java.util.List;

public enum e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(n.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);
    
    public final Class<?> f12601a;

    e(Class cls) {
        this.f12601a = cls;
    }
}
