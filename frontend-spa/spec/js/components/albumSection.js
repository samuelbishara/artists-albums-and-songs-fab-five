export {
    createAlbumSection
}
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
    clearElementChildren
} from "../domHelper.js"
import{
    createSongSection
} from "./songSection.js"
import{
    createArtistSection
} from "./artistSection.js"
import {
    fetchArtist
} from "./artistFetcher.js"
import { 
    createSongForm 
} from "./songForm.js"
import{
    createAlbumCommentForm
} from "./albumCommentForm.js"


const createAlbumSection = (element, album) => {
    clearElementChildren(element);
    element.append(createHeader());
    element.append(createNavBar());
    element.append(createFooter());
    const ul = document.createElement('ul');
    ul.innerHTML = `
        <img src="${album.image}" alt="">
        <p>${album.title}</p>
        <p>${album.recordLabel}</p>
        <p>${album.comments}</p>       
    `
    element.append(ul);
    
    for (let i = 0; i < album.songs.length; i++){
        const li = document.createElement('li');
        li.innerHTML = `
            <a>${album.songs[i].title}</a>
        `
        li.addEventListener('click', () => {
            event.preventDefault();
            createSongSection(element, album.songs[i]);
        })
        ul.append(li);
    }

    createSongForm(element);
    createAlbumCommentForm(element, album.id)
 
}