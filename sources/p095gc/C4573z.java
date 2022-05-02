package p095gc;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import qa.C8298k;

public final class C4573z extends C4544d {
    public final Socket f15018m;

    public C4573z(Socket socket) {
        C8298k.m12933e(socket, "socket");
        this.f15018m = socket;
    }

    @Override
    public IOException mo27302t(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override
    public void mo4984x() {
        Logger logger;
        Logger logger2;
        try {
            this.f15018m.close();
        } catch (AssertionError e) {
            if (C4560o.m27379c(e)) {
                logger2 = C4561p.f14991a;
                Level level = Level.WARNING;
                logger2.log(level, "Failed to close timed out socket " + this.f15018m, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            logger = C4561p.f14991a;
            Level level2 = Level.WARNING;
            logger.log(level2, "Failed to close timed out socket " + this.f15018m, (Throwable) e2);
        }
    }
}
