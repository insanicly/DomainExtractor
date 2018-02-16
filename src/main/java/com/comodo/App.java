package com.comodo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class App 
{
    private static final String FILENAME = "subdomains.csv";

    public static void main( String[] args )
    {
        BufferedReader br = null;
        FileReader fr = null;

        try{
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            PrintWriter writer = new PrintWriter("result.txt", "UTF-8");

            String currentLine;
            while((currentLine = br.readLine()) != null){
                String parentDomain;
                try {
                    parentDomain = UrlUtils.getTopLevelDomain(currentLine);
                }
                catch (Exception e){
                    System.err.println("Cannot find parent domain of " + currentLine);
                    parentDomain = "";
                }
                FileUtils.WriteTuple(writer, currentLine, parentDomain);
            }

            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                if(br != null){
                    br.close();
                }

                if(fr != null){
                    fr.close();
                }

            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
