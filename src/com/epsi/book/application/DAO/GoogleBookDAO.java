package com.epsi.book.application.DAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleBookDAO {

	public JSONObject getData(String filter, String data) throws MalformedURLException, IOException, JSONException {
		data = URLEncoder.encode(data, "UTF-8");
        URL url = new URL("http://localhost:8090/library/findBy"+ filter + '/' + data);
        URLConnection request = url.openConnection();
        request.connect();

        // Convert to a JSON object to print data
		StringBuffer reponse = new StringBuffer();
	    BufferedReader lecture = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
        String ligne = "";
        while((ligne = lecture.readLine()) != null){
           reponse.append(ligne);
        }
        lecture.close();
        JSONObject jsonObject = new JSONObject(reponse.toString());
		return jsonObject;
	}
	
public static void main(String[] args)   {
	
	GoogleBookDAO googleBookDAO = new GoogleBookDAO();
	try {
		JSONArray data = (JSONArray) googleBookDAO.getData("Author", "Stephen King").get("items");

	System.out.println(data.length());
	int i = 0 ;
	while (i < data.length()) {
		JSONObject book = (JSONObject) data.get(i);
		JSONObject title = (JSONObject) book.get("volumeInfo");
		System.out.println(title.get("title"));
		i++; 
	}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
}
