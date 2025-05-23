package utils;

import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

public class TrustManager {

    public static javax.net.ssl.TrustManager[] getNaiveTrustManager() {
        return new javax.net.ssl.TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    public void checkClientTrusted(X509Certificate[] certs, String authType) {
                    }

                    public void checkServerTrusted(X509Certificate[] certs, String authType) {
                    }
                }
        };
    }
}
