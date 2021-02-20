package facede_ex1.some_complex_media_library;

/*
The Complex Subsystem consists of dozens of various objects. To make them all do something meaningful, you have to dive deep into the subsystem’s implementation details, such as initializing objects in the correct order and supplying them with data in the proper format.
 */
public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mped audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodeFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
