package o8;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import t8.b;

public interface g extends Closeable {
    h E();

    long[] H();

    SubSampleInformationBox J();

    long[] S();

    List<f> Z();

    String b();

    long g();

    String getHandler();

    SampleDescriptionBox getSampleDescriptionBox();

    List<c> i();

    List<CompositionTimeToSample.a> l();

    Map<b, long[]> w();

    List<SampleDependencyTypeBox.a> w0();
}
