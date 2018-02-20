package com.example.android.chickme.Helper;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Rahul on 15-02-2018.
 */

public class HttpDataHandler
{
    static String stream = null;

    public HttpDataHandler() {
    }

    public String getHTTPData(String urlString)
    {
        try
        {
            URL url = new URL (urlString);
            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();

            if(urlconnection.getResponseCode() == HttpURLConnection.HTTP_OK)
            {
                InputStream in = new BufferedInputStream(urlconnection.getInputStream());

                BufferedReader r = new BufferedReader(new InputStreamReader(in));
                StringBuilder sb = new StringBuilder();
                String line;
                while((line = r.readLine())!=null)
                    sb.append(line);
                stream = sb.toString();
                urlconnection.disconnect();
            }

        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {

        }
        return stream;

    }
}
