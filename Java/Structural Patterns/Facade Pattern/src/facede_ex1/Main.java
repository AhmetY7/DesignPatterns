package facede_ex1;

/*
Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other
complex set of classes.
 */

/*
Use the Facade pattern when you need to have a limited but straightforward interface to a complex subsystem.
 */

import facede_ex1.facade.VideoConversionFacade;

import java.io.File;

/*
Use the Facade when you want to structure a subsystem into layers.
 */
public class Main {

    /*
    The Client uses the facade instead of calling the subsystem objects directly.
     */
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg","mp4");
    }
}
