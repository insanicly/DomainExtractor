package com.comodo;

import junit.framework.TestCase;

/**
 * Created by alpersaglam on 19/04/2017.
 */
public class UrlUtilsTest extends TestCase {

    public void testUrlUtils() {
        assertTrue(true);
    }

    public void test1() {
        String topLevelDomain = UrlUtils.getTopLevelDomain("3701189.fls.doubleclick.net");
        assertEquals("doubleclick.net", topLevelDomain);
    }

    public void test2() {
        String topLevelDomain = UrlUtils.getTopLevelDomain("3701189.fls.doubleclick.net.tr");
        assertEquals("doubleclick.net.tr", topLevelDomain);
    }

    public void test3() {
        String topLevelDomain = UrlUtils.getTopLevelDomain("all.contacts.msn.com.akadns.net");
        assertEquals("akadns.net", topLevelDomain);
    }

    public void test4() {
        String topLevelDomain = UrlUtils.getTopLevelDomain("r6.sn-q4f7sney.googlevideo.com");
        assertEquals("googlevideo.com", topLevelDomain);
    }

    public void test5() {
        String topLevelDomain = UrlUtils.getTopLevelDomain("slide.news.sina.com.cn");
        assertEquals("sina.com.cn", topLevelDomain);
    }

    public void test6() {
        String topLevelDomain = UrlUtils.getTopLevelDomain("fc.mrsvg.co");
        assertEquals("mrsvg.co", topLevelDomain);
    }

    public void test7() {
        String topLevelDomain = UrlUtils.getTopLevelDomain("adkpf.newscloud.or.kr");
        assertEquals("newscloud.or.kr", topLevelDomain);
    }

    public void test8() {
        String topLevelDomain = UrlUtils.getTopLevelDomain("amp-parents-com.cdn.ampproject.org");
        assertEquals("ampproject.org", topLevelDomain);
    }

    public void test9() {
        String topLevelDomain = UrlUtils.getTopLevelDomain("a474.srip1.akasrip.net.4dba0bc6.1.cn.akasripcn.net");
        assertEquals("akasripcn.net", topLevelDomain);
    }

    public void test10() {
        String topLevelDomain = UrlUtils.getTopLevelDomain("a474.srip1.akasrip.net.4dba0bc6.1.cn.akasripcn.net.uk");
        assertEquals("akasripcn.net.uk", topLevelDomain);
    }

}
