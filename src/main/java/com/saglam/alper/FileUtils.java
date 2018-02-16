package com.saglam.alper;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by alpersaglam on 19/04/2017.
 */
public class FileUtils {
    public static void WriteTuple(PrintWriter stream, String domain, String parentDomain) throws IOException {
        StringBuilder builder = new StringBuilder(domain);
        builder.append(",");
        builder.append(parentDomain);
        builder.append("\n");

        stream.write(builder.toString());
    }
}
