package t2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

public interface b {
    List<a> getBoxes();

    <T extends a> List<T> getBoxes(Class<T> cls);

    <T extends a> List<T> getBoxes(Class<T> cls, boolean z10);

    ByteBuffer getByteBuffer(long j10, long j11);

    void writeContainer(WritableByteChannel writableByteChannel);
}
