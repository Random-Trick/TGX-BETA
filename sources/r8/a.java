package r8;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o8.g;
import o8.h;
import s8.b;
import s8.e;
import z8.f;

public class a extends o8.a {
    public static f O = f.a(a.class);
    public g[] M;
    public SampleDescriptionBox N;

    public a(g... gVarArr) {
        super(m(gVarArr));
        this.M = gVarArr;
        for (g gVar : gVarArr) {
            SampleDescriptionBox sampleDescriptionBox = this.N;
            if (sampleDescriptionBox == null) {
                SampleDescriptionBox sampleDescriptionBox2 = new SampleDescriptionBox();
                this.N = sampleDescriptionBox2;
                sampleDescriptionBox2.addBox((t2.a) gVar.getSampleDescriptionBox().getBoxes(SampleEntry.class).get(0));
            } else {
                this.N = A0(sampleDescriptionBox, gVar.getSampleDescriptionBox());
            }
        }
    }

    public static String m(g... gVarArr) {
        String str = "";
        for (g gVar : gVarArr) {
            str = String.valueOf(str) + gVar.b() + " + ";
        }
        return str.substring(0, str.length() - 3);
    }

    public final SampleDescriptionBox A0(SampleDescriptionBox sampleDescriptionBox, SampleDescriptionBox sampleDescriptionBox2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            sampleDescriptionBox.getBox(Channels.newChannel(byteArrayOutputStream));
            sampleDescriptionBox2.getBox(Channels.newChannel(byteArrayOutputStream2));
            if (!Arrays.equals(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream.toByteArray())) {
                SampleEntry z02 = z0((SampleEntry) sampleDescriptionBox.getBoxes(SampleEntry.class).get(0), (SampleEntry) sampleDescriptionBox2.getBoxes(SampleEntry.class).get(0));
                if (z02 != null) {
                    sampleDescriptionBox.setBoxes(Collections.singletonList(z02));
                } else {
                    throw new IOException("Cannot merge " + sampleDescriptionBox.getBoxes(SampleEntry.class).get(0) + " and " + sampleDescriptionBox2.getBoxes(SampleEntry.class).get(0));
                }
            }
            return sampleDescriptionBox;
        } catch (IOException e10) {
            O.c(e10.getMessage());
            return null;
        }
    }

    public final VisualSampleEntry B0(VisualSampleEntry visualSampleEntry, VisualSampleEntry visualSampleEntry2) {
        VisualSampleEntry visualSampleEntry3 = new VisualSampleEntry();
        if (visualSampleEntry.getHorizresolution() == visualSampleEntry2.getHorizresolution()) {
            visualSampleEntry3.setHorizresolution(visualSampleEntry.getHorizresolution());
            visualSampleEntry3.setCompressorname(visualSampleEntry.getCompressorname());
            if (visualSampleEntry.getDepth() == visualSampleEntry2.getDepth()) {
                visualSampleEntry3.setDepth(visualSampleEntry.getDepth());
                if (visualSampleEntry.getFrameCount() == visualSampleEntry2.getFrameCount()) {
                    visualSampleEntry3.setFrameCount(visualSampleEntry.getFrameCount());
                    if (visualSampleEntry.getHeight() == visualSampleEntry2.getHeight()) {
                        visualSampleEntry3.setHeight(visualSampleEntry.getHeight());
                        if (visualSampleEntry.getWidth() == visualSampleEntry2.getWidth()) {
                            visualSampleEntry3.setWidth(visualSampleEntry.getWidth());
                            if (visualSampleEntry.getVertresolution() == visualSampleEntry2.getVertresolution()) {
                                visualSampleEntry3.setVertresolution(visualSampleEntry.getVertresolution());
                                if (visualSampleEntry.getHorizresolution() == visualSampleEntry2.getHorizresolution()) {
                                    visualSampleEntry3.setHorizresolution(visualSampleEntry.getHorizresolution());
                                    if (visualSampleEntry.getBoxes().size() == visualSampleEntry2.getBoxes().size()) {
                                        Iterator<t2.a> it = visualSampleEntry2.getBoxes().iterator();
                                        for (t2.a aVar : visualSampleEntry.getBoxes()) {
                                            t2.a next = it.next();
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                            try {
                                                aVar.getBox(Channels.newChannel(byteArrayOutputStream));
                                                next.getBox(Channels.newChannel(byteArrayOutputStream2));
                                                if (Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray())) {
                                                    visualSampleEntry3.addBox(aVar);
                                                } else if ((aVar instanceof AbstractDescriptorBox) && (next instanceof AbstractDescriptorBox)) {
                                                    AbstractDescriptorBox abstractDescriptorBox = (AbstractDescriptorBox) aVar;
                                                    abstractDescriptorBox.setDescriptor(y0(abstractDescriptorBox.getDescriptor(), ((AbstractDescriptorBox) next).getDescriptor()));
                                                    visualSampleEntry3.addBox(aVar);
                                                }
                                            } catch (IOException e10) {
                                                O.d(e10.getMessage());
                                                return null;
                                            }
                                        }
                                    }
                                    return visualSampleEntry3;
                                }
                                O.c("horizontal resolution differs");
                                return null;
                            }
                            O.c("vert resolution differs");
                            return null;
                        }
                        O.c("width differs");
                        return null;
                    }
                    O.c("height differs");
                    return null;
                }
                O.c("frame count differs");
                return null;
            }
            O.c("Depth differs");
            return null;
        }
        O.c("Horizontal Resolution differs");
        return null;
    }

    @Override
    public h E() {
        return this.M[0].E();
    }

    @Override
    public long[] H() {
        if (this.M[0].H() == null || this.M[0].H().length <= 0) {
            return null;
        }
        int i10 = 0;
        for (g gVar : this.M) {
            i10 += gVar.H().length;
        }
        long[] jArr = new long[i10];
        long j10 = 0;
        int i11 = 0;
        for (g gVar2 : this.M) {
            for (long j11 : gVar2.H()) {
                i11++;
                jArr[i11] = j11 + j10;
            }
            j10 += gVar2.Z().size();
        }
        return jArr;
    }

    @Override
    public SubSampleInformationBox J() {
        return this.M[0].J();
    }

    @Override
    public synchronized long[] S() {
        long[] jArr;
        int i10 = 0;
        for (g gVar : this.M) {
            i10 += gVar.S().length;
        }
        jArr = new long[i10];
        int i11 = 0;
        for (g gVar2 : this.M) {
            for (long j10 : gVar2.S()) {
                i11++;
                jArr[i11] = j10;
            }
        }
        return jArr;
    }

    @Override
    public List<o8.f> Z() {
        ArrayList arrayList = new ArrayList();
        for (g gVar : this.M) {
            arrayList.addAll(gVar.Z());
        }
        return arrayList;
    }

    @Override
    public void close() {
        for (g gVar : this.M) {
            gVar.close();
        }
    }

    @Override
    public String getHandler() {
        return this.M[0].getHandler();
    }

    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.N;
    }

    @Override
    public List<CompositionTimeToSample.a> l() {
        if (this.M[0].l() == null || this.M[0].l().isEmpty()) {
            return null;
        }
        LinkedList<int[]> linkedList = new LinkedList();
        for (g gVar : this.M) {
            linkedList.add(CompositionTimeToSample.blowupCompositionTimes(gVar.l()));
        }
        LinkedList linkedList2 = new LinkedList();
        for (int[] iArr : linkedList) {
            for (int i10 : iArr) {
                if (linkedList2.isEmpty() || ((CompositionTimeToSample.a) linkedList2.getLast()).b() != i10) {
                    linkedList2.add(new CompositionTimeToSample.a(1, i10));
                } else {
                    CompositionTimeToSample.a aVar = (CompositionTimeToSample.a) linkedList2.getLast();
                    aVar.c(aVar.a() + 1);
                }
            }
        }
        return linkedList2;
    }

    public final AudioSampleEntry s(AudioSampleEntry audioSampleEntry, AudioSampleEntry audioSampleEntry2) {
        AudioSampleEntry audioSampleEntry3 = new AudioSampleEntry(audioSampleEntry2.getType());
        if (audioSampleEntry.getBytesPerFrame() == audioSampleEntry2.getBytesPerFrame()) {
            audioSampleEntry3.setBytesPerFrame(audioSampleEntry.getBytesPerFrame());
            if (audioSampleEntry.getBytesPerPacket() == audioSampleEntry2.getBytesPerPacket()) {
                audioSampleEntry3.setBytesPerPacket(audioSampleEntry.getBytesPerPacket());
                if (audioSampleEntry.getBytesPerSample() == audioSampleEntry2.getBytesPerSample()) {
                    audioSampleEntry3.setBytesPerSample(audioSampleEntry.getBytesPerSample());
                    if (audioSampleEntry.getChannelCount() == audioSampleEntry2.getChannelCount()) {
                        audioSampleEntry3.setChannelCount(audioSampleEntry.getChannelCount());
                        if (audioSampleEntry.getPacketSize() == audioSampleEntry2.getPacketSize()) {
                            audioSampleEntry3.setPacketSize(audioSampleEntry.getPacketSize());
                            if (audioSampleEntry.getCompressionId() == audioSampleEntry2.getCompressionId()) {
                                audioSampleEntry3.setCompressionId(audioSampleEntry.getCompressionId());
                                if (audioSampleEntry.getSampleRate() == audioSampleEntry2.getSampleRate()) {
                                    audioSampleEntry3.setSampleRate(audioSampleEntry.getSampleRate());
                                    if (audioSampleEntry.getSampleSize() == audioSampleEntry2.getSampleSize()) {
                                        audioSampleEntry3.setSampleSize(audioSampleEntry.getSampleSize());
                                        if (audioSampleEntry.getSamplesPerPacket() == audioSampleEntry2.getSamplesPerPacket()) {
                                            audioSampleEntry3.setSamplesPerPacket(audioSampleEntry.getSamplesPerPacket());
                                            if (audioSampleEntry.getSoundVersion() == audioSampleEntry2.getSoundVersion()) {
                                                audioSampleEntry3.setSoundVersion(audioSampleEntry.getSoundVersion());
                                                if (Arrays.equals(audioSampleEntry.getSoundVersion2Data(), audioSampleEntry2.getSoundVersion2Data())) {
                                                    audioSampleEntry3.setSoundVersion2Data(audioSampleEntry.getSoundVersion2Data());
                                                    if (audioSampleEntry.getBoxes().size() == audioSampleEntry2.getBoxes().size()) {
                                                        Iterator<t2.a> it = audioSampleEntry2.getBoxes().iterator();
                                                        for (t2.a aVar : audioSampleEntry.getBoxes()) {
                                                            t2.a next = it.next();
                                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                            try {
                                                                aVar.getBox(Channels.newChannel(byteArrayOutputStream));
                                                                next.getBox(Channels.newChannel(byteArrayOutputStream2));
                                                                if (Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray())) {
                                                                    audioSampleEntry3.addBox(aVar);
                                                                } else if (ESDescriptorBox.TYPE.equals(aVar.getType()) && ESDescriptorBox.TYPE.equals(next.getType())) {
                                                                    ESDescriptorBox eSDescriptorBox = (ESDescriptorBox) aVar;
                                                                    eSDescriptorBox.setDescriptor(y0(eSDescriptorBox.getEsDescriptor(), ((ESDescriptorBox) next).getEsDescriptor()));
                                                                    audioSampleEntry3.addBox(aVar);
                                                                }
                                                            } catch (IOException e10) {
                                                                O.d(e10.getMessage());
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                    return audioSampleEntry3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return null;
                        }
                        O.c("ChannelCount differ");
                    }
                    return null;
                }
                O.c("BytesPerSample differ");
            }
            return null;
        }
        O.c("BytesPerFrame differ");
        return null;
    }

    @Override
    public List<SampleDependencyTypeBox.a> w0() {
        if (this.M[0].w0() == null || this.M[0].w0().isEmpty()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (g gVar : this.M) {
            linkedList.addAll(gVar.w0());
        }
        return linkedList;
    }

    public final s8.h y0(b bVar, b bVar2) {
        if (!(bVar instanceof s8.h) || !(bVar2 instanceof s8.h)) {
            O.c("I can only merge ESDescriptors");
            return null;
        }
        s8.h hVar = (s8.h) bVar;
        s8.h hVar2 = (s8.h) bVar2;
        if (hVar.n() != hVar2.n()) {
            return null;
        }
        hVar.o();
        hVar2.o();
        if (hVar.g() != hVar2.g() || hVar.h() != hVar2.h() || hVar.q() != hVar2.q() || hVar.r() != hVar2.r() || hVar.j() != hVar2.j() || hVar.l() != hVar2.l()) {
            return null;
        }
        hVar.m();
        hVar2.m();
        if (hVar.p() != null) {
            hVar.p().equals(hVar2.p());
        } else {
            hVar2.p();
        }
        if (hVar.f() == null ? hVar2.f() != null : !hVar.f().equals(hVar2.f())) {
            e f10 = hVar.f();
            e f11 = hVar2.f();
            if (f10.f() != null && f11.f() != null && !f10.f().equals(f11.f())) {
                return null;
            }
            if (f10.g() != f11.g()) {
                f10.r((f10.g() + f11.g()) / 2);
            }
            f10.h();
            f11.h();
            if (f10.i() == null ? f11.i() != null : !f10.i().equals(f11.i())) {
                return null;
            }
            if (f10.j() != f11.j()) {
                f10.t(Math.max(f10.j(), f11.j()));
            }
            if (!(f10.l().equals(f11.l()) && f10.k() == f11.k() && f10.m() == f11.m() && f10.n() == f11.n())) {
                return null;
            }
        }
        if (hVar.i() == null ? hVar2.i() != null : !hVar.i().equals(hVar2.i())) {
            return null;
        }
        if (hVar.k() == null ? hVar2.k() == null : hVar.k().equals(hVar2.k())) {
            return hVar;
        }
        return null;
    }

    public final SampleEntry z0(SampleEntry sampleEntry, SampleEntry sampleEntry2) {
        if (!sampleEntry.getType().equals(sampleEntry2.getType())) {
            return null;
        }
        if ((sampleEntry instanceof VisualSampleEntry) && (sampleEntry2 instanceof VisualSampleEntry)) {
            return B0((VisualSampleEntry) sampleEntry, (VisualSampleEntry) sampleEntry2);
        }
        if (!(sampleEntry instanceof AudioSampleEntry) || !(sampleEntry2 instanceof AudioSampleEntry)) {
            return null;
        }
        return s((AudioSampleEntry) sampleEntry, (AudioSampleEntry) sampleEntry2);
    }
}
