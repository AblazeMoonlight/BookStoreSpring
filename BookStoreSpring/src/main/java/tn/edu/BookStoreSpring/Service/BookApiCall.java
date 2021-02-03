package tn.edu.BookStoreSpring.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import tn.edu.BookStoreSpring.DOA.Book;

public class BookApiCall {
    private static HttpURLConnection connection;

    public static Book gbconnect(String isbn) throws JSONException {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try {
            URL url = new URL("https://www.googleapis.com/books/v1/volumes?q=isbn:" + isbn);
            connection = (HttpURLConnection) url.openConnection();
            connection.setReadTimeout(5000);
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            int status = connection.getResponseCode();
            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
            return parse(responseContent.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }
        return null;
    }
    public static Book parse(String responseBody) throws JSONException {
        Book book = new Book();

        System.out.println("Response as String : " + responseBody);
        JSONObject responseObj = new JSONObject(responseBody);
        JSONArray arr = responseObj.getJSONArray("items");
        book.setTitle(arr.getJSONObject(0).getJSONObject("volumeInfo").getString("title"));
        book.setAuthor(responseObj.getJSONArray("items").getJSONObject(0).getJSONObject("volumeInfo").getJSONArray("authors").getString(0));

        book.setCategory(responseObj.getJSONArray("items").getJSONObject(0).getJSONObject("volumeInfo").getJSONArray("categories").getString(0));
        book.setDescription(responseObj.getJSONArray("items").getJSONObject(0).getJSONObject("volumeInfo").getString("description"));
        book.setPublisher(responseObj.getJSONArray("items").getJSONObject(0).getJSONObject("volumeInfo").getString("publisher"));
        
     String xx = arr.getJSONObject(0).getJSONObject("volumeInfo").getString("publishedDate");
//     LocalDate date = LocalDate.parse(xx,DateTimeFormatter.BASIC_ISO_DATE);
if (xx.length()!=4)
{
      book.setReleaseDate(Date.valueOf(xx));
}
else{
  
}
        book.setCover(responseObj.getJSONArray("items").getJSONObject(0).getJSONObject("volumeInfo").getJSONObject("imageLinks").getString("thumbnail"));

        return book;
    }
}


