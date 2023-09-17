package edu.val.cle.atsistemas.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

//java --list-modules

public class HttpClientAsynchronousChuck {

	private static final HttpClient httpClient = 
			HttpClient.newBuilder().version(HttpClient.Version.HTTP_2)
			.connectTimeout(Duration.ofSeconds(10)).build();

	public static void main(String[] args) throws Exception {

		HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create("https://api.chucknorris.io/jokes/random"))
				.build();

		System.out.println("hola1");
		CompletableFuture<HttpResponse<String>> response = httpClient.sendAsync(request,
				HttpResponse.BodyHandlers.ofString());
		System.out.println("hola2");

		String result = response.thenApply(resultado -> {
			System.out.println("ey, que ya he vuelto :)");
			return resultado.body();
		}).get();
		System.out.println(result);
		System.out.println("hola3");
		
		

	}

}