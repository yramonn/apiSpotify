package ramontech.apiSpotify.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ramontech.apiSpotify.client.Album;
import ramontech.apiSpotify.client.AlbumSpotifyClient;
import ramontech.apiSpotify.client.AuthSpotifyClient;
import ramontech.apiSpotify.client.LoginRequest;

import java.util.List;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {

    private final AuthSpotifyClient authSpotifyClient;
    private final AlbumSpotifyClient albumSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient, AlbumSpotifyClient albumSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.albumSpotifyClient = albumSpotifyClient;
    }

    @GetMapping("/albums")
    public ResponseEntity<List<Album>> getAlbumsReleases() {
        var  request = new LoginRequest(
                    "client_credentials",
                    "d4f449da7c9c4bfea58866c07454f9ce",
                    "51bb6402435c4c38bac90cbbe06633d4"
        );

        var token = authSpotifyClient.login(request).getAcessToken();

        var response = albumSpotifyClient.getReleases("Bearer " + token);

        return ResponseEntity.ok(response.getAlbums().getItems());
    }

}
