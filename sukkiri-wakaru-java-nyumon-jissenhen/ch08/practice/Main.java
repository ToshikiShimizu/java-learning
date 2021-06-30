import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import com.fasterxml.jackson.databind.*;

public class Main{
    public static void main(String[] args) throws Exception{
        // 8-1
        // URL url = new URL("https://dokojava.jp/favicon.ico");
        // InputStream is = url.openStream();
        // OutputStream os = new FileOutputStream("dj.ico");
        // int i = is.read();
        // while (i!=-1){
        //     os.write((byte)i);
        //     i = is.read();
        // }
        // is.close();
        // os.flush();
        // os.close();

        // 8-2
        // Socket sock = new Socket("smtp.example.com",60025);
        // OutputStream os = sock.getOutputStream();
        // os.write("HELO smtp.example.com\r\n".getBytes());
        // os.flush();
        // sock.close();

        // 8-3

        String url = "https://api.github.com/users/miyabilink";
        HttpClient client = HttpClient.newBuilder()
        .version(Version.HTTP_1_1)
        .followRedirects(Redirect.NORMAL)
        .build();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(url))
        .header("Accept", "application/vnd.github.v3+json")
        .GET()
        .build();
        HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = res.body();
        int status = res.statusCode();
        if (status == 200){
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(body);
            String blog = root.get("blog").textValue();
            System.out.println(blog);
        }else{
            System.out.println("ERROR: "+status);
        }
    }
}