package p204o8;

import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.TrackBox;
import com.googlecode.mp4parser.AbstractC3539a;
import com.googlecode.mp4parser.C3543b;
import java.io.File;
import p191n8.C7301b;
import p191n8.C7304d;
import p191n8.C7305e;
import p258s2.C8631d;
import p345y8.C10454h;

public class C7793a {
    public static C7304d m15078a(AbstractC3539a aVar) {
        C8631d dVar = new C8631d(aVar);
        C7304d dVar2 = new C7304d();
        for (TrackBox trackBox : dVar.m11875y0().getBoxes(TrackBox.class)) {
            SchemeTypeBox schemeTypeBox = (SchemeTypeBox) C10454h.m5090c(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
            if (schemeTypeBox == null || (!schemeTypeBox.getSchemeType().equals("cenc") && !schemeTypeBox.getSchemeType().equals("cbc1"))) {
                dVar2.m17101a(new C7305e(String.valueOf(aVar.toString()) + "[" + trackBox.getTrackHeaderBox().getTrackId() + "]", trackBox, new C8631d[0]));
            } else {
                dVar2.m17101a(new C7301b(String.valueOf(aVar.toString()) + "[" + trackBox.getTrackHeaderBox().getTrackId() + "]", trackBox, new C8631d[0]));
            }
        }
        dVar2.m17094h(dVar.m11875y0().getMovieHeaderBox().getMatrix());
        return dVar2;
    }

    public static C7304d m15077b(String str) {
        return m15078a(new C3543b(new File(str)));
    }
}
