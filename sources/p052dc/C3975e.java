package p052dc;

import java.util.logging.Level;
import java.util.logging.LogRecord;

public final class C3975e {
    public static final int m29435b(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
