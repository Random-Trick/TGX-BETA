package p093g8;

import java.util.List;

public enum EnumC4522e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(AbstractC4531n.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);
    
    public final Class<?> f14917a;

    EnumC4522e(Class cls) {
        this.f14917a = cls;
    }
}
