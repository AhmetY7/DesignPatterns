package proxyex2;

import proxyex2.downloader.YoutubeDownloader;
import proxyex2.proxy.YouTubeCacheProxy;
import proxyex2.some_cool_media_library.ThirdPartyYouTubeClass;

/*
Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
A proxy controls access to the original object, allowing you to perform something either before or after the request
gets through to the original object.
 */
public class Main {
    public static void main(String[] args) {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYouTubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved by caching proxy: " + (naive - smart)+ "ms");
    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");

        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
