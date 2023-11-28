package ramontech.apiSpotify.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AlbumResponse {

    private AlbumsWrapper albums;

    public AlbumResponse(AlbumsWrapper albums) {
        this.albums = albums;
    }

    public AlbumResponse() {
    }

    public AlbumsWrapper getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumsWrapper albums) {
        this.albums = albums;
    }
}
