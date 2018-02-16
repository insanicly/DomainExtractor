package com.saglam.alper;

import com.google.common.net.InternetDomainName;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by alpersaglam on 19/04/2017.
 */
public class UrlUtils {
    public static String getTopLevelDomain(String uri) {

        InternetDomainName fullDomainName = InternetDomainName.from(uri);
        InternetDomainName publicDomainName = fullDomainName.topPrivateDomain();
        String topDomain = "";

        Iterator<String> it = publicDomainName.parts().iterator();
        while(it.hasNext()){
            String part = it.next();
            if(!topDomain.isEmpty())topDomain += ".";
            topDomain += part;
        }
        return topDomain;
    }



    static Set<String> nonePublicDomainParts(String uriHost) {
        InternetDomainName fullDomainName = InternetDomainName.from(uriHost);
        InternetDomainName publicDomainName = fullDomainName.publicSuffix();
        Set<String> nonePublicParts = new HashSet<String>(fullDomainName.parts());
        nonePublicParts.removeAll(publicDomainName.parts());
        return nonePublicParts;
    }
}
