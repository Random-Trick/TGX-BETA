package p269t2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

public interface AbstractC8951b {
    List<AbstractC8950a> getBoxes();

    <T extends AbstractC8950a> List<T> getBoxes(Class<T> cls);

    <T extends AbstractC8950a> List<T> getBoxes(Class<T> cls, boolean z);

    ByteBuffer getByteBuffer(long j, long j2);

    void writeContainer(WritableByteChannel writableByteChannel);
}
