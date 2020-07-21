export{
    createArtistSection
}
import {
    clearElementChildren
} from "../domHelper.js"
import{
    createMainSection
} from "./mainSection.js"
import {
    fetchArtist
} from "./artistFetcher.js"
import {
    createHeader
} from "./header.js"
import{
    createNavBar
} from "./navBar.js"
import {
    createFooter
} from "./footer.js"
import {
    createAlbumSection
} from "./albumSection.js"
import{
    createAlbumForm
} from "./albumForm.js"
import{
    createArtistCommentRatingForm
} from "./commentRatingForm.js"

const createArtistSection = (element, artist) => {
    clearElementChildren(element);
    element.append(createHeader());
    element.append(createNavBar());
    element.append(createFooter());
    const ul = document.createElement('ul');
    ul.innerHTML = `
        <img src="${artist.image}" alt="">
        <h2>${artist.name}</h2>
        <h4>${artist.genre}</h4>
        <h4>${artist.recordLabel}</h4>
        <p>${artist.description}</p>
        <p>${artist.comments}</p>
    `
    element.append(ul);

    for (let i = 0; i < artist.albums.length; i++){
        const li = document.createElement('li');
        li.innerHTML = `
            <a>${artist.albums[i].title}</a>
        `
        li.addEventListener('click', () => {
            event.preventDefault();
            createAlbumSection(element, artist.albums[i]);
        })
        ul.append(li);
    }
    createAlbumForm(element); 
    createArtistCommentRatingForm(element, artist.id)   
}

    

    
    


