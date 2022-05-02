package p191n8;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import p264s8.AbstractC8693b;

public interface AbstractC7307g extends Closeable {
    C7308h mo12961D();

    long[] mo12960G();

    SubSampleInformationBox mo12959I();

    long[] mo12958R();

    List<AbstractC7306f> mo12957Y();

    String mo17091b();

    long mo17090g();

    String getHandler();

    SampleDescriptionBox getSampleDescriptionBox();

    List<C7303c> mo17089i();

    List<CompositionTimeToSample.C3420a> mo12956l();

    List<SampleDependencyTypeBox.C3425a> mo12954w0();

    Map<AbstractC8693b, long[]> mo17088x();
}
