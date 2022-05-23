package p8;

import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.TrackBox;
import java.io.File;
import o8.b;
import o8.d;
import o8.e;
import z8.h;

public class a {
    public static d a(com.googlecode.mp4parser.a aVar) {
        s2.d dVar = new s2.d(aVar);
        d dVar2 = new d();
        for (TrackBox trackBox : dVar.y0().getBoxes(TrackBox.class)) {
            SchemeTypeBox schemeTypeBox = (SchemeTypeBox) h.c(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
            if (schemeTypeBox == null || (!schemeTypeBox.getSchemeType().equals("cenc") && !schemeTypeBox.getSchemeType().equals("cbc1"))) {
                dVar2.a(new e(String.valueOf(aVar.toString()) + "[" + trackBox.getTrackHeaderBox().getTrackId() + "]", trackBox, new s2.d[0]));
            } else {
                dVar2.a(new b(String.valueOf(aVar.toString()) + "[" + trackBox.getTrackHeaderBox().getTrackId() + "]", trackBox, new s2.d[0]));
            }
        }
        dVar2.h(dVar.y0().getMovieHeaderBox().getMatrix());
        return dVar2;
    }

    public static d b(String str) {
        return a(new com.googlecode.mp4parser.b(new File(str)));
    }
}
