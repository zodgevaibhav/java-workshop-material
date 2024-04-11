package common;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestUtil {
	public static String sendPostRequest(String url, String jsonRequestAsString) throws Exception {	// Reusable   // Specific to AddUserRequest , AddUserResponse


		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(jsonRequestAsString)).build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		String strResponse = response.body();
		System.out.println(strResponse);


		return strResponse;
	}
}
