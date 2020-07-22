export {
    fetchSingleArtist, 
    addNewArtist,
    addNewAlbum,
    addNewSong, 
    addNewCommentToArtist, 
    addNewCommentToAlbum,
    addNewCommentToSong, 
    deleteArtist
}

const fetchSingleArtist = async () => {
    return fetch('http://localhost:8080/api/artists/${artistName}/') 
                .then(response => response.json())          
}

const addNewArtist = async (artist) => {
    return fetch('http://localhost:8080/api/artists/add', {
        method: "POST", 
        headers: {
            "Content-Type": "application/json"
        }, 
        body: JSON.stringify(artist)
    }).then(response => response.json())
}

const addNewAlbum = async (album) => {
    return fetch('http://localhost:8080/api/albums/add', {
        method: "POST", 
        headers: {
            "Content-Type": "application/json"
        }, 
        body: JSON.stringify(album)
    }).then(response => response.json())
}

const addNewSong = async (song) => {
    return fetch('http://localhost:8080/api/songs/add', {
        method: "POST", 
        headers: {
            "Content-Type": "application/json"
        }, 
        body: JSON.stringify(song)
    }).then(response => response.json())
}

const addNewCommentToArtist = async (comment, artistId) => {
    return fetch(`http://localhost:8080/api/artists/${artistId}/comment`, {
        method: "PATCH", 
        body: comment 
    }).then(response => response.json())
}

const addNewCommentToAlbum = async (comment, albumId) => {
    return fetch(`http://localhost:8080/api/albums/${albumId}/comment`, {
        method: "PATCH", 
        body: comment 
    }).then(response => response.json())
}

const addNewCommentToSong = async (comment, songId) => {
    return fetch(`http://localhost:8080/api/songs/${songId}/comment`, {
        method: "PATCH", 
        body: comment
    }).then(response => response.json())
}

const deleteArtist = async(artistId)=>{
    return fetch(`http://localhost:8080/api/artists/${artistId}`, {
        method: "DELETE", 
    }).then(response => response.json())
}