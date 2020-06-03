package pj.java11.http_client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class SynchronousExample {

	private CompletableFuture<Void> verifyUri(HttpClient httpClient, URI uri) {
		HttpRequest request = HttpRequest.newBuilder().timeout(Duration.ofSeconds(5)).uri(uri).build();

		return httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::statusCode)
				.thenApply(statusCode -> statusCode == 200).exceptionally(ex -> false).thenAccept(valid -> {
					if (valid) {
						System.out.println("[SUCCESS] Verified " + uri);
					} else {
						System.out.println("[FAILURE] Could not " + "verify " + uri);
					}
				});
	}

	public static void main(String[] args) {
		final List<URI> uris = Stream.of("https://www.google.com/", "https://www.github.com/", "https://www.yahoo.com/")
				.map(URI::create).collect(toList());

		HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10))
				.followRedirects(HttpClient.Redirect.ALWAYS).build();

		SynchronousExample synchronousExample = new SynchronousExample();
		CompletableFuture[] futures = uris.stream().map(uri -> synchronousExample.verifyUri(httpClient, uri))
				.toArray(CompletableFuture[]::new);

		CompletableFuture.allOf(futures).join();

	}

}
