package p296v2;

import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import java.util.AbstractList;
import java.util.List;
import p191n8.AbstractC7306f;
import p221p8.C8063a;
import p221p8.C8065b;
import p258s2.C8631d;
import p269t2.AbstractC8950a;
import p269t2.AbstractC8951b;

public class C9833a extends AbstractList<AbstractC7306f> {
    public List<AbstractC7306f> f32094a;

    public C9833a(TrackBox trackBox, C8631d... dVarArr) {
        AbstractC8951b parent = ((AbstractC8950a) trackBox.getParent()).getParent();
        if (!trackBox.getParent().getBoxes(MovieExtendsBox.class).isEmpty()) {
            this.f32094a = new C8065b(trackBox.getTrackHeaderBox().getTrackId(), parent, dVarArr);
        } else if (dVarArr.length <= 0) {
            this.f32094a = new C8063a(trackBox.getTrackHeaderBox().getTrackId(), parent);
        } else {
            throw new RuntimeException("The TrackBox comes from a standard MP4 file. Only use the additionalFragments param if you are dealing with ( fragmented MP4 files AND additional fragments in standalone files )");
        }
    }

    public AbstractC7306f get(int i) {
        return this.f32094a.get(i);
    }

    @Override
    public int size() {
        return this.f32094a.size();
    }
}
