package hc;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ra.k;

public final class z extends d {
    public final Socket f12684m;

    public z(Socket socket) {
        k.e(socket, "socket");
        this.f12684m = socket;
    }

    @Override
    public IOException t(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override
    public void x() {
        Logger logger;
        Logger logger2;
        try {
            this.f12684m.close();
        } catch (AssertionError e10) {
            if (o.c(e10)) {
                logger2 = p.f12660a;
                Level level = Level.WARNING;
                logger2.log(level, "Failed to close timed out socket " + this.f12684m, (Throwable) e10);
                return;
            }
            throw e10;
        } catch (Exception e11) {
            logger = p.f12660a;
            Level level2 = Level.WARNING;
            logger.log(level2, "Failed to close timed out socket " + this.f12684m, (Throwable) e11);
        }
    }
}
